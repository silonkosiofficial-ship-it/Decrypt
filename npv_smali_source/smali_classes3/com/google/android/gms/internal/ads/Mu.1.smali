.class public final Lcom/google/android/gms/internal/ads/Mu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field public final b:I

.field public final c:I


# direct methods
.method private constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/Mu;->a:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/Mu;->c:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/Mu;->b:I

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/ads/Mu;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Mu;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Lcom/google/android/gms/internal/ads/Mu;-><init>(III)V

    return-object v0
.end method

.method public static b(II)Lcom/google/android/gms/internal/ads/Mu;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Mu;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Lcom/google/android/gms/internal/ads/Mu;-><init>(III)V

    return-object v0
.end method

.method public static c(Ls3/c2;)Lcom/google/android/gms/internal/ads/Mu;
    .locals 3

    .prologue
    iget-boolean v0, p0, Ls3/c2;->F:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance p0, Lcom/google/android/gms/internal/ads/Mu;

    const/4 v0, 0x3

    invoke-direct {p0, v0, v1, v1}, Lcom/google/android/gms/internal/ads/Mu;-><init>(III)V

    return-object p0

    :cond_0
    iget-boolean v0, p0, Ls3/c2;->K:Z

    if-eqz v0, :cond_1

    new-instance p0, Lcom/google/android/gms/internal/ads/Mu;

    const/4 v0, 0x2

    invoke-direct {p0, v0, v1, v1}, Lcom/google/android/gms/internal/ads/Mu;-><init>(III)V

    return-object p0

    :cond_1
    iget-boolean v0, p0, Ls3/c2;->J:Z

    if-eqz v0, :cond_2

    new-instance p0, Lcom/google/android/gms/internal/ads/Mu;

    invoke-direct {p0, v1, v1, v1}, Lcom/google/android/gms/internal/ads/Mu;-><init>(III)V

    return-object p0

    :cond_2
    iget v0, p0, Ls3/c2;->H:I

    iget p0, p0, Ls3/c2;->E:I

    new-instance v1, Lcom/google/android/gms/internal/ads/Mu;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0, p0}, Lcom/google/android/gms/internal/ads/Mu;-><init>(III)V

    return-object v1
.end method

.method public static d()Lcom/google/android/gms/internal/ads/Mu;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/Mu;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Mu;-><init>(III)V

    return-object v0
.end method

.method public static e()Lcom/google/android/gms/internal/ads/Mu;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/Mu;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Mu;-><init>(III)V

    return-object v0
.end method


# virtual methods
.method public final f()Z
    .locals 1

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/Mu;->a:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g()Z
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/Mu;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/Mu;->a:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final i()Z
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/Mu;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j()Z
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/Mu;->a:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
