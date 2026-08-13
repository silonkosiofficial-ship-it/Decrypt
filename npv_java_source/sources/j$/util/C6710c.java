package j$.util;

/* JADX INFO: renamed from: j$.util.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6710c implements java.util.Comparator, java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f48042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f48043c;

    public /* synthetic */ C6710c(java.util.Comparator comparator, java.lang.Object obj, int i6) {
        this.f48041a = i6;
        this.f48042b = comparator;
        this.f48043c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f48041a) {
            case 0:
                int iCompare = this.f48042b.compare(obj, obj2);
                return iCompare != 0 ? iCompare : ((java.util.Comparator) this.f48043c).compare(obj, obj2);
            default:
                java.util.function.Function function = (java.util.function.Function) this.f48043c;
                return this.f48042b.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
