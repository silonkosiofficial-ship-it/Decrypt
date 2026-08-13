.class final LM8/p$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM8/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LM8/p$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/p$c;

    invoke-direct {v0}, LM8/p$c;-><init>()V

    sput-object v0, LM8/p$c;->D:LM8/p$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/y;)Ljava/lang/String;
    .locals 6

    .prologue
    const-string v0, "$this$$receiver"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/a;->m0()LO7/X;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p1}, LO7/a;->v0()LO7/X;

    move-result-object v0

    :cond_0
    sget-object v1, LM8/p;->a:LM8/p;

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-interface {p1}, LO7/a;->l()LF8/E;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, LO7/i0;->getType()LF8/E;

    move-result-object v4

    const-string v5, "getType(...)"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v4}, LK8/a;->r(LF8/E;LF8/E;)Z

    move-result v3

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    if-nez v3, :cond_2

    invoke-static {v1, p1, v0}, LM8/p;->c(LM8/p;LO7/y;LO7/X;)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    const/4 v2, 0x1

    :cond_3
    if-nez v2, :cond_4

    const-string p1, "receiver must be a supertype of the return type"

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/y;

    invoke-virtual {p0, p1}, LM8/p$c;->a(LO7/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
