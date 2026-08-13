package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f0 extends F8.l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F8.f0.a f2923c = new F8.f0.a(null);

    public static final class a {

        /* JADX INFO: renamed from: F8.f0$a$a, reason: collision with other inner class name */
        public static final class C0069a extends F8.f0 {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ java.util.Map f2924d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f2925e;

            C0069a(java.util.Map map, boolean z6) {
                this.f2924d = map;
                this.f2925e = z6;
            }

            @Override // F8.l0
            public boolean a() {
                return this.f2925e;
            }

            @Override // F8.l0
            public boolean f() {
                return this.f2924d.isEmpty();
            }

            @Override // F8.f0
            public F8.i0 k(F8.e0 e0Var) {
                p247y7.AbstractC7350t.f(e0Var, "key");
                return (F8.i0) this.f2924d.get(e0Var);
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public static /* synthetic */ F8.f0 e(F8.f0.a aVar, java.util.Map map, boolean z6, int i6, java.lang.Object obj) {
            if ((i6 & 2) != 0) {
                z6 = false;
            }
            return aVar.d(map, z6);
        }

        public final F8.l0 a(F8.E e6) {
            p247y7.AbstractC7350t.f(e6, "kotlinType");
            return b(e6.W0(), e6.U0());
        }

        public final F8.l0 b(F8.e0 e0Var, java.util.List list) {
            p247y7.AbstractC7350t.f(e0Var, "typeConstructor");
            p247y7.AbstractC7350t.f(list, "arguments");
            java.util.List listX = e0Var.x();
            p247y7.AbstractC7350t.e(listX, "getParameters(...)");
            O7.f0 f0Var = (O7.f0) p097j7.AbstractC6879v.v0(listX);
            if (f0Var == null || !f0Var.x0()) {
                return new F8.C(listX, list);
            }
            java.util.List listX2 = e0Var.x();
            p247y7.AbstractC7350t.e(listX2, "getParameters(...)");
            java.util.List list2 = listX2;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((O7.f0) it.next()).p());
            }
            return e(this, p097j7.S.q(p097j7.AbstractC6879v.c1(arrayList, list)), false, 2, null);
        }

        public final F8.f0 c(java.util.Map map) {
            p247y7.AbstractC7350t.f(map, "map");
            return e(this, map, false, 2, null);
        }

        public final F8.f0 d(java.util.Map map, boolean z6) {
            p247y7.AbstractC7350t.f(map, "map");
            return new F8.f0.a.C0069a(map, z6);
        }
    }

    public static final F8.l0 i(F8.e0 e0Var, java.util.List list) {
        return f2923c.b(e0Var, list);
    }

    public static final F8.f0 j(java.util.Map map) {
        return f2923c.c(map);
    }

    @Override // F8.l0
    public F8.i0 e(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "key");
        return k(e6.W0());
    }

    public abstract F8.i0 k(F8.e0 e0Var);
}
