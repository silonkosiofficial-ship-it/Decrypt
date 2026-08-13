package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1988z implements java.util.Comparator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.util.Comparator f20436C;

    public C1988z(java.util.Comparator comparator) {
        this.f20436C = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int iCompare = this.f20436C.compare(obj, obj2);
        return iCompare != 0 ? iCompare : p117l7.a.d(java.lang.Integer.valueOf(((K0.o) obj).o()), java.lang.Integer.valueOf(((K0.o) obj2).o()));
    }
}
