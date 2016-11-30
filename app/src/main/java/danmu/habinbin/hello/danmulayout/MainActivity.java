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
import danmu.habinbin.hello.library.DanMuInfo;
import danmu.habinbin.hello.library.DanMuLayout;

public class MainActivity extends AppCompatActivity {

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
        for(int i = 0; i<100;i++)
            danMuList.add(new DanMu("adjaiojdoajdinenjkbhiuhadsdhuawiuh", DanMuInfo.DanMuType.TEXT,null));

        dml.addAllDanMu(danMuList);
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
