package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ic0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractAsyncTaskC2452Ic0 extends android.os.AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2489Jc0 f28485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.internal.ads.C2230Cc0 f28486b;

    public AbstractAsyncTaskC2452Ic0(com.google.android.gms.internal.ads.C2230Cc0 c2230Cc0) {
        this.f28486b = c2230Cc0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(java.lang.String str) {
        com.google.android.gms.internal.ads.C2489Jc0 c2489Jc0 = this.f28485a;
        if (c2489Jc0 != null) {
            c2489Jc0.a(this);
        }
    }

    public final void b(com.google.android.gms.internal.ads.C2489Jc0 c2489Jc0) {
        this.f28485a = c2489Jc0;
    }
}
