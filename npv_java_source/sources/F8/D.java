package F8;

/* JADX INFO: loaded from: classes2.dex */
public final class D implements F8.e0, J8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private F8.E f2820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.LinkedHashSet f2821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2822c;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.M l(G8.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
            return F8.D.this.v(gVar).c();
        }
    }

    public static final class b implements java.util.Comparator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ p237x7.l f2824C;

        public b(p237x7.l lVar) {
            this.f2824C = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            F8.E e6 = (F8.E) obj;
            p237x7.l lVar = this.f2824C;
            p247y7.AbstractC7350t.c(e6);
            java.lang.String string = lVar.l(e6).toString();
            F8.E e10 = (F8.E) obj2;
            p237x7.l lVar2 = this.f2824C;
            p247y7.AbstractC7350t.c(e10);
            return p117l7.a.d(string, lVar2.l(e10).toString());
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final F8.D.c f2825D = new F8.D.c();

        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String l(F8.E e6) {
            p247y7.AbstractC7350t.f(e6, "it");
            return e6.toString();
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f2826D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p237x7.l lVar) {
            super(1);
            this.f2826D = lVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(F8.E e6) {
            p237x7.l lVar = this.f2826D;
            p247y7.AbstractC7350t.c(e6);
            return lVar.l(e6).toString();
        }
    }

    public D(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "typesToIntersect");
        collection.isEmpty();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(collection);
        this.f2821b = linkedHashSet;
        this.f2822c = linkedHashSet.hashCode();
    }

    private D(java.util.Collection collection, F8.E e6) {
        this(collection);
        this.f2820a = e6;
    }

    public static /* synthetic */ java.lang.String f(F8.D d6, p237x7.l lVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            lVar = F8.D.c.f2825D;
        }
        return d6.e(lVar);
    }

    public final p248y8.h b() {
        return p248y8.n.f57371d.a("member scope for intersection type", this.f2821b);
    }

    public final F8.M c() {
        return F8.F.n(F8.a0.f2872D.i(), this, p097j7.AbstractC6879v.m(), false, b(), new F8.D.a());
    }

    public final F8.E d() {
        return this.f2820a;
    }

    public final java.lang.String e(p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "getProperTypeRelatedToStringify");
        return p097j7.AbstractC6879v.r0(p097j7.AbstractC6879v.L0(this.f2821b, new F8.D.b(lVar)), " & ", "{", "}", 0, null, new F8.D.d(lVar), 24, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F8.D) {
            return p247y7.AbstractC7350t.b(this.f2821b, ((F8.D) obj).f2821b);
        }
        return false;
    }

    @Override // F8.e0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public F8.D v(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        java.util.Collection collectionU = u();
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collectionU, 10));
        java.util.Iterator it = collectionU.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            arrayList.add(((F8.E) it.next()).g1(gVar));
            z6 = true;
        }
        F8.D dH = null;
        if (z6) {
            F8.E eD = d();
            dH = new F8.D(arrayList).h(eD != null ? eD.g1(gVar) : null);
        }
        return dH == null ? this : dH;
    }

    public final F8.D h(F8.E e6) {
        return new F8.D(this.f2821b, e6);
    }

    public int hashCode() {
        return this.f2822c;
    }

    @Override // F8.e0
    public L7.g t() {
        L7.g gVarT = ((F8.E) this.f2821b.iterator().next()).W0().t();
        p247y7.AbstractC7350t.e(gVarT, "getBuiltIns(...)");
        return gVarT;
    }

    public java.lang.String toString() {
        return f(this, null, 1, null);
    }

    @Override // F8.e0
    public java.util.Collection u() {
        return this.f2821b;
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
