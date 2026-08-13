package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends androidx.appcompat.widget.O {
    public AlertDialogLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void A(android.view.View view, int i6, int i10, int i11, int i12) {
        view.layout(i6, i10, i11 + i6, i12 + i10);
    }

    private static int B(android.view.View view) {
        int iA = androidx.core.view.X.A(view);
        if (iA > 0) {
            return iA;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return B(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    private boolean C(int i6, int i10) {
        int iCombineMeasuredStates;
        int iB;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        android.view.View view = null;
        android.view.View view2 = null;
        android.view.View view3 = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            android.view.View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == p090j.f.f48732P) {
                    view = childAt;
                } else if (id == p090j.f.f48743k) {
                    view2 = childAt;
                } else {
                    if ((id != p090j.f.f48745m && id != p090j.f.f48747o) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = android.view.View.MeasureSpec.getMode(i10);
        int size = android.view.View.MeasureSpec.getSize(i10);
        int mode2 = android.view.View.MeasureSpec.getMode(i6);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i6, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i6, 0);
            iB = B(view2);
            measuredHeight = view2.getMeasuredHeight() - iB;
            paddingTop += iB;
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iB = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i6, mode == 0 ? 0 : android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i12 = size - paddingTop;
        if (view2 != null) {
            int i13 = paddingTop - iB;
            int iMin = java.lang.Math.min(i12, measuredHeight);
            if (iMin > 0) {
                i12 -= iMin;
                iB += iMin;
            }
            view2.measure(i6, android.view.View.MeasureSpec.makeMeasureSpec(iB, 1073741824));
            paddingTop = i13 + view2.getMeasuredHeight();
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i12 > 0) {
            view3.measure(i6, android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i12, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            android.view.View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() != 8) {
                iMax = java.lang.Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i6, iCombineMeasuredStates), android.view.View.resolveSizeAndState(paddingTop, i10, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        l(childCount, i10);
        return true;
    }

    private void l(int i6, int i10) {
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i11 = 0; i11 < i6; i11++) {
            android.view.View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                androidx.appcompat.widget.O.a aVar = (androidx.appcompat.widget.O.a) childAt.getLayoutParams();
                if (((android.widget.LinearLayout.LayoutParams) aVar).width == -1) {
                    int i12 = ((android.widget.LinearLayout.LayoutParams) aVar).height;
                    ((android.widget.LinearLayout.LayoutParams) aVar).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i10, 0);
                    ((android.widget.LinearLayout.LayoutParams) aVar).height = i12;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    @Override // androidx.appcompat.widget.O, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        int i13;
        int i14;
        int paddingLeft = getPaddingLeft();
        int i15 = i11 - i6;
        int paddingRight = i15 - getPaddingRight();
        int paddingRight2 = (i15 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i16 = gravity & 112;
        int i17 = gravity & 8388615;
        int paddingTop = i16 != 16 ? i16 != 80 ? getPaddingTop() : ((getPaddingTop() + i12) - i10) - measuredHeight : getPaddingTop() + (((i12 - i10) - measuredHeight) / 2);
        android.graphics.drawable.Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = getChildAt(i18);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                androidx.appcompat.widget.O.a aVar = (androidx.appcompat.widget.O.a) childAt.getLayoutParams();
                int i19 = ((android.widget.LinearLayout.LayoutParams) aVar).gravity;
                if (i19 < 0) {
                    i19 = i17;
                }
                int iB = androidx.core.view.AbstractC2025s.b(i19, androidx.core.view.X.z(this)) & 7;
                if (iB != 1) {
                    if (iB != 5) {
                        i14 = ((android.widget.LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    } else {
                        i13 = paddingRight - measuredWidth;
                    }
                    if (t(i18)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i20 = paddingTop + ((android.widget.LinearLayout.LayoutParams) aVar).topMargin;
                    A(childAt, i14, i20, measuredWidth, measuredHeight2);
                    paddingTop = i20 + measuredHeight2 + ((android.widget.LinearLayout.LayoutParams) aVar).bottomMargin;
                } else {
                    i13 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((android.widget.LinearLayout.LayoutParams) aVar).leftMargin;
                }
                i14 = i13 - ((android.widget.LinearLayout.LayoutParams) aVar).rightMargin;
                if (t(i18)) {
                    paddingTop += intrinsicHeight;
                }
                int i21 = paddingTop + ((android.widget.LinearLayout.LayoutParams) aVar).topMargin;
                A(childAt, i14, i21, measuredWidth, measuredHeight2);
                paddingTop = i21 + measuredHeight2 + ((android.widget.LinearLayout.LayoutParams) aVar).bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.O, android.view.View
    protected void onMeasure(int i6, int i10) {
        if (C(i6, i10)) {
            return;
        }
        super.onMeasure(i6, i10);
    }
}
