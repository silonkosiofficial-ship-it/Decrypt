package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class PS implements com.google.android.gms.internal.ads.InterfaceC5539w90 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.DS f30718C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.HS f30719D;

    PS(com.google.android.gms.internal.ads.DS ds, com.google.android.gms.internal.ads.HS hs) {
        this.f30718C = ds;
        this.f30719D = hs;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5539w90
    public final void i(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, java.lang.String str, java.lang.Throwable th) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.b6)).booleanValue() && com.google.android.gms.internal.ads.EnumC4770p90.RENDERER == enumC4770p90 && this.f30718C.c() != 0) {
            this.f30718C.f(p174r3.v.c().c() - this.f30718C.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5539w90
    public final void p(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5539w90
    public final void w(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, java.lang.String str) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.b6)).booleanValue() && com.google.android.gms.internal.ads.EnumC4770p90.RENDERER == enumC4770p90 && this.f30718C.c() != 0) {
            this.f30718C.f(p174r3.v.c().c() - this.f30718C.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5539w90
    public final void z(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, java.lang.String str) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.b6)).booleanValue()) {
            if (com.google.android.gms.internal.ads.EnumC4770p90.RENDERER == enumC4770p90) {
                this.f30718C.g(p174r3.v.c().c());
                return;
            }
            if (com.google.android.gms.internal.ads.EnumC4770p90.PRELOADED_LOADER == enumC4770p90 || com.google.android.gms.internal.ads.EnumC4770p90.SERVER_TRANSACTION == enumC4770p90) {
                this.f30718C.h(p174r3.v.c().c());
                final com.google.android.gms.internal.ads.HS hs = this.f30719D;
                final long jD = this.f30718C.d();
                hs.f29757b.a(new com.google.android.gms.internal.ads.Y80() { // from class: com.google.android.gms.internal.ads.GS
                    @Override // com.google.android.gms.internal.ads.Y80
                    public final java.lang.Object b(java.lang.Object obj) {
                        android.database.sqlite.SQLiteDatabase sQLiteDatabase = (android.database.sqlite.SQLiteDatabase) obj;
                        if (hs.a()) {
                            return null;
                        }
                        long j6 = jD;
                        com.google.android.gms.internal.ads.C2453Id c2453IdE0 = com.google.android.gms.internal.ads.C2416Hd.E0();
                        c2453IdE0.K(j6);
                        byte[] bArrL = ((com.google.android.gms.internal.ads.C2416Hd) c2453IdE0.u()).l();
                        com.google.android.gms.internal.ads.OS.f(sQLiteDatabase, false, false);
                        com.google.android.gms.internal.ads.OS.c(sQLiteDatabase, j6, bArrL);
                        return null;
                    }
                });
            }
        }
    }
}
