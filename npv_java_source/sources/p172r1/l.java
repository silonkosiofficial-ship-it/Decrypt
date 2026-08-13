package p172r1;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends p172r1.j {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f53806y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f53807z0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private int f53795A0 = 0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private int f53796B0 = 0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private int f53797C0 = 0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private int f53798D0 = 0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private int f53799E0 = 0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private int f53800F0 = 0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private boolean f53801G0 = false;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private int f53802H0 = 0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private int f53803I0 = 0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    protected s1.b.a f53804J0 = new s1.b.a();

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    p182s1.b.InterfaceC0704b f53805K0 = null;

    public void K0(boolean z6) {
        int i6 = this.f53797C0;
        if (i6 > 0 || this.f53798D0 > 0) {
            if (z6) {
                this.f53799E0 = this.f53798D0;
                this.f53800F0 = i6;
            } else {
                this.f53799E0 = i6;
                this.f53800F0 = this.f53798D0;
            }
        }
    }

    public void L0() {
        for (int i6 = 0; i6 < this.f53793x0; i6++) {
            p172r1.e eVar = this.f53792w0[i6];
            if (eVar != null) {
                eVar.q0(true);
            }
        }
    }

    public int M0() {
        return this.f53803I0;
    }

    public int N0() {
        return this.f53802H0;
    }

    public int O0() {
        return this.f53807z0;
    }

    public int P0() {
        return this.f53799E0;
    }

    public int Q0() {
        return this.f53800F0;
    }

    public int R0() {
        return this.f53806y0;
    }

    public abstract void S0(int i6, int i10, int i11, int i12);

    protected void T0(p172r1.e eVar, r1.e.b bVar, int i6, r1.e.b bVar2, int i10) {
        while (this.f53805K0 == null && G() != null) {
            this.f53805K0 = ((p172r1.f) G()).U0();
        }
        s1.b.a aVar = this.f53804J0;
        aVar.f54044a = bVar;
        aVar.f54045b = bVar2;
        aVar.f54046c = i6;
        aVar.f54047d = i10;
        this.f53805K0.b(eVar, aVar);
        eVar.E0(this.f53804J0.f54048e);
        eVar.h0(this.f53804J0.f54049f);
        eVar.g0(this.f53804J0.f54051h);
        eVar.b0(this.f53804J0.f54050g);
    }

    protected boolean U0() {
        p172r1.e eVar = this.f53652N;
        p182s1.b.InterfaceC0704b interfaceC0704bU0 = eVar != null ? ((p172r1.f) eVar).U0() : null;
        if (interfaceC0704bU0 == null) {
            return false;
        }
        for (int i6 = 0; i6 < this.f53793x0; i6++) {
            p172r1.e eVar2 = this.f53792w0[i6];
            if (eVar2 != null && !(eVar2 instanceof p172r1.h)) {
                r1.e.b bVarS = eVar2.s(0);
                r1.e.b bVarS2 = eVar2.s(1);
                r1.e.b bVar = r1.e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar || eVar2.f53687l == 1 || bVarS2 != bVar || eVar2.f53689m == 1) {
                    if (bVarS == bVar) {
                        bVarS = r1.e.b.WRAP_CONTENT;
                    }
                    if (bVarS2 == bVar) {
                        bVarS2 = r1.e.b.WRAP_CONTENT;
                    }
                    s1.b.a aVar = this.f53804J0;
                    aVar.f54044a = bVarS;
                    aVar.f54045b = bVarS2;
                    aVar.f54046c = eVar2.P();
                    this.f53804J0.f54047d = eVar2.v();
                    interfaceC0704bU0.b(eVar2, this.f53804J0);
                    eVar2.E0(this.f53804J0.f54048e);
                    eVar2.h0(this.f53804J0.f54049f);
                    eVar2.b0(this.f53804J0.f54050g);
                }
            }
        }
        return true;
    }

    public boolean V0() {
        return this.f53801G0;
    }

    protected void W0(boolean z6) {
        this.f53801G0 = z6;
    }

    public void X0(int i6, int i10) {
        this.f53802H0 = i6;
        this.f53803I0 = i10;
    }

    public void Y0(int i6) {
        this.f53795A0 = i6;
        this.f53806y0 = i6;
        this.f53796B0 = i6;
        this.f53807z0 = i6;
        this.f53797C0 = i6;
        this.f53798D0 = i6;
    }

    public void Z0(int i6) {
        this.f53807z0 = i6;
    }

    @Override // p172r1.j, p172r1.i
    public void a(p172r1.f fVar) {
        L0();
    }

    public void a1(int i6) {
        this.f53798D0 = i6;
    }

    public void b1(int i6) {
        this.f53795A0 = i6;
        this.f53799E0 = i6;
    }

    public void c1(int i6) {
        this.f53796B0 = i6;
        this.f53800F0 = i6;
    }

    public void d1(int i6) {
        this.f53797C0 = i6;
        this.f53799E0 = i6;
        this.f53800F0 = i6;
    }

    public void e1(int i6) {
        this.f53806y0 = i6;
    }
}
