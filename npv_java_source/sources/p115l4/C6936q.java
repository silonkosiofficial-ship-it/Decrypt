package p115l4;

/* JADX INFO: renamed from: l4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6936q implements p115l4.InterfaceC6922c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.util.Collection f50030a;

    C6936q(java.util.Collection collection) {
        this.f50030a = collection;
    }

    @Override // p115l4.InterfaceC6922c
    public final /* bridge */ /* synthetic */ java.lang.Object a(p115l4.AbstractC6931l abstractC6931l) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f50030a);
        return p115l4.AbstractC6934o.e(arrayList);
    }
}
