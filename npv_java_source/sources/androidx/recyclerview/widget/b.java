package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.recyclerview.widget.b.InterfaceC0437b f23300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.recyclerview.widget.b.a f23301b = new androidx.recyclerview.widget.b.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.util.List f23302c = new java.util.ArrayList();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f23303a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.recyclerview.widget.b.a f23304b;

        a() {
        }

        private void c() {
            if (this.f23304b == null) {
                this.f23304b = new androidx.recyclerview.widget.b.a();
            }
        }

        void a(int i6) {
            if (i6 < 64) {
                this.f23303a &= ~(1 << i6);
                return;
            }
            androidx.recyclerview.widget.b.a aVar = this.f23304b;
            if (aVar != null) {
                aVar.a(i6 - 64);
            }
        }

        int b(int i6) {
            androidx.recyclerview.widget.b.a aVar = this.f23304b;
            if (aVar == null) {
                return i6 >= 64 ? java.lang.Long.bitCount(this.f23303a) : java.lang.Long.bitCount(this.f23303a & ((1 << i6) - 1));
            }
            return i6 < 64 ? java.lang.Long.bitCount(this.f23303a & ((1 << i6) - 1)) : aVar.b(i6 - 64) + java.lang.Long.bitCount(this.f23303a);
        }

        boolean d(int i6) {
            if (i6 < 64) {
                return (this.f23303a & (1 << i6)) != 0;
            }
            c();
            return this.f23304b.d(i6 - 64);
        }

        void e(int i6, boolean z6) {
            if (i6 >= 64) {
                c();
                this.f23304b.e(i6 - 64, z6);
                return;
            }
            long j6 = this.f23303a;
            boolean z10 = (Long.MIN_VALUE & j6) != 0;
            long j10 = (1 << i6) - 1;
            this.f23303a = ((j6 & (~j10)) << 1) | (j6 & j10);
            if (z6) {
                h(i6);
            } else {
                a(i6);
            }
            if (z10 || this.f23304b != null) {
                c();
                this.f23304b.e(0, z10);
            }
        }

        boolean f(int i6) {
            if (i6 >= 64) {
                c();
                return this.f23304b.f(i6 - 64);
            }
            long j6 = 1 << i6;
            long j10 = this.f23303a;
            boolean z6 = (j10 & j6) != 0;
            long j11 = j10 & (~j6);
            this.f23303a = j11;
            long j12 = j6 - 1;
            this.f23303a = (j11 & j12) | java.lang.Long.rotateRight((~j12) & j11, 1);
            androidx.recyclerview.widget.b.a aVar = this.f23304b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f23304b.f(0);
            }
            return z6;
        }

        void g() {
            this.f23303a = 0L;
            androidx.recyclerview.widget.b.a aVar = this.f23304b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i6) {
            if (i6 < 64) {
                this.f23303a |= 1 << i6;
            } else {
                c();
                this.f23304b.h(i6 - 64);
            }
        }

        public java.lang.String toString() {
            if (this.f23304b == null) {
                return java.lang.Long.toBinaryString(this.f23303a);
            }
            return this.f23304b.toString() + "xx" + java.lang.Long.toBinaryString(this.f23303a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    interface InterfaceC0437b {
        android.view.View a(int i6);

        void b(android.view.View view);

        int c();

        void d();

        int e(android.view.View view);

        androidx.recyclerview.widget.RecyclerView.D f(android.view.View view);

        void g(int i6);

        void h(android.view.View view);

        void i(android.view.View view, int i6);

        void j(int i6);

        void k(android.view.View view, int i6, android.view.ViewGroup.LayoutParams layoutParams);
    }

    b(androidx.recyclerview.widget.b.InterfaceC0437b interfaceC0437b) {
        this.f23300a = interfaceC0437b;
    }

    private int h(int i6) {
        if (i6 < 0) {
            return -1;
        }
        int iC = this.f23300a.c();
        int i10 = i6;
        while (i10 < iC) {
            int iB = i6 - (i10 - this.f23301b.b(i10));
            if (iB == 0) {
                while (this.f23301b.d(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += iB;
        }
        return -1;
    }

    private void l(android.view.View view) {
        this.f23302c.add(view);
        this.f23300a.b(view);
    }

    private boolean t(android.view.View view) {
        if (!this.f23302c.remove(view)) {
            return false;
        }
        this.f23300a.h(view);
        return true;
    }

    void a(android.view.View view, int i6, boolean z6) {
        int iC = i6 < 0 ? this.f23300a.c() : h(i6);
        this.f23301b.e(iC, z6);
        if (z6) {
            l(view);
        }
        this.f23300a.i(view, iC);
    }

    void b(android.view.View view, boolean z6) {
        a(view, -1, z6);
    }

    void c(android.view.View view, int i6, android.view.ViewGroup.LayoutParams layoutParams, boolean z6) {
        int iC = i6 < 0 ? this.f23300a.c() : h(i6);
        this.f23301b.e(iC, z6);
        if (z6) {
            l(view);
        }
        this.f23300a.k(view, iC, layoutParams);
    }

    void d(int i6) {
        int iH = h(i6);
        this.f23301b.f(iH);
        this.f23300a.g(iH);
    }

    android.view.View e(int i6) {
        int size = this.f23302c.size();
        for (int i10 = 0; i10 < size; i10++) {
            android.view.View view = (android.view.View) this.f23302c.get(i10);
            androidx.recyclerview.widget.RecyclerView.D dF = this.f23300a.f(view);
            if (dF.m() == i6 && !dF.t() && !dF.v()) {
                return view;
            }
        }
        return null;
    }

    android.view.View f(int i6) {
        return this.f23300a.a(h(i6));
    }

    int g() {
        return this.f23300a.c() - this.f23302c.size();
    }

    android.view.View i(int i6) {
        return this.f23300a.a(i6);
    }

    int j() {
        return this.f23300a.c();
    }

    void k(android.view.View view) {
        int iE = this.f23300a.e(view);
        if (iE >= 0) {
            this.f23301b.h(iE);
            l(view);
        } else {
            throw new java.lang.IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(android.view.View view) {
        int iE = this.f23300a.e(view);
        if (iE == -1 || this.f23301b.d(iE)) {
            return -1;
        }
        return iE - this.f23301b.b(iE);
    }

    boolean n(android.view.View view) {
        return this.f23302c.contains(view);
    }

    void o() {
        this.f23301b.g();
        for (int size = this.f23302c.size() - 1; size >= 0; size--) {
            this.f23300a.h((android.view.View) this.f23302c.get(size));
            this.f23302c.remove(size);
        }
        this.f23300a.d();
    }

    void p(android.view.View view) {
        int iE = this.f23300a.e(view);
        if (iE < 0) {
            return;
        }
        if (this.f23301b.f(iE)) {
            t(view);
        }
        this.f23300a.j(iE);
    }

    void q(int i6) {
        int iH = h(i6);
        android.view.View viewA = this.f23300a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f23301b.f(iH)) {
            t(viewA);
        }
        this.f23300a.j(iH);
    }

    boolean r(android.view.View view) {
        int iE = this.f23300a.e(view);
        if (iE == -1) {
            t(view);
            return true;
        }
        if (!this.f23301b.d(iE)) {
            return false;
        }
        this.f23301b.f(iE);
        t(view);
        this.f23300a.j(iE);
        return true;
    }

    void s(android.view.View view) {
        int iE = this.f23300a.e(view);
        if (iE < 0) {
            throw new java.lang.IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f23301b.d(iE)) {
            this.f23301b.a(iE);
            t(view);
        } else {
            throw new java.lang.RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public java.lang.String toString() {
        return this.f23301b.toString() + ", hidden list:" + this.f23302c.size();
    }
}
