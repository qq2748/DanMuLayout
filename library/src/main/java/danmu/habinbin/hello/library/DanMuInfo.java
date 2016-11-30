package danmu.habinbin.hello.library;

/**
 * Created by bin on 16/11/23.
 * 弹幕实体类需要继承该接口
 */

public interface DanMuInfo {

    String getText();

    DanMuType getType();

    String getUserName();

    enum DanMuType {
        TEXT, LIKE
    }

}
