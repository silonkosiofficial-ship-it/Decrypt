.class final LI7/k$a$q$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/k$a$q;->a()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF8/E;

.field final synthetic E:LI7/k$a;

.field final synthetic F:LI7/k;


# direct methods
.method constructor <init>(LF8/E;LI7/k$a;LI7/k;)V
    .locals 0

    iput-object p1, p0, LI7/k$a$q$a;->D:LF8/E;

    iput-object p2, p0, LI7/k$a$q$a;->E:LI7/k$a;

    iput-object p3, p0, LI7/k$a$q$a;->F:LI7/k;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/reflect/Type;
    .locals 4

    .prologue
    iget-object v0, p0, LI7/k$a$q$a;->D:LF8/E;

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->w()LO7/h;

    move-result-object v0

    instance-of v1, v0, LO7/e;

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, LO7/e;

    invoke-static {v1}, LI7/M;->q(LO7/e;)Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, p0, LI7/k$a$q$a;->F:LI7/k;

    invoke-virtual {v2}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, LI7/k$a$q$a;->F:LI7/k;

    invoke-virtual {v0}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    iget-object v2, p0, LI7/k$a$q$a;->F:LI7/k;

    invoke-virtual {v2}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v2

    const-string v3, "getInterfaces(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v1}, Lj7/n;->l0([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    if-ltz v1, :cond_1

    iget-object v0, p0, LI7/k$a$q$a;->F:LI7/k;

    invoke-virtual {v0}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v0, v0, v1

    goto :goto_0

    :goto_1
    return-object v0

    :cond_1
    new-instance v1, LI7/D;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No superclass of "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LI7/k$a$q$a;->E:LI7/k$a;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " in Java reflection for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, LI7/D;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v1, LI7/D;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported superclass of "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LI7/k$a$q$a;->E:LI7/k$a;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, LI7/D;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, LI7/D;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Supertype not a class: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, LI7/D;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/k$a$q$a;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method
