package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6766h3 implements j$.util.Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f48480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final j$.util.stream.AbstractC6732b f48481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.function.Supplier f48482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    j$.util.Spliterator f48483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    j$.util.stream.InterfaceC6810q2 f48484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    java.util.function.BooleanSupplier f48485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f48486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    j$.util.stream.AbstractC6742d f48487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f48488i;

    AbstractC6766h3(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, boolean z6) {
        this.f48481b = abstractC6732b;
        this.f48482c = null;
        this.f48483d = spliterator;
        this.f48480a = z6;
    }

    AbstractC6766h3(j$.util.stream.AbstractC6732b abstractC6732b, java.util.function.Supplier supplier, boolean z6) {
        this.f48481b = abstractC6732b;
        this.f48482c = supplier;
        this.f48483d = null;
        this.f48480a = z6;
    }

    private boolean b() {
        while (this.f48487h.count() == 0) {
            if (this.f48484e.m() || !this.f48485f.getAsBoolean()) {
                if (this.f48488i) {
                    return false;
                }
                this.f48484e.j();
                this.f48488i = true;
            }
        }
        return true;
    }

    final boolean a() {
        j$.util.stream.AbstractC6742d abstractC6742d = this.f48487h;
        if (abstractC6742d == null) {
            if (this.f48488i) {
                return false;
            }
            c();
            d();
            this.f48486g = 0L;
            this.f48484e.k(this.f48483d.getExactSizeIfKnown());
            return b();
        }
        long j6 = this.f48486g + 1;
        this.f48486g = j6;
        boolean z6 = j6 < abstractC6742d.count();
        if (z6) {
            return z6;
        }
        this.f48486g = 0L;
        this.f48487h.clear();
        return b();
    }

    final void c() {
        if (this.f48483d == null) {
            this.f48483d = (j$.util.Spliterator) this.f48482c.get();
            this.f48482c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int iM = j$.util.stream.EnumC6756f3.M(this.f48481b.G()) & j$.util.stream.EnumC6756f3.f48448f;
        return (iM & 64) != 0 ? (iM & (-16449)) | (this.f48483d.characteristics() & 16448) : iM;
    }

    abstract void d();

    abstract j$.util.stream.AbstractC6766h3 e(j$.util.Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f48483d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (j$.util.Q.e(this, 4)) {
            return null;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (j$.util.stream.EnumC6756f3.SIZED.u(this.f48481b.G())) {
            return this.f48483d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return j$.util.Q.e(this, i6);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("%s[%s]", getClass().getName(), this.f48483d);
    }

    @Override // j$.util.Spliterator
    public j$.util.Spliterator trySplit() {
        if (!this.f48480a || this.f48487h != null || this.f48488i) {
            return null;
        }
        c();
        j$.util.Spliterator spliteratorTrySplit = this.f48483d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return e(spliteratorTrySplit);
    }
}
