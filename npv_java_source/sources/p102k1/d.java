package p102k1;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends p092j1.e {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private float f49366s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private java.util.HashMap f49367t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private java.util.HashMap f49368u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private java.util.HashMap f49369v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private java.util.HashMap f49370w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private java.util.HashMap f49371x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private j1.g.a f49372y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p092j1.g gVar, j1.g.e eVar) {
        super(gVar, eVar);
        p247y7.AbstractC7350t.f(gVar, "state");
        p247y7.AbstractC7350t.f(eVar, "type");
        this.f49366s0 = 0.5f;
        this.f49367t0 = new java.util.HashMap();
        this.f49368u0 = new java.util.HashMap();
        this.f49369v0 = new java.util.HashMap();
        this.f49372y0 = j1.g.a.SPREAD;
    }

    public final void Z0(java.lang.Object obj, float f6, float f10, float f11, float f12, float f13) {
        p247y7.AbstractC7350t.f(obj, "id");
        super.T0(obj);
        java.lang.String string = obj.toString();
        if (!java.lang.Float.isNaN(f6)) {
            this.f49367t0.put(string, java.lang.Float.valueOf(f6));
        }
        if (!java.lang.Float.isNaN(f10)) {
            this.f49368u0.put(string, java.lang.Float.valueOf(f10));
        }
        if (!java.lang.Float.isNaN(f11)) {
            this.f49369v0.put(string, java.lang.Float.valueOf(f11));
        }
        if (!java.lang.Float.isNaN(f12)) {
            if (this.f49370w0 == null) {
                this.f49370w0 = new java.util.HashMap();
            }
            java.lang.Float fValueOf = java.lang.Float.valueOf(f12);
            java.util.HashMap map = this.f49370w0;
            p247y7.AbstractC7350t.c(map);
            map.put(string, fValueOf);
        }
        if (java.lang.Float.isNaN(f13)) {
            return;
        }
        if (this.f49371x0 == null) {
            this.f49371x0 = new java.util.HashMap();
        }
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(f13);
        java.util.HashMap map2 = this.f49371x0;
        p247y7.AbstractC7350t.c(map2);
        map2.put(string, fValueOf2);
    }

    public p102k1.d a1(float f6) {
        this.f49366s0 = f6;
        return this;
    }

    protected final float b1() {
        return this.f49366s0;
    }

    protected final j1.g.a c1() {
        return this.f49372y0;
    }

    public final float d1(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "id");
        java.util.HashMap map = this.f49371x0;
        if (map != null) {
            p247y7.AbstractC7350t.c(map);
            if (map.containsKey(str)) {
                java.util.HashMap map2 = this.f49371x0;
                p247y7.AbstractC7350t.c(map2);
                java.lang.Object obj = map2.get(str);
                p247y7.AbstractC7350t.c(obj);
                p247y7.AbstractC7350t.c(obj);
                return ((java.lang.Number) obj).floatValue();
            }
        }
        return 0.0f;
    }

    protected final float e1(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "id");
        if (!this.f49369v0.containsKey(str)) {
            return 0.0f;
        }
        java.lang.Object obj = this.f49369v0.get(str);
        p247y7.AbstractC7350t.c(obj);
        p247y7.AbstractC7350t.c(obj);
        return ((java.lang.Number) obj).floatValue();
    }

    public final float f1(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "id");
        java.util.HashMap map = this.f49370w0;
        if (map != null) {
            p247y7.AbstractC7350t.c(map);
            if (map.containsKey(str)) {
                java.util.HashMap map2 = this.f49370w0;
                p247y7.AbstractC7350t.c(map2);
                java.lang.Object obj = map2.get(str);
                p247y7.AbstractC7350t.c(obj);
                p247y7.AbstractC7350t.c(obj);
                return ((java.lang.Number) obj).floatValue();
            }
        }
        return 0.0f;
    }

    protected final float g1(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "id");
        if (!this.f49368u0.containsKey(str)) {
            return 0.0f;
        }
        java.lang.Object obj = this.f49368u0.get(str);
        p247y7.AbstractC7350t.c(obj);
        p247y7.AbstractC7350t.c(obj);
        return ((java.lang.Number) obj).floatValue();
    }

    protected final float h1(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "id");
        if (!this.f49367t0.containsKey(str)) {
            return -1.0f;
        }
        java.lang.Object obj = this.f49367t0.get(str);
        p247y7.AbstractC7350t.c(obj);
        p247y7.AbstractC7350t.c(obj);
        return ((java.lang.Number) obj).floatValue();
    }

    public final p102k1.d i1(j1.g.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "style");
        this.f49372y0 = aVar;
        return this;
    }
}
