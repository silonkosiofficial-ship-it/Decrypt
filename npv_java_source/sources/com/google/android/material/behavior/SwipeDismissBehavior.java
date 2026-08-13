package com.google.android.material.behavior;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    J1.c f42856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42858c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42860e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f42859d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f42861f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f42862g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f42863h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f42864i = 0.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final J1.c.AbstractC0133c f42865j = new com.google.android.material.behavior.SwipeDismissBehavior.a();

    class a extends J1.c.AbstractC0133c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f42866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f42867b = -1;

        a() {
        }

        private boolean n(android.view.View view, float f6) {
            if (f6 == 0.0f) {
                return java.lang.Math.abs(view.getLeft() - this.f42866a) >= java.lang.Math.round(((float) view.getWidth()) * com.google.android.material.behavior.SwipeDismissBehavior.this.f42862g);
            }
            boolean z6 = androidx.core.view.X.z(view) == 1;
            int i6 = com.google.android.material.behavior.SwipeDismissBehavior.this.f42861f;
            if (i6 == 2) {
                return true;
            }
            if (i6 == 0) {
                if (z6) {
                    if (f6 >= 0.0f) {
                        return false;
                    }
                } else if (f6 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i6 != 1) {
                return false;
            }
            if (z6) {
                if (f6 <= 0.0f) {
                    return false;
                }
            } else if (f6 >= 0.0f) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001c  */
        /* JADX WARN: Code duplicated, block: B:9:0x0012  */
        @Override // J1.c.AbstractC0133c
        public int a(android.view.View view, int i6, int i10) {
            int width;
            int width2;
            boolean z6 = androidx.core.view.X.z(view) == 1;
            int i11 = com.google.android.material.behavior.SwipeDismissBehavior.this.f42861f;
            if (i11 == 0) {
                if (z6) {
                    width = this.f42866a - view.getWidth();
                    width2 = this.f42866a;
                } else {
                    width = this.f42866a;
                    width2 = view.getWidth() + width;
                }
            } else if (i11 != 1) {
                width = this.f42866a - view.getWidth();
                width2 = view.getWidth() + this.f42866a;
            } else if (z6) {
                width = this.f42866a;
                width2 = view.getWidth() + width;
            } else {
                width = this.f42866a - view.getWidth();
                width2 = this.f42866a;
            }
            return com.google.android.material.behavior.SwipeDismissBehavior.H(width, i6, width2);
        }

        @Override // J1.c.AbstractC0133c
        public int b(android.view.View view, int i6, int i10) {
            return view.getTop();
        }

        @Override // J1.c.AbstractC0133c
        public int d(android.view.View view) {
            return view.getWidth();
        }

        @Override // J1.c.AbstractC0133c
        public void i(android.view.View view, int i6) {
            this.f42867b = i6;
            this.f42866a = view.getLeft();
            android.view.ViewParent parent = view.getParent();
            if (parent != null) {
                com.google.android.material.behavior.SwipeDismissBehavior.this.f42858c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                com.google.android.material.behavior.SwipeDismissBehavior.this.f42858c = false;
            }
        }

        @Override // J1.c.AbstractC0133c
        public void j(int i6) {
            com.google.android.material.behavior.SwipeDismissBehavior.this.getClass();
        }

        @Override // J1.c.AbstractC0133c
        public void k(android.view.View view, int i6, int i10, int i11, int i12) {
            float width = view.getWidth() * com.google.android.material.behavior.SwipeDismissBehavior.this.f42863h;
            float width2 = view.getWidth() * com.google.android.material.behavior.SwipeDismissBehavior.this.f42864i;
            float fAbs = java.lang.Math.abs(i6 - this.f42866a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(com.google.android.material.behavior.SwipeDismissBehavior.G(0.0f, 1.0f - com.google.android.material.behavior.SwipeDismissBehavior.J(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        @Override // J1.c.AbstractC0133c
        public void l(android.view.View view, float f6, float f10) {
            int i6;
            boolean z6;
            this.f42867b = -1;
            int width = view.getWidth();
            if (n(view, f6)) {
                if (f6 >= 0.0f) {
                    int left = view.getLeft();
                    int i10 = this.f42866a;
                    if (left < i10) {
                        i6 = this.f42866a - width;
                    } else {
                        i6 = i10 + width;
                    }
                } else {
                    i6 = this.f42866a - width;
                }
                z6 = true;
            } else {
                i6 = this.f42866a;
                z6 = false;
            }
            if (com.google.android.material.behavior.SwipeDismissBehavior.this.f42856a.F(i6, view.getTop())) {
                androidx.core.view.X.f0(view, new com.google.android.material.behavior.SwipeDismissBehavior.c(view, z6));
            } else if (z6) {
                com.google.android.material.behavior.SwipeDismissBehavior.this.getClass();
            }
        }

        @Override // J1.c.AbstractC0133c
        public boolean m(android.view.View view, int i6) {
            int i10 = this.f42867b;
            return (i10 == -1 || i10 == i6) && com.google.android.material.behavior.SwipeDismissBehavior.this.F(view);
        }
    }

    class b implements C1.G {
        b() {
        }

        @Override // C1.G
        public boolean a(android.view.View view, C1.G.a aVar) {
            if (!com.google.android.material.behavior.SwipeDismissBehavior.this.F(view)) {
                return false;
            }
            boolean z6 = androidx.core.view.X.z(view) == 1;
            int i6 = com.google.android.material.behavior.SwipeDismissBehavior.this.f42861f;
            androidx.core.view.X.X(view, (!(i6 == 0 && z6) && (i6 != 1 || z6)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            com.google.android.material.behavior.SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    private class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final android.view.View f42870C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final boolean f42871D;

        c(android.view.View view, boolean z6) {
            this.f42870C = view;
            this.f42871D = z6;
        }

        @Override // java.lang.Runnable
        public void run() {
            J1.c cVar = com.google.android.material.behavior.SwipeDismissBehavior.this.f42856a;
            if (cVar != null && cVar.k(true)) {
                androidx.core.view.X.f0(this.f42870C, this);
            } else if (this.f42871D) {
                com.google.android.material.behavior.SwipeDismissBehavior.this.getClass();
            }
        }
    }

    static float G(float f6, float f10, float f11) {
        return java.lang.Math.min(java.lang.Math.max(f6, f10), f11);
    }

    static int H(int i6, int i10, int i11) {
        return java.lang.Math.min(java.lang.Math.max(i6, i10), i11);
    }

    private void I(android.view.ViewGroup viewGroup) {
        if (this.f42856a == null) {
            this.f42856a = this.f42860e ? J1.c.l(viewGroup, this.f42859d, this.f42865j) : J1.c.m(viewGroup, this.f42865j);
        }
    }

    static float J(float f6, float f10, float f11) {
        return (f11 - f6) / (f10 - f6);
    }

    private void N(android.view.View view) {
        androidx.core.view.X.h0(view, 1048576);
        if (F(view)) {
            androidx.core.view.X.j0(view, C1.B.a.f1259y, null, new com.google.android.material.behavior.SwipeDismissBehavior.b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.f42856a == null) {
            return false;
        }
        if (this.f42858c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f42856a.z(motionEvent);
        return true;
    }

    public boolean F(android.view.View view) {
        return true;
    }

    public void K(float f6) {
        this.f42864i = G(0.0f, f6, 1.0f);
    }

    public void L(float f6) {
        this.f42863h = G(0.0f, f6, 1.0f);
    }

    public void M(int i6) {
        this.f42861f = i6;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        boolean zB = this.f42857b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zB = coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f42857b = zB;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f42857b = false;
        }
        if (!zB) {
            return false;
        }
        I(coordinatorLayout);
        return !this.f42858c && this.f42856a.G(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6) {
        boolean zL = super.l(coordinatorLayout, view, i6);
        if (androidx.core.view.X.x(view) == 0) {
            androidx.core.view.X.w0(view, 1);
            N(view);
        }
        return zL;
    }
}
