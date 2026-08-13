.class final LR7/x$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/x;-><init>(Ln8/f;LE8/n;LL7/g;Lo8/a;Ljava/util/Map;Ln8/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LR7/x;


# direct methods
.method constructor <init>(LR7/x;)V
    .locals 0

    iput-object p1, p0, LR7/x$b;->D:LR7/x;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln8/c;)LO7/P;
    .locals 3

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LR7/x$b;->D:LR7/x;

    invoke-static {v0}, LR7/x;->U0(LR7/x;)LR7/A;

    move-result-object v0

    iget-object v1, p0, LR7/x$b;->D:LR7/x;

    invoke-static {v1}, LR7/x;->V0(LR7/x;)LE8/n;

    move-result-object v2

    invoke-interface {v0, v1, p1, v2}, LR7/A;->a(LR7/x;Ln8/c;LE8/n;)LO7/P;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/c;

    invoke-virtual {p0, p1}, LR7/x$b;->a(Ln8/c;)LO7/P;

    move-result-object p1

    return-object p1
.end method
