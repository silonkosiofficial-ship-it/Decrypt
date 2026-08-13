package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class AD extends com.google.android.gms.internal.ads.BF implements com.google.android.gms.internal.ads.InterfaceC5483vi {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.os.Bundle f25091D;

    AD(java.util.Set set) {
        super(set);
        this.f25091D = new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5483vi
    public final synchronized void C(java.lang.String str, android.os.Bundle bundle) {
        this.f25091D.putAll(bundle);
        p1(new com.google.android.gms.internal.ads.AF() { // from class: com.google.android.gms.internal.ads.zD
            @Override // com.google.android.gms.internal.ads.AF
            public final void b(java.lang.Object obj) {
                ((E3.a) obj).k();
            }
        });
    }

    public final synchronized android.os.Bundle q1() {
        return new android.os.Bundle(this.f25091D);
    }
}
