.class final Lcom/google/android/gms/internal/ads/Ym;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly3/d;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/Gm;

.field final synthetic b:Lcom/google/android/gms/internal/ads/bm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gn;Lcom/google/android/gms/internal/ads/Gm;Lcom/google/android/gms/internal/ads/bm;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ym;->a:Lcom/google/android/gms/internal/ads/Gm;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Ym;->b:Lcom/google/android/gms/internal/ads/bm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lk3/b;)V
    .locals 1

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ym;->a:Lcom/google/android/gms/internal/ads/Gm;

    invoke-virtual {p1}, Lk3/b;->d()Ls3/W0;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/Gm;->x(Ls3/W0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, ""

    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
