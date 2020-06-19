package com.servicematter.android.civilserviceregulation;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;


public class SectionViewHolder extends ChildViewHolder  {
    public TextView section_title;
    public SectionViewHolder(final View itemView) {
        super(itemView);
        section_title = itemView.findViewById(R.id.section_title);
        Typeface customfont= Typeface.createFromAsset(itemView.getContext().getAssets(), "Kylo-Light.otf");
        section_title.setTypeface(customfont);



    }


}
