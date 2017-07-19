package com.company;


/**
 * Created by Anton Ilchenko on 19.07.2017.
 */
public interface NodeList {
    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    void treverse(ListItem root);
}
