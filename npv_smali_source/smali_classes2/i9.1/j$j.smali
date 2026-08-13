.class final synthetic Li9/j$j;
.super Ly7/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li9/j;-><init>(Li9/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 6

    const-string v4, "getSecondsOfMinute()Ljava/lang/Integer;"

    const/4 v5, 0x0

    const-class v2, Li9/y;

    const-string v3, "secondsOfMinute"

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Ly7/y;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly7/f;->D:Ljava/lang/Object;

    check-cast v0, Li9/y;

    invoke-virtual {v0}, Li9/y;->l()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
