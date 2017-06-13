package com.example.samsung_pc.apptrial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

public class Home extends AppCompatActivity {

    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        barChart = (BarChart) findViewById(R.id.barchart);

        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(44f, 0));
        barEntries.add(new BarEntry(60f, 1));
        barEntries.add(new BarEntry(20f, 2));
        barEntries.add(new BarEntry(55f, 3));
        barEntries.add(new BarEntry(70f, 4));

        BarDataSet barDataSet = new BarDataSet(barEntries, "Indicators");

        ArrayList<String> indicators = new ArrayList<>();
        indicators.add("Total Carbohydrates");
        indicators.add("Fibre");
        indicators.add("Total Fats");
        indicators.add("Saturated fats");
        indicators.add("Total Proteins");

        BarData theData = new BarData(indicators, barDataSet);
        barChart.setData(theData);
        barChart.invalidate();

    }

}


