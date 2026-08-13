package p190t;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    static final class a extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: t.d$a$a, reason: collision with other inner class name */
        static final class C0707a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ D0.X f54431D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0707a(D0.X x6) {
                super(1);
                this.f54431D = x6;
            }

            public final void a(D0.X.a aVar) {
                D0.X.a.h(aVar, this.f54431D, 0, 0, 0.0f, 4, null);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((D0.X.a) obj);
                return p087i7.M.f46721a;
            }
        }

        a(p190t.u uVar) {
            super(3);
        }

        public final D0.K a(D0.M m6, D0.G g6, long j6) {
            D0.X xU = g6.U(j6);
            if (!m6.A0()) {
                return D0.L.b(m6, xU.I0(), xU.w0(), null, new t.d.a.C0707a(xU), 4, null);
            }
            Y0.u.a(xU.I0(), xU.w0());
            throw null;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((D0.M) obj, (D0.G) obj2, ((Y0.C1859b) obj3).r());
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p200u.s0 f54432D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.l f54433E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f54434F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f54435G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f54436H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f54437I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.q f54438J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f54439K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f54440L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p200u.s0 s0Var, p237x7.l lVar, androidx.compose.ui.d dVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, p237x7.p pVar, p190t.u uVar, p237x7.q qVar, int i6, int i10) {
            super(2);
            this.f54432D = s0Var;
            this.f54433E = lVar;
            this.f54434F = dVar;
            this.f54435G = hVar;
            this.f54436H = jVar;
            this.f54437I = pVar;
            this.f54438J = qVar;
            this.f54439K = i6;
            this.f54440L = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            p190t.d.a(this.f54432D, this.f54433E, this.f54434F, this.f54435G, this.f54436H, this.f54437I, null, this.f54438J, interfaceC1734n, V.S0.a(this.f54439K | 1), this.f54440L);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f54441G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f54442H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p200u.s0 f54443I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ V.G1 f54444J;

        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p200u.s0 f54445D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p200u.s0 s0Var) {
                super(0);
                this.f54445D = s0Var;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean b() {
                return java.lang.Boolean.valueOf(p190t.d.j(this.f54445D));
            }
        }

        static final class b implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ V.M0 f54446C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p200u.s0 f54447D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ V.G1 f54448E;

            b(V.M0 m6, p200u.s0 s0Var, V.G1 g6) {
                this.f54446C = m6;
                this.f54447D = s0Var;
                this.f54448E = g6;
            }

            @Override // Z8.InterfaceC1870g
            public /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                return b(((java.lang.Boolean) obj).booleanValue(), eVar);
            }

            public final java.lang.Object b(boolean z6, p127m7.e eVar) {
                this.f54446C.setValue(p147o7.b.a(z6 ? ((java.lang.Boolean) p190t.d.b(this.f54448E).u(this.f54447D.i(), this.f54447D.p())).booleanValue() : false));
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p200u.s0 s0Var, V.G1 g6, p127m7.e eVar) {
            super(2, eVar);
            this.f54443I = s0Var;
            this.f54444J = g6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f54441G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                V.M0 m6 = (V.M0) this.f54442H;
                Z8.InterfaceC1869f interfaceC1869fO = V.v1.o(new t.d.c.a(this.f54443I));
                t.d.c.b bVar = new t.d.c.b(m6, this.f54443I, this.f54444J);
                this.f54441G = 1;
                if (interfaceC1869fO.b(bVar, this) == objG) {
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
        public final java.lang.Object u(V.M0 m6, p127m7.e eVar) {
            return ((t.d.c) x(m6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            t.d.c cVar = new t.d.c(this.f54443I, this.f54444J, eVar);
            cVar.f54442H = obj;
            return cVar;
        }
    }

    /* JADX INFO: renamed from: t.d$d, reason: collision with other inner class name */
    static final class C0708d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final p190t.d.C0708d f54449D = new p190t.d.C0708d();

        C0708d() {
            super(1);
        }

        public final java.lang.Boolean a(boolean z6) {
            return java.lang.Boolean.valueOf(z6);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Boolean) obj).booleanValue());
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f54450D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f54451E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f54452F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f54453G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ java.lang.String f54454H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.q f54455I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f54456J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f54457K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z6, androidx.compose.ui.d dVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, java.lang.String str, p237x7.q qVar, int i6, int i10) {
            super(2);
            this.f54450D = z6;
            this.f54451E = dVar;
            this.f54452F = hVar;
            this.f54453G = jVar;
            this.f54454H = str;
            this.f54455I = qVar;
            this.f54456J = i6;
            this.f54457K = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            p190t.d.f(this.f54450D, this.f54451E, this.f54452F, this.f54453G, this.f54454H, this.f54455I, interfaceC1734n, V.S0.a(this.f54456J | 1), this.f54457K);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final t.d.f f54458D = new t.d.f();

        f() {
            super(1);
        }

        public final java.lang.Boolean a(boolean z6) {
            return java.lang.Boolean.valueOf(z6);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Boolean) obj).booleanValue());
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ A.L f54459D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f54460E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f54461F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f54462G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f54463H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ java.lang.String f54464I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.q f54465J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f54466K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f54467L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(A.L l6, boolean z6, androidx.compose.ui.d dVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, java.lang.String str, p237x7.q qVar, int i6, int i10) {
            super(2);
            this.f54459D = l6;
            this.f54460E = z6;
            this.f54461F = dVar;
            this.f54462G = hVar;
            this.f54463H = jVar;
            this.f54464I = str;
            this.f54465J = qVar;
            this.f54466K = i6;
            this.f54467L = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            p190t.d.e(this.f54459D, this.f54460E, this.f54461F, this.f54462G, this.f54463H, this.f54464I, this.f54465J, interfaceC1734n, V.S0.a(this.f54466K | 1), this.f54467L);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final t.d.h f54468D = new t.d.h();

        h() {
            super(1);
        }

        public final java.lang.Boolean a(boolean z6) {
            return java.lang.Boolean.valueOf(z6);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Boolean) obj).booleanValue());
        }
    }

    static final class i extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ A.InterfaceC0777k f54469D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f54470E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f54471F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f54472G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f54473H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ java.lang.String f54474I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.q f54475J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f54476K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f54477L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(A.InterfaceC0777k interfaceC0777k, boolean z6, androidx.compose.ui.d dVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, java.lang.String str, p237x7.q qVar, int i6, int i10) {
            super(2);
            this.f54469D = interfaceC0777k;
            this.f54470E = z6;
            this.f54471F = dVar;
            this.f54472G = hVar;
            this.f54473H = jVar;
            this.f54474I = str;
            this.f54475J = qVar;
            this.f54476K = i6;
            this.f54477L = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            p190t.d.d(this.f54469D, this.f54470E, this.f54471F, this.f54472G, this.f54473H, this.f54474I, this.f54475J, interfaceC1734n, V.S0.a(this.f54476K | 1), this.f54477L);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class j extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f54478D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p200u.s0 f54479E;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ D0.X f54480D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(D0.X x6) {
                super(1);
                this.f54480D = x6;
            }

            public final void a(D0.X.a aVar) {
                D0.X.a.h(aVar, this.f54480D, 0, 0, 0.0f, 4, null);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((D0.X.a) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(p237x7.l lVar, p200u.s0 s0Var) {
            super(3);
            this.f54478D = lVar;
            this.f54479E = s0Var;
        }

        public final D0.K a(D0.M m6, D0.G g6, long j6) {
            D0.X xU = g6.U(j6);
            long jA = (!m6.A0() || ((java.lang.Boolean) this.f54478D.l(this.f54479E.p())).booleanValue()) ? Y0.u.a(xU.I0(), xU.w0()) : Y0.t.f16230b.a();
            return D0.L.b(m6, Y0.t.g(jA), Y0.t.f(jA), null, new t.d.j.a(xU), 4, null);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((D0.M) obj, (D0.G) obj2, ((Y0.C1859b) obj3).r());
        }
    }

    static final class k extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final t.d.k f54481D = new t.d.k();

        k() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean u(p190t.m mVar, p190t.m mVar2) {
            return java.lang.Boolean.valueOf(mVar == mVar2 && mVar2 == p190t.m.PostExit);
        }
    }

    static final class l extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p200u.s0 f54482D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.l f54483E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f54484F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f54485G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f54486H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.q f54487I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f54488J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(p200u.s0 s0Var, p237x7.l lVar, androidx.compose.ui.d dVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, p237x7.q qVar, int i6) {
            super(2);
            this.f54482D = s0Var;
            this.f54483E = lVar;
            this.f54484F = dVar;
            this.f54485G = hVar;
            this.f54486H = jVar;
            this.f54487I = qVar;
            this.f54488J = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            p190t.d.g(this.f54482D, this.f54483E, this.f54484F, this.f54485G, this.f54486H, this.f54487I, interfaceC1734n, V.S0.a(this.f54488J | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static final void a(p200u.s0 s0Var, p237x7.l lVar, androidx.compose.ui.d dVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, p237x7.p pVar, p190t.u uVar, p237x7.q qVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        p190t.u uVar2;
        V.InterfaceC1734n interfaceC1734n2;
        androidx.compose.ui.d dVarA;
        p190t.u uVar3;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-891967166);
        if ((i10 & 1) != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.S(s0Var) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        if ((i10 & 2) != 0) {
            i11 |= 48;
        } else if ((i6 & 48) == 0) {
            i11 |= interfaceC1734nR.l(lVar) ? 32 : 16;
        }
        if ((i10 & 4) != 0) {
            i11 |= 384;
        } else if ((i6 & 384) == 0) {
            i11 |= interfaceC1734nR.S(dVar) ? 256 : 128;
        }
        if ((i10 & 8) != 0) {
            i11 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i11 |= interfaceC1734nR.S(hVar) ? 2048 : 1024;
        }
        if ((i10 & 16) != 0) {
            i11 |= 24576;
        } else if ((i6 & 24576) == 0) {
            i11 |= interfaceC1734nR.S(jVar) ? 16384 : 8192;
        }
        if ((i10 & 32) != 0) {
            i11 |= 196608;
        } else if ((i6 & 196608) == 0) {
            i11 |= interfaceC1734nR.l(pVar) ? 131072 : 65536;
        }
        int i12 = i10 & 64;
        int i13 = 1572864;
        if (i12 != 0) {
            i11 |= i13;
        } else if ((i6 & 1572864) == 0) {
            i13 = (i6 & 2097152) == 0 ? interfaceC1734nR.S(uVar) : interfaceC1734nR.l(uVar) ? 1048576 : 524288;
            i11 |= i13;
        }
        if ((i10 & 128) != 0) {
            i11 |= 12582912;
        } else if ((i6 & 12582912) == 0) {
            i11 |= interfaceC1734nR.l(qVar) ? 8388608 : 4194304;
        }
        int i14 = i11;
        if ((4793491 & i14) == 4793490 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
            uVar3 = uVar;
            interfaceC1734n2 = interfaceC1734nR;
        } else {
            p190t.u uVar4 = i12 != 0 ? null : uVar;
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-891967166, i14, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:737)");
            }
            if (((java.lang.Boolean) lVar.l(s0Var.p())).booleanValue() || ((java.lang.Boolean) lVar.l(s0Var.i())).booleanValue() || s0Var.u() || s0Var.j()) {
                interfaceC1734nR.T(1787977937);
                int i15 = i14 & 14;
                int i16 = i15 | 48;
                int i17 = i16 & 14;
                boolean z6 = true;
                boolean z10 = ((i17 ^ 6) > 4 && interfaceC1734nR.S(s0Var)) || (i16 & 6) == 4;
                java.lang.Object objG = interfaceC1734nR.g();
                if (z10 || objG == V.InterfaceC1734n.f14931a.a()) {
                    objG = s0Var.i();
                    interfaceC1734nR.K(objG);
                }
                if (s0Var.u()) {
                    objG = s0Var.i();
                }
                interfaceC1734nR.T(-466616829);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                }
                int i18 = i14 & 126;
                p190t.m mVarK = k(s0Var, lVar, objG, interfaceC1734nR, i18);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                interfaceC1734nR.J();
                java.lang.Object objP = s0Var.p();
                interfaceC1734nR.T(-466616829);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                }
                p190t.m mVarK2 = k(s0Var, lVar, objP, interfaceC1734nR, i18);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                interfaceC1734nR.J();
                int i19 = i17 | 3072;
                p190t.u uVar5 = uVar4;
                p200u.s0 s0VarB = p200u.u0.b(s0Var, mVarK, mVarK2, "EnterExitTransition", interfaceC1734nR, i19);
                V.G1 g1N = V.v1.n(pVar, interfaceC1734nR, (i14 >> 15) & 14);
                java.lang.Object objU = pVar.u(s0VarB.i(), s0VarB.p());
                boolean zS = interfaceC1734nR.S(s0VarB) | interfaceC1734nR.S(g1N);
                java.lang.Object objG2 = interfaceC1734nR.g();
                if (zS || objG2 == V.InterfaceC1734n.f14931a.a()) {
                    objG2 = new t.d.c(s0VarB, g1N, null);
                    interfaceC1734nR.K(objG2);
                }
                V.G1 g1L = V.v1.l(objU, (p237x7.p) objG2, interfaceC1734nR, 0);
                if (j(s0VarB) && c(g1L)) {
                    interfaceC1734nR.T(1790256282);
                    interfaceC1734nR.J();
                    uVar2 = uVar5;
                    interfaceC1734n2 = interfaceC1734nR;
                } else {
                    interfaceC1734nR.T(1788869559);
                    boolean z11 = i15 == 4;
                    java.lang.Object objG3 = interfaceC1734nR.g();
                    if (z11 || objG3 == V.InterfaceC1734n.f14931a.a()) {
                        objG3 = new p190t.f(s0VarB);
                        interfaceC1734nR.K(objG3);
                    }
                    p190t.f fVar = (p190t.f) objG3;
                    int i20 = i14 >> 6;
                    int i21 = (i20 & 112) | 24576 | (i20 & 896);
                    uVar2 = uVar5;
                    interfaceC1734n2 = interfaceC1734nR;
                    androidx.compose.ui.d dVarG = androidx.compose.animation.f.g(s0VarB, hVar, jVar, null, "Built-in", interfaceC1734n2, i21, 4);
                    if (uVar2 != null) {
                        interfaceC1734n2.T(1789227361);
                        androidx.compose.ui.d.a aVar = androidx.compose.ui.d.f19586a;
                        if ((i14 & 3670016) != 1048576 && ((i14 & 2097152) == 0 || !interfaceC1734n2.l(uVar2))) {
                            z6 = false;
                        }
                        java.lang.Object objG4 = interfaceC1734n2.g();
                        if (z6 || objG4 == V.InterfaceC1734n.f14931a.a()) {
                            objG4 = new t.d.a(uVar2);
                            interfaceC1734n2.K(objG4);
                        }
                        dVarA = androidx.compose.ui.layout.b.a(aVar, (p237x7.q) objG4);
                        interfaceC1734n2.J();
                    } else {
                        interfaceC1734n2.T(1581766416);
                        interfaceC1734n2.J();
                        dVarA = androidx.compose.ui.d.f19586a;
                    }
                    androidx.compose.ui.d dVarB = dVar.b(dVarG.b(dVarA));
                    java.lang.Object objG5 = interfaceC1734n2.g();
                    if (objG5 == V.InterfaceC1734n.f14931a.a()) {
                        objG5 = new p190t.C7155c(fVar);
                        interfaceC1734n2.K(objG5);
                    }
                    p190t.C7155c c7155c = (p190t.C7155c) objG5;
                    int iA = V.AbstractC1725k.a(interfaceC1734n2, 0);
                    V.InterfaceC1758z interfaceC1758zF = interfaceC1734n2.F();
                    androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(interfaceC1734n2, dVarB);
                    F0.InterfaceC0919g.a aVar2 = F0.InterfaceC0919g.f2641a;
                    p237x7.a aVarA = aVar2.a();
                    if (!(interfaceC1734n2.v() instanceof V.InterfaceC1713g)) {
                        V.AbstractC1725k.c();
                    }
                    interfaceC1734n2.t();
                    if (interfaceC1734n2.o()) {
                        interfaceC1734n2.B(aVarA);
                    } else {
                        interfaceC1734n2.H();
                    }
                    V.InterfaceC1734n interfaceC1734nA = V.L1.a(interfaceC1734n2);
                    V.L1.c(interfaceC1734nA, c7155c, aVar2.c());
                    V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar2.e());
                    p237x7.p pVarB = aVar2.b();
                    if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                        interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                        interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                    }
                    V.L1.c(interfaceC1734nA, dVarE, aVar2.d());
                    qVar.j(fVar, interfaceC1734n2, java.lang.Integer.valueOf((i14 >> 18) & 112));
                    interfaceC1734n2.Q();
                    interfaceC1734n2.J();
                }
                interfaceC1734n2.J();
            } else {
                interfaceC1734nR.T(1790262234);
                interfaceC1734nR.J();
                uVar2 = uVar4;
                interfaceC1734n2 = interfaceC1734nR;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            uVar3 = uVar2;
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734n2.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new t.d.b(s0Var, lVar, dVar, hVar, jVar, pVar, uVar3, qVar, i6, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p237x7.p b(V.G1 g6) {
        return (p237x7.p) g6.getValue();
    }

    private static final boolean c(V.G1 g6) {
        return ((java.lang.Boolean) g6.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:82:0x010c  */
    /* JADX WARN: Code duplicated, block: B:84:0x010f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    /* JADX WARN: Code duplicated, block: B:88:0x0119  */
    /* JADX WARN: Code duplicated, block: B:91:0x0154  */
    /* JADX WARN: Code duplicated, block: B:95:0x0160  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void d(A.InterfaceC0777k interfaceC0777k, boolean z6, androidx.compose.ui.d dVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, java.lang.String str, p237x7.q qVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        androidx.compose.ui.d dVar2;
        int i12;
        androidx.compose.animation.h hVar2;
        int i13;
        int i14;
        androidx.compose.animation.j jVar2;
        int i15;
        int i16;
        java.lang.String str2;
        int i17;
        int i18;
        androidx.compose.ui.d dVar3;
        androidx.compose.animation.h hVarC;
        androidx.compose.animation.j jVarC;
        java.lang.String str3;
        androidx.compose.ui.d dVar4;
        androidx.compose.animation.h hVar3;
        java.lang.String str4;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(1766503102);
        if ((i10 & 1) != 0) {
            i11 = i6 | 48;
        } else if ((i6 & 48) == 0) {
            i11 = (interfaceC1734nR.d(z6) ? 32 : 16) | i6;
        } else {
            i11 = i6;
        }
        int i19 = i10 & 2;
        if (i19 == 0) {
            if ((i6 & 384) == 0) {
                dVar2 = dVar;
                i11 |= interfaceC1734nR.S(dVar2) ? 256 : 128;
            }
            i12 = i10 & 4;
            if (i12 != 0) {
                if ((i6 & 3072) == 0) {
                    hVar2 = hVar;
                    if (interfaceC1734nR.S(hVar2)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i11 |= i13;
                }
                i14 = i10 & 8;
                if (i14 != 0) {
                    if ((i6 & 24576) == 0) {
                        jVar2 = jVar;
                        if (interfaceC1734nR.S(jVar2)) {
                            i15 = 16384;
                        } else {
                            i15 = 8192;
                        }
                        i11 |= i15;
                    }
                    i16 = i10 & 16;
                    if (i16 != 0) {
                        if ((196608 & i6) == 0) {
                            str2 = str;
                            if (interfaceC1734nR.S(str2)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                            i11 |= i17;
                        }
                        if ((i10 & 32) != 0) {
                            i11 |= 1572864;
                        } else if ((i6 & 1572864) == 0) {
                            if (interfaceC1734nR.l(qVar)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i11 |= i18;
                        }
                        if ((599185 & i11) == 599184 || !interfaceC1734nR.u()) {
                            if (i19 != 0) {
                                dVar3 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i12 != 0) {
                                hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i14 != 0) {
                                jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                            } else {
                                jVarC = jVar2;
                            }
                            if (i16 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str2;
                            }
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                            }
                            int i20 = i11 >> 3;
                            g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i20 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i20 & 458752));
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            dVar4 = dVar3;
                            hVar3 = hVarC;
                            str4 = str3;
                        } else {
                            interfaceC1734nR.A();
                            dVar4 = dVar2;
                            hVar3 = hVar2;
                            jVarC = jVar2;
                            str4 = str2;
                        }
                        interfaceC1709e1X = interfaceC1734nR.x();
                        if (interfaceC1709e1X != null) {
                            interfaceC1709e1X.a(new t.d.i(interfaceC0777k, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                        }
                    }
                    i11 |= 196608;
                    str2 = str;
                    if ((i10 & 32) != 0) {
                        i11 |= 1572864;
                    } else if ((i6 & 1572864) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i11 |= i18;
                    }
                    if ((599185 & i11) == 599184) {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                        }
                        int i21 = i11 >> 3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i21 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i21 & 458752));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                        hVar3 = hVarC;
                        str4 = str3;
                    } else {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                        }
                        int i22 = i11 >> 3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i22 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i22 & 458752));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                        hVar3 = hVarC;
                        str4 = str3;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new t.d.i(interfaceC0777k, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                    }
                }
                i11 |= 24576;
                jVar2 = jVar;
                i16 = i10 & 16;
                if (i16 != 0) {
                    if ((196608 & i6) == 0) {
                        str2 = str;
                        if (interfaceC1734nR.S(str2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i11 |= i17;
                    }
                    if ((i10 & 32) != 0) {
                        i11 |= 1572864;
                    } else if ((i6 & 1572864) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i11 |= i18;
                    }
                    if ((599185 & i11) == 599184) {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                        }
                        int i23 = i11 >> 3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i23 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i23 & 458752));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                        hVar3 = hVarC;
                        str4 = str3;
                    } else {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                        }
                        int i24 = i11 >> 3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i24 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i24 & 458752));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                        hVar3 = hVarC;
                        str4 = str3;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new t.d.i(interfaceC0777k, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                    }
                }
                i11 |= 196608;
                str2 = str;
                if ((i10 & 32) != 0) {
                    i11 |= 1572864;
                } else if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i11 |= i18;
                }
                if ((599185 & i11) == 599184) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i25 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i25 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i25 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i26 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i26 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i26 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.i(interfaceC0777k, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                }
            }
            i11 |= 3072;
            hVar2 = hVar;
            i14 = i10 & 8;
            if (i14 != 0) {
                if ((i6 & 24576) == 0) {
                    jVar2 = jVar;
                    if (interfaceC1734nR.S(jVar2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i11 |= i15;
                }
                i16 = i10 & 16;
                if (i16 != 0) {
                    if ((196608 & i6) == 0) {
                        str2 = str;
                        if (interfaceC1734nR.S(str2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i11 |= i17;
                    }
                    if ((i10 & 32) != 0) {
                        i11 |= 1572864;
                    } else if ((i6 & 1572864) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i11 |= i18;
                    }
                    if ((599185 & i11) == 599184) {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                        }
                        int i27 = i11 >> 3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i27 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i27 & 458752));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                        hVar3 = hVarC;
                        str4 = str3;
                    } else {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                        }
                        int i28 = i11 >> 3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i28 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i28 & 458752));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                        hVar3 = hVarC;
                        str4 = str3;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new t.d.i(interfaceC0777k, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                    }
                }
                i11 |= 196608;
                str2 = str;
                if ((i10 & 32) != 0) {
                    i11 |= 1572864;
                } else if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i11 |= i18;
                }
                if ((599185 & i11) == 599184) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i29 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i29 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i29 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i210 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i210 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i210 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.i(interfaceC0777k, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                }
            }
            i11 |= 24576;
            jVar2 = jVar;
            i16 = i10 & 16;
            if (i16 != 0) {
                if ((196608 & i6) == 0) {
                    str2 = str;
                    if (interfaceC1734nR.S(str2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i11 |= i17;
                }
                if ((i10 & 32) != 0) {
                    i11 |= 1572864;
                } else if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i11 |= i18;
                }
                if ((599185 & i11) == 599184) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i211 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i211 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i211 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i212 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i212 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i212 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.i(interfaceC0777k, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                }
            }
            i11 |= 196608;
            str2 = str;
            if ((i10 & 32) != 0) {
                i11 |= 1572864;
            } else if ((i6 & 1572864) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i11 |= i18;
            }
            if ((599185 & i11) == 599184) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                }
                int i213 = i11 >> 3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i213 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i213 & 458752));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
                hVar3 = hVarC;
                str4 = str3;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                }
                int i214 = i11 >> 3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i214 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i214 & 458752));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
                hVar3 = hVarC;
                str4 = str3;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.d.i(interfaceC0777k, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
            }
        }
        i11 |= 384;
        dVar2 = dVar;
        i12 = i10 & 4;
        if (i12 != 0) {
            if ((i6 & 3072) == 0) {
                hVar2 = hVar;
                if (interfaceC1734nR.S(hVar2)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i11 |= i13;
            }
            i14 = i10 & 8;
            if (i14 != 0) {
                if ((i6 & 24576) == 0) {
                    jVar2 = jVar;
                    if (interfaceC1734nR.S(jVar2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i11 |= i15;
                }
                i16 = i10 & 16;
                if (i16 != 0) {
                    if ((196608 & i6) == 0) {
                        str2 = str;
                        if (interfaceC1734nR.S(str2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i11 |= i17;
                    }
                    if ((i10 & 32) != 0) {
                        i11 |= 1572864;
                    } else if ((i6 & 1572864) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i11 |= i18;
                    }
                    if ((599185 & i11) == 599184) {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                        }
                        int i215 = i11 >> 3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i215 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i215 & 458752));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                        hVar3 = hVarC;
                        str4 = str3;
                    } else {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                        }
                        int i216 = i11 >> 3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i216 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i216 & 458752));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                        hVar3 = hVarC;
                        str4 = str3;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new t.d.i(interfaceC0777k, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                    }
                }
                i11 |= 196608;
                str2 = str;
                if ((i10 & 32) != 0) {
                    i11 |= 1572864;
                } else if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i11 |= i18;
                }
                if ((599185 & i11) == 599184) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i217 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i217 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i217 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i218 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i218 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i218 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.i(interfaceC0777k, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                }
            }
            i11 |= 24576;
            jVar2 = jVar;
            i16 = i10 & 16;
            if (i16 != 0) {
                if ((196608 & i6) == 0) {
                    str2 = str;
                    if (interfaceC1734nR.S(str2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i11 |= i17;
                }
                if ((i10 & 32) != 0) {
                    i11 |= 1572864;
                } else if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i11 |= i18;
                }
                if ((599185 & i11) == 599184) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i219 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i219 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i219 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i2110 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2110 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2110 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.i(interfaceC0777k, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                }
            }
            i11 |= 196608;
            str2 = str;
            if ((i10 & 32) != 0) {
                i11 |= 1572864;
            } else if ((i6 & 1572864) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i11 |= i18;
            }
            if ((599185 & i11) == 599184) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                }
                int i2111 = i11 >> 3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2111 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2111 & 458752));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
                hVar3 = hVarC;
                str4 = str3;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                }
                int i2112 = i11 >> 3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2112 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2112 & 458752));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
                hVar3 = hVarC;
                str4 = str3;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.d.i(interfaceC0777k, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
            }
        }
        i11 |= 3072;
        hVar2 = hVar;
        i14 = i10 & 8;
        if (i14 != 0) {
            if ((i6 & 24576) == 0) {
                jVar2 = jVar;
                if (interfaceC1734nR.S(jVar2)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i11 |= i15;
            }
            i16 = i10 & 16;
            if (i16 != 0) {
                if ((196608 & i6) == 0) {
                    str2 = str;
                    if (interfaceC1734nR.S(str2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i11 |= i17;
                }
                if ((i10 & 32) != 0) {
                    i11 |= 1572864;
                } else if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i11 |= i18;
                }
                if ((599185 & i11) == 599184) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i2113 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2113 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2113 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                    }
                    int i2114 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2114 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2114 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.i(interfaceC0777k, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                }
            }
            i11 |= 196608;
            str2 = str;
            if ((i10 & 32) != 0) {
                i11 |= 1572864;
            } else if ((i6 & 1572864) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i11 |= i18;
            }
            if ((599185 & i11) == 599184) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                }
                int i2115 = i11 >> 3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2115 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2115 & 458752));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
                hVar3 = hVarC;
                str4 = str3;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                }
                int i2116 = i11 >> 3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2116 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2116 & 458752));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
                hVar3 = hVarC;
                str4 = str3;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.d.i(interfaceC0777k, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
            }
        }
        i11 |= 24576;
        jVar2 = jVar;
        i16 = i10 & 16;
        if (i16 != 0) {
            if ((196608 & i6) == 0) {
                str2 = str;
                if (interfaceC1734nR.S(str2)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i11 |= i17;
            }
            if ((i10 & 32) != 0) {
                i11 |= 1572864;
            } else if ((i6 & 1572864) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i11 |= i18;
            }
            if ((599185 & i11) == 599184) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                }
                int i2117 = i11 >> 3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2117 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2117 & 458752));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
                hVar3 = hVarC;
                str4 = str3;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                }
                int i2118 = i11 >> 3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2118 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2118 & 458752));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
                hVar3 = hVarC;
                str4 = str3;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.d.i(interfaceC0777k, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
            }
        }
        i11 |= 196608;
        str2 = str;
        if ((i10 & 32) != 0) {
            i11 |= 1572864;
        } else if ((i6 & 1572864) == 0) {
            if (interfaceC1734nR.l(qVar)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i11 |= i18;
        }
        if ((599185 & i11) == 599184) {
            if (i19 != 0) {
                dVar3 = androidx.compose.ui.d.f19586a;
            } else {
                dVar3 = dVar2;
            }
            if (i12 != 0) {
                hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
            } else {
                hVarC = hVar2;
            }
            if (i14 != 0) {
                jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
            } else {
                jVarC = jVar2;
            }
            if (i16 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
            }
            int i2119 = i11 >> 3;
            g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2119 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2119 & 458752));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar4 = dVar3;
            hVar3 = hVarC;
            str4 = str3;
        } else {
            if (i19 != 0) {
                dVar3 = androidx.compose.ui.d.f19586a;
            } else {
                dVar3 = dVar2;
            }
            if (i12 != 0) {
                hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.m(null, null, false, null, 15, null));
            } else {
                hVarC = hVar2;
            }
            if (i14 != 0) {
                jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.A(null, null, false, null, 15, null));
            } else {
                jVarC = jVar2;
            }
            if (i16 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1766503102, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
            }
            int i21110 = i11 >> 3;
            g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i21110 & 14) | ((i11 >> 12) & 112), 0), t.d.h.f54468D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i21110 & 458752));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar4 = dVar3;
            hVar3 = hVarC;
            str4 = str3;
        }
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new t.d.i(interfaceC0777k, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:82:0x010c  */
    /* JADX WARN: Code duplicated, block: B:84:0x010f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    /* JADX WARN: Code duplicated, block: B:88:0x0119  */
    /* JADX WARN: Code duplicated, block: B:91:0x0154  */
    /* JADX WARN: Code duplicated, block: B:95:0x0160  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void e(A.L l6, boolean z6, androidx.compose.ui.d dVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, java.lang.String str, p237x7.q qVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        androidx.compose.ui.d dVar2;
        int i12;
        androidx.compose.animation.h hVar2;
        int i13;
        int i14;
        androidx.compose.animation.j jVar2;
        int i15;
        int i16;
        java.lang.String str2;
        int i17;
        int i18;
        androidx.compose.ui.d dVar3;
        androidx.compose.animation.h hVarC;
        androidx.compose.animation.j jVarC;
        java.lang.String str3;
        androidx.compose.ui.d dVar4;
        androidx.compose.animation.h hVar3;
        java.lang.String str4;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1741346906);
        if ((i10 & 1) != 0) {
            i11 = i6 | 48;
        } else if ((i6 & 48) == 0) {
            i11 = (interfaceC1734nR.d(z6) ? 32 : 16) | i6;
        } else {
            i11 = i6;
        }
        int i19 = i10 & 2;
        if (i19 == 0) {
            if ((i6 & 384) == 0) {
                dVar2 = dVar;
                i11 |= interfaceC1734nR.S(dVar2) ? 256 : 128;
            }
            i12 = i10 & 4;
            if (i12 != 0) {
                if ((i6 & 3072) == 0) {
                    hVar2 = hVar;
                    if (interfaceC1734nR.S(hVar2)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i11 |= i13;
                }
                i14 = i10 & 8;
                if (i14 != 0) {
                    if ((i6 & 24576) == 0) {
                        jVar2 = jVar;
                        if (interfaceC1734nR.S(jVar2)) {
                            i15 = 16384;
                        } else {
                            i15 = 8192;
                        }
                        i11 |= i15;
                    }
                    i16 = i10 & 16;
                    if (i16 != 0) {
                        if ((196608 & i6) == 0) {
                            str2 = str;
                            if (interfaceC1734nR.S(str2)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                            i11 |= i17;
                        }
                        if ((i10 & 32) != 0) {
                            i11 |= 1572864;
                        } else if ((i6 & 1572864) == 0) {
                            if (interfaceC1734nR.l(qVar)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i11 |= i18;
                        }
                        if ((599185 & i11) == 599184 || !interfaceC1734nR.u()) {
                            if (i19 != 0) {
                                dVar3 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i12 != 0) {
                                hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i14 != 0) {
                                jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                            } else {
                                jVarC = jVar2;
                            }
                            if (i16 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str2;
                            }
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                            }
                            int i20 = i11 >> 3;
                            g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i20 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i20 & 458752));
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            dVar4 = dVar3;
                            hVar3 = hVarC;
                            str4 = str3;
                        } else {
                            interfaceC1734nR.A();
                            dVar4 = dVar2;
                            hVar3 = hVar2;
                            jVarC = jVar2;
                            str4 = str2;
                        }
                        interfaceC1709e1X = interfaceC1734nR.x();
                        if (interfaceC1709e1X != null) {
                            interfaceC1709e1X.a(new t.d.g(l6, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                        }
                    }
                    i11 |= 196608;
                    str2 = str;
                    if ((i10 & 32) != 0) {
                        i11 |= 1572864;
                    } else if ((i6 & 1572864) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i11 |= i18;
                    }
                    if ((599185 & i11) == 599184) {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                        }
                        int i21 = i11 >> 3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i21 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i21 & 458752));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                        hVar3 = hVarC;
                        str4 = str3;
                    } else {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                        }
                        int i22 = i11 >> 3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i22 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i22 & 458752));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                        hVar3 = hVarC;
                        str4 = str3;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new t.d.g(l6, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                    }
                }
                i11 |= 24576;
                jVar2 = jVar;
                i16 = i10 & 16;
                if (i16 != 0) {
                    if ((196608 & i6) == 0) {
                        str2 = str;
                        if (interfaceC1734nR.S(str2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i11 |= i17;
                    }
                    if ((i10 & 32) != 0) {
                        i11 |= 1572864;
                    } else if ((i6 & 1572864) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i11 |= i18;
                    }
                    if ((599185 & i11) == 599184) {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                        }
                        int i23 = i11 >> 3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i23 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i23 & 458752));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                        hVar3 = hVarC;
                        str4 = str3;
                    } else {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                        }
                        int i24 = i11 >> 3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i24 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i24 & 458752));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                        hVar3 = hVarC;
                        str4 = str3;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new t.d.g(l6, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                    }
                }
                i11 |= 196608;
                str2 = str;
                if ((i10 & 32) != 0) {
                    i11 |= 1572864;
                } else if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i11 |= i18;
                }
                if ((599185 & i11) == 599184) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                    }
                    int i25 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i25 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i25 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                    }
                    int i26 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i26 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i26 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.g(l6, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                }
            }
            i11 |= 3072;
            hVar2 = hVar;
            i14 = i10 & 8;
            if (i14 != 0) {
                if ((i6 & 24576) == 0) {
                    jVar2 = jVar;
                    if (interfaceC1734nR.S(jVar2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i11 |= i15;
                }
                i16 = i10 & 16;
                if (i16 != 0) {
                    if ((196608 & i6) == 0) {
                        str2 = str;
                        if (interfaceC1734nR.S(str2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i11 |= i17;
                    }
                    if ((i10 & 32) != 0) {
                        i11 |= 1572864;
                    } else if ((i6 & 1572864) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i11 |= i18;
                    }
                    if ((599185 & i11) == 599184) {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                        }
                        int i27 = i11 >> 3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i27 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i27 & 458752));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                        hVar3 = hVarC;
                        str4 = str3;
                    } else {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                        }
                        int i28 = i11 >> 3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i28 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i28 & 458752));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                        hVar3 = hVarC;
                        str4 = str3;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new t.d.g(l6, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                    }
                }
                i11 |= 196608;
                str2 = str;
                if ((i10 & 32) != 0) {
                    i11 |= 1572864;
                } else if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i11 |= i18;
                }
                if ((599185 & i11) == 599184) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                    }
                    int i29 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i29 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i29 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                    }
                    int i210 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i210 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i210 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.g(l6, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                }
            }
            i11 |= 24576;
            jVar2 = jVar;
            i16 = i10 & 16;
            if (i16 != 0) {
                if ((196608 & i6) == 0) {
                    str2 = str;
                    if (interfaceC1734nR.S(str2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i11 |= i17;
                }
                if ((i10 & 32) != 0) {
                    i11 |= 1572864;
                } else if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i11 |= i18;
                }
                if ((599185 & i11) == 599184) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                    }
                    int i211 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i211 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i211 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                    }
                    int i212 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i212 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i212 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.g(l6, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                }
            }
            i11 |= 196608;
            str2 = str;
            if ((i10 & 32) != 0) {
                i11 |= 1572864;
            } else if ((i6 & 1572864) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i11 |= i18;
            }
            if ((599185 & i11) == 599184) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                }
                int i213 = i11 >> 3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i213 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i213 & 458752));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
                hVar3 = hVarC;
                str4 = str3;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                }
                int i214 = i11 >> 3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i214 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i214 & 458752));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
                hVar3 = hVarC;
                str4 = str3;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.d.g(l6, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
            }
        }
        i11 |= 384;
        dVar2 = dVar;
        i12 = i10 & 4;
        if (i12 != 0) {
            if ((i6 & 3072) == 0) {
                hVar2 = hVar;
                if (interfaceC1734nR.S(hVar2)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i11 |= i13;
            }
            i14 = i10 & 8;
            if (i14 != 0) {
                if ((i6 & 24576) == 0) {
                    jVar2 = jVar;
                    if (interfaceC1734nR.S(jVar2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i11 |= i15;
                }
                i16 = i10 & 16;
                if (i16 != 0) {
                    if ((196608 & i6) == 0) {
                        str2 = str;
                        if (interfaceC1734nR.S(str2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i11 |= i17;
                    }
                    if ((i10 & 32) != 0) {
                        i11 |= 1572864;
                    } else if ((i6 & 1572864) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i11 |= i18;
                    }
                    if ((599185 & i11) == 599184) {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                        }
                        int i215 = i11 >> 3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i215 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i215 & 458752));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                        hVar3 = hVarC;
                        str4 = str3;
                    } else {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                        }
                        int i216 = i11 >> 3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i216 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i216 & 458752));
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar4 = dVar3;
                        hVar3 = hVarC;
                        str4 = str3;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new t.d.g(l6, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                    }
                }
                i11 |= 196608;
                str2 = str;
                if ((i10 & 32) != 0) {
                    i11 |= 1572864;
                } else if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i11 |= i18;
                }
                if ((599185 & i11) == 599184) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                    }
                    int i217 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i217 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i217 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                    }
                    int i218 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i218 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i218 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.g(l6, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                }
            }
            i11 |= 24576;
            jVar2 = jVar;
            i16 = i10 & 16;
            if (i16 != 0) {
                if ((196608 & i6) == 0) {
                    str2 = str;
                    if (interfaceC1734nR.S(str2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i11 |= i17;
                }
                if ((i10 & 32) != 0) {
                    i11 |= 1572864;
                } else if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i11 |= i18;
                }
                if ((599185 & i11) == 599184) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                    }
                    int i219 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i219 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i219 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                    }
                    int i2110 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2110 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2110 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.g(l6, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                }
            }
            i11 |= 196608;
            str2 = str;
            if ((i10 & 32) != 0) {
                i11 |= 1572864;
            } else if ((i6 & 1572864) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i11 |= i18;
            }
            if ((599185 & i11) == 599184) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                }
                int i2111 = i11 >> 3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2111 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2111 & 458752));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
                hVar3 = hVarC;
                str4 = str3;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                }
                int i2112 = i11 >> 3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2112 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2112 & 458752));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
                hVar3 = hVarC;
                str4 = str3;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.d.g(l6, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
            }
        }
        i11 |= 3072;
        hVar2 = hVar;
        i14 = i10 & 8;
        if (i14 != 0) {
            if ((i6 & 24576) == 0) {
                jVar2 = jVar;
                if (interfaceC1734nR.S(jVar2)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i11 |= i15;
            }
            i16 = i10 & 16;
            if (i16 != 0) {
                if ((196608 & i6) == 0) {
                    str2 = str;
                    if (interfaceC1734nR.S(str2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i11 |= i17;
                }
                if ((i10 & 32) != 0) {
                    i11 |= 1572864;
                } else if ((i6 & 1572864) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i11 |= i18;
                }
                if ((599185 & i11) == 599184) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                    }
                    int i2113 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2113 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2113 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                    }
                    int i2114 = i11 >> 3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2114 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2114 & 458752));
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar4 = dVar3;
                    hVar3 = hVarC;
                    str4 = str3;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.g(l6, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
                }
            }
            i11 |= 196608;
            str2 = str;
            if ((i10 & 32) != 0) {
                i11 |= 1572864;
            } else if ((i6 & 1572864) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i11 |= i18;
            }
            if ((599185 & i11) == 599184) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                }
                int i2115 = i11 >> 3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2115 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2115 & 458752));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
                hVar3 = hVarC;
                str4 = str3;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                }
                int i2116 = i11 >> 3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2116 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2116 & 458752));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
                hVar3 = hVarC;
                str4 = str3;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.d.g(l6, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
            }
        }
        i11 |= 24576;
        jVar2 = jVar;
        i16 = i10 & 16;
        if (i16 != 0) {
            if ((196608 & i6) == 0) {
                str2 = str;
                if (interfaceC1734nR.S(str2)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i11 |= i17;
            }
            if ((i10 & 32) != 0) {
                i11 |= 1572864;
            } else if ((i6 & 1572864) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i11 |= i18;
            }
            if ((599185 & i11) == 599184) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                }
                int i2117 = i11 >> 3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2117 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2117 & 458752));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
                hVar3 = hVarC;
                str4 = str3;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                }
                int i2118 = i11 >> 3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2118 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2118 & 458752));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar4 = dVar3;
                hVar3 = hVarC;
                str4 = str3;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.d.g(l6, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
            }
        }
        i11 |= 196608;
        str2 = str;
        if ((i10 & 32) != 0) {
            i11 |= 1572864;
        } else if ((i6 & 1572864) == 0) {
            if (interfaceC1734nR.l(qVar)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i11 |= i18;
        }
        if ((599185 & i11) == 599184) {
            if (i19 != 0) {
                dVar3 = androidx.compose.ui.d.f19586a;
            } else {
                dVar3 = dVar2;
            }
            if (i12 != 0) {
                hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
            } else {
                hVarC = hVar2;
            }
            if (i14 != 0) {
                jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
            } else {
                jVarC = jVar2;
            }
            if (i16 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
            }
            int i2119 = i11 >> 3;
            g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i2119 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i2119 & 458752));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar4 = dVar3;
            hVar3 = hVarC;
            str4 = str3;
        } else {
            if (i19 != 0) {
                dVar3 = androidx.compose.ui.d.f19586a;
            } else {
                dVar3 = dVar2;
            }
            if (i12 != 0) {
                hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.i(null, null, false, null, 15, null));
            } else {
                hVarC = hVar2;
            }
            if (i14 != 0) {
                jVarC = androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.w(null, null, false, null, 15, null));
            } else {
                jVarC = jVar2;
            }
            if (i16 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1741346906, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
            }
            int i21110 = i11 >> 3;
            g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i21110 & 14) | ((i11 >> 12) & 112), 0), t.d.f.f54458D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i21110 & 458752));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar4 = dVar3;
            hVar3 = hVarC;
            str4 = str3;
        }
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new t.d.g(l6, z6, dVar4, hVar3, jVarC, str4, qVar, i6, i10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x0109  */
    /* JADX WARN: Code duplicated, block: B:84:0x010c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0110  */
    /* JADX WARN: Code duplicated, block: B:88:0x0117  */
    /* JADX WARN: Code duplicated, block: B:91:0x0152  */
    /* JADX WARN: Code duplicated, block: B:95:0x015e  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void f(boolean z6, androidx.compose.ui.d dVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, java.lang.String str, p237x7.q qVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        androidx.compose.ui.d dVar2;
        int i12;
        androidx.compose.animation.h hVar2;
        int i13;
        int i14;
        androidx.compose.animation.j jVar2;
        int i15;
        int i16;
        java.lang.String str2;
        int i17;
        int i18;
        androidx.compose.ui.d dVar3;
        androidx.compose.animation.h hVarC;
        androidx.compose.animation.j jVarC;
        java.lang.String str3;
        java.lang.String str4;
        androidx.compose.animation.h hVar3;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(2088733774);
        if ((i10 & 1) != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.d(z6) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        int i19 = i10 & 2;
        if (i19 == 0) {
            if ((i6 & 48) == 0) {
                dVar2 = dVar;
                i11 |= interfaceC1734nR.S(dVar2) ? 32 : 16;
            }
            i12 = i10 & 4;
            if (i12 != 0) {
                if ((i6 & 384) == 0) {
                    hVar2 = hVar;
                    if (interfaceC1734nR.S(hVar2)) {
                        i13 = 256;
                    } else {
                        i13 = 128;
                    }
                    i11 |= i13;
                }
                i14 = i10 & 8;
                if (i14 != 0) {
                    if ((i6 & 3072) == 0) {
                        jVar2 = jVar;
                        if (interfaceC1734nR.S(jVar2)) {
                            i15 = 2048;
                        } else {
                            i15 = 1024;
                        }
                        i11 |= i15;
                    }
                    i16 = i10 & 16;
                    if (i16 != 0) {
                        if ((i6 & 24576) == 0) {
                            str2 = str;
                            if (interfaceC1734nR.S(str2)) {
                                i17 = 16384;
                            } else {
                                i17 = 8192;
                            }
                            i11 |= i17;
                        }
                        if ((i10 & 32) != 0) {
                            i11 |= 196608;
                        } else if ((i6 & 196608) == 0) {
                            if (interfaceC1734nR.l(qVar)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i11 |= i18;
                        }
                        if ((74899 & i11) == 74898 || !interfaceC1734nR.u()) {
                            if (i19 != 0) {
                                dVar3 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i12 != 0) {
                                hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i14 != 0) {
                                jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                            } else {
                                jVarC = jVar2;
                            }
                            if (i16 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str2;
                            }
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                            }
                            int i20 = i11 << 3;
                            int i21 = (i20 & 57344) | (i20 & 896) | 48 | (i20 & 7168) | (i11 & 458752);
                            java.lang.String str5 = str3;
                            g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i21);
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            jVar2 = jVarC;
                            str4 = str5;
                            hVar3 = hVarC;
                        } else {
                            interfaceC1734nR.A();
                            dVar3 = dVar2;
                            hVar3 = hVar2;
                            str4 = str2;
                        }
                        interfaceC1709e1X = interfaceC1734nR.x();
                        if (interfaceC1709e1X != null) {
                            interfaceC1709e1X.a(new t.d.e(z6, dVar3, hVar3, jVar2, str4, qVar, i6, i10));
                        }
                    }
                    i11 |= 24576;
                    str2 = str;
                    if ((i10 & 32) != 0) {
                        i11 |= 196608;
                    } else if ((i6 & 196608) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i11 |= i18;
                    }
                    if ((74899 & i11) == 74898) {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        int i22 = i11 << 3;
                        int i23 = (i22 & 57344) | (i22 & 896) | 48 | (i22 & 7168) | (i11 & 458752);
                        java.lang.String str6 = str3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i23);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        jVar2 = jVarC;
                        str4 = str6;
                        hVar3 = hVarC;
                    } else {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        int i24 = i11 << 3;
                        int i25 = (i24 & 57344) | (i24 & 896) | 48 | (i24 & 7168) | (i11 & 458752);
                        java.lang.String str7 = str3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i25);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        jVar2 = jVarC;
                        str4 = str7;
                        hVar3 = hVarC;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new t.d.e(z6, dVar3, hVar3, jVar2, str4, qVar, i6, i10));
                    }
                }
                i11 |= 3072;
                jVar2 = jVar;
                i16 = i10 & 16;
                if (i16 != 0) {
                    if ((i6 & 24576) == 0) {
                        str2 = str;
                        if (interfaceC1734nR.S(str2)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i11 |= i17;
                    }
                    if ((i10 & 32) != 0) {
                        i11 |= 196608;
                    } else if ((i6 & 196608) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i11 |= i18;
                    }
                    if ((74899 & i11) == 74898) {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        int i26 = i11 << 3;
                        int i27 = (i26 & 57344) | (i26 & 896) | 48 | (i26 & 7168) | (i11 & 458752);
                        java.lang.String str8 = str3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i27);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        jVar2 = jVarC;
                        str4 = str8;
                        hVar3 = hVarC;
                    } else {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        int i28 = i11 << 3;
                        int i29 = (i28 & 57344) | (i28 & 896) | 48 | (i28 & 7168) | (i11 & 458752);
                        java.lang.String str9 = str3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i29);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        jVar2 = jVarC;
                        str4 = str9;
                        hVar3 = hVarC;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new t.d.e(z6, dVar3, hVar3, jVar2, str4, qVar, i6, i10));
                    }
                }
                i11 |= 24576;
                str2 = str;
                if ((i10 & 32) != 0) {
                    i11 |= 196608;
                } else if ((i6 & 196608) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i11 |= i18;
                }
                if ((74899 & i11) == 74898) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i210 = i11 << 3;
                    int i211 = (i210 & 57344) | (i210 & 896) | 48 | (i210 & 7168) | (i11 & 458752);
                    java.lang.String str10 = str3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i211);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    jVar2 = jVarC;
                    str4 = str10;
                    hVar3 = hVarC;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i212 = i11 << 3;
                    int i213 = (i212 & 57344) | (i212 & 896) | 48 | (i212 & 7168) | (i11 & 458752);
                    java.lang.String str11 = str3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i213);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    jVar2 = jVarC;
                    str4 = str11;
                    hVar3 = hVarC;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.e(z6, dVar3, hVar3, jVar2, str4, qVar, i6, i10));
                }
            }
            i11 |= 384;
            hVar2 = hVar;
            i14 = i10 & 8;
            if (i14 != 0) {
                if ((i6 & 3072) == 0) {
                    jVar2 = jVar;
                    if (interfaceC1734nR.S(jVar2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i11 |= i15;
                }
                i16 = i10 & 16;
                if (i16 != 0) {
                    if ((i6 & 24576) == 0) {
                        str2 = str;
                        if (interfaceC1734nR.S(str2)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i11 |= i17;
                    }
                    if ((i10 & 32) != 0) {
                        i11 |= 196608;
                    } else if ((i6 & 196608) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i11 |= i18;
                    }
                    if ((74899 & i11) == 74898) {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        int i214 = i11 << 3;
                        int i215 = (i214 & 57344) | (i214 & 896) | 48 | (i214 & 7168) | (i11 & 458752);
                        java.lang.String str12 = str3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i215);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        jVar2 = jVarC;
                        str4 = str12;
                        hVar3 = hVarC;
                    } else {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        int i216 = i11 << 3;
                        int i217 = (i216 & 57344) | (i216 & 896) | 48 | (i216 & 7168) | (i11 & 458752);
                        java.lang.String str13 = str3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i217);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        jVar2 = jVarC;
                        str4 = str13;
                        hVar3 = hVarC;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new t.d.e(z6, dVar3, hVar3, jVar2, str4, qVar, i6, i10));
                    }
                }
                i11 |= 24576;
                str2 = str;
                if ((i10 & 32) != 0) {
                    i11 |= 196608;
                } else if ((i6 & 196608) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i11 |= i18;
                }
                if ((74899 & i11) == 74898) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i218 = i11 << 3;
                    int i219 = (i218 & 57344) | (i218 & 896) | 48 | (i218 & 7168) | (i11 & 458752);
                    java.lang.String str14 = str3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i219);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    jVar2 = jVarC;
                    str4 = str14;
                    hVar3 = hVarC;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i2110 = i11 << 3;
                    int i2111 = (i2110 & 57344) | (i2110 & 896) | 48 | (i2110 & 7168) | (i11 & 458752);
                    java.lang.String str15 = str3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i2111);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    jVar2 = jVarC;
                    str4 = str15;
                    hVar3 = hVarC;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.e(z6, dVar3, hVar3, jVar2, str4, qVar, i6, i10));
                }
            }
            i11 |= 3072;
            jVar2 = jVar;
            i16 = i10 & 16;
            if (i16 != 0) {
                if ((i6 & 24576) == 0) {
                    str2 = str;
                    if (interfaceC1734nR.S(str2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i11 |= i17;
                }
                if ((i10 & 32) != 0) {
                    i11 |= 196608;
                } else if ((i6 & 196608) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i11 |= i18;
                }
                if ((74899 & i11) == 74898) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i2112 = i11 << 3;
                    int i2113 = (i2112 & 57344) | (i2112 & 896) | 48 | (i2112 & 7168) | (i11 & 458752);
                    java.lang.String str16 = str3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i2113);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    jVar2 = jVarC;
                    str4 = str16;
                    hVar3 = hVarC;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i2114 = i11 << 3;
                    int i2115 = (i2114 & 57344) | (i2114 & 896) | 48 | (i2114 & 7168) | (i11 & 458752);
                    java.lang.String str17 = str3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i2115);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    jVar2 = jVarC;
                    str4 = str17;
                    hVar3 = hVarC;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.e(z6, dVar3, hVar3, jVar2, str4, qVar, i6, i10));
                }
            }
            i11 |= 24576;
            str2 = str;
            if ((i10 & 32) != 0) {
                i11 |= 196608;
            } else if ((i6 & 196608) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i11 |= i18;
            }
            if ((74899 & i11) == 74898) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                int i2116 = i11 << 3;
                int i2117 = (i2116 & 57344) | (i2116 & 896) | 48 | (i2116 & 7168) | (i11 & 458752);
                java.lang.String str18 = str3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i2117);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                jVar2 = jVarC;
                str4 = str18;
                hVar3 = hVarC;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                int i2118 = i11 << 3;
                int i2119 = (i2118 & 57344) | (i2118 & 896) | 48 | (i2118 & 7168) | (i11 & 458752);
                java.lang.String str19 = str3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i2119);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                jVar2 = jVarC;
                str4 = str19;
                hVar3 = hVarC;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.d.e(z6, dVar3, hVar3, jVar2, str4, qVar, i6, i10));
            }
        }
        i11 |= 48;
        dVar2 = dVar;
        i12 = i10 & 4;
        if (i12 != 0) {
            if ((i6 & 384) == 0) {
                hVar2 = hVar;
                if (interfaceC1734nR.S(hVar2)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i11 |= i13;
            }
            i14 = i10 & 8;
            if (i14 != 0) {
                if ((i6 & 3072) == 0) {
                    jVar2 = jVar;
                    if (interfaceC1734nR.S(jVar2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i11 |= i15;
                }
                i16 = i10 & 16;
                if (i16 != 0) {
                    if ((i6 & 24576) == 0) {
                        str2 = str;
                        if (interfaceC1734nR.S(str2)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i11 |= i17;
                    }
                    if ((i10 & 32) != 0) {
                        i11 |= 196608;
                    } else if ((i6 & 196608) == 0) {
                        if (interfaceC1734nR.l(qVar)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i11 |= i18;
                    }
                    if ((74899 & i11) == 74898) {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        int i21110 = i11 << 3;
                        int i21111 = (i21110 & 57344) | (i21110 & 896) | 48 | (i21110 & 7168) | (i11 & 458752);
                        java.lang.String str110 = str3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i21111);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        jVar2 = jVarC;
                        str4 = str110;
                        hVar3 = hVarC;
                    } else {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i14 != 0) {
                            jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                        } else {
                            jVarC = jVar2;
                        }
                        if (i16 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str2;
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        int i21112 = i11 << 3;
                        int i21113 = (i21112 & 57344) | (i21112 & 896) | 48 | (i21112 & 7168) | (i11 & 458752);
                        java.lang.String str111 = str3;
                        g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i21113);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        jVar2 = jVarC;
                        str4 = str111;
                        hVar3 = hVarC;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new t.d.e(z6, dVar3, hVar3, jVar2, str4, qVar, i6, i10));
                    }
                }
                i11 |= 24576;
                str2 = str;
                if ((i10 & 32) != 0) {
                    i11 |= 196608;
                } else if ((i6 & 196608) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i11 |= i18;
                }
                if ((74899 & i11) == 74898) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i21114 = i11 << 3;
                    int i21115 = (i21114 & 57344) | (i21114 & 896) | 48 | (i21114 & 7168) | (i11 & 458752);
                    java.lang.String str112 = str3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i21115);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    jVar2 = jVarC;
                    str4 = str112;
                    hVar3 = hVarC;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i21116 = i11 << 3;
                    int i21117 = (i21116 & 57344) | (i21116 & 896) | 48 | (i21116 & 7168) | (i11 & 458752);
                    java.lang.String str113 = str3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i21117);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    jVar2 = jVarC;
                    str4 = str113;
                    hVar3 = hVarC;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.e(z6, dVar3, hVar3, jVar2, str4, qVar, i6, i10));
                }
            }
            i11 |= 3072;
            jVar2 = jVar;
            i16 = i10 & 16;
            if (i16 != 0) {
                if ((i6 & 24576) == 0) {
                    str2 = str;
                    if (interfaceC1734nR.S(str2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i11 |= i17;
                }
                if ((i10 & 32) != 0) {
                    i11 |= 196608;
                } else if ((i6 & 196608) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i11 |= i18;
                }
                if ((74899 & i11) == 74898) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i21118 = i11 << 3;
                    int i21119 = (i21118 & 57344) | (i21118 & 896) | 48 | (i21118 & 7168) | (i11 & 458752);
                    java.lang.String str114 = str3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i21119);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    jVar2 = jVarC;
                    str4 = str114;
                    hVar3 = hVarC;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i211110 = i11 << 3;
                    int i211111 = (i211110 & 57344) | (i211110 & 896) | 48 | (i211110 & 7168) | (i11 & 458752);
                    java.lang.String str115 = str3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i211111);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    jVar2 = jVarC;
                    str4 = str115;
                    hVar3 = hVarC;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.e(z6, dVar3, hVar3, jVar2, str4, qVar, i6, i10));
                }
            }
            i11 |= 24576;
            str2 = str;
            if ((i10 & 32) != 0) {
                i11 |= 196608;
            } else if ((i6 & 196608) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i11 |= i18;
            }
            if ((74899 & i11) == 74898) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                int i211112 = i11 << 3;
                int i211113 = (i211112 & 57344) | (i211112 & 896) | 48 | (i211112 & 7168) | (i11 & 458752);
                java.lang.String str116 = str3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i211113);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                jVar2 = jVarC;
                str4 = str116;
                hVar3 = hVarC;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                int i211114 = i11 << 3;
                int i211115 = (i211114 & 57344) | (i211114 & 896) | 48 | (i211114 & 7168) | (i11 & 458752);
                java.lang.String str117 = str3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i211115);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                jVar2 = jVarC;
                str4 = str117;
                hVar3 = hVarC;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.d.e(z6, dVar3, hVar3, jVar2, str4, qVar, i6, i10));
            }
        }
        i11 |= 384;
        hVar2 = hVar;
        i14 = i10 & 8;
        if (i14 != 0) {
            if ((i6 & 3072) == 0) {
                jVar2 = jVar;
                if (interfaceC1734nR.S(jVar2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i11 |= i15;
            }
            i16 = i10 & 16;
            if (i16 != 0) {
                if ((i6 & 24576) == 0) {
                    str2 = str;
                    if (interfaceC1734nR.S(str2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i11 |= i17;
                }
                if ((i10 & 32) != 0) {
                    i11 |= 196608;
                } else if ((i6 & 196608) == 0) {
                    if (interfaceC1734nR.l(qVar)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i11 |= i18;
                }
                if ((74899 & i11) == 74898) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i211116 = i11 << 3;
                    int i211117 = (i211116 & 57344) | (i211116 & 896) | 48 | (i211116 & 7168) | (i11 & 458752);
                    java.lang.String str118 = str3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i211117);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    jVar2 = jVarC;
                    str4 = str118;
                    hVar3 = hVarC;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i14 != 0) {
                        jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                    } else {
                        jVarC = jVar2;
                    }
                    if (i16 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str2;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    int i211118 = i11 << 3;
                    int i211119 = (i211118 & 57344) | (i211118 & 896) | 48 | (i211118 & 7168) | (i11 & 458752);
                    java.lang.String str119 = str3;
                    g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i211119);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    jVar2 = jVarC;
                    str4 = str119;
                    hVar3 = hVarC;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new t.d.e(z6, dVar3, hVar3, jVar2, str4, qVar, i6, i10));
                }
            }
            i11 |= 24576;
            str2 = str;
            if ((i10 & 32) != 0) {
                i11 |= 196608;
            } else if ((i6 & 196608) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i11 |= i18;
            }
            if ((74899 & i11) == 74898) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                int i2111110 = i11 << 3;
                int i2111111 = (i2111110 & 57344) | (i2111110 & 896) | 48 | (i2111110 & 7168) | (i11 & 458752);
                java.lang.String str1110 = str3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i2111111);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                jVar2 = jVarC;
                str4 = str1110;
                hVar3 = hVarC;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                int i2111112 = i11 << 3;
                int i2111113 = (i2111112 & 57344) | (i2111112 & 896) | 48 | (i2111112 & 7168) | (i11 & 458752);
                java.lang.String str1111 = str3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i2111113);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                jVar2 = jVarC;
                str4 = str1111;
                hVar3 = hVarC;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.d.e(z6, dVar3, hVar3, jVar2, str4, qVar, i6, i10));
            }
        }
        i11 |= 3072;
        jVar2 = jVar;
        i16 = i10 & 16;
        if (i16 != 0) {
            if ((i6 & 24576) == 0) {
                str2 = str;
                if (interfaceC1734nR.S(str2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i11 |= i17;
            }
            if ((i10 & 32) != 0) {
                i11 |= 196608;
            } else if ((i6 & 196608) == 0) {
                if (interfaceC1734nR.l(qVar)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i11 |= i18;
            }
            if ((74899 & i11) == 74898) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                int i2111114 = i11 << 3;
                int i2111115 = (i2111114 & 57344) | (i2111114 & 896) | 48 | (i2111114 & 7168) | (i11 & 458752);
                java.lang.String str1112 = str3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i2111115);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                jVar2 = jVarC;
                str4 = str1112;
                hVar3 = hVarC;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i14 != 0) {
                    jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
                } else {
                    jVarC = jVar2;
                }
                if (i16 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str2;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                int i2111116 = i11 << 3;
                int i2111117 = (i2111116 & 57344) | (i2111116 & 896) | 48 | (i2111116 & 7168) | (i11 & 458752);
                java.lang.String str1113 = str3;
                g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i2111117);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                jVar2 = jVarC;
                str4 = str1113;
                hVar3 = hVarC;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new t.d.e(z6, dVar3, hVar3, jVar2, str4, qVar, i6, i10));
            }
        }
        i11 |= 24576;
        str2 = str;
        if ((i10 & 32) != 0) {
            i11 |= 196608;
        } else if ((i6 & 196608) == 0) {
            if (interfaceC1734nR.l(qVar)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i11 |= i18;
        }
        if ((74899 & i11) == 74898) {
            if (i19 != 0) {
                dVar3 = androidx.compose.ui.d.f19586a;
            } else {
                dVar3 = dVar2;
            }
            if (i12 != 0) {
                hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
            } else {
                hVarC = hVar2;
            }
            if (i14 != 0) {
                jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
            } else {
                jVarC = jVar2;
            }
            if (i16 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
            }
            int i2111118 = i11 << 3;
            int i2111119 = (i2111118 & 57344) | (i2111118 & 896) | 48 | (i2111118 & 7168) | (i11 & 458752);
            java.lang.String str1114 = str3;
            g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i2111119);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            jVar2 = jVarC;
            str4 = str1114;
            hVar3 = hVarC;
        } else {
            if (i19 != 0) {
                dVar3 = androidx.compose.ui.d.f19586a;
            } else {
                dVar3 = dVar2;
            }
            if (i12 != 0) {
                hVarC = androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.k(null, null, false, null, 15, null));
            } else {
                hVarC = hVar2;
            }
            if (i14 != 0) {
                jVarC = androidx.compose.animation.f.y(null, null, false, null, 15, null).c(androidx.compose.animation.f.q(null, 0.0f, 3, null));
            } else {
                jVarC = jVar2;
            }
            if (i16 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str2;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(2088733774, i11, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
            }
            int i21111110 = i11 << 3;
            int i21111111 = (i21111110 & 57344) | (i21111110 & 896) | 48 | (i21111110 & 7168) | (i11 & 458752);
            java.lang.String str1115 = str3;
            g(p200u.u0.g(java.lang.Boolean.valueOf(z6), str3, interfaceC1734nR, (i11 & 14) | ((i11 >> 9) & 112), 0), p190t.d.C0708d.f54449D, dVar3, hVarC, jVarC, qVar, interfaceC1734nR, i21111111);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            jVar2 = jVarC;
            str4 = str1115;
            hVar3 = hVarC;
        }
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new t.d.e(z6, dVar3, hVar3, jVar2, str4, qVar, i6, i10));
        }
    }

    public static final void g(p200u.s0 s0Var, p237x7.l lVar, androidx.compose.ui.d dVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, p237x7.q qVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(429978603);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.S(s0Var) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.l(lVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i10 |= interfaceC1734nR.S(dVar) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i10 |= interfaceC1734nR.S(hVar) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i10 |= interfaceC1734nR.S(jVar) ? 16384 : 8192;
        }
        if ((i6 & 196608) == 0) {
            i10 |= interfaceC1734nR.l(qVar) ? 131072 : 65536;
        }
        if ((74899 & i10) == 74898 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(429978603, i10, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:693)");
            }
            int i11 = i10 & 112;
            int i12 = i10 & 14;
            boolean z6 = (i11 == 32) | (i12 == 4);
            java.lang.Object objG = interfaceC1734nR.g();
            if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new t.d.j(lVar, s0Var);
                interfaceC1734nR.K(objG);
            }
            a(s0Var, lVar, androidx.compose.ui.layout.b.a(dVar, (p237x7.q) objG), hVar, jVar, t.d.k.f54481D, null, qVar, interfaceC1734nR, i11 | 196608 | i12 | (i10 & 7168) | (57344 & i10) | ((i10 << 6) & 29360128), 64);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new t.d.l(s0Var, lVar, dVar, hVar, jVar, qVar, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(p200u.s0 s0Var) {
        java.lang.Object objI = s0Var.i();
        p190t.m mVar = p190t.m.PostExit;
        return objI == mVar && s0Var.p() == mVar;
    }

    private static final p190t.m k(p200u.s0 s0Var, p237x7.l lVar, java.lang.Object obj, V.InterfaceC1734n interfaceC1734n, int i6) {
        p190t.m mVar;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(361571134, i6, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:855)");
        }
        interfaceC1734n.s(-902048200, s0Var);
        if (s0Var.u()) {
            interfaceC1734n.T(2101296683);
            interfaceC1734n.J();
            if (((java.lang.Boolean) lVar.l(obj)).booleanValue()) {
                mVar = p190t.m.Visible;
            } else {
                mVar = ((java.lang.Boolean) lVar.l(s0Var.i())).booleanValue() ? p190t.m.PostExit : p190t.m.PreEnter;
            }
        } else {
            interfaceC1734n.T(2101530516);
            java.lang.Object objG = interfaceC1734n.g();
            if (objG == V.InterfaceC1734n.f14931a.a()) {
                objG = V.A1.d(java.lang.Boolean.FALSE, null, 2, null);
                interfaceC1734n.K(objG);
            }
            V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) objG;
            if (((java.lang.Boolean) lVar.l(s0Var.i())).booleanValue()) {
                interfaceC1753w0.setValue(java.lang.Boolean.TRUE);
            }
            if (((java.lang.Boolean) lVar.l(obj)).booleanValue()) {
                mVar = p190t.m.Visible;
            } else {
                mVar = ((java.lang.Boolean) interfaceC1753w0.getValue()).booleanValue() ? p190t.m.PostExit : p190t.m.PreEnter;
            }
            interfaceC1734n.J();
        }
        interfaceC1734n.N();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return mVar;
    }
}
