.class public final synthetic Lcom/google/android/gms/internal/ads/pd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/ud;

.field public final synthetic D:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ud;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pd;->C:Lcom/google/android/gms/internal/ads/ud;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/pd;->D:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->W4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pd;->C:Lcom/google/android/gms/internal/ads/ud;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/pd;->D:Landroid/content/Context;

    if-eqz v0, :cond_0

    :try_start_0
    const-string v0, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"

    new-instance v3, Lcom/google/android/gms/internal/ads/qd;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/qd;-><init>()V

    invoke-static {v2, v0, v3}, Lw3/t;->b(Landroid/content/Context;Ljava/lang/String;Lw3/r;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Ib;

    iput-object v0, v1, Lcom/google/android/gms/internal/ads/ud;->a:Lcom/google/android/gms/internal/ads/Ib;

    invoke-static {v2}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/ud;->a:Lcom/google/android/gms/internal/ads/Ib;

    const-string v3, "GMA_SDK"

    invoke-interface {v2, v0, v3}, Lcom/google/android/gms/internal/ads/Ib;->a5(LX3/a;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, v1, Lcom/google/android/gms/internal/ads/ud;->b:Z
    :try_end_0
    .catch Lw3/s; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v0, "Cannot dynamite load clearcut"

    invoke-static {v0}, Lw3/p;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
