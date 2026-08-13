package Z8;

/* JADX INFO: renamed from: Z8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC1874k {

    /* JADX INFO: renamed from: Z8.k$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f16844G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f16845H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z8.InterfaceC1869f interfaceC1869f, p127m7.e eVar) {
            super(2, eVar);
            this.f16845H = interfaceC1869f;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f16844G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                Z8.InterfaceC1869f interfaceC1869f = this.f16845H;
                this.f16844G = 1;
                if (Z8.AbstractC1871h.i(interfaceC1869f, this) == objG) {
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
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((Z8.AbstractC1874k.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new Z8.AbstractC1874k.a(this.f16845H, eVar);
        }
    }

    public static final java.lang.Object a(Z8.InterfaceC1869f interfaceC1869f, p127m7.e eVar) {
        java.lang.Object objB = interfaceC1869f.b(p009a9.s.f17222C, eVar);
        return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
    }

    public static final java.lang.Object b(Z8.InterfaceC1869f interfaceC1869f, p237x7.p pVar, p127m7.e eVar) {
        java.lang.Object objI = Z8.AbstractC1871h.i(Z8.AbstractC1875l.b(Z8.AbstractC1871h.C(interfaceC1869f, pVar), 0, null, 2, null), eVar);
        return objI == p137n7.b.g() ? objI : p087i7.M.f46721a;
    }

    public static final java.lang.Object c(Z8.InterfaceC1870g interfaceC1870g, Z8.InterfaceC1869f interfaceC1869f, p127m7.e eVar) {
        Z8.AbstractC1871h.s(interfaceC1870g);
        java.lang.Object objB = interfaceC1869f.b(interfaceC1870g, eVar);
        return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
    }

    public static final W8.InterfaceC1822z0 d(Z8.InterfaceC1869f interfaceC1869f, W8.N n6) {
        return W8.AbstractC1788i.d(n6, null, null, new Z8.AbstractC1874k.a(interfaceC1869f, null), 3, null);
    }
}
