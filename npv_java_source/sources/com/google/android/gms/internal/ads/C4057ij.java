package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4057ij implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4166jj f36339a;

    public C4057ij(com.google.android.gms.internal.ads.C4166jj c4166jj) {
        this.f36339a = c4166jj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f6 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f6 = java.lang.Float.parseFloat((java.lang.String) map.get("blurRadius"));
            }
        } catch (java.lang.NumberFormatException e6) {
            p224w3.p.e("Fail to parse float", e6);
        }
        this.f36339a.c(zEquals);
        this.f36339a.b(zEquals2, f6);
        interfaceC2698Ot.Z0(zEquals);
    }
}
