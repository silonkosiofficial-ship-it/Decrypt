package M8;

/* JADX INFO: loaded from: classes2.dex */
final class m implements M8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M8.m f7102a = new M8.m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String f7103b = "should not have varargs or parameters with default values";

    private m() {
    }

    @Override // M8.f
    public boolean a(O7.InterfaceC1443y interfaceC1443y) {
        p247y7.AbstractC7350t.f(interfaceC1443y, "functionDescriptor");
        java.util.List listN = interfaceC1443y.n();
        p247y7.AbstractC7350t.e(listN, "getValueParameters(...)");
        java.util.List<O7.j0> list = listN;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        for (O7.j0 j0Var : list) {
            p247y7.AbstractC7350t.c(j0Var);
            if (p218v8.c.c(j0Var) || j0Var.u0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // M8.f
    public java.lang.String b(O7.InterfaceC1443y interfaceC1443y) {
        return M8.f.a.a(this, interfaceC1443y);
    }

    @Override // M8.f
    public java.lang.String getDescription() {
        return f7103b;
    }
}
