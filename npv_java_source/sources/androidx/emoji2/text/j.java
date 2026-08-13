package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends android.text.style.ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.emoji2.text.p f22309b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.graphics.Paint.FontMetricsInt f22308a = new android.graphics.Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f22310c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short f22311d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f22312e = 1.0f;

    j(androidx.emoji2.text.p pVar) {
        B1.i.h(pVar, "rasterizer cannot be null");
        this.f22309b = pVar;
    }

    public final androidx.emoji2.text.p a() {
        return this.f22309b;
    }

    final int b() {
        return this.f22310c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i6, int i10, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f22308a);
        android.graphics.Paint.FontMetricsInt fontMetricsInt2 = this.f22308a;
        this.f22312e = (java.lang.Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f22309b.e();
        this.f22311d = (short) (this.f22309b.e() * this.f22312e);
        short sI = (short) (this.f22309b.i() * this.f22312e);
        this.f22310c = sI;
        if (fontMetricsInt != null) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt3 = this.f22308a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
