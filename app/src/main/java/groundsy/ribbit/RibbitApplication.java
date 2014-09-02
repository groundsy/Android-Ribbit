package groundsy.ribbit;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;


public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "EzXuJAQkLrrh8gG4CMyv3Ryd0F54DosW2OqPJlQ6", "vL2i8NTaN0COK7CF04Kebph2a0kK9Q6joVCqmzPU");
       /* ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground(); */
    }
}
