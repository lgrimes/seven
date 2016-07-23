package au.com.shehacks.seven.seven.models;
import com.orm.dsl.Table;

/**
 * Seven
 * Created by lauren grimes - PwC Ventures on 23/07/2016
 * Contact: lauren@pwcventures.com
 */

@Table
public class User {
    String name;
    String username;
    String profileImageName;

    public User(String name, String username, String profileImageName) {
        this.name = name;
        this.username = username;
        this.profileImageName = profileImageName;
    }

}
