.class public final LS8/m$b;
.super Lj7/b;
.source "SourceFile"

# interfaces
.implements LS8/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS8/m;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:LS8/m;


# direct methods
.method constructor <init>(LS8/m;)V
    .locals 0

    iput-object p1, p0, LS8/m$b;->C:LS8/m;

    invoke-direct {p0}, Lj7/b;-><init>()V

    return-void
.end method

.method public static synthetic g(LS8/m$b;I)LS8/j;
    .locals 0

    invoke-static {p0, p1}, LS8/m$b;->s(LS8/m$b;I)LS8/j;

    move-result-object p0

    return-object p0
.end method

.method private static final s(LS8/m$b;I)LS8/j;
    .locals 0

    invoke-virtual {p0, p1}, LS8/m$b;->get(I)LS8/j;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LS8/j;

    :goto_0
    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LS8/j;

    invoke-virtual {p0, p1}, LS8/m$b;->o(LS8/j;)Z

    move-result p1

    return p1
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, LS8/m$b;->C:LS8/m;

    invoke-static {v0}, LS8/m;->e(LS8/m;)Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/regex/MatchResult;->groupCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public get(I)LS8/j;
    .locals 3

    .prologue
    iget-object v0, p0, LS8/m$b;->C:LS8/m;

    invoke-static {v0}, LS8/m;->e(LS8/m;)Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-static {v0, p1}, LS8/p;->d(Ljava/util/regex/MatchResult;I)LE7/i;

    move-result-object v0

    invoke-virtual {v0}, LE7/i;->M()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_0

    new-instance v1, LS8/j;

    iget-object v2, p0, LS8/m$b;->C:LS8/m;

    invoke-static {v2}, LS8/m;->e(LS8/m;)Ljava/util/regex/MatchResult;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/regex/MatchResult;->group(I)Ljava/lang/String;

    move-result-object p1

    const-string v2, "group(...)"

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, v0}, LS8/j;-><init>(Ljava/lang/String;LE7/i;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    invoke-static {p0}, Lj7/v;->n(Ljava/util/Collection;)LE7/i;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->Y(Ljava/lang/Iterable;)LR8/h;

    move-result-object v0

    new-instance v1, LS8/n;

    invoke-direct {v1, p0}, LS8/n;-><init>(LS8/m$b;)V

    invoke-static {v0, v1}, LR8/k;->G(LR8/h;Lx7/l;)LR8/h;

    move-result-object v0

    invoke-interface {v0}, LR8/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public bridge o(LS8/j;)Z
    .locals 0

    invoke-super {p0, p1}, Lj7/b;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
