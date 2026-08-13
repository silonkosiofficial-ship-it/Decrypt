package p147o7;

/* JADX INFO: loaded from: classes3.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p147o7.i f52555a = new p147o7.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o7.i.a f52556b = new o7.i.a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static o7.i.a f52557c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.reflect.Method f52558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final java.lang.reflect.Method f52559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final java.lang.reflect.Method f52560c;

        public a(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3) {
            this.f52558a = method;
            this.f52559b = method2;
            this.f52560c = method3;
        }
    }

    private i() {
    }

    private final o7.i.a a(p147o7.a aVar) {
        try {
            o7.i.a aVar2 = new o7.i.a(java.lang.Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f52557c = aVar2;
            return aVar2;
        } catch (java.lang.Exception unused) {
            o7.i.a aVar3 = f52556b;
            f52557c = aVar3;
            return aVar3;
        }
    }

    public final java.lang.String b(p147o7.a aVar) {
        java.lang.reflect.Method method;
        java.lang.Object objInvoke;
        java.lang.reflect.Method method2;
        java.lang.Object objInvoke2;
        p247y7.AbstractC7350t.f(aVar, "continuation");
        o7.i.a aVarA = f52557c;
        if (aVarA == null) {
            aVarA = a(aVar);
        }
        if (aVarA == f52556b || (method = aVarA.f52558a) == null || (objInvoke = method.invoke(aVar.getClass(), null)) == null || (method2 = aVarA.f52559b) == null || (objInvoke2 = method2.invoke(objInvoke, null)) == null) {
            return null;
        }
        java.lang.reflect.Method method3 = aVarA.f52560c;
        java.lang.Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof java.lang.String) {
            return (java.lang.String) objInvoke3;
        }
        return null;
    }
}
