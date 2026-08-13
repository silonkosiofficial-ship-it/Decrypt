package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class EH0 implements java.util.Comparator, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.EH0> CREATOR = new com.google.android.gms.internal.ads.RF0();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3140aH0[] f27003C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f27004D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f27005E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f27006F;

    EH0(android.os.Parcel parcel) {
        this.f27005E = parcel.readString();
        com.google.android.gms.internal.ads.C3140aH0[] c3140aH0Arr = (com.google.android.gms.internal.ads.C3140aH0[]) parcel.createTypedArray(com.google.android.gms.internal.ads.C3140aH0.CREATOR);
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f27003C = c3140aH0Arr;
        this.f27006F = c3140aH0Arr.length;
    }

    private EH0(java.lang.String str, boolean z6, com.google.android.gms.internal.ads.C3140aH0... c3140aH0Arr) {
        this.f27005E = str;
        c3140aH0Arr = z6 ? (com.google.android.gms.internal.ads.C3140aH0[]) c3140aH0Arr.clone() : c3140aH0Arr;
        this.f27003C = c3140aH0Arr;
        this.f27006F = c3140aH0Arr.length;
        java.util.Arrays.sort(c3140aH0Arr, this);
    }

    public EH0(java.lang.String str, com.google.android.gms.internal.ads.C3140aH0... c3140aH0Arr) {
        this(null, true, c3140aH0Arr);
    }

    public EH0(java.util.List list) {
        this(null, false, (com.google.android.gms.internal.ads.C3140aH0[]) list.toArray(new com.google.android.gms.internal.ads.C3140aH0[0]));
    }

    public final com.google.android.gms.internal.ads.C3140aH0 a(int i6) {
        return this.f27003C[i6];
    }

    public final com.google.android.gms.internal.ads.EH0 b(java.lang.String str) {
        return j$.util.Objects.equals(this.f27005E, str) ? this : new com.google.android.gms.internal.ads.EH0(str, false, this.f27003C);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.C3140aH0 c3140aH0 = (com.google.android.gms.internal.ads.C3140aH0) obj;
        com.google.android.gms.internal.ads.C3140aH0 c3140aH1 = (com.google.android.gms.internal.ads.C3140aH0) obj2;
        java.util.UUID uuid = com.google.android.gms.internal.ads.Hw0.f28345a;
        if (uuid.equals(c3140aH0.f34035D)) {
            return !uuid.equals(c3140aH1.f34035D) ? 1 : 0;
        }
        return c3140aH0.f34035D.compareTo(c3140aH1.f34035D);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.EH0.class == obj.getClass()) {
            com.google.android.gms.internal.ads.EH0 eh0 = (com.google.android.gms.internal.ads.EH0) obj;
            if (j$.util.Objects.equals(this.f27005E, eh0.f27005E) && java.util.Arrays.equals(this.f27003C, eh0.f27003C)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f27004D;
        if (i6 != 0) {
            return i6;
        }
        java.lang.String str = this.f27005E;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + java.util.Arrays.hashCode(this.f27003C);
        this.f27004D = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeString(this.f27005E);
        parcel.writeTypedArray(this.f27003C, 0);
    }
}
