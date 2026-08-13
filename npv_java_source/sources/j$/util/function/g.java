package j$.util.function;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements java.util.function.Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Predicate f48142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Predicate f48143c;

    public /* synthetic */ g(java.util.function.Predicate predicate, java.util.function.Predicate predicate2, int i6) {
        this.f48141a = i6;
        this.f48142b = predicate;
        this.f48143c = predicate2;
    }

    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        switch (this.f48141a) {
            case 0:
                break;
        }
        return j$.util.function.Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ java.util.function.Predicate negate() {
        switch (this.f48141a) {
            case 0:
                break;
        }
        return j$.util.function.Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        switch (this.f48141a) {
            case 0:
                break;
        }
        return j$.util.function.Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.f48141a) {
            case 0:
                return this.f48142b.test(obj) && this.f48143c.test(obj);
            default:
                return this.f48142b.test(obj) || this.f48143c.test(obj);
        }
    }
}
