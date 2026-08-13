package p198t8;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements F8.e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t8.n.a f54639f = new t8.n.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f54640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O7.G f54641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Set f54642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F8.M f54643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f54644e;

    public static final class a {

        /* JADX INFO: renamed from: t8.n$a$a, reason: collision with other inner class name */
        private enum EnumC0713a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE;


            /* JADX INFO: renamed from: F, reason: collision with root package name */
            private static final /* synthetic */ p157p7.a f54648F = p157p7.b.a(e());
        }

        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f54649a;

            static {
                int[] iArr = new int[t8.n.a.EnumC0713a.values().length];
                try {
                    iArr[t8.n.a.EnumC0713a.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[t8.n.a.EnumC0713a.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                f54649a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final F8.M a(java.util.Collection collection, t8.n.a.EnumC0713a enumC0713a) {
            if (collection.isEmpty()) {
                return null;
            }
            java.util.Iterator it = collection.iterator();
            if (!it.hasNext()) {
                throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
            }
            java.lang.Object next = it.next();
            while (it.hasNext()) {
                F8.M m6 = (F8.M) it.next();
                next = p198t8.n.f54639f.c((F8.M) next, m6, enumC0713a);
            }
            return (F8.M) next;
        }

        private final F8.M c(F8.M m6, F8.M m10, t8.n.a.EnumC0713a enumC0713a) {
            if (m6 == null || m10 == null) {
                return null;
            }
            F8.e0 e0VarW0 = m6.W0();
            F8.e0 e0VarW1 = m10.W0();
            boolean z6 = e0VarW0 instanceof p198t8.n;
            if (z6 && (e0VarW1 instanceof p198t8.n)) {
                return e((p198t8.n) e0VarW0, (p198t8.n) e0VarW1, enumC0713a);
            }
            if (z6) {
                return d((p198t8.n) e0VarW0, m10);
            }
            if (e0VarW1 instanceof p198t8.n) {
                return d((p198t8.n) e0VarW1, m6);
            }
            return null;
        }

        private final F8.M d(p198t8.n nVar, F8.M m6) {
            if (nVar.f().contains(m6)) {
                return m6;
            }
            return null;
        }

        private final F8.M e(p198t8.n nVar, p198t8.n nVar2, t8.n.a.EnumC0713a enumC0713a) {
            java.util.Set setN0;
            int i6 = t8.n.a.b.f54649a[enumC0713a.ordinal()];
            if (i6 == 1) {
                setN0 = p097j7.AbstractC6879v.n0(nVar.f(), nVar2.f());
            } else {
                if (i6 != 2) {
                    throw new p087i7.s();
                }
                setN0 = p097j7.AbstractC6879v.Z0(nVar.f(), nVar2.f());
            }
            return F8.F.e(F8.a0.f2872D.i(), new p198t8.n(nVar.f54640a, nVar.f54641b, setN0, null), false);
        }

        public final F8.M b(java.util.Collection collection) {
            p247y7.AbstractC7350t.f(collection, "types");
            return a(collection, t8.n.a.EnumC0713a.INTERSECTION_TYPE);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            F8.M mW = p198t8.n.this.t().x().w();
            p247y7.AbstractC7350t.e(mW, "getDefaultType(...)");
            java.util.List listS = p097j7.AbstractC6879v.s(F8.m0.f(mW, p097j7.AbstractC6879v.e(new F8.k0(F8.u0.IN_VARIANCE, p198t8.n.this.f54643d)), null, 2, null));
            if (!p198t8.n.this.h()) {
                listS.add(p198t8.n.this.t().L());
            }
            return listS;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final t8.n.c f54651D = new t8.n.c();

        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(F8.E e6) {
            p247y7.AbstractC7350t.f(e6, "it");
            return e6.toString();
        }
    }

    private n(long j6, O7.G g6, java.util.Set set) {
        this.f54643d = F8.F.e(F8.a0.f2872D.i(), this, false);
        this.f54644e = p087i7.AbstractC6669o.b(new t8.n.b());
        this.f54640a = j6;
        this.f54641b = g6;
        this.f54642c = set;
    }

    public /* synthetic */ n(long j6, O7.G g6, java.util.Set set, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, g6, set);
    }

    private final java.util.List g() {
        return (java.util.List) this.f54644e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h() {
        java.util.Collection collectionA = p198t8.s.a(this.f54641b);
        if ((collectionA instanceof java.util.Collection) && collectionA.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            if (!(!this.f54642c.contains((F8.E) it.next()))) {
                return false;
            }
        }
        return true;
    }

    private final java.lang.String i() {
        return '[' + p097j7.AbstractC6879v.r0(this.f54642c, ",", null, null, 0, null, t8.n.c.f54651D, 30, null) + ']';
    }

    public final java.util.Set f() {
        return this.f54642c;
    }

    @Override // F8.e0
    public L7.g t() {
        return this.f54641b.t();
    }

    public java.lang.String toString() {
        return "IntegerLiteralType" + i();
    }

    @Override // F8.e0
    public java.util.Collection u() {
        return g();
    }

    @Override // F8.e0
    public F8.e0 v(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // F8.e0
    public O7.InterfaceC1427h w() {
        return null;
    }

    @Override // F8.e0
    public java.util.List x() {
        return p097j7.AbstractC6879v.m();
    }

    @Override // F8.e0
    public boolean y() {
        return false;
    }
}
