package au.com.shehacks.seven.seven.models;

import com.orm.dsl.Table;

import java.util.ArrayList;

/**
 * Seven
 * Created by lauren grimes - PwC Ventures on 23/07/2016
 * Contact: lauren@pwcventures.com
 */

@Table
public class Charity {
    String name;
    String url;
    ArrayList<String> labels;
}
