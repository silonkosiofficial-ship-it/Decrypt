package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class d6 extends com.google.android.gms.measurement.internal.AbstractC6512z3 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.lang.String[] f42351i = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final java.lang.String[] f42352j = {"_err"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.security.SecureRandom f42353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicLong f42354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p103k2.a f42356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.Boolean f42357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.lang.Integer f42358h;

    d6(com.google.android.gms.measurement.internal.S2 s6) {
        super(s6);
        this.f42358h = null;
        this.f42354d = new java.util.concurrent.atomic.AtomicLong(0L);
    }

    public static long A(com.google.android.gms.measurement.internal.D d6) {
        long length = 0;
        if (d6 == null) {
            return 0L;
        }
        java.util.Iterator it = d6.iterator();
        while (it.hasNext()) {
            java.lang.Object objD = d6.D((java.lang.String) it.next());
            if (objD instanceof android.os.Parcelable[]) {
                length += (long) ((android.os.Parcelable[]) objD).length;
            }
        }
        return length;
    }

    static long B(byte[] bArr) {
        Q3.AbstractC1477p.l(bArr);
        int i6 = 0;
        Q3.AbstractC1477p.o(bArr.length > 0);
        long j6 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j6 += (((long) bArr[length]) & 255) << i6;
            i6 += 8;
        }
        return j6;
    }

    private static boolean B0(android.content.Context context, java.lang.String str) {
        android.content.pm.ServiceInfo serviceInfo;
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new android.content.ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    public static android.os.Bundle D(android.os.Bundle bundle) {
        if (bundle == null) {
            return new android.os.Bundle();
        }
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        for (java.lang.String str : bundle2.keySet()) {
            java.lang.Object obj = bundle2.get(str);
            if (obj instanceof android.os.Bundle) {
                bundle2.putBundle(str, new android.os.Bundle((android.os.Bundle) obj));
            } else {
                int i6 = 0;
                if (obj instanceof android.os.Parcelable[]) {
                    android.os.Parcelable[] parcelableArr = (android.os.Parcelable[]) obj;
                    while (i6 < parcelableArr.length) {
                        if (parcelableArr[i6] instanceof android.os.Bundle) {
                            parcelableArr[i6] = new android.os.Bundle((android.os.Bundle) parcelableArr[i6]);
                        }
                        i6++;
                    }
                } else if (obj instanceof java.util.List) {
                    java.util.List list = (java.util.List) obj;
                    while (i6 < list.size()) {
                        java.lang.Object obj2 = list.get(i6);
                        if (obj2 instanceof android.os.Bundle) {
                            list.set(i6, new android.os.Bundle((android.os.Bundle) obj2));
                        }
                        i6++;
                    }
                }
            }
        }
        return bundle2;
    }

    static boolean D0(java.lang.String str) {
        return G0((java.lang.String) com.google.android.gms.measurement.internal.G.f41875e0.a(null), str);
    }

    public static android.os.Bundle G(java.util.List list) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (list == null) {
            return bundle;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.measurement.internal.Y5 y6 = (com.google.android.gms.measurement.internal.Y5) it.next();
            java.lang.String str = y6.f42233G;
            if (str != null) {
                bundle.putString(y6.f42230D, str);
            } else {
                java.lang.Long l6 = y6.f42232F;
                if (l6 != null) {
                    bundle.putLong(y6.f42230D, l6.longValue());
                } else {
                    java.lang.Double d6 = y6.f42235I;
                    if (d6 != null) {
                        bundle.putDouble(y6.f42230D, d6.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    private static boolean G0(java.lang.String str, java.lang.String str2) {
        return str.equals("*") || java.util.Arrays.asList(str.split(",")).contains(str2);
    }

    static boolean H0(java.lang.String str) {
        return G0((java.lang.String) com.google.android.gms.measurement.internal.G.f41813B0.a(null), str);
    }

    private final java.lang.Object I(int i6, java.lang.Object obj, boolean z6, boolean z10, java.lang.String str) {
        android.os.Bundle bundleE;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof java.lang.Long) || (obj instanceof java.lang.Double)) {
            return obj;
        }
        if (obj instanceof java.lang.Integer) {
            return java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
        }
        if (obj instanceof java.lang.Byte) {
            return java.lang.Long.valueOf(((java.lang.Byte) obj).byteValue());
        }
        if (obj instanceof java.lang.Short) {
            return java.lang.Long.valueOf(((java.lang.Short) obj).shortValue());
        }
        if (obj instanceof java.lang.Boolean) {
            return java.lang.Long.valueOf(((java.lang.Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Double.valueOf(((java.lang.Float) obj).doubleValue());
        }
        if ((obj instanceof java.lang.String) || (obj instanceof java.lang.Character) || (obj instanceof java.lang.CharSequence)) {
            return J(java.lang.String.valueOf(obj), i6, z6);
        }
        if (!z10 || (!(obj instanceof android.os.Bundle[]) && !(obj instanceof android.os.Parcelable[]))) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.os.Parcelable parcelable : (android.os.Parcelable[]) obj) {
            if ((parcelable instanceof android.os.Bundle) && (bundleE = E((android.os.Bundle) parcelable, null)) != null && !bundleE.isEmpty()) {
                arrayList.add(bundleE);
            }
        }
        return arrayList.toArray(new android.os.Bundle[arrayList.size()]);
    }

    public static java.lang.String J(java.lang.String str, int i6, boolean z6) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i6) {
            return str;
        }
        if (!z6) {
            return null;
        }
        return str.substring(0, str.offsetByCodePoints(0, i6)) + "...";
    }

    static boolean J0(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean K0(java.lang.String str) {
        Q3.AbstractC1477p.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    private static void L(android.os.Bundle bundle, int i6, java.lang.String str, java.lang.Object obj) {
        if (v0(bundle, i6)) {
            bundle.putString("_ev", J(str, 40, true));
            if (obj != null) {
                Q3.AbstractC1477p.l(bundle);
                if ((obj instanceof java.lang.String) || (obj instanceof java.lang.CharSequence)) {
                    bundle.putLong("_el", java.lang.String.valueOf(obj).length());
                }
            }
        }
    }

    public static boolean M0(java.lang.String str) {
        for (java.lang.String str2 : f42352j) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int N0(java.lang.String str) {
        if (!w0("event param", str)) {
            return 3;
        }
        if (o0("event param", null, str)) {
            return !j0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private final int O0(java.lang.String str) {
        if (!C0("event param", str)) {
            return 3;
        }
        if (o0("event param", null, str)) {
            return !j0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private static int P0(java.lang.String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    private static boolean S0(java.lang.String str) {
        Q3.AbstractC1477p.l(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    static java.security.MessageDigest V0() {
        for (int i6 = 0; i6 < 2; i6++) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static void X(com.google.android.gms.measurement.internal.C6499x4 c6499x4, android.os.Bundle bundle, boolean z6) {
        if (bundle == null || c6499x4 == null || (bundle.containsKey("_sc") && !z6)) {
            if (bundle != null && c6499x4 == null && z6) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        java.lang.String str = c6499x4.f42700a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        java.lang.String str2 = c6499x4.f42701b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", c6499x4.f42702c);
    }

    public static void Y(com.google.android.gms.measurement.internal.c6 c6Var, int i6, java.lang.String str, java.lang.String str2, int i10) {
        Z(c6Var, null, i6, str, str2, i10);
    }

    static void Z(com.google.android.gms.measurement.internal.c6 c6Var, java.lang.String str, int i6, java.lang.String str2, java.lang.String str3, int i10) {
        android.os.Bundle bundle = new android.os.Bundle();
        v0(bundle, i6);
        if (!android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i6 == 6 || i6 == 7 || i6 == 2) {
            bundle.putLong("_el", i10);
        }
        c6Var.a(str, "_err", bundle);
    }

    private final boolean Z0() {
        java.lang.Integer num;
        if (this.f42357g == null) {
            p103k2.a aVarT0 = T0();
            boolean z6 = false;
            if (aVarT0 == null) {
                return false;
            }
            java.lang.Integer num2 = null;
            try {
                num = (java.lang.Integer) aVarT0.b().get(10000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z6 = true;
                        }
                    } catch (java.lang.InterruptedException e6) {
                        e = e6;
                        num2 = num;
                        j().L().b("Measurement manager api exception", e);
                        this.f42357g = java.lang.Boolean.FALSE;
                        num = num2;
                    } catch (java.util.concurrent.CancellationException e10) {
                        e = e10;
                        num2 = num;
                        j().L().b("Measurement manager api exception", e);
                        this.f42357g = java.lang.Boolean.FALSE;
                        num = num2;
                    } catch (java.util.concurrent.ExecutionException e11) {
                        e = e11;
                        num2 = num;
                        j().L().b("Measurement manager api exception", e);
                        this.f42357g = java.lang.Boolean.FALSE;
                        num = num2;
                    } catch (java.util.concurrent.TimeoutException e12) {
                        e = e12;
                        num2 = num;
                        j().L().b("Measurement manager api exception", e);
                        this.f42357g = java.lang.Boolean.FALSE;
                        num = num2;
                    }
                }
                this.f42357g = java.lang.Boolean.valueOf(z6);
            } catch (java.lang.InterruptedException e13) {
                e = e13;
            } catch (java.util.concurrent.CancellationException e14) {
                e = e14;
            } catch (java.util.concurrent.ExecutionException e15) {
                e = e15;
            } catch (java.util.concurrent.TimeoutException e16) {
                e = e16;
            }
            j().K().b("Measurement manager api status result", num);
        }
        return this.f42357g.booleanValue();
    }

    private final void a0(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle, java.util.List list, boolean z6) {
        int iO0;
        int iX;
        int i6;
        if (bundle == null) {
            return;
        }
        int i10 = d().i().c0(231100000, true) ? 35 : 0;
        int i11 = 0;
        for (java.lang.String str4 : new java.util.TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str4)) {
                iO0 = !z6 ? O0(str4) : 0;
                if (iO0 == 0) {
                    iO0 = N0(str4);
                }
            } else {
                iO0 = 0;
            }
            if (iO0 != 0) {
                L(bundle, iO0, str4, iO0 == 3 ? str4 : null);
                bundle.remove(str4);
                i10 = i10;
            } else {
                if (h0(bundle.get(str4))) {
                    j().M().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str4);
                    iX = 22;
                } else {
                    iX = x(str, str2, str4, bundle.get(str4), bundle, list, z6, false);
                }
                if (iX == 0 || "_ev".equals(str4)) {
                    if (!K0(str4) || n0(str4, p085i4.s.f46687d)) {
                        i6 = i10;
                    } else {
                        int i12 = i11 + 1;
                        if (c0(231100000, true)) {
                            i6 = i10;
                            if (i12 > i6) {
                                j().H().c("Item can't contain more than " + i6 + " item-scoped custom params", g().c(str2), g().a(bundle));
                                v0(bundle, 28);
                                bundle.remove(str4);
                            }
                        } else {
                            j().H().c("Item array not supported on client's version of Google Play Services (Android Only)", g().c(str2), g().a(bundle));
                            v0(bundle, 23);
                            bundle.remove(str4);
                            i6 = i10;
                        }
                        i11 = i12;
                    }
                    i10 = i6;
                } else {
                    L(bundle, iX, str4, bundle.get(str4));
                    bundle.remove(str4);
                }
            }
            i10 = i10;
        }
    }

    static boolean d0(android.content.Context context) {
        android.content.pm.ActivityInfo receiverInfo;
        Q3.AbstractC1477p.l(context);
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new android.content.ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    static boolean e0(android.content.Context context, boolean z6) {
        Q3.AbstractC1477p.l(context);
        return B0(context, android.os.Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean f0(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean g0(android.os.Bundle bundle, int i6) {
        int i10 = 0;
        if (bundle.size() <= i6) {
            return false;
        }
        for (java.lang.String str : new java.util.TreeSet(bundle.keySet())) {
            i10++;
            if (i10 > i6) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean h0(java.lang.Object obj) {
        return (obj instanceof android.os.Parcelable[]) || (obj instanceof java.util.ArrayList) || (obj instanceof android.os.Bundle);
    }

    static boolean m0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        boolean zIsEmpty = android.text.TextUtils.isEmpty(str);
        boolean zIsEmpty2 = android.text.TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            Q3.AbstractC1477p.l(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            if (android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty(str4)) {
                return !android.text.TextUtils.isEmpty(str4);
            }
            return !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return android.text.TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (android.text.TextUtils.isEmpty(str4)) {
            return false;
        }
        return android.text.TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean n0(java.lang.String str, java.lang.String[] strArr) {
        Q3.AbstractC1477p.l(strArr);
        for (java.lang.String str2 : strArr) {
            if (j$.util.Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static byte[] q0(android.os.Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static java.util.ArrayList t0(java.util.List list) {
        if (list == null) {
            return new java.util.ArrayList(0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.measurement.internal.C6362e c6362e = (com.google.android.gms.measurement.internal.C6362e) it.next();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("app_id", c6362e.f42359C);
            bundle.putString("origin", c6362e.f42360D);
            bundle.putLong("creation_timestamp", c6362e.f42362F);
            bundle.putString("name", c6362e.f42361E.f42230D);
            p085i4.o.b(bundle, Q3.AbstractC1477p.l(c6362e.f42361E.e()));
            bundle.putBoolean("active", c6362e.f42363G);
            java.lang.String str = c6362e.f42364H;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            com.google.android.gms.measurement.internal.E e6 = c6362e.f42365I;
            if (e6 != null) {
                bundle.putString("timed_out_event_name", e6.f41772C);
                com.google.android.gms.measurement.internal.D d6 = e6.f41773D;
                if (d6 != null) {
                    bundle.putBundle("timed_out_event_params", d6.w());
                }
            }
            bundle.putLong("trigger_timeout", c6362e.f42366J);
            com.google.android.gms.measurement.internal.E e10 = c6362e.f42367K;
            if (e10 != null) {
                bundle.putString("triggered_event_name", e10.f41772C);
                com.google.android.gms.measurement.internal.D d10 = e10.f41773D;
                if (d10 != null) {
                    bundle.putBundle("triggered_event_params", d10.w());
                }
            }
            bundle.putLong("triggered_timestamp", c6362e.f42361E.f42231E);
            bundle.putLong("time_to_live", c6362e.f42368L);
            com.google.android.gms.measurement.internal.E e11 = c6362e.f42369M;
            if (e11 != null) {
                bundle.putString("expired_event_name", e11.f41772C);
                com.google.android.gms.measurement.internal.D d11 = e11.f41773D;
                if (d11 != null) {
                    bundle.putBundle("expired_event_params", d11.w());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private final boolean u0(android.content.Context context, java.lang.String str) {
        com.google.android.gms.measurement.internal.C6442p2 c6442p2G;
        java.lang.String str2;
        android.content.pm.Signature[] signatureArr;
        javax.security.auth.x500.X500Principal x500Principal = new javax.security.auth.x500.X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            android.content.pm.PackageInfo packageInfoF = W3.e.a(context).f(str, 64);
            if (packageInfoF == null || (signatureArr = packageInfoF.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
            e = e6;
            c6442p2G = j().G();
            str2 = "Package name not found";
            c6442p2G.b(str2, e);
            return true;
        } catch (java.security.cert.CertificateException e10) {
            e = e10;
            c6442p2G = j().G();
            str2 = "Error obtaining certificate";
            c6442p2G.b(str2, e);
            return true;
        }
    }

    private static boolean v0(android.os.Bundle bundle, int i6) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i6);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    private final int x(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, android.os.Bundle bundle, java.util.List list, boolean z6, boolean z10) {
        int i6;
        com.google.android.gms.measurement.internal.C6442p2 c6442p2M;
        java.lang.Object obj2;
        java.lang.String str4;
        int size;
        n();
        int i10 = 0;
        if (!h0(obj)) {
            i6 = 0;
        } else {
            if (!z10) {
                return 21;
            }
            if (!n0(str3, p085i4.s.f46686c)) {
                return 20;
            }
            if (!this.f42679a.J().h0()) {
                return 25;
            }
            boolean z11 = obj instanceof android.os.Parcelable[];
            if (z11) {
                size = ((android.os.Parcelable[]) obj).length;
            } else if (obj instanceof java.util.ArrayList) {
                size = ((java.util.ArrayList) obj).size();
            } else {
                i6 = 0;
            }
            if (size > 200) {
                j().M().d("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, java.lang.Integer.valueOf(size));
                if (z11) {
                    android.os.Parcelable[] parcelableArr = (android.os.Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (android.os.Parcelable[]) java.util.Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof java.util.ArrayList) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new java.util.ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i6 = 17;
            } else {
                i6 = 0;
            }
        }
        if (l0("param", str3, (J0(str2) || J0(str3)) ? d().x(null, false) : d().r(null, false), obj)) {
            return i6;
        }
        if (!z10) {
            return 4;
        }
        if (obj instanceof android.os.Bundle) {
            a0(str, str2, str3, (android.os.Bundle) obj, list, z6);
        } else if (obj instanceof android.os.Parcelable[]) {
            for (android.os.Parcelable parcelable : (android.os.Parcelable[]) obj) {
                if (!(parcelable instanceof android.os.Bundle)) {
                    c6442p2M = j().M();
                    obj2 = parcelable.getClass();
                    str4 = "All Parcelable[] elements must be of type Bundle. Value type, name";
                    c6442p2M.c(str4, obj2, str3);
                    return 4;
                }
                a0(str, str2, str3, (android.os.Bundle) parcelable, list, z6);
            }
        } else {
            if (!(obj instanceof java.util.ArrayList)) {
                return 4;
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                java.lang.Object obj3 = arrayList2.get(i10);
                int i11 = i10 + 1;
                if (!(obj3 instanceof android.os.Bundle)) {
                    c6442p2M = j().M();
                    obj2 = obj3 != null ? obj3.getClass() : "null";
                    str4 = "All ArrayList elements must be of type Bundle. Value type, name";
                    c6442p2M.c(str4, obj2, str3);
                    return 4;
                }
                a0(str, str2, str3, (android.os.Bundle) obj3, list, z6);
                i10 = i11;
            }
        }
        return i6;
    }

    static android.os.Bundle[] x0(java.lang.Object obj) {
        java.lang.Object[] array;
        if (obj instanceof android.os.Bundle) {
            return new android.os.Bundle[]{(android.os.Bundle) obj};
        }
        if (obj instanceof android.os.Parcelable[]) {
            android.os.Parcelable[] parcelableArr = (android.os.Parcelable[]) obj;
            array = java.util.Arrays.copyOf(parcelableArr, parcelableArr.length, android.os.Bundle[].class);
        } else {
            if (!(obj instanceof java.util.ArrayList)) {
                return null;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            array = arrayList.toArray(new android.os.Bundle[arrayList.size()]);
        }
        return (android.os.Bundle[]) array;
    }

    public static long y(long j6, long j10) {
        return (j6 + (j10 * 60000)) / 86400000;
    }

    static int y0() {
        if (android.os.Build.VERSION.SDK_INT < 30 || android.os.ext.SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return android.os.ext.SdkExtensions.getExtensionVersion(1000000);
    }

    final java.lang.Object A0(java.lang.String str, java.lang.Object obj) {
        return "_ldl".equals(str) ? I(P0(str), obj, true, false, null) : I(P0(str), obj, false, false, null);
    }

    final android.os.Bundle C(android.net.Uri uri, boolean z6) {
        java.lang.String queryParameter;
        java.lang.String queryParameter2;
        java.lang.String queryParameter3;
        java.lang.String queryParameter4;
        java.lang.String queryParameter5;
        java.lang.String queryParameter6;
        java.lang.String queryParameter7;
        java.lang.String queryParameter8;
        java.lang.String queryParameter9;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = z6 ? uri.getQueryParameter("gbraid") : null;
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (android.text.TextUtils.isEmpty(queryParameter) && android.text.TextUtils.isEmpty(queryParameter2) && android.text.TextUtils.isEmpty(queryParameter3) && android.text.TextUtils.isEmpty(queryParameter4) && ((!z6 || android.text.TextUtils.isEmpty(queryParameter5)) && android.text.TextUtils.isEmpty(queryParameter6) && android.text.TextUtils.isEmpty(queryParameter7) && android.text.TextUtils.isEmpty(queryParameter8) && android.text.TextUtils.isEmpty(queryParameter9))) {
                return null;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            if (!android.text.TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (z6 && !android.text.TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            java.lang.String queryParameter10 = uri.getQueryParameter("gad_source");
            if (z6 && !android.text.TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            java.lang.String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!android.text.TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            java.lang.String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!android.text.TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            java.lang.String queryParameter13 = uri.getQueryParameter("aclid");
            if (!android.text.TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            java.lang.String queryParameter14 = uri.getQueryParameter("cp1");
            if (!android.text.TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            java.lang.String queryParameter15 = uri.getQueryParameter("anid");
            if (!android.text.TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            java.lang.String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!android.text.TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            java.lang.String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!android.text.TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            java.lang.String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!android.text.TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!android.text.TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("sfmc_id", queryParameter9);
            }
            return bundle;
        } catch (java.lang.UnsupportedOperationException e6) {
            j().L().b("Install referrer url isn't a hierarchical URI", e6);
            return null;
        }
    }

    final boolean C0(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            j().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            j().H().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!java.lang.Character.isLetter(iCodePointAt)) {
            j().H().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = java.lang.Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !java.lang.Character.isLetterOrDigit(iCodePointAt2)) {
                j().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final android.os.Bundle E(android.os.Bundle bundle, java.lang.String str) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle != null) {
            for (java.lang.String str2 : bundle.keySet()) {
                java.lang.Object objS0 = s0(str2, bundle.get(str2));
                if (objS0 == null) {
                    j().M().b("Param value can't be null", g().f(str2));
                } else {
                    O(bundle2, str2, objS0);
                }
            }
        }
        return bundle2;
    }

    final boolean E0(java.lang.String str, java.lang.String str2) {
        if (com.google.android.gms.internal.measurement.s7.a() && d().t(com.google.android.gms.measurement.internal.G.f41926z0) && !android.text.TextUtils.isEmpty(str2)) {
            return true;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return d().R().equals(str);
    }

    final android.os.Bundle F(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.util.List list, boolean z6) {
        int iO0;
        int i6;
        boolean zN0 = n0(str2, p085i4.q.f46681d);
        if (bundle == null) {
            return null;
        }
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        int iY = d().y();
        int i10 = 0;
        for (java.lang.String str3 : new java.util.TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iO0 = !z6 ? O0(str3) : 0;
                if (iO0 == 0) {
                    iO0 = N0(str3);
                }
            } else {
                iO0 = 0;
            }
            if (iO0 != 0) {
                L(bundle2, iO0, str3, iO0 == 3 ? str3 : null);
                bundle2.remove(str3);
                i6 = iY;
            } else {
                i6 = iY;
                int iX = x(str, str2, str3, bundle.get(str3), bundle2, list, z6, zN0);
                if (iX == 17) {
                    L(bundle2, iX, str3, java.lang.Boolean.FALSE);
                } else if (iX != 0 && !"_ev".equals(str3)) {
                    L(bundle2, iX, iX == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (K0(str3)) {
                    int i11 = i10 + 1;
                    if (i11 > i6) {
                        j().H().c("Event can't contain more than " + i6 + " params", g().c(str2), g().a(bundle));
                        v0(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i10 = i11;
                }
            }
            iY = i6;
        }
        return bundle2;
    }

    final boolean F0(java.lang.String str) {
        n();
        if (W3.e.a(a()).a(str) == 0) {
            return true;
        }
        j().F().b("Permission not granted", str);
        return false;
    }

    final com.google.android.gms.measurement.internal.E H(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.lang.String str3, long j6, boolean z6, boolean z10) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        if (v(str2) != 0) {
            j().G().b("Invalid conditional property event name", g().g(str2));
            throw new java.lang.IllegalArgumentException();
        }
        android.os.Bundle bundle2 = bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle();
        bundle2.putString("_o", str3);
        android.os.Bundle bundleF = F(str, str2, bundle2, V3.g.a("_o"), true);
        if (z6) {
            bundleF = E(bundleF, str);
        }
        Q3.AbstractC1477p.l(bundleF);
        return new com.google.android.gms.measurement.internal.E(str2, new com.google.android.gms.measurement.internal.D(bundleF), str3, j6);
    }

    public final int I0() {
        if (this.f42358h == null) {
            this.f42358h = java.lang.Integer.valueOf(N3.C1395h.f().a(a()) / 1000);
        }
        return this.f42358h.intValue();
    }

    public final java.net.URL K(long j6, java.lang.String str, java.lang.String str2, long j10, java.lang.String str3) {
        try {
            Q3.AbstractC1477p.f(str2);
            Q3.AbstractC1477p.f(str);
            java.lang.String strConcat = java.lang.String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", java.lang.String.format("v%s.%s", java.lang.Long.valueOf(j6), java.lang.Integer.valueOf(I0())), str2, str, java.lang.Long.valueOf(j10));
            if (str.equals(d().S())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new java.net.URL(strConcat);
        } catch (java.lang.IllegalArgumentException e6) {
            e = e6;
            j().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (java.net.MalformedURLException e10) {
            e = e10;
            j().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final boolean L0(java.lang.String str) {
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities;
        return (android.text.TextUtils.isEmpty(str) || (listQueryIntentActivities = a().getPackageManager().queryIntentActivities(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)), 0)) == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }

    final void M(android.os.Bundle bundle, long j6) {
        long j10 = bundle.getLong("_et");
        if (j10 != 0) {
            j().L().b("Params already contained engagement", java.lang.Long.valueOf(j10));
        }
        bundle.putLong("_et", j6 + j10);
    }

    final void N(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (java.lang.String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                i().O(bundle, str, bundle2.get(str));
            }
        }
    }

    final void O(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof java.lang.Long) {
            bundle.putLong(str, ((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.String) {
            bundle.putString(str, java.lang.String.valueOf(obj));
            return;
        }
        if (obj instanceof java.lang.Double) {
            bundle.putDouble(str, ((java.lang.Double) obj).doubleValue());
        } else if (obj instanceof android.os.Bundle[]) {
            bundle.putParcelableArray(str, (android.os.Bundle[]) obj);
        } else if (str != null) {
            j().M().c("Not putting event parameter. Invalid value type. name, type", g().f(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void P(com.google.android.gms.internal.measurement.U0 u6, int i6) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("r", i6);
        try {
            u6.e0(bundle);
        } catch (android.os.RemoteException e6) {
            this.f42679a.j().L().b("Error returning int value to wrapper", e6);
        }
    }

    public final void Q(com.google.android.gms.internal.measurement.U0 u6, long j6) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("r", j6);
        try {
            u6.e0(bundle);
        } catch (android.os.RemoteException e6) {
            this.f42679a.j().L().b("Error returning long value to wrapper", e6);
        }
    }

    final long Q0() {
        long j6;
        n();
        if (!D0(this.f42679a.B().F())) {
            return 0L;
        }
        if (android.os.Build.VERSION.SDK_INT < 30) {
            j6 = 4;
        } else if (android.os.ext.SdkExtensions.getExtensionVersion(30) < 4) {
            j6 = 8;
        } else {
            j6 = y0() < ((java.lang.Integer) com.google.android.gms.measurement.internal.G.f41858Y.a(null)).intValue() ? 16L : 0L;
        }
        if (!F0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j6 |= 2;
        }
        if (j6 == 0 && !Z0()) {
            j6 |= 64;
        }
        if (j6 == 0) {
            return 1L;
        }
        return j6;
    }

    public final void R(com.google.android.gms.internal.measurement.U0 u6, android.os.Bundle bundle) {
        try {
            u6.e0(bundle);
        } catch (android.os.RemoteException e6) {
            this.f42679a.j().L().b("Error returning bundle value to wrapper", e6);
        }
    }

    public final long R0() {
        long andIncrement;
        long j6;
        if (this.f42354d.get() != 0) {
            synchronized (this.f42354d) {
                this.f42354d.compareAndSet(-1L, 1L);
                andIncrement = this.f42354d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f42354d) {
            long jNextLong = new java.util.Random(java.lang.System.nanoTime() ^ b().a()).nextLong();
            int i6 = this.f42355e + 1;
            this.f42355e = i6;
            j6 = jNextLong + ((long) i6);
        }
        return j6;
    }

    public final void S(com.google.android.gms.internal.measurement.U0 u6, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("r", str);
        try {
            u6.e0(bundle);
        } catch (android.os.RemoteException e6) {
            this.f42679a.j().L().b("Error returning string value to wrapper", e6);
        }
    }

    public final void T(com.google.android.gms.internal.measurement.U0 u6, java.util.ArrayList arrayList) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            u6.e0(bundle);
        } catch (android.os.RemoteException e6) {
            this.f42679a.j().L().b("Error returning bundle list to wrapper", e6);
        }
    }

    final p103k2.a T0() {
        if (this.f42356f == null) {
            this.f42356f = p103k2.a.a(a());
        }
        return this.f42356f;
    }

    public final void U(com.google.android.gms.internal.measurement.U0 u6, boolean z6) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("r", z6);
        try {
            u6.e0(bundle);
        } catch (android.os.RemoteException e6) {
            this.f42679a.j().L().b("Error returning boolean value to wrapper", e6);
        }
    }

    final java.lang.String U0() {
        byte[] bArr = new byte[16];
        W0().nextBytes(bArr);
        return java.lang.String.format(java.util.Locale.US, "%032x", new java.math.BigInteger(1, bArr));
    }

    public final void V(com.google.android.gms.internal.measurement.U0 u6, byte[] bArr) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("r", bArr);
        try {
            u6.e0(bundle);
        } catch (android.os.RemoteException e6) {
            this.f42679a.j().L().b("Error returning byte array to wrapper", e6);
        }
    }

    final void W(com.google.android.gms.measurement.internal.C6455r2 c6455r2, int i6) {
        int i10 = 0;
        for (java.lang.String str : new java.util.TreeSet(c6455r2.f42610d.keySet())) {
            if (K0(str) && (i10 = i10 + 1) > i6) {
                j().H().c("Event can't contain more than " + i6 + " params", g().c(c6455r2.f42607a), g().a(c6455r2.f42610d));
                v0(c6455r2.f42610d, 5);
                c6455r2.f42610d.remove(str);
            }
        }
    }

    final java.security.SecureRandom W0() {
        n();
        if (this.f42353c == null) {
            this.f42353c = new java.security.SecureRandom();
        }
        return this.f42353c;
    }

    final boolean X0() {
        n();
        return Q0() == 1;
    }

    public final boolean Y0() {
        try {
            a().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ android.content.Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ V3.f b() {
        return super.b();
    }

    final void b0(android.os.Parcelable[] parcelableArr, int i6) {
        Q3.AbstractC1477p.l(parcelableArr);
        for (android.os.Parcelable parcelable : parcelableArr) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            int i10 = 0;
            for (java.lang.String str : new java.util.TreeSet(bundle.keySet())) {
                if (K0(str) && !n0(str, p085i4.s.f46687d) && (i10 = i10 + 1) > i6) {
                    j().H().c("Param can't contain more than " + i6 + " item-scoped custom parameters", g().f(str), g().a(bundle));
                    v0(bundle, 28);
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean c0(int i6, boolean z6) {
        java.lang.Boolean boolW = this.f42679a.J().W();
        if (I0() < i6 / 1000) {
            return (boolW == null || boolW.booleanValue()) ? false : true;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6376g d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6494x e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6348c f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6386h2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.d6 i() {
        return super.i();
    }

    final boolean i0(java.lang.String str, double d6) {
        try {
            android.content.SharedPreferences.Editor editorEdit = a().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", java.lang.Double.doubleToRawLongBits(d6));
            return editorEdit.commit();
        } catch (java.lang.RuntimeException e6) {
            j().G().b("Failed to persist Deferred Deep Link. exception", e6);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6428n2 j() {
        return super.j();
    }

    final boolean j0(java.lang.String str, int i6, java.lang.String str2) {
        if (str2 == null) {
            j().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i6) {
            return true;
        }
        j().H().d("Name is too long. Type, maximum supported length, name", str, java.lang.Integer.valueOf(i6), str2);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    final boolean k0(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str)) {
            if (S0(str)) {
                return true;
            }
            if (this.f42679a.r()) {
                j().H().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", com.google.android.gms.measurement.internal.C6428n2.v(str));
            }
            return false;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            if (this.f42679a.r()) {
                j().H().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (S0(str2)) {
            return true;
        }
        j().H().b("Invalid admob_app_id. Analytics disabled.", com.google.android.gms.measurement.internal.C6428n2.v(str2));
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.P2 l() {
        return super.l();
    }

    final boolean l0(java.lang.String str, java.lang.String str2, int i6, java.lang.Object obj) {
        if (obj != null && !(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Float) && !(obj instanceof java.lang.Integer) && !(obj instanceof java.lang.Byte) && !(obj instanceof java.lang.Short) && !(obj instanceof java.lang.Boolean) && !(obj instanceof java.lang.Double)) {
            if (!(obj instanceof java.lang.String) && !(obj instanceof java.lang.Character) && !(obj instanceof java.lang.CharSequence)) {
                return false;
            }
            java.lang.String strValueOf = java.lang.String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i6) {
                j().M().d("Value is too long; discarded. Value kind, name, value length", str, str2, java.lang.Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6512z3
    protected final void o() {
        n();
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                j().L().a("Utils falling back to Random for random id");
            }
        }
        this.f42354d.set(jNextLong);
    }

    final boolean o0(java.lang.String str, java.lang.String[] strArr, java.lang.String str2) {
        return p0(str, strArr, null, str2);
    }

    final boolean p0(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String str2) {
        if (str2 == null) {
            j().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        Q3.AbstractC1477p.l(str2);
        for (java.lang.String str3 : f42351i) {
            if (str2.startsWith(str3)) {
                j().H().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !n0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && n0(str2, strArr2)) {
            return true;
        }
        j().H().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    final int r0(java.lang.String str) {
        if (!w0("user property", str)) {
            return 6;
        }
        if (o0("user property", p085i4.r.f46682a, str)) {
            return !j0("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    final java.lang.Object s0(java.lang.String str, java.lang.Object obj) {
        if ("_ev".equals(str)) {
            return I(d().x(null, false), obj, true, true, null);
        }
        return I(J0(str) ? d().x(null, false) : d().r(null, false), obj, false, true, null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6512z3
    protected final boolean t() {
        return true;
    }

    public final int u(int i6) {
        return N3.C1395h.f().h(a(), 12451000);
    }

    final int v(java.lang.String str) {
        if (!w0("event", str)) {
            return 2;
        }
        if (p0("event", p085i4.q.f46678a, p085i4.q.f46679b, str)) {
            return !j0("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    final int w(java.lang.String str, java.lang.Object obj) {
        return l0("_ldl".equals(str) ? "user property referrer" : "user property", str, P0(str), obj) ? 0 : 7;
    }

    final boolean w0(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            j().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            j().H().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!java.lang.Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            j().H().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = java.lang.Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !java.lang.Character.isLetterOrDigit(iCodePointAt2)) {
                j().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final long z(android.content.Context context, java.lang.String str) {
        n();
        Q3.AbstractC1477p.l(context);
        Q3.AbstractC1477p.f(str);
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.security.MessageDigest messageDigestV0 = V0();
        long jB = -1;
        if (messageDigestV0 == null) {
            j().G().a("Could not get MD5 instance");
            return -1L;
        }
        if (packageManager != null) {
            try {
                if (!u0(context, str)) {
                    android.content.pm.Signature[] signatureArr = W3.e.a(context).f(a().getPackageName(), 64).signatures;
                    if (signatureArr == null || signatureArr.length <= 0) {
                        j().L().a("Could not get signatures");
                    } else {
                        jB = B(messageDigestV0.digest(signatureArr[0].toByteArray()));
                    }
                    return jB;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
                j().G().b("Package name not found", e6);
            }
        }
        return 0L;
    }

    final long z0(java.lang.String str) {
        if (a().getPackageManager() == null) {
            return 0L;
        }
        int i6 = 0;
        try {
            android.content.pm.ApplicationInfo applicationInfoC = W3.e.a(a()).c(str, 0);
            if (applicationInfoC != null) {
                i6 = applicationInfoC.targetSdkVersion;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            j().J().b("PackageManager failed to find running app: app_id", str);
        }
        return i6;
    }
}
