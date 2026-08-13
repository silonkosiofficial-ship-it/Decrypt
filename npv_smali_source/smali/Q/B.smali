.class public abstract LQ/B;
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
    .locals 47

    .prologue
    sget-object v0, LQ/B;->a:Lu0/d;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance v1, Lu0/d$a;

    move-object/from16 v30, v1

    move-object v13, v1

    const/high16 v0, 0x41c00000    # 24.0f

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v3

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v4

    const/16 v11, 0x60

    const/4 v12, 0x0

    const/4 v10, 0x0

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const-string v2, "Filled.Policy"

    invoke-direct/range {v1 .. v12}, Lu0/d$a;-><init>(Ljava/lang/String;FFFFJIZILy7/k;)V

    invoke-static {}, Lu0/o;->b()I

    move-result v15

    new-instance v0, Lo0/f2;

    move-object/from16 v17, v0

    sget-object v1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v1}, Lo0/y0$a;->a()J

    move-result-wide v2

    const/4 v4, 0x0

    invoke-direct {v0, v2, v3, v4}, Lo0/f2;-><init>(JLy7/k;)V

    sget-object v0, Lo0/g2;->a:Lo0/g2$a;

    invoke-virtual {v0}, Lo0/g2$a;->a()I

    move-result v22

    sget-object v2, Lo0/h2;->a:Lo0/h2$a;

    invoke-virtual {v2}, Lo0/h2$a;->a()I

    move-result v23

    new-instance v10, Lu0/f;

    invoke-direct {v10}, Lu0/f;-><init>()V

    const/high16 v3, 0x41a80000    # 21.0f

    const/high16 v4, 0x40a00000    # 5.0f

    invoke-virtual {v10, v3, v4}, Lu0/f;->j(FF)Lu0/f;

    const/high16 v3, -0x3ef00000    # -9.0f

    const/high16 v4, -0x3f800000    # -4.0f

    invoke-virtual {v10, v3, v4}, Lu0/f;->i(FF)Lu0/f;

    const/high16 v3, 0x40400000    # 3.0f

    const/high16 v4, 0x40a00000    # 5.0f

    invoke-virtual {v10, v3, v4}, Lu0/f;->h(FF)Lu0/f;

    const/high16 v3, 0x40c00000    # 6.0f

    invoke-virtual {v10, v3}, Lu0/f;->o(F)Lu0/f;

    const/high16 v8, 0x41100000    # 9.0f

    const/high16 v9, 0x41400000    # 12.0f

    const/4 v4, 0x0

    const v5, 0x40b1999a    # 5.55f

    const v6, 0x4075c28f    # 3.84f

    const v7, 0x412bd70a    # 10.74f

    move-object v3, v10

    invoke-virtual/range {v3 .. v9}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v8, 0x40bc28f6    # 5.88f

    const v9, -0x3f928f5c    # -3.71f

    const v4, 0x40133333    # 2.3f

    const v5, -0x40f0a3d7    # -0.56f

    const v6, 0x408a8f5c    # 4.33f

    const v7, -0x400ccccd    # -1.9f

    invoke-virtual/range {v3 .. v9}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v3, -0x3fb851ec    # -3.12f

    invoke-virtual {v10, v3, v3}, Lu0/f;->i(FF)Lu0/f;

    const v8, -0x3f36b852    # -6.29f

    const v9, -0x40dc28f6    # -0.64f

    const v4, -0x4007ae14    # -1.94f

    const v5, 0x3fa51eb8    # 1.29f

    const v6, -0x3f6d70a4    # -4.58f

    const v7, 0x3f88f5c3    # 1.07f

    move-object v3, v10

    invoke-virtual/range {v3 .. v9}, Lu0/f;->d(FFFFFF)Lu0/f;

    const/4 v8, 0x0

    const v9, -0x3f1dc28f    # -7.07f

    const v4, -0x40066666    # -1.95f

    const v5, -0x40066666    # -1.95f

    const v6, -0x40066666    # -1.95f

    const v7, -0x3f5c28f6    # -5.12f

    invoke-virtual/range {v3 .. v9}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v8, 0x40e23d71    # 7.07f

    const/4 v9, 0x0

    const v4, 0x3ff9999a    # 1.95f

    const v6, 0x40a3d70a    # 5.12f

    const v7, -0x40066666    # -1.95f

    invoke-virtual/range {v3 .. v9}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v8, 0x3f23d70a    # 0.64f

    const v9, 0x40c947ae    # 6.29f

    const v4, 0x3fdae148    # 1.71f

    const v5, 0x3fdae148    # 1.71f

    const v6, 0x3ff5c28f    # 1.92f

    const v7, 0x408b3333    # 4.35f

    invoke-virtual/range {v3 .. v9}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v3, 0x4039999a    # 2.9f

    invoke-virtual {v10, v3, v3}, Lu0/f;->i(FF)Lu0/f;

    const/high16 v8, 0x41a80000    # 21.0f

    const/high16 v9, 0x41300000    # 11.0f

    const v4, 0x41a251ec    # 20.29f

    const v5, 0x417b0a3d    # 15.69f

    const/high16 v6, 0x41a80000    # 21.0f

    const v7, 0x4156147b    # 13.38f

    move-object v3, v10

    invoke-virtual/range {v3 .. v9}, Lu0/f;->c(FFFFFF)Lu0/f;

    const/high16 v3, 0x40a00000    # 5.0f

    invoke-virtual {v10, v3}, Lu0/f;->n(F)Lu0/f;

    invoke-virtual {v10}, Lu0/f;->b()Lu0/f;

    invoke-virtual {v10}, Lu0/f;->e()Ljava/util/List;

    move-result-object v14

    const/16 v28, 0x3800

    const/16 v29, 0x0

    const/high16 v18, 0x3f800000    # 1.0f

    const/high16 v20, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    const/high16 v21, 0x3f800000    # 1.0f

    const/high16 v24, 0x3f800000    # 1.0f

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-string v16, ""

    invoke-static/range {v13 .. v29}, Lu0/d$a;->d(Lu0/d$a;Ljava/util/List;ILjava/lang/String;Lo0/n0;FLo0/n0;FFIIFFFFILjava/lang/Object;)Lu0/d$a;

    invoke-static {}, Lu0/o;->b()I

    move-result v32

    new-instance v3, Lo0/f2;

    move-object/from16 v34, v3

    invoke-virtual {v1}, Lo0/y0$a;->a()J

    move-result-wide v4

    const/4 v1, 0x0

    invoke-direct {v3, v4, v5, v1}, Lo0/f2;-><init>(JLy7/k;)V

    invoke-virtual {v0}, Lo0/g2$a;->a()I

    move-result v39

    invoke-virtual {v2}, Lo0/h2$a;->a()I

    move-result v40

    new-instance v8, Lu0/f;

    invoke-direct {v8}, Lu0/f;-><init>()V

    const/high16 v0, 0x41400000    # 12.0f

    invoke-virtual {v8, v0, v0}, Lu0/f;->j(FF)Lu0/f;

    const/high16 v0, -0x3fc00000    # -3.0f

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Lu0/f;->k(FF)Lu0/f;

    const/high16 v6, 0x40c00000    # 6.0f

    const/4 v7, 0x0

    const/high16 v1, 0x40400000    # 3.0f

    const/high16 v2, 0x40400000    # 3.0f

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lu0/f;->a(FFFZZFF)Lu0/f;

    const/high16 v6, -0x3f400000    # -6.0f

    invoke-virtual/range {v0 .. v7}, Lu0/f;->a(FFFZZFF)Lu0/f;

    invoke-virtual {v8}, Lu0/f;->e()Ljava/util/List;

    move-result-object v31

    const/16 v45, 0x3800

    const/16 v46, 0x0

    const/high16 v35, 0x3f800000    # 1.0f

    const/high16 v37, 0x3f800000    # 1.0f

    const/16 v36, 0x0

    const/high16 v38, 0x3f800000    # 1.0f

    const/high16 v41, 0x3f800000    # 1.0f

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-string v33, ""

    invoke-static/range {v30 .. v46}, Lu0/d$a;->d(Lu0/d$a;Ljava/util/List;ILjava/lang/String;Lo0/n0;FLo0/n0;FFIIFFFFILjava/lang/Object;)Lu0/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lu0/d$a;->f()Lu0/d;

    move-result-object v0

    sput-object v0, LQ/B;->a:Lu0/d;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method
