.class final LB3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:LP4/d;

.field final synthetic b:Lcom/google/android/gms/internal/ads/Fq;

.field final synthetic c:Lcom/google/android/gms/internal/ads/yq;

.field final synthetic d:Lcom/google/android/gms/internal/ads/E90;

.field final synthetic e:LB3/w;


# direct methods
.method constructor <init>(LB3/w;LP4/d;Lcom/google/android/gms/internal/ads/Fq;Lcom/google/android/gms/internal/ads/yq;Lcom/google/android/gms/internal/ads/E90;)V
    .locals 0

    iput-object p2, p0, LB3/s;->a:LP4/d;

    iput-object p3, p0, LB3/s;->b:Lcom/google/android/gms/internal/ads/Fq;

    iput-object p4, p0, LB3/s;->c:Lcom/google/android/gms/internal/ads/yq;

    iput-object p5, p0, LB3/s;->d:Lcom/google/android/gms/internal/ads/E90;

    iput-object p1, p0, LB3/s;->e:LB3/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->C7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const-string v2, "SignalGeneratorImpl.generateSignals"

    if-eqz v1, :cond_0

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v1

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/ads/Uq;->w(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v1

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_0
    iget-object v1, p0, LB3/s;->a:LP4/d;

    iget-object v2, p0, LB3/s;->b:Lcom/google/android/gms/internal/ads/Fq;

    invoke-static {v1, v2}, LB3/w;->V6(LP4/d;Lcom/google/android/gms/internal/ads/Fq;)Lcom/google/android/gms/internal/ads/Q90;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/vg;->e:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz v1, :cond_1

    iget-object v2, p0, LB3/s;->d:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v2, p1}, Lcom/google/android/gms/internal/ads/E90;->c(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/E90;

    const/4 p1, 0x0

    invoke-interface {v2, p1}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/Q90;->a(Lcom/google/android/gms/internal/ads/E90;)Lcom/google/android/gms/internal/ads/Q90;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Q90;->h()V

    :cond_1
    iget-object p1, p0, LB3/s;->c:Lcom/google/android/gms/internal/ads/yq;

    if-nez p1, :cond_2

    return-void

    :cond_2
    :try_start_0
    const-string p1, "Unknown format is no longer supported."

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Internal error. "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    iget-object p1, p0, LB3/s;->c:Lcom/google/android/gms/internal/ads/yq;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/yq;->y(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, ""

    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 10

    .prologue
    const-string v0, "QueryInfo generation has been disabled."

    iget-object v1, p0, LB3/s;->a:LP4/d;

    check-cast p1, LB3/N;

    iget-object v2, p0, LB3/s;->b:Lcom/google/android/gms/internal/ads/Fq;

    invoke-static {v1, v2}, LB3/w;->V6(LP4/d;Lcom/google/android/gms/internal/ads/Fq;)Lcom/google/android/gms/internal/ads/Q90;

    move-result-object v1

    iget-object v2, p0, LB3/s;->e:LB3/w;

    invoke-static {v2}, LB3/w;->s6(LB3/w;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->x7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_1

    :try_start_0
    iget-object p1, p0, LB3/s;->c:Lcom/google/android/gms/internal/ads/yq;

    if-eqz p1, :cond_0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/yq;->y(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    :cond_0
    :goto_0
    sget-object p1, Lcom/google/android/gms/internal/ads/vg;->e:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_d

    if-eqz v1, :cond_d

    iget-object p1, p0, LB3/s;->d:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/E90;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {p1, v4}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    :goto_1
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/Q90;->a(Lcom/google/android/gms/internal/ads/E90;)Lcom/google/android/gms/internal/ads/Q90;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Q90;->h()V

    return-void

    :cond_1
    const-string v0, "SignalGeneratorImpl.generateSignals.onSuccess"

    const-string v2, ""

    if-nez p1, :cond_3

    :try_start_1
    iget-object p1, p0, LB3/s;->c:Lcom/google/android/gms/internal/ads/yq;

    if-eqz p1, :cond_2

    const/4 v5, 0x0

    invoke-interface {p1, v5, v5, v5}, Lcom/google/android/gms/internal/ads/yq;->M1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_9

    :catch_1
    move-exception p1

    goto/16 :goto_8

    :cond_2
    :goto_2
    iget-object p1, p0, LB3/s;->d:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {p1, v3}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p1, Lcom/google/android/gms/internal/ads/vg;->e:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_d

    if-eqz v1, :cond_d

    :goto_3
    iget-object p1, p0, LB3/s;->d:Lcom/google/android/gms/internal/ads/E90;

    goto :goto_1

    :cond_3
    :try_start_2
    iget-object v5, p1, LB3/N;->c:Ljava/lang/String;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_4

    new-instance v5, Lorg/json/JSONObject;

    iget-object v6, p1, LB3/N;->c:Ljava/lang/String;

    invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :catch_2
    move-exception p1

    goto/16 :goto_7

    :cond_4
    new-instance v5, Lorg/json/JSONObject;

    iget-object v6, p1, LB3/N;->b:Ljava/lang/String;

    invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    :try_start_3
    const-string v6, "request_id"

    invoke-virtual {v5, v6, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_6

    const-string p1, "The request ID is empty in request JSON."

    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    iget-object p1, p0, LB3/s;->c:Lcom/google/android/gms/internal/ads/yq;

    if-eqz p1, :cond_5

    const-string v3, "Internal error: request ID is empty in request JSON."

    invoke-interface {p1, v3}, Lcom/google/android/gms/internal/ads/yq;->y(Ljava/lang/String;)V

    :cond_5
    iget-object p1, p0, LB3/s;->d:Lcom/google/android/gms/internal/ads/E90;

    const-string v3, "Request ID empty"

    invoke-interface {p1, v3}, Lcom/google/android/gms/internal/ads/E90;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {p1, v4}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    sget-object p1, Lcom/google/android/gms/internal/ads/vg;->e:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_d

    if-eqz v1, :cond_d

    goto :goto_3

    :cond_6
    :try_start_4
    iget-object v5, p1, LB3/N;->f:Landroid/os/Bundle;

    iget-object v6, p0, LB3/s;->e:LB3/w;

    invoke-static {v6}, LB3/w;->z6(LB3/w;)Z

    move-result v7

    if-eqz v7, :cond_7

    if-eqz v5, :cond_7

    invoke-static {v6}, LB3/w;->c7(LB3/w;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, -0x1

    invoke-virtual {v5, v6, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    if-ne v6, v7, :cond_7

    iget-object v6, p0, LB3/s;->e:LB3/w;

    invoke-static {v6}, LB3/w;->c7(LB3/w;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6}, LB3/w;->u6(LB3/w;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v6

    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_7
    iget-object v6, p0, LB3/s;->e:LB3/w;

    invoke-static {v6}, LB3/w;->A6(LB3/w;)Z

    move-result v7

    if-eqz v7, :cond_9

    if-eqz v5, :cond_9

    invoke-static {v6}, LB3/w;->p6(LB3/w;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_9

    iget-object v6, p0, LB3/s;->e:LB3/w;

    invoke-static {v6}, LB3/w;->d7(LB3/w;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_8

    iget-object v6, p0, LB3/s;->e:LB3/w;

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    move-result-object v7

    iget-object v8, p0, LB3/s;->e:LB3/w;

    invoke-static {v8}, LB3/w;->P6(LB3/w;)Landroid/content/Context;

    move-result-object v9

    invoke-static {v8}, LB3/w;->S6(LB3/w;)Lw3/a;

    move-result-object v8

    iget-object v8, v8, Lw3/a;->C:Ljava/lang/String;

    invoke-virtual {v7, v9, v8}, Lv3/E0;->H(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, LB3/w;->v6(LB3/w;Ljava/lang/String;)V

    :cond_8
    iget-object v6, p0, LB3/s;->e:LB3/w;

    invoke-static {v6}, LB3/w;->p6(LB3/w;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6}, LB3/w;->d7(LB3/w;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    iget-object v6, p0, LB3/s;->c:Lcom/google/android/gms/internal/ads/yq;

    if-eqz v6, :cond_b

    iget-object v6, p1, LB3/N;->c:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_a

    iget-object v6, p0, LB3/s;->c:Lcom/google/android/gms/internal/ads/yq;

    iget-object v7, p1, LB3/N;->a:Ljava/lang/String;

    iget-object p1, p1, LB3/N;->c:Ljava/lang/String;

    :goto_5
    invoke-interface {v6, v7, p1, v5}, Lcom/google/android/gms/internal/ads/yq;->M1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_6

    :cond_a
    iget-object v6, p0, LB3/s;->c:Lcom/google/android/gms/internal/ads/yq;

    iget-object v7, p1, LB3/N;->a:Ljava/lang/String;

    iget-object p1, p1, LB3/N;->b:Ljava/lang/String;

    goto :goto_5

    :cond_b
    :goto_6
    iget-object p1, p0, LB3/s;->d:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {p1, v3}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    sget-object p1, Lcom/google/android/gms/internal/ads/vg;->e:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_d

    if-eqz v1, :cond_d

    goto/16 :goto_3

    :goto_7
    :try_start_5
    const-string v3, "Failed to create JSON object from the request string."

    invoke-static {v3}, Lw3/p;->g(Ljava/lang/String;)V

    iget-object v3, p0, LB3/s;->c:Lcom/google/android/gms/internal/ads/yq;

    if-eqz v3, :cond_c

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Internal error for request JSON: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Lcom/google/android/gms/internal/ads/yq;->y(Ljava/lang/String;)V

    :cond_c
    iget-object v3, p0, LB3/s;->d:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/ads/E90;->c(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v3

    invoke-virtual {v3, p1, v0}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    sget-object p1, Lcom/google/android/gms/internal/ads/vg;->e:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_d

    if-eqz v1, :cond_d

    goto/16 :goto_3

    :goto_8
    :try_start_6
    iget-object v3, p0, LB3/s;->d:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/ads/E90;->c(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-static {v2, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v2

    invoke-virtual {v2, p1, v0}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    sget-object p1, Lcom/google/android/gms/internal/ads/vg;->e:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_d

    if-eqz v1, :cond_d

    goto/16 :goto_3

    :cond_d
    return-void

    :goto_9
    sget-object v0, Lcom/google/android/gms/internal/ads/vg;->e:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_e

    if-eqz v1, :cond_e

    iget-object v0, p0, LB3/s;->d:Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/Q90;->a(Lcom/google/android/gms/internal/ads/E90;)Lcom/google/android/gms/internal/ads/Q90;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Q90;->h()V

    :cond_e
    throw p1
.end method
