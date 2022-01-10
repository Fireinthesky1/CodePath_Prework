package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        // User can tap a button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change the text color of the label
                textView.setTextColor(getResources().getColor(R.color.purple_200));
            }
        });

        //  User can tap a button to change the color of the background view
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change the background color
                ((RelativeLayout) findViewById(R.id.parent)).setBackgroundColor(getResources().getColor(R.color.purple_700));
            }
        });

        //  User can tap a button to change the test displayed on screen
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change the text of the label
                textView.setText("Han Solo shot first!");
            }
        });

        // User can tap on the background view to reset all views to default settings
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 1. Reset the text to "Hello from James!" id - @id/text
                ((RelativeLayout) findViewById(R.id.parent)).setBackgroundColor(getResources().getColor(R.color.green));

                // 2. Reset the color of the text
                // Original color - black, text id - @id/text
                textView.setText("Hello from James!");

                // 3. Reset the color of the background
                // Original background color - R.color.green
                textView.setTextColor(getResources().getColor(R.color.black));

            }
        });

        // User can tap the "change text string" button to update the label with the text from the text field
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change the text view to what is in the edit text view
                String User_Input = ((EditText) findViewById(R.id.editText)).getText().toString();

                //if the text field is empty, update label with default text string
                if(User_Input.isEmpty()) {
                    textView.setText("Enter your own text!");
                }else{
                    textView.setText(User_Input);
                }
            }
        });
    }
}