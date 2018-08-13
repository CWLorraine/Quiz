package sg.edu.rp.c346.quiz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * Created by 16039013 on 13/8/2018.
 */

public class WallpaperChange extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        SharedPreferences preferences  = PreferenceManager.getDefaultSharedPreferences(context);
        int msg = preferences.getInt("choose", R.id.radioG);

        if (msg == R.id.rb1){
            Toast my_toast = Toast.makeText(context, R.string.good, Toast.LENGTH_SHORT);
            my_toast.show();

        }

        else{
            Toast my_toast = Toast.makeText(context, R.string.bro, Toast.LENGTH_SHORT);
            my_toast.show();
        }

    }
}
