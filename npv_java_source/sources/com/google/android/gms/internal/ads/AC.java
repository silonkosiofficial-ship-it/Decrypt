package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class AC implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f25085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f25086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f25087c;

    public AC(com.google.android.gms.internal.ads.C5874zC c5874zC, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3) {
        this.f25085a = interfaceC5078rz0;
        this.f25086b = interfaceC5078rz1;
        this.f25087c = interfaceC5078rz2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        android.content.Context context = (android.content.Context) this.f25085a.b();
        p224w3.a aVarA = ((com.google.android.gms.internal.ads.C4740ov) this.f25086b).a();
        com.google.android.gms.internal.ads.R60 r60A = ((com.google.android.gms.internal.ads.C5650xA) this.f25087c).a();
        com.google.android.gms.internal.ads.C2985Wp c2985Wp = new com.google.android.gms.internal.ads.C2985Wp();
        com.google.android.gms.internal.ads.C3021Xp c3021Xp = r60A.f31134A;
        if (c3021Xp == null) {
            return null;
        }
        com.google.android.gms.internal.ads.W60 w60 = r60A.f31196s;
        return new com.google.android.gms.internal.ads.C2949Vp(context, aVarA, c3021Xp, w60 == null ? null : w60.f32685b, c2985Wp);
    }
}
