package Y9;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends X9.AbstractC1845m {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final long f16584D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f16585E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f16586F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(X9.Z z6, long j6, boolean z10) {
        super(z6);
        p247y7.AbstractC7350t.f(z6, "delegate");
        this.f16584D = j6;
        this.f16585E = z10;
    }

    private final void f(X9.C1836d c1836d, long j6) throws java.io.EOFException {
        X9.C1836d c1836d2 = new X9.C1836d();
        c1836d2.c0(c1836d);
        c1836d.F0(c1836d2, j6);
        c1836d2.a();
    }

    @Override // X9.AbstractC1845m, X9.Z
    public long b0(X9.C1836d c1836d, long j6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(c1836d, "sink");
        long j10 = this.f16586F;
        long j11 = this.f16584D;
        if (j10 > j11) {
            j6 = 0;
        } else if (this.f16585E) {
            long j12 = j11 - j10;
            if (j12 == 0) {
                return -1L;
            }
            j6 = java.lang.Math.min(j6, j12);
        }
        long jB0 = super.b0(c1836d, j6);
        if (jB0 != -1) {
            this.f16586F += jB0;
        }
        long j13 = this.f16586F;
        long j14 = this.f16584D;
        if ((j13 >= j14 || jB0 != -1) && j13 <= j14) {
            return jB0;
        }
        if (jB0 > 0 && j13 > j14) {
            f(c1836d, c1836d.d1() - (this.f16586F - this.f16584D));
        }
        throw new java.io.IOException("expected " + this.f16584D + " bytes but got " + this.f16586F);
    }
}
