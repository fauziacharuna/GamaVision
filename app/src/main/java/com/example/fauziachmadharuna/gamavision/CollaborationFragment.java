package com.example.fauziachmadharuna.gamavision;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class CollaborationFragment extends Fragment {

    public CollaborationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_collaboration, container, false);
        String[]friendsItem={"Fauzi", "Jonathan", "Arif", "Irfan"};
        ListView listView=(ListView)view.findViewById(R.id.list_item);
        ArrayAdapter<String> listViewAdapter= new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                friendsItem
        );
        listView.setAdapter(listViewAdapter);
        return view;
    }


}
