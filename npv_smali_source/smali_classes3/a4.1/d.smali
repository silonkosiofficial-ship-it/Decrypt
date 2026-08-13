.class public final La4/d;
.super LQ3/g;
.source "SourceFile"


# direct methods
.method protected constructor <init>(Landroid/content/Context;Landroid/os/Looper;LQ3/d;LP3/c;LP3/h;)V
    .locals 7

    const/16 v3, 0x12c

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LQ3/g;-><init>(Landroid/content/Context;Landroid/os/Looper;ILQ3/d;LP3/c;LP3/h;)V

    return-void
.end method


# virtual methods
.method protected final E()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.appset.internal.IAppSetService"

    return-object v0
.end method

.method protected final F()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.appset.service.START"

    return-object v0
.end method

.method protected final I()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final S()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final l()I
    .locals 1

    const v0, 0xcaf1200

    return v0
.end method

.method protected final synthetic s(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    .prologue
    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.appset.internal.IAppSetService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, La4/g;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, La4/g;

    goto :goto_0

    :cond_1
    new-instance v0, La4/g;

    invoke-direct {v0, p1}, La4/g;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final v()[LN3/d;
    .locals 1

    sget-object v0, LH3/h;->b:[LN3/d;

    return-object v0
.end method
