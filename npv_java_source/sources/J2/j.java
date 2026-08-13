package J2;

/* JADX INFO: loaded from: classes.dex */
public class j extends I2.t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final java.lang.String f5677j = I2.j.f("WorkManagerImpl");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static J2.j f5678k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static J2.j f5679l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final java.lang.Object f5680m = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f5681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.work.a f5682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.work.impl.WorkDatabase f5683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private S2.a f5684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.util.List f5685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private J2.d f5686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private R2.h f5687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private android.content.BroadcastReceiver.PendingResult f5689i;

    public j(android.content.Context context, androidx.work.a aVar, S2.a aVar2) {
        this(context, aVar, aVar2, context.getResources().getBoolean(I2.p.f4986a));
    }

    public j(android.content.Context context, androidx.work.a aVar, S2.a aVar2, androidx.work.impl.WorkDatabase workDatabase) {
        android.content.Context applicationContext = context.getApplicationContext();
        I2.j.e(new I2.j.a(aVar.j()));
        java.util.List listG = g(applicationContext, aVar, aVar2);
        q(context, aVar, aVar2, workDatabase, listG, new J2.d(context, aVar, aVar2, workDatabase, listG));
    }

    public j(android.content.Context context, androidx.work.a aVar, S2.a aVar2, boolean z6) {
        this(context, aVar, aVar2, androidx.work.impl.WorkDatabase.P(context.getApplicationContext(), aVar2.c(), z6));
    }

    public static void e(android.content.Context context, androidx.work.a aVar) {
        synchronized (f5680m) {
            try {
                J2.j jVar = f5678k;
                if (jVar != null && f5679l != null) {
                    throw new java.lang.IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (jVar == null) {
                    android.content.Context applicationContext = context.getApplicationContext();
                    if (f5679l == null) {
                        f5679l = new J2.j(applicationContext, aVar, new S2.b(aVar.l()));
                    }
                    f5678k = f5679l;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static J2.j j() {
        synchronized (f5680m) {
            try {
                J2.j jVar = f5678k;
                if (jVar != null) {
                    return jVar;
                }
                return f5679l;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static J2.j k(android.content.Context context) {
        J2.j jVarJ;
        synchronized (f5680m) {
            try {
                jVarJ = j();
                if (jVarJ == null) {
                    context.getApplicationContext();
                    throw new java.lang.IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return jVarJ;
    }

    private void q(android.content.Context context, androidx.work.a aVar, S2.a aVar2, androidx.work.impl.WorkDatabase workDatabase, java.util.List list, J2.d dVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f5681a = applicationContext;
        this.f5682b = aVar;
        this.f5684d = aVar2;
        this.f5683c = workDatabase;
        this.f5685e = list;
        this.f5686f = dVar;
        this.f5687g = new R2.h(workDatabase);
        this.f5688h = false;
        if (android.os.Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new java.lang.IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f5684d.b(new androidx.work.impl.utils.ForceStopRunnable(applicationContext, this));
    }

    @Override // I2.t
    public I2.m a(java.lang.String str) {
        R2.a aVarD = R2.a.d(str, this);
        this.f5684d.b(aVarD);
        return aVarD.e();
    }

    @Override // I2.t
    public I2.m c(java.util.List list) {
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new J2.g(this, list).a();
    }

    public I2.m f(java.util.UUID uuid) {
        R2.a aVarB = R2.a.b(uuid, this);
        this.f5684d.b(aVarB);
        return aVarB.e();
    }

    public java.util.List g(android.content.Context context, androidx.work.a aVar, S2.a aVar2) {
        return java.util.Arrays.asList(J2.f.a(context, this), new K2.b(context, aVar, aVar2, this));
    }

    public android.content.Context h() {
        return this.f5681a;
    }

    public androidx.work.a i() {
        return this.f5682b;
    }

    public R2.h l() {
        return this.f5687g;
    }

    public J2.d m() {
        return this.f5686f;
    }

    public java.util.List n() {
        return this.f5685e;
    }

    public androidx.work.impl.WorkDatabase o() {
        return this.f5683c;
    }

    public S2.a p() {
        return this.f5684d;
    }

    public void r() {
        synchronized (f5680m) {
            try {
                this.f5688h = true;
                android.content.BroadcastReceiver.PendingResult pendingResult = this.f5689i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f5689i = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void s() {
        L2.l.b(h());
        o().Y().u();
        J2.f.b(i(), o(), n());
    }

    public void t(android.content.BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f5680m) {
            try {
                this.f5689i = pendingResult;
                if (this.f5688h) {
                    pendingResult.finish();
                    this.f5689i = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void u(java.lang.String str) {
        v(str, null);
    }

    public void v(java.lang.String str, androidx.work.WorkerParameters.a aVar) {
        this.f5684d.b(new R2.l(this, str, aVar));
    }

    public void w(java.lang.String str) {
        this.f5684d.b(new R2.m(this, str, true));
    }

    public void x(java.lang.String str) {
        this.f5684d.b(new R2.m(this, str, false));
    }
}
