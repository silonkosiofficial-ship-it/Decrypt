package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6839w2 extends j$.util.stream.AbstractC6773j0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f48582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f48583n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6839w2(j$.util.stream.AbstractC6732b abstractC6732b, int i6, long j6, long j10) {
        super(abstractC6732b, i6, 0);
        this.f48582m = j6;
        this.f48583n = j10;
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.K0 K(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        long jMin;
        long j6;
        long jC = abstractC6732b.C(spliterator);
        if (jC > 0 && spliterator.hasCharacteristics(16384)) {
            return j$.util.stream.AbstractC6845y0.H(abstractC6732b, j$.util.stream.AbstractC6845y0.C(abstractC6732b.F(), spliterator, this.f48582m, this.f48583n), true);
        }
        if (j$.util.stream.EnumC6756f3.ORDERED.u(abstractC6732b.G())) {
            return (j$.util.stream.K0) new j$.util.stream.A2(this, abstractC6732b, spliterator, intFunction, this.f48582m, this.f48583n).invoke();
        }
        j$.util.a0 a0Var = (j$.util.a0) abstractC6732b.T(spliterator);
        long j10 = this.f48582m;
        long j11 = this.f48583n;
        if (j10 <= jC) {
            jMin = j11 >= 0 ? java.lang.Math.min(j11, jC - j10) : jC - j10;
            j6 = 0;
        } else {
            jMin = j11;
            j6 = j10;
        }
        return j$.util.stream.AbstractC6845y0.H(this, new j$.util.stream.D3(a0Var, j6, jMin), true);
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.Spliterator L(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        long j6;
        long j10;
        long jC = abstractC6732b.C(spliterator);
        long j11 = this.f48583n;
        if (jC > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.a0 a0Var = (j$.util.a0) abstractC6732b.T(spliterator);
            long j12 = this.f48582m;
            return new j$.util.stream.x3(a0Var, j12, j$.util.stream.AbstractC6845y0.B(j12, j11));
        }
        if (j$.util.stream.EnumC6756f3.ORDERED.u(abstractC6732b.G())) {
            return ((j$.util.stream.K0) new j$.util.stream.A2(this, abstractC6732b, spliterator, new j$.util.stream.C6740c2(2), this.f48582m, this.f48583n).invoke()).spliterator();
        }
        j$.util.a0 a0Var2 = (j$.util.a0) abstractC6732b.T(spliterator);
        long j13 = this.f48582m;
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
        return new j$.util.stream.D3(a0Var2, j10, j6);
    }

    @Override // j$.util.stream.AbstractC6732b
    final j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        return new j$.util.stream.C6834v2(this, interfaceC6810q2);
    }
}
