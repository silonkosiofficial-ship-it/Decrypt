package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends android.content.BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String queryParameter = intent.getData().getQueryParameter("backendName");
        java.lang.String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = java.lang.Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i6 = intent.getExtras().getInt("attemptNumber");
        Y2.u.f(context);
        Y2.p.a aVarD = Y2.p.a().b(queryParameter).d(p094j3.a.b(iIntValue));
        if (queryParameter2 != null) {
            aVarD.c(android.util.Base64.decode(queryParameter2, 0));
        }
        Y2.u.c().e().v(aVarD.a(), i6, new java.lang.Runnable() { // from class: f3.a
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver.b();
            }
        });
    }
}
