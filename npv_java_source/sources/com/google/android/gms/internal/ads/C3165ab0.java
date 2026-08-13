package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ab0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3165ab0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f34111a;

    C3165ab0(com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f34111a = c3588eO;
    }

    private final void g(p104k3.EnumC6886c enumC6886c, j$.util.Optional optional, java.lang.String str, long j6, j$.util.Optional optional2) {
        final com.google.android.gms.internal.ads.C3479dO c3479dOA = this.f34111a.a();
        c3479dOA.b(str, java.lang.Long.toString(j6));
        c3479dOA.b("ad_format", enumC6886c == null ? "unknown" : enumC6886c.name());
        optional.ifPresent(new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.Ya0
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                c3479dOA.b("action", (java.lang.String) obj);
            }

            public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
            }
        });
        optional2.ifPresent(new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.Za0
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                c3479dOA.b("gqi", (java.lang.String) obj);
            }

            public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
            }
        });
        c3479dOA.g();
    }

    public final void a(p104k3.EnumC6886c enumC6886c, long j6, j$.util.Optional optional, j$.util.Optional optional2) {
        final com.google.android.gms.internal.ads.C3479dO c3479dOA = this.f34111a.a();
        c3479dOA.b("plaac_ts", java.lang.Long.toString(j6));
        c3479dOA.b("ad_format", enumC6886c.name());
        c3479dOA.b("action", "is_ad_available");
        optional.ifPresent(new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.Wa0
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                c3479dOA.b("plaay_ts", java.lang.Long.toString(((java.lang.Long) obj).longValue()));
            }

            public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
            }
        });
        optional2.ifPresent(new java.util.function.Consumer() { // from class: com.google.android.gms.internal.ads.Xa0
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                c3479dOA.b("gqi", (java.lang.String) obj);
            }

            public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
            }
        });
        c3479dOA.g();
    }

    public final void b(p104k3.EnumC6886c enumC6886c, long j6, j$.util.Optional optional) {
        g(enumC6886c, j$.util.Optional.empty(), "pano_ts", j6, optional);
    }

    public final void c(p104k3.EnumC6886c enumC6886c, long j6) {
        g(enumC6886c, j$.util.Optional.empty(), "paeo_ts", j6, j$.util.Optional.empty());
    }

    public final void d(p104k3.EnumC6886c enumC6886c, long j6) {
        g(enumC6886c, j$.util.Optional.of("poll_ad"), "ppac_ts", j6, j$.util.Optional.empty());
    }

    public final void e(p104k3.EnumC6886c enumC6886c, long j6, j$.util.Optional optional) {
        g(enumC6886c, j$.util.Optional.of("poll_ad"), "ppla_ts", j6, optional);
    }

    public final void f(java.util.Map map, long j6) {
        com.google.android.gms.internal.ads.C3479dO c3479dOA = this.f34111a.a();
        c3479dOA.b("action", "start_preload");
        c3479dOA.b("sp_ts", java.lang.Long.toString(j6));
        for (p104k3.EnumC6886c enumC6886c : map.keySet()) {
            java.lang.String strValueOf = java.lang.String.valueOf(enumC6886c.name().toLowerCase(java.util.Locale.ENGLISH));
            c3479dOA.b(strValueOf.concat("_count"), java.lang.Integer.toString(((java.lang.Integer) map.get(enumC6886c)).intValue()));
        }
        c3479dOA.g();
    }
}
