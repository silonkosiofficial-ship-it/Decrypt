package p104k3;

/* JADX INFO: renamed from: k3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC6886c {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f49460C;

    EnumC6886c(int i6) {
        this.f49460C = i6;
    }

    public static p104k3.EnumC6886c e(int i6) {
        for (p104k3.EnumC6886c enumC6886c : values()) {
            if (enumC6886c.g() == i6) {
                return enumC6886c;
            }
        }
        return null;
    }

    public int g() {
        return this.f49460C;
    }
}
