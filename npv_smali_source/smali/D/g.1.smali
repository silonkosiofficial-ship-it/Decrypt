.class public abstract LD/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9c4

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LD/g;->a:F

    const/16 v0, 0x5dc

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LD/g;->b:F

    const/16 v0, 0x32

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LD/g;->c:F

    return-void
.end method

.method public static final synthetic a()F
    .locals 1

    sget v0, LD/g;->b:F

    return v0
.end method

.method public static final synthetic b()F
    .locals 1

    sget v0, LD/g;->c:F

    return v0
.end method

.method public static final synthetic c()F
    .locals 1

    sget v0, LD/g;->a:F

    return v0
.end method

.method public static final d(LD/h;IIILY0/e;Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    new-instance v7, LD/g$a;

    const/4 v6, 0x0

    move-object v0, v7

    move v1, p1

    move-object v2, p4

    move-object v3, p0

    move v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v6}, LD/g$a;-><init>(ILY0/e;LD/h;IILm7/e;)V

    invoke-interface {p0, v7, p5}, LD/h;->e(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final e(LD/h;I)Z
    .locals 2

    .prologue
    invoke-interface {p0}, LD/h;->g()I

    move-result v0

    invoke-interface {p0}, LD/h;->b()I

    move-result p0

    const/4 v1, 0x0

    if-gt p1, p0, :cond_0

    if-gt v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method
