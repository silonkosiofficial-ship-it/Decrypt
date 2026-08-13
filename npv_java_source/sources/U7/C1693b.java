package U7;

/* JADX INFO: renamed from: U7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1693b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U7.C1693b f14569a = new U7.C1693b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static U7.C1693b.a f14570b;

    /* JADX INFO: renamed from: U7.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.reflect.Method f14571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.reflect.Method f14572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.lang.reflect.Method f14573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final java.lang.reflect.Method f14574d;

        public a(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.reflect.Method method4) {
            this.f14571a = method;
            this.f14572b = method2;
            this.f14573c = method3;
            this.f14574d = method4;
        }

        public final java.lang.reflect.Method a() {
            return this.f14572b;
        }

        public final java.lang.reflect.Method b() {
            return this.f14574d;
        }

        public final java.lang.reflect.Method c() {
            return this.f14573c;
        }

        public final java.lang.reflect.Method d() {
            return this.f14571a;
        }
    }

    private C1693b() {
    }

    private final U7.C1693b.a a() {
        try {
            return new U7.C1693b.a(java.lang.Class.class.getMethod("isSealed", null), java.lang.Class.class.getMethod("getPermittedSubclasses", null), java.lang.Class.class.getMethod("isRecord", null), java.lang.Class.class.getMethod("getRecordComponents", null));
        } catch (java.lang.NoSuchMethodException unused) {
            return new U7.C1693b.a(null, null, null, null);
        }
    }

    private final U7.C1693b.a b() {
        U7.C1693b.a aVar = f14570b;
        if (aVar != null) {
            return aVar;
        }
        U7.C1693b.a aVarA = a();
        f14570b = aVarA;
        return aVarA;
    }

    public final java.lang.Class[] c(java.lang.Class cls) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        p247y7.AbstractC7350t.f(cls, "clazz");
        java.lang.reflect.Method methodA = b().a();
        if (methodA == null) {
            return null;
        }
        java.lang.Object objInvoke = methodA.invoke(cls, null);
        p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (java.lang.Class[]) objInvoke;
    }

    public final java.lang.Object[] d(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "clazz");
        java.lang.reflect.Method methodB = b().b();
        if (methodB == null) {
            return null;
        }
        return (java.lang.Object[]) methodB.invoke(cls, null);
    }

    public final java.lang.Boolean e(java.lang.Class cls) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        p247y7.AbstractC7350t.f(cls, "clazz");
        java.lang.reflect.Method methodC = b().c();
        if (methodC == null) {
            return null;
        }
        java.lang.Object objInvoke = methodC.invoke(cls, null);
        p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (java.lang.Boolean) objInvoke;
    }

    public final java.lang.Boolean f(java.lang.Class cls) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        p247y7.AbstractC7350t.f(cls, "clazz");
        java.lang.reflect.Method methodD = b().d();
        if (methodD == null) {
            return null;
        }
        java.lang.Object objInvoke = methodD.invoke(cls, null);
        p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (java.lang.Boolean) objInvoke;
    }
}
