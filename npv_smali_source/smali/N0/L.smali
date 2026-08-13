.class public final LN0/L;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN0/L$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/text/Layout;

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/List;

.field private final d:[Z

.field private e:[C

.field private final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/text/Layout;)V
    .locals 7

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN0/L;->a:Landroid/text/Layout;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    move v3, v0

    :cond_0
    iget-object v1, p0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0xa

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v1

    if-gez v1, :cond_1

    iget-object v1, p0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    :goto_0
    move v3, v1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :goto_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lt v3, v1, :cond_0

    iput-object p1, p0, LN0/L;->b:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_2
    if-ge v0, p1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    iput-object v1, p0, LN0/L;->c:Ljava/util/List;

    iget-object p1, p0, LN0/L;->b:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Z

    iput-object p1, p0, LN0/L;->d:[Z

    iget-object p1, p0, LN0/L;->b:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, LN0/L;->f:I

    return-void
.end method

.method private final b(IZ)F
    .locals 2

    .prologue
    iget-object v0, p0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v0

    iget-object v1, p0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v1, v0}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v0

    invoke-static {p1, v0}, LE7/j;->g(II)I

    move-result p1

    if-eqz p2, :cond_0

    iget-object p2, p0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {p2, p1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result p1

    goto :goto_0

    :cond_0
    iget-object p2, p0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {p2, p1}, Landroid/text/Layout;->getSecondaryHorizontal(I)F

    move-result p1

    :goto_0
    return p1
.end method

.method public static synthetic g(LN0/L;IZILjava/lang/Object;)I
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LN0/L;->f(IZ)I

    move-result p0

    return p0
.end method

.method private final k(II)I
    .locals 2

    .prologue
    :goto_0
    if-le p1, p2, :cond_0

    iget-object v0, p0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    add-int/lit8 v1, p1, -0x1

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-virtual {p0, v0}, LN0/L;->i(C)Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_0
    return p1
.end method


# virtual methods
.method public final a(I)Ljava/text/Bidi;
    .locals 11

    .prologue
    iget-object v0, p0, LN0/L;->d:[Z

    aget-boolean v0, v0, p1

    if-eqz v0, :cond_0

    iget-object v0, p0, LN0/L;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/text/Bidi;

    return-object p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    move v1, v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, LN0/L;->b:Ljava/util/List;

    add-int/lit8 v2, p1, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    :goto_0
    iget-object v2, p0, LN0/L;->b:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    sub-int v8, v2, v1

    iget-object v3, p0, LN0/L;->e:[C

    if-eqz v3, :cond_3

    array-length v4, v3

    if-ge v4, v8, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    move-object v10, v3

    goto :goto_3

    :cond_3
    :goto_2
    new-array v3, v8, [C

    goto :goto_1

    :goto_3
    iget-object v3, p0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {v3, v1, v2, v10, v0}, Landroid/text/TextUtils;->getChars(Ljava/lang/CharSequence;II[CI)V

    invoke-static {v10, v0, v8}, Ljava/text/Bidi;->requiresBidi([CII)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    invoke-virtual {p0, p1}, LN0/L;->j(I)Z

    move-result v9

    new-instance v0, Ljava/text/Bidi;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v3, v0

    move-object v4, v10

    invoke-direct/range {v3 .. v9}, Ljava/text/Bidi;-><init>([CI[BIII)V

    invoke-virtual {v0}, Ljava/text/Bidi;->getRunCount()I

    move-result v3

    if-ne v3, v2, :cond_5

    :cond_4
    move-object v0, v1

    :cond_5
    iget-object v3, p0, LN0/L;->c:Ljava/util/List;

    invoke-interface {v3, p1, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, LN0/L;->d:[Z

    aput-boolean v2, v3, p1

    if-eqz v0, :cond_7

    iget-object p1, p0, LN0/L;->e:[C

    if-ne v10, p1, :cond_6

    move-object v10, v1

    goto :goto_4

    :cond_6
    move-object v10, p1

    :cond_7
    :goto_4
    iput-object v10, p0, LN0/L;->e:[C

    return-object v0
.end method

.method public final c(IZZ)F
    .locals 16

    .prologue
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    if-nez v2, :cond_0

    invoke-direct/range {p0 .. p2}, LN0/L;->b(IZ)F

    move-result v1

    return v1

    :cond_0
    iget-object v3, v0, LN0/L;->a:Landroid/text/Layout;

    invoke-static {v3, v1, v2}, LN0/K;->a(Landroid/text/Layout;IZ)I

    move-result v3

    iget-object v4, v0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v4, v3}, Landroid/text/Layout;->getLineStart(I)I

    move-result v4

    iget-object v5, v0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v5, v3}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v5

    if-eq v1, v4, :cond_1

    if-eq v1, v5, :cond_1

    invoke-direct/range {p0 .. p2}, LN0/L;->b(IZ)F

    move-result v1

    return v1

    :cond_1
    if-eqz v1, :cond_21

    iget-object v6, v0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v6}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ne v1, v6, :cond_2

    goto/16 :goto_e

    :cond_2
    invoke-virtual {v0, v1, v2}, LN0/L;->f(IZ)I

    move-result v2

    invoke-virtual {v0, v2}, LN0/L;->j(I)Z

    move-result v6

    invoke-direct {v0, v5, v4}, LN0/L;->k(II)I

    move-result v5

    invoke-virtual {v0, v2}, LN0/L;->h(I)I

    move-result v7

    sub-int v8, v4, v7

    sub-int v7, v5, v7

    invoke-virtual {v0, v2}, LN0/L;->a(I)Ljava/text/Bidi;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2, v8, v7}, Ljava/text/Bidi;->createLineBidi(II)Ljava/text/Bidi;

    move-result-object v2

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v2, :cond_1a

    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    move-result v9

    if-ne v9, v8, :cond_4

    goto/16 :goto_a

    :cond_4
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    move-result v9

    new-array v10, v9, [LN0/L$a;

    move v11, v7

    :goto_1
    if-ge v11, v9, :cond_6

    new-instance v12, LN0/L$a;

    invoke-virtual {v2, v11}, Ljava/text/Bidi;->getRunStart(I)I

    move-result v13

    add-int/2addr v13, v4

    invoke-virtual {v2, v11}, Ljava/text/Bidi;->getRunLimit(I)I

    move-result v14

    add-int/2addr v14, v4

    invoke-virtual {v2, v11}, Ljava/text/Bidi;->getRunLevel(I)I

    move-result v15

    rem-int/lit8 v15, v15, 0x2

    if-ne v15, v8, :cond_5

    move v15, v8

    goto :goto_2

    :cond_5
    move v15, v7

    :goto_2
    invoke-direct {v12, v13, v14, v15}, LN0/L$a;-><init>(IIZ)V

    aput-object v12, v10, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_6
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    move-result v11

    new-array v12, v11, [B

    move v13, v7

    :goto_3
    if-ge v13, v11, :cond_7

    invoke-virtual {v2, v13}, Ljava/text/Bidi;->getRunLevel(I)I

    move-result v14

    int-to-byte v14, v14

    aput-byte v14, v12, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    :cond_7
    invoke-static {v12, v7, v10, v7, v9}, Ljava/text/Bidi;->reorderVisually([BI[Ljava/lang/Object;II)V

    const/4 v2, -0x1

    if-ne v1, v4, :cond_10

    move v4, v7

    :goto_4
    if-ge v4, v9, :cond_9

    aget-object v5, v10, v4

    invoke-virtual {v5}, LN0/L$a;->b()I

    move-result v5

    if-ne v5, v1, :cond_8

    move v2, v4

    goto :goto_5

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_9
    :goto_5
    aget-object v1, v10, v2

    if-nez p2, :cond_a

    invoke-virtual {v1}, LN0/L$a;->c()Z

    move-result v1

    if-ne v6, v1, :cond_c

    :cond_a
    if-nez v6, :cond_b

    move v6, v8

    goto :goto_6

    :cond_b
    move v6, v7

    :cond_c
    :goto_6
    if-nez v2, :cond_d

    if-eqz v6, :cond_d

    iget-object v1, v0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v1

    return v1

    :cond_d
    invoke-static {v10}, Lj7/n;->e0([Ljava/lang/Object;)I

    move-result v1

    if-ne v2, v1, :cond_e

    if-nez v6, :cond_e

    iget-object v1, v0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineRight(I)F

    move-result v1

    return v1

    :cond_e
    iget-object v1, v0, LN0/L;->a:Landroid/text/Layout;

    if-eqz v6, :cond_f

    sub-int/2addr v2, v8

    aget-object v2, v10, v2

    invoke-virtual {v2}, LN0/L$a;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v1

    return v1

    :cond_f
    add-int/2addr v2, v8

    aget-object v2, v10, v2

    invoke-virtual {v2}, LN0/L$a;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v1

    return v1

    :cond_10
    if-le v1, v5, :cond_11

    invoke-direct {v0, v1, v4}, LN0/L;->k(II)I

    move-result v1

    :cond_11
    move v4, v7

    :goto_7
    if-ge v4, v9, :cond_13

    aget-object v5, v10, v4

    invoke-virtual {v5}, LN0/L$a;->a()I

    move-result v5

    if-ne v5, v1, :cond_12

    move v2, v4

    goto :goto_8

    :cond_12
    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_13
    :goto_8
    aget-object v1, v10, v2

    if-nez p2, :cond_16

    invoke-virtual {v1}, LN0/L$a;->c()Z

    move-result v1

    if-ne v6, v1, :cond_14

    goto :goto_9

    :cond_14
    if-nez v6, :cond_15

    move v6, v8

    goto :goto_9

    :cond_15
    move v6, v7

    :cond_16
    :goto_9
    if-nez v2, :cond_17

    if-eqz v6, :cond_17

    iget-object v1, v0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v1

    return v1

    :cond_17
    invoke-static {v10}, Lj7/n;->e0([Ljava/lang/Object;)I

    move-result v1

    if-ne v2, v1, :cond_18

    if-nez v6, :cond_18

    iget-object v1, v0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineRight(I)F

    move-result v1

    return v1

    :cond_18
    iget-object v1, v0, LN0/L;->a:Landroid/text/Layout;

    if-eqz v6, :cond_19

    sub-int/2addr v2, v8

    aget-object v2, v10, v2

    invoke-virtual {v2}, LN0/L$a;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v1

    return v1

    :cond_19
    add-int/2addr v2, v8

    aget-object v2, v10, v2

    invoke-virtual {v2}, LN0/L$a;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v1

    return v1

    :cond_1a
    :goto_a
    iget-object v2, v0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v2, v4}, Landroid/text/Layout;->isRtlCharAt(I)Z

    move-result v2

    if-nez p2, :cond_1b

    if-ne v6, v2, :cond_1d

    :cond_1b
    if-nez v6, :cond_1c

    move v6, v8

    goto :goto_b

    :cond_1c
    move v6, v7

    :cond_1d
    :goto_b
    if-ne v1, v4, :cond_1e

    move v7, v6

    goto :goto_c

    :cond_1e
    if-nez v6, :cond_1f

    move v7, v8

    :cond_1f
    :goto_c
    iget-object v1, v0, LN0/L;->a:Landroid/text/Layout;

    if-eqz v7, :cond_20

    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v1

    goto :goto_d

    :cond_20
    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineRight(I)F

    move-result v1

    :goto_d
    return v1

    :cond_21
    :goto_e
    invoke-direct/range {p0 .. p2}, LN0/L;->b(IZ)F

    move-result v1

    return v1
.end method

.method public final d(I)[LN0/L$a;
    .locals 11

    .prologue
    const/4 v0, 0x1

    iget-object v1, p0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineStart(I)I

    move-result v1

    iget-object v2, p0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v2, p1}, Landroid/text/Layout;->getLineEnd(I)I

    move-result p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {p0, v1, v3, v4, v2}, LN0/L;->g(LN0/L;IZILjava/lang/Object;)I

    move-result v2

    invoke-virtual {p0, v2}, LN0/L;->h(I)I

    move-result v5

    sub-int v6, v1, v5

    sub-int v5, p1, v5

    invoke-virtual {p0, v2}, LN0/L;->a(I)Ljava/text/Bidi;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2, v6, v5}, Ljava/text/Bidi;->createLineBidi(II)Ljava/text/Bidi;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    move-result p1

    new-array v5, p1, [LN0/L$a;

    move v6, v3

    :goto_0
    if-ge v6, p1, :cond_2

    new-instance v7, LN0/L$a;

    invoke-virtual {v2, v6}, Ljava/text/Bidi;->getRunStart(I)I

    move-result v8

    add-int/2addr v8, v1

    invoke-virtual {v2, v6}, Ljava/text/Bidi;->getRunLimit(I)I

    move-result v9

    add-int/2addr v9, v1

    invoke-virtual {v2, v6}, Ljava/text/Bidi;->getRunLevel(I)I

    move-result v10

    rem-int/2addr v10, v4

    if-ne v10, v0, :cond_1

    move v10, v0

    goto :goto_1

    :cond_1
    move v10, v3

    :goto_1
    invoke-direct {v7, v8, v9, v10}, LN0/L$a;-><init>(IIZ)V

    aput-object v7, v5, v6

    add-int/2addr v6, v0

    goto :goto_0

    :cond_2
    return-object v5

    :cond_3
    :goto_2
    new-instance v2, LN0/L$a;

    iget-object v4, p0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v4, v1}, Landroid/text/Layout;->isRtlCharAt(I)Z

    move-result v4

    invoke-direct {v2, v1, p1, v4}, LN0/L$a;-><init>(IIZ)V

    new-array p1, v0, [LN0/L$a;

    aput-object v2, p1, v3

    return-object p1
.end method

.method public final e(I)I
    .locals 2

    iget-object v0, p0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v0

    iget-object v1, p0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineStart(I)I

    move-result p1

    invoke-direct {p0, v0, p1}, LN0/L;->k(II)I

    move-result p1

    return p1
.end method

.method public final f(IZ)I
    .locals 6

    .prologue
    iget-object v0, p0, LN0/L;->b:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lj7/v;->l(Ljava/util/List;Ljava/lang/Comparable;IIILjava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    add-int/lit8 v0, v0, 0x1

    neg-int v0, v0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    :goto_0
    if-eqz p2, :cond_1

    if-lez v0, :cond_1

    iget-object p2, p0, LN0/L;->b:Ljava/util/List;

    add-int/lit8 v1, v0, -0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    if-ne p1, p2, :cond_1

    return v1

    :cond_1
    return v0
.end method

.method public final h(I)I
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LN0/L;->b:Ljava/util/List;

    add-int/lit8 p1, p1, -0x1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    :goto_0
    return p1
.end method

.method public final i(C)Z
    .locals 1

    .prologue
    const/16 v0, 0x20

    if-eq p1, v0, :cond_2

    const/16 v0, 0xa

    if-eq p1, v0, :cond_2

    const/16 v0, 0x1680

    if-eq p1, v0, :cond_2

    const/16 v0, 0x2000

    invoke-static {p1, v0}, Ly7/t;->g(II)I

    move-result v0

    if-ltz v0, :cond_0

    const/16 v0, 0x200a

    invoke-static {p1, v0}, Ly7/t;->g(II)I

    move-result v0

    if-gtz v0, :cond_0

    const/16 v0, 0x2007

    if-ne p1, v0, :cond_2

    :cond_0
    const/16 v0, 0x205f

    if-eq p1, v0, :cond_2

    const/16 v0, 0x3000

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final j(I)Z
    .locals 1

    .prologue
    iget-object v0, p0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {p0, p1}, LN0/L;->h(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result p1

    iget-object v0, p0, LN0/L;->a:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
