package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {
    public static final boolean a(M0.K k6, M0.C1332d c1332d, M0.P p6, java.util.List list, int i6, boolean z6, int i10, Y0.e eVar, Y0.v vVar, R0.AbstractC1494h.b bVar, long j6) {
        M0.J jL = k6.l();
        if (k6.w().j().c() || !p247y7.AbstractC7350t.b(jL.j(), c1332d) || !jL.i().G(p6) || !p247y7.AbstractC7350t.b(jL.g(), list) || jL.e() != i6 || jL.h() != z6 || !X0.u.e(jL.f(), i10) || !p247y7.AbstractC7350t.b(jL.b(), eVar) || jL.d() != vVar || !p247y7.AbstractC7350t.b(jL.c(), bVar) || Y0.C1859b.n(j6) != Y0.C1859b.n(jL.a())) {
            return false;
        }
        if (z6 || X0.u.e(i10, X0.u.f15666a.b())) {
            return Y0.C1859b.l(j6) == Y0.C1859b.l(jL.a()) && Y0.C1859b.k(j6) == Y0.C1859b.k(jL.a());
        }
        return true;
    }
}
