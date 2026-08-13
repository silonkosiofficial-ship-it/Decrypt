package com.google.android.material.snackbar;

/* JADX INFO: loaded from: classes3.dex */
class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static com.google.android.material.snackbar.a f43614c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f43615a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.os.Handler f43616b = new android.os.Handler(android.os.Looper.getMainLooper(), new com.google.android.material.snackbar.a.C0479a());

    /* JADX INFO: renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    class C0479a implements android.os.Handler.Callback {
        C0479a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (message.what != 0) {
                return false;
            }
            com.google.android.material.snackbar.a aVar = com.google.android.material.snackbar.a.this;
            androidx.appcompat.app.D.a(message.obj);
            aVar.c(null);
            return true;
        }
    }

    interface b {
    }

    private static class c {
    }

    private a() {
    }

    private boolean a(com.google.android.material.snackbar.a.c cVar, int i6) {
        throw null;
    }

    static com.google.android.material.snackbar.a b() {
        if (f43614c == null) {
            f43614c = new com.google.android.material.snackbar.a();
        }
        return f43614c;
    }

    private boolean d(com.google.android.material.snackbar.a.b bVar) {
        return false;
    }

    void c(com.google.android.material.snackbar.a.c cVar) {
        synchronized (this.f43615a) {
            a(cVar, 2);
        }
    }

    public void e(com.google.android.material.snackbar.a.b bVar) {
        synchronized (this.f43615a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void f(com.google.android.material.snackbar.a.b bVar) {
        synchronized (this.f43615a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
