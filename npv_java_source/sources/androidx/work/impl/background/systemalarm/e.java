package androidx.work.impl.background.systemalarm;

/* JADX INFO: loaded from: classes.dex */
public class e implements J2.b {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    static final java.lang.String f23898M = I2.j.f("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final android.content.Context f23899C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final S2.a f23900D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final R2.r f23901E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final J2.d f23902F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final J2.j f23903G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f23904H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final android.os.Handler f23905I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    final java.util.List f23906J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    android.content.Intent f23907K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private androidx.work.impl.background.systemalarm.e.c f23908L;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.work.impl.background.systemalarm.e eVar;
            androidx.work.impl.background.systemalarm.e.d dVar;
            synchronized (androidx.work.impl.background.systemalarm.e.this.f23906J) {
                androidx.work.impl.background.systemalarm.e eVar2 = androidx.work.impl.background.systemalarm.e.this;
                eVar2.f23907K = (android.content.Intent) eVar2.f23906J.get(0);
            }
            android.content.Intent intent = androidx.work.impl.background.systemalarm.e.this.f23907K;
            if (intent != null) {
                java.lang.String action = intent.getAction();
                int intExtra = androidx.work.impl.background.systemalarm.e.this.f23907K.getIntExtra("KEY_START_ID", 0);
                I2.j jVarC = I2.j.c();
                java.lang.String str = androidx.work.impl.background.systemalarm.e.f23898M;
                jVarC.a(str, java.lang.String.format("Processing command %s, %s", androidx.work.impl.background.systemalarm.e.this.f23907K, java.lang.Integer.valueOf(intExtra)), new java.lang.Throwable[0]);
                android.os.PowerManager.WakeLock wakeLockB = R2.n.b(androidx.work.impl.background.systemalarm.e.this.f23899C, java.lang.String.format("%s (%s)", action, java.lang.Integer.valueOf(intExtra)));
                try {
                    I2.j.c().a(str, java.lang.String.format("Acquiring operation wake lock (%s) %s", action, wakeLockB), new java.lang.Throwable[0]);
                    wakeLockB.acquire();
                    androidx.work.impl.background.systemalarm.e eVar3 = androidx.work.impl.background.systemalarm.e.this;
                    eVar3.f23904H.o(eVar3.f23907K, intExtra, eVar3);
                    I2.j.c().a(str, java.lang.String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new java.lang.Throwable[0]);
                    wakeLockB.release();
                    eVar = androidx.work.impl.background.systemalarm.e.this;
                    dVar = new androidx.work.impl.background.systemalarm.e.d(eVar);
                } catch (java.lang.Throwable th) {
                    try {
                        I2.j jVarC2 = I2.j.c();
                        java.lang.String str2 = androidx.work.impl.background.systemalarm.e.f23898M;
                        jVarC2.b(str2, "Unexpected error in onHandleIntent", th);
                        I2.j.c().a(str2, java.lang.String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new java.lang.Throwable[0]);
                        wakeLockB.release();
                        eVar = androidx.work.impl.background.systemalarm.e.this;
                        dVar = new androidx.work.impl.background.systemalarm.e.d(eVar);
                    } catch (java.lang.Throwable th2) {
                        I2.j.c().a(androidx.work.impl.background.systemalarm.e.f23898M, java.lang.String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new java.lang.Throwable[0]);
                        wakeLockB.release();
                        androidx.work.impl.background.systemalarm.e eVar4 = androidx.work.impl.background.systemalarm.e.this;
                        eVar4.k(new androidx.work.impl.background.systemalarm.e.d(eVar4));
                        throw th2;
                    }
                }
                eVar.k(dVar);
            }
        }
    }

    static class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final androidx.work.impl.background.systemalarm.e f23910C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final android.content.Intent f23911D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final int f23912E;

        b(androidx.work.impl.background.systemalarm.e eVar, android.content.Intent intent, int i6) {
            this.f23910C = eVar;
            this.f23911D = intent;
            this.f23912E = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23910C.a(this.f23911D, this.f23912E);
        }
    }

    interface c {
        void a();
    }

    static class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final androidx.work.impl.background.systemalarm.e f23913C;

        d(androidx.work.impl.background.systemalarm.e eVar) {
            this.f23913C = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23913C.d();
        }
    }

    e(android.content.Context context) {
        this(context, null, null);
    }

    e(android.content.Context context, J2.d dVar, J2.j jVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f23899C = applicationContext;
        this.f23904H = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.f23901E = new R2.r();
        jVar = jVar == null ? J2.j.k(context) : jVar;
        this.f23903G = jVar;
        dVar = dVar == null ? jVar.m() : dVar;
        this.f23902F = dVar;
        this.f23900D = jVar.p();
        dVar.d(this);
        this.f23906J = new java.util.ArrayList();
        this.f23907K = null;
        this.f23905I = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    private void b() {
        if (this.f23905I.getLooper().getThread() != java.lang.Thread.currentThread()) {
            throw new java.lang.IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(java.lang.String str) {
        b();
        synchronized (this.f23906J) {
            try {
                java.util.Iterator it = this.f23906J.iterator();
                while (it.hasNext()) {
                    if (str.equals(((android.content.Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        b();
        android.os.PowerManager.WakeLock wakeLockB = R2.n.b(this.f23899C, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.f23903G.p().b(new androidx.work.impl.background.systemalarm.e.a());
        } finally {
            wakeLockB.release();
        }
    }

    public boolean a(android.content.Intent intent, int i6) {
        I2.j jVarC = I2.j.c();
        java.lang.String str = f23898M;
        jVarC.a(str, java.lang.String.format("Adding command %s (%s)", intent, java.lang.Integer.valueOf(i6)), new java.lang.Throwable[0]);
        b();
        java.lang.String action = intent.getAction();
        if (android.text.TextUtils.isEmpty(action)) {
            I2.j.c().h(str, "Unknown command. Ignoring", new java.lang.Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i6);
        synchronized (this.f23906J) {
            try {
                boolean z6 = !this.f23906J.isEmpty();
                this.f23906J.add(intent);
                if (!z6) {
                    l();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // J2.b
    public void c(java.lang.String str, boolean z6) {
        k(new androidx.work.impl.background.systemalarm.e.b(this, androidx.work.impl.background.systemalarm.b.d(this.f23899C, str, z6), 0));
    }

    void d() {
        I2.j jVarC = I2.j.c();
        java.lang.String str = f23898M;
        jVarC.a(str, "Checking if commands are complete.", new java.lang.Throwable[0]);
        b();
        synchronized (this.f23906J) {
            try {
                if (this.f23907K != null) {
                    I2.j.c().a(str, java.lang.String.format("Removing command %s", this.f23907K), new java.lang.Throwable[0]);
                    if (!((android.content.Intent) this.f23906J.remove(0)).equals(this.f23907K)) {
                        throw new java.lang.IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f23907K = null;
                }
                R2.k kVarC = this.f23900D.c();
                if (!this.f23904H.n() && this.f23906J.isEmpty() && !kVarC.b()) {
                    I2.j.c().a(str, "No more commands & intents.", new java.lang.Throwable[0]);
                    androidx.work.impl.background.systemalarm.e.c cVar = this.f23908L;
                    if (cVar != null) {
                        cVar.a();
                    }
                } else if (!this.f23906J.isEmpty()) {
                    l();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    J2.d e() {
        return this.f23902F;
    }

    S2.a f() {
        return this.f23900D;
    }

    J2.j g() {
        return this.f23903G;
    }

    R2.r h() {
        return this.f23901E;
    }

    void j() {
        I2.j.c().a(f23898M, "Destroying SystemAlarmDispatcher", new java.lang.Throwable[0]);
        this.f23902F.i(this);
        this.f23901E.a();
        this.f23908L = null;
    }

    void k(java.lang.Runnable runnable) {
        this.f23905I.post(runnable);
    }

    void m(androidx.work.impl.background.systemalarm.e.c cVar) {
        if (this.f23908L != null) {
            I2.j.c().b(f23898M, "A completion listener for SystemAlarmDispatcher already exists.", new java.lang.Throwable[0]);
        } else {
            this.f23908L = cVar;
        }
    }
}
