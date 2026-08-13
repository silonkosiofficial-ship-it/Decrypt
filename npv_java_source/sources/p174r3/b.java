package p174r3;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f53838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f53839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3194aq f53840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5605wo f53841d = new com.google.android.gms.internal.ads.C5605wo(false, java.util.Collections.emptyList());

    public b(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC3194aq interfaceC3194aq, com.google.android.gms.internal.ads.C5605wo c5605wo) {
        this.f53838a = context;
        this.f53840c = interfaceC3194aq;
    }

    private final boolean d() {
        com.google.android.gms.internal.ads.InterfaceC3194aq interfaceC3194aq = this.f53840c;
        return (interfaceC3194aq != null && interfaceC3194aq.a().f33176H) || this.f53841d.f39685C;
    }

    public final void a() {
        this.f53839b = true;
    }

    public final void b(java.lang.String str) {
        java.util.List<java.lang.String> list;
        if (d()) {
            if (str == null) {
                str = "";
            }
            com.google.android.gms.internal.ads.InterfaceC3194aq interfaceC3194aq = this.f53840c;
            if (interfaceC3194aq != null) {
                interfaceC3194aq.b(str, null, 3);
                return;
            }
            com.google.android.gms.internal.ads.C5605wo c5605wo = this.f53841d;
            if (!c5605wo.f39685C || (list = c5605wo.f39686D) == null) {
                return;
            }
            for (java.lang.String str2 : list) {
                if (!android.text.TextUtils.isEmpty(str2)) {
                    java.lang.String strReplace = str2.replace("{NAVIGATION_URL}", android.net.Uri.encode(str));
                    android.content.Context context = this.f53838a;
                    p174r3.v.t();
                    p214v3.E0.m(context, "", strReplace);
                }
            }
        }
    }

    public final boolean c() {
        return !d() || this.f53839b;
    }
}
