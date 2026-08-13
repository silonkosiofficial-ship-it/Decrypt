package p014b3;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p014b3.c f24145c = new b3.c.a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b3.c.b f24147b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f24148a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b3.c.b f24149b = b3.c.b.REASON_UNKNOWN;

        a() {
        }

        public p014b3.c a() {
            return new p014b3.c(this.f24148a, this.f24149b);
        }

        public b3.c.a b(long j6) {
            this.f24148a = j6;
            return this;
        }

        public b3.c.a c(b3.c.b bVar) {
            this.f24149b = bVar;
            return this;
        }
    }

    public enum b implements C5.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f24158C;

        b(int i6) {
            this.f24158C = i6;
        }

        @Override // C5.c
        public int c() {
            return this.f24158C;
        }
    }

    c(long j6, b3.c.b bVar) {
        this.f24146a = j6;
        this.f24147b = bVar;
    }

    public static b3.c.a c() {
        return new b3.c.a();
    }

    public long a() {
        return this.f24146a;
    }

    public b3.c.b b() {
        return this.f24147b;
    }
}
