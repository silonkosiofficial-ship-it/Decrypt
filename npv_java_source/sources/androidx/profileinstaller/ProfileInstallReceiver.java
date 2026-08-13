package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends android.content.BroadcastReceiver {

    class a implements androidx.profileinstaller.i.c {
        a() {
        }

        @Override // androidx.profileinstaller.i.c
        public void a(int i6, java.lang.Object obj) {
            androidx.profileinstaller.i.f22936b.a(i6, obj);
        }

        @Override // androidx.profileinstaller.i.c
        public void b(int i6, java.lang.Object obj) {
            androidx.profileinstaller.i.f22936b.b(i6, obj);
            androidx.profileinstaller.ProfileInstallReceiver.this.setResultCode(i6);
        }
    }

    static void a(androidx.profileinstaller.i.c cVar) {
        int i6;
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            android.os.Process.sendSignal(android.os.Process.myPid(), 10);
            i6 = 12;
        } else {
            i6 = 13;
        }
        cVar.b(i6, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.os.Bundle extras;
        if (intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            androidx.profileinstaller.i.k(context, new p123m2.m(), new androidx.profileinstaller.ProfileInstallReceiver.a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            android.os.Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                java.lang.String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    androidx.profileinstaller.i.l(context, new p123m2.m(), new androidx.profileinstaller.ProfileInstallReceiver.a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        androidx.profileinstaller.i.c(context, new p123m2.m(), new androidx.profileinstaller.ProfileInstallReceiver.a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            a(new androidx.profileinstaller.ProfileInstallReceiver.a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        java.lang.String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        androidx.profileinstaller.ProfileInstallReceiver.a aVar = new androidx.profileinstaller.ProfileInstallReceiver.a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            androidx.profileinstaller.a.b(context, aVar);
        } else {
            aVar.b(16, null);
        }
    }
}
