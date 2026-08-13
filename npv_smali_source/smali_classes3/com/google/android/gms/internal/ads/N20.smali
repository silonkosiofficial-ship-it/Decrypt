.class public final synthetic Lcom/google/android/gms/internal/ads/N20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Z

.field public final synthetic d:Landroid/os/Bundle;

.field public final synthetic e:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/Object;ZLandroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/N20;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/N20;->b:Ljava/lang/Object;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/N20;->c:Z

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/N20;->d:Landroid/os/Bundle;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/N20;->e:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/N20;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/N20;->b:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LP4/d;

    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/K20;

    if-eqz v2, :cond_0

    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/N20;->c:Z

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/K20;->c(Ljava/lang/Object;)V

    if-eqz v3, :cond_0

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/K20;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->k2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/N20;->d:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/N20;->e:Landroid/os/Bundle;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v3

    invoke-interface {v3}, LV3/f;->a()J

    move-result-wide v3

    instance-of v5, v1, Lcom/google/android/gms/internal/ads/fC;

    if-eqz v5, :cond_2

    sget-object v5, Lcom/google/android/gms/internal/ads/MN;->I:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v3, "client_sig_latency_key"

    :goto_1
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_2

    :cond_2
    sget-object v5, Lcom/google/android/gms/internal/ads/MN;->L:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v3, "gms_sig_latency_key"

    goto :goto_1

    :cond_3
    :goto_2
    return-object v1
.end method
