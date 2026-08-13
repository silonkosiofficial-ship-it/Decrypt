package com.google.android.material.button;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final int f42984M = p125m4.i.f50709p;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f42985C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.material.button.MaterialButtonToggleGroup.e f42986D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.LinkedHashSet f42987E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.Comparator f42988F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private java.lang.Integer[] f42989G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f42990H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f42991I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f42992J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final int f42993K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private java.util.Set f42994L;

    class a implements java.util.Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(com.google.android.material.button.MaterialButton materialButton, com.google.android.material.button.MaterialButton materialButton2) {
            int iCompareTo = java.lang.Boolean.valueOf(materialButton.isChecked()).compareTo(java.lang.Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = java.lang.Boolean.valueOf(materialButton.isPressed()).compareTo(java.lang.Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : java.lang.Integer.valueOf(com.google.android.material.button.MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(java.lang.Integer.valueOf(com.google.android.material.button.MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends androidx.core.view.C1990a {
        b() {
        }

        @Override // androidx.core.view.C1990a
        public void g(android.view.View view, C1.B b6) {
            super.g(view, b6);
            b6.p0(C1.B.f.a(0, 1, com.google.android.material.button.MaterialButtonToggleGroup.this.i(view), 1, false, ((com.google.android.material.button.MaterialButton) view).isChecked()));
        }
    }

    private static class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final E4.c f42997e = new E4.a(0.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        E4.c f42998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        E4.c f42999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        E4.c f43000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        E4.c f43001d;

        c(E4.c cVar, E4.c cVar2, E4.c cVar3, E4.c cVar4) {
            this.f42998a = cVar;
            this.f42999b = cVar3;
            this.f43000c = cVar4;
            this.f43001d = cVar2;
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.c a(com.google.android.material.button.MaterialButtonToggleGroup.c cVar) {
            E4.c cVar2 = f42997e;
            return new com.google.android.material.button.MaterialButtonToggleGroup.c(cVar2, cVar.f43001d, cVar2, cVar.f43000c);
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.c b(com.google.android.material.button.MaterialButtonToggleGroup.c cVar, android.view.View view) {
            return com.google.android.material.internal.n.g(view) ? c(cVar) : d(cVar);
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.c c(com.google.android.material.button.MaterialButtonToggleGroup.c cVar) {
            E4.c cVar2 = cVar.f42998a;
            E4.c cVar3 = cVar.f43001d;
            E4.c cVar4 = f42997e;
            return new com.google.android.material.button.MaterialButtonToggleGroup.c(cVar2, cVar3, cVar4, cVar4);
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.c d(com.google.android.material.button.MaterialButtonToggleGroup.c cVar) {
            E4.c cVar2 = f42997e;
            return new com.google.android.material.button.MaterialButtonToggleGroup.c(cVar2, cVar2, cVar.f42999b, cVar.f43000c);
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.c e(com.google.android.material.button.MaterialButtonToggleGroup.c cVar, android.view.View view) {
            return com.google.android.material.internal.n.g(view) ? d(cVar) : c(cVar);
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.c f(com.google.android.material.button.MaterialButtonToggleGroup.c cVar) {
            E4.c cVar2 = cVar.f42998a;
            E4.c cVar3 = f42997e;
            return new com.google.android.material.button.MaterialButtonToggleGroup.c(cVar2, cVar3, cVar.f42999b, cVar3);
        }
    }

    public interface d {
        void a(com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup, int i6, boolean z6);
    }

    private class e implements com.google.android.material.button.MaterialButton.a {
        private e() {
        }

        /* synthetic */ e(com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup, com.google.android.material.button.MaterialButtonToggleGroup.a aVar) {
            this();
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(com.google.android.material.button.MaterialButton materialButton, boolean z6) {
            com.google.android.material.button.MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p125m4.a.f50529w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        int i10 = f42984M;
        super(H4.a.c(context, attributeSet, i6, i10), attributeSet, i6);
        this.f42985C = new java.util.ArrayList();
        this.f42986D = new com.google.android.material.button.MaterialButtonToggleGroup.e(this, null);
        this.f42987E = new java.util.LinkedHashSet();
        this.f42988F = new com.google.android.material.button.MaterialButtonToggleGroup.a();
        this.f42990H = false;
        this.f42994L = new java.util.HashSet();
        android.content.res.TypedArray typedArrayI = com.google.android.material.internal.k.i(getContext(), attributeSet, p125m4.j.f50907Y2, i6, i10, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(p125m4.j.f50939c3, false));
        this.f42993K = typedArrayI.getResourceId(p125m4.j.f50923a3, -1);
        this.f42992J = typedArrayI.getBoolean(p125m4.j.f50931b3, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayI.getBoolean(p125m4.j.f50915Z2, true));
        typedArrayI.recycle();
        androidx.core.view.X.w0(this, 1);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i6 = firstVisibleChildIndex + 1; i6 < getChildCount(); i6++) {
            com.google.android.material.button.MaterialButton materialButtonH = h(i6);
            int iMin = java.lang.Math.min(materialButtonH.getStrokeWidth(), h(i6 - 1).getStrokeWidth());
            android.widget.LinearLayout.LayoutParams layoutParamsD = d(materialButtonH);
            if (getOrientation() == 0) {
                androidx.core.view.AbstractC2031v.c(layoutParamsD, 0);
                androidx.core.view.AbstractC2031v.d(layoutParamsD, -iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = -iMin;
                androidx.core.view.AbstractC2031v.d(layoutParamsD, 0);
            }
            materialButtonH.setLayoutParams(layoutParamsD);
        }
        n(firstVisibleChildIndex);
    }

    private android.widget.LinearLayout.LayoutParams d(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : new android.widget.LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void e(int i6, boolean z6) {
        if (i6 == -1) {
            java.lang.String str = "Button ID is not valid: " + i6;
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet(this.f42994L);
        if (z6 && !hashSet.contains(java.lang.Integer.valueOf(i6))) {
            if (this.f42991I && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(java.lang.Integer.valueOf(i6));
        } else {
            if (z6 || !hashSet.contains(java.lang.Integer.valueOf(i6))) {
                return;
            }
            if (!this.f42992J || hashSet.size() > 1) {
                hashSet.remove(java.lang.Integer.valueOf(i6));
            }
        }
        q(hashSet);
    }

    private void g(int i6, boolean z6) {
        java.util.Iterator it = this.f42987E.iterator();
        while (it.hasNext()) {
            ((com.google.android.material.button.MaterialButtonToggleGroup.d) it.next()).a(this, i6, z6);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            if (k(i6)) {
                return i6;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i6 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof com.google.android.material.button.MaterialButton) && k(i10)) {
                i6++;
            }
        }
        return i6;
    }

    private com.google.android.material.button.MaterialButton h(int i6) {
        return (com.google.android.material.button.MaterialButton) getChildAt(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i(android.view.View view) {
        if (!(view instanceof com.google.android.material.button.MaterialButton)) {
            return -1;
        }
        int i6 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) == view) {
                return i6;
            }
            if ((getChildAt(i10) instanceof com.google.android.material.button.MaterialButton) && k(i10)) {
                i6++;
            }
        }
        return -1;
    }

    private com.google.android.material.button.MaterialButtonToggleGroup.c j(int i6, int i10, int i11) {
        com.google.android.material.button.MaterialButtonToggleGroup.c cVar = (com.google.android.material.button.MaterialButtonToggleGroup.c) this.f42985C.get(i6);
        if (i10 == i11) {
            return cVar;
        }
        boolean z6 = getOrientation() == 0;
        if (i6 == i10) {
            return z6 ? com.google.android.material.button.MaterialButtonToggleGroup.c.e(cVar, this) : com.google.android.material.button.MaterialButtonToggleGroup.c.f(cVar);
        }
        if (i6 == i11) {
            return z6 ? com.google.android.material.button.MaterialButtonToggleGroup.c.b(cVar, this) : com.google.android.material.button.MaterialButtonToggleGroup.c.a(cVar);
        }
        return null;
    }

    private boolean k(int i6) {
        return getChildAt(i6).getVisibility() != 8;
    }

    private void n(int i6) {
        if (getChildCount() == 0 || i6 == -1) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) h(i6).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            androidx.core.view.AbstractC2031v.c(layoutParams, 0);
            androidx.core.view.AbstractC2031v.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void o(int i6, boolean z6) {
        android.view.View viewFindViewById = findViewById(i6);
        if (viewFindViewById instanceof com.google.android.material.button.MaterialButton) {
            this.f42990H = true;
            ((com.google.android.material.button.MaterialButton) viewFindViewById).setChecked(z6);
            this.f42990H = false;
        }
    }

    private static void p(E4.k.b bVar, com.google.android.material.button.MaterialButtonToggleGroup.c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.f42998a).t(cVar.f43001d).F(cVar.f42999b).x(cVar.f43000c);
        }
    }

    private void q(java.util.Set set) {
        java.util.Set set2 = this.f42994L;
        this.f42994L = new java.util.HashSet(set);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            int id = h(i6).getId();
            o(id, set.contains(java.lang.Integer.valueOf(id)));
            if (set2.contains(java.lang.Integer.valueOf(id)) != set.contains(java.lang.Integer.valueOf(id))) {
                g(id, set.contains(java.lang.Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void r() {
        java.util.TreeMap treeMap = new java.util.TreeMap(this.f42988F);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            treeMap.put(h(i6), java.lang.Integer.valueOf(i6));
        }
        this.f42989G = (java.lang.Integer[]) treeMap.values().toArray(new java.lang.Integer[0]);
    }

    private void setGeneratedIdIfNeeded(com.google.android.material.button.MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(androidx.core.view.X.k());
        }
    }

    private void setupButtonChild(com.google.android.material.button.MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(android.text.TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f42986D);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private void t() {
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            h(i6).setA11yClassName((this.f42991I ? android.widget.RadioButton.class : android.widget.ToggleButton.class).getName());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i6, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view instanceof com.google.android.material.button.MaterialButton) {
            super.addView(view, i6, layoutParams);
            com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            e(materialButton.getId(), materialButton.isChecked());
            E4.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f42985C.add(new com.google.android.material.button.MaterialButtonToggleGroup.c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
            materialButton.setEnabled(isEnabled());
            androidx.core.view.X.n0(materialButton, new com.google.android.material.button.MaterialButtonToggleGroup.b());
        }
    }

    public void b(com.google.android.material.button.MaterialButtonToggleGroup.d dVar) {
        this.f42987E.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public void f() {
        q(new java.util.HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f42991I || this.f42994L.isEmpty()) {
            return -1;
        }
        return ((java.lang.Integer) this.f42994L.iterator().next()).intValue();
    }

    public java.util.List<java.lang.Integer> getCheckedButtonIds() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            int id = h(i6).getId();
            if (this.f42994L.contains(java.lang.Integer.valueOf(id))) {
                arrayList.add(java.lang.Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i6, int i10) {
        java.lang.Integer[] numArr = this.f42989G;
        return (numArr == null || i10 >= numArr.length) ? i10 : numArr[i10].intValue();
    }

    public boolean l() {
        return this.f42991I;
    }

    void m(com.google.android.material.button.MaterialButton materialButton, boolean z6) {
        if (this.f42990H) {
            return;
        }
        e(materialButton.getId(), z6);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i6 = this.f42993K;
        if (i6 != -1) {
            q(java.util.Collections.singleton(java.lang.Integer.valueOf(i6)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1.B.b1(accessibilityNodeInfo).o0(C1.B.e.a(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i6, int i10) {
        s();
        c();
        super.onMeasure(i6, i10);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if (view instanceof com.google.android.material.button.MaterialButton) {
            ((com.google.android.material.button.MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f42985C.remove(iIndexOfChild);
        }
        s();
        c();
    }

    void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i6 = 0; i6 < childCount; i6++) {
            com.google.android.material.button.MaterialButton materialButtonH = h(i6);
            if (materialButtonH.getVisibility() != 8) {
                E4.k.b bVarV = materialButtonH.getShapeAppearanceModel().v();
                p(bVarV, j(i6, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonH.setShapeAppearanceModel(bVarV.m());
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            h(i6).setEnabled(z6);
        }
    }

    public void setSelectionRequired(boolean z6) {
        this.f42992J = z6;
    }

    public void setSingleSelection(int i6) {
        setSingleSelection(getResources().getBoolean(i6));
    }

    public void setSingleSelection(boolean z6) {
        if (this.f42991I != z6) {
            this.f42991I = z6;
            f();
        }
        t();
    }
}
