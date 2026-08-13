package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class G2 extends j$.util.stream.C2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j$.util.stream.V2 f48241c;

    @Override // j$.util.stream.InterfaceC6800o2, j$.util.stream.InterfaceC6810q2
    public final void accept(int i6) {
        this.f48241c.accept(i6);
    }

    @Override // j$.util.stream.AbstractC6780k2, j$.util.stream.InterfaceC6810q2
    public final void j() {
        int[] iArr = (int[]) this.f48241c.d();
        java.util.Arrays.sort(iArr);
        long length = iArr.length;
        j$.util.stream.InterfaceC6810q2 interfaceC6810q2 = this.f48500a;
        interfaceC6810q2.k(length);
        int i6 = 0;
        if (this.f48213b) {
            int length2 = iArr.length;
            while (i6 < length2) {
                int i10 = iArr[i6];
                if (interfaceC6810q2.m()) {
                    break;
                }
                interfaceC6810q2.accept(i10);
                i6++;
            }
        } else {
            int length3 = iArr.length;
            while (i6 < length3) {
                interfaceC6810q2.accept(iArr[i6]);
                i6++;
            }
        }
        interfaceC6810q2.j();
    }

    @Override // j$.util.stream.AbstractC6780k2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        if (j6 >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f48241c = j6 > 0 ? new j$.util.stream.V2((int) j6) : new j$.util.stream.V2();
    }
}
