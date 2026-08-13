.class public final LS3/a;
.super Ld4/a;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.service.IClientTelemetryService"

    invoke-direct {p0, p1, v0}, Ld4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c2(LQ3/t;)V
    .locals 1

    invoke-virtual {p0}, Ld4/a;->q0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Ld4/c;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Ld4/a;->L0(ILandroid/os/Parcel;)V

    return-void
.end method
