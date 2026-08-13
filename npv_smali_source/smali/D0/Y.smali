.class public abstract LD0/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lx7/l;

.field private static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 7

    sget-object v0, LD0/Y$a;->D:LD0/Y$a;

    sput-object v0, LD0/Y;->a:Lx7/l;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v0

    sput-wide v0, LD0/Y;->b:J

    return-void
.end method

.method public static final a(LF0/T;)LD0/X$a;
    .locals 1

    new-instance v0, LD0/D;

    invoke-direct {v0, p0}, LD0/D;-><init>(LF0/T;)V

    return-object v0
.end method

.method public static final b(LF0/o0;)LD0/X$a;
    .locals 1

    new-instance v0, LD0/T;

    invoke-direct {v0, p0}, LD0/T;-><init>(LF0/o0;)V

    return-object v0
.end method

.method public static final synthetic c()J
    .locals 2

    sget-wide v0, LD0/Y;->b:J

    return-wide v0
.end method

.method public static final synthetic d()Lx7/l;
    .locals 1

    sget-object v0, LD0/Y;->a:Lx7/l;

    return-object v0
.end method
