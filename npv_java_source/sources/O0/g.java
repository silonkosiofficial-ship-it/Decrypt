package O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final O0.f a(java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        return android.os.Build.VERSION.SDK_INT >= 29 ? new O0.d(charSequence, textPaint) : new O0.e(charSequence);
    }
}
