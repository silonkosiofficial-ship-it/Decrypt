.class public abstract Lo0/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo0/Y$a;
    }
.end annotation


# direct methods
.method public static final a()Lo0/Q1;
    .locals 3

    new-instance v0, Lo0/V;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lo0/V;-><init>(Landroid/graphics/Path;ILy7/k;)V

    return-object v0
.end method

.method public static final synthetic b(Lo0/Q1$b;)Landroid/graphics/Path$Direction;
    .locals 0

    invoke-static {p0}, Lo0/Y;->e(Lo0/Q1$b;)Landroid/graphics/Path$Direction;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroid/graphics/Path;)Lo0/Q1;
    .locals 1

    new-instance v0, Lo0/V;

    invoke-direct {v0, p0}, Lo0/V;-><init>(Landroid/graphics/Path;)V

    return-object v0
.end method

.method public static final d(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final e(Lo0/Q1$b;)Landroid/graphics/Path$Direction;
    .locals 1

    .prologue
    sget-object v0, Lo0/Y$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    goto :goto_0

    :cond_0
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    :goto_0
    return-object p0
.end method
