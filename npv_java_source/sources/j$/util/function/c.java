package j$.util.function;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements java.util.function.DoubleUnaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.function.DoubleUnaryOperator f48132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.function.DoubleUnaryOperator f48133c;

    public /* synthetic */ c(java.util.function.DoubleUnaryOperator doubleUnaryOperator, java.util.function.DoubleUnaryOperator doubleUnaryOperator2, int i6) {
        this.f48131a = i6;
        this.f48132b = doubleUnaryOperator;
        this.f48133c = doubleUnaryOperator2;
    }

    public final /* synthetic */ java.util.function.DoubleUnaryOperator andThen(java.util.function.DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.f48131a) {
            case 0:
                break;
        }
        return j$.util.function.DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final double applyAsDouble(double d6) {
        switch (this.f48131a) {
            case 0:
                return this.f48132b.applyAsDouble(this.f48133c.applyAsDouble(d6));
            default:
                return this.f48133c.applyAsDouble(this.f48132b.applyAsDouble(d6));
        }
    }

    public final /* synthetic */ java.util.function.DoubleUnaryOperator compose(java.util.function.DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.f48131a) {
            case 0:
                break;
        }
        return j$.util.function.DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator);
    }
}
