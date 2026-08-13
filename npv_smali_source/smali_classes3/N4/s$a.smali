.class public final LN4/s$a;
.super LN4/q$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LN4/q$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LN4/s;
    .locals 2

    .prologue
    iget-object v0, p0, LN4/q$a;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, LN4/q$a;->b:Ljava/util/Comparator;

    if-eqz v1, :cond_0

    invoke-static {v1}, LN4/G;->a(Ljava/util/Comparator;)LN4/G;

    move-result-object v1

    invoke-virtual {v1}, LN4/G;->d()LN4/G;

    move-result-object v1

    invoke-virtual {v1, v0}, LN4/G;->b(Ljava/lang/Iterable;)LN4/o;

    move-result-object v0

    :cond_0
    iget-object v1, p0, LN4/q$a;->c:Ljava/util/Comparator;

    invoke-static {v0, v1}, LN4/s;->e(Ljava/util/Collection;Ljava/util/Comparator;)LN4/s;

    move-result-object v0

    return-object v0
.end method
