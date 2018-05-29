package com.example.madhav.calculatenow;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;



import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class first extends Fragment implements AdapterView.OnItemSelectedListener {


    int g=0;
    int cg=0;
    double sgpa=0;
    String content;

    Spinner c_spinner1,c_spinner2,c_spinner3,c_spinner4,c_spinner5,c_spinner6,c_spinner7;
    Spinner g_spinner1,g_spinner2,g_spinner3,g_spinner4,g_spinner5,g_spinner6,g_spinner7;
    TextView sub_point_1,sub_point_2,sub_point_3,sub_point_4,sub_point_5,sub_point_6,sub_point_7,sub_point_total,credit_total;
    EditText sgpa_text;

    Button reset;

    public first() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);

    }
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
        c_spinner1 = getView().findViewById(R.id.c_spinner1);
        c_spinner2 = getView().findViewById(R.id.c_spinner2);
        c_spinner3 = getView().findViewById(R.id.c_spinner3);
        c_spinner4 = getView().findViewById(R.id.c_spinner4);
        c_spinner5 = getView().findViewById(R.id.c_spinner5);
        c_spinner6 = getView().findViewById(R.id.c_spinner6);
        c_spinner7 = getView().findViewById(R.id.c_spinner7);

        sgpa_text = getView().findViewById(R.id.sgpa_text);


        reset = getView().findViewById(R.id.reset);

        c_spinner1.setSelection(5);
        c_spinner2.setSelection(5);
        c_spinner3.setSelection(5);
        c_spinner4.setSelection(5);
        c_spinner5.setSelection(5);
        c_spinner6.setSelection(5);
        c_spinner7.setSelection(5);


        g_spinner1 = getView().findViewById(R.id.g_spinner1);
        g_spinner2 = getView().findViewById(R.id.g_spinner2);
        g_spinner3 = getView().findViewById(R.id.g_spinner3);
        g_spinner4 = getView().findViewById(R.id.g_spinner4);
        g_spinner5 = getView().findViewById(R.id.g_spinner5);
        g_spinner6 = getView().findViewById(R.id.g_spinner6);
        g_spinner7 = getView().findViewById(R.id.g_spinner7);


        g_spinner1.setSelection(5);
        g_spinner2.setSelection(5);
        g_spinner3.setSelection(5);
        g_spinner4.setSelection(5);
        g_spinner5.setSelection(5);
        g_spinner6.setSelection(5);
        g_spinner7.setSelection(5);


        sub_point_1 = getView().findViewById(R.id.sub_point_1);
        sub_point_2 = getView().findViewById(R.id.sub_point_2);
        sub_point_3 = getView().findViewById(R.id.sub_point_3);
        sub_point_4 = getView().findViewById(R.id.sub_point_4);
        sub_point_5 = getView().findViewById(R.id.sub_point_5);
        sub_point_6 = getView().findViewById(R.id.sub_point_6);
        //added for 7subs
        sub_point_7 = getView().findViewById(R.id.sub_point_7);

        sub_point_total = getView().findViewById(R.id.sub_point_total);
        credit_total = getView().findViewById(R.id.credit_total);

        g_spinner1.setOnItemSelectedListener(this);
        g_spinner2.setOnItemSelectedListener(this);
        g_spinner3.setOnItemSelectedListener(this);
        g_spinner4.setOnItemSelectedListener(this);
        g_spinner5.setOnItemSelectedListener(this);
        g_spinner6.setOnItemSelectedListener(this);
        g_spinner7.setOnItemSelectedListener(this);


        c_spinner1.setOnItemSelectedListener(this);
        c_spinner2.setOnItemSelectedListener(this);
        c_spinner3.setOnItemSelectedListener(this);
        c_spinner4.setOnItemSelectedListener(this);
        c_spinner5.setOnItemSelectedListener(this);
        c_spinner6.setOnItemSelectedListener(this);
        c_spinner7.setOnItemSelectedListener(this);


        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.grade_class, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(getContext(),
                R.array.credit_class, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        g_spinner1.setAdapter(adapter);
        g_spinner2.setAdapter(adapter);
        g_spinner3.setAdapter(adapter);
        g_spinner4.setAdapter(adapter);
        g_spinner5.setAdapter(adapter);
        g_spinner6.setAdapter(adapter);
        g_spinner7.setAdapter(adapter);

        g_spinner1.setEnabled(false);

        Button mButton = (Button) getView().findViewById(R.id.reset);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // here you set what you want to do when user clicks your button,
                Toast.makeText(getContext(), "Cleared", Toast.LENGTH_SHORT).show();
                g=0;
                cg=0;

                c_spinner1.setSelection( 5 );
                c_spinner2.setSelection( 5 );
                c_spinner3.setSelection( 5 );
                c_spinner4.setSelection( 5 );
                c_spinner5.setSelection( 5 );
                c_spinner6.setSelection( 5 );

                c_spinner7.setSelection( 5 );

                g_spinner1.setSelection( 5 );
                g_spinner2.setSelection( 5 );
                g_spinner3.setSelection( 5 );
                g_spinner4.setSelection( 5 );
                g_spinner5.setSelection( 5 );
                g_spinner6.setSelection( 5 );

                g_spinner7.setSelection( 5 );

                sub_point_1.setText("0");
                sub_point_2.setText("0");
                sub_point_3.setText("0");
                sub_point_4.setText("0");
                sub_point_5.setText("0");
                sub_point_6.setText("0");

                sub_point_7.setText("0");

                credit_total.setText("0");
                sub_point_total.setText( "0" );
                sgpa_text.setText( "Your SGPA" );

                c_spinner1.setEnabled(true);
                g_spinner1.setEnabled(true);

                c_spinner2.setEnabled(true);
                g_spinner2.setEnabled(true);

                c_spinner3.setEnabled(true);
                g_spinner3.setEnabled(true);

                c_spinner4.setEnabled(true);
                g_spinner4.setEnabled(true);

                c_spinner5.setEnabled(true);
                g_spinner5.setEnabled(true);

                c_spinner6.setEnabled(true);
                g_spinner6.setEnabled(true);

                c_spinner7.setEnabled(true);
                g_spinner7.setEnabled(true);
            }
        });
    }
    public void CheckNAN(double s)
    {
        if(Double.isNaN( s ))
        {
            sgpa_text.setText( String.valueOf("Your SGPA"));
        }
        else
        {
            sgpa_text.setText( String.valueOf("SGPA : "+s));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //   getMenuInflater().inflate(R.mai, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
      /*  if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onItemSelected
            (AdapterView<?> parent, View view, int position, long id) {

        switch(parent.getId())
        {

            case R.id.c_spinner1:
                g_spinner1.setSelection(5);

                sub_point_1.setText("0");
                g_spinner1.setEnabled( true );




                break;
            case R.id.c_spinner2:
                g_spinner2.setSelection(5);

                sub_point_2.setText("0");




                break;
            case R.id.c_spinner3:
                g_spinner3.setSelection(5);

                sub_point_3.setText("0");



                break;
            case R.id.c_spinner4:
                g_spinner4.setSelection(5);
                sub_point_4.setText("0");




                break;
            case R.id.c_spinner5:
                g_spinner5.setSelection(5);

                sub_point_5.setText("0");


                break;
            case R.id.c_spinner6:
                g_spinner6.setSelection(5);

                sub_point_6.setText("0");

            case R.id.c_spinner7:
                g_spinner7.setSelection(5);

                sub_point_7.setText("0");

                break;




        }

        int cre_1 = 0;
        int cre_2 = 0;
        int cre_3 = 0;
        int cre_4 = 0;
        int cre_5 = 0;
        int cre_6 = 0;
        int cre_7 = 0;



        switch (parent.getId()) {


            case R.id.g_spinner1 :
                switch(g_spinner1.getSelectedItemPosition())
                {
                    case 0 :
                        try {
                            cre_1 = Integer.parseInt( String.valueOf( c_spinner1.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_1.setText( String.valueOf( cre_1 * 10 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#00C853" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        c_spinner1.setEnabled( false );
                        g_spinner1.setEnabled( false );

                        break;

                    case 1 :
                        try {
                            cre_1 = Integer.parseInt( String.valueOf( c_spinner1.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }

                        sub_point_1.setText( String.valueOf( cre_1 * 9 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#00B0FF" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        c_spinner1.setEnabled( false );
                        g_spinner1.setEnabled( false );
                        break;
                    case 2 :
                        try {
                            cre_1 = Integer.parseInt( String.valueOf( c_spinner1.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_1.setText( String.valueOf( cre_1 * 8 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#9C27B0" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        c_spinner1.setEnabled( false );
                        g_spinner1.setEnabled( false );
                        break;

                    case 3 :
                        try {
                            cre_1 = Integer.parseInt( String.valueOf( c_spinner1.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_1.setText( String.valueOf( cre_1 * 7 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#E91E63" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        c_spinner1.setEnabled( false );
                        g_spinner1.setEnabled( false );
                        break;

                    case 4 :
                        try {
                            cre_1 = Integer.parseInt( String.valueOf( c_spinner1.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_1.setText( String.valueOf( cre_1 * 5 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#F44336" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        c_spinner1.setEnabled( false );
                        g_spinner1.setEnabled( false );
                        break;






                }

                content = sub_point_1.getText().toString();

                g += Integer.parseInt( String.valueOf( content ));
                cg +=cre_1;
                sub_point_total.setText( String.valueOf(g) );
                credit_total.setText( String.valueOf(cg)  );
                sgpa = (double) g/cg;
                CheckNAN(sgpa);
                break;




            case R.id.g_spinner2 :
                switch(g_spinner2.getSelectedItemPosition())
                {
                    case 0 :
                        try {
                            cre_2 = Integer.parseInt( String.valueOf( c_spinner2.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_2.setText( String.valueOf( cre_2 * 10 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#00C853" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner2.setEnabled(false);
                        c_spinner2.setEnabled(false);
                        break;

                    case 1 :
                        try {
                            cre_2 = Integer.parseInt( String.valueOf( c_spinner2.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_2.setText( String.valueOf( cre_2 * 9 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#00B0FF" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner2.setEnabled(false);
                        c_spinner2.setEnabled(false);
                        break;
                    case 2 :
                        try {
                            cre_2 = Integer.parseInt( String.valueOf( c_spinner2.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_2.setText( String.valueOf( cre_2 * 8 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#9C27B0" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner2.setEnabled(false);
                        c_spinner2.setEnabled(false);
                        break;

                    case 3 :
                        try {
                            cre_2 = Integer.parseInt( String.valueOf( c_spinner2.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_2.setText( String.valueOf( cre_2 * 7 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#E91E63" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner2.setEnabled(false);
                        c_spinner2.setEnabled(false);
                        break;

                    case 4 :
                        try {
                            cre_2 = Integer.parseInt( String.valueOf( c_spinner2.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_2.setText( String.valueOf( cre_2 * 5 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#F44336" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner2.setEnabled(false);
                        c_spinner2.setEnabled(false);
                        break;

                }
                content = sub_point_2.getText().toString();
                g +=  Integer.parseInt( String.valueOf( content ));
                cg+=cre_2;
                sub_point_total.setText( String.valueOf(g) );
                credit_total.setText( String.valueOf(cg)  );
                sgpa = (double) g/cg;
                CheckNAN(sgpa);
                break;

            case R.id.g_spinner3 :
                switch(g_spinner3.getSelectedItemPosition())
                {
                    case 0 :
                        try {
                            cre_3 = Integer.parseInt( String.valueOf( c_spinner3.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_3.setText( String.valueOf( cre_3 * 10 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#00C853" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner3.setEnabled(false);
                        c_spinner3.setEnabled(false);
                        break;

                    case 1 :
                        try {
                            cre_3 = Integer.parseInt( String.valueOf( c_spinner3.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_3.setText( String.valueOf( cre_3 * 9 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#00B0FF" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner3.setEnabled(false);
                        c_spinner3.setEnabled(false);
                        break;
                    case 2 :
                        try {
                            cre_3 = Integer.parseInt( String.valueOf( c_spinner3.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_3.setText( String.valueOf( cre_3 * 8 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#9C27B0" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner3.setEnabled(false);
                        c_spinner3.setEnabled(false);
                        break;

                    case 3 :
                        try {
                            cre_3 = Integer.parseInt( String.valueOf( c_spinner3.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_3.setText( String.valueOf( cre_3 * 7 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#E91E63" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner3.setEnabled(false);
                        c_spinner3.setEnabled(false);
                        break;

                    case 4 :
                        try {
                            cre_3 = Integer.parseInt( String.valueOf( c_spinner3.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_3.setText( String.valueOf( cre_3 * 5 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#F44336" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner3.setEnabled(false);
                        c_spinner3.setEnabled(false);
                        break;

                }
                content = sub_point_3.getText().toString();
                g +=  Integer.parseInt( String.valueOf( content ));
                cg+=cre_3;
                sub_point_total.setText( String.valueOf(g) );
                credit_total.setText( String.valueOf(cg)  );
                sgpa = (double) g/cg;
                CheckNAN(sgpa);
                break;
            case R.id.g_spinner4 :
                switch(g_spinner4.getSelectedItemPosition())
                {
                    case 0 :
                        try {
                            cre_4 = Integer.parseInt( String.valueOf( c_spinner4.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_4.setText( String.valueOf( cre_4 * 10 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#00C853" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner4.setEnabled(false);
                        c_spinner4.setEnabled(false);
                        break;

                    case 1 :
                        try {
                            cre_4 = Integer.parseInt( String.valueOf( c_spinner4.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_4.setText( String.valueOf( cre_4 * 9 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#00B0FF" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner4.setEnabled(false);
                        c_spinner4.setEnabled(false);
                        break;
                    case 2 :
                        try {
                            cre_4 = Integer.parseInt( String.valueOf( c_spinner4.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_4.setText( String.valueOf( cre_4 * 8 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#9C27B0" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner4.setEnabled(false);
                        c_spinner4.setEnabled(false);
                        break;

                    case 3 :
                        try {
                            cre_4 = Integer.parseInt( String.valueOf( c_spinner4.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_4.setText( String.valueOf( cre_4 * 7 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#E91E63" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner4.setEnabled(false);
                        c_spinner4.setEnabled(false);
                        break;

                    case 4 :
                        try {
                            cre_4 = Integer.parseInt( String.valueOf( c_spinner4.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_4.setText( String.valueOf( cre_4 * 5 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#F44336" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner4.setEnabled(false);
                        c_spinner4.setEnabled(false);
                        break;

                }



                content = sub_point_4.getText().toString();
                g +=  Integer.parseInt( String.valueOf( content ));
                cg+=cre_4;
                sub_point_total.setText( String.valueOf(g) );
                credit_total.setText( String.valueOf(cg)  );
                sgpa = (double) g/cg;
                CheckNAN(sgpa);
                break;

            case R.id.g_spinner5 :
                switch(g_spinner5.getSelectedItemPosition())
                {
                    case 0 :
                        try {
                            cre_5 = Integer.parseInt( String.valueOf( c_spinner5.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_5.setText( String.valueOf( cre_5 * 10 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#00C853" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner5.setEnabled(false);
                        c_spinner5.setEnabled(false);
                        break;

                    case 1 :
                        try {
                            cre_5 = Integer.parseInt( String.valueOf( c_spinner5.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_5.setText( String.valueOf( cre_5 * 9 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#00B0FF" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner5.setEnabled(false);
                        c_spinner5.setEnabled(false);
                        break;
                    case 2 :
                        try {
                            cre_5 = Integer.parseInt( String.valueOf( c_spinner5.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_5.setText( String.valueOf( cre_5 * 8 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#9C27B0" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner5.setEnabled(false);
                        c_spinner5.setEnabled(false);
                        break;

                    case 3 :
                        try {
                            cre_5 = Integer.parseInt( String.valueOf( c_spinner5.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_5.setText( String.valueOf( cre_5 * 7 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#E91E63" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner5.setEnabled(false);
                        c_spinner5.setEnabled(false);
                        break;

                    case 4 :
                        try {
                            cre_5 = Integer.parseInt( String.valueOf( c_spinner5.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_5.setText( String.valueOf( cre_5 * 5 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#F44336" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner5.setEnabled(false);
                        c_spinner5.setEnabled(false);
                        break;

                }



                content = sub_point_5.getText().toString();
                g +=  Integer.parseInt( String.valueOf( content ));
                cg+=cre_5;
                sub_point_total.setText( String.valueOf(g) );
                credit_total.setText( String.valueOf(cg)  );
                sgpa = (double) g/cg;
                CheckNAN(sgpa);
                break;

            case R.id.g_spinner6 :
                switch(g_spinner6.getSelectedItemPosition())
                {
                    case 0 :
                        try {
                            cre_6 = Integer.parseInt( String.valueOf( c_spinner6.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_6.setText( String.valueOf( cre_6 * 10 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#00C853" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner6.setEnabled(false);
                        c_spinner6.setEnabled(false);
                        break;

                    case 1 :
                        try {
                            cre_6 = Integer.parseInt( String.valueOf( c_spinner6.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_6.setText( String.valueOf( cre_6 * 9 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#00B0FF" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner6.setEnabled(false);
                        c_spinner6.setEnabled(false);
                        break;
                    case 2 :
                        try {
                            cre_6 = Integer.parseInt( String.valueOf( c_spinner6.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_6.setText( String.valueOf( cre_6 * 8 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#9C27B0" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner6.setEnabled(false);
                        c_spinner6.setEnabled(false);
                        break;

                    case 3 :
                        try {
                            cre_6 = Integer.parseInt( String.valueOf( c_spinner6.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_6.setText( String.valueOf( cre_6 * 7 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#E91E63" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner6.setEnabled(false);
                        c_spinner6.setEnabled(false);
                        break;

                    case 4 :
                        try {
                            cre_6 = Integer.parseInt( String.valueOf( c_spinner6.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_6.setText( String.valueOf( cre_6 * 5 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#F44336" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner6.setEnabled(false);
                        c_spinner6.setEnabled(false);
                        break;

                }
                content = sub_point_6.getText().toString();
                g +=  Integer.parseInt( String.valueOf( content ));
                cg+=cre_6;
                sub_point_total.setText( String.valueOf(g) );
                credit_total.setText( String.valueOf(cg)  );
                //sgpa_text.setVisibility( View.VISIBLE );

                sgpa = (double) g/cg;
                CheckNAN(sgpa);
                break;

            case R.id.g_spinner7 :
                switch(g_spinner7.getSelectedItemPosition())
                {
                    case 0 :
                        try {
                            cre_7 = Integer.parseInt( String.valueOf( c_spinner7.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_7.setText( String.valueOf( cre_7 * 10 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#00C853" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner7.setEnabled(false);
                        c_spinner7.setEnabled(false);
                        break;

                    case 1 :
                        try {
                            cre_7 = Integer.parseInt( String.valueOf( c_spinner7.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_7.setText( String.valueOf( cre_7 * 9 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#00B0FF" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner7.setEnabled(false);
                        c_spinner7.setEnabled(false);
                        break;
                    case 2 :
                        try {
                            cre_7 = Integer.parseInt( String.valueOf( c_spinner7.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_7.setText( String.valueOf( cre_7 * 8 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#9C27B0" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner7.setEnabled(false);
                        c_spinner7.setEnabled(false);
                        break;

                    case 3 :
                        try {
                            cre_7 = Integer.parseInt( String.valueOf( c_spinner7.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_7.setText( String.valueOf( cre_7 * 7 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#E91E63" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner7.setEnabled(false);
                        c_spinner7.setEnabled(false);
                        break;

                    case 4 :
                        try {
                            cre_7 = Integer.parseInt( String.valueOf( c_spinner7.getSelectedItem().toString() ) );
                        } catch (NumberFormatException nfe) {
                            System.out.println( "Could not parse " );
                        }
                        sub_point_7.setText( String.valueOf( cre_7 * 5 ) );
                        ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor( "#F44336" ) );
                        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);
                        g_spinner7.setEnabled(false);
                        c_spinner7.setEnabled(false);
                        break;

                }
                content = sub_point_7.getText().toString();
                g +=  Integer.parseInt( String.valueOf( content ));
                cg+=cre_7;
                sub_point_total.setText( String.valueOf(g) );
                credit_total.setText( String.valueOf(cg)  );
                //sgpa_text.setVisibility( View.VISIBLE );

                sgpa = (double) g/cg;
                CheckNAN(sgpa);
                break;
        }

    }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }


}
