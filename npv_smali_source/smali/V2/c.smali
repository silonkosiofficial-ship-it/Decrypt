.class public abstract synthetic LV2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LV2/d;JZZLx7/l;ILjava/lang/Object;)V
    .locals 7

    .prologue
    if-nez p7, :cond_4

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x1

    if-eqz p7, :cond_1

    invoke-static {p1, p2}, Lo0/A0;->j(J)F

    move-result p3

    const/high16 p7, 0x3f000000    # 0.5f

    cmpl-float p3, p3, p7

    if-lez p3, :cond_0

    move p3, v0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :cond_1
    :goto_0
    move v4, p3

    and-int/lit8 p3, p6, 0x4

    if-eqz p3, :cond_2

    move v5, v0

    goto :goto_1

    :cond_2
    move v5, p4

    :goto_1
    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_3

    invoke-static {}, LV2/e;->b()Lx7/l;

    move-result-object p5

    :cond_3
    move-object v6, p5

    move-object v1, p0

    move-wide v2, p1

    invoke-interface/range {v1 .. v6}, LV2/d;->b(JZZLx7/l;)V

    return-void

    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: setNavigationBarColor-Iv8Zu3U"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic b(LV2/d;JZLx7/l;ILjava/lang/Object;)V
    .locals 0

    .prologue
    if-nez p6, :cond_3

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    invoke-static {p1, p2}, Lo0/A0;->j(J)F

    move-result p3

    const/high16 p6, 0x3f000000    # 0.5f

    cmpl-float p3, p3, p6

    if-lez p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :cond_1
    :goto_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    invoke-static {}, LV2/e;->b()Lx7/l;

    move-result-object p4

    :cond_2
    invoke-interface {p0, p1, p2, p3, p4}, LV2/d;->a(JZLx7/l;)V

    return-void

    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: setStatusBarColor-ek8zF_U"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
