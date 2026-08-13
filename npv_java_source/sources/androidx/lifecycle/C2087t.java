package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2087t extends androidx.lifecycle.AbstractC2079k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final androidx.lifecycle.C2087t.a f22836k = new androidx.lifecycle.C2087t.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p140o.a f22838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.lifecycle.AbstractC2079k.b f22839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.ref.WeakReference f22840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.util.ArrayList f22844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Z8.y f22845j;

    /* JADX INFO: renamed from: androidx.lifecycle.t$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final androidx.lifecycle.AbstractC2079k.b a(androidx.lifecycle.AbstractC2079k.b bVar, androidx.lifecycle.AbstractC2079k.b bVar2) {
            p247y7.AbstractC7350t.f(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.lifecycle.AbstractC2079k.b f22846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.lifecycle.InterfaceC2083o f22847b;

        public b(androidx.lifecycle.InterfaceC2085q interfaceC2085q, androidx.lifecycle.AbstractC2079k.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "initialState");
            p247y7.AbstractC7350t.c(interfaceC2085q);
            this.f22847b = androidx.lifecycle.C2090w.f(interfaceC2085q);
            this.f22846a = bVar;
        }

        public final void a(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "event");
            androidx.lifecycle.AbstractC2079k.b bVarG = aVar.g();
            this.f22846a = androidx.lifecycle.C2087t.f22836k.a(this.f22846a, bVarG);
            androidx.lifecycle.InterfaceC2083o interfaceC2083o = this.f22847b;
            p247y7.AbstractC7350t.c(rVar);
            interfaceC2083o.i(rVar, aVar);
            this.f22846a = bVarG;
        }

        public final androidx.lifecycle.AbstractC2079k.b b() {
            return this.f22846a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2087t(androidx.lifecycle.r rVar) {
        this(rVar, true);
        p247y7.AbstractC7350t.f(rVar, "provider");
    }

    private C2087t(androidx.lifecycle.r rVar, boolean z6) {
        this.f22837b = z6;
        this.f22838c = new p140o.a();
        androidx.lifecycle.AbstractC2079k.b bVar = androidx.lifecycle.AbstractC2079k.b.INITIALIZED;
        this.f22839d = bVar;
        this.f22844i = new java.util.ArrayList();
        this.f22840e = new java.lang.ref.WeakReference(rVar);
        this.f22845j = Z8.P.a(bVar);
    }

    private final void e(androidx.lifecycle.r rVar) {
        java.util.Iterator itDescendingIterator = this.f22838c.descendingIterator();
        p247y7.AbstractC7350t.e(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.f22843h) {
            java.util.Map.Entry entry = (java.util.Map.Entry) itDescendingIterator.next();
            p247y7.AbstractC7350t.e(entry, "next()");
            androidx.lifecycle.InterfaceC2085q interfaceC2085q = (androidx.lifecycle.InterfaceC2085q) entry.getKey();
            androidx.lifecycle.C2087t.b bVar = (androidx.lifecycle.C2087t.b) entry.getValue();
            while (bVar.b().compareTo(this.f22839d) > 0 && !this.f22843h && this.f22838c.contains(interfaceC2085q)) {
                androidx.lifecycle.AbstractC2079k.a aVarA = androidx.lifecycle.AbstractC2079k.a.Companion.a(bVar.b());
                if (aVarA == null) {
                    throw new java.lang.IllegalStateException("no event down from " + bVar.b());
                }
                m(aVarA.g());
                bVar.a(rVar, aVarA);
                l();
            }
        }
    }

    private final androidx.lifecycle.AbstractC2079k.b f(androidx.lifecycle.InterfaceC2085q interfaceC2085q) {
        androidx.lifecycle.C2087t.b bVar;
        java.util.Map.Entry entryW = this.f22838c.w(interfaceC2085q);
        androidx.lifecycle.AbstractC2079k.b bVar2 = null;
        androidx.lifecycle.AbstractC2079k.b bVarB = (entryW == null || (bVar = (androidx.lifecycle.C2087t.b) entryW.getValue()) == null) ? null : bVar.b();
        if (!this.f22844i.isEmpty()) {
            java.util.ArrayList arrayList = this.f22844i;
            bVar2 = (androidx.lifecycle.AbstractC2079k.b) arrayList.get(arrayList.size() - 1);
        }
        androidx.lifecycle.C2087t.a aVar = f22836k;
        return aVar.a(aVar.a(this.f22839d, bVarB), bVar2);
    }

    private final void g(java.lang.String str) {
        if (!this.f22837b || androidx.lifecycle.AbstractC2088u.a()) {
            return;
        }
        throw new java.lang.IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void h(androidx.lifecycle.r rVar) {
        o.b.d dVarF = this.f22838c.f();
        p247y7.AbstractC7350t.e(dVarF, "observerMap.iteratorWithAdditions()");
        while (dVarF.hasNext() && !this.f22843h) {
            java.util.Map.Entry entry = (java.util.Map.Entry) dVarF.next();
            androidx.lifecycle.InterfaceC2085q interfaceC2085q = (androidx.lifecycle.InterfaceC2085q) entry.getKey();
            androidx.lifecycle.C2087t.b bVar = (androidx.lifecycle.C2087t.b) entry.getValue();
            while (bVar.b().compareTo(this.f22839d) < 0 && !this.f22843h && this.f22838c.contains(interfaceC2085q)) {
                m(bVar.b());
                androidx.lifecycle.AbstractC2079k.a aVarB = androidx.lifecycle.AbstractC2079k.a.Companion.b(bVar.b());
                if (aVarB == null) {
                    throw new java.lang.IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(rVar, aVarB);
                l();
            }
        }
    }

    private final boolean j() {
        if (this.f22838c.size() == 0) {
            return true;
        }
        java.util.Map.Entry entryD = this.f22838c.d();
        p247y7.AbstractC7350t.c(entryD);
        androidx.lifecycle.AbstractC2079k.b bVarB = ((androidx.lifecycle.C2087t.b) entryD.getValue()).b();
        java.util.Map.Entry entryG = this.f22838c.g();
        p247y7.AbstractC7350t.c(entryG);
        androidx.lifecycle.AbstractC2079k.b bVarB2 = ((androidx.lifecycle.C2087t.b) entryG.getValue()).b();
        return bVarB == bVarB2 && this.f22839d == bVarB2;
    }

    private final void k(androidx.lifecycle.AbstractC2079k.b bVar) {
        androidx.lifecycle.AbstractC2079k.b bVar2 = this.f22839d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == androidx.lifecycle.AbstractC2079k.b.INITIALIZED && bVar == androidx.lifecycle.AbstractC2079k.b.DESTROYED) {
            throw new java.lang.IllegalStateException(("State must be at least CREATED to move to " + bVar + ", but was " + this.f22839d + " in component " + this.f22840e.get()).toString());
        }
        this.f22839d = bVar;
        if (this.f22842g || this.f22841f != 0) {
            this.f22843h = true;
            return;
        }
        this.f22842g = true;
        o();
        this.f22842g = false;
        if (this.f22839d == androidx.lifecycle.AbstractC2079k.b.DESTROYED) {
            this.f22838c = new p140o.a();
        }
    }

    private final void l() {
        java.util.ArrayList arrayList = this.f22844i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void m(androidx.lifecycle.AbstractC2079k.b bVar) {
        this.f22844i.add(bVar);
    }

    private final void o() {
        androidx.lifecycle.r rVar = (androidx.lifecycle.r) this.f22840e.get();
        if (rVar == null) {
            throw new java.lang.IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean zJ = j();
            this.f22843h = false;
            if (zJ) {
                this.f22845j.setValue(b());
                return;
            }
            androidx.lifecycle.AbstractC2079k.b bVar = this.f22839d;
            java.util.Map.Entry entryD = this.f22838c.d();
            p247y7.AbstractC7350t.c(entryD);
            if (bVar.compareTo(((androidx.lifecycle.C2087t.b) entryD.getValue()).b()) < 0) {
                e(rVar);
            }
            java.util.Map.Entry entryG = this.f22838c.g();
            if (!this.f22843h && entryG != null && this.f22839d.compareTo(((androidx.lifecycle.C2087t.b) entryG.getValue()).b()) > 0) {
                h(rVar);
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC2079k
    public void a(androidx.lifecycle.InterfaceC2085q interfaceC2085q) {
        androidx.lifecycle.r rVar;
        p247y7.AbstractC7350t.f(interfaceC2085q, "observer");
        g("addObserver");
        androidx.lifecycle.AbstractC2079k.b bVar = this.f22839d;
        androidx.lifecycle.AbstractC2079k.b bVar2 = androidx.lifecycle.AbstractC2079k.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = androidx.lifecycle.AbstractC2079k.b.INITIALIZED;
        }
        androidx.lifecycle.C2087t.b bVar3 = new androidx.lifecycle.C2087t.b(interfaceC2085q, bVar2);
        if (((androidx.lifecycle.C2087t.b) this.f22838c.o(interfaceC2085q, bVar3)) == null && (rVar = (androidx.lifecycle.r) this.f22840e.get()) != null) {
            boolean z6 = this.f22841f != 0 || this.f22842g;
            androidx.lifecycle.AbstractC2079k.b bVarF = f(interfaceC2085q);
            this.f22841f++;
            while (bVar3.b().compareTo(bVarF) < 0 && this.f22838c.contains(interfaceC2085q)) {
                m(bVar3.b());
                androidx.lifecycle.AbstractC2079k.a aVarB = androidx.lifecycle.AbstractC2079k.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new java.lang.IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(rVar, aVarB);
                l();
                bVarF = f(interfaceC2085q);
            }
            if (!z6) {
                o();
            }
            this.f22841f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC2079k
    public androidx.lifecycle.AbstractC2079k.b b() {
        return this.f22839d;
    }

    @Override // androidx.lifecycle.AbstractC2079k
    public void d(androidx.lifecycle.InterfaceC2085q interfaceC2085q) {
        p247y7.AbstractC7350t.f(interfaceC2085q, "observer");
        g("removeObserver");
        this.f22838c.s(interfaceC2085q);
    }

    public void i(androidx.lifecycle.AbstractC2079k.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "event");
        g("handleLifecycleEvent");
        k(aVar.g());
    }

    public void n(androidx.lifecycle.AbstractC2079k.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "state");
        g("setCurrentState");
        k(bVar);
    }
}
