package com.example.fa_raviradadiya_0836175_android.Fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.fa_raviradadiya_0836175_android.PlaceAdapter;
import com.example.fa_raviradadiya_0836175_android.R;

import org.w3c.dom.Text;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ListFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ListFragment newInstance(String param1, String param2) {
        ListFragment fragment = new ListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

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

              View view = inflater.inflate(R.layout.fragment_list, container, false);
              return view;
    }

    public abstract class myAdapter extends BaseAdapter {
        Context context;

        public myAdapter(Context context, List<String> stringList) {
            this.context = context;
            this.stringList = stringList;
        }

        List<String> stringList;
        TextView txtplace,txtcity,txtcountry;
        @Override
        public int getCount(){
            return stringList.size();
        }

        @Override
        public Object getItem(int i){
            return i;
        }

        @Override
        public long getItemId(int i){
            return 0;
        }

        @Override
        public View getView(int i,View view,ViewGroup viewGroup){
            view=LayoutInflater.from(context).inflate(R.layout.placelayout,viewGroup,false);
            txtplace=view.findViewById(R.id.txtplacename);
            txtcity=view.findViewById(R.id.txtcity);
            txtcountry=view.findViewById(R.id.txtcountry);
            return view;
        }
    }
}