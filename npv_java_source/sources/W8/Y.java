package W8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Y {
    public static final java.lang.Object a(long j6, p127m7.e eVar) {
        if (j6 <= 0) {
            return p087i7.M.f46721a;
        }
        W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
        c1798n.E();
        if (j6 < Long.MAX_VALUE) {
            b(c1798n.getContext()).x0(j6, c1798n);
        }
        java.lang.Object objX = c1798n.x();
        if (objX == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objX == p137n7.b.g() ? objX : p087i7.M.f46721a;
    }

    public static final W8.X b(p127m7.i iVar) {
        m7.i.b bVarI = iVar.i(p127m7.f.f51196A);
        W8.X x6 = bVarI instanceof W8.X ? (W8.X) bVarI : null;
        return x6 == null ? W8.U.a() : x6;
    }

    public static final long c(long j6) {
        boolean zN = T8.a.N(j6);
        if (zN) {
            return T8.a.z(T8.a.O(j6, T8.c.t(999999L, T8.d.NANOSECONDS)));
        }
        if (zN) {
            throw new p087i7.s();
        }
        return 0L;
    }
}
