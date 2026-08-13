package p046e5;

/* JADX INFO: renamed from: e5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6530c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f44692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Set f44693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Set f44694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f44695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f44696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p046e5.h f44697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.Set f44698g;

    /* JADX INFO: renamed from: e5.c$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f44699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.Set f44700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.util.Set f44701c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f44702d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f44703e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private p046e5.h f44704f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final java.util.Set f44705g;

        private b(p046e5.F f6, p046e5.F... fArr) {
            this.f44699a = null;
            java.util.HashSet hashSet = new java.util.HashSet();
            this.f44700b = hashSet;
            this.f44701c = new java.util.HashSet();
            this.f44702d = 0;
            this.f44703e = 0;
            this.f44705g = new java.util.HashSet();
            p046e5.E.c(f6, "Null interface");
            hashSet.add(f6);
            for (p046e5.F f10 : fArr) {
                p046e5.E.c(f10, "Null interface");
            }
            java.util.Collections.addAll(this.f44700b, fArr);
        }

        private b(java.lang.Class cls, java.lang.Class... clsArr) {
            this.f44699a = null;
            java.util.HashSet hashSet = new java.util.HashSet();
            this.f44700b = hashSet;
            this.f44701c = new java.util.HashSet();
            this.f44702d = 0;
            this.f44703e = 0;
            this.f44705g = new java.util.HashSet();
            p046e5.E.c(cls, "Null interface");
            hashSet.add(p046e5.F.b(cls));
            for (java.lang.Class cls2 : clsArr) {
                p046e5.E.c(cls2, "Null interface");
                this.f44700b.add(p046e5.F.b(cls2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public p046e5.C6530c.b g() {
            this.f44703e = 1;
            return this;
        }

        private p046e5.C6530c.b i(int i6) {
            p046e5.E.d(this.f44702d == 0, "Instantiation type has already been set.");
            this.f44702d = i6;
            return this;
        }

        private void j(p046e5.F f6) {
            p046e5.E.a(!this.f44700b.contains(f6), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public p046e5.C6530c.b b(p046e5.r rVar) {
            p046e5.E.c(rVar, "Null dependency");
            j(rVar.c());
            this.f44701c.add(rVar);
            return this;
        }

        public p046e5.C6530c.b c() {
            return i(1);
        }

        public p046e5.C6530c d() {
            p046e5.E.d(this.f44704f != null, "Missing required property: factory.");
            return new p046e5.C6530c(this.f44699a, new java.util.HashSet(this.f44700b), new java.util.HashSet(this.f44701c), this.f44702d, this.f44703e, this.f44704f, this.f44705g);
        }

        public p046e5.C6530c.b e() {
            return i(2);
        }

        public p046e5.C6530c.b f(p046e5.h hVar) {
            this.f44704f = (p046e5.h) p046e5.E.c(hVar, "Null factory");
            return this;
        }

        public p046e5.C6530c.b h(java.lang.String str) {
            this.f44699a = str;
            return this;
        }
    }

    private C6530c(java.lang.String str, java.util.Set set, java.util.Set set2, int i6, int i10, p046e5.h hVar, java.util.Set set3) {
        this.f44692a = str;
        this.f44693b = j$.util.DesugarCollections.unmodifiableSet(set);
        this.f44694c = j$.util.DesugarCollections.unmodifiableSet(set2);
        this.f44695d = i6;
        this.f44696e = i10;
        this.f44697f = hVar;
        this.f44698g = j$.util.DesugarCollections.unmodifiableSet(set3);
    }

    public static p046e5.C6530c.b c(p046e5.F f6) {
        return new p046e5.C6530c.b(f6, new p046e5.F[0]);
    }

    public static p046e5.C6530c.b d(p046e5.F f6, p046e5.F... fArr) {
        return new p046e5.C6530c.b(f6, fArr);
    }

    public static p046e5.C6530c.b e(java.lang.Class cls) {
        return new p046e5.C6530c.b(cls, new java.lang.Class[0]);
    }

    public static p046e5.C6530c.b f(java.lang.Class cls, java.lang.Class... clsArr) {
        return new p046e5.C6530c.b(cls, clsArr);
    }

    public static p046e5.C6530c l(final java.lang.Object obj, java.lang.Class cls) {
        return m(cls).f(new p046e5.h() { // from class: e5.a
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return p046e5.C6530c.q(obj, interfaceC6532e);
            }
        }).d();
    }

    public static p046e5.C6530c.b m(java.lang.Class cls) {
        return e(cls).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object q(java.lang.Object obj, p046e5.InterfaceC6532e interfaceC6532e) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object r(java.lang.Object obj, p046e5.InterfaceC6532e interfaceC6532e) {
        return obj;
    }

    public static p046e5.C6530c s(final java.lang.Object obj, java.lang.Class cls, java.lang.Class... clsArr) {
        return f(cls, clsArr).f(new p046e5.h() { // from class: e5.b
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return p046e5.C6530c.r(obj, interfaceC6532e);
            }
        }).d();
    }

    public java.util.Set g() {
        return this.f44694c;
    }

    public p046e5.h h() {
        return this.f44697f;
    }

    public java.lang.String i() {
        return this.f44692a;
    }

    public java.util.Set j() {
        return this.f44693b;
    }

    public java.util.Set k() {
        return this.f44698g;
    }

    public boolean n() {
        return this.f44695d == 1;
    }

    public boolean o() {
        return this.f44695d == 2;
    }

    public boolean p() {
        return this.f44696e == 0;
    }

    public p046e5.C6530c t(p046e5.h hVar) {
        return new p046e5.C6530c(this.f44692a, this.f44693b, this.f44694c, this.f44695d, this.f44696e, hVar, this.f44698g);
    }

    public java.lang.String toString() {
        return "Component<" + java.util.Arrays.toString(this.f44693b.toArray()) + ">{" + this.f44695d + ", type=" + this.f44696e + ", deps=" + java.util.Arrays.toString(this.f44694c.toArray()) + "}";
    }
}
