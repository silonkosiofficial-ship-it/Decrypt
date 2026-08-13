package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4606nj implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final java.util.Map f37641d = V3.g.d(new java.lang.String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new java.lang.Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p174r3.b f37642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4944qn f37643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5713xn f37644c;

    public C4606nj(p174r3.b bVar, com.google.android.gms.internal.ads.C4944qn c4944qn, com.google.android.gms.internal.ads.InterfaceC5713xn interfaceC5713xn) {
        this.f37642a = bVar;
        this.f37643b = c4944qn;
        this.f37644c = interfaceC5713xn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        int iIntValue = ((java.lang.Integer) f37641d.get((java.lang.String) map.get("a"))).intValue();
        int i6 = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                p174r3.b bVar = this.f37642a;
                if (!bVar.c()) {
                    bVar.b(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.f37643b.i(map);
                    return;
                }
                if (iIntValue == 3) {
                    new com.google.android.gms.internal.ads.C5273tn(interfaceC2698Ot, map).i();
                    return;
                }
                if (iIntValue == 4) {
                    new com.google.android.gms.internal.ads.C4614nn(interfaceC2698Ot, map).j();
                    return;
                } else if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.f37643b.h(true);
                        return;
                    } else if (iIntValue != 7) {
                        p224w3.p.f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f37644c.c();
            return;
        }
        java.lang.String str = (java.lang.String) map.get("forceOrientation");
        boolean z6 = map.containsKey("allowOrientationChange") ? java.lang.Boolean.parseBoolean((java.lang.String) map.get("allowOrientationChange")) : true;
        if (interfaceC2698Ot == null) {
            p224w3.p.g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i6 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i6 = z6 ? -1 : 14;
        }
        interfaceC2698Ot.K0(i6);
    }
}
