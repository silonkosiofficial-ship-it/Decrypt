package G8;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements p188s8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F8.i0 f3144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p237x7.a f3145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G8.j f3146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O7.f0 f3147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f3148e;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.List f3149D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.util.List list) {
            super(0);
            this.f3149D = list;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            return this.f3149D;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            p237x7.a aVar = G8.j.this.f3145b;
            if (aVar != null) {
                return (java.util.List) aVar.b();
            }
            return null;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.List f3151D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(java.util.List list) {
            super(0);
            this.f3151D = list;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            return this.f3151D;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ G8.g f3153E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(G8.g gVar) {
            super(0);
            this.f3153E = gVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            java.util.List listU = G8.j.this.u();
            G8.g gVar = this.f3153E;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listU, 10));
            java.util.Iterator it = listU.iterator();
            while (it.hasNext()) {
                arrayList.add(((F8.t0) it.next()).g1(gVar));
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(F8.i0 i0Var, java.util.List list, G8.j jVar) {
        this(i0Var, new G8.j.a(list), jVar, null, 8, null);
        p247y7.AbstractC7350t.f(i0Var, "projection");
        p247y7.AbstractC7350t.f(list, "supertypes");
    }

    public /* synthetic */ j(F8.i0 i0Var, java.util.List list, G8.j jVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(i0Var, list, (i6 & 4) != 0 ? null : jVar);
    }

    public j(F8.i0 i0Var, p237x7.a aVar, G8.j jVar, O7.f0 f0Var) {
        p247y7.AbstractC7350t.f(i0Var, "projection");
        this.f3144a = i0Var;
        this.f3145b = aVar;
        this.f3146c = jVar;
        this.f3147d = f0Var;
        this.f3148e = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new G8.j.b());
    }

    public /* synthetic */ j(F8.i0 i0Var, p237x7.a aVar, G8.j jVar, O7.f0 f0Var, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(i0Var, (i6 & 2) != 0 ? null : aVar, (i6 & 4) != 0 ? null : jVar, (i6 & 8) != 0 ? null : f0Var);
    }

    private final java.util.List d() {
        return (java.util.List) this.f3148e.getValue();
    }

    @Override // p188s8.b
    public F8.i0 a() {
        return this.f3144a;
    }

    @Override // F8.e0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public java.util.List u() {
        java.util.List listD = d();
        return listD == null ? p097j7.AbstractC6879v.m() : listD;
    }

    public final void e(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "supertypes");
        this.f3145b = new G8.j.c(list);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p247y7.AbstractC7350t.b(G8.j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        G8.j jVar = (G8.j) obj;
        G8.j jVar2 = this.f3146c;
        if (jVar2 == null) {
            jVar2 = this;
        }
        G8.j jVar3 = jVar.f3146c;
        if (jVar3 != null) {
            jVar = jVar3;
        }
        return jVar2 == jVar;
    }

    @Override // F8.e0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public G8.j v(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        F8.i0 i0VarV = a().v(gVar);
        p247y7.AbstractC7350t.e(i0VarV, "refine(...)");
        G8.j.d dVar = this.f3145b != null ? new G8.j.d(gVar) : null;
        G8.j jVar = this.f3146c;
        if (jVar == null) {
            jVar = this;
        }
        return new G8.j(i0VarV, dVar, jVar, this.f3147d);
    }

    public int hashCode() {
        G8.j jVar = this.f3146c;
        return jVar != null ? jVar.hashCode() : super.hashCode();
    }

    @Override // F8.e0
    public L7.g t() {
        F8.E type = a().getType();
        p247y7.AbstractC7350t.e(type, "getType(...)");
        return K8.a.i(type);
    }

    public java.lang.String toString() {
        return "CapturedType(" + a() + ')';
    }

    @Override // F8.e0
    public O7.InterfaceC1427h w() {
        return null;
    }

    @Override // F8.e0
    public java.util.List x() {
        return p097j7.AbstractC6879v.m();
    }

    @Override // F8.e0
    public boolean y() {
        return false;
    }
}
