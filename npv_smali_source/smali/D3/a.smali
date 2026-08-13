.class public LD3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ls3/s1;


# direct methods
.method public constructor <init>(Ls3/s1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD3/a;->a:Ls3/s1;

    return-void
.end method

.method public static a(Landroid/content/Context;Lk3/c;Lk3/g;LD3/b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0, p3}, LD3/a;->c(Landroid/content/Context;Lk3/c;Lk3/g;Ljava/lang/String;LD3/b;)V

    return-void
.end method

.method private static c(Landroid/content/Context;Lk3/c;Lk3/g;Ljava/lang/String;LD3/b;)V
    .locals 8

    .prologue
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Af;->a(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Ag;->j:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->bb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lw3/c;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v7, LD3/c;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, LD3/c;-><init>(Landroid/content/Context;Lk3/c;Lk3/g;Ljava/lang/String;LD3/b;)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/ads/eo;

    if-nez p2, :cond_2

    const/4 p2, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lk3/g;->a()Ls3/f1;

    move-result-object p2

    :goto_1
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/eo;-><init>(Landroid/content/Context;Lk3/c;Ls3/f1;Ljava/lang/String;)V

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ads/eo;->b(LD3/b;)V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LD3/a;->a:Ls3/s1;

    invoke-virtual {v0}, Ls3/s1;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
