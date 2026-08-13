package p141o0;

/* JADX INFO: renamed from: o0.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6987o0 {

    /* JADX INFO: renamed from: o0.o0$a */
    public static final class a extends p141o0.a2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ android.graphics.Shader f52249e;

        a(android.graphics.Shader shader) {
            this.f52249e = shader;
        }

        @Override // p141o0.a2
        public android.graphics.Shader b(long j6) {
            return this.f52249e;
        }
    }

    public static final p141o0.a2 a(android.graphics.Shader shader) {
        return new p141o0.AbstractC6987o0.a(shader);
    }
}
