package com.servicematter.android.civilserviceregulation;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Finance_Bookmark_Adapter extends RecyclerView.Adapter<Finance_Bookmark_Adapter.BookmarksViewHolder> {

    List<Finance_Bookmark_Model> sectionList;
    private ListItemClickListener mOnClickListener;

    public Finance_Bookmark_Adapter(List<Finance_Bookmark_Model> sectionList/*,ListItemClickListener listItemClickListener*/) {
        //this.mOnClickListener = listItemClickListener;
        this.sectionList = sectionList;
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
        Finance_Bookmark_Model current = sectionList.get(position);
        holder.title.setText(current.getTitle());
        holder.text.setText(current.getRegulation());
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