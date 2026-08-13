.class public final Lk7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;
.implements Ljava/io/Serializable;
.implements Lz7/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk7/d$a;,
        Lk7/d$b;,
        Lk7/d$c;,
        Lk7/d$d;,
        Lk7/d$e;,
        Lk7/d$f;
    }
.end annotation


# static fields
.field public static final P:Lk7/d$a;

.field private static final Q:Lk7/d;


# instance fields
.field private C:[Ljava/lang/Object;

.field private D:[Ljava/lang/Object;

.field private E:[I

.field private F:[I

.field private G:I

.field private H:I

.field private I:I

.field private J:I

.field private K:I

.field private L:Lk7/f;

.field private M:Lk7/g;

.field private N:Lk7/e;

.field private O:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk7/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk7/d$a;-><init>(Ly7/k;)V

    sput-object v0, Lk7/d;->P:Lk7/d$a;

    new-instance v0, Lk7/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk7/d;-><init>(I)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lk7/d;->O:Z

    sput-object v0, Lk7/d;->Q:Lk7/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lk7/d;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 7

    invoke-static {p1}, Lk7/c;->d(I)[Ljava/lang/Object;

    move-result-object v1

    new-array v3, p1, [I

    sget-object v0, Lk7/d;->P:Lk7/d$a;

    invoke-static {v0, p1}, Lk7/d$a;->a(Lk7/d$a;I)I

    move-result p1

    new-array v4, p1, [I

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lk7/d;-><init>([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V

    return-void
.end method

.method private constructor <init>([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk7/d;->C:[Ljava/lang/Object;

    iput-object p2, p0, Lk7/d;->D:[Ljava/lang/Object;

    iput-object p3, p0, Lk7/d;->E:[I

    iput-object p4, p0, Lk7/d;->F:[I

    iput p5, p0, Lk7/d;->G:I

    iput p6, p0, Lk7/d;->H:I

    sget-object p1, Lk7/d;->P:Lk7/d$a;

    invoke-direct {p0}, Lk7/d;->D()I

    move-result p2

    invoke-static {p1, p2}, Lk7/d$a;->b(Lk7/d$a;I)I

    move-result p1

    iput p1, p0, Lk7/d;->I:I

    return-void
.end method

.method private final A(Ljava/lang/Object;)I
    .locals 2

    .prologue
    iget v0, p0, Lk7/d;->H:I

    :cond_0
    const/4 v1, -0x1

    add-int/2addr v0, v1

    if-ltz v0, :cond_1

    iget-object v1, p0, Lk7/d;->E:[I

    aget v1, v1, v0

    if-ltz v1, :cond_0

    iget-object v1, p0, Lk7/d;->D:[Ljava/lang/Object;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v1, v1, v0

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_1
    return v1
.end method

.method private final D()I
    .locals 1

    iget-object v0, p0, Lk7/d;->F:[I

    array-length v0, v0

    return v0
.end method

.method private final I(Ljava/lang/Object;)I
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const v0, -0x61c88647

    mul-int/2addr p1, v0

    iget v0, p0, Lk7/d;->I:I

    ushr-int/2addr p1, v0

    return p1
.end method

.method private final K(Ljava/util/Collection;)Z
    .locals 2

    .prologue
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {p0, v0}, Lk7/d;->u(I)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-direct {p0, v0}, Lk7/d;->L(Ljava/util/Map$Entry;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method private final L(Ljava/util/Map$Entry;)Z
    .locals 5

    .prologue
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lk7/d;->k(Ljava/lang/Object;)I

    move-result v0

    invoke-direct {p0}, Lk7/d;->l()[Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    if-ltz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    aput-object p1, v1, v0

    return v2

    :cond_0
    neg-int v0, v0

    sub-int/2addr v0, v2

    aget-object v3, v1, v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    aput-object p1, v1, v0

    return v2

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private final M(I)Z
    .locals 5

    .prologue
    iget-object v0, p0, Lk7/d;->C:[Ljava/lang/Object;

    aget-object v0, v0, p1

    invoke-direct {p0, v0}, Lk7/d;->I(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Lk7/d;->G:I

    :goto_0
    iget-object v2, p0, Lk7/d;->F:[I

    aget v3, v2, v0

    const/4 v4, 0x1

    if-nez v3, :cond_0

    add-int/lit8 v1, p1, 0x1

    aput v1, v2, v0

    iget-object v1, p0, Lk7/d;->E:[I

    aput v0, v1, p1

    return v4

    :cond_0
    add-int/lit8 v1, v1, -0x1

    if-gez v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    add-int/lit8 v2, v0, -0x1

    if-nez v0, :cond_2

    invoke-direct {p0}, Lk7/d;->D()I

    move-result v0

    sub-int/2addr v0, v4

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_0
.end method

.method private final N()V
    .locals 1

    iget v0, p0, Lk7/d;->J:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lk7/d;->J:I

    return-void
.end method

.method private final O(I)V
    .locals 3

    .prologue
    invoke-direct {p0}, Lk7/d;->N()V

    iget v0, p0, Lk7/d;->H:I

    invoke-virtual {p0}, Lk7/d;->size()I

    move-result v1

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    invoke-direct {p0, v2}, Lk7/d;->p(Z)V

    :cond_0
    new-array v0, p1, [I

    iput-object v0, p0, Lk7/d;->F:[I

    sget-object v0, Lk7/d;->P:Lk7/d$a;

    invoke-static {v0, p1}, Lk7/d$a;->b(Lk7/d$a;I)I

    move-result p1

    iput p1, p0, Lk7/d;->I:I

    :goto_0
    iget p1, p0, Lk7/d;->H:I

    if-ge v2, p1, :cond_2

    add-int/lit8 p1, v2, 0x1

    invoke-direct {p0, v2}, Lk7/d;->M(I)Z

    move-result v0

    if-eqz v0, :cond_1

    move v2, p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method private final Q(I)V
    .locals 2

    .prologue
    iget-object v0, p0, Lk7/d;->C:[Ljava/lang/Object;

    invoke-static {v0, p1}, Lk7/c;->f([Ljava/lang/Object;I)V

    iget-object v0, p0, Lk7/d;->D:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lk7/c;->f([Ljava/lang/Object;I)V

    :cond_0
    iget-object v0, p0, Lk7/d;->E:[I

    aget v0, v0, p1

    invoke-direct {p0, v0}, Lk7/d;->R(I)V

    iget-object v0, p0, Lk7/d;->E:[I

    const/4 v1, -0x1

    aput v1, v0, p1

    invoke-virtual {p0}, Lk7/d;->size()I

    move-result p1

    add-int/2addr p1, v1

    iput p1, p0, Lk7/d;->K:I

    invoke-direct {p0}, Lk7/d;->N()V

    return-void
.end method

.method private final R(I)V
    .locals 9

    .prologue
    iget v0, p0, Lk7/d;->G:I

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {p0}, Lk7/d;->D()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, LE7/j;->g(II)I

    move-result v0

    const/4 v1, 0x0

    move v2, v0

    move v3, v1

    move v0, p1

    :cond_0
    add-int/lit8 v4, p1, -0x1

    if-nez p1, :cond_1

    invoke-direct {p0}, Lk7/d;->D()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    move p1, v4

    :goto_0
    add-int/lit8 v3, v3, 0x1

    iget v4, p0, Lk7/d;->G:I

    if-le v3, v4, :cond_2

    iget-object p1, p0, Lk7/d;->F:[I

    aput v1, p1, v0

    return-void

    :cond_2
    iget-object v4, p0, Lk7/d;->F:[I

    aget v5, v4, p1

    if-nez v5, :cond_3

    aput v1, v4, v0

    return-void

    :cond_3
    const/4 v6, -0x1

    if-gez v5, :cond_4

    aput v6, v4, v0

    :goto_1
    move v0, p1

    move v3, v1

    goto :goto_2

    :cond_4
    iget-object v4, p0, Lk7/d;->C:[Ljava/lang/Object;

    add-int/lit8 v7, v5, -0x1

    aget-object v4, v4, v7

    invoke-direct {p0, v4}, Lk7/d;->I(Ljava/lang/Object;)I

    move-result v4

    sub-int/2addr v4, p1

    invoke-direct {p0}, Lk7/d;->D()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    and-int/2addr v4, v8

    if-lt v4, v3, :cond_5

    iget-object v3, p0, Lk7/d;->F:[I

    aput v5, v3, v0

    iget-object v3, p0, Lk7/d;->E:[I

    aput v0, v3, v7

    goto :goto_1

    :cond_5
    :goto_2
    add-int/2addr v2, v6

    if-gez v2, :cond_0

    iget-object p1, p0, Lk7/d;->F:[I

    aput v6, p1, v0

    return-void
.end method

.method private final U(I)Z
    .locals 3

    .prologue
    invoke-virtual {p0}, Lk7/d;->B()I

    move-result v0

    iget v1, p0, Lk7/d;->H:I

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lk7/d;->size()I

    move-result v2

    sub-int/2addr v1, v2

    if-ge v0, p1, :cond_0

    add-int/2addr v0, v1

    if-lt v0, p1, :cond_0

    invoke-virtual {p0}, Lk7/d;->B()I

    move-result p1

    div-int/lit8 p1, p1, 0x4

    if-lt v1, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static final synthetic a(Lk7/d;)[Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lk7/d;->l()[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Lk7/d;
    .locals 1

    sget-object v0, Lk7/d;->Q:Lk7/d;

    return-object v0
.end method

.method public static final synthetic c(Lk7/d;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lk7/d;->C:[Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic d(Lk7/d;)I
    .locals 0

    iget p0, p0, Lk7/d;->H:I

    return p0
.end method

.method public static final synthetic e(Lk7/d;)I
    .locals 0

    iget p0, p0, Lk7/d;->J:I

    return p0
.end method

.method public static final synthetic f(Lk7/d;)[I
    .locals 0

    iget-object p0, p0, Lk7/d;->E:[I

    return-object p0
.end method

.method public static final synthetic g(Lk7/d;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lk7/d;->D:[Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic h(Lk7/d;I)V
    .locals 0

    invoke-direct {p0, p1}, Lk7/d;->Q(I)V

    return-void
.end method

.method private final l()[Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, Lk7/d;->D:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lk7/d;->B()I

    move-result v0

    invoke-static {v0}, Lk7/c;->d(I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lk7/d;->D:[Ljava/lang/Object;

    return-object v0
.end method

.method private final p(Z)V
    .locals 7

    .prologue
    iget-object v0, p0, Lk7/d;->D:[Ljava/lang/Object;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget v3, p0, Lk7/d;->H:I

    if-ge v1, v3, :cond_3

    iget-object v3, p0, Lk7/d;->E:[I

    aget v4, v3, v1

    if-ltz v4, :cond_2

    iget-object v5, p0, Lk7/d;->C:[Ljava/lang/Object;

    aget-object v6, v5, v1

    aput-object v6, v5, v2

    if-eqz v0, :cond_0

    aget-object v5, v0, v1

    aput-object v5, v0, v2

    :cond_0
    if-eqz p1, :cond_1

    aput v4, v3, v2

    iget-object v3, p0, Lk7/d;->F:[I

    add-int/lit8 v5, v2, 0x1

    aput v5, v3, v4

    :cond_1
    add-int/lit8 v2, v2, 0x1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lk7/d;->C:[Ljava/lang/Object;

    invoke-static {p1, v2, v3}, Lk7/c;->g([Ljava/lang/Object;II)V

    if-eqz v0, :cond_4

    iget p1, p0, Lk7/d;->H:I

    invoke-static {v0, v2, p1}, Lk7/c;->g([Ljava/lang/Object;II)V

    :cond_4
    iput v2, p0, Lk7/d;->H:I

    return-void
.end method

.method private final s(Ljava/util/Map;)Z
    .locals 2

    .prologue
    invoke-virtual {p0}, Lk7/d;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lk7/d;->q(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final t(I)V
    .locals 2

    .prologue
    if-ltz p1, :cond_2

    invoke-virtual {p0}, Lk7/d;->B()I

    move-result v0

    if-le p1, v0, :cond_1

    sget-object v0, Lj7/d;->C:Lj7/d$a;

    invoke-virtual {p0}, Lk7/d;->B()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Lj7/d$a;->e(II)I

    move-result p1

    iget-object v0, p0, Lk7/d;->C:[Ljava/lang/Object;

    invoke-static {v0, p1}, Lk7/c;->e([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lk7/d;->C:[Ljava/lang/Object;

    iget-object v0, p0, Lk7/d;->D:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lk7/c;->e([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lk7/d;->D:[Ljava/lang/Object;

    iget-object v0, p0, Lk7/d;->E:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lk7/d;->E:[I

    sget-object v0, Lk7/d;->P:Lk7/d$a;

    invoke-static {v0, p1}, Lk7/d$a;->a(Lk7/d$a;I)I

    move-result p1

    invoke-direct {p0}, Lk7/d;->D()I

    move-result v0

    if-le p1, v0, :cond_1

    invoke-direct {p0, p1}, Lk7/d;->O(I)V

    :cond_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/OutOfMemoryError;

    invoke-direct {p1}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw p1
.end method

.method private final u(I)V
    .locals 1

    .prologue
    invoke-direct {p0, p1}, Lk7/d;->U(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lk7/d;->p(Z)V

    goto :goto_0

    :cond_0
    iget v0, p0, Lk7/d;->H:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0}, Lk7/d;->t(I)V

    :goto_0
    return-void
.end method

.method private final z(Ljava/lang/Object;)I
    .locals 5

    .prologue
    invoke-direct {p0, p1}, Lk7/d;->I(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Lk7/d;->G:I

    :goto_0
    iget-object v2, p0, Lk7/d;->F:[I

    aget v2, v2, v0

    const/4 v3, -0x1

    if-nez v2, :cond_0

    return v3

    :cond_0
    if-lez v2, :cond_1

    iget-object v4, p0, Lk7/d;->C:[Ljava/lang/Object;

    add-int/lit8 v2, v2, -0x1

    aget-object v4, v4, v2

    invoke-static {v4, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    return v2

    :cond_1
    add-int/2addr v1, v3

    if-gez v1, :cond_2

    return v3

    :cond_2
    add-int/lit8 v2, v0, -0x1

    if-nez v0, :cond_3

    invoke-direct {p0}, Lk7/d;->D()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_0
.end method


# virtual methods
.method public final B()I
    .locals 1

    iget-object v0, p0, Lk7/d;->C:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method

.method public C()Ljava/util/Set;
    .locals 1

    .prologue
    iget-object v0, p0, Lk7/d;->N:Lk7/e;

    if-nez v0, :cond_0

    new-instance v0, Lk7/e;

    invoke-direct {v0, p0}, Lk7/e;-><init>(Lk7/d;)V

    iput-object v0, p0, Lk7/d;->N:Lk7/e;

    :cond_0
    return-object v0
.end method

.method public E()Ljava/util/Set;
    .locals 1

    .prologue
    iget-object v0, p0, Lk7/d;->L:Lk7/f;

    if-nez v0, :cond_0

    new-instance v0, Lk7/f;

    invoke-direct {v0, p0}, Lk7/f;-><init>(Lk7/d;)V

    iput-object v0, p0, Lk7/d;->L:Lk7/f;

    :cond_0
    return-object v0
.end method

.method public F()I
    .locals 1

    iget v0, p0, Lk7/d;->K:I

    return v0
.end method

.method public G()Ljava/util/Collection;
    .locals 1

    .prologue
    iget-object v0, p0, Lk7/d;->M:Lk7/g;

    if-nez v0, :cond_0

    new-instance v0, Lk7/g;

    invoke-direct {v0, p0}, Lk7/g;-><init>(Lk7/d;)V

    iput-object v0, p0, Lk7/d;->M:Lk7/g;

    :cond_0
    return-object v0
.end method

.method public final J()Lk7/d$e;
    .locals 1

    new-instance v0, Lk7/d$e;

    invoke-direct {v0, p0}, Lk7/d$e;-><init>(Lk7/d;)V

    return-object v0
.end method

.method public final P(Ljava/util/Map$Entry;)Z
    .locals 3

    .prologue
    const-string v0, "entry"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lk7/d;->o()V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lk7/d;->z(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    if-gez v0, :cond_0

    return v1

    :cond_0
    iget-object v2, p0, Lk7/d;->D:[Ljava/lang/Object;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v2, v2, v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-direct {p0, v0}, Lk7/d;->Q(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final S(Ljava/lang/Object;)Z
    .locals 0

    .prologue
    invoke-virtual {p0}, Lk7/d;->o()V

    invoke-direct {p0, p1}, Lk7/d;->z(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p0, p1}, Lk7/d;->Q(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final T(Ljava/lang/Object;)Z
    .locals 0

    .prologue
    invoke-virtual {p0}, Lk7/d;->o()V

    invoke-direct {p0, p1}, Lk7/d;->A(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p0, p1}, Lk7/d;->Q(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final V()Lk7/d$f;
    .locals 1

    new-instance v0, Lk7/d$f;

    invoke-direct {v0, p0}, Lk7/d$f;-><init>(Lk7/d;)V

    return-object v0
.end method

.method public clear()V
    .locals 6

    .prologue
    invoke-virtual {p0}, Lk7/d;->o()V

    iget v0, p0, Lk7/d;->H:I

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    if-ltz v0, :cond_1

    move v2, v1

    :goto_0
    iget-object v3, p0, Lk7/d;->E:[I

    aget v4, v3, v2

    if-ltz v4, :cond_0

    iget-object v5, p0, Lk7/d;->F:[I

    aput v1, v5, v4

    const/4 v4, -0x1

    aput v4, v3, v2

    :cond_0
    if-eq v2, v0, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lk7/d;->C:[Ljava/lang/Object;

    iget v2, p0, Lk7/d;->H:I

    invoke-static {v0, v1, v2}, Lk7/c;->g([Ljava/lang/Object;II)V

    iget-object v0, p0, Lk7/d;->D:[Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget v2, p0, Lk7/d;->H:I

    invoke-static {v0, v1, v2}, Lk7/c;->g([Ljava/lang/Object;II)V

    :cond_2
    iput v1, p0, Lk7/d;->K:I

    iput v1, p0, Lk7/d;->H:I

    invoke-direct {p0}, Lk7/d;->N()V

    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 0

    .prologue
    invoke-direct {p0, p1}, Lk7/d;->z(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 0

    .prologue
    invoke-direct {p0, p1}, Lk7/d;->A(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final bridge entrySet()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Lk7/d;->C()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    if-eq p1, p0, :cond_1

    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lk7/d;->s(Ljava/util/Map;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-direct {p0, p1}, Lk7/d;->z(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lk7/d;->D:[Ljava/lang/Object;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object p1, v0, p1

    return-object p1
.end method

.method public hashCode()I
    .locals 3

    .prologue
    invoke-virtual {p0}, Lk7/d;->x()Lk7/d$b;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lk7/d$d;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lk7/d$b;->o()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    invoke-virtual {p0}, Lk7/d;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final k(Ljava/lang/Object;)I
    .locals 7

    .prologue
    invoke-virtual {p0}, Lk7/d;->o()V

    :goto_0
    invoke-direct {p0, p1}, Lk7/d;->I(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Lk7/d;->G:I

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {p0}, Lk7/d;->D()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    invoke-static {v1, v2}, LE7/j;->g(II)I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    iget-object v3, p0, Lk7/d;->F:[I

    aget v3, v3, v0

    const/4 v4, 0x1

    if-gtz v3, :cond_2

    iget v1, p0, Lk7/d;->H:I

    invoke-virtual {p0}, Lk7/d;->B()I

    move-result v3

    if-lt v1, v3, :cond_0

    invoke-direct {p0, v4}, Lk7/d;->u(I)V

    goto :goto_0

    :cond_0
    iget v1, p0, Lk7/d;->H:I

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, Lk7/d;->H:I

    iget-object v5, p0, Lk7/d;->C:[Ljava/lang/Object;

    aput-object p1, v5, v1

    iget-object p1, p0, Lk7/d;->E:[I

    aput v0, p1, v1

    iget-object p1, p0, Lk7/d;->F:[I

    aput v3, p1, v0

    invoke-virtual {p0}, Lk7/d;->size()I

    move-result p1

    add-int/2addr p1, v4

    iput p1, p0, Lk7/d;->K:I

    invoke-direct {p0}, Lk7/d;->N()V

    iget p1, p0, Lk7/d;->G:I

    if-le v2, p1, :cond_1

    iput v2, p0, Lk7/d;->G:I

    :cond_1
    return v1

    :cond_2
    iget-object v5, p0, Lk7/d;->C:[Ljava/lang/Object;

    add-int/lit8 v6, v3, -0x1

    aget-object v5, v5, v6

    invoke-static {v5, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    neg-int p1, v3

    return p1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    if-le v2, v1, :cond_4

    invoke-direct {p0}, Lk7/d;->D()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {p0, v0}, Lk7/d;->O(I)V

    goto :goto_0

    :cond_4
    add-int/lit8 v3, v0, -0x1

    if-nez v0, :cond_5

    invoke-direct {p0}, Lk7/d;->D()I

    move-result v0

    sub-int/2addr v0, v4

    goto :goto_1

    :cond_5
    move v0, v3

    goto :goto_1
.end method

.method public final bridge keySet()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Lk7/d;->E()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final m()Ljava/util/Map;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lk7/d;->o()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk7/d;->O:Z

    invoke-virtual {p0}, Lk7/d;->size()I

    move-result v0

    if-lez v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    sget-object v0, Lk7/d;->Q:Lk7/d;

    const-string v1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method public final o()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lk7/d;->O:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lk7/d;->o()V

    invoke-virtual {p0, p1}, Lk7/d;->k(Ljava/lang/Object;)I

    move-result p1

    invoke-direct {p0}, Lk7/d;->l()[Ljava/lang/Object;

    move-result-object v0

    if-gez p1, :cond_0

    neg-int p1, p1

    add-int/lit8 p1, p1, -0x1

    aget-object v1, v0, p1

    aput-object p2, v0, p1

    return-object v1

    :cond_0
    aput-object p2, v0, p1

    const/4 p1, 0x0

    return-object p1
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 1

    const-string v0, "from"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lk7/d;->o()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-direct {p0, p1}, Lk7/d;->K(Ljava/util/Collection;)Z

    return-void
.end method

.method public final q(Ljava/util/Collection;)Z
    .locals 2

    .prologue
    const-string v0, "m"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    :try_start_0
    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p0, v0}, Lk7/d;->r(Ljava/util/Map$Entry;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    nop

    :catch_0
    :cond_1
    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final r(Ljava/util/Map$Entry;)Z
    .locals 2

    .prologue
    const-string v0, "entry"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lk7/d;->z(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Lk7/d;->D:[Ljava/lang/Object;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v0, v1, v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-virtual {p0}, Lk7/d;->o()V

    invoke-direct {p0, p1}, Lk7/d;->z(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lk7/d;->D:[Ljava/lang/Object;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v0, v0, p1

    invoke-direct {p0, p1}, Lk7/d;->Q(I)V

    return-object v0
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, Lk7/d;->F()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lk7/d;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lk7/d;->x()Lk7/d$b;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1}, Lk7/d$d;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    if-lez v2, :cond_0

    const-string v3, ", "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v1, v0}, Lk7/d$b;->m(Ljava/lang/StringBuilder;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final bridge values()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lk7/d;->G()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final x()Lk7/d$b;
    .locals 1

    new-instance v0, Lk7/d$b;

    invoke-direct {v0, p0}, Lk7/d$b;-><init>(Lk7/d;)V

    return-object v0
.end method
