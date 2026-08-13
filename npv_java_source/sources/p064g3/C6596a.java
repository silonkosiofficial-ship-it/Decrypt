package p064g3;

/* JADX INFO: renamed from: g3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C6596a extends p064g3.AbstractC6600e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f45497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f45498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f45500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f45501f;

    /* JADX INFO: renamed from: g3.a$b */
    static final class b extends p064g3.AbstractC6600e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.Long f45502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.Integer f45503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.Integer f45504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.Long f45505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.lang.Integer f45506e;

        b() {
        }

        @Override // p064g3.AbstractC6600e.a
        p064g3.AbstractC6600e a() {
            java.lang.String str = "";
            if (this.f45502a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f45503b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f45504c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f45505d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f45506e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new p064g3.C6596a(this.f45502a.longValue(), this.f45503b.intValue(), this.f45504c.intValue(), this.f45505d.longValue(), this.f45506e.intValue());
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + str);
        }

        @Override // p064g3.AbstractC6600e.a
        p064g3.AbstractC6600e.a b(int i6) {
            this.f45504c = java.lang.Integer.valueOf(i6);
            return this;
        }

        @Override // p064g3.AbstractC6600e.a
        p064g3.AbstractC6600e.a c(long j6) {
            this.f45505d = java.lang.Long.valueOf(j6);
            return this;
        }

        @Override // p064g3.AbstractC6600e.a
        p064g3.AbstractC6600e.a d(int i6) {
            this.f45503b = java.lang.Integer.valueOf(i6);
            return this;
        }

        @Override // p064g3.AbstractC6600e.a
        p064g3.AbstractC6600e.a e(int i6) {
            this.f45506e = java.lang.Integer.valueOf(i6);
            return this;
        }

        @Override // p064g3.AbstractC6600e.a
        p064g3.AbstractC6600e.a f(long j6) {
            this.f45502a = java.lang.Long.valueOf(j6);
            return this;
        }
    }

    private C6596a(long j6, int i6, int i10, long j10, int i11) {
        this.f45497b = j6;
        this.f45498c = i6;
        this.f45499d = i10;
        this.f45500e = j10;
        this.f45501f = i11;
    }

    @Override // p064g3.AbstractC6600e
    int b() {
        return this.f45499d;
    }

    @Override // p064g3.AbstractC6600e
    long c() {
        return this.f45500e;
    }

    @Override // p064g3.AbstractC6600e
    int d() {
        return this.f45498c;
    }

    @Override // p064g3.AbstractC6600e
    int e() {
        return this.f45501f;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p064g3.AbstractC6600e)) {
            return false;
        }
        p064g3.AbstractC6600e abstractC6600e = (p064g3.AbstractC6600e) obj;
        return this.f45497b == abstractC6600e.f() && this.f45498c == abstractC6600e.d() && this.f45499d == abstractC6600e.b() && this.f45500e == abstractC6600e.c() && this.f45501f == abstractC6600e.e();
    }

    @Override // p064g3.AbstractC6600e
    long f() {
        return this.f45497b;
    }

    public int hashCode() {
        long j6 = this.f45497b;
        int i6 = (((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f45498c) * 1000003) ^ this.f45499d) * 1000003;
        long j10 = this.f45500e;
        return ((i6 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f45501f;
    }

    public java.lang.String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f45497b + ", loadBatchSize=" + this.f45498c + ", criticalSectionEnterTimeoutMs=" + this.f45499d + ", eventCleanUpAge=" + this.f45500e + ", maxBlobByteSizePerRow=" + this.f45501f + "}";
    }
}
