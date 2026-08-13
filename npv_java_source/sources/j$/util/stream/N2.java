package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class N2 extends j$.util.stream.B2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double[] f48299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48300d;

    @Override // j$.util.stream.InterfaceC6795n2, j$.util.stream.InterfaceC6810q2
    public final void accept(double d6) {
        double[] dArr = this.f48299c;
        int i6 = this.f48300d;
        this.f48300d = i6 + 1;
        dArr[i6] = d6;
    }

    @Override // j$.util.stream.AbstractC6775j2, j$.util.stream.InterfaceC6810q2
    public final void j() {
        int i6 = 0;
        java.util.Arrays.sort(this.f48299c, 0, this.f48300d);
        long j6 = this.f48300d;
        j$.util.stream.InterfaceC6810q2 interfaceC6810q2 = this.f48493a;
        interfaceC6810q2.k(j6);
        if (this.f48209b) {
            while (i6 < this.f48300d && !interfaceC6810q2.m()) {
                interfaceC6810q2.accept(this.f48299c[i6]);
                i6++;
            }
        } else {
            while (i6 < this.f48300d) {
                interfaceC6810q2.accept(this.f48299c[i6]);
                i6++;
            }
        }
        interfaceC6810q2.j();
        this.f48299c = null;
    }

    @Override // j$.util.stream.AbstractC6775j2, j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        if (j6 >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f48299c = new double[(int) j6];
    }
}
