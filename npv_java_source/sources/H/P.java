package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3749a;

        static {
            int[] iArr = new int[p230x.s.values().length];
            try {
                iArr[p230x.s.Vertical.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p230x.s.Horizontal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f3749a = iArr;
        }
    }

    public static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ H.Q f3750D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p250z.l f3751E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f3752F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(H.Q q6, p250z.l lVar, boolean z6) {
            super(1);
            this.f3750D = q6;
            this.f3751E = lVar;
            this.f3752F = z6;
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
        final /* synthetic */ H.Q f3753D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f3754E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p250z.l f3755F;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ H.Q f3756D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(H.Q q6) {
                super(1);
                this.f3756D = q6;
            }

            public final java.lang.Float a(float f6) {
                float fD = this.f3756D.d() + f6;
                if (fD > this.f3756D.c()) {
                    f6 = this.f3756D.c() - this.f3756D.d();
                } else if (fD < 0.0f) {
                    f6 = -this.f3756D.d();
                }
                H.Q q6 = this.f3756D;
                q6.h(q6.d() + f6);
                return java.lang.Float.valueOf(f6);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                return a(((java.lang.Number) obj).floatValue());
            }
        }

        public static final class b implements p230x.A {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ p230x.A f3757a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final V.G1 f3758b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final V.G1 f3759c;

            static final class a extends p247y7.AbstractC7352v implements p237x7.a {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ H.Q f3760D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(H.Q q6) {
                    super(0);
                    this.f3760D = q6;
                }

                @Override // p237x7.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean b() {
                    return java.lang.Boolean.valueOf(this.f3760D.d() > 0.0f);
                }
            }

            /* JADX INFO: renamed from: H.P$c$b$b, reason: collision with other inner class name */
            static final class C0087b extends p247y7.AbstractC7352v implements p237x7.a {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ H.Q f3761D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0087b(H.Q q6) {
                    super(0);
                    this.f3761D = q6;
                }

                @Override // p237x7.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean b() {
                    return java.lang.Boolean.valueOf(this.f3761D.d() < this.f3761D.c());
                }
            }

            b(p230x.A a6, H.Q q6) {
                this.f3757a = a6;
                this.f3758b = V.v1.e(new H.P.c.b.C0087b(q6));
                this.f3759c = V.v1.e(new H.P.c.b.a(q6));
            }

            @Override // p230x.A
            public boolean a() {
                return this.f3757a.a();
            }

            @Override // p230x.A
            public boolean b() {
                return ((java.lang.Boolean) this.f3759c.getValue()).booleanValue();
            }

            @Override // p230x.A
            public boolean c() {
                return ((java.lang.Boolean) this.f3758b.getValue()).booleanValue();
            }

            @Override // p230x.A
            public java.lang.Object d(p210v.L l6, p237x7.p pVar, p127m7.e eVar) {
                return this.f3757a.d(l6, pVar, eVar);
            }

            @Override // p230x.A
            public float e(float f6) {
                return this.f3757a.e(f6);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(H.Q q6, boolean z6, p250z.l lVar) {
            super(3);
            this.f3753D = q6;
            this.f3754E = z6;
            this.f3755F = lVar;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(805428266);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(805428266, i6, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)");
            }
            boolean z6 = this.f3753D.f() == p230x.s.Vertical || !(interfaceC1734n.n(androidx.compose.ui.platform.AbstractC1966p0.k()) == Y0.v.Rtl);
            boolean zS = interfaceC1734n.S(this.f3753D);
            H.Q q6 = this.f3753D;
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new H.P.c.a(q6);
                interfaceC1734n.K(objG);
            }
            p230x.A aB = p230x.B.b((p237x7.l) objG, interfaceC1734n, 0);
            boolean zS2 = interfaceC1734n.S(aB) | interfaceC1734n.S(this.f3753D);
            H.Q q10 = this.f3753D;
            java.lang.Object objG2 = interfaceC1734n.g();
            if (zS2 || objG2 == V.InterfaceC1734n.f14931a.a()) {
                objG2 = new H.P.c.b(aB, q10);
                interfaceC1734n.K(objG2);
            }
            androidx.compose.ui.d dVarI = androidx.compose.foundation.gestures.d.i(androidx.compose.ui.d.f19586a, (H.P.c.b) objG2, this.f3753D.f(), this.f3754E && this.f3753D.c() != 0.0f, z6, null, this.f3755F, 16, null);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return dVarI;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p131n0.i b(Y0.e eVar, int i6, S0.e0 e0Var, M0.K k6, boolean z6, int i10) {
        p131n0.i iVarA;
        if (k6 == null || (iVarA = k6.e(e0Var.a().b(i6))) == null) {
            iVarA = p131n0.i.f51317e.a();
        }
        p131n0.i iVar = iVarA;
        int iS0 = eVar.S0(H.G.b());
        return p131n0.i.d(iVar, z6 ? (i10 - iVar.i()) - iS0 : iVar.i(), 0.0f, z6 ? i10 - iVar.i() : iVar.i() + iS0, 0.0f, 10, null);
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, H.Q q6, S0.V v6, S0.g0 g0Var, p237x7.a aVar) {
        androidx.compose.ui.d d0Var;
        p230x.s sVarF = q6.f();
        int iE = q6.e(v6.h());
        q6.i(v6.h());
        S0.e0 e0VarC = H.c0.c(g0Var, v6.f());
        int i6 = H.P.a.f3749a[sVarF.ordinal()];
        if (i6 == 1) {
            d0Var = new H.d0(q6, iE, e0VarC, aVar);
        } else {
            if (i6 != 2) {
                throw new p087i7.s();
            }
            d0Var = new H.C1222n(q6, iE, e0VarC, aVar);
        }
        return p111l0.e.b(dVar).b(d0Var);
    }

    public static final androidx.compose.ui.d d(androidx.compose.ui.d dVar, H.Q q6, p250z.l lVar, boolean z6) {
        return androidx.compose.ui.c.b(dVar, androidx.compose.ui.platform.E0.b() ? new H.P.b(q6, lVar, z6) : androidx.compose.ui.platform.E0.a(), new H.P.c(q6, z6, lVar));
    }
}
