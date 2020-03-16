package allaber.com.chat.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import allaber.com.chat.Fragment.FragmentMain;
import allaber.com.chat.Interface.NextFragment;
import allaber.com.chat.R;

public class ActivityMain extends AppCompatActivity implements View.OnClickListener, NextFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchTo(new FragmentMain());
    }

    public void switchTo(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void showFragment(Fragment fragment, String title) {
        switchTo(fragment);
    }

    @Override
    public void onClick(View v) {

    }
}
