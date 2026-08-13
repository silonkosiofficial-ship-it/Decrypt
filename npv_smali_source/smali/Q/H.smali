.class public abstract LQ/H;
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
    sget-object v0, LQ/H;->a:Lu0/d;

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

    const/4 v10, 0x0

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const-string v2, "Filled.Share"

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

    const/high16 v0, 0x41900000    # 18.0f

    const v1, 0x4180a3d7    # 16.08f

    invoke-virtual {v7, v0, v1}, Lu0/f;->j(FF)Lu0/f;

    const v5, -0x40051eb8    # -1.96f

    const v6, 0x3f451eb8    # 0.77f

    const v1, -0x40bd70a4    # -0.76f

    const/4 v2, 0x0

    const v3, -0x4047ae14    # -1.44f

    const v4, 0x3e99999a    # 0.3f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v0, 0x410e8f5c    # 8.91f

    const v1, 0x414b3333    # 12.7f

    invoke-virtual {v7, v0, v1}, Lu0/f;->h(FF)Lu0/f;

    const v5, 0x3db851ec    # 0.09f

    const v6, -0x40cccccd    # -0.7f

    const v1, 0x3d4ccccd    # 0.05f

    const v2, -0x41947ae1    # -0.23f

    const v3, 0x3db851ec    # 0.09f

    const v4, -0x41147ae1    # -0.46f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v0, -0x4247ae14    # -0.09f

    const v1, -0x40cccccd    # -0.7f

    const v2, -0x42dc28f6    # -0.04f

    const v3, -0x410f5c29    # -0.47f

    invoke-virtual {v7, v2, v3, v0, v1}, Lu0/f;->m(FFFF)Lu0/f;

    const v0, 0x40e1999a    # 7.05f

    const v1, -0x3f7c7ae1    # -4.11f

    invoke-virtual {v7, v0, v1}, Lu0/f;->i(FF)Lu0/f;

    const v5, 0x40028f5c    # 2.04f

    const v6, 0x3f4f5c29    # 0.81f

    const v1, 0x3f0a3d71    # 0.54f

    const/high16 v2, 0x3f000000    # 0.5f

    const/high16 v3, 0x3fa00000    # 1.25f

    const v4, 0x3f4f5c29    # 0.81f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, Lu0/f;->d(FFFFFF)Lu0/f;

    const/high16 v5, 0x40400000    # 3.0f

    const/high16 v6, -0x3fc00000    # -3.0f

    const v1, 0x3fd47ae1    # 1.66f

    const/4 v2, 0x0

    const/high16 v3, 0x40400000    # 3.0f

    const v4, -0x40547ae1    # -1.34f

    invoke-virtual/range {v0 .. v6}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v0, -0x40547ae1    # -1.34f

    const/high16 v1, -0x3fc00000    # -3.0f

    invoke-virtual {v7, v0, v1, v1, v1}, Lu0/f;->m(FFFF)Lu0/f;

    const v0, 0x3fab851f    # 1.34f

    const/high16 v1, 0x40400000    # 3.0f

    const/high16 v2, -0x3fc00000    # -3.0f

    invoke-virtual {v7, v2, v0, v2, v1}, Lu0/f;->m(FFFF)Lu0/f;

    const v5, 0x3db851ec    # 0.09f

    const v6, 0x3f333333    # 0.7f

    const/4 v1, 0x0

    const v2, 0x3e75c28f    # 0.24f

    const v3, 0x3d23d70a    # 0.04f

    const v4, 0x3ef0a3d7    # 0.47f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v0, 0x4100a3d7    # 8.04f

    const v1, 0x411cf5c3    # 9.81f

    invoke-virtual {v7, v0, v1}, Lu0/f;->h(FF)Lu0/f;

    const/high16 v5, 0x40c00000    # 6.0f

    const/high16 v6, 0x41100000    # 9.0f

    const/high16 v1, 0x40f00000    # 7.5f

    const v2, 0x4114f5c3    # 9.31f

    const v3, 0x40d947ae    # 6.79f

    const/high16 v4, 0x41100000    # 9.0f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, Lu0/f;->c(FFFFFF)Lu0/f;

    const/high16 v5, -0x3fc00000    # -3.0f

    const/high16 v6, 0x40400000    # 3.0f

    const v1, -0x402b851f    # -1.66f

    const/4 v2, 0x0

    const/high16 v3, -0x3fc00000    # -3.0f

    const v4, 0x3fab851f    # 1.34f

    invoke-virtual/range {v0 .. v6}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v0, 0x3fab851f    # 1.34f

    const/high16 v1, 0x40400000    # 3.0f

    invoke-virtual {v7, v0, v1, v1, v1}, Lu0/f;->m(FFFF)Lu0/f;

    const v5, 0x40028f5c    # 2.04f

    const v6, -0x40b0a3d7    # -0.81f

    const v1, 0x3f4a3d71    # 0.79f

    const/high16 v3, 0x3fc00000    # 1.5f

    const v4, -0x416147ae    # -0.31f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v0, 0x40e3d70a    # 7.12f

    const v1, 0x40851eb8    # 4.16f

    invoke-virtual {v7, v0, v1}, Lu0/f;->i(FF)Lu0/f;

    const v5, -0x425c28f6    # -0.08f

    const v6, 0x3f266666    # 0.65f

    const v1, -0x42b33333    # -0.05f

    const v2, 0x3e570a3d    # 0.21f

    const v3, -0x425c28f6    # -0.08f

    const v4, 0x3edc28f6    # 0.43f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v5, 0x403ae148    # 2.92f

    const v6, 0x403ae148    # 2.92f

    const/4 v1, 0x0

    const v2, 0x3fce147b    # 1.61f

    const v3, 0x3fa7ae14    # 1.31f

    const v4, 0x403ae148    # 2.92f

    invoke-virtual/range {v0 .. v6}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v6, -0x3fc51eb8    # -2.92f

    const v1, 0x3fce147b    # 1.61f

    const/4 v2, 0x0

    const v3, 0x403ae148    # 2.92f

    const v4, -0x405851ec    # -1.31f

    invoke-virtual/range {v0 .. v6}, Lu0/f;->d(FFFFFF)Lu0/f;

    const v0, -0x405851ec    # -1.31f

    const v1, -0x3fc51eb8    # -2.92f

    invoke-virtual {v7, v0, v1, v1, v1}, Lu0/f;->m(FFFF)Lu0/f;

    invoke-virtual {v7}, Lu0/f;->b()Lu0/f;

    invoke-virtual {v7}, Lu0/f;->e()Ljava/util/List;

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

    move-result-object v0

    invoke-virtual {v0}, Lu0/d$a;->f()Lu0/d;

    move-result-object v0

    sput-object v0, LQ/H;->a:Lu0/d;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method
