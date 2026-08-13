.class public final Lcom/google/android/gms/internal/ads/nJ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lcom/google/android/gms/internal/ads/Oh;

.field b:Lcom/google/android/gms/internal/ads/Lh;

.field c:Lcom/google/android/gms/internal/ads/ci;

.field d:Lcom/google/android/gms/internal/ads/Zh;

.field e:Lcom/google/android/gms/internal/ads/wk;

.field final f:Lr/Y;

.field final g:Lr/Y;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr/Y;

    invoke-direct {v0}, Lr/Y;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/nJ;->f:Lr/Y;

    new-instance v0, Lr/Y;

    invoke-direct {v0}, Lr/Y;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/nJ;->g:Lr/Y;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/Lh;)Lcom/google/android/gms/internal/ads/nJ;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nJ;->b:Lcom/google/android/gms/internal/ads/Lh;

    return-object p0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/Oh;)Lcom/google/android/gms/internal/ads/nJ;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nJ;->a:Lcom/google/android/gms/internal/ads/Oh;

    return-object p0
.end method

.method public final c(Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vh;Lcom/google/android/gms/internal/ads/Sh;)Lcom/google/android/gms/internal/ads/nJ;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nJ;->f:Lr/Y;

    invoke-virtual {v0, p1, p2}, Lr/Y;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/nJ;->g:Lr/Y;

    invoke-virtual {p2, p1, p3}, Lr/Y;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public final d(Lcom/google/android/gms/internal/ads/wk;)Lcom/google/android/gms/internal/ads/nJ;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nJ;->e:Lcom/google/android/gms/internal/ads/wk;

    return-object p0
.end method

.method public final e(Lcom/google/android/gms/internal/ads/Zh;)Lcom/google/android/gms/internal/ads/nJ;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nJ;->d:Lcom/google/android/gms/internal/ads/Zh;

    return-object p0
.end method

.method public final f(Lcom/google/android/gms/internal/ads/ci;)Lcom/google/android/gms/internal/ads/nJ;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nJ;->c:Lcom/google/android/gms/internal/ads/ci;

    return-object p0
.end method

.method public final g()Lcom/google/android/gms/internal/ads/pJ;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/pJ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/pJ;-><init>(Lcom/google/android/gms/internal/ads/nJ;Lcom/google/android/gms/internal/ads/oJ;)V

    return-object v0
.end method
