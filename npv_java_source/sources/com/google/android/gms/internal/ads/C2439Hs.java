package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2439Hs implements com.google.android.gms.internal.ads.InterfaceC3838gj {
    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs = (com.google.android.gms.internal.ads.InterfaceC3746fs) obj;
        com.google.android.gms.internal.ads.BinderC5287tu binderC5287tuS = interfaceC3746fs.s();
        if (binderC5287tuS == null) {
            try {
                com.google.android.gms.internal.ads.BinderC5287tu binderC5287tu = new com.google.android.gms.internal.ads.BinderC5287tu(interfaceC3746fs, java.lang.Float.parseFloat((java.lang.String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                interfaceC3746fs.v(binderC5287tu);
                binderC5287tuS = binderC5287tu;
            } catch (java.lang.NullPointerException e6) {
                e = e6;
                p224w3.p.e("Unable to parse videoMeta message.", e);
                p174r3.v.s().x(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (java.lang.NumberFormatException e10) {
                e = e10;
                p224w3.p.e("Unable to parse videoMeta message.", e);
                p174r3.v.s().x(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f6 = java.lang.Float.parseFloat((java.lang.String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f10 = java.lang.Float.parseFloat((java.lang.String) map.get("currentTime"));
        int i6 = java.lang.Integer.parseInt((java.lang.String) map.get("playbackState"));
        int i10 = 0;
        if (i6 >= 0 && i6 <= 3) {
            i10 = i6;
        }
        java.lang.String str = (java.lang.String) map.get("aspectRatio");
        float f11 = android.text.TextUtils.isEmpty(str) ? 0.0f : java.lang.Float.parseFloat(str);
        if (p224w3.p.j(3)) {
            p224w3.p.b("Video Meta GMSG: currentTime : " + f10 + " , duration : " + f6 + " , isMuted : " + zEquals + " , playbackState : " + i10 + " , aspectRatio : " + str);
        }
        binderC5287tuS.p6(f10, f6, i10, zEquals, f11);
    }
}
