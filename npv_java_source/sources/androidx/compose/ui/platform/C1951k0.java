package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1951k0 implements androidx.compose.ui.platform.InterfaceC1942h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.graphics.Matrix f20144a = new android.graphics.Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f20145b = new int[2];

    @Override // androidx.compose.ui.platform.InterfaceC1942h0
    public void a(android.view.View view, float[] fArr) {
        this.f20144a.reset();
        view.transformMatrixToGlobal(this.f20144a);
        while (true) {
            java.lang.Object parent = view.getParent();
            if (!(parent instanceof android.view.View)) {
                view.getLocationOnScreen(this.f20145b);
                int[] iArr = this.f20145b;
                int i6 = iArr[0];
                int i10 = iArr[1];
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.f20145b;
                this.f20144a.postTranslate(iArr2[0] - i6, iArr2[1] - i10);
                p141o0.S.b(fArr, this.f20144a);
                return;
            }
            view = (android.view.View) parent;
        }
    }
}
