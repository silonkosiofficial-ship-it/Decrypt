package U0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final M0.InterfaceC1346s a(java.lang.String str, M0.P p6, java.util.List list, java.util.List list2, Y0.e eVar, R0.AbstractC1494h.b bVar) {
        return new U0.d(str, p6, list, list2, bVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(M0.P p6) {
        M0.y yVarA;
        M0.A aW = p6.w();
        M0.C1335g c1335gD = (aW == null || (yVarA = aW.a()) == null) ? null : M0.C1335g.d(yVarA.b());
        return !(c1335gD == null ? false : M0.C1335g.g(c1335gD.j(), M0.C1335g.f6714b.c()));
    }

    public static final int d(int i6, T0.h hVar) {
        java.util.Locale localeB;
        X0.l.a aVar = X0.l.f15636b;
        if (X0.l.j(i6, aVar.b())) {
            return 2;
        }
        if (!X0.l.j(i6, aVar.c())) {
            if (X0.l.j(i6, aVar.d())) {
                return 0;
            }
            if (X0.l.j(i6, aVar.e())) {
                return 1;
            }
            if (!(X0.l.j(i6, aVar.a()) ? true : X0.l.j(i6, aVar.f()))) {
                throw new java.lang.IllegalStateException("Invalid TextDirection.".toString());
            }
            if (hVar == null || (localeB = hVar.f(0).b()) == null) {
                localeB = java.util.Locale.getDefault();
            }
            int iA = androidx.core.text.r.a(localeB);
            if (iA == 0 || iA != 1) {
                return 2;
            }
        }
        return 3;
    }
}
