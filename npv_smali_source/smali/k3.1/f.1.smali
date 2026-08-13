.class public Lk3/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk3/f$a;
    }
.end annotation


# instance fields
.field private final a:Ls3/b2;

.field private final b:Landroid/content/Context;

.field private final c:Ls3/N;


# direct methods
.method constructor <init>(Landroid/content/Context;Ls3/N;Ls3/b2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/f;->b:Landroid/content/Context;

    iput-object p2, p0, Lk3/f;->c:Ls3/N;

    iput-object p3, p0, Lk3/f;->a:Ls3/b2;

    return-void
.end method

.method private final c(Ls3/f1;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lk3/f;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Af;->a(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Ag;->c:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->bb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lw3/c;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lk3/y;

    invoke-direct {v1, p0, p1}, Lk3/y;-><init>(Lk3/f;Ls3/f1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lk3/f;->c:Ls3/N;

    iget-object v1, p0, Lk3/f;->a:Ls3/b2;

    iget-object v2, p0, Lk3/f;->b:Landroid/content/Context;

    invoke-virtual {v1, v2, p1}, Ls3/b2;->a(Landroid/content/Context;Ls3/f1;)Ls3/X1;

    move-result-object p1

    invoke-interface {v0, p1}, Ls3/N;->H5(Ls3/X1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Failed to load ad."

    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public a(Lk3/g;)V
    .locals 0

    iget-object p1, p1, Lk3/g;->a:Ls3/f1;

    invoke-direct {p0, p1}, Lk3/f;->c(Ls3/f1;)V

    return-void
.end method

.method final synthetic b(Ls3/f1;)V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, Lk3/f;->c:Ls3/N;

    iget-object v1, p0, Lk3/f;->a:Ls3/b2;

    iget-object v2, p0, Lk3/f;->b:Landroid/content/Context;

    invoke-virtual {v1, v2, p1}, Ls3/b2;->a(Landroid/content/Context;Ls3/f1;)Ls3/X1;

    move-result-object p1

    invoke-interface {v0, p1}, Ls3/N;->H5(Ls3/X1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Failed to load ad."

    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
