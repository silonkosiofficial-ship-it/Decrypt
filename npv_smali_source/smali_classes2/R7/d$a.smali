.class final LR7/d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/d;->O0()LF8/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LR7/d;


# direct methods
.method constructor <init>(LR7/d;)V
    .locals 0

    iput-object p1, p0, LR7/d$a;->D:LR7/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LG8/g;)LF8/M;
    .locals 1

    .prologue
    iget-object v0, p0, LR7/d$a;->D:LR7/d;

    invoke-virtual {p1, v0}, LG8/g;->f(LO7/m;)LO7/h;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, LO7/h;->w()LF8/M;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG8/g;

    invoke-virtual {p0, p1}, LR7/d$a;->a(LG8/g;)LF8/M;

    move-result-object p1

    return-object p1
.end method
