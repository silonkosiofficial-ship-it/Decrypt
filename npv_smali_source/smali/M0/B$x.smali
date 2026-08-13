.class final LM0/B$x;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM0/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LM0/B$x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$x;

    invoke-direct {v0}, LM0/B$x;-><init>()V

    sput-object v0, LM0/B$x;->D:LM0/B$x;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;LM0/v;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p2}, LM0/v;->h()I

    move-result v0

    invoke-static {v0}, LX0/j;->h(I)LX0/j;

    move-result-object v0

    invoke-static {v0}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, LM0/v;->i()I

    move-result v1

    invoke-static {v1}, LX0/l;->g(I)LX0/l;

    move-result-object v1

    invoke-static {v1}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2}, LM0/v;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/x;->b(J)LY0/x;

    move-result-object v2

    sget-object v3, LY0/x;->b:LY0/x$a;

    invoke-static {v3}, LM0/B;->r(LY0/x$a;)Le0/j;

    move-result-object v3

    invoke-static {v2, v3, p1}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2}, LM0/v;->j()LX0/r;

    move-result-object p2

    sget-object v3, LX0/r;->c:LX0/r$a;

    invoke-static {v3}, LM0/B;->q(LX0/r$a;)Le0/j;

    move-result-object v3

    invoke-static {p2, v3, p1}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x4

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, p2, v3

    const/4 v0, 0x1

    aput-object v1, p2, v0

    const/4 v0, 0x2

    aput-object v2, p2, v0

    const/4 v0, 0x3

    aput-object p1, p2, v0

    invoke-static {p2}, Lj7/v;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le0/l;

    check-cast p2, LM0/v;

    invoke-virtual {p0, p1, p2}, LM0/B$x;->a(Le0/l;LM0/v;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
