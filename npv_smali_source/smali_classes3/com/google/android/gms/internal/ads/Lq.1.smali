.class public final Lcom/google/android/gms/internal/ads/Lq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;I)LP4/d;
    .locals 2

    .prologue
    new-instance p2, Lcom/google/android/gms/internal/ads/mr;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/mr;-><init>()V

    invoke-static {}, Ls3/y;->b()Lw3/g;

    invoke-static {p1}, Lw3/g;->v(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Kq;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/Kq;-><init>(Lcom/google/android/gms/internal/ads/Lq;Landroid/content/Context;Lcom/google/android/gms/internal/ads/mr;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-object p2
.end method
