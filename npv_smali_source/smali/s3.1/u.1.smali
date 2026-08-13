.class final Ls3/u;
.super Ls3/x;
.source "SourceFile"


# instance fields
.field final synthetic b:Landroid/widget/FrameLayout;

.field final synthetic c:Landroid/widget/FrameLayout;

.field final synthetic d:Landroid/content/Context;

.field final synthetic e:Ls3/w;


# direct methods
.method constructor <init>(Ls3/w;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/content/Context;)V
    .locals 0

    iput-object p2, p0, Ls3/u;->b:Landroid/widget/FrameLayout;

    iput-object p3, p0, Ls3/u;->c:Landroid/widget/FrameLayout;

    iput-object p4, p0, Ls3/u;->d:Landroid/content/Context;

    iput-object p1, p0, Ls3/u;->e:Ls3/w;

    invoke-direct {p0}, Ls3/x;-><init>()V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ls3/u;->d:Landroid/content/Context;

    const-string v1, "native_ad_view_delegate"

    invoke-static {v0, v1}, Ls3/w;->q(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Ls3/E1;

    invoke-direct {v0}, Ls3/E1;-><init>()V

    return-object v0
.end method

.method public final bridge synthetic b(Ls3/l0;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ls3/u;->c:Landroid/widget/FrameLayout;

    iget-object v1, p0, Ls3/u;->b:Landroid/widget/FrameLayout;

    invoke-static {v1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v1

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ls3/l0;->J4(LX3/a;LX3/a;)Lcom/google/android/gms/internal/ads/th;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 6

    .prologue
    iget-object v0, p0, Ls3/u;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Af;->a(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Ba:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Ls3/u;->d:Landroid/content/Context;

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v0

    iget-object v1, p0, Ls3/u;->b:Landroid/widget/FrameLayout;

    invoke-static {v1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v1

    iget-object v2, p0, Ls3/u;->c:Landroid/widget/FrameLayout;

    invoke-static {v2}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v2

    iget-object v3, p0, Ls3/u;->d:Landroid/content/Context;

    const-string v4, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl"

    new-instance v5, Ls3/t;

    invoke-direct {v5}, Ls3/t;-><init>()V

    invoke-static {v3, v4, v5}, Lw3/t;->b(Landroid/content/Context;Ljava/lang/String;Lw3/r;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/wh;

    const v4, 0xe916690

    invoke-interface {v3, v0, v1, v2, v4}, Lcom/google/android/gms/internal/ads/wh;->i4(LX3/a;LX3/a;LX3/a;I)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/rh;->o6(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/th;

    move-result-object v0
    :try_end_0
    .catch Lw3/s; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    iget-object v1, p0, Ls3/u;->e:Ls3/w;

    iget-object v2, p0, Ls3/u;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/lo;->c(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/no;

    move-result-object v2

    invoke-static {v1, v2}, Ls3/w;->p(Ls3/w;Lcom/google/android/gms/internal/ads/no;)V

    iget-object v1, p0, Ls3/u;->e:Ls3/w;

    invoke-static {v1}, Ls3/w;->m(Ls3/w;)Lcom/google/android/gms/internal/ads/no;

    move-result-object v1

    const-string v2, "ClientApiBroker.createNativeAdViewDelegate"

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/no;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ls3/u;->e:Ls3/w;

    iget-object v1, p0, Ls3/u;->d:Landroid/content/Context;

    iget-object v2, p0, Ls3/u;->b:Landroid/widget/FrameLayout;

    iget-object v3, p0, Ls3/u;->c:Landroid/widget/FrameLayout;

    invoke-static {v0}, Ls3/w;->i(Ls3/w;)Lcom/google/android/gms/internal/ads/mi;

    move-result-object v0

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/mi;->c(Landroid/content/Context;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)Lcom/google/android/gms/internal/ads/th;

    move-result-object v0

    :goto_1
    return-object v0
.end method
