.class public final Lq0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq0/a$a;
    }
.end annotation


# instance fields
.field private final C:Lq0/a$a;

.field private final D:Lq0/d;

.field private E:Lo0/N1;

.field private F:Lo0/N1;


# direct methods
.method public constructor <init>()V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v8, Lq0/a$a;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lq0/a$a;-><init>(LY0/e;LY0/v;Lo0/q0;JILy7/k;)V

    iput-object v8, p0, Lq0/a;->C:Lq0/a$a;

    new-instance v0, Lq0/a$b;

    invoke-direct {v0, p0}, Lq0/a$b;-><init>(Lq0/a;)V

    iput-object v0, p0, Lq0/a;->D:Lq0/d;

    return-void
.end method

.method static synthetic C(Lq0/a;JFFIILo0/R1;FLo0/z0;IIILjava/lang/Object;)Lo0/N1;
    .locals 13

    .prologue
    move/from16 v0, p12

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    sget-object v0, Lq0/g;->B:Lq0/g$a;

    invoke-virtual {v0}, Lq0/g$a;->b()I

    move-result v0

    move v12, v0

    goto :goto_0

    :cond_0
    move/from16 v12, p11

    :goto_0
    move-object v1, p0

    move-wide v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    invoke-direct/range {v1 .. v12}, Lq0/a;->y(JFFIILo0/R1;FLo0/z0;II)Lo0/N1;

    move-result-object v0

    return-object v0
.end method

.method private final F(Lo0/n0;FFIILo0/R1;FLo0/z0;II)Lo0/N1;
    .locals 3

    .prologue
    invoke-direct {p0}, Lq0/a;->M()Lo0/N1;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lq0/a;->i()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2, v0, p7}, Lo0/n0;->a(JLo0/N1;F)V

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lo0/N1;->a()F

    move-result p1

    cmpg-float p1, p1, p7

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0, p7}, Lo0/N1;->b(F)V

    :goto_0
    invoke-interface {v0}, Lo0/N1;->f()Lo0/z0;

    move-result-object p1

    invoke-static {p1, p8}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-interface {v0, p8}, Lo0/N1;->A(Lo0/z0;)V

    :cond_2
    invoke-interface {v0}, Lo0/N1;->q()I

    move-result p1

    invoke-static {p1, p9}, Lo0/f0;->E(II)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-interface {v0, p9}, Lo0/N1;->u(I)V

    :cond_3
    invoke-interface {v0}, Lo0/N1;->J()F

    move-result p1

    cmpg-float p1, p1, p2

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v0, p2}, Lo0/N1;->I(F)V

    :goto_1
    invoke-interface {v0}, Lo0/N1;->v()F

    move-result p1

    cmpg-float p1, p1, p3

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v0, p3}, Lo0/N1;->z(F)V

    :goto_2
    invoke-interface {v0}, Lo0/N1;->D()I

    move-result p1

    invoke-static {p1, p4}, Lo0/g2;->e(II)Z

    move-result p1

    if-nez p1, :cond_6

    invoke-interface {v0, p4}, Lo0/N1;->s(I)V

    :cond_6
    invoke-interface {v0}, Lo0/N1;->r()I

    move-result p1

    invoke-static {p1, p5}, Lo0/h2;->e(II)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-interface {v0, p5}, Lo0/N1;->E(I)V

    :cond_7
    invoke-interface {v0}, Lo0/N1;->H()Lo0/R1;

    const/4 p1, 0x0

    invoke-static {p1, p6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    invoke-interface {v0, p6}, Lo0/N1;->t(Lo0/R1;)V

    :cond_8
    invoke-interface {v0}, Lo0/N1;->C()I

    move-result p1

    invoke-static {p1, p10}, Lo0/z1;->d(II)Z

    move-result p1

    if-nez p1, :cond_9

    invoke-interface {v0, p10}, Lo0/N1;->B(I)V

    :cond_9
    return-object v0
.end method

.method static synthetic G(Lq0/a;Lo0/n0;FFIILo0/R1;FLo0/z0;IIILjava/lang/Object;)Lo0/N1;
    .locals 12

    .prologue
    move/from16 v0, p11

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    sget-object v0, Lq0/g;->B:Lq0/g$a;

    invoke-virtual {v0}, Lq0/g$a;->b()I

    move-result v0

    move v11, v0

    goto :goto_0

    :cond_0
    move/from16 v11, p10

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v11}, Lq0/a;->F(Lo0/n0;FFIILo0/R1;FLo0/z0;II)Lo0/N1;

    move-result-object v0

    return-object v0
.end method

.method private final J(JF)J
    .locals 9

    .prologue
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p3, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lo0/y0;->p(J)F

    move-result v0

    mul-float v3, v0, p3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-wide v1, p1

    invoke-static/range {v1 .. v8}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method private final K()Lo0/N1;
    .locals 2

    .prologue
    iget-object v0, p0, Lq0/a;->E:Lo0/N1;

    if-nez v0, :cond_0

    invoke-static {}, Lo0/U;->a()Lo0/N1;

    move-result-object v0

    sget-object v1, Lo0/O1;->a:Lo0/O1$a;

    invoke-virtual {v1}, Lo0/O1$a;->a()I

    move-result v1

    invoke-interface {v0, v1}, Lo0/N1;->F(I)V

    iput-object v0, p0, Lq0/a;->E:Lo0/N1;

    :cond_0
    return-object v0
.end method

.method private final M()Lo0/N1;
    .locals 2

    .prologue
    iget-object v0, p0, Lq0/a;->F:Lo0/N1;

    if-nez v0, :cond_0

    invoke-static {}, Lo0/U;->a()Lo0/N1;

    move-result-object v0

    sget-object v1, Lo0/O1;->a:Lo0/O1$a;

    invoke-virtual {v1}, Lo0/O1$a;->b()I

    move-result v1

    invoke-interface {v0, v1}, Lo0/N1;->F(I)V

    iput-object v0, p0, Lq0/a;->F:Lo0/N1;

    :cond_0
    return-object v0
.end method

.method private final N(Lq0/h;)Lo0/N1;
    .locals 3

    .prologue
    sget-object v0, Lq0/l;->a:Lq0/l;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lq0/a;->K()Lo0/N1;

    move-result-object p1

    goto :goto_2

    :cond_0
    instance-of v0, p1, Lq0/m;

    if-eqz v0, :cond_6

    invoke-direct {p0}, Lq0/a;->M()Lo0/N1;

    move-result-object v0

    invoke-interface {v0}, Lo0/N1;->J()F

    move-result v1

    check-cast p1, Lq0/m;

    invoke-virtual {p1}, Lq0/m;->f()F

    move-result v2

    cmpg-float v1, v1, v2

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lq0/m;->f()F

    move-result v1

    invoke-interface {v0, v1}, Lo0/N1;->I(F)V

    :goto_0
    invoke-interface {v0}, Lo0/N1;->D()I

    move-result v1

    invoke-virtual {p1}, Lq0/m;->b()I

    move-result v2

    invoke-static {v1, v2}, Lo0/g2;->e(II)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p1}, Lq0/m;->b()I

    move-result v1

    invoke-interface {v0, v1}, Lo0/N1;->s(I)V

    :cond_2
    invoke-interface {v0}, Lo0/N1;->v()F

    move-result v1

    invoke-virtual {p1}, Lq0/m;->d()F

    move-result v2

    cmpg-float v1, v1, v2

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lq0/m;->d()F

    move-result v1

    invoke-interface {v0, v1}, Lo0/N1;->z(F)V

    :goto_1
    invoke-interface {v0}, Lo0/N1;->r()I

    move-result v1

    invoke-virtual {p1}, Lq0/m;->c()I

    move-result v2

    invoke-static {v1, v2}, Lo0/h2;->e(II)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p1}, Lq0/m;->c()I

    move-result v1

    invoke-interface {v0, v1}, Lo0/N1;->E(I)V

    :cond_4
    invoke-interface {v0}, Lo0/N1;->H()Lo0/R1;

    invoke-virtual {p1}, Lq0/m;->e()Lo0/R1;

    const/4 v1, 0x0

    invoke-static {v1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {p1}, Lq0/m;->e()Lo0/R1;

    invoke-interface {v0, v1}, Lo0/N1;->t(Lo0/R1;)V

    :cond_5
    move-object p1, v0

    :goto_2
    return-object p1

    :cond_6
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1
.end method

.method private final f(JLq0/h;FLo0/z0;II)Lo0/N1;
    .locals 2

    .prologue
    invoke-direct {p0, p3}, Lq0/a;->N(Lq0/h;)Lo0/N1;

    move-result-object p3

    invoke-direct {p0, p1, p2, p4}, Lq0/a;->J(JF)J

    move-result-wide p1

    invoke-interface {p3}, Lo0/N1;->c()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lo0/y0;->o(JJ)Z

    move-result p4

    if-nez p4, :cond_0

    invoke-interface {p3, p1, p2}, Lo0/N1;->G(J)V

    :cond_0
    invoke-interface {p3}, Lo0/N1;->y()Landroid/graphics/Shader;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-interface {p3, p1}, Lo0/N1;->x(Landroid/graphics/Shader;)V

    :cond_1
    invoke-interface {p3}, Lo0/N1;->f()Lo0/z0;

    move-result-object p1

    invoke-static {p1, p5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-interface {p3, p5}, Lo0/N1;->A(Lo0/z0;)V

    :cond_2
    invoke-interface {p3}, Lo0/N1;->q()I

    move-result p1

    invoke-static {p1, p6}, Lo0/f0;->E(II)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-interface {p3, p6}, Lo0/N1;->u(I)V

    :cond_3
    invoke-interface {p3}, Lo0/N1;->C()I

    move-result p1

    invoke-static {p1, p7}, Lo0/z1;->d(II)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-interface {p3, p7}, Lo0/N1;->B(I)V

    :cond_4
    return-object p3
.end method

.method static synthetic k(Lq0/a;JLq0/h;FLo0/z0;IIILjava/lang/Object;)Lo0/N1;
    .locals 9

    .prologue
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_0

    sget-object v0, Lq0/g;->B:Lq0/g$a;

    invoke-virtual {v0}, Lq0/g$a;->b()I

    move-result v0

    move v8, v0

    goto :goto_0

    :cond_0
    move/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v8}, Lq0/a;->f(JLq0/h;FLo0/z0;II)Lo0/N1;

    move-result-object v0

    return-object v0
.end method

.method private final s(Lo0/n0;Lq0/h;FLo0/z0;II)Lo0/N1;
    .locals 4

    .prologue
    invoke-direct {p0, p2}, Lq0/a;->N(Lq0/h;)Lo0/N1;

    move-result-object p2

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lq0/a;->i()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1, p2, p3}, Lo0/n0;->a(JLo0/N1;F)V

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lo0/N1;->y()Landroid/graphics/Shader;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lo0/N1;->x(Landroid/graphics/Shader;)V

    :cond_1
    invoke-interface {p2}, Lo0/N1;->c()J

    move-result-wide v0

    sget-object p1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {p1}, Lo0/y0$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lo0/y0$a;->a()J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Lo0/N1;->G(J)V

    :cond_2
    invoke-interface {p2}, Lo0/N1;->a()F

    move-result p1

    cmpg-float p1, p1, p3

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {p2, p3}, Lo0/N1;->b(F)V

    :goto_0
    invoke-interface {p2}, Lo0/N1;->f()Lo0/z0;

    move-result-object p1

    invoke-static {p1, p4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-interface {p2, p4}, Lo0/N1;->A(Lo0/z0;)V

    :cond_4
    invoke-interface {p2}, Lo0/N1;->q()I

    move-result p1

    invoke-static {p1, p5}, Lo0/f0;->E(II)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-interface {p2, p5}, Lo0/N1;->u(I)V

    :cond_5
    invoke-interface {p2}, Lo0/N1;->C()I

    move-result p1

    invoke-static {p1, p6}, Lo0/z1;->d(II)Z

    move-result p1

    if-nez p1, :cond_6

    invoke-interface {p2, p6}, Lo0/N1;->B(I)V

    :cond_6
    return-object p2
.end method

.method static synthetic t(Lq0/a;Lo0/n0;Lq0/h;FLo0/z0;IIILjava/lang/Object;)Lo0/N1;
    .locals 7

    .prologue
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    sget-object p6, Lq0/g;->B:Lq0/g$a;

    invoke-virtual {p6}, Lq0/g$a;->b()I

    move-result p6

    :cond_0
    move v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lq0/a;->s(Lo0/n0;Lq0/h;FLo0/z0;II)Lo0/N1;

    move-result-object p0

    return-object p0
.end method

.method private final y(JFFIILo0/R1;FLo0/z0;II)Lo0/N1;
    .locals 3

    .prologue
    invoke-direct {p0}, Lq0/a;->M()Lo0/N1;

    move-result-object v0

    invoke-direct {p0, p1, p2, p8}, Lq0/a;->J(JF)J

    move-result-wide p1

    invoke-interface {v0}, Lo0/N1;->c()J

    move-result-wide v1

    invoke-static {v1, v2, p1, p2}, Lo0/y0;->o(JJ)Z

    move-result p8

    if-nez p8, :cond_0

    invoke-interface {v0, p1, p2}, Lo0/N1;->G(J)V

    :cond_0
    invoke-interface {v0}, Lo0/N1;->y()Landroid/graphics/Shader;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    invoke-interface {v0, p2}, Lo0/N1;->x(Landroid/graphics/Shader;)V

    :cond_1
    invoke-interface {v0}, Lo0/N1;->f()Lo0/z0;

    move-result-object p1

    invoke-static {p1, p9}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-interface {v0, p9}, Lo0/N1;->A(Lo0/z0;)V

    :cond_2
    invoke-interface {v0}, Lo0/N1;->q()I

    move-result p1

    invoke-static {p1, p10}, Lo0/f0;->E(II)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-interface {v0, p10}, Lo0/N1;->u(I)V

    :cond_3
    invoke-interface {v0}, Lo0/N1;->J()F

    move-result p1

    cmpg-float p1, p1, p3

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    invoke-interface {v0, p3}, Lo0/N1;->I(F)V

    :goto_0
    invoke-interface {v0}, Lo0/N1;->v()F

    move-result p1

    cmpg-float p1, p1, p4

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    invoke-interface {v0, p4}, Lo0/N1;->z(F)V

    :goto_1
    invoke-interface {v0}, Lo0/N1;->D()I

    move-result p1

    invoke-static {p1, p5}, Lo0/g2;->e(II)Z

    move-result p1

    if-nez p1, :cond_6

    invoke-interface {v0, p5}, Lo0/N1;->s(I)V

    :cond_6
    invoke-interface {v0}, Lo0/N1;->r()I

    move-result p1

    invoke-static {p1, p6}, Lo0/h2;->e(II)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-interface {v0, p6}, Lo0/N1;->E(I)V

    :cond_7
    invoke-interface {v0}, Lo0/N1;->H()Lo0/R1;

    invoke-static {p2, p7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    invoke-interface {v0, p7}, Lo0/N1;->t(Lo0/R1;)V

    :cond_8
    invoke-interface {v0}, Lo0/N1;->C()I

    move-result p1

    invoke-static {p1, p11}, Lo0/z1;->d(II)Z

    move-result p1

    if-nez p1, :cond_9

    invoke-interface {v0, p11}, Lo0/N1;->B(I)V

    :cond_9
    return-object v0
.end method


# virtual methods
.method public synthetic B0(F)F
    .locals 0

    invoke-static {p0, p1}, LY0/d;->g(LY0/e;F)F

    move-result p1

    return p1
.end method

.method public C0(Lo0/n0;JJFLq0/h;Lo0/z0;I)V
    .locals 15

    move-object v9, p0

    iget-object v0, v9, Lq0/a;->C:Lq0/a$a;

    invoke-virtual {v0}, Lq0/a$a;->e()Lo0/q0;

    move-result-object v10

    invoke-static/range {p2 .. p3}, Ln0/g;->m(J)F

    move-result v11

    invoke-static/range {p2 .. p3}, Ln0/g;->n(J)F

    move-result v12

    invoke-static/range {p2 .. p3}, Ln0/g;->m(J)F

    move-result v0

    invoke-static/range {p4 .. p5}, Ln0/m;->i(J)F

    move-result v1

    add-float v13, v0, v1

    invoke-static/range {p2 .. p3}, Ln0/g;->n(J)F

    move-result v0

    invoke-static/range {p4 .. p5}, Ln0/m;->g(J)F

    move-result v1

    add-float v14, v0, v1

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p7

    move/from16 v3, p6

    move-object/from16 v4, p8

    move/from16 v5, p9

    invoke-static/range {v0 .. v8}, Lq0/a;->t(Lq0/a;Lo0/n0;Lq0/h;FLo0/z0;IIILjava/lang/Object;)Lo0/N1;

    move-result-object v0

    move-object/from16 p1, v10

    move/from16 p2, v11

    move/from16 p3, v12

    move/from16 p4, v13

    move/from16 p5, v14

    move-object/from16 p6, v0

    invoke-interface/range {p1 .. p6}, Lo0/q0;->l(FFFFLo0/N1;)V

    return-void
.end method

.method public F0()Lq0/d;
    .locals 1

    iget-object v0, p0, Lq0/a;->D:Lq0/d;

    return-object v0
.end method

.method public final H()Lq0/a$a;
    .locals 1

    iget-object v0, p0, Lq0/a;->C:Lq0/a$a;

    return-object v0
.end method

.method public I(JFFZJJFLq0/h;Lo0/z0;I)V
    .locals 16

    move-object/from16 v10, p0

    iget-object v0, v10, Lq0/a;->C:Lq0/a$a;

    invoke-virtual {v0}, Lq0/a$a;->e()Lo0/q0;

    move-result-object v11

    invoke-static/range {p6 .. p7}, Ln0/g;->m(J)F

    move-result v12

    invoke-static/range {p6 .. p7}, Ln0/g;->n(J)F

    move-result v13

    invoke-static/range {p6 .. p7}, Ln0/g;->m(J)F

    move-result v0

    invoke-static/range {p8 .. p9}, Ln0/m;->i(J)F

    move-result v1

    add-float v14, v0, v1

    invoke-static/range {p6 .. p7}, Ln0/g;->n(J)F

    move-result v0

    invoke-static/range {p8 .. p9}, Ln0/m;->g(J)F

    move-result v1

    add-float v15, v0, v1

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p11

    move/from16 v4, p10

    move-object/from16 v5, p12

    move/from16 v6, p13

    invoke-static/range {v0 .. v9}, Lq0/a;->k(Lq0/a;JLq0/h;FLo0/z0;IIILjava/lang/Object;)Lo0/N1;

    move-result-object v9

    move-object v1, v11

    move v2, v12

    move v3, v13

    move v4, v14

    move v5, v15

    move/from16 v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    invoke-interface/range {v1 .. v9}, Lo0/q0;->h(FFFFFFZLo0/N1;)V

    return-void
.end method

.method public J0(Lo0/E1;JJJJFLq0/h;Lo0/z0;II)V
    .locals 19

    move-object/from16 v7, p0

    iget-object v0, v7, Lq0/a;->C:Lq0/a$a;

    invoke-virtual {v0}, Lq0/a$a;->e()Lo0/q0;

    move-result-object v8

    const/4 v1, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, p11

    move/from16 v3, p10

    move-object/from16 v4, p12

    move/from16 v5, p13

    move/from16 v6, p14

    invoke-direct/range {v0 .. v6}, Lq0/a;->s(Lo0/n0;Lq0/h;FLo0/z0;II)Lo0/N1;

    move-result-object v18

    move-object/from16 v9, p1

    move-wide/from16 v10, p2

    move-wide/from16 v12, p4

    move-wide/from16 v14, p6

    move-wide/from16 v16, p8

    invoke-interface/range {v8 .. v18}, Lo0/q0;->j(Lo0/E1;JJJJLo0/N1;)V

    return-void
.end method

.method public synthetic K0(J)I
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->a(LY0/e;J)I

    move-result p1

    return p1
.end method

.method public synthetic O(F)J
    .locals 2

    invoke-static {p0, p1}, LY0/m;->b(LY0/n;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic P(J)J
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->e(LY0/e;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public Q0(Lo0/Q1;JFLq0/h;Lo0/z0;I)V
    .locals 12

    move-object v10, p0

    iget-object v0, v10, Lq0/a;->C:Lq0/a$a;

    invoke-virtual {v0}, Lq0/a$a;->e()Lo0/q0;

    move-result-object v11

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-wide v1, p2

    move-object/from16 v3, p5

    move/from16 v4, p4

    move-object/from16 v5, p6

    move/from16 v6, p7

    invoke-static/range {v0 .. v9}, Lq0/a;->k(Lq0/a;JLq0/h;FLo0/z0;IIILjava/lang/Object;)Lo0/N1;

    move-result-object v0

    move-object v1, p1

    invoke-interface {v11, p1, v0}, Lo0/q0;->t(Lo0/Q1;Lo0/N1;)V

    return-void
.end method

.method public synthetic S0(F)I
    .locals 0

    invoke-static {p0, p1}, LY0/d;->b(LY0/e;F)I

    move-result p1

    return p1
.end method

.method public U0(JJJFLq0/h;Lo0/z0;I)V
    .locals 16

    move-object/from16 v10, p0

    iget-object v0, v10, Lq0/a;->C:Lq0/a$a;

    invoke-virtual {v0}, Lq0/a$a;->e()Lo0/q0;

    move-result-object v11

    invoke-static/range {p3 .. p4}, Ln0/g;->m(J)F

    move-result v12

    invoke-static/range {p3 .. p4}, Ln0/g;->n(J)F

    move-result v13

    invoke-static/range {p3 .. p4}, Ln0/g;->m(J)F

    move-result v0

    invoke-static/range {p5 .. p6}, Ln0/m;->i(J)F

    move-result v1

    add-float v14, v0, v1

    invoke-static/range {p3 .. p4}, Ln0/g;->n(J)F

    move-result v0

    invoke-static/range {p5 .. p6}, Ln0/m;->g(J)F

    move-result v1

    add-float v15, v0, v1

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p8

    move/from16 v4, p7

    move-object/from16 v5, p9

    move/from16 v6, p10

    invoke-static/range {v0 .. v9}, Lq0/a;->k(Lq0/a;JLq0/h;FLo0/z0;IIILjava/lang/Object;)Lo0/N1;

    move-result-object v0

    move-object/from16 p1, v11

    move/from16 p2, v12

    move/from16 p3, v13

    move/from16 p4, v14

    move/from16 p5, v15

    move-object/from16 p6, v0

    invoke-interface/range {p1 .. p6}, Lo0/q0;->l(FFFFLo0/N1;)V

    return-void
.end method

.method public V0(Lo0/E1;JFLq0/h;Lo0/z0;I)V
    .locals 11

    move-object v9, p0

    iget-object v0, v9, Lq0/a;->C:Lq0/a$a;

    invoke-virtual {v0}, Lq0/a$a;->e()Lo0/q0;

    move-result-object v10

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object/from16 v2, p5

    move v3, p4

    move-object/from16 v4, p6

    move/from16 v5, p7

    invoke-static/range {v0 .. v8}, Lq0/a;->t(Lq0/a;Lo0/n0;Lq0/h;FLo0/z0;IIILjava/lang/Object;)Lo0/N1;

    move-result-object v0

    move-object v1, p1

    move-wide v2, p2

    invoke-interface {v10, p1, p2, p3, v0}, Lo0/q0;->q(Lo0/E1;JLo0/N1;)V

    return-void
.end method

.method public synthetic W0()J
    .locals 2

    invoke-static {p0}, Lq0/f;->a(Lq0/g;)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic X(J)F
    .locals 0

    invoke-static {p0, p1, p2}, LY0/m;->a(LY0/n;J)F

    move-result p1

    return p1
.end method

.method public Z0(JFJFLq0/h;Lo0/z0;I)V
    .locals 12

    move-object v10, p0

    iget-object v0, v10, Lq0/a;->C:Lq0/a$a;

    invoke-virtual {v0}, Lq0/a$a;->e()Lo0/q0;

    move-result-object v11

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object/from16 v3, p7

    move/from16 v4, p6

    move-object/from16 v5, p8

    move/from16 v6, p9

    invoke-static/range {v0 .. v9}, Lq0/a;->k(Lq0/a;JLq0/h;FLo0/z0;IIILjava/lang/Object;)Lo0/N1;

    move-result-object v0

    move v1, p3

    move-wide/from16 v2, p4

    invoke-interface {v11, v2, v3, p3, v0}, Lo0/q0;->f(JFLo0/N1;)V

    return-void
.end method

.method public a0(JJJJLq0/h;FLo0/z0;I)V
    .locals 18

    move-object/from16 v10, p0

    iget-object v0, v10, Lq0/a;->C:Lq0/a$a;

    invoke-virtual {v0}, Lq0/a$a;->e()Lo0/q0;

    move-result-object v11

    invoke-static/range {p3 .. p4}, Ln0/g;->m(J)F

    move-result v12

    invoke-static/range {p3 .. p4}, Ln0/g;->n(J)F

    move-result v13

    invoke-static/range {p3 .. p4}, Ln0/g;->m(J)F

    move-result v0

    invoke-static/range {p5 .. p6}, Ln0/m;->i(J)F

    move-result v1

    add-float v14, v0, v1

    invoke-static/range {p3 .. p4}, Ln0/g;->n(J)F

    move-result v0

    invoke-static/range {p5 .. p6}, Ln0/m;->g(J)F

    move-result v1

    add-float v15, v0, v1

    invoke-static/range {p7 .. p8}, Ln0/a;->d(J)F

    move-result v16

    invoke-static/range {p7 .. p8}, Ln0/a;->e(J)F

    move-result v17

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p9

    move/from16 v4, p10

    move-object/from16 v5, p11

    move/from16 v6, p12

    invoke-static/range {v0 .. v9}, Lq0/a;->k(Lq0/a;JLq0/h;FLo0/z0;IIILjava/lang/Object;)Lo0/N1;

    move-result-object v0

    move-object/from16 p1, v11

    move/from16 p2, v12

    move/from16 p3, v13

    move/from16 p4, v14

    move/from16 p5, v15

    move/from16 p6, v16

    move/from16 p7, v17

    move-object/from16 p8, v0

    invoke-interface/range {p1 .. p8}, Lo0/q0;->p(FFFFFFLo0/N1;)V

    return-void
.end method

.method public synthetic b1(J)J
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->h(LY0/e;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public d1(Lo0/n0;JJJFLq0/h;Lo0/z0;I)V
    .locals 17

    move-object/from16 v9, p0

    iget-object v0, v9, Lq0/a;->C:Lq0/a$a;

    invoke-virtual {v0}, Lq0/a$a;->e()Lo0/q0;

    move-result-object v10

    invoke-static/range {p2 .. p3}, Ln0/g;->m(J)F

    move-result v11

    invoke-static/range {p2 .. p3}, Ln0/g;->n(J)F

    move-result v12

    invoke-static/range {p2 .. p3}, Ln0/g;->m(J)F

    move-result v0

    invoke-static/range {p4 .. p5}, Ln0/m;->i(J)F

    move-result v1

    add-float v13, v0, v1

    invoke-static/range {p2 .. p3}, Ln0/g;->n(J)F

    move-result v0

    invoke-static/range {p4 .. p5}, Ln0/m;->g(J)F

    move-result v1

    add-float v14, v0, v1

    invoke-static/range {p6 .. p7}, Ln0/a;->d(J)F

    move-result v15

    invoke-static/range {p6 .. p7}, Ln0/a;->e(J)F

    move-result v16

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p9

    move/from16 v3, p8

    move-object/from16 v4, p10

    move/from16 v5, p11

    invoke-static/range {v0 .. v8}, Lq0/a;->t(Lq0/a;Lo0/n0;Lq0/h;FLo0/z0;IIILjava/lang/Object;)Lo0/N1;

    move-result-object v0

    move-object/from16 p1, v10

    move/from16 p2, v11

    move/from16 p3, v12

    move/from16 p4, v13

    move/from16 p5, v14

    move/from16 p6, v15

    move/from16 p7, v16

    move-object/from16 p8, v0

    invoke-interface/range {p1 .. p8}, Lo0/q0;->p(FFFFFFLo0/N1;)V

    return-void
.end method

.method public e0(Lo0/n0;JJFILo0/R1;FLo0/z0;I)V
    .locals 15

    move-object v13, p0

    iget-object v0, v13, Lq0/a;->C:Lq0/a$a;

    invoke-virtual {v0}, Lq0/a$a;->e()Lo0/q0;

    move-result-object v14

    sget-object v0, Lo0/h2;->a:Lo0/h2$a;

    invoke-virtual {v0}, Lo0/h2$a;->b()I

    move-result v5

    const/16 v11, 0x200

    const/4 v12, 0x0

    const/high16 v3, 0x40800000    # 4.0f

    const/4 v10, 0x0

    move-object v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p6

    move/from16 v4, p7

    move-object/from16 v6, p8

    move/from16 v7, p9

    move-object/from16 v8, p10

    move/from16 v9, p11

    invoke-static/range {v0 .. v12}, Lq0/a;->G(Lq0/a;Lo0/n0;FFIILo0/R1;FLo0/z0;IIILjava/lang/Object;)Lo0/N1;

    move-result-object v0

    move-object/from16 p6, v14

    move-wide/from16 p7, p2

    move-wide/from16 p9, p4

    move-object/from16 p11, v0

    invoke-interface/range {p6 .. p11}, Lo0/q0;->r(JJLo0/N1;)V

    return-void
.end method

.method public synthetic g1(J)F
    .locals 0

    invoke-static {p0, p1, p2}, LY0/d;->f(LY0/e;J)F

    move-result p1

    return p1
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, Lq0/a;->C:Lq0/a$a;

    invoke-virtual {v0}, Lq0/a$a;->f()LY0/e;

    move-result-object v0

    invoke-interface {v0}, LY0/e;->getDensity()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()LY0/v;
    .locals 1

    iget-object v0, p0, Lq0/a;->C:Lq0/a$a;

    invoke-virtual {v0}, Lq0/a$a;->g()LY0/v;

    move-result-object v0

    return-object v0
.end method

.method public synthetic i()J
    .locals 2

    invoke-static {p0}, Lq0/f;->b(Lq0/g;)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic k0(F)J
    .locals 2

    invoke-static {p0, p1}, LY0/d;->i(LY0/e;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic o0(I)F
    .locals 0

    invoke-static {p0, p1}, LY0/d;->d(LY0/e;I)F

    move-result p1

    return p1
.end method

.method public p1(Lo0/Q1;Lo0/n0;FLq0/h;Lo0/z0;I)V
    .locals 11

    move-object v9, p0

    iget-object v0, v9, Lq0/a;->C:Lq0/a$a;

    invoke-virtual {v0}, Lq0/a$a;->e()Lo0/q0;

    move-result-object v10

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p4

    move v3, p3

    move-object/from16 v4, p5

    move/from16 v5, p6

    invoke-static/range {v0 .. v8}, Lq0/a;->t(Lq0/a;Lo0/n0;Lq0/h;FLo0/z0;IIILjava/lang/Object;)Lo0/N1;

    move-result-object v0

    move-object v1, p1

    invoke-interface {v10, p1, v0}, Lo0/q0;->t(Lo0/Q1;Lo0/N1;)V

    return-void
.end method

.method public synthetic q0(F)F
    .locals 0

    invoke-static {p0, p1}, LY0/d;->c(LY0/e;F)F

    move-result p1

    return p1
.end method

.method public v0()F
    .locals 1

    iget-object v0, p0, Lq0/a;->C:Lq0/a$a;

    invoke-virtual {v0}, Lq0/a$a;->f()LY0/e;

    move-result-object v0

    invoke-interface {v0}, LY0/n;->v0()F

    move-result v0

    return v0
.end method

.method public y0(JJJFILo0/R1;FLo0/z0;I)V
    .locals 16

    move-object/from16 v14, p0

    iget-object v0, v14, Lq0/a;->C:Lq0/a$a;

    invoke-virtual {v0}, Lq0/a$a;->e()Lo0/q0;

    move-result-object v15

    sget-object v0, Lo0/h2;->a:Lo0/h2$a;

    invoke-virtual {v0}, Lo0/h2$a;->b()I

    move-result v6

    const/16 v12, 0x200

    const/4 v13, 0x0

    const/high16 v4, 0x40800000    # 4.0f

    const/4 v11, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move/from16 v3, p7

    move/from16 v5, p8

    move-object/from16 v7, p9

    move/from16 v8, p10

    move-object/from16 v9, p11

    move/from16 v10, p12

    invoke-static/range {v0 .. v13}, Lq0/a;->C(Lq0/a;JFFIILo0/R1;FLo0/z0;IIILjava/lang/Object;)Lo0/N1;

    move-result-object v0

    move-object/from16 p7, v15

    move-wide/from16 p8, p3

    move-wide/from16 p10, p5

    move-object/from16 p12, v0

    invoke-interface/range {p7 .. p12}, Lo0/q0;->r(JJLo0/N1;)V

    return-void
.end method
