package com.google.android.material.snackbar;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseTransientBottomBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final android.animation.TimeInterpolator f43591a = p135n4.a.f51491b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final android.animation.TimeInterpolator f43592b = p135n4.a.f51490a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final android.animation.TimeInterpolator f43593c = p135n4.a.f51493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f43595e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f43596f = {p125m4.a.f50496N};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.lang.String f43597g = com.google.android.material.snackbar.BaseTransientBottomBar.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final android.os.Handler f43594d = new android.os.Handler(android.os.Looper.getMainLooper(), new com.google.android.material.snackbar.BaseTransientBottomBar.a());

    public static class Behavior extends com.google.android.material.behavior.SwipeDismissBehavior<android.view.View> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final com.google.android.material.snackbar.BaseTransientBottomBar.b f43598k = new com.google.android.material.snackbar.BaseTransientBottomBar.b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean F(android.view.View view) {
            return this.f43598k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
            this.f43598k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    class a implements android.os.Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            int i6 = message.what;
            if (i6 == 0) {
                androidx.appcompat.app.D.a(message.obj);
                throw null;
            }
            if (i6 != 1) {
                return false;
            }
            androidx.appcompat.app.D.a(message.obj);
            throw null;
        }
    }

    public static class b {
        public b(com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(android.view.View view) {
            return view instanceof com.google.android.material.snackbar.BaseTransientBottomBar.c;
        }

        public void b(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.b().e(null);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.b().f(null);
            }
        }
    }

    protected static class c extends android.widget.FrameLayout {

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private static final android.view.View.OnTouchListener f43599M = new com.google.android.material.snackbar.BaseTransientBottomBar.c.a();

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        E4.k f43600C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f43601D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final float f43602E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private final float f43603F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private final int f43604G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private final int f43605H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private android.content.res.ColorStateList f43606I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private android.graphics.PorterDuff.Mode f43607J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private android.graphics.Rect f43608K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private boolean f43609L;

        class a implements android.view.View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return true;
            }
        }

        protected c(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(H4.a.c(context, attributeSet, 0, 0), attributeSet);
            android.content.Context context2 = getContext();
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, p125m4.j.f50965f5);
            if (typedArrayObtainStyledAttributes.hasValue(p125m4.j.f51021m5)) {
                androidx.core.view.X.v0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(p125m4.j.f51021m5, 0));
            }
            this.f43601D = typedArrayObtainStyledAttributes.getInt(p125m4.j.f50989i5, 0);
            if (typedArrayObtainStyledAttributes.hasValue(p125m4.j.f51037o5) || typedArrayObtainStyledAttributes.hasValue(p125m4.j.f51045p5)) {
                this.f43600C = E4.k.e(context2, attributeSet, 0, 0).m();
            }
            this.f43602E = typedArrayObtainStyledAttributes.getFloat(p125m4.j.f50997j5, 1.0f);
            setBackgroundTintList(B4.c.a(context2, typedArrayObtainStyledAttributes, p125m4.j.f51005k5));
            setBackgroundTintMode(com.google.android.material.internal.n.i(typedArrayObtainStyledAttributes.getInt(p125m4.j.f51013l5, -1), android.graphics.PorterDuff.Mode.SRC_IN));
            this.f43603F = typedArrayObtainStyledAttributes.getFloat(p125m4.j.f50981h5, 1.0f);
            this.f43604G = typedArrayObtainStyledAttributes.getDimensionPixelSize(p125m4.j.f50973g5, -1);
            this.f43605H = typedArrayObtainStyledAttributes.getDimensionPixelSize(p125m4.j.f51029n5, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f43599M);
            setFocusable(true);
            if (getBackground() == null) {
                androidx.core.view.X.r0(this, a());
            }
        }

        private android.graphics.drawable.Drawable a() {
            int iK = p195t4.a.k(this, p125m4.a.f50520n, p125m4.a.f50517k, getBackgroundOverlayColorAlpha());
            E4.k kVar = this.f43600C;
            android.graphics.drawable.Drawable drawableD = kVar != null ? com.google.android.material.snackbar.BaseTransientBottomBar.d(iK, kVar) : com.google.android.material.snackbar.BaseTransientBottomBar.c(iK, getResources());
            android.content.res.ColorStateList colorStateList = this.f43606I;
            android.graphics.drawable.Drawable drawableR = androidx.core.graphics.drawable.a.r(drawableD);
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.o(drawableR, this.f43606I);
            }
            return drawableR;
        }

        private void b(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f43608K = new android.graphics.Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(com.google.android.material.snackbar.BaseTransientBottomBar baseTransientBottomBar) {
        }

        float getActionTextColorAlpha() {
            return this.f43603F;
        }

        int getAnimationMode() {
            return this.f43601D;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f43602E;
        }

        int getMaxInlineActionWidth() {
            return this.f43605H;
        }

        int getMaxWidth() {
            return this.f43604G;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            androidx.core.view.X.k0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
            super.onLayout(z6, i6, i10, i11, i12);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i6, int i10) {
            super.onMeasure(i6, i10);
            if (this.f43604G > 0) {
                int measuredWidth = getMeasuredWidth();
                int i11 = this.f43604G;
                if (measuredWidth > i11) {
                    super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
                }
            }
        }

        void setAnimationMode(int i6) {
            this.f43601D = i6;
        }

        @Override // android.view.View
        public void setBackground(android.graphics.drawable.Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
            if (drawable != null && this.f43606I != null) {
                drawable = androidx.core.graphics.drawable.a.r(drawable.mutate());
                androidx.core.graphics.drawable.a.o(drawable, this.f43606I);
                androidx.core.graphics.drawable.a.p(drawable, this.f43607J);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
            this.f43606I = colorStateList;
            if (getBackground() != null) {
                android.graphics.drawable.Drawable drawableR = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.o(drawableR, colorStateList);
                androidx.core.graphics.drawable.a.p(drawableR, this.f43607J);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
            this.f43607J = mode;
            if (getBackground() != null) {
                android.graphics.drawable.Drawable drawableR = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f43609L || !(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
                return;
            }
            b((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f43599M);
            super.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.graphics.drawable.GradientDrawable c(int i6, android.content.res.Resources resources) {
        float dimension = resources.getDimension(p125m4.c.f50570c0);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i6);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static E4.g d(int i6, E4.k kVar) {
        E4.g gVar = new E4.g(kVar);
        gVar.V(android.content.res.ColorStateList.valueOf(i6));
        return gVar;
    }
}
