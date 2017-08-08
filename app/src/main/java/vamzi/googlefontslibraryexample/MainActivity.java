package vamzi.googlefontslibraryexample;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import vamzi.googlefontslibrary.FontStyle;
import vamzi.googlefontslibrary.GoogleFontsLibrary;

import static android.graphics.Typeface.BOLD;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = (TextView) findViewById(R.id.texthead);
        Typeface font =  GoogleFontsLibrary.Roboto(this,FontStyle.BOLD);
        Typeface font2 = GoogleFontsLibrary.NotoSans(this,FontStyle.REGULAR);
        SpannableStringBuilder SS = new SpannableStringBuilder("Google Fonts");
        SS.setSpan (new CustomTypefaceSpan("", font), 0, 6, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        SS.setSpan (new CustomTypefaceSpan("", font2), 7, 11,Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        txt.setText(SS);
        TextView tv1 = (TextView)findViewById(R.id.textView1);
        TextView tv2 = (TextView)findViewById(R.id.textView2);
        TextView tv3 = (TextView)findViewById(R.id.textView3);
        TextView tv4 = (TextView)findViewById(R.id.textView4);
        TextView tv5 = (TextView)findViewById(R.id.textView5);
        TextView tv6 = (TextView)findViewById(R.id.textView6);
        TextView tv7 = (TextView)findViewById(R.id.textView7);
        TextView tv8 = (TextView)findViewById(R.id.textView8);
        TextView tv9 = (TextView)findViewById(R.id.textView9);
        TextView tv10 = (TextView)findViewById(R.id.textView10);
        TextView tv11 = (TextView)findViewById(R.id.textView11);
        TextView tv12 = (TextView)findViewById(R.id.textView12);
        TextView tv13 = (TextView)findViewById(R.id.textView13);
        TextView tv14 = (TextView)findViewById(R.id.textView14);
        TextView tv15 = (TextView)findViewById(R.id.textView15);
        TextView tv16 = (TextView)findViewById(R.id.textView16);
        TextView tv17 = (TextView)findViewById(R.id.textView17);
        TextView tv18 = (TextView)findViewById(R.id.textView18);
        TextView tv19 = (TextView)findViewById(R.id.textView19);
        TextView tv20 = (TextView)findViewById(R.id.textView20);
        TextView tv21 = (TextView)findViewById(R.id.textView21);
        tv1.setTypeface(GoogleFontsLibrary.Lato(this,FontStyle.REGULAR));
        tv2.setTypeface(GoogleFontsLibrary.Poppins(this,FontStyle.REGULAR));
        tv3.setTypeface(GoogleFontsLibrary.Montserrat(this,FontStyle.REGULAR));
        tv4.setTypeface(GoogleFontsLibrary.Roboto(this,FontStyle.REGULAR));
        tv5.setTypeface(GoogleFontsLibrary.Saira(this,FontStyle.REGULAR));
        tv6.setTypeface(GoogleFontsLibrary.NotoSans(this,FontStyle.REGULAR));
        tv7.setTypeface(GoogleFontsLibrary.Oswald(this,FontStyle.REGULAR));
        tv8.setTypeface(GoogleFontsLibrary.SedgwickAve(this,FontStyle.REGULAR));
        tv9.setTypeface(GoogleFontsLibrary.SairaCondensed(this,FontStyle.REGULAR));
        tv10.setTypeface(GoogleFontsLibrary.Slabo(this,FontStyle.REGULAR));
        tv11.setTypeface(GoogleFontsLibrary.AbrilFatface(this,FontStyle.REGULAR));
        tv12.setTypeface(GoogleFontsLibrary.Bellefair(this,FontStyle.REGULAR));
        tv13.setTypeface(GoogleFontsLibrary.Anton(this,FontStyle.REGULAR));
        tv14.setTypeface(GoogleFontsLibrary.Bitter(this,FontStyle.REGULAR));
        tv15.setTypeface(GoogleFontsLibrary.Courgette(this,FontStyle.REGULAR));
        tv16.setTypeface(GoogleFontsLibrary.JosefinSans(this,FontStyle.REGULAR));
        tv17.setTypeface(GoogleFontsLibrary.PermanentMarker(this,FontStyle.REGULAR));
        tv18.setTypeface(GoogleFontsLibrary.Oxygen(this,FontStyle.REGULAR));
        tv19.setTypeface(GoogleFontsLibrary.Lobster(this,FontStyle.REGULAR));
        tv20.setTypeface(GoogleFontsLibrary.ZillaSlabHighlight(this,FontStyle.REGULAR));
        tv21.setTypeface(GoogleFontsLibrary.RobotoCondensed(this,FontStyle.REGULAR));




    }




}
