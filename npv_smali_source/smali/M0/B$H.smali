.class final LM0/B$H;
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
.field public static final D:LM0/B$H;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$H;

    invoke-direct {v0}, LM0/B$H;-><init>()V

    sput-object v0, LM0/B$H;->D:LM0/B$H;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;LX0/r;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p2}, LX0/r;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/x;->b(J)LY0/x;

    move-result-object v0

    sget-object v1, LY0/x;->b:LY0/x$a;

    invoke-static {v1}, LM0/B;->r(LY0/x$a;)Le0/j;

    move-result-object v2

    invoke-static {v0, v2, p1}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, LX0/r;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/x;->b(J)LY0/x;

    move-result-object p2

    invoke-static {v1}, LM0/B;->r(LY0/x$a;)Le0/j;

    move-result-object v1

    invoke-static {p2, v1, p1}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v0, p2, v1

    const/4 v0, 0x1

    aput-object p1, p2, v0

    invoke-static {p2}, Lj7/v;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le0/l;

    check-cast p2, LX0/r;

    invoke-virtual {p0, p1, p2}, LM0/B$H;->a(Le0/l;LX0/r;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
