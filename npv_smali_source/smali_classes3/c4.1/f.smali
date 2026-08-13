.class public final Lc4/f;
.super LQ3/g;
.source "SourceFile"


# instance fields
.field private final I:LI3/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;LQ3/d;LI3/g;LO3/f$a;LO3/f$b;)V
    .locals 7

    .prologue
    const/16 v3, 0x44

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, LQ3/g;-><init>(Landroid/content/Context;Landroid/os/Looper;ILQ3/d;LO3/f$a;LO3/f$b;)V

    new-instance p1, LI3/f;

    if-nez p4, :cond_0

    sget-object p4, LI3/g;->F:LI3/g;

    :cond_0
    invoke-direct {p1, p4}, LI3/f;-><init>(LI3/g;)V

    invoke-static {}, Lc4/b;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, LI3/f;->a(Ljava/lang/String;)LI3/f;

    new-instance p2, LI3/g;

    invoke-direct {p2, p1}, LI3/g;-><init>(LI3/f;)V

    iput-object p2, p0, Lc4/f;->I:LI3/g;

    return-void
.end method


# virtual methods
.method protected final A()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lc4/f;->I:LI3/g;

    invoke-virtual {v0}, LI3/g;->a()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method protected final E()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    return-object v0
.end method

.method protected final F()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.service.START"

    return-object v0
.end method

.method public final l()I
    .locals 1

    const v0, 0xc35000

    return v0
.end method

.method protected final synthetic s(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    .prologue
    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lc4/g;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, Lc4/g;

    goto :goto_0

    :cond_1
    new-instance v0, Lc4/g;

    invoke-direct {v0, p1}, Lc4/g;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method
