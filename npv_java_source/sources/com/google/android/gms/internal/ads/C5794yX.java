package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5794yX implements com.google.android.gms.internal.ads.InterfaceC4256kY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.BinderC5904zX f40092a;

    C5794yX(com.google.android.gms.internal.ads.BinderC5904zX binderC5904zX) {
        this.f40092a = binderC5904zX;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4256kY
    public final void a() {
        synchronized (this.f40092a) {
            this.f40092a.f40327K = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4256kY
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.AbstractC2777Qy abstractC2777Qy = (com.google.android.gms.internal.ads.AbstractC2777Qy) obj;
        synchronized (this.f40092a) {
            try {
                com.google.android.gms.internal.ads.BinderC5904zX binderC5904zX = this.f40092a;
                if (binderC5904zX.f40327K != null) {
                    binderC5904zX.f40327K.a();
                }
                this.f40092a.f40327K = abstractC2777Qy;
                this.f40092a.f40327K.b();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
