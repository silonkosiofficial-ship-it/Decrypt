package p141o0;

/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o0.c2.a f52187d = new o0.c2.a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p141o0.c2 f52188e = new p141o0.c2(0, 0, 0.0f, 7, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f52189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f52190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f52191c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p141o0.c2 a() {
            return p141o0.c2.f52188e;
        }
    }

    private c2(long j6, long j10, float f6) {
        this.f52189a = j6;
        this.f52190b = j10;
        this.f52191c = f6;
    }

    public /* synthetic */ c2(long j6, long j10, float f6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? p141o0.A0.d(4278190080L) : j6, (i6 & 2) != 0 ? p131n0.g.f51312b.c() : j10, (i6 & 4) != 0 ? 0.0f : f6, null);
    }

    public /* synthetic */ c2(long j6, long j10, float f6, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, f6);
    }

    public final float b() {
        return this.f52191c;
    }

    public final long c() {
        return this.f52189a;
    }

    public final long d() {
        return this.f52190b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p141o0.c2)) {
            return false;
        }
        p141o0.c2 c2Var = (p141o0.c2) obj;
        return p141o0.C7016y0.o(this.f52189a, c2Var.f52189a) && p131n0.g.j(this.f52190b, c2Var.f52190b) && this.f52191c == c2Var.f52191c;
    }

    public int hashCode() {
        return (((p141o0.C7016y0.u(this.f52189a) * 31) + p131n0.g.o(this.f52190b)) * 31) + java.lang.Float.floatToIntBits(this.f52191c);
    }

    public java.lang.String toString() {
        return "Shadow(color=" + ((java.lang.Object) p141o0.C7016y0.v(this.f52189a)) + ", offset=" + ((java.lang.Object) p131n0.g.t(this.f52190b)) + ", blurRadius=" + this.f52191c + ')';
    }
}
