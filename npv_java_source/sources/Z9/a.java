package Z9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: Z9.a$a, reason: collision with other inner class name */
    private static class C0324a implements java.lang.reflect.InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f16989a;

        public C0324a(java.lang.Object obj) {
            this.f16989a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
            try {
                return Z9.a.d(method, this.f16989a.getClass().getClassLoader()).invoke(this.f16989a, objArr);
            } catch (java.lang.reflect.InvocationTargetException e6) {
                throw e6.getTargetException();
            } catch (java.lang.ReflectiveOperationException e10) {
                throw new java.lang.RuntimeException("Reflection failed for method " + method, e10);
            }
        }
    }

    public static java.lang.Object a(java.lang.Class cls, java.lang.reflect.InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(java.lang.reflect.Proxy.newProxyInstance(Z9.a.class.getClassLoader(), new java.lang.Class[]{cls}, invocationHandler));
    }

    public static boolean b(java.util.Collection collection, java.lang.String str) {
        if (!collection.contains(str)) {
            if (e()) {
                if (collection.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }

    public static java.lang.reflect.InvocationHandler c(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return new Z9.a.C0324a(obj);
    }

    public static java.lang.reflect.Method d(java.lang.reflect.Method method, java.lang.ClassLoader classLoader) throws java.lang.ClassNotFoundException {
        return java.lang.Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    private static boolean e() {
        java.lang.String str = android.os.Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
