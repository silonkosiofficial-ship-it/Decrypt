.class public final Lcom/google/android/gms/internal/ads/ag;
.super Landroidx/browser/customtabs/e;
.source "SourceFile"


# instance fields
.field private final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private c:Landroid/content/Context;

.field private d:Lcom/google/android/gms/internal/ads/eO;

.field private e:Landroidx/browser/customtabs/f;

.field private f:Landroidx/browser/customtabs/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/browser/customtabs/e;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ag;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method private final h(Landroid/content/Context;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ag;->f:Landroidx/browser/customtabs/c;

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroidx/browser/customtabs/c;->c(Landroid/content/Context;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p1, v0, p0}, Landroidx/browser/customtabs/c;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/browser/customtabs/e;)Z

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/ComponentName;Landroidx/browser/customtabs/c;)V
    .locals 2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ag;->f:Landroidx/browser/customtabs/c;

    const-wide/16 v0, 0x0

    invoke-virtual {p2, v0, v1}, Landroidx/browser/customtabs/c;->g(J)Z

    new-instance p1, Lcom/google/android/gms/internal/ads/Zf;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/Zf;-><init>(Lcom/google/android/gms/internal/ads/ag;)V

    invoke-virtual {p2, p1}, Landroidx/browser/customtabs/c;->e(Landroidx/browser/customtabs/b;)Landroidx/browser/customtabs/f;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ag;->e:Landroidx/browser/customtabs/f;

    return-void
.end method

.method public final c()Landroidx/browser/customtabs/f;
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ag;->e:Landroidx/browser/customtabs/f;

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Yf;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/Yf;-><init>(Lcom/google/android/gms/internal/ads/ag;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ag;->e:Landroidx/browser/customtabs/f;

    return-object v0
.end method

.method public final d(Landroid/content/Context;Lcom/google/android/gms/internal/ads/eO;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ag;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ag;->c:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ag;->d:Lcom/google/android/gms/internal/ads/eO;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/ag;->h(Landroid/content/Context;)V

    return-void
.end method

.method final synthetic e()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ag;->c:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/ag;->h(Landroid/content/Context;)V

    return-void
.end method

.method final synthetic f(I)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ag;->d:Lcom/google/android/gms/internal/ads/eO;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eO;->a()Lcom/google/android/gms/internal/ads/dO;

    move-result-object v0

    const-string v1, "action"

    const-string v2, "cct_nav"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "cct_navs"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dO;->g()V

    :cond_0
    return-void
.end method

.method public final g(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->F4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ag;->d:Lcom/google/android/gms/internal/ads/eO;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Xf;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/Xf;-><init>(Lcom/google/android/gms/internal/ads/ag;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ag;->f:Landroidx/browser/customtabs/c;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ag;->e:Landroidx/browser/customtabs/f;

    return-void
.end method
