package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3513dl implements com.google.android.gms.internal.ads.InterfaceC4732or {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3294bl f34789a;

    C3513dl(com.google.android.gms.internal.ads.C3842gl c3842gl, com.google.android.gms.internal.ads.C3294bl c3294bl) {
        this.f34789a = c3294bl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732or
    public final void a() {
        p214v3.AbstractC7265q0.k("Rejecting reference for JS Engine.");
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25225B7)).booleanValue()) {
            this.f34789a.d(new java.lang.IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.f34789a.c();
        }
    }
}
