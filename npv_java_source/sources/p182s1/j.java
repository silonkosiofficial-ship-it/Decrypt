package p182s1;

/* JADX INFO: loaded from: classes.dex */
public class j extends p182s1.m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int[] f54087k = new int[2];

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f54088a;

        static {
            int[] iArr = new int[s1.m.b.values().length];
            f54088a = iArr;
            try {
                iArr[s1.m.b.START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f54088a[s1.m.b.END.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f54088a[s1.m.b.CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public j(p172r1.e eVar) {
        super(eVar);
        this.f54107h.f54069e = s1.f.a.LEFT;
        this.f54108i.f54069e = s1.f.a.RIGHT;
        this.f54105f = 0;
    }

    private void q(int[] iArr, int i6, int i10, int i11, int i12, float f6, int i13) {
        int i14 = i10 - i6;
        int i15 = i12 - i11;
        if (i13 != -1) {
            if (i13 == 0) {
                iArr[0] = (int) ((i15 * f6) + 0.5f);
                iArr[1] = i15;
                return;
            } else {
                if (i13 != 1) {
                    return;
                }
                iArr[0] = i14;
                iArr[1] = (int) ((i14 * f6) + 0.5f);
                return;
            }
        }
        int i16 = (int) ((i15 * f6) + 0.5f);
        int i17 = (int) ((i14 / f6) + 0.5f);
        if (i16 <= i14) {
            iArr[0] = i16;
            iArr[1] = i15;
        } else if (i17 <= i15) {
            iArr[0] = i14;
            iArr[1] = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x029a, code lost:
    
        if (r14 != 1) goto L134;
     */
    @Override // p182s1.m, p182s1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(p182s1.d r17) {
        /*
            Method dump skipped, instruction units count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p182s1.j.a(s1.d):void");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0333  */
    /* JADX WARN: Code duplicated, block: B:104:0x0339  */
    /* JADX WARN: Code duplicated, block: B:105:0x0346  */
    /* JADX WARN: Code duplicated, block: B:107:0x034c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0352  */
    /* JADX WARN: Code duplicated, block: B:110:0x036d  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x0245  */
    /* JADX WARN: Code duplicated, block: B:85:0x024d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0265  */
    /* JADX WARN: Code duplicated, block: B:88:0x026e  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:92:0x02bf  */
    @Override // p182s1.m
    void d() {
        p172r1.e eVarG;
        p172r1.e eVar;
        p172r1.d[] dVarArr;
        p172r1.d dVar;
        p172r1.d dVar2;
        p172r1.d dVar3;
        p182s1.f fVarH;
        p182s1.f fVar;
        int iQ;
        p182s1.f fVarH2;
        p182s1.f fVar2;
        p172r1.d dVar4;
        p172r1.e eVar2;
        int i6;
        p172r1.e eVarG2;
        java.util.List list;
        p182s1.d dVar5;
        p182s1.f fVar3;
        p182s1.f fVarH3;
        p182s1.f fVar4;
        int iQ2;
        p182s1.f fVar5;
        p182s1.f fVar6;
        int i10;
        p172r1.e eVarG3;
        p172r1.e eVar3 = this.f54101b;
        if (eVar3.f53665a) {
            this.f54104e.d(eVar3.P());
        }
        if (this.f54104e.f54074j) {
            r1.e.b bVar = this.f54103d;
            r1.e.b bVar2 = r1.e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((eVarG = this.f54101b.G()) != null && eVarG.y() == r1.e.b.FIXED) || eVarG.y() == bVar2)) {
                b(this.f54107h, eVarG.f53673e.f54107h, this.f54101b.f53640B.c());
                b(this.f54108i, eVarG.f53673e.f54108i, -this.f54101b.f53642D.c());
                return;
            }
        } else {
            r1.e.b bVarY = this.f54101b.y();
            this.f54103d = bVarY;
            if (bVarY != r1.e.b.MATCH_CONSTRAINT) {
                r1.e.b bVar3 = r1.e.b.MATCH_PARENT;
                if (bVarY == bVar3 && (((eVarG3 = this.f54101b.G()) != null && eVarG3.y() == r1.e.b.FIXED) || eVarG3.y() == bVar3)) {
                    int iP = (eVarG3.P() - this.f54101b.f53640B.c()) - this.f54101b.f53642D.c();
                    b(this.f54107h, eVarG3.f53673e.f54107h, this.f54101b.f53640B.c());
                    b(this.f54108i, eVarG3.f53673e.f54108i, -this.f54101b.f53642D.c());
                    this.f54104e.d(iP);
                    return;
                }
                if (this.f54103d == r1.e.b.FIXED) {
                    this.f54104e.d(this.f54101b.P());
                }
            }
        }
        p182s1.g gVar = this.f54104e;
        if (!gVar.f54074j) {
            if (this.f54103d == r1.e.b.MATCH_CONSTRAINT) {
                eVar2 = this.f54101b;
                i6 = eVar2.f53687l;
                if (i6 != 2) {
                    eVarG2 = eVar2.G();
                    if (eVarG2 != null) {
                        p182s1.g gVar2 = eVarG2.f53675f.f54104e;
                        this.f54104e.f54076l.add(gVar2);
                        gVar2.f54075k.add(this.f54104e);
                        p182s1.g gVar3 = this.f54104e;
                        gVar3.f54066b = true;
                        gVar3.f54075k.add(this.f54107h);
                        list = this.f54104e.f54075k;
                        dVar5 = this.f54108i;
                        list.add(dVar5);
                    }
                } else if (i6 == 3) {
                    if (eVar2.f53689m == 3) {
                        this.f54107h.f54065a = this;
                        this.f54108i.f54065a = this;
                        p182s1.l lVar = eVar2.f53675f;
                        lVar.f54107h.f54065a = this;
                        lVar.f54108i.f54065a = this;
                        gVar.f54065a = this;
                        if (eVar2.X()) {
                            this.f54104e.f54076l.add(this.f54101b.f53675f.f54104e);
                            this.f54101b.f53675f.f54104e.f54075k.add(this.f54104e);
                            p182s1.l lVar2 = this.f54101b.f53675f;
                            lVar2.f54104e.f54065a = this;
                            this.f54104e.f54076l.add(lVar2.f54107h);
                            this.f54104e.f54076l.add(this.f54101b.f53675f.f54108i);
                            this.f54101b.f53675f.f54107h.f54075k.add(this.f54104e);
                            list = this.f54101b.f53675f.f54108i.f54075k;
                            dVar5 = this.f54104e;
                        } else if (this.f54101b.V()) {
                            this.f54101b.f53675f.f54104e.f54076l.add(this.f54104e);
                            list = this.f54104e.f54075k;
                            dVar5 = this.f54101b.f53675f.f54104e;
                        } else {
                            fVar3 = this.f54101b.f53675f.f54104e;
                        }
                        list.add(dVar5);
                    } else {
                        p182s1.g gVar4 = eVar2.f53675f.f54104e;
                        gVar.f54076l.add(gVar4);
                        gVar4.f54075k.add(this.f54104e);
                        this.f54101b.f53675f.f54107h.f54075k.add(this.f54104e);
                        this.f54101b.f53675f.f54108i.f54075k.add(this.f54104e);
                        p182s1.g gVar5 = this.f54104e;
                        gVar5.f54066b = true;
                        gVar5.f54075k.add(this.f54107h);
                        this.f54104e.f54075k.add(this.f54108i);
                        this.f54107h.f54076l.add(this.f54104e);
                        fVar3 = this.f54108i;
                    }
                    list = fVar3.f54076l;
                    dVar5 = this.f54104e;
                    list.add(dVar5);
                }
            }
            eVar = this.f54101b;
            dVarArr = eVar.f53648J;
            dVar = dVarArr[0];
            dVar2 = dVar.f53623d;
            if (dVar2 != null) {
            }
            if (dVar2 == null) {
                dVar3 = dVarArr[1];
                if (dVar3.f53623d == null) {
                    if (eVar instanceof p172r1.i) {
                        return;
                    } else {
                        return;
                    }
                }
                fVarH2 = h(dVar3);
                if (fVarH2 != null) {
                    b(this.f54108i, fVarH2, -this.f54101b.f53648J[1].c());
                    c(this.f54107h, this.f54108i, -1, this.f54104e);
                    return;
                }
                return;
            }
            fVarH = h(dVar);
            if (fVarH != null) {
                return;
            }
            fVar = this.f54107h;
            iQ = this.f54101b.f53648J[0].c();
            b(fVar, fVarH, iQ);
            c(this.f54108i, this.f54107h, 1, this.f54104e);
            return;
        }
        p172r1.e eVar4 = this.f54101b;
        if (eVar4.f53665a) {
            p172r1.d[] dVarArr2 = eVar4.f53648J;
            p172r1.d dVar6 = dVarArr2[0];
            p172r1.d dVar7 = dVar6.f53623d;
            if (dVar7 == null || dVarArr2[1].f53623d == null) {
                if (dVar7 == null) {
                    p172r1.d dVar8 = dVarArr2[1];
                    if (dVar8.f53623d != null) {
                        p182s1.f fVarH4 = h(dVar8);
                        if (fVarH4 == null) {
                            return;
                        }
                        b(this.f54108i, fVarH4, -this.f54101b.f53648J[1].c());
                        fVar5 = this.f54107h;
                        fVar6 = this.f54108i;
                        i10 = -this.f54104e.f54071g;
                    } else {
                        if ((eVar4 instanceof p172r1.i) || eVar4.G() == null || this.f54101b.m(r1.d.b.CENTER).f53623d != null) {
                            return;
                        }
                        fVarH3 = this.f54101b.G().f53673e.f54107h;
                        fVar4 = this.f54107h;
                        iQ2 = this.f54101b.Q();
                    }
                    b(fVar5, fVar6, i10);
                    return;
                }
                fVarH3 = h(dVar6);
                if (fVarH3 == null) {
                    return;
                }
                fVar4 = this.f54107h;
                iQ2 = this.f54101b.f53648J[0].c();
                b(fVar4, fVarH3, iQ2);
                fVar5 = this.f54108i;
                fVar6 = this.f54107h;
                i10 = this.f54104e.f54071g;
                b(fVar5, fVar6, i10);
                return;
            }
            if (!eVar4.V()) {
                p182s1.f fVarH5 = h(this.f54101b.f53648J[0]);
                if (fVarH5 != null) {
                    b(this.f54107h, fVarH5, this.f54101b.f53648J[0].c());
                }
                p182s1.f fVarH6 = h(this.f54101b.f53648J[1]);
                if (fVarH6 != null) {
                    b(this.f54108i, fVarH6, -this.f54101b.f53648J[1].c());
                }
                this.f54107h.f54066b = true;
                this.f54108i.f54066b = true;
                return;
            }
            this.f54107h.f54070f = this.f54101b.f53648J[0].c();
            fVar2 = this.f54108i;
            dVar4 = this.f54101b.f53648J[1];
        } else {
            if (this.f54103d == r1.e.b.MATCH_CONSTRAINT) {
                eVar2 = this.f54101b;
                i6 = eVar2.f53687l;
                if (i6 != 2) {
                    eVarG2 = eVar2.G();
                    if (eVarG2 != null) {
                        p182s1.g gVar6 = eVarG2.f53675f.f54104e;
                        this.f54104e.f54076l.add(gVar6);
                        gVar6.f54075k.add(this.f54104e);
                        p182s1.g gVar7 = this.f54104e;
                        gVar7.f54066b = true;
                        gVar7.f54075k.add(this.f54107h);
                        list = this.f54104e.f54075k;
                        dVar5 = this.f54108i;
                        list.add(dVar5);
                    }
                } else if (i6 == 3) {
                    if (eVar2.f53689m == 3) {
                        this.f54107h.f54065a = this;
                        this.f54108i.f54065a = this;
                        p182s1.l lVar3 = eVar2.f53675f;
                        lVar3.f54107h.f54065a = this;
                        lVar3.f54108i.f54065a = this;
                        gVar.f54065a = this;
                        if (eVar2.X()) {
                            this.f54104e.f54076l.add(this.f54101b.f53675f.f54104e);
                            this.f54101b.f53675f.f54104e.f54075k.add(this.f54104e);
                            p182s1.l lVar4 = this.f54101b.f53675f;
                            lVar4.f54104e.f54065a = this;
                            this.f54104e.f54076l.add(lVar4.f54107h);
                            this.f54104e.f54076l.add(this.f54101b.f53675f.f54108i);
                            this.f54101b.f53675f.f54107h.f54075k.add(this.f54104e);
                            list = this.f54101b.f53675f.f54108i.f54075k;
                            dVar5 = this.f54104e;
                        } else if (this.f54101b.V()) {
                            this.f54101b.f53675f.f54104e.f54076l.add(this.f54104e);
                            list = this.f54104e.f54075k;
                            dVar5 = this.f54101b.f53675f.f54104e;
                        } else {
                            fVar3 = this.f54101b.f53675f.f54104e;
                        }
                        list.add(dVar5);
                    } else {
                        p182s1.g gVar8 = eVar2.f53675f.f54104e;
                        gVar.f54076l.add(gVar8);
                        gVar8.f54075k.add(this.f54104e);
                        this.f54101b.f53675f.f54107h.f54075k.add(this.f54104e);
                        this.f54101b.f53675f.f54108i.f54075k.add(this.f54104e);
                        p182s1.g gVar9 = this.f54104e;
                        gVar9.f54066b = true;
                        gVar9.f54075k.add(this.f54107h);
                        this.f54104e.f54075k.add(this.f54108i);
                        this.f54107h.f54076l.add(this.f54104e);
                        fVar3 = this.f54108i;
                    }
                    list = fVar3.f54076l;
                    dVar5 = this.f54104e;
                    list.add(dVar5);
                }
            }
            eVar = this.f54101b;
            dVarArr = eVar.f53648J;
            dVar = dVarArr[0];
            dVar2 = dVar.f53623d;
            if (dVar2 != null || dVarArr[1].f53623d == null) {
                if (dVar2 == null) {
                    fVarH = h(dVar);
                    if (fVarH != null) {
                        return;
                    }
                    fVar = this.f54107h;
                    iQ = this.f54101b.f53648J[0].c();
                } else {
                    dVar3 = dVarArr[1];
                    if (dVar3.f53623d == null) {
                        fVarH2 = h(dVar3);
                        if (fVarH2 != null) {
                            b(this.f54108i, fVarH2, -this.f54101b.f53648J[1].c());
                            c(this.f54107h, this.f54108i, -1, this.f54104e);
                            return;
                        }
                        return;
                    }
                    if ((eVar instanceof p172r1.i) || eVar.G() == null) {
                        return;
                    }
                    fVarH = this.f54101b.G().f53673e.f54107h;
                    fVar = this.f54107h;
                    iQ = this.f54101b.Q();
                }
                b(fVar, fVarH, iQ);
                c(this.f54108i, this.f54107h, 1, this.f54104e);
                return;
            }
            if (!eVar.V()) {
                p182s1.f fVarH7 = h(this.f54101b.f53648J[0]);
                p182s1.f fVarH8 = h(this.f54101b.f53648J[1]);
                fVarH7.b(this);
                fVarH8.b(this);
                this.f54109j = s1.m.b.CENTER;
                return;
            }
            this.f54107h.f54070f = this.f54101b.f53648J[0].c();
            fVar2 = this.f54108i;
            dVar4 = this.f54101b.f53648J[1];
        }
        fVar2.f54070f = -dVar4.c();
    }

    @Override // p182s1.m
    public void e() {
        p182s1.f fVar = this.f54107h;
        if (fVar.f54074j) {
            this.f54101b.F0(fVar.f54071g);
        }
    }

    @Override // p182s1.m
    void f() {
        this.f54102c = null;
        this.f54107h.c();
        this.f54108i.c();
        this.f54104e.c();
        this.f54106g = false;
    }

    @Override // p182s1.m
    boolean m() {
        return this.f54103d != r1.e.b.MATCH_CONSTRAINT || this.f54101b.f53687l == 0;
    }

    void r() {
        this.f54106g = false;
        this.f54107h.c();
        this.f54107h.f54074j = false;
        this.f54108i.c();
        this.f54108i.f54074j = false;
        this.f54104e.f54074j = false;
    }

    public java.lang.String toString() {
        return "HorizontalRun " + this.f54101b.r();
    }
}
