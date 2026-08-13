.class public final LK4/s;
.super LK4/a;
.source "SourceFile"

# interfaces
.implements LK4/u;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.play.core.integrity.protocol.IIntegrityService"

    invoke-direct {p0, p1, v0}, LK4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final K2(Landroid/os/Bundle;LK4/w;)V
    .locals 1

    invoke-virtual {p0}, LK4/a;->q0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LK4/o;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, LK4/a;->y0(ILandroid/os/Parcel;)V

    return-void
.end method
