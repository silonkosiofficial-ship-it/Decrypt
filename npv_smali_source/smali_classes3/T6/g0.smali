.class public final LT6/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT6/g0$a;
    }
.end annotation


# static fields
.field public static final t:LT6/g0$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:LT6/G;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Z

.field private final h:Ljava/lang/String;

.field private final i:Ljava/util/List;

.field private final j:Ljava/util/List;

.field private final k:Li7/n;

.field private final l:LT6/U;

.field private final m:LT6/U;

.field private final n:Li7/n;

.field private final o:Li7/n;

.field private final p:Li7/n;

.field private final q:Li7/n;

.field private final r:Li7/n;

.field private final s:Li7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LT6/g0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT6/g0$a;-><init>(Ly7/k;)V

    sput-object v0, LT6/g0;->t:LT6/g0$a;

    return-void
.end method

.method public constructor <init>(LT6/U;Ljava/lang/String;ILjava/util/List;LT6/G;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 1

    .prologue
    const-string v0, "host"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pathSegments"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragment"

    invoke-static {p6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "urlString"

    invoke-static {p10, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LT6/g0;->a:Ljava/lang/String;

    iput p3, p0, LT6/g0;->b:I

    iput-object p5, p0, LT6/g0;->c:LT6/G;

    iput-object p6, p0, LT6/g0;->d:Ljava/lang/String;

    iput-object p7, p0, LT6/g0;->e:Ljava/lang/String;

    iput-object p8, p0, LT6/g0;->f:Ljava/lang/String;

    iput-boolean p9, p0, LT6/g0;->g:Z

    iput-object p10, p0, LT6/g0;->h:Ljava/lang/String;

    if-ltz p3, :cond_1

    const/high16 p2, 0x10000

    if-ge p3, p2, :cond_1

    iput-object p4, p0, LT6/g0;->i:Ljava/util/List;

    iput-object p4, p0, LT6/g0;->j:Ljava/util/List;

    new-instance p2, LT6/Z;

    invoke-direct {p2, p4}, LT6/Z;-><init>(Ljava/util/List;)V

    invoke-static {p2}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p2

    iput-object p2, p0, LT6/g0;->k:Li7/n;

    iput-object p1, p0, LT6/g0;->l:LT6/U;

    if-nez p1, :cond_0

    sget-object p1, LT6/U;->c:LT6/U$a;

    invoke-virtual {p1}, LT6/U$a;->c()LT6/U;

    move-result-object p1

    :cond_0
    iput-object p1, p0, LT6/g0;->m:LT6/U;

    new-instance p1, LT6/a0;

    invoke-direct {p1, p4, p0}, LT6/a0;-><init>(Ljava/util/List;LT6/g0;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LT6/g0;->n:Li7/n;

    new-instance p1, LT6/b0;

    invoke-direct {p1, p0}, LT6/b0;-><init>(LT6/g0;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LT6/g0;->o:Li7/n;

    new-instance p1, LT6/c0;

    invoke-direct {p1, p0}, LT6/c0;-><init>(LT6/g0;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LT6/g0;->p:Li7/n;

    new-instance p1, LT6/d0;

    invoke-direct {p1, p0}, LT6/d0;-><init>(LT6/g0;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LT6/g0;->q:Li7/n;

    new-instance p1, LT6/e0;

    invoke-direct {p1, p0}, LT6/e0;-><init>(LT6/g0;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LT6/g0;->r:Li7/n;

    new-instance p1, LT6/f0;

    invoke-direct {p1, p0}, LT6/f0;-><init>(LT6/g0;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LT6/g0;->s:Li7/n;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Port must be between 0 and 65535, or 0 if not set. Provided: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static synthetic a(LT6/g0;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LT6/g0;->l(LT6/g0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LT6/g0;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LT6/g0;->i(LT6/g0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LT6/g0;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LT6/g0;->j(LT6/g0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LT6/g0;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LT6/g0;->m(LT6/g0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LT6/g0;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LT6/g0;->h(LT6/g0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, LT6/g0;->u(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/util/List;LT6/g0;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LT6/g0;->k(Ljava/util/List;LT6/g0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final h(LT6/g0;)Ljava/lang/String;
    .locals 6

    .prologue
    iget-object v0, p0, LT6/g0;->h:Ljava/lang/String;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/16 v1, 0x23

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    iget-object p0, p0, LT6/g0;->h:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "substring(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final i(LT6/g0;)Ljava/lang/String;
    .locals 7

    .prologue
    iget-object v0, p0, LT6/g0;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    const-string p0, ""

    return-object p0

    :cond_1
    iget-object v0, p0, LT6/g0;->h:Ljava/lang/String;

    iget-object v1, p0, LT6/g0;->m:LT6/U;

    invoke-virtual {v1}, LT6/U;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v2, v1, 0x3

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v1, 0x3a

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, LT6/g0;->h:Ljava/lang/String;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/16 v2, 0x40

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v1

    iget-object p0, p0, LT6/g0;->h:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "substring(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final j(LT6/g0;)Ljava/lang/String;
    .locals 12

    .prologue
    iget-object v0, p0, LT6/g0;->h:Ljava/lang/String;

    iget-object v1, p0, LT6/g0;->m:LT6/U;

    invoke-virtual {v1}, LT6/U;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v2, v1, 0x3

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v1, 0x2f

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    iget-object v6, p0, LT6/g0;->h:Ljava/lang/String;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/16 v7, 0x23

    const/4 v9, 0x0

    move v8, v0

    invoke-static/range {v6 .. v11}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v2

    const-string v3, "substring(...)"

    iget-object p0, p0, LT6/g0;->h:Ljava/lang/String;

    if-ne v2, v1, :cond_1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-static {p0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_1
    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method private static final k(Ljava/util/List;LT6/g0;)Ljava/lang/String;
    .locals 13

    .prologue
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    const-string v0, ""

    if-eqz p0, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p1, LT6/g0;->h:Ljava/lang/String;

    iget-object p0, p1, LT6/g0;->m:LT6/U;

    invoke-virtual {p0}, LT6/U;->d()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 v3, p0, 0x3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x2f

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result p0

    const/4 v1, -0x1

    if-ne p0, v1, :cond_1

    return-object v0

    :cond_1
    iget-object v7, p1, LT6/g0;->h:Ljava/lang/String;

    const/4 v0, 0x2

    new-array v8, v0, [C

    fill-array-data v8, :array_0

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    move v9, p0

    invoke-static/range {v7 .. v12}, LS8/r;->r0(Ljava/lang/CharSequence;[CIZILjava/lang/Object;)I

    move-result v0

    const-string v2, "substring(...)"

    iget-object p1, p1, LT6/g0;->h:Ljava/lang/String;

    if-ne v0, v1, :cond_2

    invoke-virtual {p1, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-static {p0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_2
    invoke-virtual {p1, p0, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    nop

    :array_0
    .array-data 2
        0x3fs
        0x23s
    .end array-data
.end method

.method private static final l(LT6/g0;)Ljava/lang/String;
    .locals 7

    .prologue
    iget-object v0, p0, LT6/g0;->h:Ljava/lang/String;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/16 v1, 0x3f

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    iget-object v1, p0, LT6/g0;->h:Ljava/lang/String;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x23

    const/4 v4, 0x0

    move v3, v0

    invoke-static/range {v1 .. v6}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    const-string v3, "substring(...)"

    iget-object p0, p0, LT6/g0;->h:Ljava/lang/String;

    if-ne v1, v2, :cond_1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-static {p0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_1
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method private static final m(LT6/g0;)Ljava/lang/String;
    .locals 7

    .prologue
    iget-object v0, p0, LT6/g0;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    const-string p0, ""

    return-object p0

    :cond_1
    iget-object v0, p0, LT6/g0;->m:LT6/U;

    invoke-virtual {v0}, LT6/U;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    iget-object v1, p0, LT6/g0;->h:Ljava/lang/String;

    const/4 v2, 0x2

    new-array v2, v2, [C

    fill-array-data v2, :array_0

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move v3, v0

    invoke-static/range {v1 .. v6}, LS8/r;->r0(Ljava/lang/CharSequence;[CIZILjava/lang/Object;)I

    move-result v1

    iget-object p0, p0, LT6/g0;->h:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "substring(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    nop

    :array_0
    .array-data 2
        0x3as
        0x40s
    .end array-data
.end method

.method private static final u(Ljava/util/List;)Ljava/util/List;
    .locals 3

    .prologue
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v1, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {p0}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_2

    invoke-static {p0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v1

    goto :goto_1

    :cond_2
    invoke-static {p0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v2

    add-int/2addr v1, v2

    :goto_1
    invoke-interface {p0, v0, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, LT6/g0;

    if-eq v1, v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LT6/g0;

    iget-object v0, p0, LT6/g0;->h:Ljava/lang/String;

    iget-object p1, p1, LT6/g0;->h:Ljava/lang/String;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LT6/g0;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LT6/g0;->r:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LT6/g0;->q:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LT6/g0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final q()I
    .locals 2

    .prologue
    iget v0, p0, LT6/g0;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, LT6/g0;->m:LT6/U;

    invoke-virtual {v0}, LT6/U;->c()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final r()LT6/U;
    .locals 1

    iget-object v0, p0, LT6/g0;->m:LT6/U;

    return-object v0
.end method

.method public final s()LT6/U;
    .locals 1

    iget-object v0, p0, LT6/g0;->l:LT6/U;

    return-object v0
.end method

.method public final t()I
    .locals 1

    iget v0, p0, LT6/g0;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LT6/g0;->h:Ljava/lang/String;

    return-object v0
.end method
