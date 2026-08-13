package B3;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements com.google.android.gms.internal.ads.ZG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YN f697C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final B3.s0 f698D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f699E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f700F;

    public t0(com.google.android.gms.internal.ads.YN yn, B3.s0 s0Var, java.lang.String str, int i6) {
        this.f697C = yn;
        this.f698D = s0Var;
        this.f699E = str;
        this.f700F = i6;
    }

    @Override // com.google.android.gms.internal.ads.ZG
    public final void G(java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.ZG
    public final void a(B3.N n6) {
        java.lang.String strOptString;
        if (n6 == null || this.f700F == 2) {
            return;
        }
        if (android.text.TextUtils.isEmpty(n6.f554c)) {
            this.f698D.d(this.f699E, n6.f553b, this.f697C);
            return;
        }
        try {
            strOptString = new org.json.JSONObject(n6.f554c).optString("request_id");
        } catch (org.json.JSONException e6) {
            p174r3.v.s().x(e6, "RenderSignals.getRequestId");
            strOptString = null;
        }
        if (android.text.TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f698D.d(strOptString, n6.f554c, this.f697C);
    }
}
