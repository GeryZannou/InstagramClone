package com.example.instagramclone;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("TodoItem")
public class Post extends ParseObject {

    // Ensure that your subclass has a public default constructor

    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";



    public void setDescription(String description) {
        put(KEY_DESCRIPTION, description);
    }
    public String getDescription() {
        return getString(KEY_DESCRIPTION);
    }

    public void setImage(ParseFile image) {
        put(KEY_IMAGE, image);
    }

    public ParseFile getImage() {
        return getParseFile(KEY_IMAGE);
    }

    public void setUser(ParseUser user) {
        put(KEY_USER, user);
    }

    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }
}
