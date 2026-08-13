package R2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final J2.c f9414C = new J2.c();

    /* JADX INFO: renamed from: R2.a$a, reason: collision with other inner class name */
    class C0218a extends R2.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ J2.j f9415D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.util.UUID f9416E;

        C0218a(J2.j jVar, java.util.UUID uuid) {
            this.f9415D = jVar;
            this.f9416E = uuid;
        }

        @Override // R2.a
        void h() {
            androidx.work.impl.WorkDatabase workDatabaseO = this.f9415D.o();
            workDatabaseO.g();
            try {
                a(this.f9415D, this.f9416E.toString());
                workDatabaseO.N();
                workDatabaseO.n();
                g(this.f9415D);
            } catch (java.lang.Throwable th) {
                workDatabaseO.n();
                throw th;
            }
        }
    }

    class b extends R2.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ J2.j f9417D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.String f9418E;

        b(J2.j jVar, java.lang.String str) {
            this.f9417D = jVar;
            this.f9418E = str;
        }

        @Override // R2.a
        void h() {
            androidx.work.impl.WorkDatabase workDatabaseO = this.f9417D.o();
            workDatabaseO.g();
            try {
                java.util.Iterator it = workDatabaseO.Y().p(this.f9418E).iterator();
                while (it.hasNext()) {
                    a(this.f9417D, (java.lang.String) it.next());
                }
                workDatabaseO.N();
                workDatabaseO.n();
                g(this.f9417D);
            } catch (java.lang.Throwable th) {
                workDatabaseO.n();
                throw th;
            }
        }
    }

    class c extends R2.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ J2.j f9419D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.String f9420E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f9421F;

        c(J2.j jVar, java.lang.String str, boolean z6) {
            this.f9419D = jVar;
            this.f9420E = str;
            this.f9421F = z6;
        }

        @Override // R2.a
        void h() {
            androidx.work.impl.WorkDatabase workDatabaseO = this.f9419D.o();
            workDatabaseO.g();
            try {
                java.util.Iterator it = workDatabaseO.Y().l(this.f9420E).iterator();
                while (it.hasNext()) {
                    a(this.f9419D, (java.lang.String) it.next());
                }
                workDatabaseO.N();
                workDatabaseO.n();
                if (this.f9421F) {
                    g(this.f9419D);
                }
            } catch (java.lang.Throwable th) {
                workDatabaseO.n();
                throw th;
            }
        }
    }

    public static R2.a b(java.util.UUID uuid, J2.j jVar) {
        return new R2.a.C0218a(jVar, uuid);
    }

    public static R2.a c(java.lang.String str, J2.j jVar, boolean z6) {
        return new R2.a.c(jVar, str, z6);
    }

    public static R2.a d(java.lang.String str, J2.j jVar) {
        return new R2.a.b(jVar, str);
    }

    private void f(androidx.work.impl.WorkDatabase workDatabase, java.lang.String str) {
        Q2.q qVarY = workDatabase.Y();
        Q2.b bVarQ = workDatabase.Q();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            java.lang.String str2 = (java.lang.String) linkedList.remove();
            I2.s sVarM = qVarY.m(str2);
            if (sVarM != I2.s.SUCCEEDED && sVarM != I2.s.FAILED) {
                qVarY.b(I2.s.CANCELLED, str2);
            }
            linkedList.addAll(bVarQ.a(str2));
        }
    }

    void a(J2.j jVar, java.lang.String str) {
        f(jVar.o(), str);
        jVar.m().l(str);
        java.util.Iterator it = jVar.n().iterator();
        while (it.hasNext()) {
            ((J2.e) it.next()).d(str);
        }
    }

    public I2.m e() {
        return this.f9414C;
    }

    void g(J2.j jVar) {
        J2.f.b(jVar.i(), jVar.o(), jVar.n());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f9414C.a(I2.m.f4980a);
        } catch (java.lang.Throwable th) {
            this.f9414C.a(new I2.m.b.a(th));
        }
    }
}
