package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class L1 extends j$.util.stream.AbstractC6845y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ java.util.function.BinaryOperator f48278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ java.util.function.BiConsumer f48279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ java.util.function.Supplier f48280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.Collector f48281k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L1(j$.util.stream.EnumC6761g3 enumC6761g3, java.util.function.BinaryOperator binaryOperator, java.util.function.BiConsumer biConsumer, java.util.function.Supplier supplier, j$.util.stream.Collector collector) {
        super(enumC6761g3);
        this.f48278h = binaryOperator;
        this.f48279i = biConsumer;
        this.f48280j = supplier;
        this.f48281k = collector;
    }

    @Override // j$.util.stream.AbstractC6845y0, j$.util.stream.L3
    public final int d() {
        if (this.f48281k.characteristics().contains(j$.util.stream.Collector.Characteristics.UNORDERED)) {
            return j$.util.stream.EnumC6756f3.f48460r;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC6845y0
    public final j$.util.stream.U1 e0() {
        return new j$.util.stream.M1(this.f48280j, this.f48279i, this.f48278h);
    }
}
