package p172r1;

/* JADX INFO: loaded from: classes.dex */
public class h extends p172r1.e {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    protected float f53787w0 = -1.0f;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    protected int f53788x0 = -1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    protected int f53789y0 = -1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private p172r1.d f53790z0 = this.f53641C;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private int f53785A0 = 0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private int f53786B0 = 0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f53791a;

        static {
            int[] iArr = new int[r1.d.b.values().length];
            f53791a = iArr;
            try {
                iArr[r1.d.b.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f53791a[r1.d.b.RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f53791a[r1.d.b.TOP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f53791a[r1.d.b.BOTTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f53791a[r1.d.b.BASELINE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f53791a[r1.d.b.CENTER.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f53791a[r1.d.b.CENTER_X.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f53791a[r1.d.b.CENTER_Y.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f53791a[r1.d.b.NONE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.f53649K.clear();
        this.f53649K.add(this.f53790z0);
        int length = this.f53648J.length;
        for (int i6 = 0; i6 < length; i6++) {
            this.f53648J[i6] = this.f53790z0;
        }
    }

    @Override // p172r1.e
    public void J0(p162q1.d dVar) {
        if (G() == null) {
            return;
        }
        int iX = dVar.x(this.f53790z0);
        if (this.f53785A0 == 1) {
            F0(iX);
            G0(0);
            h0(G().v());
            E0(0);
            return;
        }
        F0(0);
        G0(iX);
        E0(G().P());
        h0(0);
    }

    public int K0() {
        return this.f53785A0;
    }

    public int L0() {
        return this.f53788x0;
    }

    public int M0() {
        return this.f53789y0;
    }

    public float N0() {
        return this.f53787w0;
    }

    public void O0(int i6) {
        if (i6 > -1) {
            this.f53787w0 = -1.0f;
            this.f53788x0 = i6;
            this.f53789y0 = -1;
        }
    }

    public void P0(int i6) {
        if (i6 > -1) {
            this.f53787w0 = -1.0f;
            this.f53788x0 = -1;
            this.f53789y0 = i6;
        }
    }

    public void Q0(float f6) {
        if (f6 > -1.0f) {
            this.f53787w0 = f6;
            this.f53788x0 = -1;
            this.f53789y0 = -1;
        }
    }

    public void R0(int i6) {
        if (this.f53785A0 == i6) {
            return;
        }
        this.f53785A0 = i6;
        this.f53649K.clear();
        this.f53790z0 = this.f53785A0 == 1 ? this.f53640B : this.f53641C;
        this.f53649K.add(this.f53790z0);
        int length = this.f53648J.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f53648J[i10] = this.f53790z0;
        }
    }

    @Override // p172r1.e
    public void f(p162q1.d dVar) {
        p172r1.f fVar = (p172r1.f) G();
        if (fVar == null) {
            return;
        }
        p172r1.d dVarM = fVar.m(r1.d.b.LEFT);
        p172r1.d dVarM2 = fVar.m(r1.d.b.RIGHT);
        p172r1.e eVar = this.f53652N;
        boolean z6 = eVar != null && eVar.f53651M[0] == r1.e.b.WRAP_CONTENT;
        if (this.f53785A0 == 0) {
            dVarM = fVar.m(r1.d.b.TOP);
            dVarM2 = fVar.m(r1.d.b.BOTTOM);
            p172r1.e eVar2 = this.f53652N;
            z6 = eVar2 != null && eVar2.f53651M[1] == r1.e.b.WRAP_CONTENT;
        }
        if (this.f53788x0 != -1) {
            p162q1.i iVarQ = dVar.q(this.f53790z0);
            dVar.e(iVarQ, dVar.q(dVarM), this.f53788x0, 8);
            if (z6) {
                dVar.h(dVar.q(dVarM2), iVarQ, 0, 5);
                return;
            }
            return;
        }
        if (this.f53789y0 == -1) {
            if (this.f53787w0 != -1.0f) {
                dVar.d(p162q1.d.s(dVar, dVar.q(this.f53790z0), dVar.q(dVarM2), this.f53787w0));
                return;
            }
            return;
        }
        p162q1.i iVarQ2 = dVar.q(this.f53790z0);
        p162q1.i iVarQ3 = dVar.q(dVarM2);
        dVar.e(iVarQ2, iVarQ3, -this.f53789y0, 8);
        if (z6) {
            dVar.h(iVarQ2, dVar.q(dVarM), 0, 5);
            dVar.h(iVarQ3, iVarQ2, 0, 5);
        }
    }

    @Override // p172r1.e
    public boolean g() {
        return true;
    }

    @Override // p172r1.e
    public p172r1.d m(r1.d.b bVar) {
        switch (r1.h.a.f53791a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f53785A0 == 1) {
                    return this.f53790z0;
                }
                break;
            case 3:
            case 4:
                if (this.f53785A0 == 0) {
                    return this.f53790z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new java.lang.AssertionError(bVar.name());
    }
}
