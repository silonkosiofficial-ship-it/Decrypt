package p214v3;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends p214v3.B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p224w3.v f55867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f55868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p224w3.w f55869e;

    public Z(android.content.Context context, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C2189Ba0 c2189Ba0, p224w3.w wVar) {
        this.f55867c = new p224w3.v(p174r3.v.t().H(context, str));
        this.f55868d = str2;
        this.f55869e = wVar;
    }

    @Override // p214v3.B
    public final void a() {
        p224w3.w wVar = this.f55869e;
        if (wVar == null) {
            this.f55867c.o(this.f55868d);
        } else {
            new com.google.android.gms.internal.ads.C2152Aa0(wVar.b(), this.f55867c, com.google.android.gms.internal.ads.AbstractC3524dr.f34799e, null).d(this.f55868d);
        }
    }
}
