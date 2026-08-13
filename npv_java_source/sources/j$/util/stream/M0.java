package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
abstract class M0 implements j$.util.stream.K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final j$.util.stream.K0 f48286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final j$.util.stream.K0 f48287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f48288c;

    M0(j$.util.stream.K0 k6, j$.util.stream.K0 k10) {
        this.f48286a = k6;
        this.f48287b = k10;
        this.f48288c = k6.count() + k10.count();
    }

    @Override // j$.util.stream.K0
    public /* bridge */ /* synthetic */ j$.util.stream.J0 b(int i6) {
        return (j$.util.stream.J0) b(i6);
    }

    @Override // j$.util.stream.K0
    public final j$.util.stream.K0 b(int i6) {
        if (i6 == 0) {
            return this.f48286a;
        }
        if (i6 == 1) {
            return this.f48287b;
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f48288c;
    }

    @Override // j$.util.stream.K0
    public final int p() {
        return 2;
    }
}
