package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6829u2 extends j$.util.stream.AbstractC6733b0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f48561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f48562n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6829u2(j$.util.stream.AbstractC6732b abstractC6732b, int i6, long j6, long j10) {
        super(abstractC6732b, i6, 0);
        this.f48561m = j6;
        this.f48562n = j10;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.K0 K(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        long jMin;
        long j6;
        long jC = abstractC6732b.C(spliterator);
        if (jC > 0 && spliterator.hasCharacteristics(16384)) {
            return j$.util.stream.AbstractC6845y0.G(abstractC6732b, j$.util.stream.AbstractC6845y0.C(abstractC6732b.F(), spliterator, this.f48561m, this.f48562n), true);
        }
        if (j$.util.stream.EnumC6756f3.ORDERED.u(abstractC6732b.G())) {
            return (j$.util.stream.K0) new j$.util.stream.A2(this, abstractC6732b, spliterator, intFunction, this.f48561m, this.f48562n).invoke();
        }
        j$.util.X x6 = (j$.util.X) abstractC6732b.T(spliterator);
        long j10 = this.f48561m;
        long j11 = this.f48562n;
        if (j10 <= jC) {
            jMin = j11 >= 0 ? java.lang.Math.min(j11, jC - j10) : jC - j10;
            j6 = 0;
        } else {
            jMin = j11;
            j6 = j10;
        }
        return j$.util.stream.AbstractC6845y0.G(this, new j$.util.stream.C3(x6, j6, jMin), true);
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.Spliterator L(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        long j6;
        long j10;
        long jC = abstractC6732b.C(spliterator);
        long j11 = this.f48562n;
        if (jC > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.X x6 = (j$.util.X) abstractC6732b.T(spliterator);
            long j12 = this.f48561m;
            return new j$.util.stream.w3(x6, j12, j$.util.stream.AbstractC6845y0.B(j12, j11));
        }
        if (j$.util.stream.EnumC6756f3.ORDERED.u(abstractC6732b.G())) {
            return ((j$.util.stream.K0) new j$.util.stream.A2(this, abstractC6732b, spliterator, new j$.util.stream.C6740c2(1), this.f48561m, this.f48562n).invoke()).spliterator();
        }
        j$.util.X x10 = (j$.util.X) abstractC6732b.T(spliterator);
        long j13 = this.f48561m;
        if (j13 <= jC) {
            long jMin = jC - j13;
            if (j11 >= 0) {
                jMin = java.lang.Math.min(j11, jMin);
            }
            j10 = 0;
            j6 = jMin;
        } else {
            j6 = j11;
            j10 = j13;
        }
        return new j$.util.stream.C3(x10, j10, j6);
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        return new j$.util.stream.C6824t2(this, interfaceC6810q2);
    }
}
