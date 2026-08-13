package W6;

/* JADX INFO: loaded from: classes3.dex */
final class p extends W6.AbstractC1769c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.util.concurrent.ConcurrentHashMap f15372a = new j$.util.concurrent.ConcurrentHashMap();

    @Override // W6.InterfaceC1768b
    public java.lang.Object g(W6.C1767a c1767a, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(c1767a, "key");
        p247y7.AbstractC7350t.f(aVar, "block");
        java.lang.Object obj = h().get(c1767a);
        if (obj != null) {
            return obj;
        }
        java.lang.Object objB = aVar.b();
        java.lang.Object objPutIfAbsent = h().putIfAbsent(c1767a, objB);
        if (objPutIfAbsent != null) {
            objB = objPutIfAbsent;
        }
        p247y7.AbstractC7350t.d(objB, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return objB;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // W6.AbstractC1769c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public j$.util.concurrent.ConcurrentHashMap h() {
        return this.f15372a;
    }
}
