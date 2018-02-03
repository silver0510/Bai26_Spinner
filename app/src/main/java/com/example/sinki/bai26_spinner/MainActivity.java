package com.example.sinki.bai26_spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.sinki.model.NhanVien;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText txtTen,txtSoNgay;
    Button btnXacNhan;

    Spinner spThu;
    ArrayList<String>dsThu;
    ArrayAdapter<String>adapterThu;

    int lastSelected = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyXacNhan();
            }
        });
        spThu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                lastSelected = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void xuLyXacNhan() {
        if(lastSelected ==-1) return;
        NhanVien nv = new NhanVien();
        nv.setTen(txtTen.getText().toString());
        nv.setSoNgayCongTac(Integer.parseInt(txtSoNgay.getText().toString()));
        nv.setThuBatDauCongTac(dsThu.get(lastSelected));
        Toast.makeText(MainActivity.this,nv.toString(),Toast.LENGTH_SHORT).show();
    }

    private void addControls() {
        txtTen = (EditText) findViewById(R.id.txtTen);
        txtSoNgay = (EditText) findViewById(R.id.txtSoNgay);
        btnXacNhan = (Button) findViewById(R.id.btnXacNhan);
        spThu = (Spinner) findViewById(R.id.spThu);
        dsThu =  new ArrayList<>();
        dsThu.add("Thứ 2");
        dsThu.add("Thứ 3");
        dsThu.add("Thứ 4");
        dsThu.add("Thứ 5");
        dsThu.add("Thứ 6");
        dsThu.add("Thứ 7");
        dsThu.add("Chủ nhật");
        adapterThu = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_spinner_item,
                dsThu);
        adapterThu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spThu.setAdapter(adapterThu);
    }
}
