package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5905zY implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f40328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p184s3.c2 f40329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f40330c;

    public C5905zY(android.content.Context context, p184s3.c2 c2Var, java.util.List list) {
        this.f40328a = context;
        this.f40329b = c2Var;
        this.f40330c = list;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks;
        android.app.ActivityManager.RunningTaskInfo runningTaskInfo;
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2348Fg.f27442a.e()).booleanValue()) {
            android.os.Bundle bundle = new android.os.Bundle();
            p174r3.v.t();
            java.lang.String className = null;
            try {
                android.app.ActivityManager activityManager = (android.app.ActivityManager) this.f40328a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    className = runningTaskInfo.topActivity.getClassName();
                }
            } catch (java.lang.Exception unused) {
            }
            bundle.putString("activity", className);
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("width", this.f40329b.f54202G);
            bundle2.putInt("height", this.f40329b.f54199D);
            bundle.putBundle("size", bundle2);
            if (!this.f40330c.isEmpty()) {
                java.util.List list = this.f40330c;
                bundle.putParcelableArray("parents", (android.os.Parcelable[]) list.toArray(new android.os.Parcelable[list.size()]));
            }
            c3677fC.f35301a.putBundle("view_hierarchy", bundle);
        }
    }
}
