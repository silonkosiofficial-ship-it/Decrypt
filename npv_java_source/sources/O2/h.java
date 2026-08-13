package O2;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static O2.h f8022e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private O2.a f8023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private O2.b f8024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private O2.f f8025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private O2.g f8026d;

    private h(android.content.Context context, S2.a aVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f8023a = new O2.a(applicationContext, aVar);
        this.f8024b = new O2.b(applicationContext, aVar);
        this.f8025c = new O2.f(applicationContext, aVar);
        this.f8026d = new O2.g(applicationContext, aVar);
    }

    public static synchronized O2.h c(android.content.Context context, S2.a aVar) {
        try {
            if (f8022e == null) {
                f8022e = new O2.h(context, aVar);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return f8022e;
    }

    public O2.a a() {
        return this.f8023a;
    }

    public O2.b b() {
        return this.f8024b;
    }

    public O2.f d() {
        return this.f8025c;
    }

    public O2.g e() {
        return this.f8026d;
    }
}
