.class public final LD8/d$a$c;
.super Lr8/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/d$a;->A(Ln8/f;Ljava/util/Collection;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, LD8/d$a$c;->a:Ljava/util/List;

    invoke-direct {p0}, Lr8/j;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LO7/b;)V
    .locals 1

    const-string v0, "fakeOverride"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lr8/l;->K(LO7/b;Lx7/l;)V

    iget-object v0, p0, LD8/d$a$c;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected e(LO7/b;LO7/b;)V
    .locals 1

    .prologue
    const-string v0, "fromSuper"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fromCurrent"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, LR7/p;

    if-eqz v0, :cond_0

    check-cast p2, LR7/p;

    sget-object v0, LO7/v;->a:LO7/v;

    invoke-virtual {p2, v0, p1}, LR7/p;->d1(LO7/a$a;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
