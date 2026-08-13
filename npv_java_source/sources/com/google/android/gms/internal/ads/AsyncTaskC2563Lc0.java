package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncTaskC2563Lc0 extends com.google.android.gms.internal.ads.AbstractAsyncTaskC2415Hc0 {
    public AsyncTaskC2563Lc0(com.google.android.gms.internal.ads.C2230Cc0 c2230Cc0, java.util.HashSet hashSet, org.json.JSONObject jSONObject, long j6) {
        super(c2230Cc0, hashSet, jSONObject, j6);
    }

    private final void c(java.lang.String str) {
        com.google.android.gms.internal.ads.C2963Wb0 c2963Wb0A = com.google.android.gms.internal.ads.C2963Wb0.a();
        if (c2963Wb0A != null) {
            for (com.google.android.gms.internal.ads.C2339Fb0 c2339Fb0 : c2963Wb0A.c()) {
                if (this.f28079c.contains(c2339Fb0.h())) {
                    c2339Fb0.g().d(str, this.f28081e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC2452Ic0
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(java.lang.String str) {
        c(str);
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] objArr) {
        return this.f28080d.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC2452Ic0, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        c(str);
        super.onPostExecute(str);
    }
}
