package Z8;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class r {

    public static final class a implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f16882C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f16883D;

        public a(Z8.InterfaceC1869f interfaceC1869f, int i6) {
            this.f16882C = interfaceC1869f;
            this.f16883D = i6;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f16882C.b(new Z8.r.b(new p247y7.M(), this.f16883D, interfaceC1870g), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    static final class b implements Z8.InterfaceC1870g {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ p247y7.M f16884C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f16885D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1870g f16886E;

        static final class a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            /* synthetic */ java.lang.Object f16887F;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            int f16889H;

            a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f16887F = obj;
                this.f16889H |= Integer.MIN_VALUE;
                return Z8.r.b.this.a(null, this);
            }
        }

        b(p247y7.M m6, int i6, Z8.InterfaceC1870g interfaceC1870g) {
            this.f16884C = m6;
            this.f16885D = i6;
            this.f16886E = interfaceC1870g;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // Z8.InterfaceC1870g
        public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
            Z8.r.b.a aVar;
            if (eVar instanceof Z8.r.b.a) {
                aVar = (Z8.r.b.a) eVar;
                int i6 = aVar.f16889H;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    aVar.f16889H = i6 - Integer.MIN_VALUE;
                } else {
                    aVar = new Z8.r.b.a(eVar);
                }
            } else {
                aVar = new Z8.r.b.a(eVar);
            }
            java.lang.Object obj2 = aVar.f16887F;
            java.lang.Object objG = p137n7.b.g();
            int i10 = aVar.f16889H;
            if (i10 == 0) {
                p087i7.x.b(obj2);
                p247y7.M m6 = this.f16884C;
                int i11 = m6.f57252C;
                if (i11 < this.f16885D) {
                    m6.f57252C = i11 + 1;
                    return p087i7.M.f46721a;
                }
                Z8.InterfaceC1870g interfaceC1870g = this.f16886E;
                aVar.f16889H = 1;
                if (interfaceC1870g.a(obj, aVar) == objG) {
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

    public static final class c implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f16890C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.p f16891D;

        public c(Z8.InterfaceC1869f interfaceC1869f, p237x7.p pVar) {
            this.f16890C = interfaceC1869f;
            this.f16891D = pVar;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f16890C.b(new Z8.r.d(new p247y7.K(), interfaceC1870g, this.f16891D), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    static final class d implements Z8.InterfaceC1870g {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ p247y7.K f16892C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1870g f16893D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f16894E;

        static final class a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            java.lang.Object f16895F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            java.lang.Object f16896G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            /* synthetic */ java.lang.Object f16897H;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            int f16899J;

            a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f16897H = obj;
                this.f16899J |= Integer.MIN_VALUE;
                return Z8.r.d.this.a(null, this);
            }
        }

        d(p247y7.K k6, Z8.InterfaceC1870g interfaceC1870g, p237x7.p pVar) {
            this.f16892C = k6;
            this.f16893D = interfaceC1870g;
            this.f16894E = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0074  */
        /* JADX WARN: Code duplicated, block: B:33:0x0087 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:36:0x008b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // Z8.InterfaceC1870g
        public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
            Z8.r.d.a aVar;
            Z8.r.d dVar;
            Z8.InterfaceC1870g interfaceC1870g;
            if (eVar instanceof Z8.r.d.a) {
                aVar = (Z8.r.d.a) eVar;
                int i6 = aVar.f16899J;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    aVar.f16899J = i6 - Integer.MIN_VALUE;
                } else {
                    aVar = new Z8.r.d.a(eVar);
                }
            } else {
                aVar = new Z8.r.d.a(eVar);
            }
            java.lang.Object objU = aVar.f16897H;
            java.lang.Object objG = p137n7.b.g();
            int i10 = aVar.f16899J;
            if (i10 == 0) {
                p087i7.x.b(objU);
                if (this.f16892C.f57250C) {
                    Z8.InterfaceC1870g interfaceC1870g2 = this.f16893D;
                    aVar.f16899J = 1;
                    if (interfaceC1870g2.a(obj, aVar) == objG) {
                        return objG;
                    }
                    return p087i7.M.f46721a;
                }
                p237x7.p pVar = this.f16894E;
                aVar.f16895F = this;
                aVar.f16896G = obj;
                aVar.f16899J = 2;
                objU = pVar.u(obj, aVar);
                if (objU == objG) {
                    return objG;
                }
                dVar = this;
                if (!((java.lang.Boolean) objU).booleanValue()) {
                    return p087i7.M.f46721a;
                }
                dVar.f16892C.f57250C = true;
                interfaceC1870g = dVar.f16893D;
                aVar.f16895F = null;
                aVar.f16896G = null;
                aVar.f16899J = 3;
                if (interfaceC1870g.a(obj, aVar) == objG) {
                    return objG;
                }
            } else {
                if (i10 == 1) {
                    p087i7.x.b(objU);
                    return p087i7.M.f46721a;
                }
                if (i10 == 2) {
                    obj = aVar.f16896G;
                    dVar = (Z8.r.d) aVar.f16895F;
                    p087i7.x.b(objU);
                    if (!((java.lang.Boolean) objU).booleanValue()) {
                        return p087i7.M.f46721a;
                    }
                    dVar.f16892C.f57250C = true;
                    interfaceC1870g = dVar.f16893D;
                    aVar.f16895F = null;
                    aVar.f16896G = null;
                    aVar.f16899J = 3;
                    if (interfaceC1870g.a(obj, aVar) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(objU);
                }
            }
            return p087i7.M.f46721a;
        }
    }

    public static final class e implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f16900C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.p f16901D;

        public static final class a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            /* synthetic */ java.lang.Object f16902F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f16903G;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            java.lang.Object f16905I;

            public a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f16902F = obj;
                this.f16903G |= Integer.MIN_VALUE;
                return Z8.r.e.this.b(null, this);
            }
        }

        public e(Z8.InterfaceC1869f interfaceC1869f, p237x7.p pVar) {
            this.f16900C = interfaceC1869f;
            this.f16901D = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            Z8.r.e.a aVar;
            Z8.r.f fVar;
            if (eVar instanceof Z8.r.e.a) {
                aVar = (Z8.r.e.a) eVar;
                int i6 = aVar.f16903G;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    aVar.f16903G = i6 - Integer.MIN_VALUE;
                } else {
                    aVar = new Z8.r.e.a(eVar);
                }
            } else {
                aVar = new Z8.r.e.a(eVar);
            }
            java.lang.Object obj = aVar.f16902F;
            java.lang.Object objG = p137n7.b.g();
            int i10 = aVar.f16903G;
            if (i10 == 0) {
                p087i7.x.b(obj);
                Z8.InterfaceC1869f interfaceC1869f = this.f16900C;
                Z8.r.f fVar2 = new Z8.r.f(this.f16901D, interfaceC1870g);
                try {
                    aVar.f16905I = fVar2;
                    aVar.f16903G = 1;
                    if (interfaceC1869f.b(fVar2, aVar) == objG) {
                        return objG;
                    }
                } catch (p009a9.C1884a e6) {
                    e = e6;
                    fVar = fVar2;
                    p009a9.p.a(e, fVar);
                }
            } else {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = (Z8.r.f) aVar.f16905I;
                try {
                    p087i7.x.b(obj);
                } catch (p009a9.C1884a e10) {
                    e = e10;
                    p009a9.p.a(e, fVar);
                }
            }
            return p087i7.M.f46721a;
        }
    }

    public static final class f implements Z8.InterfaceC1870g {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ p237x7.p f16906C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1870g f16907D;

        public static final class a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            java.lang.Object f16908F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            /* synthetic */ java.lang.Object f16909G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            int f16910H;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            java.lang.Object f16912J;

            public a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f16909G = obj;
                this.f16910H |= Integer.MIN_VALUE;
                return Z8.r.f.this.a(null, this);
            }
        }

        public f(p237x7.p pVar, Z8.InterfaceC1870g interfaceC1870g) {
            this.f16906C = pVar;
            this.f16907D = interfaceC1870g;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0081  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // Z8.InterfaceC1870g
        public java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
            Z8.r.f.a aVar;
            java.lang.Object obj2;
            java.lang.Object obj3;
            Z8.r.f fVar;
            if (eVar instanceof Z8.r.f.a) {
                aVar = (Z8.r.f.a) eVar;
                int i6 = aVar.f16910H;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    aVar.f16910H = i6 - Integer.MIN_VALUE;
                } else {
                    aVar = new Z8.r.f.a(eVar);
                }
            } else {
                aVar = new Z8.r.f.a(eVar);
            }
            java.lang.Object obj4 = aVar.f16909G;
            java.lang.Object objG = p137n7.b.g();
            int i10 = aVar.f16910H;
            boolean z6 = true;
            if (i10 != 0) {
                if (i10 == 1) {
                    java.lang.Object obj5 = aVar.f16912J;
                    Z8.r.f fVar2 = (Z8.r.f) aVar.f16908F;
                    p087i7.x.b(obj4);
                    obj3 = obj5;
                    fVar = fVar2;
                    obj2 = obj4;
                } else {
                    if (i10 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = (Z8.r.f) aVar.f16908F;
                    p087i7.x.b(obj4);
                }
                if (z6) {
                    return p087i7.M.f46721a;
                }
                throw new p009a9.C1884a(fVar);
            }
            p087i7.x.b(obj4);
            p237x7.p pVar = this.f16906C;
            aVar.f16908F = this;
            aVar.f16912J = obj;
            aVar.f16910H = 1;
            p247y7.r.a(6);
            java.lang.Object objU = pVar.u(obj, aVar);
            p247y7.r.a(7);
            if (objU == objG) {
                return objG;
            }
            obj2 = objU;
            obj3 = obj;
            fVar = this;
            if (((java.lang.Boolean) obj2).booleanValue()) {
                Z8.InterfaceC1870g interfaceC1870g = fVar.f16907D;
                aVar.f16908F = fVar;
                aVar.f16912J = null;
                aVar.f16910H = 2;
                if (interfaceC1870g.a(obj3, aVar) == objG) {
                    return objG;
                }
            } else {
                z6 = false;
            }
            if (z6) {
                return p087i7.M.f46721a;
            }
            throw new p009a9.C1884a(fVar);
        }
    }

    public static final Z8.InterfaceC1869f a(Z8.InterfaceC1869f interfaceC1869f, int i6) {
        if (i6 >= 0) {
            return new Z8.r.a(interfaceC1869f, i6);
        }
        throw new java.lang.IllegalArgumentException(("Drop count should be non-negative, but had " + i6).toString());
    }

    public static final Z8.InterfaceC1869f b(Z8.InterfaceC1869f interfaceC1869f, p237x7.p pVar) {
        return new Z8.r.c(interfaceC1869f, pVar);
    }

    public static final Z8.InterfaceC1869f c(Z8.InterfaceC1869f interfaceC1869f, p237x7.p pVar) {
        return new Z8.r.e(interfaceC1869f, pVar);
    }
}
