package W6;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements java.util.Map, p256z7.e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.Map f15369C = new java.util.LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map.Entry e(java.util.Map.Entry entry) {
        p247y7.AbstractC7350t.f(entry, "$this$DelegatingMutableSet");
        return new W6.s(((W6.l) entry.getKey()).a(), entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map.Entry f(java.util.Map.Entry entry) {
        p247y7.AbstractC7350t.f(entry, "$this$DelegatingMutableSet");
        return new W6.s(W6.E.a((java.lang.String) entry.getKey()), entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String g(W6.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "$this$DelegatingMutableSet");
        return lVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W6.l h(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "$this$DelegatingMutableSet");
        return W6.E.a(str);
    }

    @Override // java.util.Map
    public void clear() {
        this.f15369C.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return k((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f15369C.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return m();
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof W6.k)) {
            return false;
        }
        return p247y7.AbstractC7350t.b(((W6.k) obj).f15369C, this.f15369C);
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return l((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f15369C.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f15369C.isEmpty();
    }

    public boolean k(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "key");
        return this.f15369C.containsKey(new W6.l(str));
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return o();
    }

    public java.lang.Object l(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "key");
        return this.f15369C.get(W6.E.a(str));
    }

    public java.util.Set m() {
        return new W6.r(this.f15369C.entrySet(), new p237x7.l() { // from class: W6.g
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return W6.k.e((java.util.Map.Entry) obj);
            }
        }, new p237x7.l() { // from class: W6.h
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return W6.k.f((java.util.Map.Entry) obj);
            }
        });
    }

    public java.util.Set o() {
        return new W6.r(this.f15369C.keySet(), new p237x7.l() { // from class: W6.i
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return W6.k.g((W6.l) obj);
            }
        }, new p237x7.l() { // from class: W6.j
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return W6.k.h((java.lang.String) obj);
            }
        });
    }

    public int p() {
        return this.f15369C.size();
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "from");
        for (java.util.Map.Entry entry : map.entrySet()) {
            put((java.lang.String) entry.getKey(), entry.getValue());
        }
    }

    public java.util.Collection q() {
        return this.f15369C.values();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public java.lang.Object put(java.lang.String str, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(obj, "value");
        return this.f15369C.put(W6.E.a(str), obj);
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return s((java.lang.String) obj);
        }
        return null;
    }

    public java.lang.Object s(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "key");
        return this.f15369C.remove(W6.E.a(str));
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return p();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection values() {
        return q();
    }
}
