package U7;

/* JADX INFO: renamed from: U7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1692a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U7.C1692a f14565a = new U7.C1692a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static U7.C1692a.C0283a f14566b;

    /* JADX INFO: renamed from: U7.a$a, reason: collision with other inner class name */
    public static final class C0283a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.reflect.Method f14567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.reflect.Method f14568b;

        public C0283a(java.lang.reflect.Method method, java.lang.reflect.Method method2) {
            this.f14567a = method;
            this.f14568b = method2;
        }

        public final java.lang.reflect.Method a() {
            return this.f14568b;
        }

        public final java.lang.reflect.Method b() {
            return this.f14567a;
        }
    }

    private C1692a() {
    }

    private final U7.C1692a.C0283a a(java.lang.Object obj) {
        java.lang.Class<?> cls = obj.getClass();
        try {
            return new U7.C1692a.C0283a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (java.lang.NoSuchMethodException unused) {
            return new U7.C1692a.C0283a(null, null);
        }
    }

    private final U7.C1692a.C0283a b(java.lang.Object obj) {
        U7.C1692a.C0283a c0283a = f14566b;
        if (c0283a != null) {
            return c0283a;
        }
        U7.C1692a.C0283a c0283aA = a(obj);
        f14566b = c0283aA;
        return c0283aA;
    }

    public final java.lang.reflect.Method c(java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        p247y7.AbstractC7350t.f(obj, "recordComponent");
        java.lang.reflect.Method methodA = b(obj).a();
        if (methodA == null) {
            return null;
        }
        java.lang.Object objInvoke = methodA.invoke(obj, null);
        p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (java.lang.reflect.Method) objInvoke;
    }

    public final java.lang.Class d(java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        p247y7.AbstractC7350t.f(obj, "recordComponent");
        java.lang.reflect.Method methodB = b(obj).b();
        if (methodB == null) {
            return null;
        }
        java.lang.Object objInvoke = methodB.invoke(obj, null);
        p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (java.lang.Class) objInvoke;
    }
}
