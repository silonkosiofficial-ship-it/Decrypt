package p248y8;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements p248y8.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p248y8.h f57364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f57365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F8.n0 f57366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.util.Map f57367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f57368f;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection b() {
            p248y8.m mVar = p248y8.m.this;
            return mVar.l(y8.k.a.a(mVar.f57364b, null, null, 3, null));
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ F8.n0 f57370D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(F8.n0 n0Var) {
            super(0);
            this.f57370D = n0Var;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.n0 b() {
            return this.f57370D.j().c();
        }
    }

    public m(p248y8.h hVar, F8.n0 n0Var) {
        p247y7.AbstractC7350t.f(hVar, "workerScope");
        p247y7.AbstractC7350t.f(n0Var, "givenSubstitutor");
        this.f57364b = hVar;
        this.f57365c = p087i7.AbstractC6669o.b(new y8.m.b(n0Var));
        F8.l0 l0VarJ = n0Var.j();
        p247y7.AbstractC7350t.e(l0VarJ, "getSubstitution(...)");
        this.f57366d = p188s8.d.f(l0VarJ, false, 1, null).c();
        this.f57368f = p087i7.AbstractC6669o.b(new y8.m.a());
    }

    private final java.util.Collection j() {
        return (java.util.Collection) this.f57368f.getValue();
    }

    private final O7.InterfaceC1432m k(O7.InterfaceC1432m interfaceC1432m) {
        if (this.f57366d.k()) {
            return interfaceC1432m;
        }
        if (this.f57367e == null) {
            this.f57367e = new java.util.HashMap();
        }
        java.util.Map map = this.f57367e;
        p247y7.AbstractC7350t.c(map);
        java.lang.Object objC = map.get(interfaceC1432m);
        if (objC == null) {
            if (!(interfaceC1432m instanceof O7.c0)) {
                throw new java.lang.IllegalStateException(("Unknown descriptor in scope: " + interfaceC1432m).toString());
            }
            objC = ((O7.c0) interfaceC1432m).c(this.f57366d);
            if (objC == null) {
                throw new java.lang.AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC1432m + " substitution fails");
            }
            map.put(interfaceC1432m, objC);
        }
        O7.InterfaceC1432m interfaceC1432m2 = (O7.InterfaceC1432m) objC;
        p247y7.AbstractC7350t.d(interfaceC1432m2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return interfaceC1432m2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Collection l(java.util.Collection collection) {
        if (this.f57366d.k() || collection.isEmpty()) {
            return collection;
        }
        java.util.LinkedHashSet linkedHashSetG = P8.a.g(collection.size());
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetG.add(k((O7.InterfaceC1432m) it.next()));
        }
        return linkedHashSetG;
    }

    @Override // p248y8.h
    public java.util.Set a() {
        return this.f57364b.a();
    }

    @Override // p248y8.h
    public java.util.Collection b(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return l(this.f57364b.b(fVar, bVar));
    }

    @Override // p248y8.h
    public java.util.Collection c(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return l(this.f57364b.c(fVar, bVar));
    }

    @Override // p248y8.h
    public java.util.Set d() {
        return this.f57364b.d();
    }

    @Override // p248y8.k
    public java.util.Collection e(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        return j();
    }

    @Override // p248y8.h
    public java.util.Set f() {
        return this.f57364b.f();
    }

    @Override // p248y8.k
    public O7.InterfaceC1427h g(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        O7.InterfaceC1427h interfaceC1427hG = this.f57364b.g(fVar, bVar);
        if (interfaceC1427hG != null) {
            return (O7.InterfaceC1427h) k(interfaceC1427hG);
        }
        return null;
    }
}
