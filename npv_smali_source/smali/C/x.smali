.class public final LC/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:[LC/v;

.field private final c:LC/G;

.field private final d:Ljava/util/List;

.field private final e:Z

.field private final f:I

.field private final g:I

.field private final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I[LC/v;LC/G;Ljava/util/List;ZI)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LC/x;->a:I

    iput-object p2, p0, LC/x;->b:[LC/v;

    iput-object p3, p0, LC/x;->c:LC/G;

    iput-object p4, p0, LC/x;->d:Ljava/util/List;

    iput-boolean p5, p0, LC/x;->e:Z

    iput p6, p0, LC/x;->f:I

    array-length p1, p2

    const/4 p3, 0x0

    move p4, p3

    move p5, p4

    :goto_0
    if-ge p4, p1, :cond_0

    aget-object p6, p2, p4

    invoke-virtual {p6}, LC/v;->q()I

    move-result p6

    invoke-static {p5, p6}, Ljava/lang/Math;->max(II)I

    move-result p5

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_0
    iput p5, p0, LC/x;->g:I

    iget p1, p0, LC/x;->f:I

    add-int/2addr p5, p1

    invoke-static {p5, p3}, LE7/j;->d(II)I

    move-result p1

    iput p1, p0, LC/x;->h:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LC/x;->a:I

    return v0
.end method

.method public final b()[LC/v;
    .locals 1

    iget-object v0, p0, LC/x;->b:[LC/v;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, LC/x;->g:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LC/x;->h:I

    return v0
.end method

.method public final e()Z
    .locals 1

    .prologue
    iget-object v0, p0, LC/x;->b:[LC/v;

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final f(III)[LC/v;
    .locals 14

    .prologue
    move-object v0, p0

    iget-object v1, v0, LC/x;->b:[LC/v;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v6, v1, v3

    add-int/lit8 v13, v4, 0x1

    iget-object v7, v0, LC/x;->d:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC/c;

    invoke-virtual {v4}, LC/c;->g()J

    move-result-wide v7

    invoke-static {v7, v8}, LC/c;->d(J)I

    move-result v4

    iget-object v7, v0, LC/x;->c:LC/G;

    invoke-virtual {v7}, LC/G;->a()[I

    move-result-object v7

    aget v8, v7, v5

    iget-boolean v7, v0, LC/x;->e:Z

    if-eqz v7, :cond_0

    iget v9, v0, LC/x;->a:I

    move v11, v9

    goto :goto_1

    :cond_0
    move v11, v5

    :goto_1
    if-eqz v7, :cond_1

    move v12, v5

    goto :goto_2

    :cond_1
    iget v7, v0, LC/x;->a:I

    move v12, v7

    :goto_2
    move v7, p1

    move/from16 v9, p2

    move/from16 v10, p3

    invoke-virtual/range {v6 .. v12}, LC/v;->u(IIIIII)V

    sget-object v6, Li7/M;->a:Li7/M;

    add-int/2addr v5, v4

    add-int/lit8 v3, v3, 0x1

    move v4, v13

    goto :goto_0

    :cond_2
    iget-object v1, v0, LC/x;->b:[LC/v;

    return-object v1
.end method
