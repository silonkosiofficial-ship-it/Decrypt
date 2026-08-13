.class final LM0/B$o;
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
.field public static final D:LM0/B$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$o;

    invoke-direct {v0}, LM0/B$o;-><init>()V

    sput-object v0, LM0/B$o;->D:LM0/B$o;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;LM0/h$b;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p2}, LM0/h$b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, LM0/h$b;->b()LM0/L;

    move-result-object p2

    invoke-static {}, LM0/B;->w()Le0/j;

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

    check-cast p2, LM0/h$b;

    invoke-virtual {p0, p1, p2}, LM0/B$o;->a(Le0/l;LM0/h$b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
