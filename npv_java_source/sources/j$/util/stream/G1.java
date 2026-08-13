package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class G1 extends j$.util.stream.AbstractC6845y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f48240h;

    public /* synthetic */ G1(int i6) {
        this.f48240h = i6;
    }

    @Override // j$.util.stream.AbstractC6845y0, j$.util.stream.L3
    public final java.lang.Object b(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        switch (this.f48240h) {
            case 0:
                return j$.util.stream.EnumC6756f3.SIZED.u(abstractC6732b.G()) ? java.lang.Long.valueOf(spliterator.getExactSizeIfKnown()) : (java.lang.Long) super.b(abstractC6732b, spliterator);
            case 1:
                return j$.util.stream.EnumC6756f3.SIZED.u(abstractC6732b.G()) ? java.lang.Long.valueOf(spliterator.getExactSizeIfKnown()) : (java.lang.Long) super.b(abstractC6732b, spliterator);
            case 2:
                return j$.util.stream.EnumC6756f3.SIZED.u(abstractC6732b.G()) ? java.lang.Long.valueOf(spliterator.getExactSizeIfKnown()) : (java.lang.Long) super.b(abstractC6732b, spliterator);
            default:
                return j$.util.stream.EnumC6756f3.SIZED.u(abstractC6732b.G()) ? java.lang.Long.valueOf(spliterator.getExactSizeIfKnown()) : (java.lang.Long) super.b(abstractC6732b, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC6845y0, j$.util.stream.L3
    public final java.lang.Object c(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        switch (this.f48240h) {
            case 0:
                return j$.util.stream.EnumC6756f3.SIZED.u(abstractC6732b.G()) ? java.lang.Long.valueOf(spliterator.getExactSizeIfKnown()) : (java.lang.Long) super.c(abstractC6732b, spliterator);
            case 1:
                return j$.util.stream.EnumC6756f3.SIZED.u(abstractC6732b.G()) ? java.lang.Long.valueOf(spliterator.getExactSizeIfKnown()) : (java.lang.Long) super.c(abstractC6732b, spliterator);
            case 2:
                return j$.util.stream.EnumC6756f3.SIZED.u(abstractC6732b.G()) ? java.lang.Long.valueOf(spliterator.getExactSizeIfKnown()) : (java.lang.Long) super.c(abstractC6732b, spliterator);
            default:
                return j$.util.stream.EnumC6756f3.SIZED.u(abstractC6732b.G()) ? java.lang.Long.valueOf(spliterator.getExactSizeIfKnown()) : (java.lang.Long) super.c(abstractC6732b, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC6845y0, j$.util.stream.L3
    public final int d() {
        switch (this.f48240h) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return j$.util.stream.EnumC6756f3.f48460r;
    }

    @Override // j$.util.stream.AbstractC6845y0
    public final j$.util.stream.U1 e0() {
        switch (this.f48240h) {
            case 0:
                return new j$.util.stream.Y1();
            case 1:
                return new j$.util.stream.W1();
            case 2:
                return new j$.util.stream.Z1();
            default:
                return new j$.util.stream.X1();
        }
    }
}
