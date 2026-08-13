package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6820s3 extends j$.util.stream.AbstractC6766h3 implements j$.util.X {
    @Override // j$.util.stream.AbstractC6766h3
    final void d() {
        j$.util.stream.V2 v6 = new j$.util.stream.V2();
        this.f48487h = v6;
        j$.util.Objects.requireNonNull(v6);
        this.f48484e = this.f48481b.S(new j$.util.stream.C6815r3(v6, 0));
        this.f48485f = new j$.util.stream.C6727a(3, this);
    }

    @Override // j$.util.stream.AbstractC6766h3
    final j$.util.stream.AbstractC6766h3 e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.C6820s3(this.f48481b, spliterator, this.f48480a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Q.b(this, consumer);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        if (this.f48487h != null || this.f48488i) {
            while (tryAdvance(intConsumer)) {
            }
            return;
        }
        j$.util.Objects.requireNonNull(intConsumer);
        c();
        j$.util.Objects.requireNonNull(intConsumer);
        j$.util.stream.C6815r3 c6815r3 = new j$.util.stream.C6815r3(intConsumer, 1);
        this.f48481b.R(this.f48483d, c6815r3);
        this.f48488i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.util.Q.g(this, consumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        j$.util.Objects.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            j$.util.stream.V2 v6 = (j$.util.stream.V2) this.f48487h;
            long j6 = this.f48486g;
            int iT = v6.t(j6);
            intConsumer.accept((v6.f48427c == 0 && iT == 0) ? ((int[]) v6.f48401e)[(int) j6] : ((int[][]) v6.f48402f)[iT][(int) (j6 - v6.f48428d[iT])]);
        }
        return zA;
    }

    @Override // j$.util.stream.AbstractC6766h3, j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        return (j$.util.X) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC6766h3, j$.util.Spliterator
    public final j$.util.X trySplit() {
        return (j$.util.X) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC6766h3, j$.util.Spliterator
    public final j$.util.d0 trySplit() {
        return (j$.util.X) super.trySplit();
    }
}
