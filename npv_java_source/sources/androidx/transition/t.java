package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static androidx.transition.AbstractC2108k f23661a = new androidx.transition.C2098a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.lang.ThreadLocal f23662b = new java.lang.ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static java.util.ArrayList f23663c = new java.util.ArrayList();

    private static class a implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        androidx.transition.AbstractC2108k f23664C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        android.view.ViewGroup f23665D;

        /* JADX INFO: renamed from: androidx.transition.t$a$a, reason: collision with other inner class name */
        class C0449a extends androidx.transition.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p170r.C7026a f23666a;

            C0449a(p170r.C7026a c7026a) {
                this.f23666a = c7026a;
            }

            @Override // androidx.transition.AbstractC2108k.f
            public void d(androidx.transition.AbstractC2108k abstractC2108k) {
                ((java.util.ArrayList) this.f23666a.get(androidx.transition.t.a.this.f23665D)).remove(abstractC2108k);
                abstractC2108k.Z(this);
            }
        }

        a(androidx.transition.AbstractC2108k abstractC2108k, android.view.ViewGroup viewGroup) {
            this.f23664C = abstractC2108k;
            this.f23665D = viewGroup;
        }

        private void a() {
            this.f23665D.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f23665D.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!androidx.transition.t.f23663c.remove(this.f23665D)) {
                return true;
            }
            p170r.C7026a c7026aB = androidx.transition.t.b();
            java.util.ArrayList arrayList = (java.util.ArrayList) c7026aB.get(this.f23665D);
            java.util.ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                c7026aB.put(this.f23665D, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new java.util.ArrayList(arrayList);
            }
            arrayList.add(this.f23664C);
            this.f23664C.a(new androidx.transition.t.a.C0449a(c7026aB));
            this.f23664C.m(this.f23665D, false);
            if (arrayList2 != null) {
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((androidx.transition.AbstractC2108k) it.next()).b0(this.f23665D);
                }
            }
            this.f23664C.Y(this.f23665D);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            a();
            androidx.transition.t.f23663c.remove(this.f23665D);
            java.util.ArrayList arrayList = (java.util.ArrayList) androidx.transition.t.b().get(this.f23665D);
            if (arrayList != null && arrayList.size() > 0) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((androidx.transition.AbstractC2108k) it.next()).b0(this.f23665D);
                }
            }
            this.f23664C.n(true);
        }
    }

    public static void a(android.view.ViewGroup viewGroup, androidx.transition.AbstractC2108k abstractC2108k) {
        if (f23663c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f23663c.add(viewGroup);
        if (abstractC2108k == null) {
            abstractC2108k = f23661a;
        }
        androidx.transition.AbstractC2108k abstractC2108kClone = abstractC2108k.clone();
        d(viewGroup, abstractC2108kClone);
        androidx.transition.AbstractC2107j.b(viewGroup, null);
        c(viewGroup, abstractC2108kClone);
    }

    static p170r.C7026a b() {
        p170r.C7026a c7026a;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) f23662b.get();
        if (weakReference != null && (c7026a = (p170r.C7026a) weakReference.get()) != null) {
            return c7026a;
        }
        p170r.C7026a c7026a2 = new p170r.C7026a();
        f23662b.set(new java.lang.ref.WeakReference(c7026a2));
        return c7026a2;
    }

    private static void c(android.view.ViewGroup viewGroup, androidx.transition.AbstractC2108k abstractC2108k) {
        if (abstractC2108k == null || viewGroup == null) {
            return;
        }
        androidx.transition.t.a aVar = new androidx.transition.t.a(abstractC2108k, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(android.view.ViewGroup viewGroup, androidx.transition.AbstractC2108k abstractC2108k) {
        java.util.ArrayList arrayList = (java.util.ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((androidx.transition.AbstractC2108k) it.next()).X(viewGroup);
            }
        }
        if (abstractC2108k != null) {
            abstractC2108k.m(viewGroup, true);
        }
        androidx.transition.AbstractC2107j.a(viewGroup);
    }
}
