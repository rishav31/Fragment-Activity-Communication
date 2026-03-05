package com.example.rishu.fragactivitycommunication;






import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener {

    int i;
    TextView txtCount;
    BlankFragment blankFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCount = findViewById(R.id.txtcount);
        blankFragment = new BlankFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, blankFragment, "HELLO");
        fragmentTransaction.commit();
    }


    @Override
    public void onFragmentInteraction(int i) {
       //this.i  = i++;
         txtCount.setText(""+i);
    }
}
