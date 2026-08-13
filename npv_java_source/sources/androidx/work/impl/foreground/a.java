package androidx.work.impl.foreground;

/* JADX INFO: loaded from: classes.dex */
public class a implements M2.c, J2.b {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    static final java.lang.String f23933M = I2.j.f("SystemFgDispatcher");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.content.Context f23934C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private J2.j f23935D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final S2.a f23936E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final java.lang.Object f23937F = new java.lang.Object();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    java.lang.String f23938G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final java.util.Map f23939H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final java.util.Map f23940I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    final java.util.Set f23941J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    final M2.d f23942K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private androidx.work.impl.foreground.a.b f23943L;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    class RunnableC0455a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.WorkDatabase f23944C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.String f23945D;

        RunnableC0455a(androidx.work.impl.WorkDatabase workDatabase, java.lang.String str) {
            this.f23944C = workDatabase;
            this.f23945D = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Q2.p pVarN = this.f23944C.Y().n(this.f23945D);
            if (pVarN == null || !pVarN.b()) {
                return;
            }
            synchronized (androidx.work.impl.foreground.a.this.f23937F) {
                androidx.work.impl.foreground.a.this.f23940I.put(this.f23945D, pVarN);
                androidx.work.impl.foreground.a.this.f23941J.add(pVarN);
                androidx.work.impl.foreground.a aVar = androidx.work.impl.foreground.a.this;
                aVar.f23942K.d(aVar.f23941J);
            }
        }
    }

    interface b {
        void c(int i6, int i10, android.app.Notification notification);

        void d(int i6, android.app.Notification notification);

        void e(int i6);

        void stop();
    }

    a(android.content.Context context) {
        this.f23934C = context;
        J2.j jVarK = J2.j.k(context);
        this.f23935D = jVarK;
        S2.a aVarP = jVarK.p();
        this.f23936E = aVarP;
        this.f23938G = null;
        this.f23939H = new java.util.LinkedHashMap();
        this.f23941J = new java.util.HashSet();
        this.f23940I = new java.util.HashMap();
        this.f23942K = new M2.d(this.f23934C, aVarP, this);
        this.f23935D.m().d(this);
    }

    public static android.content.Intent a(android.content.Context context, java.lang.String str, I2.e eVar) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static android.content.Intent d(android.content.Context context, java.lang.String str, I2.e eVar) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static android.content.Intent e(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void g(android.content.Intent intent) {
        I2.j.c().d(f23933M, java.lang.String.format("Stopping foreground work for %s", intent), new java.lang.Throwable[0]);
        java.lang.String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || android.text.TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f23935D.f(java.util.UUID.fromString(stringExtra));
    }

    private void h(android.content.Intent intent) {
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        java.lang.String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        android.app.Notification notification = (android.app.Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        I2.j.c().a(f23933M, java.lang.String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", java.lang.Integer.valueOf(intExtra), stringExtra, java.lang.Integer.valueOf(intExtra2)), new java.lang.Throwable[0]);
        if (notification == null || this.f23943L == null) {
            return;
        }
        this.f23939H.put(stringExtra, new I2.e(intExtra, notification, intExtra2));
        if (android.text.TextUtils.isEmpty(this.f23938G)) {
            this.f23938G = stringExtra;
            this.f23943L.c(intExtra, intExtra2, notification);
            return;
        }
        this.f23943L.d(intExtra, notification);
        if (intExtra2 == 0 || android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        java.util.Iterator it = this.f23939H.entrySet().iterator();
        while (it.hasNext()) {
            iA |= ((I2.e) ((java.util.Map.Entry) it.next()).getValue()).a();
        }
        I2.e eVar = (I2.e) this.f23939H.get(this.f23938G);
        if (eVar != null) {
            this.f23943L.c(eVar.c(), iA, eVar.b());
        }
    }

    private void i(android.content.Intent intent) {
        I2.j.c().d(f23933M, java.lang.String.format("Started foreground service %s", intent), new java.lang.Throwable[0]);
        this.f23936E.b(new androidx.work.impl.foreground.a.RunnableC0455a(this.f23935D.o(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // M2.c
    public void b(java.util.List list) {
        if (list.isEmpty()) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            I2.j.c().a(f23933M, java.lang.String.format("Constraints unmet for WorkSpec %s", str), new java.lang.Throwable[0]);
            this.f23935D.w(str);
        }
    }

    @Override // J2.b
    public void c(java.lang.String str, boolean z6) {
        java.util.Map.Entry entry;
        synchronized (this.f23937F) {
            try {
                Q2.p pVar = (Q2.p) this.f23940I.remove(str);
                if (pVar != null ? this.f23941J.remove(pVar) : false) {
                    this.f23942K.d(this.f23941J);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        I2.e eVar = (I2.e) this.f23939H.remove(str);
        if (str.equals(this.f23938G) && this.f23939H.size() > 0) {
            java.util.Iterator it = this.f23939H.entrySet().iterator();
            do {
                entry = (java.util.Map.Entry) it.next();
            } while (it.hasNext());
            this.f23938G = (java.lang.String) entry.getKey();
            if (this.f23943L != null) {
                I2.e eVar2 = (I2.e) entry.getValue();
                this.f23943L.c(eVar2.c(), eVar2.a(), eVar2.b());
                this.f23943L.e(eVar2.c());
            }
        }
        androidx.work.impl.foreground.a.b bVar = this.f23943L;
        if (eVar == null || bVar == null) {
            return;
        }
        I2.j.c().a(f23933M, java.lang.String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", java.lang.Integer.valueOf(eVar.c()), str, java.lang.Integer.valueOf(eVar.a())), new java.lang.Throwable[0]);
        bVar.e(eVar.c());
    }

    @Override // M2.c
    public void f(java.util.List list) {
    }

    void j(android.content.Intent intent) {
        I2.j.c().d(f23933M, "Stopping foreground service", new java.lang.Throwable[0]);
        androidx.work.impl.foreground.a.b bVar = this.f23943L;
        if (bVar != null) {
            bVar.stop();
        }
    }

    void k() {
        this.f23943L = null;
        synchronized (this.f23937F) {
            this.f23942K.e();
        }
        this.f23935D.m().i(this);
    }

    void l(android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                g(intent);
                return;
            } else {
                if ("ACTION_STOP_FOREGROUND".equals(action)) {
                    j(intent);
                    return;
                }
                return;
            }
        }
        h(intent);
    }

    void m(androidx.work.impl.foreground.a.b bVar) {
        if (this.f23943L != null) {
            I2.j.c().b(f23933M, "A callback already exists.", new java.lang.Throwable[0]);
        } else {
            this.f23943L = bVar;
        }
    }
}
