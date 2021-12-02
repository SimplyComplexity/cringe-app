package com.learntodroid.piechartandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import android.widget.TextView;
import android.widget.Toast;

import android.widget.AdapterView;
import android.view.View;


import java.util.ArrayList;




public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private PieChart pieChart;
    private Spinner spinner;
    private Object AdapterView;


    String selectedItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pieChart = findViewById(R.id.activity_main_piechart);

        setupPieChart();
        //loadPieChartData("Chapter 5");

        Spinner spinner = findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Chapter, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        TextView tv1 = (TextView) findViewById(R.id.poop);
        tv1.setText(selectedItem);


    }


    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

        //i can call it every fucking where, but i cannot call it here since i am a fucking illiterate at java. fuck java it is a fucking piece of shit with a dumbass name. Who even fucking names their language after fucking coffee? next you will be telling me that some dude named his language fucksshitpissachino since he loves drinking fucking piss.
        //Java is trash.
        //ive done it IVE DONE IT IVE DONE ITTTTT!!!!!!!!!!!!! LETS OGOOOOOOOOOO!O!O!O!O -I
        //im gonna sleep for 10 hours to CELEBRATE!!!! -I
        //SACRIFICE YOUR NEWBORN FOR I HAVE ACCOMPLISHED THE IMPOSSIBLE -I
        //int yeetus = pos

        loadPieChartData(pos);

        //pos starts from 0!
        //Important to note! 0 means 1! 0 MEANS 1!!!!11!
    }


    public void onNothingSelected(android.widget.AdapterView<?> adapterView) {
        //selectedItem = (String) spinner.getItemAtPosition(1);
        loadPieChartData(0);

    }


    public void setupPieChart() {
        pieChart.setDrawHoleEnabled(true);
        pieChart.setUsePercentValues(true);
        pieChart.setEntryLabelTextSize(12);
        pieChart.setEntryLabelColor(Color.BLACK);
        pieChart.setCenterText("Results");
        pieChart.setCenterTextSize(24);
        pieChart.getDescription().setEnabled(false);

        Legend l = pieChart.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setDrawInside(false);
        l.setEnabled(true);
    }


    public void loadPieChartData(int chap) {

        //Im not even sure how this steaming pile of sewage is working but it does so i say fuck it
        //I could beautify it but im too braindead to do it.
        //TO ANDY: if you wanna further add chapters, just add a new else if statement
        //heres the chunk of code for further development

        /*
        else if (chap == NUMBER YOU WANT) {
            entries.add(new PieEntry(0.1f, "Pass"));
            entries.add(new PieEntry(0.7f, "Fail"));
            entries.add(new PieEntry(0.2f, "Not done"));
            ArrayList<Integer> colors = new ArrayList<>();
            for (int color : ColorTemplate.MATERIAL_COLORS) {
                colors.add(color);
            }

            for (int color : ColorTemplate.VORDIPLOM_COLORS) {
                colors.add(color);
            }

            PieDataSet dataSet = new PieDataSet(entries, "Chapters");
            dataSet.setColors(colors);

            PieData data = new PieData(dataSet);
            data.setDrawValues(true);
            data.setValueFormatter(new PercentFormatter(pieChart));
            data.setValueTextSize(12f);
            data.setValueTextColor(Color.BLACK);

            pieChart.setData(data);
            pieChart.invalidate();

            pieChart.animateY(1400, Easing.EaseInOutQuad);
        }

         */

        //to make it work, just replace NUMBER YOU WANT to the position of spinner
        // add it before the final else statement and after the if statement.
        // as you can imagine the whole thing is terribly slow, needlessly heavy, and ugly af
        // all this could be prevented by using continue/return statements
        // or you could try switch cases. All of which would be much more maintainable than this carbonara
        // but im a lazy bastard so its your job now XD



        ArrayList<PieEntry> entries = new ArrayList<>();

        if (chap == 0) {
            entries.add(new PieEntry(0.3f, "Pass"));
            entries.add(new PieEntry(0.4f, "Fail"));
            entries.add(new PieEntry(0.3f, "Not done"));
            ArrayList<Integer> colors = new ArrayList<>();
            for (int color : ColorTemplate.MATERIAL_COLORS) {
                colors.add(color);
            }

            for (int color : ColorTemplate.VORDIPLOM_COLORS) {
                colors.add(color);
            }

            PieDataSet dataSet = new PieDataSet(entries, "Chapters");
            dataSet.setColors(colors);

            PieData data = new PieData(dataSet);
            data.setDrawValues(true);
            data.setValueFormatter(new PercentFormatter(pieChart));
            data.setValueTextSize(12f);
            data.setValueTextColor(Color.BLACK);

            pieChart.setData(data);
            pieChart.invalidate();

            pieChart.animateY(1400, Easing.EaseInOutQuad);
        } else if (chap == 1) {
            entries.add(new PieEntry(0.1f, "Pass"));
            entries.add(new PieEntry(0.8f, "Fail"));
            entries.add(new PieEntry(0.1f, "Not done"));
            ArrayList<Integer> colors = new ArrayList<>();
            for (int color : ColorTemplate.MATERIAL_COLORS) {
                colors.add(color);
            }

            for (int color : ColorTemplate.VORDIPLOM_COLORS) {
                colors.add(color);
            }

            PieDataSet dataSet = new PieDataSet(entries, "Chapters");
            dataSet.setColors(colors);

            PieData data = new PieData(dataSet);
            data.setDrawValues(true);
            data.setValueFormatter(new PercentFormatter(pieChart));
            data.setValueTextSize(12f);
            data.setValueTextColor(Color.BLACK);

            pieChart.setData(data);
            pieChart.invalidate();

            pieChart.animateY(1400, Easing.EaseInOutQuad);
        }

        else if (chap == 2) {
            entries.add(new PieEntry(0.1f, "Pass"));
            entries.add(new PieEntry(0.9f, "Fail"));
            entries.add(new PieEntry(0.0f, "Not done"));
            ArrayList<Integer> colors = new ArrayList<>();
            for (int color : ColorTemplate.MATERIAL_COLORS) {
                colors.add(color);
            }

            for (int color : ColorTemplate.VORDIPLOM_COLORS) {
                colors.add(color);
            }

            PieDataSet dataSet = new PieDataSet(entries, "Chapters");
            dataSet.setColors(colors);

            PieData data = new PieData(dataSet);
            data.setDrawValues(true);
            data.setValueFormatter(new PercentFormatter(pieChart));
            data.setValueTextSize(12f);
            data.setValueTextColor(Color.BLACK);

            pieChart.setData(data);
            pieChart.invalidate();

            pieChart.animateY(1400, Easing.EaseInOutQuad);
        }

        else if (chap == 3) {
            entries.add(new PieEntry(0.3f, "Pass"));
            entries.add(new PieEntry(0.5f, "Fail"));
            entries.add(new PieEntry(0.2f, "Not done"));
            ArrayList<Integer> colors = new ArrayList<>();
            for (int color : ColorTemplate.MATERIAL_COLORS) {
                colors.add(color);
            }

            for (int color : ColorTemplate.VORDIPLOM_COLORS) {
                colors.add(color);
            }

            PieDataSet dataSet = new PieDataSet(entries, "Chapters");
            dataSet.setColors(colors);

            PieData data = new PieData(dataSet);
            data.setDrawValues(true);
            data.setValueFormatter(new PercentFormatter(pieChart));
            data.setValueTextSize(12f);
            data.setValueTextColor(Color.BLACK);

            pieChart.setData(data);
            pieChart.invalidate();

            pieChart.animateY(1400, Easing.EaseInOutQuad);
        }
        else if (chap == 4) {
            entries.add(new PieEntry(0.2f, "Pass"));
            entries.add(new PieEntry(0.7f, "Fail"));
            entries.add(new PieEntry(0.1f, "Not done"));
            ArrayList<Integer> colors = new ArrayList<>();
            for (int color : ColorTemplate.MATERIAL_COLORS) {
                colors.add(color);
            }

            for (int color : ColorTemplate.VORDIPLOM_COLORS) {
                colors.add(color);
            }

            PieDataSet dataSet = new PieDataSet(entries, "Chapters");
            dataSet.setColors(colors);

            PieData data = new PieData(dataSet);
            data.setDrawValues(true);
            data.setValueFormatter(new PercentFormatter(pieChart));
            data.setValueTextSize(12f);
            data.setValueTextColor(Color.BLACK);

            pieChart.setData(data);
            pieChart.invalidate();

            pieChart.animateY(1400, Easing.EaseInOutQuad);
        }

        else if (chap == 5) {
            entries.add(new PieEntry(0.3f, "Pass"));
            entries.add(new PieEntry(0.4f, "Fail"));
            entries.add(new PieEntry(0.3f, "Not done"));
            ArrayList<Integer> colors = new ArrayList<>();
            for (int color : ColorTemplate.MATERIAL_COLORS) {
                colors.add(color);
            }

            for (int color : ColorTemplate.VORDIPLOM_COLORS) {
                colors.add(color);
            }

            PieDataSet dataSet = new PieDataSet(entries, "Chapters");
            dataSet.setColors(colors);

            PieData data = new PieData(dataSet);
            data.setDrawValues(true);
            data.setValueFormatter(new PercentFormatter(pieChart));
            data.setValueTextSize(12f);
            data.setValueTextColor(Color.BLACK);

            pieChart.setData(data);
            pieChart.invalidate();

            pieChart.animateY(1400, Easing.EaseInOutQuad);
        }


        else {
            entries.add(new PieEntry(0.2f, "Pass"));
            entries.add(new PieEntry(0.3f, "Fail"));
            entries.add(new PieEntry(0.5f, "Not done"));
            ArrayList<Integer> colors = new ArrayList<>();
            for (int color : ColorTemplate.MATERIAL_COLORS) {
                colors.add(color);
            }

            for (int color : ColorTemplate.VORDIPLOM_COLORS) {
                colors.add(color);
            }

            PieDataSet dataSet = new PieDataSet(entries, "Chapters");
            dataSet.setColors(colors);

            PieData data = new PieData(dataSet);
            data.setDrawValues(true);
            data.setValueFormatter(new PercentFormatter(pieChart));
            data.setValueTextSize(12f);
            data.setValueTextColor(Color.BLACK);

            pieChart.setData(data);
            pieChart.invalidate();

            pieChart.animateY(1400, Easing.EaseInOutQuad);
        }




        /*ArrayList<Integer> colors = new ArrayList<>();
        for (int color : ColorTemplate.MATERIAL_COLORS) {
            colors.add(color);
        }

        for (int color : ColorTemplate.VORDIPLOM_COLORS) {
            colors.add(color);
        }

        PieDataSet dataSet = new PieDataSet(entries, "Chapters");
        dataSet.setColors(colors);

        PieData data = new PieData(dataSet);
        data.setDrawValues(true);
        data.setValueFormatter(new PercentFormatter(pieChart));
        data.setValueTextSize(12f);
        data.setValueTextColor(Color.BLACK);

        pieChart.setData(data);
        pieChart.invalidate();

        pieChart.animateY(1400, Easing.EaseInOutQuad);

         */
    }
}





