package p015b4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements android.os.IInterface {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.IBinder f24174C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f24175D;

    protected a(android.os.IBinder iBinder, java.lang.String str) {
        this.f24174C = iBinder;
        this.f24175D = str;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f24174C;
    }
}
