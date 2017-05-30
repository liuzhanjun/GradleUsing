package jun.zhan.liu.test;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView tv,package_name,version_name,yuanji_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.tv);
        package_name= (TextView) findViewById(R.id.package_name);
        version_name= (TextView) findViewById(R.id.version_name);
        tv.setText(BuildConfig.MY_SERVER_URL);
        PackageManager manager=getPackageManager();
        try {
            PackageInfo pinfo = manager.getPackageInfo(getPackageName(), 0);
            package_name.setText("包名="+pinfo.packageName);
            version_name.setText("版本名="+pinfo.versionName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        yuanji_name= (TextView) findViewById(R.id.yuanji_name);
        Bese bese=new Bese();
        yuanji_name.setText("源集==="+bese.name);
        yuanji_name.setText(R.string.name);

    }
}
