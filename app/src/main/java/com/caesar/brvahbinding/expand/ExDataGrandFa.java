package com.caesar.brvahbinding.expand;

import com.chad.library.adapter.base.entity.AbstractExpandableItem;
import com.chad.library.adapter.base.entity.MultiItemEntity;

public class ExDataGrandFa extends AbstractExpandableItem<ExDataFather> implements MultiItemEntity {
    private String name;
    private String title;
    private int imgRes;

    public ExDataGrandFa(String name, String title, int imgRes) {
        this.name = name;
        this.title = title;
        this.imgRes = imgRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getItemType() {
        return 0;
    }

}
