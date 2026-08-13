.class final LP7/f$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP7/f;->a(LL7/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)LP7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LL7/g;


# direct methods
.method constructor <init>(LL7/g;)V
    .locals 0

    iput-object p1, p0, LP7/f$a;->D:LL7/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/G;)LF8/E;
    .locals 2

    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/G;->t()LL7/g;

    move-result-object p1

    sget-object v0, LF8/u0;->G:LF8/u0;

    iget-object v1, p0, LP7/f$a;->D:LL7/g;

    invoke-virtual {v1}, LL7/g;->W()LF8/M;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, LL7/g;->l(LF8/u0;LF8/E;)LF8/M;

    move-result-object p1

    const-string v0, "getArrayType(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/G;

    invoke-virtual {p0, p1}, LP7/f$a;->a(LO7/G;)LF8/E;

    move-result-object p1

    return-object p1
.end method
