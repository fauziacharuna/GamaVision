package com.example.fauziachmadharuna.gamavision;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class CollaborationFragment extends Fragment {
    ListView listView;
    ListView listViewGroup;
    int[]avatarGroup={R.drawable.logo_kmdite,R.drawable.logo_vision,R.drawable.logo_expo};
    int[]avatar={R.drawable.fauzi_profile,R.drawable.salim_profile,R.drawable.irham_profile

                };
    String[]avatarName={"Fauzi Achmad Haruna","Salim Romadhon", "Irham Salim"};
    String[]GroupName={"KMDITE","Vision","Expo Karya"};


    public CollaborationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_collaboration, container, false);
        listView=(ListView) view.findViewById(R.id.list_item);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        //Group List View
        listViewGroup=(ListView)view.findViewById(R.id.list_group);
        CustomAdapter customAdapterGroup= new CustomAdapter();
        listViewGroup.setAdapter(customAdapterGroup);

//        String[]friendsItem={"Fauzi", "Jonathan", "Arif", "Irfan"};
//        ListView listView=(ListView)view.findViewById(R.id.list_item);
//        ArrayAdapter<String> listViewAdapter= new ArrayAdapter<String>(
//                getActivity(),
//                android.R.layout.simple_list_item_1,
//                friendsItem
//        );
//        listView.setAdapter(listViewAdapter);

        return view;
    }
    class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return avatar.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
           View view=getLayoutInflater().inflate(R.layout.group_items,null);
           View view1=getLayoutInflater().inflate(R.layout.friends_items,null);
            ImageView imageView =(ImageView)view.findViewById(R.id.avatar_picture);
            TextView textView=(TextView)view.findViewById(R.id.name_avatar_1);
            imageView.setImageResource(avatar[position]);
            textView.setText(avatarName[position]);

            ImageView imageViewGroup=(ImageView)view.findViewById(R.id.group_picture);
            TextView textViewGroup=(TextView)view.findViewById(R.id.name_group_1);


//
//            imageViewGroup.setImageResource(avatarGroup[position]);
//            textView.setText(GroupName[position]);
            return view;
        }


        @Nullable
        @Override
        public CharSequence[] getAutofillOptions() {
            return new CharSequence[0];
        }
    }


}
