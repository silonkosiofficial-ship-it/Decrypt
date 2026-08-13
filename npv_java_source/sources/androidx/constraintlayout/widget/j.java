package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends androidx.constraintlayout.widget.c {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f21311K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f21312L;

    public j(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.c
    protected void g(android.util.AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f21135a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == androidx.constraintlayout.widget.i.f21184h1) {
                    this.f21311K = true;
                } else if (index == androidx.constraintlayout.widget.i.f21233o1) {
                    this.f21312L = true;
                }
            }
        }
    }

    public abstract void n(p172r1.l lVar, int i6, int i10);

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public void onAttachedToWindow() {
        android.view.ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f21311K || this.f21312L) && (parent = getParent()) != null && (parent instanceof androidx.constraintlayout.widget.ConstraintLayout)) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i6 = 0; i6 < this.f20854D; i6++) {
                android.view.View viewH = constraintLayout.h(this.f20853C[i6]);
                if (viewH != null) {
                    if (this.f21311K) {
                        viewH.setVisibility(visibility);
                    }
                    if (this.f21312L && elevation > 0.0f) {
                        viewH.setTranslationZ(viewH.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        c();
    }
}
