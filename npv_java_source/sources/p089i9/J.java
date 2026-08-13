package p089i9;

/* JADX INFO: loaded from: classes2.dex */
final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p089i9.J f47355a = new p089i9.J();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i9.J.c f47356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p109k9.D f47357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p109k9.D f47358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p109k9.D f47359e;

    public static final class c implements p109k9.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p109k9.x f47362a = new p109k9.x(new p247y7.A() { // from class: i9.J.c.a
            @Override // p247y7.A, F7.m
            public java.lang.Object get(java.lang.Object obj) {
                return ((p089i9.V) obj).c();
            }

            @Override // p247y7.A, F7.i
            public void r(java.lang.Object obj, java.lang.Object obj2) {
                ((p089i9.V) obj).z((java.lang.Boolean) obj2);
            }
        });

        c() {
        }

        @Override // p109k9.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p109k9.x c() {
            return this.f47362a;
        }

        @Override // p109k9.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(p089i9.V v6) {
            p247y7.AbstractC7350t.f(v6, "obj");
            java.lang.Integer numH = v6.h();
            if ((numH != null ? numH.intValue() : 0) != 0) {
                return false;
            }
            java.lang.Integer numU = v6.u();
            if ((numU != null ? numU.intValue() : 0) != 0) {
                return false;
            }
            java.lang.Integer numL = v6.l();
            return (numL != null ? numL.intValue() : 0) == 0;
        }
    }

    static {
        i9.J.c cVar = new i9.J.c();
        f47356b = cVar;
        f47357c = new p109k9.D(new p109k9.x(new p247y7.A() { // from class: i9.J.d
            @Override // p247y7.A, F7.m
            public java.lang.Object get(java.lang.Object obj) {
                return ((p089i9.V) obj).h();
            }

            @Override // p247y7.A, F7.i
            public void r(java.lang.Object obj, java.lang.Object obj2) {
                ((p089i9.V) obj).D((java.lang.Integer) obj2);
            }
        }), 0, 18, null, 0, cVar, 8, null);
        f47358d = new p109k9.D(new p109k9.x(new p247y7.A() { // from class: i9.J.a
            @Override // p247y7.A, F7.m
            public java.lang.Object get(java.lang.Object obj) {
                return ((p089i9.V) obj).u();
            }

            @Override // p247y7.A, F7.i
            public void r(java.lang.Object obj, java.lang.Object obj2) {
                ((p089i9.V) obj).B((java.lang.Integer) obj2);
            }
        }), 0, 59, null, 0, cVar, 8, null);
        f47359e = new p109k9.D(new p109k9.x(new p247y7.A() { // from class: i9.J.b
            @Override // p247y7.A, F7.m
            public java.lang.Object get(java.lang.Object obj) {
                return ((p089i9.V) obj).l();
            }

            @Override // p247y7.A, F7.i
            public void r(java.lang.Object obj, java.lang.Object obj2) {
                ((p089i9.V) obj).E((java.lang.Integer) obj2);
            }
        }), 0, 59, null, 0, cVar, 8, null);
    }

    private J() {
    }

    public final p109k9.D a() {
        return f47358d;
    }

    public final p109k9.D b() {
        return f47359e;
    }

    public final p109k9.D c() {
        return f47357c;
    }
}
