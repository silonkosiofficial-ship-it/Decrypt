package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2230Cc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.json.JSONObject f26261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2489Jc0 f26262b;

    public C2230Cc0(com.google.android.gms.internal.ads.C2489Jc0 c2489Jc0) {
        this.f26262b = c2489Jc0;
    }

    public final org.json.JSONObject a() {
        return this.f26261a;
    }

    public final void b() {
        this.f26262b.b(new com.google.android.gms.internal.ads.AsyncTaskC2526Kc0(this));
    }

    public final void c(org.json.JSONObject jSONObject, java.util.HashSet hashSet, long j6) {
        this.f26262b.b(new com.google.android.gms.internal.ads.AsyncTaskC2563Lc0(this, hashSet, jSONObject, j6));
    }

    public final void d(org.json.JSONObject jSONObject, java.util.HashSet hashSet, long j6) {
        this.f26262b.b(new com.google.android.gms.internal.ads.AsyncTaskC2636Nc0(this, hashSet, jSONObject, j6));
    }

    public final void e(org.json.JSONObject jSONObject) {
        this.f26261a = jSONObject;
    }
}
