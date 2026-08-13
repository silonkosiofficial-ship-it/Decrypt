package Q3;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Object f8916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8917b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Q3.AbstractC1464c f8918c;

    public c0(Q3.AbstractC1464c abstractC1464c, java.lang.Object obj) {
        this.f8918c = abstractC1464c;
        this.f8916a = obj;
    }

    protected abstract void a(java.lang.Object obj);

    protected abstract void b();

    public final void c() {
        java.lang.Object obj;
        synchronized (this) {
            try {
                obj = this.f8916a;
                if (this.f8917b) {
                    java.lang.String str = "Callback proxy " + toString() + " being reused. This is not safe.";
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f8917b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f8916a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f8918c.f8906r) {
            this.f8918c.f8906r.remove(this);
        }
    }
}
