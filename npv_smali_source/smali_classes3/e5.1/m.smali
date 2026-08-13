.class public final synthetic Le5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Le5/D;

.field public final synthetic D:LF5/b;


# direct methods
.method public synthetic constructor <init>(Le5/D;LF5/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le5/m;->C:Le5/D;

    iput-object p2, p0, Le5/m;->D:LF5/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le5/m;->C:Le5/D;

    iget-object v1, p0, Le5/m;->D:LF5/b;

    invoke-static {v0, v1}, Le5/o;->k(Le5/D;LF5/b;)V

    return-void
.end method
