package S5;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S5.v f12572a = new S5.v();

    private v() {
    }

    private final S5.u a(java.lang.String str, int i6, int i10, boolean z6) {
        return new S5.u(str, i6, i10, z6);
    }

    static /* synthetic */ S5.u b(S5.v vVar, java.lang.String str, int i6, int i10, boolean z6, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        if ((i11 & 8) != 0) {
            z6 = false;
        }
        return vVar.a(str, i6, i10, z6);
    }

    public final java.util.List c(android.content.Context context) {
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
            java.lang.String str2 = runningAppProcessInfo.processName;
            p247y7.AbstractC7350t.e(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new S5.u(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, p247y7.AbstractC7350t.b(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final S5.u d(android.content.Context context) {
        java.lang.Object next;
        p247y7.AbstractC7350t.f(context, "context");
        int iMyPid = android.os.Process.myPid();
        java.util.Iterator it = c(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((S5.u) next).b() != iMyPid);
        S5.u uVar = (S5.u) next;
        return uVar == null ? b(this, e(), iMyPid, 0, false, 12, null) : uVar;
    }

    public final java.lang.String e() throws java.lang.Throwable {
        java.lang.String processName;
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            java.lang.String strMyProcessName = android.os.Process.myProcessName();
            p247y7.AbstractC7350t.e(strMyProcessName, "myProcessName()");
            return strMyProcessName;
        }
        if (i6 >= 28 && (processName = android.app.Application.getProcessName()) != null) {
            return processName;
        }
        java.lang.String strA = V3.p.a();
        return strA != null ? strA : "";
    }
}
