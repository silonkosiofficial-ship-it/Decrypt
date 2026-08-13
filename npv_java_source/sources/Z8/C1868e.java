package Z8;

/* JADX INFO: renamed from: Z8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1868e implements Z8.InterfaceC1869f {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Z8.InterfaceC1869f f16820C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p237x7.l f16821D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final p237x7.p f16822E;

    /* JADX INFO: renamed from: Z8.e$a */
    static final class a implements Z8.InterfaceC1870g {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.O f16824D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1870g f16825E;

        /* JADX INFO: renamed from: Z8.e$a$a, reason: collision with other inner class name */
        static final class C0316a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            /* synthetic */ java.lang.Object f16826F;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            int f16828H;

            C0316a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f16826F = obj;
                this.f16828H |= Integer.MIN_VALUE;
                return Z8.C1868e.a.this.a(null, this);
            }
        }

        a(p247y7.O o6, Z8.InterfaceC1870g interfaceC1870g) {
            this.f16824D = o6;
            this.f16825E = interfaceC1870g;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // Z8.InterfaceC1870g
        public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
            Z8.C1868e.a.C0316a c0316a;
            if (eVar instanceof Z8.C1868e.a.C0316a) {
                c0316a = (Z8.C1868e.a.C0316a) eVar;
                int i6 = c0316a.f16828H;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    c0316a.f16828H = i6 - Integer.MIN_VALUE;
                } else {
                    c0316a = new Z8.C1868e.a.C0316a(eVar);
                }
            } else {
                c0316a = new Z8.C1868e.a.C0316a(eVar);
            }
            java.lang.Object obj2 = c0316a.f16826F;
            java.lang.Object objG = p137n7.b.g();
            int i10 = c0316a.f16828H;
            if (i10 == 0) {
                p087i7.x.b(obj2);
                java.lang.Object objL = Z8.C1868e.this.f16821D.l(obj);
                java.lang.Object obj3 = this.f16824D.f57254C;
                if (obj3 != p009a9.t.f17223a && ((java.lang.Boolean) Z8.C1868e.this.f16822E.u(obj3, objL)).booleanValue()) {
                    return p087i7.M.f46721a;
                }
                this.f16824D.f57254C = objL;
                Z8.InterfaceC1870g interfaceC1870g = this.f16825E;
                c0316a.f16828H = 1;
                if (interfaceC1870g.a(obj, c0316a) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj2);
            }
            return p087i7.M.f46721a;
        }
    }

    public C1868e(Z8.InterfaceC1869f interfaceC1869f, p237x7.l lVar, p237x7.p pVar) {
        this.f16820C = interfaceC1869f;
        this.f16821D = lVar;
        this.f16822E = pVar;
    }

    @Override // Z8.InterfaceC1869f
    public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
        p247y7.O o6 = new p247y7.O();
        o6.f57254C = p009a9.t.f17223a;
        java.lang.Object objB = this.f16820C.b(new Z8.C1868e.a(o6, interfaceC1870g), eVar);
        return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
    }
}
