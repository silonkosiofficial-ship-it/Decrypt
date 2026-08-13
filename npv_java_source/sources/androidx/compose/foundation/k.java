package androidx.compose.foundation;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f19159D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i6) {
            super(0);
            this.f19159D = i6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.foundation.m b() {
            return new androidx.compose.foundation.m(this.f19159D);
        }
    }

    public static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.m f19160D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f19161E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p230x.p f19162F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f19163G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ boolean f19164H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.foundation.m mVar, boolean z6, p230x.p pVar, boolean z10, boolean z11) {
            super(1);
            this.f19160D = mVar;
            this.f19161E = z6;
            this.f19162F = pVar;
            this.f19163G = z10;
            this.f19164H = z11;
        }

        public final void a(androidx.compose.ui.platform.G0 g6) {
            throw null;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            androidx.appcompat.app.D.a(obj);
            a(null);
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.m f19165D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f19166E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p230x.p f19167F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f19168G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ boolean f19169H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.foundation.m mVar, boolean z6, p230x.p pVar, boolean z10, boolean z11) {
            super(3);
            this.f19165D = mVar;
            this.f19166E = z6;
            this.f19167F = pVar;
            this.f19168G = z10;
            this.f19169H = z11;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(1478351300);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1478351300, i6, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:276)");
            }
            androidx.compose.ui.d dVarB = androidx.compose.ui.d.f19586a.b(new androidx.compose.foundation.ScrollSemanticsElement(this.f19165D, this.f19166E, this.f19167F, this.f19168G, this.f19169H));
            androidx.compose.foundation.m mVar = this.f19165D;
            androidx.compose.ui.d dVarB2 = p210v.a0.a(dVarB, mVar, this.f19169H ? p230x.s.Vertical : p230x.s.Horizontal, this.f19168G, this.f19166E, this.f19167F, mVar.j(), null, interfaceC1734n, 0, 64).b(new androidx.compose.foundation.ScrollingLayoutElement(this.f19165D, this.f19166E, this.f19169H));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return dVarB2;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    public static final androidx.compose.foundation.m a(int i6, V.InterfaceC1734n interfaceC1734n, int i10, int i11) {
        boolean z6 = true;
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1464256199, i10, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:69)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        p041e0.j jVarA = androidx.compose.foundation.m.f19433i.a();
        if ((((i10 & 14) ^ 6) <= 4 || !interfaceC1734n.i(i6)) && (i10 & 6) != 4) {
            z6 = false;
        }
        java.lang.Object objG = interfaceC1734n.g();
        if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new androidx.compose.foundation.k.a(i6);
            interfaceC1734n.K(objG);
        }
        androidx.compose.foundation.m mVar = (androidx.compose.foundation.m) p041e0.b.e(objArr, jVarA, null, (p237x7.a) objG, interfaceC1734n, 0, 4);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return mVar;
    }

    private static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, androidx.compose.foundation.m mVar, boolean z6, p230x.p pVar, boolean z10, boolean z11) {
        return androidx.compose.ui.c.b(dVar, androidx.compose.ui.platform.E0.b() ? new androidx.compose.foundation.k.b(mVar, z6, pVar, z10, z11) : androidx.compose.ui.platform.E0.a(), new androidx.compose.foundation.k.c(mVar, z6, pVar, z10, z11));
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, androidx.compose.foundation.m mVar, boolean z6, p230x.p pVar, boolean z10) {
        return b(dVar, mVar, z10, pVar, z6, true);
    }

    public static /* synthetic */ androidx.compose.ui.d d(androidx.compose.ui.d dVar, androidx.compose.foundation.m mVar, boolean z6, p230x.p pVar, boolean z10, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = true;
        }
        if ((i6 & 4) != 0) {
            pVar = null;
        }
        if ((i6 & 8) != 0) {
            z10 = false;
        }
        return c(dVar, mVar, z6, pVar, z10);
    }
}
