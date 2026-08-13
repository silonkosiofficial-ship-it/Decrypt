package p012b1;

/* JADX INFO: loaded from: classes.dex */
public class x implements n1.b.c, p012b1.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f24117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p122m1.f f24118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f24119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f24120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Map f24121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p012b1.z f24122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f24123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f24124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f24125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.util.ArrayList f24126j;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24127a;

        static {
            int[] iArr = new int[m1.e.b.values().length];
            try {
                iArr[m1.e.b.FIXED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[m1.e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[m1.e.b.MATCH_CONSTRAINT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[m1.e.b.MATCH_PARENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f24127a = iArr;
        }
    }

    public x(Y0.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "density");
        this.f24117a = "";
        p122m1.f fVar = new p122m1.f(0, 0);
        fVar.N2(this);
        this.f24118b = fVar;
        this.f24119c = new java.util.LinkedHashMap();
        this.f24120d = new java.util.LinkedHashMap();
        this.f24121e = new java.util.LinkedHashMap();
        this.f24122f = new p012b1.z(eVar);
        this.f24123g = new int[2];
        this.f24124h = new int[2];
        this.f24125i = Float.NaN;
        this.f24126j = new java.util.ArrayList();
    }

    private final void e(java.lang.Integer[] numArr, p132n1.b.C0649b c0649b) {
        numArr[0] = java.lang.Integer.valueOf(c0649b.k());
        numArr[1] = java.lang.Integer.valueOf(c0649b.i());
        numArr[2] = java.lang.Integer.valueOf(c0649b.g());
    }

    private final long f(p122m1.e eVar, long j6) {
        int iI0;
        int iW0;
        int i6;
        java.lang.Object objP = eVar.p();
        java.lang.String strS0 = eVar.s0();
        int i10 = 0;
        if (eVar instanceof p122m1.l) {
            if (Y0.C1859b.j(j6)) {
                i6 = 1073741824;
            } else {
                i6 = Y0.C1859b.h(j6) ? Integer.MIN_VALUE : 0;
            }
            if (Y0.C1859b.i(j6)) {
                i10 = 1073741824;
            } else if (Y0.C1859b.g(j6)) {
                i10 = Integer.MIN_VALUE;
            }
            p122m1.l lVar = (p122m1.l) eVar;
            lVar.m2(i6, Y0.C1859b.l(j6), i10, Y0.C1859b.k(j6));
            iI0 = lVar.h2();
            iW0 = lVar.g2();
        } else {
            if (!(objP instanceof D0.G)) {
                p032d1.a.f44286a.c("CCL", "Nothing to measure for widget: " + strS0);
                return p022c1.b.a(0, 0);
            }
            D0.X xU = ((D0.G) objP).U(j6);
            this.f24119c.put(objP, xU);
            iI0 = xU.I0();
            iW0 = xU.w0();
        }
        return p022c1.b.a(iI0, iW0);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    private final boolean g(m1.e.b bVar, int i6, int i10, int i11, boolean z6, boolean z10, int i12, int[] iArr) {
        boolean z11;
        int i13 = b1.x.a.f24127a[bVar.ordinal()];
        if (i13 == 1) {
            iArr[0] = i6;
            iArr[1] = i6;
        } else {
            if (i13 == 2) {
                iArr[0] = 0;
                iArr[1] = i12;
                return true;
            }
            if (i13 == 3) {
                if (p012b1.j.f24075a) {
                    p032d1.a aVar = p032d1.a.f44286a;
                    aVar.a("CCL", "Measure strategy " + i11);
                    aVar.a("CCL", "DW " + i10);
                    aVar.a("CCL", "ODR " + z6);
                    aVar.a("CCL", "IRH " + z10);
                }
                if (z10) {
                    z11 = true;
                } else {
                    p132n1.b.C0649b.a aVar2 = p132n1.b.C0649b.f51342k;
                    if ((i11 == aVar2.b() || i11 == aVar2.c()) && (i11 == aVar2.c() || i10 != 1 || z6)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (p012b1.j.f24075a) {
                    p032d1.a.f44286a.a("CCL", "UD " + z11);
                }
                iArr[0] = z11 ? i6 : 0;
                if (!z11) {
                    i6 = i12;
                }
                iArr[1] = i6;
                if (!z11) {
                    return true;
                }
            } else {
                if (i13 != 4) {
                    throw new java.lang.IllegalStateException((bVar + " is not supported").toString());
                }
                iArr[0] = i12;
                iArr[1] = i12;
            }
        }
        return false;
    }

    @Override // n1.b.c
    public void a() {
    }

    /* JADX WARN: Code duplicated, block: B:33:0x010a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0112  */
    /* JADX WARN: Code duplicated, block: B:38:0x013d  */
    /* JADX WARN: Code duplicated, block: B:42:0x017e  */
    /* JADX WARN: Code duplicated, block: B:46:0x018e  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:57:0x01df  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01fc  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0112, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x013d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x01fc, please report this as an issue */
    @Override // n1.b.c
    public void b(p122m1.e eVar, p132n1.b.C0649b c0649b) {
        long jF;
        java.lang.Integer numValueOf;
        java.lang.Integer numValueOf2;
        int iIntValue;
        java.lang.Integer numValueOf3;
        int iIntValue2;
        boolean z6;
        p247y7.AbstractC7350t.f(eVar, "constraintWidget");
        p247y7.AbstractC7350t.f(c0649b, "measure");
        java.lang.String strValueOf = java.lang.String.valueOf(eVar.s0());
        if (p012b1.j.f24075a) {
            p032d1.a.f44286a.a("CCL", "Measuring " + strValueOf + " with: " + p012b1.j.g(eVar) + "\n");
        }
        java.lang.Integer[] numArr = (java.lang.Integer[]) this.f24120d.get(strValueOf);
        g(c0649b.d(), c0649b.e(), eVar.Q(), c0649b.f(), (numArr != null ? numArr[1].intValue() : 0) == eVar.w(), eVar.Q0(), Y0.C1859b.l(this.f24122f.G()), this.f24123g);
        g(c0649b.l(), c0649b.m(), eVar.P(), c0649b.f(), (numArr != null ? numArr[0].intValue() : 0) == eVar.B0(), eVar.R0(), Y0.C1859b.k(this.f24122f.G()), this.f24124h);
        int[] iArr = this.f24123g;
        int i6 = iArr[0];
        int i10 = iArr[1];
        int[] iArr2 = this.f24124h;
        long jA = Y0.c.a(i6, i10, iArr2[0], iArr2[1]);
        int iF = c0649b.f();
        p132n1.b.C0649b.a aVar = p132n1.b.C0649b.f51342k;
        if (iF == aVar.b() || c0649b.f() == aVar.c()) {
            if (p012b1.j.f24075a) {
                p032d1.a.f44286a.a("CCL", "Measuring " + strValueOf + " with " + Y0.C1859b.q(jA));
            }
            jF = f(eVar, jA);
            eVar.E1(false);
            if (p012b1.j.f24075a) {
                p032d1.a.f44286a.a("CCL", strValueOf + " is size " + p022c1.b.c(jF) + " " + p022c1.b.d(jF));
            }
            java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(p022c1.b.c(jF));
            numValueOf = java.lang.Integer.valueOf(eVar.U());
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            numValueOf2 = java.lang.Integer.valueOf(eVar.S());
            if (numValueOf2.intValue() <= 0) {
                numValueOf2 = null;
            }
            iIntValue = ((java.lang.Number) E7.j.m(numValueOf4, numValueOf, numValueOf2)).intValue();
            java.lang.Integer numValueOf5 = java.lang.Integer.valueOf(p022c1.b.d(jF));
            numValueOf3 = java.lang.Integer.valueOf(eVar.T());
            if (numValueOf3.intValue() <= 0) {
                numValueOf3 = null;
            }
            java.lang.Integer numValueOf6 = java.lang.Integer.valueOf(eVar.R());
            iIntValue2 = ((java.lang.Number) E7.j.m(numValueOf5, numValueOf3, numValueOf6.intValue() > 0 ? numValueOf6 : null)).intValue();
            if (iIntValue != p022c1.b.c(jF)) {
                jA = Y0.c.a(iIntValue, iIntValue, Y0.C1859b.m(jA), Y0.C1859b.k(jA));
                z6 = true;
            } else {
                z6 = false;
            }
            if (iIntValue2 != p022c1.b.d(jF)) {
                jA = Y0.c.a(Y0.C1859b.n(jA), Y0.C1859b.l(jA), iIntValue2, iIntValue2);
                z6 = true;
            }
            if (z6) {
                if (p012b1.j.f24075a) {
                    p032d1.a.f44286a.a("CCL", "Remeasuring coerced " + strValueOf + " with " + Y0.C1859b.q(jA));
                }
                f(eVar, jA);
                eVar.E1(false);
            }
        } else {
            m1.e.b bVarD = c0649b.d();
            m1.e.b bVar = m1.e.b.MATCH_CONSTRAINT;
            if (bVarD != bVar || eVar.Q() != 0 || c0649b.l() != bVar || eVar.P() != 0) {
                if (p012b1.j.f24075a) {
                    p032d1.a.f44286a.a("CCL", "Measuring " + strValueOf + " with " + Y0.C1859b.q(jA));
                }
                jF = f(eVar, jA);
                eVar.E1(false);
                if (p012b1.j.f24075a) {
                    p032d1.a.f44286a.a("CCL", strValueOf + " is size " + p022c1.b.c(jF) + " " + p022c1.b.d(jF));
                }
                java.lang.Integer numValueOf7 = java.lang.Integer.valueOf(p022c1.b.c(jF));
                numValueOf = java.lang.Integer.valueOf(eVar.U());
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                numValueOf2 = java.lang.Integer.valueOf(eVar.S());
                if (numValueOf2.intValue() <= 0) {
                    numValueOf2 = null;
                }
                iIntValue = ((java.lang.Number) E7.j.m(numValueOf7, numValueOf, numValueOf2)).intValue();
                java.lang.Integer numValueOf8 = java.lang.Integer.valueOf(p022c1.b.d(jF));
                numValueOf3 = java.lang.Integer.valueOf(eVar.T());
                if (numValueOf3.intValue() <= 0) {
                    numValueOf3 = null;
                }
                java.lang.Integer numValueOf9 = java.lang.Integer.valueOf(eVar.R());
                iIntValue2 = ((java.lang.Number) E7.j.m(numValueOf8, numValueOf3, numValueOf9.intValue() > 0 ? numValueOf9 : null)).intValue();
                if (iIntValue != p022c1.b.c(jF)) {
                    jA = Y0.c.a(iIntValue, iIntValue, Y0.C1859b.m(jA), Y0.C1859b.k(jA));
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (iIntValue2 != p022c1.b.d(jF)) {
                    jA = Y0.c.a(Y0.C1859b.n(jA), Y0.C1859b.l(jA), iIntValue2, iIntValue2);
                    z6 = true;
                }
                if (z6) {
                    if (p012b1.j.f24075a) {
                        p032d1.a.f44286a.a("CCL", "Remeasuring coerced " + strValueOf + " with " + Y0.C1859b.q(jA));
                    }
                    f(eVar, jA);
                    eVar.E1(false);
                }
            }
        }
        D0.X x6 = (D0.X) this.f24119c.get(eVar.p());
        boolean z10 = false;
        c0649b.u(x6 != null ? x6.I0() : eVar.B0());
        c0649b.s(x6 != null ? x6.w0() : eVar.w());
        int iQ = (x6 == null || !this.f24122f.r(eVar)) ? Integer.MIN_VALUE : x6.Q(D0.AbstractC0883b.a());
        c0649b.r(iQ != Integer.MIN_VALUE);
        c0649b.q(iQ);
        java.util.Map map = this.f24120d;
        java.lang.Object obj = map.get(strValueOf);
        java.lang.Object obj2 = obj;
        if (obj == null) {
            java.lang.Integer[] numArr2 = {0, 0, Integer.MIN_VALUE};
            map.put(strValueOf, numArr2);
            obj2 = numArr2;
        }
        e((java.lang.Integer[]) obj2, c0649b);
        if (c0649b.k() != c0649b.e() || c0649b.i() != c0649b.m()) {
            z10 = true;
        }
        c0649b.t(z10);
    }

    protected final void c(long j6) {
        this.f24118b.U1(Y0.C1859b.l(j6));
        this.f24118b.m1(Y0.C1859b.k(j6));
        this.f24125i = Float.NaN;
    }

    public void d() {
        p122m1.e eVarR;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("{ ");
        sb.append("  root: {");
        sb.append("interpolated: { left:  0,");
        sb.append("  top:  0,");
        sb.append("  right:   " + this.f24118b.B0() + " ,");
        sb.append("  bottom:  " + this.f24118b.w() + " ,");
        sb.append(" } }");
        for (p122m1.e eVar : this.f24118b.c2()) {
            java.lang.Object objP = eVar.p();
            if (objP instanceof D0.G) {
                p092j1.h hVarU = null;
                if (eVar.s0() == null) {
                    D0.G g6 = (D0.G) objP;
                    java.lang.Object objA = androidx.compose.ui.layout.a.a(g6);
                    if (objA == null) {
                        objA = p012b1.m.a(g6);
                    }
                    eVar.J1(objA != null ? objA.toString() : null);
                }
                p092j1.h hVar = (p092j1.h) this.f24121e.get(objP);
                if (hVar != null && (eVarR = hVar.r()) != null) {
                    hVarU = eVarR.u();
                }
                if (hVarU != null) {
                    sb.append(" " + eVar.s0() + ": {");
                    sb.append(" interpolated : ");
                    hVarU.t(sb, true);
                    sb.append("}, ");
                }
            } else if (eVar instanceof p122m1.h) {
                sb.append(" " + eVar.s0() + ": {");
                sb.append(((p122m1.h) eVar).b2() == 0 ? " type: 'hGuideline', " : " type: 'vGuideline', ");
                sb.append(" interpolated: ");
                sb.append(" { left: " + eVar.C0() + ", top: " + eVar.D0() + ", right: " + (eVar.C0() + eVar.B0()) + ", bottom: " + (eVar.D0() + eVar.w()) + " }");
                sb.append("}, ");
            }
        }
        sb.append(" }");
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        this.f24117a = string;
    }

    public final void h(D0.X.a aVar, java.util.List list) {
        D0.G g6;
        D0.X xU;
        java.lang.Object next;
        p247y7.AbstractC7350t.f(aVar, "<this>");
        p247y7.AbstractC7350t.f(list, "measurables");
        if (this.f24121e.isEmpty()) {
            for (p122m1.e eVar : this.f24118b.c2()) {
                java.lang.Object objP = eVar.p();
                if (objP instanceof D0.G) {
                    this.f24121e.put(objP, new p092j1.h(eVar.u().K()));
                }
            }
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            D0.G g10 = (D0.G) list.get(i6);
            if (this.f24121e.containsKey(g10)) {
                g6 = g10;
            } else {
                java.util.Iterator it = this.f24121e.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    D0.G g11 = (D0.G) next;
                    if (androidx.compose.ui.layout.a.a(g11) != null && p247y7.AbstractC7350t.b(androidx.compose.ui.layout.a.a(g11), androidx.compose.ui.layout.a.a(g10))) {
                        break;
                    }
                }
                g6 = (D0.G) next;
                if (g6 == null) {
                    continue;
                }
            }
            p092j1.h hVar = (p092j1.h) this.f24121e.get(g6);
            if (hVar == null || (xU = (D0.X) this.f24119c.get(g6)) == null) {
                return;
            }
            if (!this.f24121e.containsKey(g10)) {
                xU = g10.U(Y0.C1859b.f16201b.c(xU.I0(), xU.w0()));
            }
            p012b1.j.f(aVar, xU, hVar, 0L, 4, null);
        }
        if (p012b1.v.BOUNDS == null) {
            d();
        }
    }

    public final long i(long j6, Y0.v vVar, p012b1.n nVar, java.util.List list, int i6) {
        java.lang.String string;
        java.lang.Object objA;
        p247y7.AbstractC7350t.f(vVar, "layoutDirection");
        p247y7.AbstractC7350t.f(nVar, "constraintSet");
        p247y7.AbstractC7350t.f(list, "measurables");
        this.f24122f.D(Y0.C1859b.j(j6) ? p092j1.d.f49147i.a(Y0.C1859b.l(j6)) : p092j1.d.f49147i.g().g(Y0.C1859b.n(j6)));
        this.f24122f.n(Y0.C1859b.i(j6) ? p092j1.d.f49147i.a(Y0.C1859b.k(j6)) : p092j1.d.f49147i.g().g(Y0.C1859b.m(j6)));
        this.f24122f.l().d0().a(this.f24122f, this.f24118b, 0);
        this.f24122f.l().B().a(this.f24122f, this.f24118b, 1);
        this.f24122f.H(j6);
        this.f24122f.y(vVar == Y0.v.Rtl);
        j();
        if (nVar.a(list)) {
            this.f24122f.v();
            nVar.e(this.f24122f, list);
            p012b1.j.c(this.f24122f, list);
            this.f24122f.a(this.f24118b);
        } else {
            p012b1.j.c(this.f24122f, list);
        }
        c(j6);
        this.f24118b.R2();
        if (p012b1.j.f24075a) {
            this.f24118b.c1("ConstraintLayout");
            for (p122m1.e eVar : this.f24118b.c2()) {
                java.lang.Object objP = eVar.p();
                D0.G g6 = objP instanceof D0.G ? (D0.G) objP : null;
                if (g6 == null || (objA = androidx.compose.ui.layout.a.a(g6)) == null || (string = objA.toString()) == null) {
                    string = "NOTAG";
                }
                eVar.c1(string);
            }
            p032d1.a aVar = p032d1.a.f44286a;
            aVar.a("CCL", "ConstraintLayout is asked to measure with " + Y0.C1859b.q(j6));
            aVar.a("CCL", p012b1.j.g(this.f24118b));
            for (p122m1.e eVar2 : this.f24118b.c2()) {
                p032d1.a aVar2 = p032d1.a.f44286a;
                p247y7.AbstractC7350t.c(eVar2);
                aVar2.a("CCL", p012b1.j.g(eVar2));
            }
        }
        this.f24118b.O2(i6);
        p122m1.f fVar = this.f24118b;
        fVar.K2(fVar.F2(), 0, 0, 0, 0, 0, 0, 0, 0);
        if (p012b1.j.f24075a) {
            p032d1.a.f44286a.a("CCL", "ConstraintLayout is at the end " + this.f24118b.B0() + " " + this.f24118b.w());
        }
        return Y0.u.a(this.f24118b.B0(), this.f24118b.w());
    }

    public final void j() {
        this.f24119c.clear();
        this.f24120d.clear();
        this.f24121e.clear();
    }
}
