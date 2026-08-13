.class public abstract LZ8/P;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lb9/D;

.field private static final b:Lb9/D;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb9/D;

    const-string v1, "NONE"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LZ8/P;->a:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "PENDING"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LZ8/P;->b:Lb9/D;

    return-void
.end method

.method public static final a(Ljava/lang/Object;)LZ8/y;
    .locals 1

    .prologue
    new-instance v0, LZ8/O;

    if-nez p0, :cond_0

    sget-object p0, La9/t;->a:Lb9/D;

    :cond_0
    invoke-direct {v0, p0}, LZ8/O;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final synthetic b()Lb9/D;
    .locals 1

    sget-object v0, LZ8/P;->a:Lb9/D;

    return-object v0
.end method

.method public static final synthetic c()Lb9/D;
    .locals 1

    sget-object v0, LZ8/P;->b:Lb9/D;

    return-object v0
.end method

.method public static final d(LZ8/N;Lm7/i;ILY8/d;)LZ8/f;
    .locals 1

    .prologue
    if-ltz p2, :cond_0

    const/4 v0, 0x2

    if-ge p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x2

    if-ne p2, v0, :cond_1

    :goto_0
    sget-object v0, LY8/d;->D:LY8/d;

    if-ne p3, v0, :cond_1

    return-object p0

    :cond_1
    invoke-static {p0, p1, p2, p3}, LZ8/E;->e(LZ8/C;Lm7/i;ILY8/d;)LZ8/f;

    move-result-object p0

    return-object p0
.end method
