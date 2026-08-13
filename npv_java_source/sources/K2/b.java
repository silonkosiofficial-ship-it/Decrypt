package K2;

/* JADX INFO: loaded from: classes.dex */
public class b implements J2.e, M2.c, J2.b {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final java.lang.String f6085K = I2.j.f("GreedyScheduler");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f6086C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final J2.j f6087D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final M2.d f6088E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private K2.a f6090G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f6091H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    java.lang.Boolean f6093J;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.Set f6089F = new java.util.HashSet();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.lang.Object f6092I = new java.lang.Object();

    public b(android.content.Context context, androidx.work.a aVar, S2.a aVar2, J2.j jVar) {
        this.f6086C = context;
        this.f6087D = jVar;
        this.f6088E = new M2.d(context, aVar2, this);
        this.f6090G = new K2.a(this, aVar.k());
    }

    private void g() {
        this.f6093J = java.lang.Boolean.valueOf(R2.j.b(this.f6086C, this.f6087D.i()));
    }

    private void h() {
        if (this.f6091H) {
            return;
        }
        this.f6087D.m().d(this);
        this.f6091H = true;
    }

    private void i(java.lang.String str) {
        synchronized (this.f6092I) {
            try {
                for (Q2.p pVar : this.f6089F) {
                    if (pVar.f8803a.equals(str)) {
                        I2.j.c().a(f6085K, java.lang.String.format("Stopping tracking for %s", str), new java.lang.Throwable[0]);
                        this.f6089F.remove(pVar);
                        this.f6088E.d(this.f6089F);
                        break;
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // J2.e
    public boolean a() {
        return false;
    }

    @Override // M2.c
    public void b(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            I2.j.c().a(f6085K, java.lang.String.format("Constraints not met: Cancelling work ID %s", str), new java.lang.Throwable[0]);
            this.f6087D.x(str);
        }
    }

    @Override // J2.b
    public void c(java.lang.String str, boolean z6) {
        i(str);
    }

    @Override // J2.e
    public void d(java.lang.String str) {
        if (this.f6093J == null) {
            g();
        }
        if (!this.f6093J.booleanValue()) {
            I2.j.c().d(f6085K, "Ignoring schedule request in non-main process", new java.lang.Throwable[0]);
            return;
        }
        h();
        I2.j.c().a(f6085K, java.lang.String.format("Cancelling work ID %s", str), new java.lang.Throwable[0]);
        K2.a aVar = this.f6090G;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f6087D.x(str);
    }

    @Override // J2.e
    public void e(Q2.p... pVarArr) {
        if (this.f6093J == null) {
            g();
        }
        if (!this.f6093J.booleanValue()) {
            I2.j.c().d(f6085K, "Ignoring schedule request in a secondary process", new java.lang.Throwable[0]);
            return;
        }
        h();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (Q2.p pVar : pVarArr) {
            long jA = pVar.a();
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (pVar.f8804b == I2.s.ENQUEUED) {
                if (jCurrentTimeMillis < jA) {
                    K2.a aVar = this.f6090G;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i6 = android.os.Build.VERSION.SDK_INT;
                    if (pVar.f8812j.h()) {
                        I2.j.c().a(f6085K, java.lang.String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new java.lang.Throwable[0]);
                    } else if (i6 < 24 || !pVar.f8812j.e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f8803a);
                    } else {
                        I2.j.c().a(f6085K, java.lang.String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new java.lang.Throwable[0]);
                    }
                } else {
                    I2.j.c().a(f6085K, java.lang.String.format("Starting work for %s", pVar.f8803a), new java.lang.Throwable[0]);
                    this.f6087D.u(pVar.f8803a);
                }
            }
        }
        synchronized (this.f6092I) {
            try {
                if (!hashSet.isEmpty()) {
                    I2.j.c().a(f6085K, java.lang.String.format("Starting tracking for [%s]", android.text.TextUtils.join(",", hashSet2)), new java.lang.Throwable[0]);
                    this.f6089F.addAll(hashSet);
                    this.f6088E.d(this.f6089F);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // M2.c
    public void f(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            I2.j.c().a(f6085K, java.lang.String.format("Constraints met: Scheduling work ID %s", str), new java.lang.Throwable[0]);
            this.f6087D.u(str);
        }
    }
}
