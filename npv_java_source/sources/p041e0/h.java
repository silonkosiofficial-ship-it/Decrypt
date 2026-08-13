package p041e0;

/* JADX INFO: loaded from: classes.dex */
final class h implements p041e0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f44508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f44509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f44510c;

    public static final class a implements e0.g.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f44512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p237x7.a f44513c;

        a(java.lang.String str, p237x7.a aVar) {
            this.f44512b = str;
            this.f44513c = aVar;
        }

        @Override // e0.g.a
        public void a() {
            java.util.List list = (java.util.List) p041e0.h.this.f44510c.remove(this.f44512b);
            if (list != null) {
                list.remove(this.f44513c);
            }
            if (list == null || !(!list.isEmpty())) {
                return;
            }
            p041e0.h.this.f44510c.put(this.f44512b, list);
        }
    }

    public h(java.util.Map map, p237x7.l lVar) {
        java.util.Map mapU;
        this.f44508a = lVar;
        this.f44509b = (map == null || (mapU = p097j7.S.u(map)) == null) ? new java.util.LinkedHashMap() : mapU;
        this.f44510c = new java.util.LinkedHashMap();
    }

    @Override // p041e0.g
    public boolean a(java.lang.Object obj) {
        return ((java.lang.Boolean) this.f44508a.l(obj)).booleanValue();
    }

    @Override // p041e0.g
    public java.util.Map b() {
        java.util.Map mapU = p097j7.S.u(this.f44509b);
        for (java.util.Map.Entry entry : this.f44510c.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            if (list.size() == 1) {
                java.lang.Object objB = ((p237x7.a) list.get(0)).b();
                if (objB == null) {
                    continue;
                } else {
                    if (!a(objB)) {
                        throw new java.lang.IllegalStateException(p041e0.b.b(objB).toString());
                    }
                    mapU.put(str, p097j7.AbstractC6879v.g(objB));
                }
            } else {
                int size = list.size();
                java.util.ArrayList arrayList = new java.util.ArrayList(size);
                for (int i6 = 0; i6 < size; i6++) {
                    java.lang.Object objB2 = ((p237x7.a) list.get(i6)).b();
                    if (objB2 != null && !a(objB2)) {
                        throw new java.lang.IllegalStateException(p041e0.b.b(objB2).toString());
                    }
                    arrayList.add(objB2);
                }
                mapU.put(str, arrayList);
            }
        }
        return mapU;
    }

    @Override // p041e0.g
    public java.lang.Object c(java.lang.String str) {
        java.util.List list = (java.util.List) this.f44509b.remove(str);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            this.f44509b.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // p041e0.g
    public e0.g.a e(java.lang.String str, p237x7.a aVar) {
        if (!(!p041e0.i.c(str))) {
            throw new java.lang.IllegalArgumentException("Registered key is empty or blank".toString());
        }
        java.util.Map map = this.f44510c;
        java.lang.Object arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            map.put(str, arrayList);
        }
        ((java.util.List) arrayList).add(aVar);
        return new e0.h.a(str, aVar);
    }
}
