package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class A1 extends j$.util.stream.AbstractC6845y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ java.util.function.LongBinaryOperator f48192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f48193i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A1(j$.util.stream.EnumC6761g3 enumC6761g3, java.util.function.LongBinaryOperator longBinaryOperator, long j6) {
        super(enumC6761g3);
        this.f48192h = longBinaryOperator;
        this.f48193i = j6;
    }

    @Override // j$.util.stream.AbstractC6845y0
    public final j$.util.stream.U1 e0() {
        return new j$.util.stream.S1(this.f48193i, this.f48192h);
    }
}
