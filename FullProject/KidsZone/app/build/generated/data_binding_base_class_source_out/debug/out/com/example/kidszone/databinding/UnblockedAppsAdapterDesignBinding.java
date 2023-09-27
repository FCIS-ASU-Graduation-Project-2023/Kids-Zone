// Generated by view binder compiler. Do not edit!
package com.example.kidszone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kidszone.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UnblockedAppsAdapterDesignBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView appicon;

  @NonNull
  public final TextView appname;

  @NonNull
  public final ImageView appstatus;

  @NonNull
  public final CardView cardView;

  private UnblockedAppsAdapterDesignBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView appicon, @NonNull TextView appname, @NonNull ImageView appstatus,
      @NonNull CardView cardView) {
    this.rootView = rootView;
    this.appicon = appicon;
    this.appname = appname;
    this.appstatus = appstatus;
    this.cardView = cardView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UnblockedAppsAdapterDesignBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UnblockedAppsAdapterDesignBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.unblocked_apps_adapter_design, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UnblockedAppsAdapterDesignBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appicon;
      ImageView appicon = ViewBindings.findChildViewById(rootView, id);
      if (appicon == null) {
        break missingId;
      }

      id = R.id.appname;
      TextView appname = ViewBindings.findChildViewById(rootView, id);
      if (appname == null) {
        break missingId;
      }

      id = R.id.appstatus;
      ImageView appstatus = ViewBindings.findChildViewById(rootView, id);
      if (appstatus == null) {
        break missingId;
      }

      id = R.id.card_view;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      return new UnblockedAppsAdapterDesignBinding((RelativeLayout) rootView, appicon, appname,
          appstatus, cardView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}