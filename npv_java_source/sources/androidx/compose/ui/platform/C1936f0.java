package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1936f0 extends android.view.ViewGroup {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.HashMap f20109C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.HashMap f20110D;

    public C1936f0(android.content.Context context) {
        super(context);
        setClipChildren(false);
        this.f20109C = new java.util.HashMap();
        this.f20110D = new java.util.HashMap();
    }

    public final void a(androidx.compose.ui.viewinterop.c cVar, android.graphics.Canvas canvas) {
        cVar.draw(canvas);
    }

    public java.lang.Void b(int[] iArr, android.graphics.Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    public final java.util.HashMap<androidx.compose.ui.viewinterop.c, F0.J> getHolderToLayoutNode() {
        return this.f20109C;
    }

    public final java.util.HashMap<F0.J, androidx.compose.ui.viewinterop.c> getLayoutNodeToHolder() {
        return this.f20110D;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        return (android.view.ViewParent) b(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(android.view.View view, android.view.View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        for (androidx.compose.ui.viewinterop.c cVar : this.f20109C.keySet()) {
            cVar.layout(cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        if (!(android.view.View.MeasureSpec.getMode(i6) == 1073741824)) {
            C0.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(android.view.View.MeasureSpec.getMode(i10) == 1073741824)) {
            C0.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i6), android.view.View.MeasureSpec.getSize(i10));
        java.util.Iterator it = this.f20109C.keySet().iterator();
        while (it.hasNext()) {
            ((androidx.compose.ui.viewinterop.c) it.next()).v();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            F0.J j6 = (F0.J) this.f20109C.get(childAt);
            if (childAt.isLayoutRequested() && j6 != null) {
                F0.J.w1(j6, false, false, false, 7, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
