.class public abstract Lf9/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:I

.field private static final b:Lb9/D;

.field private static final c:Lb9/D;

.field private static final d:Lb9/D;

.field private static final e:Lb9/D;

.field private static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/16 v4, 0xc

    const/4 v5, 0x0

    const-string v0, "kotlinx.coroutines.semaphore.maxSpinCycles"

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lb9/E;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, Lf9/j;->a:I

    new-instance v0, Lb9/D;

    const-string v1, "PERMIT"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf9/j;->b:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "TAKEN"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf9/j;->c:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "BROKEN"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf9/j;->d:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "CANCELLED"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf9/j;->e:Lb9/D;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v2, "kotlinx.coroutines.semaphore.segmentSize"

    const/16 v3, 0x10

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lb9/E;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, Lf9/j;->f:I

    return-void
.end method

.method public static final synthetic a(JLf9/k;)Lf9/k;
    .locals 0

    invoke-static {p0, p1, p2}, Lf9/j;->h(JLf9/k;)Lf9/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Lb9/D;
    .locals 1

    sget-object v0, Lf9/j;->d:Lb9/D;

    return-object v0
.end method

.method public static final synthetic c()Lb9/D;
    .locals 1

    sget-object v0, Lf9/j;->e:Lb9/D;

    return-object v0
.end method

.method public static final synthetic d()I
    .locals 1

    sget v0, Lf9/j;->a:I

    return v0
.end method

.method public static final synthetic e()Lb9/D;
    .locals 1

    sget-object v0, Lf9/j;->b:Lb9/D;

    return-object v0
.end method

.method public static final synthetic f()I
    .locals 1

    sget v0, Lf9/j;->f:I

    return v0
.end method

.method public static final synthetic g()Lb9/D;
    .locals 1

    sget-object v0, Lf9/j;->c:Lb9/D;

    return-object v0
.end method

.method private static final h(JLf9/k;)Lf9/k;
    .locals 2

    new-instance v0, Lf9/k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lf9/k;-><init>(JLf9/k;I)V

    return-object v0
.end method
