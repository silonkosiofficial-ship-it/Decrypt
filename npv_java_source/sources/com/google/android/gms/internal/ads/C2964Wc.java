package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2964Wc extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C2964Wc> CREATOR = new com.google.android.gms.internal.ads.C3000Xc();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.os.ParcelFileDescriptor f32771C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f32772D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f32773E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final long f32774F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final boolean f32775G;

    public C2964Wc() {
        this(null, false, false, 0L, false);
    }

    public C2964Wc(android.os.ParcelFileDescriptor parcelFileDescriptor, boolean z6, boolean z10, long j6, boolean z11) {
        this.f32771C = parcelFileDescriptor;
        this.f32772D = z6;
        this.f32773E = z10;
        this.f32774F = j6;
        this.f32775G = z11;
    }

    public final synchronized boolean C() {
        return this.f32771C != null;
    }

    public final synchronized boolean D() {
        return this.f32773E;
    }

    public final synchronized boolean E() {
        return this.f32775G;
    }

    public final synchronized long e() {
        return this.f32774F;
    }

    final synchronized android.os.ParcelFileDescriptor f() {
        return this.f32771C;
    }

    public final synchronized java.io.InputStream s() {
        if (this.f32771C == null) {
            return null;
        }
        android.os.ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new android.os.ParcelFileDescriptor.AutoCloseInputStream(this.f32771C);
        this.f32771C = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean w() {
        return this.f32772D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.p(parcel, 2, f(), i6, false);
        R3.c.c(parcel, 3, w());
        R3.c.c(parcel, 4, D());
        R3.c.n(parcel, 5, e());
        R3.c.c(parcel, 6, E());
        R3.c.b(parcel, iA);
    }
}
