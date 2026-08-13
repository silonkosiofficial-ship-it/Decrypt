package j$.util;

/* JADX INFO: renamed from: j$.util.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6709b implements java.util.Comparator, java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f48039b;

    public /* synthetic */ C6709b(int i6, java.lang.Object obj) {
        this.f48038a = i6;
        this.f48039b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f48038a) {
            case 0:
                java.util.function.ToIntFunction toIntFunction = (java.util.function.ToIntFunction) this.f48039b;
                return java.lang.Integer.compare(toIntFunction.applyAsInt(obj), toIntFunction.applyAsInt(obj2));
            case 1:
                java.util.function.ToDoubleFunction toDoubleFunction = (java.util.function.ToDoubleFunction) this.f48039b;
                return java.lang.Double.compare(toDoubleFunction.applyAsDouble(obj), toDoubleFunction.applyAsDouble(obj2));
            case 2:
                java.util.function.Function function = (java.util.function.Function) this.f48039b;
                return ((java.lang.Comparable) function.apply(obj)).compareTo(function.apply(obj2));
            default:
                java.util.function.ToLongFunction toLongFunction = (java.util.function.ToLongFunction) this.f48039b;
                return java.lang.Long.compare(toLongFunction.applyAsLong(obj), toLongFunction.applyAsLong(obj2));
        }
    }
}
