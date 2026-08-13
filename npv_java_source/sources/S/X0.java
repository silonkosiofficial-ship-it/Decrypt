package S;

/* JADX INFO: loaded from: classes.dex */
public abstract class X0 {

    static final class a extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ S.U0 f10571D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ S.U0 f10572E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ java.util.List f10573F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ S.C1542e0 f10574G;

        /* JADX INFO: renamed from: S.X0$a$a, reason: collision with other inner class name */
        static final class C0236a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ S.U0 f10575D;

            /* JADX INFO: renamed from: S.X0$a$a$a, reason: collision with other inner class name */
            static final class C0237a extends p247y7.AbstractC7352v implements p237x7.a {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ S.U0 f10576D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0237a(S.U0 u6) {
                    super(0);
                    this.f10576D = u6;
                }

                @Override // p237x7.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean b() {
                    this.f10576D.dismiss();
                    return java.lang.Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0236a(S.U0 u6) {
                super(1);
                this.f10575D = u6;
            }

            public final void a(K0.w wVar) {
                K0.u.U(wVar, K0.f.f5947b.b());
                K0.u.l(wVar, null, new S.X0.a.C0236a.C0237a(this.f10575D), 1, null);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((K0.w) obj);
                return p087i7.M.f46721a;
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ S.U0 f10577D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ S.C1542e0 f10578E;

            /* JADX INFO: renamed from: S.X0$a$b$a, reason: collision with other inner class name */
            static final class C0238a extends p247y7.AbstractC7352v implements p237x7.l {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ S.U0 f10579D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0238a(S.U0 u6) {
                    super(1);
                    this.f10579D = u6;
                }

                @Override // p237x7.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean l(S.C1540d0 c1540d0) {
                    return java.lang.Boolean.valueOf(p247y7.AbstractC7350t.b(c1540d0.c(), this.f10579D));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(S.U0 u6, S.C1542e0 c1542e0) {
                super(0);
                this.f10577D = u6;
                this.f10578E = c1542e0;
            }

            public final void a() {
                if (p247y7.AbstractC7350t.b(this.f10577D, this.f10578E.a())) {
                    return;
                }
                p097j7.AbstractC6879v.I(this.f10578E.b(), new S.X0.a.b.C0238a(this.f10577D));
                V.Q0 q0C = this.f10578E.c();
                if (q0C != null) {
                    q0C.invalidate();
                }
            }

            @Override // p237x7.a
            public /* bridge */ /* synthetic */ java.lang.Object b() {
                a();
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(S.U0 u6, S.U0 u10, java.util.List list, S.C1542e0 c1542e0) {
            super(3);
            this.f10571D = u6;
            this.f10572E = u10;
            this.f10573F = list;
            this.f10574G = c1542e0;
        }

        public final void a(p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            int i10;
            if ((i6 & 6) == 0) {
                i10 = i6 | (interfaceC1734n.l(pVar) ? 4 : 2);
            } else {
                i10 = i6;
            }
            if ((i10 & 19) == 18 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1654683077, i10, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:338)");
            }
            boolean zB = p247y7.AbstractC7350t.b(this.f10571D, this.f10572E);
            int i11 = zB ? 150 : 75;
            int i12 = (!zB || p002a1.a.b(this.f10573F).size() == 1) ? 0 : 75;
            p200u.w0 w0VarK = p200u.AbstractC7177k.k(i11, i12, p200u.H.e());
            boolean zS = interfaceC1734n.S(this.f10571D) | interfaceC1734n.l(this.f10574G);
            S.U0 u6 = this.f10571D;
            S.C1542e0 c1542e0 = this.f10574G;
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new S.X0.a.b(u6, c1542e0);
                interfaceC1734n.K(objG);
            }
            V.G1 g1F = S.X0.f(w0VarK, zB, (p237x7.a) objG, interfaceC1734n, 0, 0);
            V.G1 g1G = S.X0.g(p200u.AbstractC7177k.k(i11, i12, p200u.H.d()), zB, interfaceC1734n, 0);
            androidx.compose.ui.d dVarC = androidx.compose.ui.graphics.b.c(androidx.compose.ui.d.f19586a, ((java.lang.Number) g1G.getValue()).floatValue(), ((java.lang.Number) g1G.getValue()).floatValue(), ((java.lang.Number) g1F.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
            boolean zS2 = interfaceC1734n.S(this.f10571D);
            S.U0 u10 = this.f10571D;
            java.lang.Object objG2 = interfaceC1734n.g();
            if (zS2 || objG2 == V.InterfaceC1734n.f14931a.a()) {
                objG2 = new S.X0.a.C0236a(u10);
                interfaceC1734n.K(objG2);
            }
            androidx.compose.ui.d dVarD = K0.n.d(dVarC, false, (p237x7.l) objG2, 1, null);
            D0.I iH = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
            int iA = V.AbstractC1725k.a(interfaceC1734n, 0);
            V.InterfaceC1758z interfaceC1758zF = interfaceC1734n.F();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734n, dVarD);
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
            V.L1.c(interfaceC1734nA, iH, aVar.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar.e());
            p237x7.p pVarB = aVar.b();
            if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE, aVar.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f19260a;
            pVar.u(interfaceC1734n, java.lang.Integer.valueOf(i10 & 14));
            interfaceC1734n.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            a((p237x7.p) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.q f10580D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ S.U0 f10581E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p237x7.q qVar, S.U0 u6) {
            super(2);
            this.f10580D = qVar;
            this.f10581E = u6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1135367807, i6, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:395)");
            }
            p237x7.q qVar = this.f10580D;
            S.U0 u6 = this.f10581E;
            p247y7.AbstractC7350t.c(u6);
            qVar.j(u6, interfaceC1734n, 0);
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

    static final class c extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ S.U0 f10582D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10583E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.q f10584F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f10585G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f10586H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(S.U0 u6, androidx.compose.ui.d dVar, p237x7.q qVar, int i6, int i10) {
            super(2);
            this.f10582D = u6;
            this.f10583E = dVar;
            this.f10584F = qVar;
            this.f10585G = i6;
            this.f10586H = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.X0.a(this.f10582D, this.f10583E, this.f10584F, interfaceC1734n, V.S0.a(this.f10585G | 1), this.f10586H);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f10587G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ S.U0 f10588H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.InterfaceC1944i f10589I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(S.U0 u6, androidx.compose.ui.platform.InterfaceC1944i interfaceC1944i, p127m7.e eVar) {
            super(2, eVar);
            this.f10588H = u6;
            this.f10589I = interfaceC1944i;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f10587G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                S.U0 u6 = this.f10588H;
                if (u6 != null) {
                    long jH = S.X0.h(u6.b().c(), this.f10588H.b().b() != null, this.f10589I);
                    this.f10587G = 1;
                    if (W8.Y.a(jH, this) == objG) {
                        return objG;
                    }
                }
                return p087i7.M.f46721a;
            }
            if (i6 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            this.f10588H.dismiss();
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((S.X0.d) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new S.X0.d(this.f10588H, this.f10589I, eVar);
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ S.Y0 f10590D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10591E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.q f10592F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f10593G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f10594H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(S.Y0 y6, androidx.compose.ui.d dVar, p237x7.q qVar, int i6, int i10) {
            super(2);
            this.f10590D = y6;
            this.f10591E = dVar;
            this.f10592F = qVar;
            this.f10593G = i6;
            this.f10594H = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.X0.b(this.f10590D, this.f10591E, this.f10592F, interfaceC1734n, V.S0.a(this.f10593G | 1), this.f10594H);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10595a;

        static {
            int[] iArr = new int[S.W0.values().length];
            try {
                iArr[S.W0.Indefinite.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[S.W0.Long.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[S.W0.Short.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f10595a = iArr;
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.X0.g f10596D = new S.X0.g();

        g() {
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

    static final class h extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f10597G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p200u.C7157a f10598H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ boolean f10599I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p200u.InterfaceC7175j f10600J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p237x7.a f10601K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(p200u.C7157a c7157a, boolean z6, p200u.InterfaceC7175j interfaceC7175j, p237x7.a aVar, p127m7.e eVar) {
            super(2, eVar);
            this.f10598H = c7157a;
            this.f10599I = z6;
            this.f10600J = interfaceC7175j;
            this.f10601K = aVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f10597G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p200u.C7157a c7157a = this.f10598H;
                java.lang.Float fB = p147o7.b.b(this.f10599I ? 1.0f : 0.0f);
                p200u.InterfaceC7175j interfaceC7175j = this.f10600J;
                this.f10597G = 1;
                if (p200u.C7157a.f(c7157a, fB, interfaceC7175j, null, null, this, 12, null) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            this.f10601K.b();
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((S.X0.h) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new S.X0.h(this.f10598H, this.f10599I, this.f10600J, this.f10601K, eVar);
        }
    }

    static final class i extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f10602G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p200u.C7157a f10603H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ boolean f10604I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p200u.InterfaceC7175j f10605J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(p200u.C7157a c7157a, boolean z6, p200u.InterfaceC7175j interfaceC7175j, p127m7.e eVar) {
            super(2, eVar);
            this.f10603H = c7157a;
            this.f10604I = z6;
            this.f10605J = interfaceC7175j;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f10602G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p200u.C7157a c7157a = this.f10603H;
                java.lang.Float fB = p147o7.b.b(this.f10604I ? 1.0f : 0.8f);
                p200u.InterfaceC7175j interfaceC7175j = this.f10605J;
                this.f10602G = 1;
                if (p200u.C7157a.f(c7157a, fB, interfaceC7175j, null, null, this, 12, null) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((S.X0.i) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new S.X0.i(this.f10603H, this.f10604I, this.f10605J, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bf A[LOOP:0: B:52:0x00bd->B:53:0x00bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5 A[LOOP:1: B:58:0x00f3->B:59:0x00f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x013e  */
    /* JADX WARN: Code duplicated, block: B:66:0x014a  */
    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
    /* JADX WARN: Code duplicated, block: B:70:0x016d  */
    /* JADX WARN: Code duplicated, block: B:72:0x017b  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ab A[LOOP:2: B:74:0x01a9->B:75:0x01ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void a(S.U0 u6, androidx.compose.ui.d dVar, p237x7.q qVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        androidx.compose.ui.d dVar2;
        int i12;
        java.lang.Object objG;
        S.C1542e0 c1542e0;
        int iA;
        p237x7.a aVarA;
        V.InterfaceC1734n interfaceC1734nA;
        p237x7.p pVarB;
        java.util.List listB;
        int size;
        int i13;
        java.util.List listB2;
        java.util.ArrayList arrayList;
        int size2;
        int i14;
        java.util.List listW0;
        java.util.List listB3;
        java.util.List listB4;
        int size3;
        int i15;
        androidx.compose.ui.d dVar3;
        V.InterfaceC1709e1 interfaceC1709e1X;
        S.U0 u10 = u6;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1316639904);
        if ((i10 & 1) != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.S(u10) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        int i16 = i10 & 2;
        if (i16 == 0) {
            if ((i6 & 48) == 0) {
                dVar2 = dVar;
                i11 |= interfaceC1734nR.S(dVar2) ? 32 : 16;
            }
            if ((i10 & 4) != 0) {
                i11 |= 384;
            } else if ((i6 & 384) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i12 = 256;
                } else {
                    i12 = 128;
                }
                i11 |= i12;
            }
            if ((i11 & 147) == 146 || !interfaceC1734nR.u()) {
                if (i16 != 0) {
                    dVar2 = androidx.compose.ui.d.f19586a;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1316639904, i11, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:327)");
                }
                objG = interfaceC1734nR.g();
                if (objG == V.InterfaceC1734n.f14931a.a()) {
                    objG = new S.C1542e0();
                    interfaceC1734nR.K(objG);
                }
                c1542e0 = (S.C1542e0) objG;
                interfaceC1734nR.T(-1256811491);
                if (!p247y7.AbstractC7350t.b(u10, c1542e0.a())) {
                    c1542e0.d(u10);
                    listB2 = c1542e0.b();
                    arrayList = new java.util.ArrayList(listB2.size());
                    size2 = listB2.size();
                    for (i14 = 0; i14 < size2; i14++) {
                        arrayList.add((S.U0) ((S.C1540d0) listB2.get(i14)).c());
                    }
                    listW0 = p097j7.AbstractC6879v.W0(arrayList);
                    if (!listW0.contains(u10)) {
                        listW0.add(u10);
                    }
                    c1542e0.b().clear();
                    listB3 = p002a1.a.b(listW0);
                    listB4 = c1542e0.b();
                    size3 = listB3.size();
                    i15 = 0;
                    while (i15 < size3) {
                        S.U0 u11 = (S.U0) listB3.get(i15);
                        listB4.add(new S.C1540d0(u11, p031d0.c.e(-1654683077, true, new S.X0.a(u11, u10, listW0, c1542e0), interfaceC1734nR, 54)));
                        i15++;
                        u10 = u6;
                    }
                }
                interfaceC1734nR.J();
                D0.I iH = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
                iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
                V.InterfaceC1758z interfaceC1758zF = interfaceC1734nR.F();
                androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734nR, dVar2);
                F0.InterfaceC0919g.a aVar = F0.InterfaceC0919g.f2641a;
                aVarA = aVar.a();
                if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                    V.AbstractC1725k.c();
                }
                interfaceC1734nR.t();
                if (interfaceC1734nR.o()) {
                    interfaceC1734nR.B(aVarA);
                } else {
                    interfaceC1734nR.H();
                }
                interfaceC1734nA = V.L1.a(interfaceC1734nR);
                V.L1.c(interfaceC1734nA, iH, aVar.c());
                V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar.e());
                pVarB = aVar.b();
                if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                }
                V.L1.c(interfaceC1734nA, dVarE, aVar.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f19260a;
                c1542e0.e(V.AbstractC1725k.b(interfaceC1734nR, 0));
                interfaceC1734nR.T(1748085441);
                listB = c1542e0.b();
                size = listB.size();
                for (i13 = 0; i13 < size; i13++) {
                    S.C1540d0 c1540d0 = (S.C1540d0) listB.get(i13);
                    S.U0 u12 = (S.U0) c1540d0.a();
                    p237x7.q qVarB = c1540d0.b();
                    interfaceC1734nR.s(1201076541, u12);
                    qVarB.j(p031d0.c.e(-1135367807, true, new S.X0.b(qVar, u12), interfaceC1734nR, 54), interfaceC1734nR, 6);
                    interfaceC1734nR.N();
                }
                interfaceC1734nR.J();
                interfaceC1734nR.Q();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
            } else {
                interfaceC1734nR.A();
            }
            dVar3 = dVar2;
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.X0.c(u6, dVar3, qVar, i6, i10));
            }
        }
        i11 |= 48;
        dVar2 = dVar;
        if ((i10 & 4) != 0) {
            i11 |= 384;
        } else if ((i6 & 384) == 0) {
            if (interfaceC1734nR.l(qVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146) {
            if (i16 != 0) {
                dVar2 = androidx.compose.ui.d.f19586a;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1316639904, i11, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:327)");
            }
            objG = interfaceC1734nR.g();
            if (objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new S.C1542e0();
                interfaceC1734nR.K(objG);
            }
            c1542e0 = (S.C1542e0) objG;
            interfaceC1734nR.T(-1256811491);
            if (!p247y7.AbstractC7350t.b(u10, c1542e0.a())) {
                c1542e0.d(u10);
                listB2 = c1542e0.b();
                arrayList = new java.util.ArrayList(listB2.size());
                size2 = listB2.size();
                while (i14 < size2) {
                    arrayList.add((S.U0) ((S.C1540d0) listB2.get(i14)).c());
                }
                listW0 = p097j7.AbstractC6879v.W0(arrayList);
                if (!listW0.contains(u10)) {
                    listW0.add(u10);
                }
                c1542e0.b().clear();
                listB3 = p002a1.a.b(listW0);
                listB4 = c1542e0.b();
                size3 = listB3.size();
                i15 = 0;
                while (i15 < size3) {
                    S.U0 u13 = (S.U0) listB3.get(i15);
                    listB4.add(new S.C1540d0(u13, p031d0.c.e(-1654683077, true, new S.X0.a(u13, u10, listW0, c1542e0), interfaceC1734nR, 54)));
                    i15++;
                    u10 = u6;
                }
            }
            interfaceC1734nR.J();
            D0.I iH2 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
            iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
            V.InterfaceC1758z interfaceC1758zF2 = interfaceC1734nR.F();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(interfaceC1734nR, dVar2);
            F0.InterfaceC0919g.a aVar2 = F0.InterfaceC0919g.f2641a;
            aVarA = aVar2.a();
            if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                V.AbstractC1725k.c();
            }
            interfaceC1734nR.t();
            if (interfaceC1734nR.o()) {
                interfaceC1734nR.B(aVarA);
            } else {
                interfaceC1734nR.H();
            }
            interfaceC1734nA = V.L1.a(interfaceC1734nR);
            V.L1.c(interfaceC1734nA, iH2, aVar2.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF2, aVar2.e());
            pVarB = aVar2.b();
            if (interfaceC1734nA.o()) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            } else {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE2, aVar2.d());
            androidx.compose.foundation.layout.f fVar2 = androidx.compose.foundation.layout.f.f19260a;
            c1542e0.e(V.AbstractC1725k.b(interfaceC1734nR, 0));
            interfaceC1734nR.T(1748085441);
            listB = c1542e0.b();
            size = listB.size();
            while (i13 < size) {
                S.C1540d0 c1540d1 = (S.C1540d0) listB.get(i13);
                S.U0 u14 = (S.U0) c1540d1.a();
                p237x7.q qVarB2 = c1540d1.b();
                interfaceC1734nR.s(1201076541, u14);
                qVarB2.j(p031d0.c.e(-1135367807, true, new S.X0.b(qVar, u14), interfaceC1734nR, 54), interfaceC1734nR, 6);
                interfaceC1734nR.N();
            }
            interfaceC1734nR.J();
            interfaceC1734nR.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        } else {
            if (i16 != 0) {
                dVar2 = androidx.compose.ui.d.f19586a;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1316639904, i11, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:327)");
            }
            objG = interfaceC1734nR.g();
            if (objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new S.C1542e0();
                interfaceC1734nR.K(objG);
            }
            c1542e0 = (S.C1542e0) objG;
            interfaceC1734nR.T(-1256811491);
            if (!p247y7.AbstractC7350t.b(u10, c1542e0.a())) {
                c1542e0.d(u10);
                listB2 = c1542e0.b();
                arrayList = new java.util.ArrayList(listB2.size());
                size2 = listB2.size();
                while (i14 < size2) {
                    arrayList.add((S.U0) ((S.C1540d0) listB2.get(i14)).c());
                }
                listW0 = p097j7.AbstractC6879v.W0(arrayList);
                if (!listW0.contains(u10)) {
                    listW0.add(u10);
                }
                c1542e0.b().clear();
                listB3 = p002a1.a.b(listW0);
                listB4 = c1542e0.b();
                size3 = listB3.size();
                i15 = 0;
                while (i15 < size3) {
                    S.U0 u15 = (S.U0) listB3.get(i15);
                    listB4.add(new S.C1540d0(u15, p031d0.c.e(-1654683077, true, new S.X0.a(u15, u10, listW0, c1542e0), interfaceC1734nR, 54)));
                    i15++;
                    u10 = u6;
                }
            }
            interfaceC1734nR.J();
            D0.I iH3 = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.o(), false);
            iA = V.AbstractC1725k.a(interfaceC1734nR, 0);
            V.InterfaceC1758z interfaceC1758zF3 = interfaceC1734nR.F();
            androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(interfaceC1734nR, dVar2);
            F0.InterfaceC0919g.a aVar3 = F0.InterfaceC0919g.f2641a;
            aVarA = aVar3.a();
            if (!(interfaceC1734nR.v() instanceof V.InterfaceC1713g)) {
                V.AbstractC1725k.c();
            }
            interfaceC1734nR.t();
            if (interfaceC1734nR.o()) {
                interfaceC1734nR.B(aVarA);
            } else {
                interfaceC1734nR.H();
            }
            interfaceC1734nA = V.L1.a(interfaceC1734nR);
            V.L1.c(interfaceC1734nA, iH3, aVar3.c());
            V.L1.c(interfaceC1734nA, interfaceC1758zF3, aVar3.e());
            pVarB = aVar3.b();
            if (interfaceC1734nA.o()) {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            } else {
                interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
            }
            V.L1.c(interfaceC1734nA, dVarE3, aVar3.d());
            androidx.compose.foundation.layout.f fVar3 = androidx.compose.foundation.layout.f.f19260a;
            c1542e0.e(V.AbstractC1725k.b(interfaceC1734nR, 0));
            interfaceC1734nR.T(1748085441);
            listB = c1542e0.b();
            size = listB.size();
            while (i13 < size) {
                S.C1540d0 c1540d2 = (S.C1540d0) listB.get(i13);
                S.U0 u16 = (S.U0) c1540d2.a();
                p237x7.q qVarB3 = c1540d2.b();
                interfaceC1734nR.s(1201076541, u16);
                qVarB3.j(p031d0.c.e(-1135367807, true, new S.X0.b(qVar, u16), interfaceC1734nR, 54), interfaceC1734nR, 6);
                interfaceC1734nR.N();
            }
            interfaceC1734nR.J();
            interfaceC1734nR.Q();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        dVar3 = dVar2;
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.X0.c(u6, dVar3, qVar, i6, i10));
        }
    }

    public static final void b(S.Y0 y6, androidx.compose.ui.d dVar, p237x7.q qVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(464178177);
        if ((i10 & 1) != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.S(y6) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        int i12 = i10 & 2;
        if (i12 != 0) {
            i11 |= 48;
        } else if ((i6 & 48) == 0) {
            i11 |= interfaceC1734nR.S(dVar) ? 32 : 16;
        }
        int i13 = i10 & 4;
        if (i13 != 0) {
            i11 |= 384;
        } else if ((i6 & 384) == 0) {
            i11 |= interfaceC1734nR.l(qVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (i12 != 0) {
                dVar = androidx.compose.ui.d.f19586a;
            }
            if (i13 != 0) {
                qVar = S.F.f9975a.a();
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(464178177, i11, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:221)");
            }
            S.U0 u0B = y6.b();
            androidx.compose.ui.platform.InterfaceC1944i interfaceC1944i = (androidx.compose.ui.platform.InterfaceC1944i) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.c());
            boolean zS = interfaceC1734nR.S(u0B) | interfaceC1734nR.l(interfaceC1944i);
            java.lang.Object objG = interfaceC1734nR.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new S.X0.d(u0B, interfaceC1944i, null);
                interfaceC1734nR.K(objG);
            }
            V.Q.e(u0B, (p237x7.p) objG, interfaceC1734nR, 0);
            a(y6.b(), dVar, qVar, interfaceC1734nR, i11 & 1008, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        androidx.compose.ui.d dVar2 = dVar;
        p237x7.q qVar2 = qVar;
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.X0.e(y6, dVar2, qVar2, i6, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V.G1 f(p200u.InterfaceC7175j interfaceC7175j, boolean z6, p237x7.a aVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        if ((i10 & 4) != 0) {
            aVar = S.X0.g.f10596D;
        }
        p237x7.a aVar2 = aVar;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1431889134, i6, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:418)");
        }
        java.lang.Object objG = interfaceC1734n.g();
        V.InterfaceC1734n.a aVar3 = V.InterfaceC1734n.f14931a;
        if (objG == aVar3.a()) {
            objG = p200u.AbstractC7159b.b(!z6 ? 1.0f : 0.0f, 0.0f, 2, null);
            interfaceC1734n.K(objG);
        }
        p200u.C7157a c7157a = (p200u.C7157a) objG;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z6);
        boolean zL = interfaceC1734n.l(c7157a) | ((((i6 & 112) ^ 48) > 32 && interfaceC1734n.d(z6)) || (i6 & 48) == 32) | interfaceC1734n.l(interfaceC7175j) | ((((i6 & 896) ^ 384) > 256 && interfaceC1734n.S(aVar2)) || (i6 & 384) == 256);
        java.lang.Object objG2 = interfaceC1734n.g();
        if (zL || objG2 == aVar3.a()) {
            java.lang.Object hVar = new S.X0.h(c7157a, z6, interfaceC7175j, aVar2, null);
            interfaceC1734n.K(hVar);
            objG2 = hVar;
        }
        V.Q.e(boolValueOf, (p237x7.p) objG2, interfaceC1734n, (i6 >> 3) & 14);
        V.G1 g1G = c7157a.g();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V.G1 g(p200u.InterfaceC7175j interfaceC7175j, boolean z6, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1966809761, i6, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:428)");
        }
        java.lang.Object objG = interfaceC1734n.g();
        V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
        if (objG == aVar.a()) {
            objG = p200u.AbstractC7159b.b(!z6 ? 1.0f : 0.8f, 0.0f, 2, null);
            interfaceC1734n.K(objG);
        }
        p200u.C7157a c7157a = (p200u.C7157a) objG;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z6);
        boolean zL = interfaceC1734n.l(c7157a) | ((((i6 & 112) ^ 48) > 32 && interfaceC1734n.d(z6)) || (i6 & 48) == 32) | interfaceC1734n.l(interfaceC7175j);
        java.lang.Object objG2 = interfaceC1734n.g();
        if (zL || objG2 == aVar.a()) {
            objG2 = new S.X0.i(c7157a, z6, interfaceC7175j, null);
            interfaceC1734n.K(objG2);
        }
        V.Q.e(boolValueOf, (p237x7.p) objG2, interfaceC1734n, (i6 >> 3) & 14);
        V.G1 g1G = c7157a.g();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1G;
    }

    public static final long h(S.W0 w6, boolean z6, androidx.compose.ui.platform.InterfaceC1944i interfaceC1944i) {
        long j6;
        int i6 = S.X0.f.f10595a[w6.ordinal()];
        if (i6 == 1) {
            j6 = Long.MAX_VALUE;
        } else if (i6 == 2) {
            j6 = 10000;
        } else {
            if (i6 != 3) {
                throw new p087i7.s();
            }
            j6 = 4000;
        }
        long j10 = j6;
        return interfaceC1944i == null ? j10 : interfaceC1944i.a(j10, true, true, z6);
    }
}
