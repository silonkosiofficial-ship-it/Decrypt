package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements java.util.function.BinaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.function.BiConsumer f48538b;

    public /* synthetic */ r(java.util.function.BiConsumer biConsumer, int i6) {
        this.f48537a = i6;
        this.f48538b = biConsumer;
    }

    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        switch (this.f48537a) {
            case 0:
                break;
            case 1:
                break;
        }
        return j$.util.function.BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f48537a) {
            case 0:
                this.f48538b.accept(obj, obj2);
                break;
            case 1:
                this.f48538b.accept(obj, obj2);
                break;
            default:
                this.f48538b.accept(obj, obj2);
                break;
        }
        return obj;
    }
}
