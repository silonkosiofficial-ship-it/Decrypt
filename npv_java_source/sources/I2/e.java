package I2;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.app.Notification f4968c;

    public e(int i6, android.app.Notification notification, int i10) {
        this.f4966a = i6;
        this.f4968c = notification;
        this.f4967b = i10;
    }

    public int a() {
        return this.f4967b;
    }

    public android.app.Notification b() {
        return this.f4968c;
    }

    public int c() {
        return this.f4966a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I2.e.class != obj.getClass()) {
            return false;
        }
        I2.e eVar = (I2.e) obj;
        if (this.f4966a == eVar.f4966a && this.f4967b == eVar.f4967b) {
            return this.f4968c.equals(eVar.f4968c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f4966a * 31) + this.f4967b) * 31) + this.f4968c.hashCode();
    }

    public java.lang.String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f4966a + ", mForegroundServiceType=" + this.f4967b + ", mNotification=" + this.f4968c + '}';
    }
}
