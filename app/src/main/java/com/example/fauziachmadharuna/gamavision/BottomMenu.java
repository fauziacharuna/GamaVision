package com.example.fauziachmadharuna.gamavision;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class BottomMenu extends AppCompatActivity {

    private TextView mTextMessage;
    private ActionBar toolbar;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_event:
//                    mTextMessage.setText(R.string.title_home);
                    EventFragment eventFragment = new EventFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fl_layout,eventFragment);
                    toolbar.setTitle(R.string.title_event);
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_collaboration:
//                    mTextMessage.setText(R.string.title_dashboard);
                    CollaborationFragment collaborationFragment = new CollaborationFragment();
                    FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.fl_layout,collaborationFragment);
                    toolbar.setTitle(R.string.title_collaboration);
                    fragmentTransaction1.commit();
                    return true;
                case R.id.navigation_sale:
//                   mTextMessage.setText(R.string.title_notifications);
                    SaleFragment saleFragment = new SaleFragment();
                    FragmentTransaction fragmentTransaction2=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.fl_layout,saleFragment);
                    toolbar.setTitle(R.string.title_sale);
                    fragmentTransaction2.commit();
                    return true;
                case R.id.navigation_profile:
                    ProfileFragment profileFragment=new ProfileFragment();
                    FragmentTransaction fragmentTransaction3=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction3.replace(R.id.fl_layout,profileFragment);
                    toolbar.setTitle(R.string.title_profile);
                    fragmentTransaction3.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_menu);
        toolbar=getSupportActionBar();
        loadFragment(new EventFragment());
        toolbar.setTitle(R.string.title_event);


        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    private void loadFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fl_layout,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}
