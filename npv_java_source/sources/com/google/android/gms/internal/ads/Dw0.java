package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Dw0 extends com.google.android.gms.internal.ads.AbstractC3753fv0 {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    static final int[] f26813J = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f26814E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3753fv0 f26815F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3753fv0 f26816G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f26817H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final int f26818I;

    private Dw0(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv1) {
        this.f26815F = abstractC3753fv0;
        this.f26816G = abstractC3753fv1;
        int iN = abstractC3753fv0.n();
        this.f26817H = iN;
        this.f26814E = iN + abstractC3753fv1.n();
        this.f26818I = java.lang.Math.max(abstractC3753fv0.s(), abstractC3753fv1.s()) + 1;
    }

    static com.google.android.gms.internal.ads.AbstractC3753fv0 Y(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv1) {
        if (abstractC3753fv1.n() == 0) {
            return abstractC3753fv0;
        }
        if (abstractC3753fv0.n() == 0) {
            return abstractC3753fv1;
        }
        int iN = abstractC3753fv0.n() + abstractC3753fv1.n();
        if (iN < 128) {
            return Z(abstractC3753fv0, abstractC3753fv1);
        }
        if (abstractC3753fv0 instanceof com.google.android.gms.internal.ads.Dw0) {
            com.google.android.gms.internal.ads.Dw0 dw0 = (com.google.android.gms.internal.ads.Dw0) abstractC3753fv0;
            if (dw0.f26816G.n() + abstractC3753fv1.n() < 128) {
                return new com.google.android.gms.internal.ads.Dw0(dw0.f26815F, Z(dw0.f26816G, abstractC3753fv1));
            }
            if (dw0.f26815F.s() > dw0.f26816G.s() && dw0.f26818I > abstractC3753fv1.s()) {
                return new com.google.android.gms.internal.ads.Dw0(dw0.f26815F, new com.google.android.gms.internal.ads.Dw0(dw0.f26816G, abstractC3753fv1));
            }
        }
        return iN >= a0(java.lang.Math.max(abstractC3753fv0.s(), abstractC3753fv1.s()) + 1) ? new com.google.android.gms.internal.ads.Dw0(abstractC3753fv0, abstractC3753fv1) : com.google.android.gms.internal.ads.Aw0.a(new com.google.android.gms.internal.ads.Aw0(null), abstractC3753fv0, abstractC3753fv1);
    }

    private static com.google.android.gms.internal.ads.AbstractC3753fv0 Z(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv1) {
        int iN = abstractC3753fv0.n();
        int iN2 = abstractC3753fv1.n();
        byte[] bArr = new byte[iN + iN2];
        abstractC3753fv0.W(bArr, 0, 0, iN);
        abstractC3753fv1.W(bArr, 0, iN, iN2);
        return new com.google.android.gms.internal.ads.C3424cv0(bArr);
    }

    static int a0(int i6) {
        int[] iArr = f26813J;
        int length = iArr.length;
        if (i6 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i6];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    protected final int C(int i6, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.f26817H;
        if (i12 <= i13) {
            return this.f26815F.C(i6, i10, i11);
        }
        if (i10 >= i13) {
            return this.f26816G.C(i6, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return this.f26816G.C(this.f26815F.C(i6, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    public final com.google.android.gms.internal.ads.AbstractC3753fv0 D(int i6, int i10) {
        int iO = com.google.android.gms.internal.ads.AbstractC3753fv0.O(i6, i10, this.f26814E);
        if (iO == 0) {
            return com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
        }
        if (iO == this.f26814E) {
            return this;
        }
        int i11 = this.f26817H;
        if (i10 <= i11) {
            return this.f26815F.D(i6, i10);
        }
        if (i6 >= i11) {
            return this.f26816G.D(i6 - i11, i10 - i11);
        }
        com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0 = this.f26815F;
        return new com.google.android.gms.internal.ads.Dw0(abstractC3753fv0.D(i6, abstractC3753fv0.n()), this.f26816G.D(0, i10 - this.f26817H));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    public final com.google.android.gms.internal.ads.AbstractC4301kv0 E() {
        boolean z6 = true;
        java.util.ArrayList<java.nio.ByteBuffer> arrayList = new java.util.ArrayList();
        java.lang.Object[] objArr = 0;
        com.google.android.gms.internal.ads.Bw0 bw0 = new com.google.android.gms.internal.ads.Bw0(this, null);
        while (bw0.hasNext()) {
            arrayList.add(bw0.next().M());
        }
        int i6 = com.google.android.gms.internal.ads.AbstractC4301kv0.f37030e;
        int i10 = 0;
        int iRemaining = 0;
        for (java.nio.ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i10 = byteBuffer.hasArray() ? i10 | 1 : byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
        }
        return i10 == 2 ? new com.google.android.gms.internal.ads.C3973hv0(arrayList, iRemaining, z6, objArr == true ? 1 : 0) : com.google.android.gms.internal.ads.AbstractC4301kv0.e(new com.google.android.gms.internal.ads.Wv0(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    final void N(com.google.android.gms.internal.ads.Wu0 wu0) {
        this.f26815F.N(wu0);
        this.f26816G.N(wu0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    /* JADX INFO: renamed from: Q */
    public final com.google.android.gms.internal.ads.InterfaceC3205av0 iterator() {
        return new com.google.android.gms.internal.ads.C5952zw0(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    public final byte e(int i6) {
        com.google.android.gms.internal.ads.AbstractC3753fv0.V(i6, this.f26814E);
        return f(i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.AbstractC3753fv0)) {
            return false;
        }
        com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0 = (com.google.android.gms.internal.ads.AbstractC3753fv0) obj;
        if (this.f26814E != abstractC3753fv0.n()) {
            return false;
        }
        if (this.f26814E == 0) {
            return true;
        }
        int iP = P();
        int iP2 = abstractC3753fv0.P();
        if (iP != 0 && iP2 != 0 && iP != iP2) {
            return false;
        }
        com.google.android.gms.internal.ads.Cw0 cw0 = null;
        com.google.android.gms.internal.ads.Bw0 bw0 = new com.google.android.gms.internal.ads.Bw0(this, cw0);
        com.google.android.gms.internal.ads.AbstractC3315bv0 abstractC3315bv0B = bw0.next();
        com.google.android.gms.internal.ads.Bw0 bw1 = new com.google.android.gms.internal.ads.Bw0(abstractC3753fv0, cw0);
        com.google.android.gms.internal.ads.AbstractC3315bv0 abstractC3315bv0B2 = bw1.next();
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int iN = abstractC3315bv0B.n() - i6;
            int iN2 = abstractC3315bv0B2.n() - i10;
            int iMin = java.lang.Math.min(iN, iN2);
            if (!(i6 == 0 ? abstractC3315bv0B.X(abstractC3315bv0B2, i10, iMin) : abstractC3315bv0B2.X(abstractC3315bv0B, i6, iMin))) {
                return false;
            }
            i11 += iMin;
            int i12 = this.f26814E;
            if (i11 >= i12) {
                if (i11 == i12) {
                    return true;
                }
                throw new java.lang.IllegalStateException();
            }
            if (iMin == iN) {
                abstractC3315bv0B = bw0.next();
                i6 = 0;
            } else {
                i6 += iMin;
            }
            if (iMin == iN2) {
                abstractC3315bv0B = abstractC3315bv0B;
                abstractC3315bv0B2 = bw1.next();
                i10 = 0;
            } else {
                abstractC3315bv0B = abstractC3315bv0B;
                i10 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    final byte f(int i6) {
        int i10 = this.f26817H;
        return i6 < i10 ? this.f26815F.f(i6) : this.f26816G.f(i6 - i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.C5952zw0(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    public final int n() {
        return this.f26814E;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    protected final void o(byte[] bArr, int i6, int i10, int i11) {
        int i12 = i6 + i11;
        int i13 = this.f26817H;
        if (i12 <= i13) {
            this.f26815F.o(bArr, i6, i10, i11);
        } else {
            if (i6 >= i13) {
                this.f26816G.o(bArr, i6 - i13, i10, i11);
                return;
            }
            int i14 = i13 - i6;
            this.f26815F.o(bArr, i6, i10, i14);
            this.f26816G.o(bArr, 0, i10 + i14, i11 - i14);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    protected final int s() {
        return this.f26818I;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    protected final boolean w() {
        return this.f26814E >= a0(this.f26818I);
    }
}
