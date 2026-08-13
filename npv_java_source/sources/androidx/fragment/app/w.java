package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class w extends androidx.fragment.app.x {

    class a extends android.transition.Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.graphics.Rect f22707a;

        a(android.graphics.Rect rect) {
            this.f22707a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public android.graphics.Rect onGetEpicenter(android.transition.Transition transition) {
            return this.f22707a;
        }
    }

    class b implements android.transition.Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f22709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f22710b;

        b(android.view.View view, java.util.ArrayList arrayList) {
            this.f22709a = view;
            this.f22710b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(android.transition.Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(android.transition.Transition transition) {
            androidx.fragment.app.w.f.b(transition, this);
            this.f22709a.setVisibility(8);
            int size = this.f22710b.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((android.view.View) this.f22710b.get(i6)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(android.transition.Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(android.transition.Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(android.transition.Transition transition) {
            androidx.fragment.app.w.f.b(transition, this);
            androidx.fragment.app.w.f.a(transition, this);
        }
    }

    class c implements android.transition.Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f22712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f22713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f22714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f22715d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f22716e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f22717f;

        c(java.lang.Object obj, java.util.ArrayList arrayList, java.lang.Object obj2, java.util.ArrayList arrayList2, java.lang.Object obj3, java.util.ArrayList arrayList3) {
            this.f22712a = obj;
            this.f22713b = arrayList;
            this.f22714c = obj2;
            this.f22715d = arrayList2;
            this.f22716e = obj3;
            this.f22717f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(android.transition.Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(android.transition.Transition transition) {
            androidx.fragment.app.w.f.b(transition, this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(android.transition.Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(android.transition.Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(android.transition.Transition transition) {
            java.lang.Object obj = this.f22712a;
            if (obj != null) {
                androidx.fragment.app.w.this.w(obj, this.f22713b, null);
            }
            java.lang.Object obj2 = this.f22714c;
            if (obj2 != null) {
                androidx.fragment.app.w.this.w(obj2, this.f22715d, null);
            }
            java.lang.Object obj3 = this.f22716e;
            if (obj3 != null) {
                androidx.fragment.app.w.this.w(obj3, this.f22717f, null);
            }
        }
    }

    class d implements android.transition.Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f22719a;

        d(java.lang.Runnable runnable) {
            this.f22719a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(android.transition.Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(android.transition.Transition transition) {
            this.f22719a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(android.transition.Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(android.transition.Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(android.transition.Transition transition) {
        }
    }

    class e extends android.transition.Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.graphics.Rect f22721a;

        e(android.graphics.Rect rect) {
            this.f22721a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public android.graphics.Rect onGetEpicenter(android.transition.Transition transition) {
            android.graphics.Rect rect = this.f22721a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f22721a;
        }
    }

    static class f {
        static void a(android.transition.Transition transition, android.transition.Transition.TransitionListener transitionListener) {
            transition.addListener(transitionListener);
        }

        static void b(android.transition.Transition transition, android.transition.Transition.TransitionListener transitionListener) {
            transition.removeListener(transitionListener);
        }
    }

    w() {
    }

    private static boolean v(android.transition.Transition transition) {
        return (androidx.fragment.app.x.i(transition.getTargetIds()) && androidx.fragment.app.x.i(transition.getTargetNames()) && androidx.fragment.app.x.i(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.x
    public void a(java.lang.Object obj, android.view.View view) {
        if (obj != null) {
            ((android.transition.Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.x
    public void b(java.lang.Object obj, java.util.ArrayList arrayList) {
        android.transition.Transition transition = (android.transition.Transition) obj;
        if (transition == null) {
            return;
        }
        int i6 = 0;
        if (transition instanceof android.transition.TransitionSet) {
            android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i6 < transitionCount) {
                b(transitionSet.getTransitionAt(i6), arrayList);
                i6++;
            }
            return;
        }
        if (v(transition) || !androidx.fragment.app.x.i(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i6 < size) {
            transition.addTarget((android.view.View) arrayList.get(i6));
            i6++;
        }
    }

    @Override // androidx.fragment.app.x
    public void c(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        android.transition.TransitionManager.beginDelayedTransition(viewGroup, (android.transition.Transition) obj);
    }

    @Override // androidx.fragment.app.x
    public boolean e(java.lang.Object obj) {
        return obj instanceof android.transition.Transition;
    }

    @Override // androidx.fragment.app.x
    public java.lang.Object f(java.lang.Object obj) {
        if (obj != null) {
            return ((android.transition.Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.x
    public java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.transition.Transition ordering = (android.transition.Transition) obj;
        android.transition.Transition transition = (android.transition.Transition) obj2;
        android.transition.Transition transition2 = (android.transition.Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new android.transition.TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.x
    public java.lang.Object k(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((android.transition.Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((android.transition.Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((android.transition.Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.x
    public void m(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        ((android.transition.Transition) obj).addListener(new androidx.fragment.app.w.b(view, arrayList));
    }

    @Override // androidx.fragment.app.x
    public void n(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2, java.lang.Object obj4, java.util.ArrayList arrayList3) {
        ((android.transition.Transition) obj).addListener(new androidx.fragment.app.w.c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.x
    public void o(java.lang.Object obj, android.graphics.Rect rect) {
        if (obj != null) {
            ((android.transition.Transition) obj).setEpicenterCallback(new androidx.fragment.app.w.e(rect));
        }
    }

    @Override // androidx.fragment.app.x
    public void p(java.lang.Object obj, android.view.View view) {
        if (view != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            h(view, rect);
            ((android.transition.Transition) obj).setEpicenterCallback(new androidx.fragment.app.w.a(rect));
        }
    }

    @Override // androidx.fragment.app.x
    public void q(androidx.fragment.app.f fVar, java.lang.Object obj, androidx.core.os.e eVar, java.lang.Runnable runnable) {
        ((android.transition.Transition) obj).addListener(new androidx.fragment.app.w.d(runnable));
    }

    @Override // androidx.fragment.app.x
    public void s(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) obj;
        java.util.List<android.view.View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            androidx.fragment.app.x.d(targets, (android.view.View) arrayList.get(i6));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.x
    public void t(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            w(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.x
    public java.lang.Object u(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        transitionSet.addTransition((android.transition.Transition) obj);
        return transitionSet;
    }

    public void w(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        java.util.List<android.view.View> targets;
        android.transition.Transition transition = (android.transition.Transition) obj;
        int i6 = 0;
        if (transition instanceof android.transition.TransitionSet) {
            android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i6 < transitionCount) {
                w(transitionSet.getTransitionAt(i6), arrayList, arrayList2);
                i6++;
            }
            return;
        }
        if (v(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i6 < size) {
            transition.addTarget((android.view.View) arrayList2.get(i6));
            i6++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((android.view.View) arrayList.get(size2));
        }
    }
}
