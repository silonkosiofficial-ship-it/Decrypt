.class final LY7/d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY7/d;->c(Ljava/util/List;)Lt8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LY7/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LY7/d$a;

    invoke-direct {v0}, LY7/d$a;-><init>()V

    sput-object v0, LY7/d$a;->D:LY7/d$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/G;)LF8/E;
    .locals 2

    .prologue
    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LY7/c;->a:LY7/c;

    invoke-virtual {v0}, LY7/c;->d()Ln8/f;

    move-result-object v0

    invoke-interface {p1}, LO7/G;->t()LL7/g;

    move-result-object p1

    sget-object v1, LL7/j$a;->H:Ln8/c;

    invoke-virtual {p1, v1}, LL7/g;->o(Ln8/c;)LO7/e;

    move-result-object p1

    invoke-static {v0, p1}, LY7/a;->b(Ln8/f;LO7/e;)LO7/j0;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, LO7/i0;->getType()LF8/E;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, LH8/j;->f1:LH8/j;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1, v0}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/G;

    invoke-virtual {p0, p1}, LY7/d$a;->a(LO7/G;)LF8/E;

    move-result-object p1

    return-object p1
.end method
