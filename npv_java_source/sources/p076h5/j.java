package p076h5;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p076h5.j f46504a = new p076h5.j();

    private j() {
    }

    public static /* synthetic */ n5.F.e.d.a.c c(p076h5.j jVar, java.lang.String str, int i6, int i10, boolean z6, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        if ((i11 & 8) != 0) {
            z6 = false;
        }
        return jVar.b(str, i6, i10, z6);
    }

    private final java.lang.String f() {
        java.lang.String processName;
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 < 33) {
            return (i6 < 28 || (processName = android.app.Application.getProcessName()) == null) ? "" : processName;
        }
        java.lang.String strMyProcessName = android.os.Process.myProcessName();
        p247y7.AbstractC7350t.e(strMyProcessName, "{\n      Process.myProcessName()\n    }");
        return strMyProcessName;
    }

    public final n5.F.e.d.a.c a(java.lang.String str, int i6, int i10) {
        p247y7.AbstractC7350t.f(str, "processName");
        return c(this, str, i6, i10, false, 8, null);
    }

    public final n5.F.e.d.a.c b(java.lang.String str, int i6, int i10, boolean z6) {
        p247y7.AbstractC7350t.f(str, "processName");
        n5.F.e.d.a.c cVarA = n5.F.e.d.a.c.a().e(str).d(i6).c(i10).b(z6).a();
        p247y7.AbstractC7350t.e(cVarA, "builder()\n      .setProc…ltProcess)\n      .build()");
        return cVarA;
    }

    public final java.util.List d(android.content.Context context) {
        p247y7.AbstractC7350t.f(context, "context");
        int i6 = context.getApplicationInfo().uid;
        java.lang.String str = context.getApplicationInfo().processName;
        java.lang.Object systemService = context.getSystemService("activity");
        android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = p097j7.AbstractC6879v.m();
        }
        java.util.List listF0 = p097j7.AbstractC6879v.f0(runningAppProcesses);
        java.util.ArrayList<android.app.ActivityManager.RunningAppProcessInfo> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listF0) {
            if (((android.app.ActivityManager.RunningAppProcessInfo) obj).uid == i6) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(arrayList, 10));
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(n5.F.e.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(p247y7.AbstractC7350t.b(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    public final n5.F.e.d.a.c e(android.content.Context context) {
        java.lang.Object next;
        p247y7.AbstractC7350t.f(context, "context");
        int iMyPid = android.os.Process.myPid();
        java.util.Iterator it = d(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((n5.F.e.d.a.c) next).c() != iMyPid);
        n5.F.e.d.a.c cVar = (n5.F.e.d.a.c) next;
        return cVar == null ? c(this, f(), iMyPid, 0, false, 12, null) : cVar;
    }
}
