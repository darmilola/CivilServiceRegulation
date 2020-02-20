package com.damilolaakinterinwa.android.civilserviceregulation;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Html;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.BookmarksViewHolder> {

    List<Section> sectionList;
    String searchString;
    private ListItemClickListener mOnClickListener;

    public SearchAdapter(List<Section> sectionList,String searchString/*,ListItemClickListener listItemClickListener*/) {
        //this.mOnClickListener = listItemClickListener;
        this.sectionList = sectionList;
        this.searchString = searchString;
    }

    public interface ListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }

    @NonNull
    @Override
    public BookmarksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.article_detail_recycler_item, parent, false);
        return new BookmarksViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookmarksViewHolder holder, int position) {
        Section current = sectionList.get(position);
        holder.title.setText(current.getTitle());
        holder.text.setText(current.getRegulation(), TextView.BufferType.SPANNABLE);
        Spannable spannable = (Spannable)holder.text.getText();
        int start = sectionList.get(position).getRegulation().indexOf(searchString);
        if(start < 0){
            start = 0;
        }
        int end = start + searchString.length();
        spannable.setSpan(new BackgroundColorSpan(Color.parseColor("#F76E98")), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

    }

    @Override
    public int getItemCount() {
        return sectionList.size();
    }

    public class BookmarksViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView text;

        public BookmarksViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.article_item_title);
            text = itemView.findViewById(R.id.article_item_text);

            Typeface customfont = Typeface.createFromAsset(itemView.getContext().getAssets(), "Kylo-Light.otf");
            Typeface customfont2 = Typeface.createFromAsset(itemView.getContext().getAssets(), "Kylo-Thin.otf");

            title.setTypeface(customfont);
            text.setTypeface(customfont2);



        }





    }

}