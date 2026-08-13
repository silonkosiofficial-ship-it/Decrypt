.class final LM0/B$z;
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
.field public static final D:LM0/B$z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$z;

    invoke-direct {v0}, LM0/B$z;-><init>()V

    sput-object v0, LM0/B$z;->D:LM0/B$z;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;Lo0/c2;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p2}, Lo0/c2;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v0

    sget-object v1, Lo0/y0;->b:Lo0/y0$a;

    invoke-static {v1}, LM0/B;->t(Lo0/y0$a;)Le0/j;

    move-result-object v1

    invoke-static {v0, v1, p1}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, Lo0/c2;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/g;->d(J)Ln0/g;

    move-result-object v1

    sget-object v2, Ln0/g;->b:Ln0/g$a;

    invoke-static {v2}, LM0/B;->s(Ln0/g$a;)Le0/j;

    move-result-object v2

    invoke-static {v1, v2, p1}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2}, Lo0/c2;->b()F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {p2}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p1, v1, v0

    const/4 p1, 0x2

    aput-object p2, v1, p1

    invoke-static {v1}, Lj7/v;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le0/l;

    check-cast p2, Lo0/c2;

    invoke-virtual {p0, p1, p2}, LM0/B$z;->a(Le0/l;Lo0/c2;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
