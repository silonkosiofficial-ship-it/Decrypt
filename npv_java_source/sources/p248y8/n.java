package p248y8;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends p248y8.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y8.n.a f57371d = new y8.n.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f57372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p248y8.h f57373c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p248y8.h a(java.lang.String str, java.util.Collection collection) {
            p247y7.AbstractC7350t.f(str, "message");
            p247y7.AbstractC7350t.f(collection, "types");
            java.util.Collection collection2 = collection;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collection2, 10));
            java.util.Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((F8.E) it.next()).u());
            }
            P8.f fVarB = O8.a.b(arrayList);
            p248y8.h hVarB = p248y8.b.f57309d.b(str, fVarB);
            return fVarB.size() <= 1 ? hVarB : new p248y8.n(str, hVarB, null);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final y8.n.b f57374D = new y8.n.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.InterfaceC1420a l(O7.InterfaceC1420a interfaceC1420a) {
            p247y7.AbstractC7350t.f(interfaceC1420a, "$this$selectMostSpecificInEachOverridableGroup");
            return interfaceC1420a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final y8.n.c f57375D = new y8.n.c();

        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.InterfaceC1420a l(O7.Z z6) {
            p247y7.AbstractC7350t.f(z6, "$this$selectMostSpecificInEachOverridableGroup");
            return z6;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final y8.n.d f57376D = new y8.n.d();

        d() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.InterfaceC1420a l(O7.U u6) {
            p247y7.AbstractC7350t.f(u6, "$this$selectMostSpecificInEachOverridableGroup");
            return u6;
        }
    }

    private n(java.lang.String str, p248y8.h hVar) {
        this.f57372b = str;
        this.f57373c = hVar;
    }

    public /* synthetic */ n(java.lang.String str, p248y8.h hVar, p247y7.AbstractC7342k abstractC7342k) {
        this(str, hVar);
    }

    public static final p248y8.h j(java.lang.String str, java.util.Collection collection) {
        return f57371d.a(str, collection);
    }

    @Override // p248y8.a, p248y8.h
    public java.util.Collection b(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return p178r8.n.a(super.b(fVar, bVar), y8.n.c.f57375D);
    }

    @Override // p248y8.a, p248y8.h
    public java.util.Collection c(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return p178r8.n.a(super.c(fVar, bVar), y8.n.d.f57376D);
    }

    @Override // p248y8.a, p248y8.k
    public java.util.Collection e(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        java.util.Collection collectionE = super.e(dVar, lVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : collectionE) {
            if (((O7.InterfaceC1432m) obj) instanceof O7.InterfaceC1420a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        p087i7.u uVar = new p087i7.u(arrayList, arrayList2);
        java.util.List list = (java.util.List) uVar.a();
        java.util.List list2 = (java.util.List) uVar.b();
        p247y7.AbstractC7350t.d(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return p097j7.AbstractC6879v.C0(p178r8.n.a(list, y8.n.b.f57374D), list2);
    }

    @Override // p248y8.a
    protected p248y8.h i() {
        return this.f57373c;
    }
}
