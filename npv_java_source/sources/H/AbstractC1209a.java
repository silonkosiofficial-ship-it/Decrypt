package H;

/* JADX INFO: renamed from: H.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1209a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f3793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f3794b;

    /* JADX INFO: renamed from: H.a$a, reason: collision with other inner class name */
    static final class C0090a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f3795D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f3796E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0090a(long j6, androidx.compose.ui.d dVar) {
            super(2);
            this.f3795D = j6;
            this.f3796E = dVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1653527038, i6, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:64)");
            }
            if (this.f3795D != 9205357640488583168L) {
                interfaceC1734n.T(1828881000);
                androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.p.n(this.f3796E, Y0.l.h(this.f3795D), Y0.l.g(this.f3795D), 0.0f, 0.0f, 12, null);
                D0.I iH = androidx.compose.foundation.layout.d.h(p071h0.c.f45778a.m(), false);
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
                V.L1.c(interfaceC1734nA, iH, aVar.c());
                V.L1.c(interfaceC1734nA, interfaceC1758zF, aVar.e());
                p237x7.p pVarB = aVar.b();
                if (interfaceC1734nA.o() || !p247y7.AbstractC7350t.b(interfaceC1734nA.g(), java.lang.Integer.valueOf(iA))) {
                    interfaceC1734nA.K(java.lang.Integer.valueOf(iA));
                    interfaceC1734nA.D(java.lang.Integer.valueOf(iA), pVarB);
                }
                V.L1.c(interfaceC1734nA, dVarE, aVar.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f19260a;
                H.AbstractC1209a.b(null, interfaceC1734n, 0, 1);
                interfaceC1734n.Q();
            } else {
                interfaceC1734n.T(1829217412);
                H.AbstractC1209a.b(this.f3796E, interfaceC1734n, 0, 0);
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

    /* JADX INFO: renamed from: H.a$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ N.InterfaceC1359i f3797D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f3798E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f3799F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f3800G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f3801H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(N.InterfaceC1359i interfaceC1359i, androidx.compose.ui.d dVar, long j6, int i6, int i10) {
            super(2);
            this.f3797D = interfaceC1359i;
            this.f3798E = dVar;
            this.f3799F = j6;
            this.f3800G = i6;
            this.f3801H = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            H.AbstractC1209a.a(this.f3797D, this.f3798E, this.f3799F, interfaceC1734n, V.S0.a(this.f3800G | 1), this.f3801H);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: H.a$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ N.InterfaceC1359i f3802D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(N.InterfaceC1359i interfaceC1359i) {
            super(1);
            this.f3802D = interfaceC1359i;
        }

        public final void a(K0.w wVar) {
            wVar.d(N.v.d(), new N.u(H.EnumC1219k.Cursor, this.f3802D.a(), N.t.Middle, true, null));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((K0.w) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: H.a$d */
    static final class d extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f3803D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f3804E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f3805F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.d dVar, int i6, int i10) {
            super(2);
            this.f3803D = dVar;
            this.f3804E = i6;
            this.f3805F = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            H.AbstractC1209a.b(this.f3803D, interfaceC1734n, V.S0.a(this.f3804E | 1), this.f3805F);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: H.a$e */
    static final class e extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final H.AbstractC1209a.e f3806D = new H.AbstractC1209a.e();

        /* JADX INFO: renamed from: H.a$e$a, reason: collision with other inner class name */
        static final class C0091a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ long f3807D;

            /* JADX INFO: renamed from: H.a$e$a$a, reason: collision with other inner class name */
            static final class C0092a extends p247y7.AbstractC7352v implements p237x7.l {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ float f3808D;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                final /* synthetic */ p141o0.E1 f3809E;

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                final /* synthetic */ p141o0.AbstractC7019z0 f3810F;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0092a(float f6, p141o0.E1 e6, p141o0.AbstractC7019z0 abstractC7019z0) {
                    super(1);
                    this.f3808D = f6;
                    this.f3809E = e6;
                    this.f3810F = abstractC7019z0;
                }

                public final void a(p161q0.c cVar) {
                    cVar.l1();
                    float f6 = this.f3808D;
                    p141o0.E1 e6 = this.f3809E;
                    p141o0.AbstractC7019z0 abstractC7019z0 = this.f3810F;
                    p161q0.d dVarF0 = cVar.F0();
                    long jI = dVarF0.i();
                    dVarF0.h().m();
                    try {
                        p161q0.j jVarC = dVarF0.c();
                        p161q0.i.b(jVarC, f6, 0.0f, 2, null);
                        jVarC.g(45.0f, p131n0.g.f51312b.c());
                        p161q0.f.g(cVar, e6, 0L, 0.0f, null, abstractC7019z0, 0, 46, null);
                    } finally {
                        dVarF0.h().s();
                        dVarF0.d(jI);
                    }
                }

                @Override // p237x7.l
                public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                    a((p161q0.c) obj);
                    return p087i7.M.f46721a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0091a(long j6) {
                super(1);
                this.f3807D = j6;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p111l0.h l(p111l0.d dVar) {
                float fI = p131n0.m.i(dVar.i()) / 2.0f;
                return dVar.s(new H.AbstractC1209a.e.C0091a.C0092a(fI, N.AbstractC1351a.d(dVar, fI), p141o0.AbstractC7019z0.a.b(p141o0.AbstractC7019z0.f52280b, this.f3807D, 0, 2, null)));
            }
        }

        e() {
            super(3);
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(-2126899193);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-2126899193, i6, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
            }
            long jB = ((N.J) interfaceC1734n.n(N.K.b())).b();
            androidx.compose.ui.d.a aVar = androidx.compose.ui.d.f19586a;
            boolean zJ = interfaceC1734n.j(jB);
            java.lang.Object objG = interfaceC1734n.g();
            if (zJ || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new H.AbstractC1209a.e.C0091a(jB);
                interfaceC1734n.K(objG);
            }
            androidx.compose.ui.d dVarB = dVar.b(androidx.compose.ui.draw.b.c(aVar, (p237x7.l) objG));
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

    static {
        float fQ = Y0.i.q(25);
        f3793a = fQ;
        f3794b = Y0.i.q(Y0.i.q(fQ * 2.0f) / 2.4142137f);
    }

    public static final void a(N.InterfaceC1359i interfaceC1359i, androidx.compose.ui.d dVar, long j6, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(1776202187);
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
            i11 |= interfaceC1734nR.S(dVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i11 |= ((i10 & 4) == 0 && interfaceC1734nR.j(j6)) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0 && !interfaceC1734nR.G()) {
                interfaceC1734nR.A();
                if ((i10 & 4) != 0) {
                    i11 &= -897;
                }
            } else if ((i10 & 4) != 0) {
                j6 = Y0.l.f16217b.a();
                i11 &= -897;
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1776202187, i11, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:51)");
            }
            int i12 = i11 & 14;
            boolean z6 = i12 == 4 || ((i11 & 8) != 0 && interfaceC1734nR.l(interfaceC1359i));
            java.lang.Object objG = interfaceC1734nR.g();
            if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new H.AbstractC1209a.c(interfaceC1359i);
                interfaceC1734nR.K(objG);
            }
            N.AbstractC1351a.a(interfaceC1359i, p071h0.c.f45778a.m(), p031d0.c.e(-1653527038, true, new H.AbstractC1209a.C0090a(j6, K0.n.d(dVar, false, (p237x7.l) objG, 1, null)), interfaceC1734nR, 54), interfaceC1734nR, i12 | 432);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        long j10 = j6;
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new H.AbstractC1209a.b(interfaceC1359i, dVar, j10, i6, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(694251107);
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.S(dVar) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        if ((i11 & 3) == 2 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (i12 != 0) {
                dVar = androidx.compose.ui.d.f19586a;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(694251107, i11, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            A.N.a(d(androidx.compose.foundation.layout.p.q(dVar, f3794b, f3793a)), interfaceC1734nR, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new H.AbstractC1209a.d(dVar, i6, i10));
        }
    }

    private static final androidx.compose.ui.d d(androidx.compose.ui.d dVar) {
        return androidx.compose.ui.c.c(dVar, null, H.AbstractC1209a.e.f3806D, 1, null);
    }
}
