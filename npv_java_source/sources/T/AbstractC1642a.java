package T;

/* JADX INFO: renamed from: T.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1642a {

    /* JADX INFO: renamed from: T.a$a, reason: collision with other inner class name */
    static final class C0270a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final T.AbstractC1642a.C0270a f12786D = new T.AbstractC1642a.C0270a();

        C0270a() {
            super(1);
        }

        public final void a(androidx.lifecycle.AbstractC2079k.a aVar) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((androidx.lifecycle.AbstractC2079k.a) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: T.a$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final T.AbstractC1642a.b f12787D = new T.AbstractC1642a.b();

        b() {
            super(0);
        }

        public final void a() {
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: T.a$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.r f12788D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.l f12789E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.a f12790F;

        /* JADX INFO: renamed from: T.a$c$a, reason: collision with other inner class name */
        public static final class C0271a implements V.M {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p237x7.a f12791a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.r f12792b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.InterfaceC2083o f12793c;

            public C0271a(p237x7.a aVar, androidx.lifecycle.r rVar, androidx.lifecycle.InterfaceC2083o interfaceC2083o) {
                this.f12791a = aVar;
                this.f12792b = rVar;
                this.f12793c = interfaceC2083o;
            }

            @Override // V.M
            public void e() {
                this.f12791a.b();
                this.f12792b.u().d(this.f12793c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.lifecycle.r rVar, p237x7.l lVar, p237x7.a aVar) {
            super(1);
            this.f12788D = rVar;
            this.f12789E = lVar;
            this.f12790F = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(p237x7.l lVar, androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
            lVar.l(aVar);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final V.M l(V.N n6) {
            final p237x7.l lVar = this.f12789E;
            androidx.lifecycle.InterfaceC2083o interfaceC2083o = new androidx.lifecycle.InterfaceC2083o() { // from class: T.b
                @Override // androidx.lifecycle.InterfaceC2083o
                public final void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
                    T.AbstractC1642a.c.f(lVar, rVar, aVar);
                }
            };
            this.f12788D.u().a(interfaceC2083o);
            return new T.AbstractC1642a.c.C0271a(this.f12790F, this.f12788D, interfaceC2083o);
        }
    }

    /* JADX INFO: renamed from: T.a$d */
    static final class d extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.r f12794D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.l f12795E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.a f12796F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f12797G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f12798H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.lifecycle.r rVar, p237x7.l lVar, p237x7.a aVar, int i6, int i10) {
            super(2);
            this.f12794D = rVar;
            this.f12795E = lVar;
            this.f12796F = aVar;
            this.f12797G = i6;
            this.f12798H = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            T.AbstractC1642a.a(this.f12794D, this.f12795E, this.f12796F, interfaceC1734n, V.S0.a(this.f12797G | 1), this.f12798H);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: T.a$e */
    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ T.s f12799D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ android.view.accessibility.AccessibilityManager f12800E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(T.s sVar, android.view.accessibility.AccessibilityManager accessibilityManager) {
            super(1);
            this.f12799D = sVar;
            this.f12800E = accessibilityManager;
        }

        public final void a(androidx.lifecycle.AbstractC2079k.a aVar) {
            if (aVar == androidx.lifecycle.AbstractC2079k.a.ON_RESUME) {
                this.f12799D.q(this.f12800E);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((androidx.lifecycle.AbstractC2079k.a) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: T.a$f */
    static final class f extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ T.s f12801D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ android.view.accessibility.AccessibilityManager f12802E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(T.s sVar, android.view.accessibility.AccessibilityManager accessibilityManager) {
            super(0);
            this.f12801D = sVar;
            this.f12802E = accessibilityManager;
        }

        public final void a() {
            this.f12801D.s(this.f12802E);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(androidx.lifecycle.r rVar, p237x7.l lVar, p237x7.a aVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1868327245);
        if ((i10 & 1) != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.l(rVar) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        int i12 = i10 & 2;
        if (i12 != 0) {
            i11 |= 48;
        } else if ((i6 & 48) == 0) {
            i11 |= interfaceC1734nR.l(lVar) ? 32 : 16;
        }
        int i13 = i10 & 4;
        if (i13 != 0) {
            i11 |= 384;
        } else if ((i6 & 384) == 0) {
            i11 |= interfaceC1734nR.l(aVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (i12 != 0) {
                lVar = T.AbstractC1642a.C0270a.f12786D;
            }
            if (i13 != 0) {
                aVar = T.AbstractC1642a.b.f12787D;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1868327245, i11, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:74)");
            }
            boolean zL = ((i11 & 112) == 32) | interfaceC1734nR.l(rVar) | ((i11 & 896) == 256);
            java.lang.Object objG = interfaceC1734nR.g();
            if (zL || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new T.AbstractC1642a.c(rVar, lVar, aVar);
                interfaceC1734nR.K(objG);
            }
            V.Q.b(rVar, (p237x7.l) objG, interfaceC1734nR, i11 & 14);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        p237x7.l lVar2 = lVar;
        p237x7.a aVar2 = aVar;
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new T.AbstractC1642a.d(rVar, lVar2, aVar2, i6, i10));
        }
    }

    public static final V.G1 c(boolean z6, boolean z10, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        boolean z11 = true;
        if ((i10 & 1) != 0) {
            z6 = true;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1771705152, i6, -1, "androidx.compose.material3.internal.rememberAccessibilityServiceState (AccessibilityServiceStateProvider.android.kt:46)");
        }
        java.lang.Object systemService = ((android.content.Context) interfaceC1734n.n(androidx.compose.ui.platform.T.g())).getSystemService("accessibility");
        p247y7.AbstractC7350t.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        boolean z12 = (((i6 & 14) ^ 6) > 4 && interfaceC1734n.d(z6)) || (i6 & 6) == 4;
        if ((((i6 & 112) ^ 48) <= 32 || !interfaceC1734n.d(z10)) && (i6 & 48) != 32) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        java.lang.Object objG = interfaceC1734n.g();
        if (z13 || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new T.s(z6, z10);
            interfaceC1734n.K(objG);
        }
        T.s sVar = (T.s) objG;
        androidx.lifecycle.r rVar = (androidx.lifecycle.r) interfaceC1734n.n(p003a2.a.a());
        boolean zS = interfaceC1734n.S(sVar) | interfaceC1734n.l(accessibilityManager);
        java.lang.Object objG2 = interfaceC1734n.g();
        if (zS || objG2 == V.InterfaceC1734n.f14931a.a()) {
            objG2 = new T.AbstractC1642a.e(sVar, accessibilityManager);
            interfaceC1734n.K(objG2);
        }
        p237x7.l lVar = (p237x7.l) objG2;
        boolean zS2 = interfaceC1734n.S(sVar) | interfaceC1734n.l(accessibilityManager);
        java.lang.Object objG3 = interfaceC1734n.g();
        if (zS2 || objG3 == V.InterfaceC1734n.f14931a.a()) {
            objG3 = new T.AbstractC1642a.f(sVar, accessibilityManager);
            interfaceC1734n.K(objG3);
        }
        a(rVar, lVar, (p237x7.a) objG3, interfaceC1734n, 0, 0);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return sVar;
    }
}
