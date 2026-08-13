package T6;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final T6.g0.a f13109t = new T6.g0.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f13110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T6.G f13112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f13113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f13114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f13115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f13116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f13117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.List f13118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.List f13119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f13120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final T6.U f13121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final T6.U f13122m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f13123n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f13124o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f13125p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f13126q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f13127r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f13128s;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public g0(T6.U u6, java.lang.String str, int i6, final java.util.List list, T6.G g6, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z6, java.lang.String str5) {
        p247y7.AbstractC7350t.f(str, "host");
        p247y7.AbstractC7350t.f(list, "pathSegments");
        p247y7.AbstractC7350t.f(g6, "parameters");
        p247y7.AbstractC7350t.f(str2, "fragment");
        p247y7.AbstractC7350t.f(str5, "urlString");
        this.f13110a = str;
        this.f13111b = i6;
        this.f13112c = g6;
        this.f13113d = str2;
        this.f13114e = str3;
        this.f13115f = str4;
        this.f13116g = z6;
        this.f13117h = str5;
        if (i6 < 0 || i6 >= 65536) {
            throw new java.lang.IllegalArgumentException(("Port must be between 0 and 65535, or 0 if not set. Provided: " + i6).toString());
        }
        this.f13118i = list;
        this.f13119j = list;
        this.f13120k = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: T6.Z
            @Override // p237x7.a
            public final java.lang.Object b() {
                return T6.g0.u(list);
            }
        });
        this.f13121l = u6;
        this.f13122m = u6 == null ? T6.U.f13073c.c() : u6;
        this.f13123n = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: T6.a0
            @Override // p237x7.a
            public final java.lang.Object b() {
                return T6.g0.k(list, this);
            }
        });
        this.f13124o = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: T6.b0
            @Override // p237x7.a
            public final java.lang.Object b() {
                return T6.g0.l(this.f13087C);
            }
        });
        this.f13125p = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: T6.c0
            @Override // p237x7.a
            public final java.lang.Object b() {
                return T6.g0.j(this.f13091C);
            }
        });
        this.f13126q = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: T6.d0
            @Override // p237x7.a
            public final java.lang.Object b() {
                return T6.g0.m(this.f13093C);
            }
        });
        this.f13127r = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: T6.e0
            @Override // p237x7.a
            public final java.lang.Object b() {
                return T6.g0.i(this.f13095C);
            }
        });
        this.f13128s = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: T6.f0
            @Override // p237x7.a
            public final java.lang.Object b() {
                return T6.g0.h(this.f13103C);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String h(T6.g0 g0Var) {
        int iO0 = S8.r.o0(g0Var.f13117h, '#', 0, false, 6, null) + 1;
        if (iO0 == 0) {
            return "";
        }
        java.lang.String strSubstring = g0Var.f13117h.substring(iO0);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String i(T6.g0 g0Var) {
        java.lang.String str = g0Var.f13115f;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        java.lang.String strSubstring = g0Var.f13117h.substring(S8.r.o0(g0Var.f13117h, ':', g0Var.f13122m.d().length() + 3, false, 4, null) + 1, S8.r.o0(g0Var.f13117h, '@', 0, false, 6, null));
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String j(T6.g0 g0Var) {
        int iO0 = S8.r.o0(g0Var.f13117h, '/', g0Var.f13122m.d().length() + 3, false, 4, null);
        if (iO0 == -1) {
            return "";
        }
        int iO1 = S8.r.o0(g0Var.f13117h, '#', iO0, false, 4, null);
        java.lang.String str = g0Var.f13117h;
        java.lang.String strSubstring = iO1 == -1 ? str.substring(iO0) : str.substring(iO0, iO1);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String k(java.util.List list, T6.g0 g0Var) {
        int iO0;
        if (list.isEmpty() || (iO0 = S8.r.o0(g0Var.f13117h, '/', g0Var.f13122m.d().length() + 3, false, 4, null)) == -1) {
            return "";
        }
        int iR0 = S8.r.r0(g0Var.f13117h, new char[]{'?', '#'}, iO0, false, 4, null);
        java.lang.String str = g0Var.f13117h;
        java.lang.String strSubstring = iR0 == -1 ? str.substring(iO0) : str.substring(iO0, iR0);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String l(T6.g0 g0Var) {
        int iO0 = S8.r.o0(g0Var.f13117h, '?', 0, false, 6, null) + 1;
        if (iO0 == 0) {
            return "";
        }
        int iO1 = S8.r.o0(g0Var.f13117h, '#', iO0, false, 4, null);
        java.lang.String str = g0Var.f13117h;
        java.lang.String strSubstring = iO1 == -1 ? str.substring(iO0) : str.substring(iO0, iO1);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String m(T6.g0 g0Var) {
        java.lang.String str = g0Var.f13114e;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        int length = g0Var.f13122m.d().length() + 3;
        java.lang.String strSubstring = g0Var.f13117h.substring(length, S8.r.r0(g0Var.f13117h, new char[]{':', '@'}, length, false, 4, null));
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List u(java.util.List list) {
        if (list.isEmpty()) {
            return p097j7.AbstractC6879v.m();
        }
        return list.subList((((java.lang.CharSequence) p097j7.AbstractC6879v.i0(list)).length() != 0 || list.size() <= 1) ? 0 : 1, ((java.lang.CharSequence) p097j7.AbstractC6879v.t0(list)).length() == 0 ? p097j7.AbstractC6879v.o(list) : 1 + p097j7.AbstractC6879v.o(list));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T6.g0.class != obj.getClass()) {
            return false;
        }
        return p247y7.AbstractC7350t.b(this.f13117h, ((T6.g0) obj).f13117h);
    }

    public int hashCode() {
        return this.f13117h.hashCode();
    }

    public final java.lang.String n() {
        return (java.lang.String) this.f13127r.getValue();
    }

    public final java.lang.String o() {
        return (java.lang.String) this.f13126q.getValue();
    }

    public final java.lang.String p() {
        return this.f13110a;
    }

    public final int q() {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.f13111b);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.f13122m.c();
    }

    public final T6.U r() {
        return this.f13122m;
    }

    public final T6.U s() {
        return this.f13121l;
    }

    public final int t() {
        return this.f13111b;
    }

    public java.lang.String toString() {
        return this.f13117h;
    }
}
