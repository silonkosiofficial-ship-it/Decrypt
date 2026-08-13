package E9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    public static final class a implements E9.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.compose.animation.h f2302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.compose.animation.j f2303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.compose.animation.j f2304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.compose.animation.h f2305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f2306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f2307f;

        a(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, androidx.compose.animation.j jVar2, androidx.compose.animation.h hVar2, float f6, float f10) {
            this.f2302a = hVar;
            this.f2303b = jVar;
            this.f2304c = jVar2;
            this.f2305d = hVar2;
            this.f2306e = f6;
            this.f2307f = f10;
        }

        @Override // E9.a
        public float a() {
            return this.f2306e;
        }

        @Override // E9.a
        public androidx.compose.animation.j b() {
            return this.f2303b;
        }

        @Override // E9.a
        public float c() {
            return this.f2307f;
        }

        @Override // E9.a
        public androidx.compose.animation.j d() {
            return this.f2304c;
        }

        @Override // E9.a
        public androidx.compose.animation.h e() {
            return this.f2305d;
        }

        @Override // E9.a
        public androidx.compose.animation.h f() {
            return this.f2302a;
        }
    }

    public static final E9.a a(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, androidx.compose.animation.j jVar2, androidx.compose.animation.h hVar2, float f6, float f10) {
        p247y7.AbstractC7350t.f(hVar, "createTransition");
        p247y7.AbstractC7350t.f(jVar, "destroyTransition");
        p247y7.AbstractC7350t.f(jVar2, "pauseTransition");
        p247y7.AbstractC7350t.f(hVar2, "resumeTransition");
        return new E9.b.a(hVar, jVar, jVar2, hVar2, f6, f10);
    }
}
