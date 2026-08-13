.class public final synthetic Lcom/google/android/gms/internal/ads/gY;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/HC;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/UX;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/wk;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/UX;Lcom/google/android/gms/internal/ads/wk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gY;->C:Lcom/google/android/gms/internal/ads/UX;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/gY;->D:Lcom/google/android/gms/internal/ads/wk;

    return-void
.end method


# virtual methods
.method public final u0(Ls3/W0;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gY;->C:Lcom/google/android/gms/internal/ads/UX;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/UX;->u0(Ls3/W0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gY;->D:Lcom/google/android/gms/internal/ads/wk;

    const-string v1, "#007 Could not call remote method."

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/wk;->x(Ls3/W0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-static {v1, v2}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    :try_start_1
    iget p1, p1, Ls3/W0;->C:I

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/wk;->F(I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p1

    invoke-static {v1, p1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method
