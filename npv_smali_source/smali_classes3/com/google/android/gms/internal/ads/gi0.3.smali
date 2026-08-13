.class public final Lcom/google/android/gms/internal/ads/gi0;
.super Lcom/google/android/gms/internal/ads/Vh0;
.source "SourceFile"


# instance fields
.field d:[Ljava/lang/Object;

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/Vh0;-><init>(I)V

    return-void
.end method

.method constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Vh0;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/hi0;->w(I)I

    move-result p1

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gi0;->d:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/Wh0;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/gi0;->g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/gi0;

    return-object p0
.end method

.method public final g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/gi0;
    .locals 5

    .prologue
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gi0;->d:[Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/google/android/gms/internal/ads/Vh0;->b:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/hi0;->w(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gi0;->d:[Ljava/lang/Object;

    array-length v2, v1

    if-gt v0, v2, :cond_2

    array-length v0, v1

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Uh0;->a(I)I

    move-result v2

    :goto_0
    and-int/2addr v2, v0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/gi0;->d:[Ljava/lang/Object;

    aget-object v4, v3, v2

    if-nez v4, :cond_0

    aput-object p1, v3, v2

    iget v0, p0, Lcom/google/android/gms/internal/ads/gi0;->e:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/gi0;->e:I

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/Vh0;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/Vh0;

    goto :goto_1

    :cond_0
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object p0

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/gi0;->d:[Ljava/lang/Object;

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/Vh0;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/Vh0;

    return-object p0
.end method

.method public final varargs h([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/gi0;
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gi0;->d:[Ljava/lang/Object;

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    aget-object v2, p1, v0

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/gi0;->g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/gi0;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, v1}, Lcom/google/android/gms/internal/ads/Vh0;->e([Ljava/lang/Object;I)V

    :cond_1
    return-object p0
.end method

.method public final i(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/gi0;
    .locals 1

    .prologue
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gi0;->d:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/gi0;->g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/gi0;

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/Vh0;->d(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/Wh0;

    :cond_1
    return-object p0
.end method

.method public final j()Lcom/google/android/gms/internal/ads/hi0;
    .locals 9

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/Vh0;->b:I

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/gi0;->d:[Ljava/lang/Object;

    if-eqz v2, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/hi0;->w(I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/gi0;->d:[Ljava/lang/Object;

    array-length v2, v2

    if-ne v0, v2, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Vh0;->b:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Vh0;->a:[Ljava/lang/Object;

    array-length v3, v2

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/ads/hi0;->U(II)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    :cond_0
    move-object v4, v2

    new-instance v0, Lcom/google/android/gms/internal/ads/Vi0;

    iget v5, p0, Lcom/google/android/gms/internal/ads/gi0;->e:I

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/gi0;->d:[Ljava/lang/Object;

    array-length v2, v6

    add-int/lit8 v7, v2, -0x1

    iget v8, p0, Lcom/google/android/gms/internal/ads/Vh0;->b:I

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/Vi0;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/Vh0;->b:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Vh0;->a:[Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/hi0;->E(I[Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/hi0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    iput v2, p0, Lcom/google/android/gms/internal/ads/Vh0;->b:I

    :goto_0
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/Vh0;->c:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/gi0;->d:[Ljava/lang/Object;

    return-object v0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Vh0;->a:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/ads/gj0;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/gj0;-><init>(Ljava/lang/Object;)V

    return-object v1

    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/ads/Vi0;->K:Lcom/google/android/gms/internal/ads/Vi0;

    return-object v0
.end method
