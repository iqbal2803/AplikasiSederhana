package com.iqbal.aplikasisederhana.View.ListView.dummy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample negara for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {
    public static final String[] negaraArray = { "Indonesia","Malaysia","Singapore","Italia","Inggris","Belanda","Argentina","Chile","Mesir","Uganda","Myanmar","Brazil"};
    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add some sample items.
        for (int i = 1; i < negaraArray.length; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), Array.get(negaraArray,position).toString());
    }

    /**
     * A dummy item representing a piece of negara.
     */
    public static class DummyItem {
        public final String id;
        public final String negara;

        public DummyItem(String id, String negara) {
            this.id = id;
            this.negara = negara;
        }
    }
}