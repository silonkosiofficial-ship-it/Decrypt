package p132n1;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p132n1.p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n1.l.a f51398k = new n1.l.a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f51399l = new int[2];

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51400a;

        static {
            int[] iArr = new int[n1.p.a.values().length];
            try {
                iArr[n1.p.a.START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[n1.p.a.END.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[n1.p.a.CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f51400a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p122m1.e eVar) {
        super(eVar);
        p247y7.AbstractC7350t.f(eVar, "widget");
        q().p(n1.f.a.LEFT);
        g().p(n1.f.a.RIGHT);
        C(0);
    }

    private final void H(int[] iArr, int i6, int i10, int i11, int i12, float f6, int i13) {
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

    @Override // p132n1.p
    public boolean D() {
        if (super.j() != m1.e.b.MATCH_CONSTRAINT) {
            return true;
        }
        p122m1.e eVarN = super.n();
        p247y7.AbstractC7350t.c(eVarN);
        return eVarN.Q() == 0;
    }

    public void I() {
        x(false);
        q().c();
        q().r(false);
        g().c();
        g().r(false);
        i().r(false);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x044b, code lost:
    
        if (r14 != 1) goto L135;
     */
    @Override // p132n1.p, p132n1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(p132n1.d r18) {
        /*
            Method dump skipped, instruction units count: 1722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p132n1.l.a(n1.d):void");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:101:0x0617  */
    /* JADX WARN: Code duplicated, block: B:103:0x063b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0640  */
    /* JADX WARN: Code duplicated, block: B:109:0x065d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0670  */
    /* JADX WARN: Code duplicated, block: B:114:0x0699  */
    /* JADX WARN: Code duplicated, block: B:116:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:118:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:119:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:121:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:123:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0335  */
    /* JADX WARN: Code duplicated, block: B:72:0x033d  */
    /* JADX WARN: Code duplicated, block: B:74:0x034b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0350  */
    /* JADX WARN: Code duplicated, block: B:79:0x035d  */
    /* JADX WARN: Code duplicated, block: B:81:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:84:0x046e  */
    /* JADX WARN: Code duplicated, block: B:86:0x047b  */
    /* JADX WARN: Code duplicated, block: B:87:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:89:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:90:0x0566  */
    /* JADX WARN: Code duplicated, block: B:93:0x0574  */
    /* JADX WARN: Code duplicated, block: B:96:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:98:0x05df  */
    @Override // p132n1.p
    public void d() {
        p122m1.e eVarN;
        p122m1.e eVarN2;
        p122m1.e eVarN3;
        p122m1.e eVarN4;
        p132n1.f fVarR;
        p132n1.f fVarQ;
        p132n1.f fVarG;
        p132n1.f fVarR2;
        p122m1.e eVarN5;
        p122m1.e eVarN6;
        p132n1.f fVarR3;
        p132n1.f fVarR4;
        p132n1.f fVarG2;
        p122m1.d dVar;
        int iQ;
        p122m1.e eVarO0;
        java.util.ArrayList arrayListD;
        p132n1.f fVarG3;
        p122m1.e eVarN7;
        p132n1.f fVarG4;
        p122m1.e eVarN8;
        p122m1.e eVarN9;
        p132n1.f fVarQ2;
        p132n1.f fVarG5;
        int iJ;
        p122m1.e eVarN10 = n();
        p247y7.AbstractC7350t.c(eVarN10);
        if (eVarN10.k0()) {
            p132n1.g gVarI = i();
            p122m1.e eVarN11 = n();
            p247y7.AbstractC7350t.c(eVarN11);
            gVarI.k(eVarN11.B0());
        }
        if (i().i()) {
            m1.e.b bVarJ = j();
            m1.e.b bVar = m1.e.b.MATCH_PARENT;
            if (bVarJ == bVar) {
                p122m1.e eVarN12 = n();
                p247y7.AbstractC7350t.c(eVarN12);
                p122m1.e eVarO1 = eVarN12.o0();
                if (eVarO1 != null && (eVarO1.A() == m1.e.b.FIXED || eVarO1.A() == bVar)) {
                    p132n1.f fVarQ3 = q();
                    p132n1.l lVarK = eVarO1.K();
                    p247y7.AbstractC7350t.c(lVarK);
                    p132n1.f fVarQ4 = lVarK.q();
                    p122m1.e eVarN13 = n();
                    p247y7.AbstractC7350t.c(eVarN13);
                    b(fVarQ3, fVarQ4, eVarN13.L().k());
                    p132n1.f fVarG6 = g();
                    p132n1.l lVarK2 = eVarO1.K();
                    p247y7.AbstractC7350t.c(lVarK2);
                    p132n1.f fVarG7 = lVarK2.g();
                    p122m1.e eVarN14 = n();
                    p247y7.AbstractC7350t.c(eVarN14);
                    b(fVarG6, fVarG7, -eVarN14.b0().k());
                    return;
                }
            }
        } else {
            p122m1.e eVarN15 = n();
            p247y7.AbstractC7350t.c(eVarN15);
            super.w(eVarN15.A());
            if (super.j() != m1.e.b.MATCH_CONSTRAINT) {
                m1.e.b bVarJ2 = j();
                m1.e.b bVar2 = m1.e.b.MATCH_PARENT;
                if (bVarJ2 == bVar2) {
                    p122m1.e eVarN16 = n();
                    p247y7.AbstractC7350t.c(eVarN16);
                    p122m1.e eVarO2 = eVarN16.o0();
                    if (eVarO2 != null && (eVarO2.A() == m1.e.b.FIXED || eVarO2.A() == bVar2)) {
                        int iB0 = eVarO2.B0();
                        p122m1.e eVarN17 = n();
                        p247y7.AbstractC7350t.c(eVarN17);
                        int iK = iB0 - eVarN17.L().k();
                        p122m1.e eVarN18 = n();
                        p247y7.AbstractC7350t.c(eVarN18);
                        int iK2 = iK - eVarN18.b0().k();
                        p132n1.f fVarQ5 = q();
                        p132n1.l lVarK3 = eVarO2.K();
                        p247y7.AbstractC7350t.c(lVarK3);
                        p132n1.f fVarQ6 = lVarK3.q();
                        p122m1.e eVarN19 = n();
                        p247y7.AbstractC7350t.c(eVarN19);
                        b(fVarQ5, fVarQ6, eVarN19.L().k());
                        p132n1.f fVarG8 = g();
                        p132n1.l lVarK4 = eVarO2.K();
                        p247y7.AbstractC7350t.c(lVarK4);
                        p132n1.f fVarG9 = lVarK4.g();
                        p122m1.e eVarN20 = n();
                        p247y7.AbstractC7350t.c(eVarN20);
                        b(fVarG8, fVarG9, -eVarN20.b0().k());
                        i().k(iK2);
                        return;
                    }
                }
                if (j() == m1.e.b.FIXED) {
                    p132n1.g gVarI2 = i();
                    p122m1.e eVarN21 = n();
                    p247y7.AbstractC7350t.c(eVarN21);
                    gVarI2.k(eVarN21.B0());
                }
            }
        }
        int i6 = 1;
        if (!i().i()) {
            if (j() == m1.e.b.MATCH_CONSTRAINT) {
                p122m1.e eVarN22 = n();
                p247y7.AbstractC7350t.c(eVarN22);
                iQ = eVarN22.Q();
                if (iQ != 2) {
                    p122m1.e eVarN23 = n();
                    p247y7.AbstractC7350t.c(eVarN23);
                    eVarO0 = eVarN23.o0();
                    if (eVarO0 != null) {
                        p132n1.n nVarE0 = eVarO0.e0();
                        p247y7.AbstractC7350t.c(nVarE0);
                        p132n1.g gVarI3 = nVarE0.i();
                        i().g().add(gVarI3);
                        gVarI3.d().add(i());
                        i().l(true);
                        i().d().add(q());
                        arrayListD = i().d();
                        fVarG3 = g();
                        arrayListD.add(fVarG3);
                    }
                } else if (iQ == 3) {
                    eVarN7 = n();
                    p247y7.AbstractC7350t.c(eVarN7);
                    if (eVarN7.P() == 3) {
                        q().s(this);
                        g().s(this);
                        p122m1.e eVarN24 = n();
                        p247y7.AbstractC7350t.c(eVarN24);
                        p132n1.n nVarE1 = eVarN24.e0();
                        p247y7.AbstractC7350t.c(nVarE1);
                        nVarE1.q().s(this);
                        p122m1.e eVarN25 = n();
                        p247y7.AbstractC7350t.c(eVarN25);
                        p132n1.n nVarE2 = eVarN25.e0();
                        p247y7.AbstractC7350t.c(nVarE2);
                        nVarE2.g().s(this);
                        i().s(this);
                        eVarN8 = n();
                        p247y7.AbstractC7350t.c(eVarN8);
                        if (eVarN8.N0()) {
                            java.util.ArrayList arrayListG = i().g();
                            p122m1.e eVarN26 = n();
                            p247y7.AbstractC7350t.c(eVarN26);
                            p132n1.n nVarE3 = eVarN26.e0();
                            p247y7.AbstractC7350t.c(nVarE3);
                            arrayListG.add(nVarE3.i());
                            p122m1.e eVarN27 = n();
                            p247y7.AbstractC7350t.c(eVarN27);
                            p132n1.n nVarE4 = eVarN27.e0();
                            p247y7.AbstractC7350t.c(nVarE4);
                            nVarE4.i().d().add(i());
                            p122m1.e eVarN28 = n();
                            p247y7.AbstractC7350t.c(eVarN28);
                            p132n1.n nVarE5 = eVarN28.e0();
                            p247y7.AbstractC7350t.c(nVarE5);
                            nVarE5.i().s(this);
                            java.util.ArrayList arrayListG2 = i().g();
                            p122m1.e eVarN29 = n();
                            p247y7.AbstractC7350t.c(eVarN29);
                            p132n1.n nVarE6 = eVarN29.e0();
                            p247y7.AbstractC7350t.c(nVarE6);
                            arrayListG2.add(nVarE6.q());
                            java.util.ArrayList arrayListG3 = i().g();
                            p122m1.e eVarN30 = n();
                            p247y7.AbstractC7350t.c(eVarN30);
                            p132n1.n nVarE7 = eVarN30.e0();
                            p247y7.AbstractC7350t.c(nVarE7);
                            arrayListG3.add(nVarE7.g());
                            p122m1.e eVarN31 = n();
                            p247y7.AbstractC7350t.c(eVarN31);
                            p132n1.n nVarE8 = eVarN31.e0();
                            p247y7.AbstractC7350t.c(nVarE8);
                            nVarE8.q().d().add(i());
                            p122m1.e eVarN32 = n();
                            p247y7.AbstractC7350t.c(eVarN32);
                            p132n1.n nVarE9 = eVarN32.e0();
                            p247y7.AbstractC7350t.c(nVarE9);
                            arrayListD = nVarE9.g().d();
                            fVarG3 = i();
                        } else {
                            eVarN9 = n();
                            p247y7.AbstractC7350t.c(eVarN9);
                            if (eVarN9.M0()) {
                                p122m1.e eVarN33 = n();
                                p247y7.AbstractC7350t.c(eVarN33);
                                p132n1.n nVarE10 = eVarN33.e0();
                                p247y7.AbstractC7350t.c(nVarE10);
                                nVarE10.i().g().add(i());
                                arrayListD = i().d();
                                p122m1.e eVarN34 = n();
                                p247y7.AbstractC7350t.c(eVarN34);
                                p132n1.n nVarE11 = eVarN34.e0();
                                p247y7.AbstractC7350t.c(nVarE11);
                                fVarG3 = nVarE11.i();
                            } else {
                                p122m1.e eVarN35 = n();
                                p247y7.AbstractC7350t.c(eVarN35);
                                p132n1.n nVarE12 = eVarN35.e0();
                                p247y7.AbstractC7350t.c(nVarE12);
                                fVarG4 = nVarE12.i();
                            }
                        }
                        arrayListD.add(fVarG3);
                    } else {
                        p122m1.e eVarN36 = n();
                        p247y7.AbstractC7350t.c(eVarN36);
                        p132n1.n nVarE13 = eVarN36.e0();
                        p247y7.AbstractC7350t.c(nVarE13);
                        p132n1.g gVarI4 = nVarE13.i();
                        i().g().add(gVarI4);
                        gVarI4.d().add(i());
                        p122m1.e eVarN37 = n();
                        p247y7.AbstractC7350t.c(eVarN37);
                        p132n1.n nVarE14 = eVarN37.e0();
                        p247y7.AbstractC7350t.c(nVarE14);
                        nVarE14.q().d().add(i());
                        p122m1.e eVarN38 = n();
                        p247y7.AbstractC7350t.c(eVarN38);
                        p132n1.n nVarE15 = eVarN38.e0();
                        p247y7.AbstractC7350t.c(nVarE15);
                        nVarE15.g().d().add(i());
                        i().l(true);
                        i().d().add(q());
                        i().d().add(g());
                        q().g().add(i());
                        fVarG4 = g();
                    }
                    arrayListD = fVarG4.g();
                    fVarG3 = i();
                    arrayListD.add(fVarG3);
                }
            }
            eVarN = n();
            p247y7.AbstractC7350t.c(eVarN);
            if (eVarN.M()[0].i() != null) {
                eVarN5 = n();
                p247y7.AbstractC7350t.c(eVarN5);
                if (eVarN5.M()[1].i() != null) {
                    eVarN6 = n();
                    p247y7.AbstractC7350t.c(eVarN6);
                    if (eVarN6.M0()) {
                        p122m1.e eVarN39 = n();
                        p247y7.AbstractC7350t.c(eVarN39);
                        fVarR3 = r(eVarN39.M()[0]);
                        p122m1.e eVarN40 = n();
                        p247y7.AbstractC7350t.c(eVarN40);
                        fVarR4 = r(eVarN40.M()[1]);
                        if (fVarR3 != null) {
                            fVarR3.b(this);
                        }
                        if (fVarR4 != null) {
                            fVarR4.b(this);
                        }
                        z(n1.p.a.CENTER);
                        return;
                    }
                    p132n1.f fVarQ7 = q();
                    p122m1.e eVarN41 = n();
                    p247y7.AbstractC7350t.c(eVarN41);
                    fVarQ7.m(eVarN41.M()[0].k());
                    fVarG2 = g();
                    p122m1.e eVarN42 = n();
                    p247y7.AbstractC7350t.c(eVarN42);
                    dVar = eVarN42.M()[1];
                }
            }
            eVarN2 = n();
            p247y7.AbstractC7350t.c(eVarN2);
            if (eVarN2.M()[0].i() != null) {
                eVarN3 = n();
                p247y7.AbstractC7350t.c(eVarN3);
                if (eVarN3.M()[1].i() != null) {
                    p122m1.e eVarN43 = n();
                    p247y7.AbstractC7350t.c(eVarN43);
                    fVarR = r(eVarN43.M()[1]);
                    if (fVarR != null) {
                        return;
                    }
                    p132n1.f fVarG10 = g();
                    p122m1.e eVarN44 = n();
                    p247y7.AbstractC7350t.c(eVarN44);
                    b(fVarG10, fVarR, -eVarN44.M()[1].k());
                    fVarQ = q();
                    fVarG = g();
                    i6 = -1;
                } else {
                    if (!(n() instanceof p122m1.i)) {
                        return;
                    }
                    eVarN4 = n();
                    p247y7.AbstractC7350t.c(eVarN4);
                    if (eVarN4.o0() != null) {
                        return;
                    }
                    p122m1.e eVarN45 = n();
                    p247y7.AbstractC7350t.c(eVarN45);
                    p122m1.e eVarO3 = eVarN45.o0();
                    p247y7.AbstractC7350t.c(eVarO3);
                    p132n1.l lVarK5 = eVarO3.K();
                    p247y7.AbstractC7350t.c(lVarK5);
                    p132n1.f fVarQ8 = lVarK5.q();
                    p132n1.f fVarQ9 = q();
                    p122m1.e eVarN46 = n();
                    p247y7.AbstractC7350t.c(eVarN46);
                    b(fVarQ9, fVarQ8, eVarN46.C0());
                }
                c(fVarQ, fVarG, i6, i());
                return;
            }
            p122m1.e eVarN47 = n();
            p247y7.AbstractC7350t.c(eVarN47);
            fVarR2 = r(eVarN47.M()[0]);
            if (fVarR2 != null) {
                return;
            }
            p132n1.f fVarQ10 = q();
            p122m1.e eVarN48 = n();
            p247y7.AbstractC7350t.c(eVarN48);
            b(fVarQ10, fVarR2, eVarN48.M()[0].k());
            fVarQ = g();
            fVarG = q();
            c(fVarQ, fVarG, i6, i());
            return;
        }
        p122m1.e eVarN49 = n();
        p247y7.AbstractC7350t.c(eVarN49);
        if (eVarN49.k0()) {
            p122m1.e eVarN50 = n();
            p247y7.AbstractC7350t.c(eVarN50);
            if (eVarN50.M()[0].i() != null) {
                p122m1.e eVarN51 = n();
                p247y7.AbstractC7350t.c(eVarN51);
                if (eVarN51.M()[1].i() != null) {
                    p122m1.e eVarN52 = n();
                    p247y7.AbstractC7350t.c(eVarN52);
                    if (!eVarN52.M0()) {
                        p122m1.e eVarN53 = n();
                        p247y7.AbstractC7350t.c(eVarN53);
                        p132n1.f fVarR5 = r(eVarN53.M()[0]);
                        if (fVarR5 != null) {
                            p132n1.f fVarQ11 = q();
                            p122m1.e eVarN54 = n();
                            p247y7.AbstractC7350t.c(eVarN54);
                            b(fVarQ11, fVarR5, eVarN54.M()[0].k());
                        }
                        p122m1.e eVarN55 = n();
                        p247y7.AbstractC7350t.c(eVarN55);
                        p132n1.f fVarR6 = r(eVarN55.M()[1]);
                        if (fVarR6 != null) {
                            p132n1.f fVarG11 = g();
                            p122m1.e eVarN56 = n();
                            p247y7.AbstractC7350t.c(eVarN56);
                            b(fVarG11, fVarR6, -eVarN56.M()[1].k());
                        }
                        q().l(true);
                        g().l(true);
                        return;
                    }
                    p132n1.f fVarQ12 = q();
                    p122m1.e eVarN57 = n();
                    p247y7.AbstractC7350t.c(eVarN57);
                    fVarQ12.m(eVarN57.M()[0].k());
                    fVarG2 = g();
                    p122m1.e eVarN58 = n();
                    p247y7.AbstractC7350t.c(eVarN58);
                    dVar = eVarN58.M()[1];
                }
            }
            p122m1.e eVarN59 = n();
            p247y7.AbstractC7350t.c(eVarN59);
            if (eVarN59.M()[0].i() == null) {
                p122m1.e eVarN60 = n();
                p247y7.AbstractC7350t.c(eVarN60);
                if (eVarN60.M()[1].i() != null) {
                    p122m1.e eVarN61 = n();
                    p247y7.AbstractC7350t.c(eVarN61);
                    p132n1.f fVarR7 = r(eVarN61.M()[1]);
                    if (fVarR7 == null) {
                        return;
                    }
                    p132n1.f fVarG12 = g();
                    p122m1.e eVarN62 = n();
                    p247y7.AbstractC7350t.c(eVarN62);
                    b(fVarG12, fVarR7, -eVarN62.M()[1].k());
                    fVarQ2 = q();
                    fVarG5 = g();
                    iJ = -i().j();
                } else {
                    if (n() instanceof p122m1.i) {
                        return;
                    }
                    p122m1.e eVarN63 = n();
                    p247y7.AbstractC7350t.c(eVarN63);
                    if (eVarN63.o0() == null) {
                        return;
                    }
                    p122m1.e eVarN64 = n();
                    p247y7.AbstractC7350t.c(eVarN64);
                    p122m1.d dVarL = eVarN64.l(m1.d.b.CENTER);
                    p247y7.AbstractC7350t.c(dVarL);
                    if (dVarL.i() != null) {
                        return;
                    }
                    p122m1.e eVarN65 = n();
                    p247y7.AbstractC7350t.c(eVarN65);
                    p122m1.e eVarO4 = eVarN65.o0();
                    p247y7.AbstractC7350t.c(eVarO4);
                    p132n1.l lVarK6 = eVarO4.K();
                    p247y7.AbstractC7350t.c(lVarK6);
                    p132n1.f fVarQ13 = lVarK6.q();
                    p132n1.f fVarQ14 = q();
                    p122m1.e eVarN66 = n();
                    p247y7.AbstractC7350t.c(eVarN66);
                    b(fVarQ14, fVarQ13, eVarN66.C0());
                }
                b(fVarQ2, fVarG5, iJ);
                return;
            }
            p122m1.e eVarN67 = n();
            p247y7.AbstractC7350t.c(eVarN67);
            p132n1.f fVarR8 = r(eVarN67.M()[0]);
            if (fVarR8 == null) {
                return;
            }
            p132n1.f fVarQ15 = q();
            p122m1.e eVarN68 = n();
            p247y7.AbstractC7350t.c(eVarN68);
            b(fVarQ15, fVarR8, eVarN68.M()[0].k());
            fVarQ2 = g();
            fVarG5 = q();
            iJ = i().j();
            b(fVarQ2, fVarG5, iJ);
            return;
        }
        if (j() == m1.e.b.MATCH_CONSTRAINT) {
            p122m1.e eVarN210 = n();
            p247y7.AbstractC7350t.c(eVarN210);
            iQ = eVarN210.Q();
            if (iQ != 2) {
                p122m1.e eVarN211 = n();
                p247y7.AbstractC7350t.c(eVarN211);
                eVarO0 = eVarN211.o0();
                if (eVarO0 != null) {
                    p132n1.n nVarE16 = eVarO0.e0();
                    p247y7.AbstractC7350t.c(nVarE16);
                    p132n1.g gVarI5 = nVarE16.i();
                    i().g().add(gVarI5);
                    gVarI5.d().add(i());
                    i().l(true);
                    i().d().add(q());
                    arrayListD = i().d();
                    fVarG3 = g();
                    arrayListD.add(fVarG3);
                }
            } else if (iQ == 3) {
                eVarN7 = n();
                p247y7.AbstractC7350t.c(eVarN7);
                if (eVarN7.P() == 3) {
                    q().s(this);
                    g().s(this);
                    p122m1.e eVarN212 = n();
                    p247y7.AbstractC7350t.c(eVarN212);
                    p132n1.n nVarE17 = eVarN212.e0();
                    p247y7.AbstractC7350t.c(nVarE17);
                    nVarE17.q().s(this);
                    p122m1.e eVarN213 = n();
                    p247y7.AbstractC7350t.c(eVarN213);
                    p132n1.n nVarE18 = eVarN213.e0();
                    p247y7.AbstractC7350t.c(nVarE18);
                    nVarE18.g().s(this);
                    i().s(this);
                    eVarN8 = n();
                    p247y7.AbstractC7350t.c(eVarN8);
                    if (eVarN8.N0()) {
                        java.util.ArrayList arrayListG4 = i().g();
                        p122m1.e eVarN214 = n();
                        p247y7.AbstractC7350t.c(eVarN214);
                        p132n1.n nVarE19 = eVarN214.e0();
                        p247y7.AbstractC7350t.c(nVarE19);
                        arrayListG4.add(nVarE19.i());
                        p122m1.e eVarN215 = n();
                        p247y7.AbstractC7350t.c(eVarN215);
                        p132n1.n nVarE20 = eVarN215.e0();
                        p247y7.AbstractC7350t.c(nVarE20);
                        nVarE20.i().d().add(i());
                        p122m1.e eVarN216 = n();
                        p247y7.AbstractC7350t.c(eVarN216);
                        p132n1.n nVarE21 = eVarN216.e0();
                        p247y7.AbstractC7350t.c(nVarE21);
                        nVarE21.i().s(this);
                        java.util.ArrayList arrayListG5 = i().g();
                        p122m1.e eVarN217 = n();
                        p247y7.AbstractC7350t.c(eVarN217);
                        p132n1.n nVarE22 = eVarN217.e0();
                        p247y7.AbstractC7350t.c(nVarE22);
                        arrayListG5.add(nVarE22.q());
                        java.util.ArrayList arrayListG6 = i().g();
                        p122m1.e eVarN310 = n();
                        p247y7.AbstractC7350t.c(eVarN310);
                        p132n1.n nVarE23 = eVarN310.e0();
                        p247y7.AbstractC7350t.c(nVarE23);
                        arrayListG6.add(nVarE23.g());
                        p122m1.e eVarN311 = n();
                        p247y7.AbstractC7350t.c(eVarN311);
                        p132n1.n nVarE24 = eVarN311.e0();
                        p247y7.AbstractC7350t.c(nVarE24);
                        nVarE24.q().d().add(i());
                        p122m1.e eVarN312 = n();
                        p247y7.AbstractC7350t.c(eVarN312);
                        p132n1.n nVarE25 = eVarN312.e0();
                        p247y7.AbstractC7350t.c(nVarE25);
                        arrayListD = nVarE25.g().d();
                        fVarG3 = i();
                    } else {
                        eVarN9 = n();
                        p247y7.AbstractC7350t.c(eVarN9);
                        if (eVarN9.M0()) {
                            p122m1.e eVarN313 = n();
                            p247y7.AbstractC7350t.c(eVarN313);
                            p132n1.n nVarE110 = eVarN313.e0();
                            p247y7.AbstractC7350t.c(nVarE110);
                            nVarE110.i().g().add(i());
                            arrayListD = i().d();
                            p122m1.e eVarN314 = n();
                            p247y7.AbstractC7350t.c(eVarN314);
                            p132n1.n nVarE111 = eVarN314.e0();
                            p247y7.AbstractC7350t.c(nVarE111);
                            fVarG3 = nVarE111.i();
                        } else {
                            p122m1.e eVarN315 = n();
                            p247y7.AbstractC7350t.c(eVarN315);
                            p132n1.n nVarE112 = eVarN315.e0();
                            p247y7.AbstractC7350t.c(nVarE112);
                            fVarG4 = nVarE112.i();
                        }
                    }
                    arrayListD.add(fVarG3);
                } else {
                    p122m1.e eVarN316 = n();
                    p247y7.AbstractC7350t.c(eVarN316);
                    p132n1.n nVarE113 = eVarN316.e0();
                    p247y7.AbstractC7350t.c(nVarE113);
                    p132n1.g gVarI6 = nVarE113.i();
                    i().g().add(gVarI6);
                    gVarI6.d().add(i());
                    p122m1.e eVarN317 = n();
                    p247y7.AbstractC7350t.c(eVarN317);
                    p132n1.n nVarE114 = eVarN317.e0();
                    p247y7.AbstractC7350t.c(nVarE114);
                    nVarE114.q().d().add(i());
                    p122m1.e eVarN318 = n();
                    p247y7.AbstractC7350t.c(eVarN318);
                    p132n1.n nVarE115 = eVarN318.e0();
                    p247y7.AbstractC7350t.c(nVarE115);
                    nVarE115.g().d().add(i());
                    i().l(true);
                    i().d().add(q());
                    i().d().add(g());
                    q().g().add(i());
                    fVarG4 = g();
                }
                arrayListD = fVarG4.g();
                fVarG3 = i();
                arrayListD.add(fVarG3);
            }
        }
        eVarN = n();
        p247y7.AbstractC7350t.c(eVarN);
        if (eVarN.M()[0].i() != null) {
            eVarN5 = n();
            p247y7.AbstractC7350t.c(eVarN5);
            if (eVarN5.M()[1].i() != null) {
                eVarN6 = n();
                p247y7.AbstractC7350t.c(eVarN6);
                if (eVarN6.M0()) {
                    p122m1.e eVarN319 = n();
                    p247y7.AbstractC7350t.c(eVarN319);
                    fVarR3 = r(eVarN319.M()[0]);
                    p122m1.e eVarN410 = n();
                    p247y7.AbstractC7350t.c(eVarN410);
                    fVarR4 = r(eVarN410.M()[1]);
                    if (fVarR3 != null) {
                        fVarR3.b(this);
                    }
                    if (fVarR4 != null) {
                        fVarR4.b(this);
                    }
                    z(n1.p.a.CENTER);
                    return;
                }
                p132n1.f fVarQ16 = q();
                p122m1.e eVarN411 = n();
                p247y7.AbstractC7350t.c(eVarN411);
                fVarQ16.m(eVarN411.M()[0].k());
                fVarG2 = g();
                p122m1.e eVarN412 = n();
                p247y7.AbstractC7350t.c(eVarN412);
                dVar = eVarN412.M()[1];
            }
        }
        eVarN2 = n();
        p247y7.AbstractC7350t.c(eVarN2);
        if (eVarN2.M()[0].i() != null) {
            eVarN3 = n();
            p247y7.AbstractC7350t.c(eVarN3);
            if (eVarN3.M()[1].i() != null) {
                p122m1.e eVarN413 = n();
                p247y7.AbstractC7350t.c(eVarN413);
                fVarR = r(eVarN413.M()[1]);
                if (fVarR != null) {
                    return;
                }
                p132n1.f fVarG13 = g();
                p122m1.e eVarN414 = n();
                p247y7.AbstractC7350t.c(eVarN414);
                b(fVarG13, fVarR, -eVarN414.M()[1].k());
                fVarQ = q();
                fVarG = g();
                i6 = -1;
            } else {
                if (!(n() instanceof p122m1.i)) {
                    return;
                }
                eVarN4 = n();
                p247y7.AbstractC7350t.c(eVarN4);
                if (eVarN4.o0() != null) {
                    return;
                }
                p122m1.e eVarN415 = n();
                p247y7.AbstractC7350t.c(eVarN415);
                p122m1.e eVarO5 = eVarN415.o0();
                p247y7.AbstractC7350t.c(eVarO5);
                p132n1.l lVarK7 = eVarO5.K();
                p247y7.AbstractC7350t.c(lVarK7);
                p132n1.f fVarQ17 = lVarK7.q();
                p132n1.f fVarQ18 = q();
                p122m1.e eVarN416 = n();
                p247y7.AbstractC7350t.c(eVarN416);
                b(fVarQ18, fVarQ17, eVarN416.C0());
            }
            c(fVarQ, fVarG, i6, i());
            return;
        }
        p122m1.e eVarN417 = n();
        p247y7.AbstractC7350t.c(eVarN417);
        fVarR2 = r(eVarN417.M()[0]);
        if (fVarR2 != null) {
            return;
        }
        p132n1.f fVarQ19 = q();
        p122m1.e eVarN418 = n();
        p247y7.AbstractC7350t.c(eVarN418);
        b(fVarQ19, fVarR2, eVarN418.M()[0].k());
        fVarQ = g();
        fVarG = q();
        c(fVarQ, fVarG, i6, i());
        return;
        fVarG2.m(-dVar.k());
    }

    @Override // p132n1.p
    public void e() {
        if (q().i()) {
            p122m1.e eVarN = n();
            p247y7.AbstractC7350t.c(eVarN);
            eVarN.V1(q().j());
        }
    }

    @Override // p132n1.p
    public void f() {
        y(null);
        q().c();
        g().c();
        i().c();
        x(false);
    }

    public java.lang.String toString() {
        p122m1.e eVarN = n();
        p247y7.AbstractC7350t.c(eVarN);
        return "HorizontalRun " + eVarN.q();
    }
}
