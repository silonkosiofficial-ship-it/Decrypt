package p087i7;

/* JADX INFO: renamed from: i7.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6666l implements java.lang.Comparable {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final p087i7.C6666l.a f46736G = new p087i7.C6666l.a(null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final p087i7.C6666l f46737H = p087i7.C6667m.a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f46738C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f46739D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f46740E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f46741F;

    /* JADX INFO: renamed from: i7.l$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public C6666l(int i6, int i10) {
        this(i6, i10, 0);
    }

    public C6666l(int i6, int i10, int i11) {
        this.f46738C = i6;
        this.f46739D = i10;
        this.f46740E = i11;
        this.f46741F = g(i6, i10, i11);
    }

    private final int g(int i6, int i10, int i11) {
        if (i6 >= 0 && i6 < 256 && i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256) {
            return (i6 << 16) + (i10 << 8) + i11;
        }
        throw new java.lang.IllegalArgumentException(("Version components are out of range: " + i6 + '.' + i10 + '.' + i11).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(p087i7.C6666l c6666l) {
        p247y7.AbstractC7350t.f(c6666l, "other");
        return this.f46741F - c6666l.f46741F;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        p087i7.C6666l c6666l = obj instanceof p087i7.C6666l ? (p087i7.C6666l) obj : null;
        return c6666l != null && this.f46741F == c6666l.f46741F;
    }

    public int hashCode() {
        return this.f46741F;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f46738C);
        sb.append('.');
        sb.append(this.f46739D);
        sb.append('.');
        sb.append(this.f46740E);
        return sb.toString();
    }
}
