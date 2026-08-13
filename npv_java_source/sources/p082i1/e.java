package p082i1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p082i1.c {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final i1.e.a f46646L = new i1.e.a(null);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f46647M = 8;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private float f46648K;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public e(float f6) {
        this(new char[0]);
        this.f46648K = f6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p082i1.e eVar) {
        super(eVar);
        p247y7.AbstractC7350t.f(eVar, "clNumber");
        this.f46648K = Float.NaN;
        this.f46648K = eVar.f46648K;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(char[] cArr) {
        super(cArr);
        p247y7.AbstractC7350t.f(cArr, "content");
        this.f46648K = Float.NaN;
    }

    @Override // p082i1.c
    public p082i1.c d() {
        return new p082i1.e(this);
    }

    @Override // p082i1.c
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p082i1.e)) {
            return false;
        }
        float fG = g();
        float fG2 = ((p082i1.e) obj).g();
        return (java.lang.Float.isNaN(fG) && java.lang.Float.isNaN(fG2)) || fG == fG2;
    }

    @Override // p082i1.c
    public float g() {
        if (java.lang.Float.isNaN(this.f46648K) && E()) {
            this.f46648K = java.lang.Float.parseFloat(e());
        }
        return this.f46648K;
    }

    @Override // p082i1.c
    public int hashCode() {
        return (super.hashCode() * 31) + java.lang.Float.floatToIntBits(this.f46648K);
    }

    @Override // p082i1.c
    public int o() {
        if (java.lang.Float.isNaN(this.f46648K) && E()) {
            this.f46648K = java.lang.Integer.parseInt(e());
        }
        return (int) this.f46648K;
    }
}
