.class public abstract LQ/x;
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
    sget-object v0, LQ/x;->a:Lu0/d;

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

    const-string v2, "Filled.KeyboardDoubleArrowDown"

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

    move-result-wide v2

    const/4 v4, 0x0

    invoke-direct {v0, v2, v3, v4}, Lo0/f2;-><init>(JLy7/k;)V

    sget-object v0, Lo0/g2;->a:Lo0/g2$a;

    invoke-virtual {v0}, Lo0/g2$a;->a()I

    move-result v22

    sget-object v2, Lo0/h2;->a:Lo0/h2$a;

    invoke-virtual {v2}, Lo0/h2$a;->a()I

    move-result v23

    new-instance v3, Lu0/f;

    invoke-direct {v3}, Lu0/f;-><init>()V

    const v5, 0x40cd1eb8    # 6.41f

    const/high16 v6, 0x41900000    # 18.0f

    invoke-virtual {v3, v6, v5}, Lu0/f;->j(FF)Lu0/f;

    const v5, -0x404b851f    # -1.41f

    invoke-virtual {v3, v5, v5}, Lu0/f;->i(FF)Lu0/f;

    const v7, -0x3f6d1eb8    # -4.59f

    const v8, 0x40928f5c    # 4.58f

    invoke-virtual {v3, v7, v8}, Lu0/f;->i(FF)Lu0/f;

    const v9, -0x3f6d70a4    # -4.58f

    invoke-virtual {v3, v7, v9}, Lu0/f;->i(FF)Lu0/f;

    const v10, 0x3fb47ae1    # 1.41f

    invoke-virtual {v3, v5, v10}, Lu0/f;->i(FF)Lu0/f;

    const/high16 v11, 0x40c00000    # 6.0f

    invoke-virtual {v3, v11, v11}, Lu0/f;->i(FF)Lu0/f;

    invoke-virtual {v3}, Lu0/f;->b()Lu0/f;

    invoke-virtual {v3}, Lu0/f;->e()Ljava/util/List;

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

    invoke-static {}, Lu0/o;->b()I

    move-result v32

    new-instance v3, Lo0/f2;

    move-object/from16 v34, v3

    invoke-virtual {v1}, Lo0/y0$a;->a()J

    move-result-wide v12

    invoke-direct {v3, v12, v13, v4}, Lo0/f2;-><init>(JLy7/k;)V

    invoke-virtual {v0}, Lo0/g2$a;->a()I

    move-result v39

    invoke-virtual {v2}, Lo0/h2$a;->a()I

    move-result v40

    new-instance v0, Lu0/f;

    invoke-direct {v0}, Lu0/f;-><init>()V

    const/high16 v1, 0x41500000    # 13.0f

    invoke-virtual {v0, v6, v1}, Lu0/f;->j(FF)Lu0/f;

    invoke-virtual {v0, v5, v5}, Lu0/f;->i(FF)Lu0/f;

    invoke-virtual {v0, v7, v8}, Lu0/f;->i(FF)Lu0/f;

    invoke-virtual {v0, v7, v9}, Lu0/f;->i(FF)Lu0/f;

    invoke-virtual {v0, v5, v10}, Lu0/f;->i(FF)Lu0/f;

    invoke-virtual {v0, v11, v11}, Lu0/f;->i(FF)Lu0/f;

    invoke-virtual {v0}, Lu0/f;->b()Lu0/f;

    invoke-virtual {v0}, Lu0/f;->e()Ljava/util/List;

    move-result-object v31

    const/16 v45, 0x3800

    const/16 v46, 0x0

    const-string v33, ""

    const/high16 v35, 0x3f800000    # 1.0f

    const/16 v36, 0x0

    const/high16 v37, 0x3f800000    # 1.0f

    const/high16 v38, 0x3f800000    # 1.0f

    const/high16 v41, 0x3f800000    # 1.0f

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    invoke-static/range {v30 .. v46}, Lu0/d$a;->d(Lu0/d$a;Ljava/util/List;ILjava/lang/String;Lo0/n0;FLo0/n0;FFIIFFFFILjava/lang/Object;)Lu0/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lu0/d$a;->f()Lu0/d;

    move-result-object v0

    sput-object v0, LQ/x;->a:Lu0/d;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method
