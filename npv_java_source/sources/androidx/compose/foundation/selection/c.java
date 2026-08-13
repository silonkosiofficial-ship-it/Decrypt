package androidx.compose.foundation.selection;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    public static final class a extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p210v.G f19501D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ L0.a f19502E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f19503F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ K0.h f19504G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.a f19505H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p210v.G g6, L0.a aVar, boolean z6, K0.h hVar, p237x7.a aVar2) {
            super(3);
            this.f19501D = g6;
            this.f19502E = aVar;
            this.f19503F = z6;
            this.f19504G = hVar;
            this.f19505H = aVar2;
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
            androidx.compose.ui.d dVarB = androidx.compose.foundation.h.b(androidx.compose.ui.d.f19586a, lVar, this.f19501D).b(new androidx.compose.foundation.selection.TriStateToggleableElement(this.f19502E, lVar, null, this.f19503F, this.f19504G, this.f19505H, null));
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

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, L0.a aVar, p250z.l lVar, p210v.G g6, boolean z6, K0.h hVar, p237x7.a aVar2) {
        androidx.compose.ui.d dVarB;
        if (g6 instanceof p210v.I) {
            dVarB = new androidx.compose.foundation.selection.TriStateToggleableElement(aVar, lVar, (p210v.I) g6, z6, hVar, aVar2, null);
        } else if (g6 == null) {
            dVarB = new androidx.compose.foundation.selection.TriStateToggleableElement(aVar, lVar, null, z6, hVar, aVar2, null);
        } else {
            dVarB = lVar != null ? androidx.compose.foundation.h.b(androidx.compose.ui.d.f19586a, lVar, g6).b(new androidx.compose.foundation.selection.TriStateToggleableElement(aVar, lVar, null, z6, hVar, aVar2, null)) : androidx.compose.ui.c.c(androidx.compose.ui.d.f19586a, null, new androidx.compose.foundation.selection.c.a(g6, aVar, z6, hVar, aVar2), 1, null);
        }
        return dVar.b(dVarB);
    }
}
