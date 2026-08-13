package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f22723C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f22724D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f22725E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f22726F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f22727G;

        a(int i6, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.ArrayList arrayList4) {
            this.f22723C = i6;
            this.f22724D = arrayList;
            this.f22725E = arrayList2;
            this.f22726F = arrayList3;
            this.f22727G = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i6 = 0; i6 < this.f22723C; i6++) {
                androidx.core.view.X.E0((android.view.View) this.f22724D.get(i6), (java.lang.String) this.f22725E.get(i6));
                androidx.core.view.X.E0((android.view.View) this.f22726F.get(i6), (java.lang.String) this.f22727G.get(i6));
            }
        }
    }

    protected static void d(java.util.List list, android.view.View view) {
        int size = list.size();
        if (g(list, view, size)) {
            return;
        }
        if (androidx.core.view.X.H(view) != null) {
            list.add(view);
        }
        for (int i6 = size; i6 < list.size(); i6++) {
            android.view.View view2 = (android.view.View) list.get(i6);
            if (view2 instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    android.view.View childAt = viewGroup.getChildAt(i10);
                    if (!g(list, childAt, size) && androidx.core.view.X.H(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean g(java.util.List list, android.view.View view, int i6) {
        for (int i10 = 0; i10 < i6; i10++) {
            if (list.get(i10) == view) {
                return true;
            }
        }
        return false;
    }

    protected static boolean i(java.util.List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(java.lang.Object obj, android.view.View view);

    public abstract void b(java.lang.Object obj, java.util.ArrayList arrayList);

    public abstract void c(android.view.ViewGroup viewGroup, java.lang.Object obj);

    public abstract boolean e(java.lang.Object obj);

    public abstract java.lang.Object f(java.lang.Object obj);

    protected void h(android.view.View view, android.graphics.Rect rect) {
        if (androidx.core.view.X.Q(view)) {
            android.graphics.RectF rectF = new android.graphics.RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            java.lang.Object parent = view.getParent();
            while (parent instanceof android.view.View) {
                android.view.View view2 = (android.view.View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(java.lang.Math.round(rectF.left), java.lang.Math.round(rectF.top), java.lang.Math.round(rectF.right), java.lang.Math.round(rectF.bottom));
        }
    }

    public abstract java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3);

    public abstract java.lang.Object k(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3);

    java.util.ArrayList l(java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            android.view.View view = (android.view.View) arrayList.get(i6);
            arrayList2.add(androidx.core.view.X.H(view));
            androidx.core.view.X.E0(view, null);
        }
        return arrayList2;
    }

    public abstract void m(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList);

    public abstract void n(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2, java.lang.Object obj4, java.util.ArrayList arrayList3);

    public abstract void o(java.lang.Object obj, android.graphics.Rect rect);

    public abstract void p(java.lang.Object obj, android.view.View view);

    public abstract void q(androidx.fragment.app.f fVar, java.lang.Object obj, androidx.core.os.e eVar, java.lang.Runnable runnable);

    void r(android.view.View view, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.Map map) {
        int size = arrayList2.size();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (int i6 = 0; i6 < size; i6++) {
            android.view.View view2 = (android.view.View) arrayList.get(i6);
            java.lang.String strH = androidx.core.view.X.H(view2);
            arrayList4.add(strH);
            if (strH != null) {
                androidx.core.view.X.E0(view2, null);
                java.lang.String str = (java.lang.String) map.get(strH);
                for (int i10 = 0; i10 < size; i10++) {
                    if (str.equals(arrayList3.get(i10))) {
                        androidx.core.view.X.E0((android.view.View) arrayList2.get(i10), strH);
                        break;
                    }
                }
            }
        }
        androidx.core.view.J.a(view, new androidx.fragment.app.x.a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void s(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList);

    public abstract void t(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2);

    public abstract java.lang.Object u(java.lang.Object obj);
}
