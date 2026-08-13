package T7;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements B8.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T7.j f13305b = new T7.j();

    private j() {
    }

    @Override // B8.r
    public void a(O7.InterfaceC1421b interfaceC1421b) {
        p247y7.AbstractC7350t.f(interfaceC1421b, "descriptor");
        throw new java.lang.IllegalStateException("Cannot infer visibility for " + interfaceC1421b);
    }

    @Override // B8.r
    public void b(O7.InterfaceC1424e interfaceC1424e, java.util.List list) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "descriptor");
        p247y7.AbstractC7350t.f(list, "unresolvedSuperClasses");
        throw new java.lang.IllegalStateException("Incomplete hierarchy for class " + interfaceC1424e.getName() + ", unresolved classes " + list);
    }
}
