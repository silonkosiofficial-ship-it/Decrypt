package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3799gI implements com.google.android.gms.internal.ads.InterfaceC4111jA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f35576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f35577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f35578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f35579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4789pJ f35580e;

    C3799gI(java.util.Map map, java.util.Map map2, java.util.Map map3, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.C4789pJ c4789pJ) {
        this.f35576a = map;
        this.f35577b = map2;
        this.f35578c = map3;
        this.f35579d = interfaceC5078rz0;
        this.f35580e = c4789pJ;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4111jA
    public final com.google.android.gms.internal.ads.VT f(int i6, java.lang.String str) {
        com.google.android.gms.internal.ads.VT vtF;
        com.google.android.gms.internal.ads.VT vt = (com.google.android.gms.internal.ads.VT) this.f35576a.get(str);
        if (vt != null) {
            return vt;
        }
        if (i6 != 1) {
            if (i6 != 4) {
                return null;
            }
            com.google.android.gms.internal.ads.InterfaceC4473mV interfaceC4473mV = (com.google.android.gms.internal.ads.InterfaceC4473mV) this.f35578c.get(str);
            if (interfaceC4473mV != null) {
                return new com.google.android.gms.internal.ads.WT(interfaceC4473mV, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.lA
                    @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return new com.google.android.gms.internal.ads.C4661oA((java.util.List) obj);
                    }
                });
            }
            vtF = (com.google.android.gms.internal.ads.VT) this.f35577b.get(str);
            if (vtF == null) {
                return null;
            }
        } else if (this.f35580e.e() == null || (vtF = ((com.google.android.gms.internal.ads.InterfaceC4111jA) this.f35579d.b()).f(i6, str)) == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.WT(vtF, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.mA
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                return new com.google.android.gms.internal.ads.C4661oA((com.google.android.gms.internal.ads.AbstractC3673fA) obj);
            }
        });
    }
}
