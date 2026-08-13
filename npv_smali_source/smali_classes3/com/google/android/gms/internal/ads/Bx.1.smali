.class public final Lcom/google/android/gms/internal/ads/Bx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/aD;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/M70;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/M70;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Bx;->C:Lcom/google/android/gms/internal/ads/M70;

    return-void
.end method


# virtual methods
.method public final g(Landroid/content/Context;)V
    .locals 1

    .prologue
    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Bx;->C:Lcom/google/android/gms/internal/ads/M70;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/M70;->l()V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/u70; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Cannot invoke onDestroy for the mediation adapter."

    invoke-static {v0, p1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final k(Landroid/content/Context;)V
    .locals 1

    .prologue
    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Bx;->C:Lcom/google/android/gms/internal/ads/M70;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/M70;->y()V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/u70; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Cannot invoke onPause for the mediation adapter."

    invoke-static {v0, p1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final r(Landroid/content/Context;)V
    .locals 1

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Bx;->C:Lcom/google/android/gms/internal/ads/M70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/M70;->z()V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Bx;->C:Lcom/google/android/gms/internal/ads/M70;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/M70;->x(Landroid/content/Context;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/u70; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    const-string v0, "Cannot invoke onResume for the mediation adapter."

    invoke-static {v0, p1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
