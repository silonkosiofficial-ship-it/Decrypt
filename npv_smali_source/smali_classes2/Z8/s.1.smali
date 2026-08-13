.class abstract synthetic LZ8/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    const v1, 0x7fffffff

    const-string v2, "kotlinx.coroutines.flow.defaultConcurrency"

    const/16 v3, 0x10

    invoke-static {v2, v3, v0, v1}, Lb9/E;->b(Ljava/lang/String;III)I

    move-result v0

    sput v0, LZ8/s;->a:I

    return-void
.end method

.method public static final a(LZ8/f;Lx7/p;)LZ8/f;
    .locals 2

    new-instance v0, LZ8/s$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LZ8/s$a;-><init>(Lx7/p;Lm7/e;)V

    invoke-static {p0, v0}, LZ8/h;->N(LZ8/f;Lx7/q;)LZ8/f;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/Iterable;)LZ8/f;
    .locals 8

    new-instance v7, La9/j;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, La9/j;-><init>(Ljava/lang/Iterable;Lm7/i;ILY8/d;ILy7/k;)V

    return-object v7
.end method

.method public static final varargs c([LZ8/f;)LZ8/f;
    .locals 0

    invoke-static {p0}, Lj7/n;->N([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p0

    invoke-static {p0}, LZ8/h;->D(Ljava/lang/Iterable;)LZ8/f;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LZ8/f;Lx7/q;)LZ8/f;
    .locals 9

    new-instance v8, La9/i;

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    move-object v1, p1

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, La9/i;-><init>(Lx7/q;LZ8/f;Lm7/i;ILY8/d;ILy7/k;)V

    return-object v8
.end method
