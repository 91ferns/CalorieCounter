package com.projectferns.caloriecounterapp;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;

import com.projectferns.caloriecounterapp.models.ListPost;

import java.util.ArrayList;

/**
 * Created by stephen on 7/12/14.
 */
public class ListPostsAdapter extends ArrayAdapter<ListPost> {
    private ArrayList<ListPost> objects;
    private Context context;
    private int resourceId;

    public ListPostsAdapter(Context context, int textViewResourceId, ArrayList<ListPost> objects) {
        super(context, textViewResourceId, objects);

        this.resourceId = textViewResourceId;
        this.objects = objects;
        this.context = context;

    }

    /*
	 * we are overriding the getView method here - this is what defines how each
	 * list item will look.
	 */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        ListPost post = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_individal_post, parent, false);
        }
        // Lookup view for data population
        TextView firstLine = (TextView) convertView.findViewById(R.id.firstLine);
        TextView secondLine = (TextView) convertView.findViewById(R.id.secondLine);
        RoundedImageView image = (RoundedImageView) convertView.findViewById(R.id.icon);

        SpannableStringBuilder resultBuilder = new SpannableStringBuilder();
        SpannableString spanTitle = new SpannableString(post.getMessage());
        spanTitle.setSpan(new AbsoluteSizeSpan(18, true), 0, spanTitle.length(), 0);

        resultBuilder.append(spanTitle);

        SpannableString spanAuthor = new SpannableString("@webmakersteve");
        spanAuthor.setSpan(new AbsoluteSizeSpan(12, true), 0, spanAuthor.length(), 0);
        resultBuilder.append(spanAuthor);

        // Populate the data into the template view using the data object
        firstLine.setText(resultBuilder, TextView.BufferType.SPANNABLE);
        secondLine.setText(post.getMessage());
        //image.set
        // Return the completed view to render on screen
        return convertView;
    }

}
