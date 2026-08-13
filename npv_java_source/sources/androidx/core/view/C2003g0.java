package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2003g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.ref.WeakReference f21722a;

    /* JADX INFO: renamed from: androidx.core.view.g0$a */
    class a extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.core.view.InterfaceC2005h0 f21723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.View f21724b;

        a(androidx.core.view.InterfaceC2005h0 interfaceC2005h0, android.view.View view) {
            this.f21723a = interfaceC2005h0;
            this.f21724b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            this.f21723a.a(this.f21724b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            this.f21723a.b(this.f21724b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            this.f21723a.c(this.f21724b);
        }
    }

    C2003g0(android.view.View view) {
        this.f21722a = new java.lang.ref.WeakReference(view);
    }

    private void i(android.view.View view, androidx.core.view.InterfaceC2005h0 interfaceC2005h0) {
        if (interfaceC2005h0 != null) {
            view.animate().setListener(new androidx.core.view.C2003g0.a(interfaceC2005h0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public androidx.core.view.C2003g0 b(float f6) {
        android.view.View view = (android.view.View) this.f21722a.get();
        if (view != null) {
            view.animate().alpha(f6);
        }
        return this;
    }

    public void c() {
        android.view.View view = (android.view.View) this.f21722a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        android.view.View view = (android.view.View) this.f21722a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public androidx.core.view.C2003g0 f(long j6) {
        android.view.View view = (android.view.View) this.f21722a.get();
        if (view != null) {
            view.animate().setDuration(j6);
        }
        return this;
    }

    public androidx.core.view.C2003g0 g(android.view.animation.Interpolator interpolator) {
        android.view.View view = (android.view.View) this.f21722a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public androidx.core.view.C2003g0 h(androidx.core.view.InterfaceC2005h0 interfaceC2005h0) {
        android.view.View view = (android.view.View) this.f21722a.get();
        if (view != null) {
            i(view, interfaceC2005h0);
        }
        return this;
    }

    public androidx.core.view.C2003g0 j(long j6) {
        android.view.View view = (android.view.View) this.f21722a.get();
        if (view != null) {
            view.animate().setStartDelay(j6);
        }
        return this;
    }

    public androidx.core.view.C2003g0 k(final androidx.core.view.InterfaceC2009j0 interfaceC2009j0) {
        final android.view.View view = (android.view.View) this.f21722a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC2009j0 != null ? new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.f0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    interfaceC2009j0.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        android.view.View view = (android.view.View) this.f21722a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public androidx.core.view.C2003g0 m(float f6) {
        android.view.View view = (android.view.View) this.f21722a.get();
        if (view != null) {
            view.animate().translationY(f6);
        }
        return this;
    }
}
