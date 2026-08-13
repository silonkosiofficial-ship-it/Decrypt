.class public final LT6/h;
.super LT6/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT6/h$a;,
        LT6/h$b;,
        LT6/h$c;,
        LT6/h$d;
    }
.end annotation


# static fields
.field public static final f:LT6/h$b;

.field private static final g:LT6/h;


# instance fields
.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, LT6/h$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT6/h$b;-><init>(Ly7/k;)V

    sput-object v0, LT6/h;->f:LT6/h$b;

    new-instance v0, LT6/h;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v3, "*"

    const-string v4, "*"

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, LT6/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILy7/k;)V

    sput-object v0, LT6/h;->g:LT6/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p3, p4}, LT6/n;-><init>(Ljava/lang/String;Ljava/util/List;)V

    iput-object p1, p0, LT6/h;->d:Ljava/lang/String;

    iput-object p2, p0, LT6/h;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 2

    const-string v0, "contentType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentSubtype"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0, p3}, LT6/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p3

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LT6/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic d()LT6/h;
    .locals 1

    sget-object v0, LT6/h;->g:LT6/h;

    return-object v0
.end method

.method private final f(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .prologue
    invoke-virtual {p0}, LT6/n;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    invoke-virtual {p0}, LT6/n;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LT6/m;

    invoke-virtual {v3}, LT6/m;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1, v2}, LS8/r;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, LT6/m;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p2, v2}, LS8/r;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, LT6/n;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT6/m;

    invoke-virtual {v0}, LT6/m;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1, v2}, LS8/r;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, LT6/m;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2, v2}, LS8/r;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LT6/h;->d:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    instance-of v0, p1, LT6/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, LT6/h;->d:Ljava/lang/String;

    check-cast p1, LT6/h;

    iget-object v1, p1, LT6/h;->d:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, LS8/r;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LT6/h;->e:Ljava/lang/String;

    iget-object v1, p1, LT6/h;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, LS8/r;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LT6/n;->b()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, LT6/n;->b()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;)LT6/h;
    .locals 6

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LT6/h;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LT6/h;

    iget-object v1, p0, LT6/h;->d:Ljava/lang/String;

    iget-object v2, p0, LT6/h;->e:Ljava/lang/String;

    invoke-virtual {p0}, LT6/n;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, LT6/n;->b()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    new-instance v5, LT6/m;

    invoke-direct {v5, p1, p2}, LT6/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4, v5}, Lj7/v;->D0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, LT6/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public final h()LT6/h;
    .locals 7

    .prologue
    invoke-virtual {p0}, LT6/n;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, LT6/h;

    iget-object v2, p0, LT6/h;->d:Ljava/lang/String;

    iget-object v3, p0, LT6/h;->e:Ljava/lang/String;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LT6/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILy7/k;)V

    :goto_0
    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, LT6/h;->d:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "toLowerCase(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v3, v0, 0x1f

    iget-object v4, p0, LT6/h;->e:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v3, v1

    add-int/2addr v0, v3

    invoke-virtual {p0}, LT6/n;->b()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    return v0
.end method
