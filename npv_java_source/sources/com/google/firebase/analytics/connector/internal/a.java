package com.google.firebase.analytics.connector.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final N4.r f43928a = N4.r.P("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final N4.AbstractC1415o f43929b = N4.AbstractC1415o.P("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final N4.AbstractC1415o f43930c = N4.AbstractC1415o.O("auto", "app", "am");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final N4.AbstractC1415o f43931d = N4.AbstractC1415o.N("_r", "_dbg");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final N4.AbstractC1415o f43932e = new N4.AbstractC1415o.a().e(p085i4.r.f46682a).e(p085i4.r.f46683b).f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final N4.AbstractC1415o f43933f = N4.AbstractC1415o.N("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static T4.a.c a(android.os.Bundle bundle) {
        Q3.AbstractC1477p.l(bundle);
        T4.a.c cVar = new T4.a.c();
        cVar.f12937a = (java.lang.String) Q3.AbstractC1477p.l((java.lang.String) p085i4.o.a(bundle, "origin", java.lang.String.class, null));
        cVar.f12938b = (java.lang.String) Q3.AbstractC1477p.l((java.lang.String) p085i4.o.a(bundle, "name", java.lang.String.class, null));
        cVar.f12939c = p085i4.o.a(bundle, "value", java.lang.Object.class, null);
        cVar.f12940d = (java.lang.String) p085i4.o.a(bundle, "trigger_event_name", java.lang.String.class, null);
        cVar.f12941e = ((java.lang.Long) p085i4.o.a(bundle, "trigger_timeout", java.lang.Long.class, 0L)).longValue();
        cVar.f12942f = (java.lang.String) p085i4.o.a(bundle, "timed_out_event_name", java.lang.String.class, null);
        cVar.f12943g = (android.os.Bundle) p085i4.o.a(bundle, "timed_out_event_params", android.os.Bundle.class, null);
        cVar.f12944h = (java.lang.String) p085i4.o.a(bundle, "triggered_event_name", java.lang.String.class, null);
        cVar.f12945i = (android.os.Bundle) p085i4.o.a(bundle, "triggered_event_params", android.os.Bundle.class, null);
        cVar.f12946j = ((java.lang.Long) p085i4.o.a(bundle, "time_to_live", java.lang.Long.class, 0L)).longValue();
        cVar.f12947k = (java.lang.String) p085i4.o.a(bundle, "expired_event_name", java.lang.String.class, null);
        cVar.f12948l = (android.os.Bundle) p085i4.o.a(bundle, "expired_event_params", android.os.Bundle.class, null);
        cVar.f12950n = ((java.lang.Boolean) p085i4.o.a(bundle, "active", java.lang.Boolean.class, java.lang.Boolean.FALSE)).booleanValue();
        cVar.f12949m = ((java.lang.Long) p085i4.o.a(bundle, "creation_timestamp", java.lang.Long.class, 0L)).longValue();
        cVar.f12951o = ((java.lang.Long) p085i4.o.a(bundle, "triggered_timestamp", java.lang.Long.class, 0L)).longValue();
        return cVar;
    }

    public static android.os.Bundle b(T4.a.c cVar) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = cVar.f12937a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        java.lang.String str2 = cVar.f12938b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        java.lang.Object obj = cVar.f12939c;
        if (obj != null) {
            p085i4.o.b(bundle, obj);
        }
        java.lang.String str3 = cVar.f12940d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", cVar.f12941e);
        java.lang.String str4 = cVar.f12942f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        android.os.Bundle bundle2 = cVar.f12943g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        java.lang.String str5 = cVar.f12944h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        android.os.Bundle bundle3 = cVar.f12945i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", cVar.f12946j);
        java.lang.String str6 = cVar.f12947k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        android.os.Bundle bundle4 = cVar.f12948l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", cVar.f12949m);
        bundle.putBoolean("active", cVar.f12950n);
        bundle.putLong("triggered_timestamp", cVar.f12951o);
        return bundle;
    }

    public static java.lang.String c(java.lang.String str) {
        java.lang.String strA = p085i4.q.a(str);
        return strA != null ? strA : str;
    }

    public static void d(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean e(java.lang.String str, android.os.Bundle bundle) {
        if (f43929b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        N4.AbstractC1415o abstractC1415o = f43931d;
        int size = abstractC1415o.size();
        int i6 = 0;
        while (i6 < size) {
            java.lang.Object obj = abstractC1415o.get(i6);
            i6++;
            if (bundle.containsKey((java.lang.String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(java.lang.String str, java.lang.String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f43932e.contains(str2)) {
            return false;
        }
        N4.AbstractC1415o abstractC1415o = f43933f;
        int size = abstractC1415o.size();
        int i6 = 0;
        while (i6 < size) {
            java.lang.Object obj = abstractC1415o.get(i6);
            i6++;
            if (str2.matches((java.lang.String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(T4.a.c cVar) {
        java.lang.String str;
        if (cVar == null || (str = cVar.f12937a) == null || str.isEmpty()) {
            return false;
        }
        java.lang.Object obj = cVar.f12939c;
        if ((obj != null && p085i4.A.a(obj) == null) || !j(str) || !f(str, cVar.f12938b)) {
            return false;
        }
        java.lang.String str2 = cVar.f12947k;
        if (str2 != null && (!e(str2, cVar.f12948l) || !h(str, cVar.f12947k, cVar.f12948l))) {
            return false;
        }
        java.lang.String str3 = cVar.f12944h;
        if (str3 != null && (!e(str3, cVar.f12945i) || !h(str, cVar.f12944h, cVar.f12945i))) {
            return false;
        }
        java.lang.String str4 = cVar.f12942f;
        if (str4 != null) {
            return e(str4, cVar.f12943g) && h(str, cVar.f12942f, cVar.f12943g);
        }
        return true;
    }

    public static boolean h(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        java.lang.String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!j(str) || bundle == null) {
            return false;
        }
        N4.AbstractC1415o abstractC1415o = f43931d;
        int size = abstractC1415o.size();
        int i6 = 0;
        while (i6 < size) {
            java.lang.Object obj = abstractC1415o.get(i6);
            i6++;
            if (bundle.containsKey((java.lang.String) obj)) {
                return false;
            }
        }
        str.hashCode();
        switch (str) {
            case "fcm":
                str3 = "fcm_integration";
                break;
            case "fdl":
                str3 = "fdl_integration";
                break;
            case "fiam":
                str3 = "fiam_integration";
                break;
            default:
                return false;
        }
        bundle.putString("_cis", str3);
        return true;
    }

    public static boolean i(java.lang.String str) {
        return !f43928a.contains(str);
    }

    public static boolean j(java.lang.String str) {
        return !f43930c.contains(str);
    }
}
