package androidx.transition;

/* JADX INFO: renamed from: androidx.transition.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2100c extends androidx.transition.M {

    /* JADX INFO: renamed from: androidx.transition.c$a */
    private static class a extends android.animation.AnimatorListenerAdapter implements androidx.transition.AbstractC2108k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.view.View f23583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f23584b = false;

        a(android.view.View view) {
            this.f23583a = view;
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void a(androidx.transition.AbstractC2108k abstractC2108k) {
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void b(androidx.transition.AbstractC2108k abstractC2108k) {
            this.f23583a.setTag(androidx.transition.AbstractC2105h.f23607d, java.lang.Float.valueOf(this.f23583a.getVisibility() == 0 ? androidx.transition.A.b(this.f23583a) : 0.0f));
        }

        @Override // androidx.transition.AbstractC2108k.f
        public /* synthetic */ void c(androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
            androidx.transition.AbstractC2109l.a(this, abstractC2108k, z6);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void d(androidx.transition.AbstractC2108k abstractC2108k) {
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void e(androidx.transition.AbstractC2108k abstractC2108k) {
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void f(androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void g(androidx.transition.AbstractC2108k abstractC2108k) {
            this.f23583a.setTag(androidx.transition.AbstractC2105h.f23607d, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            androidx.transition.A.e(this.f23583a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator, boolean z6) {
            if (this.f23584b) {
                this.f23583a.setLayerType(0, null);
            }
            if (z6) {
                return;
            }
            androidx.transition.A.e(this.f23583a, 1.0f);
            androidx.transition.A.a(this.f23583a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            if (this.f23583a.hasOverlappingRendering() && this.f23583a.getLayerType() == 0) {
                this.f23584b = true;
                this.f23583a.setLayerType(2, null);
            }
        }
    }

    public C2100c() {
    }

    public C2100c(int i6) {
        u0(i6);
    }

    private android.animation.Animator v0(android.view.View view, float f6, float f10) {
        if (f6 == f10) {
            return null;
        }
        androidx.transition.A.e(view, f6);
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) androidx.transition.A.f23522b, f10);
        androidx.transition.C2100c.a aVar = new androidx.transition.C2100c.a(view);
        objectAnimatorOfFloat.addListener(aVar);
        B().a(aVar);
        return objectAnimatorOfFloat;
    }

    private static float w0(androidx.transition.x xVar, float f6) {
        java.lang.Float f10;
        return (xVar == null || (f10 = (java.lang.Float) xVar.f23677a.get("android:fade:transitionAlpha")) == null) ? f6 : f10.floatValue();
    }

    @Override // androidx.transition.M, androidx.transition.AbstractC2108k
    public void l(androidx.transition.x xVar) {
        super.l(xVar);
        java.lang.Float fValueOf = (java.lang.Float) xVar.f23678b.getTag(androidx.transition.AbstractC2105h.f23607d);
        if (fValueOf == null) {
            fValueOf = java.lang.Float.valueOf(xVar.f23678b.getVisibility() == 0 ? androidx.transition.A.b(xVar.f23678b) : 0.0f);
        }
        xVar.f23677a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.M
    public android.animation.Animator q0(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.x xVar, androidx.transition.x xVar2) {
        androidx.transition.A.c(view);
        return v0(view, w0(xVar, 0.0f), 1.0f);
    }

    @Override // androidx.transition.M
    public android.animation.Animator s0(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.x xVar, androidx.transition.x xVar2) {
        androidx.transition.A.c(view);
        android.animation.Animator animatorV0 = v0(view, w0(xVar, 1.0f), 0.0f);
        if (animatorV0 == null) {
            androidx.transition.A.e(view, w0(xVar2, 1.0f));
        }
        return animatorV0;
    }
}
