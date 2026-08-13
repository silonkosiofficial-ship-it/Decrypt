package p063g2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.Object f45445f = new java.lang.Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static p063g2.a f45446g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f45447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.HashMap f45448b = new java.util.HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.HashMap f45449c = new java.util.HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.ArrayList f45450d = new java.util.ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.os.Handler f45451e;

    /* JADX INFO: renamed from: g2.a$a, reason: collision with other inner class name */
    class HandlerC0510a extends android.os.Handler {
        HandlerC0510a(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                p063g2.a.this.a();
            }
        }
    }

    private static final class b {
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.content.IntentFilter f45453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.content.BroadcastReceiver f45454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f45455c;

        c(android.content.IntentFilter intentFilter, android.content.BroadcastReceiver broadcastReceiver) {
            this.f45453a = intentFilter;
            this.f45454b = broadcastReceiver;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f45454b);
            sb.append(" filter=");
            sb.append(this.f45453a);
            if (this.f45455c) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private a(android.content.Context context) {
        this.f45447a = context;
        this.f45451e = new p063g2.a.HandlerC0510a(context.getMainLooper());
    }

    public static p063g2.a b(android.content.Context context) {
        p063g2.a aVar;
        synchronized (f45445f) {
            try {
                if (f45446g == null) {
                    f45446g = new p063g2.a(context.getApplicationContext());
                }
                aVar = f45446g;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    void a() {
        int size;
        g2.a.b[] bVarArr;
        do {
            synchronized (this.f45448b) {
                try {
                    size = this.f45450d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new g2.a.b[size];
                    this.f45450d.toArray(bVarArr);
                    this.f45450d.clear();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } while (size <= 0);
        g2.a.b bVar = bVarArr[0];
        throw null;
    }

    public void c(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        synchronized (this.f45448b) {
            try {
                g2.a.c cVar = new g2.a.c(intentFilter, broadcastReceiver);
                java.util.ArrayList arrayList = (java.util.ArrayList) this.f45448b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList(1);
                    this.f45448b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i6 = 0; i6 < intentFilter.countActions(); i6++) {
                    java.lang.String action = intentFilter.getAction(i6);
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f45449c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList(1);
                        this.f45449c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void d(android.content.BroadcastReceiver broadcastReceiver) {
        synchronized (this.f45448b) {
            try {
                java.util.ArrayList arrayList = (java.util.ArrayList) this.f45448b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    g2.a.c cVar = (g2.a.c) arrayList.get(size);
                    cVar.f45455c = true;
                    for (int i6 = 0; i6 < cVar.f45453a.countActions(); i6++) {
                        java.lang.String action = cVar.f45453a.getAction(i6);
                        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f45449c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                g2.a.c cVar2 = (g2.a.c) arrayList2.get(size2);
                                if (cVar2.f45454b == broadcastReceiver) {
                                    cVar2.f45455c = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f45449c.remove(action);
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
