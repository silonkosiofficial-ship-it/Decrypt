.class public final Lcom/google/android/gms/internal/ads/nZ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lcom/google/android/gms/internal/ads/Uq;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/Uq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nZ;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/nZ;->b:Lcom/google/android/gms/internal/ads/Uq;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0xa

    return v0
.end method

.method public final b()LP4/d;
    .locals 3

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->W2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/oZ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/oZ;-><init>(Ljava/util/ArrayList;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nZ;->b:Lcom/google/android/gms/internal/ads/Uq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Uq;->l()LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/mZ;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/mZ;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/nZ;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->m(LP4/d;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    return-object v0
.end method
