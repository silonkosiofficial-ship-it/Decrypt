package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final java.util.Date f44166e = new java.util.Date(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final java.util.Date f44167f = new java.util.Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.SharedPreferences f44168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f44169b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f44170c = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Object f44171d = new java.lang.Object();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f44172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.util.Date f44173b;

        a(int i6, java.util.Date date) {
            this.f44172a = i6;
            this.f44173b = date;
        }

        java.util.Date a() {
            return this.f44173b;
        }

        int b() {
            return this.f44172a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f44174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.util.Date f44175b;

        public b(int i6, java.util.Date date) {
            this.f44174a = i6;
            this.f44175b = date;
        }

        java.util.Date a() {
            return this.f44175b;
        }

        int b() {
            return this.f44174a;
        }
    }

    public p(android.content.SharedPreferences sharedPreferences) {
        this.f44168a = sharedPreferences;
    }

    com.google.firebase.remoteconfig.internal.p.a a() {
        com.google.firebase.remoteconfig.internal.p.a aVar;
        synchronized (this.f44170c) {
            aVar = new com.google.firebase.remoteconfig.internal.p.a(this.f44168a.getInt("num_failed_fetches", 0), new java.util.Date(this.f44168a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public long b() {
        return this.f44168a.getLong("fetch_timeout_in_seconds", 60L);
    }

    java.lang.String c() {
        return this.f44168a.getString("last_fetch_etag", null);
    }

    java.util.Date d() {
        return new java.util.Date(this.f44168a.getLong("last_fetch_time_in_millis", -1L));
    }

    long e() {
        return this.f44168a.getLong("last_template_version", 0L);
    }

    public long f() {
        return this.f44168a.getLong("minimum_fetch_interval_in_seconds", com.google.firebase.remoteconfig.internal.m.f44137j);
    }

    public com.google.firebase.remoteconfig.internal.p.b g() {
        com.google.firebase.remoteconfig.internal.p.b bVar;
        synchronized (this.f44171d) {
            bVar = new com.google.firebase.remoteconfig.internal.p.b(this.f44168a.getInt("num_failed_realtime_streams", 0), new java.util.Date(this.f44168a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    void h() {
        j(0, f44167f);
    }

    void i() {
        n(0, f44167f);
    }

    void j(int i6, java.util.Date date) {
        synchronized (this.f44170c) {
            this.f44168a.edit().putInt("num_failed_fetches", i6).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void k(N5.n nVar) {
        synchronized (this.f44169b) {
            this.f44168a.edit().putLong("fetch_timeout_in_seconds", nVar.a()).putLong("minimum_fetch_interval_in_seconds", nVar.b()).commit();
        }
    }

    void l(java.lang.String str) {
        synchronized (this.f44169b) {
            this.f44168a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    void m(long j6) {
        synchronized (this.f44169b) {
            this.f44168a.edit().putLong("last_template_version", j6).apply();
        }
    }

    void n(int i6, java.util.Date date) {
        synchronized (this.f44171d) {
            this.f44168a.edit().putInt("num_failed_realtime_streams", i6).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void o() {
        synchronized (this.f44169b) {
            this.f44168a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    void p(java.util.Date date) {
        synchronized (this.f44169b) {
            this.f44168a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    void q() {
        synchronized (this.f44169b) {
            this.f44168a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
