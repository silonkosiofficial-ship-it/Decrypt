.class final Le/x$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/x;-><init>(Ljava/lang/Runnable;LB1/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Le/x;


# direct methods
.method constructor <init>(Le/x;)V
    .locals 0

    iput-object p1, p0, Le/x$d;->D:Le/x;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Le/x$d;->D:Le/x;

    invoke-static {v0}, Le/x;->c(Le/x;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le/x$d;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
