package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
enum EnumC6397j {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final char f42450C;

    EnumC6397j(char c6) {
        this.f42450C = c6;
    }

    public static com.google.android.gms.measurement.internal.EnumC6397j g(char c6) {
        for (com.google.android.gms.measurement.internal.EnumC6397j enumC6397j : values()) {
            if (enumC6397j.f42450C == c6) {
                return enumC6397j;
            }
        }
        return UNSET;
    }
}
