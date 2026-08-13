package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class P1 extends j$.util.stream.AbstractC6845y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ java.util.function.IntBinaryOperator f48311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f48312i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P1(j$.util.stream.EnumC6761g3 enumC6761g3, java.util.function.IntBinaryOperator intBinaryOperator, int i6) {
        super(enumC6761g3);
        this.f48311h = intBinaryOperator;
        this.f48312i = i6;
    }

    @Override // j$.util.stream.AbstractC6845y0
    public final j$.util.stream.U1 e0() {
        return new j$.util.stream.O1(this.f48312i, this.f48311h);
    }
}
