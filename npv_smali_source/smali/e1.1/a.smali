.class public Le1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le1/b$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le1/a$a;
    }
.end annotation


# static fields
.field public static final m:Le1/a$a;

.field public static final n:I


# instance fields
.field private a:I

.field private b:Le1/b;

.field private c:Le1/c;

.field private d:I

.field private e:Le1/i;

.field private f:[I

.field private g:[I

.field private h:[F

.field private i:I

.field private j:I

.field private k:Z

.field private final l:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le1/a$a;-><init>(Ly7/k;)V

    sput-object v0, Le1/a;->m:Le1/a$a;

    const/16 v0, 0x8

    sput v0, Le1/a;->n:I

    return-void
.end method

.method public constructor <init>(Le1/b;Le1/c;)V
    .locals 1

    const-string v0, "arrayRow"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cache"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le1/a;->b:Le1/b;

    iput-object p2, p0, Le1/a;->c:Le1/c;

    const/16 p1, 0x8

    iput p1, p0, Le1/a;->d:I

    new-array p2, p1, [I

    iput-object p2, p0, Le1/a;->f:[I

    new-array p2, p1, [I

    iput-object p2, p0, Le1/a;->g:[I

    new-array p1, p1, [F

    iput-object p1, p0, Le1/a;->h:[F

    const/4 p1, -0x1

    iput p1, p0, Le1/a;->i:I

    iput p1, p0, Le1/a;->j:I

    const p1, 0x3a83126f    # 0.001f

    iput p1, p0, Le1/a;->l:F

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Le1/a;->a:I

    return v0
.end method

.method public b(I)Le1/i;
    .locals 3

    .prologue
    iget v0, p0, Le1/a;->i:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget v2, p0, Le1/a;->a:I

    if-ge v1, v2, :cond_1

    if-ne v1, p1, :cond_0

    iget-object p1, p0, Le1/a;->c:Le1/c;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/c;->b()[Le1/i;

    move-result-object p1

    iget-object v1, p0, Le1/a;->f:[I

    aget v0, v1, v0

    aget-object p1, p1, v0

    return-object p1

    :cond_0
    iget-object v2, p0, Le1/a;->g:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public c()V
    .locals 5

    .prologue
    iget v0, p0, Le1/a;->i:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    iget v3, p0, Le1/a;->a:I

    if-ge v1, v3, :cond_0

    iget-object v3, p0, Le1/a;->h:[F

    aget v4, v3, v0

    int-to-float v2, v2

    mul-float/2addr v4, v2

    aput v4, v3, v0

    iget-object v2, p0, Le1/a;->g:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public clear()V
    .locals 5

    .prologue
    iget v0, p0, Le1/a;->i:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, -0x1

    if-eq v0, v3, :cond_1

    iget v4, p0, Le1/a;->a:I

    if-ge v2, v4, :cond_1

    iget-object v3, p0, Le1/a;->c:Le1/c;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Le1/c;->b()[Le1/i;

    move-result-object v3

    iget-object v4, p0, Le1/a;->f:[I

    aget v4, v4, v0

    aget-object v3, v3, v4

    if-eqz v3, :cond_0

    iget-object v4, p0, Le1/a;->b:Le1/b;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Le1/i;->B(Le1/b;)V

    :cond_0
    iget-object v3, p0, Le1/a;->g:[I

    aget v0, v3, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iput v3, p0, Le1/a;->i:I

    iput v3, p0, Le1/a;->j:I

    iput-boolean v1, p0, Le1/a;->k:Z

    iput v1, p0, Le1/a;->a:I

    return-void
.end method

.method public d(I)F
    .locals 3

    .prologue
    iget v0, p0, Le1/a;->i:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget v2, p0, Le1/a;->a:I

    if-ge v1, v2, :cond_1

    if-ne v1, p1, :cond_0

    iget-object p1, p0, Le1/a;->h:[F

    aget p1, p1, v0

    return p1

    :cond_0
    iget-object v2, p0, Le1/a;->g:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public e(F)V
    .locals 4

    .prologue
    iget v0, p0, Le1/a;->i:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    iget v2, p0, Le1/a;->a:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Le1/a;->h:[F

    aget v3, v2, v0

    div-float/2addr v3, p1

    aput v3, v2, v0

    iget-object v2, p0, Le1/a;->g:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public f(Le1/i;)Z
    .locals 6

    .prologue
    iget v0, p0, Le1/a;->i:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    move v3, v1

    :goto_0
    if-eq v0, v2, :cond_2

    iget v4, p0, Le1/a;->a:I

    if-ge v3, v4, :cond_2

    iget-object v4, p0, Le1/a;->f:[I

    aget v4, v4, v0

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/i;->o()I

    move-result v5

    if-ne v4, v5, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    iget-object v4, p0, Le1/a;->g:[I

    aget v0, v4, v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public g(Le1/i;)F
    .locals 4

    .prologue
    iget v0, p0, Le1/a;->i:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget v2, p0, Le1/a;->a:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Le1/a;->f:[I

    aget v2, v2, v0

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/i;->o()I

    move-result v3

    if-ne v2, v3, :cond_0

    iget-object p1, p0, Le1/a;->h:[F

    aget p1, p1, v0

    return p1

    :cond_0
    iget-object v2, p0, Le1/a;->g:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public h(Le1/i;FZ)V
    .locals 8

    .prologue
    iget v0, p0, Le1/a;->l:F

    neg-float v1, v0

    cmpl-float v1, p2, v1

    if-lez v1, :cond_0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Le1/a;->i:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-ne v0, v2, :cond_2

    iput v1, p0, Le1/a;->i:I

    iget-object p3, p0, Le1/a;->h:[F

    aput p2, p3, v1

    iget-object p2, p0, Le1/a;->f:[I

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/i;->o()I

    move-result p3

    aput p3, p2, v1

    iget-object p2, p0, Le1/a;->g:[I

    iget p3, p0, Le1/a;->i:I

    aput v2, p2, p3

    invoke-virtual {p1}, Le1/i;->z()I

    move-result p2

    add-int/2addr p2, v3

    invoke-virtual {p1, p2}, Le1/i;->M(I)V

    iget-object p2, p0, Le1/a;->b:Le1/b;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Le1/i;->i(Le1/b;)V

    iget p1, p0, Le1/a;->a:I

    add-int/2addr p1, v3

    iput p1, p0, Le1/a;->a:I

    iget-boolean p1, p0, Le1/a;->k:Z

    if-nez p1, :cond_1

    iget p1, p0, Le1/a;->j:I

    add-int/2addr p1, v3

    iput p1, p0, Le1/a;->j:I

    iget-object p2, p0, Le1/a;->f:[I

    array-length p3, p2

    if-lt p1, p3, :cond_1

    iput-boolean v3, p0, Le1/a;->k:Z

    array-length p1, p2

    sub-int/2addr p1, v3

    iput p1, p0, Le1/a;->j:I

    :cond_1
    return-void

    :cond_2
    move v4, v1

    move v5, v2

    :goto_0
    if-eq v0, v2, :cond_a

    iget v6, p0, Le1/a;->a:I

    if-ge v4, v6, :cond_a

    iget-object v6, p0, Le1/a;->f:[I

    aget v6, v6, v0

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/i;->o()I

    move-result v7

    if-ne v6, v7, :cond_8

    iget-object v1, p0, Le1/a;->h:[F

    aget v3, v1, v0

    add-float/2addr v3, p2

    iget p2, p0, Le1/a;->l:F

    neg-float v4, p2

    cmpl-float v4, v3, v4

    const/4 v6, 0x0

    if-lez v4, :cond_3

    cmpg-float p2, v3, p2

    if-gez p2, :cond_3

    move v3, v6

    :cond_3
    aput v3, v1, v0

    cmpg-float p2, v3, v6

    if-nez p2, :cond_7

    iget p2, p0, Le1/a;->i:I

    if-ne v0, p2, :cond_4

    iget-object p2, p0, Le1/a;->g:[I

    aget p2, p2, v0

    iput p2, p0, Le1/a;->i:I

    goto :goto_1

    :cond_4
    iget-object p2, p0, Le1/a;->g:[I

    aget v1, p2, v0

    aput v1, p2, v5

    :goto_1
    if-eqz p3, :cond_5

    iget-object p2, p0, Le1/a;->b:Le1/b;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Le1/i;->B(Le1/b;)V

    :cond_5
    iget-boolean p2, p0, Le1/a;->k:Z

    if-eqz p2, :cond_6

    iput v0, p0, Le1/a;->j:I

    :cond_6
    invoke-virtual {p1}, Le1/i;->z()I

    move-result p2

    add-int/2addr p2, v2

    invoke-virtual {p1, p2}, Le1/i;->M(I)V

    iget p1, p0, Le1/a;->a:I

    add-int/2addr p1, v2

    iput p1, p0, Le1/a;->a:I

    :cond_7
    return-void

    :cond_8
    iget-object v6, p0, Le1/a;->f:[I

    aget v6, v6, v0

    invoke-virtual {p1}, Le1/i;->o()I

    move-result v7

    if-ge v6, v7, :cond_9

    move v5, v0

    :cond_9
    iget-object v6, p0, Le1/a;->g:[I

    aget v0, v6, v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_a
    iget p3, p0, Le1/a;->j:I

    add-int/lit8 v0, p3, 0x1

    iget-boolean v4, p0, Le1/a;->k:Z

    if-eqz v4, :cond_c

    iget-object v0, p0, Le1/a;->f:[I

    aget v4, v0, p3

    if-ne v4, v2, :cond_b

    goto :goto_2

    :cond_b
    array-length p3, v0

    :goto_2
    move v0, p3

    :cond_c
    iget-object p3, p0, Le1/a;->f:[I

    array-length v4, p3

    if-lt v0, v4, :cond_e

    iget v4, p0, Le1/a;->a:I

    array-length v6, p3

    if-ge v4, v6, :cond_e

    array-length p3, p3

    move v4, v1

    :goto_3
    if-ge v4, p3, :cond_e

    iget-object v6, p0, Le1/a;->f:[I

    aget v6, v6, v4

    if-ne v6, v2, :cond_d

    move v0, v4

    goto :goto_4

    :cond_d
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_e
    :goto_4
    iget-object p3, p0, Le1/a;->f:[I

    array-length v4, p3

    if-lt v0, v4, :cond_f

    array-length v0, p3

    iget p3, p0, Le1/a;->d:I

    mul-int/lit8 p3, p3, 0x2

    iput p3, p0, Le1/a;->d:I

    iput-boolean v1, p0, Le1/a;->k:Z

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Le1/a;->j:I

    iget-object v1, p0, Le1/a;->h:[F

    invoke-static {v1, p3}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object p3

    const-string v1, "copyOf(...)"

    invoke-static {p3, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Le1/a;->h:[F

    iget-object p3, p0, Le1/a;->f:[I

    iget v4, p0, Le1/a;->d:I

    invoke-static {p3, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p3

    invoke-static {p3, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Le1/a;->f:[I

    iget-object p3, p0, Le1/a;->g:[I

    iget v4, p0, Le1/a;->d:I

    invoke-static {p3, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p3

    invoke-static {p3, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Le1/a;->g:[I

    :cond_f
    iget-object p3, p0, Le1/a;->f:[I

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/i;->o()I

    move-result v1

    aput v1, p3, v0

    iget-object p3, p0, Le1/a;->h:[F

    aput p2, p3, v0

    iget-object p2, p0, Le1/a;->g:[I

    if-eq v5, v2, :cond_10

    aget p3, p2, v5

    aput p3, p2, v0

    aput v0, p2, v5

    goto :goto_5

    :cond_10
    iget p3, p0, Le1/a;->i:I

    aput p3, p2, v0

    iput v0, p0, Le1/a;->i:I

    :goto_5
    invoke-virtual {p1}, Le1/i;->z()I

    move-result p2

    add-int/2addr p2, v3

    invoke-virtual {p1, p2}, Le1/i;->M(I)V

    iget-object p2, p0, Le1/a;->b:Le1/b;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Le1/i;->i(Le1/b;)V

    iget p1, p0, Le1/a;->a:I

    add-int/2addr p1, v3

    iput p1, p0, Le1/a;->a:I

    iget-boolean p1, p0, Le1/a;->k:Z

    if-nez p1, :cond_11

    iget p1, p0, Le1/a;->j:I

    add-int/2addr p1, v3

    iput p1, p0, Le1/a;->j:I

    :cond_11
    iget p1, p0, Le1/a;->j:I

    iget-object p2, p0, Le1/a;->f:[I

    array-length p3, p2

    if-lt p1, p3, :cond_12

    iput-boolean v3, p0, Le1/a;->k:Z

    array-length p1, p2

    sub-int/2addr p1, v3

    iput p1, p0, Le1/a;->j:I

    :cond_12
    return-void
.end method

.method public i(Le1/i;F)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    cmpg-float v0, p2, v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, v1}, Le1/a;->k(Le1/i;Z)F

    return-void

    :cond_0
    iget v0, p0, Le1/a;->i:I

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_2

    iput v2, p0, Le1/a;->i:I

    iget-object v0, p0, Le1/a;->h:[F

    aput p2, v0, v2

    iget-object p2, p0, Le1/a;->f:[I

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/i;->o()I

    move-result v0

    aput v0, p2, v2

    iget-object p2, p0, Le1/a;->g:[I

    iget v0, p0, Le1/a;->i:I

    aput v3, p2, v0

    invoke-virtual {p1}, Le1/i;->z()I

    move-result p2

    add-int/2addr p2, v1

    invoke-virtual {p1, p2}, Le1/i;->M(I)V

    iget-object p2, p0, Le1/a;->b:Le1/b;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Le1/i;->i(Le1/b;)V

    iget p1, p0, Le1/a;->a:I

    add-int/2addr p1, v1

    iput p1, p0, Le1/a;->a:I

    iget-boolean p1, p0, Le1/a;->k:Z

    if-nez p1, :cond_1

    iget p1, p0, Le1/a;->j:I

    add-int/2addr p1, v1

    iput p1, p0, Le1/a;->j:I

    iget-object p2, p0, Le1/a;->f:[I

    array-length v0, p2

    if-lt p1, v0, :cond_1

    iput-boolean v1, p0, Le1/a;->k:Z

    array-length p1, p2

    sub-int/2addr p1, v1

    iput p1, p0, Le1/a;->j:I

    :cond_1
    return-void

    :cond_2
    move v4, v2

    move v5, v3

    :goto_0
    if-eq v0, v3, :cond_5

    iget v6, p0, Le1/a;->a:I

    if-ge v4, v6, :cond_5

    iget-object v6, p0, Le1/a;->f:[I

    aget v6, v6, v0

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/i;->o()I

    move-result v7

    if-ne v6, v7, :cond_3

    iget-object p1, p0, Le1/a;->h:[F

    aput p2, p1, v0

    return-void

    :cond_3
    iget-object v6, p0, Le1/a;->f:[I

    aget v6, v6, v0

    invoke-virtual {p1}, Le1/i;->o()I

    move-result v7

    if-ge v6, v7, :cond_4

    move v5, v0

    :cond_4
    iget-object v6, p0, Le1/a;->g:[I

    aget v0, v6, v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    iget v0, p0, Le1/a;->j:I

    add-int/lit8 v4, v0, 0x1

    iget-boolean v6, p0, Le1/a;->k:Z

    if-eqz v6, :cond_7

    iget-object v4, p0, Le1/a;->f:[I

    aget v6, v4, v0

    if-ne v6, v3, :cond_6

    goto :goto_1

    :cond_6
    array-length v0, v4

    :goto_1
    move v4, v0

    :cond_7
    iget-object v0, p0, Le1/a;->f:[I

    array-length v6, v0

    if-lt v4, v6, :cond_9

    iget v6, p0, Le1/a;->a:I

    array-length v7, v0

    if-ge v6, v7, :cond_9

    array-length v0, v0

    move v6, v2

    :goto_2
    if-ge v6, v0, :cond_9

    iget-object v7, p0, Le1/a;->f:[I

    aget v7, v7, v6

    if-ne v7, v3, :cond_8

    move v4, v6

    goto :goto_3

    :cond_8
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_9
    :goto_3
    iget-object v0, p0, Le1/a;->f:[I

    array-length v6, v0

    if-lt v4, v6, :cond_a

    array-length v4, v0

    iget v0, p0, Le1/a;->d:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Le1/a;->d:I

    iput-boolean v2, p0, Le1/a;->k:Z

    add-int/lit8 v2, v4, -0x1

    iput v2, p0, Le1/a;->j:I

    iget-object v2, p0, Le1/a;->h:[F

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    const-string v2, "copyOf(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Le1/a;->h:[F

    iget-object v0, p0, Le1/a;->f:[I

    iget v6, p0, Le1/a;->d:I

    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Le1/a;->f:[I

    iget-object v0, p0, Le1/a;->g:[I

    iget v6, p0, Le1/a;->d:I

    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Le1/a;->g:[I

    :cond_a
    iget-object v0, p0, Le1/a;->f:[I

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/i;->o()I

    move-result v2

    aput v2, v0, v4

    iget-object v0, p0, Le1/a;->h:[F

    aput p2, v0, v4

    iget-object p2, p0, Le1/a;->g:[I

    if-eq v5, v3, :cond_b

    aget v0, p2, v5

    aput v0, p2, v4

    aput v4, p2, v5

    goto :goto_4

    :cond_b
    iget v0, p0, Le1/a;->i:I

    aput v0, p2, v4

    iput v4, p0, Le1/a;->i:I

    :goto_4
    invoke-virtual {p1}, Le1/i;->z()I

    move-result p2

    add-int/2addr p2, v1

    invoke-virtual {p1, p2}, Le1/i;->M(I)V

    iget-object p2, p0, Le1/a;->b:Le1/b;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Le1/i;->i(Le1/b;)V

    iget p1, p0, Le1/a;->a:I

    add-int/2addr p1, v1

    iput p1, p0, Le1/a;->a:I

    iget-boolean p2, p0, Le1/a;->k:Z

    if-nez p2, :cond_c

    iget p2, p0, Le1/a;->j:I

    add-int/2addr p2, v1

    iput p2, p0, Le1/a;->j:I

    :cond_c
    iget-object p2, p0, Le1/a;->f:[I

    array-length v0, p2

    if-lt p1, v0, :cond_d

    iput-boolean v1, p0, Le1/a;->k:Z

    :cond_d
    iget p1, p0, Le1/a;->j:I

    array-length v0, p2

    if-lt p1, v0, :cond_e

    iput-boolean v1, p0, Le1/a;->k:Z

    array-length p1, p2

    sub-int/2addr p1, v1

    iput p1, p0, Le1/a;->j:I

    :cond_e
    return-void
.end method

.method public j(Le1/b;Z)F
    .locals 5

    .prologue
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/b;->u()Le1/i;

    move-result-object v0

    invoke-virtual {p0, v0}, Le1/a;->g(Le1/i;)F

    move-result v0

    invoke-virtual {p1}, Le1/b;->u()Le1/i;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Le1/a;->k(Le1/i;Z)F

    invoke-virtual {p1}, Le1/b;->v()Le1/b$a;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1}, Le1/b$a;->a()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {p1, v2}, Le1/b$a;->b(I)Le1/i;

    move-result-object v3

    invoke-interface {p1, v3}, Le1/b$a;->g(Le1/i;)F

    move-result v4

    mul-float/2addr v4, v0

    invoke-virtual {p0, v3, v4, p2}, Le1/a;->h(Le1/i;FZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public k(Le1/i;Z)F
    .locals 8

    .prologue
    iget-object v0, p0, Le1/a;->e:Le1/i;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Le1/a;->e:Le1/i;

    :cond_0
    iget v0, p0, Le1/a;->i:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    return v1

    :cond_1
    const/4 v3, 0x0

    move v4, v2

    :goto_0
    if-eq v0, v2, :cond_6

    iget v5, p0, Le1/a;->a:I

    if-ge v3, v5, :cond_6

    iget-object v5, p0, Le1/a;->f:[I

    aget v5, v5, v0

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/i;->o()I

    move-result v6

    if-ne v5, v6, :cond_5

    iget v1, p0, Le1/a;->i:I

    if-ne v0, v1, :cond_2

    iget-object v1, p0, Le1/a;->g:[I

    aget v1, v1, v0

    iput v1, p0, Le1/a;->i:I

    goto :goto_1

    :cond_2
    iget-object v1, p0, Le1/a;->g:[I

    aget v3, v1, v0

    aput v3, v1, v4

    :goto_1
    if-eqz p2, :cond_3

    iget-object p2, p0, Le1/a;->b:Le1/b;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Le1/i;->B(Le1/b;)V

    :cond_3
    invoke-virtual {p1}, Le1/i;->z()I

    move-result p2

    add-int/2addr p2, v2

    invoke-virtual {p1, p2}, Le1/i;->M(I)V

    iget p1, p0, Le1/a;->a:I

    add-int/2addr p1, v2

    iput p1, p0, Le1/a;->a:I

    iget-object p1, p0, Le1/a;->f:[I

    aput v2, p1, v0

    iget-boolean p1, p0, Le1/a;->k:Z

    if-eqz p1, :cond_4

    iput v0, p0, Le1/a;->j:I

    :cond_4
    iget-object p1, p0, Le1/a;->h:[F

    aget p1, p1, v0

    return p1

    :cond_5
    iget-object v4, p0, Le1/a;->g:[I

    aget v4, v4, v0

    add-int/lit8 v3, v3, 0x1

    move v7, v4

    move v4, v0

    move v0, v7

    goto :goto_0

    :cond_6
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    iget v0, p0, Le1/a;->i:I

    const-string v1, ""

    const/4 v2, 0x0

    :goto_0
    const/4 v3, -0x1

    if-eq v0, v3, :cond_0

    iget v3, p0, Le1/a;->a:I

    if-ge v2, v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Le1/a;->h:[F

    aget v3, v3, v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " : "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Le1/a;->c:Le1/c;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Le1/c;->b()[Le1/i;

    move-result-object v3

    iget-object v4, p0, Le1/a;->f:[I

    aget v4, v4, v0

    aget-object v3, v3, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Le1/a;->g:[I

    aget v0, v3, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
