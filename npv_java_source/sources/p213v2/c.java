package p213v2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p253z2.e, p143o2.InterfaceC7024d {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p253z2.e f55775C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p213v2.b f55776D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final v2.c.a f55777E;

    public static final class a implements p253z2.d {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final p213v2.b f55778C;

        static final class b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ java.lang.String f55780D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(java.lang.String str) {
                super(1);
                this.f55780D = str;
            }

            public final void a(p253z2.d dVar) {
                p247y7.AbstractC7350t.f(dVar, "db");
                dVar.B(this.f55780D);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((p253z2.d) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: v2.c$a$c, reason: collision with other inner class name */
        static final class C0732c extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ java.lang.String f55781D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ java.lang.Object[] f55782E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0732c(java.lang.String str, java.lang.Object[] objArr) {
                super(1);
                this.f55781D = str;
                this.f55782E = objArr;
            }

            public final void a(p253z2.d dVar) {
                p247y7.AbstractC7350t.f(dVar, "db");
                dVar.j0(this.f55781D, this.f55782E);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((p253z2.d) obj);
                return p087i7.M.f46721a;
            }
        }

        /* synthetic */ class d extends p247y7.C7348q implements p237x7.l {

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            public static final v2.c.a.d f55783L = new v2.c.a.d();

            d() {
                super(1, p253z2.d.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean l(p253z2.d dVar) {
                p247y7.AbstractC7350t.f(dVar, "p0");
                return java.lang.Boolean.valueOf(dVar.V0());
            }
        }

        static final class g extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final v2.c.a.g f55786D = new v2.c.a.g();

            g() {
                super(1);
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object l(p253z2.d dVar) {
                p247y7.AbstractC7350t.f(dVar, "it");
                return null;
            }
        }

        public a(p213v2.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "autoCloser");
            this.f55778C = bVar;
        }

        @Override // p253z2.d
        public void B(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "sql");
            this.f55778C.h(new v2.c.a.b(str));
        }

        @Override // p253z2.d
        public void B0() {
            try {
                p253z2.d dVarI = this.f55778C.i();
                p247y7.AbstractC7350t.c(dVarI);
                dVarI.B0();
            } finally {
                this.f55778C.g();
            }
        }

        @Override // p253z2.d
        public p253z2.h J(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "sql");
            return new v2.c.b(str, this.f55778C);
        }

        @Override // p253z2.d
        public android.database.Cursor L0(p253z2.g gVar, android.os.CancellationSignal cancellationSignal) {
            p247y7.AbstractC7350t.f(gVar, "query");
            try {
                return new p213v2.c.C0735c(this.f55778C.j().L0(gVar, cancellationSignal), this.f55778C);
            } catch (java.lang.Throwable th) {
                this.f55778C.g();
                throw th;
            }
        }

        @Override // p253z2.d
        public /* synthetic */ void S() {
            p253z2.c.a(this);
        }

        @Override // p253z2.d
        public java.lang.String S0() {
            return (java.lang.String) this.f55778C.h(new p247y7.G() { // from class: v2.c.a.f
                @Override // p247y7.G, F7.m
                public java.lang.Object get(java.lang.Object obj) {
                    return ((p253z2.d) obj).S0();
                }
            });
        }

        @Override // p253z2.d
        public android.database.Cursor T(p253z2.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "query");
            try {
                return new p213v2.c.C0735c(this.f55778C.j().T(gVar), this.f55778C);
            } catch (java.lang.Throwable th) {
                this.f55778C.g();
                throw th;
            }
        }

        @Override // p253z2.d
        public boolean V0() {
            if (this.f55778C.i() == null) {
                return false;
            }
            return ((java.lang.Boolean) this.f55778C.h(v2.c.a.d.f55783L)).booleanValue();
        }

        public final void a() {
            this.f55778C.h(v2.c.a.g.f55786D);
        }

        @Override // p253z2.d
        public boolean a1() {
            return ((java.lang.Boolean) this.f55778C.h(new p247y7.G() { // from class: v2.c.a.e
                @Override // p247y7.G, F7.m
                public java.lang.Object get(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(((p253z2.d) obj).a1());
                }
            })).booleanValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f55778C.f();
        }

        @Override // p253z2.d
        public void i0() {
            p253z2.d dVarI = this.f55778C.i();
            p247y7.AbstractC7350t.c(dVarI);
            dVarI.i0();
        }

        @Override // p253z2.d
        public boolean isOpen() {
            p253z2.d dVarI = this.f55778C.i();
            if (dVarI != null) {
                return dVarI.isOpen();
            }
            return false;
        }

        @Override // p253z2.d
        public void j0(java.lang.String str, java.lang.Object[] objArr) {
            p247y7.AbstractC7350t.f(str, "sql");
            p247y7.AbstractC7350t.f(objArr, "bindArgs");
            this.f55778C.h(new v2.c.a.C0732c(str, objArr));
        }

        @Override // p253z2.d
        public void l0() {
            try {
                this.f55778C.j().l0();
            } catch (java.lang.Throwable th) {
                this.f55778C.g();
                throw th;
            }
        }

        @Override // p253z2.d
        public void u() {
            try {
                this.f55778C.j().u();
            } catch (java.lang.Throwable th) {
                this.f55778C.g();
                throw th;
            }
        }

        @Override // p253z2.d
        public android.database.Cursor w0(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "query");
            try {
                return new p213v2.c.C0735c(this.f55778C.j().w0(str), this.f55778C);
            } catch (java.lang.Throwable th) {
                this.f55778C.g();
                throw th;
            }
        }

        @Override // p253z2.d
        public java.util.List z() {
            return (java.util.List) this.f55778C.h(new p247y7.G() { // from class: v2.c.a.a
                @Override // p247y7.G, F7.m
                public java.lang.Object get(java.lang.Object obj) {
                    return ((p253z2.d) obj).z();
                }
            });
        }
    }

    private static final class b implements p253z2.h {

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final v2.c.b.a f55787J = new v2.c.b.a(null);

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.lang.String f55788C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p213v2.b f55789D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int[] f55790E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private long[] f55791F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private double[] f55792G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private java.lang.String[] f55793H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private byte[][] f55794I;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }
        }

        /* JADX INFO: renamed from: v2.c$b$b, reason: collision with other inner class name */
        static final class C0733b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final v2.c.b.C0733b f55795D = new v2.c.b.C0733b();

            C0733b() {
                super(1);
            }

            public final void a(p253z2.h hVar) {
                p247y7.AbstractC7350t.f(hVar, "statement");
                hVar.n();
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((p253z2.h) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: v2.c$b$c, reason: collision with other inner class name */
        static final class C0734c extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final v2.c.b.C0734c f55796D = new v2.c.b.C0734c();

            C0734c() {
                super(1);
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Long l(p253z2.h hVar) {
                p247y7.AbstractC7350t.f(hVar, "obj");
                return java.lang.Long.valueOf(hVar.o1());
            }
        }

        static final class d extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final v2.c.b.d f55797D = new v2.c.b.d();

            d() {
                super(1);
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Integer l(p253z2.h hVar) {
                p247y7.AbstractC7350t.f(hVar, "obj");
                return java.lang.Integer.valueOf(hVar.I());
            }
        }

        static final class e extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p237x7.l f55799E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(p237x7.l lVar) {
                super(1);
                this.f55799E = lVar;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object l(p253z2.d dVar) {
                p247y7.AbstractC7350t.f(dVar, "db");
                p253z2.h hVarJ = dVar.J(v2.c.b.this.f55788C);
                v2.c.b.this.g(hVarJ);
                return this.f55799E.l(hVarJ);
            }
        }

        public b(java.lang.String str, p213v2.b bVar) {
            p247y7.AbstractC7350t.f(str, "sql");
            p247y7.AbstractC7350t.f(bVar, "autoCloser");
            this.f55788C = str;
            this.f55789D = bVar;
            this.f55790E = new int[0];
            this.f55791F = new long[0];
            this.f55792G = new double[0];
            this.f55793H = new java.lang.String[0];
            this.f55794I = new byte[0][];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(p253z2.f fVar) {
            int length = this.f55790E.length;
            for (int i6 = 1; i6 < length; i6++) {
                int i10 = this.f55790E[i6];
                if (i10 == 1) {
                    fVar.l(i6, this.f55791F[i6]);
                } else if (i10 == 2) {
                    fVar.P(i6, this.f55792G[i6]);
                } else if (i10 == 3) {
                    java.lang.String str = this.f55793H[i6];
                    p247y7.AbstractC7350t.c(str);
                    fVar.C(i6, str);
                } else if (i10 == 4) {
                    byte[] bArr = this.f55794I[i6];
                    p247y7.AbstractC7350t.c(bArr);
                    fVar.p0(i6, bArr);
                } else if (i10 == 5) {
                    fVar.M0(i6);
                }
            }
        }

        private final void o(int i6, int i10) {
            int i11 = i10 + 1;
            int[] iArr = this.f55790E;
            if (iArr.length < i11) {
                int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i11);
                p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(this, newSize)");
                this.f55790E = iArrCopyOf;
            }
            if (i6 == 1) {
                long[] jArr = this.f55791F;
                if (jArr.length < i11) {
                    long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, i11);
                    p247y7.AbstractC7350t.e(jArrCopyOf, "copyOf(this, newSize)");
                    this.f55791F = jArrCopyOf;
                    return;
                }
                return;
            }
            if (i6 == 2) {
                double[] dArr = this.f55792G;
                if (dArr.length < i11) {
                    double[] dArrCopyOf = java.util.Arrays.copyOf(dArr, i11);
                    p247y7.AbstractC7350t.e(dArrCopyOf, "copyOf(this, newSize)");
                    this.f55792G = dArrCopyOf;
                    return;
                }
                return;
            }
            if (i6 == 3) {
                java.lang.String[] strArr = this.f55793H;
                if (strArr.length < i11) {
                    java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, i11);
                    p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
                    this.f55793H = (java.lang.String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (i6 != 4) {
                return;
            }
            byte[][] bArr = this.f55794I;
            if (bArr.length < i11) {
                java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(bArr, i11);
                p247y7.AbstractC7350t.e(objArrCopyOf2, "copyOf(this, newSize)");
                this.f55794I = (byte[][]) objArrCopyOf2;
            }
        }

        private final java.lang.Object r(p237x7.l lVar) {
            return this.f55789D.h(new v2.c.b.e(lVar));
        }

        @Override // p253z2.f
        public void C(int i6, java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "value");
            o(3, i6);
            this.f55790E[i6] = 3;
            this.f55793H[i6] = str;
        }

        @Override // p253z2.h
        public int I() {
            return ((java.lang.Number) r(v2.c.b.d.f55797D)).intValue();
        }

        @Override // p253z2.f
        public void M0(int i6) {
            o(5, i6);
            this.f55790E[i6] = 5;
        }

        @Override // p253z2.f
        public void P(int i6, double d6) {
            o(2, i6);
            this.f55790E[i6] = 2;
            this.f55792G[i6] = d6;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            i();
        }

        public void i() {
            this.f55790E = new int[0];
            this.f55791F = new long[0];
            this.f55792G = new double[0];
            this.f55793H = new java.lang.String[0];
            this.f55794I = new byte[0][];
        }

        @Override // p253z2.f
        public void l(int i6, long j6) {
            o(1, i6);
            this.f55790E[i6] = 1;
            this.f55791F[i6] = j6;
        }

        @Override // p253z2.h
        public void n() {
            r(v2.c.b.C0733b.f55795D);
        }

        @Override // p253z2.h
        public long o1() {
            return ((java.lang.Number) r(v2.c.b.C0734c.f55796D)).longValue();
        }

        @Override // p253z2.f
        public void p0(int i6, byte[] bArr) {
            p247y7.AbstractC7350t.f(bArr, "value");
            o(4, i6);
            this.f55790E[i6] = 4;
            this.f55794I[i6] = bArr;
        }
    }

    /* JADX INFO: renamed from: v2.c$c, reason: collision with other inner class name */
    private static final class C0735c implements android.database.Cursor {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final android.database.Cursor f55800C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p213v2.b f55801D;

        public C0735c(android.database.Cursor cursor, p213v2.b bVar) {
            p247y7.AbstractC7350t.f(cursor, "delegate");
            p247y7.AbstractC7350t.f(bVar, "autoCloser");
            this.f55800C = cursor;
            this.f55801D = bVar;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f55800C.close();
            this.f55801D.g();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i6, android.database.CharArrayBuffer charArrayBuffer) {
            this.f55800C.copyStringToBuffer(i6, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f55800C.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i6) {
            return this.f55800C.getBlob(i6);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f55800C.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(java.lang.String str) {
            return this.f55800C.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(java.lang.String str) {
            return this.f55800C.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public java.lang.String getColumnName(int i6) {
            return this.f55800C.getColumnName(i6);
        }

        @Override // android.database.Cursor
        public java.lang.String[] getColumnNames() {
            return this.f55800C.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f55800C.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i6) {
            return this.f55800C.getDouble(i6);
        }

        @Override // android.database.Cursor
        public android.os.Bundle getExtras() {
            return this.f55800C.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i6) {
            return this.f55800C.getFloat(i6);
        }

        @Override // android.database.Cursor
        public int getInt(int i6) {
            return this.f55800C.getInt(i6);
        }

        @Override // android.database.Cursor
        public long getLong(int i6) {
            return this.f55800C.getLong(i6);
        }

        @Override // android.database.Cursor
        public android.net.Uri getNotificationUri() {
            return this.f55800C.getNotificationUri();
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f55800C.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i6) {
            return this.f55800C.getShort(i6);
        }

        @Override // android.database.Cursor
        public java.lang.String getString(int i6) {
            return this.f55800C.getString(i6);
        }

        @Override // android.database.Cursor
        public int getType(int i6) {
            return this.f55800C.getType(i6);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f55800C.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f55800C.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f55800C.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f55800C.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f55800C.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f55800C.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i6) {
            return this.f55800C.isNull(i6);
        }

        @Override // android.database.Cursor
        public boolean move(int i6) {
            return this.f55800C.move(i6);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f55800C.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f55800C.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f55800C.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i6) {
            return this.f55800C.moveToPosition(i6);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f55800C.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(android.database.ContentObserver contentObserver) {
            this.f55800C.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
            this.f55800C.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f55800C.requery();
        }

        @Override // android.database.Cursor
        public android.os.Bundle respond(android.os.Bundle bundle) {
            return this.f55800C.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(android.os.Bundle bundle) {
            this.f55800C.setExtras(bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
            this.f55800C.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
            this.f55800C.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
            this.f55800C.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public c(p253z2.e eVar, p213v2.b bVar) {
        p247y7.AbstractC7350t.f(eVar, "delegate");
        p247y7.AbstractC7350t.f(bVar, "autoCloser");
        this.f55775C = eVar;
        this.f55776D = bVar;
        this.f55777E = new v2.c.a(bVar);
        bVar.l(a());
    }

    @Override // p143o2.InterfaceC7024d
    public p253z2.e a() {
        return this.f55775C;
    }

    @Override // p253z2.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f55777E.close();
    }

    public final p213v2.b f() {
        return this.f55776D;
    }

    @Override // p253z2.e
    public java.lang.String getDatabaseName() {
        return this.f55775C.getDatabaseName();
    }

    @Override // p253z2.e
    public void setWriteAheadLoggingEnabled(boolean z6) {
        this.f55775C.setWriteAheadLoggingEnabled(z6);
    }

    @Override // p253z2.e
    public p253z2.d v0() {
        this.f55777E.a();
        return this.f55777E;
    }
}
