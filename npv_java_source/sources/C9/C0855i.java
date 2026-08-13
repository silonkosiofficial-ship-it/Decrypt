package C9;

/* JADX INFO: renamed from: C9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0855i implements androidx.lifecycle.InterfaceC2083o {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private C9.C0857k f1447C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Z8.y f1448D = Z8.P.a(p097j7.AbstractC6879v.m());

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private C9.N f1449E = new C9.N();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.LinkedHashMap f1450F = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private C9.I f1451G;

    /* JADX INFO: renamed from: C9.i$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1452a;

        static {
            int[] iArr = new int[androidx.lifecycle.AbstractC2079k.a.values().length];
            try {
                iArr[androidx.lifecycle.AbstractC2079k.a.ON_DESTROY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            f1452a = iArr;
        }
    }

    /* JADX INFO: renamed from: C9.i$b */
    public static final class b implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f1453C;

        /* JADX INFO: renamed from: C9.i$b$a */
        public static final class a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f1454C;

            /* JADX INFO: renamed from: C9.i$b$a$a, reason: collision with other inner class name */
            public static final class C0023a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f1455F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f1456G;

                public C0023a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f1455F = obj;
                    this.f1456G |= Integer.MIN_VALUE;
                    return C9.C0855i.b.a.this.a(null, this);
                }
            }

            public a(Z8.InterfaceC1870g interfaceC1870g) {
                this.f1454C = interfaceC1870g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                C9.C0855i.b.a.C0023a c0023a;
                if (eVar instanceof C9.C0855i.b.a.C0023a) {
                    c0023a = (C9.C0855i.b.a.C0023a) eVar;
                    int i6 = c0023a.f1456G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0023a.f1456G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0023a = new C9.C0855i.b.a.C0023a(eVar);
                    }
                } else {
                    c0023a = new C9.C0855i.b.a.C0023a(eVar);
                }
                java.lang.Object obj2 = c0023a.f1455F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0023a.f1456G;
                if (i10 == 0) {
                    p087i7.x.b(obj2);
                    Z8.InterfaceC1870g interfaceC1870g = this.f1454C;
                    java.lang.Object objV0 = p097j7.AbstractC6879v.v0((java.util.List) obj);
                    c0023a.f1456G = 1;
                    if (interfaceC1870g.a(objV0, c0023a) == objG) {
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

        public b(Z8.InterfaceC1869f interfaceC1869f) {
            this.f1453C = interfaceC1869f;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f1453C.b(new C9.C0855i.b.a(interfaceC1870g), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: C9.i$c */
    public static final class c implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f1458C;

        /* JADX INFO: renamed from: C9.i$c$a */
        public static final class a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f1459C;

            /* JADX INFO: renamed from: C9.i$c$a$a, reason: collision with other inner class name */
            public static final class C0024a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f1460F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f1461G;

                public C0024a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f1460F = obj;
                    this.f1461G |= Integer.MIN_VALUE;
                    return C9.C0855i.c.a.this.a(null, this);
                }
            }

            public a(Z8.InterfaceC1870g interfaceC1870g) {
                this.f1459C = interfaceC1870g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                C9.C0855i.c.a.C0024a c0024a;
                if (eVar instanceof C9.C0855i.c.a.C0024a) {
                    c0024a = (C9.C0855i.c.a.C0024a) eVar;
                    int i6 = c0024a.f1461G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0024a.f1461G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0024a = new C9.C0855i.c.a.C0024a(eVar);
                    }
                } else {
                    c0024a = new C9.C0855i.c.a.C0024a(eVar);
                }
                java.lang.Object obj2 = c0024a.f1460F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0024a.f1461G;
                if (i10 == 0) {
                    p087i7.x.b(obj2);
                    Z8.InterfaceC1870g interfaceC1870g = this.f1459C;
                    java.lang.Object objV0 = p097j7.AbstractC6879v.v0(p097j7.AbstractC6879v.d0((java.util.List) obj, 1));
                    c0024a.f1461G = 1;
                    if (interfaceC1870g.a(objV0, c0024a) == objG) {
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

        public c(Z8.InterfaceC1869f interfaceC1869f) {
            this.f1458C = interfaceC1869f;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f1458C.b(new C9.C0855i.c.a(interfaceC1870g), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: C9.i$d */
    public static final class d implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f1463C;

        /* JADX INFO: renamed from: C9.i$d$a */
        public static final class a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f1464C;

            /* JADX INFO: renamed from: C9.i$d$a$a, reason: collision with other inner class name */
            public static final class C0025a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f1465F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f1466G;

                public C0025a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f1465F = obj;
                    this.f1466G |= Integer.MIN_VALUE;
                    return C9.C0855i.d.a.this.a(null, this);
                }
            }

            public a(Z8.InterfaceC1870g interfaceC1870g) {
                this.f1464C = interfaceC1870g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                C9.C0855i.d.a.C0025a c0025a;
                if (eVar instanceof C9.C0855i.d.a.C0025a) {
                    c0025a = (C9.C0855i.d.a.C0025a) eVar;
                    int i6 = c0025a.f1466G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0025a.f1466G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0025a = new C9.C0855i.d.a.C0025a(eVar);
                    }
                } else {
                    c0025a = new C9.C0855i.d.a.C0025a(eVar);
                }
                java.lang.Object obj2 = c0025a.f1465F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0025a.f1466G;
                if (i10 == 0) {
                    p087i7.x.b(obj2);
                    Z8.InterfaceC1870g interfaceC1870g = this.f1464C;
                    java.lang.Boolean boolA = p147o7.b.a(((java.util.List) obj).size() > 1);
                    c0025a.f1466G = 1;
                    if (interfaceC1870g.a(boolA, c0025a) == objG) {
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

        public d(Z8.InterfaceC1869f interfaceC1869f) {
            this.f1463C = interfaceC1869f;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f1463C.b(new C9.C0855i.d.a(interfaceC1870g), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: C9.i$e */
    public static final class e implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f1468C;

        /* JADX INFO: renamed from: C9.i$e$a */
        public static final class a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f1469C;

            /* JADX INFO: renamed from: C9.i$e$a$a, reason: collision with other inner class name */
            public static final class C0026a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f1470F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f1471G;

                public C0026a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f1470F = obj;
                    this.f1471G |= Integer.MIN_VALUE;
                    return C9.C0855i.e.a.this.a(null, this);
                }
            }

            public a(Z8.InterfaceC1870g interfaceC1870g) {
                this.f1469C = interfaceC1870g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                C9.C0855i.e.a.C0026a c0026a;
                java.lang.Object objPrevious;
                if (eVar instanceof C9.C0855i.e.a.C0026a) {
                    c0026a = (C9.C0855i.e.a.C0026a) eVar;
                    int i6 = c0026a.f1471G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0026a.f1471G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0026a = new C9.C0855i.e.a.C0026a(eVar);
                    }
                } else {
                    c0026a = new C9.C0855i.e.a.C0026a(eVar);
                }
                java.lang.Object obj2 = c0026a.f1470F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0026a.f1471G;
                if (i10 == 0) {
                    p087i7.x.b(obj2);
                    Z8.InterfaceC1870g interfaceC1870g = this.f1469C;
                    java.util.List list = (java.util.List) obj;
                    java.util.ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                    } while (!D9.b.b(((C9.C0853g) objPrevious).k()));
                    c0026a.f1471G = 1;
                    if (interfaceC1870g.a(objPrevious, c0026a) == objG) {
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

        public e(Z8.InterfaceC1869f interfaceC1869f) {
            this.f1468C = interfaceC1869f;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f1468C.b(new C9.C0855i.e.a(interfaceC1870g), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: C9.i$f */
    public static final class f implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f1473C;

        /* JADX INFO: renamed from: C9.i$f$a */
        public static final class a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f1474C;

            /* JADX INFO: renamed from: C9.i$f$a$a, reason: collision with other inner class name */
            public static final class C0027a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f1475F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f1476G;

                public C0027a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f1475F = obj;
                    this.f1476G |= Integer.MIN_VALUE;
                    return C9.C0855i.f.a.this.a(null, this);
                }
            }

            public a(Z8.InterfaceC1870g interfaceC1870g) {
                this.f1474C = interfaceC1870g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                C9.C0855i.f.a.C0027a c0027a;
                java.util.List listM;
                java.lang.Object objPrevious;
                if (eVar instanceof C9.C0855i.f.a.C0027a) {
                    c0027a = (C9.C0855i.f.a.C0027a) eVar;
                    int i6 = c0027a.f1476G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0027a.f1476G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0027a = new C9.C0855i.f.a.C0027a(eVar);
                    }
                } else {
                    c0027a = new C9.C0855i.f.a.C0027a(eVar);
                }
                java.lang.Object obj2 = c0027a.f1475F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0027a.f1476G;
                if (i10 == 0) {
                    p087i7.x.b(obj2);
                    Z8.InterfaceC1870g interfaceC1870g = this.f1474C;
                    java.util.List list = (java.util.List) obj;
                    if (!list.isEmpty()) {
                        java.util.ListIterator listIterator = list.listIterator(list.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                listM = p097j7.AbstractC6879v.m();
                                break;
                            }
                            if (!(!D9.b.b(((C9.C0853g) listIterator.previous()).k()))) {
                                listM = p097j7.AbstractC6879v.M0(list, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    } else {
                        listM = p097j7.AbstractC6879v.m();
                        break;
                    }
                    java.util.List listD0 = p097j7.AbstractC6879v.d0(listM, 1);
                    java.util.ListIterator listIterator2 = listD0.listIterator(listD0.size());
                    do {
                        if (!listIterator2.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator2.previous();
                    } while (!D9.b.b(((C9.C0853g) objPrevious).k()));
                    c0027a.f1476G = 1;
                    if (interfaceC1870g.a(objPrevious, c0027a) == objG) {
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

        public f(Z8.InterfaceC1869f interfaceC1869f) {
            this.f1473C = interfaceC1869f;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f1473C.b(new C9.C0855i.f.a(interfaceC1870g), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: C9.i$g */
    public static final class g implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f1478C;

        /* JADX INFO: renamed from: C9.i$g$a */
        public static final class a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f1479C;

            /* JADX INFO: renamed from: C9.i$g$a$a, reason: collision with other inner class name */
            public static final class C0028a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f1480F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f1481G;

                public C0028a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f1480F = obj;
                    this.f1481G |= Integer.MIN_VALUE;
                    return C9.C0855i.g.a.this.a(null, this);
                }
            }

            public a(Z8.InterfaceC1870g interfaceC1870g) {
                this.f1479C = interfaceC1870g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                C9.C0855i.g.a.C0028a c0028a;
                java.lang.Object objPrevious;
                if (eVar instanceof C9.C0855i.g.a.C0028a) {
                    c0028a = (C9.C0855i.g.a.C0028a) eVar;
                    int i6 = c0028a.f1481G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0028a.f1481G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0028a = new C9.C0855i.g.a.C0028a(eVar);
                    }
                } else {
                    c0028a = new C9.C0855i.g.a.C0028a(eVar);
                }
                java.lang.Object obj2 = c0028a.f1480F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0028a.f1481G;
                if (i10 == 0) {
                    p087i7.x.b(obj2);
                    Z8.InterfaceC1870g interfaceC1870g = this.f1479C;
                    java.util.List list = (java.util.List) obj;
                    java.util.ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                    } while (!D9.b.a(((C9.C0853g) objPrevious).k()));
                    c0028a.f1481G = 1;
                    if (interfaceC1870g.a(objPrevious, c0028a) == objG) {
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

        public g(Z8.InterfaceC1869f interfaceC1869f) {
            this.f1478C = interfaceC1869f;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f1478C.b(new C9.C0855i.g.a(interfaceC1870g), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    public static /* synthetic */ void n(C9.C0855i c0855i, java.lang.Object obj, int i6, java.lang.Object obj2) {
        if ((i6 & 1) != 0) {
            obj = null;
        }
        c0855i.m(obj);
    }

    public static /* synthetic */ void q(C9.C0855i c0855i, java.lang.String str, C9.u uVar, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            uVar = null;
        }
        c0855i.p(str, uVar);
    }

    private final void s(C9.I i6) {
        this.f1451G = i6;
        if (i6 != null) {
            this.f1449E = new C9.N();
            java.util.List<D9.c> listB = i6.b();
            java.util.ArrayList<p087i7.u> arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listB, 10));
            for (D9.c cVar : listB) {
                java.util.List listC = C9.N.f1402c.c(cVar.b());
                if (cVar instanceof D9.d) {
                    java.util.List list = listC;
                    java.util.List listC2 = ((D9.d) cVar).c();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it = listC2.iterator();
                    while (it.hasNext()) {
                        p097j7.AbstractC6879v.C(arrayList2, C9.N.f1402c.c((java.lang.String) it.next()));
                    }
                    listC = p097j7.AbstractC6879v.C0(list, arrayList2);
                }
                arrayList.add(p087i7.B.a(listC, cVar));
            }
            java.util.ArrayList<p087i7.u> arrayList3 = new java.util.ArrayList();
            for (p087i7.u uVar : arrayList) {
                java.lang.Iterable iterable = (java.lang.Iterable) uVar.c();
                java.util.ArrayList arrayList4 = new java.util.ArrayList(p097j7.AbstractC6879v.x(iterable, 10));
                java.util.Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(p087i7.B.a((java.lang.String) it2.next(), uVar.d()));
                }
                p097j7.AbstractC6879v.C(arrayList3, arrayList4);
            }
            for (p087i7.u uVar2 : arrayList3) {
                this.f1449E.d((java.lang.String) uVar2.c(), (D9.c) uVar2.d());
            }
        }
    }

    public final boolean a(C9.C0853g c0853g) {
        p247y7.AbstractC7350t.f(c0853g, "entry");
        return ((java.util.List) this.f1448D.getValue()).contains(c0853g);
    }

    public final Z8.y b() {
        return this.f1448D;
    }

    public final Z8.InterfaceC1869f c() {
        return new C9.C0855i.d(Z8.AbstractC1871h.a(this.f1448D));
    }

    public final Z8.InterfaceC1869f d() {
        return new C9.C0855i.b(Z8.AbstractC1871h.a(this.f1448D));
    }

    public final Z8.InterfaceC1869f e() {
        return new C9.C0855i.g(Z8.AbstractC1871h.a(this.f1448D));
    }

    public final Z8.InterfaceC1869f h() {
        return new C9.C0855i.e(Z8.AbstractC1871h.a(this.f1448D));
    }

    @Override // androidx.lifecycle.InterfaceC2083o
    public void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
        p247y7.AbstractC7350t.f(rVar, "source");
        p247y7.AbstractC7350t.f(aVar, "event");
        if (C9.C0855i.a.f1452a[aVar.ordinal()] == 1) {
            java.util.Iterator it = ((java.lang.Iterable) this.f1448D.getValue()).iterator();
            while (it.hasNext()) {
                ((C9.C0853g) it.next()).e();
            }
            this.f1448D.setValue(p097j7.AbstractC6879v.m());
            return;
        }
        C9.C0853g c0853g = (C9.C0853g) p097j7.AbstractC6879v.v0((java.util.List) this.f1448D.getValue());
        if (c0853g != null) {
            c0853g.v(rVar, aVar);
        }
    }

    public final Z8.InterfaceC1869f j() {
        return new C9.C0855i.c(Z8.AbstractC1871h.a(this.f1448D));
    }

    public final Z8.InterfaceC1869f k() {
        return new C9.C0855i.f(Z8.AbstractC1871h.a(this.f1448D));
    }

    public final void l(androidx.lifecycle.r rVar, androidx.lifecycle.Y y6) {
        p247y7.AbstractC7350t.f(rVar, "lifecycleOwner");
        p247y7.AbstractC7350t.f(y6, "viewModelStoreOwner");
        this.f1447C = C9.C0857k.f1484c.a(y6.n());
        rVar.u().a(this);
    }

    public final void m(java.lang.Object obj) {
        java.util.List list = (java.util.List) this.f1448D.getValue();
        if (list.size() > 1) {
            C9.C0853g c0853g = (C9.C0853g) p097j7.AbstractC6879v.t0(list);
            this.f1448D.setValue(p097j7.AbstractC6879v.d0(list, 1));
            c0853g.e();
            p127m7.e eVar = (p127m7.e) this.f1450F.remove(c0853g);
            if (eVar != null) {
                eVar.t(p087i7.w.b(obj));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:43:0x0105  */
    public final void p(java.lang.String str, C9.u uVar) {
        C9.G g6;
        C9.C0857k c0857k;
        C9.C0857k c0857k2;
        int iNextIndex;
        p247y7.AbstractC7350t.f(str, "path");
        java.util.List listD0 = (java.util.List) this.f1448D.getValue();
        java.lang.String strF1 = S8.r.f1(str, '?', "");
        java.lang.Object obj = null;
        C9.K kB = this.f1449E.b(S8.r.p1(str, '?', null, 2, null));
        if (kB == null) {
            throw new java.lang.IllegalStateException(("RouteStackManager: navigate target " + str + " not found").toString());
        }
        if (uVar == null || !uVar.b()) {
            Z8.y yVar = this.f1448D;
            java.util.Collection collection = (java.util.Collection) yVar.getValue();
            java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
            p247y7.AbstractC7350t.e(uuidRandomUUID, "randomUUID(...)");
            java.lang.String string = uuidRandomUUID.toString();
            p247y7.AbstractC7350t.e(string, "toString(...)");
            D9.c cVarB = kB.b();
            java.util.Map mapA = kB.a();
            if (strF1.length() <= 0) {
                strF1 = null;
            }
            if (strF1 != null) {
                g6 = new C9.G(strF1);
            } else {
                g6 = null;
            }
            c0857k = this.f1447C;
            if (c0857k == null) {
                p247y7.AbstractC7350t.p("_navControllerViewModel");
                c0857k2 = null;
            } else {
                c0857k2 = c0857k;
            }
            yVar.setValue(p097j7.AbstractC6879v.D0(collection, new C9.C0853g(string, cVarB, str, mapA, c0857k2, g6)));
        } else {
            java.util.List list = listD0;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                Z8.y yVar2 = this.f1448D;
                java.util.Collection collection2 = (java.util.Collection) yVar2.getValue();
                java.util.UUID uuidRandomUUID2 = java.util.UUID.randomUUID();
                p247y7.AbstractC7350t.e(uuidRandomUUID2, "randomUUID(...)");
                java.lang.String string2 = uuidRandomUUID2.toString();
                p247y7.AbstractC7350t.e(string2, "toString(...)");
                D9.c cVarB2 = kB.b();
                java.util.Map mapA2 = kB.a();
                if (strF1.length() <= 0) {
                    strF1 = null;
                }
                if (strF1 != null) {
                    g6 = new C9.G(strF1);
                } else {
                    g6 = null;
                }
                c0857k = this.f1447C;
                if (c0857k == null) {
                    p247y7.AbstractC7350t.p("_navControllerViewModel");
                    c0857k2 = null;
                } else {
                    c0857k2 = c0857k;
                }
                yVar2.setValue(p097j7.AbstractC6879v.D0(collection2, new C9.C0853g(string2, cVarB2, str, mapA2, c0857k2, g6)));
            } else {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Z8.y yVar3 = this.f1448D;
                        java.util.Collection collection3 = (java.util.Collection) yVar3.getValue();
                        java.util.UUID uuidRandomUUID3 = java.util.UUID.randomUUID();
                        p247y7.AbstractC7350t.e(uuidRandomUUID3, "randomUUID(...)");
                        java.lang.String string3 = uuidRandomUUID3.toString();
                        p247y7.AbstractC7350t.e(string3, "toString(...)");
                        D9.c cVarB3 = kB.b();
                        java.util.Map mapA3 = kB.a();
                        if (strF1.length() <= 0) {
                            strF1 = null;
                        }
                        if (strF1 != null) {
                            g6 = new C9.G(strF1);
                        } else {
                            g6 = null;
                        }
                        c0857k = this.f1447C;
                        if (c0857k == null) {
                            p247y7.AbstractC7350t.p("_navControllerViewModel");
                            c0857k2 = null;
                        } else {
                            c0857k2 = c0857k;
                        }
                        yVar3.setValue(p097j7.AbstractC6879v.D0(collection3, new C9.C0853g(string3, cVarB3, str, mapA3, c0857k2, g6)));
                    } else if (C9.AbstractC0854h.a((C9.C0853g) it.next(), kB.b().b(), str, uVar.a())) {
                        for (java.lang.Object obj2 : list) {
                            if (C9.AbstractC0854h.a((C9.C0853g) obj2, kB.b().b(), str, uVar.a())) {
                                obj = obj2;
                                break;
                            }
                        }
                        C9.C0853g c0853g = (C9.C0853g) obj;
                        if (c0853g != null) {
                            Z8.y yVar4 = this.f1448D;
                            java.lang.Iterable iterable = (java.lang.Iterable) yVar4.getValue();
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj3 : iterable) {
                                if (!p247y7.AbstractC7350t.b(((C9.C0853g) obj3).m(), c0853g.m())) {
                                    arrayList.add(obj3);
                                }
                            }
                            yVar4.setValue(p097j7.AbstractC6879v.D0(arrayList, c0853g));
                        }
                    }
                }
            }
        }
        if (uVar != null) {
            C9.B bC = uVar.c();
            C9.B.b bVar = C9.B.b.f1385a;
            if (p247y7.AbstractC7350t.b(bC, bVar)) {
                return;
            }
            if (uVar.b()) {
                listD0 = p097j7.AbstractC6879v.d0((java.util.List) this.f1448D.getValue(), 1);
            }
            C9.B bC2 = uVar.c();
            if (p247y7.AbstractC7350t.b(bC2, bVar)) {
                iNextIndex = -1;
                break;
            }
            if (p247y7.AbstractC7350t.b(bC2, C9.B.c.f1386a)) {
                iNextIndex = p097j7.AbstractC6879v.o(listD0) - 1;
            } else {
                if (!(bC2 instanceof C9.B.d)) {
                    throw new p087i7.s();
                }
                C9.B.d dVar = (C9.B.d) bC2;
                if (dVar.b().length() > 0) {
                    java.util.ListIterator listIterator = listD0.listIterator(listD0.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (C9.AbstractC0854h.a((C9.C0853g) listIterator.previous(), dVar.b(), str, uVar.a())) {
                                iNextIndex = listIterator.nextIndex();
                                break;
                            }
                        } else {
                            iNextIndex = -1;
                            break;
                        }
                    }
                } else {
                    iNextIndex = 0;
                }
            }
            if (iNextIndex != -1) {
                if (!bC2.a()) {
                    iNextIndex++;
                }
                java.util.List listSubList = listD0.subList(iNextIndex, listD0.size());
                Z8.y yVar5 = this.f1448D;
                java.util.List list2 = listSubList;
                yVar5.setValue(p097j7.AbstractC6879v.y0((java.lang.Iterable) yVar5.getValue(), list2));
                java.util.Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((C9.C0853g) it2.next()).e();
                }
            }
        }
    }

    public final void r(C9.I i6) {
        D9.c cVarL;
        p247y7.AbstractC7350t.f(i6, "routeGraph");
        if (!p247y7.AbstractC7350t.b(this.f1451G, i6)) {
            if (this.f1451G != null) {
                java.util.Iterator it = ((java.lang.Iterable) this.f1448D.getValue()).iterator();
                while (it.hasNext()) {
                    ((C9.C0853g) it.next()).e();
                }
                this.f1448D.setValue(p097j7.AbstractC6879v.m());
            }
            s(i6);
            q(this, i6.a(), null, 2, null);
            return;
        }
        s(i6);
        for (C9.C0853g c0853g : (java.lang.Iterable) this.f1448D.getValue()) {
            C9.K kB = this.f1449E.b(c0853g.i());
            if (kB == null || (cVarL = kB.b()) == null) {
                cVarL = c0853g.l();
            }
            c0853g.w(cVarL);
        }
    }
}
