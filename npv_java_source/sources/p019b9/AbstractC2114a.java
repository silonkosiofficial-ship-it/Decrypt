package p019b9;

/* JADX INFO: renamed from: b9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2114a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p019b9.D f24349a = new p019b9.D("CLOSED");

    public static final p019b9.AbstractC2115b b(p019b9.AbstractC2115b abstractC2115b) {
        while (true) {
            java.lang.Object objG = abstractC2115b.g();
            if (objG == f24349a) {
                return abstractC2115b;
            }
            p019b9.AbstractC2115b abstractC2115b2 = (p019b9.AbstractC2115b) objG;
            if (abstractC2115b2 != null) {
                abstractC2115b = abstractC2115b2;
            } else if (abstractC2115b.m()) {
                return abstractC2115b;
            }
        }
    }

    public static final java.lang.Object c(p019b9.A a6, long j6, p237x7.p pVar) {
        while (true) {
            if (a6.f24329c >= j6 && !a6.k()) {
                return p019b9.B.a(a6);
            }
            java.lang.Object objG = a6.g();
            if (objG == f24349a) {
                return p019b9.B.a(f24349a);
            }
            p019b9.A a10 = (p019b9.A) ((p019b9.AbstractC2115b) objG);
            if (a10 == null) {
                a10 = (p019b9.A) pVar.u(java.lang.Long.valueOf(a6.f24329c + 1), a6);
                if (a6.o(a10)) {
                    if (a6.k()) {
                        a6.n();
                    }
                }
            }
            a6 = a10;
        }
    }
}
