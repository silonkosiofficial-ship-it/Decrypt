.class final Le/j$i;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/j;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Le/j;


# direct methods
.method constructor <init>(Le/j;)V
    .locals 0

    iput-object p1, p0, Le/j$i;->D:Le/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Le/t;
    .locals 4

    new-instance v0, Le/t;

    iget-object v1, p0, Le/j$i;->D:Le/j;

    invoke-static {v1}, Le/j;->K(Le/j;)Le/j$e;

    move-result-object v1

    new-instance v2, Le/j$i$a;

    iget-object v3, p0, Le/j$i;->D:Le/j;

    invoke-direct {v2, v3}, Le/j$i$a;-><init>(Le/j;)V

    invoke-direct {v0, v1, v2}, Le/t;-><init>(Ljava/util/concurrent/Executor;Lx7/a;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le/j$i;->a()Le/t;

    move-result-object v0

    return-object v0
.end method
