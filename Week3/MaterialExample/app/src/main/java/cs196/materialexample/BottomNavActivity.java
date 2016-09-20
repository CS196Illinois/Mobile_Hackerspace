package cs196.materialexample;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

/**
 * Created by tommypacker for HackIllinois' 2016 Clue Hunt
 */

public class BottomNavActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_nav_layout);

        BottomBar bBar = (BottomBar) findViewById(R.id.bottomBar);
        bBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if(tabId == R.id.tab_favorites){
                    Snackbar.make(findViewById(android.R.id.content), "Favorites", Snackbar.LENGTH_SHORT)
                            .setAction("Action", null).show();
                }
                if(tabId == R.id.tab_friends){
                    Snackbar.make(findViewById(android.R.id.content), "Friends", Snackbar.LENGTH_SHORT)
                            .setAction("Action", null).show();
                }
                if(tabId == R.id.tab_nearby){
                    Snackbar.make(findViewById(android.R.id.content), "Nearby", Snackbar.LENGTH_SHORT)
                            .setAction("Action", null).show();
                }
            }
        });
    }
}
