.class final LO7/J$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO7/J;-><init>(LE8/n;LO7/G;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LO7/J;


# direct methods
.method constructor <init>(LO7/J;)V
    .locals 0

    iput-object p1, p0, LO7/J$d;->D:LO7/J;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln8/c;)LO7/K;
    .locals 2

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LR7/m;

    iget-object v1, p0, LO7/J$d;->D:LO7/J;

    invoke-static {v1}, LO7/J;->a(LO7/J;)LO7/G;

    move-result-object v1

    invoke-direct {v0, v1, p1}, LR7/m;-><init>(LO7/G;Ln8/c;)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/c;

    invoke-virtual {p0, p1}, LO7/J$d;->a(Ln8/c;)LO7/K;

    move-result-object p1

    return-object p1
.end method
