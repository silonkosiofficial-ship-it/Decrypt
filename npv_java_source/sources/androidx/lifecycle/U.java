package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p043e2.e f22789a = new p043e2.e();

    public static final W8.N a(androidx.lifecycle.T t6) {
        p043e2.a aVarA;
        p247y7.AbstractC7350t.f(t6, "<this>");
        synchronized (f22789a) {
            aVarA = (p043e2.a) t6.f("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVarA == null) {
                aVarA = p043e2.b.a();
                t6.d("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVarA);
            }
        }
        return aVarA;
    }
}
