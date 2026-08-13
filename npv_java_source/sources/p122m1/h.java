package p122m1;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p122m1.e {

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public static final m1.h.a f50445O0 = new m1.h.a(null);

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public static final int f50446P0 = 8;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private int f50452L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private boolean f50453M0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private float f50447G0 = -1.0f;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private int f50448H0 = -1;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private int f50449I0 = -1;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private boolean f50450J0 = true;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private p122m1.d f50451K0 = c0();

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private java.lang.String f50454N0 = "Guideline";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50455a;

        static {
            int[] iArr = new int[m1.d.b.values().length];
            try {
                iArr[m1.d.b.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[m1.d.b.RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[m1.d.b.TOP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[m1.d.b.BOTTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[m1.d.b.BASELINE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[m1.d.b.CENTER.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[m1.d.b.CENTER_X.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[m1.d.b.CENTER_Y.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[m1.d.b.NONE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            f50455a = iArr;
        }
    }

    public h() {
        E().clear();
        E().add(this.f50451K0);
        int length = M().length;
        for (int i6 = 0; i6 < length; i6++) {
            M()[i6] = this.f50451K0;
        }
    }

    @Override // p122m1.e
    public void K1(java.lang.String str) {
        this.f50454N0 = str;
    }

    @Override // p122m1.e
    public boolean Q0() {
        return this.f50453M0;
    }

    @Override // p122m1.e
    public boolean R0() {
        return this.f50453M0;
    }

    @Override // p122m1.e
    public void Z1(p042e1.d dVar, boolean z6) {
        p247y7.AbstractC7350t.f(dVar, "system");
        if (o0() == null) {
            return;
        }
        int iB = dVar.B(this.f50451K0);
        if (this.f50452L0 == 1) {
            V1(iB);
            W1(0);
            p122m1.e eVarO0 = o0();
            p247y7.AbstractC7350t.c(eVarO0);
            m1(eVarO0.w());
            U1(0);
            return;
        }
        V1(0);
        W1(iB);
        p122m1.e eVarO1 = o0();
        p247y7.AbstractC7350t.c(eVarO1);
        U1(eVarO1.B0());
        m1(0);
    }

    public final p122m1.d a2() {
        return this.f50451K0;
    }

    public final int b2() {
        return this.f50452L0;
    }

    public final int c2() {
        return this.f50448H0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    @Override // p122m1.e
    public void d(p042e1.d dVar, boolean z6) {
        boolean z10;
        boolean z11;
        p247y7.AbstractC7350t.f(dVar, "system");
        p122m1.f fVar = (p122m1.f) o0();
        if (fVar == null) {
            return;
        }
        p122m1.d dVarL = fVar.l(m1.d.b.LEFT);
        p122m1.d dVarL2 = fVar.l(m1.d.b.RIGHT);
        if (o0() != null) {
            p122m1.e eVarO0 = o0();
            p247y7.AbstractC7350t.c(eVarO0);
            if (eVarO0.N()[0] == m1.e.b.WRAP_CONTENT) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (this.f50452L0 == 0) {
            dVarL = fVar.l(m1.d.b.TOP);
            dVarL2 = fVar.l(m1.d.b.BOTTOM);
            if (o0() != null) {
                p122m1.e eVarO1 = o0();
                p247y7.AbstractC7350t.c(eVarO1);
                z11 = eVarO1.N()[1] == m1.e.b.WRAP_CONTENT;
            }
            z10 = z11;
        }
        if (this.f50453M0 && this.f50451K0.s()) {
            p042e1.i iVarU = dVar.u(this.f50451K0);
            p247y7.AbstractC7350t.c(iVarU);
            dVar.j(iVarU, this.f50451K0.e());
            if (this.f50448H0 != -1) {
                if (z10) {
                    p042e1.i iVarU2 = dVar.u(dVarL2);
                    p247y7.AbstractC7350t.c(iVarU2);
                    dVar.l(iVarU2, iVarU, 0, 5);
                }
            } else if (this.f50449I0 != -1 && z10) {
                p042e1.i iVarU3 = dVar.u(dVarL2);
                p042e1.i iVarU4 = dVar.u(dVarL);
                p247y7.AbstractC7350t.c(iVarU4);
                dVar.l(iVarU, iVarU4, 0, 5);
                p247y7.AbstractC7350t.c(iVarU3);
                dVar.l(iVarU3, iVarU, 0, 5);
            }
            this.f50453M0 = false;
            return;
        }
        if (this.f50448H0 != -1) {
            p042e1.i iVarU5 = dVar.u(this.f50451K0);
            p042e1.i iVarU6 = dVar.u(dVarL);
            p247y7.AbstractC7350t.c(iVarU5);
            p247y7.AbstractC7350t.c(iVarU6);
            dVar.i(iVarU5, iVarU6, this.f50448H0, 8);
            if (z10) {
                p042e1.i iVarU7 = dVar.u(dVarL2);
                p247y7.AbstractC7350t.c(iVarU7);
                dVar.l(iVarU7, iVarU5, 0, 5);
                return;
            }
            return;
        }
        if (this.f50449I0 == -1) {
            if (this.f50447G0 == -1.0f) {
                return;
            }
            p042e1.i iVarU8 = dVar.u(this.f50451K0);
            p042e1.i iVarU9 = dVar.u(dVarL2);
            e1.d.a aVar = p042e1.d.f44549s;
            p247y7.AbstractC7350t.c(iVarU8);
            p247y7.AbstractC7350t.c(iVarU9);
            dVar.h(aVar.a(dVar, iVarU8, iVarU9, this.f50447G0));
            return;
        }
        p042e1.i iVarU10 = dVar.u(this.f50451K0);
        p042e1.i iVarU11 = dVar.u(dVarL2);
        p247y7.AbstractC7350t.c(iVarU10);
        p247y7.AbstractC7350t.c(iVarU11);
        dVar.i(iVarU10, iVarU11, -this.f50449I0, 8);
        if (z10) {
            p042e1.i iVarU12 = dVar.u(dVarL);
            p247y7.AbstractC7350t.c(iVarU12);
            dVar.l(iVarU10, iVarU12, 0, 5);
            dVar.l(iVarU11, iVarU10, 0, 5);
        }
    }

    public final int d2() {
        return this.f50449I0;
    }

    @Override // p122m1.e
    public boolean e() {
        return true;
    }

    public final float e2() {
        return this.f50447G0;
    }

    public final void f2(int i6) {
        this.f50451K0.y(i6);
        this.f50453M0 = true;
    }

    public final void g2(int i6) {
        if (i6 > -1) {
            this.f50447G0 = -1.0f;
            this.f50448H0 = i6;
            this.f50449I0 = -1;
        }
    }

    public final void h2(int i6) {
        if (i6 > -1) {
            this.f50447G0 = -1.0f;
            this.f50448H0 = -1;
            this.f50449I0 = i6;
        }
    }

    public final void i2(float f6) {
        if (f6 > -1.0f) {
            this.f50447G0 = f6;
            this.f50448H0 = -1;
            this.f50449I0 = -1;
        }
    }

    public final void j2(int i6) {
        if (this.f50452L0 == i6) {
            return;
        }
        this.f50452L0 = i6;
        E().clear();
        this.f50451K0 = this.f50452L0 == 1 ? L() : c0();
        E().add(this.f50451K0);
        int length = M().length;
        for (int i10 = 0; i10 < length; i10++) {
            M()[i10] = this.f50451K0;
        }
    }

    @Override // p122m1.e
    public p122m1.d l(m1.d.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "anchorType");
        int i6 = m1.h.b.f50455a[bVar.ordinal()];
        if (i6 == 1 || i6 == 2) {
            if (this.f50452L0 == 1) {
                return this.f50451K0;
            }
            return null;
        }
        if ((i6 == 3 || i6 == 4) && this.f50452L0 == 0) {
            return this.f50451K0;
        }
        return null;
    }

    @Override // p122m1.e
    public java.lang.String u0() {
        return this.f50454N0;
    }
}
