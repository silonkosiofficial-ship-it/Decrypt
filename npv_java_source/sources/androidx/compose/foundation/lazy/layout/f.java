package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final float a(int i6, int i10, boolean z6) {
        float fB = b(i6, i10);
        return z6 ? fB + 100 : fB;
    }

    public static final float b(int i6, int i10) {
        return i10 + (i6 * 500);
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, p237x7.a aVar, D.E e6, p230x.s sVar, boolean z6, boolean z10, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1070136913, i6, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)");
        }
        androidx.compose.ui.d dVarB = dVar.b(new androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier(aVar, e6, sVar, z6, z10));
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return dVarB;
    }
}
