.class final Ls3/q;
.super Ls3/x;
.source "SourceFile"


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/google/android/gms/internal/ads/Vl;

.field final synthetic e:Ls3/w;


# direct methods
.method constructor <init>(Ls3/w;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)V
    .locals 0

    iput-object p2, p0, Ls3/q;->b:Landroid/content/Context;

    iput-object p3, p0, Ls3/q;->c:Ljava/lang/String;

    iput-object p4, p0, Ls3/q;->d:Lcom/google/android/gms/internal/ads/Vl;

    iput-object p1, p0, Ls3/q;->e:Ls3/w;

    invoke-direct {p0}, Ls3/x;-><init>()V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ls3/q;->b:Landroid/content/Context;

    const-string v1, "native_ad"

    invoke-static {v0, v1}, Ls3/w;->q(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Ls3/z1;

    invoke-direct {v0}, Ls3/z1;-><init>()V

    return-object v0
.end method

.method public final bridge synthetic b(Ls3/l0;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ls3/q;->b:Landroid/content/Context;

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v0

    iget-object v1, p0, Ls3/q;->c:Ljava/lang/String;

    iget-object v2, p0, Ls3/q;->d:Lcom/google/android/gms/internal/ads/Vl;

    const v3, 0xe916690

    invoke-interface {p1, v0, v1, v2, v3}, Ls3/l0;->B4(LX3/a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;I)Ls3/Q;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 6

    .prologue
    iget-object v0, p0, Ls3/q;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Af;->a(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Ba:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Ls3/q;->b:Landroid/content/Context;

    invoke-static {v1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v1

    iget-object v2, p0, Ls3/q;->b:Landroid/content/Context;

    const-string v3, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl"

    new-instance v4, Ls3/p;

    invoke-direct {v4}, Ls3/p;-><init>()V

    invoke-static {v2, v3, v4}, Lw3/t;->b(Landroid/content/Context;Ljava/lang/String;Lw3/r;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls3/S;

    iget-object v3, p0, Ls3/q;->c:Ljava/lang/String;

    iget-object v4, p0, Ls3/q;->d:Lcom/google/android/gms/internal/ads/Vl;

    const v5, 0xe916690

    invoke-virtual {v2, v1, v3, v4, v5}, Ls3/S;->d2(LX3/a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;I)Landroid/os/IBinder;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    const-string v2, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"

    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v2

    instance-of v3, v2, Ls3/Q;

    if-eqz v3, :cond_1

    check-cast v2, Ls3/Q;

    :goto_0
    move-object v0, v2

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_1

    :catch_2
    move-exception v1

    goto :goto_1

    :cond_1
    new-instance v2, Ls3/O;

    invoke-direct {v2, v1}, Ls3/O;-><init>(Landroid/os/IBinder;)V
    :try_end_0
    .catch Lw3/s; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_1
    iget-object v2, p0, Ls3/q;->e:Ls3/w;

    iget-object v3, p0, Ls3/q;->b:Landroid/content/Context;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/lo;->c(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/no;

    move-result-object v3

    invoke-static {v2, v3}, Ls3/w;->p(Ls3/w;Lcom/google/android/gms/internal/ads/no;)V

    iget-object v2, p0, Ls3/q;->e:Ls3/w;

    invoke-static {v2}, Ls3/w;->m(Ls3/w;)Lcom/google/android/gms/internal/ads/no;

    move-result-object v2

    const-string v3, "ClientApiBroker.createAdLoaderBuilder"

    invoke-interface {v2, v1, v3}, Lcom/google/android/gms/internal/ads/no;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Ls3/q;->e:Ls3/w;

    iget-object v1, p0, Ls3/q;->b:Landroid/content/Context;

    iget-object v2, p0, Ls3/q;->c:Ljava/lang/String;

    iget-object v3, p0, Ls3/q;->d:Lcom/google/android/gms/internal/ads/Vl;

    invoke-static {v0}, Ls3/w;->a(Ls3/w;)Ls3/T1;

    move-result-object v0

    invoke-virtual {v0, v1, v2, v3}, Ls3/T1;->c(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)Ls3/Q;

    move-result-object v0

    :goto_2
    return-object v0
.end method
