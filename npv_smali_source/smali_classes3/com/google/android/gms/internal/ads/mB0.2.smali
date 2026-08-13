.class final Lcom/google/android/gms/internal/ads/mB0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/WH0;
.implements Lcom/google/android/gms/internal/ads/TF0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/oB0;

.field final synthetic b:Lcom/google/android/gms/internal/ads/rB0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rB0;Lcom/google/android/gms/internal/ads/oB0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/mB0;->b:Lcom/google/android/gms/internal/ads/rB0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/mB0;->a:Lcom/google/android/gms/internal/ads/oB0;

    return-void
.end method

.method private final a(ILcom/google/android/gms/internal/ads/LH0;)Landroid/util/Pair;
    .locals 6

    .prologue
    const/4 p1, 0x0

    if-eqz p2, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mB0;->a:Lcom/google/android/gms/internal/ads/oB0;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/oB0;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/oB0;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/LH0;

    iget-wide v2, v2, Lcom/google/android/gms/internal/ads/LH0;->d:J

    iget-wide v4, p2, Lcom/google/android/gms/internal/ads/LH0;->d:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/oB0;->b:Ljava/lang/Object;

    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/LH0;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/LH0;

    move-result-object p2

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move-object p2, p1

    :goto_1
    if-nez p2, :cond_2

    return-object p1

    :cond_2
    move-object p1, p2

    :cond_3
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/mB0;->a:Lcom/google/android/gms/internal/ads/oB0;

    iget p2, p2, Lcom/google/android/gms/internal/ads/oB0;->d:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final B(ILcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/HH0;)V
    .locals 1

    .prologue
    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/mB0;->a(ILcom/google/android/gms/internal/ads/LH0;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/mB0;->b:Lcom/google/android/gms/internal/ads/rB0;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/rB0;->d(Lcom/google/android/gms/internal/ads/rB0;)Lcom/google/android/gms/internal/ads/xI;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/kB0;

    invoke-direct {v0, p0, p1, p3}, Lcom/google/android/gms/internal/ads/kB0;-><init>(Lcom/google/android/gms/internal/ads/mB0;Landroid/util/Pair;Lcom/google/android/gms/internal/ads/HH0;)V

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/xI;->n(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final F(ILcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;Ljava/io/IOException;Z)V
    .locals 7

    .prologue
    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/mB0;->a(ILcom/google/android/gms/internal/ads/LH0;)Landroid/util/Pair;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/mB0;->b:Lcom/google/android/gms/internal/ads/rB0;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/rB0;->d(Lcom/google/android/gms/internal/ads/rB0;)Lcom/google/android/gms/internal/ads/xI;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/hB0;

    move-object v0, p2

    move-object v1, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/hB0;-><init>(Lcom/google/android/gms/internal/ads/mB0;Landroid/util/Pair;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;Ljava/io/IOException;Z)V

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/xI;->n(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final i(ILcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V
    .locals 1

    .prologue
    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/mB0;->a(ILcom/google/android/gms/internal/ads/LH0;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/mB0;->b:Lcom/google/android/gms/internal/ads/rB0;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/rB0;->d(Lcom/google/android/gms/internal/ads/rB0;)Lcom/google/android/gms/internal/ads/xI;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/iB0;

    invoke-direct {v0, p0, p1, p3, p4}, Lcom/google/android/gms/internal/ads/iB0;-><init>(Lcom/google/android/gms/internal/ads/mB0;Landroid/util/Pair;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/xI;->n(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final t(ILcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V
    .locals 1

    .prologue
    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/mB0;->a(ILcom/google/android/gms/internal/ads/LH0;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/mB0;->b:Lcom/google/android/gms/internal/ads/rB0;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/rB0;->d(Lcom/google/android/gms/internal/ads/rB0;)Lcom/google/android/gms/internal/ads/xI;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/jB0;

    invoke-direct {v0, p0, p1, p3, p4}, Lcom/google/android/gms/internal/ads/jB0;-><init>(Lcom/google/android/gms/internal/ads/mB0;Landroid/util/Pair;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/xI;->n(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final y(ILcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V
    .locals 1

    .prologue
    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/mB0;->a(ILcom/google/android/gms/internal/ads/LH0;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/mB0;->b:Lcom/google/android/gms/internal/ads/rB0;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/rB0;->d(Lcom/google/android/gms/internal/ads/rB0;)Lcom/google/android/gms/internal/ads/xI;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/lB0;

    invoke-direct {v0, p0, p1, p3, p4}, Lcom/google/android/gms/internal/ads/lB0;-><init>(Lcom/google/android/gms/internal/ads/mB0;Landroid/util/Pair;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;)V

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/xI;->n(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
