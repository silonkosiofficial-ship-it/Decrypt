.class final synthetic LY8/i$a;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY8/i;->y()LF7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final L:LY8/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LY8/i$a;

    invoke-direct {v0}, LY8/i$a;-><init>()V

    sput-object v0, LY8/i$a;->L:LY8/i$a;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, LY8/i;

    const-string v3, "createSegment"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ly7/q;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final s(JLY8/p;)LY8/p;
    .locals 0

    invoke-static {p1, p2, p3}, LY8/i;->c(JLY8/p;)LY8/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    check-cast p2, LY8/p;

    invoke-virtual {p0, v0, v1, p2}, LY8/i$a;->s(JLY8/p;)LY8/p;

    move-result-object p1

    return-object p1
.end method
