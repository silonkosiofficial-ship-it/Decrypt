package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC4031iR extends com.google.android.gms.internal.ads.AbstractBinderC2398Go {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC4249kR f36285C;

    protected BinderC4031iR(com.google.android.gms.internal.ads.AbstractC4249kR abstractC4249kR) {
        this.f36285C = abstractC4249kR;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2435Ho
    public final void C3(p214v3.D d6) {
        this.f36285C.f36962a.d(d6.e());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2435Ho
    public final void C5(android.os.ParcelFileDescriptor parcelFileDescriptor, com.google.android.gms.internal.ads.C2730Po c2730Po) {
        this.f36285C.f36962a.c(new com.google.android.gms.internal.ads.BR(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c2730Po));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2435Ho
    public final void H3(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        android.os.ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        com.google.android.gms.internal.ads.AbstractC4249kR abstractC4249kR = this.f36285C;
        abstractC4249kR.f36962a.c(new com.google.android.gms.internal.ads.BR(autoCloseInputStream, abstractC4249kR.f36966e));
    }
}
