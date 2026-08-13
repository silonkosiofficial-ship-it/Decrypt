package p204u3;

/* JADX INFO: loaded from: classes.dex */
final class A extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ p204u3.C f55469a;

    A(p204u3.C c6) {
        this.f55469a = c6;
    }

    private final void a(boolean z6) {
        this.f55469a.setEnabled(z6);
        this.f55469a.f55474C.setEnabled(z6);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        a(false);
    }
}
