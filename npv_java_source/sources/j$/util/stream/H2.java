package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class H2 extends j$.util.stream.D2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j$.util.stream.X2 f48249c;

    @Override // j$.util.stream.InterfaceC6805p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f48249c.accept(j6);
    }

    @Override // j$.util.stream.AbstractC6785l2, j$.util.stream.InterfaceC6810q2
    public final void j() {
        long[] jArr = (long[]) this.f48249c.d();
        java.util.Arrays.sort(jArr);
        long length = jArr.length;
        j$.util.stream.InterfaceC6810q2 interfaceC6810q2 = this.f48504a;
        interfaceC6810q2.k(length);
        int i6 = 0;
        if (this.f48221b) {
            int length2 = jArr.length;
            while (i6 < length2) {
                long j6 = jArr[i6];
                if (interfaceC6810q2.m()) {
                    break;
                }
                interfaceC6810q2.accept(j6);
                i6++;
            }
        } else {
            int length3 = jArr.length;
            while (i6 < length3) {
                interfaceC6810q2.accept(jArr[i6]);
                i6++;
            }
        }
        interfaceC6810q2.j();
    }

    @Override // j$.util.stream.AbstractC6785l2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        if (j6 >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f48249c = j6 > 0 ? new j$.util.stream.X2((int) j6) : new j$.util.stream.X2();
    }
}
