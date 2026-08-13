package T6;

/* JADX INFO: renamed from: T6.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1659g extends T6.AbstractC1666n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final T6.C1659g.a f13104d = new T6.C1659g.a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final T6.C1659g f13105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final T6.C1659g f13106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final T6.C1659g f13107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final T6.C1659g f13108h;

    /* JADX INFO: renamed from: T6.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final T6.C1659g a(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "value");
            T6.AbstractC1666n.a aVar = T6.AbstractC1666n.f13185c;
            T6.C1664l c1664l = (T6.C1664l) p097j7.AbstractC6879v.t0(T6.AbstractC1672u.d(str));
            return new T6.C1659g(c1664l.b(), c1664l.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i6 = 2;
        f13105e = new T6.C1659g("file", 0 == true ? 1 : 0, i6, 0 == true ? 1 : 0);
        f13106f = new T6.C1659g("mixed", 0 == true ? 1 : 0, i6, 0 == true ? 1 : 0);
        f13107g = new T6.C1659g("attachment", 0 == true ? 1 : 0, i6, 0 == true ? 1 : 0);
        f13108h = new T6.C1659g("inline", 0 == true ? 1 : 0, i6, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1659g(java.lang.String str, java.util.List list) {
        super(str, list);
        p247y7.AbstractC7350t.f(str, "disposition");
        p247y7.AbstractC7350t.f(list, "parameters");
    }

    public /* synthetic */ C1659g(java.lang.String str, java.util.List list, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(str, (i6 & 2) != 0 ? p097j7.AbstractC6879v.m() : list);
    }

    public final java.lang.String d() {
        return a();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof T6.C1659g) {
            T6.C1659g c1659g = (T6.C1659g) obj;
            if (p247y7.AbstractC7350t.b(d(), c1659g.d()) && p247y7.AbstractC7350t.b(b(), c1659g.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (d().hashCode() * 31) + b().hashCode();
    }
}
