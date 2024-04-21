package com.example.myproject;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myproject.Contacts.ContactModel;
import com.example.myproject.Contacts.CustomAdapter;
import com.example.myproject.Contacts.DbHelper;
import com.example.myproject.Contacts.ContactModel;
import com.example.myproject.Contacts.CustomAdapter;
import com.example.myproject.Contacts.DbHelper;

import java.util.List;

public class SavedContacts extends AppCompatActivity {

    ListView listView;
    DbHelper db;
    List<ContactModel> list;
    CustomAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_contacts);


        listView = findViewById(R.id.ListView);
        db = new DbHelper(this);
        list = db.getAllContacts();
        customAdapter = new CustomAdapter(this, list);
        listView.setAdapter(customAdapter);


    }
}