.class public final Le1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le1/d$a;,
        Le1/d$b;,
        Le1/d$c;
    }
.end annotation


# static fields
.field private static A:J

.field private static B:J

.field public static final s:Le1/d$a;

.field public static final t:I

.field private static u:Z

.field private static v:Z

.field private static w:Z

.field private static x:Z

.field private static y:Z

.field private static z:Z


# instance fields
.field private a:I

.field private b:Z

.field private c:I

.field private d:Ljava/util/HashMap;

.field private e:Le1/d$b;

.field private f:I

.field private g:I

.field private h:[Le1/b;

.field private i:Z

.field private j:Z

.field private k:[Z

.field private l:I

.field private m:I

.field private n:I

.field private o:Le1/c;

.field private p:[Le1/i;

.field private q:I

.field private r:Le1/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le1/d$a;-><init>(Ly7/k;)V

    sput-object v0, Le1/d;->s:Le1/d$a;

    const/16 v0, 0x8

    sput v0, Le1/d;->t:I

    const/4 v0, 0x1

    sput-boolean v0, Le1/d;->v:Z

    sput-boolean v0, Le1/d;->w:Z

    sput-boolean v0, Le1/d;->x:Z

    sput-boolean v0, Le1/d;->y:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x3e8

    iput v0, p0, Le1/d;->a:I

    const/16 v1, 0x20

    iput v1, p0, Le1/d;->f:I

    iput v1, p0, Le1/d;->g:I

    new-array v2, v1, [Z

    iput-object v2, p0, Le1/d;->k:[Z

    const/4 v2, 0x1

    iput v2, p0, Le1/d;->l:I

    iput v1, p0, Le1/d;->n:I

    new-array v0, v0, [Le1/i;

    iput-object v0, p0, Le1/d;->p:[Le1/i;

    new-array v0, v1, [Le1/b;

    iput-object v0, p0, Le1/d;->h:[Le1/b;

    invoke-direct {p0}, Le1/d;->G()V

    new-instance v0, Le1/c;

    invoke-direct {v0}, Le1/c;-><init>()V

    iput-object v0, p0, Le1/d;->o:Le1/c;

    new-instance v0, Le1/h;

    iget-object v1, p0, Le1/d;->o:Le1/c;

    invoke-direct {v0, v1}, Le1/h;-><init>(Le1/c;)V

    iput-object v0, p0, Le1/d;->e:Le1/d$b;

    sget-boolean v0, Le1/d;->z:Z

    if-eqz v0, :cond_0

    new-instance v0, Le1/d$c;

    iget-object v1, p0, Le1/d;->o:Le1/c;

    invoke-direct {v0, p0, v1}, Le1/d$c;-><init>(Le1/d;Le1/c;)V

    goto :goto_0

    :cond_0
    new-instance v0, Le1/b;

    iget-object v1, p0, Le1/d;->o:Le1/c;

    invoke-direct {v0, v1}, Le1/b;-><init>(Le1/c;)V

    :goto_0
    iput-object v0, p0, Le1/d;->r:Le1/d$b;

    return-void
.end method

.method private final C()V
    .locals 4

    iget v0, p0, Le1/d;->f:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Le1/d;->f:I

    iget-object v0, p0, Le1/d;->h:[Le1/b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Le1/d;->f:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Le1/b;

    iput-object v0, p0, Le1/d;->h:[Le1/b;

    iget-object v0, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v0}, Le1/c;->b()[Le1/i;

    move-result-object v2

    iget v3, p0, Le1/d;->f:I

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, [Le1/i;

    invoke-virtual {v0, v2}, Le1/c;->e([Le1/i;)V

    iget v0, p0, Le1/d;->f:I

    new-array v1, v0, [Z

    iput-object v1, p0, Le1/d;->k:[Z

    iput v0, p0, Le1/d;->g:I

    iput v0, p0, Le1/d;->n:I

    return-void
.end method

.method private final F(Le1/d$b;Z)I
    .locals 11

    .prologue
    iget p2, p0, Le1/d;->l:I

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_0

    iget-object v2, p0, Le1/d;->k:[Z

    aput-boolean v0, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move p2, v0

    move v1, p2

    :cond_1
    :goto_1
    if-nez p2, :cond_b

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Le1/d;->l:I

    mul-int/lit8 v2, v2, 0x2

    if-lt v1, v2, :cond_2

    return v1

    :cond_2
    invoke-interface {p1}, Le1/d$b;->getKey()Le1/i;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    iget-object v2, p0, Le1/d;->k:[Z

    invoke-interface {p1}, Le1/d$b;->getKey()Le1/i;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Le1/i;->o()I

    move-result v4

    aput-boolean v3, v2, v4

    :cond_3
    iget-object v2, p0, Le1/d;->k:[Z

    invoke-interface {p1, p0, v2}, Le1/d$b;->c(Le1/d;[Z)Le1/i;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v4, p0, Le1/d;->k:[Z

    invoke-virtual {v2}, Le1/i;->o()I

    move-result v5

    aget-boolean v4, v4, v5

    if-eqz v4, :cond_4

    return v1

    :cond_4
    iget-object v4, p0, Le1/d;->k:[Z

    invoke-virtual {v2}, Le1/i;->o()I

    move-result v5

    aput-boolean v3, v4, v5

    :cond_5
    if-eqz v2, :cond_a

    iget v3, p0, Le1/d;->m:I

    const/4 v4, -0x1

    const v5, 0x7f7fffff    # Float.MAX_VALUE

    move v6, v0

    move v7, v4

    :goto_2
    if-ge v6, v3, :cond_9

    iget-object v8, p0, Le1/d;->h:[Le1/b;

    invoke-static {v8}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v8, v8, v6

    invoke-static {v8}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v8}, Le1/b;->u()Le1/i;

    move-result-object v9

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v9}, Le1/i;->x()Le1/i$b;

    move-result-object v9

    sget-object v10, Le1/i$b;->C:Le1/i$b;

    if-ne v9, v10, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v8}, Le1/b;->t()Z

    move-result v9

    if-eqz v9, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v8, v2}, Le1/b;->x(Le1/i;)Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-virtual {v8}, Le1/b;->v()Le1/b$a;

    move-result-object v9

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v9, v2}, Le1/b$a;->g(Le1/i;)F

    move-result v9

    const/4 v10, 0x0

    cmpg-float v10, v9, v10

    if-gez v10, :cond_8

    invoke-virtual {v8}, Le1/b;->s()F

    move-result v8

    neg-float v8, v8

    div-float/2addr v8, v9

    cmpg-float v9, v8, v5

    if-gez v9, :cond_8

    move v7, v6

    move v5, v8

    :cond_8
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_9
    if-le v7, v4, :cond_1

    iget-object v3, p0, Le1/d;->h:[Le1/b;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v3, v3, v7

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Le1/b;->u()Le1/i;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5, v4}, Le1/i;->H(I)V

    invoke-virtual {v3, v2}, Le1/b;->B(Le1/i;)V

    invoke-virtual {v3}, Le1/b;->u()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v7}, Le1/i;->H(I)V

    invoke-virtual {v3}, Le1/b;->u()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, p0, v3}, Le1/i;->N(Le1/d;Le1/b;)V

    goto/16 :goto_1

    :cond_a
    move p2, v3

    goto/16 :goto_1

    :cond_b
    return v1
.end method

.method private final G()V
    .locals 5

    .prologue
    sget-boolean v0, Le1/d;->z:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget v0, p0, Le1/d;->m:I

    :goto_0
    if-ge v2, v0, :cond_3

    iget-object v3, p0, Le1/d;->h:[Le1/b;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v3, v3, v2

    if-eqz v3, :cond_0

    iget-object v4, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v4}, Le1/c;->c()Le1/f;

    move-result-object v4

    invoke-interface {v4, v3}, Le1/f;->a(Ljava/lang/Object;)Z

    :cond_0
    iget-object v3, p0, Le1/d;->h:[Le1/b;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    aput-object v1, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget v0, p0, Le1/d;->m:I

    :goto_1
    if-ge v2, v0, :cond_3

    iget-object v3, p0, Le1/d;->h:[Le1/b;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v3, v3, v2

    if-eqz v3, :cond_2

    iget-object v4, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v4}, Le1/c;->a()Le1/f;

    move-result-object v4

    invoke-interface {v4, v3}, Le1/f;->a(Ljava/lang/Object;)Z

    :cond_2
    iget-object v3, p0, Le1/d;->h:[Le1/b;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    aput-object v1, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public static final synthetic a()Z
    .locals 1

    sget-boolean v0, Le1/d;->w:Z

    return v0
.end method

.method public static final synthetic b()Le1/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static final synthetic c()Z
    .locals 1

    sget-boolean v0, Le1/d;->u:Z

    return v0
.end method

.method public static final synthetic d(Z)V
    .locals 0

    sput-boolean p0, Le1/d;->u:Z

    return-void
.end method

.method private final e(Le1/i$b;Ljava/lang/String;)Le1/i;
    .locals 2

    .prologue
    iget-object v0, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v0}, Le1/c;->d()Le1/f;

    move-result-object v0

    invoke-interface {v0}, Le1/f;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le1/i;

    if-nez v0, :cond_0

    new-instance v0, Le1/i;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Le1/i;-><init>(Le1/i$b;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0, p1, p2}, Le1/i;->L(Le1/i$b;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Le1/i;->C()V

    goto :goto_0

    :goto_1
    iget p1, p0, Le1/d;->q:I

    iget p2, p0, Le1/d;->a:I

    if-lt p1, p2, :cond_1

    mul-int/lit8 p2, p2, 0x2

    iput p2, p0, Le1/d;->a:I

    iget-object p1, p0, Le1/d;->p:[Le1/i;

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "copyOf(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [Le1/i;

    iput-object p1, p0, Le1/d;->p:[Le1/i;

    :cond_1
    iget-object p1, p0, Le1/d;->p:[Le1/i;

    iget p2, p0, Le1/d;->q:I

    add-int/lit8 v1, p2, 0x1

    iput v1, p0, Le1/d;->q:I

    aput-object v0, p1, p2

    return-object v0
.end method

.method private final p(Le1/b;)V
    .locals 8

    .prologue
    sget-boolean v0, Le1/d;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Le1/b;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Le1/b;->u()Le1/i;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/b;->s()F

    move-result p1

    invoke-virtual {v0, p0, p1}, Le1/i;->E(Le1/d;F)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le1/d;->h:[Le1/b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Le1/d;->m:I

    aput-object p1, v0, v1

    invoke-virtual {p1}, Le1/b;->u()Le1/i;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Le1/d;->m:I

    invoke-virtual {v0, v1}, Le1/i;->H(I)V

    iget v0, p0, Le1/d;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Le1/d;->m:I

    invoke-virtual {p1}, Le1/b;->u()Le1/i;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p0, p1}, Le1/i;->N(Le1/d;Le1/b;)V

    :goto_0
    sget-boolean p1, Le1/d;->w:Z

    if-eqz p1, :cond_8

    iget-boolean p1, p0, Le1/d;->b:Z

    if-eqz p1, :cond_8

    const/4 p1, 0x0

    move v0, p1

    :goto_1
    iget v1, p0, Le1/d;->m:I

    if-ge v0, v1, :cond_7

    iget-object v1, p0, Le1/d;->h:[Le1/b;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v1, v1, v0

    if-nez v1, :cond_1

    const-string v1, "WTF"

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_1
    iget-object v1, p0, Le1/d;->h:[Le1/b;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v1, v1, v0

    if-eqz v1, :cond_6

    iget-object v1, p0, Le1/d;->h:[Le1/b;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v1, v1, v0

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Le1/b;->t()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Le1/d;->h:[Le1/b;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v1, v1, v0

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Le1/b;->u()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Le1/b;->s()F

    move-result v3

    invoke-virtual {v2, p0, v3}, Le1/i;->E(Le1/d;F)V

    sget-boolean v2, Le1/d;->z:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v2}, Le1/c;->c()Le1/f;

    move-result-object v2

    :goto_2
    invoke-interface {v2, v1}, Le1/f;->a(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_2
    iget-object v2, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v2}, Le1/c;->a()Le1/f;

    move-result-object v2

    goto :goto_2

    :goto_3
    iget-object v1, p0, Le1/d;->h:[Le1/b;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v2, 0x0

    aput-object v2, v1, v0

    add-int/lit8 v1, v0, 0x1

    iget v3, p0, Le1/d;->m:I

    move v4, v1

    :goto_4
    if-ge v1, v3, :cond_4

    iget-object v4, p0, Le1/d;->h:[Le1/b;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    add-int/lit8 v5, v1, -0x1

    iget-object v6, p0, Le1/d;->h:[Le1/b;

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v6, v6, v1

    aput-object v6, v4, v5

    iget-object v4, p0, Le1/d;->h:[Le1/b;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v4, v4, v5

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Le1/b;->u()Le1/i;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Le1/i;->r()I

    move-result v4

    if-ne v4, v1, :cond_3

    iget-object v4, p0, Le1/d;->h:[Le1/b;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v4, v4, v5

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Le1/b;->u()Le1/i;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Le1/i;->H(I)V

    :cond_3
    add-int/lit8 v4, v1, 0x1

    move v7, v4

    move v4, v1

    move v1, v7

    goto :goto_4

    :cond_4
    iget v1, p0, Le1/d;->m:I

    if-ge v4, v1, :cond_5

    iget-object v1, p0, Le1/d;->h:[Le1/b;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    aput-object v2, v1, v4

    :cond_5
    iget v1, p0, Le1/d;->m:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Le1/d;->m:I

    add-int/lit8 v0, v0, -0x1

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_1

    :cond_7
    iput-boolean p1, p0, Le1/d;->b:Z

    :cond_8
    return-void
.end method

.method private final r()V
    .locals 4

    .prologue
    iget v0, p0, Le1/d;->m:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Le1/d;->h:[Le1/b;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v2, v2, v1

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Le1/b;->u()Le1/i;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Le1/b;->s()F

    move-result v2

    invoke-virtual {v3, v2}, Le1/i;->D(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final x(Le1/d$b;)I
    .locals 19

    .prologue
    move-object/from16 v0, p0

    iget v1, v0, Le1/d;->m:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_14

    iget-object v4, v0, Le1/d;->h:[Le1/b;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v4, v4, v3

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Le1/b;->u()Le1/i;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Le1/i;->x()Le1/i$b;

    move-result-object v4

    sget-object v5, Le1/i$b;->C:Le1/i$b;

    if-ne v4, v5, :cond_0

    goto/16 :goto_b

    :cond_0
    iget-object v4, v0, Le1/d;->h:[Le1/b;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v4, v4, v3

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Le1/b;->s()F

    move-result v4

    const/4 v5, 0x0

    cmpg-float v4, v4, v5

    if-gez v4, :cond_13

    const/4 v1, 0x0

    const/4 v3, 0x0

    :goto_1
    if-nez v1, :cond_12

    add-int/lit8 v3, v3, 0x1

    iget v4, v0, Le1/d;->m:I

    const v7, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v8, 0x0

    const/4 v9, -0x1

    const/4 v10, -0x1

    const/4 v11, 0x0

    :goto_2
    const/4 v12, 0x1

    if-ge v8, v4, :cond_f

    iget-object v13, v0, Le1/d;->h:[Le1/b;

    invoke-static {v13}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v13, v13, v8

    invoke-static {v13}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v13}, Le1/b;->u()Le1/i;

    move-result-object v14

    invoke-static {v14}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v14}, Le1/i;->x()Le1/i$b;

    move-result-object v14

    sget-object v15, Le1/i$b;->C:Le1/i$b;

    if-ne v14, v15, :cond_1

    goto/16 :goto_9

    :cond_1
    invoke-virtual {v13}, Le1/b;->t()Z

    move-result v14

    if-eqz v14, :cond_2

    goto/16 :goto_9

    :cond_2
    invoke-virtual {v13}, Le1/b;->s()F

    move-result v14

    cmpg-float v14, v14, v5

    if-gez v14, :cond_e

    sget-boolean v14, Le1/d;->y:Z

    const/16 v15, 0x9

    if-eqz v14, :cond_8

    invoke-virtual {v13}, Le1/b;->v()Le1/b$a;

    move-result-object v12

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v12}, Le1/b$a;->a()I

    move-result v12

    const/4 v14, 0x0

    :goto_3
    if-ge v14, v12, :cond_e

    invoke-virtual {v13}, Le1/b;->v()Le1/b$a;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v2, v14}, Le1/b$a;->b(I)Le1/i;

    move-result-object v2

    invoke-virtual {v13}, Le1/b;->v()Le1/b$a;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v6, v2}, Le1/b$a;->g(Le1/i;)F

    move-result v6

    cmpg-float v16, v6, v5

    if-gtz v16, :cond_3

    goto :goto_5

    :cond_3
    const/4 v5, 0x0

    :goto_4
    if-ge v5, v15, :cond_7

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Le1/i;->u()[F

    move-result-object v17

    aget v17, v17, v5

    div-float v17, v17, v6

    cmpg-float v18, v17, v7

    if-gez v18, :cond_4

    if-eq v5, v11, :cond_5

    :cond_4
    if-le v5, v11, :cond_6

    :cond_5
    invoke-virtual {v2}, Le1/i;->o()I

    move-result v7

    move v11, v5

    move v10, v7

    move v9, v8

    move/from16 v7, v17

    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_7
    :goto_5
    add-int/lit8 v14, v14, 0x1

    const/4 v5, 0x0

    goto :goto_3

    :cond_8
    iget v2, v0, Le1/d;->l:I

    :goto_6
    if-ge v12, v2, :cond_e

    iget-object v5, v0, Le1/d;->o:Le1/c;

    invoke-virtual {v5}, Le1/c;->b()[Le1/i;

    move-result-object v5

    aget-object v5, v5, v12

    invoke-virtual {v13}, Le1/b;->v()Le1/b$a;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v6, v5}, Le1/b$a;->g(Le1/i;)F

    move-result v6

    const/4 v14, 0x0

    cmpg-float v16, v6, v14

    if-gtz v16, :cond_9

    goto :goto_8

    :cond_9
    const/4 v14, 0x0

    :goto_7
    if-ge v14, v15, :cond_d

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5}, Le1/i;->u()[F

    move-result-object v17

    aget v17, v17, v14

    div-float v17, v17, v6

    cmpg-float v18, v17, v7

    if-gez v18, :cond_a

    if-eq v14, v11, :cond_b

    :cond_a
    if-le v14, v11, :cond_c

    :cond_b
    move v9, v8

    move v10, v12

    move v11, v14

    move/from16 v7, v17

    :cond_c
    add-int/lit8 v14, v14, 0x1

    goto :goto_7

    :cond_d
    :goto_8
    add-int/lit8 v12, v12, 0x1

    goto :goto_6

    :cond_e
    :goto_9
    add-int/lit8 v8, v8, 0x1

    const/4 v5, 0x0

    goto/16 :goto_2

    :cond_f
    const/4 v2, -0x1

    if-eq v9, v2, :cond_10

    iget-object v4, v0, Le1/d;->h:[Le1/b;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v4, v4, v9

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Le1/b;->u()Le1/i;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5, v2}, Le1/i;->H(I)V

    iget-object v2, v0, Le1/d;->o:Le1/c;

    invoke-virtual {v2}, Le1/c;->b()[Le1/i;

    move-result-object v2

    aget-object v2, v2, v10

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Le1/b;->B(Le1/i;)V

    invoke-virtual {v4}, Le1/b;->u()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v9}, Le1/i;->H(I)V

    invoke-virtual {v4}, Le1/b;->u()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v0, v4}, Le1/i;->N(Le1/d;Le1/b;)V

    goto :goto_a

    :cond_10
    move v1, v12

    :goto_a
    iget v2, v0, Le1/d;->l:I

    div-int/lit8 v2, v2, 0x2

    if-le v3, v2, :cond_11

    move v1, v12

    :cond_11
    const/4 v5, 0x0

    goto/16 :goto_1

    :cond_12
    move v2, v3

    goto :goto_c

    :cond_13
    :goto_b
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_14
    const/4 v2, 0x0

    :goto_c
    return v2
.end method


# virtual methods
.method public final A()[Le1/b;
    .locals 1

    iget-object v0, p0, Le1/d;->h:[Le1/b;

    return-object v0
.end method

.method public final B(Ljava/lang/Object;)I
    .locals 1

    .prologue
    const-string v0, "obj"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lm1/d;

    invoke-virtual {p1}, Lm1/d;->n()Le1/i;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Le1/i;->n()F

    move-result p1

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final D()V
    .locals 3

    .prologue
    iget-object v0, p0, Le1/d;->e:Le1/d$b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Le1/d$b;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Le1/d;->r()V

    return-void

    :cond_0
    iget-boolean v0, p0, Le1/d;->i:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Le1/d;->j:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Le1/d;->e:Le1/d$b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Le1/d;->E(Le1/d$b;)V

    goto :goto_3

    :cond_2
    :goto_1
    iget v0, p0, Le1/d;->m:I

    const/4 v1, 0x0

    :goto_2
    if-ge v1, v0, :cond_4

    iget-object v2, p0, Le1/d;->h:[Le1/b;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v2, v2, v1

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Le1/b;->t()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    invoke-direct {p0}, Le1/d;->r()V

    :goto_3
    return-void
.end method

.method public final E(Le1/d$b;)V
    .locals 1

    const-string v0, "goal"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Le1/d;->x(Le1/d$b;)I

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Le1/d;->F(Le1/d$b;Z)I

    invoke-direct {p0}, Le1/d;->r()V

    return-void
.end method

.method public final H()V
    .locals 8

    .prologue
    iget-object v0, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v0}, Le1/c;->b()[Le1/i;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v3}, Le1/c;->b()[Le1/i;

    move-result-object v3

    aget-object v3, v3, v2

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Le1/i;->C()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v0}, Le1/c;->d()Le1/f;

    move-result-object v0

    iget-object v2, p0, Le1/d;->p:[Le1/i;

    iget v3, p0, Le1/d;->q:I

    invoke-interface {v0, v2, v3}, Le1/f;->c([Ljava/lang/Object;I)V

    iput v1, p0, Le1/d;->q:I

    iget-object v0, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v0}, Le1/c;->b()[Le1/i;

    move-result-object v2

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lj7/n;->B([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    iget-object v0, p0, Le1/d;->d:Ljava/util/HashMap;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_2
    iput v1, p0, Le1/d;->c:I

    iget-object v0, p0, Le1/d;->e:Le1/d$b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Le1/d$b;->clear()V

    const/4 v0, 0x1

    iput v0, p0, Le1/d;->l:I

    iget v0, p0, Le1/d;->m:I

    move v2, v1

    :goto_1
    if-ge v2, v0, :cond_4

    iget-object v3, p0, Le1/d;->h:[Le1/b;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v3, v3, v2

    if-eqz v3, :cond_3

    iget-object v3, p0, Le1/d;->h:[Le1/b;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v3, v3, v2

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3, v1}, Le1/b;->F(Z)V

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    invoke-direct {p0}, Le1/d;->G()V

    iput v1, p0, Le1/d;->m:I

    sget-boolean v0, Le1/d;->z:Z

    if-eqz v0, :cond_5

    new-instance v0, Le1/d$c;

    iget-object v1, p0, Le1/d;->o:Le1/c;

    invoke-direct {v0, p0, v1}, Le1/d$c;-><init>(Le1/d;Le1/c;)V

    goto :goto_2

    :cond_5
    new-instance v0, Le1/b;

    iget-object v1, p0, Le1/d;->o:Le1/c;

    invoke-direct {v0, v1}, Le1/b;-><init>(Le1/c;)V

    :goto_2
    iput-object v0, p0, Le1/d;->r:Le1/d$b;

    return-void
.end method

.method public final I(Z)V
    .locals 0

    iput-boolean p1, p0, Le1/d;->i:Z

    return-void
.end method

.method public final J(Z)V
    .locals 0

    iput-boolean p1, p0, Le1/d;->b:Z

    return-void
.end method

.method public final K(Z)V
    .locals 0

    iput-boolean p1, p0, Le1/d;->j:Z

    return-void
.end method

.method public final f(Lm1/e;Lm1/e;FI)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "widget"

    invoke-static {v1, v3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "target"

    invoke-static {v2, v3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lm1/d$b;->D:Lm1/d$b;

    invoke-virtual {v1, v3}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v4

    invoke-virtual {v0, v4}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v6

    sget-object v4, Lm1/d$b;->E:Lm1/d$b;

    invoke-virtual {v1, v4}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v5

    invoke-virtual {v0, v5}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v8

    sget-object v5, Lm1/d$b;->F:Lm1/d$b;

    invoke-virtual {v1, v5}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v7

    invoke-virtual {v0, v7}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v13

    sget-object v7, Lm1/d$b;->G:Lm1/d$b;

    invoke-virtual {v1, v7}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v9

    invoke-virtual {v2, v3}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v1

    invoke-virtual {v2, v4}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v3

    invoke-virtual {v0, v3}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v10

    invoke-virtual {v2, v5}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v3

    invoke-virtual {v0, v3}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v3

    invoke-virtual {v2, v7}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v2

    invoke-virtual {v0, v2}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Le1/d;->v()Le1/b;

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

    invoke-virtual/range {v7 .. v12}, Le1/b;->q(Le1/i;Le1/i;Le1/i;Le1/i;F)Le1/b;

    invoke-virtual {v0, v2}, Le1/d;->h(Le1/b;)V

    invoke-virtual/range {p0 .. p0}, Le1/d;->v()Le1/b;

    move-result-object v2

    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    mul-double/2addr v7, v3

    double-to-float v10, v7

    move-object v5, v2

    move-object v7, v13

    move-object v8, v1

    move-object/from16 v9, p1

    invoke-virtual/range {v5 .. v10}, Le1/b;->q(Le1/i;Le1/i;Le1/i;Le1/i;F)Le1/b;

    invoke-virtual {v0, v2}, Le1/d;->h(Le1/b;)V

    return-void
.end method

.method public final g(Le1/i;Le1/i;IFLe1/i;Le1/i;II)V
    .locals 11

    .prologue
    move-object v0, p0

    move/from16 v1, p8

    const-string v2, "a"

    move-object v4, p1

    invoke-static {p1, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "b"

    move-object v5, p2

    invoke-static {p2, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "c"

    move-object/from16 v8, p5

    invoke-static {v8, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "d"

    move-object/from16 v9, p6

    invoke-static {v9, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le1/d;->v()Le1/b;

    move-result-object v2

    move-object v3, v2

    move v6, p3

    move v7, p4

    move/from16 v10, p7

    invoke-virtual/range {v3 .. v10}, Le1/b;->h(Le1/i;Le1/i;IFLe1/i;Le1/i;I)Le1/b;

    const/16 v3, 0x8

    if-eq v1, v3, :cond_0

    invoke-virtual {v2, p0, v1}, Le1/b;->d(Le1/d;I)Le1/b;

    :cond_0
    invoke-virtual {p0, v2}, Le1/d;->h(Le1/b;)V

    return-void
.end method

.method public final h(Le1/b;)V
    .locals 5

    .prologue
    if-nez p1, :cond_0

    return-void

    :cond_0
    iget v0, p0, Le1/d;->m:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget v2, p0, Le1/d;->n:I

    if-ge v0, v2, :cond_1

    iget v0, p0, Le1/d;->l:I

    add-int/2addr v0, v1

    iget v2, p0, Le1/d;->g:I

    if-lt v0, v2, :cond_2

    :cond_1
    invoke-direct {p0}, Le1/d;->C()V

    :cond_2
    invoke-virtual {p1}, Le1/b;->t()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_a

    invoke-virtual {p1, p0}, Le1/b;->M(Le1/d;)V

    invoke-virtual {p1}, Le1/b;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Le1/b;->r()V

    invoke-virtual {p1, p0}, Le1/b;->f(Le1/d;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Le1/d;->t()Le1/i;

    move-result-object v0

    invoke-virtual {p1, v0}, Le1/b;->G(Le1/i;)V

    iget v3, p0, Le1/d;->m:I

    invoke-direct {p0, p1}, Le1/d;->p(Le1/b;)V

    iget v4, p0, Le1/d;->m:I

    add-int/2addr v3, v1

    if-ne v4, v3, :cond_7

    iget-object v2, p0, Le1/d;->r:Le1/d$b;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v2, p1}, Le1/d$b;->a(Le1/d$b;)V

    iget-object v2, p0, Le1/d;->r:Le1/d$b;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, v2, v1}, Le1/d;->F(Le1/d$b;Z)I

    invoke-virtual {v0}, Le1/i;->r()I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_8

    invoke-virtual {p1}, Le1/b;->u()Le1/i;

    move-result-object v2

    invoke-static {v2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p1, v0}, Le1/b;->z(Le1/i;)Le1/i;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1, v0}, Le1/b;->B(Le1/i;)V

    :cond_4
    invoke-virtual {p1}, Le1/b;->t()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p1}, Le1/b;->u()Le1/i;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p0, p1}, Le1/i;->N(Le1/d;Le1/b;)V

    :cond_5
    sget-boolean v0, Le1/d;->z:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v0}, Le1/c;->c()Le1/f;

    move-result-object v0

    :goto_0
    invoke-interface {v0, p1}, Le1/f;->a(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    iget-object v0, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v0}, Le1/c;->a()Le1/f;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget v0, p0, Le1/d;->m:I

    add-int/2addr v0, v3

    iput v0, p0, Le1/d;->m:I

    goto :goto_2

    :cond_7
    move v1, v2

    :cond_8
    :goto_2
    invoke-virtual {p1}, Le1/b;->w()Z

    move-result v0

    if-nez v0, :cond_9

    return-void

    :cond_9
    move v2, v1

    :cond_a
    if-nez v2, :cond_b

    invoke-direct {p0, p1}, Le1/d;->p(Le1/b;)V

    :cond_b
    return-void
.end method

.method public final i(Le1/i;Le1/i;II)Le1/b;
    .locals 3

    .prologue
    const-string v0, "a"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Le1/d;->v:Z

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    if-ne p4, v1, :cond_0

    invoke-virtual {p2}, Le1/i;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Le1/i;->r()I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    invoke-virtual {p2}, Le1/i;->n()F

    move-result p2

    int-to-float p3, p3

    add-float/2addr p2, p3

    invoke-virtual {p1, p0, p2}, Le1/i;->E(Le1/d;F)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Le1/d;->v()Le1/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Le1/b;->n(Le1/i;Le1/i;I)Le1/b;

    if-eq p4, v1, :cond_1

    invoke-virtual {v0, p0, p4}, Le1/b;->d(Le1/d;I)Le1/b;

    :cond_1
    invoke-virtual {p0, v0}, Le1/d;->h(Le1/b;)V

    return-object v0
.end method

.method public final j(Le1/i;I)V
    .locals 5

    .prologue
    const-string v0, "a"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Le1/d;->v:Z

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Le1/i;->r()I

    move-result v0

    if-ne v0, v1, :cond_2

    int-to-float p2, p2

    invoke-virtual {p1, p0, p2}, Le1/i;->E(Le1/d;F)V

    iget v0, p0, Le1/d;->c:I

    add-int/2addr v0, v2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v2}, Le1/c;->b()[Le1/i;

    move-result-object v2

    aget-object v2, v2, v1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Le1/i;->t()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Le1/i;->v()I

    move-result v3

    invoke-virtual {p1}, Le1/i;->o()I

    move-result v4

    if-ne v3, v4, :cond_0

    invoke-virtual {v2}, Le1/i;->w()F

    move-result v3

    add-float/2addr v3, p2

    invoke-virtual {v2, p0, v3}, Le1/i;->E(Le1/d;F)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    invoke-virtual {p1}, Le1/i;->r()I

    move-result v0

    invoke-virtual {p1}, Le1/i;->r()I

    move-result v3

    if-eq v3, v1, :cond_5

    iget-object v1, p0, Le1/d;->h:[Le1/b;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v0, v1, v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Le1/b;->t()Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    int-to-float p1, p2

    invoke-virtual {v0, p1}, Le1/b;->D(F)V

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Le1/b;->v()Le1/b$a;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v1}, Le1/b$a;->a()I

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v0, v2}, Le1/b;->E(Z)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Le1/d;->v()Le1/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le1/b;->m(Le1/i;I)Le1/b;

    :goto_2
    invoke-virtual {p0, v0}, Le1/d;->h(Le1/b;)V

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Le1/d;->v()Le1/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le1/b;->i(Le1/i;I)Le1/b;

    goto :goto_2

    :goto_3
    return-void
.end method

.method public final k(Le1/i;Le1/i;IZ)V
    .locals 2

    const-string p4, "a"

    invoke-static {p1, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "b"

    invoke-static {p2, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le1/d;->v()Le1/b;

    move-result-object p4

    invoke-virtual {p0}, Le1/d;->w()Le1/i;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Le1/i;->K(I)V

    invoke-virtual {p4, p1, p2, v0, p3}, Le1/b;->o(Le1/i;Le1/i;Le1/i;I)Le1/b;

    invoke-virtual {p0, p4}, Le1/d;->h(Le1/b;)V

    return-void
.end method

.method public final l(Le1/i;Le1/i;II)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Le1/d;->v()Le1/b;

    move-result-object v0

    invoke-virtual {p0}, Le1/d;->w()Le1/i;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Le1/i;->K(I)V

    invoke-virtual {v0, p1, p2, v1, p3}, Le1/b;->o(Le1/i;Le1/i;Le1/i;I)Le1/b;

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    invoke-virtual {v0}, Le1/b;->v()Le1/b$a;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Le1/b$a;->g(Le1/i;)F

    move-result p1

    const/4 p2, -0x1

    int-to-float p2, p2

    mul-float/2addr p2, p1

    float-to-int p1, p2

    invoke-virtual {p0, v0, p1, p4}, Le1/d;->q(Le1/b;II)V

    :cond_0
    invoke-virtual {p0, v0}, Le1/d;->h(Le1/b;)V

    return-void
.end method

.method public final m(Le1/i;Le1/i;IZ)V
    .locals 2

    const-string p4, "a"

    invoke-static {p1, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "b"

    invoke-static {p2, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le1/d;->v()Le1/b;

    move-result-object p4

    invoke-virtual {p0}, Le1/d;->w()Le1/i;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Le1/i;->K(I)V

    invoke-virtual {p4, p1, p2, v0, p3}, Le1/b;->p(Le1/i;Le1/i;Le1/i;I)Le1/b;

    invoke-virtual {p0, p4}, Le1/d;->h(Le1/b;)V

    return-void
.end method

.method public final n(Le1/i;Le1/i;II)V
    .locals 3

    .prologue
    const-string v0, "a"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le1/d;->v()Le1/b;

    move-result-object v0

    invoke-virtual {p0}, Le1/d;->w()Le1/i;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Le1/i;->K(I)V

    invoke-virtual {v0, p1, p2, v1, p3}, Le1/b;->p(Le1/i;Le1/i;Le1/i;I)Le1/b;

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    invoke-virtual {v0}, Le1/b;->v()Le1/b$a;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Le1/b$a;->g(Le1/i;)F

    move-result p1

    const/4 p2, -0x1

    int-to-float p2, p2

    mul-float/2addr p2, p1

    float-to-int p1, p2

    invoke-virtual {p0, v0, p1, p4}, Le1/d;->q(Le1/b;II)V

    :cond_0
    invoke-virtual {p0, v0}, Le1/d;->h(Le1/b;)V

    return-void
.end method

.method public final o(Le1/i;Le1/i;Le1/i;Le1/i;FI)V
    .locals 7

    .prologue
    const-string v0, "a"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "d"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le1/d;->v()Le1/b;

    move-result-object v0

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-virtual/range {v1 .. v6}, Le1/b;->k(Le1/i;Le1/i;Le1/i;Le1/i;F)Le1/b;

    const/16 p1, 0x8

    if-eq p6, p1, :cond_0

    invoke-virtual {v0, p0, p6}, Le1/b;->d(Le1/d;I)Le1/b;

    :cond_0
    invoke-virtual {p0, v0}, Le1/d;->h(Le1/b;)V

    return-void
.end method

.method public final q(Le1/b;II)V
    .locals 1

    const-string v0, "row"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p3, v0}, Le1/d;->s(ILjava/lang/String;)Le1/i;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Le1/b;->e(Le1/i;I)Le1/b;

    return-void
.end method

.method public final s(ILjava/lang/String;)Le1/i;
    .locals 2

    .prologue
    iget v0, p0, Le1/d;->l:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Le1/d;->g:I

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Le1/d;->C()V

    :cond_0
    sget-object v0, Le1/i$b;->F:Le1/i$b;

    invoke-direct {p0, v0, p2}, Le1/d;->e(Le1/i$b;Ljava/lang/String;)Le1/i;

    move-result-object p2

    iget v0, p0, Le1/d;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Le1/d;->c:I

    iget v1, p0, Le1/d;->l:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Le1/d;->l:I

    invoke-virtual {p2, v0}, Le1/i;->F(I)V

    invoke-virtual {p2, p1}, Le1/i;->K(I)V

    iget-object p1, p0, Le1/d;->o:Le1/c;

    invoke-virtual {p1}, Le1/c;->b()[Le1/i;

    move-result-object p1

    iget v0, p0, Le1/d;->c:I

    aput-object p2, p1, v0

    iget-object p1, p0, Le1/d;->e:Le1/d$b;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Le1/d$b;->b(Le1/i;)V

    return-object p2
.end method

.method public final t()Le1/i;
    .locals 3

    .prologue
    iget v0, p0, Le1/d;->l:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Le1/d;->g:I

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Le1/d;->C()V

    :cond_0
    sget-object v0, Le1/i$b;->E:Le1/i$b;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Le1/d;->e(Le1/i$b;Ljava/lang/String;)Le1/i;

    move-result-object v0

    iget v1, p0, Le1/d;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Le1/d;->c:I

    iget v2, p0, Le1/d;->l:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Le1/d;->l:I

    invoke-virtual {v0, v1}, Le1/i;->F(I)V

    iget-object v1, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v1}, Le1/c;->b()[Le1/i;

    move-result-object v1

    iget v2, p0, Le1/d;->c:I

    aput-object v0, v1, v2

    return-object v0
.end method

.method public final u(Ljava/lang/Object;)Le1/i;
    .locals 3

    .prologue
    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget v1, p0, Le1/d;->l:I

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Le1/d;->g:I

    if-lt v1, v2, :cond_1

    invoke-direct {p0}, Le1/d;->C()V

    :cond_1
    instance-of v1, p1, Lm1/d;

    if-eqz v1, :cond_5

    check-cast p1, Lm1/d;

    invoke-virtual {p1}, Lm1/d;->n()Le1/i;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Le1/d;->o:Le1/c;

    invoke-virtual {p1, v0}, Lm1/d;->x(Le1/c;)V

    invoke-virtual {p1}, Lm1/d;->n()Le1/i;

    move-result-object p1

    move-object v0, p1

    :cond_2
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Le1/i;->o()I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    invoke-virtual {v0}, Le1/i;->o()I

    move-result p1

    iget v2, p0, Le1/d;->c:I

    if-gt p1, v2, :cond_3

    iget-object p1, p0, Le1/d;->o:Le1/c;

    invoke-virtual {p1}, Le1/c;->b()[Le1/i;

    move-result-object p1

    invoke-virtual {v0}, Le1/i;->o()I

    move-result v2

    aget-object p1, p1, v2

    if-nez p1, :cond_5

    :cond_3
    invoke-virtual {v0}, Le1/i;->o()I

    move-result p1

    if-eq p1, v1, :cond_4

    invoke-virtual {v0}, Le1/i;->C()V

    :cond_4
    iget p1, p0, Le1/d;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Le1/d;->c:I

    iget v1, p0, Le1/d;->l:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Le1/d;->l:I

    invoke-virtual {v0, p1}, Le1/i;->F(I)V

    sget-object p1, Le1/i$b;->C:Le1/i$b;

    invoke-virtual {v0, p1}, Le1/i;->I(Le1/i$b;)V

    iget-object p1, p0, Le1/d;->o:Le1/c;

    invoke-virtual {p1}, Le1/c;->b()[Le1/i;

    move-result-object p1

    iget v1, p0, Le1/d;->c:I

    aput-object v0, p1, v1

    :cond_5
    return-object v0
.end method

.method public final v()Le1/b;
    .locals 5

    .prologue
    sget-boolean v0, Le1/d;->z:Z

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v0}, Le1/c;->c()Le1/f;

    move-result-object v0

    invoke-interface {v0}, Le1/f;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le1/b;

    if-nez v0, :cond_0

    new-instance v0, Le1/d$c;

    iget-object v3, p0, Le1/d;->o:Le1/c;

    invoke-direct {v0, p0, v3}, Le1/d$c;-><init>(Le1/d;Le1/c;)V

    sget-wide v3, Le1/d;->B:J

    add-long/2addr v3, v1

    sput-wide v3, Le1/d;->B:J

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Le1/b;->C()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v0}, Le1/c;->a()Le1/f;

    move-result-object v0

    invoke-interface {v0}, Le1/f;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le1/b;

    if-nez v0, :cond_0

    new-instance v0, Le1/b;

    iget-object v3, p0, Le1/d;->o:Le1/c;

    invoke-direct {v0, v3}, Le1/b;-><init>(Le1/c;)V

    sget-wide v3, Le1/d;->A:J

    add-long/2addr v3, v1

    sput-wide v3, Le1/d;->A:J

    :goto_0
    sget-object v1, Le1/i;->T:Le1/i$a;

    invoke-virtual {v1}, Le1/i$a;->a()V

    return-object v0
.end method

.method public final w()Le1/i;
    .locals 3

    .prologue
    iget v0, p0, Le1/d;->l:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Le1/d;->g:I

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Le1/d;->C()V

    :cond_0
    sget-object v0, Le1/i$b;->E:Le1/i$b;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Le1/d;->e(Le1/i$b;Ljava/lang/String;)Le1/i;

    move-result-object v0

    iget v1, p0, Le1/d;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Le1/d;->c:I

    iget v2, p0, Le1/d;->l:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Le1/d;->l:I

    invoke-virtual {v0, v1}, Le1/i;->F(I)V

    iget-object v1, p0, Le1/d;->o:Le1/c;

    invoke-virtual {v1}, Le1/c;->b()[Le1/i;

    move-result-object v1

    iget v2, p0, Le1/d;->c:I

    aput-object v0, v1, v2

    return-object v0
.end method

.method public final y()Le1/c;
    .locals 1

    iget-object v0, p0, Le1/d;->o:Le1/c;

    return-object v0
.end method

.method public final z()Le1/c;
    .locals 1

    iget-object v0, p0, Le1/d;->o:Le1/c;

    return-object v0
.end method
