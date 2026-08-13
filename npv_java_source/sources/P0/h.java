package P0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements android.text.style.LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f8246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8247g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8248h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8249i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8250j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8252l;

    public h(float f6, int i6, int i10, boolean z6, boolean z10, float f10) {
        this.f8241a = f6;
        this.f8242b = i6;
        this.f8243c = i10;
        this.f8244d = z6;
        this.f8245e = z10;
        this.f8246f = f10;
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            throw new java.lang.IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    private final void a(android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        int iA = P0.i.a(fontMetricsInt);
        int iCeil = (int) java.lang.Math.ceil(this.f8241a);
        int i6 = iCeil - iA;
        float fAbs = this.f8246f;
        if (fAbs == -1.0f) {
            fAbs = java.lang.Math.abs(fontMetricsInt.ascent) / P0.i.a(fontMetricsInt);
        }
        int iCeil2 = (int) java.lang.Math.ceil(i6 <= 0 ? i6 * fAbs : i6 * (1.0f - fAbs));
        int i10 = fontMetricsInt.descent;
        int i11 = iCeil2 + i10;
        this.f8249i = i11;
        int i12 = i11 - iCeil;
        this.f8248h = i12;
        if (this.f8244d) {
            i12 = fontMetricsInt.ascent;
        }
        this.f8247g = i12;
        if (this.f8245e) {
            i11 = i10;
        }
        this.f8250j = i11;
        this.f8251k = fontMetricsInt.ascent - i12;
        this.f8252l = i11 - i10;
    }

    public final P0.h b(int i6, int i10, boolean z6) {
        return new P0.h(this.f8241a, i6, i10, z6, this.f8245e, this.f8246f);
    }

    public final int c() {
        return this.f8251k;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence charSequence, int i6, int i10, int i11, int i12, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        if (P0.i.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z6 = i6 == this.f8242b;
        boolean z10 = i10 == this.f8243c;
        if (z6 && z10 && this.f8244d && this.f8245e) {
            return;
        }
        if (this.f8247g == Integer.MIN_VALUE) {
            a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z6 ? this.f8247g : this.f8248h;
        fontMetricsInt.descent = z10 ? this.f8250j : this.f8249i;
    }

    public final int d() {
        return this.f8252l;
    }

    public final boolean e() {
        return this.f8245e;
    }
}
