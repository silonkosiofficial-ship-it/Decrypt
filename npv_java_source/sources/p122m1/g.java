package p122m1;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p122m1.l {

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final m1.g.a f50400s1 = new m1.g.a(null);

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final int f50401t1 = 8;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f50414f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private int f50415g1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private int f50418j1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private int f50420l1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private p122m1.e[] f50422n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private p122m1.e[] f50423o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int[] f50424p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private p122m1.e[] f50425q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private int f50426r1;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private int f50402T0 = -1;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private int f50403U0 = -1;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private int f50404V0 = -1;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private int f50405W0 = -1;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private int f50406X0 = -1;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private int f50407Y0 = -1;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private float f50408Z0 = 0.5f;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private float f50409a1 = 0.5f;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private float f50410b1 = 0.5f;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private float f50411c1 = 0.5f;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private float f50412d1 = 0.5f;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private float f50413e1 = 0.5f;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int f50416h1 = 2;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private int f50417i1 = 2;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private int f50419k1 = -1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private final java.util.ArrayList f50421m1 = new java.util.ArrayList();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f50427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p122m1.e f50428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f50429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p122m1.d f50430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p122m1.d f50431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private p122m1.d f50432f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p122m1.d f50433g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f50434h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f50435i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f50436j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f50437k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f50438l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f50439m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f50440n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f50441o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f50442p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f50443q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p122m1.g f50444r;

        public b(p122m1.g gVar, int i6, p122m1.d dVar, p122m1.d dVar2, p122m1.d dVar3, p122m1.d dVar4, int i10) {
            p247y7.AbstractC7350t.f(dVar, "left");
            p247y7.AbstractC7350t.f(dVar2, "top");
            p247y7.AbstractC7350t.f(dVar3, "right");
            p247y7.AbstractC7350t.f(dVar4, "bottom");
            this.f50444r = gVar;
            this.f50427a = i6;
            this.f50430d = dVar;
            this.f50431e = dVar2;
            this.f50432f = dVar3;
            this.f50433g = dVar4;
            this.f50434h = gVar.j2();
            this.f50435i = gVar.l2();
            this.f50436j = gVar.k2();
            this.f50437k = gVar.i2();
            this.f50443q = i10;
        }

        private final void h() {
            this.f50438l = 0;
            this.f50439m = 0;
            this.f50428b = null;
            this.f50429c = 0;
            int i6 = this.f50441o;
            for (int i10 = 0; i10 < i6 && this.f50440n + i10 < this.f50444r.f50426r1; i10++) {
                p122m1.e[] eVarArr = this.f50444r.f50425q1;
                p122m1.e eVar = eVarArr != null ? eVarArr[this.f50440n + i10] : null;
                p247y7.AbstractC7350t.c(eVar);
                if (this.f50427a == 0) {
                    int iB0 = eVar.B0();
                    int i11 = this.f50444r.f50414f1;
                    if (eVar.A0() == 8) {
                        i11 = 0;
                    }
                    this.f50438l += iB0 + i11;
                    int iR2 = this.f50444r.R2(eVar, this.f50443q);
                    if (this.f50428b == null || this.f50429c < iR2) {
                        this.f50428b = eVar;
                        this.f50429c = iR2;
                        this.f50439m = iR2;
                    }
                } else {
                    int iS2 = this.f50444r.S2(eVar, this.f50443q);
                    int iR3 = this.f50444r.R2(eVar, this.f50443q);
                    int i12 = this.f50444r.f50415g1;
                    if (eVar.A0() == 8) {
                        i12 = 0;
                    }
                    this.f50439m += iR3 + i12;
                    if (this.f50428b == null || this.f50429c < iS2) {
                        this.f50428b = eVar;
                        this.f50429c = iS2;
                        this.f50438l = iS2;
                    }
                }
            }
        }

        public final void a(p122m1.e eVar) {
            p247y7.AbstractC7350t.f(eVar, "widget");
            if (this.f50427a == 0) {
                int iS2 = this.f50444r.S2(eVar, this.f50443q);
                if (eVar.A() == m1.e.b.MATCH_CONSTRAINT) {
                    this.f50442p++;
                    iS2 = 0;
                }
                this.f50438l += iS2 + (eVar.A0() != 8 ? this.f50444r.f50414f1 : 0);
                int iR2 = this.f50444r.R2(eVar, this.f50443q);
                if (this.f50428b == null || this.f50429c < iR2) {
                    this.f50428b = eVar;
                    this.f50429c = iR2;
                    this.f50439m = iR2;
                }
            } else {
                int iS3 = this.f50444r.S2(eVar, this.f50443q);
                int iR3 = this.f50444r.R2(eVar, this.f50443q);
                if (eVar.y0() == m1.e.b.MATCH_CONSTRAINT) {
                    this.f50442p++;
                    iR3 = 0;
                }
                this.f50439m += iR3 + (eVar.A0() != 8 ? this.f50444r.f50415g1 : 0);
                if (this.f50428b == null || this.f50429c < iS3) {
                    this.f50428b = eVar;
                    this.f50429c = iS3;
                    this.f50438l = iS3;
                }
            }
            this.f50441o++;
        }

        public final void b() {
            this.f50429c = 0;
            this.f50428b = null;
            this.f50438l = 0;
            this.f50439m = 0;
            this.f50440n = 0;
            this.f50441o = 0;
            this.f50442p = 0;
        }

        public final void c(boolean z6, int i6, boolean z10) {
            p122m1.e eVar;
            p122m1.d dVarB0;
            p122m1.d dVarL;
            p122m1.e eVar2;
            int i10;
            p122m1.d dVarL2;
            p122m1.d dVarL3;
            int i11;
            p122m1.d dVarB1;
            p122m1.d dVarB2;
            p122m1.e eVar3;
            p122m1.e eVar4;
            int i12;
            p122m1.d dVarC0;
            p122m1.d dVarC1;
            float f6;
            float f10;
            int i13 = this.f50441o;
            int i14 = 0;
            while (true) {
                eVar = null;
                if (i14 >= i13 || this.f50440n + i14 >= this.f50444r.f50426r1) {
                    break;
                }
                p122m1.e[] eVarArr = this.f50444r.f50425q1;
                eVar = eVarArr != null ? eVarArr[this.f50440n + i14] : null;
                if (eVar != null) {
                    eVar.X0();
                }
                i14++;
            }
            if (i13 == 0 || this.f50428b == null) {
                return;
            }
            boolean z11 = z10 && i6 == 0;
            int i15 = -1;
            int i16 = -1;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = z6 ? (i13 - 1) - i17 : i17;
                if (this.f50440n + i18 >= this.f50444r.f50426r1) {
                    break;
                }
                p122m1.e[] eVarArr2 = this.f50444r.f50425q1;
                p122m1.e eVar5 = eVarArr2 != null ? eVarArr2[this.f50440n + i18] : null;
                if (eVar5 != null && eVar5.A0() == 0) {
                    if (i15 == -1) {
                        i15 = i17;
                    }
                    i16 = i17;
                }
            }
            if (this.f50427a != 0) {
                p122m1.e eVar6 = this.f50428b;
                p247y7.AbstractC7350t.c(eVar6);
                eVar6.p1(this.f50444r.f50402T0);
                int i19 = this.f50434h;
                if (i6 > 0) {
                    i19 += this.f50444r.f50414f1;
                }
                if (z6) {
                    eVar6.b0().a(this.f50432f, i19);
                    if (z10) {
                        eVar6.L().a(this.f50430d, this.f50436j);
                    }
                    if (i6 > 0) {
                        p122m1.d dVar = this.f50432f;
                        p247y7.AbstractC7350t.c(dVar);
                        dVarB0 = dVar.g().L();
                        dVarL = eVar6.b0();
                        dVarB0.a(dVarL, 0);
                    }
                } else {
                    eVar6.L().a(this.f50430d, i19);
                    if (z10) {
                        eVar6.b0().a(this.f50432f, this.f50436j);
                    }
                    if (i6 > 0) {
                        p122m1.d dVar2 = this.f50430d;
                        p247y7.AbstractC7350t.c(dVar2);
                        dVarB0 = dVar2.g().b0();
                        dVarL = eVar6.L();
                        dVarB0.a(dVarL, 0);
                    }
                }
                for (int i20 = 0; i20 < i13 && this.f50440n + i20 < this.f50444r.f50426r1; i20++) {
                    p122m1.e[] eVarArr3 = this.f50444r.f50425q1;
                    if (eVarArr3 != null && (eVar2 = eVarArr3[this.f50440n + i20]) != null) {
                        if (i20 == 0) {
                            p122m1.d dVarC2 = eVar2.c0();
                            p122m1.d dVar3 = this.f50431e;
                            p247y7.AbstractC7350t.c(dVar3);
                            eVar2.h(dVarC2, dVar3, this.f50435i);
                            int i21 = this.f50444r.f50403U0;
                            float f11 = this.f50444r.f50409a1;
                            if (this.f50440n == 0 && this.f50444r.f50405W0 != -1) {
                                i21 = this.f50444r.f50405W0;
                                f11 = this.f50444r.f50411c1;
                            } else if (z10 && this.f50444r.f50407Y0 != -1) {
                                i21 = this.f50444r.f50407Y0;
                                f11 = this.f50444r.f50413e1;
                            }
                            eVar2.N1(i21);
                            eVar2.L1(f11);
                        }
                        if (i20 == i13 - 1) {
                            p122m1.d dVarG = eVar2.G();
                            p122m1.d dVar4 = this.f50433g;
                            p247y7.AbstractC7350t.c(dVar4);
                            eVar2.h(dVarG, dVar4, this.f50437k);
                        }
                        if (eVar != null) {
                            eVar2.c0().a(eVar.G(), this.f50444r.f50415g1);
                            if (i20 == i15) {
                                eVar2.c0().z(this.f50435i);
                            }
                            eVar.G().a(eVar2.c0(), 0);
                            if (i20 == i16 + 1) {
                                eVar.G().z(this.f50437k);
                            }
                        }
                        if (!p247y7.AbstractC7350t.b(eVar2, eVar6)) {
                            int i22 = this.f50444r.f50416h1;
                            if (z6) {
                                if (i22 == 0) {
                                    i11 = 0;
                                } else if (i22 == 1) {
                                    i11 = 0;
                                    dVarB2 = eVar2.L();
                                    dVarB1 = eVar6.L();
                                    dVarB2.a(dVarB1, i11);
                                } else if (i22 != 2) {
                                    i11 = 0;
                                } else {
                                    i11 = 0;
                                    eVar2.L().a(eVar6.L(), 0);
                                }
                                dVarB2 = eVar2.b0();
                                dVarB1 = eVar6.b0();
                                dVarB2.a(dVarB1, i11);
                            } else {
                                if (i22 != 0) {
                                    if (i22 == 1) {
                                        i10 = 0;
                                    } else if (i22 == 2) {
                                        p122m1.d dVarL4 = eVar2.L();
                                        if (z11) {
                                            dVarL4.a(this.f50430d, this.f50434h);
                                            eVar2.b0().a(this.f50432f, this.f50436j);
                                        } else {
                                            i10 = 0;
                                            dVarL4.a(eVar6.L(), 0);
                                        }
                                    }
                                    dVarL2 = eVar2.b0();
                                    dVarL3 = eVar6.b0();
                                } else {
                                    i10 = 0;
                                    dVarL2 = eVar2.L();
                                    dVarL3 = eVar6.L();
                                }
                                dVarL2.a(dVarL3, i10);
                            }
                            eVar = eVar2;
                        }
                        eVar = eVar2;
                    }
                }
                return;
            }
            p122m1.e eVar7 = this.f50428b;
            p247y7.AbstractC7350t.c(eVar7);
            eVar7.N1(this.f50444r.f50403U0);
            int i23 = this.f50435i;
            if (i6 > 0) {
                i23 += this.f50444r.f50415g1;
            }
            eVar7.c0().a(this.f50431e, i23);
            if (z10) {
                eVar7.G().a(this.f50433g, this.f50437k);
            }
            if (i6 > 0) {
                p122m1.d dVar5 = this.f50431e;
                p247y7.AbstractC7350t.c(dVar5);
                dVar5.g().G().a(eVar7.c0(), 0);
            }
            if (this.f50444r.f50417i1 != 3 || eVar7.v()) {
                eVar3 = eVar7;
                break;
            }
            int i24 = 0;
            while (true) {
                if (i24 < i13) {
                    int i25 = z6 ? (i13 - 1) - i24 : i24;
                    if (this.f50440n + i25 < this.f50444r.f50426r1) {
                        p122m1.e[] eVarArr4 = this.f50444r.f50425q1;
                        p247y7.AbstractC7350t.c(eVarArr4);
                        eVar3 = eVarArr4[this.f50440n + i25];
                        p247y7.AbstractC7350t.c(eVar3);
                        if (eVar3.v()) {
                            break;
                        } else {
                            i24++;
                        }
                    }
                }
                eVar3 = eVar7;
                break;
            }
            for (int i26 = 0; i26 < i13; i26++) {
                int i27 = z6 ? (i13 - 1) - i26 : i26;
                if (this.f50440n + i27 >= this.f50444r.f50426r1) {
                    return;
                }
                p122m1.e[] eVarArr5 = this.f50444r.f50425q1;
                if (eVarArr5 != null && (eVar4 = eVarArr5[this.f50440n + i27]) != null) {
                    if (i26 == 0) {
                        p122m1.d dVarL5 = eVar4.L();
                        p122m1.d dVar6 = this.f50430d;
                        p247y7.AbstractC7350t.c(dVar6);
                        eVar4.h(dVarL5, dVar6, this.f50434h);
                    }
                    if (i27 == 0) {
                        int i28 = this.f50444r.f50402T0;
                        float f12 = z6 ? 1 - this.f50444r.f50408Z0 : this.f50444r.f50408Z0;
                        if (this.f50440n == 0 && this.f50444r.f50404V0 != -1) {
                            i28 = this.f50444r.f50404V0;
                            if (z6) {
                                f6 = 1;
                                f10 = this.f50444r.f50410b1;
                                f12 = f6 - f10;
                            } else {
                                f12 = this.f50444r.f50410b1;
                            }
                        } else if (z10 && this.f50444r.f50406X0 != -1) {
                            i28 = this.f50444r.f50406X0;
                            if (z6) {
                                f6 = 1;
                                f10 = this.f50444r.f50412d1;
                                f12 = f6 - f10;
                            } else {
                                f12 = this.f50444r.f50412d1;
                            }
                        }
                        eVar4.p1(i28);
                        eVar4.n1(f12);
                    }
                    if (i26 == i13 - 1) {
                        p122m1.d dVarB3 = eVar4.b0();
                        p122m1.d dVar7 = this.f50432f;
                        p247y7.AbstractC7350t.c(dVar7);
                        eVar4.h(dVarB3, dVar7, this.f50436j);
                    }
                    if (eVar != null) {
                        eVar4.L().a(eVar.b0(), this.f50444r.f50414f1);
                        if (i26 == i15) {
                            eVar4.L().z(this.f50434h);
                        }
                        eVar.b0().a(eVar4.L(), 0);
                        if (i26 == i16 + 1) {
                            eVar.b0().z(this.f50436j);
                        }
                    }
                    if (!p247y7.AbstractC7350t.b(eVar4, eVar7)) {
                        if (this.f50444r.f50417i1 == 3 && eVar3.v() && !p247y7.AbstractC7350t.b(eVar4, eVar3) && eVar4.v()) {
                            dVarC0 = eVar4.F();
                            dVarC1 = eVar3.F();
                            i12 = 0;
                        } else {
                            int i29 = this.f50444r.f50417i1;
                            if (i29 != 0) {
                                if (i29 == 1) {
                                    i12 = 0;
                                } else if (i29 == 2 ? !z11 : !z11) {
                                    i12 = 0;
                                    eVar4.c0().a(eVar7.c0(), 0);
                                } else {
                                    eVar4.c0().a(this.f50431e, this.f50435i);
                                    dVarC0 = eVar4.G();
                                    dVarC1 = this.f50433g;
                                    i12 = this.f50437k;
                                }
                                dVarC0 = eVar4.G();
                                dVarC1 = eVar7.G();
                            } else {
                                i12 = 0;
                                dVarC0 = eVar4.c0();
                                dVarC1 = eVar7.c0();
                            }
                        }
                        dVarC0.a(dVarC1, i12);
                    }
                    eVar = eVar4;
                }
            }
        }

        public final int d() {
            return this.f50427a == 1 ? this.f50439m - this.f50444r.f50415g1 : this.f50439m;
        }

        public final p122m1.e e() {
            return this.f50428b;
        }

        public final int f() {
            return this.f50427a == 0 ? this.f50438l - this.f50444r.f50414f1 : this.f50438l;
        }

        public final void g(int i6) {
            p122m1.g gVar;
            m1.e.b bVarA;
            int iB0;
            m1.e.b bVarY0;
            int iW;
            int i10 = this.f50442p;
            if (i10 == 0) {
                return;
            }
            int i11 = this.f50441o;
            int i12 = i6 / i10;
            for (int i13 = 0; i13 < i11 && this.f50440n + i13 < this.f50444r.f50426r1; i13++) {
                p122m1.e[] eVarArr = this.f50444r.f50425q1;
                p122m1.e eVar = eVarArr != null ? eVarArr[this.f50440n + i13] : null;
                if (this.f50427a == 0) {
                    if (eVar != null && eVar.A() == m1.e.b.MATCH_CONSTRAINT && eVar.Q() == 0) {
                        gVar = this.f50444r;
                        bVarA = m1.e.b.FIXED;
                        bVarY0 = eVar.y0();
                        iW = eVar.w();
                        iB0 = i12;
                        gVar.n2(eVar, bVarA, iB0, bVarY0, iW);
                    }
                } else if (eVar != null && eVar.y0() == m1.e.b.MATCH_CONSTRAINT && eVar.P() == 0) {
                    gVar = this.f50444r;
                    bVarA = eVar.A();
                    iB0 = eVar.B0();
                    bVarY0 = m1.e.b.FIXED;
                    iW = i12;
                    gVar.n2(eVar, bVarA, iB0, bVarY0, iW);
                }
            }
            h();
        }

        public final void i(int i6) {
            this.f50440n = i6;
        }

        public final void j(int i6, p122m1.d dVar, p122m1.d dVar2, p122m1.d dVar3, p122m1.d dVar4, int i10, int i11, int i12, int i13, int i14) {
            p247y7.AbstractC7350t.f(dVar, "left");
            p247y7.AbstractC7350t.f(dVar2, "top");
            p247y7.AbstractC7350t.f(dVar3, "right");
            p247y7.AbstractC7350t.f(dVar4, "bottom");
            this.f50427a = i6;
            this.f50430d = dVar;
            this.f50431e = dVar2;
            this.f50432f = dVar3;
            this.f50433g = dVar4;
            this.f50434h = i10;
            this.f50435i = i11;
            this.f50436j = i12;
            this.f50437k = i13;
            this.f50443q = i14;
        }
    }

    private final void Q2(boolean z6) {
        float f6;
        int i6;
        if (this.f50424p1 == null || this.f50423o1 == null || this.f50422n1 == null) {
            return;
        }
        int i10 = this.f50426r1;
        int i11 = 0;
        while (true) {
            p122m1.e eVar = null;
            if (i11 >= i10) {
                break;
            }
            p122m1.e[] eVarArr = this.f50425q1;
            if (eVarArr != null) {
                eVar = eVarArr[i11];
            }
            p247y7.AbstractC7350t.c(eVar);
            eVar.X0();
            i11++;
        }
        int[] iArr = this.f50424p1;
        p247y7.AbstractC7350t.c(iArr);
        int i12 = iArr[0];
        int[] iArr2 = this.f50424p1;
        p247y7.AbstractC7350t.c(iArr2);
        int i13 = iArr2[1];
        float f10 = this.f50408Z0;
        int i14 = 0;
        p122m1.e eVar2 = null;
        while (i14 < i12) {
            if (z6) {
                i6 = (i12 - i14) - 1;
                f6 = 1 - this.f50408Z0;
            } else {
                f6 = f10;
                i6 = i14;
            }
            p122m1.e[] eVarArr2 = this.f50423o1;
            p247y7.AbstractC7350t.c(eVarArr2);
            p122m1.e eVar3 = eVarArr2[i6];
            if (eVar3 != null && eVar3.A0() != 8) {
                if (i14 == 0) {
                    eVar3.h(eVar3.L(), L(), j2());
                    eVar3.p1(this.f50402T0);
                    eVar3.n1(f6);
                }
                if (i14 == i12 - 1) {
                    eVar3.h(eVar3.b0(), b0(), k2());
                }
                if (i14 > 0 && eVar2 != null) {
                    eVar3.h(eVar3.L(), eVar2.b0(), this.f50414f1);
                    eVar2.h(eVar2.b0(), eVar3.L(), 0);
                }
                eVar2 = eVar3;
            }
            i14++;
            f10 = f6;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            p122m1.e[] eVarArr3 = this.f50422n1;
            p247y7.AbstractC7350t.c(eVarArr3);
            p122m1.e eVar4 = eVarArr3[i15];
            if (eVar4 != null && eVar4.A0() != 8) {
                if (i15 == 0) {
                    eVar4.h(eVar4.c0(), c0(), l2());
                    eVar4.N1(this.f50403U0);
                    eVar4.L1(this.f50409a1);
                }
                if (i15 == i13 - 1) {
                    eVar4.h(eVar4.G(), G(), i2());
                }
                if (i15 > 0 && eVar2 != null) {
                    eVar4.h(eVar4.c0(), eVar2.G(), this.f50415g1);
                    eVar2.h(eVar2.G(), eVar4.c0(), 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = (i17 * i12) + i16;
                if (this.f50420l1 == 1) {
                    i18 = (i16 * i13) + i17;
                }
                p122m1.e[] eVarArr4 = this.f50425q1;
                p247y7.AbstractC7350t.c(eVarArr4);
                if (i18 < eVarArr4.length) {
                    p122m1.e[] eVarArr5 = this.f50425q1;
                    p122m1.e eVar5 = eVarArr5 != null ? eVarArr5[i18] : null;
                    if (eVar5 != null && eVar5.A0() != 8) {
                        p122m1.e[] eVarArr6 = this.f50423o1;
                        p247y7.AbstractC7350t.c(eVarArr6);
                        p122m1.e eVar6 = eVarArr6[i16];
                        p122m1.e[] eVarArr7 = this.f50422n1;
                        p247y7.AbstractC7350t.c(eVarArr7);
                        p122m1.e eVar7 = eVarArr7[i17];
                        if (!p247y7.AbstractC7350t.b(eVar5, eVar6)) {
                            p122m1.d dVarL = eVar5.L();
                            p247y7.AbstractC7350t.c(eVar6);
                            eVar5.h(dVarL, eVar6.L(), 0);
                            eVar5.h(eVar5.b0(), eVar6.b0(), 0);
                        }
                        if (!p247y7.AbstractC7350t.b(eVar5, eVar7)) {
                            p122m1.d dVarC0 = eVar5.c0();
                            p247y7.AbstractC7350t.c(eVar7);
                            eVar5.h(dVarC0, eVar7.c0(), 0);
                            eVar5.h(eVar5.G(), eVar7.G(), 0);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R2(p122m1.e eVar, int i6) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.y0() == m1.e.b.MATCH_CONSTRAINT) {
            int iP = eVar.P();
            if (iP == 0) {
                return 0;
            }
            if (iP == 1) {
                return eVar.w();
            }
            if (iP == 2) {
                int iV = (int) (eVar.V() * i6);
                if (iV != eVar.w()) {
                    eVar.E1(true);
                    n2(eVar, eVar.A(), eVar.B0(), m1.e.b.FIXED, iV);
                }
                return iV;
            }
            if (iP == 3) {
                return (int) ((eVar.B0() * eVar.I()) + 0.5f);
            }
        }
        return eVar.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S2(p122m1.e eVar, int i6) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.A() == m1.e.b.MATCH_CONSTRAINT) {
            int iQ = eVar.Q();
            if (iQ == 0) {
                return 0;
            }
            if (iQ == 1) {
                return eVar.B0();
            }
            if (iQ == 2) {
                int iW = (int) (eVar.W() * i6);
                if (iW != eVar.B0()) {
                    eVar.E1(true);
                    n2(eVar, m1.e.b.FIXED, iW, eVar.y0(), eVar.w());
                }
                return iW;
            }
            if (iQ == 3) {
                return (int) ((eVar.w() * eVar.I()) + 0.5f);
            }
        }
        return eVar.B0();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0143  */
    /* JADX WARN: Code duplicated, block: B:108:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0061 A[ADDED_TO_REGION, EDGE_INSN: B:121:0x0061->B:40:0x0061 BREAK  A[LOOP:1: B:42:0x0064->B:126:0x0064], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0061 A[ADDED_TO_REGION, EDGE_INSN: B:124:0x0061->B:40:0x0061 BREAK  A[LOOP:1: B:42:0x0064->B:126:0x0064], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0114 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0068  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x010d  */
    /* JADX WARN: Code duplicated, block: B:91:0x011e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0129  */
    /* JADX WARN: Code duplicated, block: B:99:0x0138  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0154 -> B:40:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0156 -> B:40:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x015c -> B:40:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x015e -> B:40:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:94:0x0129
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final void T2(p122m1.e[] r18, int r19, int r20, int r21, int[] r22) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p122m1.g.T2(m1.e[], int, int, int, int[]):void");
    }

    private final void U2(p122m1.e[] eVarArr, int i6, int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        int i14;
        java.lang.String str;
        p122m1.d dVarB0;
        int iK2;
        p122m1.d dVarG;
        int iI2;
        int i15;
        if (i6 == 0) {
            return;
        }
        this.f50421m1.clear();
        m1.g.b bVar = new m1.g.b(this, i10, L(), c0(), b0(), G(), i11);
        this.f50421m1.add(bVar);
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        if (i10 == 0) {
            while (i18 < i6) {
                p122m1.e eVar = eVarArr[i18];
                int iS2 = S2(eVar, i11);
                if ((eVar != null ? eVar.A() : null) == m1.e.b.MATCH_CONSTRAINT) {
                    i16++;
                }
                int i19 = i16;
                boolean z6 = (i17 == i11 || (this.f50414f1 + i17) + iS2 > i11) && bVar.e() != null;
                if (!z6 && i18 > 0 && (i15 = this.f50419k1) > 0 && i18 % i15 == 0) {
                    z6 = true;
                }
                if (z6) {
                    bVar = new m1.g.b(this, i10, L(), c0(), b0(), G(), i11);
                    bVar.i(i18);
                    this.f50421m1.add(bVar);
                } else {
                    if (i18 > 0) {
                        i17 += this.f50414f1 + iS2;
                    }
                    p247y7.AbstractC7350t.c(eVar);
                    bVar.a(eVar);
                    i18++;
                    i16 = i19;
                }
                i17 = iS2;
                p247y7.AbstractC7350t.c(eVar);
                bVar.a(eVar);
                i18++;
                i16 = i19;
            }
        } else {
            while (i18 < i6) {
                p122m1.e eVar2 = eVarArr[i18];
                int iR2 = R2(eVar2, i11);
                if ((eVar2 != null ? eVar2.y0() : null) == m1.e.b.MATCH_CONSTRAINT) {
                    i16++;
                }
                int i20 = i16;
                boolean z10 = (i17 == i11 || (this.f50415g1 + i17) + iR2 > i11) && bVar.e() != null;
                if (!z10 && i18 > 0 && (i12 = this.f50419k1) > 0 && i18 % i12 == 0) {
                    z10 = true;
                }
                if (z10) {
                    bVar = new m1.g.b(this, i10, L(), c0(), b0(), G(), i11);
                    bVar.i(i18);
                    this.f50421m1.add(bVar);
                } else {
                    if (i18 > 0) {
                        i17 += this.f50415g1 + iR2;
                    }
                    p247y7.AbstractC7350t.c(eVar2);
                    bVar.a(eVar2);
                    i18++;
                    i16 = i20;
                }
                i17 = iR2;
                p247y7.AbstractC7350t.c(eVar2);
                bVar.a(eVar2);
                i18++;
                i16 = i20;
            }
        }
        int size = this.f50421m1.size();
        p122m1.d dVarL = L();
        p122m1.d dVarC0 = c0();
        p122m1.d dVarB1 = b0();
        p122m1.d dVarG2 = G();
        int iJ2 = j2();
        int iL2 = l2();
        int iK3 = k2();
        int iI3 = i2();
        m1.e.b bVarA = A();
        m1.e.b bVar2 = m1.e.b.WRAP_CONTENT;
        boolean z11 = bVarA == bVar2 || y0() == bVar2;
        java.lang.String str2 = "get(...)";
        if (i16 > 0 && z11) {
            for (int i21 = 0; i21 < size; i21++) {
                java.lang.Object obj = this.f50421m1.get(i21);
                p247y7.AbstractC7350t.e(obj, "get(...)");
                m1.g.b bVar3 = (m1.g.b) obj;
                bVar3.g(i11 - (i10 == 0 ? bVar3.f() : bVar3.d()));
            }
        }
        int i22 = iL2;
        int i23 = iK3;
        int iD = 0;
        int iF = 0;
        int i24 = 0;
        int i25 = iJ2;
        p122m1.d dVar = dVarC0;
        p122m1.d dVar2 = dVarL;
        int i26 = iI3;
        while (i24 < size) {
            java.lang.Object obj2 = this.f50421m1.get(i24);
            p247y7.AbstractC7350t.e(obj2, str2);
            m1.g.b bVar4 = (m1.g.b) obj2;
            if (i10 == 0) {
                if (i24 < size - 1) {
                    java.lang.Object obj3 = this.f50421m1.get(i24 + 1);
                    p247y7.AbstractC7350t.e(obj3, str2);
                    p122m1.e eVarE = ((m1.g.b) obj3).e();
                    p247y7.AbstractC7350t.c(eVarE);
                    dVarG = eVarE.c0();
                    iI2 = 0;
                } else {
                    dVarG = G();
                    iI2 = i2();
                }
                p122m1.e eVarE2 = bVar4.e();
                p247y7.AbstractC7350t.c(eVarE2);
                p122m1.d dVarG3 = eVarE2.G();
                p247y7.AbstractC7350t.c(dVar2);
                p247y7.AbstractC7350t.c(dVar);
                i13 = size;
                int i27 = iD;
                p122m1.d dVar3 = dVar2;
                p122m1.d dVar4 = dVar2;
                int i28 = iF;
                p122m1.d dVar5 = dVar;
                int i29 = i24;
                p122m1.d dVar6 = dVarB1;
                p122m1.d dVar7 = dVarB1;
                str = str2;
                bVar4.j(i10, dVar3, dVar5, dVar6, dVarG, i25, i22, i23, iI2, i11);
                int iMax = java.lang.Math.max(i28, bVar4.f());
                iD = i27 + bVar4.d();
                if (i29 > 0) {
                    iD += this.f50415g1;
                }
                iF = iMax;
                i22 = 0;
                dVar2 = dVar4;
                iK2 = i23;
                i14 = i29;
                dVar = dVarG3;
                dVarB0 = dVar7;
                int i30 = iI2;
                dVarG2 = dVarG;
                i26 = i30;
            } else {
                i13 = size;
                p122m1.d dVar8 = dVar2;
                int i31 = iD;
                int i32 = iF;
                i14 = i24;
                str = str2;
                if (i14 < i13 - 1) {
                    java.lang.Object obj4 = this.f50421m1.get(i14 + 1);
                    p247y7.AbstractC7350t.e(obj4, str);
                    p122m1.e eVarE3 = ((m1.g.b) obj4).e();
                    p247y7.AbstractC7350t.c(eVarE3);
                    dVarB0 = eVarE3.L();
                    iK2 = 0;
                } else {
                    dVarB0 = b0();
                    iK2 = k2();
                }
                p122m1.e eVarE4 = bVar4.e();
                p247y7.AbstractC7350t.c(eVarE4);
                p122m1.d dVarB2 = eVarE4.b0();
                p247y7.AbstractC7350t.c(dVar8);
                p247y7.AbstractC7350t.c(dVar);
                bVar4.j(i10, dVar8, dVar, dVarB0, dVarG2, i25, i22, iK2, i26, i11);
                iF = i32 + bVar4.f();
                int iMax2 = java.lang.Math.max(i31, bVar4.d());
                if (i14 > 0) {
                    iF += this.f50414f1;
                }
                iD = iMax2;
                i25 = 0;
                dVar2 = dVarB2;
            }
            i24 = i14 + 1;
            size = i13;
            str2 = str;
            dVarB1 = dVarB0;
            i23 = iK2;
        }
        iArr[0] = iF;
        iArr[1] = iD;
    }

    private final void V2(p122m1.e[] eVarArr, int i6, int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        int i14;
        java.lang.String str;
        p122m1.d dVarB0;
        int iK2;
        p122m1.d dVarG;
        int iI2;
        int i15;
        if (i6 == 0) {
            return;
        }
        this.f50421m1.clear();
        m1.g.b bVar = new m1.g.b(this, i10, L(), c0(), b0(), G(), i11);
        this.f50421m1.add(bVar);
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        if (i10 == 0) {
            while (i19 < i6) {
                i16++;
                p122m1.e eVar = eVarArr[i19];
                int iS2 = S2(eVar, i11);
                if ((eVar != null ? eVar.A() : null) == m1.e.b.MATCH_CONSTRAINT) {
                    i17++;
                }
                int i20 = i17;
                boolean z6 = (i18 == i11 || (this.f50414f1 + i18) + iS2 > i11) && bVar.e() != null;
                if (!z6 && i19 > 0 && (i15 = this.f50419k1) > 0 && i16 > i15) {
                    z6 = true;
                }
                if (z6) {
                    bVar = new m1.g.b(this, i10, L(), c0(), b0(), G(), i11);
                    bVar.i(i19);
                    this.f50421m1.add(bVar);
                    i18 = iS2;
                    i16 = 1;
                } else {
                    i18 = i19 > 0 ? i18 + this.f50414f1 + iS2 : iS2;
                }
                p247y7.AbstractC7350t.c(eVar);
                bVar.a(eVar);
                i19++;
                i17 = i20;
            }
        } else {
            while (i19 < i6) {
                i16++;
                p122m1.e eVar2 = eVarArr[i19];
                int iR2 = R2(eVar2, i11);
                if ((eVar2 != null ? eVar2.y0() : null) == m1.e.b.MATCH_CONSTRAINT) {
                    i17++;
                }
                int i21 = i17;
                boolean z10 = (i18 == i11 || (this.f50415g1 + i18) + iR2 > i11) && bVar.e() != null;
                if (!z10 && i19 > 0 && (i12 = this.f50419k1) > 0 && i16 > i12) {
                    z10 = true;
                }
                if (z10) {
                    bVar = new m1.g.b(this, i10, L(), c0(), b0(), G(), i11);
                    bVar.i(i19);
                    this.f50421m1.add(bVar);
                    i18 = iR2;
                    i16 = 1;
                } else {
                    i18 = i19 > 0 ? i18 + this.f50415g1 + iR2 : iR2;
                }
                p247y7.AbstractC7350t.c(eVar2);
                bVar.a(eVar2);
                i19++;
                i17 = i21;
            }
        }
        int size = this.f50421m1.size();
        p122m1.d dVarL = L();
        p122m1.d dVarC0 = c0();
        p122m1.d dVarB1 = b0();
        p122m1.d dVarG2 = G();
        int iJ2 = j2();
        int iL2 = l2();
        int iK3 = k2();
        int iI3 = i2();
        m1.e.b bVarA = A();
        m1.e.b bVar2 = m1.e.b.WRAP_CONTENT;
        boolean z11 = bVarA == bVar2 || y0() == bVar2;
        java.lang.String str2 = "get(...)";
        if (i17 > 0 && z11) {
            for (int i22 = 0; i22 < size; i22++) {
                java.lang.Object obj = this.f50421m1.get(i22);
                p247y7.AbstractC7350t.e(obj, "get(...)");
                m1.g.b bVar3 = (m1.g.b) obj;
                bVar3.g(i11 - (i10 == 0 ? bVar3.f() : bVar3.d()));
            }
        }
        int i23 = iL2;
        int i24 = iK3;
        int iD = 0;
        int iF = 0;
        int i25 = 0;
        int i26 = iJ2;
        p122m1.d dVar = dVarC0;
        p122m1.d dVar2 = dVarL;
        int i27 = iI3;
        while (i25 < size) {
            java.lang.Object obj2 = this.f50421m1.get(i25);
            p247y7.AbstractC7350t.e(obj2, str2);
            m1.g.b bVar4 = (m1.g.b) obj2;
            if (i10 == 0) {
                if (i25 < size - 1) {
                    java.lang.Object obj3 = this.f50421m1.get(i25 + 1);
                    p247y7.AbstractC7350t.e(obj3, str2);
                    p122m1.e eVarE = ((m1.g.b) obj3).e();
                    p247y7.AbstractC7350t.c(eVarE);
                    dVarG = eVarE.c0();
                    iI2 = 0;
                } else {
                    dVarG = G();
                    iI2 = i2();
                }
                p122m1.e eVarE2 = bVar4.e();
                p247y7.AbstractC7350t.c(eVarE2);
                p122m1.d dVarG3 = eVarE2.G();
                p247y7.AbstractC7350t.c(dVar2);
                p247y7.AbstractC7350t.c(dVar);
                i13 = size;
                int i28 = iD;
                p122m1.d dVar3 = dVar2;
                p122m1.d dVar4 = dVar2;
                int i29 = iF;
                p122m1.d dVar5 = dVar;
                int i30 = i25;
                p122m1.d dVar6 = dVarB1;
                p122m1.d dVar7 = dVarB1;
                str = str2;
                bVar4.j(i10, dVar3, dVar5, dVar6, dVarG, i26, i23, i24, iI2, i11);
                int iMax = java.lang.Math.max(i29, bVar4.f());
                iD = i28 + bVar4.d();
                if (i30 > 0) {
                    iD += this.f50415g1;
                }
                iF = iMax;
                i23 = 0;
                dVar2 = dVar4;
                iK2 = i24;
                i14 = i30;
                dVar = dVarG3;
                dVarB0 = dVar7;
                int i31 = iI2;
                dVarG2 = dVarG;
                i27 = i31;
            } else {
                i13 = size;
                p122m1.d dVar8 = dVar2;
                int i32 = iD;
                int i33 = iF;
                i14 = i25;
                str = str2;
                if (i14 < i13 - 1) {
                    java.lang.Object obj4 = this.f50421m1.get(i14 + 1);
                    p247y7.AbstractC7350t.e(obj4, str);
                    p122m1.e eVarE3 = ((m1.g.b) obj4).e();
                    p247y7.AbstractC7350t.c(eVarE3);
                    dVarB0 = eVarE3.L();
                    iK2 = 0;
                } else {
                    dVarB0 = b0();
                    iK2 = k2();
                }
                p122m1.e eVarE4 = bVar4.e();
                p247y7.AbstractC7350t.c(eVarE4);
                p122m1.d dVarB2 = eVarE4.b0();
                p247y7.AbstractC7350t.c(dVar8);
                p247y7.AbstractC7350t.c(dVar);
                bVar4.j(i10, dVar8, dVar, dVarB0, dVarG2, i26, i23, iK2, i27, i11);
                iF = i33 + bVar4.f();
                int iMax2 = java.lang.Math.max(i32, bVar4.d());
                if (i14 > 0) {
                    iF += this.f50414f1;
                }
                iD = iMax2;
                i26 = 0;
                dVar2 = dVarB2;
            }
            i25 = i14 + 1;
            size = i13;
            str2 = str;
            dVarB1 = dVarB0;
            i24 = iK2;
        }
        iArr[0] = iF;
        iArr[1] = iD;
    }

    private final void W2(p122m1.e[] eVarArr, int i6, int i10, int i11, int[] iArr) {
        m1.g.b bVar;
        if (i6 == 0) {
            return;
        }
        if (this.f50421m1.size() == 0) {
            bVar = new m1.g.b(this, i10, L(), c0(), b0(), G(), i11);
            this.f50421m1.add(bVar);
        } else {
            m1.g.b bVar2 = (m1.g.b) this.f50421m1.get(0);
            bVar2.b();
            bVar = bVar2;
            bVar.j(i10, L(), c0(), b0(), G(), j2(), l2(), k2(), i2(), i11);
        }
        for (int i12 = 0; i12 < i6; i12++) {
            p122m1.e eVar = eVarArr[i12];
            p247y7.AbstractC7350t.c(eVar);
            bVar.a(eVar);
        }
        iArr[0] = bVar.f();
        iArr[1] = bVar.d();
    }

    public final void X2(float f6) {
        this.f50410b1 = f6;
    }

    public final void Y2(int i6) {
        this.f50404V0 = i6;
    }

    public final void Z2(float f6) {
        this.f50411c1 = f6;
    }

    public final void a3(int i6) {
        this.f50405W0 = i6;
    }

    public final void b3(int i6) {
        this.f50416h1 = i6;
    }

    public final void c3(float f6) {
        this.f50408Z0 = f6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @Override // p122m1.e
    public void d(p042e1.d dVar, boolean z6) {
        boolean z10;
        p247y7.AbstractC7350t.f(dVar, "system");
        super.d(dVar, z6);
        if (o0() != null) {
            p122m1.f fVar = (p122m1.f) o0();
            p247y7.AbstractC7350t.c(fVar);
            if (fVar.J2()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        int i6 = this.f50418j1;
        if (i6 != 0) {
            if (i6 == 1) {
                int size = this.f50421m1.size();
                int i10 = 0;
                while (i10 < size) {
                    java.lang.Object obj = this.f50421m1.get(i10);
                    p247y7.AbstractC7350t.e(obj, "get(...)");
                    ((m1.g.b) obj).c(z10, i10, i10 == size + (-1));
                    i10++;
                }
            } else if (i6 == 2) {
                Q2(z10);
            } else if (i6 == 3) {
                int size2 = this.f50421m1.size();
                int i11 = 0;
                while (i11 < size2) {
                    java.lang.Object obj2 = this.f50421m1.get(i11);
                    p247y7.AbstractC7350t.e(obj2, "get(...)");
                    ((m1.g.b) obj2).c(z10, i11, i11 == size2 + (-1));
                    i11++;
                }
            }
        } else if (this.f50421m1.size() > 0) {
            java.lang.Object obj3 = this.f50421m1.get(0);
            p247y7.AbstractC7350t.e(obj3, "get(...)");
            ((m1.g.b) obj3).c(z10, 0, true);
        }
        q2(false);
    }

    public final void d3(int i6) {
        this.f50414f1 = i6;
    }

    public final void e3(int i6) {
        this.f50402T0 = i6;
    }

    public final void f3(float f6) {
        this.f50412d1 = f6;
    }

    public final void g3(int i6) {
        this.f50406X0 = i6;
    }

    public final void h3(float f6) {
        this.f50413e1 = f6;
    }

    public final void i3(int i6) {
        this.f50407Y0 = i6;
    }

    public final void j3(int i6) {
        this.f50419k1 = i6;
    }

    public final void k3(int i6) {
        this.f50420l1 = i6;
    }

    public final void l3(int i6) {
        this.f50417i1 = i6;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    @Override // p122m1.l
    public void m2(int i6, int i10, int i11, int i12) {
        int i13;
        boolean z6;
        if (e2() > 0 && !o2()) {
            r2(0, 0);
            q2(false);
            return;
        }
        int iJ2 = j2();
        int iK2 = k2();
        int iL2 = l2();
        int iI2 = i2();
        int[] iArr = new int[2];
        int i14 = (i10 - iJ2) - iK2;
        int i15 = this.f50420l1;
        if (i15 == 1) {
            i14 = (i12 - iL2) - iI2;
        }
        int i16 = i14;
        if (i15 == 0) {
            if (this.f50402T0 == -1) {
                this.f50402T0 = 0;
            }
            if (this.f50403U0 == -1) {
                this.f50403U0 = 0;
            }
        } else {
            if (this.f50402T0 == -1) {
                this.f50402T0 = 0;
            }
            if (this.f50403U0 == -1) {
                this.f50403U0 = 0;
            }
        }
        p122m1.e[] eVarArrD2 = d2();
        int iE2 = e2();
        int i17 = 0;
        for (int i18 = 0; i18 < iE2; i18++) {
            p122m1.e eVar = d2()[i18];
            p247y7.AbstractC7350t.c(eVar);
            if (eVar.A0() == 8) {
                i17++;
            }
        }
        int iE3 = e2();
        if (i17 > 0) {
            p122m1.e[] eVarArr = new p122m1.e[e2() - i17];
            int iE4 = e2();
            int i19 = 0;
            for (int i20 = 0; i20 < iE4; i20++) {
                p122m1.e eVar2 = d2()[i20];
                p247y7.AbstractC7350t.c(eVar2);
                if (eVar2.A0() != 8) {
                    eVarArr[i19] = eVar2;
                    i19++;
                }
            }
            eVarArrD2 = eVarArr;
            i13 = i19;
        } else {
            i13 = iE3;
        }
        this.f50425q1 = eVarArrD2;
        this.f50426r1 = i13;
        int i21 = this.f50418j1;
        if (i21 == 0) {
            z6 = true;
            W2(eVarArrD2, i13, this.f50420l1, i16, iArr);
        } else if (i21 == 1) {
            z6 = true;
            U2(eVarArrD2, i13, this.f50420l1, i16, iArr);
        } else if (i21 == 2) {
            z6 = true;
            T2(eVarArrD2, i13, this.f50420l1, i16, iArr);
        } else if (i21 != 3) {
            z6 = true;
        } else {
            z6 = true;
            V2(eVarArrD2, i13, this.f50420l1, i16, iArr);
        }
        int iMin = iArr[0] + iJ2 + iK2;
        int iMin2 = iArr[z6 ? 1 : 0] + iL2 + iI2;
        if (i6 == Integer.MIN_VALUE) {
            iMin = java.lang.Math.min(iMin, i10);
        } else if (i6 != 0) {
            iMin = i6 != 1073741824 ? 0 : i10;
        }
        if (i11 == Integer.MIN_VALUE) {
            iMin2 = java.lang.Math.min(iMin2, i12);
        } else if (i11 != 0) {
            iMin2 = i11 != 1073741824 ? 0 : i12;
        }
        r2(iMin, iMin2);
        U1(iMin);
        m1(iMin2);
        if (e2() <= 0) {
            z6 = false;
        }
        q2(z6);
    }

    public final void m3(float f6) {
        this.f50409a1 = f6;
    }

    public final void n3(int i6) {
        this.f50415g1 = i6;
    }

    public final void o3(int i6) {
        this.f50403U0 = i6;
    }

    public final void p3(int i6) {
        this.f50418j1 = i6;
    }
}
