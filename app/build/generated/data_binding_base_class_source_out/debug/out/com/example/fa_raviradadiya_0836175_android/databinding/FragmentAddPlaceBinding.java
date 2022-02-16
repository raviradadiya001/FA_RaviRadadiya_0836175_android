// Generated by view binder compiler. Do not edit!
package com.example.fa_raviradadiya_0836175_android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fa_raviradadiya_0836175_android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddPlaceBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnSaveLocation;

  @NonNull
  public final EditText etCitystate;

  @NonNull
  public final EditText etCountry;

  @NonNull
  public final EditText etPlace;

  @NonNull
  public final EditText etStreet;

  private FragmentAddPlaceBinding(@NonNull LinearLayout rootView, @NonNull Button btnSaveLocation,
      @NonNull EditText etCitystate, @NonNull EditText etCountry, @NonNull EditText etPlace,
      @NonNull EditText etStreet) {
    this.rootView = rootView;
    this.btnSaveLocation = btnSaveLocation;
    this.etCitystate = etCitystate;
    this.etCountry = etCountry;
    this.etPlace = etPlace;
    this.etStreet = etStreet;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddPlaceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddPlaceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_place, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddPlaceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSaveLocation;
      Button btnSaveLocation = ViewBindings.findChildViewById(rootView, id);
      if (btnSaveLocation == null) {
        break missingId;
      }

      id = R.id.et_citystate;
      EditText etCitystate = ViewBindings.findChildViewById(rootView, id);
      if (etCitystate == null) {
        break missingId;
      }

      id = R.id.et_country;
      EditText etCountry = ViewBindings.findChildViewById(rootView, id);
      if (etCountry == null) {
        break missingId;
      }

      id = R.id.et_place;
      EditText etPlace = ViewBindings.findChildViewById(rootView, id);
      if (etPlace == null) {
        break missingId;
      }

      id = R.id.et_street;
      EditText etStreet = ViewBindings.findChildViewById(rootView, id);
      if (etStreet == null) {
        break missingId;
      }

      return new FragmentAddPlaceBinding((LinearLayout) rootView, btnSaveLocation, etCitystate,
          etCountry, etPlace, etStreet);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}