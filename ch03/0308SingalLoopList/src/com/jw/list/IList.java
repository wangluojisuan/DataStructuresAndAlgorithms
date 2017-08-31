package com.jw.list;

public interface IList {
    int getLength();
    void insert(ListNode node, int pos);
    void delete(int pos);
    void clear();
}
