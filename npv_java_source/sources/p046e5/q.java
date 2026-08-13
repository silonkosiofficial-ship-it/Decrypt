package p046e5;

/* JADX INFO: loaded from: classes3.dex */
abstract class q {

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p046e5.C6530c f44731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.Set f44732b = new java.util.HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.util.Set f44733c = new java.util.HashSet();

        b(p046e5.C6530c c6530c) {
            this.f44731a = c6530c;
        }

        void a(e5.q.b bVar) {
            this.f44732b.add(bVar);
        }

        void b(e5.q.b bVar) {
            this.f44733c.add(bVar);
        }

        p046e5.C6530c c() {
            return this.f44731a;
        }

        java.util.Set d() {
            return this.f44732b;
        }

        boolean e() {
            return this.f44732b.isEmpty();
        }

        boolean f() {
            return this.f44733c.isEmpty();
        }

        void g(e5.q.b bVar) {
            this.f44733c.remove(bVar);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p046e5.F f44734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f44735b;

        private c(p046e5.F f6, boolean z6) {
            this.f44734a = f6;
            this.f44735b = z6;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof e5.q.c)) {
                return false;
            }
            e5.q.c cVar = (e5.q.c) obj;
            return cVar.f44734a.equals(this.f44734a) && cVar.f44735b == this.f44735b;
        }

        public int hashCode() {
            return ((this.f44734a.hashCode() ^ 1000003) * 1000003) ^ java.lang.Boolean.valueOf(this.f44735b).hashCode();
        }
    }

    static void a(java.util.List list) {
        java.util.Set<e5.q.b> setC = c(list);
        java.util.Set setB = b(setC);
        int i6 = 0;
        while (!setB.isEmpty()) {
            e5.q.b bVar = (e5.q.b) setB.iterator().next();
            setB.remove(bVar);
            i6++;
            for (e5.q.b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    setB.add(bVar2);
                }
            }
        }
        if (i6 == list.size()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (e5.q.b bVar3 : setC) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new p046e5.s(arrayList);
    }

    private static java.util.Set b(java.util.Set set) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            e5.q.b bVar = (e5.q.b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static java.util.Set c(java.util.List list) {
        java.util.Set<e5.q.b> set;
        java.util.HashMap map = new java.util.HashMap(list.size());
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                java.util.Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (e5.q.b bVar : (java.util.Set) it2.next()) {
                        for (p046e5.r rVar : bVar.c().g()) {
                            if (rVar.e() && (set = (java.util.Set) map.get(new e5.q.c(rVar.c(), rVar.g()))) != null) {
                                for (e5.q.b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((java.util.Set) it3.next());
                }
                return hashSet;
            }
            p046e5.C6530c c6530c = (p046e5.C6530c) it.next();
            e5.q.b bVar3 = new e5.q.b(c6530c);
            for (p046e5.F f6 : c6530c.j()) {
                e5.q.c cVar = new e5.q.c(f6, !c6530c.p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new java.util.HashSet());
                }
                java.util.Set set2 = (java.util.Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f44735b) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Multiple components provide %s.", f6));
                }
                set2.add(bVar3);
            }
        }
    }
}
