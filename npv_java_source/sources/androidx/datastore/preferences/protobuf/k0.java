package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f22063C;

    public k0(androidx.datastore.preferences.protobuf.O o6) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f22063C = null;
    }

    public androidx.datastore.preferences.protobuf.C2065z a() {
        return new androidx.datastore.preferences.protobuf.C2065z(getMessage());
    }
}
