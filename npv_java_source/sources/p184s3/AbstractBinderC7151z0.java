package p184s3;

/* JADX INFO: renamed from: s3.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC7151z0 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.A0 {
    public static p184s3.A0 o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return iInterfaceQueryLocalInterface instanceof p184s3.A0 ? (p184s3.A0) iInterfaceQueryLocalInterface : new p184s3.C7148y0(iBinder);
    }
}
