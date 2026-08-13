.class Lp8/t;
.super Lp8/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp8/t$d;,
        Lp8/t$c;,
        Lp8/t$b;
    }
.end annotation


# static fields
.field private static final J:[I


# instance fields
.field private final D:I

.field private final E:Lp8/d;

.field private final F:Lp8/d;

.field private final G:I

.field private final H:I

.field private I:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    if-lez v1, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v2, v1

    move v4, v2

    move v2, v1

    move v1, v4

    goto :goto_0

    :cond_0
    const v1, 0x7fffffff

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [I

    sput-object v1, Lp8/t;->J:[I

    const/4 v1, 0x0

    :goto_1
    sget-object v2, Lp8/t;->J:[I

    array-length v3, v2

    if-ge v1, v3, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method private constructor <init>(Lp8/d;Lp8/d;)V
    .locals 2

    invoke-direct {p0}, Lp8/d;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lp8/t;->I:I

    iput-object p1, p0, Lp8/t;->E:Lp8/d;

    iput-object p2, p0, Lp8/t;->F:Lp8/d;

    invoke-virtual {p1}, Lp8/d;->size()I

    move-result v0

    iput v0, p0, Lp8/t;->G:I

    invoke-virtual {p2}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lp8/t;->D:I

    invoke-virtual {p1}, Lp8/d;->C()I

    move-result p1

    invoke-virtual {p2}, Lp8/d;->C()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lp8/t;->H:I

    return-void
.end method

.method synthetic constructor <init>(Lp8/d;Lp8/d;Lp8/t$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lp8/t;-><init>(Lp8/d;Lp8/d;)V

    return-void
.end method

.method static synthetic V(Lp8/t;)Lp8/d;
    .locals 0

    iget-object p0, p0, Lp8/t;->E:Lp8/d;

    return-object p0
.end method

.method static synthetic W(Lp8/t;)Lp8/d;
    .locals 0

    iget-object p0, p0, Lp8/t;->F:Lp8/d;

    return-object p0
.end method

.method static synthetic X()[I
    .locals 1

    sget-object v0, Lp8/t;->J:[I

    return-object v0
.end method

.method static Y(Lp8/d;Lp8/d;)Lp8/d;
    .locals 6

    .prologue
    instance-of v0, p0, Lp8/t;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lp8/t;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p1}, Lp8/d;->size()I

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p0}, Lp8/d;->size()I

    move-result v2

    if-nez v2, :cond_2

    :goto_1
    move-object p0, p1

    goto/16 :goto_2

    :cond_2
    invoke-virtual {p0}, Lp8/d;->size()I

    move-result v2

    invoke-virtual {p1}, Lp8/d;->size()I

    move-result v3

    add-int/2addr v2, v3

    const/16 v3, 0x80

    if-ge v2, v3, :cond_3

    invoke-static {p0, p1}, Lp8/t;->Z(Lp8/d;Lp8/d;)Lp8/o;

    move-result-object p0

    goto :goto_2

    :cond_3
    if-eqz v0, :cond_4

    iget-object v4, v0, Lp8/t;->F:Lp8/d;

    invoke-virtual {v4}, Lp8/d;->size()I

    move-result v4

    invoke-virtual {p1}, Lp8/d;->size()I

    move-result v5

    add-int/2addr v4, v5

    if-ge v4, v3, :cond_4

    iget-object p0, v0, Lp8/t;->F:Lp8/d;

    invoke-static {p0, p1}, Lp8/t;->Z(Lp8/d;Lp8/d;)Lp8/o;

    move-result-object p0

    new-instance p1, Lp8/t;

    iget-object v0, v0, Lp8/t;->E:Lp8/d;

    invoke-direct {p1, v0, p0}, Lp8/t;-><init>(Lp8/d;Lp8/d;)V

    goto :goto_1

    :cond_4
    if-eqz v0, :cond_5

    iget-object v3, v0, Lp8/t;->E:Lp8/d;

    invoke-virtual {v3}, Lp8/d;->C()I

    move-result v3

    iget-object v4, v0, Lp8/t;->F:Lp8/d;

    invoke-virtual {v4}, Lp8/d;->C()I

    move-result v4

    if-le v3, v4, :cond_5

    invoke-virtual {v0}, Lp8/t;->C()I

    move-result v3

    invoke-virtual {p1}, Lp8/d;->C()I

    move-result v4

    if-le v3, v4, :cond_5

    new-instance p0, Lp8/t;

    iget-object v1, v0, Lp8/t;->F:Lp8/d;

    invoke-direct {p0, v1, p1}, Lp8/t;-><init>(Lp8/d;Lp8/d;)V

    new-instance p1, Lp8/t;

    iget-object v0, v0, Lp8/t;->E:Lp8/d;

    invoke-direct {p1, v0, p0}, Lp8/t;-><init>(Lp8/d;Lp8/d;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lp8/d;->C()I

    move-result v0

    invoke-virtual {p1}, Lp8/d;->C()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    sget-object v3, Lp8/t;->J:[I

    aget v0, v3, v0

    if-lt v2, v0, :cond_6

    new-instance v0, Lp8/t;

    invoke-direct {v0, p0, p1}, Lp8/t;-><init>(Lp8/d;Lp8/d;)V

    move-object p0, v0

    goto :goto_2

    :cond_6
    new-instance v0, Lp8/t$b;

    invoke-direct {v0, v1}, Lp8/t$b;-><init>(Lp8/t$a;)V

    invoke-static {v0, p0, p1}, Lp8/t$b;->a(Lp8/t$b;Lp8/d;Lp8/d;)Lp8/d;

    move-result-object p0

    :goto_2
    return-object p0
.end method

.method private static Z(Lp8/d;Lp8/d;)Lp8/o;
    .locals 4

    invoke-virtual {p0}, Lp8/d;->size()I

    move-result v0

    invoke-virtual {p1}, Lp8/d;->size()I

    move-result v1

    add-int v2, v0, v1

    new-array v2, v2, [B

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3, v3, v0}, Lp8/d;->s([BIII)V

    invoke-virtual {p1, v2, v3, v0, v1}, Lp8/d;->s([BIII)V

    new-instance p0, Lp8/o;

    invoke-direct {p0, v2}, Lp8/o;-><init>([B)V

    return-object p0
.end method

.method private a0(Lp8/d;)Z
    .locals 11

    .prologue
    new-instance v0, Lp8/t$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lp8/t$c;-><init>(Lp8/d;Lp8/t$a;)V

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp8/o;

    new-instance v3, Lp8/t$c;

    invoke-direct {v3, p1, v1}, Lp8/t$c;-><init>(Lp8/d;Lp8/t$a;)V

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp8/o;

    const/4 v1, 0x0

    move v4, v1

    move v5, v4

    move v6, v5

    :goto_0
    invoke-virtual {v2}, Lp8/o;->size()I

    move-result v7

    sub-int/2addr v7, v4

    invoke-virtual {p1}, Lp8/o;->size()I

    move-result v8

    sub-int/2addr v8, v5

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v9

    if-nez v4, :cond_0

    invoke-virtual {v2, p1, v5, v9}, Lp8/o;->V(Lp8/o;II)Z

    move-result v10

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v2, v4, v9}, Lp8/o;->V(Lp8/o;II)Z

    move-result v10

    :goto_1
    if-nez v10, :cond_1

    return v1

    :cond_1
    add-int/2addr v6, v9

    iget v10, p0, Lp8/t;->D:I

    if-lt v6, v10, :cond_3

    if-ne v6, v10, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_3
    if-ne v9, v7, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp8/o;

    move v4, v1

    goto :goto_2

    :cond_4
    add-int/2addr v4, v9

    :goto_2
    if-ne v9, v8, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp8/o;

    move v5, v1

    goto :goto_0

    :cond_5
    add-int/2addr v5, v9

    goto :goto_0
.end method


# virtual methods
.method protected C()I
    .locals 1

    iget v0, p0, Lp8/t;->H:I

    return v0
.end method

.method protected D()Z
    .locals 3

    .prologue
    iget v0, p0, Lp8/t;->D:I

    sget-object v1, Lp8/t;->J:[I

    iget v2, p0, Lp8/t;->H:I

    aget v1, v1, v2

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public E()Z
    .locals 4

    .prologue
    iget-object v0, p0, Lp8/t;->E:Lp8/d;

    iget v1, p0, Lp8/t;->G:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v1}, Lp8/d;->O(III)I

    move-result v0

    iget-object v1, p0, Lp8/t;->F:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v3

    invoke-virtual {v1, v0, v2, v3}, Lp8/d;->O(III)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method protected N(III)I
    .locals 2

    .prologue
    add-int v0, p2, p3

    iget v1, p0, Lp8/t;->G:I

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lp8/t;->E:Lp8/d;

    invoke-virtual {v0, p1, p2, p3}, Lp8/d;->N(III)I

    move-result p1

    return p1

    :cond_0
    if-lt p2, v1, :cond_1

    iget-object v0, p0, Lp8/t;->F:Lp8/d;

    sub-int/2addr p2, v1

    invoke-virtual {v0, p1, p2, p3}, Lp8/d;->N(III)I

    move-result p1

    return p1

    :cond_1
    sub-int/2addr v1, p2

    iget-object v0, p0, Lp8/t;->E:Lp8/d;

    invoke-virtual {v0, p1, p2, v1}, Lp8/d;->N(III)I

    move-result p1

    iget-object p2, p0, Lp8/t;->F:Lp8/d;

    const/4 v0, 0x0

    sub-int/2addr p3, v1

    invoke-virtual {p2, p1, v0, p3}, Lp8/d;->N(III)I

    move-result p1

    return p1
.end method

.method protected O(III)I
    .locals 2

    .prologue
    add-int v0, p2, p3

    iget v1, p0, Lp8/t;->G:I

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lp8/t;->E:Lp8/d;

    invoke-virtual {v0, p1, p2, p3}, Lp8/d;->O(III)I

    move-result p1

    return p1

    :cond_0
    if-lt p2, v1, :cond_1

    iget-object v0, p0, Lp8/t;->F:Lp8/d;

    sub-int/2addr p2, v1

    invoke-virtual {v0, p1, p2, p3}, Lp8/d;->O(III)I

    move-result p1

    return p1

    :cond_1
    sub-int/2addr v1, p2

    iget-object v0, p0, Lp8/t;->E:Lp8/d;

    invoke-virtual {v0, p1, p2, v1}, Lp8/d;->O(III)I

    move-result p1

    iget-object p2, p0, Lp8/t;->F:Lp8/d;

    const/4 v0, 0x0

    sub-int/2addr p3, v1

    invoke-virtual {p2, p1, v0, p3}, Lp8/d;->O(III)I

    move-result p1

    return p1
.end method

.method protected P()I
    .locals 1

    iget v0, p0, Lp8/t;->I:I

    return v0
.end method

.method public R(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Lp8/d;->Q()[B

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.method U(Ljava/io/OutputStream;II)V
    .locals 2

    .prologue
    add-int v0, p2, p3

    iget v1, p0, Lp8/t;->G:I

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lp8/t;->E:Lp8/d;

    :goto_0
    invoke-virtual {v0, p1, p2, p3}, Lp8/d;->U(Ljava/io/OutputStream;II)V

    goto :goto_1

    :cond_0
    if-lt p2, v1, :cond_1

    iget-object v0, p0, Lp8/t;->F:Lp8/d;

    sub-int/2addr p2, v1

    goto :goto_0

    :cond_1
    sub-int/2addr v1, p2

    iget-object v0, p0, Lp8/t;->E:Lp8/d;

    invoke-virtual {v0, p1, p2, v1}, Lp8/d;->U(Ljava/io/OutputStream;II)V

    iget-object p2, p0, Lp8/t;->F:Lp8/d;

    const/4 v0, 0x0

    sub-int/2addr p3, v1

    invoke-virtual {p2, p1, v0, p3}, Lp8/d;->U(Ljava/io/OutputStream;II)V

    :goto_1
    return-void
.end method

.method public b0()Lp8/d$a;
    .locals 2

    new-instance v0, Lp8/t$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lp8/t$d;-><init>(Lp8/t;Lp8/t$a;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lp8/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lp8/d;

    iget v1, p0, Lp8/t;->D:I

    invoke-virtual {p1}, Lp8/d;->size()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lp8/t;->D:I

    if-nez v1, :cond_3

    return v0

    :cond_3
    iget v0, p0, Lp8/t;->I:I

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lp8/d;->P()I

    move-result v0

    if-eqz v0, :cond_4

    iget v1, p0, Lp8/t;->I:I

    if-eq v1, v0, :cond_4

    return v2

    :cond_4
    invoke-direct {p0, p1}, Lp8/t;->a0(Lp8/d;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    .prologue
    iget v0, p0, Lp8/t;->I:I

    if-nez v0, :cond_1

    iget v0, p0, Lp8/t;->D:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v0}, Lp8/t;->N(III)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput v0, p0, Lp8/t;->I:I

    :cond_1
    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lp8/t;->b0()Lp8/d$a;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lp8/t;->D:I

    return v0
.end method

.method protected w([BIII)V
    .locals 2

    .prologue
    add-int v0, p2, p4

    iget v1, p0, Lp8/t;->G:I

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lp8/t;->E:Lp8/d;

    :goto_0
    invoke-virtual {v0, p1, p2, p3, p4}, Lp8/d;->w([BIII)V

    goto :goto_1

    :cond_0
    if-lt p2, v1, :cond_1

    iget-object v0, p0, Lp8/t;->F:Lp8/d;

    sub-int/2addr p2, v1

    goto :goto_0

    :cond_1
    sub-int/2addr v1, p2

    iget-object v0, p0, Lp8/t;->E:Lp8/d;

    invoke-virtual {v0, p1, p2, p3, v1}, Lp8/d;->w([BIII)V

    iget-object p2, p0, Lp8/t;->F:Lp8/d;

    add-int/2addr p3, v1

    sub-int/2addr p4, v1

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0, p3, p4}, Lp8/d;->w([BIII)V

    :goto_1
    return-void
.end method
