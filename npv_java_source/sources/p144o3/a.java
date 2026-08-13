package p144o3;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    N3.ServiceConnectionC1388a f52536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Z3.f f52537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f52538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final java.lang.Object f52539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    p144o3.c f52540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final android.content.Context f52541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f52542g;

    /* JADX INFO: renamed from: o3.a$a, reason: collision with other inner class name */
    public static final class C0676a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f52543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f52544b;

        public C0676a(java.lang.String str, boolean z6) {
            this.f52543a = str;
            this.f52544b = z6;
        }

        public java.lang.String a() {
            return this.f52543a;
        }

        public boolean b() {
            return this.f52544b;
        }

        public java.lang.String toString() {
            java.lang.String str = this.f52543a;
            boolean z6 = this.f52544b;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z6);
            return sb.toString();
        }
    }

    public a(android.content.Context context) {
        this(context, 30000L, false, false);
    }

    public a(android.content.Context context, long j6, boolean z6, boolean z10) {
        android.content.Context applicationContext;
        this.f52539d = new java.lang.Object();
        Q3.AbstractC1477p.l(context);
        if (z6 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f52541f = context;
        this.f52538c = false;
        this.f52542g = j6;
    }

    public static p144o3.a.C0676a a(android.content.Context context) {
        p144o3.a aVar = new p144o3.a(context, -1L, true, false);
        try {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            aVar.g(false);
            p144o3.a.C0676a c0676aI = aVar.i(-1);
            aVar.h(c0676aI, true, 0.0f, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            aVar.f();
            return c0676aI;
        } catch (java.lang.Throwable th) {
            try {
                aVar.h(null, true, 0.0f, -1L, "", th);
                throw th;
            } catch (java.lang.Throwable th2) {
                aVar.f();
                throw th2;
            }
        }
    }

    public static boolean c(android.content.Context context) {
        boolean zF;
        p144o3.a aVar = new p144o3.a(context, -1L, false, false);
        try {
            aVar.g(false);
            Q3.AbstractC1477p.k("Calling this from your main thread can lead to deadlock");
            synchronized (aVar) {
                try {
                    if (!aVar.f52538c) {
                        synchronized (aVar.f52539d) {
                            p144o3.c cVar = aVar.f52540e;
                            if (cVar == null || !cVar.f52549F) {
                                throw new java.io.IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            aVar.g(false);
                            if (!aVar.f52538c) {
                                throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (java.lang.Exception e6) {
                            throw new java.io.IOException("AdvertisingIdClient cannot reconnect.", e6);
                        }
                    }
                    Q3.AbstractC1477p.l(aVar.f52536a);
                    Q3.AbstractC1477p.l(aVar.f52537b);
                    try {
                        zF = aVar.f52537b.f();
                    } catch (android.os.RemoteException e10) {
                        throw new java.io.IOException("Remote exception");
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            aVar.j();
            aVar.f();
            return zF;
        } catch (java.lang.Throwable th2) {
            aVar.f();
            throw th2;
        }
    }

    public static void d(boolean z6) {
    }

    private final p144o3.a.C0676a i(int i6) {
        p144o3.a.C0676a c0676a;
        Q3.AbstractC1477p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f52538c) {
                    synchronized (this.f52539d) {
                        p144o3.c cVar = this.f52540e;
                        if (cVar == null || !cVar.f52549F) {
                            throw new java.io.IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        g(false);
                        if (!this.f52538c) {
                            throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (java.lang.Exception e6) {
                        throw new java.io.IOException("AdvertisingIdClient cannot reconnect.", e6);
                    }
                }
                Q3.AbstractC1477p.l(this.f52536a);
                Q3.AbstractC1477p.l(this.f52537b);
                try {
                    c0676a = new p144o3.a.C0676a(this.f52537b.c(), this.f52537b.y1(true));
                } catch (android.os.RemoteException e10) {
                    throw new java.io.IOException("Remote exception");
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        j();
        return c0676a;
    }

    private final void j() {
        synchronized (this.f52539d) {
            p144o3.c cVar = this.f52540e;
            if (cVar != null) {
                cVar.f52548E.countDown();
                try {
                    this.f52540e.join();
                } catch (java.lang.InterruptedException unused) {
                }
            }
            long j6 = this.f52542g;
            if (j6 > 0) {
                this.f52540e = new p144o3.c(this, j6);
            }
        }
    }

    public p144o3.a.C0676a b() {
        return i(-1);
    }

    public void e() {
        g(true);
    }

    public final void f() {
        Q3.AbstractC1477p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f52541f == null || this.f52536a == null) {
                    return;
                }
                try {
                    if (this.f52538c) {
                        U3.b.b().c(this.f52541f, this.f52536a);
                    }
                } catch (java.lang.Throwable th) {
                }
                this.f52538c = false;
                this.f52537b = null;
                this.f52536a = null;
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void finalize() throws java.lang.Throwable {
        f();
        super.finalize();
    }

    protected final void g(boolean z6) {
        Q3.AbstractC1477p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f52538c) {
                    f();
                }
                android.content.Context context = this.f52541f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iH = N3.C1395h.f().h(context, 12451000);
                    if (iH != 0 && iH != 2) {
                        throw new java.io.IOException("Google Play services not available");
                    }
                    N3.ServiceConnectionC1388a serviceConnectionC1388a = new N3.ServiceConnectionC1388a();
                    android.content.Intent intent = new android.content.Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!U3.b.b().a(context, intent, serviceConnectionC1388a, 1)) {
                            throw new java.io.IOException("Connection failure");
                        }
                        this.f52536a = serviceConnectionC1388a;
                        try {
                            this.f52537b = Z3.e.q0(serviceConnectionC1388a.a(10000L, java.util.concurrent.TimeUnit.MILLISECONDS));
                            this.f52538c = true;
                            if (z6) {
                                j();
                            }
                        } catch (java.lang.InterruptedException unused) {
                            throw new java.io.IOException("Interrupted exception");
                        } catch (java.lang.Throwable th) {
                            throw new java.io.IOException(th);
                        }
                    } catch (java.lang.Throwable th2) {
                        throw new java.io.IOException(th2);
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                    throw new N3.C1396i(9);
                }
            } catch (java.lang.Throwable th3) {
                throw th3;
            }
        }
    }

    final boolean h(p144o3.a.C0676a c0676a, boolean z6, float f6, long j6, java.lang.String str, java.lang.Throwable th) {
        if (java.lang.Math.random() > 0.0d) {
            return false;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put("app_context", "1");
        if (c0676a != null) {
            map.put("limit_ad_tracking", true != c0676a.b() ? "0" : "1");
            java.lang.String strA = c0676a.a();
            if (strA != null) {
                map.put("ad_id_size", java.lang.Integer.toString(strA.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", java.lang.Long.toString(j6));
        new p144o3.b(this, map).start();
        return true;
    }
}
