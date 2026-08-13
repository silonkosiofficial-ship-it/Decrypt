.class final LM8/p$a;
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
.field public static final D:LM8/p$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/p$a;

    invoke-direct {v0}, LM8/p$a;-><init>()V

    sput-object v0, LM8/p$a;->D:LM8/p$a;

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
    .locals 2

    .prologue
    const-string v0, "$this$$receiver"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object p1

    const-string v0, "getValueParameters(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/j0;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lv8/c;->c(LO7/j0;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p1}, LO7/j0;->u0()LF8/E;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    sget-object p1, LM8/p;->a:LM8/p;

    if-nez v0, :cond_1

    const-string p1, "last parameter should not have a default value or be a vararg"

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/y;

    invoke-virtual {p0, p1}, LM8/p$a;->a(LO7/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
