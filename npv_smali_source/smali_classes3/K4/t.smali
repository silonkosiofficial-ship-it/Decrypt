.class public abstract LK4/t;
.super LK4/n;
.source "SourceFile"

# interfaces
.implements LK4/u;


# direct methods
.method public static y0(Landroid/os/IBinder;)LK4/u;
    .locals 2

    .prologue
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.play.core.integrity.protocol.IIntegrityService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, LK4/u;

    if-eqz v1, :cond_1

    check-cast v0, LK4/u;

    return-object v0

    :cond_1
    new-instance v0, LK4/s;

    invoke-direct {v0, p0}, LK4/s;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
