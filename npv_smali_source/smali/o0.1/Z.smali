.class public abstract Lo0/Z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;
    .locals 11

    move-object v0, p4

    invoke-static/range {p4 .. p5}, Lo0/Z;->g(Ljava/util/List;Ljava/util/List;)V

    invoke-static {p4}, Lo0/Z;->d(Ljava/util/List;)I

    move-result v1

    new-instance v10, Landroid/graphics/LinearGradient;

    invoke-static {p0, p1}, Ln0/g;->m(J)F

    move-result v3

    invoke-static {p0, p1}, Ln0/g;->n(J)F

    move-result v4

    invoke-static {p2, p3}, Ln0/g;->m(J)F

    move-result v5

    invoke-static {p2, p3}, Ln0/g;->n(J)F

    move-result v6

    invoke-static {p4, v1}, Lo0/Z;->e(Ljava/util/List;I)[I

    move-result-object v7

    move-object/from16 v2, p5

    invoke-static {v2, p4, v1}, Lo0/Z;->f(Ljava/util/List;Ljava/util/List;I)[F

    move-result-object v8

    invoke-static/range {p6 .. p6}, Lo0/a0;->a(I)Landroid/graphics/Shader$TileMode;

    move-result-object v9

    move-object v2, v10

    invoke-direct/range {v2 .. v9}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    return-object v10
.end method

.method public static final b(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;
    .locals 9

    invoke-static {p3, p4}, Lo0/Z;->g(Ljava/util/List;Ljava/util/List;)V

    invoke-static {p3}, Lo0/Z;->d(Ljava/util/List;)I

    move-result v0

    new-instance v8, Landroid/graphics/RadialGradient;

    invoke-static {p0, p1}, Ln0/g;->m(J)F

    move-result v2

    invoke-static {p0, p1}, Ln0/g;->n(J)F

    move-result v3

    invoke-static {p3, v0}, Lo0/Z;->e(Ljava/util/List;I)[I

    move-result-object v5

    invoke-static {p4, p3, v0}, Lo0/Z;->f(Ljava/util/List;Ljava/util/List;I)[F

    move-result-object v6

    invoke-static {p5}, Lo0/a0;->a(I)Landroid/graphics/Shader$TileMode;

    move-result-object v7

    move-object v1, v8

    move v4, p2

    invoke-direct/range {v1 .. v7}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    return-object v8
.end method

.method public static final c(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;
    .locals 3

    invoke-static {p2, p3}, Lo0/Z;->g(Ljava/util/List;Ljava/util/List;)V

    invoke-static {p2}, Lo0/Z;->d(Ljava/util/List;)I

    move-result v0

    new-instance v1, Landroid/graphics/SweepGradient;

    invoke-static {p0, p1}, Ln0/g;->m(J)F

    move-result v2

    invoke-static {p0, p1}, Ln0/g;->n(J)F

    move-result p0

    invoke-static {p2, v0}, Lo0/Z;->e(Ljava/util/List;I)[I

    move-result-object p1

    invoke-static {p3, p2, v0}, Lo0/Z;->f(Ljava/util/List;Ljava/util/List;I)[F

    move-result-object p2

    invoke-direct {v1, v2, p0, p1, p2}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    return-object v1
.end method

.method public static final d(Ljava/util/List;)I
    .locals 5

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    return v2

    :cond_0
    invoke-static {p0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v0

    const/4 v1, 0x1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo0/y0;

    invoke-virtual {v3}, Lo0/y0;->w()J

    move-result-wide v3

    invoke-static {v3, v4}, Lo0/y0;->p(J)F

    move-result v3

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    if-nez v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method public static final e(Ljava/util/List;I)[I
    .locals 14

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    new-array v0, p1, [I

    :goto_0
    if-ge v2, p1, :cond_0

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/y0;

    invoke-virtual {v1}, Lo0/y0;->w()J

    move-result-wide v3

    invoke-static {v3, v4}, Lo0/A0;->k(J)I

    move-result v1

    aput v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, p1

    new-array p1, v0, [I

    invoke-static {p0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    move v3, v2

    :goto_1
    if-ge v2, v1, :cond_5

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo0/y0;

    invoke-virtual {v4}, Lo0/y0;->w()J

    move-result-wide v4

    invoke-static {v4, v5}, Lo0/y0;->p(J)F

    move-result v6

    const/4 v7, 0x0

    cmpg-float v6, v6, v7

    if-nez v6, :cond_4

    if-nez v2, :cond_2

    add-int/lit8 v4, v3, 0x1

    const/4 v5, 0x1

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo0/y0;

    invoke-virtual {v5}, Lo0/y0;->w()J

    move-result-wide v6

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v13}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v5, v6}, Lo0/A0;->k(J)I

    move-result v5

    aput v5, p1, v3

    :goto_2
    move v3, v4

    goto :goto_3

    :cond_2
    if-ne v2, v0, :cond_3

    add-int/lit8 v4, v3, 0x1

    add-int/lit8 v5, v2, -0x1

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo0/y0;

    invoke-virtual {v5}, Lo0/y0;->w()J

    move-result-wide v6

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v13}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v5, v6}, Lo0/A0;->k(J)I

    move-result v5

    aput v5, p1, v3

    goto :goto_2

    :cond_3
    add-int/lit8 v4, v2, -0x1

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo0/y0;

    invoke-virtual {v4}, Lo0/y0;->w()J

    move-result-wide v5

    add-int/lit8 v4, v3, 0x1

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v5, v6}, Lo0/A0;->k(J)I

    move-result v5

    aput v5, p1, v3

    add-int/lit8 v5, v2, 0x1

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo0/y0;

    invoke-virtual {v5}, Lo0/y0;->w()J

    move-result-wide v6

    add-int/lit8 v3, v3, 0x2

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v13}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v5, v6}, Lo0/A0;->k(J)I

    move-result v5

    aput v5, p1, v4

    goto :goto_3

    :cond_4
    add-int/lit8 v6, v3, 0x1

    invoke-static {v4, v5}, Lo0/A0;->k(J)I

    move-result v4

    aput v4, p1, v3

    move v3, v6

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    :cond_5
    return-object p1
.end method

.method public static final f(Ljava/util/List;Ljava/util/List;I)[F
    .locals 8

    .prologue
    if-nez p2, :cond_1

    if-eqz p0, :cond_0

    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Lj7/v;->Q0(Ljava/util/Collection;)[F

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, p2

    new-array p2, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p0, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    goto :goto_1

    :cond_2
    move v2, v0

    :goto_1
    aput v2, p2, v1

    invoke-static {p1}, Lj7/v;->o(Ljava/util/List;)I

    move-result v1

    const/4 v2, 0x1

    move v3, v2

    :goto_2
    if-ge v2, v1, :cond_5

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo0/y0;

    invoke-virtual {v4}, Lo0/y0;->w()J

    move-result-wide v4

    if-eqz p0, :cond_3

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    goto :goto_3

    :cond_3
    int-to-float v6, v2

    invoke-static {p1}, Lj7/v;->o(Ljava/util/List;)I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v6, v7

    :goto_3
    add-int/lit8 v7, v3, 0x1

    aput v6, p2, v3

    invoke-static {v4, v5}, Lo0/y0;->p(J)F

    move-result v4

    cmpg-float v4, v4, v0

    if-nez v4, :cond_4

    add-int/lit8 v3, v3, 0x2

    aput v6, p2, v7

    goto :goto_4

    :cond_4
    move v3, v7

    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    if-eqz p0, :cond_6

    invoke-static {p1}, Lj7/v;->o(Ljava/util/List;)I

    move-result p1

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    goto :goto_5

    :cond_6
    const/high16 p0, 0x3f800000    # 1.0f

    :goto_5
    aput p0, p2, v3

    return-object p2
.end method

.method private static final g(Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .prologue
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-nez p1, :cond_1

    const/4 p1, 0x2

    if-lt p0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "colors must have length of at least 2 if colorStops is omitted."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ne p0, p1, :cond_2

    :goto_0
    return-void

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "colors and colorStops arguments must have equal length."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
