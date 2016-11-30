package danmu.habinbin.hello.danmulayout;

import danmu.habinbin.hello.library.DanMuInfo;

/**
 * Created by bin on 16/11/30.
 * 彈幕實體類
 * 需要實現 DanMuInfo接口
 */

public class DanMu implements DanMuInfo {
    String text;
    DanMuType type;
    String UserName;

    public DanMu(String text, DanMuInfo.DanMuType type, String userName) {
        this.text = text;
        this.type = type;
        UserName = userName;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public DanMuType getType() {
        return type;
    }

    @Override
    public String getUserName() {
        return UserName;
    }
}
