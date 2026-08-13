.class final LN4/J$b;
.super LN4/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final transient E:LN4/p;

.field private final transient F:LN4/o;


# direct methods
.method constructor <init>(LN4/p;LN4/o;)V
    .locals 0

    invoke-direct {p0}, LN4/r;-><init>()V

    iput-object p1, p0, LN4/J$b;->E:LN4/p;

    iput-object p2, p0, LN4/J$b;->F:LN4/o;

    return-void
.end method


# virtual methods
.method public R()LN4/S;
    .locals 1

    invoke-virtual {p0}, LN4/J$b;->o()LN4/o;

    move-result-object v0

    invoke-virtual {v0}, LN4/o;->C()LN4/S;

    move-result-object v0

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    iget-object v0, p0, LN4/J$b;->E:LN4/p;

    invoke-virtual {v0, p1}, LN4/p;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method d([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, LN4/J$b;->o()LN4/o;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LN4/o;->d([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LN4/J$b;->R()LN4/S;

    move-result-object v0

    return-object v0
.end method

.method n()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public o()LN4/o;
    .locals 1

    iget-object v0, p0, LN4/J$b;->F:LN4/o;

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, LN4/J$b;->E:LN4/p;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
