package com.example.myproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class AboutFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);
//////
        ImageView fb_icon = view.findViewById(R.id.fb_icon);
        TextView fb_text = view.findViewById(R.id.fb_text);


        fb_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fb_text.setTextColor(ContextCompat.getColor(getContext(), R.color.teal_700));
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100070179483307"));
                startActivity(intent);
            }
        });


        fb_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fb_icon.setColorFilter(ContextCompat.getColor(getContext(), R.color.teal_700));
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100070179483307"));
                startActivity(intent);

            }
        });


////////

        ImageView insta_icon = view.findViewById(R.id.insta_icon);
        TextView insta_text = view.findViewById(R.id.insta_text);

        insta_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insta_text.setTextColor(ContextCompat.getColor(getContext(), R.color.teal_700));
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https:/www.instagram.com/anisshah.official"));
                startActivity(intent);

            }
        });


        insta_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insta_icon.setColorFilter(ContextCompat.getColor(getContext(), R.color.teal_700));
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https:/www.instagram.com/anisshah.official"));
                startActivity(intent);

            }
        });

        //////////


        TextView privacy = view.findViewById(R.id.privacy);

        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                privacy.setTextColor(ContextCompat.getColor(getContext(), R.color.purple_500));
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://princeanisshah.wordpress.com/fact-tak-app/"));
                startActivity(intent);

            }
        });


        TextView terms = view.findViewById(R.id.terms);

        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                terms.setTextColor(ContextCompat.getColor(getContext(), R.color.purple_500));
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://princeanisshah.wordpress.com/terms-conditions/"));
                startActivity(intent);

            }
        });




        TextView app_info = view.findViewById(R.id.app_info);

        app_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app_info.setTextColor(ContextCompat.getColor(getContext(), R.color.purple_500));

                Intent intent = new Intent();
                intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
//                Uri uri= Uri.fromParts("package",getPackageName(),null);
                intent.setData(Uri.parse("package:" + getContext().getPackageName()));
                startActivity(intent);

            }
        });


        /////////


        return view;

    }

}