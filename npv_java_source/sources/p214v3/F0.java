package p214v3;

/* JADX INFO: loaded from: classes.dex */
public class F0 extends p214v3.AbstractC7234b {
    public F0() {
        super(null);
    }

    @Override // p214v3.AbstractC7234b
    public final android.webkit.CookieManager a(android.content.Context context) {
        p174r3.v.t();
        if (p214v3.E0.g()) {
            return null;
        }
        try {
            return android.webkit.CookieManager.getInstance();
        } catch (java.lang.Throwable th) {
            p224w3.p.e("Failed to obtain CookieManager.", th);
            p174r3.v.s().w(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // p214v3.AbstractC7234b
    public final android.webkit.WebResourceResponse b(java.lang.String str, java.lang.String str2, int i6, java.lang.String str3, java.util.Map map, java.io.InputStream inputStream) {
        return new android.webkit.WebResourceResponse(str, str2, i6, str3, map, inputStream);
    }

    @Override // p214v3.AbstractC7234b
    public final com.google.android.gms.internal.ads.AbstractC3097Zt c(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.C4704od c4704od, boolean z6, com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT) {
        return new com.google.android.gms.internal.ads.C2219Bu(interfaceC2698Ot, c4704od, z6, binderC5240tT);
    }
}
