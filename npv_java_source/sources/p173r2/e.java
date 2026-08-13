package p173r2;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements p243y2.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r2.e.a f53823d = new r2.e.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p253z2.d f53824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f53825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f53826c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final boolean b(java.lang.String str) {
            java.lang.String string = S8.r.u1(str).toString();
            if (string.length() < 3) {
                return false;
            }
            java.lang.String strSubstring = string.substring(0, 3);
            p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            java.lang.String upperCase = strSubstring.toUpperCase(java.util.Locale.ROOT);
            p247y7.AbstractC7350t.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            int iHashCode = upperCase.hashCode();
            if (iHashCode != 79487) {
                if (iHashCode != 81978) {
                    if (iHashCode != 85954 || !upperCase.equals("WIT")) {
                        return false;
                    }
                } else if (!upperCase.equals("SEL")) {
                    return false;
                }
            } else if (!upperCase.equals("PRA")) {
                return false;
            }
            return true;
        }

        public final p173r2.e a(p253z2.d dVar, java.lang.String str) {
            p247y7.AbstractC7350t.f(dVar, "db");
            p247y7.AbstractC7350t.f(str, "sql");
            return b(str) ? new r2.e.b(dVar, str) : new r2.e.c(dVar, str);
        }
    }

    private static final class b extends p173r2.e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final r2.e.b.a f53827k = new r2.e.b.a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f53828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long[] f53829f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private double[] f53830g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private java.lang.String[] f53831h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[][] f53832i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private android.database.Cursor f53833j;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }
        }

        /* JADX INFO: renamed from: r2.e$b$b, reason: collision with other inner class name */
        public static final class C0700b implements p253z2.g {
            C0700b() {
            }

            @Override // p253z2.g
            public java.lang.String a() {
                return r2.e.b.this.c();
            }

            @Override // p253z2.g
            public void f(p253z2.f fVar) {
                p247y7.AbstractC7350t.f(fVar, "statement");
                int length = r2.e.b.this.f53828e.length;
                for (int i6 = 1; i6 < length; i6++) {
                    int i10 = r2.e.b.this.f53828e[i6];
                    if (i10 == 1) {
                        fVar.l(i6, r2.e.b.this.f53829f[i6]);
                    } else if (i10 == 2) {
                        fVar.P(i6, r2.e.b.this.f53830g[i6]);
                    } else if (i10 == 3) {
                        java.lang.String str = r2.e.b.this.f53831h[i6];
                        p247y7.AbstractC7350t.c(str);
                        fVar.C(i6, str);
                    } else if (i10 == 4) {
                        byte[] bArr = r2.e.b.this.f53832i[i6];
                        p247y7.AbstractC7350t.c(bArr);
                        fVar.p0(i6, bArr);
                    } else if (i10 == 5) {
                        fVar.M0(i6);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p253z2.d dVar, java.lang.String str) {
            super(dVar, str, null);
            p247y7.AbstractC7350t.f(dVar, "db");
            p247y7.AbstractC7350t.f(str, "sql");
            this.f53828e = new int[0];
            this.f53829f = new long[0];
            this.f53830g = new double[0];
            this.f53831h = new java.lang.String[0];
            this.f53832i = new byte[0][];
        }

        private final void r(int i6, int i10) {
            int i11 = i10 + 1;
            int[] iArr = this.f53828e;
            if (iArr.length < i11) {
                int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i11);
                p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(this, newSize)");
                this.f53828e = iArrCopyOf;
            }
            if (i6 == 1) {
                long[] jArr = this.f53829f;
                if (jArr.length < i11) {
                    long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, i11);
                    p247y7.AbstractC7350t.e(jArrCopyOf, "copyOf(this, newSize)");
                    this.f53829f = jArrCopyOf;
                    return;
                }
                return;
            }
            if (i6 == 2) {
                double[] dArr = this.f53830g;
                if (dArr.length < i11) {
                    double[] dArrCopyOf = java.util.Arrays.copyOf(dArr, i11);
                    p247y7.AbstractC7350t.e(dArrCopyOf, "copyOf(this, newSize)");
                    this.f53830g = dArrCopyOf;
                    return;
                }
                return;
            }
            if (i6 == 3) {
                java.lang.String[] strArr = this.f53831h;
                if (strArr.length < i11) {
                    java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, i11);
                    p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
                    this.f53831h = (java.lang.String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (i6 != 4) {
                return;
            }
            byte[][] bArr = this.f53832i;
            if (bArr.length < i11) {
                java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(bArr, i11);
                p247y7.AbstractC7350t.e(objArrCopyOf2, "copyOf(this, newSize)");
                this.f53832i = (byte[][]) objArrCopyOf2;
            }
        }

        private final void s() {
            if (this.f53833j == null) {
                this.f53833j = b().T(new r2.e.b.C0700b());
            }
        }

        private final void t(android.database.Cursor cursor, int i6) {
            if (i6 < 0 || i6 >= cursor.getColumnCount()) {
                p243y2.a.b(25, "column index out of range");
                throw new p087i7.C6665k();
            }
        }

        private final android.database.Cursor u() {
            android.database.Cursor cursor = this.f53833j;
            if (cursor != null) {
                return cursor;
            }
            p243y2.a.b(21, "no row");
            throw new p087i7.C6665k();
        }

        @Override // p243y2.e
        public void a() {
            f();
            android.database.Cursor cursor = this.f53833j;
            if (cursor != null) {
                cursor.close();
            }
            this.f53833j = null;
        }

        @Override // p243y2.e
        public void close() {
            if (!d()) {
                q();
                a();
            }
            e(true);
        }

        @Override // p243y2.e
        public int getColumnCount() {
            f();
            s();
            android.database.Cursor cursor = this.f53833j;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // p243y2.e
        public java.lang.String getColumnName(int i6) {
            f();
            s();
            android.database.Cursor cursor = this.f53833j;
            if (cursor == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            t(cursor, i6);
            java.lang.String columnName = cursor.getColumnName(i6);
            p247y7.AbstractC7350t.e(columnName, "c.getColumnName(index)");
            return columnName;
        }

        @Override // p243y2.e
        public long getLong(int i6) {
            f();
            android.database.Cursor cursorU = u();
            t(cursorU, i6);
            return cursorU.getLong(i6);
        }

        @Override // p243y2.e
        public boolean isNull(int i6) {
            f();
            android.database.Cursor cursorU = u();
            t(cursorU, i6);
            return cursorU.isNull(i6);
        }

        @Override // p243y2.e
        public void l(int i6, long j6) {
            f();
            r(1, i6);
            this.f53828e[i6] = 1;
            this.f53829f[i6] = j6;
        }

        @Override // p243y2.e
        public void n(int i6, java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "value");
            f();
            r(3, i6);
            this.f53828e[i6] = 3;
            this.f53831h[i6] = str;
        }

        @Override // p243y2.e
        public java.lang.String o(int i6) {
            f();
            android.database.Cursor cursorU = u();
            t(cursorU, i6);
            java.lang.String string = cursorU.getString(i6);
            p247y7.AbstractC7350t.e(string, "c.getString(index)");
            return string;
        }

        @Override // p243y2.e
        public boolean p() {
            f();
            s();
            android.database.Cursor cursor = this.f53833j;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }

        public void q() {
            f();
            this.f53828e = new int[0];
            this.f53829f = new long[0];
            this.f53830g = new double[0];
            this.f53831h = new java.lang.String[0];
            this.f53832i = new byte[0][];
        }
    }

    private static final class c extends p173r2.e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final p253z2.h f53835e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p253z2.d dVar, java.lang.String str) {
            super(dVar, str, null);
            p247y7.AbstractC7350t.f(dVar, "db");
            p247y7.AbstractC7350t.f(str, "sql");
            this.f53835e = dVar.J(str);
        }

        @Override // p243y2.e
        public void a() {
        }

        @Override // p243y2.e
        public void close() throws java.io.IOException {
            this.f53835e.close();
            e(true);
        }

        @Override // p243y2.e
        public int getColumnCount() {
            f();
            return 0;
        }

        @Override // p243y2.e
        public java.lang.String getColumnName(int i6) {
            f();
            p243y2.a.b(21, "no row");
            throw new p087i7.C6665k();
        }

        @Override // p243y2.e
        public long getLong(int i6) {
            f();
            p243y2.a.b(21, "no row");
            throw new p087i7.C6665k();
        }

        @Override // p243y2.e
        public boolean isNull(int i6) {
            f();
            p243y2.a.b(21, "no row");
            throw new p087i7.C6665k();
        }

        @Override // p243y2.e
        public void l(int i6, long j6) {
            f();
            this.f53835e.l(i6, j6);
        }

        @Override // p243y2.e
        public void n(int i6, java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "value");
            f();
            this.f53835e.C(i6, str);
        }

        @Override // p243y2.e
        public java.lang.String o(int i6) {
            f();
            p243y2.a.b(21, "no row");
            throw new p087i7.C6665k();
        }

        @Override // p243y2.e
        public boolean p() {
            f();
            this.f53835e.n();
            return false;
        }
    }

    private e(p253z2.d dVar, java.lang.String str) {
        this.f53824a = dVar;
        this.f53825b = str;
    }

    public /* synthetic */ e(p253z2.d dVar, java.lang.String str, p247y7.AbstractC7342k abstractC7342k) {
        this(dVar, str);
    }

    protected final p253z2.d b() {
        return this.f53824a;
    }

    protected final java.lang.String c() {
        return this.f53825b;
    }

    protected final boolean d() {
        return this.f53826c;
    }

    protected final void e(boolean z6) {
        this.f53826c = z6;
    }

    protected final void f() {
        if (this.f53826c) {
            p243y2.a.b(21, "statement is closed");
            throw new p087i7.C6665k();
        }
    }

    @Override // p243y2.e
    public /* synthetic */ int getInt(int i6) {
        return p243y2.d.b(this, i6);
    }

    @Override // p243y2.e
    public /* synthetic */ boolean m(int i6) {
        return p243y2.d.a(this, i6);
    }
}
