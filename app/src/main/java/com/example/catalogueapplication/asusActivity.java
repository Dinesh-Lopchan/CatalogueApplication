package com.example.catalogueapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class asusActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asus);
        TextView About;

        // TextView component from the layout
        About = findViewById(R.id.About);

        // Setting the text size
        float textSizeInSp = 18;
        About.setTextSize(textSizeInSp);

        // providing the information about asus laptops
        String asusinfo = "Product information" +
                "\nProduct code:527039" + "\nIntel Celerom processor"+
                "\nWhether you're scrolling through your news feed, buying groceries online or emailing friends and family, the Asus E510MA 15.6" +
                "\nLaptop can take on your daily tasks. Powered by an Intel® Celeron® processor, you can enjoy speedy performance and smooth responsiveness for your everyday browsing." +
                "\nSmart design" + "\nThe Asus E510MA has a super-thin bezel and detailed Full HD resolution, so you get more screen for more immersive viewing. And the digital keypad feature makes it easy to input numbers - simply tap the icon and type in your data with the touch pad"
                + "\nSleek and portable" + "\nThe E510MA 14" + " \nLaptop is slim enough to fit comfortably in your bag. And it only weighs 1.6 kg, so it's light enough to carry around all day. The battery lasts for up to 8 hours, so you can stay productive on the go." + ". \n";
        About.setText(asusinfo);

        // button to exit
        Button Exit = findViewById(R.id.exit);

        // Set on click listener for the exit button
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Finish the running activity to go back to previous activity
                finish();
            }
        });
    }
}