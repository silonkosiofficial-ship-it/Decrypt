package S;

/* JADX INFO: loaded from: classes.dex */
public abstract class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f9978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f9979b = Y0.i.q(12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f9980c;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f9981D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ V.G1 f9982E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(V.G1 g6, V.G1 g10) {
            super(1);
            this.f9981D = g6;
            this.f9982E = g10;
        }

        public final void a(p161q0.g gVar) {
            float fB0 = gVar.B0(S.F0.f9980c);
            float f6 = 2;
            float f10 = fB0 / f6;
            p161q0.f.e(gVar, ((p141o0.C7016y0) this.f9981D.getValue()).w(), gVar.B0(Y0.i.q(U.y.f14385a.c() / f6)) - f10, 0L, 0.0f, new p161q0.m(fB0, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
            if (Y0.i.o(((Y0.i) this.f9982E.getValue()).v(), Y0.i.q(0)) > 0) {
                p161q0.f.e(gVar, ((p141o0.C7016y0) this.f9981D.getValue()).w(), gVar.B0(((Y0.i) this.f9982E.getValue()).v()) - f10, 0L, 0.0f, p161q0.l.f52928a, null, 0, 108, null);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p161q0.g) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f9983D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.a f9984E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f9985F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f9986G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ S.D0 f9987H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p250z.l f9988I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f9989J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f9990K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z6, p237x7.a aVar, androidx.compose.ui.d dVar, boolean z10, S.D0 d6, p250z.l lVar, int i6, int i10) {
            super(2);
            this.f9983D = z6;
            this.f9984E = aVar;
            this.f9985F = dVar;
            this.f9986G = z10;
            this.f9987H = d6;
            this.f9988I = lVar;
            this.f9989J = i6;
            this.f9990K = i10;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            S.F0.a(this.f9983D, this.f9984E, this.f9985F, this.f9986G, this.f9987H, this.f9988I, interfaceC1734n, V.S0.a(this.f9989J | 1), this.f9990K);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    static {
        float f6 = 2;
        f9978a = Y0.i.q(f6);
        f9980c = Y0.i.q(f6);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0120  */
    /* JADX WARN: Code duplicated, block: B:104:0x0153  */
    /* JADX WARN: Code duplicated, block: B:105:0x0194  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01de  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:120:0x0207  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x009c  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:93:0x0101  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0117  */
    public static final void a(boolean z6, p237x7.a aVar, androidx.compose.ui.d dVar, boolean z10, S.D0 d6, p250z.l lVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        int i11;
        androidx.compose.ui.d dVar2;
        int i12;
        boolean z11;
        int i13;
        S.D0 d0A;
        int i14;
        p250z.l lVar2;
        int i15;
        androidx.compose.ui.d dVar3;
        androidx.compose.ui.d dVar4;
        boolean z12;
        S.D0 d10;
        float f6;
        V.G1 g1C;
        V.G1 g1A;
        boolean z13;
        androidx.compose.ui.d dVarA;
        androidx.compose.ui.d dVarB;
        boolean zS;
        java.lang.Object objG;
        S.D0 d11;
        boolean z14;
        p250z.l lVar3;
        V.InterfaceC1709e1 interfaceC1709e1X;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(408580840);
        if ((i10 & 1) != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.d(z6) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        if ((i10 & 2) != 0) {
            i11 |= 48;
        } else if ((i6 & 48) == 0) {
            i11 |= interfaceC1734nR.l(aVar) ? 32 : 16;
        }
        int i16 = i10 & 4;
        if (i16 == 0) {
            if ((i6 & 384) == 0) {
                dVar2 = dVar;
                i11 |= interfaceC1734nR.S(dVar2) ? 256 : 128;
            }
            i12 = i10 & 8;
            if (i12 != 0) {
                if ((i6 & 3072) == 0) {
                    z11 = z10;
                    if (interfaceC1734nR.d(z11)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i11 |= i13;
                }
                if ((i6 & 24576) == 0) {
                    if ((i10 & 16) == 0) {
                        d0A = d6;
                        int i17 = interfaceC1734nR.S(d0A) ? 16384 : 8192;
                        i11 |= i17;
                    } else {
                        d0A = d6;
                    }
                    i11 |= i17;
                } else {
                    d0A = d6;
                }
                i14 = i10 & 32;
                if (i14 != 0) {
                    if ((196608 & i6) == 0) {
                        lVar2 = lVar;
                        if (interfaceC1734nR.S(lVar2)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i11 |= i15;
                    }
                    if ((74899 & i11) == 74898 || !interfaceC1734nR.u()) {
                        interfaceC1734nR.q();
                        if ((i6 & 1) != 0 || interfaceC1734nR.G()) {
                            if (i16 != 0) {
                                dVar3 = androidx.compose.ui.d.f19586a;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i12 != 0) {
                                z11 = true;
                            }
                            if ((i10 & 16) != 0) {
                                i11 &= -57345;
                                d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                            }
                            if (i14 != 0) {
                                dVar4 = dVar3;
                                z12 = z11;
                                d10 = d0A;
                                lVar = null;
                            } else {
                                dVar4 = dVar3;
                            }
                            interfaceC1734nR.R();
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.Q(408580840, i11, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                            }
                            if (z6) {
                                f6 = f9979b / 2;
                            } else {
                                f6 = 0;
                            }
                            g1C = p200u.AbstractC7161c.c(Y0.i.q(f6), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734nR, 48, 12);
                            g1A = d10.a(z12, z6, interfaceC1734nR, ((i11 >> 6) & 896) | ((i11 >> 9) & 14) | ((i11 << 3) & 112));
                            interfaceC1734nR.T(1327106656);
                            if (aVar != null) {
                                z13 = z12;
                                dVarA = androidx.compose.foundation.selection.a.a(androidx.compose.ui.d.f19586a, z6, lVar, S.I0.c(false, Y0.i.q(U.y.f14385a.e() / 2), 0L, interfaceC1734nR, 54, 4), z13, K0.h.h(K0.h.f5956b.e()), aVar);
                            } else {
                                z13 = z12;
                                dVarA = androidx.compose.ui.d.f19586a;
                            }
                            interfaceC1734nR.J();
                            dVarB = androidx.compose.ui.d.f19586a;
                            if (aVar != null) {
                                dVarB = S.AbstractC1554k0.b(dVarB);
                            }
                            androidx.compose.ui.d dVarK = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.p.z(dVar4.b(dVarB).b(dVarA), p071h0.c.f45778a.e(), r0, 2, null), f9978a), U.y.f14385a.c());
                            zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C);
                            objG = interfaceC1734nR.g();
                            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                                objG = new S.F0.a(g1A, g1C);
                                interfaceC1734nR.K(objG);
                            }
                            p210v.AbstractC7215i.a(dVarK, (p237x7.l) objG, interfaceC1734nR, 0);
                            if (V.AbstractC1741q.H()) {
                                V.AbstractC1741q.P();
                            }
                            dVar2 = dVar4;
                            d11 = d10;
                            z14 = z13;
                            lVar3 = lVar;
                        } else {
                            interfaceC1734nR.A();
                            if ((i10 & 16) != 0) {
                                i11 &= -57345;
                            }
                            dVar4 = dVar2;
                        }
                        z12 = z11;
                        d10 = d0A;
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(408580840, i11, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                        }
                        if (z6) {
                            f6 = f9979b / 2;
                        } else {
                            f6 = 0;
                        }
                        g1C = p200u.AbstractC7161c.c(Y0.i.q(f6), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734nR, 48, 12);
                        g1A = d10.a(z12, z6, interfaceC1734nR, ((i11 >> 6) & 896) | ((i11 >> 9) & 14) | ((i11 << 3) & 112));
                        interfaceC1734nR.T(1327106656);
                        if (aVar != null) {
                            z13 = z12;
                            dVarA = androidx.compose.foundation.selection.a.a(androidx.compose.ui.d.f19586a, z6, lVar, S.I0.c(false, Y0.i.q(U.y.f14385a.e() / 2), 0L, interfaceC1734nR, 54, 4), z13, K0.h.h(K0.h.f5956b.e()), aVar);
                        } else {
                            z13 = z12;
                            dVarA = androidx.compose.ui.d.f19586a;
                        }
                        interfaceC1734nR.J();
                        dVarB = androidx.compose.ui.d.f19586a;
                        if (aVar != null) {
                            dVarB = S.AbstractC1554k0.b(dVarB);
                        }
                        androidx.compose.ui.d dVarK2 = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.p.z(dVar4.b(dVarB).b(dVarA), p071h0.c.f45778a.e(), r0, 2, null), f9978a), U.y.f14385a.c());
                        zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C);
                        objG = interfaceC1734nR.g();
                        if (zS) {
                            objG = new S.F0.a(g1A, g1C);
                            interfaceC1734nR.K(objG);
                        } else {
                            objG = new S.F0.a(g1A, g1C);
                            interfaceC1734nR.K(objG);
                        }
                        p210v.AbstractC7215i.a(dVarK2, (p237x7.l) objG, interfaceC1734nR, 0);
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar2 = dVar4;
                        d11 = d10;
                        z14 = z13;
                        lVar3 = lVar;
                    } else {
                        interfaceC1734nR.A();
                        z14 = z11;
                        d11 = d0A;
                        interfaceC1734nR = interfaceC1734nR;
                        lVar3 = lVar2;
                    }
                    interfaceC1709e1X = interfaceC1734nR.x();
                    if (interfaceC1709e1X != null) {
                        interfaceC1709e1X.a(new S.F0.b(z6, aVar, dVar2, z14, d11, lVar3, i6, i10));
                    }
                }
                i11 |= 196608;
                lVar2 = lVar;
                if ((74899 & i11) == 74898) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i16 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                            lVar = null;
                        } else {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                        }
                    } else {
                        if (i16 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                            lVar = null;
                        } else {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(408580840, i11, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                    }
                    if (z6) {
                        f6 = f9979b / 2;
                    } else {
                        f6 = 0;
                    }
                    g1C = p200u.AbstractC7161c.c(Y0.i.q(f6), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734nR, 48, 12);
                    g1A = d10.a(z12, z6, interfaceC1734nR, ((i11 >> 6) & 896) | ((i11 >> 9) & 14) | ((i11 << 3) & 112));
                    interfaceC1734nR.T(1327106656);
                    if (aVar != null) {
                        z13 = z12;
                        dVarA = androidx.compose.foundation.selection.a.a(androidx.compose.ui.d.f19586a, z6, lVar, S.I0.c(false, Y0.i.q(U.y.f14385a.e() / 2), 0L, interfaceC1734nR, 54, 4), z13, K0.h.h(K0.h.f5956b.e()), aVar);
                    } else {
                        z13 = z12;
                        dVarA = androidx.compose.ui.d.f19586a;
                    }
                    interfaceC1734nR.J();
                    dVarB = androidx.compose.ui.d.f19586a;
                    if (aVar != null) {
                        dVarB = S.AbstractC1554k0.b(dVarB);
                    }
                    androidx.compose.ui.d dVarK3 = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.p.z(dVar4.b(dVarB).b(dVarA), p071h0.c.f45778a.e(), r0, 2, null), f9978a), U.y.f14385a.c());
                    zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C);
                    objG = interfaceC1734nR.g();
                    if (zS) {
                        objG = new S.F0.a(g1A, g1C);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new S.F0.a(g1A, g1C);
                        interfaceC1734nR.K(objG);
                    }
                    p210v.AbstractC7215i.a(dVarK3, (p237x7.l) objG, interfaceC1734nR, 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar2 = dVar4;
                    d11 = d10;
                    z14 = z13;
                    lVar3 = lVar;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i16 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                            lVar = null;
                        } else {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                        }
                    } else {
                        if (i16 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                            lVar = null;
                        } else {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(408580840, i11, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                    }
                    if (z6) {
                        f6 = f9979b / 2;
                    } else {
                        f6 = 0;
                    }
                    g1C = p200u.AbstractC7161c.c(Y0.i.q(f6), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734nR, 48, 12);
                    g1A = d10.a(z12, z6, interfaceC1734nR, ((i11 >> 6) & 896) | ((i11 >> 9) & 14) | ((i11 << 3) & 112));
                    interfaceC1734nR.T(1327106656);
                    if (aVar != null) {
                        z13 = z12;
                        dVarA = androidx.compose.foundation.selection.a.a(androidx.compose.ui.d.f19586a, z6, lVar, S.I0.c(false, Y0.i.q(U.y.f14385a.e() / 2), 0L, interfaceC1734nR, 54, 4), z13, K0.h.h(K0.h.f5956b.e()), aVar);
                    } else {
                        z13 = z12;
                        dVarA = androidx.compose.ui.d.f19586a;
                    }
                    interfaceC1734nR.J();
                    dVarB = androidx.compose.ui.d.f19586a;
                    if (aVar != null) {
                        dVarB = S.AbstractC1554k0.b(dVarB);
                    }
                    androidx.compose.ui.d dVarK4 = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.p.z(dVar4.b(dVarB).b(dVarA), p071h0.c.f45778a.e(), r0, 2, null), f9978a), U.y.f14385a.c());
                    zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C);
                    objG = interfaceC1734nR.g();
                    if (zS) {
                        objG = new S.F0.a(g1A, g1C);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new S.F0.a(g1A, g1C);
                        interfaceC1734nR.K(objG);
                    }
                    p210v.AbstractC7215i.a(dVarK4, (p237x7.l) objG, interfaceC1734nR, 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar2 = dVar4;
                    d11 = d10;
                    z14 = z13;
                    lVar3 = lVar;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.F0.b(z6, aVar, dVar2, z14, d11, lVar3, i6, i10));
                }
            }
            i11 |= 3072;
            z11 = z10;
            if ((i6 & 24576) == 0) {
                if ((i10 & 16) == 0) {
                    d0A = d6;
                    if (interfaceC1734nR.S(d0A)) {
                    }
                    i11 |= i17;
                } else {
                    d0A = d6;
                }
                i11 |= i17;
            } else {
                d0A = d6;
            }
            i14 = i10 & 32;
            if (i14 != 0) {
                if ((196608 & i6) == 0) {
                    lVar2 = lVar;
                    if (interfaceC1734nR.S(lVar2)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i11 |= i15;
                }
                if ((74899 & i11) == 74898) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i16 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                            lVar = null;
                        } else {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                        }
                    } else {
                        if (i16 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                            lVar = null;
                        } else {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(408580840, i11, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                    }
                    if (z6) {
                        f6 = f9979b / 2;
                    } else {
                        f6 = 0;
                    }
                    g1C = p200u.AbstractC7161c.c(Y0.i.q(f6), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734nR, 48, 12);
                    g1A = d10.a(z12, z6, interfaceC1734nR, ((i11 >> 6) & 896) | ((i11 >> 9) & 14) | ((i11 << 3) & 112));
                    interfaceC1734nR.T(1327106656);
                    if (aVar != null) {
                        z13 = z12;
                        dVarA = androidx.compose.foundation.selection.a.a(androidx.compose.ui.d.f19586a, z6, lVar, S.I0.c(false, Y0.i.q(U.y.f14385a.e() / 2), 0L, interfaceC1734nR, 54, 4), z13, K0.h.h(K0.h.f5956b.e()), aVar);
                    } else {
                        z13 = z12;
                        dVarA = androidx.compose.ui.d.f19586a;
                    }
                    interfaceC1734nR.J();
                    dVarB = androidx.compose.ui.d.f19586a;
                    if (aVar != null) {
                        dVarB = S.AbstractC1554k0.b(dVarB);
                    }
                    androidx.compose.ui.d dVarK5 = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.p.z(dVar4.b(dVarB).b(dVarA), p071h0.c.f45778a.e(), r0, 2, null), f9978a), U.y.f14385a.c());
                    zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C);
                    objG = interfaceC1734nR.g();
                    if (zS) {
                        objG = new S.F0.a(g1A, g1C);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new S.F0.a(g1A, g1C);
                        interfaceC1734nR.K(objG);
                    }
                    p210v.AbstractC7215i.a(dVarK5, (p237x7.l) objG, interfaceC1734nR, 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar2 = dVar4;
                    d11 = d10;
                    z14 = z13;
                    lVar3 = lVar;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i16 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                            lVar = null;
                        } else {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                        }
                    } else {
                        if (i16 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                            lVar = null;
                        } else {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(408580840, i11, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                    }
                    if (z6) {
                        f6 = f9979b / 2;
                    } else {
                        f6 = 0;
                    }
                    g1C = p200u.AbstractC7161c.c(Y0.i.q(f6), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734nR, 48, 12);
                    g1A = d10.a(z12, z6, interfaceC1734nR, ((i11 >> 6) & 896) | ((i11 >> 9) & 14) | ((i11 << 3) & 112));
                    interfaceC1734nR.T(1327106656);
                    if (aVar != null) {
                        z13 = z12;
                        dVarA = androidx.compose.foundation.selection.a.a(androidx.compose.ui.d.f19586a, z6, lVar, S.I0.c(false, Y0.i.q(U.y.f14385a.e() / 2), 0L, interfaceC1734nR, 54, 4), z13, K0.h.h(K0.h.f5956b.e()), aVar);
                    } else {
                        z13 = z12;
                        dVarA = androidx.compose.ui.d.f19586a;
                    }
                    interfaceC1734nR.J();
                    dVarB = androidx.compose.ui.d.f19586a;
                    if (aVar != null) {
                        dVarB = S.AbstractC1554k0.b(dVarB);
                    }
                    androidx.compose.ui.d dVarK6 = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.p.z(dVar4.b(dVarB).b(dVarA), p071h0.c.f45778a.e(), r0, 2, null), f9978a), U.y.f14385a.c());
                    zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C);
                    objG = interfaceC1734nR.g();
                    if (zS) {
                        objG = new S.F0.a(g1A, g1C);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new S.F0.a(g1A, g1C);
                        interfaceC1734nR.K(objG);
                    }
                    p210v.AbstractC7215i.a(dVarK6, (p237x7.l) objG, interfaceC1734nR, 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar2 = dVar4;
                    d11 = d10;
                    z14 = z13;
                    lVar3 = lVar;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.F0.b(z6, aVar, dVar2, z14, d11, lVar3, i6, i10));
                }
            }
            i11 |= 196608;
            lVar2 = lVar;
            if ((74899 & i11) == 74898) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                        lVar = null;
                    } else {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                    }
                } else {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                        lVar = null;
                    } else {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(408580840, i11, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                }
                if (z6) {
                    f6 = f9979b / 2;
                } else {
                    f6 = 0;
                }
                g1C = p200u.AbstractC7161c.c(Y0.i.q(f6), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734nR, 48, 12);
                g1A = d10.a(z12, z6, interfaceC1734nR, ((i11 >> 6) & 896) | ((i11 >> 9) & 14) | ((i11 << 3) & 112));
                interfaceC1734nR.T(1327106656);
                if (aVar != null) {
                    z13 = z12;
                    dVarA = androidx.compose.foundation.selection.a.a(androidx.compose.ui.d.f19586a, z6, lVar, S.I0.c(false, Y0.i.q(U.y.f14385a.e() / 2), 0L, interfaceC1734nR, 54, 4), z13, K0.h.h(K0.h.f5956b.e()), aVar);
                } else {
                    z13 = z12;
                    dVarA = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                dVarB = androidx.compose.ui.d.f19586a;
                if (aVar != null) {
                    dVarB = S.AbstractC1554k0.b(dVarB);
                }
                androidx.compose.ui.d dVarK7 = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.p.z(dVar4.b(dVarB).b(dVarA), p071h0.c.f45778a.e(), r0, 2, null), f9978a), U.y.f14385a.c());
                zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C);
                objG = interfaceC1734nR.g();
                if (zS) {
                    objG = new S.F0.a(g1A, g1C);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.F0.a(g1A, g1C);
                    interfaceC1734nR.K(objG);
                }
                p210v.AbstractC7215i.a(dVarK7, (p237x7.l) objG, interfaceC1734nR, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar2 = dVar4;
                d11 = d10;
                z14 = z13;
                lVar3 = lVar;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                        lVar = null;
                    } else {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                    }
                } else {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                        lVar = null;
                    } else {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(408580840, i11, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                }
                if (z6) {
                    f6 = f9979b / 2;
                } else {
                    f6 = 0;
                }
                g1C = p200u.AbstractC7161c.c(Y0.i.q(f6), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734nR, 48, 12);
                g1A = d10.a(z12, z6, interfaceC1734nR, ((i11 >> 6) & 896) | ((i11 >> 9) & 14) | ((i11 << 3) & 112));
                interfaceC1734nR.T(1327106656);
                if (aVar != null) {
                    z13 = z12;
                    dVarA = androidx.compose.foundation.selection.a.a(androidx.compose.ui.d.f19586a, z6, lVar, S.I0.c(false, Y0.i.q(U.y.f14385a.e() / 2), 0L, interfaceC1734nR, 54, 4), z13, K0.h.h(K0.h.f5956b.e()), aVar);
                } else {
                    z13 = z12;
                    dVarA = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                dVarB = androidx.compose.ui.d.f19586a;
                if (aVar != null) {
                    dVarB = S.AbstractC1554k0.b(dVarB);
                }
                androidx.compose.ui.d dVarK8 = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.p.z(dVar4.b(dVarB).b(dVarA), p071h0.c.f45778a.e(), r0, 2, null), f9978a), U.y.f14385a.c());
                zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C);
                objG = interfaceC1734nR.g();
                if (zS) {
                    objG = new S.F0.a(g1A, g1C);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.F0.a(g1A, g1C);
                    interfaceC1734nR.K(objG);
                }
                p210v.AbstractC7215i.a(dVarK8, (p237x7.l) objG, interfaceC1734nR, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar2 = dVar4;
                d11 = d10;
                z14 = z13;
                lVar3 = lVar;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.F0.b(z6, aVar, dVar2, z14, d11, lVar3, i6, i10));
            }
        }
        i11 |= 384;
        dVar2 = dVar;
        i12 = i10 & 8;
        if (i12 != 0) {
            if ((i6 & 3072) == 0) {
                z11 = z10;
                if (interfaceC1734nR.d(z11)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i11 |= i13;
            }
            if ((i6 & 24576) == 0) {
                if ((i10 & 16) == 0) {
                    d0A = d6;
                    if (interfaceC1734nR.S(d0A)) {
                    }
                    i11 |= i17;
                } else {
                    d0A = d6;
                }
                i11 |= i17;
            } else {
                d0A = d6;
            }
            i14 = i10 & 32;
            if (i14 != 0) {
                if ((196608 & i6) == 0) {
                    lVar2 = lVar;
                    if (interfaceC1734nR.S(lVar2)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i11 |= i15;
                }
                if ((74899 & i11) == 74898) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i16 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                            lVar = null;
                        } else {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                        }
                    } else {
                        if (i16 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                            lVar = null;
                        } else {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(408580840, i11, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                    }
                    if (z6) {
                        f6 = f9979b / 2;
                    } else {
                        f6 = 0;
                    }
                    g1C = p200u.AbstractC7161c.c(Y0.i.q(f6), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734nR, 48, 12);
                    g1A = d10.a(z12, z6, interfaceC1734nR, ((i11 >> 6) & 896) | ((i11 >> 9) & 14) | ((i11 << 3) & 112));
                    interfaceC1734nR.T(1327106656);
                    if (aVar != null) {
                        z13 = z12;
                        dVarA = androidx.compose.foundation.selection.a.a(androidx.compose.ui.d.f19586a, z6, lVar, S.I0.c(false, Y0.i.q(U.y.f14385a.e() / 2), 0L, interfaceC1734nR, 54, 4), z13, K0.h.h(K0.h.f5956b.e()), aVar);
                    } else {
                        z13 = z12;
                        dVarA = androidx.compose.ui.d.f19586a;
                    }
                    interfaceC1734nR.J();
                    dVarB = androidx.compose.ui.d.f19586a;
                    if (aVar != null) {
                        dVarB = S.AbstractC1554k0.b(dVarB);
                    }
                    androidx.compose.ui.d dVarK9 = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.p.z(dVar4.b(dVarB).b(dVarA), p071h0.c.f45778a.e(), r0, 2, null), f9978a), U.y.f14385a.c());
                    zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C);
                    objG = interfaceC1734nR.g();
                    if (zS) {
                        objG = new S.F0.a(g1A, g1C);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new S.F0.a(g1A, g1C);
                        interfaceC1734nR.K(objG);
                    }
                    p210v.AbstractC7215i.a(dVarK9, (p237x7.l) objG, interfaceC1734nR, 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar2 = dVar4;
                    d11 = d10;
                    z14 = z13;
                    lVar3 = lVar;
                } else {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0) {
                        if (i16 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                            lVar = null;
                        } else {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                        }
                    } else {
                        if (i16 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i12 != 0) {
                            z11 = true;
                        }
                        if ((i10 & 16) != 0) {
                            i11 &= -57345;
                            d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                        }
                        if (i14 != 0) {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                            lVar = null;
                        } else {
                            dVar4 = dVar3;
                            z12 = z11;
                            d10 = d0A;
                        }
                    }
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(408580840, i11, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                    }
                    if (z6) {
                        f6 = f9979b / 2;
                    } else {
                        f6 = 0;
                    }
                    g1C = p200u.AbstractC7161c.c(Y0.i.q(f6), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734nR, 48, 12);
                    g1A = d10.a(z12, z6, interfaceC1734nR, ((i11 >> 6) & 896) | ((i11 >> 9) & 14) | ((i11 << 3) & 112));
                    interfaceC1734nR.T(1327106656);
                    if (aVar != null) {
                        z13 = z12;
                        dVarA = androidx.compose.foundation.selection.a.a(androidx.compose.ui.d.f19586a, z6, lVar, S.I0.c(false, Y0.i.q(U.y.f14385a.e() / 2), 0L, interfaceC1734nR, 54, 4), z13, K0.h.h(K0.h.f5956b.e()), aVar);
                    } else {
                        z13 = z12;
                        dVarA = androidx.compose.ui.d.f19586a;
                    }
                    interfaceC1734nR.J();
                    dVarB = androidx.compose.ui.d.f19586a;
                    if (aVar != null) {
                        dVarB = S.AbstractC1554k0.b(dVarB);
                    }
                    androidx.compose.ui.d dVarK10 = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.p.z(dVar4.b(dVarB).b(dVarA), p071h0.c.f45778a.e(), r0, 2, null), f9978a), U.y.f14385a.c());
                    zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C);
                    objG = interfaceC1734nR.g();
                    if (zS) {
                        objG = new S.F0.a(g1A, g1C);
                        interfaceC1734nR.K(objG);
                    } else {
                        objG = new S.F0.a(g1A, g1C);
                        interfaceC1734nR.K(objG);
                    }
                    p210v.AbstractC7215i.a(dVarK10, (p237x7.l) objG, interfaceC1734nR, 0);
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar2 = dVar4;
                    d11 = d10;
                    z14 = z13;
                    lVar3 = lVar;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new S.F0.b(z6, aVar, dVar2, z14, d11, lVar3, i6, i10));
                }
            }
            i11 |= 196608;
            lVar2 = lVar;
            if ((74899 & i11) == 74898) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                        lVar = null;
                    } else {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                    }
                } else {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                        lVar = null;
                    } else {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(408580840, i11, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                }
                if (z6) {
                    f6 = f9979b / 2;
                } else {
                    f6 = 0;
                }
                g1C = p200u.AbstractC7161c.c(Y0.i.q(f6), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734nR, 48, 12);
                g1A = d10.a(z12, z6, interfaceC1734nR, ((i11 >> 6) & 896) | ((i11 >> 9) & 14) | ((i11 << 3) & 112));
                interfaceC1734nR.T(1327106656);
                if (aVar != null) {
                    z13 = z12;
                    dVarA = androidx.compose.foundation.selection.a.a(androidx.compose.ui.d.f19586a, z6, lVar, S.I0.c(false, Y0.i.q(U.y.f14385a.e() / 2), 0L, interfaceC1734nR, 54, 4), z13, K0.h.h(K0.h.f5956b.e()), aVar);
                } else {
                    z13 = z12;
                    dVarA = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                dVarB = androidx.compose.ui.d.f19586a;
                if (aVar != null) {
                    dVarB = S.AbstractC1554k0.b(dVarB);
                }
                androidx.compose.ui.d dVarK11 = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.p.z(dVar4.b(dVarB).b(dVarA), p071h0.c.f45778a.e(), r0, 2, null), f9978a), U.y.f14385a.c());
                zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C);
                objG = interfaceC1734nR.g();
                if (zS) {
                    objG = new S.F0.a(g1A, g1C);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.F0.a(g1A, g1C);
                    interfaceC1734nR.K(objG);
                }
                p210v.AbstractC7215i.a(dVarK11, (p237x7.l) objG, interfaceC1734nR, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar2 = dVar4;
                d11 = d10;
                z14 = z13;
                lVar3 = lVar;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                        lVar = null;
                    } else {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                    }
                } else {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                        lVar = null;
                    } else {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(408580840, i11, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                }
                if (z6) {
                    f6 = f9979b / 2;
                } else {
                    f6 = 0;
                }
                g1C = p200u.AbstractC7161c.c(Y0.i.q(f6), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734nR, 48, 12);
                g1A = d10.a(z12, z6, interfaceC1734nR, ((i11 >> 6) & 896) | ((i11 >> 9) & 14) | ((i11 << 3) & 112));
                interfaceC1734nR.T(1327106656);
                if (aVar != null) {
                    z13 = z12;
                    dVarA = androidx.compose.foundation.selection.a.a(androidx.compose.ui.d.f19586a, z6, lVar, S.I0.c(false, Y0.i.q(U.y.f14385a.e() / 2), 0L, interfaceC1734nR, 54, 4), z13, K0.h.h(K0.h.f5956b.e()), aVar);
                } else {
                    z13 = z12;
                    dVarA = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                dVarB = androidx.compose.ui.d.f19586a;
                if (aVar != null) {
                    dVarB = S.AbstractC1554k0.b(dVarB);
                }
                androidx.compose.ui.d dVarK12 = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.p.z(dVar4.b(dVarB).b(dVarA), p071h0.c.f45778a.e(), r0, 2, null), f9978a), U.y.f14385a.c());
                zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C);
                objG = interfaceC1734nR.g();
                if (zS) {
                    objG = new S.F0.a(g1A, g1C);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.F0.a(g1A, g1C);
                    interfaceC1734nR.K(objG);
                }
                p210v.AbstractC7215i.a(dVarK12, (p237x7.l) objG, interfaceC1734nR, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar2 = dVar4;
                d11 = d10;
                z14 = z13;
                lVar3 = lVar;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.F0.b(z6, aVar, dVar2, z14, d11, lVar3, i6, i10));
            }
        }
        i11 |= 3072;
        z11 = z10;
        if ((i6 & 24576) == 0) {
            if ((i10 & 16) == 0) {
                d0A = d6;
                if (interfaceC1734nR.S(d0A)) {
                }
                i11 |= i17;
            } else {
                d0A = d6;
            }
            i11 |= i17;
        } else {
            d0A = d6;
        }
        i14 = i10 & 32;
        if (i14 != 0) {
            if ((196608 & i6) == 0) {
                lVar2 = lVar;
                if (interfaceC1734nR.S(lVar2)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i11 |= i15;
            }
            if ((74899 & i11) == 74898) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                        lVar = null;
                    } else {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                    }
                } else {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                        lVar = null;
                    } else {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(408580840, i11, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                }
                if (z6) {
                    f6 = f9979b / 2;
                } else {
                    f6 = 0;
                }
                g1C = p200u.AbstractC7161c.c(Y0.i.q(f6), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734nR, 48, 12);
                g1A = d10.a(z12, z6, interfaceC1734nR, ((i11 >> 6) & 896) | ((i11 >> 9) & 14) | ((i11 << 3) & 112));
                interfaceC1734nR.T(1327106656);
                if (aVar != null) {
                    z13 = z12;
                    dVarA = androidx.compose.foundation.selection.a.a(androidx.compose.ui.d.f19586a, z6, lVar, S.I0.c(false, Y0.i.q(U.y.f14385a.e() / 2), 0L, interfaceC1734nR, 54, 4), z13, K0.h.h(K0.h.f5956b.e()), aVar);
                } else {
                    z13 = z12;
                    dVarA = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                dVarB = androidx.compose.ui.d.f19586a;
                if (aVar != null) {
                    dVarB = S.AbstractC1554k0.b(dVarB);
                }
                androidx.compose.ui.d dVarK13 = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.p.z(dVar4.b(dVarB).b(dVarA), p071h0.c.f45778a.e(), r0, 2, null), f9978a), U.y.f14385a.c());
                zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C);
                objG = interfaceC1734nR.g();
                if (zS) {
                    objG = new S.F0.a(g1A, g1C);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.F0.a(g1A, g1C);
                    interfaceC1734nR.K(objG);
                }
                p210v.AbstractC7215i.a(dVarK13, (p237x7.l) objG, interfaceC1734nR, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar2 = dVar4;
                d11 = d10;
                z14 = z13;
                lVar3 = lVar;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                        lVar = null;
                    } else {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                    }
                } else {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i12 != 0) {
                        z11 = true;
                    }
                    if ((i10 & 16) != 0) {
                        i11 &= -57345;
                        d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                    }
                    if (i14 != 0) {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                        lVar = null;
                    } else {
                        dVar4 = dVar3;
                        z12 = z11;
                        d10 = d0A;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(408580840, i11, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                }
                if (z6) {
                    f6 = f9979b / 2;
                } else {
                    f6 = 0;
                }
                g1C = p200u.AbstractC7161c.c(Y0.i.q(f6), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734nR, 48, 12);
                g1A = d10.a(z12, z6, interfaceC1734nR, ((i11 >> 6) & 896) | ((i11 >> 9) & 14) | ((i11 << 3) & 112));
                interfaceC1734nR.T(1327106656);
                if (aVar != null) {
                    z13 = z12;
                    dVarA = androidx.compose.foundation.selection.a.a(androidx.compose.ui.d.f19586a, z6, lVar, S.I0.c(false, Y0.i.q(U.y.f14385a.e() / 2), 0L, interfaceC1734nR, 54, 4), z13, K0.h.h(K0.h.f5956b.e()), aVar);
                } else {
                    z13 = z12;
                    dVarA = androidx.compose.ui.d.f19586a;
                }
                interfaceC1734nR.J();
                dVarB = androidx.compose.ui.d.f19586a;
                if (aVar != null) {
                    dVarB = S.AbstractC1554k0.b(dVarB);
                }
                androidx.compose.ui.d dVarK14 = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.p.z(dVar4.b(dVarB).b(dVarA), p071h0.c.f45778a.e(), r0, 2, null), f9978a), U.y.f14385a.c());
                zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C);
                objG = interfaceC1734nR.g();
                if (zS) {
                    objG = new S.F0.a(g1A, g1C);
                    interfaceC1734nR.K(objG);
                } else {
                    objG = new S.F0.a(g1A, g1C);
                    interfaceC1734nR.K(objG);
                }
                p210v.AbstractC7215i.a(dVarK14, (p237x7.l) objG, interfaceC1734nR, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar2 = dVar4;
                d11 = d10;
                z14 = z13;
                lVar3 = lVar;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new S.F0.b(z6, aVar, dVar2, z14, d11, lVar3, i6, i10));
            }
        }
        i11 |= 196608;
        lVar2 = lVar;
        if ((74899 & i11) == 74898) {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    z11 = true;
                }
                if ((i10 & 16) != 0) {
                    i11 &= -57345;
                    d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                }
                if (i14 != 0) {
                    dVar4 = dVar3;
                    z12 = z11;
                    d10 = d0A;
                    lVar = null;
                } else {
                    dVar4 = dVar3;
                    z12 = z11;
                    d10 = d0A;
                }
            } else {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    z11 = true;
                }
                if ((i10 & 16) != 0) {
                    i11 &= -57345;
                    d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                }
                if (i14 != 0) {
                    dVar4 = dVar3;
                    z12 = z11;
                    d10 = d0A;
                    lVar = null;
                } else {
                    dVar4 = dVar3;
                    z12 = z11;
                    d10 = d0A;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(408580840, i11, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
            }
            if (z6) {
                f6 = f9979b / 2;
            } else {
                f6 = 0;
            }
            g1C = p200u.AbstractC7161c.c(Y0.i.q(f6), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734nR, 48, 12);
            g1A = d10.a(z12, z6, interfaceC1734nR, ((i11 >> 6) & 896) | ((i11 >> 9) & 14) | ((i11 << 3) & 112));
            interfaceC1734nR.T(1327106656);
            if (aVar != null) {
                z13 = z12;
                dVarA = androidx.compose.foundation.selection.a.a(androidx.compose.ui.d.f19586a, z6, lVar, S.I0.c(false, Y0.i.q(U.y.f14385a.e() / 2), 0L, interfaceC1734nR, 54, 4), z13, K0.h.h(K0.h.f5956b.e()), aVar);
            } else {
                z13 = z12;
                dVarA = androidx.compose.ui.d.f19586a;
            }
            interfaceC1734nR.J();
            dVarB = androidx.compose.ui.d.f19586a;
            if (aVar != null) {
                dVarB = S.AbstractC1554k0.b(dVarB);
            }
            androidx.compose.ui.d dVarK15 = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.p.z(dVar4.b(dVarB).b(dVarA), p071h0.c.f45778a.e(), r0, 2, null), f9978a), U.y.f14385a.c());
            zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C);
            objG = interfaceC1734nR.g();
            if (zS) {
                objG = new S.F0.a(g1A, g1C);
                interfaceC1734nR.K(objG);
            } else {
                objG = new S.F0.a(g1A, g1C);
                interfaceC1734nR.K(objG);
            }
            p210v.AbstractC7215i.a(dVarK15, (p237x7.l) objG, interfaceC1734nR, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar2 = dVar4;
            d11 = d10;
            z14 = z13;
            lVar3 = lVar;
        } else {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    z11 = true;
                }
                if ((i10 & 16) != 0) {
                    i11 &= -57345;
                    d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                }
                if (i14 != 0) {
                    dVar4 = dVar3;
                    z12 = z11;
                    d10 = d0A;
                    lVar = null;
                } else {
                    dVar4 = dVar3;
                    z12 = z11;
                    d10 = d0A;
                }
            } else {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if (i12 != 0) {
                    z11 = true;
                }
                if ((i10 & 16) != 0) {
                    i11 &= -57345;
                    d0A = S.E0.f9974a.a(interfaceC1734nR, 6);
                }
                if (i14 != 0) {
                    dVar4 = dVar3;
                    z12 = z11;
                    d10 = d0A;
                    lVar = null;
                } else {
                    dVar4 = dVar3;
                    z12 = z11;
                    d10 = d0A;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(408580840, i11, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
            }
            if (z6) {
                f6 = f9979b / 2;
            } else {
                f6 = 0;
            }
            g1C = p200u.AbstractC7161c.c(Y0.i.q(f6), p200u.AbstractC7177k.l(100, 0, null, 6, null), null, null, interfaceC1734nR, 48, 12);
            g1A = d10.a(z12, z6, interfaceC1734nR, ((i11 >> 6) & 896) | ((i11 >> 9) & 14) | ((i11 << 3) & 112));
            interfaceC1734nR.T(1327106656);
            if (aVar != null) {
                z13 = z12;
                dVarA = androidx.compose.foundation.selection.a.a(androidx.compose.ui.d.f19586a, z6, lVar, S.I0.c(false, Y0.i.q(U.y.f14385a.e() / 2), 0L, interfaceC1734nR, 54, 4), z13, K0.h.h(K0.h.f5956b.e()), aVar);
            } else {
                z13 = z12;
                dVarA = androidx.compose.ui.d.f19586a;
            }
            interfaceC1734nR.J();
            dVarB = androidx.compose.ui.d.f19586a;
            if (aVar != null) {
                dVarB = S.AbstractC1554k0.b(dVarB);
            }
            androidx.compose.ui.d dVarK16 = androidx.compose.foundation.layout.p.k(androidx.compose.foundation.layout.m.i(androidx.compose.foundation.layout.p.z(dVar4.b(dVarB).b(dVarA), p071h0.c.f45778a.e(), r0, 2, null), f9978a), U.y.f14385a.c());
            zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.S(g1C);
            objG = interfaceC1734nR.g();
            if (zS) {
                objG = new S.F0.a(g1A, g1C);
                interfaceC1734nR.K(objG);
            } else {
                objG = new S.F0.a(g1A, g1C);
                interfaceC1734nR.K(objG);
            }
            p210v.AbstractC7215i.a(dVarK16, (p237x7.l) objG, interfaceC1734nR, 0);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar2 = dVar4;
            d11 = d10;
            z14 = z13;
            lVar3 = lVar;
        }
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new S.F0.b(z6, aVar, dVar2, z14, d11, lVar3, i6, i10));
        }
    }
}
