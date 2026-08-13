package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class E1 extends j$.util.stream.AbstractC6845y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f48224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ java.lang.Object f48225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ java.lang.Object f48226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ java.lang.Object f48227k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E1(j$.util.stream.EnumC6761g3 enumC6761g3, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i6) {
        super(enumC6761g3);
        this.f48224h = i6;
        this.f48225i = obj;
        this.f48227k = obj2;
        this.f48226j = obj3;
    }

    public /* synthetic */ E1(j$.util.stream.EnumC6761g3 enumC6761g3, java.util.function.BinaryOperator binaryOperator, java.lang.Object obj, java.util.function.Supplier supplier, int i6) {
        this.f48224h = i6;
        this.f48225i = binaryOperator;
        this.f48227k = obj;
        this.f48226j = supplier;
    }

    @Override // j$.util.stream.AbstractC6845y0
    public final j$.util.stream.U1 e0() {
        switch (this.f48224h) {
            case 0:
                return new j$.util.stream.B1((java.util.function.Supplier) this.f48226j, (java.util.function.ObjLongConsumer) this.f48227k, (java.util.function.BinaryOperator) this.f48225i);
            case 1:
                return new j$.util.stream.H1((java.util.function.Supplier) this.f48226j, (java.util.function.ObjDoubleConsumer) this.f48227k, (java.util.function.BinaryOperator) this.f48225i);
            case 2:
                return new j$.util.stream.J1(this.f48226j, (java.util.function.BiFunction) this.f48227k, (java.util.function.BinaryOperator) this.f48225i);
            case 3:
                return new j$.util.stream.N1((java.util.function.Supplier) this.f48226j, (java.util.function.BiConsumer) this.f48227k, (java.util.function.BiConsumer) this.f48225i);
            default:
                return new j$.util.stream.R1((java.util.function.Supplier) this.f48226j, (java.util.function.ObjIntConsumer) this.f48227k, (java.util.function.BinaryOperator) this.f48225i);
        }
    }
}
