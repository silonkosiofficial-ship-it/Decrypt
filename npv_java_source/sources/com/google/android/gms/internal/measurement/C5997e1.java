package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5997e1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile com.google.android.gms.internal.measurement.C5997e1 f40858j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f40859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final V3.f f40860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.ExecutorService f40861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p075h4.a f40862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f40863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f40865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.lang.String f40866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile com.google.android.gms.internal.measurement.P0 f40867i;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e1$a */
    abstract class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final long f40868C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final long f40869D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final boolean f40870E;

        a(com.google.android.gms.internal.measurement.C5997e1 c5997e1) {
            this(true);
        }

        a(boolean z6) {
            this.f40868C = com.google.android.gms.internal.measurement.C5997e1.this.f40860b.a();
            this.f40869D = com.google.android.gms.internal.measurement.C5997e1.this.f40860b.c();
            this.f40870E = z6;
        }

        abstract void a();

        protected void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.google.android.gms.internal.measurement.C5997e1.this.f40865g) {
                b();
                return;
            }
            try {
                a();
            } catch (java.lang.Exception e6) {
                com.google.android.gms.internal.measurement.C5997e1.this.r(e6, false, this.f40870E);
                b();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e1$b */
    static class b extends com.google.android.gms.internal.measurement.Y0 {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final p085i4.t f40872C;

        b(p085i4.t tVar) {
            this.f40872C = tVar;
        }

        @Override // com.google.android.gms.internal.measurement.V0
        public final int a() {
            return java.lang.System.identityHashCode(this.f40872C);
        }

        @Override // com.google.android.gms.internal.measurement.V0
        public final void d4(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j6) {
            this.f40872C.a(str, str2, bundle, j6);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e1$c */
    class c implements android.app.Application.ActivityLifecycleCallbacks {
        c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            com.google.android.gms.internal.measurement.C5997e1.this.m(new com.google.android.gms.internal.measurement.B1(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(android.app.Activity activity) {
            com.google.android.gms.internal.measurement.C5997e1.this.m(new com.google.android.gms.internal.measurement.G1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(android.app.Activity activity) {
            com.google.android.gms.internal.measurement.C5997e1.this.m(new com.google.android.gms.internal.measurement.F1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(android.app.Activity activity) {
            com.google.android.gms.internal.measurement.C5997e1.this.m(new com.google.android.gms.internal.measurement.C1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
            com.google.android.gms.internal.measurement.Q0 q6 = new com.google.android.gms.internal.measurement.Q0();
            com.google.android.gms.internal.measurement.C5997e1.this.m(new com.google.android.gms.internal.measurement.H1(this, activity, q6));
            android.os.Bundle bundleY0 = q6.y0(50L);
            if (bundleY0 != null) {
                bundle.putAll(bundleY0);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(android.app.Activity activity) {
            com.google.android.gms.internal.measurement.C5997e1.this.m(new com.google.android.gms.internal.measurement.D1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(android.app.Activity activity) {
            com.google.android.gms.internal.measurement.C5997e1.this.m(new com.google.android.gms.internal.measurement.E1(this, activity));
        }
    }

    private C5997e1(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        this.f40859a = (str == null || !E(str2, str3)) ? "FA" : str;
        this.f40860b = V3.i.d();
        this.f40861c = com.google.android.gms.internal.measurement.I0.a().a(new com.google.android.gms.internal.measurement.ThreadFactoryC6069m1(this), 1);
        this.f40862d = new p075h4.a(this);
        this.f40863e = new java.util.ArrayList();
        if (B(context) && !K()) {
            this.f40866h = null;
            this.f40865g = true;
            java.lang.String str4 = this.f40859a;
            return;
        }
        if (E(str2, str3)) {
            this.f40866h = str2;
        } else {
            this.f40866h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    java.lang.String str5 = this.f40859a;
                }
            } else {
                java.lang.String str6 = this.f40859a;
            }
        }
        m(new com.google.android.gms.internal.measurement.C5988d1(this, str2, str3, context, bundle));
        android.app.Application application = (android.app.Application) context.getApplicationContext();
        if (application == null) {
            java.lang.String str7 = this.f40859a;
        } else {
            application.registerActivityLifecycleCallbacks(new com.google.android.gms.internal.measurement.C5997e1.c());
        }
    }

    private static boolean B(android.content.Context context) {
        try {
            return new p085i4.n(context, p085i4.n.a(context)).b("google_app_id") != null;
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E(java.lang.String str, java.lang.String str2) {
        return (str2 == null || str == null || K()) ? false : true;
    }

    private final boolean K() {
        try {
            java.lang.Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public static com.google.android.gms.internal.measurement.C5997e1 f(android.content.Context context) {
        return g(context, null, null, null, null);
    }

    public static com.google.android.gms.internal.measurement.C5997e1 g(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        Q3.AbstractC1477p.l(context);
        if (f40858j == null) {
            synchronized (com.google.android.gms.internal.measurement.C5997e1.class) {
                try {
                    if (f40858j == null) {
                        f40858j = new com.google.android.gms.internal.measurement.C5997e1(context, str, str2, str3, bundle);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return f40858j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(com.google.android.gms.internal.measurement.C5997e1.a aVar) {
        this.f40861c.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(java.lang.Exception exc, boolean z6, boolean z10) {
        this.f40865g |= z6;
        if (z6) {
            java.lang.String str = this.f40859a;
            return;
        }
        if (z10) {
            j(5, "Error with data collection. Data lost.", exc, null, null);
        }
        java.lang.String str2 = this.f40859a;
    }

    private final void t(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z6, boolean z10, java.lang.Long l6) {
        m(new com.google.android.gms.internal.measurement.A1(this, l6, str, str2, bundle, z6, z10));
    }

    public final void A(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        t(str, str2, bundle, true, true, null);
    }

    public final void C(java.lang.String str) {
        m(new com.google.android.gms.internal.measurement.C6078n1(this, str));
    }

    public final java.lang.String F() {
        return this.f40866h;
    }

    public final java.lang.String G() {
        com.google.android.gms.internal.measurement.Q0 q6 = new com.google.android.gms.internal.measurement.Q0();
        m(new com.google.android.gms.internal.measurement.C6096p1(this, q6));
        return q6.d2(50L);
    }

    public final java.lang.String H() {
        com.google.android.gms.internal.measurement.Q0 q6 = new com.google.android.gms.internal.measurement.Q0();
        m(new com.google.android.gms.internal.measurement.C6135u1(this, q6));
        return q6.d2(500L);
    }

    public final java.lang.String I() {
        com.google.android.gms.internal.measurement.Q0 q6 = new com.google.android.gms.internal.measurement.Q0();
        m(new com.google.android.gms.internal.measurement.C6111r1(this, q6));
        return q6.d2(500L);
    }

    public final java.lang.String J() {
        com.google.android.gms.internal.measurement.Q0 q6 = new com.google.android.gms.internal.measurement.Q0();
        m(new com.google.android.gms.internal.measurement.C6104q1(this, q6));
        return q6.d2(500L);
    }

    public final int a(java.lang.String str) {
        com.google.android.gms.internal.measurement.Q0 q6 = new com.google.android.gms.internal.measurement.Q0();
        m(new com.google.android.gms.internal.measurement.C6151w1(this, str, q6));
        java.lang.Integer num = (java.lang.Integer) com.google.android.gms.internal.measurement.Q0.L0(q6.y0(10000L), java.lang.Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long b() {
        com.google.android.gms.internal.measurement.Q0 q6 = new com.google.android.gms.internal.measurement.Q0();
        m(new com.google.android.gms.internal.measurement.C6119s1(this, q6));
        java.lang.Long lC2 = q6.c2(500L);
        if (lC2 != null) {
            return lC2.longValue();
        }
        long jNextLong = new java.util.Random(java.lang.System.nanoTime() ^ this.f40860b.a()).nextLong();
        int i6 = this.f40864f + 1;
        this.f40864f = i6;
        return jNextLong + ((long) i6);
    }

    public final android.os.Bundle c(android.os.Bundle bundle, boolean z6) {
        com.google.android.gms.internal.measurement.Q0 q6 = new com.google.android.gms.internal.measurement.Q0();
        m(new com.google.android.gms.internal.measurement.C6159x1(this, bundle, q6));
        if (z6) {
            return q6.y0(5000L);
        }
        return null;
    }

    protected final com.google.android.gms.internal.measurement.P0 d(android.content.Context context, boolean z6) {
        try {
            return com.google.android.gms.internal.measurement.S0.asInterface(com.google.android.gms.dynamite.DynamiteModule.e(context, com.google.android.gms.dynamite.DynamiteModule.f24970e, "com.google.android.gms.measurement.dynamite").d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (com.google.android.gms.dynamite.DynamiteModule.a e6) {
            r(e6, true, false);
            return null;
        }
    }

    public final java.util.List h(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.measurement.Q0 q6 = new com.google.android.gms.internal.measurement.Q0();
        m(new com.google.android.gms.internal.measurement.C6033i1(this, str, str2, q6));
        java.util.List list = (java.util.List) com.google.android.gms.internal.measurement.Q0.L0(q6.y0(5000L), java.util.List.class);
        return list == null ? java.util.Collections.emptyList() : list;
    }

    public final java.util.Map i(java.lang.String str, java.lang.String str2, boolean z6) {
        com.google.android.gms.internal.measurement.Q0 q6 = new com.google.android.gms.internal.measurement.Q0();
        m(new com.google.android.gms.internal.measurement.C6127t1(this, str, str2, z6, q6));
        android.os.Bundle bundleY0 = q6.y0(5000L);
        if (bundleY0 == null || bundleY0.size() == 0) {
            return java.util.Collections.emptyMap();
        }
        java.util.HashMap map = new java.util.HashMap(bundleY0.size());
        for (java.lang.String str3 : bundleY0.keySet()) {
            java.lang.Object obj = bundleY0.get(str3);
            if ((obj instanceof java.lang.Double) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void j(int i6, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        m(new com.google.android.gms.internal.measurement.C6143v1(this, false, 5, str, obj, null, null));
    }

    public final void k(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        m(new com.google.android.gms.internal.measurement.C6051k1(this, activity, str, str2));
    }

    public final void l(android.os.Bundle bundle) {
        m(new com.google.android.gms.internal.measurement.C6006f1(this, bundle));
    }

    public final void q(p085i4.t tVar) {
        Q3.AbstractC1477p.l(tVar);
        synchronized (this.f40863e) {
            for (int i6 = 0; i6 < this.f40863e.size(); i6++) {
                try {
                    if (tVar.equals(((android.util.Pair) this.f40863e.get(i6)).first)) {
                        java.lang.String str = this.f40859a;
                        return;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            com.google.android.gms.internal.measurement.C5997e1.b bVar = new com.google.android.gms.internal.measurement.C5997e1.b(tVar);
            this.f40863e.add(new android.util.Pair(tVar, bVar));
            if (this.f40867i != null) {
                try {
                    this.f40867i.registerOnMeasurementEventListener(bVar);
                    return;
                } catch (android.os.BadParcelableException | android.os.NetworkOnMainThreadException | android.os.RemoteException | java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.lang.NullPointerException | java.lang.SecurityException | java.lang.UnsupportedOperationException unused) {
                    java.lang.String str2 = this.f40859a;
                }
            }
            m(new com.google.android.gms.internal.measurement.C6175z1(this, bVar));
        }
    }

    public final void s(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        m(new com.google.android.gms.internal.measurement.C6042j1(this, str, str2, bundle));
    }

    public final void u(java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z6) {
        m(new com.google.android.gms.internal.measurement.C6024h1(this, str, str2, obj, z6));
    }

    public final p075h4.a w() {
        return this.f40862d;
    }

    public final void y(android.os.Bundle bundle) {
        m(new com.google.android.gms.internal.measurement.C6060l1(this, bundle));
    }

    public final void z(java.lang.String str) {
        m(new com.google.android.gms.internal.measurement.C6087o1(this, str));
    }
}
