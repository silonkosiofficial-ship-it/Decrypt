package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.util.TypedValue f18091C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.util.TypedValue f18092D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.util.TypedValue f18093E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.util.TypedValue f18094F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private android.util.TypedValue f18095G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private android.util.TypedValue f18096H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final android.graphics.Rect f18097I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private androidx.appcompat.widget.ContentFrameLayout.a f18098J;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(android.content.Context context) {
        this(context, null);
    }

    public ContentFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f18097I = new android.graphics.Rect();
    }

    public void a(int i6, int i10, int i11, int i12) {
        this.f18097I.set(i6, i10, i11, i12);
        if (androidx.core.view.X.R(this)) {
            requestLayout();
        }
    }

    public android.util.TypedValue getFixedHeightMajor() {
        if (this.f18095G == null) {
            this.f18095G = new android.util.TypedValue();
        }
        return this.f18095G;
    }

    public android.util.TypedValue getFixedHeightMinor() {
        if (this.f18096H == null) {
            this.f18096H = new android.util.TypedValue();
        }
        return this.f18096H;
    }

    public android.util.TypedValue getFixedWidthMajor() {
        if (this.f18093E == null) {
            this.f18093E = new android.util.TypedValue();
        }
        return this.f18093E;
    }

    public android.util.TypedValue getFixedWidthMinor() {
        if (this.f18094F == null) {
            this.f18094F = new android.util.TypedValue();
        }
        return this.f18094F;
    }

    public android.util.TypedValue getMinWidthMajor() {
        if (this.f18091C == null) {
            this.f18091C = new android.util.TypedValue();
        }
        return this.f18091C;
    }

    public android.util.TypedValue getMinWidthMinor() {
        if (this.f18092D == null) {
            this.f18092D = new android.util.TypedValue();
        }
        return this.f18092D;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.ContentFrameLayout.a aVar = this.f18098J;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.ContentFrameLayout.a aVar = this.f18098J;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i6, int i10) {
        boolean z6;
        int i11;
        int i12;
        float fraction;
        int i13;
        int i14;
        float fraction2;
        int i15;
        int i16;
        float fraction3;
        android.util.DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z10 = true;
        boolean z11 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = android.view.View.MeasureSpec.getMode(i6);
        int mode2 = android.view.View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            z6 = false;
        } else {
            android.util.TypedValue typedValue = z11 ? this.f18094F : this.f18093E;
            if (typedValue == null || (i15 = typedValue.type) == 0) {
                z6 = false;
            } else {
                if (i15 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i15 == 6) {
                        int i17 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i17, i17);
                    } else {
                        i16 = 0;
                    }
                    if (i16 > 0) {
                        android.graphics.Rect rect = this.f18097I;
                        i6 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i16 - (rect.left + rect.right), android.view.View.MeasureSpec.getSize(i6)), 1073741824);
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                i16 = (int) fraction3;
                if (i16 > 0) {
                    android.graphics.Rect rect2 = this.f18097I;
                    i6 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i16 - (rect2.left + rect2.right), android.view.View.MeasureSpec.getSize(i6)), 1073741824);
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            android.util.TypedValue typedValue2 = z11 ? this.f18095G : this.f18096H;
            if (typedValue2 != null && (i13 = typedValue2.type) != 0) {
                if (i13 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i13 == 6) {
                        int i18 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i18, i18);
                    } else {
                        i14 = 0;
                    }
                    if (i14 > 0) {
                        android.graphics.Rect rect3 = this.f18097I;
                        i10 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i14 - (rect3.top + rect3.bottom), android.view.View.MeasureSpec.getSize(i10)), 1073741824);
                    }
                }
                i14 = (int) fraction2;
                if (i14 > 0) {
                    android.graphics.Rect rect4 = this.f18097I;
                    i10 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i14 - (rect4.top + rect4.bottom), android.view.View.MeasureSpec.getSize(i10)), 1073741824);
                }
            }
        }
        super.onMeasure(i6, i10);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z6 || mode != Integer.MIN_VALUE) {
            z10 = false;
        } else {
            android.util.TypedValue typedValue3 = z11 ? this.f18092D : this.f18091C;
            if (typedValue3 == null || (i11 = typedValue3.type) == 0) {
                z10 = false;
            } else {
                if (i11 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i11 == 6) {
                        int i19 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i19, i19);
                    } else {
                        i12 = 0;
                    }
                    if (i12 > 0) {
                        android.graphics.Rect rect5 = this.f18097I;
                        i12 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i12) {
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                    } else {
                        z10 = false;
                    }
                }
                i12 = (int) fraction;
                if (i12 > 0) {
                    android.graphics.Rect rect6 = this.f18097I;
                    i12 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i12) {
                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                } else {
                    z10 = false;
                }
            }
        }
        if (z10) {
            super.onMeasure(iMakeMeasureSpec, i10);
        }
    }

    public void setAttachListener(androidx.appcompat.widget.ContentFrameLayout.a aVar) {
        this.f18098J = aVar;
    }
}
