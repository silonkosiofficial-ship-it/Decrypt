package O3;

/* JADX INFO: loaded from: classes.dex */
public class b extends java.lang.Exception {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected final com.google.android.gms.common.api.Status f8031C;

    public b(com.google.android.gms.common.api.Status status) {
        super(status.f() + ": " + (status.s() != null ? status.s() : ""));
        this.f8031C = status;
    }

    public com.google.android.gms.common.api.Status a() {
        return this.f8031C;
    }

    public int b() {
        return this.f8031C.f();
    }
}
