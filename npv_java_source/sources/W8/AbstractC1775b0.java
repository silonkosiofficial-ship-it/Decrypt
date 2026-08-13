package W8;

/* JADX INFO: renamed from: W8.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1775b0 {
    public static final void a(W8.AbstractC1773a0 abstractC1773a0, int i6) {
        p127m7.e eVarC = abstractC1773a0.c();
        boolean z6 = i6 == 4;
        if (z6 || !(eVarC instanceof p019b9.C2121h) || b(i6) != b(abstractC1773a0.f15482E)) {
            d(abstractC1773a0, eVarC, z6);
            return;
        }
        p019b9.C2121h c2121h = (p019b9.C2121h) eVarC;
        W8.J j6 = c2121h.f24356F;
        p127m7.i context = c2121h.getContext();
        if (j6.v1(context)) {
            j6.t1(context, abstractC1773a0);
        } else {
            e(abstractC1773a0);
        }
    }

    public static final boolean b(int i6) {
        return i6 == 1 || i6 == 2;
    }

    public static final boolean c(int i6) {
        return i6 == 2;
    }

    public static final void d(W8.AbstractC1773a0 abstractC1773a0, p127m7.e eVar, boolean z6) {
        java.lang.Object objG;
        java.lang.Object objI = abstractC1773a0.i();
        java.lang.Throwable thD = abstractC1773a0.d(objI);
        if (thD != null) {
            i7.w.a aVar = p087i7.w.f46751D;
            objG = p087i7.x.a(thD);
        } else {
            i7.w.a aVar2 = p087i7.w.f46751D;
            objG = abstractC1773a0.g(objI);
        }
        java.lang.Object objB = p087i7.w.b(objG);
        if (!z6) {
            eVar.t(objB);
            return;
        }
        p247y7.AbstractC7350t.d(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        p019b9.C2121h c2121h = (p019b9.C2121h) eVar;
        p127m7.e eVar2 = c2121h.f24357G;
        java.lang.Object obj = c2121h.f24359I;
        p127m7.i context = eVar2.getContext();
        java.lang.Object objI2 = p019b9.K.i(context, obj);
        W8.c1 c1VarM = objI2 != p019b9.K.f24335a ? W8.H.m(eVar2, context, objI2) : null;
        try {
            c2121h.f24357G.t(objB);
            p087i7.M m6 = p087i7.M.f46721a;
        } finally {
            if (c1VarM == null || c1VarM.k1()) {
                p019b9.K.f(context, objI2);
            }
        }
    }

    private static final void e(W8.AbstractC1773a0 abstractC1773a0) {
        W8.AbstractC1791j0 abstractC1791j0B = W8.X0.f15476a.b();
        if (abstractC1791j0B.G1()) {
            abstractC1791j0B.C1(abstractC1773a0);
            return;
        }
        abstractC1791j0B.E1(true);
        try {
            d(abstractC1773a0, abstractC1773a0.c(), true);
            do {
            } while (abstractC1791j0B.J1());
        } catch (java.lang.Throwable th) {
            try {
                abstractC1773a0.h(th);
            } finally {
                abstractC1791j0B.z1(true);
            }
        }
    }
}
