package com.example.challengeassignment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ScientificFragment extends Fragment {

    EditText first_no;
    Button log,ln;
    TextView result;

    public ScientificFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_scientific, container, false);

        first_no=(EditText) rootView.findViewById(R.id.enter_no);
        log=(Button) rootView.findViewById(R.id.log);
        ln=(Button) rootView.findViewById(R.id.ln);
        result = (TextView) rootView.findViewById(R.id.result);

        int ans=0;


        // Add_button add clicklistener
        log.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // num1 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(first_no.getText().toString());

                double logResult = Math.log(num1);
                // set it ot result textview
                result.setText(Double.toString(logResult));
            }
        });

        ln.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // num1 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(first_no.getText().toString());
                // add both number and store it to sum
                double logResult = Math.log10(num1);
                // set it ot result textview
                result.setText(Double.toString(logResult));
            }
        });

        return rootView;
    }

}
