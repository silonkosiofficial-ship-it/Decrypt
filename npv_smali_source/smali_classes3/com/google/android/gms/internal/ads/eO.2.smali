.class public final Lcom/google/android/gms/internal/ads/eO;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/kO;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/kO;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eO;->a:Lcom/google/android/gms/internal/ads/kO;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/kO;->i()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eO;->c:Ljava/util/Map;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/eO;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/eO;)Lcom/google/android/gms/internal/ads/kO;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/eO;->a:Lcom/google/android/gms/internal/ads/kO;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/eO;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/eO;->c:Ljava/util/Map;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/eO;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/eO;->b:Ljava/util/concurrent/Executor;

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/dO;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/dO;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/dO;-><init>(Lcom/google/android/gms/internal/ads/eO;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/dO;->a(Lcom/google/android/gms/internal/ads/dO;)Lcom/google/android/gms/internal/ads/dO;

    return-object v0
.end method

.method public final e()V
    .locals 3

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->xb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/eO;->a()Lcom/google/android/gms/internal/ads/dO;

    move-result-object v0

    const-string v1, "action"

    const-string v2, "pecr"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dO;->g()V

    return-void
.end method
