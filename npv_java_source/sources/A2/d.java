package A2;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p253z2.e {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final A2.d.a f222J = new A2.d.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f223C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f224D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final z2.e.a f225E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final boolean f226F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final boolean f227G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f228H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f229I;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private A2.c f230a;

        public b(A2.c cVar) {
            this.f230a = cVar;
        }

        public final A2.c a() {
            return this.f230a;
        }

        public final void b(A2.c cVar) {
            this.f230a = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends android.database.sqlite.SQLiteOpenHelper {

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final A2.d.c.C0008c f231J = new A2.d.c.C0008c(null);

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final android.content.Context f232C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final A2.d.b f233D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final z2.e.a f234E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private final boolean f235F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private boolean f236G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private final C2.a f237H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private boolean f238I;

        private static final class a extends java.lang.RuntimeException {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            private final A2.d.c.b f239C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            private final java.lang.Throwable f240D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(A2.d.c.b bVar, java.lang.Throwable th) {
                super(th);
                p247y7.AbstractC7350t.f(bVar, "callbackName");
                p247y7.AbstractC7350t.f(th, "cause");
                this.f239C = bVar;
                this.f240D = th;
            }

            public final A2.d.c.b a() {
                return this.f239C;
            }

            @Override // java.lang.Throwable
            public java.lang.Throwable getCause() {
                return this.f240D;
            }
        }

        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX INFO: renamed from: A2.d$c$c, reason: collision with other inner class name */
        public static final class C0008c {
            private C0008c() {
            }

            public /* synthetic */ C0008c(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final A2.c a(A2.d.b bVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                p247y7.AbstractC7350t.f(bVar, "refHolder");
                p247y7.AbstractC7350t.f(sQLiteDatabase, "sqLiteDatabase");
                A2.c cVarA = bVar.a();
                if (cVarA != null && cVarA.s(sQLiteDatabase)) {
                    return cVarA;
                }
                A2.c cVar = new A2.c(sQLiteDatabase);
                bVar.b(cVar);
                return cVar;
            }
        }

        /* JADX INFO: renamed from: A2.d$c$d, reason: collision with other inner class name */
        public /* synthetic */ class C0009d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f247a;

            static {
                int[] iArr = new int[A2.d.c.b.values().length];
                try {
                    iArr[A2.d.c.b.ON_CONFIGURE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[A2.d.c.b.ON_CREATE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[A2.d.c.b.ON_UPGRADE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[A2.d.c.b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[A2.d.c.b.ON_OPEN.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                f247a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(android.content.Context context, java.lang.String str, final A2.d.b bVar, final z2.e.a aVar, boolean z6) {
            super(context, str, null, aVar.f57640a, new android.database.DatabaseErrorHandler() { // from class: A2.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                    A2.d.c.f(aVar, bVar, sQLiteDatabase);
                }
            });
            p247y7.AbstractC7350t.f(context, "context");
            p247y7.AbstractC7350t.f(bVar, "dbRef");
            p247y7.AbstractC7350t.f(aVar, "callback");
            this.f232C = context;
            this.f233D = bVar;
            this.f234E = aVar;
            this.f235F = z6;
            if (str == null) {
                str = java.util.UUID.randomUUID().toString();
                p247y7.AbstractC7350t.e(str, "randomUUID().toString()");
            }
            this.f237H = new C2.a(str, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(z2.e.a aVar, A2.d.b bVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            A2.d.c.C0008c c0008c = f231J;
            p247y7.AbstractC7350t.e(sQLiteDatabase, "dbObj");
            aVar.c(c0008c.a(bVar, sQLiteDatabase));
        }

        private final android.database.sqlite.SQLiteDatabase o(boolean z6) {
            android.database.sqlite.SQLiteDatabase writableDatabase = z6 ? super.getWritableDatabase() : super.getReadableDatabase();
            p247y7.AbstractC7350t.e(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }

        private final android.database.sqlite.SQLiteDatabase r(boolean z6) throws java.lang.Throwable {
            java.io.File parentFile;
            java.lang.String databaseName = getDatabaseName();
            boolean z10 = this.f238I;
            if (databaseName != null && !z10 && (parentFile = this.f232C.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    java.lang.String str = "Invalid database parent file, not a directory: " + parentFile;
                }
            }
            try {
                return o(z6);
            } catch (java.lang.Throwable unused) {
                try {
                    java.lang.Thread.sleep(500L);
                } catch (java.lang.InterruptedException unused2) {
                }
                try {
                    return o(z6);
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (th instanceof A2.d.c.a) {
                        A2.d.c.a aVar = (A2.d.c.a) th;
                        java.lang.Throwable cause = aVar.getCause();
                        int i6 = A2.d.c.C0009d.f247a[aVar.a().ordinal()];
                        if (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4 || !(cause instanceof android.database.sqlite.SQLiteException)) {
                            throw cause;
                        }
                        th = cause;
                    }
                    if (!(th instanceof android.database.sqlite.SQLiteException) || databaseName == null || !this.f235F) {
                        throw th;
                    }
                    this.f232C.deleteDatabase(databaseName);
                    try {
                        return o(z6);
                    } catch (A2.d.c.a e6) {
                        throw e6.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                C2.a.c(this.f237H, false, 1, null);
                super.close();
                this.f233D.b(null);
                this.f238I = false;
            } finally {
                this.f237H.d();
            }
        }

        public final p253z2.d g(boolean z6) {
            try {
                this.f237H.b((this.f238I || getDatabaseName() == null) ? false : true);
                this.f236G = false;
                android.database.sqlite.SQLiteDatabase sQLiteDatabaseR = r(z6);
                if (!this.f236G) {
                    return i(sQLiteDatabaseR);
                }
                close();
                return g(z6);
            } finally {
                this.f237H.d();
            }
        }

        public final A2.c i(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            p247y7.AbstractC7350t.f(sQLiteDatabase, "sqLiteDatabase");
            return f231J.a(this.f233D, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            p247y7.AbstractC7350t.f(sQLiteDatabase, "db");
            if (!this.f236G && this.f234E.f57640a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                this.f234E.b(i(sQLiteDatabase));
            } catch (java.lang.Throwable th) {
                throw new A2.d.c.a(A2.d.c.b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            p247y7.AbstractC7350t.f(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f234E.d(i(sQLiteDatabase));
            } catch (java.lang.Throwable th) {
                throw new A2.d.c.a(A2.d.c.b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i6, int i10) {
            p247y7.AbstractC7350t.f(sQLiteDatabase, "db");
            this.f236G = true;
            try {
                this.f234E.e(i(sQLiteDatabase), i6, i10);
            } catch (java.lang.Throwable th) {
                throw new A2.d.c.a(A2.d.c.b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            p247y7.AbstractC7350t.f(sQLiteDatabase, "db");
            if (!this.f236G) {
                try {
                    this.f234E.f(i(sQLiteDatabase));
                } catch (java.lang.Throwable th) {
                    throw new A2.d.c.a(A2.d.c.b.ON_OPEN, th);
                }
            }
            this.f238I = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i6, int i10) {
            p247y7.AbstractC7350t.f(sQLiteDatabase, "sqLiteDatabase");
            this.f236G = true;
            try {
                this.f234E.g(i(sQLiteDatabase), i6, i10);
            } catch (java.lang.Throwable th) {
                throw new A2.d.c.a(A2.d.c.b.ON_UPGRADE, th);
            }
        }
    }

    /* JADX INFO: renamed from: A2.d$d, reason: collision with other inner class name */
    static final class C0010d extends p247y7.AbstractC7352v implements p237x7.a {
        C0010d() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A2.d.c b() {
            A2.d.c cVar;
            if (A2.d.this.f224D == null || !A2.d.this.f226F) {
                cVar = new A2.d.c(A2.d.this.f223C, A2.d.this.f224D, new A2.d.b(null), A2.d.this.f225E, A2.d.this.f227G);
            } else {
                cVar = new A2.d.c(A2.d.this.f223C, new java.io.File(p253z2.b.a(A2.d.this.f223C), A2.d.this.f224D).getAbsolutePath(), new A2.d.b(null), A2.d.this.f225E, A2.d.this.f227G);
            }
            cVar.setWriteAheadLoggingEnabled(A2.d.this.f229I);
            return cVar;
        }
    }

    public d(android.content.Context context, java.lang.String str, z2.e.a aVar, boolean z6, boolean z10) {
        p247y7.AbstractC7350t.f(context, "context");
        p247y7.AbstractC7350t.f(aVar, "callback");
        this.f223C = context;
        this.f224D = str;
        this.f225E = aVar;
        this.f226F = z6;
        this.f227G = z10;
        this.f228H = p087i7.AbstractC6669o.b(new A2.d.C0010d());
    }

    private final A2.d.c s() {
        return (A2.d.c) this.f228H.getValue();
    }

    @Override // p253z2.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f228H.d()) {
            s().close();
        }
    }

    @Override // p253z2.e
    public java.lang.String getDatabaseName() {
        return this.f224D;
    }

    @Override // p253z2.e
    public void setWriteAheadLoggingEnabled(boolean z6) {
        if (this.f228H.d()) {
            s().setWriteAheadLoggingEnabled(z6);
        }
        this.f229I = z6;
    }

    @Override // p253z2.e
    public p253z2.d v0() {
        return s().g(true);
    }
}
