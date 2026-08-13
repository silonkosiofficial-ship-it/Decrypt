.class public final Ls3/V1;
.super LX3/c;
.source "SourceFile"


# instance fields
.field private c:Lcom/google/android/gms/internal/ads/no;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.AdManagerCreatorImpl"

    invoke-direct {p0, v0}, LX3/c;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 2

    .prologue
    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.client.IAdManagerCreator"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Ls3/W;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, Ls3/W;

    goto :goto_0

    :cond_1
    new-instance v0, Ls3/W;

    invoke-direct {v0, p1}, Ls3/W;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final c(Landroid/content/Context;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;I)Ls3/V;
    .locals 10

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Af;->a(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Ba:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "com.google.android.gms.ads.internal.client.IAdManager"

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-static {p1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v4

    const-string v0, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl"

    new-instance v3, Ls3/U1;

    invoke-direct {v3}, Ls3/U1;-><init>()V

    invoke-static {p1, v0, v3}, Lw3/t;->b(Landroid/content/Context;Ljava/lang/String;Lw3/r;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ls3/W;

    const v8, 0xe916690

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move v9, p5

    invoke-virtual/range {v3 .. v9}, Ls3/W;->d2(LX3/a;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;II)Landroid/os/IBinder;

    move-result-object p2

    if-nez p2, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-interface {p2, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p3

    instance-of p4, p3, Ls3/V;

    if-eqz p4, :cond_1

    check-cast p3, Ls3/V;

    :goto_0
    move-object v2, p3

    goto :goto_3

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    goto :goto_1

    :catch_2
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p3, Ls3/T;

    invoke-direct {p3, p2}, Ls3/T;-><init>(Landroid/os/IBinder;)V
    :try_end_0
    .catch Lw3/s; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/lo;->c(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/no;

    move-result-object p1

    iput-object p1, p0, Ls3/V1;->c:Lcom/google/android/gms/internal/ads/no;

    const-string p3, "AdManagerCreator.newAdManagerByDynamiteLoader"

    invoke-interface {p1, p2, p3}, Lcom/google/android/gms/internal/ads/no;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    const-string p1, "#007 Could not call remote method."

    invoke-static {p1, p2}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_2
    :try_start_1
    invoke-static {p1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v4

    invoke-virtual {p0, p1}, LX3/c;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ls3/W;

    const v8, 0xe916690

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move v9, p5

    invoke-virtual/range {v3 .. v9}, Ls3/W;->d2(LX3/a;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;II)Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p3, p2, Ls3/V;

    if-eqz p3, :cond_4

    check-cast p2, Ls3/V;

    :goto_2
    move-object v2, p2

    goto :goto_3

    :catch_3
    move-exception p1

    goto :goto_4

    :catch_4
    move-exception p1

    goto :goto_4

    :cond_4
    new-instance p2, Ls3/T;

    invoke-direct {p2, p1}, Ls3/T;-><init>(Landroid/os/IBinder;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_4
    .catch LX3/c$a; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_2

    :goto_3
    return-object v2

    :goto_4
    const-string p2, "Could not create remote AdManager."

    invoke-static {p2, p1}, Lw3/p;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v2
.end method
