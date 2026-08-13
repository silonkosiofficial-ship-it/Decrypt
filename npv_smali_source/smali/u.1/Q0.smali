.class public abstract Lu/Q0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ln0/i;

.field private static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Ln0/i;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-direct {v0, v1, v1, v1, v1}, Ln0/i;-><init>(FFFF)V

    sput-object v0, Lu/Q0;->a:Ln0/i;

    sget-object v0, Ly7/s;->a:Ly7/s;

    invoke-static {v0}, Lu/z0;->j(Ly7/s;)Lu/x0;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v0, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    sget-object v3, LY0/t;->b:LY0/t$a;

    invoke-static {v3}, Lu/z0;->e(LY0/t$a;)Lu/x0;

    move-result-object v3

    invoke-static {v3, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    sget-object v4, LY0/p;->b:LY0/p$a;

    invoke-static {v4}, Lu/z0;->d(LY0/p$a;)Lu/x0;

    move-result-object v4

    invoke-static {v4, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    sget-object v4, Ly7/m;->a:Ly7/m;

    invoke-static {v4}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v4

    const v5, 0x3c23d70a    # 0.01f

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-static {v4, v5}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v4

    sget-object v5, Ln0/i;->e:Ln0/i$a;

    invoke-static {v5}, Lu/z0;->g(Ln0/i$a;)Lu/x0;

    move-result-object v5

    invoke-static {v5, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    sget-object v6, Ln0/m;->b:Ln0/m$a;

    invoke-static {v6}, Lu/z0;->h(Ln0/m$a;)Lu/x0;

    move-result-object v6

    invoke-static {v6, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v6

    sget-object v7, Ln0/g;->b:Ln0/g$a;

    invoke-static {v7}, Lu/z0;->f(Ln0/g$a;)Lu/x0;

    move-result-object v7

    invoke-static {v7, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    sget-object v7, LY0/i;->D:LY0/i$a;

    invoke-static {v7}, Lu/z0;->b(LY0/i$a;)Lu/x0;

    move-result-object v7

    const v8, 0x3dcccccd    # 0.1f

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-static {v7, v8}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v7

    sget-object v9, LY0/k;->b:LY0/k$a;

    invoke-static {v9}, Lu/z0;->c(LY0/k$a;)Lu/x0;

    move-result-object v9

    invoke-static {v9, v8}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v8

    const/16 v9, 0x9

    new-array v9, v9, [Li7/u;

    const/4 v10, 0x0

    aput-object v0, v9, v10

    const/4 v0, 0x1

    aput-object v3, v9, v0

    const/4 v0, 0x2

    aput-object v1, v9, v0

    const/4 v0, 0x3

    aput-object v4, v9, v0

    const/4 v0, 0x4

    aput-object v5, v9, v0

    const/4 v0, 0x5

    aput-object v6, v9, v0

    const/4 v0, 0x6

    aput-object v2, v9, v0

    const/4 v0, 0x7

    aput-object v7, v9, v0

    const/16 v0, 0x8

    aput-object v8, v9, v0

    invoke-static {v9}, Lj7/S;->k([Li7/u;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lu/Q0;->b:Ljava/util/Map;

    return-void
.end method

.method public static final a(LY0/i$a;)F
    .locals 0

    const p0, 0x3dcccccd    # 0.1f

    invoke-static {p0}, LY0/i;->q(F)F

    move-result p0

    return p0
.end method

.method public static final b(Ly7/s;)I
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public static final c(LY0/p$a;)J
    .locals 2

    const/4 p0, 0x1

    invoke-static {p0, p0}, LY0/q;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final d(LY0/t$a;)J
    .locals 2

    const/4 p0, 0x1

    invoke-static {p0, p0}, LY0/u;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final e(Ln0/g$a;)J
    .locals 2

    const/high16 p0, 0x3f000000    # 0.5f

    invoke-static {p0, p0}, Ln0/h;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final f(Ln0/m$a;)J
    .locals 2

    const/high16 p0, 0x3f000000    # 0.5f

    invoke-static {p0, p0}, Ln0/n;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final g(Ln0/i$a;)Ln0/i;
    .locals 0

    sget-object p0, Lu/Q0;->a:Ln0/i;

    return-object p0
.end method

.method public static final h()Ljava/util/Map;
    .locals 1

    sget-object v0, Lu/Q0;->b:Ljava/util/Map;

    return-object v0
.end method
