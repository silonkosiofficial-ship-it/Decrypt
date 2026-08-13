package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
final class q extends androidx.lifecycle.T {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final androidx.lifecycle.V.c f22644i = new androidx.fragment.app.q.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f22648e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.HashMap f22645b = new java.util.HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.HashMap f22646c = new java.util.HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.HashMap f22647d = new java.util.HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22649f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22650g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22651h = false;

    class a implements androidx.lifecycle.V.c {
        a() {
        }

        @Override // androidx.lifecycle.V.c
        public androidx.lifecycle.T a(java.lang.Class cls) {
            return new androidx.fragment.app.q(true);
        }

        @Override // androidx.lifecycle.V.c
        public /* synthetic */ androidx.lifecycle.T b(F7.c cVar, p023c2.a aVar) {
            return androidx.lifecycle.W.a(this, cVar, aVar);
        }

        @Override // androidx.lifecycle.V.c
        public /* synthetic */ androidx.lifecycle.T c(java.lang.Class cls, p023c2.a aVar) {
            return androidx.lifecycle.W.c(this, cls, aVar);
        }
    }

    q(boolean z6) {
        this.f22648e = z6;
    }

    private void k(java.lang.String str) {
        androidx.fragment.app.q qVar = (androidx.fragment.app.q) this.f22646c.get(str);
        if (qVar != null) {
            qVar.g();
            this.f22646c.remove(str);
        }
        androidx.lifecycle.X x6 = (androidx.lifecycle.X) this.f22647d.get(str);
        if (x6 != null) {
            x6.a();
            this.f22647d.remove(str);
        }
    }

    static androidx.fragment.app.q n(androidx.lifecycle.X x6) {
        return (androidx.fragment.app.q) new androidx.lifecycle.V(x6, f22644i).b(androidx.fragment.app.q.class);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.fragment.app.q.class != obj.getClass()) {
            return false;
        }
        androidx.fragment.app.q qVar = (androidx.fragment.app.q) obj;
        return this.f22645b.equals(qVar.f22645b) && this.f22646c.equals(qVar.f22646c) && this.f22647d.equals(qVar.f22647d);
    }

    @Override // androidx.lifecycle.T
    protected void g() {
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "onCleared called for " + this;
        }
        this.f22649f = true;
    }

    void h(androidx.fragment.app.f fVar) {
        if (this.f22651h) {
            if (androidx.fragment.app.n.E0(2)) {
            }
        } else {
            if (this.f22645b.containsKey(fVar.f22478H)) {
                return;
            }
            this.f22645b.put(fVar.f22478H, fVar);
            if (androidx.fragment.app.n.E0(2)) {
                java.lang.String str = "Updating retained Fragments: Added " + fVar;
            }
        }
    }

    public int hashCode() {
        return (((this.f22645b.hashCode() * 31) + this.f22646c.hashCode()) * 31) + this.f22647d.hashCode();
    }

    void i(androidx.fragment.app.f fVar) {
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str = "Clearing non-config state for " + fVar;
        }
        k(fVar.f22478H);
    }

    void j(java.lang.String str) {
        if (androidx.fragment.app.n.E0(3)) {
            java.lang.String str2 = "Clearing non-config state for saved state of Fragment " + str;
        }
        k(str);
    }

    androidx.fragment.app.f l(java.lang.String str) {
        return (androidx.fragment.app.f) this.f22645b.get(str);
    }

    androidx.fragment.app.q m(androidx.fragment.app.f fVar) {
        androidx.fragment.app.q qVar = (androidx.fragment.app.q) this.f22646c.get(fVar.f22478H);
        if (qVar != null) {
            return qVar;
        }
        androidx.fragment.app.q qVar2 = new androidx.fragment.app.q(this.f22648e);
        this.f22646c.put(fVar.f22478H, qVar2);
        return qVar2;
    }

    java.util.Collection o() {
        return new java.util.ArrayList(this.f22645b.values());
    }

    androidx.lifecycle.X p(androidx.fragment.app.f fVar) {
        androidx.lifecycle.X x6 = (androidx.lifecycle.X) this.f22647d.get(fVar.f22478H);
        if (x6 != null) {
            return x6;
        }
        androidx.lifecycle.X x10 = new androidx.lifecycle.X();
        this.f22647d.put(fVar.f22478H, x10);
        return x10;
    }

    boolean q() {
        return this.f22649f;
    }

    void r(androidx.fragment.app.f fVar) {
        if (this.f22651h) {
            if (androidx.fragment.app.n.E0(2)) {
            }
        } else {
            if (this.f22645b.remove(fVar.f22478H) == null || !androidx.fragment.app.n.E0(2)) {
                return;
            }
            java.lang.String str = "Updating retained Fragments: Removed " + fVar;
        }
    }

    void s(boolean z6) {
        this.f22651h = z6;
    }

    boolean t(androidx.fragment.app.f fVar) {
        if (this.f22645b.containsKey(fVar.f22478H)) {
            return this.f22648e ? this.f22649f : !this.f22650g;
        }
        return true;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FragmentManagerViewModel{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("} Fragments (");
        java.util.Iterator it = this.f22645b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        java.util.Iterator it2 = this.f22646c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((java.lang.String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        java.util.Iterator it3 = this.f22647d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((java.lang.String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
