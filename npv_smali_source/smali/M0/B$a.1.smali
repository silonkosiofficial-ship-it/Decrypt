.class final LM0/B$a;
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
.field public static final D:LM0/B$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$a;

    invoke-direct {v0}, LM0/B$a;-><init>()V

    sput-object v0, LM0/B$a;->D:LM0/B$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;LM0/d;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p2}, LM0/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, LM0/d;->g()Ljava/util/List;

    move-result-object v1

    invoke-static {}, LM0/B;->b()Le0/j;

    move-result-object v2

    invoke-static {v1, v2, p1}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2}, LM0/d;->e()Ljava/util/List;

    move-result-object v2

    invoke-static {}, LM0/B;->b()Le0/j;

    move-result-object v3

    invoke-static {v2, v3, p1}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2}, LM0/d;->b()Ljava/util/List;

    move-result-object p2

    invoke-static {}, LM0/B;->b()Le0/j;

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

    check-cast p2, LM0/d;

    invoke-virtual {p0, p1, p2}, LM0/B$a;->a(Le0/l;LM0/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
