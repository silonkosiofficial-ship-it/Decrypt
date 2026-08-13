.class final LN7/i$j;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN7/i;->v(LO7/Z;Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN7/i;


# direct methods
.method constructor <init>(LN7/i;)V
    .locals 0

    iput-object p1, p0, LN7/i$j;->D:LN7/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/b;)Ljava/lang/Boolean;
    .locals 2

    .prologue
    invoke-interface {p1}, LO7/b;->j()LO7/b$a;

    move-result-object v0

    sget-object v1, LO7/b$a;->C:LO7/b$a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LN7/i$j;->D:LN7/i;

    invoke-static {v0}, LN7/i;->f(LN7/i;)LN7/d;

    move-result-object v0

    invoke-interface {p1}, LO7/n;->b()LO7/m;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {p1, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LO7/e;

    invoke-virtual {v0, p1}, LN7/d;->c(LO7/e;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/b;

    invoke-virtual {p0, p1}, LN7/i$j;->a(LO7/b;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
