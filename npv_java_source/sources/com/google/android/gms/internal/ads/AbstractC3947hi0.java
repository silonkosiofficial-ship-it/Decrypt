package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3947hi0 extends com.google.android.gms.internal.ads.AbstractC3011Xh0 implements java.util.Set, j$.util.Set {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private transient com.google.android.gms.internal.ads.AbstractC3398ci0 f36114D;

    AbstractC3947hi0() {
    }

    public static com.google.android.gms.internal.ads.C3837gi0 D(int i6) {
        return new com.google.android.gms.internal.ads.C3837gi0(i6, true);
    }

    public static com.google.android.gms.internal.ads.AbstractC3947hi0 M(java.util.Collection collection) {
        if ((collection instanceof com.google.android.gms.internal.ads.AbstractC3947hi0) && !(collection instanceof java.util.SortedSet)) {
            com.google.android.gms.internal.ads.AbstractC3947hi0 abstractC3947hi0 = (com.google.android.gms.internal.ads.AbstractC3947hi0) collection;
            if (!abstractC3947hi0.o()) {
                return abstractC3947hi0;
            }
        }
        java.lang.Object[] array = collection.toArray();
        return W(array.length, array);
    }

    public static com.google.android.gms.internal.ads.AbstractC3947hi0 N(java.lang.Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? W(length, (java.lang.Object[]) objArr.clone()) : new com.google.android.gms.internal.ads.C3839gj0(objArr[0]);
        }
        return com.google.android.gms.internal.ads.C2941Vi0.f32555K;
    }

    public static com.google.android.gms.internal.ads.AbstractC3947hi0 O() {
        return com.google.android.gms.internal.ads.C2941Vi0.f32555K;
    }

    public static com.google.android.gms.internal.ads.AbstractC3947hi0 P(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.C3839gj0(obj);
    }

    public static com.google.android.gms.internal.ads.AbstractC3947hi0 Q(java.lang.Object obj, java.lang.Object obj2) {
        return W(2, obj, obj2);
    }

    public static com.google.android.gms.internal.ads.AbstractC3947hi0 R(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return W(3, obj, obj2, obj3);
    }

    public static com.google.android.gms.internal.ads.AbstractC3947hi0 S(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return W(5, obj, obj2, obj3, obj4, obj5);
    }

    public static com.google.android.gms.internal.ads.AbstractC3947hi0 T(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object... objArr) {
        java.lang.Object[] objArr2 = new java.lang.Object[9];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        java.lang.System.arraycopy(objArr, 0, objArr2, 6, 3);
        return W(9, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.internal.ads.AbstractC3947hi0 W(int i6, java.lang.Object... objArr) {
        if (i6 == 0) {
            return com.google.android.gms.internal.ads.C2941Vi0.f32555K;
        }
        if (i6 == 1) {
            java.lang.Object obj = objArr[0];
            j$.util.Objects.requireNonNull(obj);
            return new com.google.android.gms.internal.ads.C3839gj0(obj);
        }
        int iW = w(i6);
        java.lang.Object[] objArr2 = new java.lang.Object[iW];
        int i10 = iW - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i6; i13++) {
            java.lang.Object obj2 = objArr[i13];
            com.google.android.gms.internal.ads.AbstractC2611Mi0.a(obj2, i13);
            int iHashCode = obj2.hashCode();
            int iA = com.google.android.gms.internal.ads.AbstractC2903Uh0.a(iHashCode);
            while (true) {
                int i14 = iA & i10;
                java.lang.Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iA++;
            }
        }
        java.util.Arrays.fill(objArr, i12, i6, (java.lang.Object) null);
        if (i12 == 1) {
            java.lang.Object obj4 = objArr[0];
            j$.util.Objects.requireNonNull(obj4);
            return new com.google.android.gms.internal.ads.C3839gj0(obj4);
        }
        if (w(i12) < iW / 2) {
            return W(i12, objArr);
        }
        if (X(i12, objArr.length)) {
            objArr = java.util.Arrays.copyOf(objArr, i12);
        }
        return new com.google.android.gms.internal.ads.C2941Vi0(objArr, i11, objArr2, i10, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean X(int i6, int i10) {
        return i6 < (i10 >> 1) + (i10 >> 2);
    }

    static int w(int i6) {
        int iMax = java.lang.Math.max(i6, 2);
        if (iMax >= 751619276) {
            com.google.android.gms.internal.ads.AbstractC2164Ag0.f(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = java.lang.Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    com.google.android.gms.internal.ads.AbstractC3398ci0 C() {
        java.lang.Object[] array = toArray();
        int i6 = com.google.android.gms.internal.ads.AbstractC3398ci0.f34559E;
        return com.google.android.gms.internal.ads.AbstractC3398ci0.D(array, array.length);
    }

    boolean V() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof com.google.android.gms.internal.ads.AbstractC3947hi0) && V() && ((com.google.android.gms.internal.ads.AbstractC3947hi0) obj).V() && hashCode() != obj.hashCode()) {
            return false;
        }
        return com.google.android.gms.internal.ads.AbstractC3729fj0.d(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    public com.google.android.gms.internal.ads.AbstractC3398ci0 g() {
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0 = this.f36114D;
        if (abstractC3398ci0 != null) {
            return abstractC3398ci0;
        }
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0C = C();
        this.f36114D = abstractC3398ci0C;
        return abstractC3398ci0C;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return com.google.android.gms.internal.ads.AbstractC3729fj0.a(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    public abstract com.google.android.gms.internal.ads.AbstractC4167jj0 n();
}
