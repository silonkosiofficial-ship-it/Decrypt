package Z8;

/* JADX INFO: loaded from: classes2.dex */
public final class S implements Z8.InterfaceC1870g {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Z8.InterfaceC1870g f16794C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p237x7.p f16795D;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f16796F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f16797G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16798H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f16800J;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f16798H = obj;
            this.f16800J |= Integer.MIN_VALUE;
            return Z8.S.this.b(this);
        }
    }

    public S(Z8.InterfaceC1870g interfaceC1870g, p237x7.p pVar) {
        this.f16794C = interfaceC1870g;
        this.f16795D = pVar;
    }

    @Override // Z8.InterfaceC1870g
    public java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
        return this.f16794C.a(obj, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [a9.v] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public final java.lang.Object b(p127m7.e eVar) {
        Z8.S.a aVar;
        p009a9.v vVar;
        Z8.S s6;
        if (eVar instanceof Z8.S.a) {
            aVar = (Z8.S.a) eVar;
            int i6 = aVar.f16800J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f16800J = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new Z8.S.a(eVar);
            }
        } else {
            aVar = new Z8.S.a(eVar);
        }
        java.lang.Object obj = aVar.f16798H;
        java.lang.Object objG = p137n7.b.g();
        ?? r6 = aVar.f16800J;
        try {
            if (r6 != 0) {
                if (r6 == 1) {
                    vVar = (p009a9.v) aVar.f16797G;
                    s6 = (Z8.S) aVar.f16796F;
                    p087i7.x.b(obj);
                } else {
                    if (r6 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                return p087i7.M.f46721a;
            }
            p087i7.x.b(obj);
            vVar = new p009a9.v(this.f16794C, aVar.getContext());
            p237x7.p pVar = this.f16795D;
            aVar.f16796F = this;
            aVar.f16797G = vVar;
            aVar.f16800J = 1;
            if (pVar.u(vVar, aVar) == objG) {
                return objG;
            }
            s6 = this;
            vVar.D();
            Z8.InterfaceC1870g interfaceC1870g = s6.f16794C;
            r6 = interfaceC1870g instanceof Z8.S;
            if (r6 == 0) {
                return p087i7.M.f46721a;
            }
            aVar.f16796F = null;
            aVar.f16797G = null;
            aVar.f16800J = 2;
            if (((Z8.S) interfaceC1870g).b(aVar) == objG) {
                return objG;
            }
            return p087i7.M.f46721a;
        } catch (java.lang.Throwable th) {
            r6.D();
            throw th;
        }
    }
}
