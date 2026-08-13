package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2228Cb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.EnumC2671Ob0 f26250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.EnumC2671Ob0 f26251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.EnumC2376Gb0 f26253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.EnumC2487Jb0 f26254e;

    private C2228Cb0(com.google.android.gms.internal.ads.EnumC2376Gb0 enumC2376Gb0, com.google.android.gms.internal.ads.EnumC2487Jb0 enumC2487Jb0, com.google.android.gms.internal.ads.EnumC2671Ob0 enumC2671Ob0, com.google.android.gms.internal.ads.EnumC2671Ob0 enumC2671Ob1, boolean z6) {
        this.f26253d = enumC2376Gb0;
        this.f26254e = enumC2487Jb0;
        this.f26250a = enumC2671Ob0;
        if (enumC2671Ob1 == null) {
            this.f26251b = com.google.android.gms.internal.ads.EnumC2671Ob0.NONE;
        } else {
            this.f26251b = enumC2671Ob1;
        }
        this.f26252c = z6;
    }

    public static com.google.android.gms.internal.ads.C2228Cb0 a(com.google.android.gms.internal.ads.EnumC2376Gb0 enumC2376Gb0, com.google.android.gms.internal.ads.EnumC2487Jb0 enumC2487Jb0, com.google.android.gms.internal.ads.EnumC2671Ob0 enumC2671Ob0, com.google.android.gms.internal.ads.EnumC2671Ob0 enumC2671Ob1, boolean z6) {
        com.google.android.gms.internal.ads.AbstractC5692xc0.c(enumC2376Gb0, "CreativeType is null");
        com.google.android.gms.internal.ads.AbstractC5692xc0.c(enumC2487Jb0, "ImpressionType is null");
        com.google.android.gms.internal.ads.AbstractC5692xc0.c(enumC2671Ob0, "Impression owner is null");
        if (enumC2671Ob0 == com.google.android.gms.internal.ads.EnumC2671Ob0.NONE) {
            throw new java.lang.IllegalArgumentException("Impression owner is none");
        }
        if (enumC2376Gb0 == com.google.android.gms.internal.ads.EnumC2376Gb0.DEFINED_BY_JAVASCRIPT && enumC2671Ob0 == com.google.android.gms.internal.ads.EnumC2671Ob0.NATIVE) {
            throw new java.lang.IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (enumC2487Jb0 == com.google.android.gms.internal.ads.EnumC2487Jb0.DEFINED_BY_JAVASCRIPT && enumC2671Ob0 == com.google.android.gms.internal.ads.EnumC2671Ob0.NATIVE) {
            throw new java.lang.IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new com.google.android.gms.internal.ads.C2228Cb0(enumC2376Gb0, enumC2487Jb0, enumC2671Ob0, enumC2671Ob1, z6);
    }

    public final org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject, "impressionOwner", this.f26250a);
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject, "mediaEventsOwner", this.f26251b);
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject, "creativeType", this.f26253d);
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject, "impressionType", this.f26254e);
        com.google.android.gms.internal.ads.AbstractC5252tc0.e(jSONObject, "isolateVerificationScripts", java.lang.Boolean.valueOf(this.f26252c));
        return jSONObject;
    }
}
