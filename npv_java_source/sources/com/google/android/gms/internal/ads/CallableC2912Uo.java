package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class CallableC2912Uo implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.content.Context f32267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2984Wo f32268b;

    CallableC2912Uo(com.google.android.gms.internal.ads.C2984Wo c2984Wo, android.content.Context context) {
        this.f32267a = context;
        this.f32268b = c2984Wo;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x003a  */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        com.google.android.gms.internal.ads.C2876To c2876ToA;
        com.google.android.gms.internal.ads.C2948Vo c2948Vo = (com.google.android.gms.internal.ads.C2948Vo) this.f32268b.f32800a.get(this.f32267a);
        if (c2948Vo != null) {
            if (c2948Vo.f32572a + ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC5039rg.f38526d.e()).longValue() < p174r3.v.c().a()) {
                c2876ToA = new com.google.android.gms.internal.ads.C2840So(this.f32267a).a();
            } else {
                c2876ToA = new com.google.android.gms.internal.ads.C2840So(this.f32267a, c2948Vo.f32573b).a();
            }
        } else {
            c2876ToA = new com.google.android.gms.internal.ads.C2840So(this.f32267a).a();
        }
        com.google.android.gms.internal.ads.C2984Wo c2984Wo = this.f32268b;
        c2984Wo.f32800a.put(this.f32267a, new com.google.android.gms.internal.ads.C2948Vo(c2984Wo, c2876ToA));
        return c2876ToA;
    }
}
