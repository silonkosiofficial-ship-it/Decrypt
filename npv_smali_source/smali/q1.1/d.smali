.class public Lq1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq1/d$a;,
        Lq1/d$b;
    }
.end annotation


# static fields
.field private static q:I = 0x3e8

.field public static r:Z = true

.field public static s:J

.field public static t:J


# instance fields
.field a:I

.field private b:Ljava/util/HashMap;

.field private c:Lq1/d$a;

.field private d:I

.field private e:I

.field f:[Lq1/b;

.field public g:Z

.field public h:Z

.field private i:[Z

.field j:I

.field k:I

.field private l:I

.field final m:Lq1/c;

.field private n:[Lq1/i;

.field private o:I

.field private p:Lq1/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lq1/d;->a:I

    const/4 v1, 0x0

    iput-object v1, p0, Lq1/d;->b:Ljava/util/HashMap;

    const/16 v2, 0x20

    iput v2, p0, Lq1/d;->d:I

    iput v2, p0, Lq1/d;->e:I

    iput-object v1, p0, Lq1/d;->f:[Lq1/b;

    iput-boolean v0, p0, Lq1/d;->g:Z

    iput-boolean v0, p0, Lq1/d;->h:Z

    new-array v1, v2, [Z

    iput-object v1, p0, Lq1/d;->i:[Z

    const/4 v1, 0x1

    iput v1, p0, Lq1/d;->j:I

    iput v0, p0, Lq1/d;->k:I

    iput v2, p0, Lq1/d;->l:I

    sget v1, Lq1/d;->q:I

    new-array v1, v1, [Lq1/i;

    iput-object v1, p0, Lq1/d;->n:[Lq1/i;

    iput v0, p0, Lq1/d;->o:I

    new-array v0, v2, [Lq1/b;

    iput-object v0, p0, Lq1/d;->f:[Lq1/b;

    invoke-direct {p0}, Lq1/d;->C()V

    new-instance v0, Lq1/c;

    invoke-direct {v0}, Lq1/c;-><init>()V

    iput-object v0, p0, Lq1/d;->m:Lq1/c;

    new-instance v1, Lq1/h;

    invoke-direct {v1, v0}, Lq1/h;-><init>(Lq1/c;)V

    iput-object v1, p0, Lq1/d;->c:Lq1/d$a;

    sget-boolean v1, Lq1/d;->r:Z

    if-eqz v1, :cond_0

    new-instance v1, Lq1/d$b;

    invoke-direct {v1, p0, v0}, Lq1/d$b;-><init>(Lq1/d;Lq1/c;)V

    :goto_0
    iput-object v1, p0, Lq1/d;->p:Lq1/d$a;

    goto :goto_1

    :cond_0
    new-instance v1, Lq1/b;

    invoke-direct {v1, v0}, Lq1/b;-><init>(Lq1/c;)V

    goto :goto_0

    :goto_1
    return-void
.end method

.method private final B(Lq1/d$a;Z)I
    .locals 10

    .prologue
    const/4 p2, 0x0

    move v0, p2

    :goto_0
    iget v1, p0, Lq1/d;->j:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lq1/d;->i:[Z

    aput-boolean p2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v0, p2

    move v1, v0

    :cond_1
    :goto_1
    if-nez v0, :cond_b

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Lq1/d;->j:I

    mul-int/lit8 v2, v2, 0x2

    if-lt v1, v2, :cond_2

    return v1

    :cond_2
    invoke-interface {p1}, Lq1/d$a;->getKey()Lq1/i;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    iget-object v2, p0, Lq1/d;->i:[Z

    invoke-interface {p1}, Lq1/d$a;->getKey()Lq1/i;

    move-result-object v4

    iget v4, v4, Lq1/i;->c:I

    aput-boolean v3, v2, v4

    :cond_3
    iget-object v2, p0, Lq1/d;->i:[Z

    invoke-interface {p1, p0, v2}, Lq1/d$a;->b(Lq1/d;[Z)Lq1/i;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v4, p0, Lq1/d;->i:[Z

    iget v5, v2, Lq1/i;->c:I

    aget-boolean v6, v4, v5

    if-eqz v6, :cond_4

    return v1

    :cond_4
    aput-boolean v3, v4, v5

    :cond_5
    if-eqz v2, :cond_a

    const/4 v3, -0x1

    const v4, 0x7f7fffff    # Float.MAX_VALUE

    move v5, p2

    move v6, v3

    :goto_2
    iget v7, p0, Lq1/d;->k:I

    if-ge v5, v7, :cond_9

    iget-object v7, p0, Lq1/d;->f:[Lq1/b;

    aget-object v7, v7, v5

    iget-object v8, v7, Lq1/b;->a:Lq1/i;

    iget-object v8, v8, Lq1/i;->j:Lq1/i$a;

    sget-object v9, Lq1/i$a;->C:Lq1/i$a;

    if-ne v8, v9, :cond_6

    goto :goto_3

    :cond_6
    iget-boolean v8, v7, Lq1/b;->f:Z

    if-eqz v8, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v7, v2}, Lq1/b;->t(Lq1/i;)Z

    move-result v8

    if-eqz v8, :cond_8

    iget-object v8, v7, Lq1/b;->e:Lq1/b$a;

    invoke-interface {v8, v2}, Lq1/b$a;->g(Lq1/i;)F

    move-result v8

    const/4 v9, 0x0

    cmpg-float v9, v8, v9

    if-gez v9, :cond_8

    iget v7, v7, Lq1/b;->b:F

    neg-float v7, v7

    div-float/2addr v7, v8

    cmpg-float v8, v7, v4

    if-gez v8, :cond_8

    move v6, v5

    move v4, v7

    :cond_8
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_9
    if-le v6, v3, :cond_1

    iget-object v4, p0, Lq1/d;->f:[Lq1/b;

    aget-object v4, v4, v6

    iget-object v5, v4, Lq1/b;->a:Lq1/i;

    iput v3, v5, Lq1/i;->d:I

    invoke-virtual {v4, v2}, Lq1/b;->y(Lq1/i;)V

    iget-object v2, v4, Lq1/b;->a:Lq1/i;

    iput v6, v2, Lq1/i;->d:I

    invoke-virtual {v2, v4}, Lq1/i;->g(Lq1/b;)V

    goto :goto_1

    :cond_a
    move v0, v3

    goto/16 :goto_1

    :cond_b
    return v1
.end method

.method private C()V
    .locals 4

    .prologue
    sget-boolean v0, Lq1/d;->r:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    :goto_0
    iget-object v0, p0, Lq1/d;->f:[Lq1/b;

    array-length v3, v0

    if-ge v2, v3, :cond_3

    aget-object v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v3, p0, Lq1/d;->m:Lq1/c;

    iget-object v3, v3, Lq1/c;->a:Lq1/f;

    invoke-interface {v3, v0}, Lq1/f;->a(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Lq1/d;->f:[Lq1/b;

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Lq1/d;->f:[Lq1/b;

    array-length v3, v0

    if-ge v2, v3, :cond_3

    aget-object v0, v0, v2

    if-eqz v0, :cond_2

    iget-object v3, p0, Lq1/d;->m:Lq1/c;

    iget-object v3, v3, Lq1/c;->b:Lq1/f;

    invoke-interface {v3, v0}, Lq1/f;->a(Ljava/lang/Object;)Z

    :cond_2
    iget-object v0, p0, Lq1/d;->f:[Lq1/b;

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method private a(Lq1/i$a;Ljava/lang/String;)Lq1/i;
    .locals 2

    .prologue
    iget-object v0, p0, Lq1/d;->m:Lq1/c;

    iget-object v0, v0, Lq1/c;->c:Lq1/f;

    invoke-interface {v0}, Lq1/f;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq1/i;

    if-nez v0, :cond_0

    new-instance v0, Lq1/i;

    invoke-direct {v0, p1, p2}, Lq1/i;-><init>(Lq1/i$a;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0, p1, p2}, Lq1/i;->f(Lq1/i$a;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lq1/i;->d()V

    goto :goto_0

    :goto_1
    iget p1, p0, Lq1/d;->o:I

    sget p2, Lq1/d;->q:I

    if-lt p1, p2, :cond_1

    mul-int/lit8 p2, p2, 0x2

    sput p2, Lq1/d;->q:I

    iget-object p1, p0, Lq1/d;->n:[Lq1/i;

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lq1/i;

    iput-object p1, p0, Lq1/d;->n:[Lq1/i;

    :cond_1
    iget-object p1, p0, Lq1/d;->n:[Lq1/i;

    iget p2, p0, Lq1/d;->o:I

    add-int/lit8 v1, p2, 0x1

    iput v1, p0, Lq1/d;->o:I

    aput-object v0, p1, p2

    return-object v0
.end method

.method private final l(Lq1/b;)V
    .locals 2

    .prologue
    sget-boolean v0, Lq1/d;->r:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lq1/d;->f:[Lq1/b;

    iget v1, p0, Lq1/d;->k:I

    aget-object v0, v0, v1

    if-eqz v0, :cond_1

    iget-object v1, p0, Lq1/d;->m:Lq1/c;

    iget-object v1, v1, Lq1/c;->a:Lq1/f;

    :goto_0
    invoke-interface {v1, v0}, Lq1/f;->a(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lq1/d;->f:[Lq1/b;

    iget v1, p0, Lq1/d;->k:I

    aget-object v0, v0, v1

    if-eqz v0, :cond_1

    iget-object v1, p0, Lq1/d;->m:Lq1/c;

    iget-object v1, v1, Lq1/c;->b:Lq1/f;

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Lq1/d;->f:[Lq1/b;

    iget v1, p0, Lq1/d;->k:I

    aput-object p1, v0, v1

    iget-object v0, p1, Lq1/b;->a:Lq1/i;

    iput v1, v0, Lq1/i;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lq1/d;->k:I

    invoke-virtual {v0, p1}, Lq1/i;->g(Lq1/b;)V

    return-void
.end method

.method private n()V
    .locals 3

    .prologue
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lq1/d;->k:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lq1/d;->f:[Lq1/b;

    aget-object v1, v1, v0

    iget-object v2, v1, Lq1/b;->a:Lq1/i;

    iget v1, v1, Lq1/b;->b:F

    iput v1, v2, Lq1/i;->f:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static s(Lq1/d;Lq1/i;Lq1/i;F)Lq1/b;
    .locals 0

    invoke-virtual {p0}, Lq1/d;->r()Lq1/b;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3}, Lq1/b;->j(Lq1/i;Lq1/i;F)Lq1/b;

    move-result-object p0

    return-object p0
.end method

.method private u(Lq1/d$a;)I
    .locals 17

    .prologue
    move-object/from16 v0, p0

    const/4 v2, 0x0

    :goto_0
    iget v3, v0, Lq1/d;->k:I

    if-ge v2, v3, :cond_e

    iget-object v3, v0, Lq1/d;->f:[Lq1/b;

    aget-object v3, v3, v2

    iget-object v4, v3, Lq1/b;->a:Lq1/i;

    iget-object v4, v4, Lq1/i;->j:Lq1/i$a;

    sget-object v5, Lq1/i$a;->C:Lq1/i$a;

    if-ne v4, v5, :cond_0

    goto/16 :goto_8

    :cond_0
    iget v3, v3, Lq1/b;->b:F

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    if-gez v3, :cond_d

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_1
    :goto_1
    if-nez v2, :cond_c

    add-int/lit8 v3, v3, 0x1

    const/4 v5, -0x1

    const v6, 0x7f7fffff    # Float.MAX_VALUE

    move v8, v5

    move v9, v8

    const/4 v7, 0x0

    const/4 v10, 0x0

    :goto_2
    iget v11, v0, Lq1/d;->k:I

    const/4 v12, 0x1

    if-ge v7, v11, :cond_a

    iget-object v11, v0, Lq1/d;->f:[Lq1/b;

    aget-object v11, v11, v7

    iget-object v13, v11, Lq1/b;->a:Lq1/i;

    iget-object v13, v13, Lq1/i;->j:Lq1/i$a;

    sget-object v14, Lq1/i$a;->C:Lq1/i$a;

    if-ne v13, v14, :cond_2

    goto :goto_6

    :cond_2
    iget-boolean v13, v11, Lq1/b;->f:Z

    if-eqz v13, :cond_3

    goto :goto_6

    :cond_3
    iget v13, v11, Lq1/b;->b:F

    cmpg-float v13, v13, v4

    if-gez v13, :cond_9

    :goto_3
    iget v13, v0, Lq1/d;->j:I

    if-ge v12, v13, :cond_9

    iget-object v13, v0, Lq1/d;->m:Lq1/c;

    iget-object v13, v13, Lq1/c;->d:[Lq1/i;

    aget-object v13, v13, v12

    iget-object v14, v11, Lq1/b;->e:Lq1/b$a;

    invoke-interface {v14, v13}, Lq1/b$a;->g(Lq1/i;)F

    move-result v14

    cmpg-float v15, v14, v4

    if-gtz v15, :cond_4

    goto :goto_5

    :cond_4
    const/4 v15, 0x0

    :goto_4
    const/16 v1, 0x9

    if-ge v15, v1, :cond_8

    iget-object v1, v13, Lq1/i;->h:[F

    aget v1, v1, v15

    div-float/2addr v1, v14

    cmpg-float v16, v1, v6

    if-gez v16, :cond_5

    if-eq v15, v10, :cond_6

    :cond_5
    if-le v15, v10, :cond_7

    :cond_6
    move v6, v1

    move v8, v7

    move v9, v12

    move v10, v15

    :cond_7
    add-int/lit8 v15, v15, 0x1

    goto :goto_4

    :cond_8
    :goto_5
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_9
    :goto_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_a
    if-eq v8, v5, :cond_b

    iget-object v1, v0, Lq1/d;->f:[Lq1/b;

    aget-object v1, v1, v8

    iget-object v6, v1, Lq1/b;->a:Lq1/i;

    iput v5, v6, Lq1/i;->d:I

    iget-object v5, v0, Lq1/d;->m:Lq1/c;

    iget-object v5, v5, Lq1/c;->d:[Lq1/i;

    aget-object v5, v5, v9

    invoke-virtual {v1, v5}, Lq1/b;->y(Lq1/i;)V

    iget-object v5, v1, Lq1/b;->a:Lq1/i;

    iput v8, v5, Lq1/i;->d:I

    invoke-virtual {v5, v1}, Lq1/i;->g(Lq1/b;)V

    goto :goto_7

    :cond_b
    move v2, v12

    :goto_7
    iget v1, v0, Lq1/d;->j:I

    div-int/lit8 v1, v1, 0x2

    if-le v3, v1, :cond_1

    move v2, v12

    goto/16 :goto_1

    :cond_c
    move v1, v3

    goto :goto_9

    :cond_d
    :goto_8
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_e
    const/4 v1, 0x0

    :goto_9
    return v1
.end method

.method public static w()Lq1/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method private y()V
    .locals 3

    iget v0, p0, Lq1/d;->d:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lq1/d;->d:I

    iget-object v1, p0, Lq1/d;->f:[Lq1/b;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq1/b;

    iput-object v0, p0, Lq1/d;->f:[Lq1/b;

    iget-object v0, p0, Lq1/d;->m:Lq1/c;

    iget-object v1, v0, Lq1/c;->d:[Lq1/i;

    iget v2, p0, Lq1/d;->d:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lq1/i;

    iput-object v1, v0, Lq1/c;->d:[Lq1/i;

    iget v0, p0, Lq1/d;->d:I

    new-array v1, v0, [Z

    iput-object v1, p0, Lq1/d;->i:[Z

    iput v0, p0, Lq1/d;->e:I

    iput v0, p0, Lq1/d;->l:I

    return-void
.end method


# virtual methods
.method A(Lq1/d$a;)V
    .locals 1

    invoke-direct {p0, p1}, Lq1/d;->u(Lq1/d$a;)I

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lq1/d;->B(Lq1/d$a;Z)I

    invoke-direct {p0}, Lq1/d;->n()V

    return-void
.end method

.method public D()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lq1/d;->m:Lq1/c;

    iget-object v3, v2, Lq1/c;->d:[Lq1/i;

    array-length v4, v3

    if-ge v1, v4, :cond_1

    aget-object v2, v3, v1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lq1/i;->d()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, v2, Lq1/c;->c:Lq1/f;

    iget-object v2, p0, Lq1/d;->n:[Lq1/i;

    iget v3, p0, Lq1/d;->o:I

    invoke-interface {v1, v2, v3}, Lq1/f;->c([Ljava/lang/Object;I)V

    iput v0, p0, Lq1/d;->o:I

    iget-object v1, p0, Lq1/d;->m:Lq1/c;

    iget-object v1, v1, Lq1/c;->d:[Lq1/i;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lq1/d;->b:Ljava/util/HashMap;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    :cond_2
    iput v0, p0, Lq1/d;->a:I

    iget-object v1, p0, Lq1/d;->c:Lq1/d$a;

    invoke-interface {v1}, Lq1/d$a;->clear()V

    const/4 v1, 0x1

    iput v1, p0, Lq1/d;->j:I

    move v1, v0

    :goto_1
    iget v2, p0, Lq1/d;->k:I

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Lq1/d;->f:[Lq1/b;

    aget-object v2, v2, v1

    iput-boolean v0, v2, Lq1/b;->c:Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Lq1/d;->C()V

    iput v0, p0, Lq1/d;->k:I

    sget-boolean v0, Lq1/d;->r:Z

    if-eqz v0, :cond_4

    new-instance v0, Lq1/d$b;

    iget-object v1, p0, Lq1/d;->m:Lq1/c;

    invoke-direct {v0, p0, v1}, Lq1/d$b;-><init>(Lq1/d;Lq1/c;)V

    :goto_2
    iput-object v0, p0, Lq1/d;->p:Lq1/d$a;

    goto :goto_3

    :cond_4
    new-instance v0, Lq1/b;

    iget-object v1, p0, Lq1/d;->m:Lq1/c;

    invoke-direct {v0, v1}, Lq1/b;-><init>(Lq1/c;)V

    goto :goto_2

    :goto_3
    return-void
.end method

.method public b(Lr1/e;Lr1/e;FI)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    sget-object v3, Lr1/d$b;->D:Lr1/d$b;

    invoke-virtual {v1, v3}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object v4

    invoke-virtual {v0, v4}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v6

    sget-object v4, Lr1/d$b;->E:Lr1/d$b;

    invoke-virtual {v1, v4}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object v5

    invoke-virtual {v0, v5}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v8

    sget-object v5, Lr1/d$b;->F:Lr1/d$b;

    invoke-virtual {v1, v5}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object v7

    invoke-virtual {v0, v7}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v13

    sget-object v7, Lr1/d$b;->G:Lr1/d$b;

    invoke-virtual {v1, v7}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v9

    invoke-virtual {v2, v3}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v1

    invoke-virtual {v2, v4}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object v3

    invoke-virtual {v0, v3}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v10

    invoke-virtual {v2, v5}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object v3

    invoke-virtual {v0, v3}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v3

    invoke-virtual {v2, v7}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object v2

    invoke-virtual {v0, v2}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lq1/d;->r()Lq1/b;

    move-result-object v2

    move/from16 v4, p3

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    move/from16 v7, p4

    move-object/from16 p1, v3

    move-wide/from16 p2, v4

    int-to-double v3, v7

    mul-double/2addr v14, v3

    double-to-float v12, v14

    move-object v7, v2

    invoke-virtual/range {v7 .. v12}, Lq1/b;->q(Lq1/i;Lq1/i;Lq1/i;Lq1/i;F)Lq1/b;

    invoke-virtual {v0, v2}, Lq1/d;->d(Lq1/b;)V

    invoke-virtual/range {p0 .. p0}, Lq1/d;->r()Lq1/b;

    move-result-object v2

    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    mul-double/2addr v7, v3

    double-to-float v10, v7

    move-object v5, v2

    move-object v7, v13

    move-object v8, v1

    move-object/from16 v9, p1

    invoke-virtual/range {v5 .. v10}, Lq1/b;->q(Lq1/i;Lq1/i;Lq1/i;Lq1/i;F)Lq1/b;

    invoke-virtual {v0, v2}, Lq1/d;->d(Lq1/b;)V

    return-void
.end method

.method public c(Lq1/i;Lq1/i;IFLq1/i;Lq1/i;II)V
    .locals 11

    .prologue
    move-object v0, p0

    move/from16 v1, p8

    invoke-virtual {p0}, Lq1/d;->r()Lq1/b;

    move-result-object v10

    move-object v2, v10

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    invoke-virtual/range {v2 .. v9}, Lq1/b;->h(Lq1/i;Lq1/i;IFLq1/i;Lq1/i;I)Lq1/b;

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    invoke-virtual {v10, p0, v1}, Lq1/b;->d(Lq1/d;I)Lq1/b;

    :cond_0
    invoke-virtual {p0, v10}, Lq1/d;->d(Lq1/b;)V

    return-void
.end method

.method public d(Lq1/b;)V
    .locals 4

    .prologue
    if-nez p1, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lq1/d;->k:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget v2, p0, Lq1/d;->l:I

    if-ge v0, v2, :cond_1

    iget v0, p0, Lq1/d;->j:I

    add-int/2addr v0, v1

    iget v2, p0, Lq1/d;->e:I

    if-lt v0, v2, :cond_2

    :cond_1
    invoke-direct {p0}, Lq1/d;->y()V

    :cond_2
    iget-boolean v0, p1, Lq1/b;->f:Z

    const/4 v2, 0x0

    if-nez v0, :cond_9

    invoke-virtual {p1, p0}, Lq1/b;->D(Lq1/d;)V

    invoke-virtual {p1}, Lq1/b;->u()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Lq1/b;->r()V

    invoke-virtual {p1, p0}, Lq1/b;->f(Lq1/d;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lq1/d;->p()Lq1/i;

    move-result-object v0

    iput-object v0, p1, Lq1/b;->a:Lq1/i;

    invoke-direct {p0, p1}, Lq1/d;->l(Lq1/b;)V

    iget-object v2, p0, Lq1/d;->p:Lq1/d$a;

    invoke-interface {v2, p1}, Lq1/d$a;->c(Lq1/d$a;)V

    iget-object v2, p0, Lq1/d;->p:Lq1/d$a;

    invoke-direct {p0, v2, v1}, Lq1/d;->B(Lq1/d$a;Z)I

    iget v2, v0, Lq1/i;->d:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_7

    iget-object v2, p1, Lq1/b;->a:Lq1/i;

    if-ne v2, v0, :cond_4

    invoke-virtual {p1, v0}, Lq1/b;->w(Lq1/i;)Lq1/i;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1, v0}, Lq1/b;->y(Lq1/i;)V

    :cond_4
    iget-boolean v0, p1, Lq1/b;->f:Z

    if-nez v0, :cond_5

    iget-object v0, p1, Lq1/b;->a:Lq1/i;

    invoke-virtual {v0, p1}, Lq1/i;->g(Lq1/b;)V

    :cond_5
    iget v0, p0, Lq1/d;->k:I

    sub-int/2addr v0, v1

    iput v0, p0, Lq1/d;->k:I

    goto :goto_0

    :cond_6
    move v1, v2

    :cond_7
    :goto_0
    invoke-virtual {p1}, Lq1/b;->s()Z

    move-result v0

    if-nez v0, :cond_8

    return-void

    :cond_8
    move v2, v1

    :cond_9
    if-nez v2, :cond_a

    invoke-direct {p0, p1}, Lq1/d;->l(Lq1/b;)V

    :cond_a
    return-void
.end method

.method public e(Lq1/i;Lq1/i;II)Lq1/b;
    .locals 3

    .prologue
    const/16 v0, 0x8

    if-ne p4, v0, :cond_0

    iget-boolean v1, p2, Lq1/i;->g:Z

    if-eqz v1, :cond_0

    iget v1, p1, Lq1/i;->d:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    iget p2, p2, Lq1/i;->f:F

    int-to-float p3, p3

    add-float/2addr p2, p3

    invoke-virtual {p1, p0, p2}, Lq1/i;->e(Lq1/d;F)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lq1/d;->r()Lq1/b;

    move-result-object v1

    invoke-virtual {v1, p1, p2, p3}, Lq1/b;->n(Lq1/i;Lq1/i;I)Lq1/b;

    if-eq p4, v0, :cond_1

    invoke-virtual {v1, p0, p4}, Lq1/b;->d(Lq1/d;I)Lq1/b;

    :cond_1
    invoke-virtual {p0, v1}, Lq1/d;->d(Lq1/b;)V

    return-object v1
.end method

.method public f(Lq1/i;I)V
    .locals 2

    .prologue
    iget v0, p1, Lq1/i;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    int-to-float p2, p2

    invoke-virtual {p1, p0, p2}, Lq1/i;->e(Lq1/d;F)V

    return-void

    :cond_0
    if-eq v0, v1, :cond_3

    iget-object v1, p0, Lq1/d;->f:[Lq1/b;

    aget-object v0, v1, v0

    iget-boolean v1, v0, Lq1/b;->f:Z

    if-eqz v1, :cond_1

    :goto_0
    int-to-float p1, p2

    iput p1, v0, Lq1/b;->b:F

    goto :goto_2

    :cond_1
    iget-object v1, v0, Lq1/b;->e:Lq1/b$a;

    invoke-interface {v1}, Lq1/b$a;->a()I

    move-result v1

    if-nez v1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, v0, Lq1/b;->f:Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lq1/d;->r()Lq1/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lq1/b;->m(Lq1/i;I)Lq1/b;

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lq1/d;->r()Lq1/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lq1/b;->i(Lq1/i;I)Lq1/b;

    :goto_1
    invoke-virtual {p0, v0}, Lq1/d;->d(Lq1/b;)V

    :goto_2
    return-void
.end method

.method public g(Lq1/i;Lq1/i;IZ)V
    .locals 2

    invoke-virtual {p0}, Lq1/d;->r()Lq1/b;

    move-result-object p4

    invoke-virtual {p0}, Lq1/d;->t()Lq1/i;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, Lq1/i;->e:I

    invoke-virtual {p4, p1, p2, v0, p3}, Lq1/b;->o(Lq1/i;Lq1/i;Lq1/i;I)Lq1/b;

    invoke-virtual {p0, p4}, Lq1/d;->d(Lq1/b;)V

    return-void
.end method

.method public h(Lq1/i;Lq1/i;II)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Lq1/d;->r()Lq1/b;

    move-result-object v0

    invoke-virtual {p0}, Lq1/d;->t()Lq1/i;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Lq1/i;->e:I

    invoke-virtual {v0, p1, p2, v1, p3}, Lq1/b;->o(Lq1/i;Lq1/i;Lq1/i;I)Lq1/b;

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    iget-object p1, v0, Lq1/b;->e:Lq1/b$a;

    invoke-interface {p1, v1}, Lq1/b$a;->g(Lq1/i;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1, p4}, Lq1/d;->m(Lq1/b;II)V

    :cond_0
    invoke-virtual {p0, v0}, Lq1/d;->d(Lq1/b;)V

    return-void
.end method

.method public i(Lq1/i;Lq1/i;IZ)V
    .locals 2

    invoke-virtual {p0}, Lq1/d;->r()Lq1/b;

    move-result-object p4

    invoke-virtual {p0}, Lq1/d;->t()Lq1/i;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, Lq1/i;->e:I

    invoke-virtual {p4, p1, p2, v0, p3}, Lq1/b;->p(Lq1/i;Lq1/i;Lq1/i;I)Lq1/b;

    invoke-virtual {p0, p4}, Lq1/d;->d(Lq1/b;)V

    return-void
.end method

.method public j(Lq1/i;Lq1/i;II)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Lq1/d;->r()Lq1/b;

    move-result-object v0

    invoke-virtual {p0}, Lq1/d;->t()Lq1/i;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Lq1/i;->e:I

    invoke-virtual {v0, p1, p2, v1, p3}, Lq1/b;->p(Lq1/i;Lq1/i;Lq1/i;I)Lq1/b;

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    iget-object p1, v0, Lq1/b;->e:Lq1/b$a;

    invoke-interface {p1, v1}, Lq1/b$a;->g(Lq1/i;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1, p4}, Lq1/d;->m(Lq1/b;II)V

    :cond_0
    invoke-virtual {p0, v0}, Lq1/d;->d(Lq1/b;)V

    return-void
.end method

.method public k(Lq1/i;Lq1/i;Lq1/i;Lq1/i;FI)V
    .locals 7

    .prologue
    invoke-virtual {p0}, Lq1/d;->r()Lq1/b;

    move-result-object v6

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lq1/b;->k(Lq1/i;Lq1/i;Lq1/i;Lq1/i;F)Lq1/b;

    const/16 p1, 0x8

    if-eq p6, p1, :cond_0

    invoke-virtual {v6, p0, p6}, Lq1/b;->d(Lq1/d;I)Lq1/b;

    :cond_0
    invoke-virtual {p0, v6}, Lq1/d;->d(Lq1/b;)V

    return-void
.end method

.method m(Lq1/b;II)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p3, v0}, Lq1/d;->o(ILjava/lang/String;)Lq1/i;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Lq1/b;->e(Lq1/i;I)Lq1/b;

    return-void
.end method

.method public o(ILjava/lang/String;)Lq1/i;
    .locals 2

    .prologue
    iget v0, p0, Lq1/d;->j:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lq1/d;->e:I

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lq1/d;->y()V

    :cond_0
    sget-object v0, Lq1/i$a;->F:Lq1/i$a;

    invoke-direct {p0, v0, p2}, Lq1/d;->a(Lq1/i$a;Ljava/lang/String;)Lq1/i;

    move-result-object p2

    iget v0, p0, Lq1/d;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lq1/d;->a:I

    iget v1, p0, Lq1/d;->j:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lq1/d;->j:I

    iput v0, p2, Lq1/i;->c:I

    iput p1, p2, Lq1/i;->e:I

    iget-object p1, p0, Lq1/d;->m:Lq1/c;

    iget-object p1, p1, Lq1/c;->d:[Lq1/i;

    aput-object p2, p1, v0

    iget-object p1, p0, Lq1/d;->c:Lq1/d$a;

    invoke-interface {p1, p2}, Lq1/d$a;->a(Lq1/i;)V

    return-object p2
.end method

.method public p()Lq1/i;
    .locals 3

    .prologue
    iget v0, p0, Lq1/d;->j:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lq1/d;->e:I

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lq1/d;->y()V

    :cond_0
    sget-object v0, Lq1/i$a;->E:Lq1/i$a;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lq1/d;->a(Lq1/i$a;Ljava/lang/String;)Lq1/i;

    move-result-object v0

    iget v1, p0, Lq1/d;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lq1/d;->a:I

    iget v2, p0, Lq1/d;->j:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lq1/d;->j:I

    iput v1, v0, Lq1/i;->c:I

    iget-object v2, p0, Lq1/d;->m:Lq1/c;

    iget-object v2, v2, Lq1/c;->d:[Lq1/i;

    aput-object v0, v2, v1

    return-object v0
.end method

.method public q(Ljava/lang/Object;)Lq1/i;
    .locals 3

    .prologue
    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget v1, p0, Lq1/d;->j:I

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Lq1/d;->e:I

    if-lt v1, v2, :cond_1

    invoke-direct {p0}, Lq1/d;->y()V

    :cond_1
    instance-of v1, p1, Lr1/d;

    if-eqz v1, :cond_5

    check-cast p1, Lr1/d;

    invoke-virtual {p1}, Lr1/d;->f()Lq1/i;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lq1/d;->m:Lq1/c;

    invoke-virtual {p1, v0}, Lr1/d;->m(Lq1/c;)V

    invoke-virtual {p1}, Lr1/d;->f()Lq1/i;

    move-result-object p1

    move-object v0, p1

    :cond_2
    iget p1, v0, Lq1/i;->c:I

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    iget v2, p0, Lq1/d;->a:I

    if-gt p1, v2, :cond_3

    iget-object v2, p0, Lq1/d;->m:Lq1/c;

    iget-object v2, v2, Lq1/c;->d:[Lq1/i;

    aget-object v2, v2, p1

    if-nez v2, :cond_5

    :cond_3
    if-eq p1, v1, :cond_4

    invoke-virtual {v0}, Lq1/i;->d()V

    :cond_4
    iget p1, p0, Lq1/d;->a:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lq1/d;->a:I

    iget v1, p0, Lq1/d;->j:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lq1/d;->j:I

    iput p1, v0, Lq1/i;->c:I

    sget-object v1, Lq1/i$a;->C:Lq1/i$a;

    iput-object v1, v0, Lq1/i;->j:Lq1/i$a;

    iget-object v1, p0, Lq1/d;->m:Lq1/c;

    iget-object v1, v1, Lq1/c;->d:[Lq1/i;

    aput-object v0, v1, p1

    :cond_5
    return-object v0
.end method

.method public r()Lq1/b;
    .locals 5

    .prologue
    sget-boolean v0, Lq1/d;->r:Z

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq1/d;->m:Lq1/c;

    iget-object v0, v0, Lq1/c;->a:Lq1/f;

    invoke-interface {v0}, Lq1/f;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq1/b;

    if-nez v0, :cond_0

    new-instance v0, Lq1/d$b;

    iget-object v3, p0, Lq1/d;->m:Lq1/c;

    invoke-direct {v0, p0, v3}, Lq1/d$b;-><init>(Lq1/d;Lq1/c;)V

    sget-wide v3, Lq1/d;->t:J

    add-long/2addr v3, v1

    sput-wide v3, Lq1/d;->t:J

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lq1/b;->z()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lq1/d;->m:Lq1/c;

    iget-object v0, v0, Lq1/c;->b:Lq1/f;

    invoke-interface {v0}, Lq1/f;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq1/b;

    if-nez v0, :cond_0

    new-instance v0, Lq1/b;

    iget-object v3, p0, Lq1/d;->m:Lq1/c;

    invoke-direct {v0, v3}, Lq1/b;-><init>(Lq1/c;)V

    sget-wide v3, Lq1/d;->s:J

    add-long/2addr v3, v1

    sput-wide v3, Lq1/d;->s:J

    :goto_0
    invoke-static {}, Lq1/i;->b()V

    return-object v0
.end method

.method public t()Lq1/i;
    .locals 3

    .prologue
    iget v0, p0, Lq1/d;->j:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lq1/d;->e:I

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lq1/d;->y()V

    :cond_0
    sget-object v0, Lq1/i$a;->E:Lq1/i$a;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lq1/d;->a(Lq1/i$a;Ljava/lang/String;)Lq1/i;

    move-result-object v0

    iget v1, p0, Lq1/d;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lq1/d;->a:I

    iget v2, p0, Lq1/d;->j:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lq1/d;->j:I

    iput v1, v0, Lq1/i;->c:I

    iget-object v2, p0, Lq1/d;->m:Lq1/c;

    iget-object v2, v2, Lq1/c;->d:[Lq1/i;

    aput-object v0, v2, v1

    return-object v0
.end method

.method public v()Lq1/c;
    .locals 1

    iget-object v0, p0, Lq1/d;->m:Lq1/c;

    return-object v0
.end method

.method public x(Ljava/lang/Object;)I
    .locals 1

    .prologue
    check-cast p1, Lr1/d;

    invoke-virtual {p1}, Lr1/d;->f()Lq1/i;

    move-result-object p1

    if-eqz p1, :cond_0

    iget p1, p1, Lq1/i;->f:F

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public z()V
    .locals 2

    .prologue
    iget-boolean v0, p0, Lq1/d;->g:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lq1/d;->h:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lq1/d;->c:Lq1/d$a;

    invoke-virtual {p0, v0}, Lq1/d;->A(Lq1/d$a;)V

    goto :goto_3

    :cond_1
    :goto_1
    const/4 v0, 0x0

    :goto_2
    iget v1, p0, Lq1/d;->k:I

    if-ge v0, v1, :cond_3

    iget-object v1, p0, Lq1/d;->f:[Lq1/b;

    aget-object v1, v1, v0

    iget-boolean v1, v1, Lq1/b;->f:Z

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    invoke-direct {p0}, Lq1/d;->n()V

    :goto_3
    return-void
.end method
