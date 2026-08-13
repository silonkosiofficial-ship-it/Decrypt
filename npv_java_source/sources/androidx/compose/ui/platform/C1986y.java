package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1986y implements java.util.Comparator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.util.Comparator f20424C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.util.Comparator f20425D;

    public C1986y(java.util.Comparator comparator, java.util.Comparator comparator2) {
        this.f20424C = comparator;
        this.f20425D = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int iCompare = this.f20424C.compare(obj, obj2);
        return iCompare != 0 ? iCompare : this.f20425D.compare(((K0.o) obj).q(), ((K0.o) obj2).q());
    }
}
