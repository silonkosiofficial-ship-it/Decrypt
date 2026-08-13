package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static androidx.core.app.RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        androidx.core.app.RemoteActionCompat remoteActionCompat = new androidx.core.app.RemoteActionCompat();
        remoteActionCompat.f21366a = (androidx.core.graphics.drawable.IconCompat) aVar.v(remoteActionCompat.f21366a, 1);
        remoteActionCompat.f21367b = aVar.l(remoteActionCompat.f21367b, 2);
        remoteActionCompat.f21368c = aVar.l(remoteActionCompat.f21368c, 3);
        remoteActionCompat.f21369d = (android.app.PendingIntent) aVar.r(remoteActionCompat.f21369d, 4);
        remoteActionCompat.f21370e = aVar.h(remoteActionCompat.f21370e, 5);
        remoteActionCompat.f21371f = aVar.h(remoteActionCompat.f21371f, 6);
        return remoteActionCompat;
    }

    public static void write(androidx.core.app.RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f21366a, 1);
        aVar.D(remoteActionCompat.f21367b, 2);
        aVar.D(remoteActionCompat.f21368c, 3);
        aVar.H(remoteActionCompat.f21369d, 4);
        aVar.z(remoteActionCompat.f21370e, 5);
        aVar.z(remoteActionCompat.f21371f, 6);
    }
}
