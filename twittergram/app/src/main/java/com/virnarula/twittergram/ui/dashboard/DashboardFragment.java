package com.virnarula.twittergram.ui.dashboard;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.virnarula.twittergram.R;
import com.virnarula.twittergram.UploadImageActivity;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private LinearLayout dashboardLinearLayout;
    private ScrollView dashboardPhotoScroller;
    private Button takeImageButton;
    private FloatingActionButton fab;
    private static final int pic_id = 123;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        dashboardLinearLayout = (LinearLayout) getView().findViewById(R.id.dashboardLinearLayout);
//        dashboardPhotoScroller = (ScrollView) getView().findViewById(R.id.dashboardPhotoScroller);
//        takeImageButton = (Button) getView().findViewById(R.id.cameraButton);
//        DisplayMetrics displayMetrics = new DisplayMetrics();
//        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
//        int heightWithoutButton = displayMetrics.heightPixels;
//        dashboardPhotoScroller.setMinimumHeight(heightWithoutButton - takeImageButton.getHeight());
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        fab = (FloatingActionButton) root.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button Click", "Camera");
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, pic_id);
            }
        });

        return root;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == pic_id) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            Intent intent = new Intent(getContext(), UploadImageActivity.class);
            intent.putExtra("photo", photo);
            startActivity(intent);
        }

    }

}
