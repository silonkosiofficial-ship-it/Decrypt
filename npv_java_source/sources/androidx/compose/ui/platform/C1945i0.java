package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1945i0 implements androidx.compose.ui.platform.InterfaceC1942h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f20119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f20120b;

    private C1945i0(float[] fArr) {
        this.f20119a = fArr;
        this.f20120b = new int[2];
    }

    public /* synthetic */ C1945i0(float[] fArr, p247y7.AbstractC7342k abstractC7342k) {
        this(fArr);
    }

    private final void b(float[] fArr, android.graphics.Matrix matrix) {
        p141o0.S.b(this.f20119a, matrix);
        androidx.compose.ui.platform.S.i(fArr, this.f20119a);
    }

    private final void c(float[] fArr, float f6, float f10) {
        androidx.compose.ui.platform.S.j(fArr, f6, f10, this.f20119a);
    }

    private final void d(android.view.View view, float[] fArr) {
        java.lang.Object parent = view.getParent();
        if (parent instanceof android.view.View) {
            d((android.view.View) parent, fArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.f20120b;
            view.getLocationInWindow(iArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, iArr[0], iArr[1]);
        }
        android.graphics.Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        b(fArr, matrix);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1942h0
    public void a(android.view.View view, float[] fArr) {
        p141o0.J1.h(fArr);
        d(view, fArr);
    }
}
