.class final Lcom/google/android/gms/internal/ads/Vx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/Xx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Xx;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Vx;->a:Lcom/google/android/gms/internal/ads/Xx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 8

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Vx;->a:Lcom/google/android/gms/internal/ads/Xx;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Xx;->o(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/z70;

    move-result-object p1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Xx;->r(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/Fa0;

    move-result-object v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Xx;->k(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/e70;

    move-result-object v2

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Xx;->i(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/R60;

    move-result-object v3

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Xx;->i(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/R60;

    move-result-object v0

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/R60;->c:Ljava/util/List;

    const/4 v4, 0x0

    const-string v5, ""

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/Fa0;->d(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vx;->a:Lcom/google/android/gms/internal/ads/Xx;

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v2

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Xx;->g(Lcom/google/android/gms/internal/ads/Xx;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/Uq;->a(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x1

    if-eq v2, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/ads/z70;->c(Ljava/util/List;I)V

    return-void
.end method
