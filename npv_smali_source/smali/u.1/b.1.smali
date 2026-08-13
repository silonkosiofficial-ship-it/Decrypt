.class public abstract Lu/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lu/n;

.field private static final b:Lu/o;

.field private static final c:Lu/p;

.field private static final d:Lu/q;

.field private static final e:Lu/n;

.field private static final f:Lu/o;

.field private static final g:Lu/p;

.field private static final h:Lu/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v0}, Lu/s;->a(F)Lu/n;

    move-result-object v1

    sput-object v1, Lu/b;->a:Lu/n;

    invoke-static {v0, v0}, Lu/s;->b(FF)Lu/o;

    move-result-object v1

    sput-object v1, Lu/b;->b:Lu/o;

    invoke-static {v0, v0, v0}, Lu/s;->c(FFF)Lu/p;

    move-result-object v1

    sput-object v1, Lu/b;->c:Lu/p;

    invoke-static {v0, v0, v0, v0}, Lu/s;->d(FFFF)Lu/q;

    move-result-object v0

    sput-object v0, Lu/b;->d:Lu/q;

    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    invoke-static {v0}, Lu/s;->a(F)Lu/n;

    move-result-object v1

    sput-object v1, Lu/b;->e:Lu/n;

    invoke-static {v0, v0}, Lu/s;->b(FF)Lu/o;

    move-result-object v1

    sput-object v1, Lu/b;->f:Lu/o;

    invoke-static {v0, v0, v0}, Lu/s;->c(FFF)Lu/p;

    move-result-object v1

    sput-object v1, Lu/b;->g:Lu/p;

    invoke-static {v0, v0, v0, v0}, Lu/s;->d(FFFF)Lu/q;

    move-result-object v0

    sput-object v0, Lu/b;->h:Lu/q;

    return-void
.end method

.method public static final a(FF)Lu/a;
    .locals 8

    new-instance v7, Lu/a;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    sget-object p0, Ly7/m;->a:Ly7/m;

    invoke-static {p0}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lu/a;-><init>(Ljava/lang/Object;Lu/x0;Ljava/lang/Object;Ljava/lang/String;ILy7/k;)V

    return-object v7
.end method

.method public static synthetic b(FFILjava/lang/Object;)Lu/a;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const p1, 0x3c23d70a    # 0.01f

    :cond_0
    invoke-static {p0, p1}, Lu/b;->a(FF)Lu/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()Lu/n;
    .locals 1

    sget-object v0, Lu/b;->e:Lu/n;

    return-object v0
.end method

.method public static final synthetic d()Lu/o;
    .locals 1

    sget-object v0, Lu/b;->f:Lu/o;

    return-object v0
.end method

.method public static final synthetic e()Lu/p;
    .locals 1

    sget-object v0, Lu/b;->g:Lu/p;

    return-object v0
.end method

.method public static final synthetic f()Lu/q;
    .locals 1

    sget-object v0, Lu/b;->h:Lu/q;

    return-object v0
.end method

.method public static final synthetic g()Lu/n;
    .locals 1

    sget-object v0, Lu/b;->a:Lu/n;

    return-object v0
.end method

.method public static final synthetic h()Lu/o;
    .locals 1

    sget-object v0, Lu/b;->b:Lu/o;

    return-object v0
.end method

.method public static final synthetic i()Lu/p;
    .locals 1

    sget-object v0, Lu/b;->c:Lu/p;

    return-object v0
.end method

.method public static final synthetic j()Lu/q;
    .locals 1

    sget-object v0, Lu/b;->d:Lu/q;

    return-object v0
.end method
