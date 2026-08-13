package j$.util.function;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements java.util.function.BinaryOperator, java.util.function.Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f48128b;

    public /* synthetic */ a(int i6, java.lang.Object obj) {
        this.f48127a = i6;
        this.f48128b = obj;
    }

    public /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        return j$.util.function.Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        switch (this.f48127a) {
            case 0:
                break;
        }
        return j$.util.function.BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f48127a) {
            case 0:
                return ((java.util.Comparator) this.f48128b).compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return ((java.util.Comparator) this.f48128b).compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }

    public /* synthetic */ java.util.function.Predicate negate() {
        return j$.util.function.Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        return j$.util.function.Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        return !((java.util.function.Predicate) this.f48128b).test(obj);
    }
}
