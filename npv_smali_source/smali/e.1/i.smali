.class public final synthetic Le/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/o;


# instance fields
.field public final synthetic C:Le/x;

.field public final synthetic D:Le/j;


# direct methods
.method public synthetic constructor <init>(Le/x;Le/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/i;->C:Le/x;

    iput-object p2, p0, Le/i;->D:Le/j;

    return-void
.end method


# virtual methods
.method public final i(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 2

    iget-object v0, p0, Le/i;->C:Le/x;

    iget-object v1, p0, Le/i;->D:Le/j;

    invoke-static {v0, v1, p1, p2}, Le/j;->y(Le/x;Le/j;Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V

    return-void
.end method
