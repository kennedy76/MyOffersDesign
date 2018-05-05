package com.example.ramkumar.myoffers;

/**
 * Created by Happy on 24-04-2018.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Tab1LogIn extends Fragment {
    Button login;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1login, container, false);
        login = (Button) rootView.findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),NavigationActivity.class); // INSTED OF THE "CLASS NAME.this WE USE GET ACTIVITY"
                startActivity(intent);
                Toast.makeText(getActivity(), "success!!!!!!!", Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
