package p009a9;

/* JADX INFO: loaded from: classes2.dex */
final class C implements Z8.InterfaceC1870g {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p127m7.i f17149C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Object f17150D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p237x7.p f17151E;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f17152G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f17153H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1870g f17154I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            super(2, eVar);
            this.f17154I = interfaceC1870g;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17152G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                java.lang.Object obj2 = this.f17153H;
                Z8.InterfaceC1870g interfaceC1870g = this.f17154I;
                this.f17152G = 1;
                if (interfaceC1870g.a(obj2, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(java.lang.Object obj, p127m7.e eVar) {
            return ((a9.C.a) x(obj, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            a9.C.a aVar = new a9.C.a(this.f17154I, eVar);
            aVar.f17153H = obj;
            return aVar;
        }
    }

    public C(Z8.InterfaceC1870g interfaceC1870g, p127m7.i iVar) {
        this.f17149C = iVar;
        this.f17150D = p019b9.K.g(iVar);
        this.f17151E = new a9.C.a(interfaceC1870g, null);
    }

    @Override // Z8.InterfaceC1870g
    public java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
        java.lang.Object objB = p009a9.f.b(this.f17149C, obj, this.f17150D, this.f17151E, eVar);
        return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
    }
}
