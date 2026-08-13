.class public Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final antm:Ljava/lang/Throwable;

.field private final hEJ:Landroid/content/Context;

.field private final hpy:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication;->hEJ:Landroid/content/Context;

    iput-object p2, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication;->antm:Ljava/lang/Throwable;

    iput-object p3, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication;->hpy:Ljava/lang/String;

    return-void
.end method

.method private static Ccwtchjno()Ljava/lang/String;
    .locals 9

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const/16 v0, 0x10

    shl-long/2addr v5, v0

    const-wide/32 v7, 0xffff

    and-long v0, v1, v7

    or-long/2addr v0, v5

    new-instance v2, Ljava/util/UUID;

    invoke-direct {v2, v0, v1, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static bb(Landroid/content/Context;Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication;->ye(Landroid/content/Context;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private static fAHytsI(Landroid/content/Context;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 5

    .prologue
    invoke-static {p1, p2}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication;->qk(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/napsternetlabs/napsternetv/MessageGuardException;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "DP: "

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    new-instance v2, Landroid/content/ComponentName;

    const-string v3, "com.napsternetlabs.napsternetv"

    const-string v4, "com.napsternetlabs.napsternetv.ProtectedMyApplication$MainActivity$a"

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string v2, "e8a89b5d235891095ae1119f4ca96fbb"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    if-eqz v3, :cond_0

    const-string v2, "DP: am"

    invoke-virtual {v3, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "9a42c8e5129967ae365a5e122e8c79f2"

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    const-string v2, "3d574fdbbe56887e2c883d66ea381e98"

    iget-object v3, v0, Lcom/napsternetlabs/napsternetv/MessageGuardException;->id:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    const-string v2, "7d0df5e466d1e53d7fc15e80fa507c45"

    iget-object v3, v0, Lcom/napsternetlabs/napsternetv/MessageGuardException;->id:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const v2, 0x10008000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_1
    throw v0
.end method

.method static j(Landroid/content/Context;Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication;->qscdn(Landroid/content/Context;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private static qk(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/napsternetlabs/napsternetv/MessageGuardException;
    .locals 2

    .prologue
    move-object v0, p1

    if-nez v0, :cond_0

    invoke-static {}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication;->Ccwtchjno()Ljava/lang/String;

    move-result-object v0

    :cond_0
    new-instance v1, Lcom/napsternetlabs/napsternetv/MessageGuardException;

    invoke-direct {v1, p0, v0}, Lcom/napsternetlabs/napsternetv/MessageGuardException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    if-nez p1, :cond_1

    invoke-static {v1, v0}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity$d;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_1
    return-object v1
.end method

.method static qscdn(Landroid/content/Context;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-ge v0, v1, :cond_0

    invoke-static {p0, p1, p2}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication;->fAHytsI(Landroid/content/Context;Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1, p2}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication;->ye(Landroid/content/Context;Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method static ye(Landroid/content/Context;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication;

    invoke-direct {v0, p0, p1, p2}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication;-><init>(Landroid/content/Context;Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication;->hEJ:Landroid/content/Context;

    iget-object v1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication;->antm:Ljava/lang/Throwable;

    iget-object v2, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication;->hpy:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication;->fAHytsI(Landroid/content/Context;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method
