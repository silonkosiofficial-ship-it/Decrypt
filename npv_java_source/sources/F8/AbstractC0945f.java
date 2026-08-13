package F8;

/* JADX INFO: renamed from: F8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0945f extends F8.AbstractC0951l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E8.i f2907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2908c;

    /* JADX INFO: renamed from: F8.f$a */
    private final class a implements F8.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final G8.g f2909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p087i7.InterfaceC6668n f2910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ F8.AbstractC0945f f2911c;

        /* JADX INFO: renamed from: F8.f$a$a, reason: collision with other inner class name */
        static final class C0068a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ F8.AbstractC0945f f2913E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0068a(F8.AbstractC0945f abstractC0945f) {
                super(0);
                this.f2913E = abstractC0945f;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.util.List b() {
                return G8.h.b(F8.AbstractC0945f.a.this.f2909a, this.f2913E.u());
            }
        }

        public a(F8.AbstractC0945f abstractC0945f, G8.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
            this.f2911c = abstractC0945f;
            this.f2909a = gVar;
            this.f2910b = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new F8.AbstractC0945f.a.C0068a(abstractC0945f));
        }

        private final java.util.List c() {
            return (java.util.List) this.f2910b.getValue();
        }

        @Override // F8.e0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public java.util.List u() {
            return c();
        }

        public boolean equals(java.lang.Object obj) {
            return this.f2911c.equals(obj);
        }

        public int hashCode() {
            return this.f2911c.hashCode();
        }

        @Override // F8.e0
        public L7.g t() {
            L7.g gVarT = this.f2911c.t();
            p247y7.AbstractC7350t.e(gVarT, "getBuiltIns(...)");
            return gVarT;
        }

        public java.lang.String toString() {
            return this.f2911c.toString();
        }

        @Override // F8.e0
        public F8.e0 v(G8.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
            return this.f2911c.v(gVar);
        }

        @Override // F8.e0
        public O7.InterfaceC1427h w() {
            return this.f2911c.w();
        }

        @Override // F8.e0
        public java.util.List x() {
            java.util.List listX = this.f2911c.x();
            p247y7.AbstractC7350t.e(listX, "getParameters(...)");
            return listX;
        }

        @Override // F8.e0
        public boolean y() {
            return this.f2911c.y();
        }
    }

    /* JADX INFO: renamed from: F8.f$b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Collection f2914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.util.List f2915b;

        public b(java.util.Collection collection) {
            p247y7.AbstractC7350t.f(collection, "allSupertypes");
            this.f2914a = collection;
            this.f2915b = p097j7.AbstractC6879v.e(H8.k.f4528a.l());
        }

        public final java.util.Collection a() {
            return this.f2914a;
        }

        public final java.util.List b() {
            return this.f2915b;
        }

        public final void c(java.util.List list) {
            p247y7.AbstractC7350t.f(list, "<set-?>");
            this.f2915b = list;
        }
    }

    /* JADX INFO: renamed from: F8.f$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.AbstractC0945f.b b() {
            return new F8.AbstractC0945f.b(F8.AbstractC0945f.this.g());
        }
    }

    /* JADX INFO: renamed from: F8.f$d */
    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final F8.AbstractC0945f.d f2917D = new F8.AbstractC0945f.d();

        d() {
            super(1);
        }

        public final F8.AbstractC0945f.b a(boolean z6) {
            return new F8.AbstractC0945f.b(p097j7.AbstractC6879v.e(H8.k.f4528a.l()));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: renamed from: F8.f$e */
    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: F8.f$e$a */
        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ F8.AbstractC0945f f2919D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(F8.AbstractC0945f abstractC0945f) {
                super(1);
                this.f2919D = abstractC0945f;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Iterable l(F8.e0 e0Var) {
                p247y7.AbstractC7350t.f(e0Var, "it");
                return this.f2919D.f(e0Var, true);
            }
        }

        /* JADX INFO: renamed from: F8.f$e$b */
        static final class b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ F8.AbstractC0945f f2920D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(F8.AbstractC0945f abstractC0945f) {
                super(1);
                this.f2920D = abstractC0945f;
            }

            public final void a(F8.E e6) {
                p247y7.AbstractC7350t.f(e6, "it");
                this.f2920D.n(e6);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((F8.E) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: F8.f$e$c */
        static final class c extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ F8.AbstractC0945f f2921D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(F8.AbstractC0945f abstractC0945f) {
                super(1);
                this.f2921D = abstractC0945f;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Iterable l(F8.e0 e0Var) {
                p247y7.AbstractC7350t.f(e0Var, "it");
                return this.f2921D.f(e0Var, false);
            }
        }

        /* JADX INFO: renamed from: F8.f$e$d */
        static final class d extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ F8.AbstractC0945f f2922D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(F8.AbstractC0945f abstractC0945f) {
                super(1);
                this.f2922D = abstractC0945f;
            }

            public final void a(F8.E e6) {
                p247y7.AbstractC7350t.f(e6, "it");
                this.f2922D.o(e6);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((F8.E) obj);
                return p087i7.M.f46721a;
            }
        }

        e() {
            super(1);
        }

        public final void a(F8.AbstractC0945f.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "supertypes");
            java.util.List listA = F8.AbstractC0945f.this.k().a(F8.AbstractC0945f.this, bVar.a(), new F8.AbstractC0945f.e.c(F8.AbstractC0945f.this), new F8.AbstractC0945f.e.d(F8.AbstractC0945f.this));
            if (listA.isEmpty()) {
                F8.E eH = F8.AbstractC0945f.this.h();
                java.util.List listE = eH != null ? p097j7.AbstractC6879v.e(eH) : null;
                if (listE == null) {
                    listE = p097j7.AbstractC6879v.m();
                }
                listA = listE;
            }
            if (F8.AbstractC0945f.this.j()) {
                O7.d0 d0VarK = F8.AbstractC0945f.this.k();
                F8.AbstractC0945f abstractC0945f = F8.AbstractC0945f.this;
                d0VarK.a(abstractC0945f, listA, new F8.AbstractC0945f.e.a(abstractC0945f), new F8.AbstractC0945f.e.b(F8.AbstractC0945f.this));
            }
            F8.AbstractC0945f abstractC0945f2 = F8.AbstractC0945f.this;
            java.util.List listT0 = listA instanceof java.util.List ? (java.util.List) listA : null;
            if (listT0 == null) {
                listT0 = p097j7.AbstractC6879v.T0(listA);
            }
            bVar.c(abstractC0945f2.m(listT0));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((F8.AbstractC0945f.b) obj);
            return p087i7.M.f46721a;
        }
    }

    public AbstractC0945f(E8.n nVar) {
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        this.f2907b = nVar.g(new F8.AbstractC0945f.c(), F8.AbstractC0945f.d.f2917D, new F8.AbstractC0945f.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Collection f(F8.e0 e0Var, boolean z6) {
        java.util.List listC0;
        F8.AbstractC0945f abstractC0945f = e0Var instanceof F8.AbstractC0945f ? (F8.AbstractC0945f) e0Var : null;
        if (abstractC0945f != null && (listC0 = p097j7.AbstractC6879v.C0(((F8.AbstractC0945f.b) abstractC0945f.f2907b.b()).a(), abstractC0945f.i(z6))) != null) {
            return listC0;
        }
        java.util.Collection collectionU = e0Var.u();
        p247y7.AbstractC7350t.e(collectionU, "getSupertypes(...)");
        return collectionU;
    }

    protected abstract java.util.Collection g();

    protected abstract F8.E h();

    protected java.util.Collection i(boolean z6) {
        return p097j7.AbstractC6879v.m();
    }

    protected boolean j() {
        return this.f2908c;
    }

    protected abstract O7.d0 k();

    @Override // F8.e0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public java.util.List u() {
        return ((F8.AbstractC0945f.b) this.f2907b.b()).b();
    }

    protected java.util.List m(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "supertypes");
        return list;
    }

    protected void n(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "type");
    }

    protected void o(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "type");
    }

    @Override // F8.e0
    public F8.e0 v(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        return new F8.AbstractC0945f.a(this, gVar);
    }
}
