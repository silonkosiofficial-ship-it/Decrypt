package Z8;

/* JADX INFO: renamed from: Z8.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC1880q {

    /* JADX INFO: renamed from: Z8.q$a */
    public static final class a implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f16866C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.q f16867D;

        /* JADX INFO: renamed from: Z8.q$a$a, reason: collision with other inner class name */
        public static final class C0318a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            /* synthetic */ java.lang.Object f16868F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f16869G;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            java.lang.Object f16871I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            java.lang.Object f16872J;

            public C0318a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f16868F = obj;
                this.f16869G |= Integer.MIN_VALUE;
                return Z8.AbstractC1880q.a.this.b(null, this);
            }
        }

        public a(Z8.InterfaceC1869f interfaceC1869f, p237x7.q qVar) {
            this.f16866C = interfaceC1869f;
            this.f16867D = qVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            Z8.AbstractC1880q.a.C0318a c0318a;
            Z8.AbstractC1880q.a aVar;
            if (eVar instanceof Z8.AbstractC1880q.a.C0318a) {
                c0318a = (Z8.AbstractC1880q.a.C0318a) eVar;
                int i6 = c0318a.f16869G;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    c0318a.f16869G = i6 - Integer.MIN_VALUE;
                } else {
                    c0318a = new Z8.AbstractC1880q.a.C0318a(eVar);
                }
            } else {
                c0318a = new Z8.AbstractC1880q.a.C0318a(eVar);
            }
            java.lang.Object objG = c0318a.f16868F;
            java.lang.Object objG2 = p137n7.b.g();
            int i10 = c0318a.f16869G;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC1870g = (Z8.InterfaceC1870g) c0318a.f16872J;
                    aVar = (Z8.AbstractC1880q.a) c0318a.f16871I;
                    p087i7.x.b(objG);
                } else {
                    if (i10 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(objG);
                }
                return p087i7.M.f46721a;
            }
            p087i7.x.b(objG);
            Z8.InterfaceC1869f interfaceC1869f = this.f16866C;
            c0318a.f16871I = this;
            c0318a.f16872J = interfaceC1870g;
            c0318a.f16869G = 1;
            objG = Z8.AbstractC1871h.g(interfaceC1869f, interfaceC1870g, c0318a);
            if (objG == objG2) {
                return objG2;
            }
            aVar = this;
            java.lang.Throwable th = (java.lang.Throwable) objG;
            if (th != null) {
                p237x7.q qVar = aVar.f16867D;
                c0318a.f16871I = null;
                c0318a.f16872J = null;
                c0318a.f16869G = 2;
                p247y7.r.a(6);
                java.lang.Object objJ = qVar.j(interfaceC1870g, th, c0318a);
                p247y7.r.a(7);
                if (objJ == objG2) {
                    return objG2;
                }
            }
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: Z8.q$b */
    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f16873F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16874G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f16875H;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f16874G = obj;
            this.f16875H |= Integer.MIN_VALUE;
            return Z8.AbstractC1871h.g(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Z8.q$c */
    static final class c implements Z8.InterfaceC1870g {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1870g f16876C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.O f16877D;

        /* JADX INFO: renamed from: Z8.q$c$a */
        static final class a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            java.lang.Object f16878F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            /* synthetic */ java.lang.Object f16879G;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            int f16881I;

            a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f16879G = obj;
                this.f16881I |= Integer.MIN_VALUE;
                return Z8.AbstractC1880q.c.this.a(null, this);
            }
        }

        c(Z8.InterfaceC1870g interfaceC1870g, p247y7.O o6) {
            this.f16876C = interfaceC1870g;
            this.f16877D = o6;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // Z8.InterfaceC1870g
        public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) throws java.lang.Throwable {
            Z8.AbstractC1880q.c.a aVar;
            Z8.AbstractC1880q.c cVar;
            if (eVar instanceof Z8.AbstractC1880q.c.a) {
                aVar = (Z8.AbstractC1880q.c.a) eVar;
                int i6 = aVar.f16881I;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    aVar.f16881I = i6 - Integer.MIN_VALUE;
                } else {
                    aVar = new Z8.AbstractC1880q.c.a(eVar);
                }
            } else {
                aVar = new Z8.AbstractC1880q.c.a(eVar);
            }
            java.lang.Object obj2 = aVar.f16879G;
            java.lang.Object objG = p137n7.b.g();
            int i10 = aVar.f16881I;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (Z8.AbstractC1880q.c) aVar.f16878F;
                try {
                    p087i7.x.b(obj2);
                    return p087i7.M.f46721a;
                } catch (java.lang.Throwable th) {
                    th = th;
                    cVar.f16877D.f57254C = th;
                    throw th;
                }
            }
            p087i7.x.b(obj2);
            try {
                Z8.InterfaceC1870g interfaceC1870g = this.f16876C;
                aVar.f16878F = this;
                aVar.f16881I = 1;
                if (interfaceC1870g.a(obj, aVar) == objG) {
                    return objG;
                }
                return p087i7.M.f46721a;
            } catch (java.lang.Throwable th2) {
                th = th2;
                cVar = this;
                cVar.f16877D.f57254C = th;
                throw th;
            }
        }
    }

    public static final Z8.InterfaceC1869f a(Z8.InterfaceC1869f interfaceC1869f, p237x7.q qVar) {
        return new Z8.AbstractC1880q.a(interfaceC1869f, qVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object b(Z8.InterfaceC1869f interfaceC1869f, Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) throws java.lang.Throwable {
        Z8.AbstractC1880q.b bVar;
        p247y7.O o6;
        if (eVar instanceof Z8.AbstractC1880q.b) {
            bVar = (Z8.AbstractC1880q.b) eVar;
            int i6 = bVar.f16875H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.f16875H = i6 - Integer.MIN_VALUE;
            } else {
                bVar = new Z8.AbstractC1880q.b(eVar);
            }
        } else {
            bVar = new Z8.AbstractC1880q.b(eVar);
        }
        java.lang.Object obj = bVar.f16874G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = bVar.f16875H;
        if (i10 == 0) {
            p087i7.x.b(obj);
            p247y7.O o10 = new p247y7.O();
            try {
                Z8.InterfaceC1870g cVar = new Z8.AbstractC1880q.c(interfaceC1870g, o10);
                bVar.f16873F = o10;
                bVar.f16875H = 1;
                if (interfaceC1869f.b(cVar, bVar) == objG) {
                    return objG;
                }
                return null;
            } catch (java.lang.Throwable th) {
                th = th;
                o6 = o10;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o6 = (p247y7.O) bVar.f16873F;
            try {
                p087i7.x.b(obj);
                return null;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
        java.lang.Throwable th3 = (java.lang.Throwable) o6.f57254C;
        if (d(th, th3) || c(th, bVar.getContext())) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof java.util.concurrent.CancellationException) {
            p087i7.AbstractC6661g.a(th3, th);
            throw th3;
        }
        p087i7.AbstractC6661g.a(th, th3);
        throw th;
    }

    private static final boolean c(java.lang.Throwable th, p127m7.i iVar) {
        W8.InterfaceC1822z0 interfaceC1822z0 = (W8.InterfaceC1822z0) iVar.i(W8.InterfaceC1822z0.f15544h);
        if (interfaceC1822z0 == null || !interfaceC1822z0.isCancelled()) {
            return false;
        }
        return d(th, interfaceC1822z0.e0());
    }

    private static final boolean d(java.lang.Throwable th, java.lang.Throwable th2) {
        return th2 != null && p247y7.AbstractC7350t.b(th2, th);
    }
}
