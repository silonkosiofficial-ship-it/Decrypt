package Z8;

/* JADX INFO: renamed from: Z8.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC1881s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f16913a = p019b9.E.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: Z8.s$a */
    static final class a extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f16914G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f16915H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16916I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.p f16917J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.p pVar, p127m7.e eVar) {
            super(3, eVar);
            this.f16917J = pVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            Z8.InterfaceC1870g interfaceC1870g;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f16914G;
            if (i6 != 0) {
                if (i6 == 1) {
                    interfaceC1870g = (Z8.InterfaceC1870g) this.f16915H;
                    p087i7.x.b(obj);
                } else {
                    if (i6 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                return p087i7.M.f46721a;
            }
            p087i7.x.b(obj);
            interfaceC1870g = (Z8.InterfaceC1870g) this.f16915H;
            java.lang.Object obj2 = this.f16916I;
            p237x7.p pVar = this.f16917J;
            this.f16915H = interfaceC1870g;
            this.f16914G = 1;
            obj = pVar.u(obj2, this);
            if (obj == objG) {
                return objG;
            }
            this.f16915H = null;
            this.f16914G = 2;
            if (interfaceC1870g.a(obj, this) == objG) {
                return objG;
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(Z8.InterfaceC1870g interfaceC1870g, java.lang.Object obj, p127m7.e eVar) {
            Z8.AbstractC1881s.a aVar = new Z8.AbstractC1881s.a(this.f16917J, eVar);
            aVar.f16915H = interfaceC1870g;
            aVar.f16916I = obj;
            return aVar.B(p087i7.M.f46721a);
        }
    }

    public static final Z8.InterfaceC1869f a(Z8.InterfaceC1869f interfaceC1869f, p237x7.p pVar) {
        return Z8.AbstractC1871h.N(interfaceC1869f, new Z8.AbstractC1881s.a(pVar, null));
    }

    public static final Z8.InterfaceC1869f b(java.lang.Iterable iterable) {
        return new p009a9.j(iterable, null, 0, null, 14, null);
    }

    public static final Z8.InterfaceC1869f c(Z8.InterfaceC1869f... interfaceC1869fArr) {
        return Z8.AbstractC1871h.D(p097j7.AbstractC6872n.N(interfaceC1869fArr));
    }

    public static final Z8.InterfaceC1869f d(Z8.InterfaceC1869f interfaceC1869f, p237x7.q qVar) {
        return new p009a9.i(qVar, interfaceC1869f, null, 0, null, 28, null);
    }
}
