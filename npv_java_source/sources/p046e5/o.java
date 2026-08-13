package p046e5;

/* JADX INFO: loaded from: classes3.dex */
public class o implements p046e5.InterfaceC6532e, p246y5.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final F5.b f44717i = new F5.b() { // from class: e5.k
        @Override // F5.b
        public final java.lang.Object get() {
            return java.util.Collections.emptySet();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f44718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f44719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f44720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f44721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.util.Set f44722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p046e5.v f44723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f44724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p046e5.j f44725h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.concurrent.Executor f44726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.List f44727b = new java.util.ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.util.List f44728c = new java.util.ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p046e5.j f44729d = p046e5.j.f44710a;

        b(java.util.concurrent.Executor executor) {
            this.f44726a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ com.google.firebase.components.ComponentRegistrar f(com.google.firebase.components.ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public e5.o.b b(p046e5.C6530c c6530c) {
            this.f44728c.add(c6530c);
            return this;
        }

        public e5.o.b c(final com.google.firebase.components.ComponentRegistrar componentRegistrar) {
            this.f44727b.add(new F5.b() { // from class: e5.p
                @Override // F5.b
                public final java.lang.Object get() {
                    return e5.o.b.f(componentRegistrar);
                }
            });
            return this;
        }

        public e5.o.b d(java.util.Collection collection) {
            this.f44727b.addAll(collection);
            return this;
        }

        public p046e5.o e() {
            return new p046e5.o(this.f44726a, this.f44727b, this.f44728c, this.f44729d);
        }

        public e5.o.b g(p046e5.j jVar) {
            this.f44729d = jVar;
            return this;
        }
    }

    private o(java.util.concurrent.Executor executor, java.lang.Iterable iterable, java.util.Collection collection, p046e5.j jVar) {
        this.f44718a = new java.util.HashMap();
        this.f44719b = new java.util.HashMap();
        this.f44720c = new java.util.HashMap();
        this.f44722e = new java.util.HashSet();
        this.f44724g = new java.util.concurrent.atomic.AtomicReference();
        p046e5.v vVar = new p046e5.v(executor);
        this.f44723f = vVar;
        this.f44725h = jVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(p046e5.C6530c.s(vVar, p046e5.v.class, D5.d.class, D5.c.class));
        arrayList.add(p046e5.C6530c.s(this, p246y5.a.class, new java.lang.Class[0]));
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            p046e5.C6530c c6530c = (p046e5.C6530c) it.next();
            if (c6530c != null) {
                arrayList.add(c6530c);
            }
        }
        this.f44721d = q(iterable);
        n(arrayList);
    }

    public static e5.o.b m(java.util.concurrent.Executor executor) {
        return new e5.o.b(executor);
    }

    private void n(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this) {
            java.util.Iterator it = this.f44721d.iterator();
            while (it.hasNext()) {
                try {
                    com.google.firebase.components.ComponentRegistrar componentRegistrar = (com.google.firebase.components.ComponentRegistrar) ((F5.b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f44725h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (p046e5.w e6) {
                    it.remove();
                }
            }
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                for (java.lang.Object obj : ((p046e5.C6530c) it2.next()).j().toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f44722e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f44722e.add(obj.toString());
                    }
                }
            }
            if (this.f44718a.isEmpty()) {
                p046e5.q.a(list);
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f44718a.keySet());
                arrayList2.addAll(list);
                p046e5.q.a(arrayList2);
            }
            java.util.Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final p046e5.C6530c c6530c = (p046e5.C6530c) it3.next();
                this.f44718a.put(c6530c, new p046e5.x(new F5.b() { // from class: e5.l
                    @Override // F5.b
                    public final java.lang.Object get() {
                        return this.f44711a.r(c6530c);
                    }
                }));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        java.util.Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((java.lang.Runnable) it4.next()).run();
        }
        u();
    }

    private void o(java.util.Map map, boolean z6) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            p046e5.C6530c c6530c = (p046e5.C6530c) entry.getKey();
            F5.b bVar = (F5.b) entry.getValue();
            if (c6530c.n() || (c6530c.o() && z6)) {
                bVar.get();
            }
        }
        this.f44723f.c();
    }

    private static java.util.List q(java.lang.Iterable iterable) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object r(p046e5.C6530c c6530c) {
        return c6530c.h().a(new p046e5.G(c6530c, this));
    }

    private void u() {
        java.lang.Boolean bool = (java.lang.Boolean) this.f44724g.get();
        if (bool != null) {
            o(this.f44718a, bool.booleanValue());
        }
    }

    private void v() {
        java.util.Map map;
        p046e5.F fC;
        F5.b bVarE;
        for (p046e5.C6530c c6530c : this.f44718a.keySet()) {
            for (p046e5.r rVar : c6530c.g()) {
                if (rVar.g() && !this.f44720c.containsKey(rVar.c())) {
                    map = this.f44720c;
                    fC = rVar.c();
                    bVarE = p046e5.y.b(java.util.Collections.emptySet());
                } else if (this.f44719b.containsKey(rVar.c())) {
                    continue;
                } else {
                    if (rVar.f()) {
                        throw new p046e5.z(java.lang.String.format("Unsatisfied dependency for component %s: %s", c6530c, rVar.c()));
                    }
                    if (!rVar.g()) {
                        map = this.f44719b;
                        fC = rVar.c();
                        bVarE = p046e5.D.e();
                    }
                }
                map.put(fC, bVarE);
            }
        }
    }

    private java.util.List w(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p046e5.C6530c c6530c = (p046e5.C6530c) it.next();
            if (c6530c.p()) {
                final F5.b bVar = (F5.b) this.f44718a.get(c6530c);
                for (p046e5.F f6 : c6530c.j()) {
                    if (this.f44719b.containsKey(f6)) {
                        final p046e5.D d6 = (p046e5.D) ((F5.b) this.f44719b.get(f6));
                        arrayList.add(new java.lang.Runnable() { // from class: e5.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                d6.j(bVar);
                            }
                        });
                    } else {
                        this.f44719b.put(f6, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private java.util.List x() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap map = new java.util.HashMap();
        for (java.util.Map.Entry entry : this.f44718a.entrySet()) {
            p046e5.C6530c c6530c = (p046e5.C6530c) entry.getKey();
            if (!c6530c.p()) {
                F5.b bVar = (F5.b) entry.getValue();
                for (p046e5.F f6 : c6530c.j()) {
                    if (!map.containsKey(f6)) {
                        map.put(f6, new java.util.HashSet());
                    }
                    ((java.util.Set) map.get(f6)).add(bVar);
                }
            }
        }
        for (java.util.Map.Entry entry2 : map.entrySet()) {
            if (this.f44720c.containsKey(entry2.getKey())) {
                final p046e5.y yVar = (p046e5.y) this.f44720c.get(entry2.getKey());
                for (final F5.b bVar2 : (java.util.Set) entry2.getValue()) {
                    arrayList.add(new java.lang.Runnable() { // from class: e5.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            yVar.a(bVar2);
                        }
                    });
                }
            } else {
                this.f44720c.put((p046e5.F) entry2.getKey(), p046e5.y.b((java.util.Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // p046e5.InterfaceC6532e
    public /* synthetic */ java.lang.Object a(java.lang.Class cls) {
        return p046e5.AbstractC6531d.b(this, cls);
    }

    @Override // p046e5.InterfaceC6532e
    public synchronized F5.b b(p046e5.F f6) {
        p046e5.y yVar = (p046e5.y) this.f44720c.get(f6);
        if (yVar != null) {
            return yVar;
        }
        return f44717i;
    }

    @Override // p046e5.InterfaceC6532e
    public /* synthetic */ java.lang.Object c(p046e5.F f6) {
        return p046e5.AbstractC6531d.a(this, f6);
    }

    @Override // p046e5.InterfaceC6532e
    public /* synthetic */ F5.b d(java.lang.Class cls) {
        return p046e5.AbstractC6531d.d(this, cls);
    }

    @Override // p046e5.InterfaceC6532e
    public F5.a e(p046e5.F f6) {
        F5.b bVarF = f(f6);
        if (bVarF == null) {
            return p046e5.D.e();
        }
        return bVarF instanceof p046e5.D ? (p046e5.D) bVarF : p046e5.D.i(bVarF);
    }

    @Override // p046e5.InterfaceC6532e
    public synchronized F5.b f(p046e5.F f6) {
        p046e5.E.c(f6, "Null interface requested.");
        return (F5.b) this.f44719b.get(f6);
    }

    @Override // p046e5.InterfaceC6532e
    public /* synthetic */ java.util.Set g(java.lang.Class cls) {
        return p046e5.AbstractC6531d.f(this, cls);
    }

    @Override // p046e5.InterfaceC6532e
    public /* synthetic */ java.util.Set h(p046e5.F f6) {
        return p046e5.AbstractC6531d.e(this, f6);
    }

    @Override // p046e5.InterfaceC6532e
    public /* synthetic */ F5.a i(java.lang.Class cls) {
        return p046e5.AbstractC6531d.c(this, cls);
    }

    public void p(boolean z6) {
        java.util.HashMap map;
        if (p200u.AbstractC7162c0.a(this.f44724g, null, java.lang.Boolean.valueOf(z6))) {
            synchronized (this) {
                map = new java.util.HashMap(this.f44718a);
            }
            o(map, z6);
        }
    }
}
