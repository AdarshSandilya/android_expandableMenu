package adarsh.android_expandable_menu;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Boolean Flag = true;
    LinearLayout layout;
    ViewGroup.LayoutParams params;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View moreMenu = findViewById(R.id.moreMenuItemImage);
        moreMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Flag)
                    animateMenu();
                else
                    hideAnimateView();
            }
        });
    }

    private void animateMenu() {
        layout = (LinearLayout) findViewById(R.id.main_layout);
        params = layout.getLayoutParams();
        params.height = ActionBar.LayoutParams.MATCH_PARENT;
        layout.setLayoutParams(params);
        Flag = false;
    }

    private void hideAnimateView() {
        params.height = ActionBar.LayoutParams.WRAP_CONTENT;
    }
}
