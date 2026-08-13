.class final LS0/V$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS0/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS0/V$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS0/V$a;

    invoke-direct {v0}, LS0/V$a;-><init>()V

    sput-object v0, LS0/V$a;->D:LS0/V$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;LS0/V;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p2}, LS0/V;->f()LM0/d;

    move-result-object v0

    invoke-static {}, LM0/B;->h()Le0/j;

    move-result-object v1

    invoke-static {v0, v1, p1}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, LS0/V;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->b(J)LM0/N;

    move-result-object p2

    sget-object v1, LM0/N;->b:LM0/N$a;

    invoke-static {v1}, LM0/B;->j(LM0/N$a;)Le0/j;

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

    check-cast p2, LS0/V;

    invoke-virtual {p0, p1, p2}, LS0/V$a;->a(Le0/l;LS0/V;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
