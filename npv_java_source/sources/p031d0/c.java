package p031d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f44277a = new java.lang.Object();

    public static final int a(int i6, int i10) {
        return i6 << (((i10 % 10) * 3) + 1);
    }

    public static final p031d0.a b(V.InterfaceC1734n interfaceC1734n, int i6, boolean z6, java.lang.Object obj) {
        p031d0.b bVar;
        interfaceC1734n.s(java.lang.Integer.rotateLeft(i6, 1), f44277a);
        java.lang.Object objG = interfaceC1734n.g();
        if (objG == V.InterfaceC1734n.f14931a.a()) {
            bVar = new p031d0.b(i6, z6, obj);
            interfaceC1734n.K(bVar);
        } else {
            p247y7.AbstractC7350t.d(objG, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            bVar = (p031d0.b) objG;
            bVar.n(obj);
        }
        interfaceC1734n.N();
        return bVar;
    }

    public static final p031d0.a c(int i6, boolean z6, java.lang.Object obj) {
        return new p031d0.b(i6, z6, obj);
    }

    public static final int d(int i6) {
        return a(2, i6);
    }

    public static final p031d0.a e(int i6, boolean z6, java.lang.Object obj, V.InterfaceC1734n interfaceC1734n, int i10) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1573003438, i10, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:628)");
        }
        java.lang.Object objG = interfaceC1734n.g();
        if (objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new p031d0.b(i6, z6, obj);
            interfaceC1734n.K(objG);
        }
        p031d0.b bVar = (p031d0.b) objG;
        bVar.n(obj);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return bVar;
    }

    public static final boolean f(V.Q0 q6, V.Q0 q10) {
        if (q6 != null) {
            if ((q6 instanceof V.R0) && (q10 instanceof V.R0)) {
                V.R0 r6 = (V.R0) q6;
                if (!r6.r() || p247y7.AbstractC7350t.b(q6, q10) || p247y7.AbstractC7350t.b(r6.i(), ((V.R0) q10).i())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int g(int i6) {
        return a(1, i6);
    }
}
