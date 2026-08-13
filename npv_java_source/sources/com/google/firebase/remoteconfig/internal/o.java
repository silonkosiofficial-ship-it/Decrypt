package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.nio.charset.Charset f44159e = java.nio.charset.Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final java.util.regex.Pattern f44160f = java.util.regex.Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final java.util.regex.Pattern f44161g = java.util.regex.Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f44162a = new java.util.HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f44163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f44164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f44165d;

    public o(java.util.concurrent.Executor executor, com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        this.f44163b = executor;
        this.f44164c = fVar;
        this.f44165d = fVar2;
    }

    private void c(final java.lang.String str, final com.google.firebase.remoteconfig.internal.g gVar) {
        if (gVar == null) {
            return;
        }
        synchronized (this.f44162a) {
            try {
                for (final V3.d dVar : this.f44162a) {
                    this.f44163b.execute(new java.lang.Runnable() { // from class: com.google.firebase.remoteconfig.internal.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            dVar.accept(str, gVar);
                        }
                    });
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private static com.google.firebase.remoteconfig.internal.g e(com.google.firebase.remoteconfig.internal.f fVar) {
        return fVar.f();
    }

    private static java.lang.Long g(com.google.firebase.remoteconfig.internal.f fVar, java.lang.String str) {
        com.google.firebase.remoteconfig.internal.g gVarE = e(fVar);
        if (gVarE == null) {
            return null;
        }
        try {
            return java.lang.Long.valueOf(gVarE.g().getLong(str));
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    private static java.lang.String i(com.google.firebase.remoteconfig.internal.f fVar, java.lang.String str) {
        com.google.firebase.remoteconfig.internal.g gVarE = e(fVar);
        if (gVarE == null) {
            return null;
        }
        try {
            return gVarE.g().getString(str);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    private static void k(java.lang.String str, java.lang.String str2) {
        java.lang.String.format("No value of type '%s' exists for parameter key '%s'.", str2, str);
    }

    public void b(V3.d dVar) {
        synchronized (this.f44162a) {
            this.f44162a.add(dVar);
        }
    }

    public boolean d(java.lang.String str) {
        java.lang.String strI = i(this.f44164c, str);
        if (strI != null) {
            if (f44160f.matcher(strI).matches()) {
                c(str, e(this.f44164c));
                return true;
            }
            if (f44161g.matcher(strI).matches()) {
                c(str, e(this.f44164c));
                return false;
            }
        }
        java.lang.String strI2 = i(this.f44165d, str);
        if (strI2 != null) {
            if (f44160f.matcher(strI2).matches()) {
                return true;
            }
            if (f44161g.matcher(strI2).matches()) {
                return false;
            }
        }
        k(str, "Boolean");
        return false;
    }

    public long f(java.lang.String str) {
        java.lang.Long lG = g(this.f44164c, str);
        if (lG != null) {
            c(str, e(this.f44164c));
            return lG.longValue();
        }
        java.lang.Long lG2 = g(this.f44165d, str);
        if (lG2 != null) {
            return lG2.longValue();
        }
        k(str, "Long");
        return 0L;
    }

    public java.lang.String h(java.lang.String str) {
        java.lang.String strI = i(this.f44164c, str);
        if (strI != null) {
            c(str, e(this.f44164c));
            return strI;
        }
        java.lang.String strI2 = i(this.f44165d, str);
        if (strI2 != null) {
            return strI2;
        }
        k(str, "String");
        return "";
    }
}
