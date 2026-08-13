.class public abstract LQ/w;
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
    sget-object v0, LQ/w;->a:Lu0/d;

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

    const-string v2, "Filled.KeyboardArrowDown"

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

    new-instance v0, Lu0/f;

    invoke-direct {v0}, Lu0/f;-><init>()V

    const v1, 0x40ed1eb8    # 7.41f

    const v2, 0x410970a4    # 8.59f

    invoke-virtual {v0, v1, v2}, Lu0/f;->j(FF)Lu0/f;

    const/high16 v1, 0x41400000    # 12.0f

    const v2, 0x4152b852    # 13.17f

    invoke-virtual {v0, v1, v2}, Lu0/f;->h(FF)Lu0/f;

    const v1, 0x4092e148    # 4.59f

    const v2, -0x3f6d70a4    # -4.58f

    invoke-virtual {v0, v1, v2}, Lu0/f;->i(FF)Lu0/f;

    const/high16 v1, 0x41900000    # 18.0f

    const/high16 v2, 0x41200000    # 10.0f

    invoke-virtual {v0, v1, v2}, Lu0/f;->h(FF)Lu0/f;

    const/high16 v1, 0x40c00000    # 6.0f

    const/high16 v2, -0x3f400000    # -6.0f

    invoke-virtual {v0, v2, v1}, Lu0/f;->i(FF)Lu0/f;

    invoke-virtual {v0, v2, v2}, Lu0/f;->i(FF)Lu0/f;

    const v1, 0x3fb47ae1    # 1.41f

    const v2, -0x404b851f    # -1.41f

    invoke-virtual {v0, v1, v2}, Lu0/f;->i(FF)Lu0/f;

    invoke-virtual {v0}, Lu0/f;->b()Lu0/f;

    invoke-virtual {v0}, Lu0/f;->e()Ljava/util/List;

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

    sput-object v0, LQ/w;->a:Lu0/d;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method
