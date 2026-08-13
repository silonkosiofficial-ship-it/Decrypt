package I6;

/* JADX INFO: loaded from: classes3.dex */
public final class E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final I6.E.d f5103c = new I6.E.d(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final W6.C1767a f5104d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f5106b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f5107a = 20;

        public final int a() {
            return this.f5107a;
        }
    }

    private static final class b implements I6.S {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f5108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C6.c f5109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f5110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private D6.b f5111d;

        static final class a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            java.lang.Object f5112F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            /* synthetic */ java.lang.Object f5113G;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            int f5115I;

            a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f5113G = obj;
                this.f5115I |= Integer.MIN_VALUE;
                return I6.E.b.this.a(null, this);
            }
        }

        public b(int i6, C6.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "client");
            this.f5108a = i6;
            this.f5109b = cVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // I6.S
        public java.lang.Object a(O6.d dVar, p127m7.e eVar) {
            I6.E.b.a aVar;
            I6.E.b bVar;
            if (eVar instanceof I6.E.b.a) {
                aVar = (I6.E.b.a) eVar;
                int i6 = aVar.f5115I;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    aVar.f5115I = i6 - Integer.MIN_VALUE;
                } else {
                    aVar = new I6.E.b.a(eVar);
                }
            } else {
                aVar = new I6.E.b.a(eVar);
            }
            java.lang.Object objD = aVar.f5113G;
            java.lang.Object objG = p137n7.b.g();
            int i10 = aVar.f5115I;
            if (i10 == 0) {
                p087i7.x.b(objD);
                D6.b bVar2 = this.f5111d;
                if (bVar2 != null) {
                    W8.O.e(bVar2, null, 1, null);
                }
                int i11 = this.f5110c;
                if (i11 >= this.f5108a) {
                    throw new I6.Q("Max send count " + this.f5108a + " exceeded. Consider increasing the property maxSendCount if more is required.");
                }
                this.f5110c = i11 + 1;
                O6.i iVarN = this.f5109b.N();
                java.lang.Object objE = dVar.e();
                aVar.f5112F = this;
                aVar.f5115I = 1;
                objD = iVarN.d(dVar, objE, aVar);
                if (objD == objG) {
                    return objG;
                }
                bVar = this;
            } else {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (I6.E.b) aVar.f5112F;
                p087i7.x.b(objD);
            }
            D6.b bVar3 = objD instanceof D6.b ? (D6.b) objD : null;
            if (bVar3 != null) {
                bVar.f5111d = bVar3;
                return bVar3;
            }
            throw new java.lang.IllegalStateException(("Failed to execute send pipeline. Expected [HttpClientCall], but received " + objD).toString());
        }
    }

    private static final class c implements I6.S {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p237x7.q f5116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final I6.S f5117b;

        public c(p237x7.q qVar, I6.S s6) {
            p247y7.AbstractC7350t.f(qVar, "interceptor");
            p247y7.AbstractC7350t.f(s6, "nextSender");
            this.f5116a = qVar;
            this.f5117b = s6;
        }

        @Override // I6.S
        public java.lang.Object a(O6.d dVar, p127m7.e eVar) {
            return this.f5116a.j(this.f5117b, dVar, eVar);
        }
    }

    public static final class d implements I6.r {

        static final class a extends p147o7.l implements p237x7.q {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f5118G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f5119H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            /* synthetic */ java.lang.Object f5120I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ I6.E f5121J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ C6.c f5122K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(I6.E e6, C6.c cVar, p127m7.e eVar) {
                super(3, eVar);
                this.f5121J = e6;
                this.f5122K = cVar;
            }

            /* JADX WARN: Code duplicated, block: B:31:0x0093 A[LOOP:0: B:29:0x008d->B:31:0x0093, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:34:0x00b0 A[RETURN] */
            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p007a7.e eVar;
                F7.o oVarP;
                p017b7.a aVar;
                I6.S bVar;
                java.util.Iterator it;
                F7.o oVarP2;
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f5118G;
                if (i6 != 0) {
                    if (i6 == 1) {
                        eVar = (p007a7.e) this.f5119H;
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
                eVar = (p007a7.e) this.f5119H;
                java.lang.Object obj2 = this.f5120I;
                if (!(obj2 instanceof U6.b)) {
                    throw new java.lang.IllegalStateException(S8.r.q("\n|Fail to prepare request body for sending. \n|The body type is: " + p247y7.P.b(obj2.getClass()) + ", with Content-Type: " + T6.AbstractC1677z.d((T6.InterfaceC1676y) eVar.b()) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.", null, 1, null).toString());
                }
                O6.d dVar = (O6.d) eVar.b();
                if (obj2 == null) {
                    dVar.k(U6.a.f14544a);
                    F7.c cVarB = p247y7.P.b(U6.b.class);
                    try {
                        oVarP2 = p247y7.P.p(U6.b.class);
                    } catch (java.lang.Throwable unused) {
                        oVarP2 = null;
                    }
                    aVar = new p017b7.a(cVarB, oVarP2);
                } else {
                    boolean z6 = obj2 instanceof U6.b;
                    dVar.k(obj2);
                    if (z6) {
                        dVar.l(null);
                    } else {
                        F7.c cVarB2 = p247y7.P.b(U6.b.class);
                        try {
                            oVarP = p247y7.P.p(U6.b.class);
                        } catch (java.lang.Throwable unused2) {
                            oVarP = null;
                        }
                        aVar = new p017b7.a(cVarB2, oVarP);
                    }
                    bVar = new I6.E.b(this.f5121J.f5105a, this.f5122K);
                    it = p097j7.AbstractC6879v.E0(this.f5121J.f5106b).iterator();
                    while (it.hasNext()) {
                        bVar = new I6.E.c((p237x7.q) it.next(), bVar);
                    }
                    O6.d dVar2 = (O6.d) eVar.b();
                    this.f5119H = eVar;
                    this.f5118G = 1;
                    obj = bVar.a(dVar2, this);
                    if (obj == objG) {
                        return objG;
                    }
                }
                dVar.l(aVar);
                bVar = new I6.E.b(this.f5121J.f5105a, this.f5122K);
                it = p097j7.AbstractC6879v.E0(this.f5121J.f5106b).iterator();
                while (it.hasNext()) {
                    bVar = new I6.E.c((p237x7.q) it.next(), bVar);
                }
                O6.d dVar3 = (O6.d) eVar.b();
                this.f5119H = eVar;
                this.f5118G = 1;
                obj = bVar.a(dVar3, this);
                if (obj == objG) {
                    return objG;
                }
                this.f5119H = null;
                this.f5118G = 2;
                if (eVar.e((D6.b) obj, this) == objG) {
                    return objG;
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.q
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object j(p007a7.e eVar, java.lang.Object obj, p127m7.e eVar2) {
                I6.E.d.a aVar = new I6.E.d.a(this.f5121J, this.f5122K, eVar2);
                aVar.f5119H = eVar;
                aVar.f5120I = obj;
                return aVar.B(p087i7.M.f46721a);
            }
        }

        private d() {
        }

        public /* synthetic */ d(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        @Override // I6.r
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(I6.E e6, C6.c cVar) {
            p247y7.AbstractC7350t.f(e6, "plugin");
            p247y7.AbstractC7350t.f(cVar, "scope");
            cVar.D().l(O6.g.f8084g.c(), new I6.E.d.a(e6, cVar, null));
        }

        @Override // I6.r
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public I6.E a(p237x7.l lVar) {
            p247y7.AbstractC7350t.f(lVar, "block");
            I6.E.a aVar = new I6.E.a();
            lVar.l(aVar);
            return new I6.E(aVar.a(), null);
        }

        @Override // I6.r
        public W6.C1767a getKey() {
            return I6.E.f5104d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        F7.o oVarP = null;
        F7.c cVarB = p247y7.P.b(I6.E.class);
        try {
            oVarP = p247y7.P.p(I6.E.class);
        } catch (java.lang.Throwable unused) {
        }
        f5104d = new W6.C1767a("HttpSend", new p017b7.a(cVarB, oVarP));
    }

    private E(int i6) {
        this.f5105a = i6;
        this.f5106b = new java.util.ArrayList();
    }

    public /* synthetic */ E(int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(i6);
    }

    public final void d(p237x7.q qVar) {
        p247y7.AbstractC7350t.f(qVar, "block");
        this.f5106b.add(qVar);
    }
}
