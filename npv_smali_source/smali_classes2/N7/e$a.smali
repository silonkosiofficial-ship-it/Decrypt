.class final LN7/e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN7/e;-><init>(LE8/n;LO7/G;Lx7/l;ILy7/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LN7/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN7/e$a;

    invoke-direct {v0}, LN7/e$a;-><init>()V

    sput-object v0, LN7/e$a;->D:LN7/e$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/G;)LL7/b;
    .locals 3

    .prologue
    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LN7/e;->g()Ln8/c;

    move-result-object v0

    invoke-interface {p1, v0}, LO7/G;->s0(Ln8/c;)LO7/P;

    move-result-object p1

    invoke-interface {p1}, LO7/P;->N()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LL7/b;

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LL7/b;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/G;

    invoke-virtual {p0, p1}, LN7/e$a;->a(LO7/G;)LL7/b;

    move-result-object p1

    return-object p1
.end method
