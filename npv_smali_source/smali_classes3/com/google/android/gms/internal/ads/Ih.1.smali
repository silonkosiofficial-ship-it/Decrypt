.class public final Lcom/google/android/gms/internal/ads/Ih;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Hh;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Hh;)V
    .locals 2

    .prologue
    const-string v0, ""

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ih;->a:Lcom/google/android/gms/internal/ads/Hh;

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Hh;->g()LX3/a;

    move-result-object p1

    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_0

    new-instance v1, Ln3/b;

    invoke-direct {v1, p1}, Ln3/b;-><init>(Landroid/content/Context;)V

    :try_start_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Ih;->a:Lcom/google/android/gms/internal/ads/Hh;

    invoke-static {v1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/Hh;->C0(LX3/a;)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2

    return-void

    :catch_2
    move-exception p1

    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/Hh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ih;->a:Lcom/google/android/gms/internal/ads/Hh;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ih;->a:Lcom/google/android/gms/internal/ads/Hh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Hh;->h()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method
