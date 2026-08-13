.class public abstract Lb1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final synthetic a()Z
    .locals 1

    sget-boolean v0, Lb1/j;->a:Z

    return v0
.end method

.method public static final synthetic b(Lm1/e;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lb1/j;->g(Lm1/e;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lb1/z;Ljava/util/List;)V
    .locals 5

    .prologue
    const-string v0, "state"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurables"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LD0/G;

    invoke-static {v2}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-static {v2}, Lb1/m;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-static {}, Lb1/j;->d()Ljava/lang/Object;

    move-result-object v3

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4, v2}, Lj1/g;->t(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lb1/m;->b(LD0/G;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    instance-of v4, v2, Ljava/lang/String;

    if-eqz v4, :cond_1

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_1

    check-cast v3, Ljava/lang/String;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v3, v2}, Lj1/g;->z(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static final d()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lb1/j$a;

    invoke-direct {v0}, Lb1/j$a;-><init>()V

    return-object v0
.end method

.method public static final e(LD0/X$a;LD0/X;Lj1/h;J)V
    .locals 9

    .prologue
    const-string v1, "$this$placeWithFrameTransform"

    invoke-static {p0, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "placeable"

    invoke-static {p1, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "frame"

    invoke-static {p2, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lj1/h;->q()I

    move-result v1

    const/16 v4, 0x8

    if-ne v1, v4, :cond_1

    sget-boolean v1, Lb1/j;->a:Z

    if-eqz v1, :cond_0

    sget-object v1, Ld1/a;->a:Ld1/a;

    invoke-virtual {p2}, Lj1/h;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Widget: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " is Gone. Skipping placement."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "CCL"

    invoke-virtual {v1, v2, v0}, Ld1/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p2}, Lj1/h;->s()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p2}, Lj1/h;->e()I

    move-result v1

    invoke-static {p3, p4}, LY0/p;->h(J)I

    move-result v4

    sub-int/2addr v1, v4

    invoke-virtual {p2}, Lj1/h;->m()I

    move-result v0

    invoke-static {p3, p4}, LY0/p;->i(J)I

    move-result v4

    sub-int/2addr v0, v4

    invoke-static {v1, v0}, LY0/q;->a(II)J

    move-result-wide v4

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-static/range {v2 .. v8}, LD0/X$a;->j(LD0/X$a;LD0/X;JFILjava/lang/Object;)V

    goto :goto_2

    :cond_2
    new-instance v7, Lb1/j$b;

    invoke-direct {v7, p2}, Lb1/j$b;-><init>(Lj1/h;)V

    invoke-virtual {p2}, Lj1/h;->e()I

    move-result v1

    invoke-static {p3, p4}, LY0/p;->h(J)I

    move-result v4

    sub-int v4, v1, v4

    invoke-virtual {p2}, Lj1/h;->m()I

    move-result v1

    invoke-static {p3, p4}, LY0/p;->i(J)I

    move-result v5

    sub-int v5, v1, v5

    invoke-virtual {p2}, Lj1/h;->p()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v0, 0x0

    :goto_0
    move v6, v0

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Lj1/h;->p()F

    move-result v0

    goto :goto_0

    :goto_1
    move-object v2, p0

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, LD0/X$a;->u(LD0/X;IIFLx7/l;)V

    :goto_2
    return-void
.end method

.method public static synthetic f(LD0/X$a;LD0/X;Lj1/h;JILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    sget-object p3, LY0/p;->b:LY0/p$a;

    invoke-virtual {p3}, LY0/p$a;->a()J

    move-result-wide p3

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lb1/j;->e(LD0/X$a;LD0/X;Lj1/h;J)V

    return-void
.end method

.method private static final g(Lm1/e;)Ljava/lang/String;
    .locals 13

    invoke-virtual {p0}, Lm1/e;->q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lm1/e;->B0()I

    move-result v1

    invoke-virtual {p0}, Lm1/e;->m0()I

    move-result v2

    invoke-virtual {p0}, Lm1/e;->j0()I

    move-result v3

    invoke-virtual {p0}, Lm1/e;->w()I

    move-result v4

    invoke-virtual {p0}, Lm1/e;->l0()I

    move-result v5

    invoke-virtual {p0}, Lm1/e;->i0()I

    move-result v6

    invoke-virtual {p0}, Lm1/e;->A()Lm1/e$b;

    move-result-object v7

    invoke-virtual {p0}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v8

    invoke-virtual {p0}, Lm1/e;->Q()I

    move-result v9

    invoke-virtual {p0}, Lm1/e;->P()I

    move-result v10

    invoke-virtual {p0}, Lm1/e;->W()F

    move-result v11

    invoke-virtual {p0}, Lm1/e;->V()F

    move-result p0

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " width "

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " minWidth "

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " maxWidth "

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " height "

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " minHeight "

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " maxHeight "

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " HDB "

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " VDB "

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " MCW "

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " MCH "

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " percentW "

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " percentH "

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
