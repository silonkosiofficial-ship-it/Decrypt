package S;

/* JADX INFO: loaded from: classes.dex */
public abstract class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f9845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.compose.ui.d f9846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f9847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f9848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f9849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p200u.C7198z f9850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p200u.C7198z f9851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p200u.C7198z f9852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final p200u.C7198z f9853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final p200u.C7198z f9854j;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f9855D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p161q0.m f9856E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ V.G1 f9857F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ V.G1 f9858G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ V.G1 f9859H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ V.G1 f9860I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ float f9861J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ long f9862K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j6, p161q0.m mVar, V.G1 g6, V.G1 g10, V.G1 g11, V.G1 g12, float f6, long j10) {
            super(1);
            this.f9855D = j6;
            this.f9856E = mVar;
            this.f9857F = g6;
            this.f9858G = g10;
            this.f9859H = g11;
            this.f9860I = g12;
            this.f9861J = f6;
            this.f9862K = j10;
        }

        public final void a(p161q0.g gVar) {
            S.B0.g(gVar, this.f9855D, this.f9856E);
            S.B0.h(gVar, ((java.lang.Number) this.f9859H.getValue()).floatValue() + (((((java.lang.Number) this.f9857F.getValue()).floatValue() * 216.0f) % 360.0f) - 90.0f) + ((java.lang.Number) this.f9860I.getValue()).floatValue(), this.f9861J, java.lang.Math.abs(((java.lang.Number) this.f9858G.getValue()).floatValue() - ((java.lang.Number) this.f9859H.getValue()).floatValue()), this.f9862K, this.f9856E);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p161q0.g) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f9863D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f9864E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ float f9865F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ long f9866G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f9867H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f9868I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f9869J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.d dVar, long j6, float f6, long j10, int i6, int i10, int i11) {
            super(2);
            this.f9863D = dVar;
            this.f9864E = j6;
            this.f9865F = f6;
            this.f9866G = j10;
            this.f9867H = i6;
            this.f9868I = i10;
            this.f9869J = i11;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.B0.a(this.f9863D, this.f9864E, this.f9865F, this.f9866G, this.f9867H, interfaceC1734n, V.S0.a(this.f9868I | 1), this.f9869J);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.B0.c f9870D = new S.B0.c();

        c() {
            super(1);
        }

        public final void a(u.W.b bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(java.lang.Float.valueOf(0.0f), 0), S.B0.f9854j);
            bVar.f(java.lang.Float.valueOf(290.0f), 666);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((u.W.b) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.B0.d f9871D = new S.B0.d();

        d() {
            super(1);
        }

        public final void a(u.W.b bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(java.lang.Float.valueOf(0.0f), 666), S.B0.f9854j);
            bVar.f(java.lang.Float.valueOf(290.0f), bVar.b());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((u.W.b) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.B0.e f9872D = new S.B0.e();

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ D0.X f9873D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ int f9874E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(D0.X x6, int i6) {
                super(1);
                this.f9873D = x6;
                this.f9874E = i6;
            }

            public final void a(D0.X.a aVar) {
                D0.X.a.h(aVar, this.f9873D, 0, -this.f9874E, 0.0f, 4, null);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((D0.X.a) obj);
                return p087i7.M.f46721a;
            }
        }

        e() {
            super(3);
        }

        public final D0.K a(D0.M m6, D0.G g6, long j6) {
            int iS0 = m6.S0(S.B0.f9845a);
            int i6 = iS0 * 2;
            D0.X xU = g6.U(Y0.c.n(j6, 0, i6));
            return D0.L.b(m6, xU.I0(), xU.w0() - i6, null, new S.B0.e.a(xU, iS0), 4, null);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((D0.M) obj, (D0.G) obj2, ((Y0.C1859b) obj3).r());
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.B0.f f9875D = new S.B0.f();

        f() {
            super(1);
        }

        public final void a(K0.w wVar) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((K0.w) obj);
            return p087i7.M.f46721a;
        }
    }

    static {
        float fQ = Y0.i.q(10);
        f9845a = fQ;
        f9846b = androidx.compose.foundation.layout.m.k(K0.n.c(androidx.compose.ui.layout.b.a(androidx.compose.ui.d.f19586a, S.B0.e.f9872D), true, S.B0.f.f9875D), 0.0f, fQ, 1, null);
        f9847c = Y0.i.q(240);
        U.x xVar = U.x.f14373a;
        f9848d = xVar.e();
        f9849e = Y0.i.q(xVar.c() - Y0.i.q(xVar.e() * 2));
        f9850f = new p200u.C7198z(0.2f, 0.0f, 0.8f, 1.0f);
        f9851g = new p200u.C7198z(0.4f, 0.0f, 1.0f, 1.0f);
        f9852h = new p200u.C7198z(0.0f, 0.0f, 0.65f, 1.0f);
        f9853i = new p200u.C7198z(0.1f, 0.0f, 0.45f, 1.0f);
        f9854j = new p200u.C7198z(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x027c A[PHI: r14 r36
  0x027c: PHI (r14v16 int) = (r14v14 int), (r14v18 int) binds: [B:100:0x027a, B:98:0x026f] A[DONT_GENERATE, DONT_INLINE]
  0x027c: PHI (r36v9 androidx.compose.ui.d) = (r36v7 androidx.compose.ui.d), (r36v10 androidx.compose.ui.d) binds: [B:100:0x027a, B:98:0x026f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x0281  */
    /* JADX WARN: Code duplicated, block: B:105:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:109:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:111:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:117:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:122:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:126:0x0308  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x0268  */
    /* JADX WARN: Code duplicated, block: B:99:0x0274  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(androidx.compose.ui.d dVar, long j6, float f6, long j10, int i6, V.InterfaceC1734n interfaceC1734n, int i10, int i11) {
        androidx.compose.ui.d dVar2;
        int i12;
        long jA;
        float fD;
        long j11;
        int i13;
        int i14;
        int i15;
        androidx.compose.ui.d dVar3;
        long jC;
        int i16;
        long j12;
        float f10;
        int iB;
        long j13;
        p161q0.m mVar;
        int i17;
        V.G1 g1B;
        V.G1 g1A;
        V.G1 g1A2;
        V.G1 g1A3;
        androidx.compose.ui.d dVar4;
        int i18;
        boolean z6;
        boolean z10;
        boolean z11;
        java.lang.Object objG;
        int i19;
        long j14;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-115871647);
        int i20 = i11 & 1;
        if (i20 != 0) {
            i12 = i10 | 6;
            dVar2 = dVar;
        } else if ((i10 & 6) == 0) {
            dVar2 = dVar;
            i12 = (interfaceC1734nR.S(dVar2) ? 4 : 2) | i10;
        } else {
            dVar2 = dVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            jA = j6;
            i12 |= ((i11 & 2) == 0 && interfaceC1734nR.j(jA)) ? 32 : 16;
        } else {
            jA = j6;
        }
        int i21 = i11 & 4;
        if (i21 == 0) {
            if ((i10 & 384) == 0) {
                fD = f6;
                i12 |= interfaceC1734nR.h(fD) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    j11 = j10;
                    int i22 = interfaceC1734nR.j(j11) ? 2048 : 1024;
                    i12 |= i22;
                } else {
                    j11 = j10;
                }
                i12 |= i22;
            } else {
                j11 = j10;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    i14 = i6;
                    if (interfaceC1734nR.i(i14)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((i12 & 9363) == 9362 || !interfaceC1734nR.u()) {
                    interfaceC1734nR.q();
                    if ((i10 & 1) != 0 || interfaceC1734nR.G()) {
                        if (i20 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if ((i11 & 2) != 0) {
                            jA = S.A0.f9820a.a(interfaceC1734nR, 6);
                            i12 &= -113;
                        }
                        if (i21 != 0) {
                            fD = S.A0.f9820a.d();
                        }
                        if ((i11 & 8) != 0) {
                            jC = S.A0.f9820a.c(interfaceC1734nR, 6);
                            i12 &= -7169;
                        } else {
                            jC = j11;
                        }
                        if (i13 != 0) {
                            i16 = i12;
                            j13 = jC;
                            f10 = fD;
                            iB = S.A0.f9820a.b();
                        } else {
                            i16 = i12;
                            j12 = jA;
                            long j15 = jC;
                            f10 = fD;
                            iB = i14;
                            j13 = j15;
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(-115871647, i16, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:637)");
                        }
                        mVar = new p161q0.m(((Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e())).B0(f10), 0.0f, iB, 0, null, 26, null);
                        p200u.S sC = p200u.T.c(null, interfaceC1734nR, 0, 1);
                        p200u.x0 x0VarJ = p200u.z0.j(p247y7.C7349s.f57306a);
                        p200u.Q qE = p200u.AbstractC7177k.e(p200u.AbstractC7177k.l(6660, 0, p200u.H.e(), 2, null), null, 0L, 6, null);
                        int i23 = p200u.S.f54731f;
                        int i24 = p200u.Q.f54725d;
                        boolean z12 = true;
                        i17 = i16;
                        g1B = p200u.T.b(sC, 0, 5, x0VarJ, qE, null, interfaceC1734nR, i23 | 432 | (i24 << 12), 16);
                        g1A = p200u.T.a(sC, 0.0f, 286.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.l(1332, 0, p200u.H.e(), 2, null), null, 0L, 6, null), null, interfaceC1734nR, i23 | 432 | (i24 << 9), 8);
                        g1A2 = p200u.T.a(sC, 0.0f, 290.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(S.B0.c.f9870D), null, 0L, 6, null), null, interfaceC1734nR, i23 | 432 | (i24 << 9), 8);
                        g1A3 = p200u.T.a(sC, 0.0f, 290.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(S.B0.d.f9871D), null, 0L, 6, null), null, interfaceC1734nR, i23 | 432 | (i24 << 9), 8);
                        androidx.compose.ui.d dVarP = androidx.compose.foundation.layout.p.p(p210v.Z.a(dVar3), f9849e);
                        j11 = j13;
                        if (((i17 & 7168) ^ 3072) > 2048 || !interfaceC1734nR.j(j11)) {
                            dVar4 = dVar3;
                            i18 = i17;
                            if ((i18 & 3072) != 2048) {
                                z6 = false;
                            }
                            boolean zL = z6 | interfaceC1734nR.l(r30) | interfaceC1734nR.S(g1B) | interfaceC1734nR.S(g1A2) | interfaceC1734nR.S(g1A3) | interfaceC1734nR.S(g1A);
                            int i25 = iB;
                            if ((i18 & 896) == 256) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            boolean z13 = zL | z10;
                            if ((((i18 & 112) ^ 48) > 32 || !interfaceC1734nR.j(j12)) && (i18 & 48) != 32) {
                            }
                            z11 = z13 | z12;
                            objG = interfaceC1734nR.g();
                            if (z11 || objG == V.InterfaceC1734n.f14931a.a()) {
                                objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                                interfaceC1734nR.K(objG);
                            }
                            p210v.AbstractC7215i.a(dVarP, (p237x7.l) objG, interfaceC1734nR, 0);
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            i19 = i25;
                            j14 = j12;
                            dVar2 = dVar4;
                        } else {
                            dVar4 = dVar3;
                            i18 = i17;
                        }
                        z6 = true;
                        boolean zL2 = z6 | interfaceC1734nR.l(r30) | interfaceC1734nR.S(g1B) | interfaceC1734nR.S(g1A2) | interfaceC1734nR.S(g1A3) | interfaceC1734nR.S(g1A);
                        int i26 = iB;
                        if ((i18 & 896) == 256) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z14 = zL2 | z10;
                        z12 = ((i18 & 112) ^ 48) > 32 ? false : false;
                        z11 = z14 | z12;
                        objG = interfaceC1734nR.g();
                        if (z11) {
                            objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                            interfaceC1734nR.K(objG);
                        }
                        p210v.AbstractC7215i.a(dVarP, (p237x7.l) objG, interfaceC1734nR, 0);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        i19 = i26;
                        j14 = j12;
                        dVar2 = dVar4;
                    } else {
                        interfaceC1734nR.A();
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        dVar3 = dVar2;
                        f10 = fD;
                        iB = i14;
                        j13 = j11;
                        i16 = i12;
                    }
                    j12 = jA;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-115871647, i16, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:637)");
                    }
                    mVar = new p161q0.m(((Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e())).B0(f10), 0.0f, iB, 0, null, 26, null);
                    p200u.S sC2 = p200u.T.c(null, interfaceC1734nR, 0, 1);
                    p200u.x0 x0VarJ2 = p200u.z0.j(p247y7.C7349s.f57306a);
                    p200u.Q qE2 = p200u.AbstractC7177k.e(p200u.AbstractC7177k.l(6660, 0, p200u.H.e(), 2, null), null, 0L, 6, null);
                    int i27 = p200u.S.f54731f;
                    int i28 = p200u.Q.f54725d;
                    boolean z15 = true;
                    i17 = i16;
                    g1B = p200u.T.b(sC2, 0, 5, x0VarJ2, qE2, null, interfaceC1734nR, i27 | 432 | (i28 << 12), 16);
                    g1A = p200u.T.a(sC2, 0.0f, 286.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.l(1332, 0, p200u.H.e(), 2, null), null, 0L, 6, null), null, interfaceC1734nR, i27 | 432 | (i28 << 9), 8);
                    g1A2 = p200u.T.a(sC2, 0.0f, 290.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(S.B0.c.f9870D), null, 0L, 6, null), null, interfaceC1734nR, i27 | 432 | (i28 << 9), 8);
                    g1A3 = p200u.T.a(sC2, 0.0f, 290.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(S.B0.d.f9871D), null, 0L, 6, null), null, interfaceC1734nR, i27 | 432 | (i28 << 9), 8);
                    androidx.compose.ui.d dVarP2 = androidx.compose.foundation.layout.p.p(p210v.Z.a(dVar3), f9849e);
                    j11 = j13;
                    if (((i17 & 7168) ^ 3072) > 2048) {
                        dVar4 = dVar3;
                        i18 = i17;
                        if ((i18 & 3072) != 2048) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        dVar4 = dVar3;
                        i18 = i17;
                        if ((i18 & 3072) != 2048) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    boolean zL3 = z6 | interfaceC1734nR.l(r30) | interfaceC1734nR.S(g1B) | interfaceC1734nR.S(g1A2) | interfaceC1734nR.S(g1A3) | interfaceC1734nR.S(g1A);
                    int i29 = iB;
                    if ((i18 & 896) == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z16 = zL3 | z10;
                    if (((i18 & 112) ^ 48) > 32) {
                    }
                    z11 = z16 | z15;
                    objG = interfaceC1734nR.g();
                    if (z11) {
                        objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                        interfaceC1734nR.K(objG);
                    }
                    p210v.AbstractC7215i.a(dVarP2, (p237x7.l) objG, interfaceC1734nR, 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    i19 = i29;
                    j14 = j12;
                    dVar2 = dVar4;
                } else {
                    interfaceC1734nR.A();
                    j14 = jA;
                    f10 = fD;
                    i19 = i14;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.B0.b(dVar2, j14, f10, j11, i19, i10, i11));
                }
            }
            i12 |= 24576;
            i14 = i6;
            if ((i12 & 9363) == 9362) {
                interfaceC1734nR.q();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = S.A0.f9820a.a(interfaceC1734nR, 6);
                        i12 &= -113;
                    }
                    if (i21 != 0) {
                        fD = S.A0.f9820a.d();
                    }
                    if ((i11 & 8) != 0) {
                        jC = S.A0.f9820a.c(interfaceC1734nR, 6);
                        i12 &= -7169;
                    } else {
                        jC = j11;
                    }
                    if (i13 != 0) {
                        i16 = i12;
                        j13 = jC;
                        f10 = fD;
                        iB = S.A0.f9820a.b();
                        j12 = jA;
                    } else {
                        i16 = i12;
                        j12 = jA;
                        long j16 = jC;
                        f10 = fD;
                        iB = i14;
                        j13 = j16;
                    }
                } else {
                    if (i20 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = S.A0.f9820a.a(interfaceC1734nR, 6);
                        i12 &= -113;
                    }
                    if (i21 != 0) {
                        fD = S.A0.f9820a.d();
                    }
                    if ((i11 & 8) != 0) {
                        jC = S.A0.f9820a.c(interfaceC1734nR, 6);
                        i12 &= -7169;
                    } else {
                        jC = j11;
                    }
                    if (i13 != 0) {
                        i16 = i12;
                        j13 = jC;
                        f10 = fD;
                        iB = S.A0.f9820a.b();
                        j12 = jA;
                    } else {
                        i16 = i12;
                        j12 = jA;
                        long j17 = jC;
                        f10 = fD;
                        iB = i14;
                        j13 = j17;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-115871647, i16, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:637)");
                }
                mVar = new p161q0.m(((Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e())).B0(f10), 0.0f, iB, 0, null, 26, null);
                p200u.S sC3 = p200u.T.c(null, interfaceC1734nR, 0, 1);
                p200u.x0 x0VarJ3 = p200u.z0.j(p247y7.C7349s.f57306a);
                p200u.Q qE3 = p200u.AbstractC7177k.e(p200u.AbstractC7177k.l(6660, 0, p200u.H.e(), 2, null), null, 0L, 6, null);
                int i210 = p200u.S.f54731f;
                int i211 = p200u.Q.f54725d;
                boolean z17 = true;
                i17 = i16;
                g1B = p200u.T.b(sC3, 0, 5, x0VarJ3, qE3, null, interfaceC1734nR, i210 | 432 | (i211 << 12), 16);
                g1A = p200u.T.a(sC3, 0.0f, 286.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.l(1332, 0, p200u.H.e(), 2, null), null, 0L, 6, null), null, interfaceC1734nR, i210 | 432 | (i211 << 9), 8);
                g1A2 = p200u.T.a(sC3, 0.0f, 290.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(S.B0.c.f9870D), null, 0L, 6, null), null, interfaceC1734nR, i210 | 432 | (i211 << 9), 8);
                g1A3 = p200u.T.a(sC3, 0.0f, 290.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(S.B0.d.f9871D), null, 0L, 6, null), null, interfaceC1734nR, i210 | 432 | (i211 << 9), 8);
                androidx.compose.ui.d dVarP3 = androidx.compose.foundation.layout.p.p(p210v.Z.a(dVar3), f9849e);
                j11 = j13;
                if (((i17 & 7168) ^ 3072) > 2048) {
                    dVar4 = dVar3;
                    i18 = i17;
                    if ((i18 & 3072) != 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    dVar4 = dVar3;
                    i18 = i17;
                    if ((i18 & 3072) != 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                boolean zL4 = z6 | interfaceC1734nR.l(r30) | interfaceC1734nR.S(g1B) | interfaceC1734nR.S(g1A2) | interfaceC1734nR.S(g1A3) | interfaceC1734nR.S(g1A);
                int i212 = iB;
                if ((i18 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z18 = zL4 | z10;
                if (((i18 & 112) ^ 48) > 32) {
                }
                z11 = z18 | z17;
                objG = interfaceC1734nR.g();
                if (z11) {
                    objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                    interfaceC1734nR.K(objG);
                }
                p210v.AbstractC7215i.a(dVarP3, (p237x7.l) objG, interfaceC1734nR, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                i19 = i212;
                j14 = j12;
                dVar2 = dVar4;
            } else {
                interfaceC1734nR.q();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = S.A0.f9820a.a(interfaceC1734nR, 6);
                        i12 &= -113;
                    }
                    if (i21 != 0) {
                        fD = S.A0.f9820a.d();
                    }
                    if ((i11 & 8) != 0) {
                        jC = S.A0.f9820a.c(interfaceC1734nR, 6);
                        i12 &= -7169;
                    } else {
                        jC = j11;
                    }
                    if (i13 != 0) {
                        i16 = i12;
                        j13 = jC;
                        f10 = fD;
                        iB = S.A0.f9820a.b();
                        j12 = jA;
                    } else {
                        i16 = i12;
                        j12 = jA;
                        long j18 = jC;
                        f10 = fD;
                        iB = i14;
                        j13 = j18;
                    }
                } else {
                    if (i20 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = S.A0.f9820a.a(interfaceC1734nR, 6);
                        i12 &= -113;
                    }
                    if (i21 != 0) {
                        fD = S.A0.f9820a.d();
                    }
                    if ((i11 & 8) != 0) {
                        jC = S.A0.f9820a.c(interfaceC1734nR, 6);
                        i12 &= -7169;
                    } else {
                        jC = j11;
                    }
                    if (i13 != 0) {
                        i16 = i12;
                        j13 = jC;
                        f10 = fD;
                        iB = S.A0.f9820a.b();
                        j12 = jA;
                    } else {
                        i16 = i12;
                        j12 = jA;
                        long j19 = jC;
                        f10 = fD;
                        iB = i14;
                        j13 = j19;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-115871647, i16, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:637)");
                }
                mVar = new p161q0.m(((Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e())).B0(f10), 0.0f, iB, 0, null, 26, null);
                p200u.S sC4 = p200u.T.c(null, interfaceC1734nR, 0, 1);
                p200u.x0 x0VarJ4 = p200u.z0.j(p247y7.C7349s.f57306a);
                p200u.Q qE4 = p200u.AbstractC7177k.e(p200u.AbstractC7177k.l(6660, 0, p200u.H.e(), 2, null), null, 0L, 6, null);
                int i213 = p200u.S.f54731f;
                int i214 = p200u.Q.f54725d;
                boolean z19 = true;
                i17 = i16;
                g1B = p200u.T.b(sC4, 0, 5, x0VarJ4, qE4, null, interfaceC1734nR, i213 | 432 | (i214 << 12), 16);
                g1A = p200u.T.a(sC4, 0.0f, 286.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.l(1332, 0, p200u.H.e(), 2, null), null, 0L, 6, null), null, interfaceC1734nR, i213 | 432 | (i214 << 9), 8);
                g1A2 = p200u.T.a(sC4, 0.0f, 290.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(S.B0.c.f9870D), null, 0L, 6, null), null, interfaceC1734nR, i213 | 432 | (i214 << 9), 8);
                g1A3 = p200u.T.a(sC4, 0.0f, 290.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(S.B0.d.f9871D), null, 0L, 6, null), null, interfaceC1734nR, i213 | 432 | (i214 << 9), 8);
                androidx.compose.ui.d dVarP4 = androidx.compose.foundation.layout.p.p(p210v.Z.a(dVar3), f9849e);
                j11 = j13;
                if (((i17 & 7168) ^ 3072) > 2048) {
                    dVar4 = dVar3;
                    i18 = i17;
                    if ((i18 & 3072) != 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    dVar4 = dVar3;
                    i18 = i17;
                    if ((i18 & 3072) != 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                boolean zL5 = z6 | interfaceC1734nR.l(r30) | interfaceC1734nR.S(g1B) | interfaceC1734nR.S(g1A2) | interfaceC1734nR.S(g1A3) | interfaceC1734nR.S(g1A);
                int i215 = iB;
                if ((i18 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z110 = zL5 | z10;
                if (((i18 & 112) ^ 48) > 32) {
                }
                z11 = z110 | z19;
                objG = interfaceC1734nR.g();
                if (z11) {
                    objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                    interfaceC1734nR.K(objG);
                }
                p210v.AbstractC7215i.a(dVarP4, (p237x7.l) objG, interfaceC1734nR, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                i19 = i215;
                j14 = j12;
                dVar2 = dVar4;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.B0.b(dVar2, j14, f10, j11, i19, i10, i11));
            }
        }
        i12 |= 384;
        fD = f6;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                j11 = j10;
                if (interfaceC1734nR.j(j11)) {
                }
                i12 |= i22;
            } else {
                j11 = j10;
            }
            i12 |= i22;
        } else {
            j11 = j10;
        }
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                i14 = i6;
                if (interfaceC1734nR.i(i14)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i12 & 9363) == 9362) {
                interfaceC1734nR.q();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = S.A0.f9820a.a(interfaceC1734nR, 6);
                        i12 &= -113;
                    }
                    if (i21 != 0) {
                        fD = S.A0.f9820a.d();
                    }
                    if ((i11 & 8) != 0) {
                        jC = S.A0.f9820a.c(interfaceC1734nR, 6);
                        i12 &= -7169;
                    } else {
                        jC = j11;
                    }
                    if (i13 != 0) {
                        i16 = i12;
                        j13 = jC;
                        f10 = fD;
                        iB = S.A0.f9820a.b();
                        j12 = jA;
                    } else {
                        i16 = i12;
                        j12 = jA;
                        long j110 = jC;
                        f10 = fD;
                        iB = i14;
                        j13 = j110;
                    }
                } else {
                    if (i20 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = S.A0.f9820a.a(interfaceC1734nR, 6);
                        i12 &= -113;
                    }
                    if (i21 != 0) {
                        fD = S.A0.f9820a.d();
                    }
                    if ((i11 & 8) != 0) {
                        jC = S.A0.f9820a.c(interfaceC1734nR, 6);
                        i12 &= -7169;
                    } else {
                        jC = j11;
                    }
                    if (i13 != 0) {
                        i16 = i12;
                        j13 = jC;
                        f10 = fD;
                        iB = S.A0.f9820a.b();
                        j12 = jA;
                    } else {
                        i16 = i12;
                        j12 = jA;
                        long j111 = jC;
                        f10 = fD;
                        iB = i14;
                        j13 = j111;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-115871647, i16, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:637)");
                }
                mVar = new p161q0.m(((Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e())).B0(f10), 0.0f, iB, 0, null, 26, null);
                p200u.S sC5 = p200u.T.c(null, interfaceC1734nR, 0, 1);
                p200u.x0 x0VarJ5 = p200u.z0.j(p247y7.C7349s.f57306a);
                p200u.Q qE5 = p200u.AbstractC7177k.e(p200u.AbstractC7177k.l(6660, 0, p200u.H.e(), 2, null), null, 0L, 6, null);
                int i216 = p200u.S.f54731f;
                int i217 = p200u.Q.f54725d;
                boolean z111 = true;
                i17 = i16;
                g1B = p200u.T.b(sC5, 0, 5, x0VarJ5, qE5, null, interfaceC1734nR, i216 | 432 | (i217 << 12), 16);
                g1A = p200u.T.a(sC5, 0.0f, 286.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.l(1332, 0, p200u.H.e(), 2, null), null, 0L, 6, null), null, interfaceC1734nR, i216 | 432 | (i217 << 9), 8);
                g1A2 = p200u.T.a(sC5, 0.0f, 290.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(S.B0.c.f9870D), null, 0L, 6, null), null, interfaceC1734nR, i216 | 432 | (i217 << 9), 8);
                g1A3 = p200u.T.a(sC5, 0.0f, 290.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(S.B0.d.f9871D), null, 0L, 6, null), null, interfaceC1734nR, i216 | 432 | (i217 << 9), 8);
                androidx.compose.ui.d dVarP5 = androidx.compose.foundation.layout.p.p(p210v.Z.a(dVar3), f9849e);
                j11 = j13;
                if (((i17 & 7168) ^ 3072) > 2048) {
                    dVar4 = dVar3;
                    i18 = i17;
                    if ((i18 & 3072) != 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    dVar4 = dVar3;
                    i18 = i17;
                    if ((i18 & 3072) != 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                boolean zL6 = z6 | interfaceC1734nR.l(r30) | interfaceC1734nR.S(g1B) | interfaceC1734nR.S(g1A2) | interfaceC1734nR.S(g1A3) | interfaceC1734nR.S(g1A);
                int i218 = iB;
                if ((i18 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z112 = zL6 | z10;
                if (((i18 & 112) ^ 48) > 32) {
                }
                z11 = z112 | z111;
                objG = interfaceC1734nR.g();
                if (z11) {
                    objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                    interfaceC1734nR.K(objG);
                }
                p210v.AbstractC7215i.a(dVarP5, (p237x7.l) objG, interfaceC1734nR, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                i19 = i218;
                j14 = j12;
                dVar2 = dVar4;
            } else {
                interfaceC1734nR.q();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = S.A0.f9820a.a(interfaceC1734nR, 6);
                        i12 &= -113;
                    }
                    if (i21 != 0) {
                        fD = S.A0.f9820a.d();
                    }
                    if ((i11 & 8) != 0) {
                        jC = S.A0.f9820a.c(interfaceC1734nR, 6);
                        i12 &= -7169;
                    } else {
                        jC = j11;
                    }
                    if (i13 != 0) {
                        i16 = i12;
                        j13 = jC;
                        f10 = fD;
                        iB = S.A0.f9820a.b();
                        j12 = jA;
                    } else {
                        i16 = i12;
                        j12 = jA;
                        long j112 = jC;
                        f10 = fD;
                        iB = i14;
                        j13 = j112;
                    }
                } else {
                    if (i20 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = S.A0.f9820a.a(interfaceC1734nR, 6);
                        i12 &= -113;
                    }
                    if (i21 != 0) {
                        fD = S.A0.f9820a.d();
                    }
                    if ((i11 & 8) != 0) {
                        jC = S.A0.f9820a.c(interfaceC1734nR, 6);
                        i12 &= -7169;
                    } else {
                        jC = j11;
                    }
                    if (i13 != 0) {
                        i16 = i12;
                        j13 = jC;
                        f10 = fD;
                        iB = S.A0.f9820a.b();
                        j12 = jA;
                    } else {
                        i16 = i12;
                        j12 = jA;
                        long j113 = jC;
                        f10 = fD;
                        iB = i14;
                        j13 = j113;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-115871647, i16, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:637)");
                }
                mVar = new p161q0.m(((Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e())).B0(f10), 0.0f, iB, 0, null, 26, null);
                p200u.S sC6 = p200u.T.c(null, interfaceC1734nR, 0, 1);
                p200u.x0 x0VarJ6 = p200u.z0.j(p247y7.C7349s.f57306a);
                p200u.Q qE6 = p200u.AbstractC7177k.e(p200u.AbstractC7177k.l(6660, 0, p200u.H.e(), 2, null), null, 0L, 6, null);
                int i219 = p200u.S.f54731f;
                int i2110 = p200u.Q.f54725d;
                boolean z113 = true;
                i17 = i16;
                g1B = p200u.T.b(sC6, 0, 5, x0VarJ6, qE6, null, interfaceC1734nR, i219 | 432 | (i2110 << 12), 16);
                g1A = p200u.T.a(sC6, 0.0f, 286.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.l(1332, 0, p200u.H.e(), 2, null), null, 0L, 6, null), null, interfaceC1734nR, i219 | 432 | (i2110 << 9), 8);
                g1A2 = p200u.T.a(sC6, 0.0f, 290.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(S.B0.c.f9870D), null, 0L, 6, null), null, interfaceC1734nR, i219 | 432 | (i2110 << 9), 8);
                g1A3 = p200u.T.a(sC6, 0.0f, 290.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(S.B0.d.f9871D), null, 0L, 6, null), null, interfaceC1734nR, i219 | 432 | (i2110 << 9), 8);
                androidx.compose.ui.d dVarP6 = androidx.compose.foundation.layout.p.p(p210v.Z.a(dVar3), f9849e);
                j11 = j13;
                if (((i17 & 7168) ^ 3072) > 2048) {
                    dVar4 = dVar3;
                    i18 = i17;
                    if ((i18 & 3072) != 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    dVar4 = dVar3;
                    i18 = i17;
                    if ((i18 & 3072) != 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                boolean zL7 = z6 | interfaceC1734nR.l(r30) | interfaceC1734nR.S(g1B) | interfaceC1734nR.S(g1A2) | interfaceC1734nR.S(g1A3) | interfaceC1734nR.S(g1A);
                int i2111 = iB;
                if ((i18 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z114 = zL7 | z10;
                if (((i18 & 112) ^ 48) > 32) {
                }
                z11 = z114 | z113;
                objG = interfaceC1734nR.g();
                if (z11) {
                    objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                    interfaceC1734nR.K(objG);
                }
                p210v.AbstractC7215i.a(dVarP6, (p237x7.l) objG, interfaceC1734nR, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                i19 = i2111;
                j14 = j12;
                dVar2 = dVar4;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.B0.b(dVar2, j14, f10, j11, i19, i10, i11));
            }
        }
        i12 |= 24576;
        i14 = i6;
        if ((i12 & 9363) == 9362) {
            interfaceC1734nR.q();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = S.A0.f9820a.a(interfaceC1734nR, 6);
                    i12 &= -113;
                }
                if (i21 != 0) {
                    fD = S.A0.f9820a.d();
                }
                if ((i11 & 8) != 0) {
                    jC = S.A0.f9820a.c(interfaceC1734nR, 6);
                    i12 &= -7169;
                } else {
                    jC = j11;
                }
                if (i13 != 0) {
                    i16 = i12;
                    j13 = jC;
                    f10 = fD;
                    iB = S.A0.f9820a.b();
                    j12 = jA;
                } else {
                    i16 = i12;
                    j12 = jA;
                    long j114 = jC;
                    f10 = fD;
                    iB = i14;
                    j13 = j114;
                }
            } else {
                if (i20 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = S.A0.f9820a.a(interfaceC1734nR, 6);
                    i12 &= -113;
                }
                if (i21 != 0) {
                    fD = S.A0.f9820a.d();
                }
                if ((i11 & 8) != 0) {
                    jC = S.A0.f9820a.c(interfaceC1734nR, 6);
                    i12 &= -7169;
                } else {
                    jC = j11;
                }
                if (i13 != 0) {
                    i16 = i12;
                    j13 = jC;
                    f10 = fD;
                    iB = S.A0.f9820a.b();
                    j12 = jA;
                } else {
                    i16 = i12;
                    j12 = jA;
                    long j115 = jC;
                    f10 = fD;
                    iB = i14;
                    j13 = j115;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-115871647, i16, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:637)");
            }
            mVar = new p161q0.m(((Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e())).B0(f10), 0.0f, iB, 0, null, 26, null);
            p200u.S sC7 = p200u.T.c(null, interfaceC1734nR, 0, 1);
            p200u.x0 x0VarJ7 = p200u.z0.j(p247y7.C7349s.f57306a);
            p200u.Q qE7 = p200u.AbstractC7177k.e(p200u.AbstractC7177k.l(6660, 0, p200u.H.e(), 2, null), null, 0L, 6, null);
            int i2112 = p200u.S.f54731f;
            int i2113 = p200u.Q.f54725d;
            boolean z115 = true;
            i17 = i16;
            g1B = p200u.T.b(sC7, 0, 5, x0VarJ7, qE7, null, interfaceC1734nR, i2112 | 432 | (i2113 << 12), 16);
            g1A = p200u.T.a(sC7, 0.0f, 286.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.l(1332, 0, p200u.H.e(), 2, null), null, 0L, 6, null), null, interfaceC1734nR, i2112 | 432 | (i2113 << 9), 8);
            g1A2 = p200u.T.a(sC7, 0.0f, 290.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(S.B0.c.f9870D), null, 0L, 6, null), null, interfaceC1734nR, i2112 | 432 | (i2113 << 9), 8);
            g1A3 = p200u.T.a(sC7, 0.0f, 290.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(S.B0.d.f9871D), null, 0L, 6, null), null, interfaceC1734nR, i2112 | 432 | (i2113 << 9), 8);
            androidx.compose.ui.d dVarP7 = androidx.compose.foundation.layout.p.p(p210v.Z.a(dVar3), f9849e);
            j11 = j13;
            if (((i17 & 7168) ^ 3072) > 2048) {
                dVar4 = dVar3;
                i18 = i17;
                if ((i18 & 3072) != 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                dVar4 = dVar3;
                i18 = i17;
                if ((i18 & 3072) != 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            boolean zL8 = z6 | interfaceC1734nR.l(r30) | interfaceC1734nR.S(g1B) | interfaceC1734nR.S(g1A2) | interfaceC1734nR.S(g1A3) | interfaceC1734nR.S(g1A);
            int i2114 = iB;
            if ((i18 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z116 = zL8 | z10;
            if (((i18 & 112) ^ 48) > 32) {
            }
            z11 = z116 | z115;
            objG = interfaceC1734nR.g();
            if (z11) {
                objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                interfaceC1734nR.K(objG);
            } else {
                objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                interfaceC1734nR.K(objG);
            }
            p210v.AbstractC7215i.a(dVarP7, (p237x7.l) objG, interfaceC1734nR, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            i19 = i2114;
            j14 = j12;
            dVar2 = dVar4;
        } else {
            interfaceC1734nR.q();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = S.A0.f9820a.a(interfaceC1734nR, 6);
                    i12 &= -113;
                }
                if (i21 != 0) {
                    fD = S.A0.f9820a.d();
                }
                if ((i11 & 8) != 0) {
                    jC = S.A0.f9820a.c(interfaceC1734nR, 6);
                    i12 &= -7169;
                } else {
                    jC = j11;
                }
                if (i13 != 0) {
                    i16 = i12;
                    j13 = jC;
                    f10 = fD;
                    iB = S.A0.f9820a.b();
                    j12 = jA;
                } else {
                    i16 = i12;
                    j12 = jA;
                    long j116 = jC;
                    f10 = fD;
                    iB = i14;
                    j13 = j116;
                }
            } else {
                if (i20 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = S.A0.f9820a.a(interfaceC1734nR, 6);
                    i12 &= -113;
                }
                if (i21 != 0) {
                    fD = S.A0.f9820a.d();
                }
                if ((i11 & 8) != 0) {
                    jC = S.A0.f9820a.c(interfaceC1734nR, 6);
                    i12 &= -7169;
                } else {
                    jC = j11;
                }
                if (i13 != 0) {
                    i16 = i12;
                    j13 = jC;
                    f10 = fD;
                    iB = S.A0.f9820a.b();
                    j12 = jA;
                } else {
                    i16 = i12;
                    j12 = jA;
                    long j117 = jC;
                    f10 = fD;
                    iB = i14;
                    j13 = j117;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-115871647, i16, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:637)");
            }
            mVar = new p161q0.m(((Y0.e) interfaceC1734nR.n(androidx.compose.ui.platform.AbstractC1966p0.e())).B0(f10), 0.0f, iB, 0, null, 26, null);
            p200u.S sC8 = p200u.T.c(null, interfaceC1734nR, 0, 1);
            p200u.x0 x0VarJ8 = p200u.z0.j(p247y7.C7349s.f57306a);
            p200u.Q qE8 = p200u.AbstractC7177k.e(p200u.AbstractC7177k.l(6660, 0, p200u.H.e(), 2, null), null, 0L, 6, null);
            int i2115 = p200u.S.f54731f;
            int i2116 = p200u.Q.f54725d;
            boolean z117 = true;
            i17 = i16;
            g1B = p200u.T.b(sC8, 0, 5, x0VarJ8, qE8, null, interfaceC1734nR, i2115 | 432 | (i2116 << 12), 16);
            g1A = p200u.T.a(sC8, 0.0f, 286.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.l(1332, 0, p200u.H.e(), 2, null), null, 0L, 6, null), null, interfaceC1734nR, i2115 | 432 | (i2116 << 9), 8);
            g1A2 = p200u.T.a(sC8, 0.0f, 290.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(S.B0.c.f9870D), null, 0L, 6, null), null, interfaceC1734nR, i2115 | 432 | (i2116 << 9), 8);
            g1A3 = p200u.T.a(sC8, 0.0f, 290.0f, p200u.AbstractC7177k.e(p200u.AbstractC7177k.f(S.B0.d.f9871D), null, 0L, 6, null), null, interfaceC1734nR, i2115 | 432 | (i2116 << 9), 8);
            androidx.compose.ui.d dVarP8 = androidx.compose.foundation.layout.p.p(p210v.Z.a(dVar3), f9849e);
            j11 = j13;
            if (((i17 & 7168) ^ 3072) > 2048) {
                dVar4 = dVar3;
                i18 = i17;
                if ((i18 & 3072) != 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                dVar4 = dVar3;
                i18 = i17;
                if ((i18 & 3072) != 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            boolean zL9 = z6 | interfaceC1734nR.l(r30) | interfaceC1734nR.S(g1B) | interfaceC1734nR.S(g1A2) | interfaceC1734nR.S(g1A3) | interfaceC1734nR.S(g1A);
            int i2117 = iB;
            if ((i18 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z118 = zL9 | z10;
            if (((i18 & 112) ^ 48) > 32) {
            }
            z11 = z118 | z117;
            objG = interfaceC1734nR.g();
            if (z11) {
                objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                interfaceC1734nR.K(objG);
            } else {
                objG = new S.B0.a(j11, mVar, g1B, g1A2, g1A3, g1A, f10, j12);
                interfaceC1734nR.K(objG);
            }
            p210v.AbstractC7215i.a(dVarP8, (p237x7.l) objG, interfaceC1734nR, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            i19 = i2117;
            j14 = j12;
            dVar2 = dVar4;
        }
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.B0.b(dVar2, j14, f10, j11, i19, i10, i11));
        }
    }

    private static final void f(p161q0.g gVar, float f6, float f10, long j6, p161q0.m mVar) {
        float f11 = 2;
        float f12 = mVar.f() / f11;
        float fI = p131n0.m.i(gVar.i()) - (f11 * f12);
        p161q0.f.d(gVar, j6, f6, f10, false, p131n0.h.a(f12, f12), p131n0.n.a(fI, fI), 0.0f, mVar, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(p161q0.g gVar, long j6, p161q0.m mVar) {
        f(gVar, 0.0f, 360.0f, j6, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(p161q0.g gVar, float f6, float f10, float f11, long j6, p161q0.m mVar) {
        f(gVar, f6 + (p141o0.g2.e(mVar.b(), p141o0.g2.f52226a.a()) ? 0.0f : ((f10 / Y0.i.q(f9849e / 2)) * 57.29578f) / 2.0f), java.lang.Math.max(f11, 0.1f), j6, mVar);
    }
}
