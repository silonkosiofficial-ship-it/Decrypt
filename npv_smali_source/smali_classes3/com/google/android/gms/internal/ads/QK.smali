.class final Lcom/google/android/gms/internal/ads/QK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/mr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/RK;Lcom/google/android/gms/internal/ads/mr;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/QK;->a:Lcom/google/android/gms/internal/ads/mr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "Failed to load media data due to video view load failure."

    invoke-static {v0}, Lw3/p;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/QK;->a:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 3

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/Ot;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/QK;->a:Lcom/google/android/gms/internal/ads/mr;

    new-instance v1, Lcom/google/android/gms/internal/ads/Es;

    new-instance v2, Lcom/google/android/gms/internal/ads/PK;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/PK;-><init>(Lcom/google/android/gms/internal/ads/mr;)V

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/Es;-><init>(Ljava/util/function/Consumer;)V

    const-string v0, "/video"

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->f0()V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/QK;->a:Lcom/google/android/gms/internal/ads/mr;

    new-instance v0, Lcom/google/android/gms/internal/ads/XV;

    const/4 v1, 0x1

    const-string v2, "Missing webview from video view future."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    return-void
.end method
