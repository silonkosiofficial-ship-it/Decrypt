.class public final Le/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/j;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:Le/j;


# direct methods
.method constructor <init>(Le/j;)V
    .locals 0

    iput-object p1, p0, Le/j$a;->C:Le/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public i(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le/j$a;->C:Le/j;

    invoke-static {p1}, Le/j;->J(Le/j;)V

    iget-object p1, p0, Le/j$a;->C:Le/j;

    invoke-virtual {p1}, Le/j;->u()Landroidx/lifecycle/k;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/q;)V

    return-void
.end method
