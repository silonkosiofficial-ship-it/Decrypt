package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements java.util.function.BiConsumer, java.util.function.BiFunction, java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f48110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f48111c;

    public /* synthetic */ t(int i6, java.lang.Object obj, java.lang.Object obj2) {
        this.f48109a = i6;
        this.f48110b = obj;
        this.f48111c = obj2;
    }

    public /* synthetic */ t(java.util.function.BiFunction biFunction, java.util.function.Function function) {
        this.f48109a = 2;
        this.f48111c = biFunction;
        this.f48110b = function;
    }

    @Override // java.util.function.Consumer
    public void accept(java.lang.Object obj) {
        ((java.util.function.Consumer) this.f48110b).accept(obj);
        ((java.util.function.Consumer) this.f48111c).accept(obj);
    }

    @Override // java.util.function.BiConsumer
    public void accept(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f48109a) {
            case 0:
                break;
            default:
                ((java.util.function.BiConsumer) this.f48110b).accept(obj, obj2);
                ((java.util.function.BiConsumer) this.f48111c).accept(obj, obj2);
                return;
        }
        do {
            java.lang.Object objApply = ((java.util.function.BiFunction) this.f48111c).apply(obj, obj2);
            java.util.concurrent.ConcurrentMap concurrentMap = (java.util.concurrent.ConcurrentMap) this.f48110b;
            if (concurrentMap.replace(obj, obj2, objApply)) {
                return;
            } else {
                obj2 = concurrentMap.get(obj);
            }
        } while (obj2 != null);
    }

    public /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        switch (this.f48109a) {
            case 0:
                break;
        }
        return j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        return j$.util.function.BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        return ((java.util.function.Function) this.f48110b).apply(((java.util.function.BiFunction) this.f48111c).apply(obj, obj2));
    }
}
