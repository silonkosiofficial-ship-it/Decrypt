package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
abstract class I extends androidx.transition.G {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f23529f = true;

    static class a {
        static void a(android.view.View view, int i6, int i10, int i11, int i12) {
            view.setLeftTopRightBottom(i6, i10, i11, i12);
        }
    }

    I() {
    }

    @Override // androidx.transition.D
    public void d(android.view.View view, int i6, int i10, int i11, int i12) {
        if (f23529f) {
            try {
                androidx.transition.I.a.a(view, i6, i10, i11, i12);
            } catch (java.lang.NoSuchMethodError unused) {
                f23529f = false;
            }
        }
    }
}
