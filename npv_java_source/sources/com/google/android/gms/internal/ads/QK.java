package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class QK implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4512mr f30968a;

    QK(com.google.android.gms.internal.ads.RK rk, com.google.android.gms.internal.ads.C4512mr c4512mr) {
        this.f30968a = c4512mr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        p224w3.p.d("Failed to load media data due to video view load failure.");
        this.f30968a.d(th);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        if (interfaceC2698Ot == null) {
            this.f30968a.d(new com.google.android.gms.internal.ads.XV(1, "Missing webview from video view future."));
            return;
        }
        final com.google.android.gms.internal.ads.C4512mr c4512mr = this.f30968a;
        interfaceC2698Ot.g1("/video", new com.google.android.gms.internal.ads.C2328Es(new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.PK
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void o(java.lang.Object obj2) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("mediaUrl", (java.lang.String) obj2);
                c4512mr.c(bundle);
            }

            public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
            }
        }));
        interfaceC2698Ot.f0();
    }
}
