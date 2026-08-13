package p018b8;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends p018b8.m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p048e8.u f24267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p018b8.h f24268o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final E8.j f24269p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final E8.h f24270q;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p138n8.f f24271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p048e8.g f24272b;

        public a(p138n8.f fVar, p048e8.g gVar) {
            p247y7.AbstractC7350t.f(fVar, "name");
            this.f24271a = fVar;
            this.f24272b = gVar;
        }

        public final p048e8.g a() {
            return this.f24272b;
        }

        public final p138n8.f b() {
            return this.f24271a;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof b8.i.a) && p247y7.AbstractC7350t.b(this.f24271a, ((b8.i.a) obj).f24271a);
        }

        public int hashCode() {
            return this.f24271a.hashCode();
        }
    }

    private static abstract class b {

        public static final class a extends b8.i.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final O7.InterfaceC1424e f24273a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(O7.InterfaceC1424e interfaceC1424e) {
                super(null);
                p247y7.AbstractC7350t.f(interfaceC1424e, "descriptor");
                this.f24273a = interfaceC1424e;
            }

            public final O7.InterfaceC1424e a() {
                return this.f24273a;
            }
        }

        /* JADX INFO: renamed from: b8.i$b$b, reason: collision with other inner class name */
        public static final class C0463b extends b8.i.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b8.i.b.C0463b f24274a = new b8.i.b.C0463b();

            private C0463b() {
                super(null);
            }
        }

        public static final class c extends b8.i.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b8.i.b.c f24275a = new b8.i.b.c();

            private c() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p008a8.g f24277E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p008a8.g gVar) {
            super(1);
            this.f24277E = gVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.InterfaceC1424e l(b8.i.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "request");
            p138n8.b bVar = new p138n8.b(p018b8.i.this.C().e(), aVar.b());
            g8.r.a aVarB = aVar.a() != null ? this.f24277E.a().j().b(aVar.a(), p018b8.i.this.R()) : this.f24277E.a().j().a(bVar, p018b8.i.this.R());
            p068g8.t tVarA = aVarB != null ? aVarB.a() : null;
            p138n8.b bVarC = tVarA != null ? tVarA.c() : null;
            if (bVarC != null && (bVarC.l() || bVarC.k())) {
                return null;
            }
            b8.i.b bVarT = p018b8.i.this.T(tVarA);
            if (bVarT instanceof b8.i.b.a) {
                return ((b8.i.b.a) bVarT).a();
            }
            if (bVarT instanceof b8.i.b.c) {
                return null;
            }
            if (!(bVarT instanceof b8.i.b.C0463b)) {
                throw new p087i7.s();
            }
            p048e8.g gVarA = aVar.a();
            if (gVarA == null) {
                gVarA = this.f24277E.a().d().b(new X7.p.a(bVar, null, null, 4, null));
            }
            p048e8.g gVar = gVarA;
            if ((gVar != null ? gVar.O() : null) != p048e8.D.BINARY) {
                p138n8.c cVarE = gVar != null ? gVar.e() : null;
                if (cVarE == null || cVarE.d() || !p247y7.AbstractC7350t.b(cVarE.e(), p018b8.i.this.C().e())) {
                    return null;
                }
                p018b8.f fVar = new p018b8.f(this.f24277E, p018b8.i.this.C(), gVar, null, 8, null);
                this.f24277E.a().e().a(fVar);
                return fVar;
            }
            throw new java.lang.IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + gVar + "\nClassId: " + bVar + "\nfindKotlinClass(JavaClass) = " + p068g8.s.a(this.f24277E.a().j(), gVar, p018b8.i.this.R()) + "\nfindKotlinClass(ClassId) = " + p068g8.s.b(this.f24277E.a().j(), bVar, p018b8.i.this.R()) + '\n');
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p008a8.g f24278D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p018b8.i f24279E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p008a8.g gVar, p018b8.i iVar) {
            super(0);
            this.f24278D = gVar;
            this.f24279E = iVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Set b() {
            return this.f24278D.a().d().c(this.f24279E.C().e());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p008a8.g gVar, p048e8.u uVar, p018b8.h hVar) {
        super(gVar);
        p247y7.AbstractC7350t.f(gVar, "c");
        p247y7.AbstractC7350t.f(uVar, "jPackage");
        p247y7.AbstractC7350t.f(hVar, "ownerDescriptor");
        this.f24267n = uVar;
        this.f24268o = hVar;
        this.f24269p = gVar.e().f(new b8.i.d(gVar, this));
        this.f24270q = gVar.e().h(new b8.i.c(gVar));
    }

    private final O7.InterfaceC1424e O(p138n8.f fVar, p048e8.g gVar) {
        if (!p138n8.h.f51964a.a(fVar)) {
            return null;
        }
        java.util.Set set = (java.util.Set) this.f24269p.b();
        if (gVar != null || set == null || set.contains(fVar.g())) {
            return (O7.InterfaceC1424e) this.f24270q.l(new b8.i.a(fVar, gVar));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p128m8.e R() {
        return P8.c.a(w().a().b().d().g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b8.i.b T(p068g8.t tVar) {
        if (tVar != null) {
            if (tVar.b().c() != p078h8.a.EnumC0561a.CLASS) {
                return b8.i.b.c.f24275a;
            }
            O7.InterfaceC1424e interfaceC1424eL = w().a().b().l(tVar);
            if (interfaceC1424eL != null) {
                return new b8.i.b.a(interfaceC1424eL);
            }
        }
        return b8.i.b.C0463b.f24274a;
    }

    public final O7.InterfaceC1424e P(p048e8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "javaClass");
        return O(gVar.getName(), gVar);
    }

    @Override // p248y8.i, p248y8.k
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public O7.InterfaceC1424e g(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return O(fVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p018b8.j
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public p018b8.h C() {
        return this.f24268o;
    }

    @Override // p018b8.j, p248y8.i, p248y8.h
    public java.util.Collection c(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return p097j7.AbstractC6879v.m();
    }

    @Override // p018b8.j, p248y8.i, p248y8.k
    public java.util.Collection e(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        y8.d.a aVar = p248y8.d.f57315c;
        if (!dVar.a(aVar.e() | aVar.c())) {
            return p097j7.AbstractC6879v.m();
        }
        java.lang.Iterable iterable = (java.lang.Iterable) v().b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : iterable) {
            O7.InterfaceC1432m interfaceC1432m = (O7.InterfaceC1432m) obj;
            if (interfaceC1432m instanceof O7.InterfaceC1424e) {
                p138n8.f name = ((O7.InterfaceC1424e) interfaceC1432m).getName();
                p247y7.AbstractC7350t.e(name, "getName(...)");
                if (((java.lang.Boolean) lVar.l(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // p018b8.j
    protected java.util.Set l(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        if (!dVar.a(p248y8.d.f57315c.e())) {
            return p097j7.Z.d();
        }
        java.util.Set set = (java.util.Set) this.f24269p.b();
        if (set != null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(p138n8.f.o((java.lang.String) it.next()));
            }
            return hashSet;
        }
        p048e8.u uVar = this.f24267n;
        if (lVar == null) {
            lVar = P8.e.a();
        }
        java.util.Collection<p048e8.g> collectionX = uVar.x(lVar);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (p048e8.g gVar : collectionX) {
            p138n8.f name = gVar.O() == p048e8.D.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p018b8.j
    protected java.util.Set n(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        return p097j7.Z.d();
    }

    @Override // p018b8.j
    protected p018b8.b p() {
        return b8.b.a.f24189a;
    }

    @Override // p018b8.j
    protected void r(java.util.Collection collection, p138n8.f fVar) {
        p247y7.AbstractC7350t.f(collection, "result");
        p247y7.AbstractC7350t.f(fVar, "name");
    }

    @Override // p018b8.j
    protected java.util.Set t(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        return p097j7.Z.d();
    }
}
