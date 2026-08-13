package p214v3;

/* JADX INFO: loaded from: classes.dex */
final class L extends com.google.android.gms.internal.ads.H7 {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    final /* synthetic */ byte[] f55853Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    final /* synthetic */ java.util.Map f55854R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ p224w3.m f55855S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(p214v3.Q q6, int i6, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3777g7 interfaceC3777g7, com.google.android.gms.internal.ads.InterfaceC3667f7 interfaceC3667f7, byte[] bArr, java.util.Map map, p224w3.m mVar) {
        super(i6, str, interfaceC3777g7, interfaceC3667f7);
        this.f55853Q = bArr;
        this.f55854R = map;
        this.f55855S = mVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3448d7
    public final byte[] G() {
        byte[] bArr = this.f55853Q;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.H7
    protected final void I(java.lang.String str) {
        this.f55855S.g(str);
        super.I(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3448d7
    public final java.util.Map u() {
        java.util.Map map = this.f55854R;
        return map == null ? java.util.Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3448d7
    protected final /* bridge */ /* synthetic */ void x(java.lang.Object obj) {
        I((java.lang.String) obj);
    }
}
