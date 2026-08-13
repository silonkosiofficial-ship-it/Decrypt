package p012b1;

/* JADX INFO: renamed from: b1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2111a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p012b1.C2111a f24013a = new p012b1.C2111a();

    private C2111a() {
    }

    public final java.lang.String a(int i6) {
        if (i6 == 0) {
            return "top";
        }
        if (i6 == 1) {
            return "bottom";
        }
        p032d1.a.f44286a.b("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
        return "top";
    }

    public final java.lang.String b(int i6) {
        if (i6 == -2) {
            return "start";
        }
        if (i6 == -1) {
            return "end";
        }
        if (i6 == 0) {
            return "left";
        }
        if (i6 == 1) {
            return "right";
        }
        p032d1.a.f44286a.b("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
        return "start";
    }
}
