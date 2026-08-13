package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1983w0 extends android.view.ViewGroup {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f20345C;

    public C1983w0(android.content.Context context) {
        super(context);
        setClipChildren(false);
        setTag(p071h0.l.f45814J, java.lang.Boolean.TRUE);
    }

    public final void a(p141o0.InterfaceC6993q0 interfaceC6993q0, android.view.View view, long j6) {
        super.drawChild(p141o0.H.d(interfaceC6993q0), view, j6);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            p247y7.AbstractC7350t.d(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((androidx.compose.ui.platform.B1) childAt).u()) {
                this.f20345C = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f20345C = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f20345C) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}
