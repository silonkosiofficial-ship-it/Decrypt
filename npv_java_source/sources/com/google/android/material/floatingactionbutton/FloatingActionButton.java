package com.google.android.material.floatingactionbutton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FloatingActionButton extends com.google.android.material.internal.o implements p225w4.a, E4.n, androidx.coordinatorlayout.widget.CoordinatorLayout.b {

    protected static class BaseBehavior<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.graphics.Rect f43331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f43332b;

        public BaseBehavior() {
            this.f43332b = true;
        }

        public BaseBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p125m4.j.f50834P1);
            this.f43332b = typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f50842Q1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        private static boolean F(android.view.View view) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.f) {
                return ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) layoutParams).e() instanceof com.google.android.material.bottomsheet.BottomSheetBehavior;
            }
            return false;
        }

        private void G(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
            throw null;
        }

        private boolean J(android.view.View view, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
            throw null;
        }

        private boolean K(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
            if (!J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f43331a == null) {
                this.f43331a = new android.graphics.Rect();
            }
            android.graphics.Rect rect = this.f43331a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            int i6 = rect.bottom;
            appBarLayout.getMinimumHeightForVisibleOverlappingContent();
            throw null;
        }

        private boolean L(android.view.View view, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
            if (J(view, floatingActionButton)) {
                throw null;
            }
            return false;
        }

        public boolean E(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, android.graphics.Rect rect) {
            throw null;
        }

        public boolean H(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, android.view.View view) {
            if (view instanceof com.google.android.material.appbar.AppBarLayout) {
                K(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!F(view)) {
                return false;
            }
            L(view, floatingActionButton);
            return false;
        }

        public boolean I(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, int i6) {
            java.util.List listR = coordinatorLayout.r(floatingActionButton);
            int size = listR.size();
            for (int i10 = 0; i10 < size; i10++) {
                android.view.View view = (android.view.View) listR.get(i10);
                if (!(view instanceof com.google.android.material.appbar.AppBarLayout)) {
                    if (F(view) && L(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (K(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(floatingActionButton, i6);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.graphics.Rect rect) {
            androidx.appcompat.app.D.a(view);
            return E(coordinatorLayout, null, rect);
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

    public static class Behavior extends com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior<com.google.android.material.floatingactionbutton.FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean E(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, android.graphics.Rect rect) {
            return super.E(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean H(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, android.view.View view) {
            return super.H(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean I(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, int i6) {
            return super.I(coordinatorLayout, floatingActionButton, i6);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void g(androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar) {
            super.g(fVar);
        }
    }
}
