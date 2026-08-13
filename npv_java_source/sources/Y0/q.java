package Y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final long a(int i6, int i10) {
        return Y0.p.c((((long) i10) & 4294967295L) | (((long) i6) << 32));
    }

    public static final long b(long j6, long j10) {
        return p131n0.h.a(p131n0.g.m(j6) - Y0.p.h(j10), p131n0.g.n(j6) - Y0.p.i(j10));
    }

    public static final long c(long j6, long j10) {
        return p131n0.h.a(p131n0.g.m(j6) + Y0.p.h(j10), p131n0.g.n(j6) + Y0.p.i(j10));
    }

    public static final long d(long j6) {
        int iRound = java.lang.Math.round(p131n0.g.m(j6));
        return Y0.p.c((((long) java.lang.Math.round(p131n0.g.n(j6))) & 4294967295L) | (((long) iRound) << 32));
    }
}
