package com.eighlark.ark.arkathon.domain;

/**
 * Created At Eighlark Innovations
 * User: Akshay
 * Date: 7/20/13
 * Time: 4:48 PM
 * Email: akshaykr@eighlark.com
 */

public class Shop {
    String name;
    String staffName[];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getStaffName() {
        return staffName;
    }

    public void setStaffName(String[] staffName) {
        this.staffName = staffName;
    }
}
