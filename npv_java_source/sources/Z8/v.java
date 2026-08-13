package Z8;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class v {

    public static final class a implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f16959C;

        /* JADX INFO: renamed from: Z8.v$a$a, reason: collision with other inner class name */
        public static final class C0321a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f16960C;

            /* JADX INFO: renamed from: Z8.v$a$a$a, reason: collision with other inner class name */
            public static final class C0322a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f16961F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f16962G;

                public C0322a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f16961F = obj;
                    this.f16962G |= Integer.MIN_VALUE;
                    return Z8.v.a.C0321a.this.a(null, this);
                }
            }

            public C0321a(Z8.InterfaceC1870g interfaceC1870g) {
                this.f16960C = interfaceC1870g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                Z8.v.a.C0321a.C0322a c0322a;
                if (eVar instanceof Z8.v.a.C0321a.C0322a) {
                    c0322a = (Z8.v.a.C0321a.C0322a) eVar;
                    int i6 = c0322a.f16962G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0322a.f16962G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0322a = new Z8.v.a.C0321a.C0322a(eVar);
                    }
                } else {
                    c0322a = new Z8.v.a.C0321a.C0322a(eVar);
                }
                java.lang.Object obj2 = c0322a.f16961F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0322a.f16962G;
                if (i10 == 0) {
                    p087i7.x.b(obj2);
                    Z8.InterfaceC1870g interfaceC1870g = this.f16960C;
                    if (obj != null) {
                        c0322a.f16962G = 1;
                        if (interfaceC1870g.a(obj, c0322a) == objG) {
                            return objG;
                        }
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

        public a(Z8.InterfaceC1869f interfaceC1869f) {
            this.f16959C = interfaceC1869f;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f16959C.b(new Z8.v.a.C0321a(interfaceC1870g), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    public static final class b implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f16964C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.p f16965D;

        public static final class a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f16966C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p237x7.p f16967D;

            /* JADX INFO: renamed from: Z8.v$b$a$a, reason: collision with other inner class name */
            public static final class C0323a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f16968F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f16969G;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                java.lang.Object f16971I;

                /* JADX INFO: renamed from: J, reason: collision with root package name */
                java.lang.Object f16972J;

                public C0323a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f16968F = obj;
                    this.f16969G |= Integer.MIN_VALUE;
                    return Z8.v.b.a.this.a(null, this);
                }
            }

            public a(Z8.InterfaceC1870g interfaceC1870g, p237x7.p pVar) {
                this.f16966C = interfaceC1870g;
                this.f16967D = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                Z8.v.b.a.C0323a c0323a;
                java.lang.Object obj2;
                Z8.InterfaceC1870g interfaceC1870g;
                if (eVar instanceof Z8.v.b.a.C0323a) {
                    c0323a = (Z8.v.b.a.C0323a) eVar;
                    int i6 = c0323a.f16969G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0323a.f16969G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0323a = new Z8.v.b.a.C0323a(eVar);
                    }
                } else {
                    c0323a = new Z8.v.b.a.C0323a(eVar);
                }
                java.lang.Object obj3 = c0323a.f16968F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0323a.f16969G;
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC1870g = (Z8.InterfaceC1870g) c0323a.f16972J;
                        obj2 = c0323a.f16971I;
                        p087i7.x.b(obj3);
                    } else {
                        if (i10 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj3);
                    }
                    return p087i7.M.f46721a;
                }
                p087i7.x.b(obj3);
                Z8.InterfaceC1870g interfaceC1870g2 = this.f16966C;
                p237x7.p pVar = this.f16967D;
                c0323a.f16971I = obj;
                c0323a.f16972J = interfaceC1870g2;
                c0323a.f16969G = 1;
                p247y7.r.a(6);
                java.lang.Object objU = pVar.u(obj, c0323a);
                p247y7.r.a(7);
                if (objU == objG) {
                    return objG;
                }
                obj2 = obj;
                interfaceC1870g = interfaceC1870g2;
                c0323a.f16971I = null;
                c0323a.f16972J = null;
                c0323a.f16969G = 2;
                if (interfaceC1870g.a(obj2, c0323a) == objG) {
                    return objG;
                }
                return p087i7.M.f46721a;
            }
        }

        public b(Z8.InterfaceC1869f interfaceC1869f, p237x7.p pVar) {
            this.f16964C = interfaceC1869f;
            this.f16965D = pVar;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f16964C.b(new Z8.v.b.a(interfaceC1870g, this.f16965D), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    public static final class c implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f16973C;

        public c(Z8.InterfaceC1869f interfaceC1869f) {
            this.f16973C = interfaceC1869f;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f16973C.b(new Z8.v.d(interfaceC1870g, new p247y7.M()), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    static final class d implements Z8.InterfaceC1870g {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1870g f16974C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.M f16975D;

        static final class a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            /* synthetic */ java.lang.Object f16976F;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            int f16978H;

            a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f16976F = obj;
                this.f16978H |= Integer.MIN_VALUE;
                return Z8.v.d.this.a(null, this);
            }
        }

        d(Z8.InterfaceC1870g interfaceC1870g, p247y7.M m6) {
            this.f16974C = interfaceC1870g;
            this.f16975D = m6;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // Z8.InterfaceC1870g
        public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
            Z8.v.d.a aVar;
            if (eVar instanceof Z8.v.d.a) {
                aVar = (Z8.v.d.a) eVar;
                int i6 = aVar.f16978H;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    aVar.f16978H = i6 - Integer.MIN_VALUE;
                } else {
                    aVar = new Z8.v.d.a(eVar);
                }
            } else {
                aVar = new Z8.v.d.a(eVar);
            }
            java.lang.Object obj2 = aVar.f16976F;
            java.lang.Object objG = p137n7.b.g();
            int i10 = aVar.f16978H;
            if (i10 == 0) {
                p087i7.x.b(obj2);
                Z8.InterfaceC1870g interfaceC1870g = this.f16974C;
                p247y7.M m6 = this.f16975D;
                int i11 = m6.f57252C;
                m6.f57252C = i11 + 1;
                if (i11 < 0) {
                    throw new java.lang.ArithmeticException("Index overflow has happened");
                }
                p097j7.L l6 = new p097j7.L(i11, obj);
                aVar.f16978H = 1;
                if (interfaceC1870g.a(l6, aVar) == objG) {
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

    public static final Z8.InterfaceC1869f a(Z8.InterfaceC1869f interfaceC1869f) {
        return new Z8.v.a(interfaceC1869f);
    }

    public static final Z8.InterfaceC1869f b(Z8.InterfaceC1869f interfaceC1869f, p237x7.p pVar) {
        return new Z8.v.b(interfaceC1869f, pVar);
    }

    public static final Z8.InterfaceC1869f c(Z8.InterfaceC1869f interfaceC1869f) {
        return new Z8.v.c(interfaceC1869f);
    }
}
