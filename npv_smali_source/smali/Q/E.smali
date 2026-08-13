.class public abstract LQ/E;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lu0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final a(LO/b$a;)Lu0/d;
    .locals 30

    .prologue
    sget-object v0, LQ/E;->a:Lu0/d;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance v1, Lu0/d$a;

    move-object v13, v1

    const/high16 v0, 0x41c00000    # 24.0f

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v3

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v4

    const/16 v11, 0x60

    const/4 v12, 0x0

    const-string v2, "Filled.Refresh"

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Lu0/d$a;-><init>(Ljava/lang/String;FFFFJIZILy7/k;)V

    invoke-static {}, Lu0/o;->b()I

    move-result v15

    new-instance v0, Lo0/f2;

    move-object/from16 v17, v0

    sget-object v1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v1}, Lo0/y0$a;->a()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo0/f2;-><init>(JLy7/k;)V

    sget-object v0, Lo0/g2;->a:Lo0/g2$a;

    invoke-virtual {v0}, Lo0/g2$a;->a()I

    move-result v22

    sget-object v0, Lo0/h2;->a:Lo0/h2$a;

    invoke-virtual {v0}, Lo0/h2$a;->a()I

    move-result v23

    new-instance v7, Lu0/f;

    invoke-direct {v7}, Lu0/f;-><init>()V

    const v0, 0x418d3333    # 17.65f

    const v1, 0x40cb3333    # 6.35f

    invoke-virtual {v7, v0, v1}, Lu0/f;->j(FF)Lu0/f;

    const/high16 v5, 0x41400000    # 12.0f

    const/high16 v6, 0x40800000    # 4.0f

    const v1, 0x4181999a    # 16.2f

    const v2, 0x409ccccd    # 4.9f

    const v3, 0x41635c29    # 14.21f

    const/high16 v4, 0x40800000    # 4.0f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, Lu0/f;->c(FFFFFF)Lu0/f;

    const v5, -0x3f0051ec    # -7.99f

    const/high16 v6, 0x41000000    # 8.0f

    const v1, -0x3f728f5c    # -4.42f

    const/4 v2, 0x0

    const v3, -0x3f0051ec    # -7.99f

    const v4, 0x40651eb8    # 3.58f

    invoke-virtual/range {v0 .. v6}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v0, 0x40647ae1    # 3.57f

    const v1, 0x40ffae14    # 7.99f

    const/high16 v2, 0x41000000    # 8.0f

    invoke-virtual {v7, v0, v2, v1, v2}, Lu0/f;->m(FFFF)Lu0/f;

    const v5, 0x40f75c29    # 7.73f

    const/high16 v6, -0x3f400000    # -6.0f

    const v1, 0x406eb852    # 3.73f

    const/4 v2, 0x0

    const v3, 0x40dae148    # 6.84f

    const v4, -0x3fdccccd    # -2.55f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v0, -0x3ffae148    # -2.08f

    invoke-virtual {v7, v0}, Lu0/f;->g(F)Lu0/f;

    const v5, -0x3f4b3333    # -5.65f

    const/high16 v6, 0x40800000    # 4.0f

    const v1, -0x40ae147b    # -0.82f

    const v2, 0x40151eb8    # 2.33f

    const v3, -0x3fbd70a4    # -3.04f

    const/high16 v4, 0x40800000    # 4.0f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, Lu0/f;->d(FFFFFF)Lu0/f;

    const/high16 v5, -0x3f400000    # -6.0f

    const/high16 v6, -0x3f400000    # -6.0f

    const v1, -0x3fac28f6    # -3.31f

    const/4 v2, 0x0

    const/high16 v3, -0x3f400000    # -6.0f

    const v4, -0x3fd3d70a    # -2.69f

    invoke-virtual/range {v0 .. v6}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v0, 0x402c28f6    # 2.69f

    const/high16 v1, 0x40c00000    # 6.0f

    const/high16 v2, -0x3f400000    # -6.0f

    invoke-virtual {v7, v0, v2, v1, v2}, Lu0/f;->m(FFFF)Lu0/f;

    const v5, 0x40870a3d    # 4.22f

    const v6, 0x3fe3d70a    # 1.78f

    const v1, 0x3fd47ae1    # 1.66f

    const/4 v2, 0x0

    const v3, 0x4048f5c3    # 3.14f

    const v4, 0x3f30a3d7    # 0.69f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, Lu0/f;->d(FFFFFF)Lu0/f;

    const/high16 v0, 0x41500000    # 13.0f

    const/high16 v1, 0x41300000    # 11.0f

    invoke-virtual {v7, v0, v1}, Lu0/f;->h(FF)Lu0/f;

    const/high16 v0, 0x40e00000    # 7.0f

    invoke-virtual {v7, v0}, Lu0/f;->g(F)Lu0/f;

    const/high16 v0, 0x40800000    # 4.0f

    invoke-virtual {v7, v0}, Lu0/f;->n(F)Lu0/f;

    const v0, -0x3fe9999a    # -2.35f

    const v1, 0x40166666    # 2.35f

    invoke-virtual {v7, v0, v1}, Lu0/f;->i(FF)Lu0/f;

    invoke-virtual {v7}, Lu0/f;->b()Lu0/f;

    invoke-virtual {v7}, Lu0/f;->e()Ljava/util/List;

    move-result-object v14

    const/16 v28, 0x3800

    const/16 v29, 0x0

    const-string v16, ""

    const/high16 v18, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    const/high16 v20, 0x3f800000    # 1.0f

    const/high16 v21, 0x3f800000    # 1.0f

    const/high16 v24, 0x3f800000    # 1.0f

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v13 .. v29}, Lu0/d$a;->d(Lu0/d$a;Ljava/util/List;ILjava/lang/String;Lo0/n0;FLo0/n0;FFIIFFFFILjava/lang/Object;)Lu0/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lu0/d$a;->f()Lu0/d;

    move-result-object v0

    sput-object v0, LQ/E;->a:Lu0/d;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method
