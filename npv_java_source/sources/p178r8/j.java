package p178r8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends p178r8.k {
    @Override // p178r8.k
    public void b(O7.InterfaceC1421b interfaceC1421b, O7.InterfaceC1421b interfaceC1421b2) {
        p247y7.AbstractC7350t.f(interfaceC1421b, "first");
        p247y7.AbstractC7350t.f(interfaceC1421b2, "second");
        e(interfaceC1421b, interfaceC1421b2);
    }

    @Override // p178r8.k
    public void c(O7.InterfaceC1421b interfaceC1421b, O7.InterfaceC1421b interfaceC1421b2) {
        p247y7.AbstractC7350t.f(interfaceC1421b, "fromSuper");
        p247y7.AbstractC7350t.f(interfaceC1421b2, "fromCurrent");
        e(interfaceC1421b, interfaceC1421b2);
    }

    protected abstract void e(O7.InterfaceC1421b interfaceC1421b, O7.InterfaceC1421b interfaceC1421b2);
}
