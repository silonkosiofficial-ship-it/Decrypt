package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends V1.e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.app.Activity f22565C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.content.Context f22566D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.os.Handler f22567E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f22568F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final androidx.fragment.app.n f22569G;

    k(android.app.Activity activity, android.content.Context context, android.os.Handler handler, int i6) {
        this.f22569G = new androidx.fragment.app.o();
        this.f22565C = activity;
        this.f22566D = (android.content.Context) B1.i.h(context, "context == null");
        this.f22567E = (android.os.Handler) B1.i.h(handler, "handler == null");
        this.f22568F = i6;
    }

    k(androidx.fragment.app.g gVar) {
        this(gVar, gVar, new android.os.Handler(), 0);
    }

    public abstract void A();

    android.app.Activity k() {
        return this.f22565C;
    }

    android.content.Context o() {
        return this.f22566D;
    }

    public android.os.Handler r() {
        return this.f22567E;
    }

    public abstract void w(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

    public abstract java.lang.Object x();

    public abstract android.view.LayoutInflater y();

    public void z(androidx.fragment.app.f fVar, android.content.Intent intent, int i6, android.os.Bundle bundle) {
        if (i6 != -1) {
            throw new java.lang.IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.a.j(this.f22566D, intent, bundle);
    }
}
