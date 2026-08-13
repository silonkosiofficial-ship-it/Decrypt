.class public final Lcom/google/android/gms/internal/ads/rQ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/eE;
.implements Lcom/google/android/gms/internal/ads/ZG;


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Lcom/google/android/gms/internal/ads/eO;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/eO;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rQ;->C:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/rQ;->D:Lcom/google/android/gms/internal/ads/eO;

    return-void
.end method

.method private final c(Landroid/content/Context;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->G4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/pQ;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/pQ;-><init>(Lcom/google/android/gms/internal/ads/rQ;Landroid/content/Context;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final B(Lcom/google/android/gms/internal/ads/Po;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/rQ;->C:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/rQ;->c(Landroid/content/Context;)V

    return-void
.end method

.method public final G(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final a(LB3/N;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/rQ;->C:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/rQ;->c(Landroid/content/Context;)V

    return-void
.end method

.method final synthetic b(Landroid/content/Context;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rQ;->D:Lcom/google/android/gms/internal/ads/eO;

    invoke-static {}, Lr3/v;->i()Lcom/google/android/gms/internal/ads/ag;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/ag;->d(Landroid/content/Context;Lcom/google/android/gms/internal/ads/eO;)V

    return-void
.end method

.method public final w0(Lcom/google/android/gms/internal/ads/e70;)V
    .locals 0

    return-void
.end method
