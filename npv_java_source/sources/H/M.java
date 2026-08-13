package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    static final class a extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ H.C1230w f3711D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ N.F f3712E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ S0.V f3713F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f3714G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ boolean f3715H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ S0.L f3716I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ H.Y f3717J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p237x7.l f3718K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f3719L;

        /* JADX INFO: renamed from: H.M$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0080a extends p247y7.C7348q implements p237x7.l {
            C0080a(java.lang.Object obj) {
                super(1, obj, H.L.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                return s(((p231x0.b) obj).f());
            }

            public final java.lang.Boolean s(android.view.KeyEvent keyEvent) {
                return java.lang.Boolean.valueOf(((H.L) this.f57287D).l(keyEvent));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(H.C1230w c1230w, N.F f6, S0.V v6, boolean z6, boolean z10, S0.L l6, H.Y y6, p237x7.l lVar, int i6) {
            super(3);
            this.f3711D = c1230w;
            this.f3712E = f6;
            this.f3713F = v6;
            this.f3714G = z6;
            this.f3715H = z10;
            this.f3716I = l6;
            this.f3717J = y6;
            this.f3718K = lVar;
            this.f3719L = i6;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(851809892);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(851809892, i6, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)");
            }
            java.lang.Object objG = interfaceC1734n.g();
            V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
            if (objG == aVar.a()) {
                objG = new N.I();
                interfaceC1734n.K(objG);
            }
            N.I i10 = (N.I) objG;
            java.lang.Object objG2 = interfaceC1734n.g();
            if (objG2 == aVar.a()) {
                objG2 = new H.C1217i();
                interfaceC1734n.K(objG2);
            }
            H.L l6 = new H.L(this.f3711D, this.f3712E, this.f3713F, this.f3714G, this.f3715H, i10, this.f3716I, this.f3717J, (H.C1217i) objG2, null, this.f3718K, this.f3719L, 512, null);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.f19586a;
            boolean zL = interfaceC1734n.l(l6);
            java.lang.Object objG3 = interfaceC1734n.g();
            if (zL || objG3 == aVar.a()) {
                objG3 = new H.M.a.C0080a(l6);
                interfaceC1734n.K(objG3);
            }
            androidx.compose.ui.d dVarA = androidx.compose.ui.input.key.a.a(aVar2, (p237x7.l) ((F7.f) objG3));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return dVarA;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, H.C1230w c1230w, N.F f6, S0.V v6, p237x7.l lVar, boolean z6, boolean z10, S0.L l6, H.Y y6, int i6) {
        return androidx.compose.ui.c.c(dVar, null, new H.M.a(c1230w, f6, v6, z6, z10, l6, y6, lVar, i6), 1, null);
    }
}
