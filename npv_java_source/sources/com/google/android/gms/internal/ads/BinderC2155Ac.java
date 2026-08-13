package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2155Ac extends com.google.android.gms.internal.ads.AbstractBinderC2488Jc {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p124m3.a.AbstractC0646a f25195C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f25196D;

    public BinderC2155Ac(p124m3.a.AbstractC0646a abstractC0646a, java.lang.String str) {
        this.f25195C = abstractC0646a;
        this.f25196D = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2525Kc
    public final void B(int i6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2525Kc
    public final void B3(p184s3.W0 w6) {
        if (this.f25195C != null) {
            this.f25195C.a(w6.f());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2525Kc
    public final void Q0(com.google.android.gms.internal.ads.InterfaceC2414Hc interfaceC2414Hc) {
        if (this.f25195C != null) {
            this.f25195C.b(new com.google.android.gms.internal.ads.C2192Bc(interfaceC2414Hc, this.f25196D));
        }
    }
}
