.class public Le1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le1/b$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le1/j$a;
    }
.end annotation


# static fields
.field public static final n:Le1/j$a;

.field public static final o:I

.field private static final p:Z


# instance fields
.field private final a:I

.field private b:I

.field private final c:I

.field private d:[I

.field private e:[I

.field private f:[I

.field private g:[F

.field private h:[I

.field private i:[I

.field private j:I

.field private k:I

.field private final l:Le1/b;

.field private final m:Le1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le1/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le1/j$a;-><init>(Ly7/k;)V

    sput-object v0, Le1/j;->n:Le1/j$a;

    const/16 v0, 0x8

    sput v0, Le1/j;->o:I

    const/4 v0, 0x1

    sput-boolean v0, Le1/j;->p:Z

    return-void
.end method

.method public constructor <init>(Le1/b;Le1/c;)V
    .locals 3

    const-string v0, "cache"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Le1/j;->a:I

    const/16 v1, 0x10

    iput v1, p0, Le1/j;->b:I

    iput v1, p0, Le1/j;->c:I

    new-array v2, v1, [I

    iput-object v2, p0, Le1/j;->d:[I

    new-array v2, v1, [I

    iput-object v2, p0, Le1/j;->e:[I

    new-array v2, v1, [I

    iput-object v2, p0, Le1/j;->f:[I

    new-array v2, v1, [F

    iput-object v2, p0, Le1/j;->g:[F

    new-array v2, v1, [I

    iput-object v2, p0, Le1/j;->h:[I

    new-array v1, v1, [I

    iput-object v1, p0, Le1/j;->i:[I

    iput v0, p0, Le1/j;->k:I

    iput-object p1, p0, Le1/j;->l:Le1/b;

    iput-object p2, p0, Le1/j;->m:Le1/c;

    invoke-virtual {p0}, Le1/j;->clear()V

    return-void
.end method

.method private final l(Le1/i;I)V
    .locals 3

    .prologue
    invoke-virtual {p1}, Le1/i;->o()I

    move-result p1

    iget v0, p0, Le1/j;->c:I

    rem-int/2addr p1, v0

    iget-object v0, p0, Le1/j;->d:[I

    aget v1, v0, p1

    iget v2, p0, Le1/j;->a:I

    if-ne v1, v2, :cond_0

    aput p2, v0, p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Le1/j;->e:[I

    aget v0, p1, v1

    iget v2, p0, Le1/j;->a:I

    if-eq v0, v2, :cond_1

    move v1, v0

    goto :goto_0

    :cond_1
    aput p2, p1, v1

    :goto_1
    iget-object p1, p0, Le1/j;->e:[I

    iget v0, p0, Le1/j;->a:I

    aput v0, p1, p2

    return-void
.end method

.method private final m(ILe1/i;F)V
    .locals 2

    iget-object v0, p0, Le1/j;->f:[I

    invoke-virtual {p2}, Le1/i;->o()I

    move-result v1

    aput v1, v0, p1

    iget-object v0, p0, Le1/j;->g:[F

    aput p3, v0, p1

    iget-object p3, p0, Le1/j;->h:[I

    iget v0, p0, Le1/j;->a:I

    aput v0, p3, p1

    iget-object p3, p0, Le1/j;->i:[I

    aput v0, p3, p1

    iget-object p1, p0, Le1/j;->l:Le1/b;

    invoke-virtual {p2, p1}, Le1/i;->i(Le1/b;)V

    invoke-virtual {p2}, Le1/i;->z()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Le1/i;->M(I)V

    iget p1, p0, Le1/j;->j:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Le1/j;->j:I

    return-void
.end method

.method private final n()I
    .locals 4

    .prologue
    iget v0, p0, Le1/j;->b:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Le1/j;->f:[I

    aget v2, v2, v1

    iget v3, p0, Le1/j;->a:I

    if-ne v2, v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method private final o()V
    .locals 4

    .prologue
    iget v0, p0, Le1/j;->b:I

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Le1/j;->f:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    const-string v2, "copyOf(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Le1/j;->f:[I

    iget-object v1, p0, Le1/j;->g:[F

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Le1/j;->g:[F

    iget-object v1, p0, Le1/j;->h:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Le1/j;->h:[I

    iget-object v1, p0, Le1/j;->i:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Le1/j;->i:[I

    iget-object v1, p0, Le1/j;->e:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Le1/j;->e:[I

    iget v1, p0, Le1/j;->b:I

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Le1/j;->f:[I

    iget v3, p0, Le1/j;->a:I

    aput v3, v2, v1

    iget-object v2, p0, Le1/j;->e:[I

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput v0, p0, Le1/j;->b:I

    return-void
.end method

.method private final q(ILe1/i;F)V
    .locals 3

    .prologue
    invoke-direct {p0}, Le1/j;->n()I

    move-result v0

    invoke-direct {p0, v0, p2, p3}, Le1/j;->m(ILe1/i;F)V

    iget p3, p0, Le1/j;->a:I

    if-eq p1, p3, :cond_0

    iget-object v1, p0, Le1/j;->h:[I

    aput p1, v1, v0

    iget-object v1, p0, Le1/j;->i:[I

    aget v2, v1, p1

    aput v2, v1, v0

    aput v0, v1, p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Le1/j;->h:[I

    aput p3, p1, v0

    iget p1, p0, Le1/j;->j:I

    if-lez p1, :cond_1

    iget-object p1, p0, Le1/j;->i:[I

    iget v1, p0, Le1/j;->k:I

    aput v1, p1, v0

    iput v0, p0, Le1/j;->k:I

    goto :goto_0

    :cond_1
    iget-object p1, p0, Le1/j;->i:[I

    aput p3, p1, v0

    :goto_0
    iget-object p1, p0, Le1/j;->i:[I

    aget p1, p1, v0

    if-eq p1, p3, :cond_2

    iget-object p3, p0, Le1/j;->h:[I

    aput v0, p3, p1

    :cond_2
    invoke-direct {p0, p2, v0}, Le1/j;->l(Le1/i;I)V

    return-void
.end method

.method private final r(Le1/i;)V
    .locals 5

    .prologue
    invoke-virtual {p1}, Le1/i;->o()I

    move-result v0

    iget v1, p0, Le1/j;->c:I

    rem-int/2addr v0, v1

    iget-object v1, p0, Le1/j;->d:[I

    aget v1, v1, v0

    iget v2, p0, Le1/j;->a:I

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Le1/i;->o()I

    move-result p1

    iget-object v2, p0, Le1/j;->f:[I

    aget v2, v2, v1

    if-ne v2, p1, :cond_1

    iget-object p1, p0, Le1/j;->d:[I

    iget-object v2, p0, Le1/j;->e:[I

    aget v3, v2, v1

    aput v3, p1, v0

    iget p1, p0, Le1/j;->a:I

    aput p1, v2, v1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Le1/j;->e:[I

    aget v2, v0, v1

    iget v3, p0, Le1/j;->a:I

    if-eq v2, v3, :cond_2

    iget-object v4, p0, Le1/j;->f:[I

    aget v4, v4, v2

    if-eq v4, p1, :cond_2

    move v1, v2

    goto :goto_0

    :cond_2
    if-eq v2, v3, :cond_3

    iget-object v4, p0, Le1/j;->f:[I

    aget v4, v4, v2

    if-ne v4, p1, :cond_3

    aget p1, v0, v2

    aput p1, v0, v1

    aput v3, v0, v2

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Le1/j;->j:I

    return v0
.end method

.method public b(I)Le1/i;
    .locals 5

    .prologue
    iget v0, p0, Le1/j;->j:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget v2, p0, Le1/j;->k:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    if-ne v3, p1, :cond_1

    iget v4, p0, Le1/j;->a:I

    if-eq v2, v4, :cond_1

    iget-object p1, p0, Le1/j;->m:Le1/c;

    invoke-virtual {p1}, Le1/c;->b()[Le1/i;

    move-result-object p1

    iget-object v0, p0, Le1/j;->f:[I

    aget v0, v0, v2

    aget-object p1, p1, v0

    return-object p1

    :cond_1
    iget-object v4, p0, Le1/j;->i:[I

    aget v2, v4, v2

    iget v4, p0, Le1/j;->a:I

    if-ne v2, v4, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-object v1
.end method

.method public c()V
    .locals 6

    .prologue
    iget v0, p0, Le1/j;->j:I

    iget v1, p0, Le1/j;->k:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Le1/j;->g:[F

    aget v4, v3, v1

    const/4 v5, -0x1

    int-to-float v5, v5

    mul-float/2addr v4, v5

    aput v4, v3, v1

    iget-object v3, p0, Le1/j;->i:[I

    aget v1, v3, v1

    iget v3, p0, Le1/j;->a:I

    if-ne v1, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final clear()V
    .locals 5

    .prologue
    iget v0, p0, Le1/j;->j:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p0, v2}, Le1/j;->b(I)Le1/i;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v4, p0, Le1/j;->l:Le1/b;

    invoke-virtual {v3, v4}, Le1/i;->B(Le1/b;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Le1/j;->b:I

    move v2, v1

    :goto_1
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Le1/j;->f:[I

    iget v4, p0, Le1/j;->a:I

    aput v4, v3, v2

    iget-object v3, p0, Le1/j;->e:[I

    aput v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    iget v0, p0, Le1/j;->c:I

    move v2, v1

    :goto_2
    if-ge v2, v0, :cond_2

    iget-object v3, p0, Le1/j;->d:[I

    iget v4, p0, Le1/j;->a:I

    aput v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    iput v1, p0, Le1/j;->j:I

    const/4 v0, -0x1

    iput v0, p0, Le1/j;->k:I

    return-void
.end method

.method public d(I)F
    .locals 4

    .prologue
    iget v0, p0, Le1/j;->j:I

    iget v1, p0, Le1/j;->k:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    if-ne v2, p1, :cond_0

    iget-object p1, p0, Le1/j;->g:[F

    aget p1, p1, v1

    return p1

    :cond_0
    iget-object v3, p0, Le1/j;->i:[I

    aget v1, v3, v1

    iget v3, p0, Le1/j;->a:I

    if-ne v1, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public e(F)V
    .locals 5

    .prologue
    iget v0, p0, Le1/j;->j:I

    iget v1, p0, Le1/j;->k:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Le1/j;->g:[F

    aget v4, v3, v1

    div-float/2addr v4, p1

    aput v4, v3, v1

    iget-object v3, p0, Le1/j;->i:[I

    aget v1, v3, v1

    iget v3, p0, Le1/j;->a:I

    if-ne v1, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public f(Le1/i;)Z
    .locals 1

    .prologue
    invoke-virtual {p0, p1}, Le1/j;->p(Le1/i;)I

    move-result p1

    iget v0, p0, Le1/j;->a:I

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public g(Le1/i;)F
    .locals 1

    .prologue
    invoke-virtual {p0, p1}, Le1/j;->p(Le1/i;)I

    move-result p1

    iget v0, p0, Le1/j;->a:I

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Le1/j;->g:[F

    aget p1, v0, p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public h(Le1/i;FZ)V
    .locals 5

    .prologue
    const v0, -0x457ced91    # -0.001f

    cmpl-float v1, p2, v0

    const v2, 0x3a83126f    # 0.001f

    if-lez v1, :cond_0

    cmpg-float v1, p2, v2

    if-gez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Le1/j;->p(Le1/i;)I

    move-result v1

    iget v3, p0, Le1/j;->a:I

    if-ne v1, v3, :cond_1

    invoke-virtual {p0, p1, p2}, Le1/j;->i(Le1/i;F)V

    goto :goto_0

    :cond_1
    iget-object v3, p0, Le1/j;->g:[F

    aget v4, v3, v1

    add-float/2addr v4, p2

    aput v4, v3, v1

    cmpl-float p2, v4, v0

    if-lez p2, :cond_2

    cmpg-float p2, v4, v2

    if-gez p2, :cond_2

    const/4 p2, 0x0

    aput p2, v3, v1

    invoke-virtual {p0, p1, p3}, Le1/j;->k(Le1/i;Z)F

    :cond_2
    :goto_0
    return-void
.end method

.method public i(Le1/i;F)V
    .locals 6

    .prologue
    const v0, -0x457ced91    # -0.001f

    cmpl-float v0, p2, v0

    const/4 v1, 0x1

    if-lez v0, :cond_0

    const v0, 0x3a83126f    # 0.001f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    invoke-virtual {p0, p1, v1}, Le1/j;->k(Le1/i;Z)F

    return-void

    :cond_0
    iget v0, p0, Le1/j;->j:I

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, v2, p1, p2}, Le1/j;->m(ILe1/i;F)V

    invoke-direct {p0, p1, v2}, Le1/j;->l(Le1/i;I)V

    iput v2, p0, Le1/j;->k:I

    goto :goto_2

    :cond_1
    invoke-virtual {p0, p1}, Le1/j;->p(Le1/i;)I

    move-result v0

    iget v3, p0, Le1/j;->a:I

    if-eq v0, v3, :cond_2

    iget-object p1, p0, Le1/j;->g:[F

    aput p2, p1, v0

    goto :goto_2

    :cond_2
    iget v0, p0, Le1/j;->j:I

    add-int/2addr v0, v1

    iget v1, p0, Le1/j;->b:I

    if-lt v0, v1, :cond_3

    invoke-direct {p0}, Le1/j;->o()V

    :cond_3
    iget v0, p0, Le1/j;->j:I

    iget v1, p0, Le1/j;->k:I

    const/4 v3, -0x1

    :goto_0
    if-ge v2, v0, :cond_7

    iget-object v4, p0, Le1/j;->f:[I

    aget v4, v4, v1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/i;->o()I

    move-result v5

    if-ne v4, v5, :cond_4

    iget-object p1, p0, Le1/j;->g:[F

    aput p2, p1, v1

    return-void

    :cond_4
    iget-object v4, p0, Le1/j;->f:[I

    aget v4, v4, v1

    invoke-virtual {p1}, Le1/i;->o()I

    move-result v5

    if-ge v4, v5, :cond_5

    move v3, v1

    :cond_5
    iget-object v4, p0, Le1/j;->i:[I

    aget v1, v4, v1

    iget v4, p0, Le1/j;->a:I

    if-ne v1, v4, :cond_6

    goto :goto_1

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_7
    :goto_1
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, v3, p1, p2}, Le1/j;->q(ILe1/i;F)V

    :goto_2
    return-void
.end method

.method public j(Le1/b;Z)F
    .locals 7

    .prologue
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/b;->u()Le1/i;

    move-result-object v0

    invoke-virtual {p0, v0}, Le1/j;->g(Le1/i;)F

    move-result v0

    invoke-virtual {p1}, Le1/b;->u()Le1/i;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Le1/j;->k(Le1/i;Z)F

    invoke-virtual {p1}, Le1/b;->v()Le1/b$a;

    move-result-object p1

    check-cast p1, Le1/j;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/j;->a()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_1

    iget-object v4, p1, Le1/j;->f:[I

    aget v4, v4, v3

    iget v5, p0, Le1/j;->a:I

    if-eq v4, v5, :cond_0

    iget-object v4, p1, Le1/j;->g:[F

    aget v4, v4, v3

    iget-object v5, p0, Le1/j;->m:Le1/c;

    invoke-virtual {v5}, Le1/c;->b()[Le1/i;

    move-result-object v5

    iget-object v6, p1, Le1/j;->f:[I

    aget v6, v6, v3

    aget-object v5, v5, v6

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    mul-float/2addr v4, v0

    invoke-virtual {p0, v5, v4, p2}, Le1/j;->h(Le1/i;FZ)V

    add-int/lit8 v2, v2, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public k(Le1/i;Z)F
    .locals 7

    .prologue
    invoke-virtual {p0, p1}, Le1/j;->p(Le1/i;)I

    move-result v0

    iget v1, p0, Le1/j;->a:I

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Le1/j;->r(Le1/i;)V

    iget-object v1, p0, Le1/j;->g:[F

    aget v1, v1, v0

    iget v2, p0, Le1/j;->k:I

    if-ne v2, v0, :cond_1

    iget-object v2, p0, Le1/j;->i:[I

    aget v2, v2, v0

    iput v2, p0, Le1/j;->k:I

    :cond_1
    iget-object v2, p0, Le1/j;->f:[I

    iget v3, p0, Le1/j;->a:I

    aput v3, v2, v0

    iget-object v2, p0, Le1/j;->h:[I

    aget v4, v2, v0

    if-eq v4, v3, :cond_2

    iget-object v5, p0, Le1/j;->i:[I

    aget v6, v5, v0

    aput v6, v5, v4

    :cond_2
    iget-object v4, p0, Le1/j;->i:[I

    aget v4, v4, v0

    if-eq v4, v3, :cond_3

    aget v0, v2, v0

    aput v0, v2, v4

    :cond_3
    iget v0, p0, Le1/j;->j:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Le1/j;->j:I

    invoke-virtual {p1}, Le1/i;->z()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Le1/i;->M(I)V

    if-eqz p2, :cond_4

    iget-object p2, p0, Le1/j;->l:Le1/b;

    invoke-virtual {p1, p2}, Le1/i;->B(Le1/b;)V

    :cond_4
    return v1
.end method

.method public p(Le1/i;)I
    .locals 3

    .prologue
    iget v0, p0, Le1/j;->j:I

    if-eqz v0, :cond_6

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Le1/i;->o()I

    move-result p1

    iget v0, p0, Le1/j;->c:I

    rem-int v0, p1, v0

    iget-object v1, p0, Le1/j;->d:[I

    aget v0, v1, v0

    iget v1, p0, Le1/j;->a:I

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    iget-object v1, p0, Le1/j;->f:[I

    aget v1, v1, v0

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    iget-object v1, p0, Le1/j;->e:[I

    aget v0, v1, v0

    iget v1, p0, Le1/j;->a:I

    if-eq v0, v1, :cond_3

    iget-object v2, p0, Le1/j;->f:[I

    aget v2, v2, v0

    if-eq v2, p1, :cond_3

    goto :goto_0

    :cond_3
    if-ne v0, v1, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Le1/j;->f:[I

    aget v2, v2, v0

    if-ne v2, p1, :cond_5

    goto :goto_1

    :cond_5
    move v0, v1

    :goto_1
    return v0

    :cond_6
    :goto_2
    iget p1, p0, Le1/j;->a:I

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .prologue
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " { "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Le1/j;->j:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {p0, v2}, Le1/j;->b(I)Le1/i;

    move-result-object v3

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0, v2}, Le1/j;->d(I)F

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " = "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v3}, Le1/j;->p(Le1/i;)I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "[p: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Le1/j;->h:[I

    aget v4, v4, v3

    iget v5, p0, Le1/j;->a:I

    const-string v6, "none"

    if-eq v4, v5, :cond_1

    iget-object v4, p0, Le1/j;->m:Le1/c;

    invoke-virtual {v4}, Le1/c;->b()[Le1/i;

    move-result-object v4

    iget-object v5, p0, Le1/j;->f:[I

    iget-object v7, p0, Le1/j;->h:[I

    aget v7, v7, v3

    aget v5, v5, v7

    aget-object v4, v4, v5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", n: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Le1/j;->i:[I

    aget v4, v4, v3

    iget v5, p0, Le1/j;->a:I

    if-eq v4, v5, :cond_2

    iget-object v4, p0, Le1/j;->m:Le1/c;

    invoke-virtual {v4}, Le1/c;->b()[Le1/i;

    move-result-object v4

    iget-object v5, p0, Le1/j;->f:[I

    iget-object v6, p0, Le1/j;->i:[I

    aget v3, v6, v3

    aget v3, v5, v3

    aget-object v3, v4, v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " }"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
