package p171r0;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p171r0.N f53502a = new p171r0.N();

    private N() {
    }

    public final void a(android.graphics.Outline outline, p141o0.Q1 q6) {
        if (!(q6 instanceof p141o0.V)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((p141o0.V) q6).s());
    }
}
