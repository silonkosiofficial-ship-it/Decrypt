package p046e5;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p046e5.F f44736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f44737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f44738c;

    private r(p046e5.F f6, int i6, int i10) {
        this.f44736a = (p046e5.F) p046e5.E.c(f6, "Null dependency anInterface.");
        this.f44737b = i6;
        this.f44738c = i10;
    }

    private r(java.lang.Class cls, int i6, int i10) {
        this(p046e5.F.b(cls), i6, i10);
    }

    public static p046e5.r a(java.lang.Class cls) {
        return new p046e5.r(cls, 0, 2);
    }

    private static java.lang.String b(int i6) {
        if (i6 == 0) {
            return "direct";
        }
        if (i6 == 1) {
            return "provider";
        }
        if (i6 == 2) {
            return "deferred";
        }
        throw new java.lang.AssertionError("Unsupported injection: " + i6);
    }

    public static p046e5.r h(java.lang.Class cls) {
        return new p046e5.r(cls, 0, 1);
    }

    public static p046e5.r i(p046e5.F f6) {
        return new p046e5.r(f6, 1, 0);
    }

    public static p046e5.r j(java.lang.Class cls) {
        return new p046e5.r(cls, 1, 0);
    }

    public static p046e5.r k(p046e5.F f6) {
        return new p046e5.r(f6, 1, 1);
    }

    public static p046e5.r l(java.lang.Class cls) {
        return new p046e5.r(cls, 1, 1);
    }

    public static p046e5.r m(java.lang.Class cls) {
        return new p046e5.r(cls, 2, 0);
    }

    public p046e5.F c() {
        return this.f44736a;
    }

    public boolean d() {
        return this.f44738c == 2;
    }

    public boolean e() {
        return this.f44738c == 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p046e5.r)) {
            return false;
        }
        p046e5.r rVar = (p046e5.r) obj;
        return this.f44736a.equals(rVar.f44736a) && this.f44737b == rVar.f44737b && this.f44738c == rVar.f44738c;
    }

    public boolean f() {
        return this.f44737b == 1;
    }

    public boolean g() {
        return this.f44737b == 2;
    }

    public int hashCode() {
        return ((((this.f44736a.hashCode() ^ 1000003) * 1000003) ^ this.f44737b) * 1000003) ^ this.f44738c;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Dependency{anInterface=");
        sb.append(this.f44736a);
        sb.append(", type=");
        int i6 = this.f44737b;
        if (i6 == 1) {
            str = "required";
        } else {
            str = i6 == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(b(this.f44738c));
        sb.append("}");
        return sb.toString();
    }
}
