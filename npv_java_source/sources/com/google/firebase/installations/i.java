package com.google.firebase.installations;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f44037b = java.util.concurrent.TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.regex.Pattern f44038c = java.util.regex.Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static com.google.firebase.installations.i f44039d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J5.a f44040a;

    private i(J5.a aVar) {
        this.f44040a = aVar;
    }

    public static com.google.firebase.installations.i c() {
        return d(J5.b.b());
    }

    public static com.google.firebase.installations.i d(J5.a aVar) {
        if (f44039d == null) {
            f44039d = new com.google.firebase.installations.i(aVar);
        }
        return f44039d;
    }

    static boolean g(java.lang.String str) {
        return f44038c.matcher(str).matches();
    }

    static boolean h(java.lang.String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f44040a.a();
    }

    public long b() {
        return java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (java.lang.Math.random() * 1000.0d);
    }

    public boolean f(H5.d dVar) {
        return android.text.TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f44037b;
    }
}
