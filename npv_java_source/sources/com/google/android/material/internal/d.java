package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends androidx.appcompat.widget.O {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private android.graphics.drawable.Drawable f43432R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final android.graphics.Rect f43433S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final android.graphics.Rect f43434T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f43435U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    protected boolean f43436V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    boolean f43437W;

    public d(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f43433S = new android.graphics.Rect();
        this.f43434T = new android.graphics.Rect();
        this.f43435U = 119;
        this.f43436V = true;
        this.f43437W = false;
        android.content.res.TypedArray typedArrayI = com.google.android.material.internal.k.i(context, attributeSet, p125m4.j.f50874U1, i6, 0, new int[0]);
        this.f43435U = typedArrayI.getInt(p125m4.j.f50890W1, this.f43435U);
        android.graphics.drawable.Drawable drawable = typedArrayI.getDrawable(p125m4.j.f50882V1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f43436V = typedArrayI.getBoolean(p125m4.j.f50898X1, true);
        typedArrayI.recycle();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        android.graphics.drawable.Drawable drawable = this.f43432R;
        if (drawable != null) {
            if (this.f43437W) {
                this.f43437W = false;
                android.graphics.Rect rect = this.f43433S;
                android.graphics.Rect rect2 = this.f43434T;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f43436V) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                android.view.Gravity.apply(this.f43435U, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f6, float f10) {
        super.drawableHotspotChanged(f6, f10);
        android.graphics.drawable.Drawable drawable = this.f43432R;
        if (drawable != null) {
            drawable.setHotspot(f6, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.f43432R;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f43432R.setState(getDrawableState());
    }

    @Override // android.view.View
    public android.graphics.drawable.Drawable getForeground() {
        return this.f43432R;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f43435U;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f43432R;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.O, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        super.onLayout(z6, i6, i10, i11, i12);
        this.f43437W = z6 | this.f43437W;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i6, int i10, int i11, int i12) {
        super.onSizeChanged(i6, i10, i11, i12);
        this.f43437W = true;
    }

    @Override // android.view.View
    public void setForeground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f43432R;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f43432R);
            }
            this.f43432R = drawable;
            this.f43437W = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f43435U == 119) {
                    drawable.getPadding(new android.graphics.Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i6) {
        if (this.f43435U != i6) {
            if ((8388615 & i6) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            this.f43435U = i6;
            if (i6 == 119 && this.f43432R != null) {
                this.f43432R.getPadding(new android.graphics.Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f43432R;
    }
}
