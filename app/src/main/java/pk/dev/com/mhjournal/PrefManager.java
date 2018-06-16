package pk.dev.com.mhjournal;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {
    // Shared preferences file name
    private static final String PREF_NAME = "journalsharedprefs";
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";
    private SharedPreferences pref;


    public PrefManager(Context context) {
        // shared pref mode
        int PRIVATE_MODE = 0;
        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        SharedPreferences.Editor editor;
        editor = pref.edit();
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.apply();
    }
}