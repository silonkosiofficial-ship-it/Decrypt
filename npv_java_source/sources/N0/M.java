package N0;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.CharSequence f7541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.text.TextPaint f7542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f7544d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f7545e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.text.BoringLayout.Metrics f7546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7547g;

    public M(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i6) {
        this.f7541a = charSequence;
        this.f7542b = textPaint;
        this.f7543c = i6;
    }

    public final android.text.BoringLayout.Metrics a() {
        if (!this.f7547g) {
            this.f7546f = N0.C1373k.f7582a.c(this.f7541a, this.f7542b, N0.n0.k(this.f7543c));
            this.f7547g = true;
        }
        return this.f7546f;
    }

    public final float b() {
        if (!java.lang.Float.isNaN(this.f7544d)) {
            return this.f7544d;
        }
        android.text.BoringLayout.Metrics metricsA = a();
        float fCeil = metricsA != null ? metricsA.width : -1;
        if (fCeil < 0.0f) {
            java.lang.CharSequence charSequence = this.f7541a;
            fCeil = (float) java.lang.Math.ceil(android.text.Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f7542b));
        }
        if (N0.O.e(fCeil, this.f7541a, this.f7542b)) {
            fCeil += 0.5f;
        }
        this.f7544d = fCeil;
        return fCeil;
    }

    public final float c() {
        if (!java.lang.Float.isNaN(this.f7545e)) {
            return this.f7545e;
        }
        float fC = N0.O.c(this.f7541a, this.f7542b);
        this.f7545e = fC;
        return fC;
    }
}
