.class final Lcom/google/android/gms/internal/ads/cS;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/Po;

.field final synthetic b:Lcom/google/android/gms/internal/ads/Ho;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gS;Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/Ho;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/cS;->a:Lcom/google/android/gms/internal/ads/Po;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/cS;->b:Lcom/google/android/gms/internal/ads/Ho;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cS;->b:Lcom/google/android/gms/internal/ads/Ho;

    invoke-static {p1}, Lv3/D;->f(Ljava/lang/Throwable;)Lv3/D;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/Ho;->C3(Lv3/D;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Service can\'t call client"

    invoke-static {v0, p1}, Lv3/q0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 4

    .prologue
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->k2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->l2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cS;->a:Lcom/google/android/gms/internal/ads/Po;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Po;->O:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/ads/MN;->T:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v2

    invoke-interface {v2}, LV3/f;->a()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cS;->b:Lcom/google/android/gms/internal/ads/Ho;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cS;->a:Lcom/google/android/gms/internal/ads/Po;

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/Ho;->C5(Landroid/os/ParcelFileDescriptor;Lcom/google/android/gms/internal/ads/Po;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cS;->b:Lcom/google/android/gms/internal/ads/Ho;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/Ho;->H3(Landroid/os/ParcelFileDescriptor;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    const-string v0, "Service can\'t call client"

    invoke-static {v0, p1}, Lv3/q0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
