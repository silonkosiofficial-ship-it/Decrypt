.class final synthetic Lt2/b$a;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt2/b;-><init>(Lo2/u;Lo2/n;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "convertRows(Landroidx/room/RoomRawQuery;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v6, 0x0

    const/4 v1, 0x3

    const-class v3, Lt2/b;

    const-string v4, "convertRows"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Ly7/q;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo2/u;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, Lt2/b$a;->s(Lo2/u;ILm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final s(Lo2/u;ILm7/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly7/f;->D:Ljava/lang/Object;

    check-cast v0, Lt2/b;

    invoke-virtual {v0, p1, p2, p3}, Lt2/b;->i(Lo2/u;ILm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
