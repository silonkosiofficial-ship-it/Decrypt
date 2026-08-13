.class public abstract LN4/q;
.super LN4/e;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN4/q$a;
    }
.end annotation


# instance fields
.field final transient C:LN4/p;

.field final transient D:I


# direct methods
.method constructor <init>(LN4/p;I)V
    .locals 0

    invoke-direct {p0}, LN4/e;-><init>()V

    iput-object p1, p0, LN4/q;->C:LN4/p;

    iput p2, p0, LN4/q;->D:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/util/Map;
    .locals 1

    invoke-virtual {p0}, LN4/q;->c()LN4/p;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/Object;)Z
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    invoke-super {p0, p1}, LN4/d;->b(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public c()LN4/p;
    .locals 1

    iget-object v0, p0, LN4/q;->C:LN4/p;

    return-object v0
.end method

.method public bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, LN4/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic hashCode()I
    .locals 1

    invoke-super {p0}, LN4/d;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, LN4/d;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
