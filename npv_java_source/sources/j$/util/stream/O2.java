package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class O2 extends j$.util.stream.C2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f48306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48307d;

    @Override // j$.util.stream.InterfaceC6800o2, j$.util.stream.InterfaceC6810q2
    public final void accept(int i6) {
        int[] iArr = this.f48306c;
        int i10 = this.f48307d;
        this.f48307d = i10 + 1;
        iArr[i10] = i6;
    }

    @Override // j$.util.stream.AbstractC6780k2, j$.util.stream.InterfaceC6810q2
    public final void j() {
        int i6 = 0;
        java.util.Arrays.sort(this.f48306c, 0, this.f48307d);
        long j6 = this.f48307d;
        j$.util.stream.InterfaceC6810q2 interfaceC6810q2 = this.f48500a;
        interfaceC6810q2.k(j6);
        if (this.f48213b) {
            while (i6 < this.f48307d && !interfaceC6810q2.m()) {
                interfaceC6810q2.accept(this.f48306c[i6]);
                i6++;
            }
        } else {
            while (i6 < this.f48307d) {
                interfaceC6810q2.accept(this.f48306c[i6]);
                i6++;
            }
        }
        interfaceC6810q2.j();
        this.f48306c = null;
    }

    @Override // j$.util.stream.AbstractC6780k2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        if (j6 >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f48306c = new int[(int) j6];
    }
}
