package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class d extends androidx.fragment.app.A {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22400a;

        static {
            int[] iArr = new int[androidx.fragment.app.A.e.c.values().length];
            f22400a = iArr;
            try {
                iArr[androidx.fragment.app.A.e.c.GONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f22400a[androidx.fragment.app.A.e.c.INVISIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f22400a[androidx.fragment.app.A.e.c.REMOVED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f22400a[androidx.fragment.app.A.e.c.VISIBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ java.util.List f22401C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.A.e f22402D;

        b(java.util.List list, androidx.fragment.app.A.e eVar) {
            this.f22401C = list;
            this.f22402D = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f22401C.contains(this.f22402D)) {
                this.f22401C.remove(this.f22402D);
                androidx.fragment.app.d.this.s(this.f22402D);
            }
        }
    }

    class c extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.ViewGroup f22404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.View f22405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f22406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.A.e f22407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.d.k f22408e;

        c(android.view.ViewGroup viewGroup, android.view.View view, boolean z6, androidx.fragment.app.A.e eVar, androidx.fragment.app.d.k kVar) {
            this.f22404a = viewGroup;
            this.f22405b = view;
            this.f22406c = z6;
            this.f22407d = eVar;
            this.f22408e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            this.f22404a.endViewTransition(this.f22405b);
            if (this.f22406c) {
                this.f22407d.e().e(this.f22405b);
            }
            this.f22408e.a();
            if (androidx.fragment.app.n.E0(2)) {
                java.lang.String str = "Animator from operation " + this.f22407d + " has ended.";
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    class C0424d implements androidx.core.os.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.animation.Animator f22410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.A.e f22411b;

        C0424d(android.animation.Animator animator, androidx.fragment.app.A.e eVar) {
            this.f22410a = animator;
            this.f22411b = eVar;
        }

        @Override // androidx.core.os.e.a
        public void onCancel() {
            this.f22410a.end();
            if (androidx.fragment.app.n.E0(2)) {
                java.lang.String str = "Animator from operation " + this.f22411b + " has been canceled.";
            }
        }
    }

    class e implements android.view.animation.Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.A.e f22413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.ViewGroup f22414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.view.View f22415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.d.k f22416d;

        class a implements java.lang.Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                androidx.fragment.app.d.e eVar = androidx.fragment.app.d.e.this;
                eVar.f22414b.endViewTransition(eVar.f22415c);
                androidx.fragment.app.d.e.this.f22416d.a();
            }
        }

        e(androidx.fragment.app.A.e eVar, android.view.ViewGroup viewGroup, android.view.View view, androidx.fragment.app.d.k kVar) {
            this.f22413a = eVar;
            this.f22414b = viewGroup;
            this.f22415c = view;
            this.f22416d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation animation) {
            this.f22414b.post(new androidx.fragment.app.d.e.a());
            if (androidx.fragment.app.n.E0(2)) {
                java.lang.String str = "Animation from operation " + this.f22413a + " has ended.";
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(android.view.animation.Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(android.view.animation.Animation animation) {
            if (androidx.fragment.app.n.E0(2)) {
                java.lang.String str = "Animation from operation " + this.f22413a + " has reached onAnimationStart.";
            }
        }
    }

    class f implements androidx.core.os.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f22419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.ViewGroup f22420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.d.k f22421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.A.e f22422d;

        f(android.view.View view, android.view.ViewGroup viewGroup, androidx.fragment.app.d.k kVar, androidx.fragment.app.A.e eVar) {
            this.f22419a = view;
            this.f22420b = viewGroup;
            this.f22421c = kVar;
            this.f22422d = eVar;
        }

        @Override // androidx.core.os.e.a
        public void onCancel() {
            this.f22419a.clearAnimation();
            this.f22420b.endViewTransition(this.f22419a);
            this.f22421c.a();
            if (androidx.fragment.app.n.E0(2)) {
                java.lang.String str = "Animation from operation " + this.f22422d + " has been cancelled.";
            }
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.A.e f22424C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.A.e f22425D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f22426E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p170r.C7026a f22427F;

        g(androidx.fragment.app.A.e eVar, androidx.fragment.app.A.e eVar2, boolean z6, p170r.C7026a c7026a) {
            this.f22424C = eVar;
            this.f22425D = eVar2;
            this.f22426E = z6;
            this.f22427F = c7026a;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.fragment.app.v.a(this.f22424C.f(), this.f22425D.f(), this.f22426E, this.f22427F, false);
        }
    }

    class h implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.x f22429C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ android.view.View f22430D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ android.graphics.Rect f22431E;

        h(androidx.fragment.app.x xVar, android.view.View view, android.graphics.Rect rect) {
            this.f22429C = xVar;
            this.f22430D = view;
            this.f22431E = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22429C.h(this.f22430D, this.f22431E);
        }
    }

    class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f22433C;

        i(java.util.ArrayList arrayList) {
            this.f22433C = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.fragment.app.v.d(this.f22433C, 4);
        }
    }

    class j implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.d.m f22435C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.A.e f22436D;

        j(androidx.fragment.app.d.m mVar, androidx.fragment.app.A.e eVar) {
            this.f22435C = mVar;
            this.f22436D = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22435C.a();
            if (androidx.fragment.app.n.E0(2)) {
                java.lang.String str = "Transition for operation " + this.f22436D + "has completed";
            }
        }
    }

    private static class k extends androidx.fragment.app.d.l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f22439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.fragment.app.h.a f22440e;

        k(androidx.fragment.app.A.e eVar, androidx.core.os.e eVar2, boolean z6) {
            super(eVar, eVar2);
            this.f22439d = false;
            this.f22438c = z6;
        }

        androidx.fragment.app.h.a e(android.content.Context context) {
            if (this.f22439d) {
                return this.f22440e;
            }
            androidx.fragment.app.h.a aVarB = androidx.fragment.app.h.b(context, b().f(), b().e() == androidx.fragment.app.A.e.c.VISIBLE, this.f22438c);
            this.f22440e = aVarB;
            this.f22439d = true;
            return aVarB;
        }
    }

    private static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.fragment.app.A.e f22441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.core.os.e f22442b;

        l(androidx.fragment.app.A.e eVar, androidx.core.os.e eVar2) {
            this.f22441a = eVar;
            this.f22442b = eVar2;
        }

        void a() {
            this.f22441a.d(this.f22442b);
        }

        androidx.fragment.app.A.e b() {
            return this.f22441a;
        }

        androidx.core.os.e c() {
            return this.f22442b;
        }

        boolean d() {
            androidx.fragment.app.A.e.c cVar;
            androidx.fragment.app.A.e.c cVarI = androidx.fragment.app.A.e.c.i(this.f22441a.f().f22507k0);
            androidx.fragment.app.A.e.c cVarE = this.f22441a.e();
            return cVarI == cVarE || !(cVarI == (cVar = androidx.fragment.app.A.e.c.VISIBLE) || cVarE == cVar);
        }
    }

    private static class m extends androidx.fragment.app.d.l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.lang.Object f22443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f22444d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final java.lang.Object f22445e;

        m(androidx.fragment.app.A.e eVar, androidx.core.os.e eVar2, boolean z6, boolean z10) {
            boolean zO;
            java.lang.Object objQ;
            super(eVar, eVar2);
            if (eVar.e() == androidx.fragment.app.A.e.c.VISIBLE) {
                androidx.fragment.app.f fVarF = eVar.f();
                this.f22443c = z6 ? fVarF.M() : fVarF.w();
                androidx.fragment.app.f fVarF2 = eVar.f();
                zO = z6 ? fVarF2.o() : fVarF2.m();
            } else {
                androidx.fragment.app.f fVarF3 = eVar.f();
                this.f22443c = z6 ? fVarF3.O() : fVarF3.z();
                zO = true;
            }
            this.f22444d = zO;
            if (z10) {
                androidx.fragment.app.f fVarF4 = eVar.f();
                objQ = z6 ? fVarF4.Q() : fVarF4.P();
            } else {
                objQ = null;
            }
            this.f22445e = objQ;
        }

        private androidx.fragment.app.x f(java.lang.Object obj) {
            if (obj == null) {
                return null;
            }
            androidx.fragment.app.x xVar = androidx.fragment.app.v.f22705a;
            if (xVar != null && xVar.e(obj)) {
                return xVar;
            }
            androidx.fragment.app.x xVar2 = androidx.fragment.app.v.f22706b;
            if (xVar2 != null && xVar2.e(obj)) {
                return xVar2;
            }
            throw new java.lang.IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        androidx.fragment.app.x e() {
            androidx.fragment.app.x xVarF = f(this.f22443c);
            androidx.fragment.app.x xVarF2 = f(this.f22445e);
            if (xVarF == null || xVarF2 == null || xVarF == xVarF2) {
                return xVarF != null ? xVarF : xVarF2;
            }
            throw new java.lang.IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f22443c + " which uses a different Transition  type than its shared element transition " + this.f22445e);
        }

        public java.lang.Object g() {
            return this.f22445e;
        }

        java.lang.Object h() {
            return this.f22443c;
        }

        public boolean i() {
            return this.f22445e != null;
        }

        boolean j() {
            return this.f22444d;
        }
    }

    d(android.view.ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(java.util.List list, java.util.List list2, boolean z6, java.util.Map map) {
        int i6;
        java.lang.StringBuilder sb;
        java.lang.String str;
        boolean z10;
        android.content.Context context;
        android.view.View view;
        int i10;
        androidx.fragment.app.h.a aVarE;
        androidx.fragment.app.A.e eVar;
        android.view.ViewGroup viewGroupM = m();
        android.content.Context context2 = viewGroupM.getContext();
        java.util.ArrayList<androidx.fragment.app.d.k> arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        boolean z11 = false;
        while (true) {
            i6 = 2;
            if (!it.hasNext()) {
                break;
            }
            androidx.fragment.app.d.k kVar = (androidx.fragment.app.d.k) it.next();
            if (kVar.d() || (aVarE = kVar.e(context2)) == null) {
                kVar.a();
            } else {
                android.animation.Animator animator = aVarE.f22557b;
                if (animator == null) {
                    arrayList.add(kVar);
                } else {
                    androidx.fragment.app.A.e eVarB = kVar.b();
                    androidx.fragment.app.f fVarF = eVarB.f();
                    if (java.lang.Boolean.TRUE.equals(map.get(eVarB))) {
                        if (androidx.fragment.app.n.E0(2)) {
                            java.lang.String str2 = "Ignoring Animator set on " + fVarF + " as this Fragment was involved in a Transition.";
                        }
                        kVar.a();
                    } else {
                        boolean z12 = eVarB.e() == androidx.fragment.app.A.e.c.GONE;
                        if (z12) {
                            list2.remove(eVarB);
                        }
                        android.view.View view2 = fVarF.f22507k0;
                        viewGroupM.startViewTransition(view2);
                        animator.addListener(new androidx.fragment.app.d.c(viewGroupM, view2, z12, eVarB, kVar));
                        animator.setTarget(view2);
                        animator.start();
                        if (androidx.fragment.app.n.E0(2)) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append("Animator from operation ");
                            eVar = eVarB;
                            sb2.append(eVar);
                            sb2.append(" has started.");
                            sb2.toString();
                        } else {
                            eVar = eVarB;
                        }
                        kVar.c().b(new androidx.fragment.app.d.C0424d(animator, eVar));
                        z11 = true;
                    }
                }
            }
        }
        for (androidx.fragment.app.d.k kVar2 : arrayList) {
            androidx.fragment.app.A.e eVarB2 = kVar2.b();
            androidx.fragment.app.f fVarF2 = eVarB2.f();
            if (z6) {
                if (androidx.fragment.app.n.E0(i6)) {
                    sb = new java.lang.StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fVarF2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    sb.toString();
                }
                kVar2.a();
            } else if (z11) {
                if (androidx.fragment.app.n.E0(i6)) {
                    sb = new java.lang.StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fVarF2);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    sb.toString();
                }
                kVar2.a();
            } else {
                android.view.View view3 = fVarF2.f22507k0;
                android.view.animation.Animation animation = (android.view.animation.Animation) B1.i.g(((androidx.fragment.app.h.a) B1.i.g(kVar2.e(context2))).f22556a);
                if (eVarB2.e() != androidx.fragment.app.A.e.c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar2.a();
                    z10 = z11;
                    context = context2;
                    i10 = i6;
                    view = view3;
                } else {
                    viewGroupM.startViewTransition(view3);
                    androidx.fragment.app.h.b bVar = new androidx.fragment.app.h.b(animation, viewGroupM, view3);
                    z10 = z11;
                    context = context2;
                    view = view3;
                    bVar.setAnimationListener(new androidx.fragment.app.d.e(eVarB2, viewGroupM, view3, kVar2));
                    view.startAnimation(bVar);
                    i10 = 2;
                    if (androidx.fragment.app.n.E0(2)) {
                        java.lang.String str3 = "Animation from operation " + eVarB2 + " has started.";
                    }
                }
                kVar2.c().b(new androidx.fragment.app.d.f(view, viewGroupM, kVar2, eVarB2));
                i6 = i10;
                z11 = z10;
                context2 = context;
            }
        }
    }

    private java.util.Map x(java.util.List list, java.util.List list2, boolean z6, androidx.fragment.app.A.e eVar, androidx.fragment.app.A.e eVar2) {
        java.lang.String str;
        java.lang.String str2;
        android.view.View view;
        java.lang.Object obj;
        java.util.ArrayList arrayList;
        java.lang.Object obj2;
        java.util.ArrayList arrayList2;
        java.util.HashMap map;
        android.view.View view2;
        java.lang.Object objK;
        java.util.ArrayList arrayList3;
        androidx.fragment.app.A.e eVar3;
        java.util.HashMap map2;
        androidx.fragment.app.A.e eVar4;
        android.view.View view3;
        android.view.View view4;
        androidx.fragment.app.A.e eVar5 = eVar;
        androidx.fragment.app.A.e eVar6 = eVar2;
        java.util.HashMap map3 = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        androidx.fragment.app.x xVar = null;
        while (it.hasNext()) {
            androidx.fragment.app.d.m mVar = (androidx.fragment.app.d.m) it.next();
            if (!mVar.d()) {
                androidx.fragment.app.x xVarE = mVar.e();
                if (xVar == null) {
                    xVar = xVarE;
                } else if (xVarE != null && xVar != xVarE) {
                    throw new java.lang.IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (xVar == null) {
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                androidx.fragment.app.d.m mVar2 = (androidx.fragment.app.d.m) it2.next();
                map3.put(mVar2.b(), java.lang.Boolean.FALSE);
                mVar2.a();
            }
            return map3;
        }
        android.view.View view5 = new android.view.View(m().getContext());
        android.graphics.Rect rect = new android.graphics.Rect();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        p170r.C7026a c7026a = new p170r.C7026a();
        java.util.Iterator it3 = list.iterator();
        java.lang.Object obj3 = null;
        android.view.View view6 = null;
        boolean z10 = false;
        while (true) {
            str = "FragmentManager";
            if (!it3.hasNext()) {
                break;
            }
            androidx.fragment.app.d.m mVar3 = (androidx.fragment.app.d.m) it3.next();
            if (!mVar3.i() || eVar5 == null || eVar6 == null) {
                arrayList3 = arrayList5;
                eVar3 = eVar5;
                map2 = map3;
                android.view.View view7 = view5;
                eVar4 = eVar6;
                view3 = view7;
                view6 = view6;
            } else {
                java.lang.Object objU = xVar.u(xVar.f(mVar3.g()));
                java.util.ArrayList arrayListR = eVar2.f().R();
                java.util.ArrayList arrayListR2 = eVar.f().R();
                java.util.ArrayList arrayListS = eVar.f().S();
                android.view.View view8 = view6;
                int i6 = 0;
                while (i6 < arrayListS.size()) {
                    int iIndexOf = arrayListR.indexOf(arrayListS.get(i6));
                    java.util.ArrayList arrayList6 = arrayListS;
                    if (iIndexOf != -1) {
                        arrayListR.set(iIndexOf, (java.lang.String) arrayListR2.get(i6));
                    }
                    i6++;
                    arrayListS = arrayList6;
                }
                java.util.ArrayList arrayListS2 = eVar2.f().S();
                androidx.fragment.app.f fVarF = eVar.f();
                if (z6 == 0) {
                    fVarF.A();
                    eVar2.f().x();
                } else {
                    fVarF.x();
                    eVar2.f().A();
                }
                int i10 = 0;
                for (int size = arrayListR.size(); i10 < size; size = size) {
                    c7026a.put((java.lang.String) arrayListR.get(i10), (java.lang.String) arrayListS2.get(i10));
                    i10++;
                }
                if (androidx.fragment.app.n.E0(2)) {
                    for (java.util.Iterator it4 = arrayListS2.iterator(); it4.hasNext(); it4 = it4) {
                        java.lang.String str3 = "Name: " + ((java.lang.String) it4.next());
                    }
                    for (java.util.Iterator it5 = arrayListR.iterator(); it5.hasNext(); it5 = it5) {
                        java.lang.String str4 = "Name: " + ((java.lang.String) it5.next());
                    }
                }
                p170r.C7026a c7026a2 = new p170r.C7026a();
                u(c7026a2, eVar.f().f22507k0);
                c7026a2.p(arrayListR);
                c7026a.p(c7026a2.keySet());
                p170r.C7026a c7026a3 = new p170r.C7026a();
                u(c7026a3, eVar2.f().f22507k0);
                c7026a3.p(arrayListS2);
                c7026a3.p(c7026a.values());
                androidx.fragment.app.v.c(c7026a, c7026a3);
                v(c7026a2, c7026a.keySet());
                v(c7026a3, c7026a.values());
                if (c7026a.isEmpty()) {
                    arrayList4.clear();
                    arrayList5.clear();
                    arrayList3 = arrayList5;
                    eVar3 = eVar5;
                    view3 = view5;
                    view6 = view8;
                    obj3 = null;
                    eVar4 = eVar2;
                    map2 = map3;
                } else {
                    androidx.fragment.app.v.a(eVar2.f(), eVar.f(), z6, c7026a2, true);
                    java.util.HashMap map4 = map3;
                    android.view.View view9 = view5;
                    java.util.ArrayList arrayList7 = arrayList5;
                    androidx.core.view.J.a(m(), new androidx.fragment.app.d.g(eVar2, eVar, z6, c7026a3));
                    arrayList4.addAll(c7026a2.values());
                    if (arrayListR.isEmpty()) {
                        view6 = view8;
                    } else {
                        view6 = (android.view.View) c7026a2.get((java.lang.String) arrayListR.get(0));
                        xVar.p(objU, view6);
                    }
                    arrayList3 = arrayList7;
                    arrayList3.addAll(c7026a3.values());
                    if (!arrayListS2.isEmpty() && (view4 = (android.view.View) c7026a3.get((java.lang.String) arrayListS2.get(0))) != null) {
                        androidx.core.view.J.a(m(), new androidx.fragment.app.d.h(xVar, view4, rect));
                        z10 = true;
                    }
                    xVar.s(objU, view9, arrayList4);
                    view3 = view9;
                    xVar.n(objU, null, null, null, null, objU, arrayList3);
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    eVar3 = eVar;
                    map2 = map4;
                    map2.put(eVar3, bool);
                    eVar4 = eVar2;
                    map2.put(eVar4, bool);
                    obj3 = objU;
                }
            }
            eVar5 = eVar3;
            arrayList4 = arrayList4;
            rect = rect;
            map3 = map2;
            c7026a = c7026a;
            arrayList5 = arrayList3;
            xVar = xVar;
            androidx.fragment.app.A.e eVar7 = eVar4;
            view5 = view3;
            eVar6 = eVar7;
        }
        android.view.View view10 = view6;
        p170r.C7026a c7026a4 = c7026a;
        java.util.ArrayList arrayList8 = arrayList5;
        androidx.fragment.app.A.e eVar8 = eVar5;
        java.util.ArrayList arrayList9 = arrayList4;
        android.graphics.Rect rect2 = rect;
        androidx.fragment.app.x xVar2 = xVar;
        java.util.HashMap map5 = map3;
        android.view.View view11 = view5;
        androidx.fragment.app.A.e eVar9 = eVar6;
        android.view.View view12 = view11;
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        java.util.Iterator it6 = list.iterator();
        java.lang.Object obj4 = null;
        java.lang.Object objK2 = null;
        while (it6.hasNext()) {
            androidx.fragment.app.d.m mVar4 = (androidx.fragment.app.d.m) it6.next();
            if (mVar4.d()) {
                map5.put(mVar4.b(), java.lang.Boolean.FALSE);
                mVar4.a();
            } else {
                java.lang.Object objF = xVar2.f(mVar4.h());
                androidx.fragment.app.A.e eVarB = mVar4.b();
                boolean z11 = obj3 != null && (eVarB == eVar8 || eVarB == eVar9);
                if (objF == null) {
                    if (!z11) {
                        map5.put(eVarB, java.lang.Boolean.FALSE);
                        mVar4.a();
                    }
                    arrayList2 = arrayList8;
                    str2 = str;
                    arrayList = arrayList9;
                    view = view12;
                    objK = obj4;
                    map = map5;
                    view2 = view10;
                } else {
                    str2 = str;
                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                    java.lang.Object obj5 = obj4;
                    t(arrayList11, eVarB.f().f22507k0);
                    if (z11) {
                        if (eVarB == eVar8) {
                            arrayList11.removeAll(arrayList9);
                        } else {
                            arrayList11.removeAll(arrayList8);
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        xVar2.a(objF, view12);
                        arrayList2 = arrayList8;
                        arrayList = arrayList9;
                        view = view12;
                        obj2 = objK2;
                        map = map5;
                        obj = obj5;
                    } else {
                        xVar2.b(objF, arrayList11);
                        view = view12;
                        obj = obj5;
                        arrayList = arrayList9;
                        obj2 = objK2;
                        arrayList2 = arrayList8;
                        map = map5;
                        xVar2.n(objF, objF, arrayList11, null, null, null, null);
                        if (eVarB.e() == androidx.fragment.app.A.e.c.GONE) {
                            list2.remove(eVarB);
                            java.util.ArrayList arrayList12 = new java.util.ArrayList(arrayList11);
                            arrayList12.remove(eVarB.f().f22507k0);
                            xVar2.m(objF, eVarB.f().f22507k0, arrayList12);
                            androidx.core.view.J.a(m(), new androidx.fragment.app.d.i(arrayList11));
                        }
                    }
                    if (eVarB.e() == androidx.fragment.app.A.e.c.VISIBLE) {
                        arrayList10.addAll(arrayList11);
                        if (z10) {
                            xVar2.o(objF, rect2);
                        }
                        view2 = view10;
                    } else {
                        view2 = view10;
                        xVar2.p(objF, view2);
                    }
                    map.put(eVarB, java.lang.Boolean.TRUE);
                    if (mVar4.j()) {
                        objK2 = xVar2.k(obj2, objF, null);
                        objK = obj;
                    } else {
                        objK = xVar2.k(obj, objF, null);
                        objK2 = obj2;
                    }
                }
                eVar9 = eVar2;
                map5 = map;
                obj4 = objK;
                view10 = view2;
                str = str2;
                view12 = view;
                arrayList9 = arrayList;
                arrayList8 = arrayList2;
            }
        }
        java.util.ArrayList<android.view.View> arrayList13 = arrayList8;
        java.lang.String str5 = str;
        java.util.ArrayList<android.view.View> arrayList14 = arrayList9;
        java.util.HashMap map6 = map5;
        java.lang.Object objJ = xVar2.j(objK2, obj4, obj3);
        if (objJ == null) {
            return map6;
        }
        java.util.Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            androidx.fragment.app.d.m mVar5 = (androidx.fragment.app.d.m) it7.next();
            if (!mVar5.d()) {
                java.lang.Object objH = mVar5.h();
                androidx.fragment.app.A.e eVarB2 = mVar5.b();
                java.util.HashMap map7 = map6;
                boolean z12 = obj3 != null && (eVarB2 == eVar8 || eVarB2 == eVar2);
                if (objH == null && !z12) {
                    str5 = str5;
                } else if (androidx.core.view.X.R(m())) {
                    str5 = str5;
                    xVar2.q(mVar5.b().f(), objJ, mVar5.c(), new androidx.fragment.app.d.j(mVar5, eVarB2));
                } else {
                    if (androidx.fragment.app.n.E0(2)) {
                        java.lang.String str6 = "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + eVarB2;
                    }
                    mVar5.a();
                }
                map6 = map7;
                str5 = str5;
            }
        }
        java.util.HashMap map8 = map6;
        if (!androidx.core.view.X.R(m())) {
            return map8;
        }
        androidx.fragment.app.v.d(arrayList10, 4);
        java.util.ArrayList arrayListL = xVar2.l(arrayList13);
        if (androidx.fragment.app.n.E0(2)) {
            for (android.view.View view13 : arrayList14) {
                java.lang.String str7 = "View: " + view13 + " Name: " + androidx.core.view.X.H(view13);
            }
            for (android.view.View view14 : arrayList13) {
                java.lang.String str8 = "View: " + view14 + " Name: " + androidx.core.view.X.H(view14);
            }
        }
        xVar2.c(m(), objJ);
        xVar2.r(m(), arrayList14, arrayList13, arrayListL, c7026a4);
        androidx.fragment.app.v.d(arrayList10, 0);
        xVar2.t(obj3, arrayList14, arrayList13);
        return map8;
    }

    private void y(java.util.List list) {
        androidx.fragment.app.f fVarF = ((androidx.fragment.app.A.e) list.get(list.size() - 1)).f();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.A.e eVar = (androidx.fragment.app.A.e) it.next();
            eVar.f().f22510n0.f22532c = fVarF.f22510n0.f22532c;
            eVar.f().f22510n0.f22533d = fVarF.f22510n0.f22533d;
            eVar.f().f22510n0.f22534e = fVarF.f22510n0.f22534e;
            eVar.f().f22510n0.f22535f = fVarF.f22510n0.f22535f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    @Override // androidx.fragment.app.A
    void f(java.util.List list, boolean z6) {
        java.util.Iterator it = list.iterator();
        androidx.fragment.app.A.e eVar = null;
        androidx.fragment.app.A.e eVar2 = null;
        while (it.hasNext()) {
            androidx.fragment.app.A.e eVar3 = (androidx.fragment.app.A.e) it.next();
            androidx.fragment.app.A.e.c cVarI = androidx.fragment.app.A.e.c.i(eVar3.f().f22507k0);
            int i6 = androidx.fragment.app.d.a.f22400a[eVar3.e().ordinal()];
            if (i6 == 1 || i6 == 2 || i6 == 3) {
                if (cVarI == androidx.fragment.app.A.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i6 == 4 && cVarI != androidx.fragment.app.A.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        if (androidx.fragment.app.n.E0(2)) {
            java.lang.String str = "Executing operations from " + eVar + " to " + eVar2;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(list);
        y(list);
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            androidx.fragment.app.A.e eVar4 = (androidx.fragment.app.A.e) it2.next();
            androidx.core.os.e eVar5 = new androidx.core.os.e();
            eVar4.j(eVar5);
            arrayList.add(new androidx.fragment.app.d.k(eVar4, eVar5, z6));
            androidx.core.os.e eVar6 = new androidx.core.os.e();
            eVar4.j(eVar6);
            boolean z10 = false;
            if (z6) {
                if (eVar4 == eVar) {
                    z10 = true;
                }
            } else if (eVar4 == eVar2) {
                z10 = true;
            }
            arrayList2.add(new androidx.fragment.app.d.m(eVar4, eVar6, z6, z10));
            eVar4.a(new androidx.fragment.app.d.b(arrayList3, eVar4));
        }
        java.util.Map mapX = x(arrayList2, arrayList3, z6, eVar, eVar2);
        w(arrayList, arrayList3, mapX.containsValue(java.lang.Boolean.TRUE), mapX);
        java.util.Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            s((androidx.fragment.app.A.e) it3.next());
        }
        arrayList3.clear();
        if (androidx.fragment.app.n.E0(2)) {
            java.lang.String str2 = "Completed executing operations from " + eVar + " to " + eVar2;
        }
    }

    void s(androidx.fragment.app.A.e eVar) {
        eVar.e().e(eVar.f().f22507k0);
    }

    void t(java.util.ArrayList arrayList, android.view.View view) {
        if (!(view instanceof android.view.ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        if (androidx.core.view.AbstractC1995c0.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = viewGroup.getChildAt(i6);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    void u(java.util.Map map, android.view.View view) {
        java.lang.String strH = androidx.core.view.X.H(view);
        if (strH != null) {
            map.put(strH, view);
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                android.view.View childAt = viewGroup.getChildAt(i6);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(p170r.C7026a c7026a, java.util.Collection collection) {
        java.util.Iterator it = c7026a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(androidx.core.view.X.H((android.view.View) ((java.util.Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }
}
