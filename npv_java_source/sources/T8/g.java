package T8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    private static final long a(long j6) {
        return j6 < 0 ? T8.a.f13312D.b() : T8.a.f13312D.a();
    }

    public static final long b(long j6, long j10, T8.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "unit");
        return (1 | (j10 - 1)) == Long.MAX_VALUE ? T8.a.S(a(j10)) : c(j6, j10, dVar);
    }

    private static final long c(long j6, long j10, T8.d dVar) {
        long j11 = j6 - j10;
        if (((j11 ^ j6) & (~(j11 ^ j10))) >= 0) {
            return T8.c.t(j11, dVar);
        }
        T8.d dVar2 = T8.d.MILLISECONDS;
        if (dVar.compareTo(dVar2) >= 0) {
            return T8.a.S(a(j11));
        }
        long jB = T8.e.b(1L, dVar2, dVar);
        long j12 = (j6 / jB) - (j10 / jB);
        long j13 = (j6 % jB) - (j10 % jB);
        T8.a.C0279a c0279a = T8.a.f13312D;
        return T8.a.O(T8.c.t(j12, dVar2), T8.c.t(j13, dVar));
    }
}
