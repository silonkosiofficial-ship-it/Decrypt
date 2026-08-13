package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.ViewGroup f22346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.ArrayList f22347b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.util.ArrayList f22348c = new java.util.ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f22349d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f22350e = false;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.A.d f22351C;

        a(androidx.fragment.app.A.d dVar) {
            this.f22351C = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (androidx.fragment.app.A.this.f22347b.contains(this.f22351C)) {
                this.f22351C.e().e(this.f22351C.f().f22507k0);
            }
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.A.d f22353C;

        b(androidx.fragment.app.A.d dVar) {
            this.f22353C = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.fragment.app.A.this.f22347b.remove(this.f22353C);
            androidx.fragment.app.A.this.f22348c.remove(this.f22353C);
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f22356b;

        static {
            int[] iArr = new int[androidx.fragment.app.A.e.b.values().length];
            f22356b = iArr;
            try {
                iArr[androidx.fragment.app.A.e.b.ADDING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f22356b[androidx.fragment.app.A.e.b.REMOVING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f22356b[androidx.fragment.app.A.e.b.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[androidx.fragment.app.A.e.c.values().length];
            f22355a = iArr2;
            try {
                iArr2[androidx.fragment.app.A.e.c.REMOVED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f22355a[androidx.fragment.app.A.e.c.VISIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f22355a[androidx.fragment.app.A.e.c.GONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f22355a[androidx.fragment.app.A.e.c.INVISIBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    private static class d extends androidx.fragment.app.A.e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final androidx.fragment.app.s f22357h;

        d(androidx.fragment.app.A.e.c cVar, androidx.fragment.app.A.e.b bVar, androidx.fragment.app.s sVar, androidx.core.os.e eVar) {
            super(cVar, bVar, sVar.k(), eVar);
            this.f22357h = sVar;
        }

        @Override // androidx.fragment.app.A.e
        public void c() {
            super.c();
            this.f22357h.m();
        }

        @Override // androidx.fragment.app.A.e
        void l() {
            if (g() != androidx.fragment.app.A.e.b.ADDING) {
                if (g() == androidx.fragment.app.A.e.b.REMOVING) {
                    androidx.fragment.app.f fVarK = this.f22357h.k();
                    android.view.View viewQ1 = fVarK.q1();
                    if (androidx.fragment.app.n.E0(2)) {
                        java.lang.String str = "Clearing focus " + viewQ1.findFocus() + " on view " + viewQ1 + " for Fragment " + fVarK;
                    }
                    viewQ1.clearFocus();
                    return;
                }
                return;
            }
            androidx.fragment.app.f fVarK2 = this.f22357h.k();
            android.view.View viewFindFocus = fVarK2.f22507k0.findFocus();
            if (viewFindFocus != null) {
                fVarK2.w1(viewFindFocus);
                if (androidx.fragment.app.n.E0(2)) {
                    java.lang.String str2 = "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fVarK2;
                }
            }
            android.view.View viewQ2 = f().q1();
            if (viewQ2.getParent() == null) {
                this.f22357h.b();
                viewQ2.setAlpha(0.0f);
            }
            if (viewQ2.getAlpha() == 0.0f && viewQ2.getVisibility() == 0) {
                viewQ2.setVisibility(4);
            }
            viewQ2.setAlpha(fVarK2.L());
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.fragment.app.A.e.c f22358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.fragment.app.A.e.b f22359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.fragment.app.f f22360c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final java.util.List f22361d = new java.util.ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final java.util.HashSet f22362e = new java.util.HashSet();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f22363f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f22364g = false;

        class a implements androidx.core.os.e.a {
            a() {
            }

            @Override // androidx.core.os.e.a
            public void onCancel() {
                androidx.fragment.app.A.e.this.b();
            }
        }

        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static androidx.fragment.app.A.e.c g(int i6) {
                if (i6 == 0) {
                    return VISIBLE;
                }
                if (i6 == 4) {
                    return INVISIBLE;
                }
                if (i6 == 8) {
                    return GONE;
                }
                throw new java.lang.IllegalArgumentException("Unknown visibility " + i6);
            }

            static androidx.fragment.app.A.e.c i(android.view.View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : g(view.getVisibility());
            }

            void e(android.view.View view) {
                int i6;
                int i10 = androidx.fragment.app.A.c.f22355a[ordinal()];
                if (i10 == 1) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (androidx.fragment.app.n.E0(2)) {
                            java.lang.String str = "SpecialEffectsController: Removing view " + view + " from container " + viewGroup;
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (androidx.fragment.app.n.E0(2)) {
                        java.lang.String str2 = "SpecialEffectsController: Setting view " + view + " to VISIBLE";
                    }
                    i6 = 0;
                } else {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return;
                        }
                        if (androidx.fragment.app.n.E0(2)) {
                            java.lang.String str3 = "SpecialEffectsController: Setting view " + view + " to INVISIBLE";
                        }
                        view.setVisibility(4);
                        return;
                    }
                    if (androidx.fragment.app.n.E0(2)) {
                        java.lang.String str4 = "SpecialEffectsController: Setting view " + view + " to GONE";
                    }
                    i6 = 8;
                }
                view.setVisibility(i6);
            }
        }

        e(androidx.fragment.app.A.e.c cVar, androidx.fragment.app.A.e.b bVar, androidx.fragment.app.f fVar, androidx.core.os.e eVar) {
            this.f22358a = cVar;
            this.f22359b = bVar;
            this.f22360c = fVar;
            eVar.b(new androidx.fragment.app.A.e.a());
        }

        final void a(java.lang.Runnable runnable) {
            this.f22361d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f22363f = true;
            if (this.f22362e.isEmpty()) {
                c();
                return;
            }
            java.util.Iterator it = new java.util.ArrayList(this.f22362e).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.e) it.next()).a();
            }
        }

        public void c() {
            if (this.f22364g) {
                return;
            }
            if (androidx.fragment.app.n.E0(2)) {
                java.lang.String str = "SpecialEffectsController: " + this + " has called complete.";
            }
            this.f22364g = true;
            java.util.Iterator it = this.f22361d.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }

        public final void d(androidx.core.os.e eVar) {
            if (this.f22362e.remove(eVar) && this.f22362e.isEmpty()) {
                c();
            }
        }

        public androidx.fragment.app.A.e.c e() {
            return this.f22358a;
        }

        public final androidx.fragment.app.f f() {
            return this.f22360c;
        }

        androidx.fragment.app.A.e.b g() {
            return this.f22359b;
        }

        final boolean h() {
            return this.f22363f;
        }

        final boolean i() {
            return this.f22364g;
        }

        public final void j(androidx.core.os.e eVar) {
            l();
            this.f22362e.add(eVar);
        }

        final void k(androidx.fragment.app.A.e.c cVar, androidx.fragment.app.A.e.b bVar) {
            androidx.fragment.app.A.e.b bVar2;
            int i6 = androidx.fragment.app.A.c.f22356b[bVar.ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3 && this.f22358a != androidx.fragment.app.A.e.c.REMOVED) {
                        if (androidx.fragment.app.n.E0(2)) {
                            java.lang.String str = "SpecialEffectsController: For fragment " + this.f22360c + " mFinalState = " + this.f22358a + " -> " + cVar + ". ";
                        }
                        this.f22358a = cVar;
                        return;
                    }
                    return;
                }
                if (androidx.fragment.app.n.E0(2)) {
                    java.lang.String str2 = "SpecialEffectsController: For fragment " + this.f22360c + " mFinalState = " + this.f22358a + " -> REMOVED. mLifecycleImpact  = " + this.f22359b + " to REMOVING.";
                }
                this.f22358a = androidx.fragment.app.A.e.c.REMOVED;
                bVar2 = androidx.fragment.app.A.e.b.REMOVING;
            } else {
                if (this.f22358a != androidx.fragment.app.A.e.c.REMOVED) {
                    return;
                }
                if (androidx.fragment.app.n.E0(2)) {
                    java.lang.String str3 = "SpecialEffectsController: For fragment " + this.f22360c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f22359b + " to ADDING.";
                }
                this.f22358a = androidx.fragment.app.A.e.c.VISIBLE;
                bVar2 = androidx.fragment.app.A.e.b.ADDING;
            }
            this.f22359b = bVar2;
        }

        abstract void l();

        public java.lang.String toString() {
            return "Operation {" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + "} {mFinalState = " + this.f22358a + "} {mLifecycleImpact = " + this.f22359b + "} {mFragment = " + this.f22360c + "}";
        }
    }

    A(android.view.ViewGroup viewGroup) {
        this.f22346a = viewGroup;
    }

    private void a(androidx.fragment.app.A.e.c cVar, androidx.fragment.app.A.e.b bVar, androidx.fragment.app.s sVar) {
        synchronized (this.f22347b) {
            try {
                androidx.core.os.e eVar = new androidx.core.os.e();
                androidx.fragment.app.A.e eVarH = h(sVar.k());
                if (eVarH != null) {
                    eVarH.k(cVar, bVar);
                    return;
                }
                androidx.fragment.app.A.d dVar = new androidx.fragment.app.A.d(cVar, bVar, sVar, eVar);
                this.f22347b.add(dVar);
                dVar.a(new androidx.fragment.app.A.a(dVar));
                dVar.a(new androidx.fragment.app.A.b(dVar));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private androidx.fragment.app.A.e h(androidx.fragment.app.f fVar) {
        for (androidx.fragment.app.A.e eVar : this.f22347b) {
            if (eVar.f().equals(fVar) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    private androidx.fragment.app.A.e i(androidx.fragment.app.f fVar) {
        for (androidx.fragment.app.A.e eVar : this.f22348c) {
            if (eVar.f().equals(fVar) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    static androidx.fragment.app.A n(android.view.ViewGroup viewGroup, androidx.fragment.app.n nVar) {
        return o(viewGroup, nVar.w0());
    }

    static androidx.fragment.app.A o(android.view.ViewGroup viewGroup, androidx.fragment.app.B b6) {
        java.lang.Object tag = viewGroup.getTag(U1.b.f14458b);
        if (tag instanceof androidx.fragment.app.A) {
            return (androidx.fragment.app.A) tag;
        }
        androidx.fragment.app.A a6 = b6.a(viewGroup);
        viewGroup.setTag(U1.b.f14458b, a6);
        return a6;
    }

    private void q() {
        for (androidx.fragment.app.A.e eVar : this.f22347b) {
            if (eVar.g() == androidx.fragment.app.A.e.b.ADDING) {
                eVar.k(androidx.fragment.app.A.e.c.g(eVar.f().q1().getVisibility()), androidx.fragment.app.A.e.b.NONE);
            }
        }
    }

    void b(androidx.fragment.app.A.e.c cVar, androidx.fragment.app.s sVar) {
        if (androidx.fragment.app.n.E0(2)) {
            java.lang.String str = "SpecialEffectsController: Enqueuing add operation for fragment " + sVar.k();
        }
        a(cVar, androidx.fragment.app.A.e.b.ADDING, sVar);
    }

    void c(androidx.fragment.app.s sVar) {
        if (androidx.fragment.app.n.E0(2)) {
            java.lang.String str = "SpecialEffectsController: Enqueuing hide operation for fragment " + sVar.k();
        }
        a(androidx.fragment.app.A.e.c.GONE, androidx.fragment.app.A.e.b.NONE, sVar);
    }

    void d(androidx.fragment.app.s sVar) {
        if (androidx.fragment.app.n.E0(2)) {
            java.lang.String str = "SpecialEffectsController: Enqueuing remove operation for fragment " + sVar.k();
        }
        a(androidx.fragment.app.A.e.c.REMOVED, androidx.fragment.app.A.e.b.REMOVING, sVar);
    }

    void e(androidx.fragment.app.s sVar) {
        if (androidx.fragment.app.n.E0(2)) {
            java.lang.String str = "SpecialEffectsController: Enqueuing show operation for fragment " + sVar.k();
        }
        a(androidx.fragment.app.A.e.c.VISIBLE, androidx.fragment.app.A.e.b.NONE, sVar);
    }

    abstract void f(java.util.List list, boolean z6);

    void g() {
        if (this.f22350e) {
            return;
        }
        if (!androidx.core.view.X.Q(this.f22346a)) {
            j();
            this.f22349d = false;
            return;
        }
        synchronized (this.f22347b) {
            try {
                if (!this.f22347b.isEmpty()) {
                    java.util.ArrayList<androidx.fragment.app.A.e> arrayList = new java.util.ArrayList(this.f22348c);
                    this.f22348c.clear();
                    for (androidx.fragment.app.A.e eVar : arrayList) {
                        if (androidx.fragment.app.n.E0(2)) {
                            java.lang.String str = "SpecialEffectsController: Cancelling operation " + eVar;
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.f22348c.add(eVar);
                        }
                    }
                    q();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f22347b);
                    this.f22347b.clear();
                    this.f22348c.addAll(arrayList2);
                    if (androidx.fragment.app.n.E0(2)) {
                    }
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((androidx.fragment.app.A.e) it.next()).l();
                    }
                    f(arrayList2, this.f22349d);
                    this.f22349d = false;
                    if (androidx.fragment.app.n.E0(2)) {
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    void j() {
        if (androidx.fragment.app.n.E0(2)) {
        }
        boolean zQ = androidx.core.view.X.Q(this.f22346a);
        synchronized (this.f22347b) {
            try {
                q();
                java.util.Iterator it = this.f22347b.iterator();
                while (it.hasNext()) {
                    ((androidx.fragment.app.A.e) it.next()).l();
                }
                for (androidx.fragment.app.A.e eVar : new java.util.ArrayList(this.f22348c)) {
                    if (androidx.fragment.app.n.E0(2)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        sb.append(zQ ? "" : "Container " + this.f22346a + " is not attached to window. ");
                        sb.append("Cancelling running operation ");
                        sb.append(eVar);
                        sb.toString();
                    }
                    eVar.b();
                }
                for (androidx.fragment.app.A.e eVar2 : new java.util.ArrayList(this.f22347b)) {
                    if (androidx.fragment.app.n.E0(2)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        sb2.append(zQ ? "" : "Container " + this.f22346a + " is not attached to window. ");
                        sb2.append("Cancelling pending operation ");
                        sb2.append(eVar2);
                        sb2.toString();
                    }
                    eVar2.b();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    void k() {
        if (this.f22350e) {
            if (androidx.fragment.app.n.E0(2)) {
            }
            this.f22350e = false;
            g();
        }
    }

    androidx.fragment.app.A.e.b l(androidx.fragment.app.s sVar) {
        androidx.fragment.app.A.e eVarH = h(sVar.k());
        androidx.fragment.app.A.e.b bVarG = eVarH != null ? eVarH.g() : null;
        androidx.fragment.app.A.e eVarI = i(sVar.k());
        return (eVarI == null || !(bVarG == null || bVarG == androidx.fragment.app.A.e.b.NONE)) ? bVarG : eVarI.g();
    }

    public android.view.ViewGroup m() {
        return this.f22346a;
    }

    void p() {
        synchronized (this.f22347b) {
            try {
                q();
                this.f22350e = false;
                for (int size = this.f22347b.size() - 1; size >= 0; size--) {
                    androidx.fragment.app.A.e eVar = (androidx.fragment.app.A.e) this.f22347b.get(size);
                    androidx.fragment.app.A.e.c cVarI = androidx.fragment.app.A.e.c.i(eVar.f().f22507k0);
                    androidx.fragment.app.A.e.c cVarE = eVar.e();
                    androidx.fragment.app.A.e.c cVar = androidx.fragment.app.A.e.c.VISIBLE;
                    if (cVarE == cVar && cVarI != cVar) {
                        this.f22350e = eVar.f().e0();
                        break;
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    void r(boolean z6) {
        this.f22349d = z6;
    }
}
