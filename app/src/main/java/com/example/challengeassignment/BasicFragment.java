package com.example.challengeassignment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class BasicFragment extends Fragment {

     EditText first_no;
     EditText second_no;
    Button add,sub,mul,div;
     TextView result;
    public BasicFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_basic, container, false);

        first_no=(EditText) rootView.findViewById(R.id.first_no);
        second_no=(EditText) rootView.findViewById(R.id.second_no);
        add=(Button) rootView.findViewById(R.id.add);
        sub=(Button) rootView.findViewById(R.id.sub);
        mul=(Button) rootView.findViewById(R.id.mul);
        div=(Button) rootView.findViewById(R.id.div);
        result = (TextView) rootView.findViewById(R.id.result);

        int ans=0;


        // Add_button add clicklistener
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(first_no.getText().toString());
                double num2 = Double.parseDouble(second_no.getText().toString());
                // add both number and store it to sum
                double sum = num1 + num2;
                // set it ot result textview
                result.setText(Double.toString(sum));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(first_no.getText().toString());
                double num2 = Double.parseDouble(second_no.getText().toString());
                // add both number and store it to sum
                double sum = num1 - num2;
                // set it ot result textview
                result.setText(Double.toString(sum));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(first_no.getText().toString());
                double num2 = Double.parseDouble(second_no.getText().toString());
                // add both number and store it to sum
                double sum = num1 * num2;
                // set it ot result textview
                result.setText(Double.toString(sum));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(first_no.getText().toString());
                double num2 = Double.parseDouble(second_no.getText().toString());
                // add both number and store it to sum
                double sum = num1 / num2;
                // set it ot result textview
                result.setText(Double.toString(sum));
            }
        });
        return rootView;
    }

}
