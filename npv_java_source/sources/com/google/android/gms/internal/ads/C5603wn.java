package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5603wn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f39680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f39681b;

    public C5603wn(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, java.lang.String str) {
        this.f39680a = interfaceC2698Ot;
        this.f39681b = str;
    }

    public final void b(int i6, int i10, int i11, int i12) {
        try {
            this.f39680a.a("onDefaultPositionReceived", new org.json.JSONObject().put("x", i6).put("y", i10).put("width", i11).put("height", i12));
        } catch (org.json.JSONException e6) {
            p224w3.p.e("Error occurred while dispatching default position.", e6);
        }
    }

    public final void c(java.lang.String str) {
        try {
            org.json.JSONObject jSONObjectPut = new org.json.JSONObject().put("message", str).put("action", this.f39681b);
            com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f39680a;
            if (interfaceC2698Ot != null) {
                interfaceC2698Ot.a("onError", jSONObjectPut);
            }
        } catch (org.json.JSONException e6) {
            p224w3.p.e("Error occurred while dispatching error event.", e6);
        }
    }

    public final void d(java.lang.String str) {
        try {
            this.f39680a.a("onReadyEventReceived", new org.json.JSONObject().put("js", str));
        } catch (org.json.JSONException e6) {
            p224w3.p.e("Error occurred while dispatching ready Event.", e6);
        }
    }

    public final void e(int i6, int i10, int i11, int i12, float f6, int i13) {
        try {
            this.f39680a.a("onScreenInfoChanged", new org.json.JSONObject().put("width", i6).put("height", i10).put("maxSizeWidth", i11).put("maxSizeHeight", i12).put("density", f6).put("rotation", i13));
        } catch (org.json.JSONException e6) {
            p224w3.p.e("Error occurred while obtaining screen information.", e6);
        }
    }

    public final void f(int i6, int i10, int i11, int i12) {
        try {
            this.f39680a.a("onSizeChanged", new org.json.JSONObject().put("x", i6).put("y", i10).put("width", i11).put("height", i12));
        } catch (org.json.JSONException e6) {
            p224w3.p.e("Error occurred while dispatching size change.", e6);
        }
    }

    public final void g(java.lang.String str) {
        try {
            this.f39680a.a("onStateChanged", new org.json.JSONObject().put("state", str));
        } catch (org.json.JSONException e6) {
            p224w3.p.e("Error occurred while dispatching state change.", e6);
        }
    }
}
