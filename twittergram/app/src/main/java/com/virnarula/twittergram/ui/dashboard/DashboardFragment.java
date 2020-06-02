package com.virnarula.twittergram.ui.dashboard;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.virnarula.twittergram.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private LinearLayout dashboardLinearLayout;
    private ScrollView dashboardPhotoScroller;
    private Button takeImageButton;

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
        return root;
    }
}
