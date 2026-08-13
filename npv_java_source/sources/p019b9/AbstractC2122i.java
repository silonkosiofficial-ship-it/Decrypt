package p019b9;

/* JADX INFO: renamed from: b9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2122i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p019b9.D f24360a = new p019b9.D("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p019b9.D f24361b = new p019b9.D("REUSABLE_CLAIMED");

    public static final void b(p127m7.e eVar, java.lang.Object obj) {
        if (!(eVar instanceof p019b9.C2121h)) {
            eVar.t(obj);
            return;
        }
        p019b9.C2121h c2121h = (p019b9.C2121h) eVar;
        java.lang.Object objB = W8.C.b(obj);
        if (c2121h.f24356F.v1(c2121h.getContext())) {
            c2121h.f24358H = objB;
            c2121h.f15482E = 1;
            c2121h.f24356F.t1(c2121h.getContext(), c2121h);
            return;
        }
        W8.AbstractC1791j0 abstractC1791j0B = W8.X0.f15476a.b();
        if (abstractC1791j0B.G1()) {
            c2121h.f24358H = objB;
            c2121h.f15482E = 1;
            abstractC1791j0B.C1(c2121h);
            return;
        }
        abstractC1791j0B.E1(true);
        try {
            W8.InterfaceC1822z0 interfaceC1822z0 = (W8.InterfaceC1822z0) c2121h.getContext().i(W8.InterfaceC1822z0.f15544h);
            if (interfaceC1822z0 == null || interfaceC1822z0.f()) {
                p127m7.e eVar2 = c2121h.f24357G;
                java.lang.Object obj2 = c2121h.f24359I;
                p127m7.i context = eVar2.getContext();
                java.lang.Object objI = p019b9.K.i(context, obj2);
                W8.c1 c1VarM = objI != p019b9.K.f24335a ? W8.H.m(eVar2, context, objI) : null;
                try {
                    c2121h.f24357G.t(obj);
                    p087i7.M m6 = p087i7.M.f46721a;
                    if (c1VarM == null || c1VarM.k1()) {
                        p019b9.K.f(context, objI);
                    }
                } catch (java.lang.Throwable th) {
                    if (c1VarM == null || c1VarM.k1()) {
                        p019b9.K.f(context, objI);
                    }
                    throw th;
                }
            } else {
                java.util.concurrent.CancellationException cancellationExceptionE0 = interfaceC1822z0.e0();
                c2121h.a(objB, cancellationExceptionE0);
                i7.w.a aVar = p087i7.w.f46751D;
                c2121h.t(p087i7.w.b(p087i7.x.a(cancellationExceptionE0)));
            }
            while (abstractC1791j0B.J1()) {
            }
        } catch (java.lang.Throwable th2) {
            try {
                c2121h.h(th2);
            } finally {
                abstractC1791j0B.z1(true);
            }
        }
    }

    public static final boolean c(p019b9.C2121h c2121h) {
        p087i7.M m6 = p087i7.M.f46721a;
        W8.AbstractC1791j0 abstractC1791j0B = W8.X0.f15476a.b();
        if (abstractC1791j0B.H1()) {
            return false;
        }
        if (abstractC1791j0B.G1()) {
            c2121h.f24358H = m6;
            c2121h.f15482E = 1;
            abstractC1791j0B.C1(c2121h);
            return true;
        }
        abstractC1791j0B.E1(true);
        try {
            c2121h.run();
            do {
            } while (abstractC1791j0B.J1());
        } catch (java.lang.Throwable th) {
            try {
                c2121h.h(th);
            } finally {
                abstractC1791j0B.z1(true);
            }
        }
        return false;
    }
}
