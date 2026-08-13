package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class F2 extends j$.util.stream.B2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j$.util.stream.T2 f48234c;

    @Override // j$.util.stream.InterfaceC6795n2, j$.util.stream.InterfaceC6810q2
    public final void accept(double d6) {
        this.f48234c.accept(d6);
    }

    @Override // j$.util.stream.AbstractC6775j2, j$.util.stream.InterfaceC6810q2
    public final void j() {
        double[] dArr = (double[]) this.f48234c.d();
        java.util.Arrays.sort(dArr);
        long length = dArr.length;
        j$.util.stream.InterfaceC6810q2 interfaceC6810q2 = this.f48493a;
        interfaceC6810q2.k(length);
        int i6 = 0;
        if (this.f48209b) {
            int length2 = dArr.length;
            while (i6 < length2) {
                double d6 = dArr[i6];
                if (interfaceC6810q2.m()) {
                    break;
                }
                interfaceC6810q2.accept(d6);
                i6++;
            }
        } else {
            int length3 = dArr.length;
            while (i6 < length3) {
                interfaceC6810q2.accept(dArr[i6]);
                i6++;
            }
        }
        interfaceC6810q2.j();
    }

    @Override // j$.util.stream.AbstractC6775j2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        if (j6 >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f48234c = j6 > 0 ? new j$.util.stream.T2((int) j6) : new j$.util.stream.T2();
    }
}
