package R9;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R9.e f9790a = new R9.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.concurrent.CopyOnWriteArraySet f9791b = new java.util.concurrent.CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Map f9792c;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.Package r6 = H9.x.class.getPackage();
        java.lang.String name = r6 != null ? r6.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        java.lang.String name2 = H9.x.class.getName();
        p247y7.AbstractC7350t.e(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        java.lang.String name3 = P9.e.class.getName();
        p247y7.AbstractC7350t.e(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        java.lang.String name4 = L9.e.class.getName();
        p247y7.AbstractC7350t.e(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f9792c = p097j7.S.s(linkedHashMap);
    }

    private e() {
    }

    private final void c(java.lang.String str, java.lang.String str2) {
        java.util.logging.Level level;
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(str);
        if (f9791b.add(logger)) {
            logger.setUseParentHandlers(false);
            if (android.util.Log.isLoggable(str2, 3)) {
                level = java.util.logging.Level.FINE;
            } else {
                level = android.util.Log.isLoggable(str2, 4) ? java.util.logging.Level.INFO : java.util.logging.Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(R9.f.f9793a);
        }
    }

    private final java.lang.String d(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) f9792c.get(str);
        return str2 == null ? S8.r.B1(str, 23) : str2;
    }

    public final void a(java.lang.String str, int i6, java.lang.String str2, java.lang.Throwable th) {
        int iMin;
        p247y7.AbstractC7350t.f(str, "loggerName");
        p247y7.AbstractC7350t.f(str2, "message");
        if (android.util.Log.isLoggable(d(str), i6)) {
            if (th != null) {
                str2 = str2 + '\n' + android.util.Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i10 = 0;
            while (i10 < length) {
                int iO0 = S8.r.o0(str2, '\n', i10, false, 4, null);
                if (iO0 == -1) {
                    iO0 = length;
                }
                while (true) {
                    iMin = java.lang.Math.min(iO0, i10 + 4000);
                    p247y7.AbstractC7350t.e(str2.substring(i10, iMin), "this as java.lang.String…ing(startIndex, endIndex)");
                    if (iMin >= iO0) {
                        break;
                    } else {
                        i10 = iMin;
                    }
                }
                i10 = iMin + 1;
            }
        }
    }

    public final void b() {
        for (java.util.Map.Entry entry : f9792c.entrySet()) {
            c((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
    }
}
