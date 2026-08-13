package Z8;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class w {

    public static final class a implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f16979C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f16980D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.q f16981E;

        public a(Z8.InterfaceC1869f interfaceC1869f, Z8.InterfaceC1869f interfaceC1869f2, p237x7.q qVar) {
            this.f16979C = interfaceC1869f;
            this.f16980D = interfaceC1869f2;
            this.f16981E = qVar;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objA = p009a9.l.a(interfaceC1870g, new Z8.InterfaceC1869f[]{this.f16979C, this.f16980D}, Z8.w.d(), new Z8.w.b(this.f16981E, null), eVar);
            return objA == p137n7.b.g() ? objA : p087i7.M.f46721a;
        }
    }

    static final class b extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f16982G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f16983H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16984I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.q f16985J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p237x7.q qVar, p127m7.e eVar) {
            super(3, eVar);
            this.f16985J = qVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            Z8.InterfaceC1870g interfaceC1870g;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f16982G;
            if (i6 != 0) {
                if (i6 == 1) {
                    interfaceC1870g = (Z8.InterfaceC1870g) this.f16983H;
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
            interfaceC1870g = (Z8.InterfaceC1870g) this.f16983H;
            java.lang.Object[] objArr = (java.lang.Object[]) this.f16984I;
            p237x7.q qVar = this.f16985J;
            java.lang.Object obj2 = objArr[0];
            java.lang.Object obj3 = objArr[1];
            this.f16983H = interfaceC1870g;
            this.f16982G = 1;
            obj = qVar.j(obj2, obj3, this);
            if (obj == objG) {
                return objG;
            }
            this.f16983H = null;
            this.f16982G = 2;
            if (interfaceC1870g.a(obj, this) == objG) {
                return objG;
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(Z8.InterfaceC1870g interfaceC1870g, java.lang.Object[] objArr, p127m7.e eVar) {
            Z8.w.b bVar = new Z8.w.b(this.f16985J, eVar);
            bVar.f16983H = interfaceC1870g;
            bVar.f16984I = objArr;
            return bVar.B(p087i7.M.f46721a);
        }
    }

    static final class c implements p237x7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final Z8.w.c f16986C = new Z8.w.c();

        c() {
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Void b() {
            return null;
        }
    }

    public static final Z8.InterfaceC1869f b(Z8.InterfaceC1869f interfaceC1869f, Z8.InterfaceC1869f interfaceC1869f2, p237x7.q qVar) {
        return Z8.AbstractC1871h.y(interfaceC1869f, interfaceC1869f2, qVar);
    }

    public static final Z8.InterfaceC1869f c(Z8.InterfaceC1869f interfaceC1869f, Z8.InterfaceC1869f interfaceC1869f2, p237x7.q qVar) {
        return new Z8.w.a(interfaceC1869f, interfaceC1869f2, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p237x7.a d() {
        return Z8.w.c.f16986C;
    }
}
