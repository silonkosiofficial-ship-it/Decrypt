package R9;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final R9.j.a f9804d = new R9.j.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.reflect.Method f9805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.reflect.Method f9806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.reflect.Method f9807c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final R9.j a() throws java.lang.NoSuchMethodException {
            java.lang.reflect.Method method;
            java.lang.reflect.Method method2;
            java.lang.reflect.Method method3 = null;
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("dalvik.system.CloseGuard");
                java.lang.reflect.Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod("open", java.lang.String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (java.lang.Exception unused) {
                method = null;
                method2 = null;
            }
            return new R9.j(method3, method2, method);
        }
    }

    public j(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3) {
        this.f9805a = method;
        this.f9806b = method2;
        this.f9807c = method3;
    }

    public final java.lang.Object a(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "closer");
        java.lang.reflect.Method method = this.f9805a;
        if (method != null) {
            try {
                java.lang.Object objInvoke = method.invoke(null, null);
                java.lang.reflect.Method method2 = this.f9806b;
                p247y7.AbstractC7350t.c(method2);
                method2.invoke(objInvoke, str);
                return objInvoke;
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(java.lang.Object obj) {
        if (obj != null) {
            try {
                java.lang.reflect.Method method = this.f9807c;
                p247y7.AbstractC7350t.c(method);
                method.invoke(obj, null);
                return true;
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }
}
