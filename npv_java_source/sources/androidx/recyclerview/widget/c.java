package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class c extends androidx.recyclerview.widget.m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static android.animation.TimeInterpolator f23305s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.util.ArrayList f23306h = new java.util.ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.util.ArrayList f23307i = new java.util.ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.util.ArrayList f23308j = new java.util.ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private java.util.ArrayList f23309k = new java.util.ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    java.util.ArrayList f23310l = new java.util.ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    java.util.ArrayList f23311m = new java.util.ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    java.util.ArrayList f23312n = new java.util.ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    java.util.ArrayList f23313o = new java.util.ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    java.util.ArrayList f23314p = new java.util.ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    java.util.ArrayList f23315q = new java.util.ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    java.util.ArrayList f23316r = new java.util.ArrayList();

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f23317C;

        a(java.util.ArrayList arrayList) {
            this.f23317C = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (androidx.recyclerview.widget.c.j jVar : this.f23317C) {
                androidx.recyclerview.widget.c.this.S(jVar.f23351a, jVar.f23352b, jVar.f23353c, jVar.f23354d, jVar.f23355e);
            }
            this.f23317C.clear();
            androidx.recyclerview.widget.c.this.f23311m.remove(this.f23317C);
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f23319C;

        b(java.util.ArrayList arrayList) {
            this.f23319C = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            java.util.Iterator it = this.f23319C.iterator();
            while (it.hasNext()) {
                androidx.recyclerview.widget.c.this.R((androidx.recyclerview.widget.c.i) it.next());
            }
            this.f23319C.clear();
            androidx.recyclerview.widget.c.this.f23312n.remove(this.f23319C);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    class RunnableC0438c implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f23321C;

        RunnableC0438c(java.util.ArrayList arrayList) {
            this.f23321C = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            java.util.Iterator it = this.f23321C.iterator();
            while (it.hasNext()) {
                androidx.recyclerview.widget.c.this.Q((androidx.recyclerview.widget.RecyclerView.D) it.next());
            }
            this.f23321C.clear();
            androidx.recyclerview.widget.c.this.f23310l.remove(this.f23321C);
        }
    }

    class d extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.recyclerview.widget.RecyclerView.D f23323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.ViewPropertyAnimator f23324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.view.View f23325c;

        d(androidx.recyclerview.widget.RecyclerView.D d6, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
            this.f23323a = d6;
            this.f23324b = viewPropertyAnimator;
            this.f23325c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            this.f23324b.setListener(null);
            this.f23325c.setAlpha(1.0f);
            androidx.recyclerview.widget.c.this.G(this.f23323a);
            androidx.recyclerview.widget.c.this.f23315q.remove(this.f23323a);
            androidx.recyclerview.widget.c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            androidx.recyclerview.widget.c.this.H(this.f23323a);
        }
    }

    class e extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.recyclerview.widget.RecyclerView.D f23327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.View f23328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.view.ViewPropertyAnimator f23329c;

        e(androidx.recyclerview.widget.RecyclerView.D d6, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
            this.f23327a = d6;
            this.f23328b = view;
            this.f23329c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            this.f23328b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            this.f23329c.setListener(null);
            androidx.recyclerview.widget.c.this.A(this.f23327a);
            androidx.recyclerview.widget.c.this.f23313o.remove(this.f23327a);
            androidx.recyclerview.widget.c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            androidx.recyclerview.widget.c.this.B(this.f23327a);
        }
    }

    class f extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.recyclerview.widget.RecyclerView.D f23331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f23332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.view.View f23333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f23334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ android.view.ViewPropertyAnimator f23335e;

        f(androidx.recyclerview.widget.RecyclerView.D d6, int i6, android.view.View view, int i10, android.view.ViewPropertyAnimator viewPropertyAnimator) {
            this.f23331a = d6;
            this.f23332b = i6;
            this.f23333c = view;
            this.f23334d = i10;
            this.f23335e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            if (this.f23332b != 0) {
                this.f23333c.setTranslationX(0.0f);
            }
            if (this.f23334d != 0) {
                this.f23333c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            this.f23335e.setListener(null);
            androidx.recyclerview.widget.c.this.E(this.f23331a);
            androidx.recyclerview.widget.c.this.f23314p.remove(this.f23331a);
            androidx.recyclerview.widget.c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            androidx.recyclerview.widget.c.this.F(this.f23331a);
        }
    }

    class g extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.recyclerview.widget.c.i f23337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.ViewPropertyAnimator f23338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.view.View f23339c;

        g(androidx.recyclerview.widget.c.i iVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
            this.f23337a = iVar;
            this.f23338b = viewPropertyAnimator;
            this.f23339c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            this.f23338b.setListener(null);
            this.f23339c.setAlpha(1.0f);
            this.f23339c.setTranslationX(0.0f);
            this.f23339c.setTranslationY(0.0f);
            androidx.recyclerview.widget.c.this.C(this.f23337a.f23345a, true);
            androidx.recyclerview.widget.c.this.f23316r.remove(this.f23337a.f23345a);
            androidx.recyclerview.widget.c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            androidx.recyclerview.widget.c.this.D(this.f23337a.f23345a, true);
        }
    }

    class h extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.recyclerview.widget.c.i f23341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.ViewPropertyAnimator f23342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.view.View f23343c;

        h(androidx.recyclerview.widget.c.i iVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
            this.f23341a = iVar;
            this.f23342b = viewPropertyAnimator;
            this.f23343c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            this.f23342b.setListener(null);
            this.f23343c.setAlpha(1.0f);
            this.f23343c.setTranslationX(0.0f);
            this.f23343c.setTranslationY(0.0f);
            androidx.recyclerview.widget.c.this.C(this.f23341a.f23346b, false);
            androidx.recyclerview.widget.c.this.f23316r.remove(this.f23341a.f23346b);
            androidx.recyclerview.widget.c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            androidx.recyclerview.widget.c.this.D(this.f23341a.f23346b, false);
        }
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView.D f23345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView.D f23346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f23349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f23350f;

        private i(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.D d10) {
            this.f23345a = d6;
            this.f23346b = d10;
        }

        i(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.D d10, int i6, int i10, int i11, int i12) {
            this(d6, d10);
            this.f23347c = i6;
            this.f23348d = i10;
            this.f23349e = i11;
            this.f23350f = i12;
        }

        public java.lang.String toString() {
            return "ChangeInfo{oldHolder=" + this.f23345a + ", newHolder=" + this.f23346b + ", fromX=" + this.f23347c + ", fromY=" + this.f23348d + ", toX=" + this.f23349e + ", toY=" + this.f23350f + '}';
        }
    }

    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView.D f23351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f23355e;

        j(androidx.recyclerview.widget.RecyclerView.D d6, int i6, int i10, int i11, int i12) {
            this.f23351a = d6;
            this.f23352b = i6;
            this.f23353c = i10;
            this.f23354d = i11;
            this.f23355e = i12;
        }
    }

    private void T(androidx.recyclerview.widget.RecyclerView.D d6) {
        android.view.View view = d6.f23130a;
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f23315q.add(d6);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new androidx.recyclerview.widget.c.d(d6, viewPropertyAnimatorAnimate, view)).start();
    }

    private void W(java.util.List list, androidx.recyclerview.widget.RecyclerView.D d6) {
        for (int size = list.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.c.i iVar = (androidx.recyclerview.widget.c.i) list.get(size);
            if (Y(iVar, d6) && iVar.f23345a == null && iVar.f23346b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(androidx.recyclerview.widget.c.i iVar) {
        androidx.recyclerview.widget.RecyclerView.D d6 = iVar.f23345a;
        if (d6 != null) {
            Y(iVar, d6);
        }
        androidx.recyclerview.widget.RecyclerView.D d10 = iVar.f23346b;
        if (d10 != null) {
            Y(iVar, d10);
        }
    }

    private boolean Y(androidx.recyclerview.widget.c.i iVar, androidx.recyclerview.widget.RecyclerView.D d6) {
        boolean z6 = false;
        if (iVar.f23346b == d6) {
            iVar.f23346b = null;
        } else {
            if (iVar.f23345a != d6) {
                return false;
            }
            iVar.f23345a = null;
            z6 = true;
        }
        d6.f23130a.setAlpha(1.0f);
        d6.f23130a.setTranslationX(0.0f);
        d6.f23130a.setTranslationY(0.0f);
        C(d6, z6);
        return true;
    }

    private void Z(androidx.recyclerview.widget.RecyclerView.D d6) {
        if (f23305s == null) {
            f23305s = new android.animation.ValueAnimator().getInterpolator();
        }
        d6.f23130a.animate().setInterpolator(f23305s);
        j(d6);
    }

    void Q(androidx.recyclerview.widget.RecyclerView.D d6) {
        android.view.View view = d6.f23130a;
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f23313o.add(d6);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new androidx.recyclerview.widget.c.e(d6, view, viewPropertyAnimatorAnimate)).start();
    }

    void R(androidx.recyclerview.widget.c.i iVar) {
        androidx.recyclerview.widget.RecyclerView.D d6 = iVar.f23345a;
        android.view.View view = d6 == null ? null : d6.f23130a;
        androidx.recyclerview.widget.RecyclerView.D d10 = iVar.f23346b;
        android.view.View view2 = d10 != null ? d10.f23130a : null;
        if (view != null) {
            android.view.ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f23316r.add(iVar.f23345a);
            duration.translationX(iVar.f23349e - iVar.f23347c);
            duration.translationY(iVar.f23350f - iVar.f23348d);
            duration.alpha(0.0f).setListener(new androidx.recyclerview.widget.c.g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f23316r.add(iVar.f23346b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new androidx.recyclerview.widget.c.h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void S(androidx.recyclerview.widget.RecyclerView.D d6, int i6, int i10, int i11, int i12) {
        android.view.View view = d6.f23130a;
        int i13 = i11 - i6;
        int i14 = i12 - i10;
        if (i13 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i14 != 0) {
            view.animate().translationY(0.0f);
        }
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f23314p.add(d6);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new androidx.recyclerview.widget.c.f(d6, i13, view, i14, viewPropertyAnimatorAnimate)).start();
    }

    void U(java.util.List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((androidx.recyclerview.widget.RecyclerView.D) list.get(size)).f23130a.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(androidx.recyclerview.widget.RecyclerView.D d6, java.util.List list) {
        return !list.isEmpty() || super.g(d6, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(androidx.recyclerview.widget.RecyclerView.D d6) {
        android.view.View view = d6.f23130a;
        view.animate().cancel();
        int size = this.f23308j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((androidx.recyclerview.widget.c.j) this.f23308j.get(size)).f23351a == d6) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(d6);
                this.f23308j.remove(size);
            }
        }
        W(this.f23309k, d6);
        if (this.f23306h.remove(d6)) {
            view.setAlpha(1.0f);
            G(d6);
        }
        if (this.f23307i.remove(d6)) {
            view.setAlpha(1.0f);
            A(d6);
        }
        for (int size2 = this.f23312n.size() - 1; size2 >= 0; size2--) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f23312n.get(size2);
            W(arrayList, d6);
            if (arrayList.isEmpty()) {
                this.f23312n.remove(size2);
            }
        }
        for (int size3 = this.f23311m.size() - 1; size3 >= 0; size3--) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f23311m.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (((androidx.recyclerview.widget.c.j) arrayList2.get(size4)).f23351a == d6) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(d6);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f23311m.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f23310l.size() - 1; size5 >= 0; size5--) {
            java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f23310l.get(size5);
            if (arrayList3.remove(d6)) {
                view.setAlpha(1.0f);
                A(d6);
                if (arrayList3.isEmpty()) {
                    this.f23310l.remove(size5);
                }
            }
        }
        this.f23315q.remove(d6);
        this.f23313o.remove(d6);
        this.f23316r.remove(d6);
        this.f23314p.remove(d6);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.f23308j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            androidx.recyclerview.widget.c.j jVar = (androidx.recyclerview.widget.c.j) this.f23308j.get(size);
            android.view.View view = jVar.f23351a.f23130a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f23351a);
            this.f23308j.remove(size);
        }
        for (int size2 = this.f23306h.size() - 1; size2 >= 0; size2--) {
            G((androidx.recyclerview.widget.RecyclerView.D) this.f23306h.get(size2));
            this.f23306h.remove(size2);
        }
        int size3 = this.f23307i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            androidx.recyclerview.widget.RecyclerView.D d6 = (androidx.recyclerview.widget.RecyclerView.D) this.f23307i.get(size3);
            d6.f23130a.setAlpha(1.0f);
            A(d6);
            this.f23307i.remove(size3);
        }
        for (int size4 = this.f23309k.size() - 1; size4 >= 0; size4--) {
            X((androidx.recyclerview.widget.c.i) this.f23309k.get(size4));
        }
        this.f23309k.clear();
        if (p()) {
            for (int size5 = this.f23311m.size() - 1; size5 >= 0; size5--) {
                java.util.ArrayList arrayList = (java.util.ArrayList) this.f23311m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    androidx.recyclerview.widget.c.j jVar2 = (androidx.recyclerview.widget.c.j) arrayList.get(size6);
                    android.view.View view2 = jVar2.f23351a.f23130a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f23351a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f23311m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f23310l.size() - 1; size7 >= 0; size7--) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f23310l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    androidx.recyclerview.widget.RecyclerView.D d10 = (androidx.recyclerview.widget.RecyclerView.D) arrayList2.get(size8);
                    d10.f23130a.setAlpha(1.0f);
                    A(d10);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f23310l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f23312n.size() - 1; size9 >= 0; size9--) {
                java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f23312n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((androidx.recyclerview.widget.c.i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f23312n.remove(arrayList3);
                    }
                }
            }
            U(this.f23315q);
            U(this.f23314p);
            U(this.f23313o);
            U(this.f23316r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.f23307i.isEmpty() && this.f23309k.isEmpty() && this.f23308j.isEmpty() && this.f23306h.isEmpty() && this.f23314p.isEmpty() && this.f23315q.isEmpty() && this.f23313o.isEmpty() && this.f23316r.isEmpty() && this.f23311m.isEmpty() && this.f23310l.isEmpty() && this.f23312n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void u() {
        boolean z6 = !this.f23306h.isEmpty();
        boolean z10 = !this.f23308j.isEmpty();
        boolean z11 = !this.f23309k.isEmpty();
        boolean z12 = !this.f23307i.isEmpty();
        if (z6 || z10 || z12 || z11) {
            java.util.Iterator it = this.f23306h.iterator();
            while (it.hasNext()) {
                T((androidx.recyclerview.widget.RecyclerView.D) it.next());
            }
            this.f23306h.clear();
            if (z10) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(this.f23308j);
                this.f23311m.add(arrayList);
                this.f23308j.clear();
                androidx.recyclerview.widget.c.a aVar = new androidx.recyclerview.widget.c.a(arrayList);
                if (z6) {
                    androidx.core.view.X.g0(((androidx.recyclerview.widget.c.j) arrayList.get(0)).f23351a.f23130a, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z11) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.addAll(this.f23309k);
                this.f23312n.add(arrayList2);
                this.f23309k.clear();
                androidx.recyclerview.widget.c.b bVar = new androidx.recyclerview.widget.c.b(arrayList2);
                if (z6) {
                    androidx.core.view.X.g0(((androidx.recyclerview.widget.c.i) arrayList2.get(0)).f23345a.f23130a, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z12) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.addAll(this.f23307i);
                this.f23310l.add(arrayList3);
                this.f23307i.clear();
                androidx.recyclerview.widget.c.RunnableC0438c runnableC0438c = new androidx.recyclerview.widget.c.RunnableC0438c(arrayList3);
                if (z6 || z10 || z11) {
                    androidx.core.view.X.g0(((androidx.recyclerview.widget.RecyclerView.D) arrayList3.get(0)).f23130a, runnableC0438c, (z6 ? o() : 0L) + java.lang.Math.max(z10 ? n() : 0L, z11 ? m() : 0L));
                } else {
                    runnableC0438c.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.m
    public boolean w(androidx.recyclerview.widget.RecyclerView.D d6) {
        Z(d6);
        d6.f23130a.setAlpha(0.0f);
        this.f23307i.add(d6);
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean x(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.D d10, int i6, int i10, int i11, int i12) {
        if (d6 == d10) {
            return y(d6, i6, i10, i11, i12);
        }
        float translationX = d6.f23130a.getTranslationX();
        float translationY = d6.f23130a.getTranslationY();
        float alpha = d6.f23130a.getAlpha();
        Z(d6);
        int i13 = (int) ((i11 - i6) - translationX);
        int i14 = (int) ((i12 - i10) - translationY);
        d6.f23130a.setTranslationX(translationX);
        d6.f23130a.setTranslationY(translationY);
        d6.f23130a.setAlpha(alpha);
        if (d10 != null) {
            Z(d10);
            d10.f23130a.setTranslationX(-i13);
            d10.f23130a.setTranslationY(-i14);
            d10.f23130a.setAlpha(0.0f);
        }
        this.f23309k.add(new androidx.recyclerview.widget.c.i(d6, d10, i6, i10, i11, i12));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean y(androidx.recyclerview.widget.RecyclerView.D d6, int i6, int i10, int i11, int i12) {
        android.view.View view = d6.f23130a;
        int translationX = i6 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) d6.f23130a.getTranslationY());
        Z(d6);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            E(d6);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        this.f23308j.add(new androidx.recyclerview.widget.c.j(d6, translationX, translationY, i11, i12));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean z(androidx.recyclerview.widget.RecyclerView.D d6) {
        Z(d6);
        this.f23306h.add(d6);
        return true;
    }
}
