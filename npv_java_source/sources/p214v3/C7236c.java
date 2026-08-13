package p214v3;

/* JADX INFO: renamed from: v3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7236c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f55875a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f55876b = 1.0f;

    public static float b(android.content.Context context) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume != 0) {
            return streamVolume / streamMaxVolume;
        }
        return 0.0f;
    }

    private final synchronized boolean f() {
        return this.f55876b >= 0.0f;
    }

    public final synchronized float a() {
        if (!f()) {
            return 1.0f;
        }
        return this.f55876b;
    }

    public final synchronized void c(boolean z6) {
        this.f55875a = z6;
    }

    public final synchronized void d(float f6) {
        this.f55876b = f6;
    }

    public final synchronized boolean e() {
        return this.f55875a;
    }
}
