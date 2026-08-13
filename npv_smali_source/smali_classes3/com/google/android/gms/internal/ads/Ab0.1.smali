.class public final Lcom/google/android/gms/internal/ads/Ab0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method final a(Landroid/content/Context;)V
    .locals 1

    .prologue
    const-string v0, "Application Context cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/xc0;->c(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/Ab0;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/Ab0;->a:Z

    invoke-static {}, Lcom/google/android/gms/internal/ads/ec0;->c()Lcom/google/android/gms/internal/ads/ec0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ec0;->d(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Vb0;->i()Lcom/google/android/gms/internal/ads/Vb0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Yb0;->d(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/sc0;->b(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/tc0;->d(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/wc0;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/bc0;->b()Lcom/google/android/gms/internal/ads/bc0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/bc0;->c(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ub0;->b()Lcom/google/android/gms/internal/ads/Ub0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Ub0;->d(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/gc0;->a()Lcom/google/android/gms/internal/ads/gc0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/gc0;->e(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method final b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/Ab0;->a:Z

    return v0
.end method
