package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4178jp extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C4178jp> CREATOR = new com.google.android.gms.internal.ads.C4288kp();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p184s3.X1 f36738C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f36739D;

    public C4178jp(p184s3.X1 x6, java.lang.String str) {
        this.f36738C = x6;
        this.f36739D = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        p184s3.X1 x6 = this.f36738C;
        int iA = R3.c.a(parcel);
        R3.c.p(parcel, 2, x6, i6, false);
        R3.c.q(parcel, 3, this.f36739D, false);
        R3.c.b(parcel, iA);
    }
}
