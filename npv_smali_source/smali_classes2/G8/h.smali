.class public abstract LG8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LO7/F;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LO7/F;

    const-string v1, "KotlinTypeRefiner"

    invoke-direct {v0, v1}, LO7/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LG8/h;->a:LO7/F;

    return-void
.end method

.method public static final a()LO7/F;
    .locals 1

    sget-object v0, LG8/h;->a:LO7/F;

    return-object v0
.end method

.method public static final b(LG8/g;Ljava/lang/Iterable;)Ljava/util/List;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "types"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/E;

    invoke-virtual {p0, v1}, LG8/g;->h(LJ8/i;)LF8/E;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method
