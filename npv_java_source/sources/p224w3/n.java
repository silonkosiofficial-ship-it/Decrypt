package p224w3;

/* JADX INFO: loaded from: classes.dex */
final class n extends p224w3.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f56251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f56252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f56253c;

    n(int i6, int i10, boolean z6) {
        this.f56251a = i6;
        this.f56252b = i10;
        this.f56253c = z6;
    }

    @Override // p224w3.x
    public final int a() {
        return this.f56252b;
    }

    @Override // p224w3.x
    public final int b() {
        return this.f56251a;
    }

    @Override // p224w3.x
    public final boolean c() {
        return this.f56253c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p224w3.x) {
            p224w3.x xVar = (p224w3.x) obj;
            if (this.f56251a == xVar.b() && this.f56252b == xVar.a() && this.f56253c == xVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f56253c ? 1237 : 1231) ^ ((((this.f56251a ^ 1000003) * 1000003) ^ this.f56252b) * 1000003);
    }

    public final java.lang.String toString() {
        return "OfflineAdConfig{impressionPrerequisite=" + this.f56251a + ", clickPrerequisite=" + this.f56252b + ", notificationFlowEnabled=" + this.f56253c + "}";
    }
}
