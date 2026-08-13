package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2844Ss implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.lang.String f31792C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.lang.String f31793D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ java.lang.String f31794E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ java.lang.String f31795F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC2880Ts f31796G;

    RunnableC2844Ss(com.google.android.gms.internal.ads.AbstractC2880Ts abstractC2880Ts, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f31792C = str;
        this.f31793D = str2;
        this.f31794E = str3;
        this.f31795F = str4;
        this.f31796G = abstractC2880Ts;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    @Override // java.lang.Runnable
    public final void run() {
        byte b6;
        java.util.HashMap map = new java.util.HashMap();
        map.put("event", "precacheCanceled");
        map.put("src", this.f31792C);
        if (!android.text.TextUtils.isEmpty(this.f31793D)) {
            map.put("cachedSrc", this.f31793D);
        }
        switch (this.f31794E) {
            case "interrupted":
                b6 = 3;
                break;
            case "badUrl":
                b6 = 8;
                break;
            case "inProgress":
                b6 = 2;
                break;
            case "downloadTimeout":
                b6 = 9;
                break;
            case "contentLengthMissing":
                b6 = 0;
                break;
            case "playerFailed":
                b6 = 5;
                break;
            case "sizeExceeded":
                b6 = 11;
                break;
            case "externalAbort":
                b6 = 10;
                break;
            case "noop":
                b6 = 4;
                break;
            case "error":
                b6 = 1;
                break;
            case "expireFailed":
                b6 = 6;
                break;
            case "noCacheDir":
                b6 = 7;
                break;
            default:
                b6 = -1;
                break;
        }
        java.lang.String str = "internal";
        switch (b6) {
            case 6:
            case 7:
                str = "io";
                break;
            case 8:
            case 9:
                str = "network";
                break;
            case 10:
            case 11:
                str = "policy";
                break;
        }
        map.put("type", str);
        map.put("reason", this.f31794E);
        if (!android.text.TextUtils.isEmpty(this.f31795F)) {
            map.put("message", this.f31795F);
        }
        com.google.android.gms.internal.ads.AbstractC2880Ts.b(this.f31796G, "onPrecacheEvent", map);
    }
}
