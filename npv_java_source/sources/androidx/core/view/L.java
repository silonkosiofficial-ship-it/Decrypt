package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.core.view.L.c f21657a;

    /* JADX INFO: Access modifiers changed from: private */
    static class a extends androidx.core.view.L.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.view.View f21658a;

        a(android.view.View view) {
            this.f21658a = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(android.view.View view) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // androidx.core.view.L.c
        void a() {
            android.view.View view = this.f21658a;
            if (view != null) {
                ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f21658a.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.L.c
        void b() {
            final android.view.View viewFindViewById = this.f21658a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f21658a.getRootView().findViewById(android.R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new java.lang.Runnable() { // from class: androidx.core.view.K
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.view.L.a.d(viewFindViewById);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends androidx.core.view.L.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.view.View f21659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private android.view.WindowInsetsController f21660c;

        b(android.view.View view) {
            super(view);
            this.f21659b = view;
        }

        b(android.view.WindowInsetsController windowInsetsController) {
            super(null);
            this.f21660c = windowInsetsController;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, android.view.WindowInsetsController windowInsetsController, int i6) {
            atomicBoolean.set((i6 & 8) != 0);
        }

        @Override // androidx.core.view.L.a, androidx.core.view.L.c
        void a() {
            android.view.View view;
            android.view.WindowInsetsController windowInsetsController = this.f21660c;
            if (windowInsetsController == null) {
                android.view.View view2 = this.f21659b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
            android.view.WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new android.view.WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.T
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(android.view.WindowInsetsController windowInsetsController2, int i6) {
                    androidx.core.view.L.b.f(atomicBoolean, windowInsetsController2, i6);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f21659b) != null) {
                ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f21659b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(android.view.WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.L.a, androidx.core.view.L.c
        void b() {
            android.view.View view = this.f21659b;
            if (view != null && android.os.Build.VERSION.SDK_INT < 33) {
                ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            android.view.WindowInsetsController windowInsetsController = this.f21660c;
            if (windowInsetsController == null) {
                android.view.View view2 = this.f21659b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(android.view.WindowInsets.Type.ime());
            }
            super.b();
        }
    }

    private static class c {
        c() {
        }

        abstract void a();

        abstract void b();
    }

    public L(android.view.View view) {
        this.f21657a = android.os.Build.VERSION.SDK_INT >= 30 ? new androidx.core.view.L.b(view) : new androidx.core.view.L.a(view);
    }

    L(android.view.WindowInsetsController windowInsetsController) {
        this.f21657a = new androidx.core.view.L.b(windowInsetsController);
    }

    public void a() {
        this.f21657a.a();
    }

    public void b() {
        this.f21657a.b();
    }
}
