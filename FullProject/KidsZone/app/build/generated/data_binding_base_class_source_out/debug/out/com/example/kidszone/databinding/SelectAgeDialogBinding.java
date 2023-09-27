// Generated by view binder compiler. Do not edit!
package com.example.kidszone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kidszone.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SelectAgeDialogBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextInputLayout agesList;

  @NonNull
  public final AutoCompleteTextView autoCompleteTxt;

  @NonNull
  public final TextView selectedAge;

  @NonNull
  public final AppCompatButton submitAgeButton;

  @NonNull
  public final TextView text;

  private SelectAgeDialogBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextInputLayout agesList, @NonNull AutoCompleteTextView autoCompleteTxt,
      @NonNull TextView selectedAge, @NonNull AppCompatButton submitAgeButton,
      @NonNull TextView text) {
    this.rootView = rootView;
    this.agesList = agesList;
    this.autoCompleteTxt = autoCompleteTxt;
    this.selectedAge = selectedAge;
    this.submitAgeButton = submitAgeButton;
    this.text = text;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SelectAgeDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SelectAgeDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.select_age_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SelectAgeDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ages_list;
      TextInputLayout agesList = ViewBindings.findChildViewById(rootView, id);
      if (agesList == null) {
        break missingId;
      }

      id = R.id.auto_complete_txt;
      AutoCompleteTextView autoCompleteTxt = ViewBindings.findChildViewById(rootView, id);
      if (autoCompleteTxt == null) {
        break missingId;
      }

      id = R.id.selected_age;
      TextView selectedAge = ViewBindings.findChildViewById(rootView, id);
      if (selectedAge == null) {
        break missingId;
      }

      id = R.id.submit_age_button;
      AppCompatButton submitAgeButton = ViewBindings.findChildViewById(rootView, id);
      if (submitAgeButton == null) {
        break missingId;
      }

      id = R.id.text;
      TextView text = ViewBindings.findChildViewById(rootView, id);
      if (text == null) {
        break missingId;
      }

      return new SelectAgeDialogBinding((ConstraintLayout) rootView, agesList, autoCompleteTxt,
          selectedAge, submitAgeButton, text);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}