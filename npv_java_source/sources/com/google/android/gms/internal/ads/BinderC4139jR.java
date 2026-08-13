package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC4139jR extends com.google.android.gms.internal.ads.AbstractBinderC2398Go {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4512mr f36673C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2730Po f36674D;

    BinderC4139jR(com.google.android.gms.internal.ads.C4512mr c4512mr, com.google.android.gms.internal.ads.C2730Po c2730Po) {
        this.f36673C = c4512mr;
        this.f36674D = c2730Po;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2435Ho
    public final void C3(p214v3.D d6) {
        this.f36673C.d(d6.e());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2435Ho
    public final void C5(android.os.ParcelFileDescriptor parcelFileDescriptor, com.google.android.gms.internal.ads.C2730Po c2730Po) {
        this.f36673C.c(new com.google.android.gms.internal.ads.BR(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c2730Po));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2435Ho
    public final void H3(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.f36673C.c(new com.google.android.gms.internal.ads.BR(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f36674D));
    }
}
