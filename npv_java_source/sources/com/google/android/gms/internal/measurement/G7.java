package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class G7 extends com.google.android.gms.internal.measurement.AbstractC6076n {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.K7 f40524E;

    public G7(com.google.android.gms.internal.measurement.K7 k10) {
        super("internal.logger");
        this.f40524E = k10;
        this.f41045D.put("log", new com.google.android.gms.internal.measurement.J7(this, false, true));
        this.f41045D.put("silent", new com.google.android.gms.internal.measurement.y7(this, "silent"));
        ((com.google.android.gms.internal.measurement.AbstractC6076n) this.f41045D.get("silent")).s("log", new com.google.android.gms.internal.measurement.J7(this, true, true));
        this.f41045D.put("unmonitored", new com.google.android.gms.internal.measurement.I7(this, "unmonitored"));
        ((com.google.android.gms.internal.measurement.AbstractC6076n) this.f41045D.get("unmonitored")).s("log", new com.google.android.gms.internal.measurement.J7(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6076n
    public final com.google.android.gms.internal.measurement.InterfaceC6117s a(com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
    }
}
