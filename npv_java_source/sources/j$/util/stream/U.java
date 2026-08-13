package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class U extends java.util.concurrent.CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j$.util.Spliterator f48367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j$.util.stream.InterfaceC6810q2 f48368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j$.util.stream.AbstractC6732b f48369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f48370d;

    U(j$.util.stream.U u6, j$.util.Spliterator spliterator) {
        super(u6);
        this.f48367a = spliterator;
        this.f48368b = u6.f48368b;
        this.f48370d = u6.f48370d;
        this.f48369c = u6.f48369c;
    }

    U(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(null);
        this.f48368b = interfaceC6810q2;
        this.f48369c = abstractC6732b;
        this.f48367a = spliterator;
        this.f48370d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.Spliterator spliteratorTrySplit;
        j$.util.Spliterator spliterator = this.f48367a;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.f48370d;
        if (jG == 0) {
            jG = j$.util.stream.AbstractC6747e.g(jEstimateSize);
            this.f48370d = jG;
        }
        boolean zU = j$.util.stream.EnumC6756f3.SHORT_CIRCUIT.u(this.f48369c.G());
        j$.util.stream.InterfaceC6810q2 interfaceC6810q2 = this.f48368b;
        boolean z6 = false;
        j$.util.stream.U u6 = this;
        while (true) {
            if (zU && interfaceC6810q2.m()) {
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                u6.f48369c.w(spliterator, interfaceC6810q2);
                break;
            }
            j$.util.stream.U u10 = new j$.util.stream.U(u6, spliteratorTrySplit);
            u6.addToPendingCount(1);
            if (z6) {
                spliterator = spliteratorTrySplit;
            } else {
                j$.util.stream.U u11 = u6;
                u6 = u10;
                u10 = u11;
            }
            z6 = !z6;
            u6.fork();
            u6 = u10;
            jEstimateSize = spliterator.estimateSize();
        }
        u6.f48367a = null;
        u6.propagateCompletion();
    }
}
