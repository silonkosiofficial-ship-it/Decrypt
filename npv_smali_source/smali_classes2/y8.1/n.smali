.class public final Ly8/n;
.super Ly8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly8/n$a;
    }
.end annotation


# static fields
.field public static final d:Ly8/n$a;


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ly8/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly8/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly8/n$a;-><init>(Ly7/k;)V

    sput-object v0, Ly8/n;->d:Ly8/n$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ly8/h;)V
    .locals 0

    invoke-direct {p0}, Ly8/a;-><init>()V

    iput-object p1, p0, Ly8/n;->b:Ljava/lang/String;

    iput-object p2, p0, Ly8/n;->c:Ly8/h;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ly8/h;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ly8/n;-><init>(Ljava/lang/String;Ly8/h;)V

    return-void
.end method

.method public static final j(Ljava/lang/String;Ljava/util/Collection;)Ly8/h;
    .locals 1

    sget-object v0, Ly8/n;->d:Ly8/n$a;

    invoke-virtual {v0, p0, p1}, Ly8/n$a;->a(Ljava/lang/String;Ljava/util/Collection;)Ly8/h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Ly8/a;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    sget-object p2, Ly8/n$c;->D:Ly8/n$c;

    invoke-static {p1, p2}, Lr8/n;->a(Ljava/util/Collection;Lx7/l;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public c(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Ly8/a;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    sget-object p2, Ly8/n$d;->D:Ly8/n$d;

    invoke-static {p1, p2}, Lr8/n;->a(Ljava/util/Collection;Lx7/l;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public e(Ly8/d;Lx7/l;)Ljava/util/Collection;
    .locals 3

    .prologue
    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Ly8/a;->e(Ly8/d;Lx7/l;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LO7/m;

    instance-of v2, v2, LO7/a;

    if-eqz v2, :cond_0

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Li7/u;

    invoke-direct {p1, p2, v0}, Li7/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Li7/u;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {p1}, Li7/u;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const-string v0, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>"

    invoke-static {p2, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/util/Collection;

    sget-object v0, Ly8/n$b;->D:Ly8/n$b;

    invoke-static {p2, v0}, Lr8/n;->a(Ljava/util/Collection;Lx7/l;)Ljava/util/Collection;

    move-result-object p2

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p2, p1}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method protected i()Ly8/h;
    .locals 1

    iget-object v0, p0, Ly8/n;->c:Ly8/h;

    return-object v0
.end method
