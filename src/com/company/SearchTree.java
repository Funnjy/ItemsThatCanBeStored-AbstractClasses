package com.company;

/**
 * Created by Anton Ilchenko on 19.07.2017.
 */
public class SearchTree implements NodeList{

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void treverse(ListItem root) {
        if(root != null){
            treverse(root.previous());
            System.out.println(root.getValue());
            treverse(root.next());
        }
    }
}
