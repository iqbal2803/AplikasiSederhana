package com.iqbal.aplikasisederhana.View.InputNama;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.iqbal.aplikasisederhana.R;

public class FragmentInputNama extends Fragment {
    TextView tv_tampil;
    EditText et_nama;
    Button btn_tampil;
    View rootView;

    public FragmentInputNama() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_input_nama, container, false);
        et_nama = rootView.findViewById(R.id.et_nama);
        btn_tampil = rootView.findViewById(R.id.btn_tampil);
        tv_tampil = rootView.findViewById(R.id.tv_tampil);

        btn_tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_nama.getText().toString().equals("") || et_nama.getText().toString().isEmpty()){
                    Toast.makeText(getContext(),"Harap Masukkan Nama",Toast.LENGTH_SHORT).show();
                    et_nama.setFocusable(true);
                    return;
                }

                tv_tampil.setText("Nama anda adalah "+et_nama.getText().toString());
            }
        });
        return rootView;
    }
}