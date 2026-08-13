package D0;

/* JADX INFO: renamed from: D0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0885d implements D0.InterfaceC0896o, D0.M {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final F0.F f1823C;

    /* JADX INFO: renamed from: D0.d$a */
    public static final class a implements D0.K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.util.Map f1826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p237x7.l f1827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p237x7.l f1828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ D0.C0885d f1829f;

        a(int i6, int i10, java.util.Map map, p237x7.l lVar, p237x7.l lVar2, D0.C0885d c0885d) {
            this.f1828e = lVar2;
            this.f1829f = c0885d;
            this.f1824a = i6;
            this.f1825b = i10;
            this.f1826c = map;
            this.f1827d = lVar;
        }

        @Override // D0.K
        public java.util.Map f() {
            return this.f1826c;
        }

        @Override // D0.K
        public int getHeight() {
            return this.f1825b;
        }

        @Override // D0.K
        public int getWidth() {
            return this.f1824a;
        }

        @Override // D0.K
        public void k() {
            this.f1828e.l(this.f1829f.k().s1());
        }

        @Override // D0.K
        public p237x7.l l() {
            return this.f1827d;
        }
    }

    public C0885d(F0.F f6, D0.InterfaceC0884c interfaceC0884c) {
        this.f1823C = f6;
    }

    @Override // D0.InterfaceC0896o
    public boolean A0() {
        return false;
    }

    @Override // Y0.e
    public float B0(float f6) {
        return this.f1823C.B0(f6);
    }

    @Override // Y0.e
    public int K0(long j6) {
        return this.f1823C.K0(j6);
    }

    @Override // Y0.n
    public long O(float f6) {
        return this.f1823C.O(f6);
    }

    @Override // D0.M
    public D0.K O0(int i6, int i10, java.util.Map map, p237x7.l lVar, p237x7.l lVar2) {
        if (!((i6 & (-16777216)) == 0 && ((-16777216) & i10) == 0)) {
            C0.a.b("Size(" + i6 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new D0.C0885d.a(i6, i10, map, lVar, lVar2, this);
    }

    @Override // Y0.e
    public long P(long j6) {
        return this.f1823C.P(j6);
    }

    @Override // Y0.e
    public int S0(float f6) {
        return this.f1823C.S0(f6);
    }

    @Override // Y0.n
    public float X(long j6) {
        return this.f1823C.X(j6);
    }

    @Override // Y0.e
    public long b1(long j6) {
        return this.f1823C.b1(j6);
    }

    public final D0.InterfaceC0884c f() {
        return null;
    }

    @Override // D0.M
    public D0.K f0(int i6, int i10, java.util.Map map, p237x7.l lVar) {
        return this.f1823C.f0(i6, i10, map, lVar);
    }

    @Override // Y0.e
    public float g1(long j6) {
        return this.f1823C.g1(j6);
    }

    @Override // Y0.e
    public float getDensity() {
        return this.f1823C.getDensity();
    }

    @Override // D0.InterfaceC0896o
    public Y0.v getLayoutDirection() {
        return this.f1823C.getLayoutDirection();
    }

    public final F0.F k() {
        return this.f1823C;
    }

    @Override // Y0.e
    public long k0(float f6) {
        return this.f1823C.k0(f6);
    }

    @Override // Y0.e
    public float o0(int i6) {
        return this.f1823C.o0(i6);
    }

    @Override // Y0.e
    public float q0(float f6) {
        return this.f1823C.q0(f6);
    }

    public long s() {
        F0.U uJ2 = this.f1823C.j2();
        p247y7.AbstractC7350t.c(uJ2);
        D0.K kQ1 = uJ2.q1();
        return Y0.u.a(kQ1.getWidth(), kQ1.getHeight());
    }

    public final void t(D0.InterfaceC0884c interfaceC0884c) {
    }

    @Override // Y0.n
    public float v0() {
        return this.f1823C.v0();
    }
}
