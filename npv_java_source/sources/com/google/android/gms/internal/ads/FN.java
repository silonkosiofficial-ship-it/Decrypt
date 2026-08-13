package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class FN implements com.google.android.gms.internal.ads.InterfaceC5539w90 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.Map f27351C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4704od f27352D;

    FN(com.google.android.gms.internal.ads.C4704od c4704od, java.util.Map map) {
        this.f27351C = map;
        this.f27352D = c4704od;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5539w90
    public final void i(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, java.lang.String str, java.lang.Throwable th) {
        if (this.f27351C.containsKey(enumC4770p90)) {
            this.f27352D.c(((com.google.android.gms.internal.ads.EN) this.f27351C.get(enumC4770p90)).f27032c);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5539w90
    public final void p(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5539w90
    public final void w(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, java.lang.String str) {
        if (this.f27351C.containsKey(enumC4770p90)) {
            this.f27352D.c(((com.google.android.gms.internal.ads.EN) this.f27351C.get(enumC4770p90)).f27031b);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5539w90
    public final void z(com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90, java.lang.String str) {
        if (this.f27351C.containsKey(enumC4770p90)) {
            this.f27352D.c(((com.google.android.gms.internal.ads.EN) this.f27351C.get(enumC4770p90)).f27030a);
        }
    }
}
