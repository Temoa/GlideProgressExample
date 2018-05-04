package me.temoa.glideprogressexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by lai
 * on 2018/5/3.
 */

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().post(new Runnable() {
            @Override
            public void run() {
                String url = "https://timgsa.baidu.com/timg?image&quality=100&size=b9999_10000&sec=1526001379&di=5a21dee385488b142c1ece9fc8a94b90&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01626057ff29a1a84a0d304f3b5991.jpg%401280w_1l_2o_100sh.jpg";
                GlideImageView imageView = findViewById(R.id.imageView);
                imageView.load(url);
            }
        });
    }
}
