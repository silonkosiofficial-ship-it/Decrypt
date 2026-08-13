package p042e1;

/* JADX INFO: loaded from: classes.dex */
public class b implements e1.d.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p042e1.b.C0496b f44535g = new p042e1.b.C0496b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f44536h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p042e1.i f44537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f44538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f44539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.ArrayList f44540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e1.b.a f44541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f44542f;

    public interface a {
        int a();

        p042e1.i b(int i6);

        void c();

        void clear();

        float d(int i6);

        void e(float f6);

        boolean f(p042e1.i iVar);

        float g(p042e1.i iVar);

        void h(p042e1.i iVar, float f6, boolean z6);

        void i(p042e1.i iVar, float f6);

        float j(p042e1.b bVar, boolean z6);

        float k(p042e1.i iVar, boolean z6);
    }

    /* JADX INFO: renamed from: e1.b$b, reason: collision with other inner class name */
    public static final class C0496b {
        private C0496b() {
        }

        public /* synthetic */ C0496b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public b() {
        this.f44540d = new java.util.ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(p042e1.c cVar) {
        this();
        p247y7.AbstractC7350t.f(cVar, "cache");
        this.f44541e = new p042e1.a(this, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051 A[SYNTHETIC] */
    private final p042e1.i A(boolean[] zArr, p042e1.i iVar) {
        e1.b.a aVar = this.f44541e;
        p247y7.AbstractC7350t.c(aVar);
        int iA = aVar.a();
        p042e1.i iVar2 = null;
        float f6 = 0.0f;
        for (int i6 = 0; i6 < iA; i6++) {
            e1.b.a aVar2 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar2);
            float fD = aVar2.d(i6);
            if (fD < 0.0f) {
                e1.b.a aVar3 = this.f44541e;
                p247y7.AbstractC7350t.c(aVar3);
                p042e1.i iVarB = aVar3.b(i6);
                if (zArr != null) {
                    p247y7.AbstractC7350t.c(iVarB);
                    if (!zArr[iVarB.o()]) {
                        if (!p247y7.AbstractC7350t.b(iVarB, iVar)) {
                            p247y7.AbstractC7350t.c(iVarB);
                            if ((iVarB.x() != e1.i.b.SLACK || iVarB.x() == e1.i.b.ERROR) && fD < f6) {
                                f6 = fD;
                                iVar2 = iVarB;
                            }
                        }
                    }
                } else if (!p247y7.AbstractC7350t.b(iVarB, iVar)) {
                    p247y7.AbstractC7350t.c(iVarB);
                    if (iVarB.x() != e1.i.b.SLACK) {
                        f6 = fD;
                        iVar2 = iVarB;
                    } else {
                        f6 = fD;
                        iVar2 = iVarB;
                    }
                }
            }
        }
        return iVar2;
    }

    private final boolean y(p042e1.i iVar, p042e1.d dVar) {
        p247y7.AbstractC7350t.c(iVar);
        return iVar.z() <= 1;
    }

    public final void B(p042e1.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "v");
        if (this.f44537a != null) {
            e1.b.a aVar = this.f44541e;
            p247y7.AbstractC7350t.c(aVar);
            aVar.i(this.f44537a, -1.0f);
            p042e1.i iVar2 = this.f44537a;
            p247y7.AbstractC7350t.c(iVar2);
            iVar2.H(-1);
            this.f44537a = null;
        }
        e1.b.a aVar2 = this.f44541e;
        p247y7.AbstractC7350t.c(aVar2);
        float fK = aVar2.k(iVar, true) * (-1);
        this.f44537a = iVar;
        if (fK == 1.0f) {
            return;
        }
        this.f44538b /= fK;
        e1.b.a aVar3 = this.f44541e;
        p247y7.AbstractC7350t.c(aVar3);
        aVar3.e(fK);
    }

    public final void C() {
        this.f44537a = null;
        e1.b.a aVar = this.f44541e;
        p247y7.AbstractC7350t.c(aVar);
        aVar.clear();
        this.f44538b = 0.0f;
        this.f44542f = false;
    }

    public final void D(float f6) {
        this.f44538b = f6;
    }

    public final void E(boolean z6) {
        this.f44542f = z6;
    }

    public final void F(boolean z6) {
        this.f44539c = z6;
    }

    public final void G(p042e1.i iVar) {
        this.f44537a = iVar;
    }

    public final void H(e1.b.a aVar) {
        this.f44541e = aVar;
    }

    public final java.lang.String I() {
        boolean z6;
        java.lang.StringBuilder sb;
        java.lang.String str;
        p042e1.i iVar = this.f44537a;
        java.lang.String string = (iVar == null ? "0" : "" + iVar) + " = ";
        float f6 = this.f44538b;
        if (f6 == 0.0f) {
            z6 = false;
        } else {
            string = string + f6;
            z6 = true;
        }
        e1.b.a aVar = this.f44541e;
        p247y7.AbstractC7350t.c(aVar);
        int iA = aVar.a();
        for (int i6 = 0; i6 < iA; i6++) {
            e1.b.a aVar2 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar2);
            p042e1.i iVarB = aVar2.b(i6);
            if (iVarB != null) {
                e1.b.a aVar3 = this.f44541e;
                p247y7.AbstractC7350t.c(aVar3);
                float fD = aVar3.d(i6);
                if (fD != 0.0f) {
                    java.lang.String string2 = iVarB.toString();
                    if (z6) {
                        if (fD > 0.0f) {
                            string = string + " + ";
                        } else {
                            sb = new java.lang.StringBuilder();
                            sb.append(string);
                            str = " - ";
                            sb.append(str);
                            string = sb.toString();
                            fD *= -1.0f;
                        }
                    } else if (fD < 0.0f) {
                        sb = new java.lang.StringBuilder();
                        sb.append(string);
                        str = "- ";
                        sb.append(str);
                        string = sb.toString();
                        fD *= -1.0f;
                    }
                    if (fD != 1.0f) {
                        string2 = fD + " " + string2;
                    }
                    string = string + string2;
                    z6 = true;
                }
            }
        }
        if (z6) {
            return string;
        }
        return string + "0.0";
    }

    public void J(p042e1.d dVar, p042e1.i iVar, boolean z6) {
        if (iVar == null || !iVar.A()) {
            return;
        }
        e1.b.a aVar = this.f44541e;
        p247y7.AbstractC7350t.c(aVar);
        this.f44538b += iVar.n() * aVar.g(iVar);
        e1.b.a aVar2 = this.f44541e;
        p247y7.AbstractC7350t.c(aVar2);
        aVar2.k(iVar, z6);
        if (z6) {
            iVar.B(this);
        }
        if (p042e1.d.f44549s.c()) {
            e1.b.a aVar3 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar3);
            if (aVar3.a() == 0) {
                this.f44542f = true;
                p247y7.AbstractC7350t.c(dVar);
                dVar.J(true);
            }
        }
    }

    public void K(p042e1.d dVar, p042e1.b bVar, boolean z6) {
        e1.b.a aVar = this.f44541e;
        p247y7.AbstractC7350t.c(aVar);
        float fJ = aVar.j(bVar, z6);
        float f6 = this.f44538b;
        p247y7.AbstractC7350t.c(bVar);
        this.f44538b = f6 + (bVar.f44538b * fJ);
        if (z6) {
            p042e1.i iVar = bVar.f44537a;
            p247y7.AbstractC7350t.c(iVar);
            iVar.B(this);
        }
        if (!p042e1.d.f44549s.c() || this.f44537a == null) {
            return;
        }
        e1.b.a aVar2 = this.f44541e;
        p247y7.AbstractC7350t.c(aVar2);
        if (aVar2.a() == 0) {
            this.f44542f = true;
            p247y7.AbstractC7350t.c(dVar);
            dVar.J(true);
        }
    }

    public final void L(p042e1.d dVar, p042e1.i iVar, boolean z6) {
        p247y7.AbstractC7350t.f(dVar, "system");
        if (iVar == null || !iVar.t()) {
            return;
        }
        e1.b.a aVar = this.f44541e;
        p247y7.AbstractC7350t.c(aVar);
        float fG = aVar.g(iVar);
        this.f44538b += iVar.w() * fG;
        e1.b.a aVar2 = this.f44541e;
        p247y7.AbstractC7350t.c(aVar2);
        aVar2.k(iVar, z6);
        if (z6) {
            iVar.B(this);
        }
        e1.b.a aVar3 = this.f44541e;
        p247y7.AbstractC7350t.c(aVar3);
        aVar3.h(dVar.z().b()[iVar.v()], fG, z6);
        if (p042e1.d.f44549s.c()) {
            e1.b.a aVar4 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar4);
            if (aVar4.a() == 0) {
                this.f44542f = true;
                dVar.J(true);
            }
        }
    }

    public void M(p042e1.d dVar) {
        p247y7.AbstractC7350t.c(dVar);
        p042e1.b[] bVarArrA = dVar.A();
        p247y7.AbstractC7350t.c(bVarArrA);
        if (bVarArrA.length == 0) {
            return;
        }
        boolean z6 = false;
        while (!z6) {
            e1.b.a aVar = this.f44541e;
            p247y7.AbstractC7350t.c(aVar);
            int iA = aVar.a();
            for (int i6 = 0; i6 < iA; i6++) {
                e1.b.a aVar2 = this.f44541e;
                p247y7.AbstractC7350t.c(aVar2);
                p042e1.i iVarB = aVar2.b(i6);
                p247y7.AbstractC7350t.c(iVarB);
                if (iVarB.r() != -1 || iVarB.A() || iVarB.t()) {
                    this.f44540d.add(iVarB);
                }
            }
            int size = this.f44540d.size();
            if (size > 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    java.lang.Object obj = this.f44540d.get(i10);
                    p247y7.AbstractC7350t.e(obj, "get(...)");
                    p042e1.i iVar = (p042e1.i) obj;
                    if (iVar.A()) {
                        J(dVar, iVar, true);
                    } else if (iVar.t()) {
                        L(dVar, iVar, true);
                    } else {
                        p042e1.b[] bVarArrA2 = dVar.A();
                        p247y7.AbstractC7350t.c(bVarArrA2);
                        K(dVar, bVarArrA2[iVar.r()], true);
                    }
                }
                this.f44540d.clear();
            } else {
                z6 = true;
            }
        }
        if (!p042e1.d.f44549s.c() || this.f44537a == null) {
            return;
        }
        e1.b.a aVar3 = this.f44541e;
        p247y7.AbstractC7350t.c(aVar3);
        if (aVar3.a() == 0) {
            this.f44542f = true;
            dVar.J(true);
        }
    }

    @Override // e1.d.b
    public void a(e1.d.b bVar) {
        if (bVar instanceof p042e1.b) {
            this.f44537a = null;
            e1.b.a aVar = this.f44541e;
            p247y7.AbstractC7350t.c(aVar);
            aVar.clear();
            p042e1.b bVar2 = (p042e1.b) bVar;
            e1.b.a aVar2 = bVar2.f44541e;
            p247y7.AbstractC7350t.c(aVar2);
            int iA = aVar2.a();
            for (int i6 = 0; i6 < iA; i6++) {
                e1.b.a aVar3 = bVar2.f44541e;
                p247y7.AbstractC7350t.c(aVar3);
                p042e1.i iVarB = aVar3.b(i6);
                e1.b.a aVar4 = bVar2.f44541e;
                p247y7.AbstractC7350t.c(aVar4);
                float fD = aVar4.d(i6);
                e1.b.a aVar5 = this.f44541e;
                p247y7.AbstractC7350t.c(aVar5);
                aVar5.h(iVarB, fD, true);
            }
        }
    }

    @Override // e1.d.b
    public void b(p042e1.i iVar) {
        p247y7.AbstractC7350t.c(iVar);
        float f6 = 1.0f;
        if (iVar.y() != 1) {
            if (iVar.y() == 2) {
                f6 = 1000.0f;
            } else if (iVar.y() == 3) {
                f6 = 1000000.0f;
            } else if (iVar.y() == 4) {
                f6 = 1.0E9f;
            } else if (iVar.y() == 5) {
                f6 = 1.0E12f;
            }
        }
        e1.b.a aVar = this.f44541e;
        p247y7.AbstractC7350t.c(aVar);
        aVar.i(iVar, f6);
    }

    @Override // e1.d.b
    public p042e1.i c(p042e1.d dVar, boolean[] zArr) {
        return A(zArr, null);
    }

    @Override // e1.d.b
    public void clear() {
        e1.b.a aVar = this.f44541e;
        p247y7.AbstractC7350t.c(aVar);
        aVar.clear();
        this.f44537a = null;
        this.f44538b = 0.0f;
    }

    public final p042e1.b d(p042e1.d dVar, int i6) {
        p247y7.AbstractC7350t.f(dVar, "system");
        e1.b.a aVar = this.f44541e;
        p247y7.AbstractC7350t.c(aVar);
        aVar.i(dVar.s(i6, "ep"), 1.0f);
        e1.b.a aVar2 = this.f44541e;
        p247y7.AbstractC7350t.c(aVar2);
        aVar2.i(dVar.s(i6, "em"), -1.0f);
        return this;
    }

    public final p042e1.b e(p042e1.i iVar, int i6) {
        e1.b.a aVar = this.f44541e;
        p247y7.AbstractC7350t.c(aVar);
        aVar.i(iVar, i6);
        return this;
    }

    public final boolean f(p042e1.d dVar) {
        boolean z6;
        p042e1.i iVarG = g(dVar);
        if (iVarG == null) {
            z6 = true;
        } else {
            B(iVarG);
            z6 = false;
        }
        e1.b.a aVar = this.f44541e;
        p247y7.AbstractC7350t.c(aVar);
        if (aVar.a() == 0) {
            this.f44542f = true;
        }
        return z6;
    }

    public final p042e1.i g(p042e1.d dVar) {
        e1.b.a aVar = this.f44541e;
        p247y7.AbstractC7350t.c(aVar);
        int iA = aVar.a();
        p042e1.i iVar = null;
        float f6 = 0.0f;
        float f10 = 0.0f;
        boolean zY = false;
        boolean zY2 = false;
        p042e1.i iVar2 = null;
        for (int i6 = 0; i6 < iA; i6++) {
            e1.b.a aVar2 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar2);
            float fD = aVar2.d(i6);
            e1.b.a aVar3 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar3);
            p042e1.i iVarB = aVar3.b(i6);
            p247y7.AbstractC7350t.c(iVarB);
            if (iVarB.x() == e1.i.b.UNRESTRICTED) {
                if (iVar == null || f6 > fD) {
                    zY = y(iVarB, dVar);
                    f6 = fD;
                    iVar = iVarB;
                } else if (!zY && y(iVarB, dVar)) {
                    f6 = fD;
                    iVar = iVarB;
                    zY = true;
                }
            } else if (iVar == null && fD < 0.0f) {
                if (iVar2 == null || f10 > fD) {
                    zY2 = y(iVarB, dVar);
                    f10 = fD;
                    iVar2 = iVarB;
                } else if (!zY2 && y(iVarB, dVar)) {
                    f10 = fD;
                    iVar2 = iVarB;
                    zY2 = true;
                }
            }
        }
        return iVar == null ? iVar2 : iVar;
    }

    @Override // e1.d.b
    public p042e1.i getKey() {
        return this.f44537a;
    }

    public final p042e1.b h(p042e1.i iVar, p042e1.i iVar2, int i6, float f6, p042e1.i iVar3, p042e1.i iVar4, int i10) {
        float f10;
        p247y7.AbstractC7350t.f(iVar2, "variableB");
        p247y7.AbstractC7350t.f(iVar3, "variableC");
        if (p247y7.AbstractC7350t.b(iVar2, iVar3)) {
            e1.b.a aVar = this.f44541e;
            p247y7.AbstractC7350t.c(aVar);
            aVar.i(iVar, 1.0f);
            e1.b.a aVar2 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar2);
            aVar2.i(iVar4, 1.0f);
            e1.b.a aVar3 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar3);
            aVar3.i(iVar2, -2.0f);
            return this;
        }
        if (f6 == 0.5f) {
            e1.b.a aVar4 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar4);
            aVar4.i(iVar, 1.0f);
            e1.b.a aVar5 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar5);
            aVar5.i(iVar2, -1.0f);
            e1.b.a aVar6 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar6);
            aVar6.i(iVar3, -1.0f);
            e1.b.a aVar7 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar7);
            aVar7.i(iVar4, 1.0f);
            if (i6 > 0 || i10 > 0) {
                f10 = (-i6) + i10;
                this.f44538b = f10;
            }
        } else {
            if (f6 <= 0.0f) {
                e1.b.a aVar8 = this.f44541e;
                p247y7.AbstractC7350t.c(aVar8);
                aVar8.i(iVar, -1.0f);
                e1.b.a aVar9 = this.f44541e;
                p247y7.AbstractC7350t.c(aVar9);
                aVar9.i(iVar2, 1.0f);
                f10 = i6;
            } else if (f6 >= 1.0f) {
                e1.b.a aVar10 = this.f44541e;
                p247y7.AbstractC7350t.c(aVar10);
                aVar10.i(iVar4, -1.0f);
                e1.b.a aVar11 = this.f44541e;
                p247y7.AbstractC7350t.c(aVar11);
                aVar11.i(iVar3, 1.0f);
                f10 = -i10;
            } else {
                e1.b.a aVar12 = this.f44541e;
                p247y7.AbstractC7350t.c(aVar12);
                float f11 = 1;
                float f12 = f11 - f6;
                aVar12.i(iVar, f11 * f12);
                e1.b.a aVar13 = this.f44541e;
                p247y7.AbstractC7350t.c(aVar13);
                float f13 = -1;
                aVar13.i(iVar2, f13 * f12);
                e1.b.a aVar14 = this.f44541e;
                p247y7.AbstractC7350t.c(aVar14);
                aVar14.i(iVar3, f13 * f6);
                e1.b.a aVar15 = this.f44541e;
                p247y7.AbstractC7350t.c(aVar15);
                aVar15.i(iVar4, f11 * f6);
                if (i6 > 0 || i10 > 0) {
                    f10 = ((-i6) * f12) + (i10 * f6);
                }
            }
            this.f44538b = f10;
        }
        return this;
    }

    public final p042e1.b i(p042e1.i iVar, int i6) {
        p247y7.AbstractC7350t.f(iVar, "variable");
        this.f44537a = iVar;
        float f6 = i6;
        iVar.D(f6);
        this.f44538b = f6;
        this.f44542f = true;
        return this;
    }

    @Override // e1.d.b
    public boolean isEmpty() {
        if (this.f44537a == null && this.f44538b == 0.0f) {
            e1.b.a aVar = this.f44541e;
            p247y7.AbstractC7350t.c(aVar);
            if (aVar.a() == 0) {
                return true;
            }
        }
        return false;
    }

    public final p042e1.b j(p042e1.i iVar, p042e1.i iVar2, float f6) {
        e1.b.a aVar = this.f44541e;
        p247y7.AbstractC7350t.c(aVar);
        aVar.i(iVar, -1.0f);
        e1.b.a aVar2 = this.f44541e;
        p247y7.AbstractC7350t.c(aVar2);
        aVar2.i(iVar2, f6);
        return this;
    }

    public final p042e1.b k(p042e1.i iVar, p042e1.i iVar2, p042e1.i iVar3, p042e1.i iVar4, float f6) {
        e1.b.a aVar = this.f44541e;
        p247y7.AbstractC7350t.c(aVar);
        aVar.i(iVar, -1.0f);
        e1.b.a aVar2 = this.f44541e;
        p247y7.AbstractC7350t.c(aVar2);
        aVar2.i(iVar2, 1.0f);
        e1.b.a aVar3 = this.f44541e;
        p247y7.AbstractC7350t.c(aVar3);
        aVar3.i(iVar3, f6);
        e1.b.a aVar4 = this.f44541e;
        p247y7.AbstractC7350t.c(aVar4);
        aVar4.i(iVar4, -f6);
        return this;
    }

    public final p042e1.b l(float f6, float f10, float f11, p042e1.i iVar, p042e1.i iVar2, p042e1.i iVar3, p042e1.i iVar4) {
        this.f44538b = 0.0f;
        if (f10 == 0.0f || f6 == f11) {
            e1.b.a aVar = this.f44541e;
            p247y7.AbstractC7350t.c(aVar);
            aVar.i(iVar, 1.0f);
            e1.b.a aVar2 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar2);
            aVar2.i(iVar2, -1.0f);
            e1.b.a aVar3 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar3);
            aVar3.i(iVar4, 1.0f);
            e1.b.a aVar4 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar4);
            aVar4.i(iVar3, -1.0f);
        } else if (f6 == 0.0f) {
            e1.b.a aVar5 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar5);
            aVar5.i(iVar, 1.0f);
            e1.b.a aVar6 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar6);
            aVar6.i(iVar2, -1.0f);
        } else if (f11 == 0.0f) {
            e1.b.a aVar7 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar7);
            aVar7.i(iVar3, 1.0f);
            e1.b.a aVar8 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar8);
            aVar8.i(iVar4, -1.0f);
        } else {
            float f12 = (f6 / f10) / (f11 / f10);
            e1.b.a aVar9 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar9);
            aVar9.i(iVar, 1.0f);
            e1.b.a aVar10 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar10);
            aVar10.i(iVar2, -1.0f);
            e1.b.a aVar11 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar11);
            aVar11.i(iVar4, f12);
            e1.b.a aVar12 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar12);
            aVar12.i(iVar3, -f12);
        }
        return this;
    }

    public final p042e1.b m(p042e1.i iVar, int i6) {
        e1.b.a aVar;
        float f6;
        if (i6 < 0) {
            this.f44538b = i6 * (-1);
            aVar = this.f44541e;
            p247y7.AbstractC7350t.c(aVar);
            f6 = 1.0f;
        } else {
            this.f44538b = i6;
            aVar = this.f44541e;
            p247y7.AbstractC7350t.c(aVar);
            f6 = -1.0f;
        }
        aVar.i(iVar, f6);
        return this;
    }

    public final p042e1.b n(p042e1.i iVar, p042e1.i iVar2, int i6) {
        boolean z6 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z6 = true;
            }
            this.f44538b = i6;
        }
        if (z6) {
            e1.b.a aVar = this.f44541e;
            p247y7.AbstractC7350t.c(aVar);
            aVar.i(iVar, 1.0f);
            e1.b.a aVar2 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar2);
            aVar2.i(iVar2, -1.0f);
        } else {
            e1.b.a aVar3 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar3);
            aVar3.i(iVar, -1.0f);
            e1.b.a aVar4 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar4);
            aVar4.i(iVar2, 1.0f);
        }
        return this;
    }

    public final p042e1.b o(p042e1.i iVar, p042e1.i iVar2, p042e1.i iVar3, int i6) {
        boolean z6 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z6 = true;
            }
            this.f44538b = i6;
        }
        if (z6) {
            e1.b.a aVar = this.f44541e;
            p247y7.AbstractC7350t.c(aVar);
            aVar.i(iVar, 1.0f);
            e1.b.a aVar2 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar2);
            aVar2.i(iVar2, -1.0f);
            e1.b.a aVar3 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar3);
            aVar3.i(iVar3, -1.0f);
        } else {
            e1.b.a aVar4 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar4);
            aVar4.i(iVar, -1.0f);
            e1.b.a aVar5 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar5);
            aVar5.i(iVar2, 1.0f);
            e1.b.a aVar6 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar6);
            aVar6.i(iVar3, 1.0f);
        }
        return this;
    }

    public final p042e1.b p(p042e1.i iVar, p042e1.i iVar2, p042e1.i iVar3, int i6) {
        boolean z6 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z6 = true;
            }
            this.f44538b = i6;
        }
        if (z6) {
            e1.b.a aVar = this.f44541e;
            p247y7.AbstractC7350t.c(aVar);
            aVar.i(iVar, 1.0f);
            e1.b.a aVar2 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar2);
            aVar2.i(iVar2, -1.0f);
            e1.b.a aVar3 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar3);
            aVar3.i(iVar3, 1.0f);
        } else {
            e1.b.a aVar4 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar4);
            aVar4.i(iVar, -1.0f);
            e1.b.a aVar5 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar5);
            aVar5.i(iVar2, 1.0f);
            e1.b.a aVar6 = this.f44541e;
            p247y7.AbstractC7350t.c(aVar6);
            aVar6.i(iVar3, -1.0f);
        }
        return this;
    }

    public final p042e1.b q(p042e1.i iVar, p042e1.i iVar2, p042e1.i iVar3, p042e1.i iVar4, float f6) {
        e1.b.a aVar = this.f44541e;
        p247y7.AbstractC7350t.c(aVar);
        aVar.i(iVar3, 0.5f);
        e1.b.a aVar2 = this.f44541e;
        p247y7.AbstractC7350t.c(aVar2);
        aVar2.i(iVar4, 0.5f);
        e1.b.a aVar3 = this.f44541e;
        p247y7.AbstractC7350t.c(aVar3);
        aVar3.i(iVar, -0.5f);
        e1.b.a aVar4 = this.f44541e;
        p247y7.AbstractC7350t.c(aVar4);
        aVar4.i(iVar2, -0.5f);
        this.f44538b = -f6;
        return this;
    }

    public final void r() {
        float f6 = this.f44538b;
        if (f6 < 0.0f) {
            this.f44538b = f6 * (-1.0f);
            e1.b.a aVar = this.f44541e;
            p247y7.AbstractC7350t.c(aVar);
            aVar.c();
        }
    }

    public final float s() {
        return this.f44538b;
    }

    public final boolean t() {
        return this.f44542f;
    }

    public java.lang.String toString() {
        return I();
    }

    public final p042e1.i u() {
        return this.f44537a;
    }

    public final e1.b.a v() {
        return this.f44541e;
    }

    public final boolean w() {
        p042e1.i iVar = this.f44537a;
        if (iVar != null) {
            p247y7.AbstractC7350t.c(iVar);
            if (iVar.x() == e1.i.b.UNRESTRICTED || this.f44538b >= 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final boolean x(p042e1.i iVar) {
        e1.b.a aVar = this.f44541e;
        p247y7.AbstractC7350t.c(aVar);
        return aVar.f(iVar);
    }

    public final p042e1.i z(p042e1.i iVar) {
        p247y7.AbstractC7350t.c(iVar);
        return A(null, iVar);
    }
}
