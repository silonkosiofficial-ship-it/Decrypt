package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class LS extends com.google.android.gms.internal.ads.MS {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final android.util.SparseArray f29493h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f29494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3787gC f29495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.telephony.TelephonyManager f29496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.DS f29497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.EnumC2932Ve f29498g;

    static {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        f29493h = sparseArray;
        sparseArray.put(android.net.NetworkInfo.DetailedState.CONNECTED.ordinal(), com.google.android.gms.internal.ads.EnumC2527Kd.CONNECTED);
        int iOrdinal = android.net.NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        com.google.android.gms.internal.ads.EnumC2527Kd enumC2527Kd = com.google.android.gms.internal.ads.EnumC2527Kd.CONNECTING;
        sparseArray.put(iOrdinal, enumC2527Kd);
        sparseArray.put(android.net.NetworkInfo.DetailedState.CONNECTING.ordinal(), enumC2527Kd);
        sparseArray.put(android.net.NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), enumC2527Kd);
        sparseArray.put(android.net.NetworkInfo.DetailedState.DISCONNECTING.ordinal(), com.google.android.gms.internal.ads.EnumC2527Kd.DISCONNECTING);
        int iOrdinal2 = android.net.NetworkInfo.DetailedState.BLOCKED.ordinal();
        com.google.android.gms.internal.ads.EnumC2527Kd enumC2527Kd2 = com.google.android.gms.internal.ads.EnumC2527Kd.DISCONNECTED;
        sparseArray.put(iOrdinal2, enumC2527Kd2);
        sparseArray.put(android.net.NetworkInfo.DetailedState.DISCONNECTED.ordinal(), enumC2527Kd2);
        sparseArray.put(android.net.NetworkInfo.DetailedState.FAILED.ordinal(), enumC2527Kd2);
        sparseArray.put(android.net.NetworkInfo.DetailedState.IDLE.ordinal(), enumC2527Kd2);
        sparseArray.put(android.net.NetworkInfo.DetailedState.SCANNING.ordinal(), enumC2527Kd2);
        sparseArray.put(android.net.NetworkInfo.DetailedState.SUSPENDED.ordinal(), com.google.android.gms.internal.ads.EnumC2527Kd.SUSPENDED);
        sparseArray.put(android.net.NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), enumC2527Kd);
        sparseArray.put(android.net.NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), enumC2527Kd);
    }

    LS(android.content.Context context, com.google.android.gms.internal.ads.C3787gC c3787gC, com.google.android.gms.internal.ads.DS ds, com.google.android.gms.internal.ads.C5899zS c5899zS, p214v3.InterfaceC7268s0 interfaceC7268s0) {
        super(c5899zS, interfaceC7268s0);
        this.f29494c = context;
        this.f29495d = c3787gC;
        this.f29497f = ds;
        this.f29496e = (android.telephony.TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.C2305Ed b(com.google.android.gms.internal.ads.LS ls, android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.EnumC2231Cd enumC2231Cd;
        com.google.android.gms.internal.ads.EnumC2157Ad enumC2157Ad;
        com.google.android.gms.internal.ads.C5913zd c5913zdD0 = com.google.android.gms.internal.ads.C2305Ed.d0();
        int i6 = bundle.getInt("cnt", -2);
        int i10 = bundle.getInt("gnt", 0);
        if (i6 == -1) {
            ls.f29498g = com.google.android.gms.internal.ads.EnumC2932Ve.ENUM_TRUE;
        } else {
            ls.f29498g = com.google.android.gms.internal.ads.EnumC2932Ve.ENUM_FALSE;
            if (i6 != 0) {
                enumC2231Cd = i6 != 1 ? com.google.android.gms.internal.ads.EnumC2231Cd.NETWORKTYPE_UNSPECIFIED : com.google.android.gms.internal.ads.EnumC2231Cd.WIFI;
            } else {
                enumC2231Cd = com.google.android.gms.internal.ads.EnumC2231Cd.CELL;
            }
            c5913zdD0.A(enumC2231Cd);
            switch (i10) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    enumC2157Ad = com.google.android.gms.internal.ads.EnumC2157Ad.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    enumC2157Ad = com.google.android.gms.internal.ads.EnumC2157Ad.THREE_G;
                    break;
                case 13:
                    enumC2157Ad = com.google.android.gms.internal.ads.EnumC2157Ad.LTE;
                    break;
                default:
                    enumC2157Ad = com.google.android.gms.internal.ads.EnumC2157Ad.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            c5913zdD0.z(enumC2157Ad);
        }
        return (com.google.android.gms.internal.ads.C2305Ed) c5913zdD0.u();
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.EnumC2527Kd c(com.google.android.gms.internal.ads.LS ls, android.os.Bundle bundle) {
        return (com.google.android.gms.internal.ads.EnumC2527Kd) f29493h.get(com.google.android.gms.internal.ads.B70.a(com.google.android.gms.internal.ads.B70.a(bundle, "device"), "network").getInt("active_network_state", -1), com.google.android.gms.internal.ads.EnumC2527Kd.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] f(com.google.android.gms.internal.ads.LS ls, boolean z6, java.util.ArrayList arrayList, com.google.android.gms.internal.ads.C2305Ed c2305Ed, com.google.android.gms.internal.ads.EnumC2527Kd enumC2527Kd) {
        com.google.android.gms.internal.ads.C2453Id c2453IdE0 = com.google.android.gms.internal.ads.C2416Hd.E0();
        c2453IdE0.M(arrayList);
        c2453IdE0.z(g(android.provider.Settings.Global.getInt(ls.f29494c.getContentResolver(), "airplane_mode_on", 0) != 0));
        c2453IdE0.A(p174r3.v.u().f(ls.f29494c, ls.f29496e));
        c2453IdE0.H(ls.f29497f.e());
        c2453IdE0.G(ls.f29497f.b());
        c2453IdE0.B(ls.f29497f.a());
        c2453IdE0.C(enumC2527Kd);
        c2453IdE0.E(c2305Ed);
        c2453IdE0.F(ls.f29498g);
        c2453IdE0.I(g(z6));
        c2453IdE0.K(ls.f29497f.d());
        c2453IdE0.J(p174r3.v.c().a());
        c2453IdE0.L(g(android.provider.Settings.Global.getInt(ls.f29494c.getContentResolver(), "wifi_on", 0) != 0));
        return ((com.google.android.gms.internal.ads.C2416Hd) c2453IdE0.u()).l();
    }

    private static final com.google.android.gms.internal.ads.EnumC2932Ve g(boolean z6) {
        return z6 ? com.google.android.gms.internal.ads.EnumC2932Ve.ENUM_TRUE : com.google.android.gms.internal.ads.EnumC2932Ve.ENUM_FALSE;
    }

    public final void e(boolean z6) {
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(this.f29495d.b(new android.os.Bundle()), new com.google.android.gms.internal.ads.KS(this, z6), com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
    }
}
