.class final LY7/b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY7/b;-><init>(La8/g;Le8/a;Ln8/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:La8/g;

.field final synthetic E:LY7/b;


# direct methods
.method constructor <init>(La8/g;LY7/b;)V
    .locals 0

    iput-object p1, p0, LY7/b$a;->D:La8/g;

    iput-object p2, p0, LY7/b$a;->E:LY7/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LF8/M;
    .locals 2

    iget-object v0, p0, LY7/b$a;->D:La8/g;

    invoke-virtual {v0}, La8/g;->d()LO7/G;

    move-result-object v0

    invoke-interface {v0}, LO7/G;->t()LL7/g;

    move-result-object v0

    iget-object v1, p0, LY7/b$a;->E:LY7/b;

    invoke-virtual {v1}, LY7/b;->e()Ln8/c;

    move-result-object v1

    invoke-virtual {v0, v1}, LL7/g;->o(Ln8/c;)LO7/e;

    move-result-object v0

    invoke-interface {v0}, LO7/e;->w()LF8/M;

    move-result-object v0

    const-string v1, "getDefaultType(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LY7/b$a;->a()LF8/M;

    move-result-object v0

    return-object v0
.end method
