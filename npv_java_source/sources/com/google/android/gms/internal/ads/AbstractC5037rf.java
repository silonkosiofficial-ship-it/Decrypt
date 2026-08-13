package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5037rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f38519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f38520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Object f38521d;

    /* synthetic */ AbstractC5037rf(int i6, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, com.google.android.gms.internal.ads.AbstractC4928qf abstractC4928qf) {
        this.f38518a = i6;
        this.f38519b = str;
        this.f38520c = obj;
        this.f38521d = obj2;
        p184s3.A.a().d(this);
    }

    public static com.google.android.gms.internal.ads.AbstractC5037rf f(int i6, java.lang.String str, float f6, float f10) {
        return new com.google.android.gms.internal.ads.C4598nf(1, str, java.lang.Float.valueOf(f6), java.lang.Float.valueOf(f10));
    }

    public static com.google.android.gms.internal.ads.AbstractC5037rf g(int i6, java.lang.String str, int i10, int i11) {
        return new com.google.android.gms.internal.ads.C4378lf(1, str, java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i11));
    }

    public static com.google.android.gms.internal.ads.AbstractC5037rf h(int i6, java.lang.String str, long j6, long j10) {
        return new com.google.android.gms.internal.ads.C4488mf(1, str, java.lang.Long.valueOf(j6), java.lang.Long.valueOf(j10));
    }

    public static com.google.android.gms.internal.ads.AbstractC5037rf i(int i6, java.lang.String str) {
        com.google.android.gms.internal.ads.C4818pf c4818pf = new com.google.android.gms.internal.ads.C4818pf(1, "gads:sdk_core_constants:experiment_id", null, null);
        p184s3.A.a().c(c4818pf);
        return c4818pf;
    }

    protected abstract java.lang.Object a(org.json.JSONObject jSONObject);

    public abstract java.lang.Object b(android.os.Bundle bundle);

    protected abstract java.lang.Object c(android.content.SharedPreferences sharedPreferences);

    public abstract void d(android.content.SharedPreferences.Editor editor, java.lang.Object obj);

    public final int e() {
        return this.f38518a;
    }

    public final java.lang.Object j() {
        return p184s3.A.c().a(this);
    }

    public final java.lang.Object k() {
        return p184s3.A.c().f() ? this.f38521d : this.f38520c;
    }

    public final java.lang.String l() {
        return this.f38519b;
    }
}
