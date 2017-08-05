package vamzi.googlefontslibrary;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class GoogleFontsLibrary {

    public static Typeface Slabo(Context context,FontStyle style){
        switch (style){
            case REGULAR:
                return getTypefaceFromRes(context,R.raw.slaboregular);
            default:
                return getTypefaceFromRes(context,R.raw.slaboregular);
        }
    }

    public static Typeface SedgwickAve(Context context,FontStyle style){
        switch (style){
            case REGULAR:
                return getTypefaceFromRes(context,R.raw.sedgwickaveregular);
            default:
                return getTypefaceFromRes(context,R.raw.sedgwickaveregular);
        }
    }

    public static Typeface SedgwickAveDisplay(Context context,FontStyle style){
        switch (style){
            case REGULAR:
                return getTypefaceFromRes(context,R.raw.sedgwickavedisplayregular);
            default:
                return getTypefaceFromRes(context,R.raw.sedgwickavedisplayregular);
        }
    }

    public static Typeface Saira(Context context,FontStyle style){
        switch (style){
            case REGULAR:
                return getTypefaceFromRes(context,R.raw.sairaregular);
            case MEDIUM:
                return getTypefaceFromRes(context,R.raw.sairamedium);
            case LIGHT:
                return getTypefaceFromRes(context,R.raw.sairalight);
            case BOLD:
                return getTypefaceFromRes(context,R.raw.sairabold);
            default:
                return getTypefaceFromRes(context,R.raw.sairaregular);
        }
    }

    public static Typeface RobotoCondenced(Context context,FontStyle style){
        switch (style){
            case REGULAR:
                return getTypefaceFromRes(context,R.raw.robotocondensedregular);
            case LIGHT:
                return getTypefaceFromRes(context,R.raw.robotocondensedlight);
            case BOLD:
                return getTypefaceFromRes(context,R.raw.robotocondensedbold);
            default:
                return getTypefaceFromRes(context,R.raw.robotocondensedregular);
        }
    }

    public static Typeface Poppins(Context context,FontStyle style){
        switch (style){
            case REGULAR:
                return getTypefaceFromRes(context,R.raw.poppinsregular);
            case BOLD:
                return getTypefaceFromRes(context,R.raw.poppinsbold);
            case LIGHT:
                return getTypefaceFromRes(context,R.raw.poppinslight);
            case MEDIUM:
                return getTypefaceFromRes(context,R.raw.poppinsmedium);
            default:
                return getTypefaceFromRes(context,R.raw.poppinsregular);
        }
    }

    public static Typeface Oswald(Context context,FontStyle style){
        switch (style){
            case LIGHT:
                return getTypefaceFromRes(context,R.raw.oswaldlight);
            case MEDIUM:
                return getTypefaceFromRes(context,R.raw.oswaldmedium);
            case BOLD:
                return getTypefaceFromRes(context,R.raw.oswaldbold);
            default:
                return getTypefaceFromRes(context,R.raw.oswaldregular);
        }
    }

    public static Typeface OpenSans(Context context,FontStyle style){
        switch (style){
            case REGULAR:
                return getTypefaceFromRes(context,R.raw.opensansregular);
            case LIGHT:
                return getTypefaceFromRes(context,R.raw.opensanslight);
            case BOLD:
                return getTypefaceFromRes(context,R.raw.opensansbold);
            default:
                return getTypefaceFromRes(context,R.raw.opensansregular);
        }
    }

    public static Typeface Montserrat(Context context,FontStyle style){
        switch (style){
            case REGULAR:
                return getTypefaceFromRes(context,R.raw.montserratregular);
            case BOLD:
                return getTypefaceFromRes(context,R.raw.montserratbold);
            case LIGHT:
                return getTypefaceFromRes(context,R.raw.montserratlight);
            case MEDIUM:
                return getTypefaceFromRes(context,R.raw.montserratmedium);
            case THIN:
                return getTypefaceFromRes(context,R.raw.montserratthin);
            default:
                return getTypefaceFromRes(context,R.raw.montserratregular);
        }
    }

    public static Typeface Lato(Context context,FontStyle style){
        switch (style){
            case REGULAR:
                return getTypefaceFromRes(context,R.raw.latoregular);
            case LIGHT:
                return getTypefaceFromRes(context,R.raw.latolight);
            case BOLD:
                return getTypefaceFromRes(context,R.raw.latobold);
            default:
                return getTypefaceFromRes(context,R.raw.latoregular);
        }
    }

    public static Typeface SairaCondensed(Context context,FontStyle style){
        switch(style){
            case BOLD:
                return getTypefaceFromRes(context,R.raw.sairacondensedbold);
            case LIGHT:
                return getTypefaceFromRes(context,R.raw.sairacondensedlight);
            case MEDIUM:
                return getTypefaceFromRes(context,R.raw.sairacondensedmedium);
            case REGULAR:
                return getTypefaceFromRes(context,R.raw.sairacondensedregular);
            case THIN:
                return getTypefaceFromRes(context,R.raw.sairacondensedthin);
            default:
                return getTypefaceFromRes(context,R.raw.sairacondensedregular);
        }
    }

    public static Typeface Roboto(Context context,FontStyle style){
        switch(style){
            case REGULAR:
                return getTypefaceFromRes(context,R.raw.robotoregular);
            case THIN:
                return getTypefaceFromRes(context,R.raw.robotothin);
            case LIGHT:
                return getTypefaceFromRes(context,R.raw.robotolight);
            case MEDIUM:
                return getTypefaceFromRes(context,R.raw.robotomedium);
            case BOLD:
                return getTypefaceFromRes(context,R.raw.robotobold);
            default:
                return getTypefaceFromRes(context,R.raw.robotoregular);
        }
    }

    public static Typeface NotoSans(Context context,FontStyle style){
        switch (style){
            case BOLD:
                return getTypefaceFromRes(context,R.raw.notosansbold);
            case REGULAR:
                return getTypefaceFromRes(context,R.raw.notosansregular);
            default:
                return getTypefaceFromRes(context,R.raw.notosansregular);
        }
    }

    public static Typeface ZillaSlabHighlight(Context context,FontStyle style){
        switch (style){
            case BOLD:
                return getTypefaceFromRes(context,R.raw.zillaslabhighlightbold);

            case REGULAR:
                return getTypefaceFromRes(context,R.raw.zillaslabhighlightregular);

            default:
                return getTypefaceFromRes(context,R.raw.zillaslabhighlightregular);

        }
    }

    public static Typeface getTypefaceFromRes(Context context, int resource)
    {
        Typeface typeFace = null;
        InputStream is = null;
        try {
            is = context.getResources().openRawResource(resource);
        }
        catch(Resources.NotFoundException e) {
            Log.e("Typeface", "Could not find font in resources!");
        }

        String outPath = context.getCacheDir() + "/tmp" + System.currentTimeMillis() + ".raw";

        try
        {
            byte[] buffer = new byte[is.available()];
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outPath));

            int l = 0;
            while((l = is.read(buffer)) > 0)
                bos.write(buffer, 0, l);

            bos.close();

            typeFace = Typeface.createFromFile(outPath);

            // clean up
            new File(outPath).delete();
        }
        catch (IOException e)
        {
            Log.e("Typeface", "Error reading in font!");
            return null;
        }

        Log.d("Typeface", "Successfully loaded font.");

        return typeFace;
    }
}