package I7;

/* JADX INFO: renamed from: I7.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1277m implements java.util.Comparator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p237x7.p f5445C;

    public C1277m(p237x7.p pVar) {
        this.f5445C = pVar;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return I7.AbstractC1278n.p(this.f5445C, obj, obj2);
    }
}
