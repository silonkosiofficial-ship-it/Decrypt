package p047e7;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements io.ktor.utils.io.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p149o9.h f44752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p127m7.i f44753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.ktor.utils.io.n f44754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p149o9.a f44755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final W8.InterfaceC1819y f44756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p127m7.i f44757g;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f44758F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f44759G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f44760H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f44762J;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f44760H = obj;
            this.f44762J |= Integer.MIN_VALUE;
            return p047e7.b.this.f(0, this);
        }
    }

    /* JADX INFO: renamed from: e7.b$b, reason: collision with other inner class name */
    static final class C0499b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f44763G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f44765I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0499b(int i6, p127m7.e eVar) {
            super(2, eVar);
            this.f44765I = i6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f44763G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            long jI0 = 0;
            while (p037d7.d.d(p047e7.b.this.f44755e) < this.f44765I && jI0 >= 0) {
                try {
                    jI0 = p047e7.b.this.f44752b.I0(p047e7.b.this.f44755e, Long.MAX_VALUE);
                } catch (java.io.EOFException unused) {
                    jI0 = -1;
                }
            }
            if (jI0 == -1) {
                p047e7.b.this.f44752b.close();
                p047e7.b.this.g().K0();
                p047e7.b.this.f44754d = new io.ktor.utils.io.n(null);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((p047e7.b.C0499b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p047e7.b.this.new C0499b(this.f44765I, eVar);
        }
    }

    public b(p149o9.h hVar, p127m7.i iVar) {
        p247y7.AbstractC7350t.f(hVar, "source");
        p247y7.AbstractC7350t.f(iVar, "parent");
        this.f44752b = hVar;
        this.f44753c = iVar;
        this.f44755e = new p149o9.a();
        W8.InterfaceC1819y interfaceC1819yA = W8.C0.a((W8.InterfaceC1822z0) iVar.i(W8.InterfaceC1822z0.f15544h));
        this.f44756f = interfaceC1819yA;
        this.f44757g = iVar.o0(interfaceC1819yA).o0(new W8.M("RawSourceChannel"));
    }

    @Override // io.ktor.utils.io.d
    public java.lang.Throwable a() {
        io.ktor.utils.io.n nVar = this.f44754d;
        if (nVar != null) {
            return nVar.a();
        }
        return null;
    }

    @Override // io.ktor.utils.io.d
    public p149o9.q d() {
        return this.f44755e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.utils.io.d
    public java.lang.Object f(int i6, p127m7.e eVar) {
        e7.b.a aVar;
        p047e7.b bVar;
        if (eVar instanceof e7.b.a) {
            aVar = (e7.b.a) eVar;
            int i10 = aVar.f44762J;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f44762J = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new e7.b.a(eVar);
            }
        } else {
            aVar = new e7.b.a(eVar);
        }
        java.lang.Object obj = aVar.f44760H;
        java.lang.Object objG = p137n7.b.g();
        int i11 = aVar.f44762J;
        if (i11 == 0) {
            p087i7.x.b(obj);
            if (this.f44754d != null) {
                return p147o7.b.a(true);
            }
            p127m7.i iVar = this.f44757g;
            p047e7.b.C0499b c0499b = new p047e7.b.C0499b(i6, null);
            aVar.f44758F = this;
            aVar.f44759G = i6;
            aVar.f44762J = 1;
            if (W8.AbstractC1784g.g(iVar, c0499b, aVar) == objG) {
                return objG;
            }
            bVar = this;
        } else {
            if (i11 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i6 = aVar.f44759G;
            bVar = (p047e7.b) aVar.f44758F;
            p087i7.x.b(obj);
        }
        return p147o7.b.a(p037d7.d.d(bVar.f44755e) >= ((long) i6));
    }

    public final W8.InterfaceC1819y g() {
        return this.f44756f;
    }

    @Override // io.ktor.utils.io.d
    public boolean h() {
        return this.f44754d != null && this.f44755e.j();
    }

    @Override // io.ktor.utils.io.d
    public void k(java.lang.Throwable th) {
        java.lang.String message;
        java.lang.String message2;
        if (this.f44754d != null) {
            return;
        }
        W8.InterfaceC1819y interfaceC1819y = this.f44756f;
        java.lang.String str = "Channel was cancelled";
        if (th == null || (message = th.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        W8.C0.c(interfaceC1819y, message, th);
        this.f44752b.close();
        if (th != null && (message2 = th.getMessage()) != null) {
            str = message2;
        }
        this.f44754d = new io.ktor.utils.io.n(new java.io.IOException(str, th));
    }
}
