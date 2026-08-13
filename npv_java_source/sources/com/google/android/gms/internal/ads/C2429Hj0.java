package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2429Hj0 extends java.util.AbstractList implements java.util.RandomAccess, java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final int[] f28099C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final int f28100D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final int f28101E;

    C2429Hj0(int[] iArr, int i6, int i10) {
        this.f28099C = iArr;
        this.f28100D = i6;
        this.f28101E = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return (obj instanceof java.lang.Integer) && com.google.android.gms.internal.ads.AbstractC2466Ij0.a(this.f28099C, ((java.lang.Integer) obj).intValue(), this.f28100D, this.f28101E) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.C2429Hj0)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.ads.C2429Hj0 c2429Hj0 = (com.google.android.gms.internal.ads.C2429Hj0) obj;
        int i6 = this.f28101E - this.f28100D;
        if (c2429Hj0.f28101E - c2429Hj0.f28100D != i6) {
            return false;
        }
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f28099C[this.f28100D + i10] != c2429Hj0.f28099C[c2429Hj0.f28100D + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i6) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.a(i6, this.f28101E - this.f28100D, "index");
        return java.lang.Integer.valueOf(this.f28099C[this.f28100D + i6]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i10 = this.f28100D; i10 < this.f28101E; i10++) {
            i6 = (i6 * 31) + this.f28099C[i10];
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        int iA;
        if (!(obj instanceof java.lang.Integer) || (iA = com.google.android.gms.internal.ads.AbstractC2466Ij0.a(this.f28099C, ((java.lang.Integer) obj).intValue(), this.f28100D, this.f28101E)) < 0) {
            return -1;
        }
        return iA - this.f28100D;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            int[] iArr = this.f28099C;
            int iIntValue = ((java.lang.Integer) obj).intValue();
            int i6 = this.f28100D;
            int i10 = this.f28101E - 1;
            while (i10 >= i6) {
                if (iArr[i10] != iIntValue) {
                    i10--;
                } else if (i10 >= 0) {
                    return i10 - this.f28100D;
                }
            }
            i10 = -1;
            if (i10 >= 0) {
                return i10 - this.f28100D;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i6, java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.google.android.gms.internal.ads.AbstractC2164Ag0.a(i6, this.f28101E - this.f28100D, "index");
        int[] iArr = this.f28099C;
        int i10 = this.f28100D + i6;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return java.lang.Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28101E - this.f28100D;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i6, int i10) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.k(i6, i10, this.f28101E - this.f28100D);
        if (i6 == i10) {
            return java.util.Collections.emptyList();
        }
        int[] iArr = this.f28099C;
        int i11 = this.f28100D;
        return new com.google.android.gms.internal.ads.C2429Hj0(iArr, i11 + i6, i10 + i11);
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((this.f28101E - this.f28100D) * 5);
        sb.append('[');
        sb.append(this.f28099C[this.f28100D]);
        int i6 = this.f28100D;
        while (true) {
            i6++;
            if (i6 >= this.f28101E) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.f28099C[i6]);
        }
    }
}
