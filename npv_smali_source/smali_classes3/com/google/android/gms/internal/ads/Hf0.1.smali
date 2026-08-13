.class final Lcom/google/android/gms/internal/ads/Hf0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Lcom/google/android/gms/internal/ads/ag0;

.field private static final d:Landroid/content/Intent;

.field public static final synthetic e:I


# instance fields
.field final a:Lcom/google/android/gms/internal/ads/Zf0;

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/ag0;

    const-string v1, "OverlayDisplayService"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/ag0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Hf0;->c:Lcom/google/android/gms/internal/ads/ag0;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/Hf0;->d:Landroid/content/Intent;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 7

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/cg0;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/Zf0;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/ads/Hf0;->c:Lcom/google/android/gms/internal/ads/ag0;

    sget-object v5, Lcom/google/android/gms/internal/ads/Hf0;->d:Landroid/content/Intent;

    new-instance v6, Lcom/google/android/gms/internal/ads/Df0;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/Df0;-><init>()V

    const-string v4, "OverlayDisplayService"

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/Zf0;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ag0;Ljava/lang/String;Landroid/content/Intent;Lcom/google/android/gms/internal/ads/Df0;)V

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Hf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Hf0;->b:Ljava/lang/String;

    return-void
.end method

.method static synthetic h(Ljava/lang/String;)Z
    .locals 0

    .prologue
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Hf0;->k(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static i(Ljava/lang/String;Ljava/util/function/Consumer;)V
    .locals 1

    .prologue
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Hf0;->k(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private static j(Lcom/google/android/gms/internal/ads/Nf0;Ljava/lang/String;Ljava/util/List;)Z
    .locals 2

    .prologue
    invoke-static {p2}, Lj$/util/Collection$-EL;->stream(Ljava/util/Collection;)Lj$/util/stream/Stream;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/Ef0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Ef0;-><init>()V

    invoke-interface {p2, v0}, Lj$/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/ads/Hf0;->c:Lcom/google/android/gms/internal/ads/ag0;

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    invoke-virtual {p2, p1, v1}, Lcom/google/android/gms/internal/ads/ag0;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    invoke-static {}, Lcom/google/android/gms/internal/ads/Mf0;->c()Lcom/google/android/gms/internal/ads/Kf0;

    move-result-object p1

    const/16 p2, 0x1fe0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/Kf0;->b(I)Lcom/google/android/gms/internal/ads/Kf0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Kf0;->c()Lcom/google/android/gms/internal/ads/Mf0;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/Nf0;->a(Lcom/google/android/gms/internal/ads/Mf0;)V

    return v0
.end method

.method private static k(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Sg0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    return p0
.end method


# virtual methods
.method final a()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Hf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Hf0;->c:Lcom/google/android/gms/internal/ads/ag0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unbind LMD display overlay service"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/ads/ag0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Hf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Zf0;->n()V

    return-void
.end method

.method final b(Lcom/google/android/gms/internal/ads/of0;Lcom/google/android/gms/internal/ads/Nf0;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Hf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    if-nez v0, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/Hf0;->c:Lcom/google/android/gms/internal/ads/ag0;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "Play Store not found."

    const/4 v1, 0x0

    aput-object v0, p2, v1

    const-string v0, "error: %s"

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/internal/ads/ag0;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/of0;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/of0;->a()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v1, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken."

    invoke-static {p2, v1, v0}, Lcom/google/android/gms/internal/ads/Hf0;->j(Lcom/google/android/gms/internal/ads/Nf0;Ljava/lang/String;Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Hf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    new-instance v1, Lcom/google/android/gms/internal/ads/xf0;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/xf0;-><init>(Lcom/google/android/gms/internal/ads/Hf0;Lcom/google/android/gms/internal/ads/of0;Lcom/google/android/gms/internal/ads/Nf0;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Zf0;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method final synthetic c(Lcom/google/android/gms/internal/ads/of0;Lcom/google/android/gms/internal/ads/Nf0;)V
    .locals 4

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Hf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Zf0;->c()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Xe0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Hf0;->b:Ljava/lang/String;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "callerPackage"

    invoke-virtual {v2, v3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/of0;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/google/android/gms/internal/ads/Af0;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/ads/Af0;-><init>(Landroid/os/Bundle;)V

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/ads/Hf0;->i(Ljava/lang/String;Ljava/util/function/Consumer;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/of0;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/ads/Bf0;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/Bf0;-><init>(Landroid/os/Bundle;)V

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/Hf0;->i(Ljava/lang/String;Ljava/util/function/Consumer;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/Gf0;

    invoke-direct {p1, p0, p2}, Lcom/google/android/gms/internal/ads/Gf0;-><init>(Lcom/google/android/gms/internal/ads/Hf0;Lcom/google/android/gms/internal/ads/Nf0;)V

    invoke-interface {v0, v2, p1}, Lcom/google/android/gms/internal/ads/Xe0;->Z3(Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/Ze0;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    throw p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Hf0;->b:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/ads/Hf0;->c:Lcom/google/android/gms/internal/ads/ag0;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const-string p2, "dismiss overlay display from: %s"

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/ag0;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method final synthetic d(Lcom/google/android/gms/internal/ads/Jf0;Lcom/google/android/gms/internal/ads/Nf0;)V
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Hf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Zf0;->c()Landroid/os/IInterface;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/Xe0;

    if-nez v2, :cond_0

    return-void

    :cond_0
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/Hf0;->b:Ljava/lang/String;

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v6, "callerPackage"

    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "windowToken"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Jf0;->f()Landroid/os/IBinder;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Jf0;->g()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/google/android/gms/internal/ads/Ff0;

    invoke-direct {v7, v5}, Lcom/google/android/gms/internal/ads/Ff0;-><init>(Landroid/os/Bundle;)V

    invoke-static {v6, v7}, Lcom/google/android/gms/internal/ads/Hf0;->i(Ljava/lang/String;Ljava/util/function/Consumer;)V

    const-string v6, "layoutGravity"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Jf0;->c()I

    move-result v7

    invoke-virtual {v5, v6, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v6, "layoutVerticalMargin"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Jf0;->a()F

    move-result v7

    invoke-virtual {v5, v6, v7}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v6, "displayMode"

    invoke-virtual {v5, v6, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v6, "triggerMode"

    invoke-virtual {v5, v6, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v6, "windowWidthPx"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Jf0;->e()I

    move-result v7

    invoke-virtual {v5, v6, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance v6, Lcom/google/android/gms/internal/ads/tf0;

    invoke-direct {v6, v5}, Lcom/google/android/gms/internal/ads/tf0;-><init>(Landroid/os/Bundle;)V

    invoke-static {v3, v6}, Lcom/google/android/gms/internal/ads/Hf0;->i(Ljava/lang/String;Ljava/util/function/Consumer;)V

    new-instance v6, Lcom/google/android/gms/internal/ads/uf0;

    invoke-direct {v6, v5}, Lcom/google/android/gms/internal/ads/uf0;-><init>(Landroid/os/Bundle;)V

    invoke-static {v3, v6}, Lcom/google/android/gms/internal/ads/Hf0;->i(Ljava/lang/String;Ljava/util/function/Consumer;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Jf0;->h()Ljava/lang/String;

    move-result-object p1

    new-instance v6, Lcom/google/android/gms/internal/ads/vf0;

    invoke-direct {v6, v5}, Lcom/google/android/gms/internal/ads/vf0;-><init>(Landroid/os/Bundle;)V

    invoke-static {p1, v6}, Lcom/google/android/gms/internal/ads/Hf0;->i(Ljava/lang/String;Ljava/util/function/Consumer;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/wf0;

    invoke-direct {p1, v5}, Lcom/google/android/gms/internal/ads/wf0;-><init>(Landroid/os/Bundle;)V

    invoke-static {v3, p1}, Lcom/google/android/gms/internal/ads/Hf0;->i(Ljava/lang/String;Ljava/util/function/Consumer;)V

    const-string p1, "stableSessionToken"

    invoke-virtual {v5, p1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    new-instance p1, Lcom/google/android/gms/internal/ads/Gf0;

    invoke-direct {p1, p0, p2}, Lcom/google/android/gms/internal/ads/Gf0;-><init>(Lcom/google/android/gms/internal/ads/Hf0;Lcom/google/android/gms/internal/ads/Nf0;)V

    invoke-interface {v2, v4, v5, p1}, Lcom/google/android/gms/internal/ads/Xe0;->e5(Ljava/lang/String;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/Ze0;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    throw v3
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    sget-object p2, Lcom/google/android/gms/internal/ads/Hf0;->c:Lcom/google/android/gms/internal/ads/ag0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Hf0;->b:Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v2, v0, v1

    const-string v1, "show overlay display from: %s"

    invoke-virtual {p2, p1, v1, v0}, Lcom/google/android/gms/internal/ads/ag0;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method final synthetic e(Lcom/google/android/gms/internal/ads/Pf0;ILcom/google/android/gms/internal/ads/Nf0;)V
    .locals 4

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Hf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Zf0;->c()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Xe0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Hf0;->b:Ljava/lang/String;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "callerPackage"

    invoke-virtual {v2, v3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "displayMode"

    invoke-virtual {v2, v1, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Pf0;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/google/android/gms/internal/ads/sf0;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/ads/sf0;-><init>(Landroid/os/Bundle;)V

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/ads/Hf0;->i(Ljava/lang/String;Ljava/util/function/Consumer;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Pf0;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/ads/yf0;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/yf0;-><init>(Landroid/os/Bundle;)V

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/Hf0;->i(Ljava/lang/String;Ljava/util/function/Consumer;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/Gf0;

    invoke-direct {p1, p0, p3}, Lcom/google/android/gms/internal/ads/Gf0;-><init>(Lcom/google/android/gms/internal/ads/Hf0;Lcom/google/android/gms/internal/ads/Nf0;)V

    invoke-interface {v0, v2, p1}, Lcom/google/android/gms/internal/ads/Xe0;->v2(Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/Ze0;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    throw p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    sget-object p3, Lcom/google/android/gms/internal/ads/Hf0;->c:Lcom/google/android/gms/internal/ads/ag0;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Hf0;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 p2, 0x1

    aput-object v0, v1, p2

    const-string p2, "switchDisplayMode overlay display to %d from: %s"

    invoke-virtual {p3, p1, p2, v1}, Lcom/google/android/gms/internal/ads/ag0;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method final f(Lcom/google/android/gms/internal/ads/Jf0;Lcom/google/android/gms/internal/ads/Nf0;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Hf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    if-nez v0, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/Hf0;->c:Lcom/google/android/gms/internal/ads/ag0;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "Play Store not found."

    const/4 v1, 0x0

    aput-object v0, p2, v1

    const-string v0, "error: %s"

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/internal/ads/ag0;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Jf0;->h()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v1, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken."

    invoke-static {p2, v1, v0}, Lcom/google/android/gms/internal/ads/Hf0;->j(Lcom/google/android/gms/internal/ads/Nf0;Ljava/lang/String;Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Hf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Cf0;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/Cf0;-><init>(Lcom/google/android/gms/internal/ads/Hf0;Lcom/google/android/gms/internal/ads/Jf0;Lcom/google/android/gms/internal/ads/Nf0;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Zf0;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method final g(Lcom/google/android/gms/internal/ads/Pf0;Lcom/google/android/gms/internal/ads/Nf0;I)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Hf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    if-nez v0, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/Hf0;->c:Lcom/google/android/gms/internal/ads/ag0;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const-string p3, "Play Store not found."

    const/4 v0, 0x0

    aput-object p3, p2, v0

    const-string p3, "error: %s"

    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/internal/ads/ag0;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Pf0;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Pf0;->a()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v1, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken."

    invoke-static {p2, v1, v0}, Lcom/google/android/gms/internal/ads/Hf0;->j(Lcom/google/android/gms/internal/ads/Nf0;Ljava/lang/String;Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Hf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    new-instance v1, Lcom/google/android/gms/internal/ads/zf0;

    invoke-direct {v1, p0, p1, p3, p2}, Lcom/google/android/gms/internal/ads/zf0;-><init>(Lcom/google/android/gms/internal/ads/Hf0;Lcom/google/android/gms/internal/ads/Pf0;ILcom/google/android/gms/internal/ads/Nf0;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Zf0;->i(Ljava/lang/Runnable;)V

    return-void
.end method
