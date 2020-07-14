package com.servicematter.android.regulatorybooks;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class Finance_Articles extends ExpandableGroup<Finance_Section> {

    private String articlenumber;
    private String title;
    private List<Finance_Section> sectionList;

    public Finance_Articles(String articlenumber, String title, List<Finance_Section> sectionList){
        super(title,sectionList);
        this.articlenumber = articlenumber;
        this.title = title;
        this.sectionList = sectionList;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public List<Finance_Section> getSectionList() {
        return sectionList;
    }

    public String getArticlenumber() {
        return articlenumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArticlenumber(String articlenumber) {
        this.articlenumber = articlenumber;
    }

    public void setSectionList(List<Finance_Section> sectionList) {
        this.sectionList = sectionList;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Article)) return false;

        Article article = (Article)o;
        return  getArticlenumber() == article.getArticlenumber();
    }


}
