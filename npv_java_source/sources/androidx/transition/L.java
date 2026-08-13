package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class L extends androidx.transition.K {
    L() {
    }

    @Override // androidx.transition.D
    public float b(android.view.View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.I, androidx.transition.D
    public void d(android.view.View view, int i6, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i6, i10, i11, i12);
    }

    @Override // androidx.transition.D
    public void e(android.view.View view, float f6) {
        view.setTransitionAlpha(f6);
    }

    @Override // androidx.transition.K, androidx.transition.D
    public void f(android.view.View view, int i6) {
        view.setTransitionVisibility(i6);
    }

    @Override // androidx.transition.G, androidx.transition.D
    public void g(android.view.View view, android.graphics.Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.G, androidx.transition.D
    public void h(android.view.View view, android.graphics.Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
