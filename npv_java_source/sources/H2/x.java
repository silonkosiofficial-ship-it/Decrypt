package H2;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final H2.z f4356a = H2.x.a();
    }

    static H2.z a() {
        try {
            return new H2.A((org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface) Z9.a.a(org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (java.lang.ClassNotFoundException unused) {
            return new H2.q();
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.RuntimeException(e6);
        } catch (java.lang.NoSuchMethodException e10) {
            throw new java.lang.RuntimeException(e10);
        } catch (java.lang.reflect.InvocationTargetException e11) {
            throw new java.lang.RuntimeException(e11);
        }
    }

    private static java.lang.reflect.InvocationHandler b() {
        return (java.lang.reflect.InvocationHandler) java.lang.Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, d()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static H2.z c() {
        return H2.x.a.f4356a;
    }

    public static java.lang.ClassLoader d() {
        return android.os.Build.VERSION.SDK_INT >= 28 ? H2.o.b() : e().getClass().getClassLoader();
    }

    private static java.lang.Object e() {
        try {
            java.lang.reflect.Method declaredMethod = android.webkit.WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.RuntimeException(e6);
        } catch (java.lang.NoSuchMethodException e10) {
            throw new java.lang.RuntimeException(e10);
        } catch (java.lang.reflect.InvocationTargetException e11) {
            throw new java.lang.RuntimeException(e11);
        }
    }
}
