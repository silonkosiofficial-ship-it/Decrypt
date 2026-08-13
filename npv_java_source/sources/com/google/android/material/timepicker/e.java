package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes3.dex */
abstract class e extends androidx.constraintlayout.widget.ConstraintLayout {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final java.lang.Runnable f43900c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f43901d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private E4.g f43902e0;

    public e(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        android.view.LayoutInflater.from(context).inflate(p125m4.g.f50658f, this);
        androidx.core.view.X.r0(this, u());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p125m4.j.f50719A4, i6, 0);
        this.f43901d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(p125m4.j.f50726B4, 0);
        this.f43900c0 = new java.lang.Runnable() { // from class: com.google.android.material.timepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f43899C.z();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    private void A() {
        android.os.Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f43900c0);
            handler.post(this.f43900c0);
        }
    }

    private void t(java.util.List list, androidx.constraintlayout.widget.e eVar, int i6) {
        java.util.Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            eVar.g(((android.view.View) it.next()).getId(), p125m4.e.f50627c, i6, size);
            size += 360.0f / list.size();
        }
    }

    private android.graphics.drawable.Drawable u() {
        E4.g gVar = new E4.g();
        this.f43902e0 = gVar;
        gVar.T(new E4.i(0.5f));
        this.f43902e0.V(android.content.res.ColorStateList.valueOf(-1));
        return this.f43902e0;
    }

    private static boolean y(android.view.View view) {
        return "skip".equals(view.getTag());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(android.view.View view, int i6, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i6, layoutParams);
        if (view.getId() == -1) {
            view.setId(androidx.core.view.X.k());
        }
        A();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        z();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        A();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        this.f43902e0.V(android.content.res.ColorStateList.valueOf(i6));
    }

    int v(int i6) {
        return i6 == 2 ? java.lang.Math.round(this.f43901d0 * 0.66f) : this.f43901d0;
    }

    public int w() {
        return this.f43901d0;
    }

    public void x(int i6) {
        this.f43901d0 = i6;
        z();
    }

    protected void z() {
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.f(this);
        java.util.HashMap map = new java.util.HashMap();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            android.view.View childAt = getChildAt(i6);
            if (childAt.getId() != p125m4.e.f50627c && !y(childAt)) {
                int i10 = (java.lang.Integer) childAt.getTag(p125m4.e.f50635k);
                if (i10 == null) {
                    i10 = 1;
                }
                if (!map.containsKey(i10)) {
                    map.put(i10, new java.util.ArrayList());
                }
                ((java.util.List) map.get(i10)).add(childAt);
            }
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            t((java.util.List) entry.getValue(), eVar, v(((java.lang.Integer) entry.getKey()).intValue()));
        }
        eVar.c(this);
    }
}
