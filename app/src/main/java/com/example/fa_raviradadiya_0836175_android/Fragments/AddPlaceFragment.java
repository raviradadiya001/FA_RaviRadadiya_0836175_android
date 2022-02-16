package com.example.fa_raviradadiya_0836175_android.Fragments;

import static android.content.Context.MODE_PRIVATE;
import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.fa_raviradadiya_0836175_android.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AddPlaceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddPlaceFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AddPlaceFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static AddPlaceFragment newInstance(String param1, String param2) {
        AddPlaceFragment fragment = new AddPlaceFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    EditText etStreet,etCity,etCountry;
    Button btnsave;

    SQLiteDatabase sqLiteDatabase;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_add_place, container, false);

        etStreet = v.findViewById(R.id.et_street);
        etCity = v.findViewById(R.id.et_citystate);
        etCountry = v.findViewById(R.id.et_country);
        btnsave = v.findViewById(R.id.btnSaveLocation);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sqLiteDatabase = openOrCreateDatabase("map_db",MODE_PRIVATE,null);
                createTable();
            }
        });

        return v;
    }
    private void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS location (" +
                "id INTEGER NOT NULL CONSTRAINT product_pk PRIMARY KEY AUTOINCREMENT," +
                "street VARCHAR(20) NOT NULL," +
                "citystate VARCHAR(20) NOT NULL," +
                "country VARCHAR(20) NOT NULL);";
        sqLiteDatabase.execSQL(sql);
    }
}
