package p055f4;

/* JADX INFO: renamed from: f4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6561j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.app.Application f45162a;

    /* synthetic */ C6561j(p055f4.AbstractC6559i abstractC6559i) {
    }

    public final p055f4.AbstractC6543a a() {
        p055f4.U0.b(this.f45162a, android.app.Application.class);
        return new p055f4.C6557h(this.f45162a, null);
    }

    public final p055f4.C6561j b(android.app.Application application) {
        application.getClass();
        this.f45162a = application;
        return this;
    }
}
