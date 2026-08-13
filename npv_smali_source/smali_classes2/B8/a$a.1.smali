.class final LB8/a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB8/a;-><init>(LE8/n;LB8/v;LO7/G;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LB8/a;


# direct methods
.method constructor <init>(LB8/a;)V
    .locals 0

    iput-object p1, p0, LB8/a$a;->D:LB8/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln8/c;)LO7/K;
    .locals 1

    .prologue
    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB8/a$a;->D:LB8/a;

    invoke-virtual {v0, p1}, LB8/a;->d(Ln8/c;)LB8/o;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LB8/a$a;->D:LB8/a;

    invoke-virtual {v0}, LB8/a;->e()LB8/k;

    move-result-object v0

    invoke-virtual {p1, v0}, LB8/o;->U0(LB8/k;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/c;

    invoke-virtual {p0, p1}, LB8/a$a;->a(Ln8/c;)LO7/K;

    move-result-object p1

    return-object p1
.end method
