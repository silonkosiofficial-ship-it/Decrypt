package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes3.dex */
public class AppBarLayout extends android.widget.LinearLayout implements androidx.coordinatorlayout.widget.CoordinatorLayout.b {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final int f42756e0 = p125m4.i.f50697d;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f42757C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f42758D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f42759E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f42760F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f42761G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f42762H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private androidx.core.view.C2038y0 f42763I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private java.util.List f42764J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f42765K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f42766L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f42767M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f42768N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f42769O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private java.lang.ref.WeakReference f42770P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final boolean f42771Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private android.animation.ValueAnimator f42772R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private android.animation.ValueAnimator.AnimatorUpdateListener f42773S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final java.util.List f42774T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final long f42775U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final android.animation.TimeInterpolator f42776V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int[] f42777W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private android.graphics.drawable.Drawable f42778a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private java.lang.Integer f42779b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final float f42780c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private com.google.android.material.appbar.AppBarLayout.Behavior f42781d0;

    protected static class BaseBehavior<T extends com.google.android.material.appbar.AppBarLayout> extends com.google.android.material.appbar.d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f42782k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f42783l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private android.animation.ValueAnimator f42784m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private com.google.android.material.appbar.AppBarLayout.BaseBehavior.c f42785n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private java.lang.ref.WeakReference f42786o;

        class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f42787a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.google.android.material.appbar.AppBarLayout f42788b;

            a(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout) {
                this.f42787a = coordinatorLayout;
                this.f42788b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.material.appbar.AppBarLayout.BaseBehavior.this.P(this.f42787a, this.f42788b, ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends androidx.core.view.C1990a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.google.android.material.appbar.AppBarLayout f42790d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f42791e;

            b(com.google.android.material.appbar.AppBarLayout appBarLayout, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
                this.f42790d = appBarLayout;
                this.f42791e = coordinatorLayout;
            }

            @Override // androidx.core.view.C1990a
            public void g(android.view.View view, C1.B b6) {
                android.view.View viewF0;
                super.g(view, b6);
                b6.m0(android.widget.ScrollView.class.getName());
                if (this.f42790d.getTotalScrollRange() == 0 || (viewF0 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.this.f0(this.f42791e)) == null || !com.google.android.material.appbar.AppBarLayout.BaseBehavior.this.b0(this.f42790d)) {
                    return;
                }
                if (com.google.android.material.appbar.AppBarLayout.BaseBehavior.this.M() != (-this.f42790d.getTotalScrollRange())) {
                    b6.b(C1.B.a.f1251q);
                    b6.N0(true);
                }
                if (com.google.android.material.appbar.AppBarLayout.BaseBehavior.this.M() != 0) {
                    if (viewF0.canScrollVertically(-1) && (-this.f42790d.getDownNestedPreScrollRange()) == 0) {
                        return;
                    }
                    b6.b(C1.B.a.f1252r);
                    b6.N0(true);
                }
            }

            @Override // androidx.core.view.C1990a
            public boolean j(android.view.View view, int i6, android.os.Bundle bundle) {
                if (i6 == 4096) {
                    this.f42790d.setExpanded(false);
                    return true;
                }
                if (i6 != 8192) {
                    return super.j(view, i6, bundle);
                }
                if (com.google.android.material.appbar.AppBarLayout.BaseBehavior.this.M() != 0) {
                    android.view.View viewF0 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.this.f0(this.f42791e);
                    if (!viewF0.canScrollVertically(-1)) {
                        this.f42790d.setExpanded(true);
                        return true;
                    }
                    int i10 = -this.f42790d.getDownNestedPreScrollRange();
                    if (i10 != 0) {
                        com.google.android.material.appbar.AppBarLayout.BaseBehavior.this.q(this.f42791e, this.f42790d, viewF0, 0, i10, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        protected static class c extends I1.a {
            public static final android.os.Parcelable.Creator<com.google.android.material.appbar.AppBarLayout.BaseBehavior.c> CREATOR = new com.google.android.material.appbar.AppBarLayout.BaseBehavior.c.a();

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            boolean f42793E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            boolean f42794F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f42795G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            float f42796H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            boolean f42797I;

            class a implements android.os.Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public com.google.android.material.appbar.AppBarLayout.BaseBehavior.c createFromParcel(android.os.Parcel parcel) {
                    return new com.google.android.material.appbar.AppBarLayout.BaseBehavior.c(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public com.google.android.material.appbar.AppBarLayout.BaseBehavior.c createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                    return new com.google.android.material.appbar.AppBarLayout.BaseBehavior.c(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public com.google.android.material.appbar.AppBarLayout.BaseBehavior.c[] newArray(int i6) {
                    return new com.google.android.material.appbar.AppBarLayout.BaseBehavior.c[i6];
                }
            }

            public c(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f42793E = parcel.readByte() != 0;
                this.f42794F = parcel.readByte() != 0;
                this.f42795G = parcel.readInt();
                this.f42796H = parcel.readFloat();
                this.f42797I = parcel.readByte() != 0;
            }

            public c(android.os.Parcelable parcelable) {
                super(parcelable);
            }

            @Override // I1.a, android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i6) {
                super.writeToParcel(parcel, i6);
                parcel.writeByte(this.f42793E ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f42794F ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f42795G);
                parcel.writeFloat(this.f42796H);
                parcel.writeByte(this.f42797I ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private void U(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout) {
            if (androidx.core.view.X.M(coordinatorLayout)) {
                return;
            }
            androidx.core.view.X.n0(coordinatorLayout, new com.google.android.material.appbar.AppBarLayout.BaseBehavior.b(appBarLayout, coordinatorLayout));
        }

        private void V(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i6, float f6) {
            int iAbs = java.lang.Math.abs(M() - i6);
            float fAbs = java.lang.Math.abs(f6);
            W(coordinatorLayout, appBarLayout, i6, fAbs > 0.0f ? java.lang.Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        private void W(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i6, int i10) {
            int iM = M();
            if (iM == i6) {
                android.animation.ValueAnimator valueAnimator = this.f42784m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f42784m.cancel();
                return;
            }
            android.animation.ValueAnimator valueAnimator2 = this.f42784m;
            if (valueAnimator2 == null) {
                android.animation.ValueAnimator valueAnimator3 = new android.animation.ValueAnimator();
                this.f42784m = valueAnimator3;
                valueAnimator3.setInterpolator(p135n4.a.f51494e);
                this.f42784m.addUpdateListener(new com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f42784m.setDuration(java.lang.Math.min(i10, 600));
            this.f42784m.setIntValues(iM, i6);
            this.f42784m.start();
        }

        private int X(int i6, int i10, int i11) {
            return i6 < (i10 + i11) / 2 ? i10 : i11;
        }

        private boolean Z(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view) {
            return appBarLayout.k() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        private static boolean a0(int i6, int i10) {
            return (i6 & i10) == i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b0(com.google.android.material.appbar.AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                if (((com.google.android.material.appbar.AppBarLayout.d) appBarLayout.getChildAt(i6).getLayoutParams()).f42801a != 0) {
                    return true;
                }
            }
            return false;
        }

        private android.view.View c0(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                android.view.View childAt = coordinatorLayout.getChildAt(i6);
                if ((childAt instanceof androidx.core.view.B) || (childAt instanceof android.widget.AbsListView) || (childAt instanceof android.widget.ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static android.view.View d0(com.google.android.material.appbar.AppBarLayout appBarLayout, int i6) {
            int iAbs = java.lang.Math.abs(i6);
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                android.view.View childAt = appBarLayout.getChildAt(i10);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int e0(com.google.android.material.appbar.AppBarLayout appBarLayout, int i6) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                android.view.View childAt = appBarLayout.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                com.google.android.material.appbar.AppBarLayout.d dVar = (com.google.android.material.appbar.AppBarLayout.d) childAt.getLayoutParams();
                if (a0(dVar.c(), 32)) {
                    top -= ((android.widget.LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((android.widget.LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i11 = -i6;
                if (top <= i11 && bottom >= i11) {
                    return i10;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public android.view.View f0(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                android.view.View childAt = coordinatorLayout.getChildAt(i6);
                if (((androidx.coordinatorlayout.widget.CoordinatorLayout.f) childAt.getLayoutParams()).e() instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(com.google.android.material.appbar.AppBarLayout appBarLayout, int i6) {
            int iAbs = java.lang.Math.abs(i6);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                android.view.View childAt = appBarLayout.getChildAt(i10);
                com.google.android.material.appbar.AppBarLayout.d dVar = (com.google.android.material.appbar.AppBarLayout.d) childAt.getLayoutParams();
                android.view.animation.Interpolator interpolatorD = dVar.d();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (interpolatorD == null) {
                        break;
                    }
                    int iC = dVar.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((android.widget.LinearLayout.LayoutParams) dVar).topMargin + ((android.widget.LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= androidx.core.view.X.A(childAt);
                        }
                    }
                    if (androidx.core.view.X.w(childAt)) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f6 = topInset;
                    return java.lang.Integer.signum(i6) * (childAt.getTop() + java.lang.Math.round(f6 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f6)));
                }
            }
            return i6;
        }

        private boolean v0(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout) {
            java.util.List listS = coordinatorLayout.s(appBarLayout);
            int size = listS.size();
            for (int i6 = 0; i6 < size; i6++) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE = ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) ((android.view.View) listS.get(i6)).getLayoutParams()).e();
                if (cVarE instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) {
                    return ((com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) cVarE).K() != 0;
                }
            }
            return false;
        }

        private void w0(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iM = M() - topInset;
            int iE0 = e0(appBarLayout, iM);
            if (iE0 >= 0) {
                android.view.View childAt = appBarLayout.getChildAt(iE0);
                com.google.android.material.appbar.AppBarLayout.d dVar = (com.google.android.material.appbar.AppBarLayout.d) childAt.getLayoutParams();
                int iC = dVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iA = -childAt.getBottom();
                    if (iE0 == 0 && androidx.core.view.X.w(appBarLayout) && androidx.core.view.X.w(childAt)) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (a0(iC, 2)) {
                        iA += androidx.core.view.X.A(childAt);
                    } else if (a0(iC, 5)) {
                        int iA2 = androidx.core.view.X.A(childAt) + iA;
                        if (iM < iA2) {
                            topInset2 = iA2;
                        } else {
                            iA = iA2;
                        }
                    }
                    if (a0(iC, 32)) {
                        topInset2 += ((android.widget.LinearLayout.LayoutParams) dVar).topMargin;
                        iA -= ((android.widget.LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    V(coordinatorLayout, appBarLayout, p222w1.a.b(X(iM, iA, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void x0(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i6, int i10, boolean z6) {
            android.view.View viewD0 = d0(appBarLayout, i6);
            boolean zB = false;
            if (viewD0 != null) {
                int iC = ((com.google.android.material.appbar.AppBarLayout.d) viewD0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int iA = androidx.core.view.X.A(viewD0);
                    if (i10 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i6) < (viewD0.getBottom() - iA) - appBarLayout.getTopInset()) : (-i6) >= (viewD0.getBottom() - iA) - appBarLayout.getTopInset()) {
                        zB = true;
                    }
                }
            }
            if (appBarLayout.o()) {
                zB = appBarLayout.B(c0(coordinatorLayout));
            }
            boolean zY = appBarLayout.y(zB);
            if (z6 || (zY && v0(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.d
        int M() {
            return E() + this.f42782k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public boolean H(com.google.android.material.appbar.AppBarLayout appBarLayout) {
            java.lang.ref.WeakReference weakReference = this.f42786o;
            if (weakReference == null) {
                return true;
            }
            android.view.View view = (android.view.View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public int K(com.google.android.material.appbar.AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
        public int L(com.google.android.material.appbar.AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
        public void N(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout) {
            w0(coordinatorLayout, appBarLayout);
            if (appBarLayout.o()) {
                appBarLayout.y(appBarLayout.B(c0(coordinatorLayout)));
            }
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0022  */
        @Override // com.google.android.material.appbar.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i6) {
            int i10;
            boolean zL = super.l(coordinatorLayout, appBarLayout, i6);
            int pendingAction = appBarLayout.getPendingAction();
            com.google.android.material.appbar.AppBarLayout.BaseBehavior.c cVar = this.f42785n;
            if (cVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z6 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        i10 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z6) {
                            V(coordinatorLayout, appBarLayout, i10, 0.0f);
                        } else {
                            P(coordinatorLayout, appBarLayout, i10);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z6) {
                            V(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            P(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (cVar.f42793E) {
                i10 = -appBarLayout.getTotalScrollRange();
                P(coordinatorLayout, appBarLayout, i10);
            } else if (cVar.f42794F) {
                P(coordinatorLayout, appBarLayout, 0);
            } else {
                android.view.View childAt = appBarLayout.getChildAt(cVar.f42795G);
                P(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f42785n.f42797I ? androidx.core.view.X.A(childAt) + appBarLayout.getTopInset() : java.lang.Math.round(childAt.getHeight() * this.f42785n.f42796H)));
            }
            appBarLayout.u();
            this.f42785n = null;
            G(p222w1.a.b(E(), -appBarLayout.getTotalScrollRange(), 0));
            x0(coordinatorLayout, appBarLayout, E(), 0, true);
            appBarLayout.s(E());
            U(coordinatorLayout, appBarLayout);
            return zL;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public boolean m(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i6, int i10, int i11, int i12) {
            if (((android.view.ViewGroup.MarginLayoutParams) ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return super.m(coordinatorLayout, appBarLayout, i6, i10, i11, i12);
            }
            coordinatorLayout.J(appBarLayout, i6, i10, android.view.View.MeasureSpec.makeMeasureSpec(0, 0), i12);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
        public void q(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i6, int i10, int[] iArr, int i11) {
            int i12;
            int downNestedPreScrollRange;
            if (i10 != 0) {
                if (i10 < 0) {
                    i12 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i12;
                } else {
                    i12 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i13 = i12;
                int i14 = downNestedPreScrollRange;
                if (i13 != i14) {
                    iArr[1] = O(coordinatorLayout, appBarLayout, i10, i13, i14);
                }
            }
            if (appBarLayout.o()) {
                appBarLayout.y(appBarLayout.B(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void t(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
            if (i12 < 0) {
                iArr[1] = O(coordinatorLayout, appBarLayout, i12, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i12 == 0) {
                U(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
        public void x(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.os.Parcelable parcelable) {
            if (parcelable instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior.c) {
                s0((com.google.android.material.appbar.AppBarLayout.BaseBehavior.c) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f42785n.a());
            } else {
                super.x(coordinatorLayout, appBarLayout, parcelable);
                this.f42785n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public android.os.Parcelable y(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout) {
            android.os.Parcelable parcelableY = super.y(coordinatorLayout, appBarLayout);
            com.google.android.material.appbar.AppBarLayout.BaseBehavior.c cVarT0 = t0(parcelableY, appBarLayout);
            return cVarT0 == null ? parcelableY : cVarT0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
        public boolean A(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, android.view.View view2, int i6, int i10) {
            android.animation.ValueAnimator valueAnimator;
            boolean z6 = (i6 & 2) != 0 && (appBarLayout.o() || Z(coordinatorLayout, appBarLayout, view));
            if (z6 && (valueAnimator = this.f42784m) != null) {
                valueAnimator.cancel();
            }
            this.f42786o = null;
            this.f42783l = i10;
            return z6;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void C(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i6) {
            if (this.f42783l == 0 || i6 == 1) {
                w0(coordinatorLayout, appBarLayout);
                if (appBarLayout.o()) {
                    appBarLayout.y(appBarLayout.B(view));
                }
            }
            this.f42786o = new java.lang.ref.WeakReference(view);
        }

        void s0(com.google.android.material.appbar.AppBarLayout.BaseBehavior.c cVar, boolean z6) {
            if (this.f42785n == null || z6) {
                this.f42785n = cVar;
            }
        }

        com.google.android.material.appbar.AppBarLayout.BaseBehavior.c t0(android.os.Parcelable parcelable, com.google.android.material.appbar.AppBarLayout appBarLayout) {
            int iE = E();
            int childCount = appBarLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                android.view.View childAt = appBarLayout.getChildAt(i6);
                int bottom = childAt.getBottom() + iE;
                if (childAt.getTop() + iE <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = I1.a.f4936D;
                    }
                    com.google.android.material.appbar.AppBarLayout.BaseBehavior.c cVar = new com.google.android.material.appbar.AppBarLayout.BaseBehavior.c(parcelable);
                    boolean z6 = iE == 0;
                    cVar.f42794F = z6;
                    cVar.f42793E = !z6 && (-iE) >= appBarLayout.getTotalScrollRange();
                    cVar.f42795G = i6;
                    cVar.f42797I = bottom == androidx.core.view.X.A(childAt) + appBarLayout.getTopInset();
                    cVar.f42796H = bottom / childAt.getHeight();
                    return cVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public int Q(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i6, int i10, int i11) {
            int iM = M();
            int i12 = 0;
            if (i10 == 0 || iM < i10 || iM > i11) {
                this.f42782k = 0;
            } else {
                int iB = p222w1.a.b(i6, i10, i11);
                if (iM != iB) {
                    int iI0 = appBarLayout.i() ? i0(appBarLayout, iB) : iB;
                    boolean zG = G(iI0);
                    int i13 = iM - iB;
                    this.f42782k = iB - iI0;
                    if (zG) {
                        while (i12 < appBarLayout.getChildCount()) {
                            com.google.android.material.appbar.AppBarLayout.d dVar = (com.google.android.material.appbar.AppBarLayout.d) appBarLayout.getChildAt(i12).getLayoutParams();
                            com.google.android.material.appbar.AppBarLayout.b bVarB = dVar.b();
                            if (bVarB != null && (dVar.c() & 1) != 0) {
                                bVarB.a(appBarLayout, appBarLayout.getChildAt(i12), E());
                            }
                            i12++;
                        }
                    }
                    if (!zG && appBarLayout.i()) {
                        coordinatorLayout.f(appBarLayout);
                    }
                    appBarLayout.s(E());
                    x0(coordinatorLayout, appBarLayout, iB, iB < iM ? -1 : 1, false);
                    i12 = i13;
                }
            }
            U(coordinatorLayout, appBarLayout);
            return i12;
        }
    }

    public static class Behavior extends com.google.android.material.appbar.AppBarLayout.BaseBehavior<com.google.android.material.appbar.AppBarLayout> {
        public Behavior() {
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ boolean G(int i6) {
            return super.G(i6);
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: k0 */
        public /* bridge */ /* synthetic */ boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i6) {
            return super.l(coordinatorLayout, appBarLayout, i6);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: l0 */
        public /* bridge */ /* synthetic */ boolean m(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i6, int i10, int i11, int i12) {
            return super.m(coordinatorLayout, appBarLayout, i6, i10, i11, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: m0 */
        public /* bridge */ /* synthetic */ void q(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i6, int i10, int[] iArr, int i11) {
            super.q(coordinatorLayout, appBarLayout, view, i6, i10, iArr, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: n0 */
        public /* bridge */ /* synthetic */ void t(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i6, i10, i11, i12, i13, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o0 */
        public /* bridge */ /* synthetic */ void x(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.os.Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: p0 */
        public /* bridge */ /* synthetic */ android.os.Parcelable y(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean A(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, android.view.View view2, int i6, int i10) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i6, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: r0 */
        public /* bridge */ /* synthetic */ void C(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i6) {
            super.C(coordinatorLayout, appBarLayout, view, i6);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.e {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p125m4.j.f50773H4);
            O(typedArrayObtainStyledAttributes.getDimensionPixelSize(p125m4.j.f50781I4, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        private static int R(com.google.android.material.appbar.AppBarLayout appBarLayout) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE = ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) appBarLayout.getLayoutParams()).e();
            if (cVarE instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior) {
                return ((com.google.android.material.appbar.AppBarLayout.BaseBehavior) cVarE).M();
            }
            return 0;
        }

        private void S(android.view.View view, android.view.View view2) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.c cVarE = ((androidx.coordinatorlayout.widget.CoordinatorLayout.f) view2.getLayoutParams()).e();
            if (cVarE instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior) {
                androidx.core.view.X.Y(view, (((view2.getBottom() - view.getTop()) + ((com.google.android.material.appbar.AppBarLayout.BaseBehavior) cVarE).f42782k) + M()) - I(view2));
            }
        }

        private void T(android.view.View view, android.view.View view2) {
            if (view2 instanceof com.google.android.material.appbar.AppBarLayout) {
                com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view2;
                if (appBarLayout.o()) {
                    appBarLayout.y(appBarLayout.B(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.e
        float J(android.view.View view) {
            int i6;
            if (view instanceof com.google.android.material.appbar.AppBarLayout) {
                com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iR = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iR > downNestedPreScrollRange) && (i6 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iR / i6) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.e
        int L(android.view.View view) {
            return view instanceof com.google.android.material.appbar.AppBarLayout ? ((com.google.android.material.appbar.AppBarLayout) view).getTotalScrollRange() : super.L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.e
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public com.google.android.material.appbar.AppBarLayout H(java.util.List list) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                android.view.View view = (android.view.View) list.get(i6);
                if (view instanceof com.google.android.material.appbar.AppBarLayout) {
                    return (com.google.android.material.appbar.AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            return view2 instanceof com.google.android.material.appbar.AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            if (view2 instanceof com.google.android.material.appbar.AppBarLayout) {
                androidx.core.view.X.n0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6) {
            return super.l(coordinatorLayout, view, i6);
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6, int i10, int i11, int i12) {
            return super.m(coordinatorLayout, view, i6, i10, i11, i12);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.graphics.Rect rect, boolean z6) {
            com.google.android.material.appbar.AppBarLayout appBarLayoutH = H(coordinatorLayout.r(view));
            if (appBarLayoutH != null) {
                android.graphics.Rect rect2 = new android.graphics.Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                android.graphics.Rect rect3 = this.f42828d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutH.v(false, !z6);
                    return true;
                }
            }
            return false;
        }
    }

    class a implements androidx.core.view.G {
        a() {
        }

        @Override // androidx.core.view.G
        public androidx.core.view.C2038y0 a(android.view.View view, androidx.core.view.C2038y0 c2038y0) {
            return com.google.android.material.appbar.AppBarLayout.this.t(c2038y0);
        }
    }

    public static abstract class b {
        public abstract void a(com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, float f6);
    }

    public static class c extends com.google.android.material.appbar.AppBarLayout.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.graphics.Rect f42799a = new android.graphics.Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.graphics.Rect f42800b = new android.graphics.Rect();

        private static void b(android.graphics.Rect rect, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, float f6) {
            b(this.f42799a, appBarLayout, view);
            float fAbs = this.f42799a.top - java.lang.Math.abs(f6);
            if (fAbs > 0.0f) {
                androidx.core.view.X.u0(view, null);
                view.setTranslationY(0.0f);
                view.setVisibility(0);
                return;
            }
            float fA = 1.0f - p222w1.a.a(java.lang.Math.abs(fAbs / this.f42799a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f42799a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f42800b);
            this.f42800b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f42800b.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            androidx.core.view.X.u0(view, this.f42800b);
        }
    }

    public static class d extends android.widget.LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f42801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.android.material.appbar.AppBarLayout.b f42802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.view.animation.Interpolator f42803c;

        public d(int i6, int i10) {
            super(i6, i10);
            this.f42801a = 1;
        }

        public d(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f42801a = 1;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p125m4.j.f51087v);
            this.f42801a = typedArrayObtainStyledAttributes.getInt(p125m4.j.f51103x, 0);
            f(typedArrayObtainStyledAttributes.getInt(p125m4.j.f51095w, 0));
            if (typedArrayObtainStyledAttributes.hasValue(p125m4.j.f51110y)) {
                this.f42803c = android.view.animation.AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(p125m4.j.f51110y, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public d(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f42801a = 1;
        }

        public d(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f42801a = 1;
        }

        public d(android.widget.LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f42801a = 1;
        }

        private com.google.android.material.appbar.AppBarLayout.b a(int i6) {
            if (i6 != 1) {
                return null;
            }
            return new com.google.android.material.appbar.AppBarLayout.c();
        }

        public com.google.android.material.appbar.AppBarLayout.b b() {
            return this.f42802b;
        }

        public int c() {
            return this.f42801a;
        }

        public android.view.animation.Interpolator d() {
            return this.f42803c;
        }

        boolean e() {
            int i6 = this.f42801a;
            return (i6 & 1) == 1 && (i6 & 10) != 0;
        }

        public void f(int i6) {
            this.f42802b = a(i6);
        }
    }

    public AppBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p125m4.a.f50508b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        int i10 = f42756e0;
        super(H4.a.c(context, attributeSet, i6, i10), attributeSet, i6);
        this.f42758D = -1;
        this.f42759E = -1;
        this.f42760F = -1;
        this.f42762H = 0;
        this.f42774T = new java.util.ArrayList();
        android.content.Context context2 = getContext();
        setOrientation(1);
        int i11 = android.os.Build.VERSION.SDK_INT;
        if (getOutlineProvider() == android.view.ViewOutlineProvider.BACKGROUND) {
            com.google.android.material.appbar.h.a(this);
        }
        com.google.android.material.appbar.h.c(this, attributeSet, i6, i10);
        android.content.res.TypedArray typedArrayI = com.google.android.material.internal.k.i(context2, attributeSet, p125m4.j.f50999k, i6, i10, new int[0]);
        androidx.core.view.X.r0(this, typedArrayI.getDrawable(p125m4.j.f51007l));
        android.content.res.ColorStateList colorStateListA = B4.c.a(context2, typedArrayI, p125m4.j.f51055r);
        this.f42771Q = colorStateListA != null;
        android.content.res.ColorStateList colorStateListF = com.google.android.material.drawable.d.f(getBackground());
        if (colorStateListF != null) {
            E4.g gVar = new E4.g();
            gVar.V(colorStateListF);
            if (colorStateListA != null) {
                l(gVar, colorStateListF, colorStateListA);
            } else {
                m(context2, gVar);
            }
        }
        this.f42775U = p245y4.d.f(context2, p125m4.a.f50484B, getResources().getInteger(p125m4.f.f50651a));
        this.f42776V = p245y4.d.g(context2, p125m4.a.f50493K, p135n4.a.f51490a);
        if (typedArrayI.hasValue(p125m4.j.f51039p)) {
            w(typedArrayI.getBoolean(p125m4.j.f51039p, false), false, false);
        }
        if (typedArrayI.hasValue(p125m4.j.f51031o)) {
            com.google.android.material.appbar.h.b(this, typedArrayI.getDimensionPixelSize(p125m4.j.f51031o, 0));
        }
        if (i11 >= 26) {
            if (typedArrayI.hasValue(p125m4.j.f51023n)) {
                setKeyboardNavigationCluster(typedArrayI.getBoolean(p125m4.j.f51023n, false));
            }
            if (typedArrayI.hasValue(p125m4.j.f51015m)) {
                setTouchscreenBlocksFocus(typedArrayI.getBoolean(p125m4.j.f51015m, false));
            }
        }
        this.f42780c0 = getResources().getDimension(p125m4.c.f50565a);
        this.f42768N = typedArrayI.getBoolean(p125m4.j.f51047q, false);
        this.f42769O = typedArrayI.getResourceId(p125m4.j.f51063s, -1);
        setStatusBarForeground(typedArrayI.getDrawable(p125m4.j.f51071t));
        typedArrayI.recycle();
        androidx.core.view.X.A0(this, new com.google.android.material.appbar.AppBarLayout.a());
    }

    private boolean A() {
        return this.f42778a0 != null && getTopInset() > 0;
    }

    private boolean C() {
        if (getChildCount() <= 0) {
            return false;
        }
        android.view.View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || androidx.core.view.X.w(childAt)) ? false : true;
    }

    private void D(float f6, float f10) {
        android.animation.ValueAnimator valueAnimator = this.f42772R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(f6, f10);
        this.f42772R = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f42775U);
        this.f42772R.setInterpolator(this.f42776V);
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f42773S;
        if (animatorUpdateListener != null) {
            this.f42772R.addUpdateListener(animatorUpdateListener);
        }
        this.f42772R.start();
    }

    private void E() {
        setWillNotDraw(!A());
    }

    private void c() {
        java.lang.ref.WeakReference weakReference = this.f42770P;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f42770P = null;
    }

    private java.lang.Integer d() {
        int defaultColor;
        android.graphics.drawable.Drawable drawable = this.f42778a0;
        if (drawable instanceof E4.g) {
            defaultColor = ((E4.g) drawable).y();
        } else {
            android.content.res.ColorStateList colorStateListF = com.google.android.material.drawable.d.f(drawable);
            if (colorStateListF == null) {
                return null;
            }
            defaultColor = colorStateListF.getDefaultColor();
        }
        return java.lang.Integer.valueOf(defaultColor);
    }

    private android.view.View e(android.view.View view) {
        int i6;
        if (this.f42770P == null && (i6 = this.f42769O) != -1) {
            android.view.View viewFindViewById = view != null ? view.findViewById(i6) : null;
            if (viewFindViewById == null && (getParent() instanceof android.view.ViewGroup)) {
                viewFindViewById = ((android.view.ViewGroup) getParent()).findViewById(this.f42769O);
            }
            if (viewFindViewById != null) {
                this.f42770P = new java.lang.ref.WeakReference(viewFindViewById);
            }
        }
        java.lang.ref.WeakReference weakReference = this.f42770P;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    private boolean j() {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            if (((com.google.android.material.appbar.AppBarLayout.d) getChildAt(i6).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void l(final E4.g gVar, final android.content.res.ColorStateList colorStateList, final android.content.res.ColorStateList colorStateList2) {
        final java.lang.Integer numF = p195t4.a.f(getContext(), p125m4.a.f50520n);
        this.f42773S = new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                this.f42811a.q(colorStateList, colorStateList2, gVar, numF, valueAnimator);
            }
        };
        androidx.core.view.X.r0(this, gVar);
    }

    private void m(android.content.Context context, final E4.g gVar) {
        gVar.K(context);
        this.f42773S = new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                this.f42816a.r(gVar, valueAnimator);
            }
        };
        androidx.core.view.X.r0(this, gVar);
    }

    private void n() {
        com.google.android.material.appbar.AppBarLayout.Behavior behavior = this.f42781d0;
        com.google.android.material.appbar.AppBarLayout.BaseBehavior.c cVarT0 = (behavior == null || this.f42758D == -1 || this.f42762H != 0) ? null : behavior.t0(I1.a.f4936D, this);
        this.f42758D = -1;
        this.f42759E = -1;
        this.f42760F = -1;
        if (cVarT0 != null) {
            this.f42781d0.s0(cVarT0, false);
        }
    }

    private boolean p() {
        return getBackground() instanceof E4.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(android.content.res.ColorStateList colorStateList, android.content.res.ColorStateList colorStateList2, E4.g gVar, java.lang.Integer num, android.animation.ValueAnimator valueAnimator) {
        java.lang.Integer num2;
        int iJ = p195t4.a.j(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        gVar.V(android.content.res.ColorStateList.valueOf(iJ));
        if (this.f42778a0 != null && (num2 = this.f42779b0) != null && num2.equals(num)) {
            androidx.core.graphics.drawable.a.n(this.f42778a0, iJ);
        }
        if (this.f42774T.isEmpty()) {
            return;
        }
        java.util.Iterator it = this.f42774T.iterator();
        while (it.hasNext()) {
            androidx.appcompat.app.D.a(it.next());
            if (gVar.v() != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(E4.g gVar, android.animation.ValueAnimator valueAnimator) {
        float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        gVar.U(fFloatValue);
        android.graphics.drawable.Drawable drawable = this.f42778a0;
        if (drawable instanceof E4.g) {
            ((E4.g) drawable).U(fFloatValue);
        }
        java.util.Iterator it = this.f42774T.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.D.a(it.next());
            gVar.y();
            throw null;
        }
    }

    private void w(boolean z6, boolean z10, boolean z11) {
        this.f42762H = (z6 ? 1 : 2) | (z10 ? 4 : 0) | (z11 ? 8 : 0);
        requestLayout();
    }

    private boolean x(boolean z6) {
        if (this.f42766L == z6) {
            return false;
        }
        this.f42766L = z6;
        refreshDrawableState();
        return true;
    }

    boolean B(android.view.View view) {
        android.view.View viewE = e(view);
        if (viewE != null) {
            view = viewE;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.google.android.material.appbar.AppBarLayout.d;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        if (A()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f42757C);
            this.f42778a0.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.f42778a0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.google.android.material.appbar.AppBarLayout.d generateDefaultLayoutParams() {
        return new com.google.android.material.appbar.AppBarLayout.d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public com.google.android.material.appbar.AppBarLayout.d generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.google.android.material.appbar.AppBarLayout.d(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public androidx.coordinatorlayout.widget.CoordinatorLayout.c getBehavior() {
        com.google.android.material.appbar.AppBarLayout.Behavior behavior = new com.google.android.material.appbar.AppBarLayout.Behavior();
        this.f42781d0 = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int iA;
        int i6 = this.f42759E;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                com.google.android.material.appbar.AppBarLayout.d dVar = (com.google.android.material.appbar.AppBarLayout.d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = dVar.f42801a;
                if ((i11 & 5) != 5) {
                    if (i10 > 0) {
                        break;
                    }
                } else {
                    int i12 = ((android.widget.LinearLayout.LayoutParams) dVar).topMargin + ((android.widget.LinearLayout.LayoutParams) dVar).bottomMargin;
                    if ((i11 & 8) != 0) {
                        iA = androidx.core.view.X.A(childAt);
                    } else {
                        if ((i11 & 2) != 0) {
                            iA = measuredHeight - androidx.core.view.X.A(childAt);
                        } else {
                            iMin = i12 + measuredHeight;
                        }
                        if (childCount == 0 && androidx.core.view.X.w(childAt)) {
                            iMin = java.lang.Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i10 += iMin;
                    }
                    iMin = i12 + iA;
                    if (childCount == 0) {
                        iMin = java.lang.Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i10 += iMin;
                }
            }
        }
        int iMax = java.lang.Math.max(0, i10);
        this.f42759E = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i6 = this.f42760F;
        if (i6 != -1) {
            return i6;
        }
        int childCount = getChildCount();
        int iA = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            android.view.View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                com.google.android.material.appbar.AppBarLayout.d dVar = (com.google.android.material.appbar.AppBarLayout.d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((android.widget.LinearLayout.LayoutParams) dVar).topMargin + ((android.widget.LinearLayout.LayoutParams) dVar).bottomMargin;
                int i11 = dVar.f42801a;
                if ((i11 & 1) == 0) {
                    break;
                }
                iA += measuredHeight;
                if ((i11 & 2) != 0) {
                    iA -= androidx.core.view.X.A(childAt);
                    break;
                }
            }
        }
        int iMax = java.lang.Math.max(0, iA);
        this.f42760F = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f42769O;
    }

    public E4.g getMaterialShapeBackground() {
        android.graphics.drawable.Drawable background = getBackground();
        if (background instanceof E4.g) {
            return (E4.g) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iA = androidx.core.view.X.A(this);
        if (iA == 0) {
            int childCount = getChildCount();
            iA = childCount >= 1 ? androidx.core.view.X.A(getChildAt(childCount - 1)) : 0;
            if (iA == 0) {
                return getHeight() / 3;
            }
        }
        return (iA * 2) + topInset;
    }

    int getPendingAction() {
        return this.f42762H;
    }

    public android.graphics.drawable.Drawable getStatusBarForeground() {
        return this.f42778a0;
    }

    @java.lang.Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        androidx.core.view.C2038y0 c2038y0 = this.f42763I;
        if (c2038y0 != null) {
            return c2038y0.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i6 = this.f42758D;
        if (i6 != -1) {
            return i6;
        }
        int childCount = getChildCount();
        int iA = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            android.view.View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                com.google.android.material.appbar.AppBarLayout.d dVar = (com.google.android.material.appbar.AppBarLayout.d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = dVar.f42801a;
                if ((i11 & 1) == 0) {
                    break;
                }
                iA += measuredHeight + ((android.widget.LinearLayout.LayoutParams) dVar).topMargin + ((android.widget.LinearLayout.LayoutParams) dVar).bottomMargin;
                if (i10 == 0 && androidx.core.view.X.w(childAt)) {
                    iA -= getTopInset();
                }
                if ((i11 & 2) != 0) {
                    iA -= androidx.core.view.X.A(childAt);
                    break;
                }
            }
        }
        int iMax = java.lang.Math.max(0, iA);
        this.f42758D = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.google.android.material.appbar.AppBarLayout.d generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
            return new com.google.android.material.appbar.AppBarLayout.d((android.widget.LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new com.google.android.material.appbar.AppBarLayout.d((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new com.google.android.material.appbar.AppBarLayout.d(layoutParams);
    }

    boolean i() {
        return this.f42761G;
    }

    boolean k() {
        return getTotalScrollRange() != 0;
    }

    public boolean o() {
        return this.f42768N;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        E4.h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i6) {
        if (this.f42777W == null) {
            this.f42777W = new int[4];
        }
        int[] iArr = this.f42777W;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i6 + iArr.length);
        boolean z6 = this.f42766L;
        int i10 = p125m4.a.f50501S;
        if (!z6) {
            i10 = -i10;
        }
        iArr[0] = i10;
        iArr[1] = (z6 && this.f42767M) ? p125m4.a.f50502T : -p125m4.a.f50502T;
        int i11 = p125m4.a.f50498P;
        if (!z6) {
            i11 = -i11;
        }
        iArr[2] = i11;
        iArr[3] = (z6 && this.f42767M) ? p125m4.a.f50497O : -p125m4.a.f50497O;
        return android.view.View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        super.onLayout(z6, i6, i10, i11, i12);
        boolean z10 = true;
        if (androidx.core.view.X.w(this) && C()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                androidx.core.view.X.Y(getChildAt(childCount), topInset);
            }
        }
        n();
        this.f42761G = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            if (((com.google.android.material.appbar.AppBarLayout.d) getChildAt(i13).getLayoutParams()).d() != null) {
                this.f42761G = true;
                break;
            }
        }
        android.graphics.drawable.Drawable drawable = this.f42778a0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f42765K) {
            return;
        }
        if (!this.f42768N && !j()) {
            z10 = false;
        }
        x(z10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        int mode = android.view.View.MeasureSpec.getMode(i10);
        if (mode != 1073741824 && androidx.core.view.X.w(this) && C()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = p222w1.a.b(getMeasuredHeight() + getTopInset(), 0, android.view.View.MeasureSpec.getSize(i10));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        n();
    }

    void s(int i6) {
        this.f42757C = i6;
        if (!willNotDraw()) {
            androidx.core.view.X.e0(this);
        }
        java.util.List list = this.f42764J;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.appcompat.app.D.a(this.f42764J.get(i10));
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        E4.h.d(this, f6);
    }

    public void setExpanded(boolean z6) {
        v(z6, androidx.core.view.X.R(this));
    }

    public void setLiftOnScroll(boolean z6) {
        this.f42768N = z6;
    }

    public void setLiftOnScrollTargetView(android.view.View view) {
        this.f42769O = -1;
        if (view == null) {
            c();
        } else {
            this.f42770P = new java.lang.ref.WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i6) {
        this.f42769O = i6;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z6) {
        this.f42765K = z6;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i6) {
        if (i6 != 1) {
            throw new java.lang.IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i6);
    }

    public void setStatusBarForeground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f42778a0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f42778a0 = drawable != null ? drawable.mutate() : null;
            this.f42779b0 = d();
            android.graphics.drawable.Drawable drawable3 = this.f42778a0;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f42778a0.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.f42778a0, androidx.core.view.X.z(this));
                this.f42778a0.setVisible(getVisibility() == 0, false);
                this.f42778a0.setCallback(this);
            }
            E();
            androidx.core.view.X.e0(this);
        }
    }

    public void setStatusBarForegroundColor(int i6) {
        setStatusBarForeground(new android.graphics.drawable.ColorDrawable(i6));
    }

    public void setStatusBarForegroundResource(int i6) {
        setStatusBarForeground(p100k.a.b(getContext(), i6));
    }

    @java.lang.Deprecated
    public void setTargetElevation(float f6) {
        com.google.android.material.appbar.h.b(this, f6);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        boolean z6 = i6 == 0;
        android.graphics.drawable.Drawable drawable = this.f42778a0;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
    }

    androidx.core.view.C2038y0 t(androidx.core.view.C2038y0 c2038y0) {
        androidx.core.view.C2038y0 c2038y1 = androidx.core.view.X.w(this) ? c2038y0 : null;
        if (!B1.c.a(this.f42763I, c2038y1)) {
            this.f42763I = c2038y1;
            E();
            requestLayout();
        }
        return c2038y0;
    }

    void u() {
        this.f42762H = 0;
    }

    public void v(boolean z6, boolean z10) {
        w(z6, z10, true);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f42778a0;
    }

    boolean y(boolean z6) {
        return z(z6, !this.f42765K);
    }

    boolean z(boolean z6, boolean z10) {
        if (!z10 || this.f42767M == z6) {
            return false;
        }
        this.f42767M = z6;
        refreshDrawableState();
        if (!p()) {
            return true;
        }
        if (this.f42771Q) {
            D(z6 ? 0.0f : 1.0f, z6 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f42768N) {
            return true;
        }
        D(z6 ? 0.0f : this.f42780c0, z6 ? this.f42780c0 : 0.0f);
        return true;
    }
}
