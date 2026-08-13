package p014b3;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p014b3.f f24169c = new b3.f.a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24171b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f24172a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f24173b = 0;

        a() {
        }

        public p014b3.f a() {
            return new p014b3.f(this.f24172a, this.f24173b);
        }

        public b3.f.a b(long j6) {
            this.f24173b = j6;
            return this;
        }

        public b3.f.a c(long j6) {
            this.f24172a = j6;
            return this;
        }
    }

    f(long j6, long j10) {
        this.f24170a = j6;
        this.f24171b = j10;
    }

    public static b3.f.a c() {
        return new b3.f.a();
    }

    public long a() {
        return this.f24171b;
    }

    public long b() {
        return this.f24170a;
    }
}
