.class final Lcom/google/android/gms/internal/ads/sv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Yw0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rv0;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/rv0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "output"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/Tv0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    iput-object p0, p1, Lcom/google/android/gms/internal/ads/rv0;->a:Lcom/google/android/gms/internal/ads/sv0;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/rv0;)Lcom/google/android/gms/internal/ads/sv0;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rv0;->a:Lcom/google/android/gms/internal/ads/sv0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/sv0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/sv0;-><init>(Lcom/google/android/gms/internal/ads/rv0;)V

    return-object v0
.end method


# virtual methods
.method public final A(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/rv0;->o(II)V

    return-void
.end method

.method public final B(ILjava/util/List;Z)V
    .locals 6

    .prologue
    instance-of v0, p2, Lcom/google/android/gms/internal/ads/bw0;

    const/4 v1, 0x2

    const/16 v2, 0x3f

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/ads/bw0;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v3

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bw0;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/bw0;->e(I)J

    move-result-wide v0

    add-long v4, v0, v0

    shr-long/2addr v0, v2

    xor-long/2addr v0, v4

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->f(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bw0;->size()I

    move-result p1

    if-ge v3, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ads/bw0;->e(I)J

    move-result-wide v0

    add-long v4, v0, v0

    shr-long/2addr v0, v2

    xor-long/2addr v0, v4

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->A(J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bw0;->size()I

    move-result p3

    if-ge v3, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ads/bw0;->e(I)J

    move-result-wide v0

    add-long v4, v0, v0

    shr-long/2addr v0, v2

    xor-long/2addr v0, v4

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->z(IJ)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v3

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    add-long v4, v0, v0

    shr-long/2addr v0, v2

    xor-long/2addr v0, v4

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->f(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v3, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    add-long v4, v0, v0

    shr-long/2addr v0, v2

    xor-long/2addr v0, v4

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->A(J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v3, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    add-long v4, v0, v0

    shr-long/2addr v0, v2

    xor-long/2addr v0, v4

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->z(IJ)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final C(ILjava/util/List;Z)V
    .locals 2

    .prologue
    instance-of v0, p2, Lcom/google/android/gms/internal/ads/Cv0;

    const/4 v1, 0x2

    if-eqz v0, :cond_1

    invoke-static {p2}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p2, 0x0

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    throw p2

    :cond_0
    throw p2

    :cond_1
    const/4 v0, 0x0

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_2

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    add-int/lit8 p3, p3, 0x4

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->p(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->o(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public final D(II)V
    .locals 1

    add-int v0, p2, p2

    shr-int/lit8 p2, p2, 0x1f

    xor-int/2addr p2, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/rv0;->x(II)V

    return-void
.end method

.method public final E(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/rv0;->q(IJ)V

    return-void
.end method

.method public final F(ILjava/util/List;)V
    .locals 4

    .prologue
    instance-of v0, p2, Lcom/google/android/gms/internal/ads/Yv0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p2

    check-cast v0, Lcom/google/android/gms/internal/ads/Yv0;

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Yv0;->c()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, p1, v2}, Lcom/google/android/gms/internal/ads/rv0;->v(ILjava/lang/String;)V

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    check-cast v2, Lcom/google/android/gms/internal/ads/fv0;

    invoke-virtual {v3, p1, v2}, Lcom/google/android/gms/internal/ads/rv0;->m(ILcom/google/android/gms/internal/ads/fv0;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/internal/ads/rv0;->v(ILjava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final G(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/rv0;->z(IJ)V

    return-void
.end method

.method public final H(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    return-void
.end method

.method public final I(ILjava/lang/Object;Lcom/google/android/gms/internal/ads/Ew0;)V
    .locals 1

    check-cast p2, Lcom/google/android/gms/internal/ads/mw0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/rv0;->u(ILcom/google/android/gms/internal/ads/mw0;Lcom/google/android/gms/internal/ads/Ew0;)V

    return-void
.end method

.method public final J(ILcom/google/android/gms/internal/ads/fv0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/rv0;->m(ILcom/google/android/gms/internal/ads/fv0;)V

    return-void
.end method

.method public final K(ILjava/lang/Object;Lcom/google/android/gms/internal/ads/Ew0;)V
    .locals 2

    check-cast p2, Lcom/google/android/gms/internal/ads/mw0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/rv0;->a:Lcom/google/android/gms/internal/ads/sv0;

    invoke-interface {p3, p2, v1}, Lcom/google/android/gms/internal/ads/Ew0;->g(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/Yw0;)V

    const/4 p2, 0x4

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    return-void
.end method

.method public final L(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    const/4 v1, 0x4

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    return-void
.end method

.method public final b(ILjava/util/List;Z)V
    .locals 2

    .prologue
    instance-of v0, p2, Lcom/google/android/gms/internal/ads/Uu0;

    const/4 v1, 0x2

    if-eqz v0, :cond_1

    invoke-static {p2}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p2, 0x0

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    throw p2

    :cond_0
    throw p2

    :cond_1
    const/4 v0, 0x0

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_2

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    add-int/lit8 p3, p3, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->k(B)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->l(IZ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public final c(ILjava/util/List;Z)V
    .locals 3

    .prologue
    instance-of v0, p2, Lcom/google/android/gms/internal/ads/Kv0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/ads/Kv0;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    add-int/lit8 p3, p3, 0x4

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->p(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/ads/rv0;->o(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    add-int/lit8 p3, p3, 0x4

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->p(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/ads/rv0;->o(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final d(ILjava/util/List;Z)V
    .locals 3

    .prologue
    instance-of v0, p2, Lcom/google/android/gms/internal/ads/Kv0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/ads/Kv0;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->f(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->t(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/ads/rv0;->s(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->f(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->t(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/ads/rv0;->s(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final f(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/rv0;->s(II)V

    return-void
.end method

.method public final g(ILjava/util/List;Z)V
    .locals 3

    .prologue
    instance-of v0, p2, Lcom/google/android/gms/internal/ads/bw0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/ads/bw0;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bw0;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/bw0;->e(I)J

    add-int/lit8 p3, p3, 0x8

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bw0;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/bw0;->e(I)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->r(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bw0;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/bw0;->e(I)J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->q(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    add-int/lit8 p3, p3, 0x8

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->r(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->q(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final h(ILjava/util/List;Z)V
    .locals 3

    .prologue
    instance-of v0, p2, Lcom/google/android/gms/internal/ads/tv0;

    const/4 v1, 0x2

    if-eqz v0, :cond_1

    invoke-static {p2}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p2, 0x0

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    throw p2

    :cond_0
    throw p2

    :cond_1
    const/4 v0, 0x0

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_2

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    add-int/lit8 p3, p3, 0x8

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/rv0;->r(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Lcom/google/android/gms/internal/ads/rv0;->q(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public final i(ILjava/util/List;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/fv0;

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/ads/rv0;->m(ILcom/google/android/gms/internal/ads/fv0;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final j(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/rv0;->v(ILjava/lang/String;)V

    return-void
.end method

.method public final k(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/rv0;->x(II)V

    return-void
.end method

.method public final l(ILjava/util/List;Z)V
    .locals 3

    .prologue
    instance-of v0, p2, Lcom/google/android/gms/internal/ads/Kv0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/ads/Kv0;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    add-int/lit8 p3, p3, 0x4

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->p(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/ads/rv0;->o(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    add-int/lit8 p3, p3, 0x4

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->p(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/ads/rv0;->o(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final m(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/rv0;->o(II)V

    return-void
.end method

.method public final n(IZ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/rv0;->l(IZ)V

    return-void
.end method

.method public final o(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/rv0;->z(IJ)V

    return-void
.end method

.method public final p(ILjava/util/List;Z)V
    .locals 3

    .prologue
    instance-of v0, p2, Lcom/google/android/gms/internal/ads/Kv0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/ads/Kv0;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/rv0;->e(I)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/ads/rv0;->x(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/rv0;->e(I)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/ads/rv0;->x(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final q(ILjava/util/List;Z)V
    .locals 3

    .prologue
    instance-of v0, p2, Lcom/google/android/gms/internal/ads/bw0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/ads/bw0;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bw0;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/bw0;->e(I)J

    add-int/lit8 p3, p3, 0x8

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bw0;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/bw0;->e(I)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->r(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bw0;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/bw0;->e(I)J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->q(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    add-int/lit8 p3, p3, 0x8

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->r(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->q(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final r(ILjava/util/List;Z)V
    .locals 3

    .prologue
    instance-of v0, p2, Lcom/google/android/gms/internal/ads/Kv0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/ads/Kv0;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->f(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->t(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/ads/rv0;->s(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->f(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->t(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/ads/rv0;->s(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final s(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/rv0;->q(IJ)V

    return-void
.end method

.method public final t(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/rv0;->s(II)V

    return-void
.end method

.method public final u(ILjava/util/List;Z)V
    .locals 3

    .prologue
    instance-of v0, p2, Lcom/google/android/gms/internal/ads/Kv0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/ads/Kv0;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    move-result v0

    add-int v1, v0, v0

    shr-int/lit8 v0, v0, 0x1f

    xor-int/2addr v0, v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/rv0;->e(I)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    move-result p3

    add-int v0, p3, p3

    shr-int/lit8 p3, p3, 0x1f

    xor-int/2addr p3, v0

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Kv0;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/Kv0;->e(I)I

    move-result v0

    add-int v1, v0, v0

    shr-int/lit8 v0, v0, 0x1f

    xor-int/2addr v0, v1

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/ads/rv0;->x(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int v1, v0, v0

    shr-int/lit8 v0, v0, 0x1f

    xor-int/2addr v0, v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/rv0;->e(I)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    add-int v0, p3, p3

    shr-int/lit8 p3, p3, 0x1f

    xor-int/2addr p3, v0

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int v1, v0, v0

    shr-int/lit8 v0, v0, 0x1f

    xor-int/2addr v0, v1

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/ads/rv0;->x(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final v(ID)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p2

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/rv0;->q(IJ)V

    return-void
.end method

.method public final w(IJ)V
    .locals 3

    add-long v0, p2, p2

    const/16 v2, 0x3f

    shr-long/2addr p2, v2

    xor-long/2addr p2, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/rv0;->z(IJ)V

    return-void
.end method

.method public final x(ILjava/util/List;Z)V
    .locals 3

    .prologue
    instance-of v0, p2, Lcom/google/android/gms/internal/ads/bw0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/ads/bw0;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bw0;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/bw0;->e(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->f(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bw0;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/bw0;->e(I)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->A(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bw0;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/bw0;->e(I)J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->z(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->f(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->A(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->z(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final y(IF)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/rv0;->o(II)V

    return-void
.end method

.method public final z(ILjava/util/List;Z)V
    .locals 3

    .prologue
    instance-of v0, p2, Lcom/google/android/gms/internal/ads/bw0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/ads/bw0;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bw0;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/bw0;->e(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->f(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bw0;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/bw0;->e(I)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->A(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/bw0;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/bw0;->e(I)J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->z(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/ads/rv0;->w(II)V

    move p1, v2

    move p3, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->f(J)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/rv0;->y(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->A(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sv0;->a:Lcom/google/android/gms/internal/ads/rv0;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/ads/rv0;->z(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method
