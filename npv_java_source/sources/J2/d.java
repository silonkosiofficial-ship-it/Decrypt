package J2;

/* JADX INFO: loaded from: classes.dex */
public class d implements J2.b, P2.a {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final java.lang.String f5649N = I2.j.f("Processor");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.content.Context f5651D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private androidx.work.a f5652E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private S2.a f5653F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private androidx.work.impl.WorkDatabase f5654G;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private java.util.List f5657J;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.util.Map f5656I = new java.util.HashMap();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private java.util.Map f5655H = new java.util.HashMap();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.util.Set f5658K = new java.util.HashSet();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final java.util.List f5659L = new java.util.ArrayList();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.os.PowerManager.WakeLock f5650C = null;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final java.lang.Object f5660M = new java.lang.Object();

    private static class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private J2.b f5661C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private java.lang.String f5662D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private P4.d f5663E;

        a(J2.b bVar, java.lang.String str, P4.d dVar) {
            this.f5661C = bVar;
            this.f5662D = str;
            this.f5663E = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((java.lang.Boolean) this.f5663E.get()).booleanValue();
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f5661C.c(this.f5662D, zBooleanValue);
        }
    }

    public d(android.content.Context context, androidx.work.a aVar, S2.a aVar2, androidx.work.impl.WorkDatabase workDatabase, java.util.List list) {
        this.f5651D = context;
        this.f5652E = aVar;
        this.f5653F = aVar2;
        this.f5654G = workDatabase;
        this.f5657J = list;
    }

    private static boolean e(java.lang.String str, J2.k kVar) {
        if (kVar == null) {
            I2.j.c().a(f5649N, java.lang.String.format("WorkerWrapper could not be found for %s", str), new java.lang.Throwable[0]);
            return false;
        }
        kVar.d();
        I2.j.c().a(f5649N, java.lang.String.format("WorkerWrapper interrupted for %s", str), new java.lang.Throwable[0]);
        return true;
    }

    private void m() {
        synchronized (this.f5660M) {
            try {
                if (!(!this.f5655H.isEmpty())) {
                    try {
                        this.f5651D.startService(androidx.work.impl.foreground.a.e(this.f5651D));
                    } catch (java.lang.Throwable th) {
                        I2.j.c().b(f5649N, "Unable to stop foreground service", th);
                    }
                    android.os.PowerManager.WakeLock wakeLock = this.f5650C;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f5650C = null;
                    }
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // P2.a
    public void a(java.lang.String str, I2.e eVar) {
        synchronized (this.f5660M) {
            try {
                I2.j.c().d(f5649N, java.lang.String.format("Moving WorkSpec (%s) to the foreground", str), new java.lang.Throwable[0]);
                J2.k kVar = (J2.k) this.f5656I.remove(str);
                if (kVar != null) {
                    if (this.f5650C == null) {
                        android.os.PowerManager.WakeLock wakeLockB = R2.n.b(this.f5651D, "ProcessorForegroundLck");
                        this.f5650C = wakeLockB;
                        wakeLockB.acquire();
                    }
                    this.f5655H.put(str, kVar);
                    androidx.core.content.a.k(this.f5651D, androidx.work.impl.foreground.a.d(this.f5651D, str, eVar));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // P2.a
    public void b(java.lang.String str) {
        synchronized (this.f5660M) {
            this.f5655H.remove(str);
            m();
        }
    }

    @Override // J2.b
    public void c(java.lang.String str, boolean z6) {
        synchronized (this.f5660M) {
            try {
                this.f5656I.remove(str);
                I2.j.c().a(f5649N, java.lang.String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, java.lang.Boolean.valueOf(z6)), new java.lang.Throwable[0]);
                java.util.Iterator it = this.f5659L.iterator();
                while (it.hasNext()) {
                    ((J2.b) it.next()).c(str, z6);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void d(J2.b bVar) {
        synchronized (this.f5660M) {
            this.f5659L.add(bVar);
        }
    }

    public boolean f(java.lang.String str) {
        boolean zContains;
        synchronized (this.f5660M) {
            zContains = this.f5658K.contains(str);
        }
        return zContains;
    }

    public boolean g(java.lang.String str) {
        boolean z6;
        synchronized (this.f5660M) {
            try {
                z6 = this.f5656I.containsKey(str) || this.f5655H.containsKey(str);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    public boolean h(java.lang.String str) {
        boolean zContainsKey;
        synchronized (this.f5660M) {
            zContainsKey = this.f5655H.containsKey(str);
        }
        return zContainsKey;
    }

    public void i(J2.b bVar) {
        synchronized (this.f5660M) {
            this.f5659L.remove(bVar);
        }
    }

    public boolean j(java.lang.String str) {
        return k(str, null);
    }

    public boolean k(java.lang.String str, androidx.work.WorkerParameters.a aVar) {
        synchronized (this.f5660M) {
            try {
                if (g(str)) {
                    I2.j.c().a(f5649N, java.lang.String.format("Work %s is already enqueued for processing", str), new java.lang.Throwable[0]);
                    return false;
                }
                J2.k kVarA = new J2.k.c(this.f5651D, this.f5652E, this.f5653F, this, this.f5654G, str).c(this.f5657J).b(aVar).a();
                P4.d dVarB = kVarA.b();
                dVarB.e(new J2.d.a(this, str, dVarB), this.f5653F.a());
                this.f5656I.put(str, kVarA);
                this.f5653F.c().execute(kVarA);
                I2.j.c().a(f5649N, java.lang.String.format("%s: processing %s", getClass().getSimpleName(), str), new java.lang.Throwable[0]);
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public boolean l(java.lang.String str) {
        boolean zE;
        synchronized (this.f5660M) {
            try {
                I2.j.c().a(f5649N, java.lang.String.format("Processor cancelling %s", str), new java.lang.Throwable[0]);
                this.f5658K.add(str);
                J2.k kVar = (J2.k) this.f5655H.remove(str);
                boolean z6 = kVar != null;
                if (kVar == null) {
                    kVar = (J2.k) this.f5656I.remove(str);
                }
                zE = e(str, kVar);
                if (z6) {
                    m();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return zE;
    }

    public boolean n(java.lang.String str) {
        boolean zE;
        synchronized (this.f5660M) {
            I2.j.c().a(f5649N, java.lang.String.format("Processor stopping foreground work %s", str), new java.lang.Throwable[0]);
            zE = e(str, (J2.k) this.f5655H.remove(str));
        }
        return zE;
    }

    public boolean o(java.lang.String str) {
        boolean zE;
        synchronized (this.f5660M) {
            I2.j.c().a(f5649N, java.lang.String.format("Processor stopping background work %s", str), new java.lang.Throwable[0]);
            zE = e(str, (J2.k) this.f5656I.remove(str));
        }
        return zE;
    }
}
