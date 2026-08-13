package Z8;

/* JADX INFO: loaded from: classes2.dex */
final class L implements Z8.I {

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f16765G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f16766H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ Z8.N f16767I;

        /* JADX INFO: renamed from: Z8.L$a$a, reason: collision with other inner class name */
        static final class C0313a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ p247y7.K f16768C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f16769D;

            /* JADX INFO: renamed from: Z8.L$a$a$a, reason: collision with other inner class name */
            static final class C0314a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f16770F;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                int f16772H;

                C0314a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f16770F = obj;
                    this.f16772H |= Integer.MIN_VALUE;
                    return Z8.L.a.C0313a.this.b(0, this);
                }
            }

            C0313a(p247y7.K k6, Z8.InterfaceC1870g interfaceC1870g) {
                this.f16768C = k6;
                this.f16769D = interfaceC1870g;
            }

            @Override // Z8.InterfaceC1870g
            public /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                return b(((java.lang.Number) obj).intValue(), eVar);
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final java.lang.Object b(int i6, p127m7.e eVar) {
                Z8.L.a.C0313a.C0314a c0314a;
                if (eVar instanceof Z8.L.a.C0313a.C0314a) {
                    c0314a = (Z8.L.a.C0313a.C0314a) eVar;
                    int i10 = c0314a.f16772H;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0314a.f16772H = i10 - Integer.MIN_VALUE;
                    } else {
                        c0314a = new Z8.L.a.C0313a.C0314a(eVar);
                    }
                } else {
                    c0314a = new Z8.L.a.C0313a.C0314a(eVar);
                }
                java.lang.Object obj = c0314a.f16770F;
                java.lang.Object objG = p137n7.b.g();
                int i11 = c0314a.f16772H;
                if (i11 == 0) {
                    p087i7.x.b(obj);
                    if (i6 > 0) {
                        p247y7.K k6 = this.f16768C;
                        if (!k6.f57250C) {
                            k6.f57250C = true;
                            Z8.InterfaceC1870g interfaceC1870g = this.f16769D;
                            Z8.G g6 = Z8.G.START;
                            c0314a.f16772H = 1;
                            if (interfaceC1870g.a(g6, c0314a) == objG) {
                                return objG;
                            }
                        }
                    }
                    return p087i7.M.f46721a;
                }
                if (i11 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z8.N n6, p127m7.e eVar) {
            super(2, eVar);
            this.f16767I = n6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f16765G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                Z8.InterfaceC1870g interfaceC1870g = (Z8.InterfaceC1870g) this.f16766H;
                p247y7.K k6 = new p247y7.K();
                Z8.N n6 = this.f16767I;
                Z8.L.a.C0313a c0313a = new Z8.L.a.C0313a(k6, interfaceC1870g);
                this.f16765G = 1;
                if (n6.b(c0313a, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            throw new p087i7.C6665k();
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            return ((Z8.L.a) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            Z8.L.a aVar = new Z8.L.a(this.f16767I, eVar);
            aVar.f16766H = obj;
            return aVar;
        }
    }

    @Override // Z8.I
    public Z8.InterfaceC1869f a(Z8.N n6) {
        return Z8.AbstractC1871h.x(new Z8.L.a(n6, null));
    }

    public java.lang.String toString() {
        return "SharingStarted.Lazily";
    }
}
