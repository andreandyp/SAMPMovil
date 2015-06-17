package me.andreandyp.samp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import com.androidplot.xy.LineAndPointFormatter;
import com.androidplot.xy.PointLabelFormatter;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.XYPlot;
import com.androidplot.xy.XYSeries;

import java.util.Arrays;


public class estadisticasdel extends AppCompatActivity {
    private XYPlot mySimpleXYPlot;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.estadisticasdel);

        // initialize our XYPlot reference:
        mySimpleXYPlot = (XYPlot) findViewById(R.id.mySimpleXYPlot);

        // Create a couple arrays of y-values to plot:
        Number[] series1Numbers = {50, 45, 65, 62, 60, 55};
        Number[] series2Numbers = {60, 50, 57, 70, 65, 50};

        // Turn the above arrays into XYSeries':
        XYSeries series1 = new SimpleXYSeries(Arrays.asList(series1Numbers),SimpleXYSeries.ArrayFormat.Y_VALS_ONLY,"2014");
        XYSeries series2 = new SimpleXYSeries(Arrays.asList(series2Numbers), SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "2015");

        // Create a formatter to use for drawing a series using LineAndPointRenderer:
        LineAndPointFormatter series1Format = new LineAndPointFormatter(
                Color.rgb(0, 200, 0),                   // line color
                Color.rgb(0, 100, 0),                   // point color
                null,                                   // fill color (none)
                new PointLabelFormatter(Color.WHITE));                           // text color

        // add a new series' to the xyplot:
        mySimpleXYPlot.addSeries(series1, series1Format);

        // same as above:
        mySimpleXYPlot.addSeries(series2,
                new LineAndPointFormatter(
                        Color.rgb(0, 0, 200),
                        Color.rgb(0, 0, 100),
                        null,
                        new PointLabelFormatter(Color.WHITE)));

        // reduce the number of range labels
        mySimpleXYPlot.setTicksPerRangeLabel(3);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_samp, menu);
        return true;
    }
}
