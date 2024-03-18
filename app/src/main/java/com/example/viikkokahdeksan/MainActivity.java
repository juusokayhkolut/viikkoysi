package com.example.yourapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button addUserButton, listUsersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addUserButton = findViewById(R.id.addUserButton);
        listUsersButton = findViewById(R.id.listUsersButton);

        addUserButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AddUserActivity.class);
            startActivity(intent);
        });

        listUsersButton.setOnClickListener(view -> {
            // Change this to ListUserInRecycleViewActivity.class if you implement RecyclerView
            Intent intent = new Intent(MainActivity.this, ListUserInTextViewActivity.class);
            startActivity(intent);
        });
    }
}
