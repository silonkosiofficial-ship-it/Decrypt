package I5;

/* JADX INFO: loaded from: classes3.dex */
class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f5084d = java.util.concurrent.TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f5085e = java.util.concurrent.TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.installations.i f5086a = com.google.firebase.installations.i.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f5087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5088c;

    e() {
    }

    private synchronized long a(int i6) {
        if (c(i6)) {
            return (long) java.lang.Math.min(java.lang.Math.pow(2.0d, this.f5088c) + this.f5086a.e(), f5085e);
        }
        return f5084d;
    }

    private static boolean c(int i6) {
        return i6 == 429 || (i6 >= 500 && i6 < 600);
    }

    private static boolean d(int i6) {
        return (i6 >= 200 && i6 < 300) || i6 == 401 || i6 == 404;
    }

    private synchronized void e() {
        this.f5088c = 0;
    }

    public synchronized boolean b() {
        return this.f5088c == 0 || this.f5086a.a() > this.f5087b;
    }

    public synchronized void f(int i6) {
        if (d(i6)) {
            e();
            return;
        }
        this.f5088c++;
        this.f5087b = this.f5086a.a() + a(i6);
    }
}
