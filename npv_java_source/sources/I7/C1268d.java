package I7;

/* JADX INFO: renamed from: I7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1268d extends I7.AbstractC1265a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f5352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j$.util.concurrent.ConcurrentHashMap f5353b;

    public C1268d(p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "compute");
        this.f5352a = lVar;
        this.f5353b = new j$.util.concurrent.ConcurrentHashMap();
    }

    @Override // I7.AbstractC1265a
    public java.lang.Object a(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "key");
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f5353b;
        V v6 = concurrentHashMap.get(cls);
        if (v6 != 0) {
            return v6;
        }
        java.lang.Object objL = this.f5352a.l(cls);
        V vPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objL);
        return vPutIfAbsent == 0 ? objL : vPutIfAbsent;
    }
}
