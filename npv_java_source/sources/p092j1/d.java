package p092j1;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j1.d.a f49147i = new j1.d.a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f49148j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f49150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f49151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f49152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.String f49154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.Object f49155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f49156h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p092j1.d a(int i6) {
            p092j1.d dVar = new p092j1.d("FIXED_DIMENSION");
            dVar.b(i6);
            return dVar;
        }

        public final p092j1.d b(java.lang.Object obj) {
            p247y7.AbstractC7350t.f(obj, "value");
            p092j1.d dVar = new p092j1.d("FIXED_DIMENSION");
            dVar.c(obj);
            return dVar;
        }

        public final p092j1.d c() {
            return new p092j1.d("PARENT_DIMENSION");
        }

        public final p092j1.d d(java.lang.Object obj, float f6) {
            p092j1.d dVar = new p092j1.d("PERCENT_DIMENSION");
            dVar.i(obj, f6);
            return dVar;
        }

        public final p092j1.d e(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "ratio");
            p092j1.d dVar = new p092j1.d("RATIO_DIMENSION");
            dVar.j(str);
            return dVar;
        }

        public final p092j1.d f(java.lang.Object obj) {
            p247y7.AbstractC7350t.f(obj, "startValue");
            p092j1.d dVar = new p092j1.d();
            dVar.l(obj);
            return dVar;
        }

        public final p092j1.d g() {
            return new p092j1.d("WRAP_DIMENSION");
        }
    }

    public d() {
        this.f49149a = -2;
        this.f49151c = Integer.MAX_VALUE;
        this.f49152d = 1.0f;
        this.f49155g = "WRAP_DIMENSION";
    }

    public d(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "type");
        this.f49149a = -2;
        this.f49151c = Integer.MAX_VALUE;
        this.f49152d = 1.0f;
        this.f49155g = obj;
    }

    public final void a(p092j1.g gVar, p122m1.e eVar, int i6) {
        m1.e.b bVar;
        m1.e.b bVar2;
        p247y7.AbstractC7350t.f(eVar, "constraintWidget");
        java.lang.String str = this.f49154f;
        if (str != null) {
            eVar.e1(str);
        }
        int i10 = 2;
        if (i6 == 0) {
            if (this.f49156h) {
                eVar.r1(m1.e.b.MATCH_CONSTRAINT);
                if (p247y7.AbstractC7350t.b(this.f49155g, "WRAP_DIMENSION")) {
                    i10 = 1;
                } else if (!p247y7.AbstractC7350t.b(this.f49155g, "PERCENT_DIMENSION")) {
                    i10 = 0;
                }
                eVar.t1(i10, this.f49150b, this.f49151c, this.f49152d);
                return;
            }
            int i11 = this.f49150b;
            if (i11 > 0) {
                eVar.H1(i11);
            }
            int i12 = this.f49151c;
            if (i12 < Integer.MAX_VALUE) {
                eVar.D1(i12);
            }
            java.lang.Object obj = this.f49155g;
            if (p247y7.AbstractC7350t.b(obj, "WRAP_DIMENSION")) {
                bVar2 = m1.e.b.WRAP_CONTENT;
            } else {
                if (!p247y7.AbstractC7350t.b(obj, "PARENT_DIMENSION")) {
                    if (obj == null) {
                        eVar.r1(m1.e.b.FIXED);
                        eVar.U1(this.f49153e);
                        return;
                    }
                    return;
                }
                bVar2 = m1.e.b.MATCH_PARENT;
            }
            eVar.r1(bVar2);
            return;
        }
        if (this.f49156h) {
            eVar.P1(m1.e.b.MATCH_CONSTRAINT);
            if (p247y7.AbstractC7350t.b(this.f49155g, "WRAP_DIMENSION")) {
                i10 = 1;
            } else if (!p247y7.AbstractC7350t.b(this.f49155g, "PERCENT_DIMENSION")) {
                i10 = 0;
            }
            eVar.R1(i10, this.f49150b, this.f49151c, this.f49152d);
            return;
        }
        int i13 = this.f49150b;
        if (i13 > 0) {
            eVar.G1(i13);
        }
        int i14 = this.f49151c;
        if (i14 < Integer.MAX_VALUE) {
            eVar.C1(i14);
        }
        java.lang.Object obj2 = this.f49155g;
        if (p247y7.AbstractC7350t.b(obj2, "WRAP_DIMENSION")) {
            bVar = m1.e.b.WRAP_CONTENT;
        } else {
            if (!p247y7.AbstractC7350t.b(obj2, "PARENT_DIMENSION")) {
                if (obj2 == null) {
                    eVar.P1(m1.e.b.FIXED);
                    eVar.m1(this.f49153e);
                    return;
                }
                return;
            }
            bVar = m1.e.b.MATCH_PARENT;
        }
        eVar.P1(bVar);
    }

    public final p092j1.d b(int i6) {
        this.f49155g = null;
        this.f49153e = i6;
        return this;
    }

    public final p092j1.d c(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "value");
        this.f49155g = obj;
        if (obj instanceof java.lang.Integer) {
            this.f49153e = ((java.lang.Number) obj).intValue();
            this.f49155g = null;
        }
        return this;
    }

    public final int d() {
        return this.f49153e;
    }

    public final p092j1.d e(int i6) {
        if (this.f49151c >= 0) {
            this.f49151c = i6;
        }
        return this;
    }

    public final p092j1.d f(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "value");
        if (p247y7.AbstractC7350t.b(obj, "WRAP_DIMENSION") && this.f49156h) {
            this.f49155g = "WRAP_DIMENSION";
            this.f49151c = Integer.MAX_VALUE;
        }
        return this;
    }

    public final p092j1.d g(int i6) {
        if (i6 >= 0) {
            this.f49150b = i6;
        }
        return this;
    }

    public final p092j1.d h(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "value");
        if (p247y7.AbstractC7350t.b(obj, "WRAP_DIMENSION")) {
            this.f49150b = this.f49149a;
        }
        return this;
    }

    public final p092j1.d i(java.lang.Object obj, float f6) {
        this.f49152d = f6;
        return this;
    }

    public final p092j1.d j(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "ratio");
        this.f49154f = str;
        return this;
    }

    public final p092j1.d k(int i6) {
        this.f49156h = true;
        if (i6 >= 0) {
            this.f49151c = i6;
        }
        return this;
    }

    public final p092j1.d l(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "value");
        this.f49155g = obj;
        this.f49156h = true;
        return this;
    }
}
