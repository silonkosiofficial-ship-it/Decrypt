package p239x9;

/* JADX INFO: renamed from: x9.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C7311k0 implements p219v9.f, p239x9.InterfaceC7310k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f57008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p239x9.E f57009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f57010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f57011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String[] f57012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List[] f57013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.util.List f57014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f57015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.util.Map f57016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f57017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f57018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f57019l;

    public C7311k0(java.lang.String str, p239x9.E e6, int i6) {
        p247y7.AbstractC7350t.f(str, "serialName");
        this.f57008a = str;
        this.f57009b = e6;
        this.f57010c = i6;
        this.f57011d = -1;
        java.lang.String[] strArr = new java.lang.String[i6];
        for (int i10 = 0; i10 < i6; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f57012e = strArr;
        int i11 = this.f57010c;
        this.f57013f = new java.util.List[i11];
        this.f57015h = new boolean[i11];
        this.f57016i = p097j7.S.h();
        p087i7.r rVar = p087i7.r.PUBLICATION;
        this.f57017j = p087i7.AbstractC6669o.a(rVar, new p237x7.a() { // from class: x9.h0
            @Override // p237x7.a
            public final java.lang.Object b() {
                return p239x9.C7311k0.u(this.f57002C);
            }
        });
        this.f57018k = p087i7.AbstractC6669o.a(rVar, new p237x7.a() { // from class: x9.i0
            @Override // p237x7.a
            public final java.lang.Object b() {
                return p239x9.C7311k0.z(this.f57004C);
            }
        });
        this.f57019l = p087i7.AbstractC6669o.a(rVar, new p237x7.a() { // from class: x9.j0
            @Override // p237x7.a
            public final java.lang.Object b() {
                return java.lang.Integer.valueOf(p239x9.C7311k0.q(this.f57007C));
            }
        });
    }

    public /* synthetic */ C7311k0(java.lang.String str, p239x9.E e6, int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(str, (i10 & 2) != 0 ? null : e6, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(p239x9.C7311k0 c7311k0) {
        return p239x9.AbstractC7313l0.a(c7311k0, c7311k0.w());
    }

    public static /* synthetic */ void s(p239x9.C7311k0 c7311k0, java.lang.String str, boolean z6, int i6, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        c7311k0.r(str, z6);
    }

    private final java.util.Map t() {
        java.util.HashMap map = new java.util.HashMap();
        int length = this.f57012e.length;
        for (int i6 = 0; i6 < length; i6++) {
            map.put(this.f57012e[i6], java.lang.Integer.valueOf(i6));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p199t9.b[] u(p239x9.C7311k0 c7311k0) {
        p199t9.b[] bVarArrD;
        p239x9.E e6 = c7311k0.f57009b;
        return (e6 == null || (bVarArrD = e6.d()) == null) ? p239x9.AbstractC7315m0.f57023a : bVarArrD;
    }

    private final p199t9.b[] v() {
        return (p199t9.b[]) this.f57017j.getValue();
    }

    private final int x() {
        return ((java.lang.Number) this.f57019l.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence y(p239x9.C7311k0 c7311k0, int i6) {
        return c7311k0.f(i6) + ": " + c7311k0.h(i6).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p219v9.f[] z(p239x9.C7311k0 c7311k0) {
        java.util.ArrayList arrayList;
        p199t9.b[] bVarArrC;
        p239x9.E e6 = c7311k0.f57009b;
        if (e6 == null || (bVarArrC = e6.c()) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(bVarArrC.length);
            for (p199t9.b bVar : bVarArrC) {
                arrayList.add(bVar.a());
            }
        }
        return p239x9.AbstractC7299e0.b(arrayList);
    }

    @Override // p219v9.f
    public java.lang.String a() {
        return this.f57008a;
    }

    @Override // p239x9.InterfaceC7310k
    public java.util.Set b() {
        return this.f57016i.keySet();
    }

    @Override // p219v9.f
    public /* synthetic */ boolean c() {
        return p219v9.e.c(this);
    }

    @Override // p219v9.f
    public int d(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        java.lang.Integer num = (java.lang.Integer) this.f57016i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p219v9.f
    public final int e() {
        return this.f57010c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p239x9.C7311k0) {
            p219v9.f fVar = (p219v9.f) obj;
            if (p247y7.AbstractC7350t.b(a(), fVar.a()) && java.util.Arrays.equals(w(), ((p239x9.C7311k0) obj).w()) && e() == fVar.e()) {
                int iE = e();
                for (int i6 = 0; i6 < iE; i6++) {
                    if (p247y7.AbstractC7350t.b(h(i6).a(), fVar.h(i6).a()) && p247y7.AbstractC7350t.b(h(i6).j(), fVar.h(i6).j())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p219v9.f
    public java.lang.String f(int i6) {
        return this.f57012e[i6];
    }

    @Override // p219v9.f
    public java.util.List g(int i6) {
        java.util.List list = this.f57013f[i6];
        return list == null ? p097j7.AbstractC6879v.m() : list;
    }

    @Override // p219v9.f
    public p219v9.f h(int i6) {
        return v()[i6].a();
    }

    public int hashCode() {
        return x();
    }

    @Override // p219v9.f
    public boolean i(int i6) {
        return this.f57015h[i6];
    }

    @Override // p219v9.f
    public p219v9.m j() {
        return v9.n.a.f56058a;
    }

    @Override // p219v9.f
    public java.util.List k() {
        java.util.List list = this.f57014g;
        return list == null ? p097j7.AbstractC6879v.m() : list;
    }

    @Override // p219v9.f
    public /* synthetic */ boolean m() {
        return p219v9.e.b(this);
    }

    public final void r(java.lang.String str, boolean z6) {
        p247y7.AbstractC7350t.f(str, "name");
        java.lang.String[] strArr = this.f57012e;
        int i6 = this.f57011d + 1;
        this.f57011d = i6;
        strArr[i6] = str;
        this.f57015h[i6] = z6;
        this.f57013f[i6] = null;
        if (i6 == this.f57010c - 1) {
            this.f57016i = t();
        }
    }

    public java.lang.String toString() {
        return p097j7.AbstractC6879v.r0(E7.j.q(0, this.f57010c), ", ", a() + '(', ")", 0, null, new p237x7.l() { // from class: x9.g0
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return p239x9.C7311k0.y(this.f56999C, ((java.lang.Integer) obj).intValue());
            }
        }, 24, null);
    }

    public final p219v9.f[] w() {
        return (p219v9.f[]) this.f57018k.getValue();
    }
}
