package groundsy.ribbit;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.PushService;


public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "EzXuJAQkLrrh8gG4CMyv3Ryd0F54DosW2OqPJlQ6", "vL2i8NTaN0COK7CF04Kebph2a0kK9Q6joVCqmzPU");

        PushService.setDefaultPushCallback(this, MainActivity.class, R.drawable.ic_stat_ic_launcher);
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }

    public static void updateParseInstallation(ParseUser user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }
}
