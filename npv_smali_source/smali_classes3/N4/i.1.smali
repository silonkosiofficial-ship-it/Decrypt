.class LN4/i;
.super Ljava/util/AbstractMap;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN4/i$h;,
        LN4/i$g;,
        LN4/i$d;,
        LN4/i$f;,
        LN4/i$e;
    }
.end annotation


# static fields
.field private static final L:Ljava/lang/Object;


# instance fields
.field private transient C:Ljava/lang/Object;

.field transient D:[I

.field transient E:[Ljava/lang/Object;

.field transient F:[Ljava/lang/Object;

.field private transient G:I

.field private transient H:I

.field private transient I:Ljava/util/Set;

.field private transient J:Ljava/util/Set;

.field private transient K:Ljava/util/Collection;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LN4/i;->L:Ljava/lang/Object;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, LN4/i;->H(I)V

    return-void
.end method

.method private A(I)I
    .locals 1

    invoke-direct {p0}, LN4/i;->O()[I

    move-result-object v0

    aget p1, v0, p1

    return p1
.end method

.method private E()I
    .locals 2

    iget v0, p0, LN4/i;->G:I

    and-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x1

    shl-int v0, v1, v0

    sub-int/2addr v0, v1

    return v0
.end method

.method private G(Ljava/lang/Object;)I
    .locals 6

    .prologue
    invoke-virtual {p0}, LN4/i;->M()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-static {p1}, LN4/m;->c(Ljava/lang/Object;)I

    move-result v0

    invoke-direct {p0}, LN4/i;->E()I

    move-result v2

    invoke-direct {p0}, LN4/i;->Q()Ljava/lang/Object;

    move-result-object v3

    and-int v4, v0, v2

    invoke-static {v3, v4}, LN4/j;->h(Ljava/lang/Object;I)I

    move-result v3

    if-nez v3, :cond_1

    return v1

    :cond_1
    invoke-static {v0, v2}, LN4/j;->b(II)I

    move-result v0

    :cond_2
    add-int/lit8 v3, v3, -0x1

    invoke-direct {p0, v3}, LN4/i;->A(I)I

    move-result v4

    invoke-static {v4, v2}, LN4/j;->b(II)I

    move-result v5

    if-ne v5, v0, :cond_3

    invoke-direct {p0, v3}, LN4/i;->J(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {p1, v5}, LM4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    return v3

    :cond_3
    invoke-static {v4, v2}, LN4/j;->c(II)I

    move-result v3

    if-nez v3, :cond_2

    return v1
.end method

.method private J(I)Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, LN4/i;->P()[Ljava/lang/Object;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method private N(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .prologue
    invoke-virtual {p0}, LN4/i;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LN4/i;->L:Ljava/lang/Object;

    return-object p1

    :cond_0
    invoke-direct {p0}, LN4/i;->E()I

    move-result v7

    invoke-direct {p0}, LN4/i;->Q()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {p0}, LN4/i;->O()[I

    move-result-object v4

    invoke-direct {p0}, LN4/i;->P()[Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v1, 0x0

    move-object v0, p1

    move v2, v7

    invoke-static/range {v0 .. v6}, LN4/j;->f(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    sget-object p1, LN4/i;->L:Ljava/lang/Object;

    return-object p1

    :cond_1
    invoke-direct {p0, p1}, LN4/i;->Z(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p1, v7}, LN4/i;->L(II)V

    iget p1, p0, LN4/i;->H:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LN4/i;->H:I

    invoke-virtual {p0}, LN4/i;->F()V

    return-object v0
.end method

.method private O()[I
    .locals 1

    iget-object v0, p0, LN4/i;->D:[I

    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, [I

    return-object v0
.end method

.method private P()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN4/i;->E:[Ljava/lang/Object;

    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    return-object v0
.end method

.method private Q()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN4/i;->C:Ljava/lang/Object;

    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private R()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN4/i;->F:[Ljava/lang/Object;

    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    return-object v0
.end method

.method private T(I)V
    .locals 2

    .prologue
    invoke-direct {p0}, LN4/i;->O()[I

    move-result-object v0

    array-length v0, v0

    if-le p1, v0, :cond_0

    ushr-int/lit8 p1, v0, 0x1

    const/4 v1, 0x1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/2addr p1, v0

    or-int/2addr p1, v1

    const v1, 0x3fffffff    # 1.9999999f

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-eq p1, v0, :cond_0

    invoke-virtual {p0, p1}, LN4/i;->S(I)V

    :cond_0
    return-void
.end method

.method private U(IIII)I
    .locals 8

    .prologue
    invoke-static {p2}, LN4/j;->a(I)Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 p2, p2, -0x1

    if-eqz p4, :cond_0

    and-int/2addr p3, p2

    add-int/lit8 p4, p4, 0x1

    invoke-static {v0, p3, p4}, LN4/j;->i(Ljava/lang/Object;II)V

    :cond_0
    invoke-direct {p0}, LN4/i;->Q()Ljava/lang/Object;

    move-result-object p3

    invoke-direct {p0}, LN4/i;->O()[I

    move-result-object p4

    const/4 v1, 0x0

    :goto_0
    if-gt v1, p1, :cond_2

    invoke-static {p3, v1}, LN4/j;->h(Ljava/lang/Object;I)I

    move-result v2

    :goto_1
    if-eqz v2, :cond_1

    add-int/lit8 v3, v2, -0x1

    aget v4, p4, v3

    invoke-static {v4, p1}, LN4/j;->b(II)I

    move-result v5

    or-int/2addr v5, v1

    and-int v6, v5, p2

    invoke-static {v0, v6}, LN4/j;->h(Ljava/lang/Object;I)I

    move-result v7

    invoke-static {v0, v6, v2}, LN4/j;->i(Ljava/lang/Object;II)V

    invoke-static {v5, v7, p2}, LN4/j;->d(III)I

    move-result v2

    aput v2, p4, v3

    invoke-static {v4, p1}, LN4/j;->c(II)I

    move-result v2

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iput-object v0, p0, LN4/i;->C:Ljava/lang/Object;

    invoke-direct {p0, p2}, LN4/i;->W(I)V

    return p2
.end method

.method private V(II)V
    .locals 1

    invoke-direct {p0}, LN4/i;->O()[I

    move-result-object v0

    aput p2, v0, p1

    return-void
.end method

.method private W(I)V
    .locals 2

    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p1

    rsub-int/lit8 p1, p1, 0x20

    iget v0, p0, LN4/i;->G:I

    const/16 v1, 0x1f

    invoke-static {v0, p1, v1}, LN4/j;->d(III)I

    move-result p1

    iput p1, p0, LN4/i;->G:I

    return-void
.end method

.method private X(ILjava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, LN4/i;->P()[Ljava/lang/Object;

    move-result-object v0

    aput-object p2, v0, p1

    return-void
.end method

.method private Y(ILjava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, LN4/i;->R()[Ljava/lang/Object;

    move-result-object v0

    aput-object p2, v0, p1

    return-void
.end method

.method private Z(I)Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, LN4/i;->R()[Ljava/lang/Object;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method static synthetic a(LN4/i;)I
    .locals 0

    iget p0, p0, LN4/i;->G:I

    return p0
.end method

.method static synthetic b(LN4/i;I)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LN4/i;->J(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(LN4/i;)[Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, LN4/i;->P()[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(LN4/i;)[Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, LN4/i;->R()[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(LN4/i;)I
    .locals 2

    iget v0, p0, LN4/i;->H:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, LN4/i;->H:I

    return v0
.end method

.method static synthetic f(LN4/i;ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LN4/i;->Y(ILjava/lang/Object;)V

    return-void
.end method

.method static synthetic g(LN4/i;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LN4/i;->N(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic h()Ljava/lang/Object;
    .locals 1

    sget-object v0, LN4/i;->L:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic j(LN4/i;Ljava/lang/Object;)I
    .locals 0

    invoke-direct {p0, p1}, LN4/i;->G(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method static synthetic k(LN4/i;I)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LN4/i;->Z(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(LN4/i;)I
    .locals 0

    invoke-direct {p0}, LN4/i;->E()I

    move-result p0

    return p0
.end method

.method static synthetic m(LN4/i;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, LN4/i;->Q()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic o(LN4/i;)[I
    .locals 0

    invoke-direct {p0}, LN4/i;->O()[I

    move-result-object p0

    return-object p0
.end method

.method public static t()LN4/i;
    .locals 1

    new-instance v0, LN4/i;

    invoke-direct {v0}, LN4/i;-><init>()V

    return-object v0
.end method


# virtual methods
.method B()Ljava/util/Iterator;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN4/i;->z()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, LN4/i$b;

    invoke-direct {v0, p0}, LN4/i$b;-><init>(LN4/i;)V

    return-object v0
.end method

.method C()I
    .locals 1

    .prologue
    invoke-virtual {p0}, LN4/i;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method D(I)I
    .locals 1

    .prologue
    add-int/lit8 p1, p1, 0x1

    iget v0, p0, LN4/i;->H:I

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method F()V
    .locals 1

    iget v0, p0, LN4/i;->G:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, LN4/i;->G:I

    return-void
.end method

.method H(I)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    if-ltz p1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Expected size must be >= 0"

    invoke-static {v1, v2}, LM4/h;->e(ZLjava/lang/Object;)V

    const v1, 0x3fffffff    # 1.9999999f

    invoke-static {p1, v0, v1}, LO4/a;->a(III)I

    move-result p1

    iput p1, p0, LN4/i;->G:I

    return-void
.end method

.method I(ILjava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p4, v0, p5}, LN4/j;->d(III)I

    move-result p4

    invoke-direct {p0, p1, p4}, LN4/i;->V(II)V

    invoke-direct {p0, p1, p2}, LN4/i;->X(ILjava/lang/Object;)V

    invoke-direct {p0, p1, p3}, LN4/i;->Y(ILjava/lang/Object;)V

    return-void
.end method

.method K()Ljava/util/Iterator;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN4/i;->z()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, LN4/i$a;

    invoke-direct {v0, p0}, LN4/i$a;-><init>(LN4/i;)V

    return-object v0
.end method

.method L(II)V
    .locals 10

    .prologue
    invoke-direct {p0}, LN4/i;->Q()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0}, LN4/i;->O()[I

    move-result-object v1

    invoke-direct {p0}, LN4/i;->P()[Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0}, LN4/i;->R()[Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0}, LN4/i;->size()I

    move-result v4

    add-int/lit8 v5, v4, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-ge p1, v5, :cond_2

    aget-object v8, v2, v5

    aput-object v8, v2, p1

    aget-object v9, v3, v5

    aput-object v9, v3, p1

    aput-object v7, v2, v5

    aput-object v7, v3, v5

    aget v2, v1, v5

    aput v2, v1, p1

    aput v6, v1, v5

    invoke-static {v8}, LN4/m;->c(Ljava/lang/Object;)I

    move-result v2

    and-int/2addr v2, p2

    invoke-static {v0, v2}, LN4/j;->h(Ljava/lang/Object;I)I

    move-result v3

    if-ne v3, v4, :cond_0

    add-int/lit8 p1, p1, 0x1

    invoke-static {v0, v2, p1}, LN4/j;->i(Ljava/lang/Object;II)V

    goto :goto_1

    :cond_0
    :goto_0
    add-int/lit8 v3, v3, -0x1

    aget v0, v1, v3

    invoke-static {v0, p2}, LN4/j;->c(II)I

    move-result v2

    if-ne v2, v4, :cond_1

    add-int/lit8 p1, p1, 0x1

    invoke-static {v0, p1, p2}, LN4/j;->d(III)I

    move-result p1

    aput p1, v1, v3

    goto :goto_1

    :cond_1
    move v3, v2

    goto :goto_0

    :cond_2
    aput-object v7, v2, p1

    aput-object v7, v3, p1

    aput v6, v1, p1

    :goto_1
    return-void
.end method

.method M()Z
    .locals 1

    .prologue
    iget-object v0, p0, LN4/i;->C:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method S(I)V
    .locals 1

    invoke-direct {p0}, LN4/i;->O()[I

    move-result-object v0

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, LN4/i;->D:[I

    invoke-direct {p0}, LN4/i;->P()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LN4/i;->E:[Ljava/lang/Object;

    invoke-direct {p0}, LN4/i;->R()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LN4/i;->F:[Ljava/lang/Object;

    return-void
.end method

.method a0()Ljava/util/Iterator;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN4/i;->z()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, LN4/i$c;

    invoke-direct {v0, p0}, LN4/i$c;-><init>(LN4/i;)V

    return-object v0
.end method

.method public clear()V
    .locals 6

    .prologue
    invoke-virtual {p0}, LN4/i;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LN4/i;->F()V

    invoke-virtual {p0}, LN4/i;->z()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LN4/i;->size()I

    move-result v3

    const/4 v4, 0x3

    const v5, 0x3fffffff    # 1.9999999f

    invoke-static {v3, v4, v5}, LO4/a;->a(III)I

    move-result v3

    iput v3, p0, LN4/i;->G:I

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iput-object v1, p0, LN4/i;->C:Ljava/lang/Object;

    :goto_0
    iput v2, p0, LN4/i;->H:I

    goto :goto_1

    :cond_1
    invoke-direct {p0}, LN4/i;->P()[Ljava/lang/Object;

    move-result-object v0

    iget v3, p0, LN4/i;->H:I

    invoke-static {v0, v2, v3, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    invoke-direct {p0}, LN4/i;->R()[Ljava/lang/Object;

    move-result-object v0

    iget v3, p0, LN4/i;->H:I

    invoke-static {v0, v2, v3, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    invoke-direct {p0}, LN4/i;->Q()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LN4/j;->g(Ljava/lang/Object;)V

    invoke-direct {p0}, LN4/i;->O()[I

    move-result-object v0

    iget v1, p0, LN4/i;->H:I

    invoke-static {v0, v2, v1, v2}, Ljava/util/Arrays;->fill([IIII)V

    goto :goto_0

    :goto_1
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LN4/i;->z()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, LN4/i;->G(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    invoke-virtual {p0}, LN4/i;->z()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, LN4/i;->H:I

    if-ge v1, v2, :cond_2

    invoke-direct {p0, v1}, LN4/i;->Z(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v2}, LM4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1

    .prologue
    iget-object v0, p0, LN4/i;->J:Ljava/util/Set;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LN4/i;->u()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, LN4/i;->J:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN4/i;->z()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, LN4/i;->G(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, LN4/i;->p(I)V

    invoke-direct {p0, p1}, LN4/i;->Z(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LN4/i;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1

    .prologue
    iget-object v0, p0, LN4/i;->I:Ljava/util/Set;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LN4/i;->x()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, LN4/i;->I:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method p(I)V
    .locals 0

    return-void
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .prologue
    invoke-virtual {p0}, LN4/i;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LN4/i;->r()I

    :cond_0
    invoke-virtual {p0}, LN4/i;->z()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0}, LN4/i;->O()[I

    move-result-object v0

    invoke-direct {p0}, LN4/i;->P()[Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0}, LN4/i;->R()[Ljava/lang/Object;

    move-result-object v2

    iget v4, p0, LN4/i;->H:I

    add-int/lit8 v9, v4, 0x1

    invoke-static {p1}, LN4/m;->c(Ljava/lang/Object;)I

    move-result v7

    invoke-direct {p0}, LN4/i;->E()I

    move-result v3

    and-int v5, v7, v3

    invoke-direct {p0}, LN4/i;->Q()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v5}, LN4/j;->h(Ljava/lang/Object;I)I

    move-result v6

    if-nez v6, :cond_3

    if-le v9, v3, :cond_2

    :goto_0
    invoke-static {v3}, LN4/j;->e(I)I

    move-result v0

    invoke-direct {p0, v3, v0, v7, v4}, LN4/i;->U(IIII)I

    move-result v0

    move v8, v0

    goto :goto_3

    :cond_2
    invoke-direct {p0}, LN4/i;->Q()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5, v9}, LN4/j;->i(Ljava/lang/Object;II)V

    goto :goto_2

    :cond_3
    invoke-static {v7, v3}, LN4/j;->b(II)I

    move-result v5

    const/4 v8, 0x0

    :goto_1
    add-int/lit8 v6, v6, -0x1

    aget v10, v0, v6

    invoke-static {v10, v3}, LN4/j;->b(II)I

    move-result v11

    if-ne v11, v5, :cond_4

    aget-object v11, v1, v6

    invoke-static {p1, v11}, LM4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    aget-object p1, v2, v6

    aput-object p2, v2, v6

    invoke-virtual {p0, v6}, LN4/i;->p(I)V

    return-object p1

    :cond_4
    invoke-static {v10, v3}, LN4/j;->c(II)I

    move-result v11

    add-int/lit8 v8, v8, 0x1

    if-nez v11, :cond_7

    const/16 v1, 0x9

    if-lt v8, v1, :cond_5

    invoke-virtual {p0}, LN4/i;->s()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    if-le v9, v3, :cond_6

    goto :goto_0

    :cond_6
    invoke-static {v10, v9, v3}, LN4/j;->d(III)I

    move-result v1

    aput v1, v0, v6

    :goto_2
    move v8, v3

    :goto_3
    invoke-direct {p0, v9}, LN4/i;->T(I)V

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    invoke-virtual/range {v3 .. v8}, LN4/i;->I(ILjava/lang/Object;Ljava/lang/Object;II)V

    iput v9, p0, LN4/i;->H:I

    invoke-virtual {p0}, LN4/i;->F()V

    const/4 p1, 0x0

    return-object p1

    :cond_7
    move v6, v11

    goto :goto_1
.end method

.method q(II)I
    .locals 0

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method r()I
    .locals 3

    invoke-virtual {p0}, LN4/i;->M()Z

    move-result v0

    const-string v1, "Arrays already allocated"

    invoke-static {v0, v1}, LM4/h;->o(ZLjava/lang/Object;)V

    iget v0, p0, LN4/i;->G:I

    invoke-static {v0}, LN4/j;->j(I)I

    move-result v1

    invoke-static {v1}, LN4/j;->a(I)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, LN4/i;->C:Ljava/lang/Object;

    add-int/lit8 v1, v1, -0x1

    invoke-direct {p0, v1}, LN4/i;->W(I)V

    new-array v1, v0, [I

    iput-object v1, p0, LN4/i;->D:[I

    new-array v1, v0, [Ljava/lang/Object;

    iput-object v1, p0, LN4/i;->E:[Ljava/lang/Object;

    new-array v1, v0, [Ljava/lang/Object;

    iput-object v1, p0, LN4/i;->F:[Ljava/lang/Object;

    return v0
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-virtual {p0}, LN4/i;->z()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, LN4/i;->N(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LN4/i;->L:Ljava/lang/Object;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    :cond_1
    return-object p1
.end method

.method s()Ljava/util/Map;
    .locals 4

    .prologue
    invoke-direct {p0}, LN4/i;->E()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, LN4/i;->v(I)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, LN4/i;->C()I

    move-result v1

    :goto_0
    if-ltz v1, :cond_0

    invoke-direct {p0, v1}, LN4/i;->J(I)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0, v1}, LN4/i;->Z(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v1}, LN4/i;->D(I)I

    move-result v1

    goto :goto_0

    :cond_0
    iput-object v0, p0, LN4/i;->C:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, LN4/i;->D:[I

    iput-object v1, p0, LN4/i;->E:[Ljava/lang/Object;

    iput-object v1, p0, LN4/i;->F:[Ljava/lang/Object;

    invoke-virtual {p0}, LN4/i;->F()V

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    invoke-virtual {p0}, LN4/i;->z()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p0, LN4/i;->H:I

    :goto_0
    return v0
.end method

.method u()Ljava/util/Set;
    .locals 1

    new-instance v0, LN4/i$d;

    invoke-direct {v0, p0}, LN4/i$d;-><init>(LN4/i;)V

    return-object v0
.end method

.method v(I)Ljava/util/Map;
    .locals 2

    new-instance v0, Ljava/util/LinkedHashMap;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, p1, v1}, Ljava/util/LinkedHashMap;-><init>(IF)V

    return-object v0
.end method

.method public values()Ljava/util/Collection;
    .locals 1

    .prologue
    iget-object v0, p0, LN4/i;->K:Ljava/util/Collection;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LN4/i;->y()Ljava/util/Collection;

    move-result-object v0

    iput-object v0, p0, LN4/i;->K:Ljava/util/Collection;

    :cond_0
    return-object v0
.end method

.method x()Ljava/util/Set;
    .locals 1

    new-instance v0, LN4/i$f;

    invoke-direct {v0, p0}, LN4/i$f;-><init>(LN4/i;)V

    return-object v0
.end method

.method y()Ljava/util/Collection;
    .locals 1

    new-instance v0, LN4/i$h;

    invoke-direct {v0, p0}, LN4/i$h;-><init>(LN4/i;)V

    return-object v0
.end method

.method z()Ljava/util/Map;
    .locals 2

    .prologue
    iget-object v0, p0, LN4/i;->C:Ljava/lang/Object;

    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/Map;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
