package V;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    public static final boolean a(V.H0 h6, V.AbstractC1752w abstractC1752w) {
        p247y7.AbstractC7350t.d(abstractC1752w, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return h6.containsKey(abstractC1752w);
    }

    public static final java.lang.Object b(V.H0 h6, V.AbstractC1752w abstractC1752w) {
        p247y7.AbstractC7350t.d(abstractC1752w, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        java.lang.Object objA = h6.get(abstractC1752w);
        if (objA == null) {
            objA = abstractC1752w.a();
        }
        return ((V.M1) objA).a(h6);
    }

    public static final V.H0 c(V.P0[] p0Arr, V.H0 h6, V.H0 h10) {
        d0.e.a aVarZ = p031d0.f.a().builder();
        for (V.P0 p6 : p0Arr) {
            V.AbstractC1752w abstractC1752wB = p6.b();
            p247y7.AbstractC7350t.d(abstractC1752wB, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            V.O0 o6 = (V.O0) abstractC1752wB;
            if (p6.a() || !a(h6, o6)) {
                V.M1 m6 = (V.M1) h10.get(o6);
                p247y7.AbstractC7350t.d(p6, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                aVarZ.put(o6, o6.b(p6, m6));
            }
        }
        return aVarZ.i();
    }

    public static /* synthetic */ V.H0 d(V.P0[] p0Arr, V.H0 h6, V.H0 h10, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            h10 = p031d0.f.a();
        }
        return c(p0Arr, h6, h10);
    }
}
