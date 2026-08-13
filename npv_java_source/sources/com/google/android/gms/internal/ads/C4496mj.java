package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4496mj implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f37393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f37394b;

    public C4496mj(android.content.Context context, java.util.Map map) {
        this.f37393a = context;
        this.f37394b = map;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final void a(java.lang.Object obj, java.util.Map map) {
        byte b6;
        if (p174r3.v.r().p(this.f37393a)) {
            java.lang.String str = (java.lang.String) map.get("eventName");
            java.lang.String str2 = (java.lang.String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        b6 = 1;
                    } else {
                        b6 = -1;
                    }
                } else if (str.equals("_ac")) {
                    b6 = 0;
                } else {
                    b6 = -1;
                }
            } else if (str.equals("_aa")) {
                b6 = 2;
            } else {
                b6 = -1;
            }
            if (b6 == 0) {
                p174r3.v.r().j(this.f37393a, str2, (java.util.Map) this.f37394b.get("_ac"));
            } else if (b6 == 1) {
                p174r3.v.r().k(this.f37393a, str2, (java.util.Map) this.f37394b.get("_ai"));
            } else if (b6 != 2) {
                p224w3.p.d("logScionEvent gmsg contained unsupported eventName");
            } else {
                p174r3.v.r().h(this.f37393a, str2);
            }
        }
    }
}
