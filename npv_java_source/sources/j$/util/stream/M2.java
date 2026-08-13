package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class M2 extends j$.util.stream.E2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.ArrayList f48292d;

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        this.f48292d.add(obj);
    }

    @Override // j$.util.stream.AbstractC6790m2, j$.util.stream.InterfaceC6810q2
    public final void j() {
        j$.util.Q.r(this.f48292d, this.f48228b);
        long size = this.f48292d.size();
        j$.util.stream.InterfaceC6810q2 interfaceC6810q2 = this.f48510a;
        interfaceC6810q2.k(size);
        if (this.f48229c) {
            for (java.lang.Object obj : this.f48292d) {
                if (interfaceC6810q2.m()) {
                    break;
                } else {
                    interfaceC6810q2.accept(obj);
                }
            }
        } else {
            java.util.ArrayList arrayList = this.f48292d;
            j$.util.Objects.requireNonNull(interfaceC6810q2);
            j$.util.Collection.EL.a(arrayList, new j$.util.stream.C6727a(1, interfaceC6810q2));
        }
        interfaceC6810q2.j();
        this.f48292d = null;
    }

    @Override // j$.util.stream.AbstractC6790m2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        if (j6 >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f48292d = j6 >= 0 ? new java.util.ArrayList((int) j6) : new java.util.ArrayList();
    }
}
