package androidx.compose.foundation.selection;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.compose.foundation.selection.a$a, reason: collision with other inner class name */
    public static final class C0373a extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p210v.G f19495D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f19496E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f19497F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ K0.h f19498G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.a f19499H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0373a(p210v.G g6, boolean z6, boolean z10, K0.h hVar, p237x7.a aVar) {
            super(3);
            this.f19495D = g6;
            this.f19496E = z6;
            this.f19497F = z10;
            this.f19498G = hVar;
            this.f19499H = aVar;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(-1525724089);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1525724089, i6, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            java.lang.Object objG = interfaceC1734n.g();
            if (objG == V.InterfaceC1734n.f14931a.a()) {
                objG = p250z.k.a();
                interfaceC1734n.K(objG);
            }
            p250z.l lVar = (p250z.l) objG;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.h.b(androidx.compose.ui.d.f19586a, lVar, this.f19495D).b(new androidx.compose.foundation.selection.SelectableElement(this.f19496E, lVar, null, this.f19497F, this.f19498G, this.f19499H, null));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return dVarB;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, boolean z6, p250z.l lVar, p210v.G g6, boolean z10, K0.h hVar, p237x7.a aVar) {
        androidx.compose.ui.d dVarB;
        if (g6 instanceof p210v.I) {
            dVarB = new androidx.compose.foundation.selection.SelectableElement(z6, lVar, (p210v.I) g6, z10, hVar, aVar, null);
        } else if (g6 == null) {
            dVarB = new androidx.compose.foundation.selection.SelectableElement(z6, lVar, null, z10, hVar, aVar, null);
        } else {
            dVarB = lVar != null ? androidx.compose.foundation.h.b(androidx.compose.ui.d.f19586a, lVar, g6).b(new androidx.compose.foundation.selection.SelectableElement(z6, lVar, null, z10, hVar, aVar, null)) : androidx.compose.ui.c.c(androidx.compose.ui.d.f19586a, null, new androidx.compose.foundation.selection.a.C0373a(g6, z6, z10, hVar, aVar), 1, null);
        }
        return dVar.b(dVarB);
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, boolean z6, p250z.l lVar, p210v.G g6, boolean z10, K0.h hVar, p237x7.a aVar, int i6, java.lang.Object obj) {
        if ((i6 & 8) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i6 & 16) != 0) {
            hVar = null;
        }
        return a(dVar, z6, lVar, g6, z11, hVar, aVar);
    }
}
