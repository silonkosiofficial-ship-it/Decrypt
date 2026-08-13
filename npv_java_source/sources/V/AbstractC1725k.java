package V;

/* JADX INFO: renamed from: V.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1725k {
    public static final int a(V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(524444915, i6, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:228)");
        }
        int iL = interfaceC1734n.L();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return iL;
    }

    public static final V.Q0 b(V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(394957799, i6, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:196)");
        }
        V.Q0 q0B = interfaceC1734n.b();
        if (q0B == null) {
            throw new java.lang.IllegalStateException("no recompose scope found".toString());
        }
        interfaceC1734n.z(q0B);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return q0B;
    }

    public static final void c() {
        throw new java.lang.IllegalStateException("Invalid applier".toString());
    }

    public static final V.AbstractC1744s d(V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1165786124, i6, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:484)");
        }
        V.AbstractC1744s abstractC1744sM = interfaceC1734n.M();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return abstractC1744sM;
    }
}
