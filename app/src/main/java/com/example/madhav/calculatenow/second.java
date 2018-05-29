package com.example.madhav.calculatenow;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class second extends Fragment {


    public second() {
        // Required empty public constructor
    }
    EditText esem1,esem2,esem3,esem4;
    TextView eper1,eper2,eper3,eper4,pertotal,esemt;
    double eval1,eval2,eval3,eval4,eval5;
    double s=0.0;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {

        esem1 = getView().findViewById(R.id.e_sem1);
        esem2 = getView().findViewById(R.id.e_sem2);
        esem3 = getView().findViewById(R.id.e_sem3);
        esem4 = getView().findViewById(R.id.e_sem4);
        esemt = getView().findViewById(R.id.e_sem_total);

        esem1.setText("0.0");
        esem2.setText("0.0");
        esem3.setText("0.0");
        esem4.setText("0.0");
        esemt.setText("0.0");

        eper1 = getView().findViewById(R.id.e_per1);
        eper2 = getView().findViewById(R.id.e_per2);
        eper3 = getView().findViewById(R.id.e_per3);
        eper4 = getView().findViewById(R.id.e_per4);
        pertotal = getView().findViewById(R.id.per_total);

        Button calc = (Button) getView().findViewById(R.id.calc);
        calc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                doCal();
            }
        }
        );

        Button res = (Button) getView().findViewById(R.id.res);
        res.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                esem1.requestFocus();
                int c =0;
                esem1.setText("0.0");
                esem2.setText("0.0");
                esem3.setText("0.0");
                esem4.setText("0.0");
                esemt.setText("0.0");

                eper1.setText("0.0");
                eper2.setText("0.0");
                eper3.setText("0.0");
                eper4.setText("0.0");
                pertotal.setText("0.0");
                s=0.0;
                eval1=0.0;
                eval2=0.0;
                eval3=0.0;
                eval4=0.0;
                eval5=0.0;
                Toast.makeText(getContext(), "Cleared", Toast.LENGTH_SHORT).show();


            }
        }
        );
    }
    public void doCal()
    {

        String e1text =esem1.getText().toString();
        String e2text =esem2.getText().toString();
        String e3text =esem3.getText().toString();
        String e4text =esem4.getText().toString();
        String etotal =esemt.getText().toString();
        int c =0;


        if(e1text.isEmpty() || e1text.equals("0")|| e1text.equals(".") || Double.parseDouble(esem1.getText().toString()) > 10.0)
            esem1.setText("0.0");
        if(e2text.isEmpty() ||  e2text.equals("0")|| e2text.equals(".")|| Double.parseDouble(esem2.getText().toString()) > 10.0)
            esem2.setText("0.0");
        if(e3text.isEmpty() ||  e3text.equals("0")|| e3text.equals(".")|| Double.parseDouble(esem3.getText().toString()) > 10.0)
            esem3.setText("0.0");
        if(e4text.isEmpty() ||  e4text.equals("0")|| e4text.equals(".")|| Double.parseDouble(esem4.getText().toString()) > 10.0)
            esem4.setText("0.0");
        if(etotal.isEmpty() ||  etotal.equals("0")|| etotal.equals(".")|| Double.parseDouble(esemt.getText().toString()) > 10.0)
            esemt.setText("0.0");
               /* if(e2text.isEmpty())
                    String e2text =esem2.getText().toString();
                if(e3text.isEmpty())
                    String e3text =esem3.getText().toString();*/
        String e1text1 =esem1.getText().toString();
        String e2text2 =esem2.getText().toString();
        String e3text3 =esem3.getText().toString();
        String e4text4 =esem4.getText().toString();
        if (!e1text1.equals("0.0") )
            c+=1;
        if (!e2text2.equals("0.0"))
            c+=1;
        if (!e3text3.equals("0.0"))
            c+=1;
        if (!e4text4.equals("0.0"))
            c+=1;
        //Toast.makeText(getContext(), Integer.toString(c), Toast.LENGTH_LONG).show();
        //c has value of 0.0 fields
        // esemt.setText(Integer.toString(c));

        int[] ids = new int[]{R.id.e_sem1,R.id.e_sem2,R.id.e_sem3,R.id.e_sem4};//and so on
        s=0.0;
        int i =1;
        for(int id : ids){
            EditText t = (EditText) getView().findViewById(id);
            String Ref = "text" + i;
            //editor.putString(Ref, t.getText().toString());
            s = s + Double.parseDouble(t.getText().toString());
            // Toast.makeText(getContext(),s , Toast.LENGTH_LONG).show();
            i++;
        }


        String e1text001 =esem1.getText().toString();


        if(!e1text001.isEmpty())
            eval1= Double.parseDouble(e1text001);

        String stringdouble1= Double.toString((eval1 * 9.5));


        if (Double.parseDouble(stringdouble1) >  100)
            eper1.setText( "0.0" );
        else {
            eper1.setText(stringdouble1);


        }

        String e2text002 =esem2.getText().toString();
        if(!e2text002.isEmpty())
            eval2= Double.parseDouble(e2text002);

        String stringdouble2= Double.toString(eval2 * 9.5);

        if (Double.parseDouble(stringdouble2) >  100)
            eper2.setText( "0.0" );
        else

            eper2.setText( stringdouble2 );

        String e3text003 =esem3.getText().toString();
        if(!e3text003.isEmpty())
            eval3= Double.parseDouble(e3text003);

        String stringdouble3= Double.toString(eval3 * 9.5);
        if (Double.parseDouble(stringdouble3) >  100)
            eper3.setText( "0.0" );
        else
            eper3.setText( stringdouble3 );

        String e4text004 =esem4.getText().toString();
        if(!e4text004.isEmpty())
            eval4= Double.parseDouble(e4text004);

        String stringdouble4= Double.toString(eval4 * 9.5);
        if (Double.parseDouble(stringdouble4) >  100)
            eper4.setText( "0.0" );
        else {
            eper4.setText(stringdouble4);
        }




        /*String e5text005 =esemt.getText().toString();
        if(!e5text005.isEmpty())
            eval5= Double.parseDouble(e5text005);

        String stringdouble5= Double.toString(eval5 * 9.5);
        if (Double.parseDouble(stringdouble5) >  100)
            pertotal.setText( "0.0" );
        else
            pertotal.setText( stringdouble5 );*/




        double res = s/c;
        CheckNAN(res);
        //pertotal.setText( stringdouble5 );
      //  esemt.setText(Double.toString(s/c));
    }
    public void CheckNAN(double s)
    {
        if(Double.isNaN( s ))
        {
           esemt.setText( String.valueOf("0.0"));
            pertotal.setText(String.valueOf("0.0"));
        }
        else
        {
            esemt.setText( String.valueOf(s));
            pertotal.setText( String.valueOf(Double.toString(s * 9.5)) );

        }
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getView().getWindowToken(), 0);
    }






}

