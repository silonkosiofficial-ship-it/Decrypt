package S;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final A.B f10031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f10032b = Y0.i.q(16);

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.String f10033D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.String f10034E;

        /* JADX INFO: renamed from: S.K$a$a, reason: collision with other inner class name */
        static final class C0224a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ java.lang.String f10035D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ java.lang.String f10036E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0224a(java.lang.String str, java.lang.String str2) {
                super(1);
                this.f10035D = str;
                this.f10036E = str2;
            }

            public final void a(K0.w wVar) {
                K0.u.O(wVar, this.f10035D + ", " + this.f10036E);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((K0.w) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.lang.String str, java.lang.String str2) {
            super(2);
            this.f10033D = str;
            this.f10034E = str2;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1819015125, i6, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:87)");
            }
            java.lang.String str = this.f10033D;
            androidx.compose.ui.d.a aVar = androidx.compose.ui.d.f19586a;
            boolean zS = interfaceC1734n.S(this.f10033D) | interfaceC1734n.S(this.f10034E);
            java.lang.String str2 = this.f10033D;
            java.lang.String str3 = this.f10034E;
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new S.K.a.C0224a(str2, str3);
                interfaceC1734n.K(objG);
            }
            S.m1.b(str, K0.n.d(aVar, false, (p237x7.l) objG, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1734n, 0, 0, 131068);
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

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.String f10037D;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final S.K.b.a f10038D = new S.K.b.a();

            a() {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.lang.String str) {
            super(2);
            this.f10037D = str;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-564233108, i6, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:92)");
            }
            S.m1.b(this.f10037D, K0.n.a(androidx.compose.ui.d.f19586a, S.K.b.a.f10038D), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1734n, 0, 0, 131068);
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
        final /* synthetic */ java.lang.Long f10039D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.l f10040E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ T.AbstractC1647f f10041F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ E7.i f10042G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ S.Q f10043H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ S.P0 f10044I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ S.M f10045J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f10046K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(java.lang.Long l6, p237x7.l lVar, T.AbstractC1647f abstractC1647f, E7.i iVar, S.Q q6, S.P0 p6, S.M m6, int i6) {
            super(2);
            this.f10039D = l6;
            this.f10040E = lVar;
            this.f10041F = abstractC1647f;
            this.f10042G = iVar;
            this.f10043H = q6;
            this.f10044I = p6;
            this.f10045J = m6;
            this.f10046K = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.K.a(this.f10039D, this.f10040E, this.f10041F, this.f10042G, this.f10043H, this.f10044I, this.f10045J, interfaceC1734n, V.S0.a(this.f10046K | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ T.k f10047D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f10048E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.l f10049F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ T.AbstractC1647f f10050G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ S.L f10051H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f10052I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ java.util.Locale f10053J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f10054K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(T.k kVar, V.InterfaceC1753w0 interfaceC1753w0, p237x7.l lVar, T.AbstractC1647f abstractC1647f, S.L l6, int i6, java.util.Locale locale, V.InterfaceC1753w0 interfaceC1753w1) {
            super(1);
            this.f10047D = kVar;
            this.f10048E = interfaceC1753w0;
            this.f10049F = lVar;
            this.f10050G = abstractC1647f;
            this.f10051H = l6;
            this.f10052I = i6;
            this.f10053J = locale;
            this.f10054K = interfaceC1753w1;
        }

        public final void a(S0.V v6) {
            if (v6.i().length() <= this.f10047D.c().length()) {
                java.lang.String strI = v6.i();
                for (int i6 = 0; i6 < strI.length(); i6++) {
                    if (!java.lang.Character.isDigit(strI.charAt(i6))) {
                        return;
                    }
                }
                S.K.d(this.f10054K, v6);
                java.lang.String string = S8.r.u1(v6.i()).toString();
                java.lang.Long lValueOf = null;
                if (string.length() == 0 || string.length() < this.f10047D.c().length()) {
                    this.f10048E.setValue("");
                    this.f10049F.l(null);
                    return;
                }
                T.C1646e c1646eK = this.f10050G.k(string, this.f10047D.c());
                this.f10048E.setValue(this.f10051H.b(c1646eK, this.f10052I, this.f10053J));
                p237x7.l lVar = this.f10049F;
                if (((java.lang.CharSequence) this.f10048E.getValue()).length() == 0 && c1646eK != null) {
                    lValueOf = java.lang.Long.valueOf(c1646eK.i());
                }
                lVar.l(lValueOf);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((S0.V) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f10055D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(V.InterfaceC1753w0 interfaceC1753w0) {
            super(1);
            this.f10055D = interfaceC1753w0;
        }

        public final void a(K0.w wVar) {
            if (!S8.r.s0((java.lang.CharSequence) this.f10055D.getValue())) {
                K0.u.m(wVar, (java.lang.String) this.f10055D.getValue());
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((K0.w) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f10056D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(V.InterfaceC1753w0 interfaceC1753w0) {
            super(2);
            this.f10056D = interfaceC1753w0;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-591991974, i6, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:191)");
            }
            if (!S8.r.s0((java.lang.CharSequence) this.f10056D.getValue())) {
                S.m1.b((java.lang.String) this.f10056D.getValue(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1734n, 0, 0, 131070);
            }
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

    static final class g extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10057D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.Long f10058E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.l f10059F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ T.AbstractC1647f f10060G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10061H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f10062I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f10063J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ S.L f10064K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ T.k f10065L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ java.util.Locale f10066M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ S.M f10067N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f10068O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        final /* synthetic */ int f10069P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(androidx.compose.ui.d dVar, java.lang.Long l6, p237x7.l lVar, T.AbstractC1647f abstractC1647f, p237x7.p pVar, p237x7.p pVar2, int i6, S.L l10, T.k kVar, java.util.Locale locale, S.M m6, int i10, int i11) {
            super(2);
            this.f10057D = dVar;
            this.f10058E = l6;
            this.f10059F = lVar;
            this.f10060G = abstractC1647f;
            this.f10061H = pVar;
            this.f10062I = pVar2;
            this.f10063J = i6;
            this.f10064K = l10;
            this.f10065L = kVar;
            this.f10066M = locale;
            this.f10067N = m6;
            this.f10068O = i10;
            this.f10069P = i11;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.K.b(this.f10057D, this.f10058E, this.f10059F, this.f10060G, this.f10061H, this.f10062I, this.f10063J, this.f10064K, this.f10065L, this.f10066M, this.f10067N, interfaceC1734n, V.S0.a(this.f10068O | 1), V.S0.a(this.f10069P));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.K.h f10070D = new S.K.h();

        h() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.InterfaceC1753w0 b() {
            return V.A1.d("", null, 2, null);
        }
    }

    static final class i extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.Long f10071D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ T.AbstractC1647f f10072E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ T.k f10073F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ java.util.Locale f10074G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(java.lang.Long l6, T.AbstractC1647f abstractC1647f, T.k kVar, java.util.Locale locale) {
            super(0);
            this.f10071D = l6;
            this.f10072E = abstractC1647f;
            this.f10073F = kVar;
            this.f10074G = locale;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.InterfaceC1753w0 b() {
            java.lang.String strA;
            java.lang.Long l6 = this.f10071D;
            if (l6 != null) {
                T.AbstractC1647f abstractC1647f = this.f10072E;
                T.k kVar = this.f10073F;
                strA = abstractC1647f.a(l6.longValue(), kVar.c(), this.f10074G);
                if (strA == null) {
                    strA = "";
                }
            } else {
                strA = "";
            }
            return V.A1.d(new S0.V(strA, M0.O.b(0, 0), (M0.N) null, 4, (p247y7.AbstractC7342k) null), null, 2, null);
        }
    }

    static {
        float f6 = 24;
        f10031a = androidx.compose.foundation.layout.m.e(Y0.i.q(f6), Y0.i.q(10), Y0.i.q(f6), 0.0f, 8, null);
    }

    public static final void a(java.lang.Long l6, p237x7.l lVar, T.AbstractC1647f abstractC1647f, E7.i iVar, S.Q q6, S.P0 p6, S.M m6, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        T.k kVar;
        V.InterfaceC1734n interfaceC1734n2;
        V.InterfaceC1734n interfaceC1734n3;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(643325609);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.S(l6) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.l(lVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i10 |= interfaceC1734nR.l(abstractC1647f) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i10 |= interfaceC1734nR.l(iVar) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i10 |= (i6 & 32768) == 0 ? interfaceC1734nR.S(q6) : interfaceC1734nR.l(q6) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i10 |= interfaceC1734nR.S(p6) ? 131072 : 65536;
        }
        if ((1572864 & i6) == 0) {
            i10 |= interfaceC1734nR.S(m6) ? 1048576 : 524288;
        }
        int i11 = i10;
        if ((599187 & i11) == 599186 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
            interfaceC1734n3 = interfaceC1734nR;
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(643325609, i11, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:60)");
            }
            java.util.Locale localeA = S.AbstractC1561o.a(interfaceC1734nR, 0);
            boolean zS = interfaceC1734nR.S(localeA);
            java.lang.Object objG = interfaceC1734nR.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = abstractC1647f.c(localeA);
                interfaceC1734nR.K(objG);
            }
            T.k kVar2 = (T.k) objG;
            T.x.a aVar = T.x.f12882a;
            java.lang.String strA = T.y.a(T.x.a(S.C0.f9928c), interfaceC1734nR, 0);
            java.lang.String strA2 = T.y.a(T.x.a(S.C0.f9930e), interfaceC1734nR, 0);
            java.lang.String strA3 = T.y.a(T.x.a(S.C0.f9929d), interfaceC1734nR, 0);
            boolean zS2 = interfaceC1734nR.S(kVar2) | ((i11 & 57344) == 16384 || ((i11 & 32768) != 0 && interfaceC1734nR.S(q6)));
            java.lang.Object objG2 = interfaceC1734nR.g();
            if (zS2 || objG2 == V.InterfaceC1734n.f14931a.a()) {
                kVar = kVar2;
                S.L l10 = new S.L(iVar, p6, kVar, q6, strA, strA2, strA3, "", null, null, 768, null);
                interfaceC1734n2 = interfaceC1734nR;
                interfaceC1734n2.K(l10);
                objG2 = l10;
            } else {
                kVar = kVar2;
                interfaceC1734n2 = interfaceC1734nR;
            }
            S.L l11 = (S.L) objG2;
            java.lang.String upperCase = kVar.b().toUpperCase(java.util.Locale.ROOT);
            p247y7.AbstractC7350t.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            java.lang.String strA4 = T.y.a(T.x.a(S.C0.f9931f), interfaceC1734n2, 0);
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.m.h(androidx.compose.foundation.layout.p.f(androidx.compose.ui.d.f19586a, 0.0f, r12, null), f10031a);
            int iB = S.AbstractC1552j0.f11204a.b();
            l11.a(l6);
            p031d0.a aVarE = p031d0.c.e(-1819015125, r12, new S.K.a(strA4, upperCase), interfaceC1734n2, 54);
            p031d0.a aVarE2 = p031d0.c.e(-564233108, true, new S.K.b(upperCase), interfaceC1734n2, 54);
            int i12 = i11 << 3;
            interfaceC1734n3 = interfaceC1734n2;
            b(dVarH, l6, lVar, abstractC1647f, aVarE, aVarE2, iB, l11, kVar, localeA, m6, interfaceC1734n2, (i12 & 112) | 1794054 | (i12 & 896) | (i12 & 7168), (i11 >> 18) & 14);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734n3.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.K.c(l6, lVar, abstractC1647f, iVar, q6, p6, m6, i6));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v13 ??, still in use, count: 1, list:
          (r0v13 ?? I:java.lang.Object) from 0x01f8: INVOKE (r1v1 ?? I:V.n), (r0v13 ?? I:java.lang.Object) INTERFACE call: V.n.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void b(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v13 ??, still in use, count: 1, list:
          (r0v13 ?? I:java.lang.Object) from 0x01f8: INVOKE (r1v1 ?? I:V.n), (r0v13 ?? I:java.lang.Object) INTERFACE call: V.n.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r48v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    private static final S0.V c(V.InterfaceC1753w0 interfaceC1753w0) {
        return (S0.V) interfaceC1753w0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(V.InterfaceC1753w0 interfaceC1753w0, S0.V v6) {
        interfaceC1753w0.setValue(v6);
    }
}
