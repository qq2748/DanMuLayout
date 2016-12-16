package danmu.habinbin.hello.library;

import android.text.TextPaint;

/**
 * 弹幕属性
 * Created by bin on 16/11/23.
 */
public class DanMuAttributes{
    private TextPaint textPaint;
    private CPoint point;
    private String text;
    private long dTime;

    public DanMuAttributes(TextPaint textPaint, CPoint point, String text, long dTime) {
        this.textPaint = textPaint;
        this.point = point;
        this.text = text;
        this.dTime = dTime;
    }

    public TextPaint getTextPaint() {
        return textPaint;
    }

    public void setTextPaint(TextPaint textPaint) {
        this.textPaint = textPaint;
    }

    public CPoint getPoint() {
        return point;
    }

    public void setPoint(CPoint point) {
        this.point = point;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getdTime() {
        return dTime;
    }

    public void setdTime(long dTime) {
        this.dTime = dTime;
    }

    public static class CPoint {
        public float x;
        public float y;

        public CPoint(float x, float y) {
            this.x = x;
            this.y = y;
        }
    }
}