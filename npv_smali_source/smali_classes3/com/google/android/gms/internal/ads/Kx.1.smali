.class final Lcom/google/android/gms/internal/ads/Kx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/La0;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lw3/w;

.field final synthetic d:Lcom/google/android/gms/internal/ads/Lx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Lx;Lcom/google/android/gms/internal/ads/La0;Ljava/lang/String;Lw3/w;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Kx;->a:Lcom/google/android/gms/internal/ads/La0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Kx;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Kx;->c:Lw3/w;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Kx;->d:Lcom/google/android/gms/internal/ads/Lx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Kx;->d:Lcom/google/android/gms/internal/ads/Lx;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Lx;->f(Lcom/google/android/gms/internal/ads/Lx;)Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v0

    new-instance v7, Lcom/google/android/gms/internal/ads/Ix;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/Kx;->a:Lcom/google/android/gms/internal/ads/La0;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/Kx;->b:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/Kx;->c:Lw3/w;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/Ix;-><init>(Lcom/google/android/gms/internal/ads/Kx;Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/La0;Ljava/lang/String;Lw3/w;)V

    invoke-interface {v0, v7}, Lcom/google/android/gms/internal/ads/Yk0;->r(Ljava/lang/Runnable;)LP4/d;

    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Kx;->a:Lcom/google/android/gms/internal/ads/La0;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Kx;->d:Lcom/google/android/gms/internal/ads/Lx;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Lx;->f(Lcom/google/android/gms/internal/ads/Lx;)Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/Jx;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Kx;->c:Lw3/w;

    invoke-direct {v2, v0, p1, v3}, Lcom/google/android/gms/internal/ads/Jx;-><init>(Lcom/google/android/gms/internal/ads/La0;Ljava/lang/String;Lw3/w;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/Yk0;->r(Ljava/lang/Runnable;)LP4/d;

    return-void
.end method
