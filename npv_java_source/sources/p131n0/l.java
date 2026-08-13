package p131n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final p131n0.k a(float f6, float f10, float f11, float f12, float f13, float f14) {
        long jA = p131n0.b.a(f13, f14);
        return new p131n0.k(f6, f10, f11, f12, jA, jA, jA, jA, null);
    }

    public static final p131n0.k b(p131n0.i iVar, long j6, long j10, long j11, long j12) {
        return new p131n0.k(iVar.i(), iVar.l(), iVar.j(), iVar.e(), j6, j10, j11, j12, null);
    }

    public static final p131n0.k c(float f6, float f10, float f11, float f12, long j6) {
        return a(f6, f10, f11, f12, p131n0.a.d(j6), p131n0.a.e(j6));
    }

    public static final p131n0.i d(p131n0.k kVar) {
        return new p131n0.i(kVar.e(), kVar.g(), kVar.f(), kVar.a());
    }

    public static final boolean e(p131n0.k kVar) {
        return p131n0.a.d(kVar.h()) == p131n0.a.e(kVar.h()) && p131n0.a.d(kVar.h()) == p131n0.a.d(kVar.i()) && p131n0.a.d(kVar.h()) == p131n0.a.e(kVar.i()) && p131n0.a.d(kVar.h()) == p131n0.a.d(kVar.c()) && p131n0.a.d(kVar.h()) == p131n0.a.e(kVar.c()) && p131n0.a.d(kVar.h()) == p131n0.a.d(kVar.b()) && p131n0.a.d(kVar.h()) == p131n0.a.e(kVar.b());
    }
}
