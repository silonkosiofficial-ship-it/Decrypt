.class public final Lm1/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lm1/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILm1/e;Ln1/b$c;Ln1/b$b;I)Z
    .locals 5

    .prologue
    const-string v0, "widget"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measure"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lm1/f;->i2()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ln1/h;->a:Ln1/h$a;

    invoke-virtual {v0, p1}, Ln1/h$a;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lm1/e;->q()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "(M) call to measure "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    if-nez p3, :cond_1

    return v0

    :cond_1
    invoke-virtual {p2}, Lm1/e;->A0()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_15

    instance-of v1, p2, Lm1/h;

    if-nez v1, :cond_15

    instance-of v1, p2, Lm1/a;

    if-eqz v1, :cond_2

    goto/16 :goto_a

    :cond_2
    invoke-virtual {p2}, Lm1/e;->A()Lm1/e$b;

    move-result-object p1

    invoke-virtual {p4, p1}, Ln1/b$b;->n(Lm1/e$b;)V

    invoke-virtual {p2}, Lm1/e;->y0()Lm1/e$b;

    move-result-object p1

    invoke-virtual {p4, p1}, Ln1/b$b;->v(Lm1/e$b;)V

    invoke-virtual {p2}, Lm1/e;->B0()I

    move-result p1

    invoke-virtual {p4, p1}, Ln1/b$b;->o(I)V

    invoke-virtual {p2}, Lm1/e;->w()I

    move-result p1

    invoke-virtual {p4, p1}, Ln1/b$b;->w(I)V

    invoke-virtual {p4, v0}, Ln1/b$b;->t(Z)V

    invoke-virtual {p4, p5}, Ln1/b$b;->p(I)V

    invoke-virtual {p4}, Ln1/b$b;->d()Lm1/e$b;

    move-result-object p1

    sget-object p5, Lm1/e$b;->E:Lm1/e$b;

    const/4 v1, 0x1

    if-ne p1, p5, :cond_3

    move p1, v1

    goto :goto_0

    :cond_3
    move p1, v0

    :goto_0
    invoke-virtual {p4}, Ln1/b$b;->l()Lm1/e$b;

    move-result-object v2

    if-ne v2, p5, :cond_4

    move p5, v1

    goto :goto_1

    :cond_4
    move p5, v0

    :goto_1
    const/4 v2, 0x0

    if-eqz p1, :cond_5

    invoke-virtual {p2}, Lm1/e;->I()F

    move-result v3

    cmpl-float v3, v3, v2

    if-lez v3, :cond_5

    move v3, v1

    goto :goto_2

    :cond_5
    move v3, v0

    :goto_2
    if-eqz p5, :cond_6

    invoke-virtual {p2}, Lm1/e;->I()F

    move-result v4

    cmpl-float v2, v4, v2

    if-lez v2, :cond_6

    move v2, v1

    goto :goto_3

    :cond_6
    move v2, v0

    :goto_3
    if-eqz p1, :cond_8

    invoke-virtual {p2, v0}, Lm1/e;->E0(I)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {p2}, Lm1/e;->Q()I

    move-result v4

    if-nez v4, :cond_8

    if-nez v3, :cond_8

    sget-object p1, Lm1/e$b;->D:Lm1/e$b;

    invoke-virtual {p4, p1}, Ln1/b$b;->n(Lm1/e$b;)V

    if-eqz p5, :cond_7

    invoke-virtual {p2}, Lm1/e;->P()I

    move-result p1

    if-nez p1, :cond_7

    sget-object p1, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {p4, p1}, Ln1/b$b;->n(Lm1/e$b;)V

    :cond_7
    move p1, v0

    :cond_8
    if-eqz p5, :cond_a

    invoke-virtual {p2, v1}, Lm1/e;->E0(I)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {p2}, Lm1/e;->P()I

    move-result v4

    if-nez v4, :cond_a

    if-nez v2, :cond_a

    sget-object p5, Lm1/e$b;->D:Lm1/e$b;

    invoke-virtual {p4, p5}, Ln1/b$b;->v(Lm1/e$b;)V

    if-eqz p1, :cond_9

    invoke-virtual {p2}, Lm1/e;->Q()I

    move-result p5

    if-nez p5, :cond_9

    sget-object p5, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {p4, p5}, Ln1/b$b;->v(Lm1/e$b;)V

    :cond_9
    move p5, v0

    :cond_a
    invoke-virtual {p2}, Lm1/e;->Q0()Z

    move-result v4

    if-eqz v4, :cond_b

    sget-object p1, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {p4, p1}, Ln1/b$b;->n(Lm1/e$b;)V

    move p1, v0

    :cond_b
    invoke-virtual {p2}, Lm1/e;->R0()Z

    move-result v4

    if-eqz v4, :cond_c

    sget-object p5, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {p4, p5}, Ln1/b$b;->v(Lm1/e$b;)V

    move p5, v0

    :cond_c
    const/4 v4, 0x4

    if-eqz v3, :cond_f

    invoke-virtual {p2}, Lm1/e;->a0()[I

    move-result-object v3

    aget v0, v3, v0

    if-ne v0, v4, :cond_d

    sget-object p5, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {p4, p5}, Ln1/b$b;->n(Lm1/e$b;)V

    goto :goto_5

    :cond_d
    if-nez p5, :cond_f

    invoke-virtual {p4}, Ln1/b$b;->l()Lm1/e$b;

    move-result-object p5

    sget-object v0, Lm1/e$b;->C:Lm1/e$b;

    if-ne p5, v0, :cond_e

    invoke-virtual {p4}, Ln1/b$b;->m()I

    move-result p5

    goto :goto_4

    :cond_e
    sget-object p5, Lm1/e$b;->D:Lm1/e$b;

    invoke-virtual {p4, p5}, Ln1/b$b;->n(Lm1/e$b;)V

    invoke-interface {p3, p2, p4}, Ln1/b$c;->b(Lm1/e;Ln1/b$b;)V

    invoke-virtual {p4}, Ln1/b$b;->i()I

    move-result p5

    :goto_4
    invoke-virtual {p4, v0}, Ln1/b$b;->n(Lm1/e$b;)V

    invoke-virtual {p2}, Lm1/e;->s()F

    move-result v0

    int-to-float p5, p5

    mul-float/2addr v0, p5

    float-to-int p5, v0

    invoke-virtual {p4, p5}, Ln1/b$b;->o(I)V

    invoke-static {}, Lm1/f;->i2()Z

    move-result p5

    if-eqz p5, :cond_f

    const-string p5, "(M) Measured once for ratio on horizontal side..."

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p5}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_f
    :goto_5
    if-eqz v2, :cond_13

    invoke-virtual {p2}, Lm1/e;->a0()[I

    move-result-object p5

    aget p5, p5, v1

    if-ne p5, v4, :cond_10

    sget-object p1, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {p4, p1}, Ln1/b$b;->v(Lm1/e$b;)V

    goto :goto_9

    :cond_10
    if-nez p1, :cond_13

    invoke-virtual {p4}, Ln1/b$b;->d()Lm1/e$b;

    move-result-object p1

    sget-object p5, Lm1/e$b;->C:Lm1/e$b;

    if-ne p1, p5, :cond_11

    invoke-virtual {p4}, Ln1/b$b;->e()I

    move-result p1

    goto :goto_6

    :cond_11
    sget-object p1, Lm1/e$b;->D:Lm1/e$b;

    invoke-virtual {p4, p1}, Ln1/b$b;->v(Lm1/e$b;)V

    invoke-interface {p3, p2, p4}, Ln1/b$c;->b(Lm1/e;Ln1/b$b;)V

    invoke-virtual {p4}, Ln1/b$b;->k()I

    move-result p1

    :goto_6
    invoke-virtual {p4, p5}, Ln1/b$b;->v(Lm1/e$b;)V

    invoke-virtual {p2}, Lm1/e;->t()I

    move-result p5

    const/4 v0, -0x1

    if-ne p5, v0, :cond_12

    int-to-float p1, p1

    invoke-virtual {p2}, Lm1/e;->s()F

    move-result p5

    div-float/2addr p1, p5

    float-to-int p1, p1

    :goto_7
    invoke-virtual {p4, p1}, Ln1/b$b;->w(I)V

    goto :goto_8

    :cond_12
    invoke-virtual {p2}, Lm1/e;->s()F

    move-result p5

    int-to-float p1, p1

    mul-float/2addr p5, p1

    float-to-int p1, p5

    goto :goto_7

    :goto_8
    invoke-static {}, Lm1/f;->i2()Z

    move-result p1

    if-eqz p1, :cond_13

    const-string p1, "(M) Measured once for ratio on vertical side..."

    sget-object p5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p5, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_13
    :goto_9
    invoke-interface {p3, p2, p4}, Ln1/b$c;->b(Lm1/e;Ln1/b$b;)V

    invoke-virtual {p4}, Ln1/b$b;->k()I

    move-result p1

    invoke-virtual {p2, p1}, Lm1/e;->U1(I)V

    invoke-virtual {p4}, Ln1/b$b;->i()I

    move-result p1

    invoke-virtual {p2, p1}, Lm1/e;->m1(I)V

    invoke-virtual {p4}, Ln1/b$b;->h()Z

    move-result p1

    invoke-virtual {p2, p1}, Lm1/e;->l1(Z)V

    invoke-virtual {p4}, Ln1/b$b;->g()I

    move-result p1

    invoke-virtual {p2, p1}, Lm1/e;->a1(I)V

    sget-object p1, Ln1/b$b;->k:Ln1/b$b$a;

    invoke-virtual {p1}, Ln1/b$b$a;->a()I

    move-result p1

    invoke-virtual {p4, p1}, Ln1/b$b;->p(I)V

    invoke-static {}, Lm1/f;->i2()Z

    move-result p1

    if-eqz p1, :cond_14

    invoke-virtual {p2}, Lm1/e;->q()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lm1/e;->A()Lm1/e$b;

    move-result-object p3

    invoke-virtual {p2}, Lm1/e;->y0()Lm1/e$b;

    move-result-object p5

    invoke-virtual {p2}, Lm1/e;->B0()I

    move-result v0

    invoke-virtual {p2}, Lm1/e;->w()I

    move-result p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "(M) Measured "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " with : "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " x "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " => "

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_14
    invoke-virtual {p4}, Ln1/b$b;->j()Z

    move-result p1

    return p1

    :cond_15
    :goto_a
    invoke-static {}, Lm1/f;->i2()Z

    move-result p3

    if-eqz p3, :cond_16

    sget-object p3, Ln1/h;->a:Ln1/h$a;

    invoke-virtual {p3, p1}, Ln1/h$a;->c(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lm1/e;->q()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "(M) no measure needed for "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_16
    invoke-virtual {p4, v0}, Ln1/b$b;->u(I)V

    invoke-virtual {p4, v0}, Ln1/b$b;->s(I)V

    return v0
.end method
