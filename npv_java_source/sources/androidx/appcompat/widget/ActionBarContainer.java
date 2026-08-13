package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f17986C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.view.View f17987D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.view.View f17988E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.view.View f17989F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    android.graphics.drawable.Drawable f17990G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    android.graphics.drawable.Drawable f17991H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    android.graphics.drawable.Drawable f17992I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    boolean f17993J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    boolean f17994K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f17995L;

    private static class a {
        public static void a(androidx.appcompat.widget.ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.X.r0(this, new androidx.appcompat.widget.C1896b(this));
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p090j.j.f48901a);
        this.f17990G = typedArrayObtainStyledAttributes.getDrawable(p090j.j.f48906b);
        this.f17991H = typedArrayObtainStyledAttributes.getDrawable(p090j.j.f48916d);
        this.f17995L = typedArrayObtainStyledAttributes.getDimensionPixelSize(p090j.j.f48946j, -1);
        boolean z6 = true;
        if (getId() == p090j.f.f48724H) {
            this.f17993J = true;
            this.f17992I = typedArrayObtainStyledAttributes.getDrawable(p090j.j.f48911c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f17993J ? this.f17990G != null || this.f17991H != null : this.f17992I != null) {
            z6 = false;
        }
        setWillNotDraw(z6);
    }

    private int a(android.view.View view) {
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(android.view.View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.f17990G;
        if (drawable != null && drawable.isStateful()) {
            this.f17990G.setState(getDrawableState());
        }
        android.graphics.drawable.Drawable drawable2 = this.f17991H;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f17991H.setState(getDrawableState());
        }
        android.graphics.drawable.Drawable drawable3 = this.f17992I;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f17992I.setState(getDrawableState());
    }

    public android.view.View getTabContainer() {
        return this.f17987D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f17990G;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable2 = this.f17991H;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable3 = this.f17992I;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f17988E = findViewById(p090j.f.f48733a);
        this.f17989F = findViewById(p090j.f.f48738f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.f17986C || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r0
  0x0048: PHI (r0v9 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:32:0x009d, B:34:0x00a1, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        int left;
        int top;
        int right;
        android.view.View view;
        super.onLayout(z6, i6, i10, i11, i12);
        android.view.View view2 = this.f17987D;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i13 = layoutParams.bottomMargin;
            view2.layout(i6, measuredHeight2 - i13, i11, measuredHeight - i13);
        }
        if (this.f17993J) {
            android.graphics.drawable.Drawable drawable3 = this.f17992I;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = z11;
            }
        } else {
            if (this.f17990G != null) {
                if (this.f17988E.getVisibility() == 0) {
                    drawable2 = this.f17990G;
                    left = this.f17988E.getLeft();
                    top = this.f17988E.getTop();
                    right = this.f17988E.getRight();
                    view = this.f17988E;
                } else {
                    android.view.View view3 = this.f17989F;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f17990G.setBounds(0, 0, 0, 0);
                    } else {
                        drawable2 = this.f17990G;
                        left = this.f17989F.getLeft();
                        top = this.f17989F.getTop();
                        right = this.f17989F.getRight();
                        view = this.f17989F;
                    }
                    z11 = true;
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z11 = true;
            }
            this.f17994K = z12;
            if (!z12 || (drawable = this.f17991H) == null) {
                z10 = z11;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z10) {
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i6, int i10) {
        int iA;
        android.view.View view;
        int size;
        int i11;
        if (this.f17988E == null && android.view.View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.f17995L) >= 0) {
            i10 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i11, android.view.View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i6, i10);
        if (this.f17988E == null) {
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i10);
        android.view.View view2 = this.f17987D;
        if (view2 == null || view2.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.f17988E)) {
            if (b(this.f17989F)) {
                iA = 0;
            } else {
                view = this.f17989F;
            }
            if (mode == Integer.MIN_VALUE) {
                size = android.view.View.MeasureSpec.getSize(i10);
            } else {
                size = Integer.MAX_VALUE;
            }
            setMeasuredDimension(getMeasuredWidth(), java.lang.Math.min(iA + a(this.f17987D), size));
        }
        view = this.f17988E;
        iA = a(view);
        if (mode == Integer.MIN_VALUE) {
            size = android.view.View.MeasureSpec.getSize(i10);
        } else {
            size = Integer.MAX_VALUE;
        }
        setMeasuredDimension(getMeasuredWidth(), java.lang.Math.min(iA + a(this.f17987D), size));
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f17990G;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f17990G);
        }
        this.f17990G = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            android.view.View view = this.f17988E;
            if (view != null) {
                this.f17990G.setBounds(view.getLeft(), this.f17988E.getTop(), this.f17988E.getRight(), this.f17988E.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f17993J ? !(this.f17990G != null || this.f17991H != null) : this.f17992I == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        androidx.appcompat.widget.ActionBarContainer.a.a(this);
    }

    public void setSplitBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3 = this.f17992I;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f17992I);
        }
        this.f17992I = drawable;
        boolean z6 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f17993J && (drawable2 = this.f17992I) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f17993J ? !(this.f17990G != null || this.f17991H != null) : this.f17992I == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        androidx.appcompat.widget.ActionBarContainer.a.a(this);
    }

    public void setStackedBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3 = this.f17991H;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f17991H);
        }
        this.f17991H = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f17994K && (drawable2 = this.f17991H) != null) {
                drawable2.setBounds(this.f17987D.getLeft(), this.f17987D.getTop(), this.f17987D.getRight(), this.f17987D.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f17993J ? !(this.f17990G != null || this.f17991H != null) : this.f17992I == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        androidx.appcompat.widget.ActionBarContainer.a.a(this);
    }

    public void setTabContainer(androidx.appcompat.widget.W w6) {
        android.view.View view = this.f17987D;
        if (view != null) {
            removeView(view);
        }
        this.f17987D = w6;
    }

    public void setTransitioning(boolean z6) {
        this.f17986C = z6;
        setDescendantFocusability(z6 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        boolean z6 = i6 == 0;
        android.graphics.drawable.Drawable drawable = this.f17990G;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
        android.graphics.drawable.Drawable drawable2 = this.f17991H;
        if (drawable2 != null) {
            drawable2.setVisible(z6, false);
        }
        android.graphics.drawable.Drawable drawable3 = this.f17992I;
        if (drawable3 != null) {
            drawable3.setVisible(z6, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback, int i6) {
        if (i6 != 0) {
            return super.startActionModeForChild(view, callback, i6);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return (drawable == this.f17990G && !this.f17993J) || (drawable == this.f17991H && this.f17994K) || ((drawable == this.f17992I && this.f17993J) || super.verifyDrawable(drawable));
    }
}
