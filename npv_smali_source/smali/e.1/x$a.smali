.class final Le/x$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


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

    iput-object p1, p0, Le/x$a;->D:Le/x;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le/b;)V
    .locals 1

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/x$a;->D:Le/x;

    invoke-static {v0, p1}, Le/x;->e(Le/x;Le/b;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le/b;

    invoke-virtual {p0, p1}, Le/x$a;->a(Le/b;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
