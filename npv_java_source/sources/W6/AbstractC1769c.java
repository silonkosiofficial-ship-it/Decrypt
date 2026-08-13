package W6;

/* JADX INFO: renamed from: W6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC1769c implements W6.InterfaceC1768b {
    @Override // W6.InterfaceC1768b
    public final java.util.List a() {
        return p097j7.AbstractC6879v.T0(h().keySet());
    }

    @Override // W6.InterfaceC1768b
    public java.lang.Object b(W6.C1767a c1767a) {
        return W6.InterfaceC1768b.a.a(this, c1767a);
    }

    @Override // W6.InterfaceC1768b
    public final java.lang.Object c(W6.C1767a c1767a) {
        p247y7.AbstractC7350t.f(c1767a, "key");
        return h().get(c1767a);
    }

    @Override // W6.InterfaceC1768b
    public final void d(W6.C1767a c1767a) {
        p247y7.AbstractC7350t.f(c1767a, "key");
        h().remove(c1767a);
    }

    @Override // W6.InterfaceC1768b
    public final boolean e(W6.C1767a c1767a) {
        p247y7.AbstractC7350t.f(c1767a, "key");
        return h().containsKey(c1767a);
    }

    @Override // W6.InterfaceC1768b
    public final void f(W6.C1767a c1767a, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(c1767a, "key");
        p247y7.AbstractC7350t.f(obj, "value");
        h().put(c1767a, obj);
    }

    protected abstract java.util.Map h();
}
