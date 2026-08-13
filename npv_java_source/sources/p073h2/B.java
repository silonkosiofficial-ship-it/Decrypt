package p073h2;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p073h2.E f45878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f45879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f45880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f45881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f45882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f45883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f45884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f45885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Y8.j f45886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Y8.j f45887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.Map f45888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p073h2.C6645w f45889l;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p073h2.E f45890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p059f9.a f45891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p073h2.B f45892c;

        public a(p073h2.E e6) {
            p247y7.AbstractC7350t.f(e6, "config");
            this.f45890a = e6;
            this.f45891b = p059f9.g.b(false, 1, null);
            this.f45892c = new p073h2.B(e6, null);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45893a;

        static {
            int[] iArr = new int[p073h2.EnumC6642t.values().length];
            try {
                iArr[p073h2.EnumC6642t.REFRESH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p073h2.EnumC6642t.PREPEND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p073h2.EnumC6642t.APPEND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f45893a = iArr;
        }
    }

    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f45894G;

        c(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f45894G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            p073h2.B.this.f45887j.j(p147o7.b.c(p073h2.B.this.f45885h));
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            return ((h2.B.c) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p073h2.B.this.new c(eVar);
        }
    }

    static final class d extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f45896G;

        d(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f45896G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            p073h2.B.this.f45886i.j(p147o7.b.c(p073h2.B.this.f45884g));
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            return ((h2.B.d) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p073h2.B.this.new d(eVar);
        }
    }

    private B(p073h2.E e6) {
        this.f45878a = e6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f45879b = arrayList;
        this.f45880c = arrayList;
        this.f45886i = Y8.m.b(-1, null, null, 6, null);
        this.f45887j = Y8.m.b(-1, null, null, 6, null);
        this.f45888k = new java.util.LinkedHashMap();
        p073h2.C6645w c6645w = new p073h2.C6645w();
        c6645w.c(p073h2.EnumC6642t.REFRESH, h2.r.b.f46234b);
        this.f45889l = c6645w;
    }

    public /* synthetic */ B(p073h2.E e6, p247y7.AbstractC7342k abstractC7342k) {
        this(e6);
    }

    public final Z8.InterfaceC1869f e() {
        return Z8.AbstractC1871h.H(Z8.AbstractC1871h.m(this.f45887j), new h2.B.c(null));
    }

    public final Z8.InterfaceC1869f f() {
        return Z8.AbstractC1871h.H(Z8.AbstractC1871h.m(this.f45886i), new h2.B.d(null));
    }

    public final p073h2.M g(h2.Z.a aVar) {
        java.lang.Integer numValueOf;
        java.util.List listT0 = p097j7.AbstractC6879v.T0(this.f45880c);
        if (aVar != null) {
            int iO = o();
            int i6 = -this.f45881d;
            int iO2 = p097j7.AbstractC6879v.o(this.f45880c) - this.f45881d;
            int iG = aVar.g();
            int i10 = i6;
            while (i10 < iG) {
                iO += i10 > iO2 ? this.f45878a.f45909a : ((h2.L.b.c) this.f45880c.get(this.f45881d + i10)).d().size();
                i10++;
            }
            int iF = iO + aVar.f();
            if (aVar.g() < i6) {
                iF -= this.f45878a.f45909a;
            }
            numValueOf = java.lang.Integer.valueOf(iF);
        } else {
            numValueOf = null;
        }
        return new p073h2.M(listT0, numValueOf, this.f45878a, o());
    }

    public final void h(p073h2.AbstractC6646x.a aVar) {
        int i6;
        Y8.j jVar;
        p247y7.AbstractC7350t.f(aVar, "event");
        if (aVar.f() > this.f45880c.size()) {
            throw new java.lang.IllegalStateException(("invalid drop count. have " + this.f45880c.size() + " but wanted to drop " + aVar.f()).toString());
        }
        this.f45888k.remove(aVar.c());
        this.f45889l.c(aVar.c(), h2.r.c.f46235b.b());
        int i10 = h2.B.b.f45893a[aVar.c().ordinal()];
        if (i10 == 2) {
            int iF = aVar.f();
            for (int i11 = 0; i11 < iF; i11++) {
                this.f45879b.remove(0);
            }
            this.f45881d -= aVar.f();
            t(aVar.g());
            i6 = this.f45884g + 1;
            this.f45884g = i6;
            jVar = this.f45886i;
        } else {
            if (i10 != 3) {
                throw new java.lang.IllegalArgumentException("cannot drop " + aVar.c());
            }
            int iF2 = aVar.f();
            for (int i12 = 0; i12 < iF2; i12++) {
                this.f45879b.remove(this.f45880c.size() - 1);
            }
            s(aVar.g());
            i6 = this.f45885h + 1;
            this.f45885h = i6;
            jVar = this.f45887j;
        }
        jVar.j(java.lang.Integer.valueOf(i6));
    }

    public final p073h2.AbstractC6646x.a i(p073h2.EnumC6642t enumC6642t, p073h2.Z z6) {
        java.lang.Object obj;
        p247y7.AbstractC7350t.f(enumC6642t, "loadType");
        p247y7.AbstractC7350t.f(z6, "hint");
        p073h2.AbstractC6646x.a aVar = null;
        if (this.f45878a.f45913e == Integer.MAX_VALUE || this.f45880c.size() <= 2 || q() <= this.f45878a.f45913e) {
            return null;
        }
        if (enumC6642t == p073h2.EnumC6642t.REFRESH) {
            throw new java.lang.IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + enumC6642t).toString());
        }
        int iO = 0;
        int i6 = 0;
        int i10 = 0;
        while (i6 < this.f45880c.size() && q() - i10 > this.f45878a.f45913e) {
            int[] iArr = h2.B.b.f45893a;
            if (iArr[enumC6642t.ordinal()] == 2) {
                obj = this.f45880c.get(i6);
            } else {
                java.util.List list = this.f45880c;
                obj = list.get(p097j7.AbstractC6879v.o(list) - i6);
            }
            int size = ((h2.L.b.c) obj).d().size();
            if (((iArr[enumC6642t.ordinal()] == 2 ? z6.d() : z6.c()) - i10) - size < this.f45878a.f45910b) {
                break;
            }
            i10 += size;
            i6++;
        }
        if (i6 != 0) {
            int[] iArr2 = h2.B.b.f45893a;
            int iO2 = iArr2[enumC6642t.ordinal()] == 2 ? -this.f45881d : (p097j7.AbstractC6879v.o(this.f45880c) - this.f45881d) - (i6 - 1);
            int iO3 = iArr2[enumC6642t.ordinal()] == 2 ? (i6 - 1) - this.f45881d : p097j7.AbstractC6879v.o(this.f45880c) - this.f45881d;
            if (this.f45878a.f45911c) {
                iO = (enumC6642t == p073h2.EnumC6642t.PREPEND ? o() : n()) + i10;
            }
            aVar = new p073h2.AbstractC6646x.a(enumC6642t, iO2, iO3, iO);
        }
        return aVar;
    }

    public final int j(p073h2.EnumC6642t enumC6642t) {
        p247y7.AbstractC7350t.f(enumC6642t, "loadType");
        int i6 = h2.B.b.f45893a[enumC6642t.ordinal()];
        if (i6 == 1) {
            throw new java.lang.IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (i6 == 2) {
            return this.f45884g;
        }
        if (i6 == 3) {
            return this.f45885h;
        }
        throw new p087i7.s();
    }

    public final java.util.Map k() {
        return this.f45888k;
    }

    public final int l() {
        return this.f45881d;
    }

    public final java.util.List m() {
        return this.f45880c;
    }

    public final int n() {
        if (this.f45878a.f45911c) {
            return this.f45883f;
        }
        return 0;
    }

    public final int o() {
        if (this.f45878a.f45911c) {
            return this.f45882e;
        }
        return 0;
    }

    public final p073h2.C6645w p() {
        return this.f45889l;
    }

    public final int q() {
        java.util.Iterator it = this.f45880c.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((h2.L.b.c) it.next()).d().size();
        }
        return size;
    }

    public final boolean r(int i6, p073h2.EnumC6642t enumC6642t, h2.L.b.c cVar) {
        java.util.Map map;
        p073h2.EnumC6642t enumC6642t2;
        p247y7.AbstractC7350t.f(enumC6642t, "loadType");
        p247y7.AbstractC7350t.f(cVar, "page");
        int i10 = h2.B.b.f45893a[enumC6642t.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    if (!(!this.f45880c.isEmpty())) {
                        throw new java.lang.IllegalStateException("should've received an init before append".toString());
                    }
                    if (i6 != this.f45885h) {
                        return false;
                    }
                    this.f45879b.add(cVar);
                    s(cVar.e() == Integer.MIN_VALUE ? E7.j.d(n() - cVar.d().size(), 0) : cVar.e());
                    map = this.f45888k;
                    enumC6642t2 = p073h2.EnumC6642t.APPEND;
                }
            } else {
                if (!(!this.f45880c.isEmpty())) {
                    throw new java.lang.IllegalStateException("should've received an init before prepend".toString());
                }
                if (i6 != this.f45884g) {
                    return false;
                }
                this.f45879b.add(0, cVar);
                this.f45881d++;
                t(cVar.f() == Integer.MIN_VALUE ? E7.j.d(o() - cVar.d().size(), 0) : cVar.f());
                map = this.f45888k;
                enumC6642t2 = p073h2.EnumC6642t.PREPEND;
            }
            map.remove(enumC6642t2);
        } else {
            if (!this.f45880c.isEmpty()) {
                throw new java.lang.IllegalStateException("cannot receive multiple init calls".toString());
            }
            if (i6 != 0) {
                throw new java.lang.IllegalStateException("init loadId must be the initial value, 0".toString());
            }
            this.f45879b.add(cVar);
            this.f45881d = 0;
            s(cVar.e());
            t(cVar.f());
        }
        return true;
    }

    public final void s(int i6) {
        if (i6 == Integer.MIN_VALUE) {
            i6 = 0;
        }
        this.f45883f = i6;
    }

    public final void t(int i6) {
        if (i6 == Integer.MIN_VALUE) {
            i6 = 0;
        }
        this.f45882e = i6;
    }

    public final p073h2.AbstractC6646x u(h2.L.b.c cVar, p073h2.EnumC6642t enumC6642t) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        p247y7.AbstractC7350t.f(enumC6642t, "loadType");
        int[] iArr = h2.B.b.f45893a;
        int i6 = iArr[enumC6642t.ordinal()];
        int size = 0;
        if (i6 != 1) {
            if (i6 == 2) {
                size = 0 - this.f45881d;
            } else {
                if (i6 != 3) {
                    throw new p087i7.s();
                }
                size = (this.f45880c.size() - this.f45881d) - 1;
            }
        }
        java.util.List listE = p097j7.AbstractC6879v.e(new p073h2.W(size, cVar.d()));
        int i10 = iArr[enumC6642t.ordinal()];
        if (i10 == 1) {
            return p073h2.AbstractC6646x.b.f46277g.c(listE, o(), n(), this.f45889l.d(), null);
        }
        if (i10 == 2) {
            return p073h2.AbstractC6646x.b.f46277g.b(listE, o(), this.f45889l.d(), null);
        }
        if (i10 == 3) {
            return p073h2.AbstractC6646x.b.f46277g.a(listE, n(), this.f45889l.d(), null);
        }
        throw new p087i7.s();
    }
}
