package p230x;

/* JADX INFO: loaded from: classes.dex */
public final class u implements p230x.t, Y0.e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ Y0.e f56586C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f56587D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f56588E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p059f9.a f56589F = p059f9.g.a(false);

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f56590F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f56591G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f56593I;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f56591G = obj;
            this.f56593I |= Integer.MIN_VALUE;
            return p230x.u.this.s(this);
        }
    }

    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f56594F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f56595G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f56597I;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f56595G = obj;
            this.f56597I |= Integer.MIN_VALUE;
            return p230x.u.this.j0(this);
        }
    }

    public u(Y0.e eVar) {
        this.f56586C = eVar;
    }

    @Override // Y0.e
    public float B0(float f6) {
        return this.f56586C.B0(f6);
    }

    @Override // Y0.e
    public int K0(long j6) {
        return this.f56586C.K0(j6);
    }

    @Override // Y0.n
    public long O(float f6) {
        return this.f56586C.O(f6);
    }

    @Override // Y0.e
    public long P(long j6) {
        return this.f56586C.P(j6);
    }

    @Override // Y0.e
    public int S0(float f6) {
        return this.f56586C.S0(f6);
    }

    @Override // Y0.n
    public float X(long j6) {
        return this.f56586C.X(j6);
    }

    @Override // Y0.e
    public long b1(long j6) {
        return this.f56586C.b1(j6);
    }

    public final void f() {
        this.f56588E = true;
        p059f9.a.C0508a.c(this.f56589F, null, 1, null);
    }

    @Override // Y0.e
    public float g1(long j6) {
        return this.f56586C.g1(j6);
    }

    @Override // Y0.e
    public float getDensity() {
        return this.f56586C.getDensity();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p230x.t
    public java.lang.Object j0(p127m7.e eVar) {
        x.u.b bVar;
        p230x.u uVar;
        if (eVar instanceof x.u.b) {
            bVar = (x.u.b) eVar;
            int i6 = bVar.f56597I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.f56597I = i6 - Integer.MIN_VALUE;
            } else {
                bVar = new x.u.b(eVar);
            }
        } else {
            bVar = new x.u.b(eVar);
        }
        java.lang.Object obj = bVar.f56595G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = bVar.f56597I;
        if (i10 == 0) {
            p087i7.x.b(obj);
            if (this.f56587D || this.f56588E) {
                uVar = this;
            } else {
                p059f9.a aVar = this.f56589F;
                bVar.f56594F = this;
                bVar.f56597I = 1;
                if (p059f9.a.C0508a.a(aVar, null, bVar, 1, null) == objG) {
                    return objG;
                }
                uVar = this;
            }
            return p147o7.b.a(uVar.f56587D);
        }
        if (i10 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uVar = (p230x.u) bVar.f56594F;
        p087i7.x.b(obj);
        p059f9.a.C0508a.c(uVar.f56589F, null, 1, null);
        return p147o7.b.a(uVar.f56587D);
    }

    public final void k() {
        this.f56587D = true;
        p059f9.a.C0508a.c(this.f56589F, null, 1, null);
    }

    @Override // Y0.e
    public long k0(float f6) {
        return this.f56586C.k0(f6);
    }

    @Override // Y0.e
    public float o0(int i6) {
        return this.f56586C.o0(i6);
    }

    @Override // Y0.e
    public float q0(float f6) {
        return this.f56586C.q0(f6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object s(p127m7.e eVar) {
        x.u.a aVar;
        p230x.u uVar;
        if (eVar instanceof x.u.a) {
            aVar = (x.u.a) eVar;
            int i6 = aVar.f56593I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f56593I = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new x.u.a(eVar);
            }
        } else {
            aVar = new x.u.a(eVar);
        }
        java.lang.Object obj = aVar.f56591G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f56593I;
        if (i10 == 0) {
            p087i7.x.b(obj);
            p059f9.a aVar2 = this.f56589F;
            aVar.f56590F = this;
            aVar.f56593I = 1;
            if (p059f9.a.C0508a.a(aVar2, null, aVar, 1, null) == objG) {
                return objG;
            }
            uVar = this;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = (p230x.u) aVar.f56590F;
            p087i7.x.b(obj);
        }
        uVar.f56587D = false;
        uVar.f56588E = false;
        return p087i7.M.f46721a;
    }

    @Override // Y0.n
    public float v0() {
        return this.f56586C.v0();
    }
}
