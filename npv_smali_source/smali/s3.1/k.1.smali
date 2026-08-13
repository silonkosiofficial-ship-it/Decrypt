.class final Ls3/k;
.super Ls3/x;
.source "SourceFile"


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lcom/google/android/gms/internal/ads/Vl;


# direct methods
.method constructor <init>(Ls3/w;Landroid/content/Context;Lcom/google/android/gms/internal/ads/Vl;)V
    .locals 0

    iput-object p2, p0, Ls3/k;->b:Landroid/content/Context;

    iput-object p3, p0, Ls3/k;->c:Lcom/google/android/gms/internal/ads/Vl;

    invoke-direct {p0}, Ls3/x;-><init>()V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final bridge synthetic b(Ls3/l0;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ls3/k;->b:Landroid/content/Context;

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v0

    iget-object v1, p0, Ls3/k;->c:Lcom/google/android/gms/internal/ads/Vl;

    const v2, 0xe916690

    invoke-interface {p1, v0, v1, v2}, Ls3/l0;->Z0(LX3/a;Lcom/google/android/gms/internal/ads/Vl;I)Lcom/google/android/gms/internal/ads/En;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 4

    .prologue
    iget-object v0, p0, Ls3/k;->b:Landroid/content/Context;

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Ls3/k;->b:Landroid/content/Context;

    const-string v2, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl"

    new-instance v3, Ls3/j;

    invoke-direct {v3}, Ls3/j;-><init>()V

    invoke-static {v1, v2, v3}, Lw3/t;->b(Landroid/content/Context;Ljava/lang/String;Lw3/r;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/In;

    iget-object v2, p0, Ls3/k;->c:Lcom/google/android/gms/internal/ads/Vl;

    const v3, 0xe916690

    invoke-interface {v1, v0, v2, v3}, Lcom/google/android/gms/internal/ads/In;->t0(LX3/a;Lcom/google/android/gms/internal/ads/Vl;I)Lcom/google/android/gms/internal/ads/En;

    move-result-object v0
    :try_end_0
    .catch Lw3/s; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
