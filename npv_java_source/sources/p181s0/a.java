package p181s0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends android.view.ViewGroup {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f54040C;

    public a(android.content.Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(p141o0.V1.f52176a, java.lang.Boolean.TRUE);
    }

    public final void a(p141o0.InterfaceC6993q0 interfaceC6993q0, android.view.View view, long j6) {
        super.drawChild(p141o0.H.d(interfaceC6993q0), view, j6);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f54040C) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        return null;
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
