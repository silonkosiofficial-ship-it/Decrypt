.class public abstract LN4/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/Comparator;)LN4/G;
    .locals 1

    .prologue
    instance-of v0, p0, LN4/G;

    if-eqz v0, :cond_0

    check-cast p0, LN4/G;

    goto :goto_0

    :cond_0
    new-instance v0, LN4/k;

    invoke-direct {v0, p0}, LN4/k;-><init>(Ljava/util/Comparator;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static c()LN4/G;
    .locals 1

    sget-object v0, LN4/D;->C:LN4/D;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Iterable;)LN4/o;
    .locals 0

    invoke-static {p0, p1}, LN4/o;->R(Ljava/util/Comparator;Ljava/lang/Iterable;)LN4/o;

    move-result-object p1

    return-object p1
.end method

.method public abstract compare(Ljava/lang/Object;Ljava/lang/Object;)I
.end method

.method d()LN4/G;
    .locals 1

    invoke-static {}, LN4/z;->b()LM4/c;

    move-result-object v0

    invoke-virtual {p0, v0}, LN4/G;->e(LM4/c;)LN4/G;

    move-result-object v0

    return-object v0
.end method

.method public e(LM4/c;)LN4/G;
    .locals 1

    new-instance v0, LN4/f;

    invoke-direct {v0, p1, p0}, LN4/f;-><init>(LM4/c;LN4/G;)V

    return-object v0
.end method
