package p253z2;

/* JADX INFO: loaded from: classes.dex */
public interface e extends java.io.Closeable {

    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final z2.e.a.C0765a f57639b = new z2.e.a.C0765a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57640a;

        /* JADX INFO: renamed from: z2.e$a$a, reason: collision with other inner class name */
        public static final class C0765a {
            private C0765a() {
            }

            public /* synthetic */ C0765a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }
        }

        public a(int i6) {
            this.f57640a = i6;
        }

        private final void a(java.lang.String str) {
            if (S8.r.K(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i6 = 0;
            boolean z6 = false;
            while (i6 <= length) {
                boolean z10 = p247y7.AbstractC7350t.g(str.charAt(!z6 ? i6 : length), 32) <= 0;
                if (z6) {
                    if (!z10) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z10) {
                    i6++;
                } else {
                    z6 = true;
                }
            }
            if (str.subSequence(i6, length + 1).toString().length() == 0) {
                return;
            }
            java.lang.String str2 = "deleting the database file: " + str;
            try {
                android.database.sqlite.SQLiteDatabase.deleteDatabase(new java.io.File(str));
            } catch (java.lang.Exception e6) {
            }
        }

        public void b(p253z2.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "db");
        }

        public void c(p253z2.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "db");
            java.lang.String str = "Corruption reported by sqlite on database: " + dVar + ".path";
            if (!dVar.isOpen()) {
                java.lang.String strS0 = dVar.S0();
                if (strS0 != null) {
                    a(strS0);
                    return;
                }
                return;
            }
            java.util.List listZ = null;
            try {
                try {
                    listZ = dVar.z();
                } catch (android.database.sqlite.SQLiteException unused) {
                }
                try {
                    dVar.close();
                } catch (java.io.IOException unused2) {
                }
                if (listZ != null) {
                    return;
                }
            } finally {
                if (listZ != null) {
                    java.util.Iterator it = listZ.iterator();
                    while (it.hasNext()) {
                        java.lang.Object obj = ((android.util.Pair) it.next()).second;
                        p247y7.AbstractC7350t.e(obj, "p.second");
                        a((java.lang.String) obj);
                    }
                } else {
                    java.lang.String strS1 = dVar.S0();
                    if (strS1 != null) {
                        a(strS1);
                    }
                }
            }
        }

        public abstract void d(p253z2.d dVar);

        public abstract void e(p253z2.d dVar, int i6, int i10);

        public void f(p253z2.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "db");
        }

        public abstract void g(p253z2.d dVar, int i6, int i10);
    }

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final z2.e.b.C0766b f57641f = new z2.e.b.C0766b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.content.Context f57642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final java.lang.String f57643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final z2.e.a f57644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f57645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f57646e;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final android.content.Context f57647a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private java.lang.String f57648b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private z2.e.a f57649c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f57650d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f57651e;

            public a(android.content.Context context) {
                p247y7.AbstractC7350t.f(context, "context");
                this.f57647a = context;
            }

            public z2.e.b a() {
                java.lang.String str;
                z2.e.a aVar = this.f57649c;
                if (aVar == null) {
                    throw new java.lang.IllegalArgumentException("Must set a callback to create the configuration.".toString());
                }
                if (this.f57650d && ((str = this.f57648b) == null || str.length() == 0)) {
                    throw new java.lang.IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
                return new z2.e.b(this.f57647a, this.f57648b, aVar, this.f57650d, this.f57651e);
            }

            public z2.e.b.a b(z2.e.a aVar) {
                p247y7.AbstractC7350t.f(aVar, "callback");
                this.f57649c = aVar;
                return this;
            }

            public z2.e.b.a c(java.lang.String str) {
                this.f57648b = str;
                return this;
            }

            public z2.e.b.a d(boolean z6) {
                this.f57650d = z6;
                return this;
            }
        }

        /* JADX INFO: renamed from: z2.e$b$b, reason: collision with other inner class name */
        public static final class C0766b {
            private C0766b() {
            }

            public /* synthetic */ C0766b(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final z2.e.b.a a(android.content.Context context) {
                p247y7.AbstractC7350t.f(context, "context");
                return new z2.e.b.a(context);
            }
        }

        public b(android.content.Context context, java.lang.String str, z2.e.a aVar, boolean z6, boolean z10) {
            p247y7.AbstractC7350t.f(context, "context");
            p247y7.AbstractC7350t.f(aVar, "callback");
            this.f57642a = context;
            this.f57643b = str;
            this.f57644c = aVar;
            this.f57645d = z6;
            this.f57646e = z10;
        }

        public static final z2.e.b.a a(android.content.Context context) {
            return f57641f.a(context);
        }
    }

    public interface c {
        p253z2.e a(z2.e.b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    java.lang.String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z6);

    p253z2.d v0();
}
