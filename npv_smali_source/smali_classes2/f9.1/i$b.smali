.class final synthetic Lf9/i$b;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf9/i;->t()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final L:Lf9/i$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf9/i$b;

    invoke-direct {v0}, Lf9/i$b;-><init>()V

    sput-object v0, Lf9/i$b;->L:Lf9/i$b;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, Lf9/j;

    const-string v3, "createSegment"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ly7/q;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final s(JLf9/k;)Lf9/k;
    .locals 0

    invoke-static {p1, p2, p3}, Lf9/j;->a(JLf9/k;)Lf9/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    check-cast p2, Lf9/k;

    invoke-virtual {p0, v0, v1, p2}, Lf9/i$b;->s(JLf9/k;)Lf9/k;

    move-result-object p1

    return-object p1
.end method
