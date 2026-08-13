package p143o2;

/* JADX INFO: renamed from: o2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7021a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p143o2.AbstractC7021a.C0674a f52386c = new p143o2.AbstractC7021a.C0674a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f52387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f52388b;

    /* JADX INFO: renamed from: o2.a$a, reason: collision with other inner class name */
    public static final class C0674a {
        private C0674a() {
        }

        public /* synthetic */ C0674a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: o2.a$b */
    protected final class b implements p243y2.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p243y2.c f52389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p143o2.AbstractC7021a f52390b;

        /* JADX INFO: renamed from: o2.a$b$a, reason: collision with other inner class name */
        static final class C0675a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p143o2.AbstractC7021a f52391D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p143o2.AbstractC7021a.b f52392E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ java.lang.String f52393F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0675a(p143o2.AbstractC7021a abstractC7021a, p143o2.AbstractC7021a.b bVar, java.lang.String str) {
                super(0);
                this.f52391D = abstractC7021a;
                this.f52392E = bVar;
                this.f52393F = str;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p243y2.b b() {
                if (!(!this.f52391D.f52388b)) {
                    throw new java.lang.IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?".toString());
                }
                p243y2.b bVarA = this.f52392E.f52389a.a(this.f52393F);
                if (this.f52391D.f52387a) {
                    this.f52391D.g(bVarA);
                } else {
                    try {
                        this.f52391D.f52388b = true;
                        this.f52391D.i(bVarA);
                    } finally {
                        this.f52391D.f52388b = false;
                    }
                }
                return bVarA;
            }
        }

        public b(p143o2.AbstractC7021a abstractC7021a, p243y2.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "actual");
            this.f52390b = abstractC7021a;
            this.f52389a = cVar;
        }

        @Override // p243y2.c
        public p243y2.b a(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "fileName");
            return (p243y2.b) new p153p2.b(str, (this.f52390b.f52387a || this.f52390b.f52388b || p247y7.AbstractC7350t.b(str, ":memory:")) ? false : true).b(new p143o2.AbstractC7021a.b.C0675a(this.f52390b, this, str));
        }
    }

    /* JADX INFO: renamed from: o2.a$c */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52394a;

        static {
            int[] iArr = new int[o2.n.d.values().length];
            try {
                iArr[o2.n.d.TRUNCATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[o2.n.d.WRITE_AHEAD_LOGGING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f52394a = iArr;
        }
    }

    private final void A(p243y2.b bVar) {
        l(bVar);
        p243y2.a.a(bVar, p143o2.q.a(r().c()));
    }

    private final void f(p243y2.b bVar) throws java.lang.Throwable {
        java.lang.Object objB;
        if (t(bVar)) {
            p243y2.e eVarE = bVar.e("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
            try {
                java.lang.String strO = eVarE.p() ? eVarE.o(0) : null;
                eVarE.close();
                if (p247y7.AbstractC7350t.b(r().c(), strO) || p247y7.AbstractC7350t.b(r().d(), strO)) {
                    return;
                }
                throw new java.lang.IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + r().c() + ", found: " + strO).toString());
            } catch (java.lang.Throwable th) {
                eVarE.close();
                throw th;
            }
        }
        p243y2.a.a(bVar, "BEGIN EXCLUSIVE TRANSACTION");
        try {
            i7.w.a aVar = p087i7.w.f46751D;
            o2.r.a aVarJ = r().j(bVar);
            if (!aVarJ.f52500a) {
                throw new java.lang.IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarJ.f52501b).toString());
            }
            r().h(bVar);
            A(bVar);
            objB = p087i7.w.b(p087i7.M.f46721a);
            if (p087i7.w.h(objB)) {
                p243y2.a.a(bVar, "END TRANSACTION");
            }
            java.lang.Throwable thE = p087i7.w.e(objB);
            if (thE == null) {
                return;
            }
            p243y2.a.a(bVar, "ROLLBACK TRANSACTION");
            throw thE;
        } catch (java.lang.Throwable th2) {
            i7.w.a aVar2 = p087i7.w.f46751D;
            objB = p087i7.w.b(p087i7.x.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(p243y2.b bVar) {
        k(bVar);
        h(bVar);
        r().g(bVar);
    }

    private final void h(p243y2.b bVar) {
        p243y2.e eVarE = bVar.e("PRAGMA busy_timeout");
        try {
            eVarE.p();
            long j6 = eVarE.getLong(0);
            eVarE.close();
            if (j6 < 3000) {
                p243y2.a.a(bVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (java.lang.Throwable th) {
            eVarE.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(p243y2.b bVar) throws java.lang.Throwable {
        java.lang.Object objB;
        j(bVar);
        k(bVar);
        p243y2.e eVarE = bVar.e("PRAGMA user_version");
        try {
            eVarE.p();
            int i6 = (int) eVarE.getLong(0);
            eVarE.close();
            if (i6 != r().e()) {
                p243y2.a.a(bVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    i7.w.a aVar = p087i7.w.f46751D;
                    if (i6 == 0) {
                        x(bVar);
                    } else {
                        y(bVar, i6, r().e());
                    }
                    p243y2.a.a(bVar, "PRAGMA user_version = " + r().e());
                    objB = p087i7.w.b(p087i7.M.f46721a);
                } catch (java.lang.Throwable th) {
                    i7.w.a aVar2 = p087i7.w.f46751D;
                    objB = p087i7.w.b(p087i7.x.a(th));
                }
                if (p087i7.w.h(objB)) {
                    p243y2.a.a(bVar, "END TRANSACTION");
                }
                java.lang.Throwable thE = p087i7.w.e(objB);
                if (thE != null) {
                    p243y2.a.a(bVar, "ROLLBACK TRANSACTION");
                    throw thE;
                }
            }
            z(bVar);
        } catch (java.lang.Throwable th2) {
            eVarE.close();
            throw th2;
        }
    }

    private final void j(p243y2.b bVar) {
        p243y2.a.a(bVar, o().f52403g == o2.n.d.WRITE_AHEAD_LOGGING ? "PRAGMA journal_mode = WAL" : "PRAGMA journal_mode = TRUNCATE");
    }

    private final void k(p243y2.b bVar) {
        p243y2.a.a(bVar, o().f52403g == o2.n.d.WRITE_AHEAD_LOGGING ? "PRAGMA synchronous = NORMAL" : "PRAGMA synchronous = FULL");
    }

    private final void l(p243y2.b bVar) {
        p243y2.a.a(bVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void m(p243y2.b bVar) {
        java.lang.StringBuilder sb;
        java.lang.String str;
        if (!o().f52415s) {
            r().b(bVar);
            return;
        }
        p243y2.e eVarE = bVar.e("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
        try {
            java.util.List listC = p097j7.AbstractC6879v.c();
            while (eVarE.p()) {
                java.lang.String strO = eVarE.o(0);
                if (!S8.r.V(strO, "sqlite_", false, 2, null) && !p247y7.AbstractC7350t.b(strO, "android_metadata")) {
                    listC.add(p087i7.B.a(strO, java.lang.Boolean.valueOf(p247y7.AbstractC7350t.b(eVarE.o(1), "view"))));
                }
            }
            java.util.List<p087i7.u> listA = p097j7.AbstractC6879v.a(listC);
            eVarE.close();
            for (p087i7.u uVar : listA) {
                java.lang.String str2 = (java.lang.String) uVar.a();
                if (((java.lang.Boolean) uVar.b()).booleanValue()) {
                    sb = new java.lang.StringBuilder();
                    str = "DROP VIEW IF EXISTS ";
                } else {
                    sb = new java.lang.StringBuilder();
                    str = "DROP TABLE IF EXISTS ";
                }
                sb.append(str);
                sb.append(str2);
                p243y2.a.a(bVar, sb.toString());
            }
        } catch (java.lang.Throwable th) {
            eVarE.close();
            throw th;
        }
    }

    private final boolean s(p243y2.b bVar) {
        p243y2.e eVarE = bVar.e("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z6 = false;
            if (eVarE.p() && eVarE.getLong(0) == 0) {
                z6 = true;
            }
            return z6;
        } finally {
            eVarE.close();
        }
    }

    private final boolean t(p243y2.b bVar) {
        p243y2.e eVarE = bVar.e("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z6 = false;
            if (eVarE.p() && eVarE.getLong(0) != 0) {
                z6 = true;
            }
            return z6;
        } finally {
            eVarE.close();
        }
    }

    private final void u(p243y2.b bVar) {
        java.util.Iterator it = n().iterator();
        while (it.hasNext()) {
            ((o2.n.b) it.next()).a(bVar);
        }
    }

    private final void v(p243y2.b bVar) {
        java.util.Iterator it = n().iterator();
        while (it.hasNext()) {
            ((o2.n.b) it.next()).c(bVar);
        }
    }

    private final void w(p243y2.b bVar) {
        java.util.Iterator it = n().iterator();
        while (it.hasNext()) {
            ((o2.n.b) it.next()).e(bVar);
        }
    }

    protected abstract java.util.List n();

    protected abstract p143o2.C7023c o();

    protected final int p(o2.n.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "<this>");
        int i6 = p143o2.AbstractC7021a.c.f52394a[dVar.ordinal()];
        if (i6 == 1) {
            return 1;
        }
        if (i6 == 2) {
            return 4;
        }
        throw new java.lang.IllegalStateException(("Can't get max number of reader for journal mode '" + dVar + '\'').toString());
    }

    protected final int q(o2.n.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "<this>");
        int i6 = p143o2.AbstractC7021a.c.f52394a[dVar.ordinal()];
        if (i6 == 1 || i6 == 2) {
            return 1;
        }
        throw new java.lang.IllegalStateException(("Can't get max number of writers for journal mode '" + dVar + '\'').toString());
    }

    protected abstract p143o2.r r();

    protected final void x(p243y2.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "connection");
        boolean zS = s(bVar);
        r().a(bVar);
        if (!zS) {
            o2.r.a aVarJ = r().j(bVar);
            if (!aVarJ.f52500a) {
                throw new java.lang.IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarJ.f52501b).toString());
            }
        }
        A(bVar);
        r().f(bVar);
        u(bVar);
    }

    protected final void y(p243y2.b bVar, int i6, int i10) {
        p247y7.AbstractC7350t.f(bVar, "connection");
        java.util.List listD = o().f52400d.d(i6, i10);
        if (listD == null) {
            if (!o().e(i6, i10)) {
                m(bVar);
                v(bVar);
                r().a(bVar);
                return;
            } else {
                throw new java.lang.IllegalStateException(("A migration from " + i6 + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.").toString());
            }
        }
        r().i(bVar);
        java.util.Iterator it = listD.iterator();
        while (it.hasNext()) {
            ((p183s2.a) it.next()).a(bVar);
        }
        o2.r.a aVarJ = r().j(bVar);
        if (aVarJ.f52500a) {
            r().h(bVar);
            A(bVar);
        } else {
            throw new java.lang.IllegalStateException(("Migration didn't properly handle: " + aVarJ.f52501b).toString());
        }
    }

    protected final void z(p243y2.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "connection");
        f(bVar);
        r().g(bVar);
        w(bVar);
        this.f52387a = true;
    }
}
