package com.learntodroid.piechartandroid;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

public class SpinnerActivity extends MainActivity implements AdapterView.OnItemSelectedListener {


    /*
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        String selectedItem = parent.getItemAtPosition(pos).toString();

        MainActivity main = new MainActivity();
        main.setupPieChart();
        main.loadPieChartData(selectedItem);


    }

     */




    public void onNothingSelected(AdapterView<?> parent) {

    }
}

