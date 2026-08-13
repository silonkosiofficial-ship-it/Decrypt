package S;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S.f1 f11079a = new S.f1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f11080b = Y0.i.q(52);

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f11082E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ float f11083F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ long f11084G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f11085H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f11086I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.d dVar, float f6, long j6, int i6, int i10) {
            super(2);
            this.f11082E = dVar;
            this.f11083F = f6;
            this.f11084G = j6;
            this.f11085H = i6;
            this.f11086I = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.f1.this.a(this.f11082E, this.f11083F, this.f11084G, interfaceC1734n, V.S0.a(this.f11085H | 1), this.f11086I);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ S.e1 f11087D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(S.e1 e1Var) {
            super(1);
            this.f11087D = e1Var;
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
        final /* synthetic */ S.e1 f11088D;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ V.G1 f11089D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(V.G1 g6) {
                super(1);
                this.f11089D = g6;
            }

            public final long a(Y0.e eVar) {
                return Y0.q.a(eVar.S0(S.f1.c.g(this.f11089D)), 0);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                return Y0.p.b(a((Y0.e) obj));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(S.e1 e1Var) {
            super(3);
            this.f11088D = e1Var;
        }

        private static final float f(V.G1 g6) {
            return ((Y0.i) g6.getValue()).v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float g(V.G1 g6) {
            return ((Y0.i) g6.getValue()).v();
        }

        public final androidx.compose.ui.d e(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(-1541271084);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1541271084, i6, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:1265)");
            }
            V.G1 g1C = p200u.AbstractC7161c.c(this.f11088D.c(), S.g1.f11093c, null, null, interfaceC1734n, 0, 12);
            V.G1 g1C2 = p200u.AbstractC7161c.c(this.f11088D.a(), S.g1.f11093c, null, null, interfaceC1734n, 0, 12);
            androidx.compose.ui.d dVarZ = androidx.compose.foundation.layout.p.z(androidx.compose.foundation.layout.p.f(dVar, 0.0f, 1, null), p071h0.c.f45778a.d(), false, 2, null);
            boolean zS = interfaceC1734n.S(g1C2);
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new S.f1.c.a(g1C2);
                interfaceC1734n.K(objG);
            }
            androidx.compose.ui.d dVarT = androidx.compose.foundation.layout.p.t(androidx.compose.foundation.layout.k.a(dVarZ, (p237x7.l) objG), f(g1C));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return dVarT;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return e((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    private f1() {
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d A[PHI: r2 r3 r4
  0x008d: PHI (r2v5 androidx.compose.ui.d) = (r2v2 androidx.compose.ui.d), (r2v7 androidx.compose.ui.d) binds: [B:58:0x00a2, B:49:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x008d: PHI (r3v9 float) = (r3v5 float), (r3v10 float) binds: [B:58:0x00a2, B:49:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x008d: PHI (r4v13 int) = (r4v9 int), (r4v15 int) binds: [B:58:0x00a2, B:49:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public final void a(androidx.compose.ui.d dVar, float f6, long j6, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        androidx.compose.ui.d dVar2;
        int i11;
        float f10;
        long j10;
        androidx.compose.ui.d dVar3;
        float fB;
        int i12;
        long jH;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1498258020);
        int i13 = i10 & 1;
        if (i13 != 0) {
            i11 = i6 | 6;
            dVar2 = dVar;
        } else if ((i6 & 6) == 0) {
            dVar2 = dVar;
            i11 = (interfaceC1734nR.S(dVar2) ? 4 : 2) | i6;
        } else {
            dVar2 = dVar;
            i11 = i6;
        }
        int i14 = i10 & 2;
        if (i14 == 0) {
            if ((i6 & 48) == 0) {
                f10 = f6;
                i11 |= interfaceC1734nR.h(f10) ? 32 : 16;
            }
            if ((i6 & 384) == 0) {
                if ((i10 & 4) == 0) {
                    j10 = j6;
                    int i15 = interfaceC1734nR.j(j10) ? 256 : 128;
                    i11 |= i15;
                } else {
                    j10 = j6;
                }
                i11 |= i15;
            } else {
                j10 = j6;
            }
            if ((i11 & 147) == 146 || !interfaceC1734nR.u()) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0 || interfaceC1734nR.G()) {
                    if (i13 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        fB = U.w.f14347a.b();
                    } else {
                        fB = f10;
                    }
                    if ((i10 & 4) != 0) {
                        i12 = i11 & (-897);
                        jH = S.A.h(U.w.f14347a.a(), interfaceC1734nR, 6);
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1498258020, i12, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1246)");
                    }
                    androidx.compose.foundation.layout.d.a(androidx.compose.foundation.b.b(androidx.compose.foundation.layout.p.g(androidx.compose.foundation.layout.p.f(dVar3, 0.0f, 1, null), fB), jH, null, 2, null), interfaceC1734nR, 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                } else {
                    interfaceC1734nR.A();
                    if ((i10 & 4) != 0) {
                        i11 &= -897;
                    }
                    dVar3 = dVar2;
                    fB = f10;
                }
                i12 = i11;
                jH = j10;
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1498258020, i12, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1246)");
                }
                androidx.compose.foundation.layout.d.a(androidx.compose.foundation.b.b(androidx.compose.foundation.layout.p.g(androidx.compose.foundation.layout.p.f(dVar3, 0.0f, 1, null), fB), jH, null, 2, null), interfaceC1734nR, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
            } else {
                interfaceC1734nR.A();
                dVar3 = dVar2;
                fB = f10;
                jH = j10;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.f1.a(dVar3, fB, jH, i6, i10));
            }
        }
        i11 |= 48;
        f10 = f6;
        if ((i6 & 384) == 0) {
            if ((i10 & 4) == 0) {
                j10 = j6;
                if (interfaceC1734nR.j(j10)) {
                }
                i11 |= i15;
            } else {
                j10 = j6;
            }
            i11 |= i15;
        } else {
            j10 = j6;
        }
        if ((i11 & 147) == 146) {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i13 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    fB = U.w.f14347a.b();
                } else {
                    fB = f10;
                }
                if ((i10 & 4) != 0) {
                    i12 = i11 & (-897);
                    jH = S.A.h(U.w.f14347a.a(), interfaceC1734nR, 6);
                } else {
                    i12 = i11;
                    jH = j10;
                }
            } else {
                if (i13 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    fB = U.w.f14347a.b();
                } else {
                    fB = f10;
                }
                if ((i10 & 4) != 0) {
                    i12 = i11 & (-897);
                    jH = S.A.h(U.w.f14347a.a(), interfaceC1734nR, 6);
                } else {
                    i12 = i11;
                    jH = j10;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1498258020, i12, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1246)");
            }
            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.b.b(androidx.compose.foundation.layout.p.g(androidx.compose.foundation.layout.p.f(dVar3, 0.0f, 1, null), fB), jH, null, 2, null), interfaceC1734nR, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        } else {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i13 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    fB = U.w.f14347a.b();
                } else {
                    fB = f10;
                }
                if ((i10 & 4) != 0) {
                    i12 = i11 & (-897);
                    jH = S.A.h(U.w.f14347a.a(), interfaceC1734nR, 6);
                } else {
                    i12 = i11;
                    jH = j10;
                }
            } else {
                if (i13 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    fB = U.w.f14347a.b();
                } else {
                    fB = f10;
                }
                if ((i10 & 4) != 0) {
                    i12 = i11 & (-897);
                    jH = S.A.h(U.w.f14347a.a(), interfaceC1734nR, 6);
                } else {
                    i12 = i11;
                    jH = j10;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1498258020, i12, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1246)");
            }
            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.b.b(androidx.compose.foundation.layout.p.g(androidx.compose.foundation.layout.p.f(dVar3, 0.0f, 1, null), fB), jH, null, 2, null), interfaceC1734nR, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.f1.a(dVar3, fB, jH, i6, i10));
        }
    }

    public final long b(V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-2069154037, i6, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContainerColor> (TabRow.kt:1163)");
        }
        long jH = S.A.h(U.w.f14347a.d(), interfaceC1734n, 6);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return jH;
    }

    public final long c(V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1410362619, i6, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContentColor> (TabRow.kt:1179)");
        }
        long jH = S.A.h(U.w.f14347a.c(), interfaceC1734n, 6);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return jH;
    }

    public final androidx.compose.ui.d d(androidx.compose.ui.d dVar, S.e1 e1Var) {
        return androidx.compose.ui.c.b(dVar, androidx.compose.ui.platform.E0.b() ? new S.f1.b(e1Var) : androidx.compose.ui.platform.E0.a(), new S.f1.c(e1Var));
    }
}
