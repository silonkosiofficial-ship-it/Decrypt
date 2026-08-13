package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class C1 extends j$.util.stream.AbstractC6845y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f48211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ java.lang.Object f48212i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1(j$.util.stream.EnumC6761g3 enumC6761g3, java.lang.Object obj, int i6) {
        super(enumC6761g3);
        this.f48211h = i6;
        this.f48212i = obj;
    }

    @Override // j$.util.stream.AbstractC6845y0
    public final j$.util.stream.U1 e0() {
        switch (this.f48211h) {
            case 0:
                return new j$.util.stream.T1((java.util.function.LongBinaryOperator) this.f48212i);
            case 1:
                return new j$.util.stream.F1((java.util.function.DoubleBinaryOperator) this.f48212i);
            case 2:
                return new j$.util.stream.K1((java.util.function.BinaryOperator) this.f48212i);
            default:
                return new j$.util.stream.Q1((java.util.function.IntBinaryOperator) this.f48212i);
        }
    }
}
