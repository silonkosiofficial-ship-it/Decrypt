package W6;

/* JADX INFO: loaded from: classes3.dex */
final class t extends W6.AbstractC1769c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f15381a = new java.util.HashMap();

    @Override // W6.InterfaceC1768b
    public java.lang.Object g(W6.C1767a c1767a, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(c1767a, "key");
        p247y7.AbstractC7350t.f(aVar, "block");
        java.lang.Object obj = h().get(c1767a);
        if (obj != null) {
            return obj;
        }
        java.lang.Object objB = aVar.b();
        java.lang.Object objPut = h().put(c1767a, objB);
        if (objPut != null) {
            objB = objPut;
        }
        p247y7.AbstractC7350t.d(objB, "null cannot be cast to non-null type T of io.ktor.util.HashMapAttributes.computeIfAbsent");
        return objB;
    }

    @Override // W6.AbstractC1769c
    protected java.util.Map h() {
        return this.f15381a;
    }
}
