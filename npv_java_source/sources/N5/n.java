package N5;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f7809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7810b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f7811a = 60;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f7812b = com.google.firebase.remoteconfig.internal.m.f44137j;

        public N5.n c() {
            return new N5.n(this);
        }

        public N5.n.b d(long j6) {
            if (j6 >= 0) {
                this.f7812b = j6;
                return this;
            }
            throw new java.lang.IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j6 + " is an invalid argument");
        }
    }

    private n(N5.n.b bVar) {
        this.f7809a = bVar.f7811a;
        this.f7810b = bVar.f7812b;
    }

    public long a() {
        return this.f7809a;
    }

    public long b() {
        return this.f7810b;
    }
}
