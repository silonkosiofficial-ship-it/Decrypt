package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class M0 implements p200u.F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p170r.AbstractC7037l f54693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p170r.AbstractC7039n f54694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f54696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p200u.F f54697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f54698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f54699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f54700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p200u.r f54701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p200u.r f54702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p200u.r f54703k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p200u.r f54704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float[] f54705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float[] f54706n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private p200u.C7194v f54707o;

    private M0(p170r.AbstractC7037l abstractC7037l, p170r.AbstractC7039n abstractC7039n, int i6, int i10, p200u.F f6, int i11) {
        this.f54693a = abstractC7037l;
        this.f54694b = abstractC7039n;
        this.f54695c = i6;
        this.f54696d = i10;
        this.f54697e = f6;
        this.f54698f = i11;
    }

    public /* synthetic */ M0(p170r.AbstractC7037l abstractC7037l, p170r.AbstractC7039n abstractC7039n, int i6, int i10, p200u.F f6, int i11, p247y7.AbstractC7342k abstractC7342k) {
        this(abstractC7037l, abstractC7039n, i6, i10, f6, i11);
    }

    private final int h(int i6) {
        int iB = p200u.U.b(this.f54693a, i6, 0, 0, 6, null);
        return iB < -1 ? -(iB + 2) : iB;
    }

    private final float i(int i6) {
        return j(h(i6), i6, false);
    }

    private final float j(int i6, int i10, boolean z6) {
        p200u.F fB;
        float f6;
        p170r.AbstractC7037l abstractC7037l = this.f54693a;
        if (i6 >= abstractC7037l.f53391b - 1) {
            f6 = i10;
        } else {
            int iA = abstractC7037l.a(i6);
            int iA2 = this.f54693a.a(i6 + 1);
            if (i10 == iA) {
                f6 = iA;
            } else {
                int i11 = iA2 - iA;
                p200u.L0 l6 = (p200u.L0) this.f54694b.c(iA);
                if (l6 == null || (fB = l6.b()) == null) {
                    fB = this.f54697e;
                }
                float f10 = i11;
                float fA = fB.a((i10 - iA) / f10);
                if (z6) {
                    return fA;
                }
                f6 = (f10 * fA) + iA;
            }
        }
        return f6 / 1000;
    }

    private final void k(p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        float[] fArr;
        float[] fArr2;
        boolean z6 = this.f54707o != null;
        if (this.f54701i == null) {
            this.f54701i = p200u.AbstractC7191s.g(rVar);
            this.f54702j = p200u.AbstractC7191s.g(rVar3);
            int iB = this.f54693a.b();
            float[] fArr3 = new float[iB];
            for (int i6 = 0; i6 < iB; i6++) {
                fArr3[i6] = this.f54693a.a(i6) / 1000;
            }
            this.f54700h = fArr3;
            int iB2 = this.f54693a.b();
            int[] iArr = new int[iB2];
            for (int i10 = 0; i10 < iB2; i10++) {
                p200u.L0 l6 = (p200u.L0) this.f54694b.c(this.f54693a.a(i10));
                int iA = l6 != null ? l6.a() : this.f54698f;
                if (!p200u.AbstractC7193u.c(iA, p200u.AbstractC7193u.f55068a.a())) {
                    z6 = true;
                }
                iArr[i10] = iA;
            }
            this.f54699g = iArr;
        }
        if (z6) {
            float[] fArr4 = null;
            if (this.f54707o != null) {
                p200u.r rVar4 = this.f54703k;
                if (rVar4 == null) {
                    p247y7.AbstractC7350t.p("lastInitialValue");
                    rVar4 = null;
                }
                if (p247y7.AbstractC7350t.b(rVar4, rVar)) {
                    p200u.r rVar5 = this.f54704l;
                    if (rVar5 == null) {
                        p247y7.AbstractC7350t.p("lastTargetValue");
                        rVar5 = null;
                    }
                    if (p247y7.AbstractC7350t.b(rVar5, rVar2)) {
                        return;
                    }
                }
            }
            this.f54703k = rVar;
            this.f54704l = rVar2;
            int iB3 = (rVar.b() % 2) + rVar.b();
            this.f54705m = new float[iB3];
            this.f54706n = new float[iB3];
            int iB4 = this.f54693a.b();
            float[][] fArr5 = new float[iB4][];
            for (int i11 = 0; i11 < iB4; i11++) {
                int iA2 = this.f54693a.a(i11);
                if (iA2 != 0) {
                    if (iA2 != f()) {
                        fArr = new float[iB3];
                        java.lang.Object objC = this.f54694b.c(iA2);
                        p247y7.AbstractC7350t.c(objC);
                        p200u.r rVarC = ((p200u.L0) objC).c();
                        for (int i12 = 0; i12 < iB3; i12++) {
                            fArr[i12] = rVarC.a(i12);
                        }
                    } else if (this.f54694b.a(iA2)) {
                        fArr = new float[iB3];
                        java.lang.Object objC2 = this.f54694b.c(iA2);
                        p247y7.AbstractC7350t.c(objC2);
                        p200u.r rVarC2 = ((p200u.L0) objC2).c();
                        for (int i13 = 0; i13 < iB3; i13++) {
                            fArr[i13] = rVarC2.a(i13);
                        }
                    } else {
                        fArr2 = new float[iB3];
                        for (int i14 = 0; i14 < iB3; i14++) {
                            fArr2[i14] = rVar2.a(i14);
                        }
                    }
                    fArr2 = fArr;
                } else if (this.f54694b.a(iA2)) {
                    fArr = new float[iB3];
                    java.lang.Object objC3 = this.f54694b.c(iA2);
                    p247y7.AbstractC7350t.c(objC3);
                    p200u.r rVarC3 = ((p200u.L0) objC3).c();
                    for (int i15 = 0; i15 < iB3; i15++) {
                        fArr[i15] = rVarC3.a(i15);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[iB3];
                    for (int i16 = 0; i16 < iB3; i16++) {
                        fArr2[i16] = rVar.a(i16);
                    }
                }
                fArr5[i11] = fArr2;
            }
            int[] iArr2 = this.f54699g;
            if (iArr2 == null) {
                p247y7.AbstractC7350t.p("modes");
                iArr2 = null;
            }
            float[] fArr6 = this.f54700h;
            if (fArr6 == null) {
                p247y7.AbstractC7350t.p("times");
            } else {
                fArr4 = fArr6;
            }
            this.f54707o = new p200u.C7194v(iArr2, fArr4, fArr5);
        }
    }

    @Override // p200u.B0
    public /* synthetic */ boolean a() {
        return p200u.G0.a(this);
    }

    @Override // p200u.B0
    public p200u.r b(long j6, p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        long jB = p200u.C0.b(this, j6 / 1000000);
        if (jB < 0) {
            return rVar3;
        }
        k(rVar, rVar2, rVar3);
        int i6 = 0;
        if (this.f54707o == null) {
            p200u.r rVarD = p200u.C0.d(this, jB - 1, rVar, rVar2, rVar3);
            p200u.r rVarD2 = p200u.C0.d(this, jB, rVar, rVar2, rVar3);
            int iB = rVarD.b();
            while (i6 < iB) {
                p200u.r rVar4 = this.f54702j;
                if (rVar4 == null) {
                    p247y7.AbstractC7350t.p("velocityVector");
                    rVar4 = null;
                }
                rVar4.e(i6, (rVarD.a(i6) - rVarD2.a(i6)) * 1000.0f);
                i6++;
            }
            p200u.r rVar5 = this.f54702j;
            if (rVar5 != null) {
                return rVar5;
            }
            p247y7.AbstractC7350t.p("velocityVector");
            return null;
        }
        float fI = i((int) jB);
        p200u.C7194v c7194v = this.f54707o;
        if (c7194v == null) {
            p247y7.AbstractC7350t.p("arcSpline");
            c7194v = null;
        }
        float[] fArr = this.f54706n;
        if (fArr == null) {
            p247y7.AbstractC7350t.p("slopeArray");
            fArr = null;
        }
        c7194v.b(fI, fArr);
        float[] fArr2 = this.f54706n;
        if (fArr2 == null) {
            p247y7.AbstractC7350t.p("slopeArray");
            fArr2 = null;
        }
        int length = fArr2.length;
        while (i6 < length) {
            p200u.r rVar6 = this.f54702j;
            if (rVar6 == null) {
                p247y7.AbstractC7350t.p("velocityVector");
                rVar6 = null;
            }
            float[] fArr3 = this.f54706n;
            if (fArr3 == null) {
                p247y7.AbstractC7350t.p("slopeArray");
                fArr3 = null;
            }
            rVar6.e(i6, fArr3[i6]);
            i6++;
        }
        p200u.r rVar7 = this.f54702j;
        if (rVar7 != null) {
            return rVar7;
        }
        p247y7.AbstractC7350t.p("velocityVector");
        return null;
    }

    @Override // p200u.B0
    public p200u.r c(long j6, p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        int iB = (int) p200u.C0.b(this, j6 / 1000000);
        if (this.f54694b.a(iB)) {
            java.lang.Object objC = this.f54694b.c(iB);
            p247y7.AbstractC7350t.c(objC);
            return ((p200u.L0) objC).c();
        }
        if (iB >= f()) {
            return rVar2;
        }
        if (iB <= 0) {
            return rVar;
        }
        k(rVar, rVar2, rVar3);
        int i6 = 0;
        if (this.f54707o == null) {
            int iH = h(iB);
            float fJ = j(iH, iB, true);
            int iA = this.f54693a.a(iH);
            if (this.f54694b.a(iA)) {
                java.lang.Object objC2 = this.f54694b.c(iA);
                p247y7.AbstractC7350t.c(objC2);
                rVar = ((p200u.L0) objC2).c();
            }
            int iA2 = this.f54693a.a(iH + 1);
            if (this.f54694b.a(iA2)) {
                java.lang.Object objC3 = this.f54694b.c(iA2);
                p247y7.AbstractC7350t.c(objC3);
                rVar2 = ((p200u.L0) objC3).c();
            }
            p200u.r rVar4 = this.f54701i;
            if (rVar4 == null) {
                p247y7.AbstractC7350t.p("valueVector");
                rVar4 = null;
            }
            int iB2 = rVar4.b();
            while (i6 < iB2) {
                p200u.r rVar5 = this.f54701i;
                if (rVar5 == null) {
                    p247y7.AbstractC7350t.p("valueVector");
                    rVar5 = null;
                }
                rVar5.e(i6, p200u.z0.k(rVar.a(i6), rVar2.a(i6), fJ));
                i6++;
            }
            p200u.r rVar6 = this.f54701i;
            if (rVar6 != null) {
                return rVar6;
            }
            p247y7.AbstractC7350t.p("valueVector");
            return null;
        }
        float fI = i(iB);
        p200u.C7194v c7194v = this.f54707o;
        if (c7194v == null) {
            p247y7.AbstractC7350t.p("arcSpline");
            c7194v = null;
        }
        float[] fArr = this.f54705m;
        if (fArr == null) {
            p247y7.AbstractC7350t.p("posArray");
            fArr = null;
        }
        c7194v.a(fI, fArr);
        float[] fArr2 = this.f54705m;
        if (fArr2 == null) {
            p247y7.AbstractC7350t.p("posArray");
            fArr2 = null;
        }
        int length = fArr2.length;
        while (i6 < length) {
            p200u.r rVar7 = this.f54701i;
            if (rVar7 == null) {
                p247y7.AbstractC7350t.p("valueVector");
                rVar7 = null;
            }
            float[] fArr3 = this.f54705m;
            if (fArr3 == null) {
                p247y7.AbstractC7350t.p("posArray");
                fArr3 = null;
            }
            rVar7.e(i6, fArr3[i6]);
            i6++;
        }
        p200u.r rVar8 = this.f54701i;
        if (rVar8 != null) {
            return rVar8;
        }
        p247y7.AbstractC7350t.p("valueVector");
        return null;
    }

    @Override // p200u.F0
    public int d() {
        return this.f54696d;
    }

    @Override // p200u.B0
    public /* synthetic */ long e(p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return p200u.E0.a(this, rVar, rVar2, rVar3);
    }

    @Override // p200u.F0
    public int f() {
        return this.f54695c;
    }

    @Override // p200u.B0
    public /* synthetic */ p200u.r g(p200u.r rVar, p200u.r rVar2, p200u.r rVar3) {
        return p200u.A0.a(this, rVar, rVar2, rVar3);
    }
}
