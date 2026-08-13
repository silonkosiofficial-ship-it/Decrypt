package N7;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Q7.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p138n8.f f7844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p138n8.b f7845h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O7.G f7846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f7847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E8.i f7848c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f7842e = {p247y7.P.j(new p247y7.G(p247y7.P.b(N7.e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final N7.e.b f7841d = new N7.e.b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p138n8.c f7843f = L7.j.f6325y;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final N7.e.a f7849D = new N7.e.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L7.b l(O7.G g6) {
            p247y7.AbstractC7350t.f(g6, "module");
            java.util.List listN = g6.s0(N7.e.f7843f).N();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listN) {
                if (obj instanceof L7.b) {
                    arrayList.add(obj);
                }
            }
            return (L7.b) p097j7.AbstractC6879v.i0(arrayList);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p138n8.b a() {
            return N7.e.f7845h;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ E8.n f7851E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(E8.n nVar) {
            super(0);
            this.f7851E = nVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R7.C1502h b() {
            R7.C1502h c1502h = new R7.C1502h((O7.InterfaceC1432m) N7.e.this.f7847b.l(N7.e.this.f7846a), N7.e.f7844g, O7.D.ABSTRACT, O7.EnumC1425f.INTERFACE, p097j7.AbstractC6879v.e(N7.e.this.f7846a.t().i()), O7.a0.f8143a, false, this.f7851E);
            c1502h.T0(new N7.a(this.f7851E, c1502h), p097j7.Z.d(), null);
            return c1502h;
        }
    }

    static {
        p138n8.d dVar = L7.j.a.f6371d;
        p138n8.f fVarI = dVar.i();
        p247y7.AbstractC7350t.e(fVarI, "shortName(...)");
        f7844g = fVarI;
        p138n8.b bVarM = p138n8.b.m(dVar.l());
        p247y7.AbstractC7350t.e(bVarM, "topLevel(...)");
        f7845h = bVarM;
    }

    public e(E8.n nVar, O7.G g6, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(g6, "moduleDescriptor");
        p247y7.AbstractC7350t.f(lVar, "computeContainingDeclaration");
        this.f7846a = g6;
        this.f7847b = lVar;
        this.f7848c = nVar.d(new N7.e.c(nVar));
    }

    public /* synthetic */ e(E8.n nVar, O7.G g6, p237x7.l lVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(nVar, g6, (i6 & 4) != 0 ? N7.e.a.f7849D : lVar);
    }

    private final R7.C1502h i() {
        return (R7.C1502h) E8.m.a(this.f7848c, this, f7842e[0]);
    }

    @Override // Q7.b
    public java.util.Collection a(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "packageFqName");
        return p247y7.AbstractC7350t.b(cVar, f7843f) ? p097j7.Z.c(i()) : p097j7.Z.d();
    }

    @Override // Q7.b
    public boolean b(p138n8.c cVar, p138n8.f fVar) {
        p247y7.AbstractC7350t.f(cVar, "packageFqName");
        p247y7.AbstractC7350t.f(fVar, "name");
        return p247y7.AbstractC7350t.b(fVar, f7844g) && p247y7.AbstractC7350t.b(cVar, f7843f);
    }

    @Override // Q7.b
    public O7.InterfaceC1424e c(p138n8.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "classId");
        if (p247y7.AbstractC7350t.b(bVar, f7845h)) {
            return i();
        }
        return null;
    }
}
