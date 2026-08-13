.class final LF8/h0$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF8/h0;-><init>(LF8/v;LF8/g0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF8/h0;


# direct methods
.method constructor <init>(LF8/h0;)V
    .locals 0

    iput-object p1, p0, LF8/h0$d;->D:LF8/h0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF8/h0$b;)LF8/E;
    .locals 2

    iget-object v0, p0, LF8/h0$d;->D:LF8/h0;

    invoke-virtual {p1}, LF8/h0$b;->b()LO7/f0;

    move-result-object v1

    invoke-virtual {p1}, LF8/h0$b;->a()LF8/w;

    move-result-object p1

    invoke-static {v0, v1, p1}, LF8/h0;->a(LF8/h0;LO7/f0;LF8/w;)LF8/E;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF8/h0$b;

    invoke-virtual {p0, p1}, LF8/h0$d;->a(LF8/h0$b;)LF8/E;

    move-result-object p1

    return-object p1
.end method
