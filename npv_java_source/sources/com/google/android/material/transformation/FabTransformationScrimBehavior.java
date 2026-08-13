package com.google.android.material.transformation;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class FabTransformationScrimBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p135n4.e f43916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p135n4.e f43917c;

    public FabTransformationScrimBehavior() {
        this.f43916b = new p135n4.e(75L, 150L);
        this.f43917c = new p135n4.e(0L, 150L);
    }

    public FabTransformationScrimBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43916b = new p135n4.e(75L, 150L);
        this.f43917c = new p135n4.e(0L, 150L);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        return super.D(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        return false;
    }
}
