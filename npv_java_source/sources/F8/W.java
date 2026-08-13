package F8;

/* JADX INFO: loaded from: classes2.dex */
public final class W {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final F8.W.a f2864e = new F8.W.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F8.W f2865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O7.e0 f2866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f2867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f2868d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final F8.W a(F8.W w6, O7.e0 e0Var, java.util.List list) {
            p247y7.AbstractC7350t.f(e0Var, "typeAliasDescriptor");
            p247y7.AbstractC7350t.f(list, "arguments");
            java.util.List listX = e0Var.p().x();
            p247y7.AbstractC7350t.e(listX, "getParameters(...)");
            java.util.List list2 = listX;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((O7.f0) it.next()).a());
            }
            return new F8.W(w6, e0Var, list, p097j7.S.q(p097j7.AbstractC6879v.c1(arrayList, list)), null);
        }
    }

    private W(F8.W w6, O7.e0 e0Var, java.util.List list, java.util.Map map) {
        this.f2865a = w6;
        this.f2866b = e0Var;
        this.f2867c = list;
        this.f2868d = map;
    }

    public /* synthetic */ W(F8.W w6, O7.e0 e0Var, java.util.List list, java.util.Map map, p247y7.AbstractC7342k abstractC7342k) {
        this(w6, e0Var, list, map);
    }

    public final java.util.List a() {
        return this.f2867c;
    }

    public final O7.e0 b() {
        return this.f2866b;
    }

    public final F8.i0 c(F8.e0 e0Var) {
        p247y7.AbstractC7350t.f(e0Var, "constructor");
        O7.InterfaceC1427h interfaceC1427hW = e0Var.w();
        if (interfaceC1427hW instanceof O7.f0) {
            return (F8.i0) this.f2868d.get(interfaceC1427hW);
        }
        return null;
    }

    public final boolean d(O7.e0 e0Var) {
        p247y7.AbstractC7350t.f(e0Var, "descriptor");
        if (!p247y7.AbstractC7350t.b(this.f2866b, e0Var)) {
            F8.W w6 = this.f2865a;
            if (!(w6 != null ? w6.d(e0Var) : false)) {
                return false;
            }
        }
        return true;
    }
}
