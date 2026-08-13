package p214v3;

/* JADX INFO: loaded from: classes.dex */
public final class O extends com.google.android.gms.internal.ads.AbstractC3448d7 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4512mr f55857O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final p224w3.m f55858P;

    public O(java.lang.String str, java.util.Map map, com.google.android.gms.internal.ads.C4512mr c4512mr) {
        super(0, str, new p214v3.N(c4512mr));
        this.f55857O = c4512mr;
        p224w3.m mVar = new p224w3.m(null);
        this.f55858P = mVar;
        mVar.d(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3448d7
    protected final com.google.android.gms.internal.ads.C3887h7 q(com.google.android.gms.internal.ads.Z6 z6) {
        return com.google.android.gms.internal.ads.C3887h7.b(z6, com.google.android.gms.internal.ads.AbstractC5864z7.b(z6));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3448d7
    protected final /* bridge */ /* synthetic */ void x(java.lang.Object obj) {
        com.google.android.gms.internal.ads.Z6 z6 = (com.google.android.gms.internal.ads.Z6) obj;
        this.f55858P.f(z6.f33502c, z6.f33500a);
        byte[] bArr = z6.f33501b;
        if (p224w3.m.k() && bArr != null) {
            this.f55858P.h(bArr);
        }
        this.f55857O.c(z6);
    }
}
