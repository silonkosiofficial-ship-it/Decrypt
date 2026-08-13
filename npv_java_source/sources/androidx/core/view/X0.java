package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.core.view.X0.e f21687a;

    private static class a extends androidx.core.view.X0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final android.view.Window f21688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.core.view.L f21689b;

        a(android.view.Window window, androidx.core.view.L l6) {
            this.f21688a = window;
            this.f21689b = l6;
        }

        private void h(int i6) {
            if (i6 == 1) {
                i(4);
                j(1024);
            } else if (i6 == 2) {
                i(2);
            } else {
                if (i6 != 8) {
                    return;
                }
                this.f21689b.b();
            }
        }

        @Override // androidx.core.view.X0.e
        void e(int i6) {
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i6 & i10) != 0) {
                    h(i10);
                }
            }
        }

        protected void f(int i6) {
            android.view.View decorView = this.f21688a.getDecorView();
            decorView.setSystemUiVisibility(i6 | decorView.getSystemUiVisibility());
        }

        protected void g(int i6) {
            this.f21688a.addFlags(i6);
        }

        protected void i(int i6) {
            android.view.View decorView = this.f21688a.getDecorView();
            decorView.setSystemUiVisibility((~i6) & decorView.getSystemUiVisibility());
        }

        protected void j(int i6) {
            this.f21688a.clearFlags(i6);
        }
    }

    private static class b extends androidx.core.view.X0.a {
        b(android.view.Window window, androidx.core.view.L l6) {
            super(window, l6);
        }

        @Override // androidx.core.view.X0.e
        public boolean b() {
            return (this.f21688a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.X0.e
        public void d(boolean z6) {
            if (!z6) {
                i(8192);
                return;
            }
            j(67108864);
            g(Integer.MIN_VALUE);
            f(8192);
        }
    }

    private static class c extends androidx.core.view.X0.b {
        c(android.view.Window window, androidx.core.view.L l6) {
            super(window, l6);
        }

        @Override // androidx.core.view.X0.e
        public boolean a() {
            return (this.f21688a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.X0.e
        public void c(boolean z6) {
            if (!z6) {
                i(16);
                return;
            }
            j(134217728);
            g(Integer.MIN_VALUE);
            f(16);
        }
    }

    private static class d extends androidx.core.view.X0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.core.view.X0 f21690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.view.WindowInsetsController f21691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final androidx.core.view.L f21692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p170r.Y f21693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected android.view.Window f21694e;

        d(android.view.Window window, androidx.core.view.X0 x6, androidx.core.view.L l6) {
            this(window.getInsetsController(), x6, l6);
            this.f21694e = window;
        }

        d(android.view.WindowInsetsController windowInsetsController, androidx.core.view.X0 x6, androidx.core.view.L l6) {
            this.f21693d = new p170r.Y();
            this.f21691b = windowInsetsController;
            this.f21690a = x6;
            this.f21692c = l6;
        }

        @Override // androidx.core.view.X0.e
        public boolean a() {
            this.f21691b.setSystemBarsAppearance(0, 0);
            return (this.f21691b.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.X0.e
        public boolean b() {
            this.f21691b.setSystemBarsAppearance(0, 0);
            return (this.f21691b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.X0.e
        public void c(boolean z6) {
            if (z6) {
                if (this.f21694e != null) {
                    f(16);
                }
                this.f21691b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f21694e != null) {
                    g(16);
                }
                this.f21691b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.X0.e
        public void d(boolean z6) {
            if (z6) {
                if (this.f21694e != null) {
                    f(8192);
                }
                this.f21691b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f21694e != null) {
                    g(8192);
                }
                this.f21691b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.X0.e
        void e(int i6) {
            if ((i6 & 8) != 0) {
                this.f21692c.b();
            }
            this.f21691b.show(i6 & (-9));
        }

        protected void f(int i6) {
            android.view.View decorView = this.f21694e.getDecorView();
            decorView.setSystemUiVisibility(i6 | decorView.getSystemUiVisibility());
        }

        protected void g(int i6) {
            android.view.View decorView = this.f21694e.getDecorView();
            decorView.setSystemUiVisibility((~i6) & decorView.getSystemUiVisibility());
        }
    }

    private static class e {
        e() {
        }

        public boolean a() {
            return false;
        }

        public abstract boolean b();

        public void c(boolean z6) {
        }

        public abstract void d(boolean z6);

        abstract void e(int i6);
    }

    public X0(android.view.Window window, android.view.View view) {
        androidx.core.view.L l6 = new androidx.core.view.L(view);
        int i6 = android.os.Build.VERSION.SDK_INT;
        this.f21687a = i6 >= 30 ? new androidx.core.view.X0.d(window, this, l6) : i6 >= 26 ? new androidx.core.view.X0.c(window, l6) : new androidx.core.view.X0.b(window, l6);
    }

    private X0(android.view.WindowInsetsController windowInsetsController) {
        this.f21687a = new androidx.core.view.X0.d(windowInsetsController, this, new androidx.core.view.L(windowInsetsController));
    }

    public static androidx.core.view.X0 f(android.view.WindowInsetsController windowInsetsController) {
        return new androidx.core.view.X0(windowInsetsController);
    }

    public boolean a() {
        return this.f21687a.a();
    }

    public boolean b() {
        return this.f21687a.b();
    }

    public void c(boolean z6) {
        this.f21687a.c(z6);
    }

    public void d(boolean z6) {
        this.f21687a.d(z6);
    }

    public void e(int i6) {
        this.f21687a.e(i6);
    }
}
