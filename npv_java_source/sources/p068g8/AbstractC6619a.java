package p068g8;

/* JADX INFO: renamed from: g8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6619a extends p068g8.AbstractC6620b implements B8.InterfaceC0822c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E8.g f45615c;

    /* JADX INFO: renamed from: g8.a$a, reason: collision with other inner class name */
    static final class C0515a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final p068g8.AbstractC6619a.C0515a f45616D = new p068g8.AbstractC6619a.C0515a();

        C0515a() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p068g8.C6622d c6622d, p068g8.w wVar) {
            p247y7.AbstractC7350t.f(c6622d, "$this$loadConstantFromProperty");
            p247y7.AbstractC7350t.f(wVar, "it");
            return c6622d.b().get(wVar);
        }
    }

    /* JADX INFO: renamed from: g8.a$b */
    public static final class b implements g8.t.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.HashMap f45618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p068g8.t f45619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ java.util.HashMap f45620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ java.util.HashMap f45621e;

        /* JADX INFO: renamed from: g8.a$b$a, reason: collision with other inner class name */
        public final class C0516a extends p068g8.AbstractC6619a.b.C0517b implements g8.t.e {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p068g8.AbstractC6619a.b f45622d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0516a(p068g8.AbstractC6619a.b bVar, p068g8.w wVar) {
                super(bVar, wVar);
                p247y7.AbstractC7350t.f(wVar, "signature");
                this.f45622d = bVar;
            }

            @Override // g8.t.e
            public g8.t.a b(int i6, p138n8.b bVar, O7.a0 a0Var) {
                p247y7.AbstractC7350t.f(bVar, "classId");
                p247y7.AbstractC7350t.f(a0Var, "source");
                p068g8.w wVarE = p068g8.w.f45708b.e(d(), i6);
                java.util.List arrayList = (java.util.List) this.f45622d.f45618b.get(wVarE);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    this.f45622d.f45618b.put(wVarE, arrayList);
                }
                return p068g8.AbstractC6619a.this.y(bVar, a0Var, arrayList);
            }
        }

        /* JADX INFO: renamed from: g8.a$b$b, reason: collision with other inner class name */
        public class C0517b implements g8.t.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final p068g8.w f45623a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final java.util.ArrayList f45624b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p068g8.AbstractC6619a.b f45625c;

            public C0517b(p068g8.AbstractC6619a.b bVar, p068g8.w wVar) {
                p247y7.AbstractC7350t.f(wVar, "signature");
                this.f45625c = bVar;
                this.f45623a = wVar;
                this.f45624b = new java.util.ArrayList();
            }

            @Override // g8.t.c
            public void a() {
                if (!this.f45624b.isEmpty()) {
                    this.f45625c.f45618b.put(this.f45623a, this.f45624b);
                }
            }

            @Override // g8.t.c
            public g8.t.a c(p138n8.b bVar, O7.a0 a0Var) {
                p247y7.AbstractC7350t.f(bVar, "classId");
                p247y7.AbstractC7350t.f(a0Var, "source");
                return p068g8.AbstractC6619a.this.y(bVar, a0Var, this.f45624b);
            }

            protected final p068g8.w d() {
                return this.f45623a;
            }
        }

        b(java.util.HashMap map, p068g8.t tVar, java.util.HashMap map2, java.util.HashMap map3) {
            this.f45618b = map;
            this.f45619c = tVar;
            this.f45620d = map2;
            this.f45621e = map3;
        }

        @Override // g8.t.d
        public g8.t.c a(p138n8.f fVar, java.lang.String str, java.lang.Object obj) {
            java.lang.Object objF;
            p247y7.AbstractC7350t.f(fVar, "name");
            p247y7.AbstractC7350t.f(str, "desc");
            g8.w.a aVar = p068g8.w.f45708b;
            java.lang.String strG = fVar.g();
            p247y7.AbstractC7350t.e(strG, "asString(...)");
            p068g8.w wVarA = aVar.a(strG, str);
            if (obj != null && (objF = p068g8.AbstractC6619a.this.F(str, obj)) != null) {
                this.f45621e.put(wVarA, objF);
            }
            return new p068g8.AbstractC6619a.b.C0517b(this, wVarA);
        }

        @Override // g8.t.d
        public g8.t.e b(p138n8.f fVar, java.lang.String str) {
            p247y7.AbstractC7350t.f(fVar, "name");
            p247y7.AbstractC7350t.f(str, "desc");
            g8.w.a aVar = p068g8.w.f45708b;
            java.lang.String strG = fVar.g();
            p247y7.AbstractC7350t.e(strG, "asString(...)");
            return new p068g8.AbstractC6619a.b.C0516a(this, aVar.d(strG, str));
        }
    }

    /* JADX INFO: renamed from: g8.a$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final p068g8.AbstractC6619a.c f45626D = new p068g8.AbstractC6619a.c();

        c() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p068g8.C6622d c6622d, p068g8.w wVar) {
            p247y7.AbstractC7350t.f(c6622d, "$this$loadConstantFromProperty");
            p247y7.AbstractC7350t.f(wVar, "it");
            return c6622d.c().get(wVar);
        }
    }

    /* JADX INFO: renamed from: g8.a$d */
    static final class d extends p247y7.AbstractC7352v implements p237x7.l {
        d() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p068g8.C6622d l(p068g8.t tVar) {
            p247y7.AbstractC7350t.f(tVar, "kotlinClass");
            return p068g8.AbstractC6619a.this.E(tVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6619a(E8.n nVar, p068g8.r rVar) {
        super(rVar);
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(rVar, "kotlinClassFinder");
        this.f45615c = nVar.b(new p068g8.AbstractC6619a.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p068g8.C6622d E(p068g8.t tVar) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.HashMap map3 = new java.util.HashMap();
        tVar.a(new p068g8.AbstractC6619a.b(map, tVar, map3, map2), q(tVar));
        return new p068g8.C6622d(map, map2, map3);
    }

    private final java.lang.Object G(B8.A a6, p088i8.n nVar, B8.EnumC0821b enumC0821b, F8.E e6, p237x7.p pVar) {
        java.lang.Object objU;
        p068g8.t tVarO = o(a6, p068g8.AbstractC6620b.f45628b.a(a6, true, true, p108k8.b.f49769B.d(nVar.a0()), p128m8.i.f(nVar), u(), t()));
        if (tVarO == null) {
            return null;
        }
        p068g8.w wVarR = r(nVar, a6.b(), a6.d(), enumC0821b, tVarO.b().d().d(p068g8.j.f45669b.a()));
        if (wVarR == null || (objU = pVar.u(this.f45615c.l(tVarO), wVarR)) == null) {
            return null;
        }
        return L7.n.d(e6) ? H(objU) : objU;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p068g8.AbstractC6620b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public p068g8.C6622d p(p068g8.t tVar) {
        p247y7.AbstractC7350t.f(tVar, "binaryClass");
        return (p068g8.C6622d) this.f45615c.l(tVar);
    }

    protected final boolean D(p138n8.b bVar, java.util.Map map) {
        p247y7.AbstractC7350t.f(bVar, "annotationClassId");
        p247y7.AbstractC7350t.f(map, "arguments");
        if (!p247y7.AbstractC7350t.b(bVar, K7.a.f6152a.a())) {
            return false;
        }
        java.lang.Object obj = map.get(p138n8.f.o("value"));
        p198t8.p pVar = obj instanceof p198t8.p ? (p198t8.p) obj : null;
        if (pVar == null) {
            return false;
        }
        java.lang.Object objB = pVar.b();
        t8.p.b.C0714b c0714b = objB instanceof t8.p.b.C0714b ? (t8.p.b.C0714b) objB : null;
        if (c0714b == null) {
            return false;
        }
        return v(c0714b.b());
    }

    protected abstract java.lang.Object F(java.lang.String str, java.lang.Object obj);

    protected abstract java.lang.Object H(java.lang.Object obj);

    @Override // B8.InterfaceC0822c
    public java.lang.Object e(B8.A a6, p088i8.n nVar, F8.E e6) {
        p247y7.AbstractC7350t.f(a6, "container");
        p247y7.AbstractC7350t.f(nVar, "proto");
        p247y7.AbstractC7350t.f(e6, "expectedType");
        return G(a6, nVar, B8.EnumC0821b.PROPERTY, e6, p068g8.AbstractC6619a.c.f45626D);
    }

    @Override // B8.InterfaceC0822c
    public java.lang.Object k(B8.A a6, p088i8.n nVar, F8.E e6) {
        p247y7.AbstractC7350t.f(a6, "container");
        p247y7.AbstractC7350t.f(nVar, "proto");
        p247y7.AbstractC7350t.f(e6, "expectedType");
        return G(a6, nVar, B8.EnumC0821b.PROPERTY_GETTER, e6, p068g8.AbstractC6619a.C0515a.f45616D);
    }
}
