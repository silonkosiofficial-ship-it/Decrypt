package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ui0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2905Ui0 extends com.google.android.gms.internal.ads.AbstractC3727fi0 {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    static final com.google.android.gms.internal.ads.AbstractC3727fi0 f32256I = new com.google.android.gms.internal.ads.C2905Ui0(null, new java.lang.Object[0], 0);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final transient java.lang.Object f32257F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final transient java.lang.Object[] f32258G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final transient int f32259H;

    private C2905Ui0(java.lang.Object obj, java.lang.Object[] objArr, int i6) {
        this.f32257F = obj;
        this.f32258G = objArr;
        this.f32259H = i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v7 */
    static com.google.android.gms.internal.ads.C2905Ui0 k(int i6, java.lang.Object[] objArr, com.google.android.gms.internal.ads.C3617ei0 c3617ei0) {
        short[] sArr;
        char c6;
        char c10;
        ?? r6;
        ?? r10;
        ?? r11;
        int i10 = i6;
        java.lang.Object[] objArrCopyOf = objArr;
        if (i10 == 0) {
            return (com.google.android.gms.internal.ads.C2905Ui0) f32256I;
        }
        com.google.android.gms.internal.ads.C3508di0 c3508di0 = null;
        ?? r12 = 0;
        com.google.android.gms.internal.ads.C3508di0 c3508di1 = null;
        com.google.android.gms.internal.ads.C3508di0 c3508di2 = null;
        int i11 = 1;
        if (i10 == 1) {
            java.lang.Object obj = objArrCopyOf[0];
            j$.util.Objects.requireNonNull(obj);
            java.lang.Object obj2 = objArrCopyOf[1];
            j$.util.Objects.requireNonNull(obj2);
            com.google.android.gms.internal.ads.AbstractC5812yh0.b(obj, obj2);
            return new com.google.android.gms.internal.ads.C2905Ui0(null, objArrCopyOf, 1);
        }
        com.google.android.gms.internal.ads.AbstractC2164Ag0.b(i10, objArrCopyOf.length >> 1, "index");
        int iW = com.google.android.gms.internal.ads.AbstractC3947hi0.w(i6);
        if (i10 == 1) {
            java.lang.Object obj3 = objArrCopyOf[0];
            j$.util.Objects.requireNonNull(obj3);
            java.lang.Object obj4 = objArrCopyOf[1];
            j$.util.Objects.requireNonNull(obj4);
            com.google.android.gms.internal.ads.AbstractC5812yh0.b(obj3, obj4);
            i10 = 1;
            c6 = 1;
            c10 = 2;
        } else {
            int i12 = iW - 1;
            byte b6 = -1;
            if (iW <= 128) {
                byte[] bArr = new byte[iW];
                java.util.Arrays.fill(bArr, (byte) -1);
                int i13 = 0;
                int i14 = 0;
                while (i13 < i10) {
                    int i15 = i14 + i14;
                    int i16 = i13 + i13;
                    java.lang.Object obj5 = objArrCopyOf[i16];
                    j$.util.Objects.requireNonNull(obj5);
                    java.lang.Object obj6 = objArrCopyOf[i16 ^ i11];
                    j$.util.Objects.requireNonNull(obj6);
                    com.google.android.gms.internal.ads.AbstractC5812yh0.b(obj5, obj6);
                    int iA = com.google.android.gms.internal.ads.AbstractC2903Uh0.a(obj5.hashCode());
                    while (true) {
                        int i17 = iA & i12;
                        int i18 = bArr[i17] & 255;
                        if (i18 == 255) {
                            bArr[i17] = (byte) i15;
                            if (i14 < i13) {
                                objArrCopyOf[i15] = obj5;
                                objArrCopyOf[i15 ^ 1] = obj6;
                            }
                            i14++;
                            break;
                        }
                        if (obj5.equals(objArrCopyOf[i18 == true ? 1 : 0])) {
                            int i19 = ~i18;
                            java.lang.Object obj7 = objArrCopyOf[i19 == true ? 1 : 0];
                            j$.util.Objects.requireNonNull(obj7);
                            com.google.android.gms.internal.ads.C3508di0 c3508di3 = new com.google.android.gms.internal.ads.C3508di0(obj5, obj6, obj7);
                            objArrCopyOf[i19 == true ? 1 : 0] = obj6;
                            c3508di1 = c3508di3;
                            break;
                        }
                        iA = i17 + 1;
                    }
                    i13++;
                    i11 = 1;
                }
                if (i14 == i10) {
                    r10 = bArr;
                } else {
                    r11 = new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i14), c3508di1};
                    c10 = 2;
                }
                c6 = 1;
                r12 = r11;
            } else {
                if (iW <= 32768) {
                    sArr = new short[iW];
                    java.util.Arrays.fill(sArr, (short) -1);
                    int i20 = 0;
                    for (int i21 = 0; i21 < i10; i21++) {
                        int i22 = i20 + i20;
                        int i23 = i21 + i21;
                        java.lang.Object obj8 = objArrCopyOf[i23];
                        j$.util.Objects.requireNonNull(obj8);
                        java.lang.Object obj9 = objArrCopyOf[i23 ^ 1];
                        j$.util.Objects.requireNonNull(obj9);
                        com.google.android.gms.internal.ads.AbstractC5812yh0.b(obj8, obj9);
                        int iA2 = com.google.android.gms.internal.ads.AbstractC2903Uh0.a(obj8.hashCode());
                        while (true) {
                            int i24 = iA2 & i12;
                            char c11 = (char) sArr[i24];
                            if (c11 == 65535) {
                                sArr[i24] = (short) i22;
                                if (i20 < i21) {
                                    objArrCopyOf[i22] = obj8;
                                    objArrCopyOf[i22 ^ 1] = obj9;
                                }
                                i20++;
                                break;
                            }
                            if (obj8.equals(objArrCopyOf[c11])) {
                                int i25 = c11 ^ 1;
                                java.lang.Object obj10 = objArrCopyOf[i25 == true ? 1 : 0];
                                j$.util.Objects.requireNonNull(obj10);
                                com.google.android.gms.internal.ads.C3508di0 c3508di4 = new com.google.android.gms.internal.ads.C3508di0(obj8, obj9, obj10);
                                objArrCopyOf[i25 == true ? 1 : 0] = obj9;
                                c3508di2 = c3508di4;
                                break;
                            }
                            iA2 = i24 + 1;
                        }
                    }
                    if (i20 != i10) {
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i20);
                        c6 = 1;
                        c10 = 2;
                        r6 = new java.lang.Object[]{sArr, numValueOf, c3508di2};
                        r12 = r6;
                    }
                    r10 = sArr;
                } else {
                    int i26 = 1;
                    sArr = new int[iW];
                    java.util.Arrays.fill((int[]) sArr, -1);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < i10) {
                        int i29 = i28 + i28;
                        int i30 = i27 + i27;
                        java.lang.Object obj11 = objArrCopyOf[i30];
                        j$.util.Objects.requireNonNull(obj11);
                        java.lang.Object obj12 = objArrCopyOf[i30 ^ i26];
                        j$.util.Objects.requireNonNull(obj12);
                        com.google.android.gms.internal.ads.AbstractC5812yh0.b(obj11, obj12);
                        int iA3 = com.google.android.gms.internal.ads.AbstractC2903Uh0.a(obj11.hashCode());
                        while (true) {
                            int i31 = iA3 & i12;
                            ?? r15 = sArr[i31];
                            if (r15 == b6) {
                                sArr[i31] = i29;
                                if (i28 < i27) {
                                    objArrCopyOf[i29] = obj11;
                                    objArrCopyOf[i29 ^ 1] = obj12;
                                }
                                i28++;
                                break;
                            }
                            if (obj11.equals(objArrCopyOf[r15])) {
                                int i32 = r15 ^ 1;
                                java.lang.Object obj13 = objArrCopyOf[i32 == true ? 1 : 0];
                                j$.util.Objects.requireNonNull(obj13);
                                com.google.android.gms.internal.ads.C3508di0 c3508di5 = new com.google.android.gms.internal.ads.C3508di0(obj11, obj12, obj13);
                                objArrCopyOf[i32 == true ? 1 : 0] = obj12;
                                c3508di0 = c3508di5;
                                break;
                            }
                            iA3 = i31 + 1;
                            b6 = -1;
                        }
                        i27++;
                        i26 = 1;
                        b6 = -1;
                    }
                    if (i28 != i10) {
                        c6 = 1;
                        c10 = 2;
                        r6 = new java.lang.Object[]{sArr, java.lang.Integer.valueOf(i28), c3508di0};
                        r12 = r6;
                    }
                    r10 = sArr;
                }
                c6 = 1;
                r12 = r11;
            }
            c10 = 2;
            r11 = r10;
            c6 = 1;
            r12 = r11;
        }
        boolean z6 = r12 instanceof java.lang.Object[];
        ?? r13 = r12;
        if (z6) {
            java.lang.Object[] objArr2 = (java.lang.Object[]) r12;
            com.google.android.gms.internal.ads.C3508di0 c3508di6 = (com.google.android.gms.internal.ads.C3508di0) objArr2[c10];
            if (c3617ei0 == null) {
                throw c3508di6.a();
            }
            c3617ei0.f35039c = c3508di6;
            java.lang.Object obj14 = objArr2[0];
            int iIntValue = ((java.lang.Integer) objArr2[c6]).intValue();
            objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r13 = obj14;
            i10 = iIntValue;
        }
        return new com.google.android.gms.internal.ads.C2905Ui0(r13, objArrCopyOf, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3727fi0
    final com.google.android.gms.internal.ads.AbstractC3011Xh0 a() {
        return new com.google.android.gms.internal.ads.C2869Ti0(this.f32258G, 1, this.f32259H);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3727fi0
    final com.google.android.gms.internal.ads.AbstractC3947hi0 f() {
        return new com.google.android.gms.internal.ads.C2796Ri0(this, this.f32258G, 0, this.f32259H);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3727fi0
    final com.google.android.gms.internal.ads.AbstractC3947hi0 g() {
        return new com.google.android.gms.internal.ads.C2833Si0(this, new com.google.android.gms.internal.ads.C2869Ti0(this.f32258G, 0, this.f32259H));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.ads.AbstractC3727fi0, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i6 = this.f32259H;
            java.lang.Object[] objArr = this.f32258G;
            if (i6 == 1) {
                java.lang.Object obj3 = objArr[0];
                j$.util.Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    j$.util.Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                java.lang.Object obj4 = this.f32257F;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iA = com.google.android.gms.internal.ads.AbstractC2903Uh0.a(obj.hashCode());
                    while (true) {
                        int i10 = iA & length;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i11])) {
                            obj2 = objArr[i11 ^ 1];
                        } else {
                            iA = i10 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iA2 = com.google.android.gms.internal.ads.AbstractC2903Uh0.a(obj.hashCode());
                    while (true) {
                        int i12 = iA2 & length2;
                        char c6 = (char) sArr[i12];
                        if (c6 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c6])) {
                            obj2 = objArr[c6 ^ 1];
                        } else {
                            iA2 = i12 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iA3 = com.google.android.gms.internal.ads.AbstractC2903Uh0.a(obj.hashCode());
                    while (true) {
                        int i13 = iA3 & length3;
                        int i14 = iArr[i13];
                        if (i14 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i14])) {
                            obj2 = objArr[i14 ^ 1];
                        } else {
                            iA3 = i13 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f32259H;
    }
}
