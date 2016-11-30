package danmu.habinbin.hello.library;

import android.graphics.Point;
import android.text.TextPaint;

/**
 * 弹幕属性
 * Created by bin on 16/11/23.
 */
public class DanMuAttributes{
    private TextPaint textPaint;
    private Point point;
    private String text;

    public DanMuAttributes(TextPaint textPaint, Point point, String text) {
        this.textPaint = textPaint;
        this.point = point;
        this.text = text;
    }

    public TextPaint getTextPaint() {
        return textPaint;
    }

    public void setTextPaint(TextPaint textPaint) {
        this.textPaint = textPaint;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}