package p132n1;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p132n1.p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final n1.n.a f51410m = new n1.n.a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f51411n = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p132n1.f f51412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p132n1.g f51413l;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51414a;

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
            f51414a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p122m1.e eVar) {
        super(eVar);
        p247y7.AbstractC7350t.f(eVar, "widget");
        this.f51412k = new p132n1.f(this);
        q().p(n1.f.a.TOP);
        g().p(n1.f.a.BOTTOM);
        this.f51412k.p(n1.f.a.BASELINE);
        C(1);
    }

    @Override // p132n1.p
    public boolean D() {
        if (super.j() != m1.e.b.MATCH_CONSTRAINT) {
            return true;
        }
        p122m1.e eVarN = super.n();
        p247y7.AbstractC7350t.c(eVarN);
        return eVarN.P() == 0;
    }

    public final p132n1.f H() {
        return this.f51412k;
    }

    public final p132n1.g I() {
        return this.f51413l;
    }

    public void J() {
        x(false);
        q().c();
        q().r(false);
        g().c();
        g().r(false);
        this.f51412k.c();
        this.f51412k.r(false);
        i().r(false);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    @Override // p132n1.p, p132n1.d
    public void a(p132n1.d dVar) {
        p132n1.g gVarI;
        float fJ;
        int i6;
        p247y7.AbstractC7350t.f(dVar, "node");
        int i10 = n1.n.b.f51414a[m().ordinal()];
        if (i10 == 1) {
            G(dVar);
        } else if (i10 == 2) {
            F(dVar);
        } else if (i10 == 3) {
            p122m1.e eVarN = n();
            p247y7.AbstractC7350t.c(eVarN);
            p122m1.d dVarC0 = eVarN.c0();
            p122m1.e eVarN2 = n();
            p247y7.AbstractC7350t.c(eVarN2);
            E(dVar, dVarC0, eVarN2.G(), 1);
            return;
        }
        if (i().h() && !i().i() && j() == m1.e.b.MATCH_CONSTRAINT) {
            p122m1.e eVarN3 = n();
            p247y7.AbstractC7350t.c(eVarN3);
            int iP = eVarN3.P();
            if (iP == 2) {
                p122m1.e eVarN4 = n();
                p247y7.AbstractC7350t.c(eVarN4);
                p122m1.e eVarO0 = eVarN4.o0();
                if (eVarO0 != null) {
                    p132n1.n nVarE0 = eVarO0.e0();
                    p247y7.AbstractC7350t.c(nVarE0);
                    if (nVarE0.i().i()) {
                        p122m1.e eVarN5 = n();
                        p247y7.AbstractC7350t.c(eVarN5);
                        float fV = eVarN5.V();
                        p132n1.n nVarE1 = eVarO0.e0();
                        p247y7.AbstractC7350t.c(nVarE1);
                        fJ = nVarE1.i().j() * fV;
                        i6 = (int) (fJ + 0.5f);
                        i().k(i6);
                    }
                }
            } else if (iP == 3) {
                p122m1.e eVarN6 = n();
                p247y7.AbstractC7350t.c(eVarN6);
                p132n1.l lVarK = eVarN6.K();
                p247y7.AbstractC7350t.c(lVarK);
                if (lVarK.i().i()) {
                    p122m1.e eVarN7 = n();
                    p247y7.AbstractC7350t.c(eVarN7);
                    int iT = eVarN7.t();
                    if (iT == -1) {
                        p122m1.e eVarN8 = n();
                        p247y7.AbstractC7350t.c(eVarN8);
                        p132n1.l lVarK2 = eVarN8.K();
                        p247y7.AbstractC7350t.c(lVarK2);
                        float fJ2 = lVarK2.i().j();
                        p122m1.e eVarN9 = n();
                        p247y7.AbstractC7350t.c(eVarN9);
                        fJ = fJ2 / eVarN9.s();
                        i6 = (int) (fJ + 0.5f);
                    } else if (iT == 0) {
                        p122m1.e eVarN10 = n();
                        p247y7.AbstractC7350t.c(eVarN10);
                        p132n1.l lVarK3 = eVarN10.K();
                        p247y7.AbstractC7350t.c(lVarK3);
                        float fJ3 = lVarK3.i().j();
                        p122m1.e eVarN11 = n();
                        p247y7.AbstractC7350t.c(eVarN11);
                        fJ = fJ3 * eVarN11.s();
                        i6 = (int) (fJ + 0.5f);
                    } else if (iT != 1) {
                        i6 = 0;
                    } else {
                        p122m1.e eVarN12 = n();
                        p247y7.AbstractC7350t.c(eVarN12);
                        p132n1.l lVarK4 = eVarN12.K();
                        p247y7.AbstractC7350t.c(lVarK4);
                        float fJ4 = lVarK4.i().j();
                        p122m1.e eVarN13 = n();
                        p247y7.AbstractC7350t.c(eVarN13);
                        fJ = fJ4 / eVarN13.s();
                        i6 = (int) (fJ + 0.5f);
                    }
                    i().k(i6);
                }
            }
        }
        if (q().h() && g().h()) {
            if (q().i() && g().i() && i().i()) {
                return;
            }
            if (!i().i() && j() == m1.e.b.MATCH_CONSTRAINT) {
                p122m1.e eVarN14 = n();
                p247y7.AbstractC7350t.c(eVarN14);
                if (eVarN14.Q() == 0) {
                    p122m1.e eVarN15 = n();
                    p247y7.AbstractC7350t.c(eVarN15);
                    if (!eVarN15.N0()) {
                        java.lang.Object obj = q().g().get(0);
                        p247y7.AbstractC7350t.e(obj, "get(...)");
                        java.lang.Object obj2 = g().g().get(0);
                        p247y7.AbstractC7350t.e(obj2, "get(...)");
                        int iJ = ((p132n1.f) obj).j() + q().e();
                        int iJ2 = ((p132n1.f) obj2).j() + g().e();
                        q().k(iJ);
                        g().k(iJ2);
                        i().k(iJ2 - iJ);
                        return;
                    }
                }
            }
            if (!i().i() && j() == m1.e.b.MATCH_CONSTRAINT && o() == 1 && q().g().size() > 0 && g().g().size() > 0) {
                java.lang.Object obj3 = q().g().get(0);
                p247y7.AbstractC7350t.e(obj3, "get(...)");
                java.lang.Object obj4 = g().g().get(0);
                p247y7.AbstractC7350t.e(obj4, "get(...)");
                int iJ3 = (((p132n1.f) obj4).j() + g().e()) - (((p132n1.f) obj3).j() + q().e());
                if (iJ3 < i().u()) {
                    gVarI = i();
                } else {
                    gVarI = i();
                    iJ3 = i().u();
                }
                gVarI.k(iJ3);
            }
            if (i().i() && q().g().size() > 0 && g().g().size() > 0) {
                java.lang.Object obj5 = q().g().get(0);
                p247y7.AbstractC7350t.e(obj5, "get(...)");
                p132n1.f fVar = (p132n1.f) obj5;
                java.lang.Object obj6 = g().g().get(0);
                p247y7.AbstractC7350t.e(obj6, "get(...)");
                p132n1.f fVar2 = (p132n1.f) obj6;
                int iJ4 = fVar.j() + q().e();
                int iJ5 = fVar2.j() + g().e();
                p122m1.e eVarN16 = n();
                p247y7.AbstractC7350t.c(eVarN16);
                float fV0 = eVarN16.v0();
                if (p247y7.AbstractC7350t.b(fVar, fVar2)) {
                    iJ4 = fVar.j();
                    iJ5 = fVar2.j();
                    fV0 = 0.5f;
                }
                q().k((int) (iJ4 + 0.5f + (((iJ5 - iJ4) - i().j()) * fV0)));
                g().k(q().j() + i().j());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0548  */
    /* JADX WARN: Code duplicated, block: B:121:0x055c  */
    /* JADX WARN: Code duplicated, block: B:123:0x056f  */
    /* JADX WARN: Code duplicated, block: B:125:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:128:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:130:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:132:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:133:0x061f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0633  */
    /* JADX WARN: Code duplicated, block: B:137:0x0646  */
    /* JADX WARN: Code duplicated, block: B:140:0x067d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0690  */
    /* JADX WARN: Code duplicated, block: B:144:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:145:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:147:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:149:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:151:0x0720  */
    /* JADX WARN: Code duplicated, block: B:154:0x0736  */
    /* JADX WARN: Code duplicated, block: B:156:0x0745  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0264  */
    /* JADX WARN: Code duplicated, block: B:55:0x0277  */
    /* JADX WARN: Code duplicated, block: B:57:0x028a  */
    /* JADX WARN: Code duplicated, block: B:60:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:62:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:64:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:68:0x0325  */
    /* JADX WARN: Code duplicated, block: B:70:0x0338  */
    /* JADX WARN: Code duplicated, block: B:72:0x034b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0377  */
    /* JADX WARN: Code duplicated, block: B:75:0x037f  */
    /* JADX WARN: Code duplicated, block: B:77:0x038c  */
    /* JADX WARN: Code duplicated, block: B:79:0x03a2  */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0536, code lost:
    
        if (r0.v() != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0538, code lost:
    
        r0 = r7.f51412k;
        r1 = q();
        r2 = r7.f51413l;
        p247y7.AbstractC7350t.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0679, code lost:
    
        if (r0.v() != false) goto L117;
     */
    @Override // p132n1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instruction units count: 1905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p132n1.n.d():void");
    }

    @Override // p132n1.p
    public void e() {
        if (q().i()) {
            p122m1.e eVarN = n();
            p247y7.AbstractC7350t.c(eVarN);
            eVarN.W1(q().j());
        }
    }

    @Override // p132n1.p
    public void f() {
        y(null);
        q().c();
        g().c();
        this.f51412k.c();
        i().c();
        x(false);
    }

    public java.lang.String toString() {
        p122m1.e eVarN = n();
        p247y7.AbstractC7350t.c(eVarN);
        return "VerticalRun " + eVarN.q();
    }
}
