package p172r1;

/* JADX INFO: loaded from: classes.dex */
public class g extends p172r1.l {

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private p172r1.e[] f53765i1;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private int f53742L0 = -1;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private int f53743M0 = -1;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private int f53744N0 = -1;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private int f53745O0 = -1;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private int f53746P0 = -1;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private int f53747Q0 = -1;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private float f53748R0 = 0.5f;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private float f53749S0 = 0.5f;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private float f53750T0 = 0.5f;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private float f53751U0 = 0.5f;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private float f53752V0 = 0.5f;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private float f53753W0 = 0.5f;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private int f53754X0 = 0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private int f53755Y0 = 0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private int f53756Z0 = 2;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f53757a1 = 2;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f53758b1 = 0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f53759c1 = -1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f53760d1 = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private java.util.ArrayList f53761e1 = new java.util.ArrayList();

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private p172r1.e[] f53762f1 = null;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private p172r1.e[] f53763g1 = null;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int[] f53764h1 = null;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private int f53766j1 = 0;

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f53767a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p172r1.d f53770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p172r1.d f53771e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private p172r1.d f53772f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p172r1.d f53773g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f53774h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f53775i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f53776j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f53777k;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f53783q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p172r1.e f53768b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f53769c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f53778l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f53779m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f53780n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f53781o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f53782p = 0;

        public a(int i6, p172r1.d dVar, p172r1.d dVar2, p172r1.d dVar3, p172r1.d dVar4, int i10) {
            this.f53774h = 0;
            this.f53775i = 0;
            this.f53776j = 0;
            this.f53777k = 0;
            this.f53783q = 0;
            this.f53767a = i6;
            this.f53770d = dVar;
            this.f53771e = dVar2;
            this.f53772f = dVar3;
            this.f53773g = dVar4;
            this.f53774h = p172r1.g.this.P0();
            this.f53775i = p172r1.g.this.R0();
            this.f53776j = p172r1.g.this.Q0();
            this.f53777k = p172r1.g.this.O0();
            this.f53783q = i10;
        }

        private void h() {
            this.f53778l = 0;
            this.f53779m = 0;
            this.f53768b = null;
            this.f53769c = 0;
            int i6 = this.f53781o;
            for (int i10 = 0; i10 < i6 && this.f53780n + i10 < p172r1.g.this.f53766j1; i10++) {
                p172r1.e eVar = p172r1.g.this.f53765i1[this.f53780n + i10];
                if (this.f53767a == 0) {
                    int iP = eVar.P();
                    int i11 = p172r1.g.this.f53754X0;
                    if (eVar.O() == 8) {
                        i11 = 0;
                    }
                    this.f53778l += iP + i11;
                    int iA1 = p172r1.g.this.A1(eVar, this.f53783q);
                    if (this.f53768b == null || this.f53769c < iA1) {
                        this.f53768b = eVar;
                        this.f53769c = iA1;
                        this.f53779m = iA1;
                    }
                } else {
                    int iB1 = p172r1.g.this.B1(eVar, this.f53783q);
                    int iA2 = p172r1.g.this.A1(eVar, this.f53783q);
                    int i12 = p172r1.g.this.f53755Y0;
                    if (eVar.O() == 8) {
                        i12 = 0;
                    }
                    this.f53779m += iA2 + i12;
                    if (this.f53768b == null || this.f53769c < iB1) {
                        this.f53768b = eVar;
                        this.f53769c = iB1;
                        this.f53778l = iB1;
                    }
                }
            }
        }

        public void b(p172r1.e eVar) {
            if (this.f53767a == 0) {
                int iB1 = p172r1.g.this.B1(eVar, this.f53783q);
                if (eVar.y() == r1.e.b.MATCH_CONSTRAINT) {
                    this.f53782p++;
                    iB1 = 0;
                }
                this.f53778l += iB1 + (eVar.O() != 8 ? p172r1.g.this.f53754X0 : 0);
                int iA1 = p172r1.g.this.A1(eVar, this.f53783q);
                if (this.f53768b == null || this.f53769c < iA1) {
                    this.f53768b = eVar;
                    this.f53769c = iA1;
                    this.f53779m = iA1;
                }
            } else {
                int iB2 = p172r1.g.this.B1(eVar, this.f53783q);
                int iA2 = p172r1.g.this.A1(eVar, this.f53783q);
                if (eVar.M() == r1.e.b.MATCH_CONSTRAINT) {
                    this.f53782p++;
                    iA2 = 0;
                }
                this.f53779m += iA2 + (eVar.O() != 8 ? p172r1.g.this.f53755Y0 : 0);
                if (this.f53768b == null || this.f53769c < iB2) {
                    this.f53768b = eVar;
                    this.f53769c = iB2;
                    this.f53778l = iB2;
                }
            }
            this.f53781o++;
        }

        public void c() {
            this.f53769c = 0;
            this.f53768b = null;
            this.f53778l = 0;
            this.f53779m = 0;
            this.f53780n = 0;
            this.f53781o = 0;
            this.f53782p = 0;
        }

        public void d(boolean z6, int i6, boolean z10) {
            p172r1.d dVar;
            p172r1.d dVar2;
            p172r1.d dVar3;
            p172r1.d dVar4;
            p172r1.d dVar5;
            p172r1.d dVar6;
            p172r1.e eVar;
            char c6;
            p172r1.d dVar7;
            p172r1.d dVar8;
            int i10 = this.f53781o;
            for (int i11 = 0; i11 < i10 && this.f53780n + i11 < p172r1.g.this.f53766j1; i11++) {
                p172r1.e eVar2 = p172r1.g.this.f53765i1[this.f53780n + i11];
                if (eVar2 != null) {
                    eVar2.Z();
                }
            }
            if (i10 == 0 || this.f53768b == null) {
                return;
            }
            boolean z11 = z10 && i6 == 0;
            int i12 = -1;
            int i13 = -1;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = z6 ? (i10 - 1) - i14 : i14;
                if (this.f53780n + i15 >= p172r1.g.this.f53766j1) {
                    break;
                }
                if (p172r1.g.this.f53765i1[this.f53780n + i15].O() == 0) {
                    if (i12 == -1) {
                        i12 = i14;
                    }
                    i13 = i14;
                }
            }
            p172r1.e eVar3 = null;
            if (this.f53767a == 0) {
                p172r1.e eVar4 = this.f53768b;
                eVar4.y0(p172r1.g.this.f53743M0);
                int i16 = this.f53775i;
                if (i6 > 0) {
                    i16 += p172r1.g.this.f53755Y0;
                }
                eVar4.f53641C.a(this.f53771e, i16);
                if (z10) {
                    eVar4.f53643E.a(this.f53773g, this.f53777k);
                }
                if (i6 > 0) {
                    this.f53771e.f53621b.f53643E.a(eVar4.f53641C, 0);
                }
                if (p172r1.g.this.f53757a1 != 3 || eVar4.S()) {
                    eVar = eVar4;
                    break;
                }
                int i17 = 0;
                while (true) {
                    if (i17 < i10) {
                        int i18 = z6 ? (i10 - 1) - i17 : i17;
                        if (this.f53780n + i18 < p172r1.g.this.f53766j1) {
                            eVar = p172r1.g.this.f53765i1[this.f53780n + i18];
                            if (eVar.S()) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                    eVar = eVar4;
                    break;
                }
                int i19 = 0;
                while (i19 < i10) {
                    int i20 = z6 ? (i10 - 1) - i19 : i19;
                    if (this.f53780n + i20 >= p172r1.g.this.f53766j1) {
                        return;
                    }
                    p172r1.e eVar5 = p172r1.g.this.f53765i1[this.f53780n + i20];
                    if (i19 == 0) {
                        eVar5.j(eVar5.f53640B, this.f53770d, this.f53774h);
                    }
                    if (i20 == 0) {
                        int i21 = p172r1.g.this.f53742L0;
                        float f6 = p172r1.g.this.f53748R0;
                        if (this.f53780n == 0 && p172r1.g.this.f53744N0 != -1) {
                            i21 = p172r1.g.this.f53744N0;
                            f6 = p172r1.g.this.f53750T0;
                        } else if (z10 && p172r1.g.this.f53746P0 != -1) {
                            i21 = p172r1.g.this.f53746P0;
                            f6 = p172r1.g.this.f53752V0;
                        }
                        eVar5.j0(i21);
                        eVar5.i0(f6);
                    }
                    if (i19 == i10 - 1) {
                        eVar5.j(eVar5.f53642D, this.f53772f, this.f53776j);
                    }
                    if (eVar3 != null) {
                        eVar5.f53640B.a(eVar3.f53642D, p172r1.g.this.f53754X0);
                        if (i19 == i12) {
                            eVar5.f53640B.n(this.f53774h);
                        }
                        eVar3.f53642D.a(eVar5.f53640B, 0);
                        if (i19 == i13 + 1) {
                            eVar3.f53642D.n(this.f53776j);
                        }
                    }
                    if (eVar5 != eVar4) {
                        c6 = 3;
                        if (p172r1.g.this.f53757a1 == 3 && eVar.S() && eVar5 != eVar && eVar5.S()) {
                            dVar7 = eVar5.f53644F;
                            dVar8 = eVar.f53644F;
                        } else {
                            int i22 = p172r1.g.this.f53757a1;
                            if (i22 != 0) {
                                if (i22 != 1) {
                                    p172r1.d dVar9 = eVar5.f53641C;
                                    if (z11) {
                                        dVar9.a(this.f53771e, this.f53775i);
                                        eVar5.f53643E.a(this.f53773g, this.f53777k);
                                    } else {
                                        dVar9.a(eVar4.f53641C, 0);
                                    }
                                }
                                dVar7 = eVar5.f53643E;
                                dVar8 = eVar4.f53643E;
                            } else {
                                dVar7 = eVar5.f53641C;
                                dVar8 = eVar4.f53641C;
                            }
                        }
                        dVar7.a(dVar8, 0);
                    } else {
                        c6 = 3;
                    }
                    i19++;
                    eVar3 = eVar5;
                }
                return;
            }
            p172r1.e eVar6 = this.f53768b;
            eVar6.j0(p172r1.g.this.f53742L0);
            int i23 = this.f53774h;
            if (i6 > 0) {
                i23 += p172r1.g.this.f53754X0;
            }
            if (z6) {
                eVar6.f53642D.a(this.f53772f, i23);
                if (z10) {
                    eVar6.f53640B.a(this.f53770d, this.f53776j);
                }
                if (i6 > 0) {
                    dVar = this.f53772f.f53621b.f53640B;
                    dVar2 = eVar6.f53642D;
                    dVar.a(dVar2, 0);
                }
            } else {
                eVar6.f53640B.a(this.f53770d, i23);
                if (z10) {
                    eVar6.f53642D.a(this.f53772f, this.f53776j);
                }
                if (i6 > 0) {
                    dVar = this.f53770d.f53621b.f53642D;
                    dVar2 = eVar6.f53640B;
                    dVar.a(dVar2, 0);
                }
            }
            int i24 = 0;
            while (i24 < i10 && this.f53780n + i24 < p172r1.g.this.f53766j1) {
                p172r1.e eVar7 = p172r1.g.this.f53765i1[this.f53780n + i24];
                if (i24 == 0) {
                    eVar7.j(eVar7.f53641C, this.f53771e, this.f53775i);
                    int i25 = p172r1.g.this.f53743M0;
                    float f10 = p172r1.g.this.f53749S0;
                    if (this.f53780n == 0 && p172r1.g.this.f53745O0 != -1) {
                        i25 = p172r1.g.this.f53745O0;
                        f10 = p172r1.g.this.f53751U0;
                    } else if (z10 && p172r1.g.this.f53747Q0 != -1) {
                        i25 = p172r1.g.this.f53747Q0;
                        f10 = p172r1.g.this.f53753W0;
                    }
                    eVar7.y0(i25);
                    eVar7.x0(f10);
                }
                if (i24 == i10 - 1) {
                    eVar7.j(eVar7.f53643E, this.f53773g, this.f53777k);
                }
                if (eVar3 != null) {
                    eVar7.f53641C.a(eVar3.f53643E, p172r1.g.this.f53755Y0);
                    if (i24 == i12) {
                        eVar7.f53641C.n(this.f53775i);
                    }
                    eVar3.f53643E.a(eVar7.f53641C, 0);
                    if (i24 == i13 + 1) {
                        eVar3.f53643E.n(this.f53777k);
                    }
                }
                if (eVar7 != eVar6) {
                    int i26 = p172r1.g.this.f53756Z0;
                    if (!z6) {
                        if (i26 != 0) {
                            if (i26 != 1) {
                                if (i26 == 2) {
                                    p172r1.d dVar10 = eVar7.f53640B;
                                    if (z11) {
                                        dVar10.a(this.f53770d, this.f53774h);
                                        eVar7.f53642D.a(this.f53772f, this.f53776j);
                                    } else {
                                        dVar10.a(eVar6.f53640B, 0);
                                    }
                                }
                            }
                            dVar3 = eVar7.f53642D;
                            dVar4 = eVar6.f53642D;
                        } else {
                            dVar3 = eVar7.f53640B;
                            dVar4 = eVar6.f53640B;
                        }
                        dVar3.a(dVar4, 0);
                    } else if (i26 == 0) {
                        dVar5 = eVar7.f53642D;
                        dVar6 = eVar6.f53642D;
                        dVar5.a(dVar6, 0);
                    } else if (i26 == 1) {
                        dVar5 = eVar7.f53640B;
                        dVar6 = eVar6.f53640B;
                        dVar5.a(dVar6, 0);
                    } else if (i26 == 2) {
                        eVar7.f53640B.a(eVar6.f53640B, 0);
                        dVar5 = eVar7.f53642D;
                        dVar6 = eVar6.f53642D;
                        dVar5.a(dVar6, 0);
                    }
                }
                i24++;
                eVar3 = eVar7;
            }
        }

        public int e() {
            return this.f53767a == 1 ? this.f53779m - p172r1.g.this.f53755Y0 : this.f53779m;
        }

        public int f() {
            return this.f53767a == 0 ? this.f53778l - p172r1.g.this.f53754X0 : this.f53778l;
        }

        public void g(int i6) {
            p172r1.g gVar;
            r1.e.b bVarY;
            int iP;
            r1.e.b bVarM;
            int iV;
            int i10 = this.f53782p;
            if (i10 == 0) {
                return;
            }
            int i11 = this.f53781o;
            int i12 = i6 / i10;
            for (int i13 = 0; i13 < i11 && this.f53780n + i13 < p172r1.g.this.f53766j1; i13++) {
                p172r1.e eVar = p172r1.g.this.f53765i1[this.f53780n + i13];
                if (this.f53767a == 0) {
                    if (eVar != null && eVar.y() == r1.e.b.MATCH_CONSTRAINT && eVar.f53687l == 0) {
                        gVar = p172r1.g.this;
                        bVarY = r1.e.b.FIXED;
                        bVarM = eVar.M();
                        iV = eVar.v();
                        iP = i12;
                        gVar.T0(eVar, bVarY, iP, bVarM, iV);
                    }
                } else if (eVar != null && eVar.M() == r1.e.b.MATCH_CONSTRAINT && eVar.f53689m == 0) {
                    gVar = p172r1.g.this;
                    bVarY = eVar.y();
                    iP = eVar.P();
                    bVarM = r1.e.b.FIXED;
                    iV = i12;
                    gVar.T0(eVar, bVarY, iP, bVarM, iV);
                }
            }
            h();
        }

        public void i(int i6) {
            this.f53780n = i6;
        }

        public void j(int i6, p172r1.d dVar, p172r1.d dVar2, p172r1.d dVar3, p172r1.d dVar4, int i10, int i11, int i12, int i13, int i14) {
            this.f53767a = i6;
            this.f53770d = dVar;
            this.f53771e = dVar2;
            this.f53772f = dVar3;
            this.f53773g = dVar4;
            this.f53774h = i10;
            this.f53775i = i11;
            this.f53776j = i12;
            this.f53777k = i13;
            this.f53783q = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A1(p172r1.e eVar, int i6) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.M() == r1.e.b.MATCH_CONSTRAINT) {
            int i10 = eVar.f53689m;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (eVar.f53703t * i6);
                if (i11 != eVar.v()) {
                    T0(eVar, eVar.y(), eVar.P(), r1.e.b.FIXED, i11);
                }
                return i11;
            }
            if (i10 == 1) {
                return eVar.v();
            }
            if (i10 == 3) {
                return (int) ((eVar.P() * eVar.f53655Q) + 0.5f);
            }
        }
        return eVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B1(p172r1.e eVar, int i6) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.y() == r1.e.b.MATCH_CONSTRAINT) {
            int i10 = eVar.f53687l;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (eVar.f53697q * i6);
                if (i11 != eVar.P()) {
                    T0(eVar, r1.e.b.FIXED, i11, eVar.M(), eVar.v());
                }
                return i11;
            }
            if (i10 == 1) {
                return eVar.P();
            }
            if (i10 == 3) {
                return (int) ((eVar.v() * eVar.f53655Q) + 0.5f);
            }
        }
        return eVar.P();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0057 A[ADDED_TO_REGION, EDGE_INSN: B:117:0x0057->B:40:0x0057 BREAK  A[LOOP:1: B:42:0x005a->B:122:0x005a], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0057 A[ADDED_TO_REGION, EDGE_INSN: B:120:0x0057->B:40:0x0057 BREAK  A[LOOP:1: B:42:0x005a->B:122:0x005a], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00d1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x005e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0068  */
    /* JADX WARN: Code duplicated, block: B:48:0x0076  */
    /* JADX WARN: Code duplicated, block: B:52:0x007e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0086  */
    /* JADX WARN: Code duplicated, block: B:59:0x008e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0095  */
    /* JADX WARN: Code duplicated, block: B:64:0x0098  */
    /* JADX WARN: Code duplicated, block: B:66:0x009d  */
    /* JADX WARN: Code duplicated, block: B:70:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:87:0x00db  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:97:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x00fa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x010b -> B:40:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x010d -> B:40:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0113 -> B:40:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0115 -> B:40:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:97:0x00f8
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void C1(p172r1.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p172r1.g.C1(r1.e[], int, int, int, int[]):void");
    }

    private void D1(p172r1.e[] eVarArr, int i6, int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        p172r1.d dVar;
        int iQ0;
        p172r1.d dVar2;
        int iO0;
        int i14;
        if (i6 == 0) {
            return;
        }
        this.f53761e1.clear();
        r1.g.a aVar = new r1.g.a(i10, this.f53640B, this.f53641C, this.f53642D, this.f53643E, i11);
        this.f53761e1.add(aVar);
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        if (i10 == 0) {
            while (i17 < i6) {
                p172r1.e eVar = eVarArr[i17];
                int iB1 = B1(eVar, i11);
                if (eVar.y() == r1.e.b.MATCH_CONSTRAINT) {
                    i15++;
                }
                int i18 = i15;
                boolean z6 = (i16 == i11 || (this.f53754X0 + i16) + iB1 > i11) && aVar.f53768b != null;
                if (!z6 && i17 > 0 && (i14 = this.f53759c1) > 0 && i17 % i14 == 0) {
                    z6 = true;
                }
                if (z6) {
                    aVar = new r1.g.a(i10, this.f53640B, this.f53641C, this.f53642D, this.f53643E, i11);
                    aVar.i(i17);
                    this.f53761e1.add(aVar);
                } else {
                    if (i17 > 0) {
                        i16 += this.f53754X0 + iB1;
                    }
                    aVar.b(eVar);
                    i17++;
                    i15 = i18;
                }
                i16 = iB1;
                aVar.b(eVar);
                i17++;
                i15 = i18;
            }
        } else {
            while (i17 < i6) {
                p172r1.e eVar2 = eVarArr[i17];
                int iA1 = A1(eVar2, i11);
                if (eVar2.M() == r1.e.b.MATCH_CONSTRAINT) {
                    i15++;
                }
                int i19 = i15;
                boolean z10 = (i16 == i11 || (this.f53755Y0 + i16) + iA1 > i11) && aVar.f53768b != null;
                if (!z10 && i17 > 0 && (i12 = this.f53759c1) > 0 && i17 % i12 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = new r1.g.a(i10, this.f53640B, this.f53641C, this.f53642D, this.f53643E, i11);
                    aVar.i(i17);
                    this.f53761e1.add(aVar);
                } else {
                    if (i17 > 0) {
                        i16 += this.f53755Y0 + iA1;
                    }
                    aVar.b(eVar2);
                    i17++;
                    i15 = i19;
                }
                i16 = iA1;
                aVar.b(eVar2);
                i17++;
                i15 = i19;
            }
        }
        int size = this.f53761e1.size();
        p172r1.d dVar3 = this.f53640B;
        p172r1.d dVar4 = this.f53641C;
        p172r1.d dVar5 = this.f53642D;
        p172r1.d dVar6 = this.f53643E;
        int iP0 = P0();
        int iR0 = R0();
        int iQ1 = Q0();
        int iO1 = O0();
        r1.e.b bVarY = y();
        r1.e.b bVar = r1.e.b.WRAP_CONTENT;
        boolean z11 = bVarY == bVar || M() == bVar;
        if (i15 > 0 && z11) {
            for (int i20 = 0; i20 < size; i20++) {
                r1.g.a aVar2 = (r1.g.a) this.f53761e1.get(i20);
                aVar2.g(i11 - (i10 == 0 ? aVar2.f() : aVar2.e()));
            }
        }
        int i21 = iR0;
        int i22 = iQ1;
        int iE = 0;
        int iF = 0;
        int i23 = 0;
        int i24 = iP0;
        p172r1.d dVar7 = dVar4;
        p172r1.d dVar8 = dVar3;
        int i25 = iO1;
        while (i23 < size) {
            r1.g.a aVar3 = (r1.g.a) this.f53761e1.get(i23);
            if (i10 == 0) {
                if (i23 < size - 1) {
                    dVar2 = ((r1.g.a) this.f53761e1.get(i23 + 1)).f53768b.f53641C;
                    iO0 = 0;
                } else {
                    dVar2 = this.f53643E;
                    iO0 = O0();
                }
                p172r1.d dVar9 = aVar3.f53768b.f53643E;
                p172r1.d dVar10 = dVar8;
                p172r1.d dVar11 = dVar8;
                int i26 = iE;
                p172r1.d dVar12 = dVar7;
                int i27 = iF;
                p172r1.d dVar13 = dVar5;
                p172r1.d dVar14 = dVar5;
                i13 = i23;
                aVar3.j(i10, dVar10, dVar12, dVar13, dVar2, i24, i21, i22, iO0, i11);
                int iMax = java.lang.Math.max(i27, aVar3.f());
                iE = i26 + aVar3.e();
                if (i13 > 0) {
                    iE += this.f53755Y0;
                }
                dVar8 = dVar11;
                iF = iMax;
                i21 = 0;
                dVar7 = dVar9;
                dVar = dVar14;
                int i28 = iO0;
                dVar6 = dVar2;
                i25 = i28;
            } else {
                p172r1.d dVar15 = dVar8;
                int i29 = iE;
                int i30 = iF;
                i13 = i23;
                if (i13 < size - 1) {
                    dVar = ((r1.g.a) this.f53761e1.get(i13 + 1)).f53768b.f53640B;
                    iQ0 = 0;
                } else {
                    dVar = this.f53642D;
                    iQ0 = Q0();
                }
                p172r1.d dVar16 = aVar3.f53768b.f53642D;
                aVar3.j(i10, dVar15, dVar7, dVar, dVar6, i24, i21, iQ0, i25, i11);
                iF = i30 + aVar3.f();
                int iMax2 = java.lang.Math.max(i29, aVar3.e());
                if (i13 > 0) {
                    iF += this.f53754X0;
                }
                iE = iMax2;
                i24 = 0;
                i22 = iQ0;
                dVar8 = dVar16;
            }
            i23 = i13 + 1;
            dVar5 = dVar;
        }
        iArr[0] = iF;
        iArr[1] = iE;
    }

    private void E1(p172r1.e[] eVarArr, int i6, int i10, int i11, int[] iArr) {
        r1.g.a aVar;
        if (i6 == 0) {
            return;
        }
        if (this.f53761e1.size() == 0) {
            aVar = new r1.g.a(i10, this.f53640B, this.f53641C, this.f53642D, this.f53643E, i11);
            this.f53761e1.add(aVar);
        } else {
            r1.g.a aVar2 = (r1.g.a) this.f53761e1.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i10, this.f53640B, this.f53641C, this.f53642D, this.f53643E, P0(), R0(), Q0(), O0(), i11);
        }
        for (int i12 = 0; i12 < i6; i12++) {
            aVar.b(eVarArr[i12]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    private void z1(boolean z6) {
        p172r1.e eVar;
        if (this.f53764h1 == null || this.f53763g1 == null || this.f53762f1 == null) {
            return;
        }
        for (int i6 = 0; i6 < this.f53766j1; i6++) {
            this.f53765i1[i6].Z();
        }
        int[] iArr = this.f53764h1;
        int i10 = iArr[0];
        int i11 = iArr[1];
        p172r1.e eVar2 = null;
        for (int i12 = 0; i12 < i10; i12++) {
            p172r1.e eVar3 = this.f53763g1[z6 ? (i10 - i12) - 1 : i12];
            if (eVar3 != null && eVar3.O() != 8) {
                if (i12 == 0) {
                    eVar3.j(eVar3.f53640B, this.f53640B, P0());
                    eVar3.j0(this.f53742L0);
                    eVar3.i0(this.f53748R0);
                }
                if (i12 == i10 - 1) {
                    eVar3.j(eVar3.f53642D, this.f53642D, Q0());
                }
                if (i12 > 0) {
                    eVar3.j(eVar3.f53640B, eVar2.f53642D, this.f53754X0);
                    eVar2.j(eVar2.f53642D, eVar3.f53640B, 0);
                }
                eVar2 = eVar3;
            }
        }
        for (int i13 = 0; i13 < i11; i13++) {
            p172r1.e eVar4 = this.f53762f1[i13];
            if (eVar4 != null && eVar4.O() != 8) {
                if (i13 == 0) {
                    eVar4.j(eVar4.f53641C, this.f53641C, R0());
                    eVar4.y0(this.f53743M0);
                    eVar4.x0(this.f53749S0);
                }
                if (i13 == i11 - 1) {
                    eVar4.j(eVar4.f53643E, this.f53643E, O0());
                }
                if (i13 > 0) {
                    eVar4.j(eVar4.f53641C, eVar2.f53643E, this.f53755Y0);
                    eVar2.j(eVar2.f53643E, eVar4.f53641C, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i14 = 0; i14 < i10; i14++) {
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = (i15 * i10) + i14;
                if (this.f53760d1 == 1) {
                    i16 = (i14 * i11) + i15;
                }
                p172r1.e[] eVarArr = this.f53765i1;
                if (i16 < eVarArr.length && (eVar = eVarArr[i16]) != null && eVar.O() != 8) {
                    p172r1.e eVar5 = this.f53763g1[i14];
                    p172r1.e eVar6 = this.f53762f1[i15];
                    if (eVar != eVar5) {
                        eVar.j(eVar.f53640B, eVar5.f53640B, 0);
                        eVar.j(eVar.f53642D, eVar5.f53642D, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.j(eVar.f53641C, eVar6.f53641C, 0);
                        eVar.j(eVar.f53643E, eVar6.f53643E, 0);
                    }
                }
            }
        }
    }

    public void F1(float f6) {
        this.f53750T0 = f6;
    }

    public void G1(int i6) {
        this.f53744N0 = i6;
    }

    public void H1(float f6) {
        this.f53751U0 = f6;
    }

    public void I1(int i6) {
        this.f53745O0 = i6;
    }

    public void J1(int i6) {
        this.f53756Z0 = i6;
    }

    public void K1(float f6) {
        this.f53748R0 = f6;
    }

    public void L1(int i6) {
        this.f53754X0 = i6;
    }

    public void M1(int i6) {
        this.f53742L0 = i6;
    }

    public void N1(float f6) {
        this.f53752V0 = f6;
    }

    public void O1(int i6) {
        this.f53746P0 = i6;
    }

    public void P1(float f6) {
        this.f53753W0 = f6;
    }

    public void Q1(int i6) {
        this.f53747Q0 = i6;
    }

    public void R1(int i6) {
        this.f53759c1 = i6;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    @Override // p172r1.l
    public void S0(int i6, int i10, int i11, int i12) {
        int i13;
        int i14;
        boolean z6;
        if (this.f53793x0 > 0 && !U0()) {
            X0(0, 0);
            W0(false);
            return;
        }
        int iP0 = P0();
        int iQ0 = Q0();
        int iR0 = R0();
        int iO0 = O0();
        int[] iArr = new int[2];
        int i15 = (i10 - iP0) - iQ0;
        int i16 = this.f53760d1;
        if (i16 == 1) {
            i15 = (i12 - iR0) - iO0;
        }
        int i17 = i15;
        if (i16 == 0) {
            if (this.f53742L0 == -1) {
                this.f53742L0 = 0;
            }
            if (this.f53743M0 == -1) {
                this.f53743M0 = 0;
            }
        } else {
            if (this.f53742L0 == -1) {
                this.f53742L0 = 0;
            }
            if (this.f53743M0 == -1) {
                this.f53743M0 = 0;
            }
        }
        p172r1.e[] eVarArr = this.f53792w0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i13 = this.f53793x0;
            if (i18 >= i13) {
                break;
            }
            if (this.f53792w0[i18].O() == 8) {
                i19++;
            }
            i18++;
        }
        if (i19 > 0) {
            eVarArr = new p172r1.e[i13 - i19];
            int i20 = 0;
            for (int i21 = 0; i21 < this.f53793x0; i21++) {
                p172r1.e eVar = this.f53792w0[i21];
                if (eVar.O() != 8) {
                    eVarArr[i20] = eVar;
                    i20++;
                }
            }
            i14 = i20;
        } else {
            i14 = i13;
        }
        this.f53765i1 = eVarArr;
        this.f53766j1 = i14;
        int i22 = this.f53758b1;
        if (i22 == 0) {
            z6 = true;
            E1(eVarArr, i14, this.f53760d1, i17, iArr);
        } else if (i22 == 1) {
            z6 = true;
            D1(eVarArr, i14, this.f53760d1, i17, iArr);
        } else if (i22 != 2) {
            z6 = true;
        } else {
            z6 = true;
            C1(eVarArr, i14, this.f53760d1, i17, iArr);
        }
        int iMin = iArr[0] + iP0 + iQ0;
        int iMin2 = iArr[z6 ? 1 : 0] + iR0 + iO0;
        if (i6 == 1073741824) {
            iMin = i10;
        } else if (i6 == Integer.MIN_VALUE) {
            iMin = java.lang.Math.min(iMin, i10);
        } else if (i6 != 0) {
            iMin = 0;
        }
        if (i11 == 1073741824) {
            iMin2 = i12;
        } else if (i11 == Integer.MIN_VALUE) {
            iMin2 = java.lang.Math.min(iMin2, i12);
        } else if (i11 != 0) {
            iMin2 = 0;
        }
        X0(iMin, iMin2);
        E0(iMin);
        h0(iMin2);
        if (this.f53793x0 <= 0) {
            z6 = false;
        }
        W0(z6);
    }

    public void S1(int i6) {
        this.f53760d1 = i6;
    }

    public void T1(int i6) {
        this.f53757a1 = i6;
    }

    public void U1(float f6) {
        this.f53749S0 = f6;
    }

    public void V1(int i6) {
        this.f53755Y0 = i6;
    }

    public void W1(int i6) {
        this.f53743M0 = i6;
    }

    public void X1(int i6) {
        this.f53758b1 = i6;
    }

    @Override // p172r1.e
    public void f(p162q1.d dVar) {
        super.f(dVar);
        boolean zA1 = G() != null ? ((p172r1.f) G()).a1() : false;
        int i6 = this.f53758b1;
        if (i6 != 0) {
            if (i6 == 1) {
                int size = this.f53761e1.size();
                int i10 = 0;
                while (i10 < size) {
                    ((r1.g.a) this.f53761e1.get(i10)).d(zA1, i10, i10 == size + (-1));
                    i10++;
                }
            } else if (i6 == 2) {
                z1(zA1);
            }
        } else if (this.f53761e1.size() > 0) {
            ((r1.g.a) this.f53761e1.get(0)).d(zA1, 0, true);
        }
        W0(false);
    }
}
