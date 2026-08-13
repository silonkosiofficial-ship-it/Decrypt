package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5789yS implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.Y80 f40071a;

    C5789yS(com.google.android.gms.internal.ads.C5899zS c5899zS, com.google.android.gms.internal.ads.Y80 y80) {
        this.f40071a = y80;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        p224w3.p.d("Failed to get offline signal database: ".concat(java.lang.String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        try {
            this.f40071a.b((android.database.sqlite.SQLiteDatabase) obj);
        } catch (java.lang.Exception e6) {
            p224w3.p.d("Error executing function on offline signal database: ".concat(java.lang.String.valueOf(e6.getMessage())));
        }
    }
}
