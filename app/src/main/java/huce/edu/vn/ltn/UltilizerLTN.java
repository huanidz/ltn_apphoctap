package huce.edu.vn.ltn;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

public class Ultilizer {

    public static void setFullScreen(Activity a){
        a.requestWindowFeature(Window.FEATURE_NO_TITLE);
        a.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public static int checkEmptyEditText(EditText... args){
        for (int i = 0; i < args.length ; i++){
            if(args[i].getText().toString().isEmpty()){
                return 1;
            }
        }
        return -1; //No Empty
    }
}
