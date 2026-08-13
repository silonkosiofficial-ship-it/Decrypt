package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5346uP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f39151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.pm.ApplicationInfo f39152b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f39155e = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f39153c = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25511b9)).intValue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f39154d = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25522c9)).intValue();

    public C5346uP(android.content.Context context) {
        this.f39151a = context;
        this.f39152b = context.getApplicationInfo();
    }

    public final org.json.JSONObject a() throws org.json.JSONException {
        java.lang.String strV;
        java.lang.String strEncodeToString;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            android.content.Context context = this.f39151a;
            java.lang.String str = this.f39152b.packageName;
            com.google.android.gms.internal.ads.HandlerC2345Fe0 handlerC2345Fe0 = p214v3.E0.f55826l;
            jSONObject.put("name", W3.e.a(context).d(str));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f39152b.packageName);
        p174r3.v.t();
        android.graphics.drawable.Drawable drawable = null;
        try {
            strV = p214v3.E0.V(this.f39151a);
        } catch (android.os.RemoteException unused2) {
            strV = null;
        }
        jSONObject.put("adMobAppId", strV);
        if (this.f39155e.isEmpty()) {
            try {
                drawable = (android.graphics.drawable.Drawable) W3.e.a(this.f39151a).e(this.f39152b.packageName).f501b;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                strEncodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.f39153c, this.f39154d);
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(this.f39153c, this.f39154d, android.graphics.Bitmap.Config.ARGB_8888);
                drawable.draw(new android.graphics.Canvas(bitmapCreateBitmap));
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                bitmapCreateBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f39155e = strEncodeToString;
        }
        if (!this.f39155e.isEmpty()) {
            jSONObject.put("icon", this.f39155e);
            jSONObject.put("iconWidthPx", this.f39153c);
            jSONObject.put("iconHeightPx", this.f39154d);
        }
        return jSONObject;
    }
}
