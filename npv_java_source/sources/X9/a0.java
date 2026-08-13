package X9;

/* JADX INFO: loaded from: classes2.dex */
public class a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final X9.a0.b f16112d = new X9.a0.b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final X9.a0 f16113e = new X9.a0.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f16114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f16115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f16116c;

    public static final class a extends X9.a0 {
        a() {
        }

        @Override // X9.a0
        public X9.a0 d(long j6) {
            return this;
        }

        @Override // X9.a0
        public void f() {
        }

        @Override // X9.a0
        public X9.a0 g(long j6, java.util.concurrent.TimeUnit timeUnit) {
            p247y7.AbstractC7350t.f(timeUnit, "unit");
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public X9.a0 a() {
        this.f16114a = false;
        return this;
    }

    public X9.a0 b() {
        this.f16116c = 0L;
        return this;
    }

    public long c() {
        if (this.f16114a) {
            return this.f16115b;
        }
        throw new java.lang.IllegalStateException("No deadline".toString());
    }

    public X9.a0 d(long j6) {
        this.f16114a = true;
        this.f16115b = j6;
        return this;
    }

    public boolean e() {
        return this.f16114a;
    }

    public void f() throws java.io.InterruptedIOException {
        if (java.lang.Thread.currentThread().isInterrupted()) {
            throw new java.io.InterruptedIOException("interrupted");
        }
        if (this.f16114a && this.f16115b - java.lang.System.nanoTime() <= 0) {
            throw new java.io.InterruptedIOException("deadline reached");
        }
    }

    public X9.a0 g(long j6, java.util.concurrent.TimeUnit timeUnit) {
        p247y7.AbstractC7350t.f(timeUnit, "unit");
        if (j6 >= 0) {
            this.f16116c = timeUnit.toNanos(j6);
            return this;
        }
        throw new java.lang.IllegalArgumentException(("timeout < 0: " + j6).toString());
    }

    public long h() {
        return this.f16116c;
    }
}
