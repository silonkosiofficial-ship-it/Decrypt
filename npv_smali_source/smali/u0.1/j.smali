.class public final Lu0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/ArrayList;

.field private b:[F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x40

    new-array v0, v0, [F

    iput-object v0, p0, Lu0/j;->b:[F

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lu0/j;
    .locals 1

    .prologue
    iget-object v0, p0, Lu0/j;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lu0/j;->a:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :goto_0
    invoke-virtual {p0, p1, v0}, Lu0/j;->b(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    return-object p0
.end method

.method public final b(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 10

    .prologue
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/16 v3, 0x20

    if-ge v2, v0, :cond_0

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4, v3}, Ly7/t;->g(II)I

    move-result v4

    if-gtz v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-le v0, v2, :cond_1

    add-int/lit8 v4, v0, -0x1

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4, v3}, Ly7/t;->g(II)I

    move-result v4

    if-gtz v4, :cond_1

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_2
    if-ge v2, v0, :cond_c

    :goto_3
    add-int/lit8 v5, v2, 0x1

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    or-int/lit8 v6, v2, 0x20

    add-int/lit8 v7, v6, -0x61

    add-int/lit8 v8, v6, -0x7a

    mul-int/2addr v7, v8

    if-gtz v7, :cond_2

    const/16 v7, 0x65

    if-eq v6, v7, :cond_2

    goto :goto_4

    :cond_2
    if-lt v5, v0, :cond_b

    move v2, v1

    :goto_4
    if-eqz v2, :cond_a

    or-int/lit8 v6, v2, 0x20

    const/16 v7, 0x7a

    if-eq v6, v7, :cond_9

    move v4, v1

    :goto_5
    if-ge v5, v0, :cond_3

    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6, v3}, Ly7/t;->g(II)I

    move-result v6

    if-gtz v6, :cond_3

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_3
    invoke-static {p1, v5, v0}, Lu0/b;->a(Ljava/lang/String;II)J

    move-result-wide v5

    ushr-long v7, v5, v3

    long-to-int v7, v7

    const-wide v8, 0xffffffffL

    and-long/2addr v5, v8

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_5

    iget-object v6, p0, Lu0/j;->b:[F

    add-int/lit8 v8, v4, 0x1

    aput v5, v6, v4

    array-length v4, v6

    if-lt v8, v4, :cond_4

    mul-int/lit8 v4, v8, 0x2

    new-array v4, v4, [F

    iput-object v4, p0, Lu0/j;->b:[F

    array-length v9, v6

    invoke-static {v6, v4, v1, v1, v9}, Lj7/n;->i([F[FIII)[F

    :cond_4
    move v4, v8

    :cond_5
    :goto_6
    if-ge v7, v0, :cond_6

    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v8, 0x2c

    if-ne v6, v8, :cond_6

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_6
    if-ge v7, v0, :cond_8

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_7

    :cond_7
    move v5, v7

    goto :goto_5

    :cond_8
    :goto_7
    move v5, v7

    :cond_9
    iget-object v6, p0, Lu0/j;->b:[F

    invoke-static {v2, p2, v6, v4}, Lu0/i;->a(CLjava/util/ArrayList;[FI)V

    :cond_a
    move v2, v5

    goto :goto_2

    :cond_b
    move v2, v5

    goto :goto_3

    :cond_c
    return-object p2
.end method

.method public final c()Ljava/util/List;
    .locals 1

    .prologue
    iget-object v0, p0, Lu0/j;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0
.end method
