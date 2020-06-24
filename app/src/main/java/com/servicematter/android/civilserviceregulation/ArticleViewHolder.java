package com.servicematter.android.civilserviceregulation;

import android.graphics.Typeface;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class ArticleViewHolder extends GroupViewHolder {
    public TextView article_number;
    public TextView title;
    public ImageView expand_icon;

    public ArticleViewHolder(View itemView) {
        super(itemView);
        article_number = itemView.findViewById(R.id.article_number);
        title = itemView.findViewById(R.id.article_title);
        expand_icon = itemView.findViewById(R.id.expand_icon);
        Typeface customfont= Typeface.createFromAsset(itemView.getContext().getAssets(), "Kylo-Light.otf");
        Typeface customfont2= Typeface.createFromAsset(itemView.getContext().getAssets(), "Kylo-Thin.otf");
        title.setTypeface(customfont);
        article_number.setTypeface(customfont2);
    }

    @Override
    public void collapse(){
        animateCollapse();
    }
    @Override
    public void expand(){
        animateExpand();
    }

    private void animateExpand(){
        RotateAnimation rotateAnimation = new RotateAnimation(360,180, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotateAnimation.setDuration(300);
        rotateAnimation.setFillAfter(true);
        expand_icon.setAnimation(rotateAnimation);
    }
    private void animateCollapse(){
        RotateAnimation rotateAnimation = new RotateAnimation(180,360, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotateAnimation.setDuration(300);
        rotateAnimation.setFillAfter(true);
        expand_icon.setAnimation(rotateAnimation);
    }


    public void setArticleTitle(ExpandableGroup article){
        if(article instanceof  Article){
            title.setText(article.getTitle());
            article_number.setText(((Article) article).getArticlenumber());

        }
        else if(article instanceof rulesArticles){
            title.setText(article.getTitle());
            article_number.setText(((rulesArticles) article).getArticlenumber());
        }
        else if(article instanceof Finance_Articles){
            title.setText(article.getTitle());
            article_number.setText(((Finance_Articles) article).getArticlenumber());

        }

    }
}
