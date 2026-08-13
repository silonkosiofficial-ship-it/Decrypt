package U0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final void a(android.text.TextPaint textPaint, float f6) {
        if (java.lang.Float.isNaN(f6)) {
            return;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        textPaint.setAlpha(java.lang.Math.round(f6 * 255));
    }
}
