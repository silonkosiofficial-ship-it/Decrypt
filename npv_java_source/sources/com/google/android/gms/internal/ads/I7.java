package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class I7 implements com.google.android.gms.internal.ads.InterfaceC5644x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.io.File f28409a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.content.Context f28410b;

    I7(android.content.Context context) {
        this.f28410b = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5644x7
    public final java.io.File a() {
        if (this.f28409a == null) {
            this.f28409a = new java.io.File(this.f28410b.getCacheDir(), "volley");
        }
        return this.f28409a;
    }
}
