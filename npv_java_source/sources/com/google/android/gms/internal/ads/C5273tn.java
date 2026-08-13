package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5273tn extends com.google.android.gms.internal.ads.C5603wn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f39030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.content.Context f39031d;

    public C5273tn(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, java.util.Map map) {
        super(interfaceC2698Ot, "storePicture");
        this.f39030c = map;
        this.f39031d = interfaceC2698Ot.h();
    }

    public final void i() {
        if (this.f39031d == null) {
            c("Activity context is not available");
            return;
        }
        p174r3.v.t();
        if (!new com.google.android.gms.internal.ads.C3940hf(this.f39031d).c()) {
            c("Feature is not supported by the device.");
            return;
        }
        java.lang.String str = (java.lang.String) this.f39030c.get("iurl");
        if (android.text.TextUtils.isEmpty(str)) {
            c("Image url cannot be empty.");
            return;
        }
        if (!android.webkit.URLUtil.isValidUrl(str)) {
            c("Invalid image url: ".concat(java.lang.String.valueOf(str)));
            return;
        }
        java.lang.String lastPathSegment = android.net.Uri.parse(str).getLastPathSegment();
        p174r3.v.t();
        if (android.text.TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            c("Image type not recognized: ".concat(java.lang.String.valueOf(lastPathSegment)));
            return;
        }
        android.content.res.Resources resourcesF = p174r3.v.s().f();
        p174r3.v.t();
        android.app.AlertDialog.Builder builderL = p214v3.E0.l(this.f39031d);
        builderL.setTitle(resourcesF != null ? resourcesF.getString(p154p3.d.f52744n) : "Save image");
        builderL.setMessage(resourcesF != null ? resourcesF.getString(p154p3.d.f52745o) : "Allow Ad to store image in Picture gallery?");
        builderL.setPositiveButton(resourcesF != null ? resourcesF.getString(p154p3.d.f52746p) : "Accept", new com.google.android.gms.internal.ads.DialogInterfaceOnClickListenerC5053rn(this, str, lastPathSegment));
        builderL.setNegativeButton(resourcesF != null ? resourcesF.getString(p154p3.d.f52747q) : "Decline", new com.google.android.gms.internal.ads.DialogInterfaceOnClickListenerC5163sn(this));
        builderL.create().show();
    }
}
