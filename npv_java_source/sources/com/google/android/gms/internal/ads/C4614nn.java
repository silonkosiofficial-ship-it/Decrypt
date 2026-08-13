package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4614nn extends com.google.android.gms.internal.ads.C5603wn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f37650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.content.Context f37651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f37652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f37653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f37654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f37655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.lang.String f37656i;

    public C4614nn(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, java.util.Map map) {
        super(interfaceC2698Ot, "createCalendarEvent");
        this.f37650c = map;
        this.f37651d = interfaceC2698Ot.h();
        this.f37652e = l("description");
        this.f37655h = l("summary");
        this.f37653f = k("start_ticks");
        this.f37654g = k("end_ticks");
        this.f37656i = l("location");
    }

    private final long k(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) this.f37650c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return java.lang.Long.parseLong(str2);
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    private final java.lang.String l(java.lang.String str) {
        return android.text.TextUtils.isEmpty((java.lang.CharSequence) this.f37650c.get(str)) ? "" : (java.lang.String) this.f37650c.get(str);
    }

    final android.content.Intent i() {
        android.content.Intent data = new android.content.Intent("android.intent.action.EDIT").setData(android.provider.CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f37652e);
        data.putExtra("eventLocation", this.f37656i);
        data.putExtra("description", this.f37655h);
        long j6 = this.f37653f;
        if (j6 > -1) {
            data.putExtra("beginTime", j6);
        }
        long j10 = this.f37654g;
        if (j10 > -1) {
            data.putExtra("endTime", j10);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void j() {
        if (this.f37651d == null) {
            c("Activity context is not available.");
            return;
        }
        p174r3.v.t();
        if (!new com.google.android.gms.internal.ads.C3940hf(this.f37651d).b()) {
            c("This feature is not available on the device.");
            return;
        }
        p174r3.v.t();
        android.app.AlertDialog.Builder builderL = p214v3.E0.l(this.f37651d);
        android.content.res.Resources resourcesF = p174r3.v.s().f();
        builderL.setTitle(resourcesF != null ? resourcesF.getString(p154p3.d.f52748r) : "Create calendar event");
        builderL.setMessage(resourcesF != null ? resourcesF.getString(p154p3.d.f52749s) : "Allow Ad to create a calendar event?");
        builderL.setPositiveButton(resourcesF != null ? resourcesF.getString(p154p3.d.f52746p) : "Accept", new com.google.android.gms.internal.ads.DialogInterfaceOnClickListenerC4394ln(this));
        builderL.setNegativeButton(resourcesF != null ? resourcesF.getString(p154p3.d.f52747q) : "Decline", new com.google.android.gms.internal.ads.DialogInterfaceOnClickListenerC4504mn(this));
        builderL.create().show();
    }
}
