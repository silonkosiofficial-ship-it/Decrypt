.class public abstract LZ2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ2/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LZ2/g;
    .locals 4

    new-instance v0, LZ2/b;

    sget-object v1, LZ2/g$a;->E:LZ2/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, LZ2/b;-><init>(LZ2/g$a;J)V

    return-object v0
.end method

.method public static d()LZ2/g;
    .locals 4

    new-instance v0, LZ2/b;

    sget-object v1, LZ2/g$a;->F:LZ2/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, LZ2/b;-><init>(LZ2/g$a;J)V

    return-object v0
.end method

.method public static e(J)LZ2/g;
    .locals 2

    new-instance v0, LZ2/b;

    sget-object v1, LZ2/g$a;->C:LZ2/g$a;

    invoke-direct {v0, v1, p0, p1}, LZ2/b;-><init>(LZ2/g$a;J)V

    return-object v0
.end method

.method public static f()LZ2/g;
    .locals 4

    new-instance v0, LZ2/b;

    sget-object v1, LZ2/g$a;->D:LZ2/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, LZ2/b;-><init>(LZ2/g$a;J)V

    return-object v0
.end method


# virtual methods
.method public abstract b()J
.end method

.method public abstract c()LZ2/g$a;
.end method
