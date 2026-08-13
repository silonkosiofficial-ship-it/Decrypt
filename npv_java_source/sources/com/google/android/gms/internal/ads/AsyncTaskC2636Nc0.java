package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncTaskC2636Nc0 extends com.google.android.gms.internal.ads.AbstractAsyncTaskC2415Hc0 {
    public AsyncTaskC2636Nc0(com.google.android.gms.internal.ads.C2230Cc0 c2230Cc0, java.util.HashSet hashSet, org.json.JSONObject jSONObject, long j6) {
        super(c2230Cc0, hashSet, jSONObject, j6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC2452Ic0
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(java.lang.String str) {
        com.google.android.gms.internal.ads.C2963Wb0 c2963Wb0A;
        if (!android.text.TextUtils.isEmpty(str) && (c2963Wb0A = com.google.android.gms.internal.ads.C2963Wb0.a()) != null) {
            for (com.google.android.gms.internal.ads.C2339Fb0 c2339Fb0 : c2963Wb0A.c()) {
                if (this.f28079c.contains(c2339Fb0.h())) {
                    c2339Fb0.g().h(str, this.f28081e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] objArr) {
        if (com.google.android.gms.internal.ads.AbstractC5252tc0.g(this.f28080d, this.f28486b.a())) {
            return null;
        }
        this.f28486b.e(this.f28080d);
        return this.f28080d.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC2452Ic0, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(java.lang.Object obj) {
        onPostExecute((java.lang.String) obj);
    }
}
