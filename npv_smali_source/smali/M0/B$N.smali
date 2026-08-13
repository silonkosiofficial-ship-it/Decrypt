.class final LM0/B$N;
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
.field public static final D:LM0/B$N;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$N;

    invoke-direct {v0}, LM0/B$N;-><init>()V

    sput-object v0, LM0/B$N;->D:LM0/B$N;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;J)Ljava/lang/Object;
    .locals 2

    .prologue
    sget-object p1, LY0/x;->b:LY0/x$a;

    invoke-virtual {p1}, LY0/x$a;->a()J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, LY0/x;->e(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    invoke-static {p2, p3}, LY0/x;->h(J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p3}, LY0/x;->g(J)J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/z;->d(J)LY0/z;

    move-result-object p2

    invoke-static {p2}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const/4 p3, 0x2

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p3, v0

    const/4 p1, 0x1

    aput-object p2, p3, p1

    invoke-static {p3}, Lj7/v;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Le0/l;

    check-cast p2, LY0/x;

    invoke-virtual {p2}, LY0/x;->k()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LM0/B$N;->a(Le0/l;J)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
