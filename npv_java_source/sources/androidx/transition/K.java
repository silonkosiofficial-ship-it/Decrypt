package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class K extends androidx.transition.I {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f23530g = true;

    static class a {
        static void a(android.view.View view, int i6) {
            view.setTransitionVisibility(i6);
        }
    }

    K() {
    }

    @Override // androidx.transition.D
    public void f(android.view.View view, int i6) {
        if (android.os.Build.VERSION.SDK_INT == 28) {
            super.f(view, i6);
        } else if (f23530g) {
            try {
                androidx.transition.K.a.a(view, i6);
            } catch (java.lang.NoSuchMethodError unused) {
                f23530g = false;
            }
        }
    }
}
