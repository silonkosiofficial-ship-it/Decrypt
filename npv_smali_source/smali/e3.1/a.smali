.class public final synthetic Le3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Le3/c;

.field public final synthetic D:LY2/p;

.field public final synthetic E:LW2/j;

.field public final synthetic F:LY2/i;


# direct methods
.method public synthetic constructor <init>(Le3/c;LY2/p;LW2/j;LY2/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/a;->C:Le3/c;

    iput-object p2, p0, Le3/a;->D:LY2/p;

    iput-object p3, p0, Le3/a;->E:LW2/j;

    iput-object p4, p0, Le3/a;->F:LY2/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Le3/a;->C:Le3/c;

    iget-object v1, p0, Le3/a;->D:LY2/p;

    iget-object v2, p0, Le3/a;->E:LW2/j;

    iget-object v3, p0, Le3/a;->F:LY2/i;

    invoke-static {v0, v1, v2, v3}, Le3/c;->c(Le3/c;LY2/p;LW2/j;LY2/i;)V

    return-void
.end method
