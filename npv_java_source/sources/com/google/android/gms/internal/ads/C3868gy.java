package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3868gy implements com.google.android.gms.internal.ads.InterfaceC4720ol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f35955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2486Jb f35956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.os.PowerManager f35957c;

    public C3868gy(android.content.Context context, com.google.android.gms.internal.ads.C2486Jb c2486Jb) {
        this.f35955a = context;
        this.f35956b = c2486Jb;
        this.f35957c = (android.os.PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4720ol
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final org.json.JSONObject c(com.google.android.gms.internal.ads.C4196jy c4196jy) throws org.json.JSONException {
        org.json.JSONObject jSONObject;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        com.google.android.gms.internal.ads.C2596Mb c2596Mb = c4196jy.f36877f;
        if (c2596Mb == null) {
            jSONObject = new org.json.JSONObject();
        } else {
            if (this.f35956b.d() == null) {
                throw new org.json.JSONException("Active view Info cannot be null.");
            }
            boolean z6 = c2596Mb.f29791a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("afmaVersion", this.f35956b.b()).put("activeViewJSON", this.f35956b.d()).put("timestamp", c4196jy.f36875d).put("adFormat", this.f35956b.a()).put("hashCode", this.f35956b.c()).put("isMraid", false).put("isStopped", false).put("isPaused", c4196jy.f36873b).put("isNative", this.f35956b.e()).put("isScreenOn", this.f35957c.isInteractive()).put("appMuted", p174r3.v.v().e()).put("appVolume", p174r3.v.v().a()).put("deviceVolume", p214v3.C7236c.b(this.f35955a.getApplicationContext()));
            android.graphics.Rect rect = new android.graphics.Rect();
            android.view.Display defaultDisplay = ((android.view.WindowManager) this.f35955a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", c2596Mb.f29792b).put("isAttachedToWindow", z6).put("viewBox", new org.json.JSONObject().put("top", c2596Mb.f29793c.top).put("bottom", c2596Mb.f29793c.bottom).put("left", c2596Mb.f29793c.left).put("right", c2596Mb.f29793c.right)).put("adBox", new org.json.JSONObject().put("top", c2596Mb.f29794d.top).put("bottom", c2596Mb.f29794d.bottom).put("left", c2596Mb.f29794d.left).put("right", c2596Mb.f29794d.right)).put("globalVisibleBox", new org.json.JSONObject().put("top", c2596Mb.f29795e.top).put("bottom", c2596Mb.f29795e.bottom).put("left", c2596Mb.f29795e.left).put("right", c2596Mb.f29795e.right)).put("globalVisibleBoxVisible", c2596Mb.f29796f).put("localVisibleBox", new org.json.JSONObject().put("top", c2596Mb.f29797g.top).put("bottom", c2596Mb.f29797g.bottom).put("left", c2596Mb.f29797g.left).put("right", c2596Mb.f29797g.right)).put("localVisibleBoxVisible", c2596Mb.f29798h).put("hitBox", new org.json.JSONObject().put("top", c2596Mb.f29799i.top).put("bottom", c2596Mb.f29799i.bottom).put("left", c2596Mb.f29799i.left).put("right", c2596Mb.f29799i.right)).put("screenDensity", this.f35955a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", c4196jy.f36872a);
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25743y1)).booleanValue()) {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                java.util.List<android.graphics.Rect> list = c2596Mb.f29801k;
                if (list != null) {
                    for (android.graphics.Rect rect2 : list) {
                        jSONArray2.put(new org.json.JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!android.text.TextUtils.isEmpty(c4196jy.f36876e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
