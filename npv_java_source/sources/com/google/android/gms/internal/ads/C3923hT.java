package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3923hT implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.Y80 f36071a;

    C3923hT(com.google.android.gms.internal.ads.C4033iT c4033iT, com.google.android.gms.internal.ads.Y80 y80) {
        this.f36071a = y80;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        p224w3.p.d("Failed to get offline buffered ping database: ".concat(java.lang.String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        try {
            this.f36071a.b((android.database.sqlite.SQLiteDatabase) obj);
        } catch (java.lang.Exception e6) {
            p224w3.p.d("Error executing function on offline buffered ping database: ".concat(java.lang.String.valueOf(e6.getMessage())));
        }
    }
}
