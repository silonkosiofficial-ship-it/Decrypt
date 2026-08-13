package S;

/* JADX INFO: renamed from: S.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1564p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final V.O0 f11495a = V.AbstractC1756y.f(S.AbstractC1564p0.a.f11496D);

    /* JADX INFO: renamed from: S.p0$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S.AbstractC1564p0.a f11496D = new S.AbstractC1564p0.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            return java.lang.Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: S.p0$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ S.A1 f11497D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11498E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(S.A1 a6, p237x7.p pVar) {
            super(2);
            this.f11497D = a6;
            this.f11498E = pVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1066563262, i6, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:68)");
            }
            S.m1.a(this.f11497D.a(), this.f11498E, interfaceC1734n, 0);
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

    /* JADX INFO: renamed from: S.p0$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ S.C1591z f11499D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ S.S0 f11500E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ S.A1 f11501F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.p f11502G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f11503H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f11504I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(S.C1591z c1591z, S.S0 s6, S.A1 a6, p237x7.p pVar, int i6, int i10) {
            super(2);
            this.f11499D = c1591z;
            this.f11500E = s6;
            this.f11501F = a6;
            this.f11502G = pVar;
            this.f11503H = i6;
            this.f11504I = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.AbstractC1564p0.a(this.f11499D, this.f11500E, this.f11501F, this.f11502G, interfaceC1734n, V.S0.a(this.f11503H | 1), this.f11504I);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static final void a(S.C1591z c1591z, S.S0 s6, S.A1 a6, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        S.C1591z c1591zA;
        int i11;
        S.S0 s0B;
        S.A1 a1C;
        S.S0 s10;
        S.A1 a10;
        S.C1591z c1591z2;
        int i12;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-2127166334);
        if ((i6 & 6) == 0) {
            if ((i10 & 1) == 0) {
                c1591zA = c1591z;
                if (interfaceC1734nR.S(c1591zA)) {
                    i12 = 4;
                }
                i11 = i12 | i6;
            } else {
                c1591zA = c1591z;
            }
            i12 = 2;
            i11 = i12 | i6;
        } else {
            c1591zA = c1591z;
            i11 = i6;
        }
        if ((i6 & 48) == 0) {
            if ((i10 & 2) == 0) {
                s0B = s6;
                int i13 = interfaceC1734nR.S(s0B) ? 32 : 16;
                i11 |= i13;
            } else {
                s0B = s6;
            }
            i11 |= i13;
        } else {
            s0B = s6;
        }
        if ((i6 & 384) == 0) {
            if ((i10 & 4) == 0) {
                a1C = a6;
                int i14 = interfaceC1734nR.S(a1C) ? 256 : 128;
                i11 |= i14;
            } else {
                a1C = a6;
            }
            i11 |= i14;
        } else {
            a1C = a6;
        }
        if ((i10 & 8) != 0) {
            i11 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i11 |= interfaceC1734nR.l(pVar) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
            c1591z2 = c1591zA;
            s10 = s0B;
            a10 = a1C;
        } else {
            interfaceC1734nR.q();
            if ((i6 & 1) == 0 || interfaceC1734nR.G()) {
                if ((i10 & 1) != 0) {
                    c1591zA = S.C1562o0.f11478a.a(interfaceC1734nR, 6);
                    i11 &= -15;
                }
                if ((i10 & 2) != 0) {
                    s0B = S.C1562o0.f11478a.b(interfaceC1734nR, 6);
                    i11 &= -113;
                }
                if ((i10 & 4) != 0) {
                    a1C = S.C1562o0.f11478a.c(interfaceC1734nR, 6);
                    i11 &= -897;
                }
            } else {
                interfaceC1734nR.A();
                if ((i10 & 1) != 0) {
                    i11 &= -15;
                }
                if ((i10 & 2) != 0) {
                    i11 &= -113;
                }
                if ((i10 & 4) != 0) {
                    i11 &= -897;
                }
            }
            S.C1591z c1591z3 = c1591zA;
            int i15 = i11;
            S.S0 s11 = s0B;
            S.A1 a11 = a1C;
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-2127166334, i15, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:55)");
            }
            V.AbstractC1756y.b(new V.P0[]{S.A.g().d(c1591z3), androidx.compose.foundation.h.a().d(S.I0.c(false, 0.0f, 0L, interfaceC1734nR, 0, 7)), R.s.d().d(S.B.f9844b), S.T0.d().d(s11), N.K.b().d(b(c1591z3, interfaceC1734nR, i15 & 14)), S.B1.b().d(a11)}, p031d0.c.e(-1066563262, true, new S.AbstractC1564p0.b(a11, pVar), interfaceC1734nR, 54), interfaceC1734nR, V.P0.f14698i | 48);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            s10 = s11;
            a10 = a11;
            c1591z2 = c1591z3;
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.AbstractC1564p0.c(c1591z2, s10, a10, pVar, i6, i10));
        }
    }

    public static final N.J b(S.C1591z c1591z, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1866455512, i6, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:159)");
        }
        long J10 = c1591z.J();
        boolean zJ = interfaceC1734n.j(J10);
        java.lang.Object objG = interfaceC1734n.g();
        if (zJ || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new N.J(J10, p141o0.C7016y0.m(J10, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            interfaceC1734n.K(objG);
        }
        N.J j6 = (N.J) objG;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return j6;
    }
}
