package j$.util;

/* JADX INFO: loaded from: classes4.dex */
final class P extends j$.util.q0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ java.util.SortedSet f48023f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(java.util.SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f48023f = sortedSet;
    }

    @Override // j$.util.q0, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f48023f.comparator();
    }
}
