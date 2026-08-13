.class public abstract LT/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lu/F;

.field private static final b:Lu/w0;

.field private static final c:Lu/w0;

.field private static final d:Lu/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v6, Lu/z;

    const v0, 0x3f19999a    # 0.6f

    const/high16 v1, 0x3f800000    # 1.0f

    const v2, 0x3ecccccd    # 0.4f

    const/4 v3, 0x0

    invoke-direct {v6, v2, v3, v0, v1}, Lu/z;-><init>(FFFF)V

    sput-object v6, LT/o;->a:Lu/F;

    new-instance v0, Lu/w0;

    invoke-static {}, Lu/H;->d()Lu/F;

    move-result-object v10

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/16 v8, 0x78

    const/4 v9, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lu/w0;-><init>(IILu/F;ILy7/k;)V

    sput-object v0, LT/o;->b:Lu/w0;

    new-instance v7, Lu/w0;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/16 v1, 0x96

    const/4 v2, 0x0

    move-object v0, v7

    move-object v3, v6

    invoke-direct/range {v0 .. v5}, Lu/w0;-><init>(IILu/F;ILy7/k;)V

    sput-object v7, LT/o;->c:Lu/w0;

    new-instance v7, Lu/w0;

    const/16 v1, 0x78

    move-object v0, v7

    invoke-direct/range {v0 .. v5}, Lu/w0;-><init>(IILu/F;ILy7/k;)V

    sput-object v7, LT/o;->d:Lu/w0;

    return-void
.end method

.method public static final synthetic a()Lu/w0;
    .locals 1

    sget-object v0, LT/o;->b:Lu/w0;

    return-object v0
.end method

.method public static final synthetic b()Lu/w0;
    .locals 1

    sget-object v0, LT/o;->c:Lu/w0;

    return-object v0
.end method

.method public static final synthetic c()Lu/w0;
    .locals 1

    sget-object v0, LT/o;->d:Lu/w0;

    return-object v0
.end method

.method public static final d(Lu/a;FLz/i;Lz/i;Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    if-eqz p3, :cond_0

    sget-object p2, LT/n;->a:LT/n;

    invoke-virtual {p2, p3}, LT/n;->a(Lz/i;)Lu/j;

    move-result-object p2

    :goto_0
    move-object v2, p2

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    sget-object p3, LT/n;->a:LT/n;

    invoke-virtual {p3, p2}, LT/n;->b(Lz/i;)Lu/j;

    move-result-object p2

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    if-eqz v2, :cond_3

    invoke-static {p1}, LY0/i;->m(F)LY0/i;

    move-result-object v1

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v5, p4

    invoke-static/range {v0 .. v7}, Lu/a;->f(Lu/a;Ljava/lang/Object;Lu/j;Ljava/lang/Object;Lx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    return-object p0

    :cond_2
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :cond_3
    invoke-static {p1}, LY0/i;->m(F)LY0/i;

    move-result-object p1

    invoke-virtual {p0, p1, p4}, Lu/a;->s(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4

    return-object p0

    :cond_4
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method
