package O2;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.String f8007f = I2.j.f("ConstraintTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final S2.a f8008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final android.content.Context f8009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f8010c = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Set f8011d = new java.util.LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    java.lang.Object f8012e;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ java.util.List f8013C;

        a(java.util.List list) {
            this.f8013C = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            java.util.Iterator it = this.f8013C.iterator();
            while (it.hasNext()) {
                ((M2.a) it.next()).a(O2.d.this.f8012e);
            }
        }
    }

    d(android.content.Context context, S2.a aVar) {
        this.f8009b = context.getApplicationContext();
        this.f8008a = aVar;
    }

    public void a(M2.a aVar) {
        synchronized (this.f8010c) {
            try {
                if (this.f8011d.add(aVar)) {
                    if (this.f8011d.size() == 1) {
                        this.f8012e = b();
                        I2.j.c().a(f8007f, java.lang.String.format("%s: initial state = %s", getClass().getSimpleName(), this.f8012e), new java.lang.Throwable[0]);
                        e();
                    }
                    aVar.a(this.f8012e);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public abstract java.lang.Object b();

    public void c(M2.a aVar) {
        synchronized (this.f8010c) {
            try {
                if (this.f8011d.remove(aVar) && this.f8011d.isEmpty()) {
                    f();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void d(java.lang.Object obj) {
        synchronized (this.f8010c) {
            try {
                java.lang.Object obj2 = this.f8012e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f8012e = obj;
                    this.f8008a.a().execute(new O2.d.a(new java.util.ArrayList(this.f8011d)));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
