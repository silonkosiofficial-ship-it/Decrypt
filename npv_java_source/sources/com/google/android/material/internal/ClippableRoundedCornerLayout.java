package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ClippableRoundedCornerLayout extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.graphics.Path f43340C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private float f43341D;

    public ClippableRoundedCornerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        if (this.f43340C == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f43340C);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public float getCornerRadius() {
        return this.f43341D;
    }
}
