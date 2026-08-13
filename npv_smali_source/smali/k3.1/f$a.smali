.class public Lk3/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk3/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ls3/Q;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    const-string v0, "context cannot be null"

    invoke-static {p1, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {}, Ls3/y;->a()Ls3/w;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/Rl;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/Rl;-><init>()V

    invoke-virtual {v1, p1, p2, v2}, Ls3/w;->c(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)Ls3/Q;

    move-result-object p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lk3/f$a;->a:Landroid/content/Context;

    iput-object p1, p0, Lk3/f$a;->b:Ls3/Q;

    return-void
.end method


# virtual methods
.method public a()Lk3/f;
    .locals 4

    .prologue
    :try_start_0
    new-instance v0, Lk3/f;

    iget-object v1, p0, Lk3/f$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lk3/f$a;->b:Ls3/Q;

    invoke-interface {v2}, Ls3/Q;->d()Ls3/N;

    move-result-object v2

    sget-object v3, Ls3/b2;->a:Ls3/b2;

    invoke-direct {v0, v1, v2, v3}, Lk3/f;-><init>(Landroid/content/Context;Ls3/N;Ls3/b2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to build AdLoader."

    invoke-static {v1, v0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Ls3/z1;

    invoke-direct {v0}, Ls3/z1;-><init>()V

    iget-object v1, p0, Lk3/f$a;->a:Landroid/content/Context;

    new-instance v2, Lk3/f;

    invoke-virtual {v0}, Ls3/z1;->p6()Ls3/N;

    move-result-object v0

    sget-object v3, Ls3/b2;->a:Ls3/b2;

    invoke-direct {v2, v1, v0, v3}, Lk3/f;-><init>(Landroid/content/Context;Ls3/N;Ls3/b2;)V

    return-object v2
.end method

.method public b(Lcom/google/android/gms/ads/nativead/NativeAd$c;)Lk3/f$a;
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lk3/f$a;->b:Ls3/Q;

    new-instance v1, Lcom/google/android/gms/internal/ads/Bn;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/Bn;-><init>(Lcom/google/android/gms/ads/nativead/NativeAd$c;)V

    invoke-interface {v0, v1}, Ls3/Q;->U5(Lcom/google/android/gms/internal/ads/ci;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to add google native ad listener"

    invoke-static {v0, p1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method

.method public c(Lk3/d;)Lk3/f$a;
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lk3/f$a;->b:Ls3/Q;

    new-instance v1, Ls3/P1;

    invoke-direct {v1, p1}, Ls3/P1;-><init>(Lk3/d;)V

    invoke-interface {v0, v1}, Ls3/Q;->A4(Ls3/H;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to set AdListener."

    invoke-static {v0, p1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method

.method public d(Lcom/google/android/gms/ads/nativead/c;)Lk3/f$a;
    .locals 14

    .prologue
    :try_start_0
    iget-object v0, p0, Lk3/f$a;->b:Ls3/Q;

    new-instance v13, Lcom/google/android/gms/internal/ads/dh;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->e()Z

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->d()Z

    move-result v5

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->a()I

    move-result v6

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->c()Lk3/x;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Ls3/Q1;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->c()Lk3/x;

    move-result-object v2

    invoke-direct {v1, v2}, Ls3/Q1;-><init>(Lk3/x;)V

    :goto_0
    move-object v7, v1

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->h()Z

    move-result v8

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->b()I

    move-result v9

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->f()I

    move-result v10

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->g()Z

    move-result v11

    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/c;->i()I

    move-result p1

    add-int/lit8 v12, p1, -0x1

    const/4 v2, 0x4

    const/4 v4, -0x1

    move-object v1, v13

    invoke-direct/range {v1 .. v12}, Lcom/google/android/gms/internal/ads/dh;-><init>(IZIZILs3/Q1;ZIIZI)V

    invoke-interface {v0, v13}, Ls3/Q;->U4(Lcom/google/android/gms/internal/ads/dh;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    const-string v0, "Failed to specify native ad options"

    invoke-static {v0, p1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    return-object p0
.end method

.method public final e(Ljava/lang/String;Ln3/m;Ln3/l;)Lk3/f$a;
    .locals 1

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/ads/si;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/ads/si;-><init>(Ln3/m;Ln3/l;)V

    :try_start_0
    iget-object p2, p0, Lk3/f$a;->b:Ls3/Q;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/si;->d()Lcom/google/android/gms/internal/ads/Vh;

    move-result-object p3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/si;->c()Lcom/google/android/gms/internal/ads/Sh;

    move-result-object v0

    invoke-interface {p2, p1, p3, v0}, Ls3/Q;->l3(Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vh;Lcom/google/android/gms/internal/ads/Sh;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Failed to add custom template ad listener"

    invoke-static {p2, p1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method

.method public final f(Ln3/o;)Lk3/f$a;
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lk3/f$a;->b:Ls3/Q;

    new-instance v1, Lcom/google/android/gms/internal/ads/ti;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/ti;-><init>(Ln3/o;)V

    invoke-interface {v0, v1}, Ls3/Q;->U5(Lcom/google/android/gms/internal/ads/ci;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to add google native ad listener"

    invoke-static {v0, p1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method

.method public final g(Ln3/e;)Lk3/f$a;
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lk3/f$a;->b:Ls3/Q;

    new-instance v1, Lcom/google/android/gms/internal/ads/dh;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/dh;-><init>(Ln3/e;)V

    invoke-interface {v0, v1}, Ls3/Q;->U4(Lcom/google/android/gms/internal/ads/dh;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to specify native ad options"

    invoke-static {v0, p1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method
