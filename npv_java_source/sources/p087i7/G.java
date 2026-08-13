package p087i7;

/* JADX INFO: loaded from: classes3.dex */
public final class G implements java.lang.Comparable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final i7.G.a f46710D = new i7.G.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final long f46711C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private /* synthetic */ G(long j6) {
        this.f46711C = j6;
    }

    public static final /* synthetic */ p087i7.G e(long j6) {
        return new p087i7.G(j6);
    }

    public static long g(long j6) {
        return j6;
    }

    public static boolean i(long j6, java.lang.Object obj) {
        return (obj instanceof p087i7.G) && j6 == ((p087i7.G) obj).q();
    }

    public static final boolean m(long j6, long j10) {
        return j6 == j10;
    }

    public static int n(long j6) {
        return p170r.r.a(j6);
    }

    public static java.lang.String o(long j6) {
        return p087i7.O.d(j6, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return p087i7.O.b(q(), ((p087i7.G) obj).q());
    }

    public boolean equals(java.lang.Object obj) {
        return i(this.f46711C, obj);
    }

    public int hashCode() {
        return n(this.f46711C);
    }

    public final /* synthetic */ long q() {
        return this.f46711C;
    }

    public java.lang.String toString() {
        return o(this.f46711C);
    }
}
