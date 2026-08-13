package Z8;

/* JADX INFO: renamed from: Z8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC1879p {

    /* JADX INFO: renamed from: Z8.p$a */
    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f16848F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16849G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f16850H;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f16849G = obj;
            this.f16850H |= Integer.MIN_VALUE;
            return Z8.AbstractC1879p.c(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: Z8.p$b */
    public static final class b implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f16851C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.q f16852D;

        /* JADX INFO: renamed from: Z8.p$b$a */
        public static final class a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            /* synthetic */ java.lang.Object f16853F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f16854G;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            java.lang.Object f16856I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            java.lang.Object f16857J;

            public a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f16853F = obj;
                this.f16854G |= Integer.MIN_VALUE;
                return Z8.AbstractC1879p.b.this.b(null, this);
            }
        }

        public b(Z8.InterfaceC1869f interfaceC1869f, p237x7.q qVar) {
            this.f16851C = interfaceC1869f;
            this.f16852D = qVar;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0086 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x0087  */
        /* JADX WARN: Code duplicated, block: B:46:0x00ab A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) throws java.lang.Throwable {
            Z8.AbstractC1879p.b.a aVar;
            Z8.AbstractC1879p.b bVar;
            Z8.U u6;
            p237x7.q qVar;
            p009a9.v vVar;
            java.lang.Throwable th;
            p009a9.v vVar2;
            java.lang.Object objJ;
            if (eVar instanceof Z8.AbstractC1879p.b.a) {
                aVar = (Z8.AbstractC1879p.b.a) eVar;
                int i6 = aVar.f16854G;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    aVar.f16854G = i6 - Integer.MIN_VALUE;
                } else {
                    aVar = new Z8.AbstractC1879p.b.a(eVar);
                }
            } else {
                aVar = new Z8.AbstractC1879p.b.a(eVar);
            }
            java.lang.Object obj = aVar.f16853F;
            java.lang.Object objG = p137n7.b.g();
            int i10 = aVar.f16854G;
            if (i10 == 0) {
                p087i7.x.b(obj);
                try {
                    Z8.InterfaceC1869f interfaceC1869f = this.f16851C;
                    aVar.f16856I = this;
                    aVar.f16857J = interfaceC1870g;
                    aVar.f16854G = 1;
                    if (interfaceC1869f.b(interfaceC1870g, aVar) == objG) {
                        return objG;
                    }
                    bVar = this;
                    vVar = new p009a9.v(interfaceC1870g, aVar.getContext());
                    p237x7.q qVar2 = bVar.f16852D;
                    aVar.f16856I = vVar;
                    aVar.f16857J = null;
                    aVar.f16854G = 3;
                    p247y7.r.a(6);
                    objJ = qVar2.j(vVar, null, aVar);
                    p247y7.r.a(7);
                    if (objJ == objG) {
                        return objG;
                    }
                    vVar2 = vVar;
                    vVar2.D();
                    return p087i7.M.f46721a;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    bVar = this;
                    u6 = new Z8.U(th);
                    qVar = bVar.f16852D;
                    aVar.f16856I = th;
                    aVar.f16857J = null;
                    aVar.f16854G = 2;
                    if (Z8.AbstractC1879p.c(u6, qVar, th, aVar) == objG) {
                        return objG;
                    }
                    throw th;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    java.lang.Throwable th3 = (java.lang.Throwable) aVar.f16856I;
                    p087i7.x.b(obj);
                    throw th3;
                }
                if (i10 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vVar2 = (p009a9.v) aVar.f16856I;
                try {
                    p087i7.x.b(obj);
                    vVar2.D();
                    return p087i7.M.f46721a;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    vVar2.D();
                    throw th;
                }
            }
            interfaceC1870g = (Z8.InterfaceC1870g) aVar.f16857J;
            bVar = (Z8.AbstractC1879p.b) aVar.f16856I;
            try {
                p087i7.x.b(obj);
                vVar = new p009a9.v(interfaceC1870g, aVar.getContext());
                try {
                    p237x7.q qVar3 = bVar.f16852D;
                    aVar.f16856I = vVar;
                    aVar.f16857J = null;
                    aVar.f16854G = 3;
                    p247y7.r.a(6);
                    objJ = qVar3.j(vVar, null, aVar);
                    p247y7.r.a(7);
                    if (objJ == objG) {
                        return objG;
                    }
                    vVar2 = vVar;
                    vVar2.D();
                    return p087i7.M.f46721a;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    vVar2 = vVar;
                    vVar2.D();
                    throw th;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                u6 = new Z8.U(th);
                qVar = bVar.f16852D;
                aVar.f16856I = th;
                aVar.f16857J = null;
                aVar.f16854G = 2;
                if (Z8.AbstractC1879p.c(u6, qVar, th, aVar) == objG) {
                    return objG;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Z8.p$c */
    public static final class c implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ p237x7.p f16858C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f16859D;

        /* JADX INFO: renamed from: Z8.p$c$a */
        public static final class a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            /* synthetic */ java.lang.Object f16860F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f16861G;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            java.lang.Object f16863I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            java.lang.Object f16864J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            java.lang.Object f16865K;

            public a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f16860F = obj;
                this.f16861G |= Integer.MIN_VALUE;
                return Z8.AbstractC1879p.c.this.b(null, this);
            }
        }

        public c(p237x7.p pVar, Z8.InterfaceC1869f interfaceC1869f) {
            this.f16858C = pVar;
            this.f16859D = interfaceC1869f;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0082 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) throws java.lang.Throwable {
            Z8.AbstractC1879p.c.a aVar;
            java.lang.Throwable th;
            p009a9.v vVar;
            Z8.AbstractC1879p.c cVar;
            Z8.InterfaceC1870g interfaceC1870g2;
            Z8.InterfaceC1869f interfaceC1869f;
            if (eVar instanceof Z8.AbstractC1879p.c.a) {
                aVar = (Z8.AbstractC1879p.c.a) eVar;
                int i6 = aVar.f16861G;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    aVar.f16861G = i6 - Integer.MIN_VALUE;
                } else {
                    aVar = new Z8.AbstractC1879p.c.a(eVar);
                }
            } else {
                aVar = new Z8.AbstractC1879p.c.a(eVar);
            }
            java.lang.Object obj = aVar.f16860F;
            java.lang.Object objG = p137n7.b.g();
            int i10 = aVar.f16861G;
            if (i10 == 0) {
                p087i7.x.b(obj);
                p009a9.v vVar2 = new p009a9.v(interfaceC1870g, aVar.getContext());
                try {
                    p237x7.p pVar = this.f16858C;
                    aVar.f16863I = this;
                    aVar.f16864J = interfaceC1870g;
                    aVar.f16865K = vVar2;
                    aVar.f16861G = 1;
                    p247y7.r.a(6);
                    java.lang.Object objU = pVar.u(vVar2, aVar);
                    p247y7.r.a(7);
                    if (objU == objG) {
                        return objG;
                    }
                    cVar = this;
                    interfaceC1870g2 = interfaceC1870g;
                    vVar = vVar2;
                    vVar.D();
                    interfaceC1869f = cVar.f16859D;
                    aVar.f16863I = null;
                    aVar.f16864J = null;
                    aVar.f16865K = null;
                    aVar.f16861G = 2;
                    if (interfaceC1869f.b(interfaceC1870g2, aVar) == objG) {
                        return objG;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    vVar = vVar2;
                    vVar.D();
                    throw th;
                }
            } else if (i10 == 1) {
                vVar = (p009a9.v) aVar.f16865K;
                interfaceC1870g2 = (Z8.InterfaceC1870g) aVar.f16864J;
                cVar = (Z8.AbstractC1879p.c) aVar.f16863I;
                try {
                    p087i7.x.b(obj);
                    vVar.D();
                    interfaceC1869f = cVar.f16859D;
                    aVar.f16863I = null;
                    aVar.f16864J = null;
                    aVar.f16865K = null;
                    aVar.f16861G = 2;
                    if (interfaceC1869f.b(interfaceC1870g2, aVar) == objG) {
                        return objG;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    vVar.D();
                    throw th;
                }
            } else {
                if (i10 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }
    }

    public static final void b(Z8.InterfaceC1870g interfaceC1870g) {
        if (interfaceC1870g instanceof Z8.U) {
            throw ((Z8.U) interfaceC1870g).f16806C;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object c(Z8.InterfaceC1870g interfaceC1870g, p237x7.q qVar, java.lang.Throwable th, p127m7.e eVar) {
        Z8.AbstractC1879p.a aVar;
        if (eVar instanceof Z8.AbstractC1879p.a) {
            aVar = (Z8.AbstractC1879p.a) eVar;
            int i6 = aVar.f16850H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f16850H = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new Z8.AbstractC1879p.a(eVar);
            }
        } else {
            aVar = new Z8.AbstractC1879p.a(eVar);
        }
        java.lang.Object obj = aVar.f16849G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f16850H;
        try {
            if (i10 == 0) {
                p087i7.x.b(obj);
                aVar.f16848F = th;
                aVar.f16850H = 1;
                if (qVar.j(interfaceC1870g, th, aVar) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (java.lang.Throwable) aVar.f16848F;
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        } catch (java.lang.Throwable th2) {
            if (th != null && th != th2) {
                p087i7.AbstractC6661g.a(th2, th);
            }
            throw th2;
        }
    }

    public static final Z8.InterfaceC1869f d(Z8.InterfaceC1869f interfaceC1869f, p237x7.q qVar) {
        return new Z8.AbstractC1879p.b(interfaceC1869f, qVar);
    }

    public static final Z8.InterfaceC1869f e(Z8.InterfaceC1869f interfaceC1869f, p237x7.p pVar) {
        return new Z8.AbstractC1879p.c(pVar, interfaceC1869f);
    }
}
