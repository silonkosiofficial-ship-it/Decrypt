package p143o2;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o2.D.a f52295l = new o2.D.a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final java.lang.String[] f52296m = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p143o2.n f52297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f52298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f52299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f52300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p237x7.l f52301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.Map f52302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String[] f52303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p143o2.i f52304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p143o2.j f52305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final V8.a f52306j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p237x7.a f52307k;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.String b(java.lang.String str, java.lang.String str2) {
            return "room_table_modification_trigger_" + str + '_' + str2;
        }
    }

    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f52308F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f52309G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f52311I;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f52309G = obj;
            this.f52311I |= Integer.MIN_VALUE;
            return p143o2.D.this.h(null, this);
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final o2.D.c f52312D = new o2.D.c();

        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Set l(p243y2.e eVar) {
            p247y7.AbstractC7350t.f(eVar, "statement");
            java.util.Set setB = p097j7.Z.b();
            while (eVar.p()) {
                setB.add(java.lang.Integer.valueOf((int) eVar.getLong(0)));
            }
            return p097j7.Z.a(setB);
        }
    }

    static final class d extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f52313G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f52314H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int[] f52316J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ boolean f52317K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ java.lang.String[] f52318L;

        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f52319G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ p143o2.D f52320H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p143o2.D d6, p127m7.e eVar) {
                super(2, eVar);
                this.f52320H = d6;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f52319G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p143o2.D d6 = this.f52320H;
                    this.f52319G = 1;
                    if (d6.u(this) == objG) {
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
                return ((o2.D.d.a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new o2.D.d.a(this.f52320H, eVar);
            }
        }

        static final class b implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ p247y7.O f52321C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ boolean f52322D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f52323E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ java.lang.String[] f52324F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ int[] f52325G;

            static final class a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                java.lang.Object f52326F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                java.lang.Object f52327G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                /* synthetic */ java.lang.Object f52328H;

                /* JADX INFO: renamed from: J, reason: collision with root package name */
                int f52330J;

                a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f52328H = obj;
                    this.f52330J |= Integer.MIN_VALUE;
                    return o2.D.d.b.this.a(null, this);
                }
            }

            b(p247y7.O o6, boolean z6, Z8.InterfaceC1870g interfaceC1870g, java.lang.String[] strArr, int[] iArr) {
                this.f52321C = o6;
                this.f52322D = z6;
                this.f52323E = interfaceC1870g;
                this.f52324F = strArr;
                this.f52325G = iArr;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object a(int[] iArr, p127m7.e eVar) {
                o2.D.d.b.a aVar;
                o2.D.d.b bVar;
                if (eVar instanceof o2.D.d.b.a) {
                    aVar = (o2.D.d.b.a) eVar;
                    int i6 = aVar.f52330J;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        aVar.f52330J = i6 - Integer.MIN_VALUE;
                    } else {
                        aVar = new o2.D.d.b.a(eVar);
                    }
                } else {
                    aVar = new o2.D.d.b.a(eVar);
                }
                java.lang.Object obj = aVar.f52328H;
                java.lang.Object objG = p137n7.b.g();
                int i10 = aVar.f52330J;
                if (i10 == 0) {
                    p087i7.x.b(obj);
                    p247y7.O o6 = this.f52321C;
                    if (o6.f57254C != null) {
                        java.lang.String[] strArr = this.f52324F;
                        int[] iArr2 = this.f52325G;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int length = strArr.length;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < length) {
                            java.lang.String str = strArr[i11];
                            int i13 = i12 + 1;
                            java.lang.Object obj2 = o6.f57254C;
                            if (obj2 == null) {
                                throw new java.lang.IllegalStateException("Required value was null.".toString());
                            }
                            int i14 = iArr2[i12];
                            if (((int[]) obj2)[i14] != iArr[i14]) {
                                arrayList.add(str);
                            }
                            i11++;
                            i12 = i13;
                        }
                        if (!arrayList.isEmpty()) {
                            Z8.InterfaceC1870g interfaceC1870g = this.f52323E;
                            java.util.Set setY0 = p097j7.AbstractC6879v.Y0(arrayList);
                            aVar.f52326F = this;
                            aVar.f52327G = iArr;
                            aVar.f52330J = 2;
                            if (interfaceC1870g.a(setY0, aVar) == objG) {
                                return objG;
                            }
                        }
                    } else if (this.f52322D) {
                        Z8.InterfaceC1870g interfaceC1870g2 = this.f52323E;
                        java.util.Set setD1 = p097j7.AbstractC6872n.d1(this.f52324F);
                        aVar.f52326F = this;
                        aVar.f52327G = iArr;
                        aVar.f52330J = 1;
                        if (interfaceC1870g2.a(setD1, aVar) == objG) {
                            return objG;
                        }
                    }
                    bVar = this;
                } else {
                    if (i10 != 1 && i10 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iArr = (int[]) aVar.f52327G;
                    bVar = (o2.D.d.b) aVar.f52326F;
                    p087i7.x.b(obj);
                }
                bVar.f52321C.f57254C = iArr;
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int[] iArr, boolean z6, java.lang.String[] strArr, p127m7.e eVar) {
            super(2, eVar);
            this.f52316J = iArr;
            this.f52317K = z6;
            this.f52318L = strArr;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0094 A[RETURN] */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            Z8.InterfaceC1870g interfaceC1870g;
            Z8.InterfaceC1870g interfaceC1870g2;
            p143o2.j jVar;
            o2.D.d.b bVar;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f52313G;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        interfaceC1870g2 = (Z8.InterfaceC1870g) this.f52314H;
                        p087i7.x.b(obj);
                    } else if (i6 == 2) {
                        interfaceC1870g2 = (Z8.InterfaceC1870g) this.f52314H;
                        p087i7.x.b(obj);
                        interfaceC1870g = interfaceC1870g2;
                        p247y7.O o6 = new p247y7.O();
                        jVar = p143o2.D.this.f52305i;
                        bVar = new o2.D.d.b(o6, this.f52317K, interfaceC1870g, this.f52318L, this.f52316J);
                        this.f52314H = null;
                        this.f52313G = 3;
                        if (jVar.a(bVar, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i6 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    throw new p087i7.C6665k();
                }
                p087i7.x.b(obj);
                Z8.InterfaceC1870g interfaceC1870g3 = (Z8.InterfaceC1870g) this.f52314H;
                if (p143o2.D.this.f52304h.c(this.f52316J)) {
                    p143o2.n nVar = p143o2.D.this.f52297a;
                    this.f52314H = interfaceC1870g3;
                    this.f52313G = 1;
                    java.lang.Object objC = p223w2.b.c(nVar, false, this);
                    if (objC == objG) {
                        return objG;
                    }
                    interfaceC1870g2 = interfaceC1870g3;
                    obj = objC;
                } else {
                    interfaceC1870g = interfaceC1870g3;
                }
                p247y7.O o10 = new p247y7.O();
                jVar = p143o2.D.this.f52305i;
                bVar = new o2.D.d.b(o10, this.f52317K, interfaceC1870g, this.f52318L, this.f52316J);
                this.f52314H = null;
                this.f52313G = 3;
                if (jVar.a(bVar, this) == objG) {
                    return objG;
                }
                throw new p087i7.C6665k();
                o2.D.d.a aVar = new o2.D.d.a(p143o2.D.this, null);
                this.f52314H = interfaceC1870g2;
                this.f52313G = 2;
                if (W8.AbstractC1784g.g((p127m7.i) obj, aVar, this) == objG) {
                    return objG;
                }
                interfaceC1870g = interfaceC1870g2;
                p247y7.O o11 = new p247y7.O();
                jVar = p143o2.D.this.f52305i;
                bVar = new o2.D.d.b(o11, this.f52317K, interfaceC1870g, this.f52318L, this.f52316J);
                this.f52314H = null;
                this.f52313G = 3;
                if (jVar.a(bVar, this) == objG) {
                    return objG;
                }
                throw new p087i7.C6665k();
            } catch (java.lang.Throwable th) {
                p143o2.D.this.f52304h.d(this.f52316J);
                throw th;
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            return ((o2.D.d) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            o2.D.d dVar = p143o2.D.this.new d(this.f52316J, this.f52317K, this.f52318L, eVar);
            dVar.f52314H = obj;
            return dVar;
        }
    }

    static final class e extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f52331F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f52332G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f52333H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f52335J;

        e(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f52333H = obj;
            this.f52335J |= Integer.MIN_VALUE;
            return p143o2.D.this.k(this);
        }
    }

    static final class f extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f52336G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f52337H;

        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f52339G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f52340H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ p143o2.D f52341I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p143o2.D d6, p127m7.e eVar) {
                super(2, eVar);
                this.f52341I = d6;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f52339G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p143o2.A a6 = (p143o2.A) this.f52340H;
                    p143o2.D d6 = this.f52341I;
                    this.f52339G = 1;
                    obj = d6.h(a6, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                return obj;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p143o2.A a6, p127m7.e eVar) {
                return ((o2.D.f.a) x(a6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                o2.D.f.a aVar = new o2.D.f.a(this.f52341I, eVar);
                aVar.f52340H = obj;
                return aVar;
            }
        }

        f(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p143o2.B b6;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f52336G;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        b6 = (p143o2.B) this.f52337H;
                        p087i7.x.b(obj);
                    } else {
                        if (i6 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    return (java.util.Set) obj;
                }
                p087i7.x.b(obj);
                b6 = (p143o2.B) this.f52337H;
                this.f52337H = b6;
                this.f52336G = 1;
                obj = b6.a(this);
                if (obj == objG) {
                    return objG;
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return p097j7.Z.d();
                }
                o2.B.a aVar = o2.B.a.IMMEDIATE;
                o2.D.f.a aVar2 = new o2.D.f.a(p143o2.D.this, null);
                this.f52337H = null;
                this.f52336G = 2;
                obj = b6.c(aVar, aVar2, this);
                if (obj == objG) {
                    return objG;
                }
                return (java.util.Set) obj;
            } catch (android.database.SQLException unused) {
                return p097j7.Z.d();
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p143o2.B b6, p127m7.e eVar) {
            return ((o2.D.f) x(b6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            o2.D.f fVar = p143o2.D.this.new f(eVar);
            fVar.f52337H = obj;
            return fVar;
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final o2.D.g f52342D = new o2.D.g();

        g() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            return java.lang.Boolean.TRUE;
        }
    }

    static final class h extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f52343F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f52344G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f52345H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f52347J;

        h(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f52345H = obj;
            this.f52347J |= Integer.MIN_VALUE;
            return p143o2.D.this.n(null, null, null, this);
        }
    }

    static final class i extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f52348G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.a f52350I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(p237x7.a aVar, p127m7.e eVar) {
            super(2, eVar);
            this.f52350I = aVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f52348G;
            try {
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p143o2.D d6 = p143o2.D.this;
                    this.f52348G = 1;
                    if (d6.k(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                this.f52350I.b();
                return p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                this.f52350I.b();
                throw th;
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((o2.D.i) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p143o2.D.this.new i(this.f52350I, eVar);
        }
    }

    static final class j extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f52351F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f52352G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f52353H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f52354I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f52355J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f52356K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f52357L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        /* synthetic */ java.lang.Object f52358M;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f52360O;

        j(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f52358M = obj;
            this.f52360O |= Integer.MIN_VALUE;
            return p143o2.D.this.s(null, 0, this);
        }
    }

    static final class k extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f52361F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f52362G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f52363H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f52364I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f52365J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        /* synthetic */ java.lang.Object f52366K;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        int f52368M;

        k(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f52366K = obj;
            this.f52368M |= Integer.MIN_VALUE;
            return p143o2.D.this.t(null, 0, this);
        }
    }

    static final class l extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f52369F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f52370G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f52372I;

        l(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f52370G = obj;
            this.f52372I |= Integer.MIN_VALUE;
            return p143o2.D.this.u(this);
        }
    }

    static final class m extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f52373G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f52374H;

        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            java.lang.Object f52376G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            java.lang.Object f52377H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            java.lang.Object f52378I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            int f52379J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            int f52380K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            int f52381L;

            /* JADX INFO: renamed from: M, reason: collision with root package name */
            int f52382M;

            /* JADX INFO: renamed from: N, reason: collision with root package name */
            final /* synthetic */ p143o2.D f52383N;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ p143o2.B f52384O;

            /* JADX INFO: renamed from: o2.D$m$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0673a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f52385a;

                static {
                    int[] iArr = new int[o2.i.a.values().length];
                    try {
                        iArr[o2.i.a.NO_OP.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[o2.i.a.ADD.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[o2.i.a.REMOVE.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    f52385a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p143o2.D d6, p143o2.B b6, p127m7.e eVar) {
                super(2, eVar);
                this.f52383N = d6;
                this.f52384O = b6;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0048  */
            /* JADX WARN: Code duplicated, block: B:15:0x0056  */
            /* JADX WARN: Code duplicated, block: B:17:0x0059  */
            /* JADX WARN: Code duplicated, block: B:23:0x0075  */
            /* JADX WARN: Code duplicated, block: B:25:0x0089 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0059 -> B:26:0x008a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = p137n7.b.g()
                    int r1 = r11.f52382M
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r3) goto Le
                    if (r1 != r2) goto L24
                Le:
                    int r1 = r11.f52381L
                    int r4 = r11.f52380K
                    int r5 = r11.f52379J
                    java.lang.Object r6 = r11.f52378I
                    o2.B r6 = (p143o2.B) r6
                    java.lang.Object r7 = r11.f52377H
                    o2.D r7 = (p143o2.D) r7
                    java.lang.Object r8 = r11.f52376G
                    o2.i$a[] r8 = (o2.i.a[]) r8
                    p087i7.x.b(r12)
                    goto L72
                L24:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L2c:
                    p087i7.x.b(r12)
                    o2.D r12 = r11.f52383N
                    o2.i r12 = p143o2.D.c(r12)
                    o2.i$a[] r12 = r12.b()
                    if (r12 == 0) goto L8c
                    o2.D r1 = r11.f52383N
                    o2.B r4 = r11.f52384O
                    int r5 = r12.length
                    r6 = 0
                    r8 = r12
                    r7 = r1
                    r12 = r4
                    r1 = r5
                    r4 = r6
                L46:
                    if (r4 >= r1) goto L8c
                    r5 = r8[r4]
                    int r9 = r6 + 1
                    int[] r10 = o2.D.m.a.C0673a.f52385a
                    int r5 = r5.ordinal()
                    r5 = r10[r5]
                    if (r5 == r2) goto L75
                    r10 = 3
                    if (r5 == r10) goto L5b
                    r6 = r9
                    goto L8a
                L5b:
                    r11.f52376G = r8
                    r11.f52377H = r7
                    r11.f52378I = r12
                    r11.f52379J = r9
                    r11.f52380K = r4
                    r11.f52381L = r1
                    r11.f52382M = r2
                    java.lang.Object r5 = p143o2.D.g(r7, r12, r6, r11)
                    if (r5 != r0) goto L70
                    return r0
                L70:
                    r6 = r12
                    r5 = r9
                L72:
                    r12 = r6
                    r6 = r5
                    goto L8a
                L75:
                    r11.f52376G = r8
                    r11.f52377H = r7
                    r11.f52378I = r12
                    r11.f52379J = r9
                    r11.f52380K = r4
                    r11.f52381L = r1
                    r11.f52382M = r3
                    java.lang.Object r5 = p143o2.D.f(r7, r12, r6, r11)
                    if (r5 != r0) goto L70
                    return r0
                L8a:
                    int r4 = r4 + r3
                    goto L46
                L8c:
                    i7.M r12 = p087i7.M.f46721a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: o2.D.m.a.B(java.lang.Object):java.lang.Object");
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p143o2.A a6, p127m7.e eVar) {
                return ((o2.D.m.a) x(a6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new o2.D.m.a(this.f52383N, this.f52384O, eVar);
            }
        }

        m(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p143o2.B b6;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f52373G;
            if (i6 != 0) {
                if (i6 == 1) {
                    b6 = (p143o2.B) this.f52374H;
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
            b6 = (p143o2.B) this.f52374H;
            this.f52374H = b6;
            this.f52373G = 1;
            obj = b6.a(this);
            if (obj == objG) {
                return objG;
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                return p087i7.M.f46721a;
            }
            o2.B.a aVar = o2.B.a.IMMEDIATE;
            o2.D.m.a aVar2 = new o2.D.m.a(p143o2.D.this, b6, null);
            this.f52374H = null;
            this.f52373G = 2;
            if (b6.c(aVar, aVar2, this) == objG) {
                return objG;
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p143o2.B b6, p127m7.e eVar) {
            return ((o2.D.m) x(b6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            o2.D.m mVar = p143o2.D.this.new m(eVar);
            mVar.f52374H = obj;
            return mVar;
        }
    }

    public D(p143o2.n nVar, java.util.Map map, java.util.Map map2, java.lang.String[] strArr, boolean z6, p237x7.l lVar) {
        java.lang.String lowerCase;
        p247y7.AbstractC7350t.f(nVar, "database");
        p247y7.AbstractC7350t.f(map, "shadowTablesMap");
        p247y7.AbstractC7350t.f(map2, "viewTables");
        p247y7.AbstractC7350t.f(strArr, "tableNames");
        p247y7.AbstractC7350t.f(lVar, "onInvalidatedTablesIds");
        this.f52297a = nVar;
        this.f52298b = map;
        this.f52299c = map2;
        this.f52300d = z6;
        this.f52301e = lVar;
        this.f52306j = V8.b.a(false);
        this.f52307k = o2.D.g.f52342D;
        this.f52302f = new java.util.LinkedHashMap();
        int length = strArr.length;
        java.lang.String[] strArr2 = new java.lang.String[length];
        for (int i6 = 0; i6 < length; i6++) {
            java.lang.String str = strArr[i6];
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase2 = str.toLowerCase(locale);
            p247y7.AbstractC7350t.e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            this.f52302f.put(lowerCase2, java.lang.Integer.valueOf(i6));
            java.lang.String str2 = (java.lang.String) this.f52298b.get(strArr[i6]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                p247y7.AbstractC7350t.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i6] = lowerCase2;
        }
        this.f52303g = strArr2;
        for (java.util.Map.Entry entry : this.f52298b.entrySet()) {
            java.lang.String str3 = (java.lang.String) entry.getValue();
            java.util.Locale locale2 = java.util.Locale.ROOT;
            java.lang.String lowerCase3 = str3.toLowerCase(locale2);
            p247y7.AbstractC7350t.e(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (this.f52302f.containsKey(lowerCase3)) {
                java.lang.String lowerCase4 = ((java.lang.String) entry.getKey()).toLowerCase(locale2);
                p247y7.AbstractC7350t.e(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                java.util.Map map3 = this.f52302f;
                map3.put(lowerCase4, p097j7.S.i(map3, lowerCase3));
            }
        }
        this.f52304h = new p143o2.i(this.f52303g.length);
        this.f52305i = new p143o2.j(this.f52303g.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(p143o2.k kVar, p127m7.e eVar) {
        o2.D.b bVar;
        java.util.Set set;
        if (eVar instanceof o2.D.b) {
            bVar = (o2.D.b) eVar;
            int i6 = bVar.f52311I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.f52311I = i6 - Integer.MIN_VALUE;
            } else {
                bVar = new o2.D.b(eVar);
            }
        } else {
            bVar = new o2.D.b(eVar);
        }
        java.lang.Object objB = bVar.f52309G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = bVar.f52311I;
        if (i10 != 0) {
            if (i10 == 1) {
                kVar = (p143o2.k) bVar.f52308F;
                p087i7.x.b(objB);
            } else {
                if (i10 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set = (java.util.Set) bVar.f52308F;
                p087i7.x.b(objB);
            }
            return set;
        }
        p087i7.x.b(objB);
        o2.D.c cVar = o2.D.c.f52312D;
        bVar.f52308F = kVar;
        bVar.f52311I = 1;
        objB = kVar.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1", cVar, bVar);
        if (objB == objG) {
            return objG;
        }
        java.util.Set set2 = (java.util.Set) objB;
        if (!(!set2.isEmpty())) {
            return set2;
        }
        bVar.f52308F = set2;
        bVar.f52311I = 2;
        if (p143o2.C.a(kVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", bVar) == objG) {
            return objG;
        }
        set = set2;
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(p127m7.e eVar) throws java.lang.Throwable {
        o2.D.e eVar2;
        p153p2.a aVar;
        java.lang.Throwable th;
        p143o2.D d6;
        if (eVar instanceof o2.D.e) {
            eVar2 = (o2.D.e) eVar;
            int i6 = eVar2.f52335J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                eVar2.f52335J = i6 - Integer.MIN_VALUE;
            } else {
                eVar2 = new o2.D.e(eVar);
            }
        } else {
            eVar2 = new o2.D.e(eVar);
        }
        java.lang.Object obj = eVar2.f52333H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = eVar2.f52335J;
        if (i10 == 0) {
            p087i7.x.b(obj);
            p153p2.a aVarP = this.f52297a.p();
            if (!aVarP.a()) {
                return p097j7.Z.d();
            }
            try {
                if (!this.f52306j.a(true, false)) {
                    java.util.Set setD = p097j7.Z.d();
                    aVarP.c();
                    return setD;
                }
                if (!((java.lang.Boolean) this.f52307k.b()).booleanValue()) {
                    java.util.Set setD2 = p097j7.Z.d();
                    aVarP.c();
                    return setD2;
                }
                p143o2.n nVar = this.f52297a;
                o2.D.f fVar = new o2.D.f(null);
                eVar2.f52331F = this;
                eVar2.f52332G = aVarP;
                eVar2.f52335J = 1;
                java.lang.Object objO = nVar.O(false, fVar, eVar2);
                if (objO == objG) {
                    return objG;
                }
                aVar = aVarP;
                obj = objO;
                d6 = this;
            } catch (java.lang.Throwable th2) {
                aVar = aVarP;
                th = th2;
                aVar.c();
                throw th;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (p153p2.a) eVar2.f52332G;
            d6 = (p143o2.D) eVar2.f52331F;
            try {
                p087i7.x.b(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                aVar.c();
                throw th;
            }
        }
        java.util.Set set = (java.util.Set) obj;
        if (!set.isEmpty()) {
            d6.f52305i.b(set);
            d6.f52301e.l(set);
        }
        aVar.c();
        return set;
    }

    private final java.lang.String[] q(java.lang.String[] strArr) {
        java.util.Set setB = p097j7.Z.b();
        for (java.lang.String str : strArr) {
            java.util.Map map = this.f52299c;
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            p247y7.AbstractC7350t.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            java.util.Set set = (java.util.Set) map.get(lowerCase);
            if (set != null) {
                setB.addAll(set);
            } else {
                setB.add(str);
            }
        }
        return (java.lang.String[]) p097j7.Z.a(setB).toArray(new java.lang.String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00fe -> B:30:0x00ff). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object s(p143o2.k r18, int r19, p127m7.e r20) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p143o2.D.s(o2.k, int, m7.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:18:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0085 -> B:20:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object t(p143o2.k r10, int r11, p127m7.e r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof o2.D.k
            if (r0 == 0) goto L13
            r0 = r12
            o2.D$k r0 = (o2.D.k) r0
            int r1 = r0.f52368M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52368M = r1
            goto L18
        L13:
            o2.D$k r0 = new o2.D$k
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f52366K
            java.lang.Object r1 = p137n7.b.g()
            int r2 = r0.f52368M
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r10 = r0.f52365J
            int r11 = r0.f52364I
            java.lang.Object r2 = r0.f52363H
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.Object r4 = r0.f52362G
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.f52361F
            o2.k r5 = (p143o2.k) r5
            p087i7.x.b(r12)
            r12 = r4
            goto L87
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            p087i7.x.b(r12)
            java.lang.String[] r12 = r9.f52303g
            r11 = r12[r11]
            java.lang.String[] r12 = p143o2.D.f52296m
            int r2 = r12.length
            r4 = 0
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r12
            r12 = r8
        L52:
            if (r4 >= r10) goto L8b
            r5 = r2[r4]
            o2.D$a r6 = p143o2.D.f52295l
            java.lang.String r5 = o2.D.a.a(r6, r12, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "DROP TRIGGER IF EXISTS `"
            r6.append(r7)
            r6.append(r5)
            r5 = 96
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.f52361F = r11
            r0.f52362G = r12
            r0.f52363H = r2
            r0.f52364I = r4
            r0.f52365J = r10
            r0.f52368M = r3
            java.lang.Object r5 = p143o2.C.a(r11, r5, r0)
            if (r5 != r1) goto L85
            return r1
        L85:
            r5 = r11
            r11 = r4
        L87:
            int r4 = r11 + 1
            r11 = r5
            goto L52
        L8b:
            i7.M r10 = p087i7.M.f46721a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p143o2.D.t(o2.k, int, m7.e):java.lang.Object");
    }

    public final void i(p243y2.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "connection");
        p243y2.e eVarE = bVar.e("PRAGMA query_only");
        try {
            eVarE.p();
            boolean zM = eVarE.m(0);
            eVarE.close();
            if (zM) {
                return;
            }
            p243y2.a.a(bVar, "PRAGMA temp_store = MEMORY");
            p243y2.a.a(bVar, "PRAGMA recursive_triggers = 1");
            p243y2.a.a(bVar, "DROP TABLE IF EXISTS room_table_modification_log");
            p243y2.a.a(bVar, this.f52300d ? "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)" : S8.r.R("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false, 4, null));
            this.f52304h.a();
        } catch (java.lang.Throwable th) {
            eVarE.close();
            throw th;
        }
    }

    public final Z8.InterfaceC1869f j(java.lang.String[] strArr, int[] iArr, boolean z6) {
        p247y7.AbstractC7350t.f(strArr, "resolvedTableNames");
        p247y7.AbstractC7350t.f(iArr, "tableIds");
        return Z8.AbstractC1871h.x(new o2.D.d(iArr, z6, strArr, null));
    }

    public final boolean l(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "tableIds");
        return this.f52304h.c(iArr);
    }

    public final boolean m(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "tableIds");
        return this.f52304h.d(iArr);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(java.lang.String[] strArr, p237x7.a aVar, p237x7.a aVar2, p127m7.e eVar) {
        o2.D.h hVar;
        int[] iArr;
        if (eVar instanceof o2.D.h) {
            hVar = (o2.D.h) eVar;
            int i6 = hVar.f52347J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                hVar.f52347J = i6 - Integer.MIN_VALUE;
            } else {
                hVar = new o2.D.h(eVar);
            }
        } else {
            hVar = new o2.D.h(eVar);
        }
        java.lang.Object objK = hVar.f52345H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = hVar.f52347J;
        boolean z6 = true;
        try {
            if (i10 == 0) {
                p087i7.x.b(objK);
                iArr = (int[]) v(strArr).b();
                aVar.b();
                hVar.f52343F = aVar2;
                hVar.f52344G = iArr;
                hVar.f52347J = 1;
                objK = k(hVar);
                if (objK == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iArr = (int[]) hVar.f52344G;
                aVar2 = (p237x7.a) hVar.f52343F;
                p087i7.x.b(objK);
            }
            java.util.Set set = (java.util.Set) objK;
            if (!(!(iArr.length == 0))) {
                if (set.isEmpty()) {
                    z6 = false;
                    break;
                }
            } else {
                int length = iArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z6 = false;
                        break;
                    }
                    if (set.contains(p147o7.b.c(iArr[i11]))) {
                        break;
                    }
                    i11++;
                }
            }
            java.lang.Boolean boolA = p147o7.b.a(z6);
            aVar2.b();
            return boolA;
        } catch (java.lang.Throwable th) {
            aVar2.b();
            throw th;
        }
    }

    public final void o(p237x7.a aVar, p237x7.a aVar2) {
        p247y7.AbstractC7350t.f(aVar, "onRefreshScheduled");
        p247y7.AbstractC7350t.f(aVar2, "onRefreshCompleted");
        if (this.f52306j.a(false, true)) {
            aVar.b();
            W8.AbstractC1788i.d(this.f52297a.q(), new W8.M("Room Invalidation Tracker Refresh"), null, new o2.D.i(aVar2, null), 2, null);
        }
    }

    public final void p() {
        this.f52304h.e();
    }

    public final void r(p237x7.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "<set-?>");
        this.f52307k = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object u(p127m7.e eVar) throws java.lang.Throwable {
        o2.D.l lVar;
        p153p2.a aVar;
        java.lang.Throwable th;
        if (eVar instanceof o2.D.l) {
            lVar = (o2.D.l) eVar;
            int i6 = lVar.f52372I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                lVar.f52372I = i6 - Integer.MIN_VALUE;
            } else {
                lVar = new o2.D.l(eVar);
            }
        } else {
            lVar = new o2.D.l(eVar);
        }
        java.lang.Object obj = lVar.f52370G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = lVar.f52372I;
        if (i10 == 0) {
            p087i7.x.b(obj);
            p153p2.a aVarP = this.f52297a.p();
            if (aVarP.a()) {
                try {
                    p143o2.n nVar = this.f52297a;
                    o2.D.m mVar = new o2.D.m(null);
                    lVar.f52369F = aVarP;
                    lVar.f52372I = 1;
                    if (nVar.O(false, mVar, lVar) == objG) {
                        return objG;
                    }
                    aVar = aVarP;
                    aVar.c();
                } catch (java.lang.Throwable th2) {
                    aVar = aVarP;
                    th = th2;
                    aVar.c();
                    throw th;
                }
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (p153p2.a) lVar.f52369F;
            try {
                p087i7.x.b(obj);
                aVar.c();
            } catch (java.lang.Throwable th3) {
                th = th3;
                aVar.c();
                throw th;
            }
        }
        return p087i7.M.f46721a;
    }

    public final p087i7.u v(java.lang.String[] strArr) {
        p247y7.AbstractC7350t.f(strArr, "names");
        java.lang.String[] strArrQ = q(strArr);
        int length = strArrQ.length;
        int[] iArr = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            java.lang.String str = strArrQ[i6];
            java.util.Map map = this.f52302f;
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            p247y7.AbstractC7350t.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            java.lang.Integer num = (java.lang.Integer) map.get(lowerCase);
            if (num == null) {
                throw new java.lang.IllegalArgumentException("There is no table with name " + str);
            }
            iArr[i6] = num.intValue();
        }
        return p087i7.B.a(strArrQ, iArr);
    }
}
