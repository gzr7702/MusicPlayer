package com.gzr7702.musicplayer;

import java.util.List;

/**
 * Created by rob on 4/29/17.
 */

public class SongItem {
    private int icon;
    private String title;

    private boolean isGroupHeader = false;

    public SongItem(String title) {
        //this(-1, title);
        this.title = title;
        isGroupHeader = true;
    }

    public SongItem(int icon, String title) {
        super();
        this.icon = icon;
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public int getIcon() {
        return this.icon;
    }

    public Boolean isGroupHeader() {
        return isGroupHeader;
    }
}
