package au.com.shehacks.seven.seven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class BaseActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private ActionBarDrawerToggle drawerToggle;
    protected int selectedMenuItemId;
    private NavigationView navigationView;
    private DrawerLayout drawer;
    protected Menu navigationMenu;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        selectedMenuItemId = getIntent().getExtras() != null ? getIntent().getExtras().getInt("selectedMenuItemId") : 0;
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerToggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.menu_open, R.string.menu_close);
        drawer.setDrawerListener(drawerToggle);
        drawerToggle.syncState();
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
        navigationMenu = navigationView.getMenu();
    }

    @Override
    protected void onResume() {
        super.onResume();
        navigationMenu.getItem(selectedMenuItemId).setChecked(true);
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    void inflateLayoutInContainer(int layoutID) {
        LayoutInflater.from(this).inflate(layoutID, (RelativeLayout) findViewById(R.id.content_frame));
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        Activity activity = null;
        Bundle args = new Bundle();
        switch (item.getItemId()) {
            case R.id.nav_goals:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.nav_learn:
                intent = new Intent(this, EducationActivity.class);
                startActivity(intent);
                break;

            case R.id.nav_progress:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

        }
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}
