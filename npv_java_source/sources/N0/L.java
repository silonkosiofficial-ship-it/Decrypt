package N0;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.text.Layout f7532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f7533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f7534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f7535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private char[] f7536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f7537f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f7540c;

        public a(int i6, int i10, boolean z6) {
            this.f7538a = i6;
            this.f7539b = i10;
            this.f7540c = z6;
        }

        public final int a() {
            return this.f7539b;
        }

        public final int b() {
            return this.f7538a;
        }

        public final boolean c() {
            return this.f7540c;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof N0.L.a)) {
                return false;
            }
            N0.L.a aVar = (N0.L.a) obj;
            return this.f7538a == aVar.f7538a && this.f7539b == aVar.f7539b && this.f7540c == aVar.f7540c;
        }

        public int hashCode() {
            return (((this.f7538a * 31) + this.f7539b) * 31) + p190t.h.a(this.f7540c);
        }

        public java.lang.String toString() {
            return "BidiRun(start=" + this.f7538a + ", end=" + this.f7539b + ", isRtl=" + this.f7540c + ')';
        }
    }

    public L(android.text.Layout layout) {
        this.f7532a = layout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = 0;
        do {
            int iO0 = S8.r.o0(this.f7532a.getText(), '\n', length, false, 4, null);
            length = iO0 < 0 ? this.f7532a.getText().length() : iO0 + 1;
            arrayList.add(java.lang.Integer.valueOf(length));
        } while (length < this.f7532a.getText().length());
        this.f7533b = arrayList;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            arrayList2.add(null);
        }
        this.f7534c = arrayList2;
        this.f7535d = new boolean[this.f7533b.size()];
        this.f7537f = this.f7533b.size();
    }

    private final float b(int i6, boolean z6) {
        int iG = E7.j.g(i6, this.f7532a.getLineEnd(this.f7532a.getLineForOffset(i6)));
        return z6 ? this.f7532a.getPrimaryHorizontal(iG) : this.f7532a.getSecondaryHorizontal(iG);
    }

    public static /* synthetic */ int g(N0.L l6, int i6, boolean z6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        return l6.f(i6, z6);
    }

    private final int k(int i6, int i10) {
        while (i6 > i10 && i(this.f7532a.getText().charAt(i6 - 1))) {
            i6--;
        }
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    public final java.text.Bidi a(int i6) {
        java.text.Bidi bidi;
        if (this.f7535d[i6]) {
            return (java.text.Bidi) this.f7534c.get(i6);
        }
        int iIntValue = i6 == 0 ? 0 : ((java.lang.Number) this.f7533b.get(i6 - 1)).intValue();
        int iIntValue2 = ((java.lang.Number) this.f7533b.get(i6)).intValue();
        int i10 = iIntValue2 - iIntValue;
        char[] cArr = this.f7536e;
        if (cArr == null || cArr.length < i10) {
            cArr = new char[i10];
        }
        char[] cArr2 = cArr;
        android.text.TextUtils.getChars(this.f7532a.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (java.text.Bidi.requiresBidi(cArr2, 0, i10)) {
            bidi = new java.text.Bidi(cArr2, 0, null, 0, i10, j(i6) ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        this.f7534c.set(i6, bidi);
        this.f7535d[i6] = true;
        if (bidi != null) {
            char[] cArr3 = this.f7536e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f7536e = cArr2;
        return bidi;
    }

    public final float c(int i6, boolean z6, boolean z10) {
        int iK = i6;
        if (!z10) {
            return b(i6, z6);
        }
        int iA = N0.K.a(this.f7532a, iK, z10);
        int lineStart = this.f7532a.getLineStart(iA);
        int lineEnd = this.f7532a.getLineEnd(iA);
        if (iK != lineStart && iK != lineEnd) {
            return b(i6, z6);
        }
        if (iK == 0 || iK == this.f7532a.getText().length()) {
            return b(i6, z6);
        }
        int iF = f(iK, z10);
        boolean zJ = j(iF);
        int iK2 = k(lineEnd, lineStart);
        int iH = h(iF);
        int i10 = lineStart - iH;
        int i11 = iK2 - iH;
        java.text.Bidi bidiA = a(iF);
        java.text.Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i10, i11) : null;
        boolean z11 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.f7532a.isRtlCharAt(lineStart);
            if (z6 || zJ == zIsRtlCharAt) {
                zJ = !zJ;
            }
            if (iK == lineStart) {
                z11 = zJ;
            } else if (!zJ) {
                z11 = true;
            }
            android.text.Layout layout = this.f7532a;
            return z11 ? layout.getLineLeft(iA) : layout.getLineRight(iA);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        N0.L.a[] aVarArr = new N0.L.a[runCount];
        for (int i12 = 0; i12 < runCount; i12++) {
            aVarArr[i12] = new N0.L.a(bidiCreateLineBidi.getRunStart(i12) + lineStart, bidiCreateLineBidi.getRunLimit(i12) + lineStart, bidiCreateLineBidi.getRunLevel(i12) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i13 = 0; i13 < runCount2; i13++) {
            bArr[i13] = (byte) bidiCreateLineBidi.getRunLevel(i13);
        }
        java.text.Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        int i14 = -1;
        if (iK == lineStart) {
            for (int i15 = 0; i15 < runCount; i15++) {
                if (aVarArr[i15].b() == iK) {
                    i14 = i15;
                    break;
                }
            }
            N0.L.a aVar = aVarArr[i14];
            if (z6 || zJ == aVar.c()) {
                zJ = !zJ;
            }
            if (i14 == 0 && zJ) {
                return this.f7532a.getLineLeft(iA);
            }
            if (i14 == p097j7.AbstractC6872n.e0(aVarArr) && !zJ) {
                return this.f7532a.getLineRight(iA);
            }
            android.text.Layout layout2 = this.f7532a;
            return zJ ? layout2.getPrimaryHorizontal(aVarArr[i14 - 1].b()) : layout2.getPrimaryHorizontal(aVarArr[i14 + 1].b());
        }
        if (iK > iK2) {
            iK = k(iK, lineStart);
        }
        for (int i16 = 0; i16 < runCount; i16++) {
            if (aVarArr[i16].a() == iK) {
                i14 = i16;
                break;
            }
        }
        N0.L.a aVar2 = aVarArr[i14];
        if (!z6 && zJ != aVar2.c()) {
            zJ = !zJ;
        }
        if (i14 == 0 && zJ) {
            return this.f7532a.getLineLeft(iA);
        }
        if (i14 == p097j7.AbstractC6872n.e0(aVarArr) && !zJ) {
            return this.f7532a.getLineRight(iA);
        }
        android.text.Layout layout3 = this.f7532a;
        return zJ ? layout3.getPrimaryHorizontal(aVarArr[i14 - 1].a()) : layout3.getPrimaryHorizontal(aVarArr[i14 + 1].a());
    }

    public final N0.L.a[] d(int i6) {
        java.text.Bidi bidiCreateLineBidi;
        int lineStart = this.f7532a.getLineStart(i6);
        int lineEnd = this.f7532a.getLineEnd(i6);
        int iG = g(this, lineStart, false, 2, null);
        int iH = h(iG);
        int i10 = lineStart - iH;
        int i11 = lineEnd - iH;
        java.text.Bidi bidiA = a(iG);
        if (bidiA == null || (bidiCreateLineBidi = bidiA.createLineBidi(i10, i11)) == null) {
            return new N0.L.a[]{new N0.L.a(lineStart, lineEnd, this.f7532a.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        N0.L.a[] aVarArr = new N0.L.a[runCount];
        for (int i12 = 0; i12 < runCount; i12++) {
            aVarArr[i12] = new N0.L.a(bidiCreateLineBidi.getRunStart(i12) + lineStart, bidiCreateLineBidi.getRunLimit(i12) + lineStart, bidiCreateLineBidi.getRunLevel(i12) % 2 == 1);
        }
        return aVarArr;
    }

    public final int e(int i6) {
        return k(this.f7532a.getLineEnd(i6), this.f7532a.getLineStart(i6));
    }

    public final int f(int i6, boolean z6) {
        int iL = p097j7.AbstractC6879v.l(this.f7533b, java.lang.Integer.valueOf(i6), 0, 0, 6, null);
        int i10 = iL < 0 ? -(iL + 1) : iL + 1;
        if (z6 && i10 > 0) {
            int i11 = i10 - 1;
            if (i6 == ((java.lang.Number) this.f7533b.get(i11)).intValue()) {
                return i11;
            }
        }
        return i10;
    }

    public final int h(int i6) {
        if (i6 == 0) {
            return 0;
        }
        return ((java.lang.Number) this.f7533b.get(i6 - 1)).intValue();
    }

    public final boolean i(char c6) {
        return c6 == ' ' || c6 == '\n' || c6 == 5760 || (p247y7.AbstractC7350t.g(c6, 8192) >= 0 && p247y7.AbstractC7350t.g(c6, 8202) <= 0 && c6 != 8199) || c6 == 8287 || c6 == 12288;
    }

    public final boolean j(int i6) {
        return this.f7532a.getParagraphDirection(this.f7532a.getLineForOffset(h(i6))) == -1;
    }
}
