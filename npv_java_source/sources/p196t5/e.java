package p196t5;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f54625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f54626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.StackTraceElement[] f54627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p196t5.e f54628d;

    private e(java.lang.String str, java.lang.String str2, java.lang.StackTraceElement[] stackTraceElementArr, p196t5.e eVar) {
        this.f54625a = str;
        this.f54626b = str2;
        this.f54627c = stackTraceElementArr;
        this.f54628d = eVar;
    }

    public static p196t5.e a(java.lang.Throwable th, p196t5.d dVar) {
        java.util.Stack stack = new java.util.Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        p196t5.e eVar = null;
        while (!stack.isEmpty()) {
            java.lang.Throwable th2 = (java.lang.Throwable) stack.pop();
            eVar = new p196t5.e(th2.getLocalizedMessage(), th2.getClass().getName(), dVar.a(th2.getStackTrace()), eVar);
        }
        return eVar;
    }
}
