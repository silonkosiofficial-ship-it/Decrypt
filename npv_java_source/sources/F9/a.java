package F9;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList f2992a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private F9.c f2993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Z8.y f2994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Z8.InterfaceC1869f f2995d;

    /* JADX INFO: renamed from: F9.a$a, reason: collision with other inner class name */
    public static final class C0070a implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f2996C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ F9.a f2997D;

        /* JADX INFO: renamed from: F9.a$a$a, reason: collision with other inner class name */
        public static final class C0071a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f2998C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ F9.a f2999D;

            /* JADX INFO: renamed from: F9.a$a$a$a, reason: collision with other inner class name */
            public static final class C0072a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f3000F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f3001G;

                public C0072a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f3000F = obj;
                    this.f3001G |= Integer.MIN_VALUE;
                    return F9.a.C0070a.C0071a.this.a(null, this);
                }
            }

            public C0071a(Z8.InterfaceC1870g interfaceC1870g, F9.a aVar) {
                this.f2998C = interfaceC1870g;
                this.f2999D = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                F9.a.C0070a.C0071a.C0072a c0072a;
                if (eVar instanceof F9.a.C0070a.C0071a.C0072a) {
                    c0072a = (F9.a.C0070a.C0071a.C0072a) eVar;
                    int i6 = c0072a.f3001G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0072a.f3001G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0072a = new F9.a.C0070a.C0071a.C0072a(eVar);
                    }
                } else {
                    c0072a = new F9.a.C0070a.C0071a.C0072a(eVar);
                }
                java.lang.Object obj2 = c0072a.f3000F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0072a.f3001G;
                if (i10 == 0) {
                    p087i7.x.b(obj2);
                    Z8.InterfaceC1870g interfaceC1870g = this.f2998C;
                    ((java.lang.Number) obj).intValue();
                    java.util.ArrayList arrayListC = this.f2999D.c();
                    boolean z6 = false;
                    if (!(arrayListC instanceof java.util.Collection) || !arrayListC.isEmpty()) {
                        java.util.Iterator it = arrayListC.iterator();
                        while (it.hasNext()) {
                            if (((F9.c) it.next()).isEnabled()) {
                                z6 = true;
                                break;
                            }
                        }
                    }
                    java.lang.Boolean boolA = p147o7.b.a(z6);
                    c0072a.f3001G = 1;
                    if (interfaceC1870g.a(boolA, c0072a) == objG) {
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

        public C0070a(Z8.InterfaceC1869f interfaceC1869f, F9.a aVar) {
            this.f2996C = interfaceC1869f;
            this.f2997D = aVar;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f2996C.b(new F9.a.C0070a.C0071a(interfaceC1870g, this.f2997D), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    public a() {
        Z8.y yVarA = Z8.P.a(0);
        this.f2994c = yVarA;
        this.f2995d = new F9.a.C0070a(yVarA, this);
    }

    private final F9.c a() {
        java.lang.Object objPrevious;
        F9.c cVar = this.f2993b;
        if (cVar != null) {
            return cVar;
        }
        java.util.ArrayList arrayList = this.f2992a;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            objPrevious = listIterator.previous();
            if (((F9.c) objPrevious).isEnabled()) {
                return (F9.c) objPrevious;
            }
        }
        objPrevious = null;
        return (F9.c) objPrevious;
    }

    public final Z8.InterfaceC1869f b() {
        return this.f2995d;
    }

    public final java.util.ArrayList c() {
        return this.f2992a;
    }

    public final void d() {
        F9.c cVarA = a();
        this.f2993b = null;
        if (cVarA != null) {
            cVarA.a();
        }
    }

    public final void e() {
        F9.c cVarA = a();
        this.f2993b = null;
        if (cVarA != null) {
            cVarA.d();
        }
    }

    public final void f(float f6) {
        F9.c cVarA = a();
        if (cVarA != null) {
            cVarA.c(f6);
        }
    }

    public final void g() {
        Z8.y yVar = this.f2994c;
        yVar.setValue(java.lang.Integer.valueOf(((java.lang.Number) yVar.getValue()).intValue() + 1));
    }

    public final void h() {
        java.lang.Object objPrevious;
        java.util.ArrayList arrayList = this.f2992a;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((F9.c) objPrevious).isEnabled());
        F9.c cVar = (F9.c) objPrevious;
        this.f2993b = cVar;
        if (cVar != null) {
            cVar.b();
        }
    }

    public final void i(F9.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "handler");
        this.f2992a.add(cVar);
        g();
    }

    public final void j(F9.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "handler");
        this.f2992a.remove(cVar);
        g();
    }
}
