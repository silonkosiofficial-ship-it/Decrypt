.class final Lq8/d$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq8/d;->L(Ljava/lang/StringBuilder;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lq8/d;


# direct methods
.method constructor <init>(Lq8/d;)V
    .locals 0

    iput-object p1, p0, Lq8/d$c;->D:Lq8/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF8/i0;)Ljava/lang/CharSequence;
    .locals 3

    .prologue
    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LF8/i0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "*"

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lq8/d$c;->D:Lq8/d;

    invoke-interface {p1}, LF8/i0;->getType()LF8/E;

    move-result-object v1

    const-string v2, "getType(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lq8/d;->w(LF8/E;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, LF8/i0;->a()LF8/u0;

    move-result-object v1

    sget-object v2, LF8/u0;->G:LF8/u0;

    if-ne v1, v2, :cond_1

    move-object p1, v0

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, LF8/i0;->a()LF8/u0;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF8/i0;

    invoke-virtual {p0, p1}, Lq8/d$c;->a(LF8/i0;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
