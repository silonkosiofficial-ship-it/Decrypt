package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6160x2 implements com.google.android.gms.internal.measurement.InterfaceC6170y4 {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f41287C;

    EnumC6160x2(int i6) {
        this.f41287C = i6;
    }

    public static com.google.android.gms.internal.measurement.EnumC6160x2 e(int i6) {
        if (i6 == 0) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        }
        if (i6 == 1) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        if (i6 == 2) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        }
        if (i6 == 3) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        }
        if (i6 == 4) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        if (i6 != 5) {
            return null;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
    }

    public static com.google.android.gms.internal.measurement.InterfaceC6162x4 g() {
        return com.google.android.gms.internal.measurement.C6144v2.f41254a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6170y4
    public final int a() {
        return this.f41287C;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "<" + com.google.android.gms.internal.measurement.EnumC6160x2.class.getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " number=" + this.f41287C + " name=" + name() + '>';
    }
}
