package com.iqbal.aplikasisederhana.View.Kalkulator;

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

public class FragmentKalkulator extends Fragment {
    TextView tv_hasil;
    EditText et_angka1,et_angka2;
    Button btn_tambah,btn_kurang,btn_kali,btn_bagi,btn_bersih;
    Integer angka_pertama,angka_kedua,hitung;
    View rootView;

    public FragmentKalkulator() {
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
        rootView = inflater.inflate(R.layout.fragment_kalkulator, container, false);

        tv_hasil = rootView.findViewById(R.id.tv_hasil);
        et_angka1 = rootView.findViewById(R.id.et_angka_pertama);
        et_angka2 = rootView.findViewById(R.id.et_angka_kedua);
        btn_tambah = rootView.findViewById(R.id.btn_tambah);
        btn_kurang = rootView.findViewById(R.id.btn_kurang);
        btn_kali = rootView.findViewById(R.id.btn_kali);
        btn_bagi = rootView.findViewById(R.id.btn_bagi);
        btn_bersih = rootView.findViewById(R.id.btn_bersih);


        btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung(et_angka1.getText().toString(),et_angka2.getText().toString(),"+");
            }
        });

        btn_kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung(et_angka1.getText().toString(),et_angka2.getText().toString(),"-");
            }
        });

        btn_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung(et_angka1.getText().toString(),et_angka2.getText().toString(),"x");
            }
        });

        btn_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung(et_angka1.getText().toString(),et_angka2.getText().toString(),"/");

            }
        });

        btn_bersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_angka1.setText("");
                et_angka2.setText("");
                tv_hasil.setText("0");
                et_angka1.requestFocus();
            }
        });

        return rootView;
    }

    private void hitung(String angka1, String angka2,String operator){
        if(angka1.equals("") || angka1.isEmpty()){
            Toast.makeText(getContext(),"Harap Masukkan Angka Pertama",Toast.LENGTH_SHORT).show();
            et_angka1.requestFocus();
        }else if(angka2.equals("") || angka2.isEmpty()){
            Toast.makeText(getContext(),"Harap Masukkan Angka Kedua",Toast.LENGTH_SHORT).show();
            et_angka2.requestFocus();
        }else{
            angka_pertama = Integer.valueOf(angka1);
            angka_kedua = Integer.valueOf(angka2);
            if(operator.equals("+")){
                hitung = angka_pertama+angka_kedua;
                tv_hasil.setText(String.valueOf(hitung));
            }else if(operator.equals("-")){
                hitung = angka_pertama-angka_kedua;
                tv_hasil.setText(String.valueOf(hitung));
            }else if(operator.equals("x")){
                hitung = angka_pertama*angka_kedua;
                tv_hasil.setText(String.valueOf(hitung));
            }else if(operator.equals("/")){
                hitung = angka_pertama/angka_kedua;
                tv_hasil.setText(String.valueOf(hitung));
            }
        }

    }
}