package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5995e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final N4.r f40854d = N4.r.O("_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f40855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f40856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.Map f40857c;

    public C5995e(java.lang.String str, long j6, java.util.Map map) {
        this.f40855a = str;
        this.f40856b = j6;
        java.util.HashMap map2 = new java.util.HashMap();
        this.f40857c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static java.lang.Object c(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (!f40854d.contains(str) || !(obj2 instanceof java.lang.Double)) {
            if (str.startsWith("_")) {
                return ((obj instanceof java.lang.String) || obj == null) ? obj2 : obj;
            }
            if (obj instanceof java.lang.Double) {
                return obj2;
            }
            if (!(obj instanceof java.lang.Long)) {
                return obj instanceof java.lang.String ? obj2.toString() : obj2;
            }
        }
        return java.lang.Long.valueOf(java.lang.Math.round(((java.lang.Double) obj2).doubleValue()));
    }

    public final long a() {
        return this.f40856b;
    }

    public final java.lang.Object b(java.lang.String str) {
        if (this.f40857c.containsKey(str)) {
            return this.f40857c.get(str);
        }
        return null;
    }

    public final /* synthetic */ java.lang.Object clone() {
        return new com.google.android.gms.internal.measurement.C5995e(this.f40855a, this.f40856b, new java.util.HashMap(this.f40857c));
    }

    public final void d(java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            this.f40857c.remove(str);
        } else {
            this.f40857c.put(str, c(str, this.f40857c.get(str), obj));
        }
    }

    public final java.lang.String e() {
        return this.f40855a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.C5995e)) {
            return false;
        }
        com.google.android.gms.internal.measurement.C5995e c5995e = (com.google.android.gms.internal.measurement.C5995e) obj;
        if (this.f40856b == c5995e.f40856b && this.f40855a.equals(c5995e.f40855a)) {
            return this.f40857c.equals(c5995e.f40857c);
        }
        return false;
    }

    public final void f(java.lang.String str) {
        this.f40855a = str;
    }

    public final java.util.Map g() {
        return this.f40857c;
    }

    public final int hashCode() {
        int iHashCode = this.f40855a.hashCode() * 31;
        long j6 = this.f40856b;
        return ((iHashCode + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f40857c.hashCode();
    }

    public final java.lang.String toString() {
        return "Event{name='" + this.f40855a + "', timestamp=" + this.f40856b + ", params=" + java.lang.String.valueOf(this.f40857c) + "}";
    }
}
