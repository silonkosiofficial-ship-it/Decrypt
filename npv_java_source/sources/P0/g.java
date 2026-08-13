package P0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements android.text.style.LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8240a;

    public g(float f6) {
        this.f8240a = f6;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence charSequence, int i6, int i10, int i11, int i12, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        int iA = P0.i.a(fontMetricsInt);
        if (iA <= 0) {
            return;
        }
        int iCeil = (int) java.lang.Math.ceil(this.f8240a);
        int iCeil2 = (int) java.lang.Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / iA)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
