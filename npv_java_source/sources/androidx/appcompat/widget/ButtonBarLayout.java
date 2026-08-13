package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f18067C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f18068D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f18069E;

    public ButtonBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18069E = -1;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p090j.j.f48850N0);
        androidx.core.view.X.l0(this, context, p090j.j.f48850N0, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f18067C = typedArrayObtainStyledAttributes.getBoolean(p090j.j.f48854O0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f18067C);
        }
    }

    private int a(int i6) {
        int childCount = getChildCount();
        while (i6 < childCount) {
            if (getChildAt(i6).getVisibility() == 0) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    private boolean b() {
        return this.f18068D;
    }

    private void setStacked(boolean z6) {
        if (this.f18068D != z6) {
            if (!z6 || this.f18067C) {
                this.f18068D = z6;
                setOrientation(z6 ? 1 : 0);
                setGravity(z6 ? 8388613 : 80);
                android.view.View viewFindViewById = findViewById(p090j.f.f48723G);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z6 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i6, int i10) {
        int iMakeMeasureSpec;
        boolean z6;
        int size = android.view.View.MeasureSpec.getSize(i6);
        int paddingBottom = 0;
        if (this.f18067C) {
            if (size > this.f18069E && b()) {
                setStacked(false);
            }
            this.f18069E = size;
        }
        if (b() || android.view.View.MeasureSpec.getMode(i6) != 1073741824) {
            iMakeMeasureSpec = i6;
            z6 = false;
        } else {
            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z6 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i10);
        if (this.f18067C && !b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z6 = true;
        }
        if (z6) {
            super.onMeasure(i6, i10);
        }
        int iA = a(0);
        if (iA >= 0) {
            android.view.View childAt = getChildAt(iA);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int iA2 = a(iA + 1);
                if (iA2 >= 0) {
                    paddingTop += getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (androidx.core.view.X.A(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i10 == 0) {
                super.onMeasure(i6, i10);
            }
        }
    }

    public void setAllowStacking(boolean z6) {
        if (this.f18067C != z6) {
            this.f18067C = z6;
            if (!z6 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
