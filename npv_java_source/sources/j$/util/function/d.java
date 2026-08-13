package j$.util.function;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements java.util.function.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Function f48135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Function f48136c;

    public /* synthetic */ d(java.util.function.Function function, java.util.function.Function function2, int i6) {
        this.f48134a = i6;
        this.f48135b = function;
        this.f48136c = function2;
    }

    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.f48134a) {
            case 0:
                break;
        }
        return j$.util.function.Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.f48134a) {
            case 0:
                return this.f48136c.apply(this.f48135b.apply(obj));
            default:
                return this.f48135b.apply(this.f48136c.apply(obj));
        }
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.f48134a) {
            case 0:
                break;
        }
        return j$.util.function.Function$CC.$default$compose(this, function);
    }
}
