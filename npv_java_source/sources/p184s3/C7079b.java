package p184s3;

/* JADX INFO: renamed from: s3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7079b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p104k3.h[] f54191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f54192b;

    public C7079b(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, p104k3.s.f49492a);
        java.lang.String string = typedArrayObtainAttributes.getString(p104k3.s.f49493b);
        java.lang.String string2 = typedArrayObtainAttributes.getString(p104k3.s.f49494c);
        boolean z6 = !android.text.TextUtils.isEmpty(string);
        boolean z10 = !android.text.TextUtils.isEmpty(string2);
        if (z6 && !z10) {
            this.f54191a = c(string);
        } else {
            if (z6 || !z10) {
                typedArrayObtainAttributes.recycle();
                if (!z6) {
                    throw new java.lang.IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                throw new java.lang.IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.f54191a = c(string2);
        }
        java.lang.String string3 = typedArrayObtainAttributes.getString(p104k3.s.f49495d);
        this.f54192b = string3;
        typedArrayObtainAttributes.recycle();
        if (android.text.TextUtils.isEmpty(string3)) {
            throw new java.lang.IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static p104k3.h[] c(java.lang.String str) {
        java.lang.String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        p104k3.h[] hVarArr = new p104k3.h[length];
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            java.lang.String strTrim = strArrSplit[i6].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                java.lang.String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    hVarArr[i6] = new p104k3.h("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : java.lang.Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : java.lang.Integer.parseInt(strArrSplit2[1]));
                } catch (java.lang.NumberFormatException unused) {
                    throw new java.lang.IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
            } else if ("BANNER".equals(strTrim)) {
                hVarArr[i6] = p104k3.h.f49467i;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                hVarArr[i6] = p104k3.h.f49469k;
            } else if ("FULL_BANNER".equals(strTrim)) {
                hVarArr[i6] = p104k3.h.f49468j;
            } else if ("LEADERBOARD".equals(strTrim)) {
                hVarArr[i6] = p104k3.h.f49470l;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                hVarArr[i6] = p104k3.h.f49471m;
            } else if ("SMART_BANNER".equals(strTrim)) {
                hVarArr[i6] = p104k3.h.f49473o;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                hVarArr[i6] = p104k3.h.f49472n;
            } else if ("FLUID".equals(strTrim)) {
                hVarArr[i6] = p104k3.h.f49474p;
            } else {
                if (!"ICON".equals(strTrim)) {
                    throw new java.lang.IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
                hVarArr[i6] = p104k3.h.f49477s;
            }
        }
        if (length != 0) {
            return hVarArr;
        }
        throw new java.lang.IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final java.lang.String a() {
        return this.f54192b;
    }

    public final p104k3.h[] b(boolean z6) {
        if (z6 || this.f54191a.length == 1) {
            return this.f54191a;
        }
        throw new java.lang.IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
