package p158p8;

/* JADX INFO: loaded from: classes2.dex */
public class v extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f52861C;

    public v(p158p8.p pVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f52861C = null;
    }

    public p158p8.k a() {
        return new p158p8.k(getMessage());
    }
}
