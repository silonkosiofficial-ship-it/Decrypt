package Y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final long a(int i6, int i10) {
        return Y0.t.c((((long) i10) & 4294967295L) | (((long) i6) << 32));
    }

    public static final long b(long j6) {
        return Y0.p.c((((j6 << 32) >> 33) & 4294967295L) | ((j6 >> 33) << 32));
    }

    public static final long c(long j6) {
        int iRound = java.lang.Math.round(p131n0.m.i(j6));
        return Y0.t.c((((long) java.lang.Math.round(p131n0.m.g(j6))) & 4294967295L) | (((long) iRound) << 32));
    }

    public static final long d(long j6) {
        return p131n0.n.a(Y0.t.g(j6), Y0.t.f(j6));
    }
}
