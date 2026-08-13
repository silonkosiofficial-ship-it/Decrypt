package androidx.transition;

/* JADX INFO: renamed from: androidx.transition.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2102e extends androidx.fragment.app.x {

    /* JADX INFO: renamed from: androidx.transition.e$a */
    class a extends androidx.transition.AbstractC2108k.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.graphics.Rect f23588a;

        a(android.graphics.Rect rect) {
            this.f23588a = rect;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$b */
    class b implements androidx.transition.AbstractC2108k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f23590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f23591b;

        b(android.view.View view, java.util.ArrayList arrayList) {
            this.f23590a = view;
            this.f23591b = arrayList;
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void a(androidx.transition.AbstractC2108k abstractC2108k) {
            abstractC2108k.Z(this);
            abstractC2108k.a(this);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void b(androidx.transition.AbstractC2108k abstractC2108k) {
        }

        @Override // androidx.transition.AbstractC2108k.f
        public /* synthetic */ void c(androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
            androidx.transition.AbstractC2109l.a(this, abstractC2108k, z6);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void d(androidx.transition.AbstractC2108k abstractC2108k) {
            abstractC2108k.Z(this);
            this.f23590a.setVisibility(8);
            int size = this.f23591b.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((android.view.View) this.f23591b.get(i6)).setVisibility(0);
            }
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void e(androidx.transition.AbstractC2108k abstractC2108k) {
        }

        @Override // androidx.transition.AbstractC2108k.f
        public /* synthetic */ void f(androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
            androidx.transition.AbstractC2109l.b(this, abstractC2108k, z6);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void g(androidx.transition.AbstractC2108k abstractC2108k) {
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$c */
    class c extends androidx.transition.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f23593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f23594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f23595c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f23596d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f23597e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f23598f;

        c(java.lang.Object obj, java.util.ArrayList arrayList, java.lang.Object obj2, java.util.ArrayList arrayList2, java.lang.Object obj3, java.util.ArrayList arrayList3) {
            this.f23593a = obj;
            this.f23594b = arrayList;
            this.f23595c = obj2;
            this.f23596d = arrayList2;
            this.f23597e = obj3;
            this.f23598f = arrayList3;
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC2108k.f
        public void a(androidx.transition.AbstractC2108k abstractC2108k) {
            java.lang.Object obj = this.f23593a;
            if (obj != null) {
                androidx.transition.C2102e.this.y(obj, this.f23594b, null);
            }
            java.lang.Object obj2 = this.f23595c;
            if (obj2 != null) {
                androidx.transition.C2102e.this.y(obj2, this.f23596d, null);
            }
            java.lang.Object obj3 = this.f23597e;
            if (obj3 != null) {
                androidx.transition.C2102e.this.y(obj3, this.f23598f, null);
            }
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void d(androidx.transition.AbstractC2108k abstractC2108k) {
            abstractC2108k.Z(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$d */
    class d implements androidx.transition.AbstractC2108k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f23600a;

        d(java.lang.Runnable runnable) {
            this.f23600a = runnable;
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void a(androidx.transition.AbstractC2108k abstractC2108k) {
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void b(androidx.transition.AbstractC2108k abstractC2108k) {
        }

        @Override // androidx.transition.AbstractC2108k.f
        public /* synthetic */ void c(androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
            androidx.transition.AbstractC2109l.a(this, abstractC2108k, z6);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void d(androidx.transition.AbstractC2108k abstractC2108k) {
            this.f23600a.run();
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void e(androidx.transition.AbstractC2108k abstractC2108k) {
        }

        @Override // androidx.transition.AbstractC2108k.f
        public /* synthetic */ void f(androidx.transition.AbstractC2108k abstractC2108k, boolean z6) {
            androidx.transition.AbstractC2109l.b(this, abstractC2108k, z6);
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void g(androidx.transition.AbstractC2108k abstractC2108k) {
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$e, reason: collision with other inner class name */
    class C0448e extends androidx.transition.AbstractC2108k.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.graphics.Rect f23602a;

        C0448e(android.graphics.Rect rect) {
            this.f23602a = rect;
        }
    }

    private static boolean w(androidx.transition.AbstractC2108k abstractC2108k) {
        return (androidx.fragment.app.x.i(abstractC2108k.F()) && androidx.fragment.app.x.i(abstractC2108k.G()) && androidx.fragment.app.x.i(abstractC2108k.H())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(java.lang.Runnable runnable, androidx.transition.AbstractC2108k abstractC2108k, java.lang.Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC2108k.cancel();
            runnable2.run();
        }
    }

    @Override // androidx.fragment.app.x
    public void a(java.lang.Object obj, android.view.View view) {
        if (obj != null) {
            ((androidx.transition.AbstractC2108k) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.x
    public void b(java.lang.Object obj, java.util.ArrayList arrayList) {
        androidx.transition.AbstractC2108k abstractC2108k = (androidx.transition.AbstractC2108k) obj;
        if (abstractC2108k == null) {
            return;
        }
        int i6 = 0;
        if (abstractC2108k instanceof androidx.transition.v) {
            androidx.transition.v vVar = (androidx.transition.v) abstractC2108k;
            int iT0 = vVar.t0();
            while (i6 < iT0) {
                b(vVar.s0(i6), arrayList);
                i6++;
            }
            return;
        }
        if (w(abstractC2108k) || !androidx.fragment.app.x.i(abstractC2108k.I())) {
            return;
        }
        int size = arrayList.size();
        while (i6 < size) {
            abstractC2108k.b((android.view.View) arrayList.get(i6));
            i6++;
        }
    }

    @Override // androidx.fragment.app.x
    public void c(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        androidx.transition.t.a(viewGroup, (androidx.transition.AbstractC2108k) obj);
    }

    @Override // androidx.fragment.app.x
    public boolean e(java.lang.Object obj) {
        return obj instanceof androidx.transition.AbstractC2108k;
    }

    @Override // androidx.fragment.app.x
    public java.lang.Object f(java.lang.Object obj) {
        if (obj != null) {
            return ((androidx.transition.AbstractC2108k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.x
    public java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        androidx.transition.AbstractC2108k abstractC2108kY0 = (androidx.transition.AbstractC2108k) obj;
        androidx.transition.AbstractC2108k abstractC2108k = (androidx.transition.AbstractC2108k) obj2;
        androidx.transition.AbstractC2108k abstractC2108k2 = (androidx.transition.AbstractC2108k) obj3;
        if (abstractC2108kY0 != null && abstractC2108k != null) {
            abstractC2108kY0 = new androidx.transition.v().q0(abstractC2108kY0).q0(abstractC2108k).y0(1);
        } else if (abstractC2108kY0 == null) {
            abstractC2108kY0 = abstractC2108k != null ? abstractC2108k : null;
        }
        if (abstractC2108k2 == null) {
            return abstractC2108kY0;
        }
        androidx.transition.v vVar = new androidx.transition.v();
        if (abstractC2108kY0 != null) {
            vVar.q0(abstractC2108kY0);
        }
        vVar.q0(abstractC2108k2);
        return vVar;
    }

    @Override // androidx.fragment.app.x
    public java.lang.Object k(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        androidx.transition.v vVar = new androidx.transition.v();
        if (obj != null) {
            vVar.q0((androidx.transition.AbstractC2108k) obj);
        }
        if (obj2 != null) {
            vVar.q0((androidx.transition.AbstractC2108k) obj2);
        }
        if (obj3 != null) {
            vVar.q0((androidx.transition.AbstractC2108k) obj3);
        }
        return vVar;
    }

    @Override // androidx.fragment.app.x
    public void m(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        ((androidx.transition.AbstractC2108k) obj).a(new androidx.transition.C2102e.b(view, arrayList));
    }

    @Override // androidx.fragment.app.x
    public void n(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2, java.lang.Object obj4, java.util.ArrayList arrayList3) {
        ((androidx.transition.AbstractC2108k) obj).a(new androidx.transition.C2102e.c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.x
    public void o(java.lang.Object obj, android.graphics.Rect rect) {
        if (obj != null) {
            ((androidx.transition.AbstractC2108k) obj).h0(new androidx.transition.C2102e.C0448e(rect));
        }
    }

    @Override // androidx.fragment.app.x
    public void p(java.lang.Object obj, android.view.View view) {
        if (view != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            h(view, rect);
            ((androidx.transition.AbstractC2108k) obj).h0(new androidx.transition.C2102e.a(rect));
        }
    }

    @Override // androidx.fragment.app.x
    public void q(androidx.fragment.app.f fVar, java.lang.Object obj, androidx.core.os.e eVar, java.lang.Runnable runnable) {
        z(fVar, obj, eVar, null, runnable);
    }

    @Override // androidx.fragment.app.x
    public void s(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        androidx.transition.v vVar = (androidx.transition.v) obj;
        java.util.List listI = vVar.I();
        listI.clear();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            androidx.fragment.app.x.d(listI, (android.view.View) arrayList.get(i6));
        }
        listI.add(view);
        arrayList.add(view);
        b(vVar, arrayList);
    }

    @Override // androidx.fragment.app.x
    public void t(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        androidx.transition.v vVar = (androidx.transition.v) obj;
        if (vVar != null) {
            vVar.I().clear();
            vVar.I().addAll(arrayList2);
            y(vVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.x
    public java.lang.Object u(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        androidx.transition.v vVar = new androidx.transition.v();
        vVar.q0((androidx.transition.AbstractC2108k) obj);
        return vVar;
    }

    public void y(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        androidx.transition.AbstractC2108k abstractC2108k = (androidx.transition.AbstractC2108k) obj;
        int i6 = 0;
        if (abstractC2108k instanceof androidx.transition.v) {
            androidx.transition.v vVar = (androidx.transition.v) abstractC2108k;
            int iT0 = vVar.t0();
            while (i6 < iT0) {
                y(vVar.s0(i6), arrayList, arrayList2);
                i6++;
            }
            return;
        }
        if (w(abstractC2108k)) {
            return;
        }
        java.util.List listI = abstractC2108k.I();
        if (listI.size() == arrayList.size() && listI.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i6 < size) {
                abstractC2108k.b((android.view.View) arrayList2.get(i6));
                i6++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC2108k.a0((android.view.View) arrayList.get(size2));
            }
        }
    }

    public void z(androidx.fragment.app.f fVar, java.lang.Object obj, androidx.core.os.e eVar, final java.lang.Runnable runnable, final java.lang.Runnable runnable2) {
        final androidx.transition.AbstractC2108k abstractC2108k = (androidx.transition.AbstractC2108k) obj;
        eVar.b(new androidx.core.os.e.a() { // from class: androidx.transition.d
            @Override // androidx.core.os.e.a
            public final void onCancel() {
                androidx.transition.C2102e.x(runnable, abstractC2108k, runnable2);
            }
        });
        abstractC2108k.a(new androidx.transition.C2102e.d(runnable2));
    }
}
