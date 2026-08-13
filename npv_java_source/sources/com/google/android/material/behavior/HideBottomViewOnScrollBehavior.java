package com.google.android.material.behavior;

/* JADX INFO: loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f42843j = p125m4.a.f50483A;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f42844k = p125m4.a.f50485C;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f42845l = p125m4.a.f50490H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.LinkedHashSet f42846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private android.animation.TimeInterpolator f42849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.animation.TimeInterpolator f42850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f42853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private android.view.ViewPropertyAnimator f42854i;

    class a extends android.animation.AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior.this.f42854i = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f42846a = new java.util.LinkedHashSet();
        this.f42851f = 0;
        this.f42852g = 2;
        this.f42853h = 0;
    }

    public HideBottomViewOnScrollBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42846a = new java.util.LinkedHashSet();
        this.f42851f = 0;
        this.f42852g = 2;
        this.f42853h = 0;
    }

    private void F(android.view.View view, int i6, long j6, android.animation.TimeInterpolator timeInterpolator) {
        this.f42854i = view.animate().translationY(i6).setInterpolator(timeInterpolator).setDuration(j6).setListener(new com.google.android.material.behavior.HideBottomViewOnScrollBehavior.a());
    }

    private void M(android.view.View view, int i6) {
        this.f42852g = i6;
        java.util.Iterator it = this.f42846a.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.D.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i6, int i10) {
        return i6 == 2;
    }

    public boolean G() {
        return this.f42852g == 1;
    }

    public boolean H() {
        return this.f42852g == 2;
    }

    public void I(android.view.View view) {
        J(view, true);
    }

    public void J(android.view.View view, boolean z6) {
        if (G()) {
            return;
        }
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f42854i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        M(view, 1);
        int i6 = this.f42851f + this.f42853h;
        if (z6) {
            F(view, i6, this.f42848c, this.f42850e);
        } else {
            view.setTranslationY(i6);
        }
    }

    public void K(android.view.View view) {
        L(view, true);
    }

    public void L(android.view.View view, boolean z6) {
        if (H()) {
            return;
        }
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f42854i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        M(view, 2);
        if (z6) {
            F(view, 0, this.f42847b, this.f42849d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6) {
        this.f42851f = view.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f42847b = p245y4.d.f(view.getContext(), f42843j, 225);
        this.f42848c = p245y4.d.f(view.getContext(), f42844k, 175);
        android.content.Context context = view.getContext();
        int i10 = f42845l;
        this.f42849d = p245y4.d.g(context, i10, p135n4.a.f51493d);
        this.f42850e = p245y4.d.g(view.getContext(), i10, p135n4.a.f51492c);
        return super.l(coordinatorLayout, view, i6);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
        if (i10 > 0) {
            I(view);
        } else if (i10 < 0) {
            K(view);
        }
    }
}
