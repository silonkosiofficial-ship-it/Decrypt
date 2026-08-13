.class final LH/Q$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LH/Q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH/Q$a;

    invoke-direct {v0}, LH/Q$a;-><init>()V

    sput-object v0, LH/Q$a;->D:LH/Q$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;LH/Q;)Ljava/util/List;
    .locals 3

    .prologue
    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-virtual {p2}, LH/Q;->d()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p2}, LH/Q;->f()Lx/s;

    move-result-object p2

    sget-object v2, Lx/s;->C:Lx/s;

    if-ne p2, v2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    move p2, p1

    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, p1

    aput-object p2, v2, v0

    invoke-static {v2}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le0/l;

    check-cast p2, LH/Q;

    invoke-virtual {p0, p1, p2}, LH/Q$a;->a(Le0/l;LH/Q;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
