package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6811q3 extends j$.util.stream.AbstractC6766h3 implements j$.util.U {
    @Override // j$.util.stream.AbstractC6766h3
    final void d() {
        j$.util.stream.T2 t6 = new j$.util.stream.T2();
        this.f48487h = t6;
        j$.util.Objects.requireNonNull(t6);
        this.f48484e = this.f48481b.S(new j$.util.stream.C6806p3(t6, 0));
        this.f48485f = new j$.util.stream.C6727a(2, this);
    }

    @Override // j$.util.stream.AbstractC6766h3
    final j$.util.stream.AbstractC6766h3 e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.C6811q3(this.f48481b, spliterator, this.f48480a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.a(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        if (this.f48487h != null || this.f48488i) {
            while (tryAdvance(doubleConsumer)) {
            }
            return;
        }
        j$.util.Objects.requireNonNull(doubleConsumer);
        c();
        j$.util.Objects.requireNonNull(doubleConsumer);
        j$.util.stream.C6806p3 c6806p3 = new j$.util.stream.C6806p3(doubleConsumer, 1);
        this.f48481b.R(this.f48483d, c6806p3);
        this.f48488i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.util.Q.f(this, consumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer) {
        j$.util.Objects.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            j$.util.stream.T2 t6 = (j$.util.stream.T2) this.f48487h;
            long j6 = this.f48486g;
            int iT = t6.t(j6);
            doubleConsumer.accept((t6.f48427c == 0 && iT == 0) ? ((double[]) t6.f48401e)[(int) j6] : ((double[][]) t6.f48402f)[iT][(int) (j6 - t6.f48428d[iT])]);
        }
        return zA;
    }

    @Override // j$.util.stream.AbstractC6766h3, j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        return (j$.util.U) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC6766h3, j$.util.Spliterator
    public final j$.util.U trySplit() {
        return (j$.util.U) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC6766h3, j$.util.Spliterator
    public final j$.util.d0 trySplit() {
        return (j$.util.U) super.trySplit();
    }
}
