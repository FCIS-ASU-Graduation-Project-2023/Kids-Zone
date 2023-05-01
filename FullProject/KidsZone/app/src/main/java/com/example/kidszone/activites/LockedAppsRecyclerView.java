package com.example.kidszone.activites;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kidszone.R;
import com.example.kidszone.adapter.LockedAppAdapter;
import com.example.kidszone.app_model.AppModel;
import com.example.kidszone.shared.SharedPrefUtil;

import java.util.ArrayList;
import java.util.List;

public class LockedAppsRecyclerView extends AppCompatActivity {

    RecyclerView recyclerView;
    public List<AppModel> apps = new ArrayList<>();
    LockedAppAdapter adapter;
    ProgressDialog progressDialog;
    Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locked_apps_recycler_view);
        getWindow().setStatusBarColor(ContextCompat.getColor(LockedAppsRecyclerView.this, R.color.beige));
        recyclerView = findViewById(R.id.lockedAppsList);
        adapter = new LockedAppAdapter(apps, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        progressDialog = new ProgressDialog(this);
        progressDialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialog) {
                getLockedApps();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        progressDialog.setTitle("Fetching Apps");
        progressDialog.setMessage("Loading");
        progressDialog.show();
    }

    private void getLockedApps() {
        List<String> prefAppList = SharedPrefUtil.getInstance(this).getLockedAppsList();
        List<ApplicationInfo> packageInfos = getPackageManager().getInstalledApplications(0);
        for (int i = 0; i < packageInfos.size(); i++) {
            if (packageInfos.get(i).icon > 0) {
                String name = packageInfos.get(i).loadLabel(getPackageManager()).toString();
                Drawable icon = packageInfos.get(i).loadIcon(getPackageManager());
                String packageName = packageInfos.get(i).packageName;
                Bundle metaData =packageInfos.get(i).metaData;
                int ageRating;
                if (metaData!=null){
                    ageRating = metaData.getInt("com.android.vending.DEMO_MODE_APP_AGE_RESTRICTION");
                }
                else{
                    ageRating=-1;
                }
//                int ageRating = metaData.getInt("com.android.vending.DEMO_MODE_APP_AGE_RESTRICTION");

                if (prefAppList.contains(packageName)) {
                    apps.add(new AppModel(name, icon, 1, packageName,ageRating));
                } else {
                    continue;
                }

            }

        }
        adapter.notifyDataSetChanged();
        progressDialog.dismiss();
    }
}