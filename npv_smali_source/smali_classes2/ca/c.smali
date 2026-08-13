.class public abstract Lca/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Lda/a;Ljava/lang/String;Ljava/lang/String;)Lda/a;
    .locals 4

    .prologue
    invoke-interface {p0, p1}, Lda/c;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0}, Lca/c;->c(Lda/a;)LR8/h;

    move-result-object p0

    sget-object v0, Lca/c$a;->D:Lca/c$a;

    invoke-static {p0, v0}, LR8/k;->w(LR8/h;Lx7/l;)LR8/h;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LR8/h;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lda/a;

    invoke-interface {v1}, Lda/c;->c()Ljava/lang/String;

    move-result-object v2

    const-string v3, "http://schemas.android.com/aapt"

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Lda/c;->d()Ljava/lang/String;

    move-result-object v2

    const-string v3, "attr"

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "name"

    invoke-interface {v1, v2}, Lda/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lda/a;

    return-object v0
.end method

.method private static final b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    invoke-interface {p0, p1, p2}, Lda/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LS8/r;->s0(Ljava/lang/CharSequence;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final c(Lda/a;)LR8/h;
    .locals 2

    new-instance v0, Lca/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lca/c$b;-><init>(Lda/a;Lm7/e;)V

    invoke-static {v0}, LR8/k;->b(Lx7/p;)LR8/h;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lda/a;Lu0/d$a;Lca/a;)V
    .locals 15

    .prologue
    move-object v0, p0

    const-string v1, "name"

    const-string v2, "http://schemas.android.com/apk/res/android"

    invoke-static {p0, v2, v1}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    move-object v4, v1

    const-string v1, "pathData"

    invoke-static {p0, v2, v1}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lu0/o;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    const/16 v13, 0xfe

    const/4 v14, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v3, p1

    invoke-static/range {v3 .. v14}, Lu0/d$a;->b(Lu0/d$a;Ljava/lang/String;FFFFFFFLjava/util/List;ILjava/lang/Object;)Lu0/d$a;

    invoke-virtual/range {p2 .. p2}, Lca/a;->a()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lca/a$a;->D:Lca/a$a;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static final e(Lda/a;F)Li7/u;
    .locals 2

    .prologue
    const-string v0, "offset"

    const-string v1, "http://schemas.android.com/apk/res/android"

    invoke-static {p0, v1, v0}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    :cond_0
    const-string v0, "color"

    invoke-static {p0, v1, v0}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lca/b;->a(Ljava/lang/String;)I

    move-result p0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p0}, Lo0/A0;->b(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object p0

    invoke-static {p1, p0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final f(Lda/a;)[Li7/u;
    .locals 9

    .prologue
    invoke-static {p0}, Lca/c;->c(Lda/a;)LR8/h;

    move-result-object v0

    sget-object v1, Lca/c$c;->D:Lca/c$c;

    invoke-static {v0, v1}, LR8/k;->w(LR8/h;Lx7/l;)LR8/h;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lca/c$d;->D:Lca/c$d;

    invoke-static {v0, v1}, LR8/k;->w(LR8/h;Lx7/l;)LR8/h;

    move-result-object v0

    invoke-static {v0}, LR8/k;->M(LR8/h;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    if-gez v4, :cond_0

    invoke-static {}, Lj7/v;->w()V

    :cond_0
    check-cast v5, Lda/a;

    int-to-float v4, v4

    invoke-static {v0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v7

    const/4 v8, 0x1

    invoke-static {v7, v8}, LE7/j;->d(II)I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v4, v7

    invoke-static {v5, v4}, Lca/c;->e(Lda/a;F)Li7/u;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    move v4, v6

    goto :goto_0

    :cond_2
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "startColor"

    const-string v1, "http://schemas.android.com/apk/res/android"

    invoke-static {p0, v1, v0}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lca/b;->a(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v4

    :goto_1
    const-string v5, "centerColor"

    invoke-static {p0, v1, v5}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-static {v5}, Lca/b;->a(Ljava/lang/String;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_2

    :cond_4
    move-object v5, v4

    :goto_2
    const-string v6, "endColor"

    invoke-static {p0, v1, v6}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-static {p0}, Lca/b;->a(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_5
    if-eqz v0, :cond_6

    const/4 p0, 0x0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo0/A0;->b(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v0

    invoke-static {p0, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p0

    invoke-interface {v2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    if-eqz v5, :cond_7

    const/high16 p0, 0x3f000000    # 0.5f

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo0/A0;->b(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v0

    invoke-static {p0, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p0

    invoke-interface {v2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    if-eqz v4, :cond_8

    const/high16 p0, 0x3f800000    # 1.0f

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo0/A0;->b(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v0

    invoke-static {p0, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p0

    invoke-interface {v2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    new-array p0, v3, [Li7/u;

    invoke-interface {v2, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Li7/u;

    return-object p0
.end method

.method private static final g(Lda/a;)Lo0/n0;
    .locals 4

    .prologue
    invoke-static {p0}, Lca/c;->c(Lda/a;)LR8/h;

    move-result-object p0

    sget-object v0, Lca/c$e;->D:Lca/c$e;

    invoke-static {p0, v0}, LR8/k;->w(LR8/h;Lx7/l;)LR8/h;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LR8/h;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lda/a;

    invoke-interface {v2}, Lda/c;->e()Ljava/lang/String;

    move-result-object v2

    const-string v3, "gradient"

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, Lda/a;

    if-eqz v0, :cond_2

    invoke-static {v0}, Lca/c;->h(Lda/a;)Lo0/n0;

    move-result-object v1

    :cond_2
    return-object v1
.end method

.method private static final h(Lda/a;)Lo0/n0;
    .locals 3

    .prologue
    const-string v0, "http://schemas.android.com/apk/res/android"

    const-string v1, "type"

    invoke-static {p0, v0, v1}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x41b970db

    if-eq v1, v2, :cond_4

    const v2, -0x37f195e1

    if-eq v1, v2, :cond_2

    const v2, 0x68c2eec

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "sweep"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lca/c;->n(Lda/a;)Lo0/n0;

    move-result-object p0

    goto :goto_1

    :cond_2
    const-string v1, "radial"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {p0}, Lca/c;->l(Lda/a;)Lo0/n0;

    move-result-object p0

    goto :goto_1

    :cond_4
    const-string v1, "linear"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p0}, Lca/c;->j(Lda/a;)Lo0/n0;

    move-result-object p0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 p0, 0x0

    :goto_1
    return-object p0
.end method

.method private static final i(Lda/a;Lu0/d$a;Lca/a;)V
    .locals 12

    .prologue
    const-string v0, "name"

    const-string v1, "http://schemas.android.com/apk/res/android"

    invoke-static {p0, v1, v0}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v3, v0

    const-string v0, "rotation"

    invoke-static {p0, v1, v0}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_1
    move v4, v2

    :goto_0
    const-string v0, "pivotX"

    invoke-static {p0, v1, v0}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    move v5, v0

    goto :goto_1

    :cond_2
    move v5, v2

    :goto_1
    const-string v0, "pivotY"

    invoke-static {p0, v1, v0}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    move v6, v0

    goto :goto_2

    :cond_3
    move v6, v2

    :goto_2
    const-string v0, "scaleX"

    invoke-static {p0, v1, v0}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/high16 v7, 0x3f800000    # 1.0f

    if-eqz v0, :cond_4

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    goto :goto_3

    :cond_4
    move v0, v7

    :goto_3
    const-string v8, "scaleY"

    invoke-static {p0, v1, v8}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_5

    invoke-static {v8}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v7

    :cond_5
    move v8, v7

    const-string v7, "translateX"

    invoke-static {p0, v1, v7}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v7

    move v9, v7

    goto :goto_4

    :cond_6
    move v9, v2

    :goto_4
    const-string v7, "translateY"

    invoke-static {p0, v1, v7}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    move v10, v1

    goto :goto_5

    :cond_7
    move v10, v2

    :goto_5
    invoke-static {}, Lu0/o;->e()Ljava/util/List;

    move-result-object v11

    move-object v2, p1

    move v7, v0

    invoke-virtual/range {v2 .. v11}, Lu0/d$a;->a(Ljava/lang/String;FFFFFFFLjava/util/List;)Lu0/d$a;

    invoke-virtual {p2}, Lca/a;->a()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lca/a$a;->C:Lca/a$a;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p0, p1, p2}, Lca/c;->p(Lda/a;Lu0/d$a;Lca/a;)V

    :cond_8
    invoke-virtual {p2}, Lca/a;->a()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lj7/v;->M(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lca/a$a;

    invoke-virtual {p1}, Lu0/d$a;->g()Lu0/d$a;

    sget-object v0, Lca/a$a;->D:Lca/a$a;

    if-eq p0, v0, :cond_8

    return-void
.end method

.method private static final j(Lda/a;)Lo0/n0;
    .locals 9

    .prologue
    sget-object v0, Lo0/n0;->b:Lo0/n0$a;

    invoke-static {p0}, Lca/c;->f(Lda/a;)[Li7/u;

    move-result-object v1

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Li7/u;

    const-string v2, "startX"

    const-string v3, "http://schemas.android.com/apk/res/android"

    invoke-static {p0, v3, v2}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    const-string v5, "startY"

    invoke-static {p0, v3, v5}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    invoke-static {v2, v5}, Ln0/h;->a(FF)J

    move-result-wide v5

    const-string v2, "endX"

    invoke-static {p0, v3, v2}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v4

    :goto_2
    const-string v7, "endY"

    invoke-static {p0, v3, v7}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    :cond_3
    invoke-static {v2, v4}, Ln0/h;->a(FF)J

    move-result-wide v7

    const-string v2, "tileMode"

    invoke-static {p0, v3, v2}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-static {p0}, Lca/b;->f(Ljava/lang/String;)I

    move-result p0

    goto :goto_3

    :cond_4
    sget-object p0, Lo0/j2;->a:Lo0/j2$a;

    invoke-virtual {p0}, Lo0/j2$a;->a()I

    move-result p0

    :goto_3
    move-wide v2, v5

    move-wide v4, v7

    move v6, p0

    invoke-virtual/range {v0 .. v6}, Lo0/n0$a;->a([Li7/u;JJI)Lo0/n0;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lda/a;Lu0/d$a;)V
    .locals 18

    .prologue
    move-object/from16 v0, p0

    const-string v1, "pathData"

    const-string v2, "http://schemas.android.com/apk/res/android"

    invoke-static {v0, v2, v1}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lu0/o;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    const-string v1, "fillType"

    invoke-static {v0, v2, v1}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lca/b;->c(Ljava/lang/String;)I

    move-result v1

    :goto_0
    move v5, v1

    goto :goto_1

    :cond_0
    sget-object v1, Lo0/S1;->a:Lo0/S1$a;

    invoke-virtual {v1}, Lo0/S1$a;->b()I

    move-result v1

    goto :goto_0

    :goto_1
    const-string v1, "name"

    invoke-static {v0, v2, v1}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, ""

    :cond_1
    move-object v6, v1

    const-string v1, "fillColor"

    invoke-static {v0, v2, v1}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    if-eqz v3, :cond_2

    invoke-static {v3}, Lca/c;->m(Ljava/lang/String;)Lo0/f2;

    move-result-object v3

    if-eqz v3, :cond_2

    move-object v1, v3

    goto :goto_2

    :cond_2
    invoke-static {v0, v2, v1}, Lca/c;->a(Lda/a;Ljava/lang/String;Ljava/lang/String;)Lda/a;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lca/c;->g(Lda/a;)Lo0/n0;

    move-result-object v1

    goto :goto_2

    :cond_3
    move-object v1, v7

    :goto_2
    const-string v3, "fillAlpha"

    invoke-static {v0, v2, v3}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/high16 v8, 0x3f800000    # 1.0f

    if-eqz v3, :cond_4

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    move v9, v3

    goto :goto_3

    :cond_4
    move v9, v8

    :goto_3
    const-string v3, "strokeColor"

    invoke-static {v0, v2, v3}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_5

    invoke-static {v10}, Lca/c;->m(Ljava/lang/String;)Lo0/f2;

    move-result-object v10

    if-eqz v10, :cond_5

    goto :goto_4

    :cond_5
    invoke-static {v0, v2, v3}, Lca/c;->a(Lda/a;Ljava/lang/String;Ljava/lang/String;)Lda/a;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-static {v3}, Lca/c;->g(Lda/a;)Lo0/n0;

    move-result-object v3

    move-object v10, v3

    goto :goto_4

    :cond_6
    move-object v10, v7

    :goto_4
    const-string v3, "strokeAlpha"

    invoke-static {v0, v2, v3}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    move v11, v3

    goto :goto_5

    :cond_7
    move v11, v8

    :goto_5
    const-string v3, "strokeWidth"

    invoke-static {v0, v2, v3}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    move v12, v3

    goto :goto_6

    :cond_8
    move v12, v8

    :goto_6
    const-string v3, "strokeLineCap"

    invoke-static {v0, v2, v3}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-static {v3}, Lca/b;->d(Ljava/lang/String;)I

    move-result v3

    :goto_7
    move v13, v3

    goto :goto_8

    :cond_9
    sget-object v3, Lo0/g2;->a:Lo0/g2$a;

    invoke-virtual {v3}, Lo0/g2$a;->a()I

    move-result v3

    goto :goto_7

    :goto_8
    const-string v3, "strokeLineJoin"

    invoke-static {v0, v2, v3}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-static {v3}, Lca/b;->e(Ljava/lang/String;)I

    move-result v3

    :goto_9
    move v14, v3

    goto :goto_a

    :cond_a
    sget-object v3, Lo0/h2;->a:Lo0/h2$a;

    invoke-virtual {v3}, Lo0/h2$a;->b()I

    move-result v3

    goto :goto_9

    :goto_a
    const-string v3, "strokeMiterLimit"

    invoke-static {v0, v2, v3}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    move v15, v3

    goto :goto_b

    :cond_b
    move v15, v8

    :goto_b
    const-string v3, "trimPathStart"

    invoke-static {v0, v2, v3}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    if-eqz v3, :cond_c

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    move/from16 v16, v3

    goto :goto_c

    :cond_c
    move/from16 v16, v7

    :goto_c
    const-string v3, "trimPathEnd"

    invoke-static {v0, v2, v3}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_d

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    move/from16 v17, v3

    goto :goto_d

    :cond_d
    move/from16 v17, v8

    :goto_d
    const-string v3, "trimPathOffset"

    invoke-static {v0, v2, v3}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    goto :goto_e

    :cond_e
    move v0, v7

    :goto_e
    move-object/from16 v3, p1

    move-object v7, v1

    move v8, v9

    move-object v9, v10

    move v10, v11

    move v11, v12

    move v12, v13

    move v13, v14

    move v14, v15

    move/from16 v15, v16

    move/from16 v16, v17

    move/from16 v17, v0

    invoke-virtual/range {v3 .. v17}, Lu0/d$a;->c(Ljava/util/List;ILjava/lang/String;Lo0/n0;FLo0/n0;FFIIFFFF)Lu0/d$a;

    return-void
.end method

.method private static final l(Lda/a;)Lo0/n0;
    .locals 7

    .prologue
    sget-object v0, Lo0/n0;->b:Lo0/n0$a;

    invoke-static {p0}, Lca/c;->f(Lda/a;)[Li7/u;

    move-result-object v1

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Li7/u;

    const-string v2, "centerX"

    const-string v3, "http://schemas.android.com/apk/res/android"

    invoke-static {p0, v3, v2}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    const-string v5, "centerY"

    invoke-static {p0, v3, v5}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    invoke-static {v2, v5}, Ln0/h;->a(FF)J

    move-result-wide v5

    const-string v2, "gradientRadius"

    invoke-static {p0, v3, v2}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    move v4, v2

    :cond_2
    const-string v2, "tileMode"

    invoke-static {p0, v3, v2}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-static {p0}, Lca/b;->f(Ljava/lang/String;)I

    move-result p0

    goto :goto_2

    :cond_3
    sget-object p0, Lo0/j2;->a:Lo0/j2$a;

    invoke-virtual {p0}, Lo0/j2$a;->a()I

    move-result p0

    :goto_2
    move-wide v2, v5

    move v5, p0

    invoke-virtual/range {v0 .. v5}, Lo0/n0$a;->b([Li7/u;JFI)Lo0/n0;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Ljava/lang/String;)Lo0/f2;
    .locals 3

    new-instance v0, Lo0/f2;

    invoke-static {p0}, Lca/b;->a(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Lo0/A0;->b(I)J

    move-result-wide v1

    const/4 p0, 0x0

    invoke-direct {v0, v1, v2, p0}, Lo0/f2;-><init>(JLy7/k;)V

    return-object v0
.end method

.method private static final n(Lda/a;)Lo0/n0;
    .locals 6

    .prologue
    sget-object v0, Lo0/n0;->b:Lo0/n0$a;

    invoke-static {p0}, Lca/c;->f(Lda/a;)[Li7/u;

    move-result-object v1

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Li7/u;

    const-string v2, "centerX"

    const-string v3, "http://schemas.android.com/apk/res/android"

    invoke-static {p0, v3, v2}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    const-string v5, "centerY"

    invoke-static {p0, v3, v5}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    :cond_1
    invoke-static {v2, v4}, Ln0/h;->a(FF)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lo0/n0$a;->c([Li7/u;J)Lo0/n0;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lda/a;Lu0/d$a;Lca/a;)V
    .locals 3

    .prologue
    invoke-interface {p0}, Lda/c;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x624e8b7e

    if-eq v1, v2, :cond_4

    const v2, 0x346425

    if-eq v1, v2, :cond_2

    const v2, 0x5e0f67f

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "group"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0, p1, p2}, Lca/c;->i(Lda/a;Lu0/d$a;Lca/a;)V

    goto :goto_0

    :cond_2
    const-string p2, "path"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {p0, p1}, Lca/c;->k(Lda/a;Lu0/d$a;)V

    goto :goto_0

    :cond_4
    const-string v1, "clip-path"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    invoke-static {p0, p1, p2}, Lca/c;->d(Lda/a;Lu0/d$a;Lca/a;)V

    :goto_0
    return-void
.end method

.method private static final p(Lda/a;Lu0/d$a;Lca/a;)V
    .locals 1

    .prologue
    invoke-static {p0}, Lca/c;->c(Lda/a;)LR8/h;

    move-result-object p0

    sget-object v0, Lca/c$f;->D:Lca/c$f;

    invoke-static {p0, v0}, LR8/k;->w(LR8/h;Lx7/l;)LR8/h;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LR8/h;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lda/a;

    invoke-static {v0, p1, p2}, Lca/c;->o(Lda/a;Lu0/d$a;Lca/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final q(Lda/a;LY0/e;)Lu0/d;
    .locals 14

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "density"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lca/a;

    invoke-direct {v0}, Lca/a;-><init>()V

    new-instance v13, Lu0/d$a;

    const-string v1, "width"

    const-string v2, "http://schemas.android.com/apk/res/android"

    invoke-static {p0, v2, v1}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lca/b;->b(Ljava/lang/String;LY0/e;)F

    move-result v3

    const-string v1, "height"

    invoke-static {p0, v2, v1}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lca/b;->b(Ljava/lang/String;LY0/e;)F

    move-result v4

    const-string p1, "viewportWidth"

    invoke-static {p0, v2, p1}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    move v5, p1

    goto :goto_0

    :cond_0
    move v5, v1

    :goto_0
    const-string p1, "viewportHeight"

    invoke-static {p0, v2, p1}, Lca/c;->b(Lda/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    move v6, p1

    goto :goto_1

    :cond_1
    move v6, v1

    :goto_1
    const/16 v11, 0xe1

    const/4 v12, 0x0

    const/4 v2, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, v13

    invoke-direct/range {v1 .. v12}, Lu0/d$a;-><init>(Ljava/lang/String;FFFFJIZILy7/k;)V

    invoke-static {p0, v13, v0}, Lca/c;->p(Lda/a;Lu0/d$a;Lca/a;)V

    invoke-virtual {v13}, Lu0/d$a;->f()Lu0/d;

    move-result-object p0

    return-object p0
.end method
