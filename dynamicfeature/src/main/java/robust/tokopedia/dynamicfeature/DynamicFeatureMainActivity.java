package robust.tokopedia.dynamicfeature;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.meituan.robust.patch.annotaion.Modify;

/**
 * Author errysuprayogi on 21,March,2020
 */
public class DynamicFeatureMainActivity extends Activity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        setContext();
    }

    private void setContext(){
        context = getApplicationContext();
    }

    public Context getContext() {
        return context;
    }
}
