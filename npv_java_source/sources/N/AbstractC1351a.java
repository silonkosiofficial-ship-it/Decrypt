package N;

/* JADX INFO: renamed from: N.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1351a {

    /* JADX INFO: renamed from: N.a$a, reason: collision with other inner class name */
    static final class C0177a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ N.InterfaceC1359i f7365D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p071h0.c f7366E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f7367F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f7368G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0177a(N.InterfaceC1359i interfaceC1359i, p071h0.c cVar, p237x7.p pVar, int i6) {
            super(2);
            this.f7365D = interfaceC1359i;
            this.f7366E = cVar;
            this.f7367F = pVar;
            this.f7368G = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            N.AbstractC1351a.a(this.f7365D, this.f7366E, this.f7367F, interfaceC1734n, V.S0.a(this.f7368G | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: N.a$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.A1 f7369D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f7370E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f7371F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f7372G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ N.InterfaceC1359i f7373H;

        /* JADX INFO: renamed from: N.a$b$a, reason: collision with other inner class name */
        static final class C0178a extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ long f7374D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ boolean f7375E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.d f7376F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ N.InterfaceC1359i f7377G;

            /* JADX INFO: renamed from: N.a$b$a$a, reason: collision with other inner class name */
            static final class C0179a extends p247y7.AbstractC7352v implements p237x7.a {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ N.InterfaceC1359i f7378D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0179a(N.InterfaceC1359i interfaceC1359i) {
                    super(0);
                    this.f7378D = interfaceC1359i;
                }

                @Override // p237x7.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean b() {
                    return java.lang.Boolean.valueOf(p131n0.h.c(this.f7378D.a()));
                }
            }

            /* JADX INFO: renamed from: N.a$b$a$b, reason: collision with other inner class name */
            static final class C0180b extends p247y7.AbstractC7352v implements p237x7.a {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ N.InterfaceC1359i f7379D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0180b(N.InterfaceC1359i interfaceC1359i) {
                    super(0);
                    this.f7379D = interfaceC1359i;
                }

                @Override // p237x7.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean b() {
                    return java.lang.Boolean.valueOf(p131n0.h.c(this.f7379D.a()));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0178a(long j6, boolean z6, androidx.compose.ui.d dVar, N.InterfaceC1359i interfaceC1359i) {
                super(2);
                this.f7374D = j6;
                this.f7375E = z6;
                this.f7376F = dVar;
                this.f7377G = interfaceC1359i;
            }

            public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
                if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                    interfaceC1734n.A();
                    return;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1426434671, i6, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:83)");
                }
                if (this.f7374D != 9205357640488583168L) {
                    interfaceC1734n.T(-837727128);
                    A.C0768b.e eVarB = this.f7375E ? A.C0768b.a.f89a.b() : A.C0768b.a.f89a.a();
                    androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.p.n(this.f7376F, Y0.l.h(this.f7374D), Y0.l.g(this.f7374D), 0.0f, 0.0f, 12, null);
                    N.InterfaceC1359i interfaceC1359i = this.f7377G;
                    boolean z6 = this.f7375E;
                    D0.I iB = A.I.b(eVarB, p071h0.c.f45778a.l(), interfaceC1734n, 0);
                    int iA = V.AbstractC1725k.a(interfaceC1734n, 0);
                    V.InterfaceC1758z interfaceC1758zF = interfaceC1734n.F();
                    androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734n, dVarN);
                    F0.InterfaceC0919g.a aVar = F0.InterfaceC0919g.f2641a;
                    p237x7.a aVarA = aVar.a();
                    if (!(interfaceC1734n.v() instanceof V.InterfaceC1713g)) {
                        V.AbstractC1725k.c();
                    }
                    interfaceC1734n.t();
                    if (interfaceC1734n.o()) {
                        interfaceC1734n.B(aVarA);
                    } else {
                        interfaceC1734n.H();
                    }
                    V.InterfaceC1734n interfaceC1734nA = V.L1.a(interfaceC1734n);
                    V.L1.c(interfaceC1734nA, iB, aVar.c());
                    V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar.e());
                    p237x7.p pVarB = aVar.b();
                    if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    }
                    V.L1.c(interfaceC1734nA, dVarE, aVar.d());
                    A.M m6 = A.M.f17a;
                    androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.f19586a;
                    boolean zL = interfaceC1734n.l(interfaceC1359i);
                    java.lang.Object objG = interfaceC1734n.g();
                    if (zL || objG == V.InterfaceC1734n.f14931a.a()) {
                        objG = new N.AbstractC1351a.b.C0178a.C0179a(interfaceC1359i);
                        interfaceC1734n.K(objG);
                    }
                    N.AbstractC1351a.c(aVar2, (p237x7.a) objG, z6, interfaceC1734n, 6);
                    interfaceC1734n.Q();
                } else {
                    interfaceC1734n.T(-836867312);
                    androidx.compose.ui.d dVar = this.f7376F;
                    boolean zL2 = interfaceC1734n.l(this.f7377G);
                    N.InterfaceC1359i interfaceC1359i2 = this.f7377G;
                    java.lang.Object objG2 = interfaceC1734n.g();
                    if (zL2 || objG2 == V.InterfaceC1734n.f14931a.a()) {
                        objG2 = new N.AbstractC1351a.b.C0178a.C0180b(interfaceC1359i2);
                        interfaceC1734n.K(objG2);
                    }
                    N.AbstractC1351a.c(dVar, (p237x7.a) objG2, this.f7375E, interfaceC1734n, 0);
                }
                interfaceC1734n.J();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
            }

            @Override // p237x7.p
            public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.platform.A1 a6, long j6, boolean z6, androidx.compose.ui.d dVar, N.InterfaceC1359i interfaceC1359i) {
            super(2);
            this.f7369D = a6;
            this.f7370E = j6;
            this.f7371F = z6;
            this.f7372G = dVar;
            this.f7373H = interfaceC1359i;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(280174801, i6, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:82)");
            }
            V.AbstractC1756y.a(androidx.compose.ui.platform.AbstractC1966p0.r().d(this.f7369D), p031d0.c.e(-1426434671, true, new N.AbstractC1351a.b.C0178a(this.f7370E, this.f7371F, this.f7372G, this.f7373H), interfaceC1734n, 54), interfaceC1734n, V.P0.f14698i | 48);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: N.a$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ N.InterfaceC1359i f7380D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f7381E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ X0.i f7382F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f7383G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ long f7384H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f7385I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f7386J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f7387K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(N.InterfaceC1359i interfaceC1359i, boolean z6, X0.i iVar, boolean z10, long j6, androidx.compose.ui.d dVar, int i6, int i10) {
            super(2);
            this.f7380D = interfaceC1359i;
            this.f7381E = z6;
            this.f7382F = iVar;
            this.f7383G = z10;
            this.f7384H = j6;
            this.f7385I = dVar;
            this.f7386J = i6;
            this.f7387K = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            N.AbstractC1351a.b(this.f7380D, this.f7381E, this.f7382F, this.f7383G, this.f7384H, this.f7385I, interfaceC1734n, V.S0.a(this.f7386J | 1), this.f7387K);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: N.a$d */
    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ N.InterfaceC1359i f7388D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f7389E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f7390F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(N.InterfaceC1359i interfaceC1359i, boolean z6, boolean z10) {
            super(1);
            this.f7388D = interfaceC1359i;
            this.f7389E = z6;
            this.f7390F = z10;
        }

        public final void a(K0.w wVar) {
            long jA = this.f7388D.a();
            wVar.d(N.v.d(), new N.u(this.f7389E ? H.EnumC1219k.SelectionStart : H.EnumC1219k.SelectionEnd, jA, this.f7390F ? N.t.Left : N.t.Right, p131n0.h.c(jA), null));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((K0.w) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: N.a$e */
    static final class e extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f7391D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.a f7392E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f7393F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f7394G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.d dVar, p237x7.a aVar, boolean z6, int i6) {
            super(2);
            this.f7391D = dVar;
            this.f7392E = aVar;
            this.f7393F = z6;
            this.f7394G = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            N.AbstractC1351a.c(this.f7391D, this.f7392E, this.f7393F, interfaceC1734n, V.S0.a(this.f7394G | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: N.a$f */
    static final class f extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.a f7395D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f7396E;

        /* JADX INFO: renamed from: N.a$f$a, reason: collision with other inner class name */
        static final class C0181a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ long f7397D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p237x7.a f7398E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ boolean f7399F;

            /* JADX INFO: renamed from: N.a$f$a$a, reason: collision with other inner class name */
            static final class C0182a extends p247y7.AbstractC7352v implements p237x7.l {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ p237x7.a f7400D;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                final /* synthetic */ boolean f7401E;

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                final /* synthetic */ p141o0.E1 f7402F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                final /* synthetic */ p141o0.AbstractC7019z0 f7403G;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0182a(p237x7.a aVar, boolean z6, p141o0.E1 e6, p141o0.AbstractC7019z0 abstractC7019z0) {
                    super(1);
                    this.f7400D = aVar;
                    this.f7401E = z6;
                    this.f7402F = e6;
                    this.f7403G = abstractC7019z0;
                }

                public final void a(p161q0.c cVar) {
                    cVar.l1();
                    if (((java.lang.Boolean) this.f7400D.b()).booleanValue()) {
                        boolean z6 = this.f7401E;
                        p141o0.E1 e6 = this.f7402F;
                        p141o0.AbstractC7019z0 abstractC7019z0 = this.f7403G;
                        if (!z6) {
                            p161q0.f.g(cVar, e6, 0L, 0.0f, null, abstractC7019z0, 0, 46, null);
                            return;
                        }
                        long jW0 = cVar.W0();
                        p161q0.d dVarF0 = cVar.F0();
                        long jI = dVarF0.i();
                        dVarF0.h().m();
                        try {
                            dVarF0.c().e(-1.0f, 1.0f, jW0);
                            p161q0.f.g(cVar, e6, 0L, 0.0f, null, abstractC7019z0, 0, 46, null);
                        } finally {
                            dVarF0.h().s();
                            dVarF0.d(jI);
                        }
                    }
                }

                @Override // p237x7.l
                public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                    a((p161q0.c) obj);
                    return p087i7.M.f46721a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0181a(long j6, p237x7.a aVar, boolean z6) {
                super(1);
                this.f7397D = j6;
                this.f7398E = aVar;
                this.f7399F = z6;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p111l0.h l(p111l0.d dVar) {
                return dVar.s(new N.AbstractC1351a.f.C0181a.C0182a(this.f7398E, this.f7399F, N.AbstractC1351a.d(dVar, p131n0.m.i(dVar.i()) / 2.0f), p141o0.AbstractC7019z0.a.b(p141o0.AbstractC7019z0.f52280b, this.f7397D, 0, 2, null)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p237x7.a aVar, boolean z6) {
            super(3);
            this.f7395D = aVar;
            this.f7396E = z6;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(-196777734);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-196777734, i6, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:134)");
            }
            long jB = ((N.J) interfaceC1734n.n(N.K.b())).b();
            boolean zJ = interfaceC1734n.j(jB) | interfaceC1734n.S(this.f7395D) | interfaceC1734n.d(this.f7396E);
            p237x7.a aVar = this.f7395D;
            boolean z6 = this.f7396E;
            java.lang.Object objG = interfaceC1734n.g();
            if (zJ || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new N.AbstractC1351a.f.C0181a(jB, aVar, z6);
                interfaceC1734n.K(objG);
            }
            androidx.compose.ui.d dVarC = androidx.compose.ui.draw.b.c(dVar, (p237x7.l) objG);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return dVarC;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    public static final void a(N.InterfaceC1359i interfaceC1359i, p071h0.c cVar, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(476043083);
        if ((i6 & 6) == 0) {
            i10 = ((i6 & 8) == 0 ? interfaceC1734nR.S(interfaceC1359i) : interfaceC1734nR.l(interfaceC1359i) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.S(cVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i10 |= interfaceC1734nR.l(pVar) ? 256 : 128;
        }
        if ((i10 & 147) == 146 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(476043083, i10, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:247)");
            }
            boolean z6 = false;
            boolean z10 = (i10 & 112) == 32;
            if ((i10 & 14) == 4 || ((i10 & 8) != 0 && interfaceC1734nR.S(interfaceC1359i))) {
                z6 = true;
            }
            boolean z11 = z10 | z6;
            java.lang.Object objG = interfaceC1734nR.g();
            if (z11 || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new N.C1357g(cVar, interfaceC1359i);
                interfaceC1734nR.K(objG);
            }
            androidx.compose.ui.window.b.a((N.C1357g) objG, null, new androidx.compose.ui.window.s(false, false, false, null, true, false, 15, null), pVar, interfaceC1734nR, ((i10 << 3) & 7168) | 384, 2);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new N.AbstractC1351a.C0177a(interfaceC1359i, cVar, pVar, i6));
        }
    }

    public static final void b(N.InterfaceC1359i interfaceC1359i, boolean z6, X0.i iVar, boolean z10, long j6, androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        long jA;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-843755800);
        if ((i10 & 1) != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = ((i6 & 8) == 0 ? interfaceC1734nR.S(interfaceC1359i) : interfaceC1734nR.l(interfaceC1359i) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        if ((i10 & 2) != 0) {
            i11 |= 48;
        } else if ((i6 & 48) == 0) {
            i11 |= interfaceC1734nR.d(z6) ? 32 : 16;
        }
        if ((i10 & 4) != 0) {
            i11 |= 384;
        } else if ((i6 & 384) == 0) {
            i11 |= interfaceC1734nR.S(iVar) ? 256 : 128;
        }
        if ((i10 & 8) != 0) {
            i11 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i11 |= interfaceC1734nR.d(z10) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            jA = j6;
            i11 |= ((i10 & 16) == 0 && interfaceC1734nR.j(jA)) ? 16384 : 8192;
        } else {
            jA = j6;
        }
        if ((i10 & 32) != 0) {
            i11 |= 196608;
        } else if ((i6 & 196608) == 0) {
            i11 |= interfaceC1734nR.S(dVar) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0 && !interfaceC1734nR.G()) {
                interfaceC1734nR.A();
                if ((i10 & 16) != 0) {
                    i11 &= -57345;
                }
            } else if ((i10 & 16) != 0) {
                jA = Y0.l.f16217b.a();
                i11 &= -57345;
            }
            long j10 = jA;
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-843755800, i11, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:64)");
            }
            boolean zF = N.v.f(z6, iVar, z10);
            p071h0.a aVar = p071h0.a.f45769a;
            p071h0.c cVarD = zF ? aVar.d() : aVar.c();
            int i12 = i11 & 14;
            boolean zD = ((i11 & 112) == 32) | (i12 == 4 || ((i11 & 8) != 0 && interfaceC1734nR.l(interfaceC1359i))) | interfaceC1734nR.d(zF);
            java.lang.Object objG = interfaceC1734nR.g();
            if (zD || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new N.AbstractC1351a.d(interfaceC1359i, z6, zF);
                interfaceC1734nR.K(objG);
            }
            a(interfaceC1359i, cVarD, p031d0.c.e(280174801, true, new N.AbstractC1351a.b((androidx.compose.ui.platform.A1) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.r()), j10, zF, K0.n.d(dVar, false, (p237x7.l) objG, 1, null), interfaceC1359i), interfaceC1734nR, 54), interfaceC1734nR, i12 | 384);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            jA = j10;
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new N.AbstractC1351a.c(interfaceC1359i, z6, iVar, z10, jA, dVar, i6, i10));
        }
    }

    public static final void c(androidx.compose.ui.d dVar, p237x7.a aVar, boolean z6, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(2111672474);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.S(dVar) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.l(aVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i10 |= interfaceC1734nR.d(z6) ? 256 : 128;
        }
        if ((i10 & 147) == 146 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(2111672474, i10, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:122)");
            }
            A.N.a(e(androidx.compose.foundation.layout.p.q(dVar, N.v.c(), N.v.b()), aVar, z6), interfaceC1734nR, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new N.AbstractC1351a.e(dVar, aVar, z6, i6));
        }
    }

    public static final p141o0.E1 d(p111l0.d dVar, float f6) {
        int iCeil = ((int) java.lang.Math.ceil(f6)) * 2;
        N.C1356f c1356f = N.C1356f.f7420a;
        p141o0.E1 e1C = c1356f.c();
        p141o0.InterfaceC6993q0 interfaceC6993q0A = c1356f.a();
        p161q0.a aVarB = c1356f.b();
        if (e1C == null || interfaceC6993q0A == null || iCeil > e1C.getWidth() || iCeil > e1C.getHeight()) {
            e1C = p141o0.G1.b(iCeil, iCeil, p141o0.F1.f52118b.a(), false, null, 24, null);
            c1356f.f(e1C);
            interfaceC6993q0A = p141o0.AbstractC6998s0.a(e1C);
            c1356f.d(interfaceC6993q0A);
        }
        p141o0.E1 e6 = e1C;
        p141o0.InterfaceC6993q0 interfaceC6993q0 = interfaceC6993q0A;
        if (aVarB == null) {
            aVarB = new p161q0.a();
            c1356f.e(aVarB);
        }
        p161q0.a aVar = aVarB;
        Y0.v layoutDirection = dVar.getLayoutDirection();
        long jA = p131n0.n.a(e6.getWidth(), e6.getHeight());
        p161q0.a.C0685a c0685aH = aVar.H();
        Y0.e eVarA = c0685aH.a();
        Y0.v vVarB = c0685aH.b();
        p141o0.InterfaceC6993q0 interfaceC6993q0C = c0685aH.c();
        long jD = c0685aH.d();
        p161q0.a.C0685a c0685aH2 = aVar.H();
        c0685aH2.j(dVar);
        c0685aH2.k(layoutDirection);
        c0685aH2.i(interfaceC6993q0);
        c0685aH2.l(jA);
        interfaceC6993q0.m();
        p161q0.f.m(aVar, p141o0.C7016y0.f52264b.a(), 0L, aVar.i(), 0.0f, null, null, p141o0.AbstractC6960f0.f52197a.a(), 58, null);
        p161q0.f.m(aVar, p141o0.A0.d(4278190080L), p131n0.g.f51312b.c(), p131n0.n.a(f6, f6), 0.0f, null, null, 0, 120, null);
        p161q0.f.e(aVar, p141o0.A0.d(4278190080L), f6, p131n0.h.a(f6, f6), 0.0f, null, null, 0, 120, null);
        interfaceC6993q0.s();
        p161q0.a.C0685a c0685aH3 = aVar.H();
        c0685aH3.j(eVarA);
        c0685aH3.k(vVarB);
        c0685aH3.i(interfaceC6993q0C);
        c0685aH3.l(jD);
        return e6;
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar, p237x7.a aVar, boolean z6) {
        return androidx.compose.ui.c.c(dVar, null, new N.AbstractC1351a.f(aVar, z6), 1, null);
    }
}
