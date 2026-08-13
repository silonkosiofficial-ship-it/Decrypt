package p220w;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p051f0.r f56099a = V.v1.f();

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p220w.b f56101E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f56102F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p220w.b bVar, int i6) {
            super(2);
            this.f56101E = bVar;
            this.f56102F = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            p220w.g.this.a(this.f56101E, interfaceC1734n, V.S0.a(this.f56102F | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.p f56103D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f56104E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f56105F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.q f56106G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.a f56107H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p237x7.p pVar, boolean z6, androidx.compose.ui.d dVar, p237x7.q qVar, p237x7.a aVar) {
            super(3);
            this.f56103D = pVar;
            this.f56104E = z6;
            this.f56105F = dVar;
            this.f56106G = qVar;
            this.f56107H = aVar;
        }

        public final void a(p220w.b bVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 6) == 0) {
                i6 |= interfaceC1734n.S(bVar) ? 4 : 2;
            }
            if ((i6 & 19) == 18 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(262103052, i6, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:275)");
            }
            java.lang.String str = (java.lang.String) this.f56103D.u(interfaceC1734n, 0);
            if (!(!S8.r.s0(str))) {
                throw new java.lang.IllegalStateException("Label must not be blank".toString());
            }
            p220w.k.b(str, this.f56104E, bVar, this.f56105F, this.f56106G, this.f56107H, interfaceC1734n, (i6 << 6) & 896, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            a((p220w.b) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static /* synthetic */ void d(p220w.g gVar, p237x7.p pVar, androidx.compose.ui.d dVar, boolean z6, p237x7.q qVar, p237x7.a aVar, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            dVar = androidx.compose.ui.d.f19586a;
        }
        androidx.compose.ui.d dVar2 = dVar;
        if ((i6 & 4) != 0) {
            z6 = true;
        }
        boolean z10 = z6;
        if ((i6 & 8) != 0) {
            qVar = null;
        }
        gVar.c(pVar, dVar2, z10, qVar, aVar);
    }

    public final void a(p220w.b bVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(1320309496);
        int i10 = (i6 & 6) == 0 ? (interfaceC1734nR.S(bVar) ? 4 : 2) | i6 : i6;
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.S(this) ? 32 : 16;
        }
        if ((i10 & 19) == 18 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1320309496, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:233)");
            }
            p051f0.r rVar = this.f56099a;
            int size = rVar.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((p237x7.q) rVar.get(i11)).j(bVar, interfaceC1734nR, java.lang.Integer.valueOf(i10 & 14));
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new w.g.a(bVar, i6));
        }
    }

    public final void b() {
        this.f56099a.clear();
    }

    public final void c(p237x7.p pVar, androidx.compose.ui.d dVar, boolean z6, p237x7.q qVar, p237x7.a aVar) {
        this.f56099a.add(p031d0.c.c(262103052, true, new w.g.b(pVar, z6, dVar, qVar, aVar)));
    }
}
