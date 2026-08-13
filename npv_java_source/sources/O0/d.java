package O0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends O0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.CharSequence f7943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.text.TextPaint f7944b;

    public d(java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        this.f7943a = charSequence;
        this.f7944b = textPaint;
    }

    @Override // O0.b
    public int e(int i6) {
        android.text.TextPaint textPaint = this.f7944b;
        java.lang.CharSequence charSequence = this.f7943a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i6, 0);
    }

    @Override // O0.b
    public int f(int i6) {
        android.text.TextPaint textPaint = this.f7944b;
        java.lang.CharSequence charSequence = this.f7943a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i6, 2);
    }
}
