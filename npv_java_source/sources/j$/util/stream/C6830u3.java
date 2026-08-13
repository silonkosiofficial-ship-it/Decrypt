package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6830u3 extends j$.util.stream.AbstractC6766h3 implements j$.util.a0 {
    @Override // j$.util.stream.AbstractC6766h3
    final void d() {
        j$.util.stream.X2 x6 = new j$.util.stream.X2();
        this.f48487h = x6;
        j$.util.Objects.requireNonNull(x6);
        this.f48484e = this.f48481b.S(new j$.util.stream.C6825t3(x6, 0));
        this.f48485f = new j$.util.stream.C6727a(4, this);
    }

    @Override // j$.util.stream.AbstractC6766h3
    final j$.util.stream.AbstractC6766h3 e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.C6830u3(this.f48481b, spliterator, this.f48480a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.c(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        if (this.f48487h != null || this.f48488i) {
            while (tryAdvance(longConsumer)) {
            }
            return;
        }
        j$.util.Objects.requireNonNull(longConsumer);
        c();
        j$.util.Objects.requireNonNull(longConsumer);
        j$.util.stream.C6825t3 c6825t3 = new j$.util.stream.C6825t3(longConsumer, 1);
        this.f48481b.R(this.f48483d, c6825t3);
        this.f48488i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.util.Q.h(this, consumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        j$.util.Objects.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            j$.util.stream.X2 x6 = (j$.util.stream.X2) this.f48487h;
            long j6 = this.f48486g;
            int iT = x6.t(j6);
            longConsumer.accept((x6.f48427c == 0 && iT == 0) ? ((long[]) x6.f48401e)[(int) j6] : ((long[][]) x6.f48402f)[iT][(int) (j6 - x6.f48428d[iT])]);
        }
        return zA;
    }

    @Override // j$.util.stream.AbstractC6766h3, j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        return (j$.util.a0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC6766h3, j$.util.Spliterator
    public final j$.util.a0 trySplit() {
        return (j$.util.a0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC6766h3, j$.util.Spliterator
    public final j$.util.d0 trySplit() {
        return (j$.util.a0) super.trySplit();
    }
}
