package com.google.android.material.bottomappbar;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BottomAppBar extends androidx.appcompat.widget.Toolbar implements androidx.coordinatorlayout.widget.CoordinatorLayout.b {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final int f42874y0 = p125m4.i.f50702i;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final int f42875z0 = p125m4.a.f50483A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private static final int f42873A0 = p125m4.a.f50490H;

    public static class Behavior extends com.google.android.material.behavior.HideBottomViewOnScrollBehavior<com.google.android.material.bottomappbar.BottomAppBar> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final android.graphics.Rect f42876m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private java.lang.ref.WeakReference f42877n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f42878o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final android.view.View.OnLayoutChangeListener f42879p;

        class a implements android.view.View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(android.view.View view, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                androidx.appcompat.app.D.a(com.google.android.material.bottomappbar.BottomAppBar.Behavior.this.f42877n.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f42879p = new com.google.android.material.bottomappbar.BottomAppBar.Behavior.a();
            this.f42876m = new android.graphics.Rect();
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f42879p = new com.google.android.material.bottomappbar.BottomAppBar.Behavior.a();
            this.f42876m = new android.graphics.Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean A(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i6, int i10) {
            androidx.appcompat.app.D.a(view);
            return P(coordinatorLayout, null, view2, view3, i6, i10);
        }

        public boolean O(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.bottomappbar.BottomAppBar bottomAppBar, int i6) {
            this.f42877n = new java.lang.ref.WeakReference(bottomAppBar);
            android.view.View viewU = com.google.android.material.bottomappbar.BottomAppBar.U(bottomAppBar);
            if (viewU != null && !androidx.core.view.X.R(viewU)) {
                com.google.android.material.bottomappbar.BottomAppBar.W(bottomAppBar, viewU);
                this.f42878o = ((android.view.ViewGroup.MarginLayoutParams) ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) viewU.getLayoutParams())).bottomMargin;
                viewU.addOnLayoutChangeListener(this.f42879p);
                com.google.android.material.bottomappbar.BottomAppBar.T(bottomAppBar);
            }
            coordinatorLayout.I(bottomAppBar, i6);
            return super.l(coordinatorLayout, bottomAppBar, i6);
        }

        public boolean P(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.bottomappbar.BottomAppBar bottomAppBar, android.view.View view, android.view.View view2, int i6, int i10) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6) {
            androidx.appcompat.app.D.a(view);
            return O(coordinatorLayout, null, i6);
        }
    }

    static /* synthetic */ void T(com.google.android.material.bottomappbar.BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ android.view.View U(com.google.android.material.bottomappbar.BottomAppBar bottomAppBar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void W(com.google.android.material.bottomappbar.BottomAppBar bottomAppBar, android.view.View view) {
        ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) view.getLayoutParams()).f21343d = 17;
        throw null;
    }
}
