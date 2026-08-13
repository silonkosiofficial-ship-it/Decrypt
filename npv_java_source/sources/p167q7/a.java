package p167q7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: q7.a$a, reason: collision with other inner class name */
    private static final class C0690a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p167q7.a.C0690a f53139a = new p167q7.a.C0690a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final java.lang.reflect.Method f53140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final java.lang.reflect.Method f53141c;

        static {
            java.lang.reflect.Method method;
            java.lang.reflect.Method method2;
            java.lang.reflect.Method[] methods = java.lang.Throwable.class.getMethods();
            p247y7.AbstractC7350t.c(methods);
            int length = methods.length;
            int i6 = 0;
            while (true) {
                method = null;
                if (i6 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i6];
                if (p247y7.AbstractC7350t.b(method2.getName(), "addSuppressed")) {
                    java.lang.Class<?>[] parameterTypes = method2.getParameterTypes();
                    p247y7.AbstractC7350t.e(parameterTypes, "getParameterTypes(...)");
                    if (p247y7.AbstractC7350t.b(p097j7.AbstractC6872n.G0(parameterTypes), java.lang.Throwable.class)) {
                        break;
                    }
                }
                i6++;
            }
            f53140b = method2;
            for (java.lang.reflect.Method method3 : methods) {
                if (p247y7.AbstractC7350t.b(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            f53141c = method;
        }

        private C0690a() {
        }
    }

    public void a(java.lang.Throwable th, java.lang.Throwable th2) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        p247y7.AbstractC7350t.f(th, "cause");
        p247y7.AbstractC7350t.f(th2, "exception");
        java.lang.reflect.Method method = p167q7.a.C0690a.f53140b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public C7.c b() {
        return new C7.b();
    }
}
