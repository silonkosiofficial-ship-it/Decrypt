package W3;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final W3.e f15338b = new W3.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private W3.d f15339a = null;

    public static W3.d a(android.content.Context context) {
        return f15338b.b(context);
    }

    public final synchronized W3.d b(android.content.Context context) {
        try {
            if (this.f15339a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f15339a = new W3.d(context);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f15339a;
    }
}
