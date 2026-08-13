package T6;

/* JADX INFO: loaded from: classes3.dex */
public final class M {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final T6.M.a f13059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final T6.g0 f13060l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f13061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T6.U f13064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f13065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.String f13066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.String f13067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.util.List f13068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private T6.H f13069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private T6.H f13070j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static {
        T6.M.a aVar = new T6.M.a(null);
        f13059k = aVar;
        f13060l = T6.X.c(T6.N.a(aVar));
    }

    public M(T6.U u6, java.lang.String str, int i6, java.lang.String str2, java.lang.String str3, java.util.List list, T6.G g6, java.lang.String str4, boolean z6) {
        p247y7.AbstractC7350t.f(str, "host");
        p247y7.AbstractC7350t.f(list, "pathSegments");
        p247y7.AbstractC7350t.f(g6, "parameters");
        p247y7.AbstractC7350t.f(str4, "fragment");
        this.f13061a = str;
        this.f13062b = z6;
        this.f13063c = i6;
        this.f13064d = u6;
        this.f13065e = str2 != null ? T6.AbstractC1658f.m(str2, false, 1, null) : null;
        this.f13066f = str3 != null ? T6.AbstractC1658f.m(str3, false, 1, null) : null;
        this.f13067g = T6.AbstractC1658f.u(str4, false, false, null, 7, null);
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(T6.AbstractC1658f.s((java.lang.String) it.next()));
        }
        this.f13068h = arrayList;
        T6.H hD = T6.i0.d(g6);
        this.f13069i = hD;
        this.f13070j = new T6.h0(hD);
    }

    public /* synthetic */ M(T6.U u6, java.lang.String str, int i6, java.lang.String str2, java.lang.String str3, java.util.List list, T6.G g6, java.lang.String str4, boolean z6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? null : u6, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? 0 : i6, (i10 & 8) != 0 ? null : str2, (i10 & 16) == 0 ? str3 : null, (i10 & 32) != 0 ? p097j7.AbstractC6879v.m() : list, (i10 & 64) != 0 ? T6.G.f13056b.a() : g6, (i10 & 128) == 0 ? str4 : "", (i10 & 256) == 0 ? z6 : false);
    }

    private final void a() {
        if (this.f13061a.length() <= 0 && !p247y7.AbstractC7350t.b(o().d(), "file")) {
            T6.g0 g0Var = f13060l;
            this.f13061a = g0Var.p();
            if (this.f13064d == null) {
                this.f13064d = g0Var.s();
            }
            if (this.f13063c == 0) {
                y(g0Var.t());
            }
        }
    }

    public final void A(T6.U u6) {
        this.f13064d = u6;
    }

    public final void B(boolean z6) {
        this.f13062b = z6;
    }

    public final void C(java.lang.String str) {
        this.f13065e = str != null ? T6.AbstractC1658f.m(str, false, 1, null) : null;
    }

    public final T6.g0 b() {
        a();
        return new T6.g0(this.f13064d, this.f13061a, this.f13063c, m(), this.f13070j.i(), i(), r(), l(), this.f13062b, c());
    }

    public final java.lang.String c() {
        a();
        java.lang.String string = ((java.lang.StringBuilder) T6.O.e(this, new java.lang.StringBuilder(256))).toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public final java.lang.String d() {
        return this.f13067g;
    }

    public final T6.H e() {
        return this.f13069i;
    }

    public final java.lang.String f() {
        return this.f13066f;
    }

    public final java.util.List g() {
        return this.f13068h;
    }

    public final java.lang.String h() {
        return this.f13065e;
    }

    public final java.lang.String i() {
        return T6.AbstractC1658f.k(this.f13067g, 0, 0, false, null, 15, null);
    }

    public final java.lang.String j() {
        return this.f13061a;
    }

    public final T6.H k() {
        return this.f13070j;
    }

    public final java.lang.String l() {
        java.lang.String str = this.f13066f;
        if (str != null) {
            return T6.AbstractC1658f.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final java.util.List m() {
        java.util.List list = this.f13068h;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(T6.AbstractC1658f.i((java.lang.String) it.next(), 0, 0, null, 7, null));
        }
        return arrayList;
    }

    public final int n() {
        return this.f13063c;
    }

    public final T6.U o() {
        T6.U u6 = this.f13064d;
        return u6 == null ? T6.U.f13073c.c() : u6;
    }

    public final T6.U p() {
        return this.f13064d;
    }

    public final boolean q() {
        return this.f13062b;
    }

    public final java.lang.String r() {
        java.lang.String str = this.f13065e;
        if (str != null) {
            return T6.AbstractC1658f.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void s(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<set-?>");
        this.f13067g = str;
    }

    public final void t(T6.H h6) {
        p247y7.AbstractC7350t.f(h6, "value");
        this.f13069i = h6;
        this.f13070j = new T6.h0(h6);
    }

    public java.lang.String toString() {
        java.lang.String string = ((java.lang.StringBuilder) T6.O.e(this, new java.lang.StringBuilder(256))).toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public final void u(java.lang.String str) {
        this.f13066f = str;
    }

    public final void v(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<set-?>");
        this.f13068h = list;
    }

    public final void w(java.lang.String str) {
        this.f13065e = str;
    }

    public final void x(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<set-?>");
        this.f13061a = str;
    }

    public final void y(int i6) {
        if (i6 >= 0 && i6 < 65536) {
            this.f13063c = i6;
            return;
        }
        throw new java.lang.IllegalArgumentException(("Port must be between 0 and 65535, or 0 if not set. Provided: " + i6).toString());
    }

    public final void z(T6.U u6) {
        p247y7.AbstractC7350t.f(u6, "value");
        this.f13064d = u6;
    }
}
