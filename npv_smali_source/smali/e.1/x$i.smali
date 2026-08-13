.class final Le/x$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "i"
.end annotation


# instance fields
.field private final C:Le/w;

.field final synthetic D:Le/x;


# direct methods
.method public constructor <init>(Le/x;Le/w;)V
    .locals 1

    const-string v0, "onBackPressedCallback"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le/x$i;->D:Le/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Le/x$i;->C:Le/w;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .prologue
    iget-object v0, p0, Le/x$i;->D:Le/x;

    invoke-static {v0}, Le/x;->b(Le/x;)Lj7/m;

    move-result-object v0

    iget-object v1, p0, Le/x$i;->C:Le/w;

    invoke-virtual {v0, v1}, Lj7/m;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Le/x$i;->D:Le/x;

    invoke-static {v0}, Le/x;->a(Le/x;)Le/w;

    move-result-object v0

    iget-object v1, p0, Le/x$i;->C:Le/w;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/x$i;->C:Le/w;

    invoke-virtual {v0}, Le/w;->c()V

    iget-object v0, p0, Le/x$i;->D:Le/x;

    invoke-static {v0, v1}, Le/x;->f(Le/x;Le/w;)V

    :cond_0
    iget-object v0, p0, Le/x$i;->C:Le/w;

    invoke-virtual {v0, p0}, Le/w;->i(Le/c;)V

    iget-object v0, p0, Le/x$i;->C:Le/w;

    invoke-virtual {v0}, Le/w;->b()Lx7/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Le/x$i;->C:Le/w;

    invoke-virtual {v0, v1}, Le/w;->k(Lx7/a;)V

    return-void
.end method
