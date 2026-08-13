package P8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final boolean a(java.lang.Throwable th) {
        p247y7.AbstractC7350t.f(th, "<this>");
        java.lang.Class<?> superclass = th.getClass();
        while (!p247y7.AbstractC7350t.b(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final java.lang.RuntimeException b(java.lang.Throwable th) throws java.lang.Throwable {
        p247y7.AbstractC7350t.f(th, "e");
        throw th;
    }
}
