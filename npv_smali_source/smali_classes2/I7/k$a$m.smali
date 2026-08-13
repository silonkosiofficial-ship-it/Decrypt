.class final LI7/k$a$m;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/k$a;-><init>(LI7/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/k$a;

.field final synthetic E:LI7/k;


# direct methods
.method constructor <init>(LI7/k$a;LI7/k;)V
    .locals 0

    iput-object p1, p0, LI7/k$a$m;->D:LI7/k$a;

    iput-object p2, p0, LI7/k$a$m;->E:LI7/k;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 4

    .prologue
    iget-object v0, p0, LI7/k$a$m;->D:LI7/k$a;

    invoke-virtual {v0}, LI7/k$a;->k()LO7/e;

    move-result-object v0

    invoke-interface {v0}, LO7/e;->j()LO7/f;

    move-result-object v1

    sget-object v2, LO7/f;->I:LO7/f;

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    return-object v3

    :cond_0
    invoke-interface {v0}, LO7/e;->E()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, LL7/c;->a:LL7/c;

    invoke-static {v1, v0}, LL7/d;->a(LL7/c;LO7/e;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LI7/k$a$m;->E:LI7/k;

    invoke-virtual {v1}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, LI7/k$a$m;->E:LI7/k;

    invoke-virtual {v0}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "INSTANCE"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    :goto_0
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
