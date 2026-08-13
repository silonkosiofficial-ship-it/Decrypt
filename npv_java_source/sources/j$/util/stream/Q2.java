package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class Q2 extends j$.util.stream.E2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Object[] f48321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48322e;

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        java.lang.Object[] objArr = this.f48321d;
        int i6 = this.f48322e;
        this.f48322e = i6 + 1;
        objArr[i6] = obj;
    }

    @Override // j$.util.stream.AbstractC6790m2, j$.util.stream.InterfaceC6810q2
    public final void j() {
        int i6 = 0;
        java.util.Arrays.sort(this.f48321d, 0, this.f48322e, this.f48228b);
        long j6 = this.f48322e;
        j$.util.stream.InterfaceC6810q2 interfaceC6810q2 = this.f48510a;
        interfaceC6810q2.k(j6);
        if (this.f48229c) {
            while (i6 < this.f48322e && !interfaceC6810q2.m()) {
                interfaceC6810q2.accept(this.f48321d[i6]);
                i6++;
            }
        } else {
            while (i6 < this.f48322e) {
                interfaceC6810q2.accept(this.f48321d[i6]);
                i6++;
            }
        }
        interfaceC6810q2.j();
        this.f48321d = null;
    }

    @Override // j$.util.stream.AbstractC6790m2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        if (j6 >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f48321d = new java.lang.Object[(int) j6];
    }
}
