package p201u0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p201u0.p implements java.lang.Iterable, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f55327C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final float f55328D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final float f55329E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final float f55330F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final float f55331G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final float f55332H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final float f55333I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final float f55334J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final java.util.List f55335K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final java.util.List f55336L;

    public static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.util.Iterator f55337C;

        a(p201u0.n nVar) {
            this.f55337C = nVar.f55336L.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p201u0.p next() {
            return (p201u0.p) this.f55337C.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55337C.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n(java.lang.String str, float f6, float f10, float f11, float f12, float f13, float f14, float f15, java.util.List list, java.util.List list2) {
        super(null);
        this.f55327C = str;
        this.f55328D = f6;
        this.f55329E = f10;
        this.f55330F = f11;
        this.f55331G = f12;
        this.f55332H = f13;
        this.f55333I = f14;
        this.f55334J = f15;
        this.f55335K = list;
        this.f55336L = list2;
    }

    public final float C() {
        return this.f55328D;
    }

    public final float D() {
        return this.f55331G;
    }

    public final float E() {
        return this.f55332H;
    }

    public final int M() {
        return this.f55336L.size();
    }

    public final float N() {
        return this.f55333I;
    }

    public final float O() {
        return this.f55334J;
    }

    public final p201u0.p e(int i6) {
        return (p201u0.p) this.f55336L.get(i6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof p201u0.n)) {
            p201u0.n nVar = (p201u0.n) obj;
            return p247y7.AbstractC7350t.b(this.f55327C, nVar.f55327C) && this.f55328D == nVar.f55328D && this.f55329E == nVar.f55329E && this.f55330F == nVar.f55330F && this.f55331G == nVar.f55331G && this.f55332H == nVar.f55332H && this.f55333I == nVar.f55333I && this.f55334J == nVar.f55334J && p247y7.AbstractC7350t.b(this.f55335K, nVar.f55335K) && p247y7.AbstractC7350t.b(this.f55336L, nVar.f55336L);
        }
        return false;
    }

    public final java.util.List f() {
        return this.f55335K;
    }

    public final java.lang.String g() {
        return this.f55327C;
    }

    public int hashCode() {
        return (((((((((((((((((this.f55327C.hashCode() * 31) + java.lang.Float.floatToIntBits(this.f55328D)) * 31) + java.lang.Float.floatToIntBits(this.f55329E)) * 31) + java.lang.Float.floatToIntBits(this.f55330F)) * 31) + java.lang.Float.floatToIntBits(this.f55331G)) * 31) + java.lang.Float.floatToIntBits(this.f55332H)) * 31) + java.lang.Float.floatToIntBits(this.f55333I)) * 31) + java.lang.Float.floatToIntBits(this.f55334J)) * 31) + this.f55335K.hashCode()) * 31) + this.f55336L.hashCode();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new u0.n.a(this);
    }

    public final float o() {
        return this.f55329E;
    }

    public final float s() {
        return this.f55330F;
    }
}
