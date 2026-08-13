package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class I1 extends j$.util.stream.AbstractC6845y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ java.util.function.DoubleBinaryOperator f48257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ double f48258i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I1(j$.util.stream.EnumC6761g3 enumC6761g3, java.util.function.DoubleBinaryOperator doubleBinaryOperator, double d6) {
        super(enumC6761g3);
        this.f48257h = doubleBinaryOperator;
        this.f48258i = d6;
    }

    @Override // j$.util.stream.AbstractC6845y0
    public final j$.util.stream.U1 e0() {
        return new j$.util.stream.D1(this.f48258i, this.f48257h);
    }
}
