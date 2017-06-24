package com.philvr.usefulmethods;

import android.widget.ListView;

/**
 * @author Philip Van Raalte
 * @date June 24, 2017
 */

public class ListViewHelper {
    private ListView listView;

    /**
     * Helpful methods for a ListVIew
     * @param listView the ListView to help
     * @see ListView
     */
    public ListViewHelper(ListView listView){
        this.listView = listView;
    }

    /**
     * Go back to the top of the list
     */
    public void backToTop() {
        listView.setSelectionAfterHeaderView();
    }
}
