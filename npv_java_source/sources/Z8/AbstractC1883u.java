package Z8;

/* JADX INFO: renamed from: Z8.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC1883u {

    /* JADX INFO: renamed from: Z8.u$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f16946G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ Z8.I f16947H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f16948I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ Z8.x f16949J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f16950K;

        /* JADX INFO: renamed from: Z8.u$a$a, reason: collision with other inner class name */
        static final class C0319a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f16951G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            /* synthetic */ int f16952H;

            C0319a(p127m7.e eVar) {
                super(2, eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p137n7.b.g();
                if (this.f16951G != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                return p147o7.b.a(this.f16952H > 0);
            }

            public final java.lang.Object H(int i6, p127m7.e eVar) {
                return ((Z8.AbstractC1883u.a.C0319a) x(java.lang.Integer.valueOf(i6), eVar)).B(p087i7.M.f46721a);
            }

            @Override // p237x7.p
            public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return H(((java.lang.Number) obj).intValue(), (p127m7.e) obj2);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                Z8.AbstractC1883u.a.C0319a c0319a = new Z8.AbstractC1883u.a.C0319a(eVar);
                c0319a.f16952H = ((java.lang.Number) obj).intValue();
                return c0319a;
            }
        }

        /* JADX INFO: renamed from: Z8.u$a$b */
        static final class b extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f16953G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            /* synthetic */ java.lang.Object f16954H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1869f f16955I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ Z8.x f16956J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f16957K;

            /* JADX INFO: renamed from: Z8.u$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C0320a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f16958a;

                static {
                    int[] iArr = new int[Z8.G.values().length];
                    try {
                        iArr[Z8.G.START.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Z8.G.STOP.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Z8.G.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    f16958a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Z8.InterfaceC1869f interfaceC1869f, Z8.x xVar, java.lang.Object obj, p127m7.e eVar) {
                super(2, eVar);
                this.f16955I = interfaceC1869f;
                this.f16956J = xVar;
                this.f16957K = obj;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f16953G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    int i10 = Z8.AbstractC1883u.a.b.C0320a.f16958a[((Z8.G) this.f16954H).ordinal()];
                    if (i10 == 1) {
                        Z8.InterfaceC1869f interfaceC1869f = this.f16955I;
                        Z8.x xVar = this.f16956J;
                        this.f16953G = 1;
                        if (interfaceC1869f.b(xVar, this) == objG) {
                            return objG;
                        }
                    } else if (i10 != 2) {
                        if (i10 != 3) {
                            throw new p087i7.s();
                        }
                        java.lang.Object obj2 = this.f16957K;
                        if (obj2 == Z8.E.f16749a) {
                            this.f16956J.m();
                        } else {
                            p147o7.b.a(this.f16956J.n(obj2));
                        }
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
            public final java.lang.Object u(Z8.G g6, p127m7.e eVar) {
                return ((Z8.AbstractC1883u.a.b) x(g6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                Z8.AbstractC1883u.a.b bVar = new Z8.AbstractC1883u.a.b(this.f16955I, this.f16956J, this.f16957K, eVar);
                bVar.f16954H = obj;
                return bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z8.I i6, Z8.InterfaceC1869f interfaceC1869f, Z8.x xVar, java.lang.Object obj, p127m7.e eVar) {
            super(2, eVar);
            this.f16947H = i6;
            this.f16948I = interfaceC1869f;
            this.f16949J = xVar;
            this.f16950K = obj;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0068 A[RETURN] */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            Z8.InterfaceC1869f interfaceC1869f;
            Z8.x xVar;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f16946G;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        p087i7.x.b(obj);
                        interfaceC1869f = this.f16948I;
                        xVar = this.f16949J;
                        this.f16946G = 3;
                        if (interfaceC1869f.b(xVar, this) == objG) {
                            return objG;
                        }
                    } else if (i6 != 3 && i6 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                p087i7.x.b(obj);
            } else {
                p087i7.x.b(obj);
                Z8.I i10 = this.f16947H;
                Z8.I.a aVar = Z8.I.f16761a;
                if (i10 == aVar.c()) {
                    Z8.InterfaceC1869f interfaceC1869f2 = this.f16948I;
                    Z8.x xVar2 = this.f16949J;
                    this.f16946G = 1;
                    if (interfaceC1869f2.b(xVar2, this) == objG) {
                        return objG;
                    }
                } else if (this.f16947H == aVar.d()) {
                    Z8.N nP = this.f16949J.p();
                    Z8.AbstractC1883u.a.C0319a c0319a = new Z8.AbstractC1883u.a.C0319a(null);
                    this.f16946G = 2;
                    if (Z8.AbstractC1871h.v(nP, c0319a, this) == objG) {
                        return objG;
                    }
                    interfaceC1869f = this.f16948I;
                    xVar = this.f16949J;
                    this.f16946G = 3;
                    if (interfaceC1869f.b(xVar, this) == objG) {
                        return objG;
                    }
                } else {
                    Z8.InterfaceC1869f interfaceC1869fN = Z8.AbstractC1871h.n(this.f16947H.a(this.f16949J.p()));
                    Z8.AbstractC1883u.a.b bVar = new Z8.AbstractC1883u.a.b(this.f16948I, this.f16949J, this.f16950K, null);
                    this.f16946G = 4;
                    if (Z8.AbstractC1871h.j(interfaceC1869fN, bVar, this) == objG) {
                        return objG;
                    }
                }
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((Z8.AbstractC1883u.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new Z8.AbstractC1883u.a(this.f16947H, this.f16948I, this.f16949J, this.f16950K, eVar);
        }
    }

    public static final Z8.C a(Z8.x xVar) {
        return new Z8.z(xVar, null);
    }

    public static final Z8.N b(Z8.y yVar) {
        return new Z8.A(yVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    private static final Z8.H c(Z8.InterfaceC1869f interfaceC1869f, int i6) {
        p009a9.e eVar;
        Z8.InterfaceC1869f interfaceC1869fJ;
        int iD = E7.j.d(i6, Y8.j.f16552i.a()) - i6;
        if (!(interfaceC1869f instanceof p009a9.e) || (interfaceC1869fJ = (eVar = (p009a9.e) interfaceC1869f).j()) == null) {
            return new Z8.H(interfaceC1869f, iD, Y8.EnumC1863d.SUSPEND, p127m7.j.f51198C);
        }
        int i10 = eVar.f17162D;
        if (i10 != -3 && i10 != -2 && i10 != 0) {
            iD = i10;
        } else if (eVar.f17163E == Y8.EnumC1863d.SUSPEND) {
            if (i10 == 0) {
                iD = 0;
            }
        } else if (i6 == 0) {
            iD = 1;
        } else {
            iD = 0;
        }
        return new Z8.H(interfaceC1869fJ, iD, eVar.f17163E, eVar.f17161C);
    }

    private static final W8.InterfaceC1822z0 d(W8.N n6, p127m7.i iVar, Z8.InterfaceC1869f interfaceC1869f, Z8.x xVar, Z8.I i6, java.lang.Object obj) {
        return W8.AbstractC1784g.c(n6, iVar, p247y7.AbstractC7350t.b(i6, Z8.I.f16761a.c()) ? W8.P.DEFAULT : W8.P.UNDISPATCHED, new Z8.AbstractC1883u.a(i6, interfaceC1869f, xVar, obj, null));
    }

    public static final Z8.C e(Z8.C c6, p237x7.p pVar) {
        return new Z8.T(c6, pVar);
    }

    public static final Z8.C f(Z8.InterfaceC1869f interfaceC1869f, W8.N n6, Z8.I i6, int i10) {
        Z8.H hC = c(interfaceC1869f, i10);
        Z8.x xVarA = Z8.E.a(i10, hC.f16758b, hC.f16759c);
        return new Z8.z(xVarA, d(n6, hC.f16760d, hC.f16757a, xVarA, i6, Z8.E.f16749a));
    }

    public static final Z8.N g(Z8.InterfaceC1869f interfaceC1869f, W8.N n6, Z8.I i6, java.lang.Object obj) {
        Z8.H hC = c(interfaceC1869f, 1);
        Z8.y yVarA = Z8.P.a(obj);
        return new Z8.A(yVarA, d(n6, hC.f16760d, hC.f16757a, yVarA, i6, obj));
    }
}
