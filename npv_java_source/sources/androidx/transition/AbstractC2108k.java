package androidx.transition;

/* JADX INFO: renamed from: androidx.transition.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2108k implements java.lang.Cloneable {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final android.animation.Animator[] f23609k0 = new android.animation.Animator[0];

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int[] f23610l0 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final androidx.transition.AbstractC2104g f23611m0 = new androidx.transition.AbstractC2108k.a();

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static java.lang.ThreadLocal f23612n0 = new java.lang.ThreadLocal();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private java.util.ArrayList f23632V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private java.util.ArrayList f23633W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private androidx.transition.AbstractC2108k.f[] f23634X;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private androidx.transition.AbstractC2108k.e f23644h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private p170r.C7026a f23645i0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.lang.String f23613C = getClass().getName();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f23614D = -1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    long f23615E = -1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.animation.TimeInterpolator f23616F = null;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    java.util.ArrayList f23617G = new java.util.ArrayList();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    java.util.ArrayList f23618H = new java.util.ArrayList();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.util.ArrayList f23619I = null;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private java.util.ArrayList f23620J = null;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.util.ArrayList f23621K = null;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private java.util.ArrayList f23622L = null;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private java.util.ArrayList f23623M = null;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private java.util.ArrayList f23624N = null;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private java.util.ArrayList f23625O = null;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private java.util.ArrayList f23626P = null;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private java.util.ArrayList f23627Q = null;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private androidx.transition.y f23628R = new androidx.transition.y();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private androidx.transition.y f23629S = new androidx.transition.y();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    androidx.transition.v f23630T = null;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int[] f23631U = f23610l0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    boolean f23635Y = false;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    java.util.ArrayList f23636Z = new java.util.ArrayList();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private android.animation.Animator[] f23637a0 = f23609k0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    int f23638b0 = 0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f23639c0 = false;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    boolean f23640d0 = false;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private androidx.transition.AbstractC2108k f23641e0 = null;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private java.util.ArrayList f23642f0 = null;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    java.util.ArrayList f23643g0 = new java.util.ArrayList();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private androidx.transition.AbstractC2104g f23646j0 = f23611m0;

    /* JADX INFO: renamed from: androidx.transition.k$a */
    class a extends androidx.transition.AbstractC2104g {
        a() {
        }

        @Override // androidx.transition.AbstractC2104g
        public android.graphics.Path a(float f6, float f10, float f11, float f12) {
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(f6, f10);
            path.lineTo(f11, f12);
            return path;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$b */
    class b extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p170r.C7026a f23647a;

        b(p170r.C7026a c7026a) {
            this.f23647a = c7026a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            this.f23647a.remove(animator);
            androidx.transition.AbstractC2108k.this.f23636Z.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            androidx.transition.AbstractC2108k.this.f23636Z.add(animator);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$c */
    class c extends android.animation.AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            androidx.transition.AbstractC2108k.this.t();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$d */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.view.View f23650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.lang.String f23651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        androidx.transition.x f23652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        android.view.WindowId f23653d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.transition.AbstractC2108k f23654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        android.animation.Animator f23655f;

        d(android.view.View view, java.lang.String str, androidx.transition.AbstractC2108k abstractC2108k, android.view.WindowId windowId, androidx.transition.x xVar, android.animation.Animator animator) {
            this.f23650a = view;
            this.f23651b = str;
            this.f23652c = xVar;
            this.f23653d = windowId;
            this.f23654e = abstractC2108k;
            this.f23655f = animator;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$e */
    public static abstract class e {
    }

    /* JADX INFO: renamed from: androidx.transition.k$f */
    public interface f {
        void a(androidx.transition.AbstractC2108k abstractC2108k);

        void b(androidx.transition.AbstractC2108k abstractC2108k);

        void c(androidx.transition.AbstractC2108k abstractC2108k, boolean z6);

        void d(androidx.transition.AbstractC2108k abstractC2108k);

        void e(androidx.transition.AbstractC2108k abstractC2108k);

        void f(androidx.transition.AbstractC2108k abstractC2108k, boolean z6);

        void g(androidx.transition.AbstractC2108k abstractC2108k);
    }

    /* JADX INFO: renamed from: androidx.transition.k$g */
    interface g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.transition.AbstractC2108k.g f23656a = new androidx.transition.AbstractC2108k.g() { // from class: androidx.transition.m
            @Override // androidx.transition.AbstractC2108k.g
            public final void a(androidx.transition.AbstractC2108k.f fVar, androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
                fVar.f(abstractC2108k, z6);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final androidx.transition.AbstractC2108k.g f23657b = new androidx.transition.AbstractC2108k.g() { // from class: androidx.transition.n
            @Override // androidx.transition.AbstractC2108k.g
            public final void a(androidx.transition.AbstractC2108k.f fVar, androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
                fVar.c(abstractC2108k, z6);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final androidx.transition.AbstractC2108k.g f23658c = new androidx.transition.AbstractC2108k.g() { // from class: androidx.transition.o
            @Override // androidx.transition.AbstractC2108k.g
            public final void a(androidx.transition.AbstractC2108k.f fVar, androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
                fVar.e(abstractC2108k);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final androidx.transition.AbstractC2108k.g f23659d = new androidx.transition.AbstractC2108k.g() { // from class: androidx.transition.p
            @Override // androidx.transition.AbstractC2108k.g
            public final void a(androidx.transition.AbstractC2108k.f fVar, androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
                fVar.b(abstractC2108k);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final androidx.transition.AbstractC2108k.g f23660e = new androidx.transition.AbstractC2108k.g() { // from class: androidx.transition.q
            @Override // androidx.transition.AbstractC2108k.g
            public final void a(androidx.transition.AbstractC2108k.f fVar, androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
                fVar.g(abstractC2108k);
            }
        };

        void a(androidx.transition.AbstractC2108k.f fVar, androidx.transition.AbstractC2108k abstractC2108k, boolean z6);
    }

    private static p170r.C7026a C() {
        p170r.C7026a c7026a = (p170r.C7026a) f23612n0.get();
        if (c7026a != null) {
            return c7026a;
        }
        p170r.C7026a c7026a2 = new p170r.C7026a();
        f23612n0.set(c7026a2);
        return c7026a2;
    }

    private static boolean O(androidx.transition.x xVar, androidx.transition.x xVar2, java.lang.String str) {
        java.lang.Object obj = xVar.f23677a.get(str);
        java.lang.Object obj2 = xVar2.f23677a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void P(p170r.C7026a c7026a, p170r.C7026a c7026a2, android.util.SparseArray sparseArray, android.util.SparseArray sparseArray2) {
        android.view.View view;
        int size = sparseArray.size();
        for (int i6 = 0; i6 < size; i6++) {
            android.view.View view2 = (android.view.View) sparseArray.valueAt(i6);
            if (view2 != null && M(view2) && (view = (android.view.View) sparseArray2.get(sparseArray.keyAt(i6))) != null && M(view)) {
                androidx.transition.x xVar = (androidx.transition.x) c7026a.get(view2);
                androidx.transition.x xVar2 = (androidx.transition.x) c7026a2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.f23632V.add(xVar);
                    this.f23633W.add(xVar2);
                    c7026a.remove(view2);
                    c7026a2.remove(view);
                }
            }
        }
    }

    private void Q(p170r.C7026a c7026a, p170r.C7026a c7026a2) {
        androidx.transition.x xVar;
        for (int size = c7026a.size() - 1; size >= 0; size--) {
            android.view.View view = (android.view.View) c7026a.f(size);
            if (view != null && M(view) && (xVar = (androidx.transition.x) c7026a2.remove(view)) != null && M(xVar.f23678b)) {
                this.f23632V.add((androidx.transition.x) c7026a.h(size));
                this.f23633W.add(xVar);
            }
        }
    }

    private void S(p170r.C7026a c7026a, p170r.C7026a c7026a2, p170r.C7046v c7046v, p170r.C7046v c7046v2) {
        android.view.View view;
        int iQ = c7046v.q();
        for (int i6 = 0; i6 < iQ; i6++) {
            android.view.View view2 = (android.view.View) c7046v.r(i6);
            if (view2 != null && M(view2) && (view = (android.view.View) c7046v2.e(c7046v.l(i6))) != null && M(view)) {
                androidx.transition.x xVar = (androidx.transition.x) c7026a.get(view2);
                androidx.transition.x xVar2 = (androidx.transition.x) c7026a2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.f23632V.add(xVar);
                    this.f23633W.add(xVar2);
                    c7026a.remove(view2);
                    c7026a2.remove(view);
                }
            }
        }
    }

    private void T(p170r.C7026a c7026a, p170r.C7026a c7026a2, p170r.C7026a c7026a3, p170r.C7026a c7026a4) {
        android.view.View view;
        int size = c7026a3.size();
        for (int i6 = 0; i6 < size; i6++) {
            android.view.View view2 = (android.view.View) c7026a3.k(i6);
            if (view2 != null && M(view2) && (view = (android.view.View) c7026a4.get(c7026a3.f(i6))) != null && M(view)) {
                androidx.transition.x xVar = (androidx.transition.x) c7026a.get(view2);
                androidx.transition.x xVar2 = (androidx.transition.x) c7026a2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.f23632V.add(xVar);
                    this.f23633W.add(xVar2);
                    c7026a.remove(view2);
                    c7026a2.remove(view);
                }
            }
        }
    }

    private void U(androidx.transition.y yVar, androidx.transition.y yVar2) {
        p170r.C7026a c7026a = new p170r.C7026a(yVar.f23680a);
        p170r.C7026a c7026a2 = new p170r.C7026a(yVar2.f23680a);
        int i6 = 0;
        while (true) {
            int[] iArr = this.f23631U;
            if (i6 >= iArr.length) {
                c(c7026a, c7026a2);
                return;
            }
            int i10 = iArr[i6];
            if (i10 == 1) {
                Q(c7026a, c7026a2);
            } else if (i10 == 2) {
                T(c7026a, c7026a2, yVar.f23683d, yVar2.f23683d);
            } else if (i10 == 3) {
                P(c7026a, c7026a2, yVar.f23681b, yVar2.f23681b);
            } else if (i10 == 4) {
                S(c7026a, c7026a2, yVar.f23682c, yVar2.f23682c);
            }
            i6++;
        }
    }

    private void V(androidx.transition.AbstractC2108k abstractC2108k, androidx.transition.AbstractC2108k.g gVar, boolean z6) {
        androidx.transition.AbstractC2108k abstractC2108k2 = this.f23641e0;
        if (abstractC2108k2 != null) {
            abstractC2108k2.V(abstractC2108k, gVar, z6);
        }
        java.util.ArrayList arrayList = this.f23642f0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f23642f0.size();
        androidx.transition.AbstractC2108k.f[] fVarArr = this.f23634X;
        if (fVarArr == null) {
            fVarArr = new androidx.transition.AbstractC2108k.f[size];
        }
        this.f23634X = null;
        androidx.transition.AbstractC2108k.f[] fVarArr2 = (androidx.transition.AbstractC2108k.f[]) this.f23642f0.toArray(fVarArr);
        for (int i6 = 0; i6 < size; i6++) {
            gVar.a(fVarArr2[i6], abstractC2108k, z6);
            fVarArr2[i6] = null;
        }
        this.f23634X = fVarArr2;
    }

    private void c(p170r.C7026a c7026a, p170r.C7026a c7026a2) {
        for (int i6 = 0; i6 < c7026a.size(); i6++) {
            androidx.transition.x xVar = (androidx.transition.x) c7026a.k(i6);
            if (M(xVar.f23678b)) {
                this.f23632V.add(xVar);
                this.f23633W.add(null);
            }
        }
        for (int i10 = 0; i10 < c7026a2.size(); i10++) {
            androidx.transition.x xVar2 = (androidx.transition.x) c7026a2.k(i10);
            if (M(xVar2.f23678b)) {
                this.f23633W.add(xVar2);
                this.f23632V.add(null);
            }
        }
    }

    private void c0(android.animation.Animator animator, p170r.C7026a c7026a) {
        if (animator != null) {
            animator.addListener(new androidx.transition.AbstractC2108k.b(c7026a));
            e(animator);
        }
    }

    private static void d(androidx.transition.y yVar, android.view.View view, androidx.transition.x xVar) {
        yVar.f23680a.put(view, xVar);
        int id = view.getId();
        if (id >= 0) {
            if (yVar.f23681b.indexOfKey(id) >= 0) {
                yVar.f23681b.put(id, null);
            } else {
                yVar.f23681b.put(id, view);
            }
        }
        java.lang.String strH = androidx.core.view.X.H(view);
        if (strH != null) {
            if (yVar.f23683d.containsKey(strH)) {
                yVar.f23683d.put(strH, null);
            } else {
                yVar.f23683d.put(strH, view);
            }
        }
        if (view.getParent() instanceof android.widget.ListView) {
            android.widget.ListView listView = (android.widget.ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (yVar.f23682c.j(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    yVar.f23682c.m(itemIdAtPosition, view);
                    return;
                }
                android.view.View view2 = (android.view.View) yVar.f23682c.e(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    yVar.f23682c.m(itemIdAtPosition, null);
                }
            }
        }
    }

    private void j(android.view.View view, boolean z6) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        java.util.ArrayList arrayList = this.f23621K;
        if (arrayList == null || !arrayList.contains(java.lang.Integer.valueOf(id))) {
            java.util.ArrayList arrayList2 = this.f23622L;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                java.util.ArrayList arrayList3 = this.f23623M;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        if (((java.lang.Class) this.f23623M.get(i6)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof android.view.ViewGroup) {
                    androidx.transition.x xVar = new androidx.transition.x(view);
                    if (z6) {
                        l(xVar);
                    } else {
                        h(xVar);
                    }
                    xVar.f23679c.add(this);
                    k(xVar);
                    d(z6 ? this.f23628R : this.f23629S, view, xVar);
                }
                if (view instanceof android.view.ViewGroup) {
                    java.util.ArrayList arrayList4 = this.f23625O;
                    if (arrayList4 == null || !arrayList4.contains(java.lang.Integer.valueOf(id))) {
                        java.util.ArrayList arrayList5 = this.f23626P;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            java.util.ArrayList arrayList6 = this.f23627Q;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    if (((java.lang.Class) this.f23627Q.get(i10)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                                j(viewGroup.getChildAt(i11), z6);
                            }
                        }
                    }
                }
            }
        }
    }

    public androidx.transition.u A() {
        return null;
    }

    public final androidx.transition.AbstractC2108k B() {
        androidx.transition.v vVar = this.f23630T;
        return vVar != null ? vVar.B() : this;
    }

    public long E() {
        return this.f23614D;
    }

    public java.util.List F() {
        return this.f23617G;
    }

    public java.util.List G() {
        return this.f23619I;
    }

    public java.util.List H() {
        return this.f23620J;
    }

    public java.util.List I() {
        return this.f23618H;
    }

    public java.lang.String[] J() {
        return null;
    }

    public androidx.transition.x K(android.view.View view, boolean z6) {
        androidx.transition.v vVar = this.f23630T;
        if (vVar != null) {
            return vVar.K(view, z6);
        }
        return (androidx.transition.x) (z6 ? this.f23628R : this.f23629S).f23680a.get(view);
    }

    public boolean L(androidx.transition.x xVar, androidx.transition.x xVar2) {
        if (xVar == null || xVar2 == null) {
            return false;
        }
        java.lang.String[] strArrJ = J();
        if (strArrJ == null) {
            java.util.Iterator it = xVar.f23677a.keySet().iterator();
            while (it.hasNext()) {
                if (O(xVar, xVar2, (java.lang.String) it.next())) {
                }
            }
            return false;
        }
        for (java.lang.String str : strArrJ) {
            if (!O(xVar, xVar2, str)) {
            }
        }
        return false;
        return true;
    }

    boolean M(android.view.View view) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int id = view.getId();
        java.util.ArrayList arrayList3 = this.f23621K;
        if (arrayList3 != null && arrayList3.contains(java.lang.Integer.valueOf(id))) {
            return false;
        }
        java.util.ArrayList arrayList4 = this.f23622L;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        java.util.ArrayList arrayList5 = this.f23623M;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (((java.lang.Class) this.f23623M.get(i6)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f23624N != null && androidx.core.view.X.H(view) != null && this.f23624N.contains(androidx.core.view.X.H(view))) {
            return false;
        }
        if ((this.f23617G.size() == 0 && this.f23618H.size() == 0 && (((arrayList = this.f23620J) == null || arrayList.isEmpty()) && ((arrayList2 = this.f23619I) == null || arrayList2.isEmpty()))) || this.f23617G.contains(java.lang.Integer.valueOf(id)) || this.f23618H.contains(view)) {
            return true;
        }
        java.util.ArrayList arrayList6 = this.f23619I;
        if (arrayList6 != null && arrayList6.contains(androidx.core.view.X.H(view))) {
            return true;
        }
        if (this.f23620J != null) {
            for (int i10 = 0; i10 < this.f23620J.size(); i10++) {
                if (((java.lang.Class) this.f23620J.get(i10)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    void W(androidx.transition.AbstractC2108k.g gVar, boolean z6) {
        V(this, gVar, z6);
    }

    public void X(android.view.View view) {
        if (this.f23640d0) {
            return;
        }
        int size = this.f23636Z.size();
        android.animation.Animator[] animatorArr = (android.animation.Animator[]) this.f23636Z.toArray(this.f23637a0);
        this.f23637a0 = f23609k0;
        for (int i6 = size - 1; i6 >= 0; i6--) {
            android.animation.Animator animator = animatorArr[i6];
            animatorArr[i6] = null;
            animator.pause();
        }
        this.f23637a0 = animatorArr;
        W(androidx.transition.AbstractC2108k.g.f23659d, false);
        this.f23639c0 = true;
    }

    void Y(android.view.ViewGroup viewGroup) {
        androidx.transition.AbstractC2108k.d dVar;
        this.f23632V = new java.util.ArrayList();
        this.f23633W = new java.util.ArrayList();
        U(this.f23628R, this.f23629S);
        p170r.C7026a c7026aC = C();
        int size = c7026aC.size();
        android.view.WindowId windowId = viewGroup.getWindowId();
        for (int i6 = size - 1; i6 >= 0; i6--) {
            android.animation.Animator animator = (android.animation.Animator) c7026aC.f(i6);
            if (animator != null && (dVar = (androidx.transition.AbstractC2108k.d) c7026aC.get(animator)) != null && dVar.f23650a != null && windowId.equals(dVar.f23653d)) {
                androidx.transition.x xVar = dVar.f23652c;
                android.view.View view = dVar.f23650a;
                androidx.transition.x xVarK = K(view, true);
                androidx.transition.x xVarX = x(view, true);
                if (xVarK == null && xVarX == null) {
                    xVarX = (androidx.transition.x) this.f23629S.f23680a.get(view);
                }
                if ((xVarK != null || xVarX != null) && dVar.f23654e.L(xVar, xVarX)) {
                    dVar.f23654e.B().getClass();
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        c7026aC.remove(animator);
                    }
                }
            }
        }
        r(viewGroup, this.f23628R, this.f23629S, this.f23632V, this.f23633W);
        d0();
    }

    public androidx.transition.AbstractC2108k Z(androidx.transition.AbstractC2108k.f fVar) {
        androidx.transition.AbstractC2108k abstractC2108k;
        java.util.ArrayList arrayList = this.f23642f0;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(fVar) && (abstractC2108k = this.f23641e0) != null) {
            abstractC2108k.Z(fVar);
        }
        if (this.f23642f0.size() == 0) {
            this.f23642f0 = null;
        }
        return this;
    }

    public androidx.transition.AbstractC2108k a(androidx.transition.AbstractC2108k.f fVar) {
        if (this.f23642f0 == null) {
            this.f23642f0 = new java.util.ArrayList();
        }
        this.f23642f0.add(fVar);
        return this;
    }

    public androidx.transition.AbstractC2108k a0(android.view.View view) {
        this.f23618H.remove(view);
        return this;
    }

    public androidx.transition.AbstractC2108k b(android.view.View view) {
        this.f23618H.add(view);
        return this;
    }

    public void b0(android.view.View view) {
        if (this.f23639c0) {
            if (!this.f23640d0) {
                int size = this.f23636Z.size();
                android.animation.Animator[] animatorArr = (android.animation.Animator[]) this.f23636Z.toArray(this.f23637a0);
                this.f23637a0 = f23609k0;
                for (int i6 = size - 1; i6 >= 0; i6--) {
                    android.animation.Animator animator = animatorArr[i6];
                    animatorArr[i6] = null;
                    animator.resume();
                }
                this.f23637a0 = animatorArr;
                W(androidx.transition.AbstractC2108k.g.f23660e, false);
            }
            this.f23639c0 = false;
        }
    }

    protected void cancel() {
        int size = this.f23636Z.size();
        android.animation.Animator[] animatorArr = (android.animation.Animator[]) this.f23636Z.toArray(this.f23637a0);
        this.f23637a0 = f23609k0;
        for (int i6 = size - 1; i6 >= 0; i6--) {
            android.animation.Animator animator = animatorArr[i6];
            animatorArr[i6] = null;
            animator.cancel();
        }
        this.f23637a0 = animatorArr;
        W(androidx.transition.AbstractC2108k.g.f23658c, false);
    }

    protected void d0() {
        m0();
        p170r.C7026a c7026aC = C();
        for (android.animation.Animator animator : this.f23643g0) {
            if (c7026aC.containsKey(animator)) {
                m0();
                c0(animator, c7026aC);
            }
        }
        this.f23643g0.clear();
        t();
    }

    protected void e(android.animation.Animator animator) {
        if (animator == null) {
            t();
            return;
        }
        if (u() >= 0) {
            animator.setDuration(u());
        }
        if (E() >= 0) {
            animator.setStartDelay(E() + animator.getStartDelay());
        }
        if (w() != null) {
            animator.setInterpolator(w());
        }
        animator.addListener(new androidx.transition.AbstractC2108k.c());
        animator.start();
    }

    public androidx.transition.AbstractC2108k f0(long j6) {
        this.f23615E = j6;
        return this;
    }

    public abstract void h(androidx.transition.x xVar);

    public void h0(androidx.transition.AbstractC2108k.e eVar) {
        this.f23644h0 = eVar;
    }

    public androidx.transition.AbstractC2108k i0(android.animation.TimeInterpolator timeInterpolator) {
        this.f23616F = timeInterpolator;
        return this;
    }

    public void j0(androidx.transition.AbstractC2104g abstractC2104g) {
        if (abstractC2104g == null) {
            abstractC2104g = f23611m0;
        }
        this.f23646j0 = abstractC2104g;
    }

    void k(androidx.transition.x xVar) {
    }

    public void k0(androidx.transition.u uVar) {
    }

    public abstract void l(androidx.transition.x xVar);

    public androidx.transition.AbstractC2108k l0(long j6) {
        this.f23614D = j6;
        return this;
    }

    void m(android.view.ViewGroup viewGroup, boolean z6) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        p170r.C7026a c7026a;
        n(z6);
        if ((this.f23617G.size() > 0 || this.f23618H.size() > 0) && (((arrayList = this.f23619I) == null || arrayList.isEmpty()) && ((arrayList2 = this.f23620J) == null || arrayList2.isEmpty()))) {
            for (int i6 = 0; i6 < this.f23617G.size(); i6++) {
                android.view.View viewFindViewById = viewGroup.findViewById(((java.lang.Integer) this.f23617G.get(i6)).intValue());
                if (viewFindViewById != null) {
                    androidx.transition.x xVar = new androidx.transition.x(viewFindViewById);
                    if (z6) {
                        l(xVar);
                    } else {
                        h(xVar);
                    }
                    xVar.f23679c.add(this);
                    k(xVar);
                    d(z6 ? this.f23628R : this.f23629S, viewFindViewById, xVar);
                }
            }
            for (int i10 = 0; i10 < this.f23618H.size(); i10++) {
                android.view.View view = (android.view.View) this.f23618H.get(i10);
                androidx.transition.x xVar2 = new androidx.transition.x(view);
                if (z6) {
                    l(xVar2);
                } else {
                    h(xVar2);
                }
                xVar2.f23679c.add(this);
                k(xVar2);
                d(z6 ? this.f23628R : this.f23629S, view, xVar2);
            }
        } else {
            j(viewGroup, z6);
        }
        if (z6 || (c7026a = this.f23645i0) == null) {
            return;
        }
        int size = c7026a.size();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList3.add((android.view.View) this.f23628R.f23683d.remove((java.lang.String) this.f23645i0.f(i11)));
        }
        for (int i12 = 0; i12 < size; i12++) {
            android.view.View view2 = (android.view.View) arrayList3.get(i12);
            if (view2 != null) {
                this.f23628R.f23683d.put((java.lang.String) this.f23645i0.k(i12), view2);
            }
        }
    }

    protected void m0() {
        if (this.f23638b0 == 0) {
            W(androidx.transition.AbstractC2108k.g.f23656a, false);
            this.f23640d0 = false;
        }
        this.f23638b0++;
    }

    void n(boolean z6) {
        androidx.transition.y yVar;
        if (z6) {
            this.f23628R.f23680a.clear();
            this.f23628R.f23681b.clear();
            yVar = this.f23628R;
        } else {
            this.f23629S.f23680a.clear();
            this.f23629S.f23681b.clear();
            yVar = this.f23629S;
        }
        yVar.f23682c.b();
    }

    java.lang.String n0(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(java.lang.Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f23615E != -1) {
            sb.append("dur(");
            sb.append(this.f23615E);
            sb.append(") ");
        }
        if (this.f23614D != -1) {
            sb.append("dly(");
            sb.append(this.f23614D);
            sb.append(") ");
        }
        if (this.f23616F != null) {
            sb.append("interp(");
            sb.append(this.f23616F);
            sb.append(") ");
        }
        if (this.f23617G.size() > 0 || this.f23618H.size() > 0) {
            sb.append("tgts(");
            if (this.f23617G.size() > 0) {
                for (int i6 = 0; i6 < this.f23617G.size(); i6++) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f23617G.get(i6));
                }
            }
            if (this.f23618H.size() > 0) {
                for (int i10 = 0; i10 < this.f23618H.size(); i10++) {
                    if (i10 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f23618H.get(i10));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // 
    /* JADX INFO: renamed from: p */
    public androidx.transition.AbstractC2108k clone() {
        try {
            androidx.transition.AbstractC2108k abstractC2108k = (androidx.transition.AbstractC2108k) super.clone();
            abstractC2108k.f23643g0 = new java.util.ArrayList();
            abstractC2108k.f23628R = new androidx.transition.y();
            abstractC2108k.f23629S = new androidx.transition.y();
            abstractC2108k.f23632V = null;
            abstractC2108k.f23633W = null;
            abstractC2108k.f23641e0 = this;
            abstractC2108k.f23642f0 = null;
            return abstractC2108k;
        } catch (java.lang.CloneNotSupportedException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }

    public android.animation.Animator q(android.view.ViewGroup viewGroup, androidx.transition.x xVar, androidx.transition.x xVar2) {
        return null;
    }

    void r(android.view.ViewGroup viewGroup, androidx.transition.y yVar, androidx.transition.y yVar2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        android.view.View view;
        android.animation.Animator animator;
        androidx.transition.x xVar;
        android.animation.Animator animator2;
        androidx.transition.x xVar2;
        p170r.C7026a c7026aC = C();
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        B().getClass();
        int i6 = 0;
        for (int size = arrayList.size(); i6 < size; size = size) {
            androidx.transition.x xVar3 = (androidx.transition.x) arrayList.get(i6);
            androidx.transition.x xVar4 = (androidx.transition.x) arrayList2.get(i6);
            if (xVar3 != null && !xVar3.f23679c.contains(this)) {
                xVar3 = null;
            }
            if (xVar4 != null && !xVar4.f23679c.contains(this)) {
                xVar4 = null;
            }
            if ((xVar3 != null || xVar4 != null) && (xVar3 == null || xVar4 == null || L(xVar3, xVar4))) {
                android.animation.Animator animatorQ = q(viewGroup, xVar3, xVar4);
                if (animatorQ != null) {
                    if (xVar4 != null) {
                        android.view.View view2 = xVar4.f23678b;
                        java.lang.String[] strArrJ = J();
                        if (strArrJ != null && strArrJ.length > 0) {
                            xVar2 = new androidx.transition.x(view2);
                            androidx.transition.x xVar5 = (androidx.transition.x) yVar2.f23680a.get(view2);
                            if (xVar5 != null) {
                                int i10 = 0;
                                while (i10 < strArrJ.length) {
                                    java.util.Map map = xVar2.f23677a;
                                    android.animation.Animator animator3 = animatorQ;
                                    java.lang.String str = strArrJ[i10];
                                    map.put(str, xVar5.f23677a.get(str));
                                    i10++;
                                    animatorQ = animator3;
                                    strArrJ = strArrJ;
                                }
                            }
                            android.animation.Animator animator4 = animatorQ;
                            int size2 = c7026aC.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size2) {
                                    animator2 = animator4;
                                    break;
                                }
                                androidx.transition.AbstractC2108k.d dVar = (androidx.transition.AbstractC2108k.d) c7026aC.get((android.animation.Animator) c7026aC.f(i11));
                                if (dVar.f23652c != null && dVar.f23650a == view2 && dVar.f23651b.equals(y()) && dVar.f23652c.equals(xVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i11++;
                            }
                        } else {
                            animator2 = animatorQ;
                            xVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        xVar = xVar2;
                    } else {
                        view = xVar3.f23678b;
                        animator = animatorQ;
                        xVar = null;
                    }
                    if (animator != null) {
                        c7026aC.put(animator, new androidx.transition.AbstractC2108k.d(view, y(), this, viewGroup.getWindowId(), xVar, animator));
                        this.f23643g0.add(animator);
                    }
                }
                i6++;
            }
            i6++;
        }
        if (sparseIntArray.size() != 0) {
            for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
                androidx.transition.AbstractC2108k.d dVar2 = (androidx.transition.AbstractC2108k.d) c7026aC.get((android.animation.Animator) this.f23643g0.get(sparseIntArray.keyAt(i12)));
                dVar2.f23655f.setStartDelay((((long) sparseIntArray.valueAt(i12)) - Long.MAX_VALUE) + dVar2.f23655f.getStartDelay());
            }
        }
    }

    protected void t() {
        int i6 = this.f23638b0 - 1;
        this.f23638b0 = i6;
        if (i6 == 0) {
            W(androidx.transition.AbstractC2108k.g.f23657b, false);
            for (int i10 = 0; i10 < this.f23628R.f23682c.q(); i10++) {
                android.view.View view = (android.view.View) this.f23628R.f23682c.r(i10);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i11 = 0; i11 < this.f23629S.f23682c.q(); i11++) {
                android.view.View view2 = (android.view.View) this.f23629S.f23682c.r(i11);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f23640d0 = true;
        }
    }

    public java.lang.String toString() {
        return n0("");
    }

    public long u() {
        return this.f23615E;
    }

    public androidx.transition.AbstractC2108k.e v() {
        return this.f23644h0;
    }

    public android.animation.TimeInterpolator w() {
        return this.f23616F;
    }

    androidx.transition.x x(android.view.View view, boolean z6) {
        androidx.transition.v vVar = this.f23630T;
        if (vVar != null) {
            return vVar.x(view, z6);
        }
        java.util.ArrayList arrayList = z6 ? this.f23632V : this.f23633W;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            }
            androidx.transition.x xVar = (androidx.transition.x) arrayList.get(i6);
            if (xVar == null) {
                return null;
            }
            if (xVar.f23678b == view) {
                break;
            }
            i6++;
        }
        if (i6 >= 0) {
            return (androidx.transition.x) (z6 ? this.f23633W : this.f23632V).get(i6);
        }
        return null;
    }

    public java.lang.String y() {
        return this.f23613C;
    }

    public androidx.transition.AbstractC2104g z() {
        return this.f23646j0;
    }
}
