package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5825yo extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C5825yo> CREATOR = new com.google.android.gms.internal.ads.C5935zo();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f40141C;

    public C5825yo(java.lang.String str) {
        this.f40141C = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f40141C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, str, false);
        R3.c.b(parcel, iA);
    }
}
