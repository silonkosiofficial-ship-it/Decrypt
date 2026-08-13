package Y4;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f16396b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f16397c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z4.a f16395a = new Z4.a.C0312a();

    private static int b(int i6) {
        return (i6 == 400 || i6 == 404) ? 1 : 0;
    }

    public boolean a() {
        return this.f16397c <= this.f16395a.a();
    }

    public void c() {
        this.f16396b = 0L;
        this.f16397c = -1L;
    }

    public void d(int i6) {
        this.f16396b++;
        if (b(i6) == 1) {
            this.f16397c = this.f16395a.a() + 86400000;
            return;
        }
        this.f16397c = this.f16395a.a() + java.lang.Math.min((long) (java.lang.Math.pow(2.0d, this.f16396b * ((java.lang.Math.random() * 0.5d) + 1.0d)) * 1000.0d), 14400000L);
    }
}
