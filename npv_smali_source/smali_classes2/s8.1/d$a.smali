.class final Ls8/d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls8/d;->b(LF8/i0;LO7/f0;)LF8/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF8/i0;


# direct methods
.method constructor <init>(LF8/i0;)V
    .locals 0

    iput-object p1, p0, Ls8/d$a;->D:LF8/i0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LF8/E;
    .locals 2

    iget-object v0, p0, Ls8/d$a;->D:LF8/i0;

    invoke-interface {v0}, LF8/i0;->getType()LF8/E;

    move-result-object v0

    const-string v1, "getType(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ls8/d$a;->a()LF8/E;

    move-result-object v0

    return-object v0
.end method
