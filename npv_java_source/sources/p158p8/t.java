package p158p8;

/* JADX INFO: loaded from: classes2.dex */
class t extends p158p8.d {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final int[] f52832J;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f52833D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p158p8.d f52834E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p158p8.d f52835F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f52836G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f52837H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f52838I;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Stack f52839a;

        private b() {
            this.f52839a = new java.util.Stack();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public p158p8.d b(p158p8.d dVar, p158p8.d dVar2) {
            c(dVar);
            c(dVar2);
            p158p8.d tVar = (p158p8.d) this.f52839a.pop();
            while (!this.f52839a.isEmpty()) {
                tVar = new p158p8.t((p158p8.d) this.f52839a.pop(), tVar);
            }
            return tVar;
        }

        private void c(p158p8.d dVar) {
            if (dVar.D()) {
                e(dVar);
                return;
            }
            if (dVar instanceof p158p8.t) {
                p158p8.t tVar = (p158p8.t) dVar;
                c(tVar.f52834E);
                c(tVar.f52835F);
            } else {
                java.lang.String strValueOf = java.lang.String.valueOf(dVar.getClass());
                java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(strValueOf);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }

        private int d(int i6) {
            int iBinarySearch = java.util.Arrays.binarySearch(p158p8.t.f52832J, i6);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(p158p8.d dVar) {
            int iD = d(dVar.size());
            int i6 = p158p8.t.f52832J[iD + 1];
            if (this.f52839a.isEmpty() || ((p158p8.d) this.f52839a.peek()).size() >= i6) {
                this.f52839a.push(dVar);
                return;
            }
            int i10 = p158p8.t.f52832J[iD];
            p158p8.d tVar = (p158p8.d) this.f52839a.pop();
            while (true) {
                if (this.f52839a.isEmpty() || ((p158p8.d) this.f52839a.peek()).size() >= i10) {
                    break;
                } else {
                    tVar = new p158p8.t((p158p8.d) this.f52839a.pop(), tVar);
                }
            }
            p158p8.t tVar2 = new p158p8.t(tVar, dVar);
            while (!this.f52839a.isEmpty()) {
                if (((p158p8.d) this.f52839a.peek()).size() >= p158p8.t.f52832J[d(tVar2.size()) + 1]) {
                    break;
                } else {
                    tVar2 = new p158p8.t((p158p8.d) this.f52839a.pop(), tVar2);
                }
            }
            this.f52839a.push(tVar2);
        }
    }

    private static class c implements java.util.Iterator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.util.Stack f52840C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private p158p8.o f52841D;

        private c(p158p8.d dVar) {
            this.f52840C = new java.util.Stack();
            this.f52841D = b(dVar);
        }

        private p158p8.o b(p158p8.d dVar) {
            while (dVar instanceof p158p8.t) {
                p158p8.t tVar = (p158p8.t) dVar;
                this.f52840C.push(tVar);
                dVar = tVar.f52834E;
            }
            return (p158p8.o) dVar;
        }

        private p158p8.o c() {
            while (!this.f52840C.isEmpty()) {
                p158p8.o oVarB = b(((p158p8.t) this.f52840C.pop()).f52835F);
                if (!oVarB.isEmpty()) {
                    return oVarB;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public p158p8.o next() {
            p158p8.o oVar = this.f52841D;
            if (oVar == null) {
                throw new java.util.NoSuchElementException();
            }
            this.f52841D = c();
            return oVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52841D != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private class d implements p8.d.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final p8.t.c f52842C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private p8.d.a f52843D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        int f52844E;

        private d() {
            p8.t.c cVar = new p8.t.c(p158p8.t.this);
            this.f52842C = cVar;
            this.f52843D = cVar.next().iterator();
            this.f52844E = p158p8.t.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.lang.Byte next() {
            return java.lang.Byte.valueOf(g());
        }

        @Override // p8.d.a
        public byte g() {
            if (!this.f52843D.hasNext()) {
                this.f52843D = this.f52842C.next().iterator();
            }
            this.f52844E--;
            return this.f52843D.g();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52844E > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i6 = 1;
        int i10 = 1;
        while (i6 > 0) {
            arrayList.add(java.lang.Integer.valueOf(i6));
            int i11 = i10 + i6;
            i10 = i6;
            i6 = i11;
        }
        arrayList.add(Integer.MAX_VALUE);
        f52832J = new int[arrayList.size()];
        int i12 = 0;
        while (true) {
            int[] iArr = f52832J;
            if (i12 >= iArr.length) {
                return;
            }
            iArr[i12] = ((java.lang.Integer) arrayList.get(i12)).intValue();
            i12++;
        }
    }

    private t(p158p8.d dVar, p158p8.d dVar2) {
        this.f52838I = 0;
        this.f52834E = dVar;
        this.f52835F = dVar2;
        int size = dVar.size();
        this.f52836G = size;
        this.f52833D = size + dVar2.size();
        this.f52837H = java.lang.Math.max(dVar.C(), dVar2.C()) + 1;
    }

    static p158p8.d Y(p158p8.d dVar, p158p8.d dVar2) {
        p158p8.t tVar = dVar instanceof p158p8.t ? (p158p8.t) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar.size() + dVar2.size();
            if (size < 128) {
                return Z(dVar, dVar2);
            }
            if (tVar != null && tVar.f52835F.size() + dVar2.size() < 128) {
                dVar2 = new p158p8.t(tVar.f52834E, Z(tVar.f52835F, dVar2));
            } else {
                if (tVar == null || tVar.f52834E.C() <= tVar.f52835F.C() || tVar.C() <= dVar2.C()) {
                    return size >= f52832J[java.lang.Math.max(dVar.C(), dVar2.C()) + 1] ? new p158p8.t(dVar, dVar2) : new p8.t.b().b(dVar, dVar2);
                }
                dVar2 = new p158p8.t(tVar.f52834E, new p158p8.t(tVar.f52835F, dVar2));
            }
        }
        return dVar2;
    }

    private static p158p8.o Z(p158p8.d dVar, p158p8.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.s(bArr, 0, 0, size);
        dVar2.s(bArr, 0, size, size2);
        return new p158p8.o(bArr);
    }

    private boolean a0(p158p8.d dVar) {
        p8.t.c cVar = new p8.t.c(this);
        p158p8.o oVar = (p158p8.o) cVar.next();
        p8.t.c cVar2 = new p8.t.c(dVar);
        p158p8.o oVar2 = (p158p8.o) cVar2.next();
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int size = oVar.size() - i6;
            int size2 = oVar2.size() - i10;
            int iMin = java.lang.Math.min(size, size2);
            if (!(i6 == 0 ? oVar.V(oVar2, i10, iMin) : oVar2.V(oVar, i6, iMin))) {
                return false;
            }
            i11 += iMin;
            int i12 = this.f52833D;
            if (i11 >= i12) {
                if (i11 == i12) {
                    return true;
                }
                throw new java.lang.IllegalStateException();
            }
            if (iMin == size) {
                oVar = (p158p8.o) cVar.next();
                i6 = 0;
            } else {
                i6 += iMin;
            }
            if (iMin == size2) {
                oVar2 = (p158p8.o) cVar2.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
        }
    }

    @Override // p158p8.d
    protected int C() {
        return this.f52837H;
    }

    @Override // p158p8.d
    protected boolean D() {
        return this.f52833D >= f52832J[this.f52837H];
    }

    @Override // p158p8.d
    public boolean E() {
        int iO = this.f52834E.O(0, 0, this.f52836G);
        p158p8.d dVar = this.f52835F;
        return dVar.O(iO, 0, dVar.size()) == 0;
    }

    @Override // p158p8.d
    protected int N(int i6, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.f52836G;
        if (i12 <= i13) {
            return this.f52834E.N(i6, i10, i11);
        }
        if (i10 >= i13) {
            return this.f52835F.N(i6, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return this.f52835F.N(this.f52834E.N(i6, i10, i14), 0, i11 - i14);
    }

    @Override // p158p8.d
    protected int O(int i6, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.f52836G;
        if (i12 <= i13) {
            return this.f52834E.O(i6, i10, i11);
        }
        if (i10 >= i13) {
            return this.f52835F.O(i6, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return this.f52835F.O(this.f52834E.O(i6, i10, i14), 0, i11 - i14);
    }

    @Override // p158p8.d
    protected int P() {
        return this.f52838I;
    }

    @Override // p158p8.d
    public java.lang.String R(java.lang.String str) {
        return new java.lang.String(Q(), str);
    }

    @Override // p158p8.d
    void U(java.io.OutputStream outputStream, int i6, int i10) {
        p158p8.d dVar;
        int i11 = i6 + i10;
        int i12 = this.f52836G;
        if (i11 <= i12) {
            dVar = this.f52834E;
        } else {
            if (i6 < i12) {
                int i13 = i12 - i6;
                this.f52834E.U(outputStream, i6, i13);
                this.f52835F.U(outputStream, 0, i10 - i13);
                return;
            }
            dVar = this.f52835F;
            i6 -= i12;
        }
        dVar.U(outputStream, i6, i10);
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public p8.d.a iterator() {
        return new p8.t.d();
    }

    public boolean equals(java.lang.Object obj) {
        int iP;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p158p8.d)) {
            return false;
        }
        p158p8.d dVar = (p158p8.d) obj;
        if (this.f52833D != dVar.size()) {
            return false;
        }
        if (this.f52833D == 0) {
            return true;
        }
        if (this.f52838I == 0 || (iP = dVar.P()) == 0 || this.f52838I == iP) {
            return a0(dVar);
        }
        return false;
    }

    public int hashCode() {
        int iN = this.f52838I;
        if (iN == 0) {
            int i6 = this.f52833D;
            iN = N(i6, 0, i6);
            if (iN == 0) {
                iN = 1;
            }
            this.f52838I = iN;
        }
        return iN;
    }

    @Override // p158p8.d
    public int size() {
        return this.f52833D;
    }

    @Override // p158p8.d
    protected void w(byte[] bArr, int i6, int i10, int i11) {
        p158p8.d dVar;
        int i12 = i6 + i11;
        int i13 = this.f52836G;
        if (i12 <= i13) {
            dVar = this.f52834E;
        } else {
            if (i6 < i13) {
                int i14 = i13 - i6;
                this.f52834E.w(bArr, i6, i10, i14);
                this.f52835F.w(bArr, 0, i10 + i14, i11 - i14);
                return;
            }
            dVar = this.f52835F;
            i6 -= i13;
        }
        dVar.w(bArr, i6, i10, i11);
    }
}
