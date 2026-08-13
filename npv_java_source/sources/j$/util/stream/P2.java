package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class P2 extends j$.util.stream.D2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f48313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48314d;

    @Override // j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        long[] jArr = this.f48313c;
        int i6 = this.f48314d;
        this.f48314d = i6 + 1;
        jArr[i6] = j6;
    }

    @Override // j$.util.stream.AbstractC6785l2, j$.util.stream.InterfaceC6810q2
    public final void j() {
        int i6 = 0;
        java.util.Arrays.sort(this.f48313c, 0, this.f48314d);
        long j6 = this.f48314d;
        j$.util.stream.InterfaceC6810q2 interfaceC6810q2 = this.f48504a;
        interfaceC6810q2.k(j6);
        if (this.f48221b) {
            while (i6 < this.f48314d && !interfaceC6810q2.m()) {
                interfaceC6810q2.accept(this.f48313c[i6]);
                i6++;
            }
        } else {
            while (i6 < this.f48314d) {
                interfaceC6810q2.accept(this.f48313c[i6]);
                i6++;
            }
        }
        interfaceC6810q2.j();
        this.f48313c = null;
    }

    @Override // j$.util.stream.AbstractC6785l2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        if (j6 >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f48313c = new long[(int) j6];
    }
}
