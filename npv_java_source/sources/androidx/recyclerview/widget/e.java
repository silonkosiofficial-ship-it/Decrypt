package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
final class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    static final java.lang.ThreadLocal f23392G = new java.lang.ThreadLocal();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    static java.util.Comparator f23393H = new androidx.recyclerview.widget.e.a();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    long f23395D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    long f23396E;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    java.util.ArrayList f23394C = new java.util.ArrayList();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.util.ArrayList f23397F = new java.util.ArrayList();

    class a implements java.util.Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(androidx.recyclerview.widget.e.c cVar, androidx.recyclerview.widget.e.c cVar2) {
            androidx.recyclerview.widget.RecyclerView recyclerView = cVar.f23405d;
            if ((recyclerView == null) != (cVar2.f23405d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z6 = cVar.f23402a;
            if (z6 != cVar2.f23402a) {
                return z6 ? -1 : 1;
            }
            int i6 = cVar2.f23403b - cVar.f23403b;
            if (i6 != 0) {
                return i6;
            }
            int i10 = cVar.f23404c - cVar2.f23404c;
            if (i10 != 0) {
                return i10;
            }
            return 0;
        }
    }

    static class b implements androidx.recyclerview.widget.RecyclerView.p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f23400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23401d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i6, int i10) {
            if (i6 < 0) {
                throw new java.lang.IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i10 < 0) {
                throw new java.lang.IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i11 = this.f23401d;
            int i12 = i11 * 2;
            int[] iArr = this.f23400c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f23400c = iArr2;
                java.util.Arrays.fill(iArr2, -1);
            } else if (i12 >= iArr.length) {
                int[] iArr3 = new int[i11 * 4];
                this.f23400c = iArr3;
                java.lang.System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f23400c;
            iArr4[i12] = i6;
            iArr4[i12 + 1] = i10;
            this.f23401d++;
        }

        void b() {
            int[] iArr = this.f23400c;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
            this.f23401d = 0;
        }

        void c(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z6) {
            this.f23401d = 0;
            int[] iArr = this.f23400c;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
            androidx.recyclerview.widget.RecyclerView.p pVar = recyclerView.f23056O;
            if (recyclerView.f23054N == null || pVar == null || !pVar.y0()) {
                return;
            }
            if (z6) {
                if (!recyclerView.f23038F.p()) {
                    pVar.u(recyclerView.f23054N.d(), this);
                }
            } else if (!recyclerView.l0()) {
                pVar.t(this.f23398a, this.f23399b, recyclerView.f23047J0, this);
            }
            int i6 = this.f23401d;
            if (i6 > pVar.f23185m) {
                pVar.f23185m = i6;
                pVar.f23186n = z6;
                recyclerView.f23034D.K();
            }
        }

        boolean d(int i6) {
            if (this.f23400c != null) {
                int i10 = this.f23401d * 2;
                for (int i11 = 0; i11 < i10; i11 += 2) {
                    if (this.f23400c[i11] == i6) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i6, int i10) {
            this.f23398a = i6;
            this.f23399b = i10;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f23402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView f23405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f23406e;

        c() {
        }

        public void a() {
            this.f23402a = false;
            this.f23403b = 0;
            this.f23404c = 0;
            this.f23405d = null;
            this.f23406e = 0;
        }
    }

    e() {
    }

    private void b() {
        androidx.recyclerview.widget.e.c cVar;
        int size = this.f23394C.size();
        int i6 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) this.f23394C.get(i10);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f23045I0.c(recyclerView, false);
                i6 += recyclerView.f23045I0.f23401d;
            }
        }
        this.f23397F.ensureCapacity(i6);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) this.f23394C.get(i12);
            if (recyclerView2.getWindowVisibility() == 0) {
                androidx.recyclerview.widget.e.b bVar = recyclerView2.f23045I0;
                int iAbs = java.lang.Math.abs(bVar.f23398a) + java.lang.Math.abs(bVar.f23399b);
                for (int i13 = 0; i13 < bVar.f23401d * 2; i13 += 2) {
                    if (i11 >= this.f23397F.size()) {
                        cVar = new androidx.recyclerview.widget.e.c();
                        this.f23397F.add(cVar);
                    } else {
                        cVar = (androidx.recyclerview.widget.e.c) this.f23397F.get(i11);
                    }
                    int[] iArr = bVar.f23400c;
                    int i14 = iArr[i13 + 1];
                    cVar.f23402a = i14 <= iAbs;
                    cVar.f23403b = iAbs;
                    cVar.f23404c = i14;
                    cVar.f23405d = recyclerView2;
                    cVar.f23406e = iArr[i13];
                    i11++;
                }
            }
        }
        java.util.Collections.sort(this.f23397F, f23393H);
    }

    private void c(androidx.recyclerview.widget.e.c cVar, long j6) {
        androidx.recyclerview.widget.RecyclerView.D dI = i(cVar.f23405d, cVar.f23406e, cVar.f23402a ? Long.MAX_VALUE : j6);
        if (dI == null || dI.f23131b == null || !dI.s() || dI.t()) {
            return;
        }
        h((androidx.recyclerview.widget.RecyclerView) dI.f23131b.get(), j6);
    }

    private void d(long j6) {
        for (int i6 = 0; i6 < this.f23397F.size(); i6++) {
            androidx.recyclerview.widget.e.c cVar = (androidx.recyclerview.widget.e.c) this.f23397F.get(i6);
            if (cVar.f23405d == null) {
                return;
            }
            c(cVar, j6);
            cVar.a();
        }
    }

    static boolean e(androidx.recyclerview.widget.RecyclerView recyclerView, int i6) {
        int iJ = recyclerView.f23040G.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            androidx.recyclerview.widget.RecyclerView.D dF0 = androidx.recyclerview.widget.RecyclerView.f0(recyclerView.f23040G.i(i10));
            if (dF0.f23132c == i6 && !dF0.t()) {
                return true;
            }
        }
        return false;
    }

    private void h(androidx.recyclerview.widget.RecyclerView recyclerView, long j6) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f23087i0 && recyclerView.f23040G.j() != 0) {
            recyclerView.U0();
        }
        androidx.recyclerview.widget.e.b bVar = recyclerView.f23045I0;
        bVar.c(recyclerView, true);
        if (bVar.f23401d != 0) {
            try {
                androidx.core.os.s.a("RV Nested Prefetch");
                recyclerView.f23047J0.f(recyclerView.f23054N);
                for (int i6 = 0; i6 < bVar.f23401d * 2; i6 += 2) {
                    i(recyclerView, bVar.f23400c[i6], j6);
                }
                androidx.core.os.s.b();
            } catch (java.lang.Throwable th) {
                androidx.core.os.s.b();
                throw th;
            }
        }
    }

    private androidx.recyclerview.widget.RecyclerView.D i(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, long j6) {
        if (e(recyclerView, i6)) {
            return null;
        }
        androidx.recyclerview.widget.RecyclerView.v vVar = recyclerView.f23034D;
        try {
            recyclerView.G0();
            androidx.recyclerview.widget.RecyclerView.D dI = vVar.I(i6, false, j6);
            if (dI != null) {
                if (!dI.s() || dI.t()) {
                    vVar.a(dI, false);
                } else {
                    vVar.B(dI.f23130a);
                }
            }
            return dI;
        } finally {
            recyclerView.I0(false);
        }
    }

    public void a(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f23394C.add(recyclerView);
    }

    void f(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10) {
        if (recyclerView.isAttachedToWindow() && this.f23395D == 0) {
            this.f23395D = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f23045I0.e(i6, i10);
    }

    void g(long j6) {
        b();
        d(j6);
    }

    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f23394C.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            androidx.core.os.s.a("RV Prefetch");
            if (!this.f23394C.isEmpty()) {
                int size = this.f23394C.size();
                long jMax = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) this.f23394C.get(i6);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = java.lang.Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(jMax) + this.f23396E);
                }
            }
        } finally {
            this.f23395D = 0L;
            androidx.core.os.s.b();
        }
    }
}
