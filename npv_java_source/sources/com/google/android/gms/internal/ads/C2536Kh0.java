package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2536Kh0 extends java.util.AbstractMap implements java.io.Serializable {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final java.lang.Object f28995L = new java.lang.Object();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private transient java.lang.Object f28996C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    transient int[] f28997D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    transient java.lang.Object[] f28998E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    transient java.lang.Object[] f28999F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private transient int f29000G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private transient int f29001H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private transient java.util.Set f29002I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private transient java.util.Set f29003J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private transient java.util.Collection f29004K;

    C2536Kh0(int i6) {
        u(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B() {
        return (1 << (this.f29000G & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int C(java.lang.Object obj) {
        if (x()) {
            return -1;
        }
        int iB = com.google.android.gms.internal.ads.AbstractC2903Uh0.b(obj);
        int iB2 = B();
        java.lang.Object obj2 = this.f28996C;
        j$.util.Objects.requireNonNull(obj2);
        int iC = com.google.android.gms.internal.ads.AbstractC2573Lh0.c(obj2, iB & iB2);
        if (iC != 0) {
            int i6 = ~iB2;
            int i10 = iB & i6;
            do {
                int i11 = iC - 1;
                int i12 = a()[i11];
                if ((i12 & i6) == i10 && com.google.android.gms.internal.ads.AbstractC5700xg0.a(obj, b()[i11])) {
                    return i11;
                }
                iC = i12 & iB2;
            } while (iC != 0);
        }
        return -1;
    }

    private final int D(int i6, int i10, int i11, int i12) {
        int i13 = i10 - 1;
        java.lang.Object objD = com.google.android.gms.internal.ads.AbstractC2573Lh0.d(i10);
        if (i12 != 0) {
            com.google.android.gms.internal.ads.AbstractC2573Lh0.e(objD, i11 & i13, i12 + 1);
        }
        java.lang.Object obj = this.f28996C;
        j$.util.Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i14 = 0; i14 <= i6; i14++) {
            int iC = com.google.android.gms.internal.ads.AbstractC2573Lh0.c(obj, i14);
            while (iC != 0) {
                int i15 = iC - 1;
                int i16 = iArrA[i15];
                int i17 = ((~i6) & i16) | i14;
                int i18 = i17 & i13;
                int iC2 = com.google.android.gms.internal.ads.AbstractC2573Lh0.c(objD, i18);
                com.google.android.gms.internal.ads.AbstractC2573Lh0.e(objD, i18, iC);
                iArrA[i15] = ((~i13) & i17) | (iC2 & i13);
                iC = i16 & i6;
            }
        }
        this.f28996C = objD;
        F(i13);
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object E(java.lang.Object obj) {
        if (!x()) {
            int iB = B();
            java.lang.Object obj2 = this.f28996C;
            j$.util.Objects.requireNonNull(obj2);
            int iB2 = com.google.android.gms.internal.ads.AbstractC2573Lh0.b(obj, null, iB, obj2, a(), b(), null);
            if (iB2 != -1) {
                java.lang.Object obj3 = c()[iB2];
                v(iB2, iB);
                this.f29001H--;
                t();
                return obj3;
            }
        }
        return f28995L;
    }

    private final void F(int i6) {
        this.f29000G = ((32 - java.lang.Integer.numberOfLeadingZeros(i6)) & 31) | (this.f29000G & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] a() {
        int[] iArr = this.f28997D;
        j$.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object[] b() {
        java.lang.Object[] objArr = this.f28998E;
        j$.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object[] c() {
        java.lang.Object[] objArr = this.f28999F;
        j$.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    static /* synthetic */ java.lang.Object k(com.google.android.gms.internal.ads.C2536Kh0 c2536Kh0, int i6) {
        return c2536Kh0.b()[i6];
    }

    static /* synthetic */ java.lang.Object m(com.google.android.gms.internal.ads.C2536Kh0 c2536Kh0) {
        java.lang.Object obj = c2536Kh0.f28996C;
        j$.util.Objects.requireNonNull(obj);
        return obj;
    }

    static /* synthetic */ java.lang.Object o(com.google.android.gms.internal.ads.C2536Kh0 c2536Kh0, int i6) {
        return c2536Kh0.c()[i6];
    }

    static /* synthetic */ void s(com.google.android.gms.internal.ads.C2536Kh0 c2536Kh0, int i6, java.lang.Object obj) {
        c2536Kh0.c()[i6] = obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (x()) {
            return;
        }
        t();
        java.util.Map mapQ = q();
        if (mapQ != null) {
            this.f29000G = com.google.android.gms.internal.ads.AbstractC2466Ij0.c(size(), 3, 1073741823);
            mapQ.clear();
            this.f28996C = null;
        } else {
            java.util.Arrays.fill(b(), 0, this.f29001H, (java.lang.Object) null);
            java.util.Arrays.fill(c(), 0, this.f29001H, (java.lang.Object) null);
            java.lang.Object obj = this.f28996C;
            j$.util.Objects.requireNonNull(obj);
            if (obj instanceof byte[]) {
                java.util.Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                java.util.Arrays.fill((short[]) obj, (short) 0);
            } else {
                java.util.Arrays.fill((int[]) obj, 0);
            }
            java.util.Arrays.fill(a(), 0, this.f29001H, 0);
        }
        this.f29001H = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.util.Map mapQ = q();
        if (mapQ != null) {
            return mapQ.containsKey(obj);
        }
        return C(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        java.util.Map mapQ = q();
        if (mapQ != null) {
            return mapQ.containsValue(obj);
        }
        for (int i6 = 0; i6 < this.f29001H; i6++) {
            if (com.google.android.gms.internal.ads.AbstractC5700xg0.a(obj, c()[i6])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set = this.f29003J;
        if (set != null) {
            return set;
        }
        com.google.android.gms.internal.ads.C2314Eh0 c2314Eh0 = new com.google.android.gms.internal.ads.C2314Eh0(this);
        this.f29003J = c2314Eh0;
        return c2314Eh0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.util.Map mapQ = q();
        if (mapQ != null) {
            return mapQ.get(obj);
        }
        int iC = C(obj);
        if (iC == -1) {
            return null;
        }
        return c()[iC];
    }

    final int h() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    final int j(int i6) {
        int i10 = i6 + 1;
        if (i10 < this.f29001H) {
            return i10;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        java.util.Set set = this.f29002I;
        if (set != null) {
            return set;
        }
        com.google.android.gms.internal.ads.C2388Gh0 c2388Gh0 = new com.google.android.gms.internal.ads.C2388Gh0(this);
        this.f29002I = c2388Gh0;
        return c2388Gh0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0079 A[EDGE_INSN: B:17:0x0079->B:39:0x00f2 BREAK  A[LOOP:0: B:20:0x0090->B:46:0x0144]] */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        int iMin;
        if (x()) {
            com.google.android.gms.internal.ads.AbstractC2164Ag0.m(x(), "Arrays already allocated");
            int i6 = this.f29000G;
            int iMax = java.lang.Math.max(i6 + 1, 2);
            int iHighestOneBit = java.lang.Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = java.lang.Math.max(4, iHighestOneBit);
            this.f28996C = com.google.android.gms.internal.ads.AbstractC2573Lh0.d(iMax2);
            F(iMax2 - 1);
            this.f28997D = new int[i6];
            this.f28998E = new java.lang.Object[i6];
            this.f28999F = new java.lang.Object[i6];
        }
        java.util.Map mapQ = q();
        if (mapQ != null) {
            return mapQ.put(obj, obj2);
        }
        int[] iArrA = a();
        java.lang.Object[] objArrB = b();
        java.lang.Object[] objArrC = c();
        int i10 = this.f29001H;
        int i11 = i10 + 1;
        int iB = com.google.android.gms.internal.ads.AbstractC2903Uh0.b(obj);
        int iB2 = B();
        int i12 = iB & iB2;
        java.lang.Object obj3 = this.f28996C;
        j$.util.Objects.requireNonNull(obj3);
        int iC = com.google.android.gms.internal.ads.AbstractC2573Lh0.c(obj3, i12);
        if (iC != 0) {
            int i13 = ~iB2;
            int i14 = iB & i13;
            int i15 = 0;
            while (true) {
                int i16 = iC - 1;
                int i17 = iArrA[i16];
                int i18 = i17 & i13;
                if (i18 == i14 && com.google.android.gms.internal.ads.AbstractC5700xg0.a(obj, objArrB[i16])) {
                    java.lang.Object obj4 = objArrC[i16];
                    objArrC[i16] = obj2;
                    return obj4;
                }
                int i19 = i17 & iB2;
                i15++;
                if (i19 == 0) {
                    if (i15 < 9) {
                        if (i11 <= iB2) {
                            iArrA[i16] = (i11 & iB2) | i18;
                            break;
                        }
                        iB2 = D(iB2, com.google.android.gms.internal.ads.AbstractC2573Lh0.a(iB2), iB, i10);
                        break;
                    }
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(B() + 1, 1.0f);
                    int iH = h();
                    while (iH >= 0) {
                        linkedHashMap.put(b()[iH], c()[iH]);
                        iH = j(iH);
                    }
                    this.f28996C = linkedHashMap;
                    this.f28997D = null;
                    this.f28998E = null;
                    this.f28999F = null;
                    t();
                    return linkedHashMap.put(obj, obj2);
                }
                iC = i19;
            }
        } else {
            if (i11 > iB2) {
                iB2 = D(iB2, com.google.android.gms.internal.ads.AbstractC2573Lh0.a(iB2), iB, i10);
                break;
            }
            java.lang.Object obj5 = this.f28996C;
            j$.util.Objects.requireNonNull(obj5);
            com.google.android.gms.internal.ads.AbstractC2573Lh0.e(obj5, i12, i11);
        }
        int length = a().length;
        if (i11 > length && (iMin = java.lang.Math.min(1073741823, (java.lang.Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f28997D = java.util.Arrays.copyOf(a(), iMin);
            this.f28998E = java.util.Arrays.copyOf(b(), iMin);
            this.f28999F = java.util.Arrays.copyOf(c(), iMin);
        }
        a()[i10] = (~iB2) & iB;
        b()[i10] = obj;
        c()[i10] = obj2;
        this.f29001H = i11;
        t();
        return null;
    }

    final java.util.Map q() {
        java.lang.Object obj = this.f28996C;
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        java.util.Map mapQ = q();
        if (mapQ != null) {
            return mapQ.remove(obj);
        }
        java.lang.Object objE = E(obj);
        if (objE == f28995L) {
            return null;
        }
        return objE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        java.util.Map mapQ = q();
        return mapQ != null ? mapQ.size() : this.f29001H;
    }

    final void t() {
        this.f29000G += 32;
    }

    final void u(int i6) {
        this.f29000G = com.google.android.gms.internal.ads.AbstractC2466Ij0.c(i6, 1, 1073741823);
    }

    final void v(int i6, int i10) {
        java.lang.Object obj = this.f28996C;
        j$.util.Objects.requireNonNull(obj);
        int[] iArrA = a();
        java.lang.Object[] objArrB = b();
        java.lang.Object[] objArrC = c();
        int size = size();
        int i11 = size - 1;
        if (i6 >= i11) {
            objArrB[i6] = null;
            objArrC[i6] = null;
            iArrA[i6] = 0;
            return;
        }
        int i12 = i6 + 1;
        java.lang.Object obj2 = objArrB[i11];
        objArrB[i6] = obj2;
        objArrC[i6] = objArrC[i11];
        objArrB[i11] = null;
        objArrC[i11] = null;
        iArrA[i6] = iArrA[i11];
        iArrA[i11] = 0;
        int iB = com.google.android.gms.internal.ads.AbstractC2903Uh0.b(obj2) & i10;
        int iC = com.google.android.gms.internal.ads.AbstractC2573Lh0.c(obj, iB);
        if (iC == size) {
            com.google.android.gms.internal.ads.AbstractC2573Lh0.e(obj, iB, i12);
            return;
        }
        while (true) {
            int i13 = iC - 1;
            int i14 = iArrA[i13];
            int i15 = i14 & i10;
            if (i15 == size) {
                iArrA[i13] = (i14 & (~i10)) | (i10 & i12);
                return;
            }
            iC = i15;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection = this.f29004K;
        if (collection != null) {
            return collection;
        }
        com.google.android.gms.internal.ads.C2462Ih0 c2462Ih0 = new com.google.android.gms.internal.ads.C2462Ih0(this);
        this.f29004K = c2462Ih0;
        return c2462Ih0;
    }

    final boolean x() {
        return this.f28996C == null;
    }
}
