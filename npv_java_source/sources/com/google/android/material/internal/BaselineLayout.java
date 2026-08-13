package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
public class BaselineLayout extends android.view.ViewGroup {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f43333C;

    public BaselineLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f43333C = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f43333C;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i11 - i6) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            android.view.View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.f43333C == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f43333C + paddingTop) - childAt.getBaseline();
                childAt.layout(i14, baseline, measuredWidth + i14, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        int iMax3 = -1;
        int iMax4 = -1;
        for (int i11 = 0; i11 < childCount; i11++) {
            android.view.View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i6, i10);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    iMax3 = java.lang.Math.max(iMax3, baseline);
                    iMax4 = java.lang.Math.max(iMax4, childAt.getMeasuredHeight() - baseline);
                }
                iMax2 = java.lang.Math.max(iMax2, childAt.getMeasuredWidth());
                iMax = java.lang.Math.max(iMax, childAt.getMeasuredHeight());
                iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        if (iMax3 != -1) {
            iMax = java.lang.Math.max(iMax, java.lang.Math.max(iMax4, getPaddingBottom()) + iMax3);
            this.f43333C = iMax3;
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(iMax2, getSuggestedMinimumWidth()), i6, iCombineMeasuredStates), android.view.View.resolveSizeAndState(java.lang.Math.max(iMax, getSuggestedMinimumHeight()), i10, iCombineMeasuredStates << 16));
    }
}
