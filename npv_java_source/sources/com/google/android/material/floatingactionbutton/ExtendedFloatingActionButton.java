package com.google.android.material.floatingactionbutton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ExtendedFloatingActionButton extends com.google.android.material.button.MaterialButton implements androidx.coordinatorlayout.widget.CoordinatorLayout.b {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final int f43323W = p125m4.i.f50708o;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static final android.util.Property f43324a0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.a(java.lang.Float.class, "width");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static final android.util.Property f43325b0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.b(java.lang.Float.class, "height");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    static final android.util.Property f43326c0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.c(java.lang.Float.class, "paddingStart");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    static final android.util.Property f43327d0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.d(java.lang.Float.class, "paddingEnd");

    protected static class ExtendedFloatingActionButtonBehavior<T extends com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.graphics.Rect f43328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f43329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f43330c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f43329b = false;
            this.f43330c = true;
        }

        public ExtendedFloatingActionButtonBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p125m4.j.f50802L1);
            this.f43329b = typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f50810M1, false);
            this.f43330c = typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f50818N1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        private static boolean G(android.view.View view) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.f) {
                return ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) layoutParams).e() instanceof com.google.android.material.bottomsheet.BottomSheetBehavior;
            }
            return false;
        }

        private boolean J(android.view.View view, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
            throw null;
        }

        private boolean L(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f43328a == null) {
                this.f43328a = new android.graphics.Rect();
            }
            android.graphics.Rect rect = this.f43328a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        private boolean M(android.view.View view, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (J(view, extendedFloatingActionButton)) {
                throw null;
            }
            return false;
        }

        protected void E(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j(extendedFloatingActionButton, this.f43330c ? 3 : 0, null);
        }

        public boolean F(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton, android.graphics.Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean H(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton, android.view.View view) {
            if (view instanceof com.google.android.material.appbar.AppBarLayout) {
                L(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!G(view)) {
                return false;
            }
            M(view, extendedFloatingActionButton);
            return false;
        }

        public boolean I(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton, int i6) {
            java.util.List listR = coordinatorLayout.r(extendedFloatingActionButton);
            int size = listR.size();
            for (int i10 = 0; i10 < size; i10++) {
                android.view.View view = (android.view.View) listR.get(i10);
                if (!(view instanceof com.google.android.material.appbar.AppBarLayout)) {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (L(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i6);
            return true;
        }

        protected void K(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j(extendedFloatingActionButton, this.f43330c ? 2 : 1, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.graphics.Rect rect) {
            androidx.appcompat.app.D.a(view);
            return F(coordinatorLayout, null, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar) {
            if (fVar.f21347h == 0) {
                fVar.f21347h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            androidx.appcompat.app.D.a(view);
            return H(coordinatorLayout, null, view2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6) {
            androidx.appcompat.app.D.a(view);
            return I(coordinatorLayout, null, i6);
        }
    }

    class a extends android.util.Property {
        a(java.lang.Class cls, java.lang.String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(android.view.View view, java.lang.Float f6) {
            view.getLayoutParams().width = f6.intValue();
            view.requestLayout();
        }
    }

    class b extends android.util.Property {
        b(java.lang.Class cls, java.lang.String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(android.view.View view, java.lang.Float f6) {
            view.getLayoutParams().height = f6.intValue();
            view.requestLayout();
        }
    }

    class c extends android.util.Property {
        c(java.lang.Class cls, java.lang.String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(androidx.core.view.X.E(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(android.view.View view, java.lang.Float f6) {
            androidx.core.view.X.B0(view, f6.intValue(), view.getPaddingTop(), androidx.core.view.X.D(view), view.getPaddingBottom());
        }
    }

    class d extends android.util.Property {
        d(java.lang.Class cls, java.lang.String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(androidx.core.view.X.D(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(android.view.View view, java.lang.Float f6) {
            androidx.core.view.X.B0(view, androidx.core.view.X.E(view), view.getPaddingTop(), f6.intValue(), view.getPaddingBottom());
        }
    }

    public static abstract class e {
    }

    static /* synthetic */ void j(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton, int i6, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.e eVar) {
        throw null;
    }
}
