package M8;

/* JADX INFO: loaded from: classes2.dex */
final class j implements M8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M8.j f7096a = new M8.j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String f7097b = "second parameter must be of type KProperty<*> or its supertype";

    private j() {
    }

    @Override // M8.f
    public boolean a(O7.InterfaceC1443y interfaceC1443y) {
        p247y7.AbstractC7350t.f(interfaceC1443y, "functionDescriptor");
        O7.j0 j0Var = (O7.j0) interfaceC1443y.n().get(1);
        L7.i.b bVar = L7.i.f6281k;
        p247y7.AbstractC7350t.c(j0Var);
        F8.E eA = bVar.a(p218v8.c.p(j0Var));
        if (eA == null) {
            return false;
        }
        F8.E type = j0Var.getType();
        p247y7.AbstractC7350t.e(type, "getType(...)");
        return K8.a.r(eA, K8.a.v(type));
    }

    @Override // M8.f
    public java.lang.String b(O7.InterfaceC1443y interfaceC1443y) {
        return M8.f.a.a(this, interfaceC1443y);
    }

    @Override // M8.f
    public java.lang.String getDescription() {
        return f7097b;
    }
}
