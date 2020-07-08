package com.servicematter.android.civilserviceregulation;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class Procurement_Adapter extends ExpandableRecyclerViewAdapter<ArticleViewHolder,SectionViewHolder> {

    Context context;
    public Procurement_Adapter(List<? extends ExpandableGroup> groups, Context context) {
        super(groups);
        this.context = context;

    }




    @Override
    public ArticleViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.article_item,parent,false);

        return new ArticleViewHolder(view);
    }

    @Override
    public SectionViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.section_item,parent,false);
        return new SectionViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(SectionViewHolder holder, int flatPosition, final ExpandableGroup group, final int childIndex) {

        ///final Section section = ((Article)group).getItems().get(childIndex);

        final Procurement_Section section = ((Procurement_Article)group).getItems().get(childIndex);
        holder.section_title.setText(section.getTitle());
        holder.section_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,Procurement_Details.class);
                intent.putExtra("category",section.getCategory());
                intent.putExtra("position",childIndex);
                intent.putExtra("categorytitle",(group).getTitle());
                context.startActivity(intent);
            }
        });



    }

    @Override
    public void onBindGroupViewHolder(ArticleViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setArticleTitle(group);
    }



}
