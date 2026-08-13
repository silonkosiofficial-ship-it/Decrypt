package W6;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends java.util.LinkedHashMap {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p237x7.l f15382C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p237x7.l f15383D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f15384E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p237x7.l lVar, p237x7.l lVar2, int i6) {
        super(10, 0.75f, true);
        p247y7.AbstractC7350t.f(lVar, "supplier");
        p247y7.AbstractC7350t.f(lVar2, "close");
        this.f15382C = lVar;
        this.f15383D = lVar2;
        this.f15384E = i6;
    }

    public /* bridge */ java.util.Set a() {
        return super.entrySet();
    }

    public /* bridge */ java.util.Set b() {
        return super.keySet();
    }

    public /* bridge */ int c() {
        return super.size();
    }

    public /* bridge */ java.util.Collection d() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return a();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        if (this.f15384E == 0) {
            return this.f15382C.l(obj);
        }
        synchronized (this) {
            java.lang.Object obj2 = super.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            java.lang.Object objL = this.f15382C.l(obj);
            put(obj, objL);
            return objL;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return b();
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(java.util.Map.Entry entry) {
        p247y7.AbstractC7350t.f(entry, "eldest");
        boolean z6 = size() > this.f15384E;
        if (z6) {
            this.f15383D.l(entry.getValue());
        }
        return z6;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Collection values() {
        return d();
    }
}
