.class public final LS8/m$a;
.super Lj7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS8/m;->b()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic D:LS8/m;


# direct methods
.method constructor <init>(LS8/m;)V
    .locals 0

    iput-object p1, p0, LS8/m$a;->D:LS8/m;

    invoke-direct {p0}, Lj7/d;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge C(Ljava/lang/String;)I
    .locals 0

    invoke-super {p0, p1}, Lj7/d;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LS8/m$a;->g(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, LS8/m$a;->D:LS8/m;

    invoke-static {v0}, LS8/m;->e(LS8/m;)Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/regex/MatchResult;->groupCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public bridge g(Ljava/lang/String;)Z
    .locals 0

    invoke-super {p0, p1}, Lj7/b;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LS8/m$a;->o(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .prologue
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LS8/m$a;->s(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .prologue
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LS8/m$a;->C(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public o(I)Ljava/lang/String;
    .locals 1

    .prologue
    iget-object v0, p0, LS8/m$a;->D:LS8/m;

    invoke-static {v0}, LS8/m;->e(LS8/m;)Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/regex/MatchResult;->group(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method public bridge s(Ljava/lang/String;)I
    .locals 0

    invoke-super {p0, p1}, Lj7/d;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
