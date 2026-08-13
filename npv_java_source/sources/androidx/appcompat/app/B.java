package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static androidx.appcompat.app.B f17468d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17471c;

    B() {
    }

    static androidx.appcompat.app.B b() {
        if (f17468d == null) {
            f17468d = new androidx.appcompat.app.B();
        }
        return f17468d;
    }

    public void a(long j6, double d6, double d10) {
        float f6 = (j6 - 946728000000L) / 8.64E7f;
        float f10 = (0.01720197f * f6) + 6.24006f;
        double d11 = f10;
        double dSin = (java.lang.Math.sin(d11) * 0.03341960161924362d) + d11 + (java.lang.Math.sin(2.0f * f10) * 3.4906598739326E-4d) + (java.lang.Math.sin(f10 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d12 = (-d10) / 360.0d;
        double dRound = ((double) (java.lang.Math.round(((double) (f6 - 9.0E-4f)) - d12) + 9.0E-4f)) + d12 + (java.lang.Math.sin(d11) * 0.0053d) + (java.lang.Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = java.lang.Math.asin(java.lang.Math.sin(dSin) * java.lang.Math.sin(0.4092797040939331d));
        double d13 = 0.01745329238474369d * d6;
        double dSin2 = (java.lang.Math.sin(-0.10471975803375244d) - (java.lang.Math.sin(d13) * java.lang.Math.sin(dAsin))) / (java.lang.Math.cos(d13) * java.lang.Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f17471c = 1;
        } else {
            if (dSin2 > -1.0d) {
                double dAcos = (float) (java.lang.Math.acos(dSin2) / 6.283185307179586d);
                this.f17469a = java.lang.Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
                long jRound = java.lang.Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
                this.f17470b = jRound;
                if (jRound >= j6 || this.f17469a <= j6) {
                    this.f17471c = 1;
                    return;
                } else {
                    this.f17471c = 0;
                    return;
                }
            }
            this.f17471c = 0;
        }
        this.f17469a = -1L;
        this.f17470b = -1L;
    }
}
