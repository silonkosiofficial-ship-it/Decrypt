package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2324Eo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3398ci0 f27114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3398ci0 f27115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3398ci0 f27116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f27117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f27118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3398ci0 f27119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3738fo f27120n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC3398ci0 f27121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f27122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final java.util.HashMap f27123q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final java.util.HashSet f27124r;

    public C2324Eo() {
        this.f27107a = Integer.MAX_VALUE;
        this.f27108b = Integer.MAX_VALUE;
        this.f27109c = Integer.MAX_VALUE;
        this.f27110d = Integer.MAX_VALUE;
        this.f27111e = Integer.MAX_VALUE;
        this.f27112f = Integer.MAX_VALUE;
        this.f27113g = true;
        this.f27114h = com.google.android.gms.internal.ads.AbstractC3398ci0.O();
        this.f27115i = com.google.android.gms.internal.ads.AbstractC3398ci0.O();
        this.f27116j = com.google.android.gms.internal.ads.AbstractC3398ci0.O();
        this.f27117k = Integer.MAX_VALUE;
        this.f27118l = Integer.MAX_VALUE;
        this.f27119m = com.google.android.gms.internal.ads.AbstractC3398ci0.O();
        this.f27120n = com.google.android.gms.internal.ads.C3738fo.f35430b;
        this.f27121o = com.google.android.gms.internal.ads.AbstractC3398ci0.O();
        this.f27122p = 0;
        this.f27123q = new java.util.HashMap();
        this.f27124r = new java.util.HashSet();
    }

    protected C2324Eo(com.google.android.gms.internal.ads.C3740fp c3740fp) {
        this.f27107a = Integer.MAX_VALUE;
        this.f27108b = Integer.MAX_VALUE;
        this.f27109c = Integer.MAX_VALUE;
        this.f27110d = Integer.MAX_VALUE;
        this.f27111e = c3740fp.f35443i;
        this.f27112f = c3740fp.f35444j;
        this.f27113g = c3740fp.f35445k;
        this.f27114h = c3740fp.f35446l;
        this.f27115i = c3740fp.f35447m;
        this.f27116j = c3740fp.f35449o;
        this.f27117k = Integer.MAX_VALUE;
        this.f27118l = Integer.MAX_VALUE;
        this.f27119m = c3740fp.f35453s;
        this.f27120n = c3740fp.f35454t;
        this.f27121o = c3740fp.f35455u;
        this.f27122p = c3740fp.f35456v;
        this.f27124r = new java.util.HashSet(c3740fp.f35434C);
        this.f27123q = new java.util.HashMap(c3740fp.f35433B);
    }

    public final com.google.android.gms.internal.ads.C2324Eo e(android.content.Context context) {
        android.view.accessibility.CaptioningManager captioningManager;
        if ((com.google.android.gms.internal.ads.EW.f27061a >= 23 || android.os.Looper.myLooper() != null) && (captioningManager = (android.view.accessibility.CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f27122p = 1088;
            java.util.Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f27121o = com.google.android.gms.internal.ads.AbstractC3398ci0.P(locale.toLanguageTag());
            }
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.C2324Eo f(int i6, int i10, boolean z6) {
        this.f27111e = i6;
        this.f27112f = i10;
        this.f27113g = true;
        return this;
    }
}
