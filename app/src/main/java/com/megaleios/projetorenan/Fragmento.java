package com.megaleios.projetorenan;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmento extends Fragment {


    private static final String TAG = "APP->";
    private EditText campo1;
    private EditText campo2;
    private EditText campo3;

    public Fragmento() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragmento, container, false);

        campo1 = (EditText) v.findViewById(R.id.campo1);
        campo2 = (EditText) v.findViewById(R.id.campo2);
        campo3 = (EditText) v.findViewById(R.id.campo3);


        //recuperando os dados desse cara
        if (savedInstanceState != null) {
            campo1.setText("recuperado: " + savedInstanceState.getString("CAMPO1"));
            campo2.setText("recuperado: " + savedInstanceState.getString("CAMPO2"));
            campo3.setText("recuperado: " + savedInstanceState.getString("CAMPO3"));
        }

        return v;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "saiu de cena");
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.i(TAG, "salvou os dados desse cara");

        outState.putString("CAMPO1", campo1.getText().toString());
        outState.putString("CAMPO2", campo2.getText().toString());
        outState.putString("CAMPO3", campo3.getText().toString());

        super.onSaveInstanceState(outState);
    }
}
