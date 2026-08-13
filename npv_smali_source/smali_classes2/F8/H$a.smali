.class final LF8/H$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF8/H;->d1(LG8/g;)LF8/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LG8/g;

.field final synthetic E:LF8/H;


# direct methods
.method constructor <init>(LG8/g;LF8/H;)V
    .locals 0

    iput-object p1, p0, LF8/H$a;->D:LG8/g;

    iput-object p2, p0, LF8/H$a;->E:LF8/H;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LF8/E;
    .locals 2

    iget-object v0, p0, LF8/H$a;->D:LG8/g;

    iget-object v1, p0, LF8/H$a;->E:LF8/H;

    invoke-static {v1}, LF8/H;->c1(LF8/H;)Lx7/a;

    move-result-object v1

    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ8/i;

    invoke-virtual {v0, v1}, LG8/g;->h(LJ8/i;)LF8/E;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF8/H$a;->a()LF8/E;

    move-result-object v0

    return-object v0
.end method
