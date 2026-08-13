package D0;

/* JADX INFO: loaded from: classes.dex */
public final class r implements D0.M, D0.InterfaceC0896o {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Y0.v f1884C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ D0.InterfaceC0896o f1885D;

    public static final class a implements D0.K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.util.Map f1888c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p237x7.l f1889d;

        a(int i6, int i10, java.util.Map map, p237x7.l lVar) {
            this.f1886a = i6;
            this.f1887b = i10;
            this.f1888c = map;
            this.f1889d = lVar;
        }

        @Override // D0.K
        public java.util.Map f() {
            return this.f1888c;
        }

        @Override // D0.K
        public int getHeight() {
            return this.f1887b;
        }

        @Override // D0.K
        public int getWidth() {
            return this.f1886a;
        }

        @Override // D0.K
        public void k() {
        }

        @Override // D0.K
        public p237x7.l l() {
            return this.f1889d;
        }
    }

    public r(D0.InterfaceC0896o interfaceC0896o, Y0.v vVar) {
        this.f1884C = vVar;
        this.f1885D = interfaceC0896o;
    }

    @Override // D0.InterfaceC0896o
    public boolean A0() {
        return this.f1885D.A0();
    }

    @Override // Y0.e
    public float B0(float f6) {
        return this.f1885D.B0(f6);
    }

    @Override // Y0.e
    public int K0(long j6) {
        return this.f1885D.K0(j6);
    }

    @Override // Y0.n
    public long O(float f6) {
        return this.f1885D.O(f6);
    }

    @Override // D0.M
    public D0.K O0(int i6, int i10, java.util.Map map, p237x7.l lVar, p237x7.l lVar2) {
        boolean z6 = false;
        int iD = E7.j.d(i6, 0);
        int iD2 = E7.j.d(i10, 0);
        if ((iD & (-16777216)) == 0 && ((-16777216) & iD2) == 0) {
            z6 = true;
        }
        if (!z6) {
            C0.a.b("Size(" + iD + " x " + iD2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new D0.r.a(iD, iD2, map, lVar);
    }

    @Override // Y0.e
    public long P(long j6) {
        return this.f1885D.P(j6);
    }

    @Override // Y0.e
    public int S0(float f6) {
        return this.f1885D.S0(f6);
    }

    @Override // Y0.n
    public float X(long j6) {
        return this.f1885D.X(j6);
    }

    @Override // Y0.e
    public long b1(long j6) {
        return this.f1885D.b1(j6);
    }

    @Override // D0.M
    public /* synthetic */ D0.K f0(int i6, int i10, java.util.Map map, p237x7.l lVar) {
        return D0.L.a(this, i6, i10, map, lVar);
    }

    @Override // Y0.e
    public float g1(long j6) {
        return this.f1885D.g1(j6);
    }

    @Override // Y0.e
    public float getDensity() {
        return this.f1885D.getDensity();
    }

    @Override // D0.InterfaceC0896o
    public Y0.v getLayoutDirection() {
        return this.f1884C;
    }

    @Override // Y0.e
    public long k0(float f6) {
        return this.f1885D.k0(f6);
    }

    @Override // Y0.e
    public float o0(int i6) {
        return this.f1885D.o0(i6);
    }

    @Override // Y0.e
    public float q0(float f6) {
        return this.f1885D.q0(f6);
    }

    @Override // Y0.n
    public float v0() {
        return this.f1885D.v0();
    }
}
