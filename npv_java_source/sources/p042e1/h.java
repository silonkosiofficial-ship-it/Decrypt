package p042e1;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p042e1.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e1.h.a f44578o = new e1.h.a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f44579p = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p042e1.c f44580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f44581j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p042e1.i[] f44582k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p042e1.i[] f44583l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f44584m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e1.h.b f44585n;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p042e1.i f44586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p042e1.h f44587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p042e1.h f44588c;

        public b(p042e1.h hVar, p042e1.h hVar2) {
            p247y7.AbstractC7350t.f(hVar2, "row");
            this.f44588c = hVar;
            this.f44587b = hVar2;
        }

        public final boolean a(p042e1.i iVar, float f6) {
            p247y7.AbstractC7350t.f(iVar, "other");
            p042e1.i iVar2 = this.f44586a;
            p247y7.AbstractC7350t.c(iVar2);
            boolean z6 = true;
            if (!iVar2.q()) {
                for (int i6 = 0; i6 < 9; i6++) {
                    float f10 = iVar.s()[i6];
                    if (f10 == 0.0f) {
                        p042e1.i iVar3 = this.f44586a;
                        p247y7.AbstractC7350t.c(iVar3);
                        iVar3.s()[i6] = 0.0f;
                    } else {
                        float f11 = f10 * f6;
                        if (java.lang.Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        p042e1.i iVar4 = this.f44586a;
                        p247y7.AbstractC7350t.c(iVar4);
                        iVar4.s()[i6] = f11;
                    }
                }
                return true;
            }
            for (int i10 = 0; i10 < 9; i10++) {
                p042e1.i iVar5 = this.f44586a;
                p247y7.AbstractC7350t.c(iVar5);
                float[] fArrS = iVar5.s();
                fArrS[i10] = fArrS[i10] + (iVar.s()[i10] * f6);
                p042e1.i iVar6 = this.f44586a;
                p247y7.AbstractC7350t.c(iVar6);
                if (java.lang.Math.abs(iVar6.s()[i10]) < 1.0E-4f) {
                    p042e1.i iVar7 = this.f44586a;
                    p247y7.AbstractC7350t.c(iVar7);
                    iVar7.s()[i10] = 0.0f;
                } else {
                    z6 = false;
                }
            }
            if (z6) {
                p042e1.h hVar = this.f44588c;
                p042e1.i iVar8 = this.f44586a;
                p247y7.AbstractC7350t.c(iVar8);
                hVar.P(iVar8);
            }
            return false;
        }

        public final void b(p042e1.i iVar) {
            this.f44586a = iVar;
        }

        public final boolean c() {
            for (int i6 = 8; -1 < i6; i6--) {
                p042e1.i iVar = this.f44586a;
                p247y7.AbstractC7350t.c(iVar);
                float f6 = iVar.s()[i6];
                if (f6 > 0.0f) {
                    return false;
                }
                if (f6 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(p042e1.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "other");
            for (int i6 = 8; -1 < i6; i6--) {
                float f6 = iVar.s()[i6];
                p042e1.i iVar2 = this.f44586a;
                p247y7.AbstractC7350t.c(iVar2);
                float f10 = iVar2.s()[i6];
                if (f10 != f6) {
                    return f10 < f6;
                }
            }
            return false;
        }

        public final void e() {
            p042e1.i iVar = this.f44586a;
            p247y7.AbstractC7350t.c(iVar);
            p097j7.AbstractC6872n.y(iVar.s(), 0.0f, 0, 0, 6, null);
        }

        public java.lang.String toString() {
            java.lang.String str = "[ ";
            if (this.f44586a != null) {
                for (int i6 = 0; i6 < 9; i6++) {
                    p042e1.i iVar = this.f44586a;
                    p247y7.AbstractC7350t.c(iVar);
                    str = str + iVar.s()[i6] + " ";
                }
            }
            return str + "] " + this.f44586a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p042e1.c cVar) {
        super(cVar);
        p247y7.AbstractC7350t.f(cVar, "mCache");
        this.f44580i = cVar;
        this.f44581j = 128;
        this.f44582k = new p042e1.i[128];
        this.f44583l = new p042e1.i[128];
        this.f44585n = new e1.h.b(this, this);
    }

    private final void O(p042e1.i iVar) {
        int i6 = this.f44584m + 1;
        p042e1.i[] iVarArr = this.f44582k;
        if (i6 > iVarArr.length) {
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(iVarArr, iVarArr.length * 2);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
            p042e1.i[] iVarArr2 = (p042e1.i[]) objArrCopyOf;
            this.f44582k = iVarArr2;
            java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
            p247y7.AbstractC7350t.e(objArrCopyOf2, "copyOf(...)");
            this.f44583l = (p042e1.i[]) objArrCopyOf2;
        }
        p042e1.i[] iVarArr3 = this.f44582k;
        int i10 = this.f44584m;
        iVarArr3[i10] = iVar;
        int i11 = i10 + 1;
        this.f44584m = i11;
        if (i11 > 1) {
            p042e1.i iVar2 = iVarArr3[i10];
            p247y7.AbstractC7350t.c(iVar2);
            if (iVar2.o() > iVar.o()) {
                int i12 = this.f44584m;
                for (int i13 = 0; i13 < i12; i13++) {
                    this.f44583l[i13] = this.f44582k[i13];
                }
                p097j7.AbstractC6872n.I((java.lang.Comparable[]) p097j7.AbstractC6872n.W(this.f44583l).toArray(new p042e1.i[0]), 0, this.f44584m);
                int i14 = this.f44584m;
                for (int i15 = 0; i15 < i14; i15++) {
                    this.f44582k[i15] = this.f44583l[i15];
                }
            }
        }
        iVar.G(true);
        iVar.i(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(p042e1.i iVar) {
        int i6 = this.f44584m;
        int i10 = 0;
        while (i10 < i6) {
            if (p247y7.AbstractC7350t.b(this.f44582k[i10], iVar)) {
                int i11 = this.f44584m - 1;
                while (i10 < i11) {
                    p042e1.i[] iVarArr = this.f44582k;
                    int i12 = i10 + 1;
                    iVarArr[i10] = iVarArr[i12];
                    i10 = i12;
                }
                this.f44584m--;
                iVar.G(false);
                return;
            }
            i10++;
        }
    }

    @Override // p042e1.b
    public void K(p042e1.d dVar, p042e1.b bVar, boolean z6) {
        p247y7.AbstractC7350t.c(bVar);
        p042e1.i iVarU = bVar.u();
        if (iVarU == null) {
            return;
        }
        e1.b.a aVarV = bVar.v();
        p247y7.AbstractC7350t.c(aVarV);
        int iA = aVarV.a();
        for (int i6 = 0; i6 < iA; i6++) {
            p042e1.i iVarB = aVarV.b(i6);
            float fD = aVarV.d(i6);
            this.f44585n.b(iVarB);
            if (this.f44585n.a(iVarU, fD)) {
                p247y7.AbstractC7350t.c(iVarB);
                O(iVarB);
            }
            D(s() + (bVar.s() * fD));
        }
        P(iVarU);
    }

    @Override // p042e1.b, e1.d.b
    public void b(p042e1.i iVar) {
        this.f44585n.b(iVar);
        this.f44585n.e();
        p247y7.AbstractC7350t.c(iVar);
        iVar.s()[iVar.y()] = 1.0f;
        O(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Override // p042e1.b, e1.d.b
    public p042e1.i c(p042e1.d dVar, boolean[] zArr) {
        int i6 = this.f44584m;
        int i10 = -1;
        for (int i11 = 0; i11 < i6; i11++) {
            p042e1.i iVar = this.f44582k[i11];
            p247y7.AbstractC7350t.c(iVar);
            p247y7.AbstractC7350t.c(zArr);
            if (!zArr[iVar.o()]) {
                this.f44585n.b(iVar);
                e1.h.b bVar = this.f44585n;
                if (i10 != -1) {
                    p042e1.i iVar2 = this.f44582k[i10];
                    p247y7.AbstractC7350t.c(iVar2);
                    if (bVar.d(iVar2)) {
                        i10 = i11;
                    }
                } else if (bVar.c()) {
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f44582k[i10];
    }

    @Override // p042e1.b, e1.d.b
    public void clear() {
        this.f44584m = 0;
        D(0.0f);
    }

    @Override // p042e1.b, e1.d.b
    public boolean isEmpty() {
        return this.f44584m == 0;
    }

    @Override // p042e1.b
    public java.lang.String toString() {
        java.lang.String str = " goal -> (" + s() + ") : ";
        int i6 = this.f44584m;
        for (int i10 = 0; i10 < i6; i10++) {
            p042e1.i iVar = this.f44582k[i10];
            p247y7.AbstractC7350t.c(iVar);
            this.f44585n.b(iVar);
            str = str + this.f44585n + " ";
        }
        return str;
    }
}
