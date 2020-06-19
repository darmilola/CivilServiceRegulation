package com.servicematter.android.civilserviceregulation;



import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ruledetailAdapter extends RecyclerView.Adapter<ruledetailAdapter.ArticleDetailViewHolder>{

    List<Rules_Section> sectionList;
    private ListItemClickListener mOnClickListener;

    public ruledetailAdapter(List<Rules_Section> sectionList,ListItemClickListener listItemClickListener){
        this.sectionList = sectionList;
        this.mOnClickListener = listItemClickListener;
    }

    public interface ListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }
    @NonNull
    @Override
    public ArticleDetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.article_detail_recycler_item,parent,false);
        return new ArticleDetailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleDetailViewHolder holder, int position) {
        Rules_Section current = sectionList.get(position);
        holder.title.setText(current.getTitle());
        holder.text.setText(current.getRules());
    }

    @Override
    public int getItemCount() {
        return sectionList.size();
    }

    public class ArticleDetailViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView title;
        TextView text;

        public ArticleDetailViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.article_item_title);
            text = itemView.findViewById(R.id.article_item_text);
            itemView.setOnClickListener(this);

            Typeface customfont= Typeface.createFromAsset(itemView.getContext().getAssets(), "Kylo-Light.otf");
            Typeface customfont2= Typeface.createFromAsset(itemView.getContext().getAssets(), "Kylo-Thin.otf");

            title.setTypeface(customfont);
            text.setTypeface(customfont2);
        }

        @Override
        public void onClick(View view) {
            mOnClickListener.onListItemClick(getAdapterPosition());
        }
    }
}
