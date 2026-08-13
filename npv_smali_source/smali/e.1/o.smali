.class public final synthetic Le/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Le/j;

.field public final synthetic D:Le/x;


# direct methods
.method public synthetic constructor <init>(Le/j;Le/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/o;->C:Le/j;

    iput-object p2, p0, Le/o;->D:Le/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le/o;->C:Le/j;

    iget-object v1, p0, Le/o;->D:Le/x;

    invoke-static {v0, v1}, Le/j$j;->a(Le/j;Le/x;)V

    return-void
.end method
