package U7;

/* JADX INFO: renamed from: U7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1694c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U7.C1694c f14575a = new U7.C1694c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static U7.C1694c.a f14576b;

    /* JADX INFO: renamed from: U7.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.reflect.Method f14577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.reflect.Method f14578b;

        public a(java.lang.reflect.Method method, java.lang.reflect.Method method2) {
            this.f14577a = method;
            this.f14578b = method2;
        }

        public final java.lang.reflect.Method a() {
            return this.f14578b;
        }

        public final java.lang.reflect.Method b() {
            return this.f14577a;
        }
    }

    private C1694c() {
    }

    public final U7.C1694c.a a(java.lang.reflect.Member member) {
        p247y7.AbstractC7350t.f(member, "member");
        java.lang.Class<?> cls = member.getClass();
        try {
            return new U7.C1694c.a(cls.getMethod("getParameters", null), U7.d.f(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (java.lang.NoSuchMethodException unused) {
            return new U7.C1694c.a(null, null);
        }
    }

    public final java.util.List b(java.lang.reflect.Member member) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Method methodA;
        p247y7.AbstractC7350t.f(member, "member");
        U7.C1694c.a aVarA = f14576b;
        if (aVarA == null) {
            synchronized (this) {
                aVarA = f14576b;
                if (aVarA == null) {
                    aVarA = f14575a.a(member);
                    f14576b = aVarA;
                }
            }
        }
        java.lang.reflect.Method methodB = aVarA.b();
        if (methodB == null || (methodA = aVarA.a()) == null) {
            return null;
        }
        java.lang.Object objInvoke = methodB.invoke(member, null);
        p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        java.lang.Object[] objArr = (java.lang.Object[]) objInvoke;
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            java.lang.Object objInvoke2 = methodA.invoke(obj, null);
            p247y7.AbstractC7350t.d(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((java.lang.String) objInvoke2);
        }
        return arrayList;
    }
}
