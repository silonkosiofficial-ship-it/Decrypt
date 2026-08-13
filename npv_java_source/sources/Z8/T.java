package Z8;

/* JADX INFO: loaded from: classes2.dex */
final class T implements Z8.C {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Z8.C f16801C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p237x7.p f16802D;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16803F;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f16805H;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f16803F = obj;
            this.f16805H |= Integer.MIN_VALUE;
            return Z8.T.this.b(null, this);
        }
    }

    public T(Z8.C c6, p237x7.p pVar) {
        this.f16801C = c6;
        this.f16802D = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // Z8.C, Z8.InterfaceC1869f
    public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
        Z8.T.a aVar;
        if (eVar instanceof Z8.T.a) {
            aVar = (Z8.T.a) eVar;
            int i6 = aVar.f16805H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f16805H = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new Z8.T.a(eVar);
            }
        } else {
            aVar = new Z8.T.a(eVar);
        }
        java.lang.Object obj = aVar.f16803F;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f16805H;
        if (i10 == 0) {
            p087i7.x.b(obj);
            Z8.C c6 = this.f16801C;
            Z8.S s6 = new Z8.S(interfaceC1870g, this.f16802D);
            aVar.f16805H = 1;
            if (c6.b(s6, aVar) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
        }
        throw new p087i7.C6665k();
    }

    @Override // Z8.C
    public java.util.List c() {
        return this.f16801C.c();
    }
}
