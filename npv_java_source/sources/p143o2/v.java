package p143o2;

/* JADX INFO: loaded from: classes.dex */
public final class v implements p253z2.g, p253z2.f {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final o2.v.a f52515K = new o2.v.a(null);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final java.util.TreeMap f52516L = new java.util.TreeMap();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f52517C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private volatile java.lang.String f52518D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long[] f52519E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final double[] f52520F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final java.lang.String[] f52521G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final byte[][] f52522H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final int[] f52523I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f52524J;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p143o2.v a(java.lang.String str, int i6) {
            p247y7.AbstractC7350t.f(str, "query");
            java.util.TreeMap treeMap = p143o2.v.f52516L;
            synchronized (treeMap) {
                java.util.Map.Entry entryCeilingEntry = treeMap.ceilingEntry(java.lang.Integer.valueOf(i6));
                if (entryCeilingEntry == null) {
                    p087i7.M m6 = p087i7.M.f46721a;
                    p143o2.v vVar = new p143o2.v(i6, null);
                    vVar.o(str, i6);
                    return vVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                p143o2.v vVar2 = (p143o2.v) entryCeilingEntry.getValue();
                vVar2.o(str, i6);
                p247y7.AbstractC7350t.e(vVar2, "sqliteQuery");
                return vVar2;
            }
        }

        public final void b() {
            java.util.TreeMap treeMap = p143o2.v.f52516L;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            java.util.Iterator it = treeMap.descendingKeySet().iterator();
            p247y7.AbstractC7350t.e(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i6 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i6;
            }
        }
    }

    private v(int i6) {
        this.f52517C = i6;
        int i10 = i6 + 1;
        this.f52523I = new int[i10];
        this.f52519E = new long[i10];
        this.f52520F = new double[i10];
        this.f52521G = new java.lang.String[i10];
        this.f52522H = new byte[i10][];
    }

    public /* synthetic */ v(int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(i6);
    }

    public static final p143o2.v g(java.lang.String str, int i6) {
        return f52515K.a(str, i6);
    }

    @Override // p253z2.f
    public void C(int i6, java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "value");
        this.f52523I[i6] = 4;
        this.f52521G[i6] = str;
    }

    @Override // p253z2.f
    public void M0(int i6) {
        this.f52523I[i6] = 1;
    }

    @Override // p253z2.f
    public void P(int i6, double d6) {
        this.f52523I[i6] = 3;
        this.f52520F[i6] = d6;
    }

    @Override // p253z2.g
    public java.lang.String a() {
        java.lang.String str = this.f52518D;
        if (str != null) {
            return str;
        }
        throw new java.lang.IllegalStateException("Required value was null.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p253z2.g
    public void f(p253z2.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "statement");
        int i6 = i();
        if (1 > i6) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f52523I[i10];
            if (i11 == 1) {
                fVar.M0(i10);
            } else if (i11 == 2) {
                fVar.l(i10, this.f52519E[i10]);
            } else if (i11 == 3) {
                fVar.P(i10, this.f52520F[i10]);
            } else if (i11 == 4) {
                java.lang.String str = this.f52521G[i10];
                if (str == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                fVar.C(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f52522H[i10];
                if (bArr == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                fVar.p0(i10, bArr);
            }
            if (i10 == i6) {
                return;
            } else {
                i10++;
            }
        }
    }

    public int i() {
        return this.f52524J;
    }

    @Override // p253z2.f
    public void l(int i6, long j6) {
        this.f52523I[i6] = 2;
        this.f52519E[i6] = j6;
    }

    public final void o(java.lang.String str, int i6) {
        p247y7.AbstractC7350t.f(str, "query");
        this.f52518D = str;
        this.f52524J = i6;
    }

    @Override // p253z2.f
    public void p0(int i6, byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "value");
        this.f52523I[i6] = 5;
        this.f52522H[i6] = bArr;
    }

    public final void r() {
        java.util.TreeMap treeMap = f52516L;
        synchronized (treeMap) {
            treeMap.put(java.lang.Integer.valueOf(this.f52517C), this);
            f52515K.b();
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }
}
