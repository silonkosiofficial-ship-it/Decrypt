package B3;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.SharedPreferences f599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.SharedPreferences.Editor f600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Object f602d = new java.lang.Object();

    a0(android.content.Context context) {
        this.f601c = context;
    }

    private final void k() {
        synchronized (this.f602d) {
            try {
                if (this.f599a != null) {
                    return;
                }
                android.content.SharedPreferences sharedPreferences = this.f601c.getSharedPreferences("query_info_shared_prefs", 0);
                this.f599a = sharedPreferences;
                this.f600b = sharedPreferences.edit();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final int a() {
        int i6;
        k();
        synchronized (this.f602d) {
            i6 = this.f599a.getInt("aav", -1);
        }
        return i6;
    }

    public final int b() {
        int i6;
        k();
        synchronized (this.f602d) {
            i6 = this.f599a.getInt("vc", -1);
        }
        return i6;
    }

    public final java.lang.String c(java.lang.String str) {
        java.lang.String string;
        k();
        synchronized (this.f602d) {
            string = this.f599a.getString(str, null);
            this.f600b.remove(str).commit();
        }
        return string;
    }

    public final java.lang.String d() {
        java.lang.String string;
        k();
        synchronized (this.f602d) {
            string = this.f599a.getString("dm", null);
        }
        return string;
    }

    public final java.lang.String e() {
        java.lang.String string;
        k();
        synchronized (this.f602d) {
            string = this.f599a.getString("pn", null);
        }
        return string;
    }

    public final java.util.Map f() {
        java.util.HashMap map;
        k();
        synchronized (this.f602d) {
            try {
                java.util.Map<java.lang.String, ?> all = this.f599a.getAll();
                map = new java.util.HashMap();
                for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof java.lang.String) && !j$.util.Objects.equals(entry.getKey(), "pn") && !j$.util.Objects.equals(entry.getKey(), "vc") && !j$.util.Objects.equals(entry.getKey(), "dm") && !j$.util.Objects.equals(entry.getKey(), "aav")) {
                        map.put(entry.getKey(), (java.lang.String) entry.getValue());
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public final void g() {
        k();
        synchronized (this.f602d) {
            this.f600b.clear().commit();
        }
    }

    public final void h(java.lang.String str, java.lang.String str2) {
        k();
        synchronized (this.f602d) {
            this.f600b.putString(str, str2).commit();
        }
    }

    public final void i(java.lang.String str, int i6, java.lang.String str2, int i10) {
        k();
        synchronized (this.f602d) {
            this.f600b.putString("pn", str).putInt("vc", i6).putString("dm", str2).putInt("aav", i10).commit();
        }
    }

    public final boolean j(java.lang.String str) {
        boolean zContains;
        k();
        synchronized (this.f602d) {
            zContains = this.f599a.contains(str);
        }
        return zContains;
    }
}
