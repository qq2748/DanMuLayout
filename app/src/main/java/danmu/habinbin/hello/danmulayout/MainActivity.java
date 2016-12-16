package danmu.habinbin.hello.danmulayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import danmu.habinbin.hello.library.DanMuLayout;

public class MainActivity extends AppCompatActivity {

    public static final String text2 = "哈哈,这是一个like弹幕,但其实就是view弹幕";
    @InjectView(R.id.dml)
    DanMuLayout dml;
    @InjectView(R.id.tv_start)
    TextView tvStart;
    @InjectView(R.id.tv_stop)
    TextView tvStop;
    @InjectView(R.id.activity_main)
    RelativeLayout activityMain;

    List<DanMu> danMuList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        String text = "啊啊,这是一个弹幕";
        for(int i = 0; i<100;i++) {
            TextView textView = new TextView(this);
            textView.setText("ahdihaiohdiaiudhiuh"+text+"--------"+i);
            dml.addDanMuView(textView);
        }

        dml.addAllDanMu(danMuList);

        dml.addDanMuLike(text2);

        dml.addDanMuText("呵呵,这是一个纯text弹幕");

        TextView textView = new TextView(MainActivity.this);
        textView.setBackgroundColor(0xffaabbcc);
        textView.setText("啊啊,这是一个view弹幕");
        dml.addDanMuView(textView);

        dml.startDanMu();
    }

    @OnClick(R.id.tv_start)
    void startDanMu(){
        dml.startDanMu();
    }

    @OnClick(R.id.tv_stop)
    void stopDanMu(){
        dml.stopDanMu();
    }
}
