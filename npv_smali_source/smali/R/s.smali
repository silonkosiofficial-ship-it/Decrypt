.class public abstract LR/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LV/O0;

.field private static final b:LR/g;

.field private static final c:LR/g;

.field private static final d:LR/g;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    sget-object v0, LR/s$a;->D:LR/s$a;

    invoke-static {v0}, LV/y;->f(Lx7/a;)LV/O0;

    move-result-object v0

    sput-object v0, LR/s;->a:LV/O0;

    new-instance v0, LR/g;

    const v1, 0x3e23d70a    # 0.16f

    const v2, 0x3e75c28f    # 0.24f

    const v3, 0x3da3d70a    # 0.08f

    invoke-direct {v0, v1, v2, v3, v2}, LR/g;-><init>(FFFF)V

    sput-object v0, LR/s;->b:LR/g;

    new-instance v0, LR/g;

    const v1, 0x3df5c28f    # 0.12f

    const v2, 0x3d23d70a    # 0.04f

    invoke-direct {v0, v3, v1, v2, v1}, LR/g;-><init>(FFFF)V

    sput-object v0, LR/s;->c:LR/g;

    new-instance v0, LR/g;

    const v4, 0x3dcccccd    # 0.1f

    invoke-direct {v0, v3, v1, v2, v4}, LR/g;-><init>(FFFF)V

    sput-object v0, LR/s;->d:LR/g;

    return-void
.end method

.method public static final synthetic a()LR/g;
    .locals 1

    sget-object v0, LR/s;->d:LR/g;

    return-object v0
.end method

.method public static final synthetic b()LR/g;
    .locals 1

    sget-object v0, LR/s;->b:LR/g;

    return-object v0
.end method

.method public static final synthetic c()LR/g;
    .locals 1

    sget-object v0, LR/s;->c:LR/g;

    return-object v0
.end method

.method public static final d()LV/O0;
    .locals 1

    sget-object v0, LR/s;->a:LV/O0;

    return-object v0
.end method
