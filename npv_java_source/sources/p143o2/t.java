package p143o2;

/* JADX INFO: loaded from: classes.dex */
public class t extends z2.e.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o2.t.a f52502h = new o2.t.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p143o2.C7023c f52503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f52504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o2.t.b f52505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f52506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f52507g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final void a(p253z2.d dVar) throws java.io.IOException {
            java.lang.StringBuilder sb;
            java.lang.String str;
            p247y7.AbstractC7350t.f(dVar, "db");
            android.database.Cursor cursorW0 = dVar.w0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                java.util.List listC = p097j7.AbstractC6879v.c();
                while (cursorW0.moveToNext()) {
                    java.lang.String string = cursorW0.getString(0);
                    p247y7.AbstractC7350t.e(string, "name");
                    if (!S8.r.V(string, "sqlite_", false, 2, null) && !p247y7.AbstractC7350t.b(string, "android_metadata")) {
                        listC.add(p087i7.B.a(string, java.lang.Boolean.valueOf(p247y7.AbstractC7350t.b(cursorW0.getString(1), "view"))));
                    }
                }
                java.util.List<p087i7.u> listA = p097j7.AbstractC6879v.a(listC);
                p197t7.b.a(cursorW0, null);
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
                    dVar.B(sb.toString());
                }
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    p197t7.b.a(cursorW0, th);
                    throw th2;
                }
            }
        }

        public final boolean b(p253z2.d dVar) throws java.io.IOException {
            p247y7.AbstractC7350t.f(dVar, "db");
            android.database.Cursor cursorW0 = dVar.w0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z6 = false;
                if (cursorW0.moveToFirst() && cursorW0.getInt(0) == 0) {
                    z6 = true;
                }
                p197t7.b.a(cursorW0, null);
                return z6;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    p197t7.b.a(cursorW0, th);
                    throw th2;
                }
            }
        }

        public final boolean c(p253z2.d dVar) throws java.io.IOException {
            p247y7.AbstractC7350t.f(dVar, "db");
            android.database.Cursor cursorW0 = dVar.w0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z6 = false;
                if (cursorW0.moveToFirst() && cursorW0.getInt(0) != 0) {
                    z6 = true;
                }
                p197t7.b.a(cursorW0, null);
                return z6;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    p197t7.b.a(cursorW0, th);
                    throw th2;
                }
            }
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f52508a;

        public b(int i6) {
            this.f52508a = i6;
        }

        public abstract void a(p253z2.d dVar);

        public abstract void b(p253z2.d dVar);

        public abstract void c(p253z2.d dVar);

        public abstract void d(p253z2.d dVar);

        public abstract void e(p253z2.d dVar);

        public abstract void f(p253z2.d dVar);

        public abstract o2.t.c g(p253z2.d dVar);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f52509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final java.lang.String f52510b;

        public c(boolean z6, java.lang.String str) {
            this.f52509a = z6;
            this.f52510b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p143o2.C7023c c7023c, o2.t.b bVar, java.lang.String str, java.lang.String str2) {
        super(bVar.f52508a);
        p247y7.AbstractC7350t.f(c7023c, "configuration");
        p247y7.AbstractC7350t.f(bVar, "delegate");
        p247y7.AbstractC7350t.f(str, "identityHash");
        p247y7.AbstractC7350t.f(str2, "legacyHash");
        this.f52504d = c7023c.f52401e;
        this.f52503c = c7023c;
        this.f52505e = bVar;
        this.f52506f = str;
        this.f52507g = str2;
    }

    private final void h(p253z2.d dVar) throws java.io.IOException {
        if (!f52502h.c(dVar)) {
            o2.t.c cVarG = this.f52505e.g(dVar);
            if (cVarG.f52509a) {
                this.f52505e.e(dVar);
                j(dVar);
                return;
            } else {
                throw new java.lang.IllegalStateException("Pre-packaged database has an invalid schema: " + cVarG.f52510b);
            }
        }
        android.database.Cursor cursorT = dVar.T(new p253z2.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            java.lang.String string = cursorT.moveToFirst() ? cursorT.getString(0) : null;
            p197t7.b.a(cursorT, null);
            if (p247y7.AbstractC7350t.b(this.f52506f, string) || p247y7.AbstractC7350t.b(this.f52507g, string)) {
                return;
            }
            throw new java.lang.IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f52506f + ", found: " + string);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                p197t7.b.a(cursorT, th);
                throw th2;
            }
        }
    }

    private final void i(p253z2.d dVar) {
        dVar.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(p253z2.d dVar) {
        i(dVar);
        dVar.B(p143o2.q.a(this.f52506f));
    }

    @Override // z2.e.a
    public void b(p253z2.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "db");
        super.b(dVar);
    }

    @Override // z2.e.a
    public void d(p253z2.d dVar) throws java.io.IOException {
        p247y7.AbstractC7350t.f(dVar, "db");
        boolean zB = f52502h.b(dVar);
        this.f52505e.a(dVar);
        if (!zB) {
            o2.t.c cVarG = this.f52505e.g(dVar);
            if (!cVarG.f52509a) {
                throw new java.lang.IllegalStateException("Pre-packaged database has an invalid schema: " + cVarG.f52510b);
            }
        }
        j(dVar);
        this.f52505e.c(dVar);
        java.util.List list = this.f52504d;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((o2.n.b) it.next()).b(dVar);
            }
        }
    }

    @Override // z2.e.a
    public void e(p253z2.d dVar, int i6, int i10) throws java.io.IOException {
        p247y7.AbstractC7350t.f(dVar, "db");
        g(dVar, i6, i10);
    }

    @Override // z2.e.a
    public void f(p253z2.d dVar) throws java.io.IOException {
        p247y7.AbstractC7350t.f(dVar, "db");
        super.f(dVar);
        h(dVar);
        this.f52505e.d(dVar);
        java.util.List list = this.f52504d;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((o2.n.b) it.next()).f(dVar);
            }
        }
        this.f52503c = null;
    }

    @Override // z2.e.a
    public void g(p253z2.d dVar, int i6, int i10) throws java.io.IOException {
        java.util.List listD;
        p247y7.AbstractC7350t.f(dVar, "db");
        p143o2.C7023c c7023c = this.f52503c;
        if (c7023c != null && (listD = c7023c.f52400d.d(i6, i10)) != null) {
            this.f52505e.f(dVar);
            java.util.Iterator it = listD.iterator();
            while (it.hasNext()) {
                ((p183s2.a) it.next()).a(new p173r2.a(dVar));
            }
            o2.t.c cVarG = this.f52505e.g(dVar);
            if (cVarG.f52509a) {
                this.f52505e.e(dVar);
                j(dVar);
                return;
            } else {
                throw new java.lang.IllegalStateException("Migration didn't properly handle: " + cVarG.f52510b);
            }
        }
        p143o2.C7023c c7023c2 = this.f52503c;
        if (c7023c2 == null || c7023c2.e(i6, i10)) {
            throw new java.lang.IllegalStateException("A migration from " + i6 + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        if (c7023c2.f52415s) {
            f52502h.a(dVar);
        } else {
            this.f52505e.b(dVar);
        }
        java.util.List list = this.f52504d;
        if (list != null) {
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((o2.n.b) it2.next()).d(dVar);
            }
        }
        this.f52505e.a(dVar);
    }
}
