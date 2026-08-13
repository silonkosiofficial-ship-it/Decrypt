.class public final LT6/M;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT6/M$a;
    }
.end annotation


# static fields
.field public static final k:LT6/M$a;

.field private static final l:LT6/g0;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field private c:I

.field private d:LT6/U;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/util/List;

.field private i:LT6/H;

.field private j:LT6/H;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LT6/M$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT6/M$a;-><init>(Ly7/k;)V

    sput-object v0, LT6/M;->k:LT6/M$a;

    invoke-static {v0}, LT6/N;->a(LT6/M$a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LT6/X;->c(Ljava/lang/String;)LT6/g0;

    move-result-object v0

    sput-object v0, LT6/M;->l:LT6/g0;

    return-void
.end method

.method public constructor <init>(LT6/U;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LT6/G;Ljava/lang/String;Z)V
    .locals 6

    .prologue
    const-string v0, "host"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pathSegments"

    invoke-static {p6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p7, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragment"

    invoke-static {p8, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LT6/M;->a:Ljava/lang/String;

    iput-boolean p9, p0, LT6/M;->b:Z

    iput p3, p0, LT6/M;->c:I

    iput-object p1, p0, LT6/M;->d:LT6/U;

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 p3, 0x0

    if-eqz p4, :cond_0

    invoke-static {p4, p2, p1, p3}, LT6/f;->m(Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    goto :goto_0

    :cond_0
    move-object p4, p3

    :goto_0
    iput-object p4, p0, LT6/M;->e:Ljava/lang/String;

    if-eqz p5, :cond_1

    invoke-static {p5, p2, p1, p3}, LT6/f;->m(Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    :cond_1
    iput-object p3, p0, LT6/M;->f:Ljava/lang/String;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p8

    invoke-static/range {v0 .. v5}, LT6/f;->u(Ljava/lang/String;ZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LT6/M;->g:Ljava/lang/String;

    check-cast p6, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 p2, 0xa

    invoke-static {p6, p2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-static {p3}, LT6/f;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iput-object p1, p0, LT6/M;->h:Ljava/util/List;

    invoke-static {p7}, LT6/i0;->d(LW6/y;)LT6/H;

    move-result-object p1

    iput-object p1, p0, LT6/M;->i:LT6/H;

    new-instance p2, LT6/h0;

    invoke-direct {p2, p1}, LT6/h0;-><init>(LT6/H;)V

    iput-object p2, p0, LT6/M;->j:LT6/H;

    return-void
.end method

.method public synthetic constructor <init>(LT6/U;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LT6/G;Ljava/lang/String;ZILy7/k;)V
    .locals 11

    .prologue
    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    const-string v4, ""

    if-eqz v3, :cond_1

    move-object v3, v4

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v5, v0, 0x4

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    move v5, p3

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    move-object v7, v2

    goto :goto_3

    :cond_3
    move-object v7, p4

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    goto :goto_4

    :cond_4
    move-object/from16 v2, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v8

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    sget-object v9, LT6/G;->b:LT6/G$a;

    invoke-virtual {v9}, LT6/G$a;->a()LT6/G;

    move-result-object v9

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    goto :goto_7

    :cond_7
    move-object/from16 v4, p8

    :goto_7
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_8

    goto :goto_8

    :cond_8
    move/from16 v6, p9

    :goto_8
    move-object p1, p0

    move-object p2, v1

    move-object p3, v3

    move p4, v5

    move-object/from16 p5, v7

    move-object/from16 p6, v2

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v4

    move/from16 p10, v6

    invoke-direct/range {p1 .. p10}, LT6/M;-><init>(LT6/U;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LT6/G;Ljava/lang/String;Z)V

    return-void
.end method

.method private final a()V
    .locals 2

    .prologue
    iget-object v0, p0, LT6/M;->a:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LT6/M;->o()LT6/U;

    move-result-object v0

    invoke-virtual {v0}, LT6/U;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "file"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    sget-object v0, LT6/M;->l:LT6/g0;

    invoke-virtual {v0}, LT6/g0;->p()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, LT6/M;->a:Ljava/lang/String;

    iget-object v1, p0, LT6/M;->d:LT6/U;

    if-nez v1, :cond_2

    invoke-virtual {v0}, LT6/g0;->s()LT6/U;

    move-result-object v1

    iput-object v1, p0, LT6/M;->d:LT6/U;

    :cond_2
    iget v1, p0, LT6/M;->c:I

    if-nez v1, :cond_3

    invoke-virtual {v0}, LT6/g0;->t()I

    move-result v0

    invoke-virtual {p0, v0}, LT6/M;->y(I)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final A(LT6/U;)V
    .locals 0

    iput-object p1, p0, LT6/M;->d:LT6/U;

    return-void
.end method

.method public final B(Z)V
    .locals 0

    iput-boolean p1, p0, LT6/M;->b:Z

    return-void
.end method

.method public final C(Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v1, v2, v0}, LT6/f;->m(Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    iput-object v0, p0, LT6/M;->e:Ljava/lang/String;

    return-void
.end method

.method public final b()LT6/g0;
    .locals 12

    invoke-direct {p0}, LT6/M;->a()V

    new-instance v11, LT6/g0;

    iget-object v1, p0, LT6/M;->d:LT6/U;

    iget-object v2, p0, LT6/M;->a:Ljava/lang/String;

    iget v3, p0, LT6/M;->c:I

    invoke-virtual {p0}, LT6/M;->m()Ljava/util/List;

    move-result-object v4

    iget-object v0, p0, LT6/M;->j:LT6/H;

    invoke-interface {v0}, LT6/H;->i()LT6/G;

    move-result-object v5

    invoke-virtual {p0}, LT6/M;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, LT6/M;->r()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, LT6/M;->l()Ljava/lang/String;

    move-result-object v8

    iget-boolean v9, p0, LT6/M;->b:Z

    invoke-virtual {p0}, LT6/M;->c()Ljava/lang/String;

    move-result-object v10

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, LT6/g0;-><init>(LT6/U;Ljava/lang/String;ILjava/util/List;LT6/G;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-object v11
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    invoke-direct {p0}, LT6/M;->a()V

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {p0, v0}, LT6/O;->a(LT6/M;Ljava/lang/Appendable;)Ljava/lang/Appendable;

    move-result-object v0

    check-cast v0, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LT6/M;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final e()LT6/H;
    .locals 1

    iget-object v0, p0, LT6/M;->i:LT6/H;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LT6/M;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LT6/M;->h:Ljava/util/List;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LT6/M;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, LT6/M;->g:Ljava/lang/String;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, LT6/f;->k(Ljava/lang/String;IIZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LT6/M;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final k()LT6/H;
    .locals 1

    iget-object v0, p0, LT6/M;->j:LT6/H;

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 6

    .prologue
    iget-object v0, p0, LT6/M;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LT6/f;->i(Ljava/lang/String;IILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final m()Ljava/util/List;
    .locals 9

    .prologue
    iget-object v0, p0, LT6/M;->h:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, LT6/f;->i(Ljava/lang/String;IILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final n()I
    .locals 1

    iget v0, p0, LT6/M;->c:I

    return v0
.end method

.method public final o()LT6/U;
    .locals 1

    .prologue
    iget-object v0, p0, LT6/M;->d:LT6/U;

    if-nez v0, :cond_0

    sget-object v0, LT6/U;->c:LT6/U$a;

    invoke-virtual {v0}, LT6/U$a;->c()LT6/U;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final p()LT6/U;
    .locals 1

    iget-object v0, p0, LT6/M;->d:LT6/U;

    return-object v0
.end method

.method public final q()Z
    .locals 1

    iget-boolean v0, p0, LT6/M;->b:Z

    return v0
.end method

.method public final r()Ljava/lang/String;
    .locals 6

    .prologue
    iget-object v0, p0, LT6/M;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LT6/f;->i(Ljava/lang/String;IILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final s(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LT6/M;->g:Ljava/lang/String;

    return-void
.end method

.method public final t(LT6/H;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LT6/M;->i:LT6/H;

    new-instance v0, LT6/h0;

    invoke-direct {v0, p1}, LT6/h0;-><init>(LT6/H;)V

    iput-object v0, p0, LT6/M;->j:LT6/H;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {p0, v0}, LT6/O;->a(LT6/M;Ljava/lang/Appendable;)Ljava/lang/Appendable;

    move-result-object v0

    check-cast v0, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final u(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LT6/M;->f:Ljava/lang/String;

    return-void
.end method

.method public final v(Ljava/util/List;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LT6/M;->h:Ljava/util/List;

    return-void
.end method

.method public final w(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LT6/M;->e:Ljava/lang/String;

    return-void
.end method

.method public final x(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LT6/M;->a:Ljava/lang/String;

    return-void
.end method

.method public final y(I)V
    .locals 2

    .prologue
    if-ltz p1, :cond_0

    const/high16 v0, 0x10000

    if-ge p1, v0, :cond_0

    iput p1, p0, LT6/M;->c:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Port must be between 0 and 65535, or 0 if not set. Provided: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final z(LT6/U;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LT6/M;->d:LT6/U;

    return-void
.end method
