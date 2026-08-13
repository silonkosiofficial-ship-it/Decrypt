package p055f4;

/* JADX INFO: loaded from: classes3.dex */
public final class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f45088a;

    X0(java.util.concurrent.Executor executor) {
        this.f45088a = executor;
    }

    public final java.util.concurrent.Executor a() {
        return this.f45088a;
    }

    public final void b(final java.lang.String str, final java.lang.String str2, final p055f4.E0... e0Arr) {
        this.f45088a.execute(new java.lang.Runnable() { // from class: f4.d0
            @Override // java.lang.Runnable
            public final void run() {
                final org.json.JSONObject jSONObject;
                java.lang.String str3 = str;
                if (android.text.TextUtils.isEmpty(str3)) {
                    return;
                }
                java.lang.String str4 = str2;
                final java.lang.String lowerCase = str3.toLowerCase();
                if (android.text.TextUtils.isEmpty(str4)) {
                    jSONObject = new org.json.JSONObject();
                } else {
                    try {
                        jSONObject = new org.json.JSONObject(str4);
                    } catch (org.json.JSONException unused) {
                        java.lang.String str5 = "Action[" + lowerCase + "]: failed to parse args: " + str4;
                        return;
                    }
                }
                p055f4.E0[] e0Arr2 = e0Arr;
                java.lang.String str6 = "Action[" + lowerCase + "]: " + jSONObject.toString();
                for (final p055f4.E0 e6 : e0Arr2) {
                    java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable() { // from class: f4.B
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            return java.lang.Boolean.valueOf(e6.b(lowerCase, jSONObject));
                        }
                    });
                    e6.a().execute(futureTask);
                    try {
                        if (((java.lang.Boolean) futureTask.get()).booleanValue()) {
                            return;
                        }
                    } catch (java.lang.InterruptedException e10) {
                        java.lang.String str7 = "Thread interrupted for Action[" + lowerCase + "]: ";
                    } catch (java.util.concurrent.ExecutionException e11) {
                        java.lang.String str8 = "Failed to run Action[" + lowerCase + "]: ";
                        e11.getCause();
                    }
                }
            }
        });
    }
}
