package com.virnarula.twittergram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class UploadImageActivity extends AppCompatActivity {

    private ImageView toUpload;
    private Button upload;
    private Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_image);

        toUpload = (ImageView) findViewById(R.id.uploadImageView);
        toUpload.setImageBitmap((Bitmap) getIntent().getExtras().get("photo"));
        upload = (Button) findViewById(R.id.uploadBtn);
        cancel = (Button) findViewById(R.id.cancelButton);

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button", "Upload");
                // TO-DO: Upload the image to Parse Dashboard
                Intent intent = new Intent(getApplicationContext(), home.class);
                startActivity(intent);

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button", "Cancel");
                Intent intent = new Intent(getApplicationContext(), home.class);
                startActivity(intent);
            }
        });
    }
}