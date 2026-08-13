package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
final class MaterialCalendarGridView extends android.widget.GridView {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.Calendar f43184C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f43185D;

    class a extends androidx.core.view.C1990a {
        a() {
        }

        @Override // androidx.core.view.C1990a
        public void g(android.view.View view, C1.B b6) {
            super.g(view, b6);
            b6.o0(null);
        }
    }

    public MaterialCalendarGridView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f43184C = com.google.android.material.datepicker.z.k();
        if (com.google.android.material.datepicker.l.b2(getContext())) {
            setNextFocusLeftId(p125m4.e.f50625a);
            setNextFocusRightId(p125m4.e.f50628d);
        }
        this.f43185D = com.google.android.material.datepicker.l.d2(getContext());
        androidx.core.view.X.n0(this, new com.google.android.material.datepicker.MaterialCalendarGridView.a());
    }

    private void a(int i6, android.graphics.Rect rect) {
        int iB;
        if (i6 == 33) {
            iB = getAdapter().k();
        } else {
            if (i6 != 130) {
                super.onFocusChanged(true, i6, rect);
                return;
            }
            iB = getAdapter().b();
        }
        setSelection(iB);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.android.material.datepicker.o getAdapter() {
        return (com.google.android.material.datepicker.o) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        com.google.android.material.datepicker.o adapter = getAdapter();
        adapter.getClass();
        int iMax = java.lang.Math.max(adapter.b(), getFirstVisiblePosition());
        int iMin = java.lang.Math.min(adapter.k(), getLastVisiblePosition());
        adapter.getItem(iMax);
        adapter.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z6, int i6, android.graphics.Rect rect) {
        if (z6) {
            a(i6, rect);
        } else {
            super.onFocusChanged(false, i6, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i6, android.view.KeyEvent keyEvent) {
        if (!super.onKeyDown(i6, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i6) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i6, int i10) {
        if (!this.f43185D) {
            super.onMeasure(i6, i10);
            return;
        }
        super.onMeasure(i6, android.view.View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(android.widget.ListAdapter listAdapter) {
        if (!(listAdapter instanceof com.google.android.material.datepicker.o)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%1$s must have its Adapter set to a %2$s", com.google.android.material.datepicker.MaterialCalendarGridView.class.getCanonicalName(), com.google.android.material.datepicker.o.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i6) {
        if (i6 < getAdapter().b()) {
            i6 = getAdapter().b();
        }
        super.setSelection(i6);
    }
}
