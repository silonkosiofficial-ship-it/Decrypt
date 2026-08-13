package A2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p253z2.d {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final A2.c.C0007c f213D = new A2.c.C0007c(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final java.lang.String[] f214E = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final java.lang.String[] f215F = new java.lang.String[0];

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final p087i7.InterfaceC6668n f216G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final p087i7.InterfaceC6668n f217H;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.database.sqlite.SQLiteDatabase f218C;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final A2.c.a f219D = new A2.c.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.reflect.Method b() {
            java.lang.Class<?> returnType;
            try {
                java.lang.reflect.Method methodD = A2.c.f213D.d();
                if (methodD == null || (returnType = methodD.getReturnType()) == null) {
                    return null;
                }
                java.lang.Class<?> cls = java.lang.Integer.TYPE;
                return returnType.getDeclaredMethod("beginTransaction", cls, android.database.sqlite.SQLiteTransactionListener.class, cls, android.os.CancellationSignal.class);
            } catch (java.lang.Throwable unused) {
                return null;
            }
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final A2.c.b f220D = new A2.c.b();

        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.reflect.Method b() {
            try {
                java.lang.reflect.Method declaredMethod = android.database.sqlite.SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (java.lang.Throwable unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: A2.c$c, reason: collision with other inner class name */
    public static final class C0007c {
        private C0007c() {
        }

        public /* synthetic */ C0007c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.reflect.Method c() {
            return (java.lang.reflect.Method) A2.c.f217H.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.reflect.Method d() {
            return (java.lang.reflect.Method) A2.c.f216G.getValue();
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.r {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p253z2.g f221D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p253z2.g gVar) {
            super(4);
            this.f221D = gVar;
        }

        @Override // p237x7.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.database.sqlite.SQLiteCursor o(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
            p253z2.g gVar = this.f221D;
            p247y7.AbstractC7350t.c(sQLiteQuery);
            gVar.f(new A2.g(sQLiteQuery));
            return new android.database.sqlite.SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    static {
        p087i7.r rVar = p087i7.r.NONE;
        f216G = p087i7.AbstractC6669o.a(rVar, A2.c.b.f220D);
        f217H = p087i7.AbstractC6669o.a(rVar, A2.c.a.f219D);
    }

    public c(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        p247y7.AbstractC7350t.f(sQLiteDatabase, "delegate");
        this.f218C = sQLiteDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.database.Cursor D(p253z2.g gVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
        p247y7.AbstractC7350t.c(sQLiteQuery);
        gVar.f(new A2.g(sQLiteQuery));
        return new android.database.sqlite.SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    private final void r(android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        A2.c.C0007c c0007c = f213D;
        if (c0007c.c() == null || c0007c.d() == null) {
            if (sQLiteTransactionListener != null) {
                o(sQLiteTransactionListener);
                return;
            } else {
                u();
                return;
            }
        }
        java.lang.reflect.Method methodC = c0007c.c();
        p247y7.AbstractC7350t.c(methodC);
        java.lang.reflect.Method methodD = c0007c.d();
        p247y7.AbstractC7350t.c(methodD);
        java.lang.Object objInvoke = methodD.invoke(this.f218C, null);
        if (objInvoke == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        methodC.invoke(objInvoke, 0, sQLiteTransactionListener, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.database.Cursor y(p237x7.r rVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
        return (android.database.Cursor) rVar.o(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // p253z2.d
    public void B(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "sql");
        this.f218C.execSQL(str);
    }

    @Override // p253z2.d
    public void B0() {
        this.f218C.endTransaction();
    }

    @Override // p253z2.d
    public p253z2.h J(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "sql");
        android.database.sqlite.SQLiteStatement sQLiteStatementCompileStatement = this.f218C.compileStatement(str);
        p247y7.AbstractC7350t.e(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new A2.h(sQLiteStatementCompileStatement);
    }

    @Override // p253z2.d
    public android.database.Cursor L0(final p253z2.g gVar, android.os.CancellationSignal cancellationSignal) {
        p247y7.AbstractC7350t.f(gVar, "query");
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.f218C;
        android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory = new android.database.sqlite.SQLiteDatabase.CursorFactory() { // from class: A2.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase sQLiteDatabase2, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
                return A2.c.D(gVar, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        java.lang.String strA = gVar.a();
        java.lang.String[] strArr = f215F;
        p247y7.AbstractC7350t.c(cancellationSignal);
        android.database.Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, strA, strArr, null, cancellationSignal);
        p247y7.AbstractC7350t.e(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…llationSignal!!\n        )");
        return cursorRawQueryWithFactory;
    }

    @Override // p253z2.d
    public void S() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        r(null);
    }

    @Override // p253z2.d
    public java.lang.String S0() {
        return this.f218C.getPath();
    }

    @Override // p253z2.d
    public android.database.Cursor T(p253z2.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "query");
        final A2.c.d dVar = new A2.c.d(gVar);
        android.database.Cursor cursorRawQueryWithFactory = this.f218C.rawQueryWithFactory(new android.database.sqlite.SQLiteDatabase.CursorFactory() { // from class: A2.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
                return A2.c.y(dVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, gVar.a(), f215F, null);
        p247y7.AbstractC7350t.e(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // p253z2.d
    public boolean V0() {
        return this.f218C.inTransaction();
    }

    @Override // p253z2.d
    public boolean a1() {
        return this.f218C.isWriteAheadLoggingEnabled();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f218C.close();
    }

    @Override // p253z2.d
    public void i0() {
        this.f218C.setTransactionSuccessful();
    }

    @Override // p253z2.d
    public boolean isOpen() {
        return this.f218C.isOpen();
    }

    @Override // p253z2.d
    public void j0(java.lang.String str, java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(str, "sql");
        p247y7.AbstractC7350t.f(objArr, "bindArgs");
        this.f218C.execSQL(str, objArr);
    }

    @Override // p253z2.d
    public void l0() {
        this.f218C.beginTransactionNonExclusive();
    }

    public void o(android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        p247y7.AbstractC7350t.f(sQLiteTransactionListener, "transactionListener");
        this.f218C.beginTransactionWithListener(sQLiteTransactionListener);
    }

    public final boolean s(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        p247y7.AbstractC7350t.f(sQLiteDatabase, "sqLiteDatabase");
        return p247y7.AbstractC7350t.b(this.f218C, sQLiteDatabase);
    }

    @Override // p253z2.d
    public void u() {
        this.f218C.beginTransaction();
    }

    @Override // p253z2.d
    public android.database.Cursor w0(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "query");
        return T(new p253z2.a(str));
    }

    @Override // p253z2.d
    public java.util.List z() {
        return this.f218C.getAttachedDbs();
    }
}
