package p087i7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: i7.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6662h {
    public static void a(java.lang.Throwable th, java.lang.Throwable th2) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        p247y7.AbstractC7350t.f(th, "<this>");
        p247y7.AbstractC7350t.f(th2, "exception");
        if (th != th2) {
            p167q7.b.f53142a.a(th, th2);
        }
    }

    public static java.lang.String b(java.lang.Throwable th) {
        p247y7.AbstractC7350t.f(th, "<this>");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        java.lang.String string = stringWriter.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
