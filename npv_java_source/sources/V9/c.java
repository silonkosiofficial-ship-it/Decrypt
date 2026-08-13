package V9;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements java.io.Closeable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f15154C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final X9.C1836d f15155D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.zip.Inflater f15156E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final X9.C1848p f15157F;

    public c(boolean z6) {
        this.f15154C = z6;
        X9.C1836d c1836d = new X9.C1836d();
        this.f15155D = c1836d;
        java.util.zip.Inflater inflater = new java.util.zip.Inflater(true);
        this.f15156E = inflater;
        this.f15157F = new X9.C1848p((X9.Z) c1836d, inflater);
    }

    public final void a(X9.C1836d c1836d) throws java.io.IOException {
        p247y7.AbstractC7350t.f(c1836d, "buffer");
        if (this.f15155D.d1() != 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f15154C) {
            this.f15156E.reset();
        }
        this.f15155D.c0(c1836d);
        this.f15155D.L(65535);
        long bytesRead = this.f15156E.getBytesRead() + this.f15155D.d1();
        do {
            this.f15157F.a(c1836d, Long.MAX_VALUE);
        } while (this.f15156E.getBytesRead() < bytesRead);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15157F.close();
    }
}
