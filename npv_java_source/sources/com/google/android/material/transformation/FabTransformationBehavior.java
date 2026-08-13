package com.google.android.material.transformation;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public abstract class FabTransformationBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.graphics.Rect f43912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.graphics.RectF f43913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.graphics.RectF f43914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f43915e;

    public FabTransformationBehavior() {
        this.f43912b = new android.graphics.Rect();
        this.f43913c = new android.graphics.RectF();
        this.f43914d = new android.graphics.RectF();
        this.f43915e = new int[2];
    }

    public FabTransformationBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43912b = new android.graphics.Rect();
        this.f43913c = new android.graphics.RectF();
        this.f43914d = new android.graphics.RectF();
        this.f43915e = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new java.lang.IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(androidx.coordinatorlayout.widget.CoordinatorLayout.f fVar) {
        if (fVar.f21347h == 0) {
            fVar.f21347h = 80;
        }
    }
}
