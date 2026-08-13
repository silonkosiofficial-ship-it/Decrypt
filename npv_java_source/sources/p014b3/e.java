package p014b3;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p014b3.e f24164c = new b3.e.a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24166b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f24167a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f24168b = 0;

        a() {
        }

        public p014b3.e a() {
            return new p014b3.e(this.f24167a, this.f24168b);
        }

        public b3.e.a b(long j6) {
            this.f24167a = j6;
            return this;
        }

        public b3.e.a c(long j6) {
            this.f24168b = j6;
            return this;
        }
    }

    e(long j6, long j10) {
        this.f24165a = j6;
        this.f24166b = j10;
    }

    public static b3.e.a c() {
        return new b3.e.a();
    }

    public long a() {
        return this.f24165a;
    }

    public long b() {
        return this.f24166b;
    }
}
