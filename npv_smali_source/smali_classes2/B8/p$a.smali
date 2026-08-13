.class final LB8/p$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB8/p;-><init>(Ln8/c;LE8/n;LO7/G;Li8/m;Lk8/a;LD8/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LB8/p;


# direct methods
.method constructor <init>(LB8/p;)V
    .locals 0

    iput-object p1, p0, LB8/p$a;->D:LB8/p;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln8/b;)LO7/a0;
    .locals 1

    .prologue
    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LB8/p$a;->D:LB8/p;

    invoke-static {p1}, LB8/p;->V0(LB8/p;)LD8/f;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, LO7/a0;->a:LO7/a0;

    const-string v0, "NO_SOURCE"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/b;

    invoke-virtual {p0, p1}, LB8/p$a;->a(Ln8/b;)LO7/a0;

    move-result-object p1

    return-object p1
.end method
