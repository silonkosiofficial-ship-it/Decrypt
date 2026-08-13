package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class RC extends com.google.android.gms.internal.ads.BF implements com.google.android.gms.internal.ads.IC {
    public RC(java.util.Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.IC
    public final void F(final com.google.android.gms.internal.ads.YH yh) {
        p1(new com.google.android.gms.internal.ads.AF() { // from class: com.google.android.gms.internal.ads.OC
            @Override // com.google.android.gms.internal.ads.AF
            public final void b(java.lang.Object obj) {
                com.google.android.gms.internal.ads.VC vc = (com.google.android.gms.internal.ads.VC) obj;
                java.lang.String message = yh.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                vc.p(com.google.android.gms.internal.ads.P70.d(12, message, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.IC
    public final void b() {
        p1(new com.google.android.gms.internal.ads.AF() { // from class: com.google.android.gms.internal.ads.PC
            @Override // com.google.android.gms.internal.ads.AF
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.VC) obj).p(com.google.android.gms.internal.ads.P70.d(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.IC
    public final void p(final p184s3.W0 w6) {
        p1(new com.google.android.gms.internal.ads.AF() { // from class: com.google.android.gms.internal.ads.QC
            @Override // com.google.android.gms.internal.ads.AF
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.VC) obj).p(w6);
            }
        });
    }
}
