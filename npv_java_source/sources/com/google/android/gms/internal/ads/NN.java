package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class NN {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.AbstractC3398ci0 f30280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.AbstractC3398ci0 f30281e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f30282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.MN f30283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.MN f30284c;

    static {
        com.google.android.gms.internal.ads.MN mn = com.google.android.gms.internal.ads.MN.PUBLIC_API_CALL;
        com.google.android.gms.internal.ads.MN mn2 = com.google.android.gms.internal.ads.MN.PUBLIC_API_CALLBACK;
        com.google.android.gms.internal.ads.NN nn = new com.google.android.gms.internal.ads.NN("tqgt", mn, mn2);
        com.google.android.gms.internal.ads.MN mn3 = com.google.android.gms.internal.ads.MN.DYNAMITE_ENTER;
        com.google.android.gms.internal.ads.NN nn2 = new com.google.android.gms.internal.ads.NN("l.dl", mn, mn3);
        com.google.android.gms.internal.ads.MN mn4 = com.google.android.gms.internal.ads.MN.READ_FROM_DISK_START;
        com.google.android.gms.internal.ads.NN nn3 = new com.google.android.gms.internal.ads.NN("l.rccde", mn3, mn4);
        com.google.android.gms.internal.ads.NN nn4 = new com.google.android.gms.internal.ads.NN("l.rfd", mn4, com.google.android.gms.internal.ads.MN.READ_FROM_DISK_END);
        com.google.android.gms.internal.ads.MN mn5 = com.google.android.gms.internal.ads.MN.CLIENT_SIGNALS_START;
        com.google.android.gms.internal.ads.NN nn5 = new com.google.android.gms.internal.ads.NN("l.rcc", mn3, mn5);
        com.google.android.gms.internal.ads.MN mn6 = com.google.android.gms.internal.ads.MN.CLIENT_SIGNALS_END;
        com.google.android.gms.internal.ads.NN nn6 = new com.google.android.gms.internal.ads.NN("l.cs", mn5, mn6);
        com.google.android.gms.internal.ads.MN mn7 = com.google.android.gms.internal.ads.MN.SERVICE_CONNECTED;
        com.google.android.gms.internal.ads.NN nn7 = new com.google.android.gms.internal.ads.NN("l.cts", mn6, mn7);
        com.google.android.gms.internal.ads.MN mn8 = com.google.android.gms.internal.ads.MN.GMS_SIGNALS_START;
        com.google.android.gms.internal.ads.MN mn9 = com.google.android.gms.internal.ads.MN.GMS_SIGNALS_END;
        com.google.android.gms.internal.ads.NN nn8 = new com.google.android.gms.internal.ads.NN("l.gs", mn8, mn9);
        com.google.android.gms.internal.ads.MN mn10 = com.google.android.gms.internal.ads.MN.GET_SIGNALS_SDKCORE_START;
        com.google.android.gms.internal.ads.NN nn9 = new com.google.android.gms.internal.ads.NN("l.jse", mn9, mn10);
        com.google.android.gms.internal.ads.MN mn11 = com.google.android.gms.internal.ads.MN.GET_SIGNALS_SDKCORE_END;
        com.google.android.gms.internal.ads.NN nn10 = new com.google.android.gms.internal.ads.NN("l.gs-sdkcore", mn10, mn11);
        com.google.android.gms.internal.ads.NN nn11 = new com.google.android.gms.internal.ads.NN("l.gs-pp", mn11, mn2);
        com.google.android.gms.internal.ads.MN mn12 = com.google.android.gms.internal.ads.MN.RENDERING_START;
        com.google.android.gms.internal.ads.NN nn12 = new com.google.android.gms.internal.ads.NN("l.render", mn12, mn2);
        com.google.android.gms.internal.ads.MN mn13 = com.google.android.gms.internal.ads.MN.RENDERING_WEBVIEW_CREATION_START;
        com.google.android.gms.internal.ads.NN nn13 = new com.google.android.gms.internal.ads.NN("l.render.pre", mn12, mn13);
        com.google.android.gms.internal.ads.MN mn14 = com.google.android.gms.internal.ads.MN.RENDERING_WEBVIEW_CREATION_END;
        com.google.android.gms.internal.ads.NN nn14 = new com.google.android.gms.internal.ads.NN("l.render.wvc", mn13, mn14);
        com.google.android.gms.internal.ads.MN mn15 = com.google.android.gms.internal.ads.MN.RENDERING_AD_COMPONENT_CREATION_END;
        com.google.android.gms.internal.ads.NN nn15 = new com.google.android.gms.internal.ads.NN("l.render.acc", mn14, mn15);
        com.google.android.gms.internal.ads.MN mn16 = com.google.android.gms.internal.ads.MN.RENDERING_CONFIGURE_WEBVIEW_START;
        com.google.android.gms.internal.ads.MN mn17 = com.google.android.gms.internal.ads.MN.RENDERING_CONFIGURE_WEBVIEW_END;
        com.google.android.gms.internal.ads.NN nn16 = new com.google.android.gms.internal.ads.NN("l.render.cfg-wv", mn16, mn17);
        com.google.android.gms.internal.ads.MN mn18 = com.google.android.gms.internal.ads.MN.RENDERING_WEBVIEW_LOAD_HTML_START;
        com.google.android.gms.internal.ads.MN mn19 = com.google.android.gms.internal.ads.MN.RENDERING_WEBVIEW_LOAD_HTML_END;
        f30280d = com.google.android.gms.internal.ads.AbstractC3398ci0.U(nn, nn2, nn3, nn4, nn5, nn6, nn7, nn8, nn9, nn10, nn11, nn12, nn13, nn14, nn15, nn16, new com.google.android.gms.internal.ads.NN("l.render.wvlh", mn18, mn19), new com.google.android.gms.internal.ads.NN("l.render.post", mn19, mn2), new com.google.android.gms.internal.ads.NN("l.sodv", com.google.android.gms.internal.ads.MN.SIGNAL_ON_DISK_VALIDATION_START, com.google.android.gms.internal.ads.MN.SIGNAL_ON_DISK_VALIDATION_END), new com.google.android.gms.internal.ads.NN("l.sodck", com.google.android.gms.internal.ads.MN.SIGNAL_ON_DISK_CACHE_KEY_START, com.google.android.gms.internal.ads.MN.SIGNAL_ON_DISK_CACHE_KEY_END), new com.google.android.gms.internal.ads.NN("l.sodrar", com.google.android.gms.internal.ads.MN.SIGNAL_ON_DISK_READ_AND_REMOVE_START, com.google.android.gms.internal.ads.MN.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new com.google.android.gms.internal.ads.NN("l.soddc", com.google.android.gms.internal.ads.MN.SIGNAL_ON_DISK_DECODE_START, com.google.android.gms.internal.ads.MN.SIGNAL_ON_DISK_DECODE_END));
        com.google.android.gms.internal.ads.NN nn17 = new com.google.android.gms.internal.ads.NN("l.al", mn, mn2);
        com.google.android.gms.internal.ads.NN nn18 = new com.google.android.gms.internal.ads.NN("l.al2", mn3, mn2);
        com.google.android.gms.internal.ads.NN nn19 = new com.google.android.gms.internal.ads.NN("l.dl", mn, mn3);
        com.google.android.gms.internal.ads.NN nn20 = new com.google.android.gms.internal.ads.NN("l.rcc", mn3, mn5);
        com.google.android.gms.internal.ads.NN nn21 = new com.google.android.gms.internal.ads.NN("l.cs", mn5, mn6);
        com.google.android.gms.internal.ads.NN nn22 = new com.google.android.gms.internal.ads.NN("l.cts", mn6, mn7);
        com.google.android.gms.internal.ads.NN nn23 = new com.google.android.gms.internal.ads.NN("l.gs", mn8, mn9);
        com.google.android.gms.internal.ads.MN mn20 = com.google.android.gms.internal.ads.MN.GET_AD_DICTIONARY_SDKCORE_START;
        com.google.android.gms.internal.ads.NN nn24 = new com.google.android.gms.internal.ads.NN("l.jse", mn9, mn20);
        com.google.android.gms.internal.ads.MN mn21 = com.google.android.gms.internal.ads.MN.GET_AD_DICTIONARY_SDKCORE_END;
        com.google.android.gms.internal.ads.NN nn25 = new com.google.android.gms.internal.ads.NN("l.gad-js", mn20, mn21);
        com.google.android.gms.internal.ads.MN mn22 = com.google.android.gms.internal.ads.MN.HTTP_RESPONSE_READY;
        com.google.android.gms.internal.ads.NN nn26 = new com.google.android.gms.internal.ads.NN("l.http", mn21, mn22);
        com.google.android.gms.internal.ads.MN mn23 = com.google.android.gms.internal.ads.MN.NORMALIZATION_AD_RESPONSE_START;
        com.google.android.gms.internal.ads.NN nn27 = new com.google.android.gms.internal.ads.NN("l.jse-nml", mn22, mn23);
        com.google.android.gms.internal.ads.MN mn24 = com.google.android.gms.internal.ads.MN.NORMALIZATION_AD_RESPONSE_END;
        com.google.android.gms.internal.ads.NN nn28 = new com.google.android.gms.internal.ads.NN("l.nml-js", mn23, mn24);
        com.google.android.gms.internal.ads.MN mn25 = com.google.android.gms.internal.ads.MN.BINDER_CALL_START;
        com.google.android.gms.internal.ads.NN nn29 = new com.google.android.gms.internal.ads.NN("l.nml-gmsg", mn24, mn25);
        com.google.android.gms.internal.ads.MN mn26 = com.google.android.gms.internal.ads.MN.SERVER_RESPONSE_PARSE_START;
        f30281e = com.google.android.gms.internal.ads.AbstractC3398ci0.U(nn17, nn18, nn19, nn20, nn21, nn22, nn23, nn24, nn25, nn26, nn27, nn28, nn29, new com.google.android.gms.internal.ads.NN("l.binder", mn25, mn26), new com.google.android.gms.internal.ads.NN("l.sr", mn26, mn12), new com.google.android.gms.internal.ads.NN("l.render", mn12, mn2), new com.google.android.gms.internal.ads.NN("l.t2", com.google.android.gms.internal.ads.MN.RENDERING_ADSTRING_TYPE2_FETCH_START, com.google.android.gms.internal.ads.MN.RENDERING_ADSTRING_TYPE2_FETCH_END), new com.google.android.gms.internal.ads.NN("l.render.wvc", mn13, mn14), new com.google.android.gms.internal.ads.NN("l.render.acc", mn14, mn15), new com.google.android.gms.internal.ads.NN("l.render.cfg-wv", mn16, mn17), new com.google.android.gms.internal.ads.NN("l.render.pre", mn12, mn13), new com.google.android.gms.internal.ads.NN("l.render.post", mn19, mn2), new com.google.android.gms.internal.ads.NN("l.render.wvlh", mn18, mn19));
    }

    public NN(java.lang.String str, com.google.android.gms.internal.ads.MN mn, com.google.android.gms.internal.ads.MN mn2) {
        this.f30282a = str;
        this.f30283b = mn;
        this.f30284c = mn2;
    }

    public final com.google.android.gms.internal.ads.MN a() {
        return this.f30283b;
    }

    public final com.google.android.gms.internal.ads.MN b() {
        return this.f30284c;
    }

    public final java.lang.String c() {
        return this.f30282a;
    }
}
