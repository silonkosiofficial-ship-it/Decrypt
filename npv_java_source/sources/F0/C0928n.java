package F0;

/* JADX INFO: renamed from: F0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0928n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f2683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f2684b = p087i7.AbstractC6669o.a(p087i7.r.NONE, F0.C0928n.b.f2687D);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Comparator f2685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F0.G0 f2686d;

    /* JADX INFO: renamed from: F0.n$a */
    public static final class a implements java.util.Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(F0.J j6, F0.J j10) {
            int iG = p247y7.AbstractC7350t.g(j6.L(), j10.L());
            return iG != 0 ? iG : p247y7.AbstractC7350t.g(j6.hashCode(), j10.hashCode());
        }
    }

    /* JADX INFO: renamed from: F0.n$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final F0.C0928n.b f2687D = new F0.C0928n.b();

        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Map b() {
            return new java.util.LinkedHashMap();
        }
    }

    public C0928n(boolean z6) {
        this.f2683a = z6;
        F0.C0928n.a aVar = new F0.C0928n.a();
        this.f2685c = aVar;
        this.f2686d = new F0.G0(aVar);
    }

    private final java.util.Map c() {
        return (java.util.Map) this.f2684b.getValue();
    }

    public final void a(F0.J j6) {
        if (!j6.K0()) {
            C0.a.b("DepthSortedSet.add called on an unattached node");
        }
        if (this.f2683a) {
            java.lang.Integer num = (java.lang.Integer) c().get(j6);
            if (num == null) {
                c().put(j6, java.lang.Integer.valueOf(j6.L()));
            } else {
                if (!(num.intValue() == j6.L())) {
                    C0.a.b("invalid node depth");
                }
            }
        }
        this.f2686d.add(j6);
    }

    public final boolean b(F0.J j6) {
        boolean zContains = this.f2686d.contains(j6);
        if (this.f2683a) {
            if (!(zContains == c().containsKey(j6))) {
                C0.a.b("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public final boolean d() {
        return this.f2686d.isEmpty();
    }

    public final F0.J e() {
        F0.J j6 = (F0.J) this.f2686d.first();
        f(j6);
        return j6;
    }

    public final boolean f(F0.J j6) {
        if (!j6.K0()) {
            C0.a.b("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.f2686d.remove(j6);
        if (this.f2683a) {
            if (!p247y7.AbstractC7350t.b((java.lang.Integer) c().remove(j6), zRemove ? java.lang.Integer.valueOf(j6.L()) : null)) {
                C0.a.b("invalid node depth");
            }
        }
        return zRemove;
    }

    public java.lang.String toString() {
        return this.f2686d.toString();
    }
}
